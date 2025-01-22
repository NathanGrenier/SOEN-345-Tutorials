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

package org.apache.xmlgraphics.image.codec.tiff;

import java.awt.color.ColorSpace;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.apache.xmlgraphics.image.codec.tiff.ImageType.BILEVEL_BLACK_IS_ZERO;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.BILEVEL_WHITE_IS_ZERO;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.CIELAB;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.CMYK;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.GENERIC;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.GRAY;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.PALETTE;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.RGB;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.UNSUPPORTED;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.YCBCR;

public class ImageTypeTestCase {static class __CLR4_5_2hichicm68iyiuw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,22740,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final class ColorContainer {
        private final byte[] r;
        private final byte[] g;
        private final byte[] b;

        private ColorContainer(byte[] r, byte[] g, byte[] b) {try{__CLR4_5_2hichicm68iyiuw.R.inc(22692);
            __CLR4_5_2hichicm68iyiuw.R.inc(22693);this.r = r;
            __CLR4_5_2hichicm68iyiuw.R.inc(22694);this.b = b;
            __CLR4_5_2hichicm68iyiuw.R.inc(22695);this.g = g;
        }finally{__CLR4_5_2hichicm68iyiuw.R.flushNeeded();}}
    }

    private ColorContainer blackIsZero;
    private ColorContainer whiteIsZero;

    @Before
    public void setUp() {try{__CLR4_5_2hichicm68iyiuw.R.inc(22696);
        __CLR4_5_2hichicm68iyiuw.R.inc(22697);byte[] blackSetToZero = {0, (byte) 0xff};
        __CLR4_5_2hichicm68iyiuw.R.inc(22698);blackIsZero = new ColorContainer(blackSetToZero, blackSetToZero, blackSetToZero);
        __CLR4_5_2hichicm68iyiuw.R.inc(22699);byte[] whiteSetToZero = {(byte) 0xff, 0};
        __CLR4_5_2hichicm68iyiuw.R.inc(22700);whiteIsZero = new ColorContainer(whiteSetToZero, whiteSetToZero, whiteSetToZero);
    }finally{__CLR4_5_2hichicm68iyiuw.R.flushNeeded();}}

