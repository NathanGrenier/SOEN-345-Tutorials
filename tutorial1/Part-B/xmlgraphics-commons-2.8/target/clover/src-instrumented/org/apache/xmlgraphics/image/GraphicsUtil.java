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

/* $Id: GraphicsUtil.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.awt.image.DataBufferShort;
import java.awt.image.DataBufferUShort;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.awt.image.SinglePixelPackedSampleModel;
import java.awt.image.WritableRaster;

import org.apache.xmlgraphics.image.rendered.Any2LsRGBRed;
import org.apache.xmlgraphics.image.rendered.Any2sRGBRed;
import org.apache.xmlgraphics.image.rendered.BufferedImageCachableRed;
import org.apache.xmlgraphics.image.rendered.CachableRed;
import org.apache.xmlgraphics.image.rendered.RenderedImageCachableRed;

// CSOFF: AvoidNestedBlocks
// CSOFF: ConstantName
// CSOFF: MethodName
// CSOFF: MultipleVariableDeclarations
// CSOFF: NeedBraces
// CSOFF: OneStatementPerLine
// CSOFF: OperatorWrap
// CSOFF: StaticVariableName
// CSOFF: WhitespaceAfter
// CSOFF: WhitespaceAround

/**
 * Set of utility methods for Graphics.
 * These generally bypass broken methods in Java2D or provide tweaked
 * implementations.
 *
 * @version $Id: GraphicsUtil.java 1732018 2016-02-24 04:51:06Z gadams $
 *
 * Originally authored by Thomas DeWeese.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class GraphicsUtil {public static class __CLR4_5_27n7nm68iyfqc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,974,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private GraphicsUtil() {try{__CLR4_5_27n7nm68iyfqc.R.inc(275);
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    public static final AffineTransform IDENTITY = new AffineTransform();

    /**
     * Standard prebuilt Linear_sRGB color model with no alpha */
    public static final ColorModel Linear_sRGB =
        new DirectColorModel(ColorSpace.getInstance(
                             ColorSpace.CS_LINEAR_RGB), 24,
                             0x00FF0000, 0x0000FF00,
                             0x000000FF, 0x0, false,
                             DataBuffer.TYPE_INT);
    /**
     * Standard prebuilt Linear_sRGB color model with premultiplied alpha.
     */
    public static final ColorModel Linear_sRGB_Pre =
        new DirectColorModel(ColorSpace.getInstance(
                             ColorSpace.CS_LINEAR_RGB), 32,
                             0x00FF0000, 0x0000FF00,
                             0x000000FF, 0xFF000000, true,
                             DataBuffer.TYPE_INT);
    /**
     * Standard prebuilt Linear_sRGB color model with unpremultiplied alpha.
     */
    public static final ColorModel Linear_sRGB_Unpre =
        new DirectColorModel(ColorSpace.getInstance(
                             ColorSpace.CS_LINEAR_RGB), 32,
                             0x00FF0000, 0x0000FF00,
                             0x000000FF, 0xFF000000, false,
                             DataBuffer.TYPE_INT);

    /**
     * Standard prebuilt sRGB color model with no alpha.
     */
    public static final ColorModel sRGB =
        new DirectColorModel(ColorSpace.getInstance(
                             ColorSpace.CS_sRGB), 24,
                             0x00FF0000, 0x0000FF00,
                             0x000000FF, 0x0, false,
                             DataBuffer.TYPE_INT);
    /**
     * Standard prebuilt sRGB color model with premultiplied alpha.
     */
    public static final ColorModel sRGB_Pre =
        new DirectColorModel(ColorSpace.getInstance(
                             ColorSpace.CS_sRGB), 32,
                             0x00FF0000, 0x0000FF00,
                             0x000000FF, 0xFF000000, true,
                             DataBuffer.TYPE_INT);
    /**
     * Standard prebuilt sRGB color model with unpremultiplied alpha.
     */
    public static final ColorModel sRGB_Unpre =
        new DirectColorModel(ColorSpace.getInstance(
                             ColorSpace.CS_sRGB), 32,
                             0x00FF0000, 0x0000FF00,
                             0x000000FF, 0xFF000000, false,
                             DataBuffer.TYPE_INT);

    /**
     * Method that returns either Linear_sRGB_Pre or Linear_sRGB_UnPre
     * based on premult flag.
     * @param premult True if the ColorModel should have premultiplied alpha.
     * @return        a ColorMdoel with Linear sRGB colorSpace and
     *                the alpha channel set in accordance with
     *                <tt>premult</tt>
     */
    public static ColorModel makeLinear_sRGBCM(boolean premult) {try{__CLR4_5_27n7nm68iyfqc.R.inc(276);
         __CLR4_5_27n7nm68iyfqc.R.inc(277);return (((premult )&&(__CLR4_5_27n7nm68iyfqc.R.iget(278)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(279)==0&false))? Linear_sRGB_Pre : Linear_sRGB_Unpre;
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * Constructs a BufferedImage with a linear sRGB colorModel, and alpha.
     * @param width   The desired width of the BufferedImage
     * @param height  The desired height of the BufferedImage
     * @param premult The desired state of alpha premultiplied
     * @return        The requested BufferedImage.
     */
    public static BufferedImage makeLinearBufferedImage(int width,
                                                        int height,
                                                        boolean premult) {try{__CLR4_5_27n7nm68iyfqc.R.inc(280);
        __CLR4_5_27n7nm68iyfqc.R.inc(281);ColorModel cm = makeLinear_sRGBCM(premult);
        __CLR4_5_27n7nm68iyfqc.R.inc(282);WritableRaster wr = cm.createCompatibleWritableRaster(width, height);
        __CLR4_5_27n7nm68iyfqc.R.inc(283);return new BufferedImage(cm, wr, premult, null);
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * This method will return a CacheableRed that has it's data in
     * the linear sRGB colorspace. If <tt>src</tt> is already in
     * linear sRGB then this method does nothing and returns <tt>src</tt>.
     * Otherwise it creates a transform that will convert
     * <tt>src</tt>'s output to linear sRGB and returns that CacheableRed.
     *
     * @param src The image to convert to linear sRGB.
     * @return    An equivilant image to <tt>src</tt> who's data is in
     *            linear sRGB.
     */
    public static CachableRed convertToLsRGB(CachableRed src) {try{__CLR4_5_27n7nm68iyfqc.R.inc(284);
        __CLR4_5_27n7nm68iyfqc.R.inc(285);ColorModel cm = src.getColorModel();
        __CLR4_5_27n7nm68iyfqc.R.inc(286);ColorSpace cs = cm.getColorSpace();
        __CLR4_5_27n7nm68iyfqc.R.inc(287);if ((((cs == ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB))&&(__CLR4_5_27n7nm68iyfqc.R.iget(288)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(289)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(290);return src;
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(291);return new Any2LsRGBRed(src);
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * This method will return a CacheableRed that has it's data in
     * the sRGB colorspace. If <tt>src</tt> is already in
     * sRGB then this method does nothing and returns <tt>src</tt>.
     * Otherwise it creates a transform that will convert
     * <tt>src</tt>'s output to sRGB and returns that CacheableRed.
     *
     * @param src The image to convert to sRGB.
     * @return    An equivilant image to <tt>src</tt> who's data is in sRGB.
     */
    public static CachableRed convertTosRGB(CachableRed src) {try{__CLR4_5_27n7nm68iyfqc.R.inc(292);
        __CLR4_5_27n7nm68iyfqc.R.inc(293);ColorModel cm = src.getColorModel();
        __CLR4_5_27n7nm68iyfqc.R.inc(294);ColorSpace cs = cm.getColorSpace();
        __CLR4_5_27n7nm68iyfqc.R.inc(295);if ((((cs == ColorSpace.getInstance(ColorSpace.CS_sRGB))&&(__CLR4_5_27n7nm68iyfqc.R.iget(296)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(297)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(298);return src;
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(299);return new Any2sRGBRed(src);
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * Convertes any RenderedImage to a CacheableRed.  <p>
     * If <tt>ri</tt> is already a CacheableRed it casts it down and
     * returns it.<p>
     *
     * In cases where <tt>ri</tt> is not already a CacheableRed it
     * wraps <tt>ri</tt> with a helper class.  The wrapped
     * CacheableRed "Pretends" that it has no sources since it has no
     * way of inteligently handling the dependency/dirty region calls
     * if it exposed the source.
     * @param ri The RenderedImage to convert.
     * @return   a CacheableRed that contains the same data as ri.
     */
    public static CachableRed wrap(RenderedImage ri) {try{__CLR4_5_27n7nm68iyfqc.R.inc(300);
        __CLR4_5_27n7nm68iyfqc.R.inc(301);if ((((ri instanceof CachableRed)&&(__CLR4_5_27n7nm68iyfqc.R.iget(302)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(303)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(304);return (CachableRed) ri;
        }
        }__CLR4_5_27n7nm68iyfqc.R.inc(305);if ((((ri instanceof BufferedImage)&&(__CLR4_5_27n7nm68iyfqc.R.iget(306)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(307)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(308);return new BufferedImageCachableRed((BufferedImage)ri);
        }
        }__CLR4_5_27n7nm68iyfqc.R.inc(309);return new RenderedImageCachableRed(ri);
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * An internal optimized version of copyData designed to work on
     * Integer packed data with a SinglePixelPackedSampleModel.  Only
     * the region of overlap between src and dst is copied.
     *
     * Calls to this should be preflighted with is_INT_PACK_Data
     * on both src and dest (requireAlpha can be false).
     *
     * @param src The source of the data
     * @param dst The destination for the data.
     */
    public static void copyData_INT_PACK(Raster src, WritableRaster dst) {try{__CLR4_5_27n7nm68iyfqc.R.inc(310);
        // System.out.println("Fast copyData");
        __CLR4_5_27n7nm68iyfqc.R.inc(311);int x0 = dst.getMinX();
        __CLR4_5_27n7nm68iyfqc.R.inc(312);if ((((x0 < src.getMinX())&&(__CLR4_5_27n7nm68iyfqc.R.iget(313)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(314)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(315);x0 = src.getMinX();
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(316);int y0 = dst.getMinY();
        __CLR4_5_27n7nm68iyfqc.R.inc(317);if ((((y0 < src.getMinY())&&(__CLR4_5_27n7nm68iyfqc.R.iget(318)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(319)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(320);y0 = src.getMinY();
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(321);int x1 = dst.getMinX() + dst.getWidth() - 1;
        __CLR4_5_27n7nm68iyfqc.R.inc(322);if ((((x1 > src.getMinX() + src.getWidth() - 1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(323)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(324)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(325);x1 = src.getMinX() + src.getWidth() - 1;
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(326);int y1 = dst.getMinY() + dst.getHeight() - 1;
        __CLR4_5_27n7nm68iyfqc.R.inc(327);if ((((y1 > src.getMinY() + src.getHeight() - 1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(328)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(329)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(330);y1 = src.getMinY() + src.getHeight() - 1;
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(331);int width  = x1 - x0 + 1;
        __CLR4_5_27n7nm68iyfqc.R.inc(332);int height = y1 - y0 + 1;

        __CLR4_5_27n7nm68iyfqc.R.inc(333);SinglePixelPackedSampleModel srcSPPSM;
        __CLR4_5_27n7nm68iyfqc.R.inc(334);srcSPPSM = (SinglePixelPackedSampleModel)src.getSampleModel();

        __CLR4_5_27n7nm68iyfqc.R.inc(335);final int     srcScanStride = srcSPPSM.getScanlineStride();
        __CLR4_5_27n7nm68iyfqc.R.inc(336);DataBufferInt srcDB         = (DataBufferInt)src.getDataBuffer();
        __CLR4_5_27n7nm68iyfqc.R.inc(337);final int []  srcPixels     = srcDB.getBankData()[0];
        __CLR4_5_27n7nm68iyfqc.R.inc(338);final int     srcBase =
            (srcDB.getOffset()
             + srcSPPSM.getOffset(x0 - src.getSampleModelTranslateX(),
                                y0 - src.getSampleModelTranslateY()));


        __CLR4_5_27n7nm68iyfqc.R.inc(339);SinglePixelPackedSampleModel dstSPPSM;
        __CLR4_5_27n7nm68iyfqc.R.inc(340);dstSPPSM = (SinglePixelPackedSampleModel)dst.getSampleModel();

        __CLR4_5_27n7nm68iyfqc.R.inc(341);final int     dstScanStride = dstSPPSM.getScanlineStride();
        __CLR4_5_27n7nm68iyfqc.R.inc(342);DataBufferInt dstDB         = (DataBufferInt)dst.getDataBuffer();
        __CLR4_5_27n7nm68iyfqc.R.inc(343);final int []  dstPixels     = dstDB.getBankData()[0];
        __CLR4_5_27n7nm68iyfqc.R.inc(344);final int     dstBase =
            (dstDB.getOffset()
             + dstSPPSM.getOffset(x0 - dst.getSampleModelTranslateX(),
                                y0 - dst.getSampleModelTranslateY()));

        __CLR4_5_27n7nm68iyfqc.R.inc(345);if (((((srcScanStride == dstScanStride)
            && (srcScanStride == width))&&(__CLR4_5_27n7nm68iyfqc.R.iget(346)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(347)==0&false))) {{
            // System.out.println("VERY Fast copyData");

            __CLR4_5_27n7nm68iyfqc.R.inc(348);System.arraycopy(srcPixels, srcBase, dstPixels, dstBase,
                             width * height);
        } }else {__CLR4_5_27n7nm68iyfqc.R.inc(349);if ((((width > 128)&&(__CLR4_5_27n7nm68iyfqc.R.iget(350)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(351)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(352);int srcSP = srcBase;
            __CLR4_5_27n7nm68iyfqc.R.inc(353);int dstSP = dstBase;
            __CLR4_5_27n7nm68iyfqc.R.inc(354);for (int y = 0; (((y < height)&&(__CLR4_5_27n7nm68iyfqc.R.iget(355)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(356)==0&false)); y++) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(357);System.arraycopy(srcPixels, srcSP, dstPixels, dstSP, width);
                __CLR4_5_27n7nm68iyfqc.R.inc(358);srcSP += srcScanStride;
                __CLR4_5_27n7nm68iyfqc.R.inc(359);dstSP += dstScanStride;
            }
        }} }else {{
            __CLR4_5_27n7nm68iyfqc.R.inc(360);for (int y = 0; (((y < height)&&(__CLR4_5_27n7nm68iyfqc.R.iget(361)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(362)==0&false)); y++) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(363);int srcSP = srcBase + y * srcScanStride;
                __CLR4_5_27n7nm68iyfqc.R.inc(364);int dstSP = dstBase + y * dstScanStride;
                __CLR4_5_27n7nm68iyfqc.R.inc(365);for (int x = 0; (((x < width)&&(__CLR4_5_27n7nm68iyfqc.R.iget(366)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(367)==0&false)); x++) {{
                    __CLR4_5_27n7nm68iyfqc.R.inc(368);dstPixels[dstSP++] = srcPixels[srcSP++];
                }
            }}
        }}
    }}}finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    public static void copyData_FALLBACK(Raster src, WritableRaster dst) {try{__CLR4_5_27n7nm68iyfqc.R.inc(369);
        // System.out.println("Fallback copyData");

        __CLR4_5_27n7nm68iyfqc.R.inc(370);int x0 = dst.getMinX();
        __CLR4_5_27n7nm68iyfqc.R.inc(371);if ((((x0 < src.getMinX())&&(__CLR4_5_27n7nm68iyfqc.R.iget(372)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(373)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(374);x0 = src.getMinX();
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(375);int y0 = dst.getMinY();
        __CLR4_5_27n7nm68iyfqc.R.inc(376);if ((((y0 < src.getMinY())&&(__CLR4_5_27n7nm68iyfqc.R.iget(377)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(378)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(379);y0 = src.getMinY();
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(380);int x1 = dst.getMinX() + dst.getWidth() - 1;
        __CLR4_5_27n7nm68iyfqc.R.inc(381);if ((((x1 > src.getMinX() + src.getWidth() - 1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(382)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(383)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(384);x1 = src.getMinX() + src.getWidth() - 1;
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(385);int y1 = dst.getMinY() + dst.getHeight() - 1;
        __CLR4_5_27n7nm68iyfqc.R.inc(386);if ((((y1 > src.getMinY() + src.getHeight() - 1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(387)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(388)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(389);y1 = src.getMinY() + src.getHeight() - 1;
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(390);int width  = x1 - x0 + 1;
        __CLR4_5_27n7nm68iyfqc.R.inc(391);int [] data = null;

        __CLR4_5_27n7nm68iyfqc.R.inc(392);for (int y = y0; (((y <= y1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(393)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(394)==0&false)); y++)  {{
            __CLR4_5_27n7nm68iyfqc.R.inc(395);data = src.getPixels(x0, y, width, 1, data);
            __CLR4_5_27n7nm68iyfqc.R.inc(396);dst.setPixels(x0, y, width, 1, data);
        }
    }}finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * Copies data from one raster to another. Only the region of
     * overlap between src and dst is copied.  <tt>Src</tt> and
     * <tt>Dst</tt> must have compatible SampleModels.
     *
     * @param src The source of the data
     * @param dst The destination for the data.
     */
    public static void copyData(Raster src, WritableRaster dst) {try{__CLR4_5_27n7nm68iyfqc.R.inc(397);
        __CLR4_5_27n7nm68iyfqc.R.inc(398);if ((((is_INT_PACK_Data(src.getSampleModel(), false)
            && is_INT_PACK_Data(dst.getSampleModel(), false))&&(__CLR4_5_27n7nm68iyfqc.R.iget(399)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(400)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(401);copyData_INT_PACK(src, dst);
            __CLR4_5_27n7nm68iyfqc.R.inc(402);return;
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(403);copyData_FALLBACK(src, dst);
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * Creates a new raster that has a <b>copy</b> of the data in
     * <tt>ras</tt>.  This is highly optimized for speed.  There is
     * no provision for changing any aspect of the SampleModel.
     *
     * This method should be used when you need to change the contents
     * of a Raster that you do not "own" (ie the result of a
     * <tt>getData</tt> call).
     * @param ras The Raster to copy.
     * @return    A writable copy of <tt>ras</tt>
     */
    public static WritableRaster copyRaster(Raster ras) {try{__CLR4_5_27n7nm68iyfqc.R.inc(404);
        __CLR4_5_27n7nm68iyfqc.R.inc(405);return copyRaster(ras, ras.getMinX(), ras.getMinY());
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}


    /**
     * Creates a new raster that has a <b>copy</b> of the data in
     * <tt>ras</tt>.  This is highly optimized for speed.  There is
     * no provision for changing any aspect of the SampleModel.
     * However you can specify a new location for the returned raster.
     *
     * This method should be used when you need to change the contents
     * of a Raster that you do not "own" (ie the result of a
     * <tt>getData</tt> call).
     *
     * @param ras The Raster to copy.
     *
     * @param minX The x location for the upper left corner of the
     *             returned WritableRaster.
     *
     * @param minY The y location for the upper left corner of the
     *             returned WritableRaster.
     *
     * @return    A writable copy of <tt>ras</tt>
     */
    public static WritableRaster copyRaster(Raster ras, int minX, int minY) {try{__CLR4_5_27n7nm68iyfqc.R.inc(406);
        __CLR4_5_27n7nm68iyfqc.R.inc(407);WritableRaster ret = Raster.createWritableRaster(
            ras.getSampleModel(),
             new Point(0, 0));
        __CLR4_5_27n7nm68iyfqc.R.inc(408);ret = ret.createWritableChild(
            ras.getMinX() - ras.getSampleModelTranslateX(),
             ras.getMinY() - ras.getSampleModelTranslateY(),
             ras.getWidth(), ras.getHeight(),
             minX, minY, null);

        // Use System.arraycopy to copy the data between the two...
        __CLR4_5_27n7nm68iyfqc.R.inc(409);DataBuffer srcDB = ras.getDataBuffer();
        __CLR4_5_27n7nm68iyfqc.R.inc(410);DataBuffer retDB = ret.getDataBuffer();
        __CLR4_5_27n7nm68iyfqc.R.inc(411);if ((((srcDB.getDataType() != retDB.getDataType())&&(__CLR4_5_27n7nm68iyfqc.R.iget(412)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(413)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(414);throw new IllegalArgumentException(
                "New DataBuffer doesn't match original");
        }
        }__CLR4_5_27n7nm68iyfqc.R.inc(415);int len   = srcDB.getSize();
        __CLR4_5_27n7nm68iyfqc.R.inc(416);int banks = srcDB.getNumBanks();
        __CLR4_5_27n7nm68iyfqc.R.inc(417);int [] offsets = srcDB.getOffsets();
        __CLR4_5_27n7nm68iyfqc.R.inc(418);for (int b = 0; (((b < banks)&&(__CLR4_5_27n7nm68iyfqc.R.iget(419)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(420)==0&false)); b++) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_27n7nm68iyfqc.R.inc(421);switch (srcDB.getDataType()) {
            case DataBuffer.TYPE_BYTE:if (!__CLB4_5_2_bool0) {__CLR4_5_27n7nm68iyfqc.R.inc(422);__CLB4_5_2_bool0=true;} {
                __CLR4_5_27n7nm68iyfqc.R.inc(423);DataBufferByte srcDBT = (DataBufferByte)srcDB;
                __CLR4_5_27n7nm68iyfqc.R.inc(424);DataBufferByte retDBT = (DataBufferByte)retDB;
                __CLR4_5_27n7nm68iyfqc.R.inc(425);System.arraycopy(srcDBT.getData(b), offsets[b],
                                 retDBT.getData(b), offsets[b], len);
                __CLR4_5_27n7nm68iyfqc.R.inc(426);break;
            }
            case DataBuffer.TYPE_INT:if (!__CLB4_5_2_bool0) {__CLR4_5_27n7nm68iyfqc.R.inc(427);__CLB4_5_2_bool0=true;} {
                __CLR4_5_27n7nm68iyfqc.R.inc(428);DataBufferInt srcDBT = (DataBufferInt)srcDB;
                __CLR4_5_27n7nm68iyfqc.R.inc(429);DataBufferInt retDBT = (DataBufferInt)retDB;
                __CLR4_5_27n7nm68iyfqc.R.inc(430);System.arraycopy(srcDBT.getData(b), offsets[b],
                                 retDBT.getData(b), offsets[b], len);
                __CLR4_5_27n7nm68iyfqc.R.inc(431);break;
            }
            case DataBuffer.TYPE_SHORT:if (!__CLB4_5_2_bool0) {__CLR4_5_27n7nm68iyfqc.R.inc(432);__CLB4_5_2_bool0=true;} {
                __CLR4_5_27n7nm68iyfqc.R.inc(433);DataBufferShort srcDBT = (DataBufferShort)srcDB;
                __CLR4_5_27n7nm68iyfqc.R.inc(434);DataBufferShort retDBT = (DataBufferShort)retDB;
                __CLR4_5_27n7nm68iyfqc.R.inc(435);System.arraycopy(srcDBT.getData(b), offsets[b],
                                 retDBT.getData(b), offsets[b], len);
                __CLR4_5_27n7nm68iyfqc.R.inc(436);break;
            }
            case DataBuffer.TYPE_USHORT:if (!__CLB4_5_2_bool0) {__CLR4_5_27n7nm68iyfqc.R.inc(437);__CLB4_5_2_bool0=true;} {
                __CLR4_5_27n7nm68iyfqc.R.inc(438);DataBufferUShort srcDBT = (DataBufferUShort)srcDB;
                __CLR4_5_27n7nm68iyfqc.R.inc(439);DataBufferUShort retDBT = (DataBufferUShort)retDB;
                __CLR4_5_27n7nm68iyfqc.R.inc(440);System.arraycopy(srcDBT.getData(b), offsets[b],
                                 retDBT.getData(b), offsets[b], len);
                __CLR4_5_27n7nm68iyfqc.R.inc(441);break;
            }
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_27n7nm68iyfqc.R.inc(442);__CLB4_5_2_bool0=true;}
                __CLR4_5_27n7nm68iyfqc.R.inc(443);throw new
                    UnsupportedOperationException("unsupported data type: "
                                                  + srcDB.getDataType());
            }
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(444);return ret;
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * Coerces <tt>ras</tt> to be writable.  The returned Raster continues to
     * reference the DataBuffer from ras, so modifications to the returned
     * WritableRaster will be seen in ras.<p>
     *
     * This method should only be used if you need a WritableRaster due to
     * an interface (such as to construct a BufferedImage), but have no
     * intention of modifying the contents of the returned Raster.  If
     * you have any doubt about other users of the data in <tt>ras</tt>,
     * use copyRaster (above).
     * @param ras The raster to make writable.
     * @return    A Writable version of ras (shares DataBuffer with
     *            <tt>ras</tt>).
     */
    public static WritableRaster makeRasterWritable(Raster ras) {try{__CLR4_5_27n7nm68iyfqc.R.inc(445);
        __CLR4_5_27n7nm68iyfqc.R.inc(446);return makeRasterWritable(ras, ras.getMinX(), ras.getMinY());
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * Coerces <tt>ras</tt> to be writable.  The returned Raster continues to
     * reference the DataBuffer from ras, so modifications to the returned
     * WritableRaster will be seen in ras.<p>
     *
     * You can specify a new location for the returned WritableRaster, this
     * is especially useful for constructing BufferedImages which require
     * the Raster to be at (0,0).
     *
     * This method should only be used if you need a WritableRaster due to
     * an interface (such as to construct a BufferedImage), but have no
     * intention of modifying the contents of the returned Raster.  If
     * you have any doubt about other users of the data in <tt>ras</tt>,
     * use copyRaster (above).
     *
     * @param ras The raster to make writable.
     *
     * @param minX The x location for the upper left corner of the
     *             returned WritableRaster.
     *
     * @param minY The y location for the upper left corner of the
     *             returned WritableRaster.
     *
     * @return A Writable version of <tT>ras</tt> with it's upper left
     *         hand coordinate set to minX, minY (shares it's DataBuffer
     *         with <tt>ras</tt>).
     */
    public static WritableRaster makeRasterWritable(Raster ras,
                                                    int minX, int minY) {try{__CLR4_5_27n7nm68iyfqc.R.inc(447);
        __CLR4_5_27n7nm68iyfqc.R.inc(448);WritableRaster ret = Raster.createWritableRaster(
            ras.getSampleModel(),
             ras.getDataBuffer(),
             new Point(0, 0));
        __CLR4_5_27n7nm68iyfqc.R.inc(449);ret = ret.createWritableChild(
            ras.getMinX() - ras.getSampleModelTranslateX(),
             ras.getMinY() - ras.getSampleModelTranslateY(),
             ras.getWidth(), ras.getHeight(),
             minX, minY, null);
        __CLR4_5_27n7nm68iyfqc.R.inc(450);return ret;
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * Create a new ColorModel with it's alpha premultiplied state matching
     * newAlphaPreMult.
     * @param cm The ColorModel to change the alpha premult state of.
     * @param newAlphaPreMult The new state of alpha premult.
     * @return   A new colorModel that has isAlphaPremultiplied()
     *           equal to newAlphaPreMult.
     */
    public static ColorModel
        coerceColorModel(ColorModel cm, boolean newAlphaPreMult) {try{__CLR4_5_27n7nm68iyfqc.R.inc(451);
        __CLR4_5_27n7nm68iyfqc.R.inc(452);if ((((cm.isAlphaPremultiplied() == newAlphaPreMult)&&(__CLR4_5_27n7nm68iyfqc.R.iget(453)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(454)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(455);return cm;
        }

        // Easiest way to build proper colormodel for new Alpha state...
        // Eventually this should switch on known ColorModel types and
        // only fall back on this hack when the CM type is unknown.
        }__CLR4_5_27n7nm68iyfqc.R.inc(456);WritableRaster wr = cm.createCompatibleWritableRaster(1, 1);
        __CLR4_5_27n7nm68iyfqc.R.inc(457);return cm.coerceData(wr, newAlphaPreMult);
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * Coerces data within a bufferedImage to match newAlphaPreMult,
     * Note that this can not change the colormodel of bi so you
     *
     * @param wr The raster to change the state of.
     * @param cm The colormodel currently associated with data in wr.
     * @param newAlphaPreMult The desired state of alpha Premult for raster.
     * @return A new colormodel that matches newAlphaPreMult.
     */
    public static ColorModel
        coerceData(WritableRaster wr, ColorModel cm, boolean newAlphaPreMult) {try{__CLR4_5_27n7nm68iyfqc.R.inc(458);

        // System.out.println("CoerceData: " + cm.isAlphaPremultiplied() +
        //                    " Out: " + newAlphaPreMult);
        __CLR4_5_27n7nm68iyfqc.R.inc(459);if ((((!cm.hasAlpha())&&(__CLR4_5_27n7nm68iyfqc.R.iget(460)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(461)==0&false))) {{
            // Nothing to do no alpha channel
            __CLR4_5_27n7nm68iyfqc.R.inc(462);return cm;
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(463);if ((((cm.isAlphaPremultiplied() == newAlphaPreMult)&&(__CLR4_5_27n7nm68iyfqc.R.iget(464)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(465)==0&false))) {{
            // nothing to do alpha state matches...
            __CLR4_5_27n7nm68iyfqc.R.inc(466);return cm;
        }

        // System.out.println("CoerceData: " + wr.getSampleModel());

        }__CLR4_5_27n7nm68iyfqc.R.inc(467);if ((((newAlphaPreMult)&&(__CLR4_5_27n7nm68iyfqc.R.iget(468)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(469)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(470);multiplyAlpha(wr);
        } }else {{
            __CLR4_5_27n7nm68iyfqc.R.inc(471);divideAlpha(wr);
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(472);return coerceColorModel(cm, newAlphaPreMult);
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    public static void multiplyAlpha(WritableRaster wr) {try{__CLR4_5_27n7nm68iyfqc.R.inc(473);
        __CLR4_5_27n7nm68iyfqc.R.inc(474);if ((((is_BYTE_COMP_Data(wr.getSampleModel()))&&(__CLR4_5_27n7nm68iyfqc.R.iget(475)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(476)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(477);mult_BYTE_COMP_Data(wr);
        } }else {__CLR4_5_27n7nm68iyfqc.R.inc(478);if ((((is_INT_PACK_Data(wr.getSampleModel(), true))&&(__CLR4_5_27n7nm68iyfqc.R.iget(479)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(480)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(481);mult_INT_PACK_Data(wr);
        } }else {{
            __CLR4_5_27n7nm68iyfqc.R.inc(482);int [] pixel = null;
            __CLR4_5_27n7nm68iyfqc.R.inc(483);int    bands = wr.getNumBands();
            __CLR4_5_27n7nm68iyfqc.R.inc(484);float  norm = 1f / 255f;
            __CLR4_5_27n7nm68iyfqc.R.inc(485);int x0;
            __CLR4_5_27n7nm68iyfqc.R.inc(486);int x1;
            __CLR4_5_27n7nm68iyfqc.R.inc(487);int y0;
            __CLR4_5_27n7nm68iyfqc.R.inc(488);int y1;
            __CLR4_5_27n7nm68iyfqc.R.inc(489);int a;
            __CLR4_5_27n7nm68iyfqc.R.inc(490);int b;
            __CLR4_5_27n7nm68iyfqc.R.inc(491);float alpha;
            __CLR4_5_27n7nm68iyfqc.R.inc(492);x0 = wr.getMinX();
            __CLR4_5_27n7nm68iyfqc.R.inc(493);x1 = x0 + wr.getWidth();
            __CLR4_5_27n7nm68iyfqc.R.inc(494);y0 = wr.getMinY();
            __CLR4_5_27n7nm68iyfqc.R.inc(495);y1 = y0 + wr.getHeight();
            __CLR4_5_27n7nm68iyfqc.R.inc(496);for (int y = y0; (((y < y1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(497)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(498)==0&false)); y++) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(499);for (int x = x0; (((x < x1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(500)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(501)==0&false)); x++) {{
                    __CLR4_5_27n7nm68iyfqc.R.inc(502);pixel = wr.getPixel(x, y, pixel);
                    __CLR4_5_27n7nm68iyfqc.R.inc(503);a = pixel[bands - 1];
                    __CLR4_5_27n7nm68iyfqc.R.inc(504);if (((((a >= 0) && (a < 255))&&(__CLR4_5_27n7nm68iyfqc.R.iget(505)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(506)==0&false))) {{
                        __CLR4_5_27n7nm68iyfqc.R.inc(507);alpha = a * norm;
                        __CLR4_5_27n7nm68iyfqc.R.inc(508);for (b = 0; (((b < bands - 1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(509)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(510)==0&false)); b++) {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(511);pixel[b] = (int)(pixel[b] * alpha + 0.5f);
                        }
                        }__CLR4_5_27n7nm68iyfqc.R.inc(512);wr.setPixel(x, y, pixel);
                    }
                }}
            }}
        }}
    }}}finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    public static void divideAlpha(WritableRaster wr) {try{__CLR4_5_27n7nm68iyfqc.R.inc(513);
        __CLR4_5_27n7nm68iyfqc.R.inc(514);if ((((is_BYTE_COMP_Data(wr.getSampleModel()))&&(__CLR4_5_27n7nm68iyfqc.R.iget(515)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(516)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(517);divide_BYTE_COMP_Data(wr);
        } }else {__CLR4_5_27n7nm68iyfqc.R.inc(518);if ((((is_INT_PACK_Data(wr.getSampleModel(), true))&&(__CLR4_5_27n7nm68iyfqc.R.iget(519)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(520)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(521);divide_INT_PACK_Data(wr);
        } }else {{
            __CLR4_5_27n7nm68iyfqc.R.inc(522);int x0;
            __CLR4_5_27n7nm68iyfqc.R.inc(523);int x1;
            __CLR4_5_27n7nm68iyfqc.R.inc(524);int y0;
            __CLR4_5_27n7nm68iyfqc.R.inc(525);int y1;
            __CLR4_5_27n7nm68iyfqc.R.inc(526);int a;
            __CLR4_5_27n7nm68iyfqc.R.inc(527);int b;
            __CLR4_5_27n7nm68iyfqc.R.inc(528);float ialpha;
            __CLR4_5_27n7nm68iyfqc.R.inc(529);int    bands = wr.getNumBands();
            __CLR4_5_27n7nm68iyfqc.R.inc(530);int [] pixel = null;

            __CLR4_5_27n7nm68iyfqc.R.inc(531);x0 = wr.getMinX();
            __CLR4_5_27n7nm68iyfqc.R.inc(532);x1 = x0 + wr.getWidth();
            __CLR4_5_27n7nm68iyfqc.R.inc(533);y0 = wr.getMinY();
            __CLR4_5_27n7nm68iyfqc.R.inc(534);y1 = y0 + wr.getHeight();
            __CLR4_5_27n7nm68iyfqc.R.inc(535);for (int y = y0; (((y < y1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(536)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(537)==0&false)); y++) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(538);for (int x = x0; (((x < x1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(539)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(540)==0&false)); x++) {{
                    __CLR4_5_27n7nm68iyfqc.R.inc(541);pixel = wr.getPixel(x, y, pixel);
                    __CLR4_5_27n7nm68iyfqc.R.inc(542);a = pixel[bands - 1];
                    __CLR4_5_27n7nm68iyfqc.R.inc(543);if (((((a > 0) && (a < 255))&&(__CLR4_5_27n7nm68iyfqc.R.iget(544)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(545)==0&false))) {{
                        __CLR4_5_27n7nm68iyfqc.R.inc(546);ialpha = 255 / (float)a;
                        __CLR4_5_27n7nm68iyfqc.R.inc(547);for (b = 0; (((b < bands - 1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(548)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(549)==0&false)); b++) {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(550);pixel[b] = (int)(pixel[b] * ialpha + 0.5f);
                        }
                        }__CLR4_5_27n7nm68iyfqc.R.inc(551);wr.setPixel(x, y, pixel);
                    }
                }}
            }}
        }}
    }}}finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    /**
     * Copies data from one bufferedImage to another paying attention
     * to the state of AlphaPreMultiplied.
     *
     * @param src The source
     * @param dst The destination
     */
    public static void
        copyData(BufferedImage src, BufferedImage dst) {try{__CLR4_5_27n7nm68iyfqc.R.inc(552);
        __CLR4_5_27n7nm68iyfqc.R.inc(553);Rectangle srcRect = new Rectangle(0, 0,
                                          src.getWidth(), src.getHeight());
        __CLR4_5_27n7nm68iyfqc.R.inc(554);copyData(src, srcRect, dst, new Point(0, 0));
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}


    /**
     * Copies data from one bufferedImage to another paying attention
     * to the state of AlphaPreMultiplied.
     *
     * @param src The source
     * @param srcRect The Rectangle of source data to be copied
     * @param dst The destination
     * @param destP The Place for the upper left corner of srcRect in dst.
     */
    public static void
        copyData(BufferedImage src, Rectangle srcRect,
                 BufferedImage dst, Point destP) {try{__CLR4_5_27n7nm68iyfqc.R.inc(555);

       /*
        if (srcCS != dstCS)
            throw new IllegalArgumentException
                ("Images must be in the same ColorSpace in order "+
                 "to copy Data between them");
        */
        __CLR4_5_27n7nm68iyfqc.R.inc(556);boolean srcAlpha = src.getColorModel().hasAlpha();
        __CLR4_5_27n7nm68iyfqc.R.inc(557);boolean dstAlpha = dst.getColorModel().hasAlpha();

        // System.out.println("Src has: " + srcAlpha +
        //                    " is: " + src.isAlphaPremultiplied());
        //
        // System.out.println("Dst has: " + dstAlpha +
        //                    " is: " + dst.isAlphaPremultiplied());

        __CLR4_5_27n7nm68iyfqc.R.inc(558);if ((((srcAlpha == dstAlpha)&&(__CLR4_5_27n7nm68iyfqc.R.iget(559)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(560)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(561);if ((((!srcAlpha
                    || src.isAlphaPremultiplied() == dst.isAlphaPremultiplied())&&(__CLR4_5_27n7nm68iyfqc.R.iget(562)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(563)==0&false))) {{
                // They match one another so just copy everything...
                __CLR4_5_27n7nm68iyfqc.R.inc(564);copyData(src.getRaster(), dst.getRaster());
                __CLR4_5_27n7nm68iyfqc.R.inc(565);return;
            }
        }}

        // System.out.println("Using Slow CopyData");

        }__CLR4_5_27n7nm68iyfqc.R.inc(566);int [] pixel = null;
        __CLR4_5_27n7nm68iyfqc.R.inc(567);Raster         srcR  = src.getRaster();
        __CLR4_5_27n7nm68iyfqc.R.inc(568);WritableRaster dstR  = dst.getRaster();
        __CLR4_5_27n7nm68iyfqc.R.inc(569);int            bands = dstR.getNumBands();

        __CLR4_5_27n7nm68iyfqc.R.inc(570);int dx = destP.x - srcRect.x;
        __CLR4_5_27n7nm68iyfqc.R.inc(571);int dy = destP.y - srcRect.y;

        __CLR4_5_27n7nm68iyfqc.R.inc(572);int w  = srcRect.width;
        __CLR4_5_27n7nm68iyfqc.R.inc(573);int x0 = srcRect.x;
        __CLR4_5_27n7nm68iyfqc.R.inc(574);int y0 = srcRect.y;
        __CLR4_5_27n7nm68iyfqc.R.inc(575);int y1 = y0 + srcRect.height - 1;

        __CLR4_5_27n7nm68iyfqc.R.inc(576);if ((((!srcAlpha)&&(__CLR4_5_27n7nm68iyfqc.R.iget(577)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(578)==0&false))) {{
            // Src has no alpha dest does so set alpha to 1.0 everywhere.
            // System.out.println("Add Alpha");
            __CLR4_5_27n7nm68iyfqc.R.inc(579);int [] oPix = new int[bands * w];
            __CLR4_5_27n7nm68iyfqc.R.inc(580);int out = (w * bands) - 1; // The 2 skips alpha channel
            __CLR4_5_27n7nm68iyfqc.R.inc(581);while ((((out >= 0)&&(__CLR4_5_27n7nm68iyfqc.R.iget(582)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(583)==0&false))) {{
                // Fill alpha channel with 255's
                __CLR4_5_27n7nm68iyfqc.R.inc(584);oPix[out] = 255;
                __CLR4_5_27n7nm68iyfqc.R.inc(585);out -= bands;
            }

            }__CLR4_5_27n7nm68iyfqc.R.inc(586);int b;
            __CLR4_5_27n7nm68iyfqc.R.inc(587);int in;
            __CLR4_5_27n7nm68iyfqc.R.inc(588);for (int y = y0; (((y <= y1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(589)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(590)==0&false)); y++) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(591);pixel = srcR.getPixels(x0, y, w, 1, pixel);
                __CLR4_5_27n7nm68iyfqc.R.inc(592);in  = w * (bands - 1) - 1;
                __CLR4_5_27n7nm68iyfqc.R.inc(593);out = (w * bands) - 2; // The 2 skips alpha channel on last pix
                boolean __CLB4_5_2_bool1=false;__CLR4_5_27n7nm68iyfqc.R.inc(594);switch (bands) {
                case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_27n7nm68iyfqc.R.inc(595);__CLB4_5_2_bool1=true;}
                    __CLR4_5_27n7nm68iyfqc.R.inc(596);while ((((in >= 0)&&(__CLR4_5_27n7nm68iyfqc.R.iget(597)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(598)==0&false))) {{
                        __CLR4_5_27n7nm68iyfqc.R.inc(599);oPix[out--] = pixel[in--];
                        __CLR4_5_27n7nm68iyfqc.R.inc(600);oPix[out--] = pixel[in--];
                        __CLR4_5_27n7nm68iyfqc.R.inc(601);oPix[out--] = pixel[in--];
                        __CLR4_5_27n7nm68iyfqc.R.inc(602);out--;
                    }
                    }__CLR4_5_27n7nm68iyfqc.R.inc(603);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_27n7nm68iyfqc.R.inc(604);__CLB4_5_2_bool1=true;}
                    __CLR4_5_27n7nm68iyfqc.R.inc(605);while ((((in >= 0)&&(__CLR4_5_27n7nm68iyfqc.R.iget(606)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(607)==0&false))) {{
                        __CLR4_5_27n7nm68iyfqc.R.inc(608);for (b = 0; (((b < bands - 1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(609)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(610)==0&false)); b++) {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(611);oPix[out--] = pixel[in--];
                        }
                        }__CLR4_5_27n7nm68iyfqc.R.inc(612);out--;
                    }
                }}
                __CLR4_5_27n7nm68iyfqc.R.inc(613);dstR.setPixels(x0 + dx, y + dy, w, 1, oPix);
            }
        }} }else {__CLR4_5_27n7nm68iyfqc.R.inc(614);if ((((dstAlpha && dst.isAlphaPremultiplied())&&(__CLR4_5_27n7nm68iyfqc.R.iget(615)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(616)==0&false))) {{
            // Src and dest have Alpha but we need to multiply it for dst.
            // System.out.println("Mult Case");
            __CLR4_5_27n7nm68iyfqc.R.inc(617);int a;
            __CLR4_5_27n7nm68iyfqc.R.inc(618);int b;
            __CLR4_5_27n7nm68iyfqc.R.inc(619);int alpha;
            __CLR4_5_27n7nm68iyfqc.R.inc(620);int in;
            __CLR4_5_27n7nm68iyfqc.R.inc(621);int fpNorm = (1 << 24) / 255;
            __CLR4_5_27n7nm68iyfqc.R.inc(622);int pt5 = 1 << 23;
            __CLR4_5_27n7nm68iyfqc.R.inc(623);for (int y = y0; (((y <= y1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(624)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(625)==0&false)); y++) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(626);pixel = srcR.getPixels(x0, y, w, 1, pixel);
                __CLR4_5_27n7nm68iyfqc.R.inc(627);in = bands * w - 1;
                boolean __CLB4_5_2_bool2=false;__CLR4_5_27n7nm68iyfqc.R.inc(628);switch (bands) {
                case 4:if (!__CLB4_5_2_bool2) {__CLR4_5_27n7nm68iyfqc.R.inc(629);__CLB4_5_2_bool2=true;}
                    __CLR4_5_27n7nm68iyfqc.R.inc(630);while ((((in >= 0)&&(__CLR4_5_27n7nm68iyfqc.R.iget(631)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(632)==0&false))) {{
                        __CLR4_5_27n7nm68iyfqc.R.inc(633);a = pixel[in];
                        __CLR4_5_27n7nm68iyfqc.R.inc(634);if ((((a == 255)&&(__CLR4_5_27n7nm68iyfqc.R.iget(635)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(636)==0&false))) {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(637);in -= 4;
                        } }else {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(638);in--;
                            __CLR4_5_27n7nm68iyfqc.R.inc(639);alpha = fpNorm * a;
                            __CLR4_5_27n7nm68iyfqc.R.inc(640);pixel[in] = (pixel[in] * alpha + pt5) >>> 24;
                            __CLR4_5_27n7nm68iyfqc.R.inc(641);in--;
                            __CLR4_5_27n7nm68iyfqc.R.inc(642);pixel[in] = (pixel[in] * alpha + pt5) >>> 24;
                            __CLR4_5_27n7nm68iyfqc.R.inc(643);in--;
                            __CLR4_5_27n7nm68iyfqc.R.inc(644);pixel[in] = (pixel[in] * alpha + pt5) >>> 24;
                            __CLR4_5_27n7nm68iyfqc.R.inc(645);in--;
                        }
                    }}
                    }__CLR4_5_27n7nm68iyfqc.R.inc(646);break;
                default:if (!__CLB4_5_2_bool2) {__CLR4_5_27n7nm68iyfqc.R.inc(647);__CLB4_5_2_bool2=true;}
                    __CLR4_5_27n7nm68iyfqc.R.inc(648);while ((((in >= 0)&&(__CLR4_5_27n7nm68iyfqc.R.iget(649)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(650)==0&false))) {{
                        __CLR4_5_27n7nm68iyfqc.R.inc(651);a = pixel[in];
                        __CLR4_5_27n7nm68iyfqc.R.inc(652);if ((((a == 255)&&(__CLR4_5_27n7nm68iyfqc.R.iget(653)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(654)==0&false))) {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(655);in -= bands;
                        } }else {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(656);in--;
                            __CLR4_5_27n7nm68iyfqc.R.inc(657);alpha = fpNorm * a;
                            __CLR4_5_27n7nm68iyfqc.R.inc(658);for (b = 0; (((b < bands - 1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(659)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(660)==0&false)); b++) {{
                                __CLR4_5_27n7nm68iyfqc.R.inc(661);pixel[in] = (pixel[in] * alpha + pt5) >>> 24;
                                __CLR4_5_27n7nm68iyfqc.R.inc(662);in--;
                            }
                        }}
                    }}
                }}
                __CLR4_5_27n7nm68iyfqc.R.inc(663);dstR.setPixels(x0 + dx, y + dy, w, 1, pixel);
            }
        }} }else {__CLR4_5_27n7nm68iyfqc.R.inc(664);if ((((dstAlpha && !dst.isAlphaPremultiplied())&&(__CLR4_5_27n7nm68iyfqc.R.iget(665)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(666)==0&false))) {{
            // Src and dest have Alpha but we need to divide it out for dst.
            // System.out.println("Div Case");
            __CLR4_5_27n7nm68iyfqc.R.inc(667);int a;
            __CLR4_5_27n7nm68iyfqc.R.inc(668);int b;
            __CLR4_5_27n7nm68iyfqc.R.inc(669);int ialpha;
            __CLR4_5_27n7nm68iyfqc.R.inc(670);int in;
            __CLR4_5_27n7nm68iyfqc.R.inc(671);int fpNorm = 0x00FF0000;
            __CLR4_5_27n7nm68iyfqc.R.inc(672);int pt5 = 1 << 15;
            __CLR4_5_27n7nm68iyfqc.R.inc(673);for (int y = y0; (((y <= y1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(674)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(675)==0&false)); y++) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(676);pixel = srcR.getPixels(x0, y, w, 1, pixel);
                __CLR4_5_27n7nm68iyfqc.R.inc(677);in = (bands * w) - 1;
                boolean __CLB4_5_2_bool3=false;__CLR4_5_27n7nm68iyfqc.R.inc(678);switch(bands) {
                case 4:if (!__CLB4_5_2_bool3) {__CLR4_5_27n7nm68iyfqc.R.inc(679);__CLB4_5_2_bool3=true;}
                    __CLR4_5_27n7nm68iyfqc.R.inc(680);while ((((in >= 0)&&(__CLR4_5_27n7nm68iyfqc.R.iget(681)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(682)==0&false))) {{
                        __CLR4_5_27n7nm68iyfqc.R.inc(683);a = pixel[in];
                        __CLR4_5_27n7nm68iyfqc.R.inc(684);if (((((a <= 0) || (a >= 255))&&(__CLR4_5_27n7nm68iyfqc.R.iget(685)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(686)==0&false))) {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(687);in -= 4;
                        } }else {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(688);in--;
                            __CLR4_5_27n7nm68iyfqc.R.inc(689);ialpha = fpNorm / a;
                            __CLR4_5_27n7nm68iyfqc.R.inc(690);pixel[in] = (pixel[in] * ialpha + pt5) >>> 16;
                            __CLR4_5_27n7nm68iyfqc.R.inc(691);in--;
                            __CLR4_5_27n7nm68iyfqc.R.inc(692);pixel[in] = (pixel[in] * ialpha + pt5) >>> 16;
                            __CLR4_5_27n7nm68iyfqc.R.inc(693);in--;
                            __CLR4_5_27n7nm68iyfqc.R.inc(694);pixel[in] = (pixel[in] * ialpha + pt5) >>> 16;
                            __CLR4_5_27n7nm68iyfqc.R.inc(695);in--;
                        }
                    }}
                    }__CLR4_5_27n7nm68iyfqc.R.inc(696);break;
                default:if (!__CLB4_5_2_bool3) {__CLR4_5_27n7nm68iyfqc.R.inc(697);__CLB4_5_2_bool3=true;}
                    __CLR4_5_27n7nm68iyfqc.R.inc(698);while ((((in >= 0)&&(__CLR4_5_27n7nm68iyfqc.R.iget(699)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(700)==0&false))) {{
                        __CLR4_5_27n7nm68iyfqc.R.inc(701);a = pixel[in];
                        __CLR4_5_27n7nm68iyfqc.R.inc(702);if (((((a <= 0) || (a >= 255))&&(__CLR4_5_27n7nm68iyfqc.R.iget(703)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(704)==0&false))) {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(705);in -= bands;
                        } }else {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(706);in--;
                            __CLR4_5_27n7nm68iyfqc.R.inc(707);ialpha = fpNorm / a;
                            __CLR4_5_27n7nm68iyfqc.R.inc(708);for (b = 0; (((b < bands - 1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(709)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(710)==0&false)); b++) {{
                                __CLR4_5_27n7nm68iyfqc.R.inc(711);pixel[in] = (pixel[in] * ialpha + pt5) >>> 16;
                                __CLR4_5_27n7nm68iyfqc.R.inc(712);in--;
                            }
                        }}
                    }}
                }}
                __CLR4_5_27n7nm68iyfqc.R.inc(713);dstR.setPixels(x0 + dx, y + dy, w, 1, pixel);
            }
        }} }else {__CLR4_5_27n7nm68iyfqc.R.inc(714);if ((((src.isAlphaPremultiplied())&&(__CLR4_5_27n7nm68iyfqc.R.iget(715)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(716)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(717);int [] oPix = new int[bands * w];
            // Src has alpha dest does not so unpremult and store...
            // System.out.println("Remove Alpha, Div Case");
            __CLR4_5_27n7nm68iyfqc.R.inc(718);int a;
            __CLR4_5_27n7nm68iyfqc.R.inc(719);int b;
            __CLR4_5_27n7nm68iyfqc.R.inc(720);int ialpha;
            __CLR4_5_27n7nm68iyfqc.R.inc(721);int in;
            __CLR4_5_27n7nm68iyfqc.R.inc(722);int out;
            __CLR4_5_27n7nm68iyfqc.R.inc(723);int fpNorm = 0x00FF0000;
            __CLR4_5_27n7nm68iyfqc.R.inc(724);int pt5 = 1 << 15;
            __CLR4_5_27n7nm68iyfqc.R.inc(725);for (int y = y0; (((y <= y1)&&(__CLR4_5_27n7nm68iyfqc.R.iget(726)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(727)==0&false)); y++) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(728);pixel = srcR.getPixels(x0, y, w, 1, pixel);
                __CLR4_5_27n7nm68iyfqc.R.inc(729);in  = (bands + 1) * w - 1;
                __CLR4_5_27n7nm68iyfqc.R.inc(730);out = (bands * w) - 1;
                __CLR4_5_27n7nm68iyfqc.R.inc(731);while ((((in >= 0)&&(__CLR4_5_27n7nm68iyfqc.R.iget(732)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(733)==0&false))) {{
                    __CLR4_5_27n7nm68iyfqc.R.inc(734);a = pixel[in];
                    __CLR4_5_27n7nm68iyfqc.R.inc(735);in--;
                    __CLR4_5_27n7nm68iyfqc.R.inc(736);if ((((a > 0)&&(__CLR4_5_27n7nm68iyfqc.R.iget(737)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(738)==0&false))) {{
                        __CLR4_5_27n7nm68iyfqc.R.inc(739);if ((((a < 255)&&(__CLR4_5_27n7nm68iyfqc.R.iget(740)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(741)==0&false))) {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(742);ialpha = fpNorm / a;
                            __CLR4_5_27n7nm68iyfqc.R.inc(743);for (b = 0; (((b < bands)&&(__CLR4_5_27n7nm68iyfqc.R.iget(744)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(745)==0&false)); b++) {{
                                __CLR4_5_27n7nm68iyfqc.R.inc(746);oPix[out--] = (pixel[in--] * ialpha + pt5) >>> 16;
                            }
                        }} }else {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(747);for (b = 0; (((b < bands)&&(__CLR4_5_27n7nm68iyfqc.R.iget(748)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(749)==0&false)); b++) {{
                                __CLR4_5_27n7nm68iyfqc.R.inc(750);oPix[out--] = pixel[in--];
                            }
                        }}
                    }} }else {{
                        __CLR4_5_27n7nm68iyfqc.R.inc(751);in -= bands;
                        __CLR4_5_27n7nm68iyfqc.R.inc(752);for (b = 0; (((b < bands)&&(__CLR4_5_27n7nm68iyfqc.R.iget(753)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(754)==0&false)); b++) {{
                            __CLR4_5_27n7nm68iyfqc.R.inc(755);oPix[out--] = 255;
                        }
                    }}
                }}
                }__CLR4_5_27n7nm68iyfqc.R.inc(756);dstR.setPixels(x0 + dx, y + dy, w, 1, oPix);
            }
        }} }else {{
            // Src has unpremult alpha, dest does not have alpha,
            // just copy the color channels over.
            __CLR4_5_27n7nm68iyfqc.R.inc(757);Rectangle dstRect = new Rectangle(destP.x, destP.y,
                                              srcRect.width, srcRect.height);
            __CLR4_5_27n7nm68iyfqc.R.inc(758);for (int b = 0; (((b < bands)&&(__CLR4_5_27n7nm68iyfqc.R.iget(759)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(760)==0&false)); b++) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(761);copyBand(srcR, srcRect, b,
                         dstR, dstRect, b);
            }
        }}
    }}}}}finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    public static void copyBand(Raster         src, int srcBand,
                                WritableRaster dst, int dstBand) {try{__CLR4_5_27n7nm68iyfqc.R.inc(762);

        __CLR4_5_27n7nm68iyfqc.R.inc(763);Rectangle sR   = src.getBounds();
        __CLR4_5_27n7nm68iyfqc.R.inc(764);Rectangle dR   = dst.getBounds();
        __CLR4_5_27n7nm68iyfqc.R.inc(765);Rectangle cpR  = sR.intersection(dR);

        __CLR4_5_27n7nm68iyfqc.R.inc(766);copyBand(src, cpR, srcBand, dst, cpR, dstBand);
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    public static void copyBand(Raster         src, Rectangle sR, int sBand,
                                WritableRaster dst, Rectangle dR, int dBand) {try{__CLR4_5_27n7nm68iyfqc.R.inc(767);
        __CLR4_5_27n7nm68iyfqc.R.inc(768);int dy = dR.y - sR.y;
        __CLR4_5_27n7nm68iyfqc.R.inc(769);int dx = dR.x - sR.x;
        __CLR4_5_27n7nm68iyfqc.R.inc(770);sR = sR.intersection(src.getBounds());
        __CLR4_5_27n7nm68iyfqc.R.inc(771);dR = dR.intersection(dst.getBounds());
        __CLR4_5_27n7nm68iyfqc.R.inc(772);int width;
        __CLR4_5_27n7nm68iyfqc.R.inc(773);int height;
        __CLR4_5_27n7nm68iyfqc.R.inc(774);if ((((dR.width  < sR.width)&&(__CLR4_5_27n7nm68iyfqc.R.iget(775)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(776)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(777);width  = dR.width;
        } }else {{
            __CLR4_5_27n7nm68iyfqc.R.inc(778);width  = sR.width;
        }
        }__CLR4_5_27n7nm68iyfqc.R.inc(779);if ((((dR.height < sR.height)&&(__CLR4_5_27n7nm68iyfqc.R.iget(780)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(781)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(782);height = dR.height;
        } }else {{
            __CLR4_5_27n7nm68iyfqc.R.inc(783);height = sR.height;
        }
        }__CLR4_5_27n7nm68iyfqc.R.inc(784);int x = sR.x + dx;
        __CLR4_5_27n7nm68iyfqc.R.inc(785);int [] samples = null;
        __CLR4_5_27n7nm68iyfqc.R.inc(786);for (int y = sR.y; (((y < sR.y + height)&&(__CLR4_5_27n7nm68iyfqc.R.iget(787)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(788)==0&false)); y++) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(789);samples = src.getSamples(sR.x, y, width, 1, sBand, samples);
            __CLR4_5_27n7nm68iyfqc.R.inc(790);dst.setSamples(x, y + dy, width, 1, dBand, samples);
        }
    }}finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    public static boolean is_INT_PACK_Data(SampleModel sm,
                                           boolean requireAlpha) {try{__CLR4_5_27n7nm68iyfqc.R.inc(791);
        // Check ColorModel is of type DirectColorModel
        __CLR4_5_27n7nm68iyfqc.R.inc(792);if ((((!(sm instanceof SinglePixelPackedSampleModel))&&(__CLR4_5_27n7nm68iyfqc.R.iget(793)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(794)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(795);return false;
        }

        // Check transfer type
        }__CLR4_5_27n7nm68iyfqc.R.inc(796);if ((((sm.getDataType() != DataBuffer.TYPE_INT)&&(__CLR4_5_27n7nm68iyfqc.R.iget(797)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(798)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(799);return false;
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(800);SinglePixelPackedSampleModel sppsm;
        __CLR4_5_27n7nm68iyfqc.R.inc(801);sppsm = (SinglePixelPackedSampleModel)sm;

        __CLR4_5_27n7nm68iyfqc.R.inc(802);int [] masks = sppsm.getBitMasks();
        __CLR4_5_27n7nm68iyfqc.R.inc(803);if ((((masks.length == 3)&&(__CLR4_5_27n7nm68iyfqc.R.iget(804)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(805)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(806);if ((((requireAlpha)&&(__CLR4_5_27n7nm68iyfqc.R.iget(807)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(808)==0&false))) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(809);return false;
            }
        }} }else {__CLR4_5_27n7nm68iyfqc.R.inc(810);if ((((masks.length != 4)&&(__CLR4_5_27n7nm68iyfqc.R.iget(811)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(812)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(813);return false;
        }

        }}__CLR4_5_27n7nm68iyfqc.R.inc(814);if ((((masks[0] != 0x00ff0000)&&(__CLR4_5_27n7nm68iyfqc.R.iget(815)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(816)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(817);return false;
        }
        }__CLR4_5_27n7nm68iyfqc.R.inc(818);if ((((masks[1] != 0x0000ff00)&&(__CLR4_5_27n7nm68iyfqc.R.iget(819)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(820)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(821);return false;
        }
        }__CLR4_5_27n7nm68iyfqc.R.inc(822);if ((((masks[2] != 0x000000ff)&&(__CLR4_5_27n7nm68iyfqc.R.iget(823)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(824)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(825);return false;
        }
        }__CLR4_5_27n7nm68iyfqc.R.inc(826);if (((((masks.length == 4)
            && (masks[3] != 0xff000000))&&(__CLR4_5_27n7nm68iyfqc.R.iget(827)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(828)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(829);return false;
        }

        }__CLR4_5_27n7nm68iyfqc.R.inc(830);return true;
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

        public static boolean is_BYTE_COMP_Data(SampleModel sm) {try{__CLR4_5_27n7nm68iyfqc.R.inc(831);
            // Check ColorModel is of type DirectColorModel
            __CLR4_5_27n7nm68iyfqc.R.inc(832);if ((((!(sm instanceof ComponentSampleModel))&&(__CLR4_5_27n7nm68iyfqc.R.iget(833)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(834)==0&false))) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(835);return false;
            }

            // Check transfer type
            }__CLR4_5_27n7nm68iyfqc.R.inc(836);if ((((sm.getDataType() != DataBuffer.TYPE_BYTE)&&(__CLR4_5_27n7nm68iyfqc.R.iget(837)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(838)==0&false))) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(839);return false;
            }

            }__CLR4_5_27n7nm68iyfqc.R.inc(840);return true;
        }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    protected static void divide_INT_PACK_Data(WritableRaster wr) {try{__CLR4_5_27n7nm68iyfqc.R.inc(841);
        // System.out.println("Divide Int");

        __CLR4_5_27n7nm68iyfqc.R.inc(842);SinglePixelPackedSampleModel sppsm;
        __CLR4_5_27n7nm68iyfqc.R.inc(843);sppsm = (SinglePixelPackedSampleModel)wr.getSampleModel();

        __CLR4_5_27n7nm68iyfqc.R.inc(844);final int width = wr.getWidth();

        __CLR4_5_27n7nm68iyfqc.R.inc(845);final int scanStride = sppsm.getScanlineStride();
        __CLR4_5_27n7nm68iyfqc.R.inc(846);DataBufferInt db = (DataBufferInt)wr.getDataBuffer();
        __CLR4_5_27n7nm68iyfqc.R.inc(847);final int base
            = (db.getOffset()
               + sppsm.getOffset(wr.getMinX() - wr.getSampleModelTranslateX(),
                               wr.getMinY() - wr.getSampleModelTranslateY()));

        // Access the pixel data array
        __CLR4_5_27n7nm68iyfqc.R.inc(848);final int[] pixels = db.getBankData()[0];
        __CLR4_5_27n7nm68iyfqc.R.inc(849);for (int y = 0; (((y < wr.getHeight())&&(__CLR4_5_27n7nm68iyfqc.R.iget(850)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(851)==0&false)); y++) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(852);int sp = base + y * scanStride;
            __CLR4_5_27n7nm68iyfqc.R.inc(853);final int end = sp + width;
            __CLR4_5_27n7nm68iyfqc.R.inc(854);while ((((sp < end)&&(__CLR4_5_27n7nm68iyfqc.R.iget(855)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(856)==0&false))) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(857);int pixel = pixels[sp];
                __CLR4_5_27n7nm68iyfqc.R.inc(858);int a = pixel >>> 24;
                __CLR4_5_27n7nm68iyfqc.R.inc(859);if ((((a <= 0)&&(__CLR4_5_27n7nm68iyfqc.R.iget(860)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(861)==0&false))) {{
                    __CLR4_5_27n7nm68iyfqc.R.inc(862);pixels[sp] = 0x00FFFFFF;
                } }else {__CLR4_5_27n7nm68iyfqc.R.inc(863);if ((((a < 255)&&(__CLR4_5_27n7nm68iyfqc.R.iget(864)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(865)==0&false))) {{
                    __CLR4_5_27n7nm68iyfqc.R.inc(866);int aFP = (0x00FF0000 / a);
                    __CLR4_5_27n7nm68iyfqc.R.inc(867);pixels[sp] =
                        ((a << 24)
                         | (((((pixel & 0xFF0000) >> 16) * aFP) & 0xFF0000))
                         | (((((pixel & 0x00FF00) >> 8) * aFP) & 0xFF0000) >> 8)
                         | (((((pixel & 0x0000FF))    * aFP) & 0xFF0000) >> 16));
                }
                }}__CLR4_5_27n7nm68iyfqc.R.inc(868);sp++;
            }
        }}
    }}finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    protected static void mult_INT_PACK_Data(WritableRaster wr) {try{__CLR4_5_27n7nm68iyfqc.R.inc(869);
        // System.out.println("Multiply Int: " + wr);

        __CLR4_5_27n7nm68iyfqc.R.inc(870);SinglePixelPackedSampleModel sppsm;
        __CLR4_5_27n7nm68iyfqc.R.inc(871);sppsm = (SinglePixelPackedSampleModel)wr.getSampleModel();

        __CLR4_5_27n7nm68iyfqc.R.inc(872);final int width = wr.getWidth();

        __CLR4_5_27n7nm68iyfqc.R.inc(873);final int scanStride = sppsm.getScanlineStride();
        __CLR4_5_27n7nm68iyfqc.R.inc(874);DataBufferInt db = (DataBufferInt)wr.getDataBuffer();
        __CLR4_5_27n7nm68iyfqc.R.inc(875);final int base
            = (db.getOffset()
               + sppsm.getOffset(wr.getMinX() - wr.getSampleModelTranslateX(),
                               wr.getMinY() - wr.getSampleModelTranslateY()));
        // Access the pixel data array
        __CLR4_5_27n7nm68iyfqc.R.inc(876);final int[] pixels = db.getBankData()[0];
        __CLR4_5_27n7nm68iyfqc.R.inc(877);for (int y = 0; (((y < wr.getHeight())&&(__CLR4_5_27n7nm68iyfqc.R.iget(878)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(879)==0&false)); y++) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(880);int sp = base + y * scanStride;
            __CLR4_5_27n7nm68iyfqc.R.inc(881);final int end = sp + width;
            __CLR4_5_27n7nm68iyfqc.R.inc(882);while ((((sp < end)&&(__CLR4_5_27n7nm68iyfqc.R.iget(883)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(884)==0&false))) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(885);int pixel = pixels[sp];
                __CLR4_5_27n7nm68iyfqc.R.inc(886);int a = pixel >>> 24;
                __CLR4_5_27n7nm68iyfqc.R.inc(887);if (((((a >= 0) && (a < 255))&&(__CLR4_5_27n7nm68iyfqc.R.iget(888)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(889)==0&false))) {{   // this does NOT include a == 255 (0xff) !
                    __CLR4_5_27n7nm68iyfqc.R.inc(890);pixels[sp] = ((a << 24)
                                  | ((((pixel & 0xFF0000) * a) >> 8) & 0xFF0000)
                                  | ((((pixel & 0x00FF00) * a) >> 8) & 0x00FF00)
                                  | ((((pixel & 0x0000FF) * a) >> 8) & 0x0000FF));
                }
                }__CLR4_5_27n7nm68iyfqc.R.inc(891);sp++;
            }
        }}
    }}finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}


    protected static void divide_BYTE_COMP_Data(WritableRaster wr) {try{__CLR4_5_27n7nm68iyfqc.R.inc(892);
        // System.out.println("Multiply Int: " + wr);

        __CLR4_5_27n7nm68iyfqc.R.inc(893);ComponentSampleModel csm;
        __CLR4_5_27n7nm68iyfqc.R.inc(894);csm = (ComponentSampleModel)wr.getSampleModel();

        __CLR4_5_27n7nm68iyfqc.R.inc(895);final int width = wr.getWidth();

        __CLR4_5_27n7nm68iyfqc.R.inc(896);final int scanStride = csm.getScanlineStride();
        __CLR4_5_27n7nm68iyfqc.R.inc(897);final int pixStride  = csm.getPixelStride();
        __CLR4_5_27n7nm68iyfqc.R.inc(898);final int [] bandOff = csm.getBandOffsets();

        __CLR4_5_27n7nm68iyfqc.R.inc(899);DataBufferByte db = (DataBufferByte)wr.getDataBuffer();
        __CLR4_5_27n7nm68iyfqc.R.inc(900);final int base
            = (db.getOffset()
               + csm.getOffset(wr.getMinX() - wr.getSampleModelTranslateX(),
                             wr.getMinY() - wr.getSampleModelTranslateY()));

        __CLR4_5_27n7nm68iyfqc.R.inc(901);int aOff = bandOff[bandOff.length - 1];
        __CLR4_5_27n7nm68iyfqc.R.inc(902);int bands = bandOff.length - 1;

        // Access the pixel data array
        __CLR4_5_27n7nm68iyfqc.R.inc(903);final byte[] pixels = db.getBankData()[0];
        __CLR4_5_27n7nm68iyfqc.R.inc(904);for (int y = 0; (((y < wr.getHeight())&&(__CLR4_5_27n7nm68iyfqc.R.iget(905)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(906)==0&false)); y++) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(907);int sp = base + y * scanStride;
            __CLR4_5_27n7nm68iyfqc.R.inc(908);final int end = sp + width * pixStride;
            __CLR4_5_27n7nm68iyfqc.R.inc(909);while ((((sp < end)&&(__CLR4_5_27n7nm68iyfqc.R.iget(910)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(911)==0&false))) {{
              __CLR4_5_27n7nm68iyfqc.R.inc(912);int a = pixels[sp + aOff] & 0xFF;
              __CLR4_5_27n7nm68iyfqc.R.inc(913);if ((((a == 0)&&(__CLR4_5_27n7nm68iyfqc.R.iget(914)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(915)==0&false))) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(916);for (int b = 0; (((b < bands)&&(__CLR4_5_27n7nm68iyfqc.R.iget(917)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(918)==0&false)); b++) {{
                  __CLR4_5_27n7nm68iyfqc.R.inc(919);pixels[sp + bandOff[b]] = (byte)0xFF;
                }
              }} }else {__CLR4_5_27n7nm68iyfqc.R.inc(920);if ((((a < 255)&&(__CLR4_5_27n7nm68iyfqc.R.iget(921)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(922)==0&false))) {{         // this does NOT include a == 255 (0xff) !
                __CLR4_5_27n7nm68iyfqc.R.inc(923);int aFP = (0x00FF0000 / a);
                __CLR4_5_27n7nm68iyfqc.R.inc(924);for (int b = 0; (((b < bands)&&(__CLR4_5_27n7nm68iyfqc.R.iget(925)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(926)==0&false)); b++) {{
                  __CLR4_5_27n7nm68iyfqc.R.inc(927);int i = sp + bandOff[b];
                  __CLR4_5_27n7nm68iyfqc.R.inc(928);pixels[i] = (byte)(((pixels[i] & 0xFF) * aFP) >>> 16);
                }
              }}
              }}__CLR4_5_27n7nm68iyfqc.R.inc(929);sp += pixStride;
            }
        }}
    }}finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

    protected static void mult_BYTE_COMP_Data(WritableRaster wr) {try{__CLR4_5_27n7nm68iyfqc.R.inc(930);
        // System.out.println("Multiply Int: " + wr);

        __CLR4_5_27n7nm68iyfqc.R.inc(931);ComponentSampleModel csm;
        __CLR4_5_27n7nm68iyfqc.R.inc(932);csm = (ComponentSampleModel)wr.getSampleModel();

        __CLR4_5_27n7nm68iyfqc.R.inc(933);final int width = wr.getWidth();

        __CLR4_5_27n7nm68iyfqc.R.inc(934);final int scanStride = csm.getScanlineStride();
        __CLR4_5_27n7nm68iyfqc.R.inc(935);final int pixStride  = csm.getPixelStride();
        __CLR4_5_27n7nm68iyfqc.R.inc(936);final int [] bandOff = csm.getBandOffsets();

        __CLR4_5_27n7nm68iyfqc.R.inc(937);DataBufferByte db = (DataBufferByte)wr.getDataBuffer();
        __CLR4_5_27n7nm68iyfqc.R.inc(938);final int base
            = (db.getOffset()
               + csm.getOffset(wr.getMinX() - wr.getSampleModelTranslateX(),
                             wr.getMinY() - wr.getSampleModelTranslateY()));


        __CLR4_5_27n7nm68iyfqc.R.inc(939);int aOff = bandOff[bandOff.length - 1];
        __CLR4_5_27n7nm68iyfqc.R.inc(940);int bands = bandOff.length - 1;

        // Access the pixel data array
        __CLR4_5_27n7nm68iyfqc.R.inc(941);final byte[] pixels = db.getBankData()[0];
        __CLR4_5_27n7nm68iyfqc.R.inc(942);for (int y = 0; (((y < wr.getHeight())&&(__CLR4_5_27n7nm68iyfqc.R.iget(943)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(944)==0&false)); y++) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(945);int sp = base + y * scanStride;
            __CLR4_5_27n7nm68iyfqc.R.inc(946);final int end = sp + width * pixStride;
            __CLR4_5_27n7nm68iyfqc.R.inc(947);while ((((sp < end)&&(__CLR4_5_27n7nm68iyfqc.R.iget(948)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(949)==0&false))) {{
              __CLR4_5_27n7nm68iyfqc.R.inc(950);int a = pixels[sp + aOff] & 0xFF;
              __CLR4_5_27n7nm68iyfqc.R.inc(951);if ((((a != 0xFF)&&(__CLR4_5_27n7nm68iyfqc.R.iget(952)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(953)==0&false))) {{
                __CLR4_5_27n7nm68iyfqc.R.inc(954);for (int b = 0; (((b < bands)&&(__CLR4_5_27n7nm68iyfqc.R.iget(955)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(956)==0&false)); b++) {{
                  __CLR4_5_27n7nm68iyfqc.R.inc(957);int i = sp + bandOff[b];
                  __CLR4_5_27n7nm68iyfqc.R.inc(958);pixels[i] = (byte)(((pixels[i] & 0xFF) * a) >> 8);
                }
              }}
              }__CLR4_5_27n7nm68iyfqc.R.inc(959);sp += pixStride;
            }
        }}
    }}finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}

/*
  This is skanky debugging code that might be useful in the future:

            if (count == 33) {
                String label = "sub [" + x + ", " + y + "]: ";
                org.ImageDisplay.showImage
                    (label, subBI);
                org.ImageDisplay.printImage
                    (label, subBI,
                     new Rectangle(75-iR.x, 90-iR.y, 32, 32));

            }


            // if ((count++ % 50) == 10)
            //     org.ImageDisplay.showImage("foo: ", subBI);


            Graphics2D realG2D = g2d;
            while (realG2D instanceof sun.java2d.ProxyGraphics2D) {
                realG2D = ((sun.java2d.ProxyGraphics2D)realG2D).getDelegate();
            }
            if (realG2D instanceof sun.awt.image.BufferedImageGraphics2D) {
                count++;
                if (count == 34) {
                    RenderedImage ri;
                    ri = ((sun.awt.image.BufferedImageGraphics2D)realG2D).bufImg;
                    // g2d.setComposite(SVGComposite.OVER);
                    // org.ImageDisplay.showImage("Bar: " + count, cr);
                    org.ImageDisplay.printImage("Bar: " + count, cr,
                                                new Rectangle(75, 90, 32, 32));

                    org.ImageDisplay.showImage ("Foo: " + count, ri);
                    org.ImageDisplay.printImage("Foo: " + count, ri,
                                                new Rectangle(75, 90, 32, 32));

                    System.out.println("BI: "   + ri);
                    System.out.println("BISM: " + ri.getSampleModel());
                    System.out.println("BICM: " + ri.getColorModel());
                    System.out.println("BICM class: " + ri.getColorModel().getClass());
                    System.out.println("BICS: " + ri.getColorModel().getColorSpace());
                    System.out.println
                        ("sRGB CS: " +
                         ColorSpace.getInstance(ColorSpace.CS_sRGB));
                    System.out.println("G2D info");
                    System.out.println("\tComposite: " + g2d.getComposite());
                    System.out.println("\tTransform" + g2d.getTransform());
                    java.awt.RenderingHints rh = g2d.getRenderingHints();
                    java.util.Set keys = rh.keySet();
                    java.util.Iterator iter = keys.iterator();
                    while (iter.hasNext()) {
                        Object o = iter.next();

                        System.out.println("\t" + o.toString() + " -> " +
                                           rh.get(o).toString());
                    }

                    ri = cr;
                    System.out.println("RI: "   + ri);
                    System.out.println("RISM: " + ri.getSampleModel());
                    System.out.println("RICM: " + ri.getColorModel());
                    System.out.println("RICM class: " + ri.getColorModel().getClass());
                    System.out.println("RICS: " + ri.getColorModel().getColorSpace());
                }
            }
*/

    /**
     * Extracts an alpha raster from a RenderedImage. The method tries to avoid copying data
     * unnecessarily by checking if the RenderedImage is a BufferedImage which offers suitable
     * direct methods.
     * @param image the image
     * @return the alpha raster
     */
    public static Raster getAlphaRaster(RenderedImage image) {try{__CLR4_5_27n7nm68iyfqc.R.inc(960);
        __CLR4_5_27n7nm68iyfqc.R.inc(961);ColorModel cm = image.getColorModel();
        __CLR4_5_27n7nm68iyfqc.R.inc(962);if ((((!cm.hasAlpha() || cm.getTransparency() != ColorModel.TRANSLUCENT)&&(__CLR4_5_27n7nm68iyfqc.R.iget(963)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(964)==0&false))) {{
            __CLR4_5_27n7nm68iyfqc.R.inc(965);throw new IllegalStateException("Image doesn't have an alpha channel");
        }
        }__CLR4_5_27n7nm68iyfqc.R.inc(966);Raster alpha;
        __CLR4_5_27n7nm68iyfqc.R.inc(967);if ((((image instanceof BufferedImage)&&(__CLR4_5_27n7nm68iyfqc.R.iget(968)!=0|true))||(__CLR4_5_27n7nm68iyfqc.R.iget(969)==0&false))) {{
            //Optimization possible with BufferedImage (No copying)
            __CLR4_5_27n7nm68iyfqc.R.inc(970);alpha = ((BufferedImage)image).getAlphaRaster();
        } }else {{
            __CLR4_5_27n7nm68iyfqc.R.inc(971);WritableRaster wraster = GraphicsUtil.makeRasterWritable(image.getData());
            __CLR4_5_27n7nm68iyfqc.R.inc(972);alpha = image.getColorModel().getAlphaRaster(wraster);
        }
        }__CLR4_5_27n7nm68iyfqc.R.inc(973);return alpha;
    }finally{__CLR4_5_27n7nm68iyfqc.R.flushNeeded();}}


}
