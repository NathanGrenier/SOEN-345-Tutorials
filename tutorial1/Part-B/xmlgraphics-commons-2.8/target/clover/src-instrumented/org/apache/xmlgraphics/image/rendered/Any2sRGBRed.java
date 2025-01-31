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

/* $Id: Any2sRGBRed.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.rendered;

import java.awt.color.ColorSpace;
import java.awt.image.BandCombineOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.SinglePixelPackedSampleModel;
import java.awt.image.WritableRaster;

import org.apache.xmlgraphics.image.GraphicsUtil;

// CSOFF: ConstantName
// CSOFF: MethodName
// CSOFF: MultipleVariableDeclarations
// CSOFF: NeedBraces
// CSOFF: OperatorWrap
// CSOFF: WhitespaceAfter
// CSOFF: WhitespaceAround

/**
 * This function will tranform an image from any colorspace into a
 * luminance image.  The alpha channel if any will be copied to the
 * new image.
 *
 * @version $Id: Any2sRGBRed.java 1732018 2016-02-24 04:51:06Z gadams $
 *
 * Originally authored by Thomas DeWeese.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Any2sRGBRed extends AbstractRed {public static class __CLR4_5_2a94a94m6lb50li{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,13517,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    boolean srcIsLsRGB;

    /**
     * Construct a luminace image from src.
     *
     * @param src The image to convert to a luminance image
     */
    public Any2sRGBRed(CachableRed src) {
        super(src, src.getBounds(),
              fixColorModel(src),
              fixSampleModel(src),
              src.getTileGridXOffset(),
              src.getTileGridYOffset(),
              null);__CLR4_5_2a94a94m6lb50li.R.inc(13289);try{__CLR4_5_2a94a94m6lb50li.R.inc(13288);

        __CLR4_5_2a94a94m6lb50li.R.inc(13290);ColorModel srcCM = src.getColorModel();
        __CLR4_5_2a94a94m6lb50li.R.inc(13291);if ((((srcCM == null)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13292)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13293)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13294);return;
        }
        }__CLR4_5_2a94a94m6lb50li.R.inc(13295);ColorSpace srcCS = srcCM.getColorSpace();
        __CLR4_5_2a94a94m6lb50li.R.inc(13296);if ((((srcCS == ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB))&&(__CLR4_5_2a94a94m6lb50li.R.iget(13297)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13298)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13299);srcIsLsRGB = true;
        }
    }}finally{__CLR4_5_2a94a94m6lb50li.R.flushNeeded();}}

    public static boolean is_INT_PACK_COMP(SampleModel sm) {try{__CLR4_5_2a94a94m6lb50li.R.inc(13300);
        __CLR4_5_2a94a94m6lb50li.R.inc(13301);if ((((!(sm instanceof SinglePixelPackedSampleModel))&&(__CLR4_5_2a94a94m6lb50li.R.iget(13302)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13303)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13304);return false;
        }

        // Check transfer types
        }__CLR4_5_2a94a94m6lb50li.R.inc(13305);if ((((sm.getDataType() != DataBuffer.TYPE_INT)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13306)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13307)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13308);return false;
        }

        }__CLR4_5_2a94a94m6lb50li.R.inc(13309);SinglePixelPackedSampleModel sppsm;
        __CLR4_5_2a94a94m6lb50li.R.inc(13310);sppsm = (SinglePixelPackedSampleModel)sm;

        __CLR4_5_2a94a94m6lb50li.R.inc(13311);int [] masks = sppsm.getBitMasks();
        __CLR4_5_2a94a94m6lb50li.R.inc(13312);if (((((masks.length != 3) && (masks.length != 4))&&(__CLR4_5_2a94a94m6lb50li.R.iget(13313)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13314)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13315);return false;
        }
        }__CLR4_5_2a94a94m6lb50li.R.inc(13316);if ((((masks[0] != 0x00ff0000)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13317)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13318)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13319);return false;
        }
        }__CLR4_5_2a94a94m6lb50li.R.inc(13320);if ((((masks[1] != 0x0000ff00)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13321)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13322)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13323);return false;
        }
        }__CLR4_5_2a94a94m6lb50li.R.inc(13324);if ((((masks[2] != 0x000000ff)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13325)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13326)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13327);return false;
        }
        }__CLR4_5_2a94a94m6lb50li.R.inc(13328);if (((((masks.length == 4)
            && (masks[3] != 0xff000000))&&(__CLR4_5_2a94a94m6lb50li.R.iget(13329)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13330)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13331);return false;
        }

        }__CLR4_5_2a94a94m6lb50li.R.inc(13332);return true;
   }finally{__CLR4_5_2a94a94m6lb50li.R.flushNeeded();}}

    /**
     * Exponent for linear to sRGB convertion
     */
    private static final double GAMMA = 2.4;

    /**
     * Lookup tables for RGB lookups. The linearToSRGBLut is used
     * when noise values are considered to be on a linearScale. The
     * linearToLinear table is used when the values are considered to
     * be on the sRGB scale to begin with.
     */
    private static final int[] linearToSRGBLut = new int[256];
    static {try{__CLR4_5_2a94a94m6lb50li.R.inc(13333);
        __CLR4_5_2a94a94m6lb50li.R.inc(13334);final double scale = 1.0 / 255;
        __CLR4_5_2a94a94m6lb50li.R.inc(13335);final double exp   = 1.0 / GAMMA;
        // System.out.print("L2S: ");
        __CLR4_5_2a94a94m6lb50li.R.inc(13336);for (int i = 0; (((i < 256)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13337)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13338)==0&false)); i++) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13339);double value = i * scale;
            __CLR4_5_2a94a94m6lb50li.R.inc(13340);if ((((value <= 0.0031308)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13341)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13342)==0&false))) {{
                __CLR4_5_2a94a94m6lb50li.R.inc(13343);value *= 12.92;
            } }else {{
                __CLR4_5_2a94a94m6lb50li.R.inc(13344);value = 1.055 * Math.pow(value, exp) - 0.055;
            }

            }__CLR4_5_2a94a94m6lb50li.R.inc(13345);linearToSRGBLut[i] = (int)Math.round(value * 255.);
            // System.out.print(linearToSRGBLut[i] + ",");
        }
        // System.out.println("");
    }}finally{__CLR4_5_2a94a94m6lb50li.R.flushNeeded();}}

    public static WritableRaster applyLut_INT(WritableRaster wr,
                                              final int []lut) {try{__CLR4_5_2a94a94m6lb50li.R.inc(13346);
        __CLR4_5_2a94a94m6lb50li.R.inc(13347);SinglePixelPackedSampleModel sm =
            (SinglePixelPackedSampleModel)wr.getSampleModel();
        __CLR4_5_2a94a94m6lb50li.R.inc(13348);DataBufferInt db = (DataBufferInt)wr.getDataBuffer();

        __CLR4_5_2a94a94m6lb50li.R.inc(13349);final int     srcBase
            = (db.getOffset()
               + sm.getOffset(wr.getMinX() - wr.getSampleModelTranslateX(),
                            wr.getMinY() - wr.getSampleModelTranslateY()));
        // Access the pixel data array
        __CLR4_5_2a94a94m6lb50li.R.inc(13350);final int[] pixels   = db.getBankData()[0];
        __CLR4_5_2a94a94m6lb50li.R.inc(13351);final int width      = wr.getWidth();
        __CLR4_5_2a94a94m6lb50li.R.inc(13352);final int height     = wr.getHeight();
        __CLR4_5_2a94a94m6lb50li.R.inc(13353);final int scanStride = sm.getScanlineStride();

        __CLR4_5_2a94a94m6lb50li.R.inc(13354);int end;
        __CLR4_5_2a94a94m6lb50li.R.inc(13355);int pix;

        // For alpha premult we need to multiply all comps.
        __CLR4_5_2a94a94m6lb50li.R.inc(13356);for (int y = 0; (((y < height)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13357)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13358)==0&false)); y++) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13359);int sp  = srcBase + y * scanStride;
            __CLR4_5_2a94a94m6lb50li.R.inc(13360);end = sp + width;

            __CLR4_5_2a94a94m6lb50li.R.inc(13361);while ((((sp < end)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13362)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13363)==0&false))) {{
                __CLR4_5_2a94a94m6lb50li.R.inc(13364);pix = pixels[sp];
                __CLR4_5_2a94a94m6lb50li.R.inc(13365);pixels[sp] =
                    ((pix & 0xFF000000)
                     | (lut[(pix >>> 16) & 0xFF] << 16)
                     | (lut[(pix >>> 8) & 0xFF] << 8)
                     | (lut[pix & 0xFF]));
                __CLR4_5_2a94a94m6lb50li.R.inc(13366);sp++;
            }
        }}

        }__CLR4_5_2a94a94m6lb50li.R.inc(13367);return wr;
    }finally{__CLR4_5_2a94a94m6lb50li.R.flushNeeded();}}

    public WritableRaster copyData(WritableRaster wr) {try{__CLR4_5_2a94a94m6lb50li.R.inc(13368);

        // Get my source.
        __CLR4_5_2a94a94m6lb50li.R.inc(13369);CachableRed src   = (CachableRed)getSources().get(0);
        __CLR4_5_2a94a94m6lb50li.R.inc(13370);ColorModel  srcCM = src.getColorModel();
        __CLR4_5_2a94a94m6lb50li.R.inc(13371);SampleModel srcSM = src.getSampleModel();


        // Fast case, Linear SRGB source, INT Pack writable raster...
        __CLR4_5_2a94a94m6lb50li.R.inc(13372);if ((((srcIsLsRGB
            && is_INT_PACK_COMP(wr.getSampleModel()))&&(__CLR4_5_2a94a94m6lb50li.R.iget(13373)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13374)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13375);src.copyData(wr);
            __CLR4_5_2a94a94m6lb50li.R.inc(13376);if ((((srcCM.hasAlpha())&&(__CLR4_5_2a94a94m6lb50li.R.iget(13377)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13378)==0&false))) {{
                __CLR4_5_2a94a94m6lb50li.R.inc(13379);GraphicsUtil.coerceData(wr, srcCM, false);
            }
            }__CLR4_5_2a94a94m6lb50li.R.inc(13380);applyLut_INT(wr, linearToSRGBLut);
            __CLR4_5_2a94a94m6lb50li.R.inc(13381);return wr;
        }

        }__CLR4_5_2a94a94m6lb50li.R.inc(13382);if ((((srcCM == null)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13383)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13384)==0&false))) {{
            // We don't really know much about this source, let's
            // guess based on the number of bands...

            __CLR4_5_2a94a94m6lb50li.R.inc(13385);float [][] matrix = null;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2a94a94m6lb50li.R.inc(13386);switch (srcSM.getNumBands()) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2a94a94m6lb50li.R.inc(13387);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13388);matrix = new float[3][1];
                __CLR4_5_2a94a94m6lb50li.R.inc(13389);matrix[0][0] = 1; // Red
                __CLR4_5_2a94a94m6lb50li.R.inc(13390);matrix[1][0] = 1; // Grn
                __CLR4_5_2a94a94m6lb50li.R.inc(13391);matrix[2][0] = 1; // Blu
                __CLR4_5_2a94a94m6lb50li.R.inc(13392);break;
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2a94a94m6lb50li.R.inc(13393);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13394);matrix = new float[4][2];
                __CLR4_5_2a94a94m6lb50li.R.inc(13395);matrix[0][0] = 1; // Red
                __CLR4_5_2a94a94m6lb50li.R.inc(13396);matrix[1][0] = 1; // Grn
                __CLR4_5_2a94a94m6lb50li.R.inc(13397);matrix[3][0] = 1; // Blu
                __CLR4_5_2a94a94m6lb50li.R.inc(13398);matrix[3][1] = 1; // Alpha
                __CLR4_5_2a94a94m6lb50li.R.inc(13399);break;
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2a94a94m6lb50li.R.inc(13400);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13401);matrix = new float[3][3];
                __CLR4_5_2a94a94m6lb50li.R.inc(13402);matrix[0][0] = 1; // Red
                __CLR4_5_2a94a94m6lb50li.R.inc(13403);matrix[1][1] = 1; // Grn
                __CLR4_5_2a94a94m6lb50li.R.inc(13404);matrix[2][2] = 1; // Blu
                __CLR4_5_2a94a94m6lb50li.R.inc(13405);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2a94a94m6lb50li.R.inc(13406);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13407);matrix = new float[4][srcSM.getNumBands()];
                __CLR4_5_2a94a94m6lb50li.R.inc(13408);matrix[0][0] = 1; // Red
                __CLR4_5_2a94a94m6lb50li.R.inc(13409);matrix[1][1] = 1; // Grn
                __CLR4_5_2a94a94m6lb50li.R.inc(13410);matrix[2][2] = 1; // Blu
                __CLR4_5_2a94a94m6lb50li.R.inc(13411);matrix[3][3] = 1; // Alpha
                __CLR4_5_2a94a94m6lb50li.R.inc(13412);break;
            }
            __CLR4_5_2a94a94m6lb50li.R.inc(13413);Raster srcRas = src.getData(wr.getBounds());
            __CLR4_5_2a94a94m6lb50li.R.inc(13414);BandCombineOp op = new BandCombineOp(matrix, null);
            __CLR4_5_2a94a94m6lb50li.R.inc(13415);op.filter(srcRas, wr);
            __CLR4_5_2a94a94m6lb50li.R.inc(13416);return wr;
        }

        }__CLR4_5_2a94a94m6lb50li.R.inc(13417);if ((((srcCM.getColorSpace()
            == ColorSpace.getInstance(ColorSpace.CS_GRAY))&&(__CLR4_5_2a94a94m6lb50li.R.iget(13418)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13419)==0&false))) {{

            // This is a little bit of a hack.  There is only
            // a linear grayscale ICC profile in the JDK so
            // many things use this when the data _really_
            // has sRGB gamma applied.
            __CLR4_5_2a94a94m6lb50li.R.inc(13420);try {
            __CLR4_5_2a94a94m6lb50li.R.inc(13421);float [][] matrix = null;
            boolean __CLB4_5_2_bool1=false;__CLR4_5_2a94a94m6lb50li.R.inc(13422);switch (srcSM.getNumBands()) {
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2a94a94m6lb50li.R.inc(13423);__CLB4_5_2_bool1=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13424);matrix = new float[3][1];
                __CLR4_5_2a94a94m6lb50li.R.inc(13425);matrix[0][0] = 1; // Red
                __CLR4_5_2a94a94m6lb50li.R.inc(13426);matrix[1][0] = 1; // Grn
                __CLR4_5_2a94a94m6lb50li.R.inc(13427);matrix[2][0] = 1; // Blu
                __CLR4_5_2a94a94m6lb50li.R.inc(13428);break;
            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_2a94a94m6lb50li.R.inc(13429);__CLB4_5_2_bool1=true;}
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2a94a94m6lb50li.R.inc(13430);__CLB4_5_2_bool1=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13431);matrix = new float[4][2];
                __CLR4_5_2a94a94m6lb50li.R.inc(13432);matrix[0][0] = 1; // Red
                __CLR4_5_2a94a94m6lb50li.R.inc(13433);matrix[1][0] = 1; // Grn
                __CLR4_5_2a94a94m6lb50li.R.inc(13434);matrix[3][0] = 1; // Blu
                __CLR4_5_2a94a94m6lb50li.R.inc(13435);matrix[4][1] = 1; // Alpha
                __CLR4_5_2a94a94m6lb50li.R.inc(13436);break;
            }
            __CLR4_5_2a94a94m6lb50li.R.inc(13437);Raster srcRas = src.getData(wr.getBounds());
            __CLR4_5_2a94a94m6lb50li.R.inc(13438);BandCombineOp op = new BandCombineOp(matrix, null);
            __CLR4_5_2a94a94m6lb50li.R.inc(13439);op.filter(srcRas, wr);
            } catch (Throwable t) {
                __CLR4_5_2a94a94m6lb50li.R.inc(13440);t.printStackTrace();
            }
            __CLR4_5_2a94a94m6lb50li.R.inc(13441);return wr;
        }

        }__CLR4_5_2a94a94m6lb50li.R.inc(13442);ColorModel dstCM = getColorModel();
        __CLR4_5_2a94a94m6lb50li.R.inc(13443);if ((((srcCM.getColorSpace() == dstCM.getColorSpace())&&(__CLR4_5_2a94a94m6lb50li.R.iget(13444)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13445)==0&false))) {{
            // No transform needed, just reformat data...
            // System.out.println("Bypassing");

            __CLR4_5_2a94a94m6lb50li.R.inc(13446);if ((((is_INT_PACK_COMP(srcSM))&&(__CLR4_5_2a94a94m6lb50li.R.iget(13447)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13448)==0&false))) {{
                __CLR4_5_2a94a94m6lb50li.R.inc(13449);src.copyData(wr);
            } }else {{
                __CLR4_5_2a94a94m6lb50li.R.inc(13450);GraphicsUtil.copyData(src.getData(wr.getBounds()), wr);
            }

            }__CLR4_5_2a94a94m6lb50li.R.inc(13451);return wr;
        }

        }__CLR4_5_2a94a94m6lb50li.R.inc(13452);Raster srcRas = src.getData(wr.getBounds());
        assert (((srcRas instanceof WritableRaster)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13453)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13454)==0&false));
        __CLR4_5_2a94a94m6lb50li.R.inc(13455);WritableRaster srcWr  = (WritableRaster)srcRas;

        // Divide out alpha if we have it.  We need to do this since
        // the color convert may not be a linear operation which may
        // lead to out of range values.
        __CLR4_5_2a94a94m6lb50li.R.inc(13456);ColorModel srcBICM = srcCM;
        __CLR4_5_2a94a94m6lb50li.R.inc(13457);if ((((srcCM.hasAlpha())&&(__CLR4_5_2a94a94m6lb50li.R.iget(13458)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13459)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13460);srcBICM = GraphicsUtil.coerceData(srcWr, srcCM, false);
        }

        }__CLR4_5_2a94a94m6lb50li.R.inc(13461);BufferedImage srcBI;
        __CLR4_5_2a94a94m6lb50li.R.inc(13462);BufferedImage dstBI;
        __CLR4_5_2a94a94m6lb50li.R.inc(13463);srcBI = new BufferedImage(srcBICM,
                                  srcWr.createWritableTranslatedChild(0, 0),
                                  false,
                                  null);

        // System.out.println("src: " + srcBI.getWidth() + "x" +
        //                    srcBI.getHeight());

        __CLR4_5_2a94a94m6lb50li.R.inc(13464);ColorConvertOp op = new ColorConvertOp(dstCM.getColorSpace(),
                                               null);
        __CLR4_5_2a94a94m6lb50li.R.inc(13465);dstBI = op.filter(srcBI, null);

        // System.out.println("After filter:");

        __CLR4_5_2a94a94m6lb50li.R.inc(13466);WritableRaster wr00 = wr.createWritableTranslatedChild(0, 0);
        __CLR4_5_2a94a94m6lb50li.R.inc(13467);for (int i = 0; (((i < dstCM.getColorSpace().getNumComponents())&&(__CLR4_5_2a94a94m6lb50li.R.iget(13468)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13469)==0&false)); i++) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13470);copyBand(dstBI.getRaster(), i, wr00,    i);
        }

        }__CLR4_5_2a94a94m6lb50li.R.inc(13471);if ((((dstCM.hasAlpha())&&(__CLR4_5_2a94a94m6lb50li.R.iget(13472)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13473)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13474);copyBand(srcWr, srcSM.getNumBands() - 1,
                     wr,    getSampleModel().getNumBands() - 1);
        }
        }__CLR4_5_2a94a94m6lb50li.R.inc(13475);return wr;
    }finally{__CLR4_5_2a94a94m6lb50li.R.flushNeeded();}}

        /**
         * This function 'fixes' the source's color model.  Right now
         * it just selects if it should have one or two bands based on
         * if the source had an alpha channel.
         */
    protected static ColorModel fixColorModel(CachableRed src) {try{__CLR4_5_2a94a94m6lb50li.R.inc(13476);
        __CLR4_5_2a94a94m6lb50li.R.inc(13477);ColorModel  cm = src.getColorModel();
        __CLR4_5_2a94a94m6lb50li.R.inc(13478);if ((((cm != null)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13479)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13480)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13481);if ((((cm.hasAlpha())&&(__CLR4_5_2a94a94m6lb50li.R.iget(13482)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13483)==0&false))) {{
                __CLR4_5_2a94a94m6lb50li.R.inc(13484);return GraphicsUtil.sRGB_Unpre;
            }

            }__CLR4_5_2a94a94m6lb50li.R.inc(13485);return GraphicsUtil.sRGB;
        } }else {{
            // No ColorModel so try to make some intelligent
            // decisions based just on the number of bands...
            // 1 bands -> replicated into RGB
            // 2 bands -> Band 0 replicated into RGB & Band 1 -> alpha premult
            // 3 bands -> sRGB (not-linear?)
            // 4 bands -> sRGB premult (not-linear?)
            __CLR4_5_2a94a94m6lb50li.R.inc(13486);SampleModel sm = src.getSampleModel();

            boolean __CLB4_5_2_bool2=false;__CLR4_5_2a94a94m6lb50li.R.inc(13487);switch (sm.getNumBands()) {
            case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_2a94a94m6lb50li.R.inc(13488);__CLB4_5_2_bool2=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13489);return GraphicsUtil.sRGB;
            case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_2a94a94m6lb50li.R.inc(13490);__CLB4_5_2_bool2=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13491);return GraphicsUtil.sRGB_Unpre;
            case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_2a94a94m6lb50li.R.inc(13492);__CLB4_5_2_bool2=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13493);return GraphicsUtil.sRGB;
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_2a94a94m6lb50li.R.inc(13494);__CLB4_5_2_bool2=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13495);return GraphicsUtil.sRGB_Unpre;
            }
        }
    }}finally{__CLR4_5_2a94a94m6lb50li.R.flushNeeded();}}

    /**
     * This function 'fixes' the source's sample model.
     * Right now it just selects if it should have 3 or 4 bands
     * based on if the source had an alpha channel.
     */
    protected static SampleModel fixSampleModel(CachableRed src) {try{__CLR4_5_2a94a94m6lb50li.R.inc(13496);
        __CLR4_5_2a94a94m6lb50li.R.inc(13497);SampleModel sm = src.getSampleModel();
        __CLR4_5_2a94a94m6lb50li.R.inc(13498);ColorModel  cm = src.getColorModel();

        __CLR4_5_2a94a94m6lb50li.R.inc(13499);boolean alpha = false;

        __CLR4_5_2a94a94m6lb50li.R.inc(13500);if ((((cm != null)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13501)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13502)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13503);alpha = cm.hasAlpha();
        } }else {{
            boolean __CLB4_5_2_bool3=false;__CLR4_5_2a94a94m6lb50li.R.inc(13504);switch (sm.getNumBands()) {
            case 1:if (!__CLB4_5_2_bool3) {__CLR4_5_2a94a94m6lb50li.R.inc(13505);__CLB4_5_2_bool3=true;} case 3:if (!__CLB4_5_2_bool3) {__CLR4_5_2a94a94m6lb50li.R.inc(13506);__CLB4_5_2_bool3=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13507);alpha = false;
                __CLR4_5_2a94a94m6lb50li.R.inc(13508);break;
            default:if (!__CLB4_5_2_bool3) {__CLR4_5_2a94a94m6lb50li.R.inc(13509);__CLB4_5_2_bool3=true;}
                __CLR4_5_2a94a94m6lb50li.R.inc(13510);alpha = true;
                __CLR4_5_2a94a94m6lb50li.R.inc(13511);break;
            }
        }
        }__CLR4_5_2a94a94m6lb50li.R.inc(13512);if ((((alpha)&&(__CLR4_5_2a94a94m6lb50li.R.iget(13513)!=0|true))||(__CLR4_5_2a94a94m6lb50li.R.iget(13514)==0&false))) {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13515);return new SinglePixelPackedSampleModel(
                DataBuffer.TYPE_INT,
                 sm.getWidth(),
                 sm.getHeight(),
                 new int [] {0xFF0000, 0xFF00, 0xFF, 0xFF000000});
        } }else {{
            __CLR4_5_2a94a94m6lb50li.R.inc(13516);return new SinglePixelPackedSampleModel(
                DataBuffer.TYPE_INT,
                 sm.getWidth(),
                 sm.getHeight(),
                 new int [] {0xFF0000, 0xFF00, 0xFF});
        }
    }}finally{__CLR4_5_2a94a94m6lb50li.R.flushNeeded();}}
}
