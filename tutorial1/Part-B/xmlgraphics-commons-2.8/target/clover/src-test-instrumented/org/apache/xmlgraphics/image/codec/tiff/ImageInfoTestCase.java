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
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.RenderedImage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.apache.xmlgraphics.image.codec.tiff.ExtraSamplesType.UNSPECIFIED;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.BILEVEL_BLACK_IS_ZERO;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.BILEVEL_WHITE_IS_ZERO;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.CIELAB;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.CMYK;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.GENERIC;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.GRAY;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.RGB;
import static org.apache.xmlgraphics.image.codec.tiff.ImageType.YCBCR;

public class ImageInfoTestCase {static class __CLR4_5_2hg7hg7m68iyium{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,22692,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ColorSpace colorSpace;
    private ColorModel colorModel;
    private RenderedImage image;
    private TIFFEncodeParam params;

    @Before
    public void setUp() {try{__CLR4_5_2hg7hg7m68iyium.R.inc(22615);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22616);colorSpace = mock(ColorSpace.class);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22617);colorModel = new TestColorModel(colorSpace, true);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22618);image = mock(RenderedImage.class);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22619);params = mock(TIFFEncodeParam.class);
    }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

    @Test
    public void testNullColorModel() {__CLR4_5_2hg7hg7m68iyium.R.globalSliceStart(getClass().getName(),22620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jf3i0qhgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hg7hg7m68iyium.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hg7hg7m68iyium.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.ImageInfoTestCase.testNullColorModel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22620,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jf3i0qhgc(){try{__CLR4_5_2hg7hg7m68iyium.R.inc(22620);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22621);testImageInfo(ImageInfo.newInstance(image, 1, 1, null, params),
                BILEVEL_BLACK_IS_ZERO, 0, null, 0, UNSPECIFIED);

        __CLR4_5_2hg7hg7m68iyium.R.inc(22622);for (int i = 2; (((i < 10)&&(__CLR4_5_2hg7hg7m68iyium.R.iget(22623)!=0|true))||(__CLR4_5_2hg7hg7m68iyium.R.iget(22624)==0&false)); i += 2) {{
            __CLR4_5_2hg7hg7m68iyium.R.inc(22625);testImageInfo(ImageInfo.newInstance(image, 1, i, null, params),
                    GENERIC, i - 1, null, 0, UNSPECIFIED);
        }
    }}finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

    @Test
    public void testNonIndexColorModel() {__CLR4_5_2hg7hg7m68iyium.R.globalSliceStart(getClass().getName(),22626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e74y4chgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hg7hg7m68iyium.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hg7hg7m68iyium.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.ImageInfoTestCase.testNonIndexColorModel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e74y4chgi(){try{__CLR4_5_2hg7hg7m68iyium.R.inc(22626);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22627);testTheColorSpaceType(ColorSpace.TYPE_CMYK, false, CMYK);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22628);testTheColorSpaceType(ColorSpace.TYPE_GRAY, false, GRAY);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22629);testTheColorSpaceType(ColorSpace.TYPE_RGB, true, YCBCR);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22630);testTheColorSpaceType(ColorSpace.TYPE_RGB, false, RGB);
    }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

    private void testTheColorSpaceType(int colorSpaceType, boolean getJpegCompress, ImageType expectedType) {try{__CLR4_5_2hg7hg7m68iyium.R.inc(22631);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22632);when(colorSpace.getType()).thenReturn(colorSpaceType);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22633);TIFFEncodeParam params = mock(TIFFEncodeParam.class);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22634);when(params.getJPEGCompressRGBToYCbCr()).thenReturn(getJpegCompress);

        __CLR4_5_2hg7hg7m68iyium.R.inc(22635);testImageInfo(ImageInfo.newInstance(image, 1, 1, colorModel, params),
                expectedType, 0, null, 0, UNSPECIFIED);
    }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

    @Test
    public void testNonIndexColorModelWithNumBandsGreaterThan1() {__CLR4_5_2hg7hg7m68iyium.R.globalSliceStart(getClass().getName(),22636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vmtgoohgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hg7hg7m68iyium.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hg7hg7m68iyium.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.ImageInfoTestCase.testNonIndexColorModelWithNumBandsGreaterThan1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22636,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vmtgoohgs(){try{__CLR4_5_2hg7hg7m68iyium.R.inc(22636);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22637);testWithNumOfBandsGreaterThan1(ColorSpace.TYPE_GRAY, GRAY, 3, 1);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22638);testWithNumOfBandsGreaterThan1(ColorSpace.TYPE_Lab, CIELAB, 6, 3);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22639);testWithNumOfBandsGreaterThan1(ColorSpace.TYPE_CMYK, CMYK, 5, 2);
    }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

    private void testWithNumOfBandsGreaterThan1(int colorSpaceType, ImageType type, int numBands,
            int numComponents) {try{__CLR4_5_2hg7hg7m68iyium.R.inc(22640);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22641);when(colorSpace.getType()).thenReturn(colorSpaceType);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22642);when(colorSpace.getNumComponents()).thenReturn(numComponents);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22643);testImageInfo(ImageInfo.newInstance(image, 2, numBands, colorModel, params),
                type, numBands - numComponents, null, 0, UNSPECIFIED);
    }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

    private void testImageInfo(ImageInfo imageInfo, ImageType imageType, int numExtraSamples,
            char[] colormap, int colormapSize, ExtraSamplesType extraSamplesType) {try{__CLR4_5_2hg7hg7m68iyium.R.inc(22644);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22645);assertEquals(imageType, imageInfo.getType());
        __CLR4_5_2hg7hg7m68iyium.R.inc(22646);assertEquals(numExtraSamples, imageInfo.getNumberOfExtraSamples());
        __CLR4_5_2hg7hg7m68iyium.R.inc(22647);assertArrayEquals(colormap, imageInfo.getColormap());
        __CLR4_5_2hg7hg7m68iyium.R.inc(22648);assertEquals(colormapSize, imageInfo.getColormapSize());
        __CLR4_5_2hg7hg7m68iyium.R.inc(22649);assertEquals(extraSamplesType, imageInfo.getExtraSamplesType());
    }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

    @Test
    public void testIndexColorModel() {__CLR4_5_2hg7hg7m68iyium.R.globalSliceStart(getClass().getName(),22650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cmdvn7hh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hg7hg7m68iyium.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hg7hg7m68iyium.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.ImageInfoTestCase.testIndexColorModel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22650,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cmdvn7hh6(){try{__CLR4_5_2hg7hg7m68iyium.R.inc(22650);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22651);byte[] blackIsZero = new byte[] {0, (byte) 0xff};
        __CLR4_5_2hg7hg7m68iyium.R.inc(22652);IndexColorModel icm = new IndexColorModel(1, 2, blackIsZero, blackIsZero, blackIsZero);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22653);testImageInfo(ImageInfo.newInstance(image, 1, 1, icm, params),
                BILEVEL_BLACK_IS_ZERO, 0, null, 0, UNSPECIFIED);

        __CLR4_5_2hg7hg7m68iyium.R.inc(22654);byte[] whiteIsZero = new byte[] {(byte) 0xff, 0};
        __CLR4_5_2hg7hg7m68iyium.R.inc(22655);icm = new IndexColorModel(1, 2, whiteIsZero, whiteIsZero, whiteIsZero);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22656);testImageInfo(ImageInfo.newInstance(image, 1, 1, icm, params),
                BILEVEL_WHITE_IS_ZERO, 0, null, 0, UNSPECIFIED);
    }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

    @Test
    public void testTileWidthHeight() {__CLR4_5_2hg7hg7m68iyium.R.globalSliceStart(getClass().getName(),22657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oyp7echhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hg7hg7m68iyium.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hg7hg7m68iyium.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.ImageInfoTestCase.testTileWidthHeight",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22657,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oyp7echhd(){try{__CLR4_5_2hg7hg7m68iyium.R.inc(22657);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22658);when(params.getWriteTiled()).thenReturn(true);

        __CLR4_5_2hg7hg7m68iyium.R.inc(22659);when(image.getWidth()).thenReturn(10);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22660);when(image.getHeight()).thenReturn(10);

        __CLR4_5_2hg7hg7m68iyium.R.inc(22661);for (int i = 1; (((i < 10000)&&(__CLR4_5_2hg7hg7m68iyium.R.iget(22662)!=0|true))||(__CLR4_5_2hg7hg7m68iyium.R.iget(22663)==0&false)); i += 200) {{
            __CLR4_5_2hg7hg7m68iyium.R.inc(22664);when(params.getTileWidth()).thenReturn(i);
            __CLR4_5_2hg7hg7m68iyium.R.inc(22665);when(params.getTileHeight()).thenReturn(i);
            __CLR4_5_2hg7hg7m68iyium.R.inc(22666);int numTiles = ((10 + i - 1) / i) * ((10 + i - 1) / i);
            __CLR4_5_2hg7hg7m68iyium.R.inc(22667);long bytesPerRow = (long) Math.ceil((1 / 8.0) * i * 1);
            __CLR4_5_2hg7hg7m68iyium.R.inc(22668);long bytesPerTile = bytesPerRow * i;

            __CLR4_5_2hg7hg7m68iyium.R.inc(22669);testTileOnImageInfo(ImageInfo.newInstance(image, 1, 1, colorModel, params),
                    i, i, numTiles, bytesPerRow, bytesPerTile);
        }
    }}finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

    private void testTileOnImageInfo(ImageInfo imageInfo, int tileWidth, int tileHeight,
            int numTiles, long bytesPerRow, long bytesPerTile) {try{__CLR4_5_2hg7hg7m68iyium.R.inc(22670);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22671);assertEquals(tileWidth, imageInfo.getTileWidth());
        __CLR4_5_2hg7hg7m68iyium.R.inc(22672);assertEquals(tileHeight, imageInfo.getTileHeight());
        __CLR4_5_2hg7hg7m68iyium.R.inc(22673);assertEquals(numTiles, imageInfo.getNumTiles());
        __CLR4_5_2hg7hg7m68iyium.R.inc(22674);assertEquals(bytesPerRow, imageInfo.getBytesPerRow());
        __CLR4_5_2hg7hg7m68iyium.R.inc(22675);assertEquals(bytesPerTile, imageInfo.getBytesPerTile());
    }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

    @Test
    public void testGetColormap() {__CLR4_5_2hg7hg7m68iyium.R.globalSliceStart(getClass().getName(),22676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sqf7i4hhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hg7hg7m68iyium.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hg7hg7m68iyium.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.ImageInfoTestCase.testGetColormap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sqf7i4hhw(){try{__CLR4_5_2hg7hg7m68iyium.R.inc(22676);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22677);ImageInfo sut = ImageInfo.newInstance(image, 1, 1,
                new IndexColorModel(1, 2, new byte[2], new byte[2], new byte[2], new byte[2]), params);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22678);char[] colormap = sut.getColormap();
        __CLR4_5_2hg7hg7m68iyium.R.inc(22679);assertEquals(0, colormap[0]);
        __CLR4_5_2hg7hg7m68iyium.R.inc(22680);colormap[0] = 1;
        //  Assert that getColormap() returns a defensive copy
        __CLR4_5_2hg7hg7m68iyium.R.inc(22681);assertEquals(0, sut.getColormap()[0]);
    }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

    private static final class TestColorModel extends ColorModel {

        protected TestColorModel(ColorSpace cspace, boolean isAlphaPremultiplied) {
            super(1, new int[] {1, 1}, cspace, isAlphaPremultiplied, isAlphaPremultiplied, 1, 1);__CLR4_5_2hg7hg7m68iyium.R.inc(22683);try{__CLR4_5_2hg7hg7m68iyium.R.inc(22682);
        }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

        @Override
        public int getRed(int pixel) {try{__CLR4_5_2hg7hg7m68iyium.R.inc(22684);
            __CLR4_5_2hg7hg7m68iyium.R.inc(22685);return 0;
        }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

        @Override
        public int getGreen(int pixel) {try{__CLR4_5_2hg7hg7m68iyium.R.inc(22686);
            __CLR4_5_2hg7hg7m68iyium.R.inc(22687);return 0;
        }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

        @Override
        public int getBlue(int pixel) {try{__CLR4_5_2hg7hg7m68iyium.R.inc(22688);
            __CLR4_5_2hg7hg7m68iyium.R.inc(22689);return 0;
        }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}

        @Override
        public int getAlpha(int pixel) {try{__CLR4_5_2hg7hg7m68iyium.R.inc(22690);
            __CLR4_5_2hg7hg7m68iyium.R.inc(22691);return 0;
        }finally{__CLR4_5_2hg7hg7m68iyium.R.flushNeeded();}}
    }
}
