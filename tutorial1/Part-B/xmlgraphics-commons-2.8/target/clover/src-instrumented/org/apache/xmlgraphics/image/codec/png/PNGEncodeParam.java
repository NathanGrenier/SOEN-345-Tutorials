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

/* $Id: PNGEncodeParam.java 1902007 2022-06-17 09:51:56Z ssteiner $ */

package org.apache.xmlgraphics.image.codec.png;

import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.xmlgraphics.image.codec.util.ImageEncodeParam;
import org.apache.xmlgraphics.image.codec.util.PropertyUtil;

// CSOFF: MemberName
// CSOFF: MultipleVariableDeclarations
// CSOFF: NeedBraces
// CSOFF: OperatorWrap
// CSOFF: ParameterName
// CSOFF: WhitespaceAround

/**
 * An instance of <code>ImageEncodeParam</code> for encoding images in
 * the PNG format.
 *
 * <p><b> This class is not a committed part of the JAI API.  It may
 * be removed or changed in future releases of JAI.</b>
 */
public abstract class PNGEncodeParam implements ImageEncodeParam {public static class __CLR4_5_2u5u5m68iyfte{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,1591,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long serialVersionUID = -7851509538552141263L;

    /** Constant for use with the sRGB chunk. */
    public static final int INTENT_PERCEPTUAL = 0;

    /** Constant for use with the sRGB chunk. */
    public static final int INTENT_RELATIVE = 1;

    /** Constant for use with the sRGB chunk. */
    public static final int INTENT_SATURATION = 2;

    /** Constant for use with the sRGB chunk. */
    public static final int INTENT_ABSOLUTE = 3;

    /** Constant for use in filtering. */
    public static final int PNG_FILTER_NONE = 0;

    /** Constant for use in filtering. */
    public static final int PNG_FILTER_SUB = 1;

    /** Constant for use in filtering. */
    public static final int PNG_FILTER_UP = 2;

    /** Constant for use in filtering. */
    public static final int PNG_FILTER_AVERAGE = 3;

    /** Constant for use in filtering. */
    public static final int PNG_FILTER_PAETH = 4;


