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

/* $Id: FormatRed.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.rendered;

import java.awt.Point;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.SinglePixelPackedSampleModel;
import java.awt.image.WritableRaster;

import org.apache.xmlgraphics.image.GraphicsUtil;

// CSOFF: NeedBraces
// CSOFF: WhitespaceAfter
// CSOFF: WhitespaceAround

/**
 * This allows you to specify the ColorModel, Alpha premult and/or
 * SampleModel to be used for output.  If the input image lacks
 * Alpha and alpha is included in output then it is filled with
 * alpha=1.  In all other cases bands are simply copied.
 *
 * @version $Id: FormatRed.java 1732018 2016-02-24 04:51:06Z gadams $
 *
 * Originally authored by Thomas DeWeese.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FormatRed extends AbstractRed {public static class __CLR4_5_2ageagem68iyhmc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,13668,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static CachableRed construct(CachableRed src, ColorModel cm) {try{__CLR4_5_2ageagem68iyhmc.R.inc(13550);
        __CLR4_5_2ageagem68iyhmc.R.inc(13551);ColorModel srcCM = src.getColorModel();
        __CLR4_5_2ageagem68iyhmc.R.inc(13552);if (((((cm.hasAlpha() != srcCM.hasAlpha())
            || (cm.isAlphaPremultiplied() != srcCM.isAlphaPremultiplied()))&&(__CLR4_5_2ageagem68iyhmc.R.iget(13553)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13554)==0&false))) {{
            __CLR4_5_2ageagem68iyhmc.R.inc(13555);return new FormatRed(src, cm);
        }

        }__CLR4_5_2ageagem68iyhmc.R.inc(13556);if ((((cm.getNumComponents() != srcCM.getNumComponents())&&(__CLR4_5_2ageagem68iyhmc.R.iget(13557)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13558)==0&false))) {{
            __CLR4_5_2ageagem68iyhmc.R.inc(13559);throw new IllegalArgumentException(
                "Incompatible ColorModel given");
        }


        }__CLR4_5_2ageagem68iyhmc.R.inc(13560);if (((((srcCM instanceof ComponentColorModel)
            && (cm    instanceof ComponentColorModel))&&(__CLR4_5_2ageagem68iyhmc.R.iget(13561)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13562)==0&false))) {{
            __CLR4_5_2ageagem68iyhmc.R.inc(13563);return src;
        }

        }__CLR4_5_2ageagem68iyhmc.R.inc(13564);if (((((srcCM instanceof DirectColorModel)
            && (cm    instanceof DirectColorModel))&&(__CLR4_5_2ageagem68iyhmc.R.iget(13565)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13566)==0&false))) {{
            __CLR4_5_2ageagem68iyhmc.R.inc(13567);return src;
        }

        }__CLR4_5_2ageagem68iyhmc.R.inc(13568);return new FormatRed(src, cm);
    }finally{__CLR4_5_2ageagem68iyhmc.R.flushNeeded();}}

    /**
     * Construct an instance of CachableRed around a BufferedImage.
     */
    public FormatRed(CachableRed cr, SampleModel sm) {
        super(cr, cr.getBounds(),
              makeColorModel(cr, sm), sm,
              cr.getTileGridXOffset(),
              cr.getTileGridYOffset(),
              null);__CLR4_5_2ageagem68iyhmc.R.inc(13570);try{__CLR4_5_2ageagem68iyhmc.R.inc(13569);
    }finally{__CLR4_5_2ageagem68iyhmc.R.flushNeeded();}}

    public FormatRed(CachableRed cr, ColorModel cm) {
        super(cr, cr.getBounds(),
              cm, makeSampleModel(cr, cm),
              cr.getTileGridXOffset(),
              cr.getTileGridYOffset(),
              null);__CLR4_5_2ageagem68iyhmc.R.inc(13572);try{__CLR4_5_2ageagem68iyhmc.R.inc(13571);
    }finally{__CLR4_5_2ageagem68iyhmc.R.flushNeeded();}}

    /**
     * fetch the source image for this node.
     */
    public CachableRed getSource() {try{__CLR4_5_2ageagem68iyhmc.R.inc(13573);
        __CLR4_5_2ageagem68iyhmc.R.inc(13574);return (CachableRed)getSources().get(0);
    }finally{__CLR4_5_2ageagem68iyhmc.R.flushNeeded();}}

    public Object getProperty(String name) {try{__CLR4_5_2ageagem68iyhmc.R.inc(13575);
        __CLR4_5_2ageagem68iyhmc.R.inc(13576);return getSource().getProperty(name);
    }finally{__CLR4_5_2ageagem68iyhmc.R.flushNeeded();}}

    public String [] getPropertyNames() {try{__CLR4_5_2ageagem68iyhmc.R.inc(13577);
        __CLR4_5_2ageagem68iyhmc.R.inc(13578);return getSource().getPropertyNames();
    }finally{__CLR4_5_2ageagem68iyhmc.R.flushNeeded();}}

    public WritableRaster copyData(WritableRaster wr) {try{__CLR4_5_2ageagem68iyhmc.R.inc(13579);
        __CLR4_5_2ageagem68iyhmc.R.inc(13580);ColorModel  cm    = getColorModel();
        __CLR4_5_2ageagem68iyhmc.R.inc(13581);CachableRed cr    = getSource();
        __CLR4_5_2ageagem68iyhmc.R.inc(13582);ColorModel  srcCM = cr.getColorModel();
        __CLR4_5_2ageagem68iyhmc.R.inc(13583);SampleModel srcSM = cr.getSampleModel();
        __CLR4_5_2ageagem68iyhmc.R.inc(13584);srcSM = srcSM.createCompatibleSampleModel(wr.getWidth(),
                                                  wr.getHeight());
        __CLR4_5_2ageagem68iyhmc.R.inc(13585);WritableRaster srcWR;
        __CLR4_5_2ageagem68iyhmc.R.inc(13586);srcWR = Raster.createWritableRaster(srcSM, new Point(wr.getMinX(),
                                                             wr.getMinY()));
        __CLR4_5_2ageagem68iyhmc.R.inc(13587);getSource().copyData(srcWR);

        __CLR4_5_2ageagem68iyhmc.R.inc(13588);BufferedImage srcBI = new BufferedImage(
            srcCM, srcWR.createWritableTranslatedChild(0, 0),
             srcCM.isAlphaPremultiplied(), null);
        __CLR4_5_2ageagem68iyhmc.R.inc(13589);BufferedImage dstBI = new BufferedImage(
            cm, wr.createWritableTranslatedChild(0, 0),
             cm.isAlphaPremultiplied(), null);

        __CLR4_5_2ageagem68iyhmc.R.inc(13590);GraphicsUtil.copyData(srcBI, dstBI);

        __CLR4_5_2ageagem68iyhmc.R.inc(13591);return wr;
    }finally{__CLR4_5_2ageagem68iyhmc.R.flushNeeded();}}

    public static SampleModel makeSampleModel(CachableRed cr, ColorModel cm) {try{__CLR4_5_2ageagem68iyhmc.R.inc(13592);
        __CLR4_5_2ageagem68iyhmc.R.inc(13593);SampleModel srcSM = cr.getSampleModel();
        __CLR4_5_2ageagem68iyhmc.R.inc(13594);return cm.createCompatibleSampleModel(srcSM.getWidth(),
                                              srcSM.getHeight());
    }finally{__CLR4_5_2ageagem68iyhmc.R.flushNeeded();}}

    public static ColorModel makeColorModel(CachableRed cr, SampleModel sm) {try{__CLR4_5_2ageagem68iyhmc.R.inc(13595);
        __CLR4_5_2ageagem68iyhmc.R.inc(13596);ColorModel srcCM = cr.getColorModel();
        __CLR4_5_2ageagem68iyhmc.R.inc(13597);ColorSpace cs    = srcCM.getColorSpace();

        __CLR4_5_2ageagem68iyhmc.R.inc(13598);int bands = sm.getNumBands();

        __CLR4_5_2ageagem68iyhmc.R.inc(13599);int bits;
        __CLR4_5_2ageagem68iyhmc.R.inc(13600);int dt = sm.getDataType();
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2ageagem68iyhmc.R.inc(13601);switch (dt) {
        case DataBuffer.TYPE_BYTE:if (!__CLB4_5_2_bool0) {__CLR4_5_2ageagem68iyhmc.R.inc(13602);__CLB4_5_2_bool0=true;}   __CLR4_5_2ageagem68iyhmc.R.inc(13603);bits = 8;  __CLR4_5_2ageagem68iyhmc.R.inc(13604);break;
        case DataBuffer.TYPE_SHORT:if (!__CLB4_5_2_bool0) {__CLR4_5_2ageagem68iyhmc.R.inc(13605);__CLB4_5_2_bool0=true;}  __CLR4_5_2ageagem68iyhmc.R.inc(13606);bits = 16; __CLR4_5_2ageagem68iyhmc.R.inc(13607);break;
        case DataBuffer.TYPE_USHORT:if (!__CLB4_5_2_bool0) {__CLR4_5_2ageagem68iyhmc.R.inc(13608);__CLB4_5_2_bool0=true;} __CLR4_5_2ageagem68iyhmc.R.inc(13609);bits = 16; __CLR4_5_2ageagem68iyhmc.R.inc(13610);break;
        case DataBuffer.TYPE_INT:if (!__CLB4_5_2_bool0) {__CLR4_5_2ageagem68iyhmc.R.inc(13611);__CLB4_5_2_bool0=true;}    __CLR4_5_2ageagem68iyhmc.R.inc(13612);bits = 32; __CLR4_5_2ageagem68iyhmc.R.inc(13613);break;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ageagem68iyhmc.R.inc(13614);__CLB4_5_2_bool0=true;}
            __CLR4_5_2ageagem68iyhmc.R.inc(13615);throw new IllegalArgumentException(
                "Unsupported DataBuffer type: " + dt);
        }

        __CLR4_5_2ageagem68iyhmc.R.inc(13616);boolean hasAlpha = srcCM.hasAlpha();
        __CLR4_5_2ageagem68iyhmc.R.inc(13617);if ((((hasAlpha)&&(__CLR4_5_2ageagem68iyhmc.R.iget(13618)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13619)==0&false))) {{
            // if Src has Alpha then our out bands must
            // either be one less than the source (no out alpha)
            // or equal (still has alpha)
            __CLR4_5_2ageagem68iyhmc.R.inc(13620);if ((((bands == srcCM.getNumComponents() - 1)&&(__CLR4_5_2ageagem68iyhmc.R.iget(13621)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13622)==0&false))) {{
                __CLR4_5_2ageagem68iyhmc.R.inc(13623);hasAlpha = false;
            } }else {__CLR4_5_2ageagem68iyhmc.R.inc(13624);if ((((bands != srcCM.getNumComponents())&&(__CLR4_5_2ageagem68iyhmc.R.iget(13625)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13626)==0&false))) {{
                __CLR4_5_2ageagem68iyhmc.R.inc(13627);throw new IllegalArgumentException(
                    "Incompatible number of bands in and out");
            }
        }}} }else {{
            __CLR4_5_2ageagem68iyhmc.R.inc(13628);if ((((bands == srcCM.getNumComponents() + 1)&&(__CLR4_5_2ageagem68iyhmc.R.iget(13629)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13630)==0&false))) {{
                __CLR4_5_2ageagem68iyhmc.R.inc(13631);hasAlpha = true;
            } }else {__CLR4_5_2ageagem68iyhmc.R.inc(13632);if ((((bands != srcCM.getNumComponents())&&(__CLR4_5_2ageagem68iyhmc.R.iget(13633)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13634)==0&false))) {{
                __CLR4_5_2ageagem68iyhmc.R.inc(13635);throw new IllegalArgumentException(
                    "Incompatible number of bands in and out");
            }
        }}}

        }__CLR4_5_2ageagem68iyhmc.R.inc(13636);boolean preMult  = srcCM.isAlphaPremultiplied();
        __CLR4_5_2ageagem68iyhmc.R.inc(13637);if ((((!hasAlpha)&&(__CLR4_5_2ageagem68iyhmc.R.iget(13638)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13639)==0&false))) {{
            __CLR4_5_2ageagem68iyhmc.R.inc(13640);preMult = false;
        }

        }__CLR4_5_2ageagem68iyhmc.R.inc(13641);if ((((sm instanceof ComponentSampleModel)&&(__CLR4_5_2ageagem68iyhmc.R.iget(13642)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13643)==0&false))) {{
            __CLR4_5_2ageagem68iyhmc.R.inc(13644);int [] bitsPer = new int[bands];
            __CLR4_5_2ageagem68iyhmc.R.inc(13645);for (int i = 0; (((i < bands)&&(__CLR4_5_2ageagem68iyhmc.R.iget(13646)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13647)==0&false)); i++) {{
                __CLR4_5_2ageagem68iyhmc.R.inc(13648);bitsPer[i] = bits;
            }

            }__CLR4_5_2ageagem68iyhmc.R.inc(13649);return new ComponentColorModel(
                cs, bitsPer, hasAlpha, preMult,
                 (((hasAlpha )&&(__CLR4_5_2ageagem68iyhmc.R.iget(13650)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13651)==0&false))? Transparency.TRANSLUCENT : Transparency.OPAQUE,
                 dt);
        } }else {__CLR4_5_2ageagem68iyhmc.R.inc(13652);if ((((sm instanceof SinglePixelPackedSampleModel)&&(__CLR4_5_2ageagem68iyhmc.R.iget(13653)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13654)==0&false))) {{
            __CLR4_5_2ageagem68iyhmc.R.inc(13655);SinglePixelPackedSampleModel sppsm;
            __CLR4_5_2ageagem68iyhmc.R.inc(13656);sppsm = (SinglePixelPackedSampleModel)sm;
            __CLR4_5_2ageagem68iyhmc.R.inc(13657);int[] masks  = sppsm.getBitMasks();
            __CLR4_5_2ageagem68iyhmc.R.inc(13658);if ((((bands == 4)&&(__CLR4_5_2ageagem68iyhmc.R.iget(13659)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13660)==0&false))) {{
                __CLR4_5_2ageagem68iyhmc.R.inc(13661);return new DirectColorModel(
                    cs, bits, masks[0], masks[1], masks[2], masks[3],
                     preMult, dt);
            } }else {__CLR4_5_2ageagem68iyhmc.R.inc(13662);if ((((bands == 3)&&(__CLR4_5_2ageagem68iyhmc.R.iget(13663)!=0|true))||(__CLR4_5_2ageagem68iyhmc.R.iget(13664)==0&false))) {{
                __CLR4_5_2ageagem68iyhmc.R.inc(13665);return new DirectColorModel(
                    cs, bits, masks[0], masks[1], masks[2], 0x0,
                     preMult, dt);
            } }else {{
                __CLR4_5_2ageagem68iyhmc.R.inc(13666);throw new IllegalArgumentException(
                    "Incompatible number of bands out for ColorModel");
            }
        }}}
        }}__CLR4_5_2ageagem68iyhmc.R.inc(13667);throw new IllegalArgumentException(
            "Unsupported SampleModel Type");
    }finally{__CLR4_5_2ageagem68iyhmc.R.flushNeeded();}}
}
