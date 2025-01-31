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

/* $Id: ResolutionTestCase.java 1732019 2016-02-24 05:01:10Z gadams $ */

package org.apache.xmlgraphics.image.writer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.imageio.stream.ImageInputStream;

import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.io.IOUtils;

import org.apache.xmlgraphics.util.UnitConv;

public class ResolutionTestCase {static class __CLR4_5_2iiviivm6lb524w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,24091,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testResolution() throws IOException {__CLR4_5_2iiviivm6lb524w.R.globalSliceStart(getClass().getName(),24007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yhx5sriiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iiviivm6lb524w.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iiviivm6lb524w.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.writer.ResolutionTestCase.testResolution",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24007,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yhx5sriiv() throws IOException{try{__CLR4_5_2iiviivm6lb524w.R.inc(24007);
        __CLR4_5_2iiviivm6lb524w.R.inc(24008);File testDir = new File("./build/test/results");
        __CLR4_5_2iiviivm6lb524w.R.inc(24009);testDir.mkdirs();
        __CLR4_5_2iiviivm6lb524w.R.inc(24010);runChecksForFormat(testDir, "image/png", "png");
        __CLR4_5_2iiviivm6lb524w.R.inc(24011);runChecksForFormat(testDir, "image/jpeg", "jpg");
        __CLR4_5_2iiviivm6lb524w.R.inc(24012);if ((((ImageIOCheckUtility.isSunTIFFImageWriterAvailable())&&(__CLR4_5_2iiviivm6lb524w.R.iget(24013)!=0|true))||(__CLR4_5_2iiviivm6lb524w.R.iget(24014)==0&false))) {{
            __CLR4_5_2iiviivm6lb524w.R.inc(24015);runChecksForFormat(testDir, "image/tiff", "tif");
        }
    }}finally{__CLR4_5_2iiviivm6lb524w.R.flushNeeded();}}

    private void runChecksForFormat(File testDir, String format, String ext)
            throws FileNotFoundException, IOException {try{__CLR4_5_2iiviivm6lb524w.R.inc(24016);
        __CLR4_5_2iiviivm6lb524w.R.inc(24017);File testFile;
        __CLR4_5_2iiviivm6lb524w.R.inc(24018);ImageWriterParams params1 = new ImageWriterParams();
        __CLR4_5_2iiviivm6lb524w.R.inc(24019);params1.setResolution(300);

        __CLR4_5_2iiviivm6lb524w.R.inc(24020);ImageWriterParams params2 = new ImageWriterParams();
        __CLR4_5_2iiviivm6lb524w.R.inc(24021);params2.setResolutionUnit(ResolutionUnit.CENTIMETER);
        __CLR4_5_2iiviivm6lb524w.R.inc(24022);params2.setXResolution(118); //~300dpi
        __CLR4_5_2iiviivm6lb524w.R.inc(24023);params2.setYResolution(79); //~200dpi

        __CLR4_5_2iiviivm6lb524w.R.inc(24024);testFile = new File(testDir, "ResolutionTest1." + ext);
        __CLR4_5_2iiviivm6lb524w.R.inc(24025);writeImage(params1, testFile, format);
        __CLR4_5_2iiviivm6lb524w.R.inc(24026);checkStdMetadata(testFile, UnitConv.IN2MM / 300f, UnitConv.IN2MM / 300f);

        __CLR4_5_2iiviivm6lb524w.R.inc(24027);testFile = new File(testDir, "ResolutionTest2." + ext);
        __CLR4_5_2iiviivm6lb524w.R.inc(24028);writeImage(params2, testFile, format);
        __CLR4_5_2iiviivm6lb524w.R.inc(24029);float multiplier = ((((!format.equals("image/tiff")) )&&(__CLR4_5_2iiviivm6lb524w.R.iget(24030)!=0|true))||(__CLR4_5_2iiviivm6lb524w.R.iget(24031)==0&false))? 10f : UnitConv.IN2MM;
        __CLR4_5_2iiviivm6lb524w.R.inc(24032);checkStdMetadata(testFile, multiplier / 118f, multiplier / 79f);
    }finally{__CLR4_5_2iiviivm6lb524w.R.flushNeeded();}}

    private void writeImage(ImageWriterParams params, File testFile, String mime) throws FileNotFoundException,
            IOException {try{__CLR4_5_2iiviivm6lb524w.R.inc(24033);
        __CLR4_5_2iiviivm6lb524w.R.inc(24034);BufferedImage img = createTestImage();
        __CLR4_5_2iiviivm6lb524w.R.inc(24035);ImageWriter writer = ImageWriterRegistry.getInstance().getWriterFor(mime);
        __CLR4_5_2iiviivm6lb524w.R.inc(24036);assertNotNull(writer);
        __CLR4_5_2iiviivm6lb524w.R.inc(24037);OutputStream out = new java.io.FileOutputStream(testFile);
        __CLR4_5_2iiviivm6lb524w.R.inc(24038);try {
            __CLR4_5_2iiviivm6lb524w.R.inc(24039);writer.writeImage(img, out, params);
        } finally {
            __CLR4_5_2iiviivm6lb524w.R.inc(24040);IOUtils.closeQuietly(out);
        }
    }finally{__CLR4_5_2iiviivm6lb524w.R.flushNeeded();}}