    /**
     * Returns an instance of <code>PNGEncodeParam.Palette</code>,
     * <code>PNGEncodeParam.Gray</code>, or
     * <code>PNGEncodeParam.RGB</code> appropriate for encoding
     * the given image.
     *
     * <p> If the image has an <code>IndexColorModel</code>, an
     * instance of <code>PNGEncodeParam.Palette</code> is returned.
     * Otherwise, if the image has 1 or 2 bands an instance of
     * <code>PNGEncodeParam.Gray</code> is returned.  In all other
     * cases an instance of <code>PNGEncodeParam.RGB</code> is
     * returned.
     *
     * <p> Note that this method does not provide any guarantee that
     * the given image will be successfully encoded by the PNG
     * encoder, as it only performs a very superficial analysis of
     * the image structure.
     */
    public static PNGEncodeParam getDefaultEncodeParam(RenderedImage im) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1085);
        __CLR4_5_2u5u5m68iyfte.R.inc(1086);ColorModel colorModel = im.getColorModel();
        __CLR4_5_2u5u5m68iyfte.R.inc(1087);if ((((colorModel instanceof IndexColorModel)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1088)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1089)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1090);return new PNGEncodeParam.Palette();
        }

        }__CLR4_5_2u5u5m68iyfte.R.inc(1091);SampleModel sampleModel = im.getSampleModel();
        __CLR4_5_2u5u5m68iyfte.R.inc(1092);int numBands = sampleModel.getNumBands();

        __CLR4_5_2u5u5m68iyfte.R.inc(1093);if ((((numBands == 1 || numBands == 2)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1094)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1095)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1096);return new PNGEncodeParam.Gray();
        } }else {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1097);return new PNGEncodeParam.RGB();
        }
    }}finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    public static class Palette extends PNGEncodeParam {

        private static final long serialVersionUID = -5181545170427733891L;

        /** Constructs an instance of <code>PNGEncodeParam.Palette</code>. */
        public Palette() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1098); }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        // bKGD chunk

        private boolean backgroundSet;

        /**
         * Suppresses the 'bKGD' chunk from being output.
         */
        public void unsetBackground() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1099);
            __CLR4_5_2u5u5m68iyfte.R.inc(1100);backgroundSet = false;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns true if a 'bKGD' chunk will be output.
         */
        public boolean isBackgroundSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1101);
            __CLR4_5_2u5u5m68iyfte.R.inc(1102);return backgroundSet;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Sets the desired bit depth for a palette image.  The bit
         * depth must be one of 1, 2, 4, or 8, or else an
         * <code>IllegalArgumentException</code> will be thrown.
         */
        public void setBitDepth(int bitDepth) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1103);
            __CLR4_5_2u5u5m68iyfte.R.inc(1104);if ((((bitDepth != 1 && bitDepth != 2 && bitDepth != 4
                && bitDepth != 8)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1105)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1106)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1107);throw new IllegalArgumentException(PropertyUtil.getString("PNGEncodeParam2"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1108);this.bitDepth = bitDepth;
            __CLR4_5_2u5u5m68iyfte.R.inc(1109);bitDepthSet = true;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        // PLTE chunk

        private int[] palette;
        private boolean paletteSet;

        /**
         * Sets the RGB palette of the image to be encoded.
         * The <code>rgb</code> parameter contains alternating
         * R, G, B values for each color index used in the image.
         * The number of elements must be a multiple of 3 between
         * 3 and 3*256.
         *
         * <p> The 'PLTE' chunk will encode this information.
         *
         * @param rgb An array of <code>int</code>s.
         */
        public void setPalette(int[] rgb) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1110);
            __CLR4_5_2u5u5m68iyfte.R.inc(1111);if ((((rgb.length < 1 * 3 || rgb.length > 256 * 3)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1112)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1113)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1114);throw new
                  IllegalArgumentException(PropertyUtil.getString("PNGEncodeParam0"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1115);if (((((rgb.length % 3) != 0)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1116)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1117)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1118);throw new
                   IllegalArgumentException(PropertyUtil.getString("PNGEncodeParam1"));
            }

            }__CLR4_5_2u5u5m68iyfte.R.inc(1119);palette = rgb.clone();
            __CLR4_5_2u5u5m68iyfte.R.inc(1120);paletteSet = true;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns the current RGB palette.
         *
         * <p> If the palette has not previously been set, or has been
         * unset, an <code>IllegalStateException</code> will be thrown.
         *
         * @throws IllegalStateException if the palette is not set.
         *
         * @return An array of <code>int</code>s.
         */
        public int[] getPalette() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1121);
            __CLR4_5_2u5u5m68iyfte.R.inc(1122);if ((((!paletteSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1123)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1124)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1125);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam3"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1126);return palette.clone();
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Suppresses the 'PLTE' chunk from being output.
         */
        public void unsetPalette() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1127);
            __CLR4_5_2u5u5m68iyfte.R.inc(1128);palette = null;
            __CLR4_5_2u5u5m68iyfte.R.inc(1129);paletteSet = false;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns true if a 'PLTE' chunk will be output.
         */
        public boolean isPaletteSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1130);
            __CLR4_5_2u5u5m68iyfte.R.inc(1131);return paletteSet;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        // bKGD chunk

        private int backgroundPaletteIndex;

        /**
         * Sets the palette index of the suggested background color.
         *
         * <p> The 'bKGD' chunk will encode this information.
         */
        public void setBackgroundPaletteIndex(int index) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1132);
            __CLR4_5_2u5u5m68iyfte.R.inc(1133);backgroundPaletteIndex = index;
            __CLR4_5_2u5u5m68iyfte.R.inc(1134);backgroundSet = true;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns the palette index of the suggested background color.
         *
         * <p> If the background palette index has not previously been
         * set, or has been unset, an
         * <code>IllegalStateException</code> will be thrown.
         *
         * @throws IllegalStateException if the palette index is not set.
         */
        public int getBackgroundPaletteIndex() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1135);
            __CLR4_5_2u5u5m68iyfte.R.inc(1136);if ((((!backgroundSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1137)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1138)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1139);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam4"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1140);return backgroundPaletteIndex;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        // tRNS chunk

        private int[] transparency;

        /**
         * Sets the alpha values associated with each palette entry.
         * The <code>alpha</code> parameter should have as many entries
         * as there are RGB triples in the palette.
         *
         * <p> The 'tRNS' chunk will encode this information.
         */
        public void setPaletteTransparency(byte[] alpha) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1141);
            __CLR4_5_2u5u5m68iyfte.R.inc(1142);transparency = new int[alpha.length];
            __CLR4_5_2u5u5m68iyfte.R.inc(1143);for (int i = 0; (((i < alpha.length)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1144)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1145)==0&false)); i++) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1146);transparency[i] = alpha[i] & 0xff;
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1147);transparencySet = true;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns the alpha values associated with each palette entry.
         *
         * <p> If the palette transparency has not previously been
         * set, or has been unset, an
         * <code>IllegalStateException</code> will be thrown.
         *
         * @throws IllegalStateException if the palette transparency is
         *        not set.
         */
        public byte[] getPaletteTransparency() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1148);
            __CLR4_5_2u5u5m68iyfte.R.inc(1149);if ((((!transparencySet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1150)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1151)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1152);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam5"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1153);byte[] alpha = new byte[transparency.length];
            __CLR4_5_2u5u5m68iyfte.R.inc(1154);for (int i = 0; (((i < alpha.length)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1155)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1156)==0&false)); i++) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1157);alpha[i] = (byte)transparency[i];
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1158);return alpha;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}
    }

    public static class Gray extends PNGEncodeParam {

        private static final long serialVersionUID = -2055439792025795274L;

        /** Constructs an instance of <code>PNGEncodeParam.Gray</code>. */
        public Gray() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1159); }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        // bKGD chunk

        private boolean backgroundSet;

        /**
         * Suppresses the 'bKGD' chunk from being output.
         */
        public void unsetBackground() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1160);
            __CLR4_5_2u5u5m68iyfte.R.inc(1161);backgroundSet = false;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns true if a 'bKGD' chunk will be output.
         */
        public boolean isBackgroundSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1162);
            __CLR4_5_2u5u5m68iyfte.R.inc(1163);return backgroundSet;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Sets the desired bit depth for a grayscale image.  The bit
         * depth must be one of 1, 2, 4, 8, or 16.
         *
         * <p> When encoding a source image of a greater bit depth,
         * pixel values will be clamped to the smaller range after
         * shifting by the value given by <code>getBitShift()</code>.
         * When encoding a source image of a smaller bit depth, pixel
         * values will be shifted and left-filled with zeroes.
         */
        public void setBitDepth(int bitDepth) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1164);
            __CLR4_5_2u5u5m68iyfte.R.inc(1165);if ((((bitDepth != 1 && bitDepth != 2 && bitDepth != 4
                && bitDepth != 8 && bitDepth != 16)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1166)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1167)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1168);throw new IllegalArgumentException(PropertyUtil.getString("PNGEncodeParam2"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1169);this.bitDepth = bitDepth;
            __CLR4_5_2u5u5m68iyfte.R.inc(1170);bitDepthSet = true;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        // bKGD chunk

        private int backgroundPaletteGray;

        /**
         * Sets the suggested gray level of the background.
         *
         * <p> The 'bKGD' chunk will encode this information.
         */
        public void setBackgroundGray(int gray) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1171);
            __CLR4_5_2u5u5m68iyfte.R.inc(1172);backgroundPaletteGray = gray;
            __CLR4_5_2u5u5m68iyfte.R.inc(1173);backgroundSet = true;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns the suggested gray level of the background.
         *
         * <p> If the background gray level has not previously been
         * set, or has been unset, an
         * <code>IllegalStateException</code> will be thrown.
         *
         * @throws IllegalStateException if the background gray level
         *        is not set.
         */
        public int getBackgroundGray() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1174);
            __CLR4_5_2u5u5m68iyfte.R.inc(1175);if ((((!backgroundSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1176)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1177)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1178);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam6"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1179);return backgroundPaletteGray;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        // tRNS chunk

        private int[] transparency;

        /**
         * Sets the gray value to be used to denote transparency.
         *
         * <p> Setting this attribute will cause the alpha channel
         * of the input image to be ignored.
         *
         * <p> The 'tRNS' chunk will encode this information.
         */
        public void setTransparentGray(int transparentGray) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1180);
            __CLR4_5_2u5u5m68iyfte.R.inc(1181);transparency = new int[1];
            __CLR4_5_2u5u5m68iyfte.R.inc(1182);transparency[0] = transparentGray;
            __CLR4_5_2u5u5m68iyfte.R.inc(1183);transparencySet = true;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns the gray value to be used to denote transparency.
         *
         * <p> If the transparent gray value has not previously been
         * set, or has been unset, an
         * <code>IllegalStateException</code> will be thrown.
         *
         * @throws IllegalStateException if the transparent gray value
         *        is not set.
         */
        public int getTransparentGray() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1184);
            __CLR4_5_2u5u5m68iyfte.R.inc(1185);if ((((!transparencySet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1186)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1187)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1188);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam7"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1189);int gray = transparency[0];
            __CLR4_5_2u5u5m68iyfte.R.inc(1190);return gray;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        private int bitShift;
        private boolean bitShiftSet;

        /**
         * Sets the desired bit shift for a grayscale image.
         * Pixels in the source image will be shifted right by
         * the given amount prior to being clamped to the maximum
         * value given by the encoded image's bit depth.
         */
        public void setBitShift(int bitShift) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1191);
            __CLR4_5_2u5u5m68iyfte.R.inc(1192);if ((((bitShift < 0)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1193)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1194)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1195);throw new IllegalArgumentException(PropertyUtil.getString("PNGEncodeParam25"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1196);this.bitShift = bitShift;
            __CLR4_5_2u5u5m68iyfte.R.inc(1197);bitShiftSet = true;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns the desired bit shift for a grayscale image.
         *
         * <p> If the bit shift has not previously been set, or has been
         * unset, an <code>IllegalStateException</code> will be thrown.
         *
         * @throws IllegalStateException if the bit shift is not set.
         */
        public int getBitShift() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1198);
            __CLR4_5_2u5u5m68iyfte.R.inc(1199);if ((((!bitShiftSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1200)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1201)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1202);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam8"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1203);return bitShift;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Suppresses the setting of the bit shift of a grayscale image.
         * Pixels in the source image will not be shifted prior to encoding.
         */
        public void unsetBitShift() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1204);
            __CLR4_5_2u5u5m68iyfte.R.inc(1205);bitShiftSet = false;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns true if the bit shift has been set.
         */
        public boolean isBitShiftSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1206);
            __CLR4_5_2u5u5m68iyfte.R.inc(1207);return bitShiftSet;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns true if the bit depth has been set.
         */
        public boolean isBitDepthSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1208);
            __CLR4_5_2u5u5m68iyfte.R.inc(1209);return bitDepthSet;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}
    }

    public static class RGB extends PNGEncodeParam {

        private static final long serialVersionUID = -8918762026006670891L;

        /** Constructs an instance of <code>PNGEncodeParam.RGB</code>. */
        public RGB() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1210); }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        // bKGD chunk

        private boolean backgroundSet;

        /**
         * Suppresses the 'bKGD' chunk from being output.
         */
        public void unsetBackground() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1211);
            __CLR4_5_2u5u5m68iyfte.R.inc(1212);backgroundSet = false;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns true if a 'bKGD' chunk will be output.
         */
        public boolean isBackgroundSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1213);
            __CLR4_5_2u5u5m68iyfte.R.inc(1214);return backgroundSet;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Sets the desired bit depth for an RGB image.  The bit
         * depth must be 8 or 16.
         */
        public void setBitDepth(int bitDepth) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1215);
            __CLR4_5_2u5u5m68iyfte.R.inc(1216);if ((((bitDepth != 8 && bitDepth != 16)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1217)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1218)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1219);throw new IllegalArgumentException(PropertyUtil.getString("PNGEncodeParam26"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1220);this.bitDepth = bitDepth;
            __CLR4_5_2u5u5m68iyfte.R.inc(1221);bitDepthSet = true;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        // bKGD chunk

        private int[] backgroundRGB;

        /**
         * Sets the RGB value of the suggested background color.
         * The <code>rgb</code> parameter should have 3 entries.
         *
         * <p> The 'bKGD' chunk will encode this information.
         */
        public void setBackgroundRGB(int[] rgb) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1222);
            __CLR4_5_2u5u5m68iyfte.R.inc(1223);if ((((rgb.length != 3)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1224)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1225)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1226);throw new IllegalArgumentException(PropertyUtil.getString("PNGEncodeParam27"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1227);backgroundRGB = rgb;
            __CLR4_5_2u5u5m68iyfte.R.inc(1228);backgroundSet = true;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns the RGB value of the suggested background color.
         *
         * <p> If the background color has not previously been set, or has been
         * unset, an <code>IllegalStateException</code> will be thrown.
         *
         * @throws IllegalStateException if the background color is not set.
         */
        public int[] getBackgroundRGB() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1229);
            __CLR4_5_2u5u5m68iyfte.R.inc(1230);if ((((!backgroundSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1231)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1232)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1233);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam9"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1234);return backgroundRGB;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        // tRNS chunk

        private int[] transparency;

        /**
         * Sets the RGB value to be used to denote transparency.
         *
         * <p> Setting this attribute will cause the alpha channel
         * of the input image to be ignored.
         *
         * <p> The 'tRNS' chunk will encode this information.
         */
        public void setTransparentRGB(int[] transparentRGB) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1235);
            __CLR4_5_2u5u5m68iyfte.R.inc(1236);transparency = transparentRGB.clone();
            __CLR4_5_2u5u5m68iyfte.R.inc(1237);transparencySet = true;
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

        /**
         * Returns the RGB value to be used to denote transparency.
         *
         * <p> If the transparent color has not previously been set,
         * or has been unset, an <code>IllegalStateException</code>
         * will be thrown.
         *
         * @throws IllegalStateException if the transparent color is not set.
         */
        public int[] getTransparentRGB() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1238);
            __CLR4_5_2u5u5m68iyfte.R.inc(1239);if ((((!transparencySet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1240)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1241)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1242);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam10"));
            }
            }__CLR4_5_2u5u5m68iyfte.R.inc(1243);return transparency.clone();
        }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}
    }

    protected int bitDepth;
    protected boolean bitDepthSet;

    /**
     * Sets the desired bit depth of an image.
     */
    public abstract void setBitDepth(int bitDepth);

    /**
     * Returns the desired bit depth for a grayscale image.
     *
     * <p> If the bit depth has not previously been set, or has been
     * unset, an <code>IllegalStateException</code> will be thrown.
     *
     * @throws IllegalStateException if the bit depth is not set.
     */
    public int getBitDepth() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1244);
        __CLR4_5_2u5u5m68iyfte.R.inc(1245);if ((((!bitDepthSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1246)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1247)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1248);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam11"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1249);return bitDepth;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the setting of the bit depth of a grayscale image.
     * The depth of the encoded image will be inferred from the source
     * image bit depth, rounded up to the next power of 2 between 1
     * and 16.
     */
    public void unsetBitDepth() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1250);
        __CLR4_5_2u5u5m68iyfte.R.inc(1251);bitDepthSet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    private boolean useInterlacing;

    /**
     * Turns Adam7 interlacing on or off.
     */
    public void setInterlacing(boolean useInterlacing) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1252);
        __CLR4_5_2u5u5m68iyfte.R.inc(1253);this.useInterlacing = useInterlacing;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns <code>true</code> if Adam7 interlacing will be used.
     */
    public boolean getInterlacing() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1254);
        __CLR4_5_2u5u5m68iyfte.R.inc(1255);return useInterlacing;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // bKGD chunk - delegate to subclasses

    // In JAI 1.0, 'backgroundSet' was private.  The JDK 1.2 compiler
    // was lenient and incorrectly allowed this variable to be
    // accessed from the subclasses.  The JDK 1.3 compiler correctly
    // flags this as a use of a non-static variable in a static
    // context.  Changing 'backgroundSet' to protected would have
    // solved the problem, but would have introduced a visible API
    // change.  Thus we are forced to adopt the solution of placing a
    // separate private variable in each subclass and providing
    // separate implementations of 'unsetBackground' and
    // 'isBackgroundSet' in each concrete subclass.

    /**
     * Suppresses the 'bKGD' chunk from being output.
     * For API compatibility with JAI 1.0, the superclass
     * defines this method to throw a <code>RuntimeException</code>;
     * accordingly, subclasses must provide their own implementations.
     */
    public void unsetBackground() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1256);
        __CLR4_5_2u5u5m68iyfte.R.inc(1257);throw new RuntimeException(PropertyUtil.getString("PNGEncodeParam23"));
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if a 'bKGD' chunk will be output.
     * For API compatibility with JAI 1.0, the superclass
     * defines this method to throw a <code>RuntimeException</code>;
     * accordingly, subclasses must provide their own implementations.
     */
    public boolean isBackgroundSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1258);
        __CLR4_5_2u5u5m68iyfte.R.inc(1259);throw new RuntimeException(PropertyUtil.getString("PNGEncodeParam24"));
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // cHRM chunk

    private float[] chromaticity;
    private boolean chromaticitySet;

    /**
     * Sets the white point and primary chromaticities in CIE (x, y)
     * space.
     *
     * <p> The <code>chromaticity</code> parameter should be a
     * <code>float</code> array of length 8 containing the white point
     * X and Y, red X and Y, green X and Y, and blue X and Y values in
     * order.
     *
     * <p> The 'cHRM' chunk will encode this information.
     */
    public void setChromaticity(float[] chromaticity) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1260);
        __CLR4_5_2u5u5m68iyfte.R.inc(1261);if ((((chromaticity.length != 8)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1262)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1263)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1264);throw new IllegalArgumentException(PropertyUtil.getString("PNGEncodeParam28"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1265);this.chromaticity = chromaticity.clone();
        __CLR4_5_2u5u5m68iyfte.R.inc(1266);chromaticitySet = true;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * A convenience method that calls the array version.
     */
    public void setChromaticity(float whitePointX, float whitePointY,
                                float redX, float redY,
                                float greenX, float greenY,
                                float blueX, float blueY) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1267);
        __CLR4_5_2u5u5m68iyfte.R.inc(1268);float[] chroma = new float[8];
        __CLR4_5_2u5u5m68iyfte.R.inc(1269);chroma[0] = whitePointX;
        __CLR4_5_2u5u5m68iyfte.R.inc(1270);chroma[1] = whitePointY;
        __CLR4_5_2u5u5m68iyfte.R.inc(1271);chroma[2] = redX;
        __CLR4_5_2u5u5m68iyfte.R.inc(1272);chroma[3] = redY;
        __CLR4_5_2u5u5m68iyfte.R.inc(1273);chroma[4] = greenX;
        __CLR4_5_2u5u5m68iyfte.R.inc(1274);chroma[5] = greenY;
        __CLR4_5_2u5u5m68iyfte.R.inc(1275);chroma[6] = blueX;
        __CLR4_5_2u5u5m68iyfte.R.inc(1276);chroma[7] = blueY;
        __CLR4_5_2u5u5m68iyfte.R.inc(1277);setChromaticity(chroma);
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the white point and primary chromaticities in
     * CIE (x, y) space.
     *
     * <p> See the documentation for the <code>setChromaticity</code>
     * method for the format of the returned data.
     *
     * <p> If the chromaticity has not previously been set, or has been
     * unset, an <code>IllegalStateException</code> will be thrown.
     *
     * @throws IllegalStateException if the chromaticity is not set.
     */
    public float[] getChromaticity() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1278);
        __CLR4_5_2u5u5m68iyfte.R.inc(1279);if ((((!chromaticitySet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1280)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1281)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1282);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam12"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1283);return chromaticity.clone();
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the 'cHRM' chunk from being output.
     */
    public void unsetChromaticity() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1284);
        __CLR4_5_2u5u5m68iyfte.R.inc(1285);chromaticity = null;
        __CLR4_5_2u5u5m68iyfte.R.inc(1286);chromaticitySet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if a 'cHRM' chunk will be output.
     */
    public boolean isChromaticitySet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1287);
        __CLR4_5_2u5u5m68iyfte.R.inc(1288);return chromaticitySet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // gAMA chunk

    private float gamma;
    private boolean gammaSet;

    /**
     * Sets the file gamma value for the image.
     *
     * <p> The 'gAMA' chunk will encode this information.
     */
    public void setGamma(float gamma) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1289);
        __CLR4_5_2u5u5m68iyfte.R.inc(1290);this.gamma = gamma;
        __CLR4_5_2u5u5m68iyfte.R.inc(1291);gammaSet = true;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the file gamma value for the image.
     *
     * <p> If the file gamma has not previously been set, or has been
     * unset, an <code>IllegalStateException</code> will be thrown.
     *
     * @throws IllegalStateException if the gamma is not set.
     */
    public float getGamma() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1292);
        __CLR4_5_2u5u5m68iyfte.R.inc(1293);if ((((!gammaSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1294)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1295)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1296);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam13"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1297);return gamma;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the 'gAMA' chunk from being output.
     */
    public void unsetGamma() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1298);
        __CLR4_5_2u5u5m68iyfte.R.inc(1299);gammaSet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if a 'gAMA' chunk will be output.
     */
    public boolean isGammaSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1300);
        __CLR4_5_2u5u5m68iyfte.R.inc(1301);return gammaSet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // hIST chunk

    private int[] paletteHistogram;
    private boolean paletteHistogramSet;

    /**
     * Sets the palette histogram to be stored with this image.
     * The histogram consists of an array of integers, one per
     * palette entry.
     *
     * <p> The 'hIST' chunk will encode this information.
     */
    public void setPaletteHistogram(int[] paletteHistogram) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1302);
        __CLR4_5_2u5u5m68iyfte.R.inc(1303);this.paletteHistogram = paletteHistogram.clone();
        __CLR4_5_2u5u5m68iyfte.R.inc(1304);paletteHistogramSet = true;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the palette histogram to be stored with this image.
     *
     * <p> If the histogram has not previously been set, or has been
     * unset, an <code>IllegalStateException</code> will be thrown.
     *
     * @throws IllegalStateException if the histogram is not set.
     */
    public int[] getPaletteHistogram() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1305);
        __CLR4_5_2u5u5m68iyfte.R.inc(1306);if ((((!paletteHistogramSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1307)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1308)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1309);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam14"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1310);return paletteHistogram;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the 'hIST' chunk from being output.
     */
    public void unsetPaletteHistogram() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1311);
        __CLR4_5_2u5u5m68iyfte.R.inc(1312);paletteHistogram = null;
        __CLR4_5_2u5u5m68iyfte.R.inc(1313);paletteHistogramSet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if a 'hIST' chunk will be output.
     */
    public boolean isPaletteHistogramSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1314);
        __CLR4_5_2u5u5m68iyfte.R.inc(1315);return paletteHistogramSet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // iCCP chunk

    private byte[] iccProfileData;
    private boolean iccProfileDataSet;

    /**
     * Sets the ICC profile data to be stored with this image.
     * The profile is represented in raw binary form.
     *
     * <p> The 'iCCP' chunk will encode this information.
     */
    public void setICCProfileData(byte[] iccProfileData) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1316);
        __CLR4_5_2u5u5m68iyfte.R.inc(1317);this.iccProfileData = iccProfileData.clone();
        __CLR4_5_2u5u5m68iyfte.R.inc(1318);iccProfileDataSet = true;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the ICC profile data to be stored with this image.
     *
     * <p> If the ICC profile has not previously been set, or has been
     * unset, an <code>IllegalStateException</code> will be thrown.
     *
     * @throws IllegalStateException if the ICC profile is not set.
     */
    public byte[] getICCProfileData() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1319);
        __CLR4_5_2u5u5m68iyfte.R.inc(1320);if ((((!iccProfileDataSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1321)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1322)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1323);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam15"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1324);return iccProfileData.clone();
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the 'iCCP' chunk from being output.
     */
    public void unsetICCProfileData() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1325);
        __CLR4_5_2u5u5m68iyfte.R.inc(1326);iccProfileData = null;
        __CLR4_5_2u5u5m68iyfte.R.inc(1327);iccProfileDataSet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if a 'iCCP' chunk will be output.
     */
    public boolean isICCProfileDataSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1328);
        __CLR4_5_2u5u5m68iyfte.R.inc(1329);return iccProfileDataSet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // pHYS chunk

    private int[] physicalDimension;
    private boolean physicalDimensionSet;

    /**
     * Sets the physical dimension information to be stored with this
     * image.  The physicalDimension parameter should be a 3-entry
     * array containing the number of pixels per unit in the X
     * direction, the number of pixels per unit in the Y direction,
     * and the unit specifier (0 = unknown, 1 = meters).
     *
     * <p> The 'pHYS' chunk will encode this information.
     */
    public void setPhysicalDimension(int[] physicalDimension) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1330);
        __CLR4_5_2u5u5m68iyfte.R.inc(1331);this.physicalDimension = physicalDimension.clone();
        __CLR4_5_2u5u5m68iyfte.R.inc(1332);physicalDimensionSet = true;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * A convenience method that calls the array version.
     */
    public void setPhysicalDimension(int xPixelsPerUnit,
                                     int yPixelsPerUnit,
                                     int unitSpecifier) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1333);
        __CLR4_5_2u5u5m68iyfte.R.inc(1334);int[] pd = new int[3];
        __CLR4_5_2u5u5m68iyfte.R.inc(1335);pd[0] = xPixelsPerUnit;
        __CLR4_5_2u5u5m68iyfte.R.inc(1336);pd[1] = yPixelsPerUnit;
        __CLR4_5_2u5u5m68iyfte.R.inc(1337);pd[2] = unitSpecifier;

        __CLR4_5_2u5u5m68iyfte.R.inc(1338);setPhysicalDimension(pd);
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the physical dimension information to be stored
     * with this image.
     *
     * <p> If the physical dimension information has not previously
     * been set, or has been unset, an
     * <code>IllegalStateException</code> will be thrown.
     *
     * @throws IllegalStateException if the physical dimension information
     *        is not set.
     */
    public int[] getPhysicalDimension() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1339);
        __CLR4_5_2u5u5m68iyfte.R.inc(1340);if ((((!physicalDimensionSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1341)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1342)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1343);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam16"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1344);return physicalDimension.clone();
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the 'pHYS' chunk from being output.
     */
    public void unsetPhysicalDimension() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1345);
        __CLR4_5_2u5u5m68iyfte.R.inc(1346);physicalDimension = null;
        __CLR4_5_2u5u5m68iyfte.R.inc(1347);physicalDimensionSet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if a 'pHYS' chunk will be output.
     */
    public boolean isPhysicalDimensionSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1348);
        __CLR4_5_2u5u5m68iyfte.R.inc(1349);return physicalDimensionSet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // sPLT chunk

    private PNGSuggestedPaletteEntry[] suggestedPalette;
    private boolean suggestedPaletteSet;

    /**
     * Sets the suggested palette information to be stored with this
     * image.  The information is passed to this method as an array of
     * <code>PNGSuggestedPaletteEntry</code> objects.
     *
     * <p> The 'sPLT' chunk will encode this information.
     */
    public void setSuggestedPalette(PNGSuggestedPaletteEntry[] palette) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1350);
        __CLR4_5_2u5u5m68iyfte.R.inc(1351);suggestedPalette = palette.clone();
        __CLR4_5_2u5u5m68iyfte.R.inc(1352);suggestedPaletteSet = true;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the suggested palette information to be stored with this
     * image.
     *
     * <p> If the suggested palette information has not previously
     * been set, or has been unset, an
     * <code>IllegalStateException</code> will be thrown.
     *
     * @throws IllegalStateException if the suggested palette
     *        information is not set.
     */
    public PNGSuggestedPaletteEntry[] getSuggestedPalette() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1353);
        __CLR4_5_2u5u5m68iyfte.R.inc(1354);if ((((!suggestedPaletteSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1355)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1356)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1357);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam17"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1358);return suggestedPalette.clone();
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the 'sPLT' chunk from being output.
     */
    public void unsetSuggestedPalette() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1359);
        __CLR4_5_2u5u5m68iyfte.R.inc(1360);suggestedPalette = null;
        __CLR4_5_2u5u5m68iyfte.R.inc(1361);suggestedPaletteSet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if a 'sPLT' chunk will be output.
     */
    public boolean isSuggestedPaletteSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1362);
        __CLR4_5_2u5u5m68iyfte.R.inc(1363);return suggestedPaletteSet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // sBIT chunk

    private int[] significantBits;
    private boolean significantBitsSet;

    /**
     * Sets the number of significant bits for each band of the image.
     *
     * <p> The number of entries in the <code>significantBits</code>
     * array must be equal to the number of output bands in the image:
     * 1 for a gray image, 2 for gray+alpha, 3 for index or truecolor,
     * and 4 for truecolor+alpha.
     *
     * <p> The 'sBIT' chunk will encode this information.
     */
    public void setSignificantBits(int[] significantBits) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1364);
        __CLR4_5_2u5u5m68iyfte.R.inc(1365);this.significantBits = significantBits.clone();
        __CLR4_5_2u5u5m68iyfte.R.inc(1366);significantBitsSet = true;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the number of significant bits for each band of the image.
     *
     * <p> If the significant bits values have not previously been
     * set, or have been unset, an <code>IllegalStateException</code>
     * will be thrown.
     *
     * @throws IllegalStateException if the significant bits values are
     *        not set.
     */
    public int[] getSignificantBits() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1367);
        __CLR4_5_2u5u5m68iyfte.R.inc(1368);if ((((!significantBitsSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1369)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1370)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1371);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam18"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1372);return significantBits.clone();
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the 'sBIT' chunk from being output.
     */
    public void unsetSignificantBits() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1373);
        __CLR4_5_2u5u5m68iyfte.R.inc(1374);significantBits = null;
        __CLR4_5_2u5u5m68iyfte.R.inc(1375);significantBitsSet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if an 'sBIT' chunk will be output.
     */
    public boolean isSignificantBitsSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1376);
        __CLR4_5_2u5u5m68iyfte.R.inc(1377);return significantBitsSet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // sRGB chunk

    private int srgbIntent;
    private boolean srgbIntentSet;

    /**
     * Sets the sRGB rendering intent to be stored with this image.
     * The legal values are 0 = Perceptual, 1 = Relative Colorimetric,
     * 2 = Saturation, and 3 = Absolute Colorimetric.  Refer to the
     * PNG specification for information on these values.
     *
     * <p> The 'sRGB' chunk will encode this information.
     */
    public void setSRGBIntent(int srgbIntent) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1378);
        __CLR4_5_2u5u5m68iyfte.R.inc(1379);this.srgbIntent = srgbIntent;
        __CLR4_5_2u5u5m68iyfte.R.inc(1380);srgbIntentSet = true;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the sRGB rendering intent to be stored with this image.
     *
     * <p> If the sRGB intent has not previously been set, or has been
     * unset, an <code>IllegalStateException</code> will be thrown.
     *
     * @throws IllegalStateException if the sRGB intent is not set.
     */
    public int getSRGBIntent() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1381);
        __CLR4_5_2u5u5m68iyfte.R.inc(1382);if ((((!srgbIntentSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1383)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1384)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1385);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam19"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1386);return srgbIntent;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the 'sRGB' chunk from being output.
     */
    public void unsetSRGBIntent() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1387);
        __CLR4_5_2u5u5m68iyfte.R.inc(1388);srgbIntentSet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if an 'sRGB' chunk will be output.
     */
    public boolean isSRGBIntentSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1389);
        __CLR4_5_2u5u5m68iyfte.R.inc(1390);return srgbIntentSet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // tEXt chunk

    private String[] text;
    private boolean textSet;

    /**
     * Sets the textual data to be stored in uncompressed form with this
     * image.  The data is passed to this method as an array of
     * <code>String</code>s.
     *
     * <p> The 'tEXt' chunk will encode this information.
     */
    public void setText(String[] text) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1391);
        __CLR4_5_2u5u5m68iyfte.R.inc(1392);this.text = text;
        __CLR4_5_2u5u5m68iyfte.R.inc(1393);textSet = true;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the text strings to be stored in uncompressed form with this
     * image as an array of <code>String</code>s.
     *
     * <p> If the text strings have not previously been set, or have been
     * unset, an <code>IllegalStateException</code> will be thrown.
     *
     * @throws IllegalStateException if the text strings are not set.
     */
    public String[] getText() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1394);
        __CLR4_5_2u5u5m68iyfte.R.inc(1395);if ((((!textSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1396)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1397)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1398);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam20"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1399);return text;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the 'tEXt' chunk from being output.
     */
    public void unsetText() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1400);
        __CLR4_5_2u5u5m68iyfte.R.inc(1401);text = null;
        __CLR4_5_2u5u5m68iyfte.R.inc(1402);textSet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if a 'tEXt' chunk will be output.
     */
    public boolean isTextSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1403);
        __CLR4_5_2u5u5m68iyfte.R.inc(1404);return textSet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // tIME chunk

    private Date modificationTime;
    private boolean modificationTimeSet;

    /**
     * Sets the modification time, as a <code>Date</code>, to be
     * stored with this image.  The internal storage format will use
     * UTC regardless of how the <code>modificationTime</code>
     * parameter was created.
     *
     * <p> The 'tIME' chunk will encode this information.
     */
    public void setModificationTime(Date modificationTime) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1405);
        __CLR4_5_2u5u5m68iyfte.R.inc(1406);this.modificationTime = modificationTime;
        __CLR4_5_2u5u5m68iyfte.R.inc(1407);modificationTimeSet = true;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the modification time to be stored with this image.
     *
     * <p> If the bit depth has not previously been set, or has been
     * unset, an <code>IllegalStateException</code> will be thrown.
     *
     * @throws IllegalStateException if the bit depth is not set.
     */
    public Date getModificationTime() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1408);
        __CLR4_5_2u5u5m68iyfte.R.inc(1409);if ((((!modificationTimeSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1410)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1411)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1412);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam21"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1413);return modificationTime;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the 'tIME' chunk from being output.
     */
    public void unsetModificationTime() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1414);
        __CLR4_5_2u5u5m68iyfte.R.inc(1415);modificationTime = null;
        __CLR4_5_2u5u5m68iyfte.R.inc(1416);modificationTimeSet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if a 'tIME' chunk will be output.
     */
    public boolean isModificationTimeSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1417);
        __CLR4_5_2u5u5m68iyfte.R.inc(1418);return modificationTimeSet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // tRNS chunk

    boolean transparencySet;

    /**
     * Suppresses the 'tRNS' chunk from being output.
     */
    public void unsetTransparency() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1419);
        __CLR4_5_2u5u5m68iyfte.R.inc(1420);transparencySet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if a 'tRNS' chunk will be output.
     */
    public boolean isTransparencySet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1421);
        __CLR4_5_2u5u5m68iyfte.R.inc(1422);return transparencySet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // zTXT chunk

    private String[] zText;
    private boolean zTextSet;

    /**
     * Sets the text strings to be stored in compressed form with this
     * image.  The data is passed to this method as an array of
     * <code>String</code>s.
     *
     * <p> The 'zTXt' chunk will encode this information.
     */
    public void setCompressedText(String[] text) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1423);
        __CLR4_5_2u5u5m68iyfte.R.inc(1424);this.zText = text;
        __CLR4_5_2u5u5m68iyfte.R.inc(1425);zTextSet = true;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the text strings to be stored in compressed form with
     * this image as an array of <code>String</code>s.
     *
     * <p> If the compressed text strings have not previously been
     * set, or have been unset, an <code>IllegalStateException</code>
     * will be thrown.
     *
     * @throws IllegalStateException if the compressed text strings are
     *        not set.
     */
    public String[] getCompressedText() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1426);
        __CLR4_5_2u5u5m68iyfte.R.inc(1427);if ((((!zTextSet)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1428)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1429)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1430);throw new IllegalStateException(PropertyUtil.getString("PNGEncodeParam22"));
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1431);return zText;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Suppresses the 'zTXt' chunk from being output.
     */
    public void unsetCompressedText() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1432);
        __CLR4_5_2u5u5m68iyfte.R.inc(1433);zText = null;
        __CLR4_5_2u5u5m68iyfte.R.inc(1434);zTextSet = false;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns true if a 'zTXT' chunk will be output.
     */
    public boolean isCompressedTextSet() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1435);
        __CLR4_5_2u5u5m68iyfte.R.inc(1436);return zTextSet;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    // Other chunk types

    List chunkType = new ArrayList();
    List chunkData = new ArrayList();

    /**
     * Adds a private chunk, in binary form, to the list of chunks to
     * be stored with this image.
     *
     * @param type a 4-character String giving the chunk type name.
     * @param data an array of <code>byte</code>s containing the
     *        chunk data.
     */
    public synchronized void addPrivateChunk(String type, byte[] data) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1437);
        __CLR4_5_2u5u5m68iyfte.R.inc(1438);chunkType.add(type);
        __CLR4_5_2u5u5m68iyfte.R.inc(1439);chunkData.add(data.clone());
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the number of private chunks to be written to the
     * output file.
     */
    public synchronized int getNumPrivateChunks() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1440);
        __CLR4_5_2u5u5m68iyfte.R.inc(1441);return chunkType.size();
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the type of the private chunk at a given index, as a
     * 4-character <code>String</code>.  The index must be smaller
     * than the return value of <code>getNumPrivateChunks</code>.
     */
    public synchronized String getPrivateChunkType(int index) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1442);
        __CLR4_5_2u5u5m68iyfte.R.inc(1443);return (String)chunkType.get(index);
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Returns the data associated of the private chunk at a given
     * index, as an array of <code>byte</code>s.  The index must be
     * smaller than the return value of
     * <code>getNumPrivateChunks</code>.
     */
    public synchronized byte[] getPrivateChunkData(int index) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1444);
        __CLR4_5_2u5u5m68iyfte.R.inc(1445);return (byte[])chunkData.get(index);
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Remove all private chunks associated with this parameter instance
     * whose 'safe-to-copy' bit is not set.  This may be advisable when
     * transcoding PNG images.
     */
    public synchronized void removeUnsafeToCopyPrivateChunks() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1446);
        __CLR4_5_2u5u5m68iyfte.R.inc(1447);List newChunkType = new ArrayList();
        __CLR4_5_2u5u5m68iyfte.R.inc(1448);List newChunkData = new ArrayList();

        __CLR4_5_2u5u5m68iyfte.R.inc(1449);int len = getNumPrivateChunks();
        __CLR4_5_2u5u5m68iyfte.R.inc(1450);for (int i = 0; (((i < len)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1451)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1452)==0&false)); i++) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1453);String type = getPrivateChunkType(i);
            __CLR4_5_2u5u5m68iyfte.R.inc(1454);char lastChar = type.charAt(3);
            __CLR4_5_2u5u5m68iyfte.R.inc(1455);if ((((lastChar >= 'a' && lastChar <= 'z')&&(__CLR4_5_2u5u5m68iyfte.R.iget(1456)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1457)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1458);newChunkType.add(type);
                __CLR4_5_2u5u5m68iyfte.R.inc(1459);newChunkData.add(getPrivateChunkData(i));
            }
        }}

        }__CLR4_5_2u5u5m68iyfte.R.inc(1460);chunkType = newChunkType;
        __CLR4_5_2u5u5m68iyfte.R.inc(1461);chunkData = newChunkData;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Remove all private chunks associated with this parameter instance.
     */
    public synchronized void removeAllPrivateChunks() {try{__CLR4_5_2u5u5m68iyfte.R.inc(1462);
        __CLR4_5_2u5u5m68iyfte.R.inc(1463);chunkType = new ArrayList();
        __CLR4_5_2u5u5m68iyfte.R.inc(1464);chunkData = new ArrayList();
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * An abs() function for use by the Paeth predictor.
     */
    private static int abs(int x) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1465);
        __CLR4_5_2u5u5m68iyfte.R.inc(1466);return ((((x < 0) )&&(__CLR4_5_2u5u5m68iyfte.R.iget(1467)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1468)==0&false))? -x : x;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * The Paeth predictor routine used in PNG encoding.  This routine
     * is included as a convenience to subclasses that override the
     * <code>filterRow</code> method.
     */
    public static int paethPredictor(int a, int b, int c) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1469);
        __CLR4_5_2u5u5m68iyfte.R.inc(1470);int p = a + b - c;
        __CLR4_5_2u5u5m68iyfte.R.inc(1471);int pa = abs(p - a);
        __CLR4_5_2u5u5m68iyfte.R.inc(1472);int pb = abs(p - b);
        __CLR4_5_2u5u5m68iyfte.R.inc(1473);int pc = abs(p - c);

        __CLR4_5_2u5u5m68iyfte.R.inc(1474);if (((((pa <= pb) && (pa <= pc))&&(__CLR4_5_2u5u5m68iyfte.R.iget(1475)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1476)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1477);return a;
        } }else {__CLR4_5_2u5u5m68iyfte.R.inc(1478);if ((((pb <= pc)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1479)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1480)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1481);return b;
        } }else {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1482);return c;
        }
    }}}finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}

    /**
     * Performs filtering on a row of an image.  This method may be
     * overridden in order to provide a custom algorithm for choosing
     * the filter type for a given row.
     *
     * <p> The method is supplied with the current and previous rows
     * of the image.  For the first row of the image, or of an
     * interlacing pass, the previous row array will be filled with
     * zeros as required by the PNG specification.
     *
     * <p> The method is also supplied with five scratch arrays.
     * These arrays may be used within the method for any purpose.
     * At method exit, the array at the index given by the return
     * value of the method should contain the filtered data.  The
     * return value will also be used as the filter type.
     *
     * <p> The default implementation of the method performs a trial
     * encoding with each of the filter types, and computes the sum of
     * absolute values of the differences between the raw bytes of the
     * current row and the predicted values.  The index of the filter
     * producing the smallest result is returned.
     *
     * <p> As an example, to perform only 'sub' filtering, this method
     * could be implemented (non-optimally) as follows:
     *
     * <pre>
     * for (int i = bytesPerPixel; i &lt; bytesPerRow + bytesPerPixel; i++) {
     *     int curr = currRow[i] &amp; 0xff;
     *     int left = currRow[i - bytesPerPixel] &amp; 0xff;
     *     scratchRow[PNG_FILTER_SUB][i] = (byte)(curr - left);
     * }
     * return PNG_FILTER_SUB;
     * </pre>
     *
     * @param currRow The current row as an array of <code>byte</code>s
     *        of length at least <code>bytesPerRow + bytesPerPixel</code>.
     *        The pixel data starts at index <code>bytesPerPixel</code>;
     *        the initial <code>bytesPerPixel</code> bytes are zero.
     * @param prevRow The current row as an array of <code>byte</code>s
     *        The pixel data starts at index <code>bytesPerPixel</code>;
     *        the initial <code>bytesPerPixel</code> bytes are zero.
     * @param scratchRows An array of 5 <code>byte</code> arrays of
     *        length at least <code>bytesPerRow +
     *        bytesPerPixel</code>, useable to hold temporary results.
     *        The filtered row will be returned as one of the entries
     *        of this array.  The returned filtered data should start
     *        at index <code>bytesPerPixel</code>; The initial
     *        <code>bytesPerPixel</code> bytes are not used.
     * @param bytesPerRow The number of bytes in the image row.
     *        This value will always be greater than 0.
     * @param bytesPerPixel The number of bytes representing a single
     *        pixel, rounded up to an integer.  This is the 'bpp' parameter
     *        described in the PNG specification.
     *
     * @return The filter type to be used.  The entry of
     *         <code>scratchRows[]</code> at this index holds the
     *         filtered data.  */
    public int filterRow(byte[] currRow,
                         byte[] prevRow,
                         byte[][] scratchRows,
                         int bytesPerRow,
                         int bytesPerPixel) {try{__CLR4_5_2u5u5m68iyfte.R.inc(1483);

        __CLR4_5_2u5u5m68iyfte.R.inc(1484);int [] badness = {0, 0, 0, 0, 0};
        __CLR4_5_2u5u5m68iyfte.R.inc(1485);int curr;
        __CLR4_5_2u5u5m68iyfte.R.inc(1486);int left;
        __CLR4_5_2u5u5m68iyfte.R.inc(1487);int up;
        __CLR4_5_2u5u5m68iyfte.R.inc(1488);int upleft;
        __CLR4_5_2u5u5m68iyfte.R.inc(1489);int diff;
        __CLR4_5_2u5u5m68iyfte.R.inc(1490);int pa;
        __CLR4_5_2u5u5m68iyfte.R.inc(1491);int pb;
        __CLR4_5_2u5u5m68iyfte.R.inc(1492);int pc;
        __CLR4_5_2u5u5m68iyfte.R.inc(1493);for (int i = bytesPerPixel; (((i < bytesPerRow + bytesPerPixel)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1494)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1495)==0&false)); i++) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1496);curr   = currRow[i] & 0xff;
            __CLR4_5_2u5u5m68iyfte.R.inc(1497);left   = currRow[i - bytesPerPixel] & 0xff;
            __CLR4_5_2u5u5m68iyfte.R.inc(1498);up     = prevRow[i] & 0xff;
            __CLR4_5_2u5u5m68iyfte.R.inc(1499);upleft = prevRow[i - bytesPerPixel] & 0xff;

            // no filter
            __CLR4_5_2u5u5m68iyfte.R.inc(1500);badness[0] += curr;

            // sub filter
            __CLR4_5_2u5u5m68iyfte.R.inc(1501);diff = curr - left;
            __CLR4_5_2u5u5m68iyfte.R.inc(1502);scratchRows[1][i]  = (byte)diff;
            __CLR4_5_2u5u5m68iyfte.R.inc(1503);badness    [1]    +=   ((((diff > 0) )&&(__CLR4_5_2u5u5m68iyfte.R.iget(1504)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1505)==0&false))? diff : -diff;

            // up filter
            __CLR4_5_2u5u5m68iyfte.R.inc(1506);diff = curr - up;
            __CLR4_5_2u5u5m68iyfte.R.inc(1507);scratchRows[2][i]  = (byte)diff;
            __CLR4_5_2u5u5m68iyfte.R.inc(1508);badness    [2]    +=   ((((diff >= 0) )&&(__CLR4_5_2u5u5m68iyfte.R.iget(1509)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1510)==0&false))? diff : -diff;

            // average filter
            __CLR4_5_2u5u5m68iyfte.R.inc(1511);diff = curr - ((left + up) >> 1);
            __CLR4_5_2u5u5m68iyfte.R.inc(1512);scratchRows[3][i]  = (byte)diff;
            __CLR4_5_2u5u5m68iyfte.R.inc(1513);badness    [3]    +=   ((((diff >= 0) )&&(__CLR4_5_2u5u5m68iyfte.R.iget(1514)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1515)==0&false))? diff : -diff;

            // paeth filter

            // Original code much simplier but doesn't take full
            // advantage of relationship between pa/b/c and
            // information gleaned in abs operations.
            /// pa = up  -upleft;
            /// pb = left-upleft;
            /// pc = pa+pb;
            /// pa = abs(pa);
            /// pb = abs(pb);
            /// pc = abs(pc);
            /// if ((pa <= pb) && (pa <= pc))
            ///   diff = curr-left;
            /// else if (pb <= pc)
            ///   diff = curr-up;
            /// else
            ///   diff = curr-upleft;

            __CLR4_5_2u5u5m68iyfte.R.inc(1516);pa = up  - upleft;
            __CLR4_5_2u5u5m68iyfte.R.inc(1517);pb = left - upleft;
            __CLR4_5_2u5u5m68iyfte.R.inc(1518);if ((((pa < 0)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1519)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1520)==0&false))) {{
              __CLR4_5_2u5u5m68iyfte.R.inc(1521);if ((((pb < 0)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1522)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1523)==0&false))) {{
                // both pa & pb neg so pc is always greater than or
                // equal to pa or pb;
                __CLR4_5_2u5u5m68iyfte.R.inc(1524);if ((((pa >= pb)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1525)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1526)==0&false))) {{ // since pa & pb neg check sense is reversed.
                  __CLR4_5_2u5u5m68iyfte.R.inc(1527);diff = curr - left;
                } }else {{
                  __CLR4_5_2u5u5m68iyfte.R.inc(1528);diff = curr - up;
                }
              }} }else {{
                // pa neg pb pos so we must compute pc...
                __CLR4_5_2u5u5m68iyfte.R.inc(1529);pc = pa + pb;
                __CLR4_5_2u5u5m68iyfte.R.inc(1530);pa = -pa;
                __CLR4_5_2u5u5m68iyfte.R.inc(1531);if ((((pa <= pb)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1532)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1533)==0&false))) {{ // pc is positive and less than pb
                  __CLR4_5_2u5u5m68iyfte.R.inc(1534);if ((((pa <= pc)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1535)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1536)==0&false))) {{
                    __CLR4_5_2u5u5m68iyfte.R.inc(1537);diff = curr - left;
                  } }else {{
                    __CLR4_5_2u5u5m68iyfte.R.inc(1538);diff = curr - upleft;
                  }
                }} }else {{
                  // pc is negative and less than or equal to pa,
                  // but since pa is greater than pb this isn't an issue...
                  __CLR4_5_2u5u5m68iyfte.R.inc(1539);if ((((pb <= -pc)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1540)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1541)==0&false))) {{
                    __CLR4_5_2u5u5m68iyfte.R.inc(1542);diff = curr - up;
                  } }else {{
                    __CLR4_5_2u5u5m68iyfte.R.inc(1543);diff = curr - upleft;
                  }
                }}
              }}
            }} }else {{
              __CLR4_5_2u5u5m68iyfte.R.inc(1544);if ((((pb < 0)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1545)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1546)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1547);pb = -pb; // make it positive...
                __CLR4_5_2u5u5m68iyfte.R.inc(1548);if ((((pa <= pb)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1549)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1550)==0&false))) {{
                  // pc would be negative and less than or equal to pb
                  __CLR4_5_2u5u5m68iyfte.R.inc(1551);pc = pb - pa;
                  __CLR4_5_2u5u5m68iyfte.R.inc(1552);if ((((pa <= pc)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1553)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1554)==0&false))) {{
                    __CLR4_5_2u5u5m68iyfte.R.inc(1555);diff = curr - left;
                  } }else {__CLR4_5_2u5u5m68iyfte.R.inc(1556);if ((((pb == pc)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1557)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1558)==0&false))) {{
                    // if pa is zero then pc==pb otherwise
                    // pc must be less than pb.
                    __CLR4_5_2u5u5m68iyfte.R.inc(1559);diff = curr - up;
                  } }else {{
                    __CLR4_5_2u5u5m68iyfte.R.inc(1560);diff = curr - upleft;
                  }
                }}} }else {{
                  // pc would be positive and less than pa.
                  __CLR4_5_2u5u5m68iyfte.R.inc(1561);pc = pa - pb;
                  __CLR4_5_2u5u5m68iyfte.R.inc(1562);if ((((pb <= pc)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1563)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1564)==0&false))) {{
                    __CLR4_5_2u5u5m68iyfte.R.inc(1565);diff = curr - up;
                  } }else {{
                    __CLR4_5_2u5u5m68iyfte.R.inc(1566);diff = curr - upleft;
                  }
                }}
              }} }else {{
                // both pos so pa+pb is always greater than pa/pb
                __CLR4_5_2u5u5m68iyfte.R.inc(1567);if ((((pa <= pb)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1568)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1569)==0&false))) {{
                  __CLR4_5_2u5u5m68iyfte.R.inc(1570);diff = curr - left;
                } }else {{
                  __CLR4_5_2u5u5m68iyfte.R.inc(1571);diff = curr - up;
                }
              }}
            }}
            }__CLR4_5_2u5u5m68iyfte.R.inc(1572);scratchRows[4][i]  = (byte)diff;
            __CLR4_5_2u5u5m68iyfte.R.inc(1573);badness    [4]    +=   ((((diff >= 0) )&&(__CLR4_5_2u5u5m68iyfte.R.iget(1574)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1575)==0&false))? diff : -diff;
        }
        }__CLR4_5_2u5u5m68iyfte.R.inc(1576);int filterType = 0;
        __CLR4_5_2u5u5m68iyfte.R.inc(1577);int minBadness = badness[0];

        __CLR4_5_2u5u5m68iyfte.R.inc(1578);for (int i = 1; (((i < 5)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1579)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1580)==0&false)); i++) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1581);if ((((badness[i] < minBadness)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1582)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1583)==0&false))) {{
                __CLR4_5_2u5u5m68iyfte.R.inc(1584);minBadness = badness[i];
                __CLR4_5_2u5u5m68iyfte.R.inc(1585);filterType = i;
            }
        }}

        }__CLR4_5_2u5u5m68iyfte.R.inc(1586);if ((((filterType == 0)&&(__CLR4_5_2u5u5m68iyfte.R.iget(1587)!=0|true))||(__CLR4_5_2u5u5m68iyfte.R.iget(1588)==0&false))) {{
            __CLR4_5_2u5u5m68iyfte.R.inc(1589);System.arraycopy(currRow, bytesPerPixel,
                             scratchRows[0], bytesPerPixel,
                             bytesPerRow);
        }

        }__CLR4_5_2u5u5m68iyfte.R.inc(1590);return filterType;
    }finally{__CLR4_5_2u5u5m68iyfte.R.flushNeeded();}}
}
