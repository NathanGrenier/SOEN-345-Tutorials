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

/* $Id: ImageEncodingHelperTestCase.java 1896578 2021-12-31 12:22:29Z ssteiner $ */

package org.apache.xmlgraphics.ps;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DirectColorModel;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.io.output.ByteArrayOutputStream;

public class ImageEncodingHelperTestCase {static class __CLR4_5_2j02j02m6lb528o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,24688,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private BufferedImage prepareImage(BufferedImage image) {try{__CLR4_5_2j02j02m6lb528o.R.inc(24626);
        __CLR4_5_2j02j02m6lb528o.R.inc(24627);Graphics2D ig = image.createGraphics();
        __CLR4_5_2j02j02m6lb528o.R.inc(24628);ig.scale(.5, .5);
        __CLR4_5_2j02j02m6lb528o.R.inc(24629);ig.setPaint(new Color(128, 0, 0));
        __CLR4_5_2j02j02m6lb528o.R.inc(24630);ig.fillRect(0, 0, 100, 50);
        __CLR4_5_2j02j02m6lb528o.R.inc(24631);ig.setPaint(Color.orange);
        __CLR4_5_2j02j02m6lb528o.R.inc(24632);ig.fillRect(100, 0, 100, 50);
        __CLR4_5_2j02j02m6lb528o.R.inc(24633);ig.setPaint(Color.yellow);
        __CLR4_5_2j02j02m6lb528o.R.inc(24634);ig.fillRect(0, 50, 100, 50);
        __CLR4_5_2j02j02m6lb528o.R.inc(24635);ig.setPaint(Color.red);
        __CLR4_5_2j02j02m6lb528o.R.inc(24636);ig.fillRect(100, 50, 100, 50);
        __CLR4_5_2j02j02m6lb528o.R.inc(24637);ig.setPaint(new Color(255, 127, 127));
        __CLR4_5_2j02j02m6lb528o.R.inc(24638);ig.fillRect(0, 100, 100, 50);
        __CLR4_5_2j02j02m6lb528o.R.inc(24639);ig.setPaint(Color.black);
        __CLR4_5_2j02j02m6lb528o.R.inc(24640);ig.draw(new Rectangle2D.Double(0.5, 0.5, 199, 149));
        __CLR4_5_2j02j02m6lb528o.R.inc(24641);ig.dispose();
        __CLR4_5_2j02j02m6lb528o.R.inc(24642);return image;
    }finally{__CLR4_5_2j02j02m6lb528o.R.flushNeeded();}}

    /**
     * Tests encodeRenderedImageWithDirectColorModeAsRGB(). Tests the optimised method against the
     * non-optimised method(encodeRenderedImageAsRGB) to ensure the BufferedImage produced are the
     * same.
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testEncodeRenderedImageWithDirectColorModelAsRGB() throws IOException {__CLR4_5_2j02j02m6lb528o.R.globalSliceStart(getClass().getName(),24643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ssi5ynj0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j02j02m6lb528o.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j02j02m6lb528o.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.ImageEncodingHelperTestCase.testEncodeRenderedImageWithDirectColorModelAsRGB",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24643,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ssi5ynj0j() throws IOException{try{__CLR4_5_2j02j02m6lb528o.R.inc(24643);
        __CLR4_5_2j02j02m6lb528o.R.inc(24644);BufferedImage image = new BufferedImage(100, 75, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_2j02j02m6lb528o.R.inc(24645);image = prepareImage(image);

        __CLR4_5_2j02j02m6lb528o.R.inc(24646);ByteArrayOutputStream optimized = new ByteArrayOutputStream();
        __CLR4_5_2j02j02m6lb528o.R.inc(24647);ImageEncodingHelper.encodeRenderedImageWithDirectColorModelAsRGB(image, optimized);

        __CLR4_5_2j02j02m6lb528o.R.inc(24648);ByteArrayOutputStream nonoptimized = new ByteArrayOutputStream();
        __CLR4_5_2j02j02m6lb528o.R.inc(24649);ImageEncodingHelper.encodeRenderedImageAsRGB(image, nonoptimized);

        __CLR4_5_2j02j02m6lb528o.R.inc(24650);assertTrue(Arrays.equals(nonoptimized.toByteArray(), optimized.toByteArray()));

    }finally{__CLR4_5_2j02j02m6lb528o.R.flushNeeded();}}

    /**
     * Tests a BGR versus RBG image. Debugging shows the BGR follows the optimizeWriteTo() (which
     * is intended). The bytes are compared with the RBG image, which happens to follow the
     * writeRGBTo().
     *
     * @throws IOException
     */
    @Test
    public void testRGBAndBGRImages() throws IOException {__CLR4_5_2j02j02m6lb528o.R.globalSliceStart(getClass().getName(),24651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pufglsj0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j02j02m6lb528o.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j02j02m6lb528o.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.ImageEncodingHelperTestCase.testRGBAndBGRImages",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24651,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pufglsj0r() throws IOException{try{__CLR4_5_2j02j02m6lb528o.R.inc(24651);
        __CLR4_5_2j02j02m6lb528o.R.inc(24652);BufferedImage imageBGR = new BufferedImage(100, 75, BufferedImage.TYPE_3BYTE_BGR);
        __CLR4_5_2j02j02m6lb528o.R.inc(24653);imageBGR = prepareImage(imageBGR);
        __CLR4_5_2j02j02m6lb528o.R.inc(24654);BufferedImage imageRGB = new BufferedImage(100, 75, BufferedImage.TYPE_INT_BGR);
        __CLR4_5_2j02j02m6lb528o.R.inc(24655);imageRGB = prepareImage(imageRGB);

        __CLR4_5_2j02j02m6lb528o.R.inc(24656);ImageEncodingHelper imageEncodingHelperBGR = new ImageEncodingHelper(imageBGR, false);
        __CLR4_5_2j02j02m6lb528o.R.inc(24657);ImageEncodingHelper imageEncodingHelperRGB = new ImageEncodingHelper(imageRGB, false);

        __CLR4_5_2j02j02m6lb528o.R.inc(24658);ByteArrayOutputStream baosBGR = new ByteArrayOutputStream();
        __CLR4_5_2j02j02m6lb528o.R.inc(24659);imageEncodingHelperBGR.encode(baosBGR);

        __CLR4_5_2j02j02m6lb528o.R.inc(24660);ByteArrayOutputStream baosRGB = new ByteArrayOutputStream();
        __CLR4_5_2j02j02m6lb528o.R.inc(24661);imageEncodingHelperRGB.encode(baosRGB);

        __CLR4_5_2j02j02m6lb528o.R.inc(24662);assertTrue(Arrays.equals(baosBGR.toByteArray(), baosRGB.toByteArray()));
    }finally{__CLR4_5_2j02j02m6lb528o.R.flushNeeded();}}