    private void checkStdMetadata(File testFile, float xRes, float yRes) throws IOException {try{__CLR4_5_2iiviivm6lb524w.R.inc(24041);
        __CLR4_5_2iiviivm6lb524w.R.inc(24042);ImageInputStream in = ImageIO.createImageInputStream(testFile);
        __CLR4_5_2iiviivm6lb524w.R.inc(24043);try {
            __CLR4_5_2iiviivm6lb524w.R.inc(24044);Iterator<ImageReader> iter = ImageIO.getImageReaders(in);
            __CLR4_5_2iiviivm6lb524w.R.inc(24045);assertTrue(iter.hasNext());
            __CLR4_5_2iiviivm6lb524w.R.inc(24046);ImageReader reader = iter.next();
            __CLR4_5_2iiviivm6lb524w.R.inc(24047);reader.setInput(in);
            __CLR4_5_2iiviivm6lb524w.R.inc(24048);IIOMetadata iiometa = reader.getImageMetadata(0);
            __CLR4_5_2iiviivm6lb524w.R.inc(24049);assertNotNull(iiometa);
            __CLR4_5_2iiviivm6lb524w.R.inc(24050);assertTrue(iiometa.isStandardMetadataFormatSupported());
            __CLR4_5_2iiviivm6lb524w.R.inc(24051);Element metanode = (Element)iiometa.getAsTree(
                    IIOMetadataFormatImpl.standardMetadataFormatName);
            __CLR4_5_2iiviivm6lb524w.R.inc(24052);Element dim = getChild(metanode, "Dimension");
            __CLR4_5_2iiviivm6lb524w.R.inc(24053);float resHorz = 0.0f;
            __CLR4_5_2iiviivm6lb524w.R.inc(24054);float resVert = 0.0f;
            __CLR4_5_2iiviivm6lb524w.R.inc(24055);if ((((dim != null)&&(__CLR4_5_2iiviivm6lb524w.R.iget(24056)!=0|true))||(__CLR4_5_2iiviivm6lb524w.R.iget(24057)==0&false))) {{
                __CLR4_5_2iiviivm6lb524w.R.inc(24058);Element child;
                __CLR4_5_2iiviivm6lb524w.R.inc(24059);child = getChild(dim, "HorizontalPixelSize");
                __CLR4_5_2iiviivm6lb524w.R.inc(24060);if ((((child != null)&&(__CLR4_5_2iiviivm6lb524w.R.iget(24061)!=0|true))||(__CLR4_5_2iiviivm6lb524w.R.iget(24062)==0&false))) {{
                    __CLR4_5_2iiviivm6lb524w.R.inc(24063);resHorz = Float.parseFloat(child.getAttribute("value"));
                }
                }__CLR4_5_2iiviivm6lb524w.R.inc(24064);child = getChild(dim, "VerticalPixelSize");
                __CLR4_5_2iiviivm6lb524w.R.inc(24065);if ((((child != null)&&(__CLR4_5_2iiviivm6lb524w.R.iget(24066)!=0|true))||(__CLR4_5_2iiviivm6lb524w.R.iget(24067)==0&false))) {{
                    __CLR4_5_2iiviivm6lb524w.R.inc(24068);resVert = Float.parseFloat(child.getAttribute("value"));
                }
            }}
            }__CLR4_5_2iiviivm6lb524w.R.inc(24069);assertEquals(xRes, resHorz, 0.000001f);
            __CLR4_5_2iiviivm6lb524w.R.inc(24070);assertEquals(yRes, resVert, 0.000001f);
        } finally {
            __CLR4_5_2iiviivm6lb524w.R.inc(24071);in.close();
        }
    }finally{__CLR4_5_2iiviivm6lb524w.R.flushNeeded();}}

    private static Element getChild(Element el, String name) {try{__CLR4_5_2iiviivm6lb524w.R.inc(24072);
        __CLR4_5_2iiviivm6lb524w.R.inc(24073);NodeList nodes = el.getElementsByTagName(name);
        __CLR4_5_2iiviivm6lb524w.R.inc(24074);if ((((nodes.getLength() > 0)&&(__CLR4_5_2iiviivm6lb524w.R.iget(24075)!=0|true))||(__CLR4_5_2iiviivm6lb524w.R.iget(24076)==0&false))) {{
            __CLR4_5_2iiviivm6lb524w.R.inc(24077);return (Element)nodes.item(0);
        } }else {{
            __CLR4_5_2iiviivm6lb524w.R.inc(24078);return null;
        }
    }}finally{__CLR4_5_2iiviivm6lb524w.R.flushNeeded();}}

    private BufferedImage createTestImage() {try{__CLR4_5_2iiviivm6lb524w.R.inc(24079);
        __CLR4_5_2iiviivm6lb524w.R.inc(24080);BufferedImage img = new BufferedImage(320, 240, BufferedImage.TYPE_BYTE_GRAY);
        __CLR4_5_2iiviivm6lb524w.R.inc(24081);Graphics2D g2d = img.createGraphics();
        __CLR4_5_2iiviivm6lb524w.R.inc(24082);g2d.setBackground(Color.WHITE);
        __CLR4_5_2iiviivm6lb524w.R.inc(24083);g2d.clearRect(0, 0, img.getWidth(), img.getHeight());
        __CLR4_5_2iiviivm6lb524w.R.inc(24084);g2d.setColor(Color.RED);
        __CLR4_5_2iiviivm6lb524w.R.inc(24085);g2d.fillOval(120, 80, 40, 40);
        __CLR4_5_2iiviivm6lb524w.R.inc(24086);g2d.setColor(Color.GREEN);
        __CLR4_5_2iiviivm6lb524w.R.inc(24087);g2d.setStroke(new BasicStroke(3));
        __CLR4_5_2iiviivm6lb524w.R.inc(24088);g2d.drawRect(150, 120, 60, 50);
        __CLR4_5_2iiviivm6lb524w.R.inc(24089);g2d.dispose();
        __CLR4_5_2iiviivm6lb524w.R.inc(24090);return img;
    }finally{__CLR4_5_2iiviivm6lb524w.R.flushNeeded();}}

}
