/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id: ImageIOTIFFImageWriterTestCase.java 1833700 2018-06-18 10:08:45Z ssteiner $ */

package org.apache.xmlgraphics.image.writer.imageio;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;

import org.junit.Assert;
import org.junit.Test;

import org.w3c.dom.Node;

import org.apache.commons.io.output.ByteArrayOutputStream;

import org.apache.xmlgraphics.image.loader.ImageSize;
import org.apache.xmlgraphics.image.writer.Endianness;
import org.apache.xmlgraphics.image.writer.ImageIOCheckUtility;
import org.apache.xmlgraphics.image.writer.ImageWriter;
import org.apache.xmlgraphics.image.writer.ImageWriterParams;
import org.apache.xmlgraphics.image.writer.MultiImageWriter;
import org.apache.xmlgraphics.image.writer.ResolutionUnit;
import org.apache.xmlgraphics.util.UnitConv;

/**
 * Tests for {@link ImageIOTIFFImageWriter}.
 */
public class ImageIOTIFFImageWriterTestCase {static class __CLR4_5_2il7il7m68iyj40{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,24181,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Checks endianness when writing multi-page TIFF.
     * @throws Exception if an error occurs
     */
    @Test
    public void testEndianess() throws Exception {__CLR4_5_2il7il7m68iyj40.R.globalSliceStart(getClass().getName(),24091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mor0v5il7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2il7il7m68iyj40.R.rethrow($CLV_t2$);}finally{__CLR4_5_2il7il7m68iyj40.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.writer.imageio.ImageIOTIFFImageWriterTestCase.testEndianess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mor0v5il7() throws Exception{try{__CLR4_5_2il7il7m68iyj40.R.inc(24091);
        __CLR4_5_2il7il7m68iyj40.R.inc(24092);runEndiannessTest(new TestImageWriter(), 300);
        __CLR4_5_2il7il7m68iyj40.R.inc(24093);runEndiannessTest(new TestMultiImageWriter(), 96);
    }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}

    private void runEndiannessTest(ImageWriterHelper imageWriterHelper, int resolution) throws Exception {try{__CLR4_5_2il7il7m68iyj40.R.inc(24094);
        __CLR4_5_2il7il7m68iyj40.R.inc(24095);if ((((!ImageIOCheckUtility.isSunTIFFImageWriterAvailable())&&(__CLR4_5_2il7il7m68iyj40.R.iget(24096)!=0|true))||(__CLR4_5_2il7il7m68iyj40.R.iget(24097)==0&false))) {{
            __CLR4_5_2il7il7m68iyj40.R.inc(24098);System.out.println("Skipping endianness test for ImageIO-based TIFF writer"
                    + " because JAI ImageIO Tools is not available!");
            __CLR4_5_2il7il7m68iyj40.R.inc(24099);return; //No JAI ImageIO TIFF codec available: skipping test
        }

        }__CLR4_5_2il7il7m68iyj40.R.inc(24100);BufferedImage image = createTestImage(resolution);

        __CLR4_5_2il7il7m68iyj40.R.inc(24101);ImageWriterParams params = new ImageWriterParams();
        __CLR4_5_2il7il7m68iyj40.R.inc(24102);params.setCompressionMethod("CCITT T.6");
        __CLR4_5_2il7il7m68iyj40.R.inc(24103);params.setResolution(resolution);
        __CLR4_5_2il7il7m68iyj40.R.inc(24104);params.setSingleStrip(true);
        __CLR4_5_2il7il7m68iyj40.R.inc(24105);params.setEndianness(Endianness.LITTLE_ENDIAN);
        __CLR4_5_2il7il7m68iyj40.R.inc(24106);params.setResolutionUnit(ResolutionUnit.INCH);

        __CLR4_5_2il7il7m68iyj40.R.inc(24107);ImageWriter writer = new ImageIOTIFFImageWriter();
        __CLR4_5_2il7il7m68iyj40.R.inc(24108);imageWriterHelper.createImageWriter(writer);
        __CLR4_5_2il7il7m68iyj40.R.inc(24109);imageWriterHelper.writeImage(image, params);
        __CLR4_5_2il7il7m68iyj40.R.inc(24110);byte[] tiffData = imageWriterHelper.getByteArrayOutput().toByteArray();
        __CLR4_5_2il7il7m68iyj40.R.inc(24111);Assert.assertEquals('I', tiffData[0]);
        __CLR4_5_2il7il7m68iyj40.R.inc(24112);Assert.assertEquals('I', tiffData[1]);

        //Switch to big endian
        __CLR4_5_2il7il7m68iyj40.R.inc(24113);params.setEndianness(Endianness.BIG_ENDIAN);
        __CLR4_5_2il7il7m68iyj40.R.inc(24114);imageWriterHelper.createImageWriter(writer);
        __CLR4_5_2il7il7m68iyj40.R.inc(24115);imageWriterHelper.writeImage(image, params);
        __CLR4_5_2il7il7m68iyj40.R.inc(24116);tiffData = imageWriterHelper.getByteArrayOutput().toByteArray();
        __CLR4_5_2il7il7m68iyj40.R.inc(24117);Assert.assertEquals('M', tiffData[0]);
        __CLR4_5_2il7il7m68iyj40.R.inc(24118);Assert.assertEquals('M', tiffData[1]);

        //Test with no params (TIFF codec defaults to big endian)
        __CLR4_5_2il7il7m68iyj40.R.inc(24119);imageWriterHelper.createImageWriter(writer);
        __CLR4_5_2il7il7m68iyj40.R.inc(24120);imageWriterHelper.writeImageNoParams(image);
        __CLR4_5_2il7il7m68iyj40.R.inc(24121);if ((((imageWriterHelper.getByteArrayOutput().size() > 0)&&(__CLR4_5_2il7il7m68iyj40.R.iget(24122)!=0|true))||(__CLR4_5_2il7il7m68iyj40.R.iget(24123)==0&false))) {{
            __CLR4_5_2il7il7m68iyj40.R.inc(24124);tiffData = imageWriterHelper.getByteArrayOutput().toByteArray();
            __CLR4_5_2il7il7m68iyj40.R.inc(24125);Assert.assertEquals('M', tiffData[0]);
            __CLR4_5_2il7il7m68iyj40.R.inc(24126);Assert.assertEquals('M', tiffData[1]);
        }
    }}finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}

    private BufferedImage createTestImage(int dpi) {try{__CLR4_5_2il7il7m68iyj40.R.inc(24127);
        __CLR4_5_2il7il7m68iyj40.R.inc(24128);ImageSize size = new ImageSize();
        __CLR4_5_2il7il7m68iyj40.R.inc(24129);size.setSizeInMillipoints((int)UnitConv.mm2mpt(210), (int)UnitConv.mm2mpt(297));
        __CLR4_5_2il7il7m68iyj40.R.inc(24130);size.setResolution(dpi);
        __CLR4_5_2il7il7m68iyj40.R.inc(24131);size.calcPixelsFromSize();
        __CLR4_5_2il7il7m68iyj40.R.inc(24132);int w = size.getWidthPx();
        __CLR4_5_2il7il7m68iyj40.R.inc(24133);int h = size.getHeightPx();

        __CLR4_5_2il7il7m68iyj40.R.inc(24134);BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_BYTE_BINARY);
        __CLR4_5_2il7il7m68iyj40.R.inc(24135);Graphics2D g2d = (Graphics2D)image.getGraphics();
        __CLR4_5_2il7il7m68iyj40.R.inc(24136);g2d.setBackground(Color.WHITE);
        __CLR4_5_2il7il7m68iyj40.R.inc(24137);g2d.setColor(Color.BLACK);
        __CLR4_5_2il7il7m68iyj40.R.inc(24138);g2d.clearRect(0, 0, image.getWidth(), image.getHeight());
        __CLR4_5_2il7il7m68iyj40.R.inc(24139);g2d.setFont(new Font("sans-serif", Font.PLAIN, 15));
        __CLR4_5_2il7il7m68iyj40.R.inc(24140);g2d.drawString("This is some test text!", 20, 50);
        __CLR4_5_2il7il7m68iyj40.R.inc(24141);g2d.setStroke(new BasicStroke(2));
        __CLR4_5_2il7il7m68iyj40.R.inc(24142);g2d.draw(new Ellipse2D.Float(200, 200, 50, 50));
        __CLR4_5_2il7il7m68iyj40.R.inc(24143);g2d.dispose();

        __CLR4_5_2il7il7m68iyj40.R.inc(24144);return image;
    }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}

    private interface ImageWriterHelper {
        void createImageWriter(ImageWriter imageWriter) throws IOException;
        void writeImage(BufferedImage image, ImageWriterParams params) throws IOException;
        void writeImageNoParams(BufferedImage image) throws IOException;
        ByteArrayOutputStream getByteArrayOutput();
    }

    private static class TestImageWriter implements ImageWriterHelper {
        private ImageWriter writer;
        private ByteArrayOutputStream baout;

        public void createImageWriter(ImageWriter imageWriter) throws IOException {try{__CLR4_5_2il7il7m68iyj40.R.inc(24145);
            __CLR4_5_2il7il7m68iyj40.R.inc(24146);baout = new ByteArrayOutputStream();
            __CLR4_5_2il7il7m68iyj40.R.inc(24147);writer = new ImageIOTIFFImageWriter();
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}

        public void writeImage(BufferedImage image, ImageWriterParams params)
                throws IOException {try{__CLR4_5_2il7il7m68iyj40.R.inc(24148);
            __CLR4_5_2il7il7m68iyj40.R.inc(24149);writer.writeImage(image, baout, params);
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}

        public void writeImageNoParams(BufferedImage image) throws IOException {try{__CLR4_5_2il7il7m68iyj40.R.inc(24150);
            __CLR4_5_2il7il7m68iyj40.R.inc(24151);writer.writeImage(image, baout);
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}

        public ByteArrayOutputStream getByteArrayOutput() {try{__CLR4_5_2il7il7m68iyj40.R.inc(24152);
            __CLR4_5_2il7il7m68iyj40.R.inc(24153);return baout;
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}
    }

    private static class TestMultiImageWriter implements ImageWriterHelper {
        private MultiImageWriter writer;
        private ByteArrayOutputStream baout;

        public void createImageWriter(ImageWriter imageWriter)
                throws IOException {try{__CLR4_5_2il7il7m68iyj40.R.inc(24154);
            __CLR4_5_2il7il7m68iyj40.R.inc(24155);baout = new ByteArrayOutputStream();
            __CLR4_5_2il7il7m68iyj40.R.inc(24156);writer = imageWriter.createMultiImageWriter(baout);
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}

        public void writeImage(BufferedImage image, ImageWriterParams params)
                throws IOException {try{__CLR4_5_2il7il7m68iyj40.R.inc(24157);
            //Writer the same image twice (producing 2 pages)
            __CLR4_5_2il7il7m68iyj40.R.inc(24158);writer.writeImage(image, params);
            __CLR4_5_2il7il7m68iyj40.R.inc(24159);writer.writeImage(image, params);
            __CLR4_5_2il7il7m68iyj40.R.inc(24160);writer.close();
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}

        public void writeImageNoParams(BufferedImage image) throws IOException {try{__CLR4_5_2il7il7m68iyj40.R.inc(24161);
            //Not needed on a multi-image writer
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}

        public ByteArrayOutputStream getByteArrayOutput() {try{__CLR4_5_2il7il7m68iyj40.R.inc(24162);
            __CLR4_5_2il7il7m68iyj40.R.inc(24163);return baout;
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}
    }

    @Test
    public void testNewMetadataFormat() {__CLR4_5_2il7il7m68iyj40.R.globalSliceStart(getClass().getName(),24164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ggpu5hin8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2il7il7m68iyj40.R.rethrow($CLV_t2$);}finally{__CLR4_5_2il7il7m68iyj40.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.writer.imageio.ImageIOTIFFImageWriterTestCase.testNewMetadataFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24164,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ggpu5hin8(){try{__CLR4_5_2il7il7m68iyj40.R.inc(24164);
        __CLR4_5_2il7il7m68iyj40.R.inc(24165);ImageWriterParams params = new ImageWriterParams();
        __CLR4_5_2il7il7m68iyj40.R.inc(24166);params.setResolution(92);
        __CLR4_5_2il7il7m68iyj40.R.inc(24167);MyIIOMetadata metadata = new MyIIOMetadata();
        __CLR4_5_2il7il7m68iyj40.R.inc(24168);new ImageIOTIFFImageWriter().updateMetadata(null, metadata, params);
        __CLR4_5_2il7il7m68iyj40.R.inc(24169);Assert.assertEquals(metadata.mergeNode, "javax_imageio_tiff_image_1.0");
    }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}

    static class MyIIOMetadata extends IIOMetadata {
        String mergeNode;
        MyIIOMetadata() {
            super(true, "javax_imageio_tiff_image_1.0", null, null, null);__CLR4_5_2il7il7m68iyj40.R.inc(24171);try{__CLR4_5_2il7il7m68iyj40.R.inc(24170);
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}
        public boolean isReadOnly() {try{__CLR4_5_2il7il7m68iyj40.R.inc(24172);
            __CLR4_5_2il7il7m68iyj40.R.inc(24173);return false;
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}
        public Node getAsTree(String formatName) {try{__CLR4_5_2il7il7m68iyj40.R.inc(24174);
            __CLR4_5_2il7il7m68iyj40.R.inc(24175);IIOMetadataNode node = new IIOMetadataNode();
            __CLR4_5_2il7il7m68iyj40.R.inc(24176);node.appendChild(new IIOMetadataNode("Dimension"));
            __CLR4_5_2il7il7m68iyj40.R.inc(24177);return node;
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}
        public void mergeTree(String formatName, Node root) {try{__CLR4_5_2il7il7m68iyj40.R.inc(24178);
            __CLR4_5_2il7il7m68iyj40.R.inc(24179);mergeNode = root.getNodeName();
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}
        public void reset() {try{__CLR4_5_2il7il7m68iyj40.R.inc(24180);
        }finally{__CLR4_5_2il7il7m68iyj40.R.flushNeeded();}}
    };
}