    /**
     * Tests encodeRenderedImageWithDirectColorModeAsRGB(). Uses mocking to test the method
     * implementation.
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testMockedEncodeRenderedImageWithDirectColorModelAsRGB() throws IOException {__CLR4_5_2j02j02m6lb528o.R.globalSliceStart(getClass().getName(),24663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2mpncj13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j02j02m6lb528o.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j02j02m6lb528o.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.ImageEncodingHelperTestCase.testMockedEncodeRenderedImageWithDirectColorModelAsRGB",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2mpncj13() throws IOException{try{__CLR4_5_2j02j02m6lb528o.R.inc(24663);
        __CLR4_5_2j02j02m6lb528o.R.inc(24664);BufferedImage image = mock(BufferedImage.class);
        __CLR4_5_2j02j02m6lb528o.R.inc(24665);final int[] templateMasks = new int[] {0x00ff0000 /*R*/, 0x0000ff00 /*G*/,
                                                    0x000000ff /*B*/, 0xff000000 /*A*/};
        __CLR4_5_2j02j02m6lb528o.R.inc(24666);DirectColorModel dcm = new DirectColorModel(255, templateMasks[0], templateMasks[1],
                templateMasks[2], templateMasks[3]);

        __CLR4_5_2j02j02m6lb528o.R.inc(24667);WritableRaster raster = mock(WritableRaster.class);
        __CLR4_5_2j02j02m6lb528o.R.inc(24668);DataBuffer buffer = mock(DataBuffer.class);

        __CLR4_5_2j02j02m6lb528o.R.inc(24669);when(image.getColorModel()).thenReturn(dcm);
        __CLR4_5_2j02j02m6lb528o.R.inc(24670);when(image.getRaster()).thenReturn(raster);
        __CLR4_5_2j02j02m6lb528o.R.inc(24671);when(raster.getDataBuffer()).thenReturn(buffer);
        __CLR4_5_2j02j02m6lb528o.R.inc(24672);when(buffer.getDataType()).thenReturn(DataBuffer.TYPE_INT);
        __CLR4_5_2j02j02m6lb528o.R.inc(24673);when(image.getWidth()).thenReturn(3);
        __CLR4_5_2j02j02m6lb528o.R.inc(24674);when(image.getHeight()).thenReturn(3);
        __CLR4_5_2j02j02m6lb528o.R.inc(24675);final int expectedValue = 1 + 2 << 8 + 3 << 16;
        __CLR4_5_2j02j02m6lb528o.R.inc(24676);Answer<Object> ans = new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) throws Throwable {try{__CLR4_5_2j02j02m6lb528o.R.inc(24677);
                __CLR4_5_2j02j02m6lb528o.R.inc(24678);Object[] args = invocation.getArguments();
                __CLR4_5_2j02j02m6lb528o.R.inc(24679);int[] data = (int[]) args[4];
                __CLR4_5_2j02j02m6lb528o.R.inc(24680);Arrays.fill(data, expectedValue);
                __CLR4_5_2j02j02m6lb528o.R.inc(24681);return null;
            }finally{__CLR4_5_2j02j02m6lb528o.R.flushNeeded();}}
        };
        __CLR4_5_2j02j02m6lb528o.R.inc(24682);when(raster.getDataElements(anyInt(), anyInt(), anyInt(), anyInt(), any()))
                .thenAnswer(ans);

        __CLR4_5_2j02j02m6lb528o.R.inc(24683);ByteArrayOutputStream optimized = new ByteArrayOutputStream();
        __CLR4_5_2j02j02m6lb528o.R.inc(24684);ImageEncodingHelper.encodeRenderedImageWithDirectColorModelAsRGB(image, optimized);

        __CLR4_5_2j02j02m6lb528o.R.inc(24685);byte[] expectedByteArray = new byte[27];
        __CLR4_5_2j02j02m6lb528o.R.inc(24686);Arrays.fill(expectedByteArray, (byte) expectedValue);
        __CLR4_5_2j02j02m6lb528o.R.inc(24687);assertTrue(Arrays.equals(expectedByteArray, optimized.toByteArray()));
    }finally{__CLR4_5_2j02j02m6lb528o.R.flushNeeded();}}
}
