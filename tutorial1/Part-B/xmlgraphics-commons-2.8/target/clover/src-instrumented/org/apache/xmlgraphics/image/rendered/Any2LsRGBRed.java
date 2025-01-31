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

/* $Id: Any2LsRGBRed.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.rendered;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.color.ColorSpace;
import java.awt.image.BandCombineOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.SinglePixelPackedSampleModel;
import java.awt.image.WritableRaster;

import org.apache.xmlgraphics.image.GraphicsUtil;

// CSOFF: ConstantName
// CSOFF: NeedBraces
// CSOFF: WhitespaceAfter
// CSOFF: WhitespaceAround

/**
 * This function will tranform an image from any colorspace into a
 * luminance image.  The alpha channel if any will be copied to the
 * new image.
 *
 * @version $Id: Any2LsRGBRed.java 1732018 2016-02-24 04:51:06Z gadams $
 *
 * Originally authored by Thomas DeWeese.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Any2LsRGBRed extends AbstractRed {public static class __CLR4_5_2a4ya4ym6lb50kc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,13288,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    boolean srcIssRGB;

    /**
     * Construct a luminace image from src.
     *
     * @param src The image to convert to a luminance image
     */
    public Any2LsRGBRed(CachableRed src) {
        super(src, src.getBounds(),
              fixColorModel(src),
              fixSampleModel(src),
              src.getTileGridXOffset(),
              src.getTileGridYOffset(),
              null);__CLR4_5_2a4ya4ym6lb50kc.R.inc(13139);try{__CLR4_5_2a4ya4ym6lb50kc.R.inc(13138);

        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13140);ColorModel srcCM = src.getColorModel();
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13141);if ((((srcCM == null)&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13142)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13143)==0&false))) {{
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13144);return;
        }
        }__CLR4_5_2a4ya4ym6lb50kc.R.inc(13145);ColorSpace srcCS = srcCM.getColorSpace();
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13146);if ((((srcCS == ColorSpace.getInstance(ColorSpace.CS_sRGB))&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13147)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13148)==0&false))) {{
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13149);srcIssRGB = true;
        }
    }}finally{__CLR4_5_2a4ya4ym6lb50kc.R.flushNeeded();}}

    /**
     * Gamma for linear to sRGB convertion
     */
    private static final double GAMMA = 2.4;
    private static final double LFACT = 1.0 / 12.92;


    public static final double sRGBToLsRGB(double value) {try{__CLR4_5_2a4ya4ym6lb50kc.R.inc(13150);
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13151);if ((((value <= 0.003928)&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13152)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13153)==0&false))) {{
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13154);return value * LFACT;
        }
        }__CLR4_5_2a4ya4ym6lb50kc.R.inc(13155);return Math.pow((value + 0.055) / 1.055, GAMMA);
    }finally{__CLR4_5_2a4ya4ym6lb50kc.R.flushNeeded();}}

    /**
     * Lookup tables for RGB lookups. The linearToSRGBLut is used
     * when noise values are considered to be on a linearScale. The
     * linearToLinear table is used when the values are considered to
     * be on the sRGB scale to begin with.
     */
    private static final int[] sRGBToLsRGBLut = new int[256];
    static {try{__CLR4_5_2a4ya4ym6lb50kc.R.inc(13156);
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13157);final double scale = 1.0 / 255;

        // System.out.print("S2L: ");
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13158);for (int i = 0; (((i < 256)&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13159)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13160)==0&false)); i++) {{
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13161);double value = sRGBToLsRGB(i * scale);
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13162);sRGBToLsRGBLut[i] = (int)Math.round(value * 255.0);
            // System.out.print(sRGBToLsRGBLut[i] + ",");
        }
        // System.out.println("");
    }}finally{__CLR4_5_2a4ya4ym6lb50kc.R.flushNeeded();}}

    public WritableRaster copyData(WritableRaster wr) {try{__CLR4_5_2a4ya4ym6lb50kc.R.inc(13163);
        // Get my source.
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13164);CachableRed src   = (CachableRed)getSources().get(0);
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13165);ColorModel  srcCM = src.getColorModel();
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13166);SampleModel srcSM = src.getSampleModel();

        // Fast case, SRGB source, INT Pack writable raster...
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13167);if ((((srcIssRGB
            && Any2sRGBRed.is_INT_PACK_COMP(wr.getSampleModel()))&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13168)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13169)==0&false))) {{
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13170);src.copyData(wr);
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13171);if ((((srcCM.hasAlpha())&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13172)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13173)==0&false))) {{
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13174);GraphicsUtil.coerceData(wr, srcCM, false);
            }
            }__CLR4_5_2a4ya4ym6lb50kc.R.inc(13175);Any2sRGBRed.applyLut_INT(wr, sRGBToLsRGBLut);
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13176);return wr;
        }

        }__CLR4_5_2a4ya4ym6lb50kc.R.inc(13177);if ((((srcCM == null)&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13178)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13179)==0&false))) {{
            // We don't really know much about this source, let's
            // guess based on the number of bands...

            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13180);float [][] matrix = null;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2a4ya4ym6lb50kc.R.inc(13181);switch (srcSM.getNumBands()) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2a4ya4ym6lb50kc.R.inc(13182);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13183);matrix = new float[1][3];
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13184);matrix[0][0] = 1; // Red
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13185);matrix[0][1] = 1; // Grn
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13186);matrix[0][2] = 1; // Blu
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13187);break;
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2a4ya4ym6lb50kc.R.inc(13188);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13189);matrix = new float[2][4];
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13190);matrix[0][0] = 1; // Red
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13191);matrix[0][1] = 1; // Grn
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13192);matrix[0][2] = 1; // Blu
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13193);matrix[1][3] = 1; // Alpha
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13194);break;
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2a4ya4ym6lb50kc.R.inc(13195);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13196);matrix = new float[3][3];
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13197);matrix[0][0] = 1; // Red
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13198);matrix[1][1] = 1; // Grn
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13199);matrix[2][2] = 1; // Blu
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13200);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2a4ya4ym6lb50kc.R.inc(13201);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13202);matrix = new float[srcSM.getNumBands()][4];
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13203);matrix[0][0] = 1; // Red
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13204);matrix[1][1] = 1; // Grn
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13205);matrix[2][2] = 1; // Blu
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13206);matrix[3][3] = 1; // Alpha
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13207);break;
            }

            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13208);Raster srcRas = src.getData(wr.getBounds());
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13209);BandCombineOp op = new BandCombineOp(matrix, null);
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13210);op.filter(srcRas, wr);
        } }else {{
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13211);ColorModel dstCM = getColorModel();
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13212);BufferedImage dstBI;

            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13213);if ((((!dstCM.hasAlpha())&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13214)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13215)==0&false))) {{
                // No alpha ao we don't have to work around the bug
                // in the color convert op.
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13216);dstBI = new BufferedImage(
                    dstCM, wr.createWritableTranslatedChild(0, 0),
                     dstCM.isAlphaPremultiplied(), null);
            } }else {{
                // All this nonsense is to work around the fact that
                // the Color convert op doesn't properly copy the
                // Alpha from src to dst.
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13217);SinglePixelPackedSampleModel dstSM;
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13218);dstSM = (SinglePixelPackedSampleModel)wr.getSampleModel();
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13219);int [] masks = dstSM.getBitMasks();
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13220);SampleModel dstSMNoA = new SinglePixelPackedSampleModel(
                    dstSM.getDataType(), dstSM.getWidth(), dstSM.getHeight(),
                     dstSM.getScanlineStride(),
                     new int[] {masks[0], masks[1], masks[2]});
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13221);ColorModel dstCMNoA = GraphicsUtil.Linear_sRGB;

                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13222);WritableRaster dstWr;
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13223);dstWr = Raster.createWritableRaster(dstSMNoA,
                                                    wr.getDataBuffer(),
                                                    new Point(0, 0));
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13224);dstWr = dstWr.createWritableChild(
                    wr.getMinX() - wr.getSampleModelTranslateX(),
                     wr.getMinY() - wr.getSampleModelTranslateY(),
                     wr.getWidth(), wr.getHeight(),
                     0, 0, null);

                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13225);dstBI = new BufferedImage(dstCMNoA, dstWr, false, null);
            }

            // Divide out alpha if we have it.  We need to do this since
            // the color convert may not be a linear operation which may
            // lead to out of range values.
            }__CLR4_5_2a4ya4ym6lb50kc.R.inc(13226);ColorModel srcBICM = srcCM;
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13227);WritableRaster srcWr;
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13228);if ((((srcCM.hasAlpha() && srcCM.isAlphaPremultiplied())&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13229)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13230)==0&false))) {{
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13231);Rectangle wrR = wr.getBounds();
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13232);SampleModel sm = srcCM.createCompatibleSampleModel(
                    wrR.width, wrR.height);

                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13233);srcWr = Raster.createWritableRaster(
                    sm, new Point(wrR.x, wrR.y));
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13234);src.copyData(srcWr);
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13235);srcBICM = GraphicsUtil.coerceData(srcWr, srcCM, false);
            } }else {{
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13236);Raster srcRas = src.getData(wr.getBounds());
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13237);srcWr = GraphicsUtil.makeRasterWritable(srcRas);
            }

            }__CLR4_5_2a4ya4ym6lb50kc.R.inc(13238);BufferedImage srcBI;
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13239);srcBI = new BufferedImage(srcBICM,
                                      srcWr.createWritableTranslatedChild(0, 0),
                                      false,
                                      null);

            /*
             * System.out.println("src: " + srcBI.getWidth() + "x" +
             *                    srcBI.getHeight());
             * System.out.println("dst: " + dstBI.getWidth() + "x" +
             *                    dstBI.getHeight());
             */

            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13240);ColorConvertOp op = new ColorConvertOp(null);
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13241);op.filter(srcBI, dstBI);

            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13242);if ((((dstCM.hasAlpha())&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13243)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13244)==0&false))) {{
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13245);copyBand(srcWr, srcSM.getNumBands() - 1,
                         wr,    getSampleModel().getNumBands() - 1);
            }
        }}
        }__CLR4_5_2a4ya4ym6lb50kc.R.inc(13246);return wr;
    }finally{__CLR4_5_2a4ya4ym6lb50kc.R.flushNeeded();}}

        /**
         * This function 'fixes' the source's color model.  Right now
         * it just selects if it should have one or two bands based on
         * if the source had an alpha channel.
         */
    protected static ColorModel fixColorModel(CachableRed src) {try{__CLR4_5_2a4ya4ym6lb50kc.R.inc(13247);
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13248);ColorModel  cm = src.getColorModel();
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13249);if ((((cm != null)&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13250)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13251)==0&false))) {{
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13252);if ((((cm.hasAlpha())&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13253)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13254)==0&false))) {{
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13255);return GraphicsUtil.Linear_sRGB_Unpre;
            }

            }__CLR4_5_2a4ya4ym6lb50kc.R.inc(13256);return GraphicsUtil.Linear_sRGB;
        } }else {{
            // No ColorModel so try to make some intelligent
            // decisions based just on the number of bands...
            // 1 bands -> replicated into RGB
            // 2 bands -> Band 0 replicated into RGB & Band 1 -> alpha premult
            // 3 bands -> sRGB (not-linear?)
            // 4 bands -> sRGB premult (not-linear?)
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13257);SampleModel sm = src.getSampleModel();

            boolean __CLB4_5_2_bool1=false;__CLR4_5_2a4ya4ym6lb50kc.R.inc(13258);switch (sm.getNumBands()) {
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2a4ya4ym6lb50kc.R.inc(13259);__CLB4_5_2_bool1=true;}
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13260);return GraphicsUtil.Linear_sRGB;
            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_2a4ya4ym6lb50kc.R.inc(13261);__CLB4_5_2_bool1=true;}
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13262);return GraphicsUtil.Linear_sRGB_Unpre;
            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_2a4ya4ym6lb50kc.R.inc(13263);__CLB4_5_2_bool1=true;}
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13264);return GraphicsUtil.Linear_sRGB;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2a4ya4ym6lb50kc.R.inc(13265);__CLB4_5_2_bool1=true;}
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13266);return GraphicsUtil.Linear_sRGB_Unpre;
            }
        }
    }}finally{__CLR4_5_2a4ya4ym6lb50kc.R.flushNeeded();}}

    /**
     * This function 'fixes' the source's sample model.
     * Right now it just selects if it should have 3 or 4 bands
     * based on if the source had an alpha channel.
     */
    protected static SampleModel fixSampleModel(CachableRed src) {try{__CLR4_5_2a4ya4ym6lb50kc.R.inc(13267);
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13268);SampleModel sm = src.getSampleModel();
        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13269);ColorModel  cm = src.getColorModel();

        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13270);boolean alpha = false;

        __CLR4_5_2a4ya4ym6lb50kc.R.inc(13271);if ((((cm != null)&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13272)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13273)==0&false))) {{
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13274);alpha = cm.hasAlpha();
        } }else {{
            boolean __CLB4_5_2_bool2=false;__CLR4_5_2a4ya4ym6lb50kc.R.inc(13275);switch (sm.getNumBands()) {
            case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_2a4ya4ym6lb50kc.R.inc(13276);__CLB4_5_2_bool2=true;} case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_2a4ya4ym6lb50kc.R.inc(13277);__CLB4_5_2_bool2=true;}
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13278);alpha = false;
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13279);break;
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_2a4ya4ym6lb50kc.R.inc(13280);__CLB4_5_2_bool2=true;}
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13281);alpha = true;
                __CLR4_5_2a4ya4ym6lb50kc.R.inc(13282);break;
            }
        }
        }__CLR4_5_2a4ya4ym6lb50kc.R.inc(13283);if ((((alpha)&&(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13284)!=0|true))||(__CLR4_5_2a4ya4ym6lb50kc.R.iget(13285)==0&false))) {{
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13286);return new SinglePixelPackedSampleModel(
                DataBuffer.TYPE_INT,
                 sm.getWidth(),
                 sm.getHeight(),
                 new int [] {0xFF0000, 0xFF00, 0xFF, 0xFF000000});
        } }else {{
            __CLR4_5_2a4ya4ym6lb50kc.R.inc(13287);return new SinglePixelPackedSampleModel(
                DataBuffer.TYPE_INT,
                 sm.getWidth(),
                 sm.getHeight(),
                 new int [] {0xFF0000, 0xFF00, 0xFF});
        }
    }}finally{__CLR4_5_2a4ya4ym6lb50kc.R.flushNeeded();}}
}
