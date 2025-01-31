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

import org.apache.xmlgraphics.image.codec.util.PropertyUtil;

@java.lang.SuppressWarnings({"fallthrough"}) enum ImageType {
    UNSUPPORTED(-1),
    BILEVEL_WHITE_IS_ZERO(0),
    BILEVEL_BLACK_IS_ZERO(1),
    GRAY(1),
    PALETTE(3),
    RGB(2),
    CMYK(5),
    YCBCR(6),
    CIELAB(8),
    GENERIC(1);

    private final int photometricInterpretation;

    private ImageType(int photometricInterpretation) {try{__CLR4_5_23xk3xkm6lb4yih.R.inc(5096);
        __CLR4_5_23xk3xkm6lb4yih.R.inc(5097);this.photometricInterpretation = photometricInterpretation;
    }finally{__CLR4_5_23xk3xkm6lb4yih.R.flushNeeded();}}

    int getPhotometricInterpretation() {try{__CLR4_5_23xk3xkm6lb4yih.R.inc(5098);
        __CLR4_5_23xk3xkm6lb4yih.R.inc(5099);return photometricInterpretation;
    }finally{__CLR4_5_23xk3xkm6lb4yih.R.flushNeeded();}}

    static ImageType getTypeFromRGB(int mapSize, byte[] r, byte[] g, byte[] b,
            int dataTypeSize, int numBands) {try{__CLR4_5_23xk3xkm6lb4yih.R.inc(5100);
        __CLR4_5_23xk3xkm6lb4yih.R.inc(5101);if ((((numBands == 1)&&(__CLR4_5_23xk3xkm6lb4yih.R.iget(5102)!=0|true))||(__CLR4_5_23xk3xkm6lb4yih.R.iget(5103)==0&false))) {{
            __CLR4_5_23xk3xkm6lb4yih.R.inc(5104);if ((((dataTypeSize == 1)&&(__CLR4_5_23xk3xkm6lb4yih.R.iget(5105)!=0|true))||(__CLR4_5_23xk3xkm6lb4yih.R.iget(5106)==0&false))) {{ // Bilevel image
                __CLR4_5_23xk3xkm6lb4yih.R.inc(5107);if ((((mapSize != 2)&&(__CLR4_5_23xk3xkm6lb4yih.R.iget(5108)!=0|true))||(__CLR4_5_23xk3xkm6lb4yih.R.iget(5109)==0&false))) {{
                    __CLR4_5_23xk3xkm6lb4yih.R.inc(5110);throw new IllegalArgumentException(PropertyUtil.getString("TIFFImageEncoder7"));
                }

                }__CLR4_5_23xk3xkm6lb4yih.R.inc(5111);if ((((isBlackZero(r, g, b))&&(__CLR4_5_23xk3xkm6lb4yih.R.iget(5112)!=0|true))||(__CLR4_5_23xk3xkm6lb4yih.R.iget(5113)==0&false))) {{
                    __CLR4_5_23xk3xkm6lb4yih.R.inc(5114);return BILEVEL_BLACK_IS_ZERO;
                } }else {__CLR4_5_23xk3xkm6lb4yih.R.inc(5115);if ((((isWhiteZero(r, g, b))&&(__CLR4_5_23xk3xkm6lb4yih.R.iget(5116)!=0|true))||(__CLR4_5_23xk3xkm6lb4yih.R.iget(5117)==0&false))) {{
                    __CLR4_5_23xk3xkm6lb4yih.R.inc(5118);return BILEVEL_WHITE_IS_ZERO;
                }
            }}}
            }__CLR4_5_23xk3xkm6lb4yih.R.inc(5119);return PALETTE;
        }
        }__CLR4_5_23xk3xkm6lb4yih.R.inc(5120);return UNSUPPORTED;
    }finally{__CLR4_5_23xk3xkm6lb4yih.R.flushNeeded();}}

    private static boolean rgbIsValueAt(byte[] r, byte[] g, byte[] b, byte value, int i) {try{__CLR4_5_23xk3xkm6lb4yih.R.inc(5121);
        __CLR4_5_23xk3xkm6lb4yih.R.inc(5122);return r[i] == value && g[i] == value && b[i] == value;
    }finally{__CLR4_5_23xk3xkm6lb4yih.R.flushNeeded();}}

    private static boolean bilevelColorValue(byte[] r, byte[] g, byte[] b, int blackValue,
            int whiteValue) {try{__CLR4_5_23xk3xkm6lb4yih.R.inc(5123);
        __CLR4_5_23xk3xkm6lb4yih.R.inc(5124);return rgbIsValueAt(r, g, b, (byte) blackValue, 0)
                && rgbIsValueAt(r, g, b, (byte) whiteValue, 1);
    }finally{__CLR4_5_23xk3xkm6lb4yih.R.flushNeeded();}}

    private static boolean isBlackZero(byte[] r, byte[] g, byte[] b) {try{__CLR4_5_23xk3xkm6lb4yih.R.inc(5125);
        __CLR4_5_23xk3xkm6lb4yih.R.inc(5126);return bilevelColorValue(r, g, b, 0, 0xff);
    }finally{__CLR4_5_23xk3xkm6lb4yih.R.flushNeeded();}}

    private static boolean isWhiteZero(byte[] r, byte[] g, byte[] b) {try{__CLR4_5_23xk3xkm6lb4yih.R.inc(5127);
        __CLR4_5_23xk3xkm6lb4yih.R.inc(5128);return bilevelColorValue(r, g, b, 0xff, 0);
    }finally{__CLR4_5_23xk3xkm6lb4yih.R.flushNeeded();}}

    static ImageType getTypeFromColorSpace(ColorSpace colorSpace, TIFFEncodeParam params) {try{__CLR4_5_23xk3xkm6lb4yih.R.inc(5129);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_23xk3xkm6lb4yih.R.inc(5130);switch (colorSpace.getType()) {
        case ColorSpace.TYPE_CMYK:if (!__CLB4_5_2_bool0) {__CLR4_5_23xk3xkm6lb4yih.R.inc(5131);__CLB4_5_2_bool0=true;}
            __CLR4_5_23xk3xkm6lb4yih.R.inc(5132);return CMYK;
        case ColorSpace.TYPE_GRAY:if (!__CLB4_5_2_bool0) {__CLR4_5_23xk3xkm6lb4yih.R.inc(5133);__CLB4_5_2_bool0=true;}
            __CLR4_5_23xk3xkm6lb4yih.R.inc(5134);return GRAY;
        case ColorSpace.TYPE_Lab:if (!__CLB4_5_2_bool0) {__CLR4_5_23xk3xkm6lb4yih.R.inc(5135);__CLB4_5_2_bool0=true;}
            __CLR4_5_23xk3xkm6lb4yih.R.inc(5136);return CIELAB;
        case ColorSpace.TYPE_RGB:if (!__CLB4_5_2_bool0) {__CLR4_5_23xk3xkm6lb4yih.R.inc(5137);__CLB4_5_2_bool0=true;}
            __CLR4_5_23xk3xkm6lb4yih.R.inc(5138);if ((((params.getJPEGCompressRGBToYCbCr())&&(__CLR4_5_23xk3xkm6lb4yih.R.iget(5139)!=0|true))||(__CLR4_5_23xk3xkm6lb4yih.R.iget(5140)==0&false))) {{
                __CLR4_5_23xk3xkm6lb4yih.R.inc(5141);return ImageType.YCBCR;
            } }else {{
                __CLR4_5_23xk3xkm6lb4yih.R.inc(5142);return ImageType.RGB;
            }
        }case ColorSpace.TYPE_YCbCr:if (!__CLB4_5_2_bool0) {__CLR4_5_23xk3xkm6lb4yih.R.inc(5143);__CLB4_5_2_bool0=true;}
            __CLR4_5_23xk3xkm6lb4yih.R.inc(5144);return YCBCR;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_23xk3xkm6lb4yih.R.inc(5145);__CLB4_5_2_bool0=true;}
            __CLR4_5_23xk3xkm6lb4yih.R.inc(5146);return GENERIC;
        }
    }finally{__CLR4_5_23xk3xkm6lb4yih.R.flushNeeded();}}
;public static class __CLR4_5_23xk3xkm6lb4yih{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,5147,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