    @Test
    public void testPhotometricInterpretationValue() {__CLR4_5_2hichicm68iyiuw.R.globalSliceStart(getClass().getName(),22701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ub1uxshil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hichicm68iyiuw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hichicm68iyiuw.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.ImageTypeTestCase.testPhotometricInterpretationValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22701,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ub1uxshil(){try{__CLR4_5_2hichicm68iyiuw.R.inc(22701);
        __CLR4_5_2hichicm68iyiuw.R.inc(22702);assertEquals(0, BILEVEL_WHITE_IS_ZERO.getPhotometricInterpretation());
        __CLR4_5_2hichicm68iyiuw.R.inc(22703);assertEquals(1, BILEVEL_BLACK_IS_ZERO.getPhotometricInterpretation());
        __CLR4_5_2hichicm68iyiuw.R.inc(22704);assertEquals(1, GRAY.getPhotometricInterpretation());
        __CLR4_5_2hichicm68iyiuw.R.inc(22705);assertEquals(3, PALETTE.getPhotometricInterpretation());
        __CLR4_5_2hichicm68iyiuw.R.inc(22706);assertEquals(2, RGB.getPhotometricInterpretation());
        __CLR4_5_2hichicm68iyiuw.R.inc(22707);assertEquals(5, CMYK.getPhotometricInterpretation());
        __CLR4_5_2hichicm68iyiuw.R.inc(22708);assertEquals(6, YCBCR.getPhotometricInterpretation());
        __CLR4_5_2hichicm68iyiuw.R.inc(22709);assertEquals(8, CIELAB.getPhotometricInterpretation());
        __CLR4_5_2hichicm68iyiuw.R.inc(22710);assertEquals(1, GENERIC.getPhotometricInterpretation());
    }finally{__CLR4_5_2hichicm68iyiuw.R.flushNeeded();}}

    @Test
    public void testGetTypeFromRGB() {__CLR4_5_2hichicm68iyiuw.R.globalSliceStart(getClass().getName(),22711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sfmdyshiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hichicm68iyiuw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hichicm68iyiuw.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.ImageTypeTestCase.testGetTypeFromRGB",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22711,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sfmdyshiv(){try{__CLR4_5_2hichicm68iyiuw.R.inc(22711);
        __CLR4_5_2hichicm68iyiuw.R.inc(22712);assertEquals(BILEVEL_BLACK_IS_ZERO, ImageType.getTypeFromRGB(2,
                blackIsZero.r, blackIsZero.g, blackIsZero.b, 1, 1));
        __CLR4_5_2hichicm68iyiuw.R.inc(22713);assertEquals(BILEVEL_WHITE_IS_ZERO, ImageType.getTypeFromRGB(2,
                whiteIsZero.r, whiteIsZero.g, whiteIsZero.b, 1, 1));
        // Test all other values (i.e. not including 0xff)
        __CLR4_5_2hichicm68iyiuw.R.inc(22714);for (int b = 0; (((b < 255)&&(__CLR4_5_2hichicm68iyiuw.R.iget(22715)!=0|true))||(__CLR4_5_2hichicm68iyiuw.R.iget(22716)==0&false)); b++) {{
            __CLR4_5_2hichicm68iyiuw.R.inc(22717);assertEquals(PALETTE, ImageType.getTypeFromRGB(2,
                    make2ByteArray(0, b), make2ByteArray(0, b), make2ByteArray(0, b), 1, 1));
            __CLR4_5_2hichicm68iyiuw.R.inc(22718);assertEquals(PALETTE, ImageType.getTypeFromRGB(2,
                    make2ByteArray(b, 0), make2ByteArray(b, 0), make2ByteArray(b, 0), 1, 1));
            __CLR4_5_2hichicm68iyiuw.R.inc(22719);if ((((b != 1)&&(__CLR4_5_2hichicm68iyiuw.R.iget(22720)!=0|true))||(__CLR4_5_2hichicm68iyiuw.R.iget(22721)==0&false))) {{
                __CLR4_5_2hichicm68iyiuw.R.inc(22722);assertEquals(UNSUPPORTED, ImageType.getTypeFromRGB(2, null, null, null, 1, b));
            }
        }}
    }}finally{__CLR4_5_2hichicm68iyiuw.R.flushNeeded();}}

    private byte[] make2ByteArray(int b1, int b2) {try{__CLR4_5_2hichicm68iyiuw.R.inc(22723);
        __CLR4_5_2hichicm68iyiuw.R.inc(22724);return new byte[] {(byte) b1, (byte) b2};
    }finally{__CLR4_5_2hichicm68iyiuw.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testException() {__CLR4_5_2hichicm68iyiuw.R.globalSliceStart(getClass().getName(),22725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22aalq4hj9();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,120,99,101,112,116,105,111,110,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hichicm68iyiuw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hichicm68iyiuw.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.ImageTypeTestCase.testException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22725,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22aalq4hj9(){try{__CLR4_5_2hichicm68iyiuw.R.inc(22725);
        __CLR4_5_2hichicm68iyiuw.R.inc(22726);assertEquals(UNSUPPORTED, ImageType.getTypeFromRGB(1, null, null, null, 1, 1));
    }finally{__CLR4_5_2hichicm68iyiuw.R.flushNeeded();}}

    @Test
    public void testGetTypeFromColorSpace() {__CLR4_5_2hichicm68iyiuw.R.globalSliceStart(getClass().getName(),22727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ixh4ihjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hichicm68iyiuw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hichicm68iyiuw.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.ImageTypeTestCase.testGetTypeFromColorSpace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ixh4ihjb(){try{__CLR4_5_2hichicm68iyiuw.R.inc(22727);
        __CLR4_5_2hichicm68iyiuw.R.inc(22728);testIndividualColorSpaceType(CMYK, ColorSpace.TYPE_CMYK, false);
        __CLR4_5_2hichicm68iyiuw.R.inc(22729);testIndividualColorSpaceType(GRAY, ColorSpace.TYPE_GRAY, false);
        __CLR4_5_2hichicm68iyiuw.R.inc(22730);testIndividualColorSpaceType(CIELAB, ColorSpace.TYPE_Lab, false);
        __CLR4_5_2hichicm68iyiuw.R.inc(22731);testIndividualColorSpaceType(YCBCR, ColorSpace.TYPE_YCbCr, false);
        __CLR4_5_2hichicm68iyiuw.R.inc(22732);testIndividualColorSpaceType(YCBCR, ColorSpace.TYPE_RGB, true);
        __CLR4_5_2hichicm68iyiuw.R.inc(22733);testIndividualColorSpaceType(RGB, ColorSpace.TYPE_RGB, false);
    }finally{__CLR4_5_2hichicm68iyiuw.R.flushNeeded();}}

    private void testIndividualColorSpaceType(ImageType expected, int type, boolean getJpegCompress) {try{__CLR4_5_2hichicm68iyiuw.R.inc(22734);
        __CLR4_5_2hichicm68iyiuw.R.inc(22735);ColorSpace colorSpace = mock(ColorSpace.class);
        __CLR4_5_2hichicm68iyiuw.R.inc(22736);when(colorSpace.getType()).thenReturn(type);
        __CLR4_5_2hichicm68iyiuw.R.inc(22737);TIFFEncodeParam params = mock(TIFFEncodeParam.class);
        __CLR4_5_2hichicm68iyiuw.R.inc(22738);when(params.getJPEGCompressRGBToYCbCr()).thenReturn(getJpegCompress);

        __CLR4_5_2hichicm68iyiuw.R.inc(22739);assertEquals(expected, ImageType.getTypeFromColorSpace(colorSpace, params));
    }finally{__CLR4_5_2hichicm68iyiuw.R.flushNeeded();}}
}
