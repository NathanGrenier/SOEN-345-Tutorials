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

/* $Id: ColorUtil.java 1051421 2010-12-21 08:54:25Z jeremias $ */

package org.apache.xmlgraphics.java2d.color;

import java.awt.Color;


/**
 * Generic Color helper class.
 * <p>
 * This class supports parsing string values into color values and creating
 * color values for strings. It provides a list of standard color names.
 */
public final class ColorUtil {public static class __CLR4_5_2brkbrkm68iyhtt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,15320,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Private constructor since this is an utility class.
     */
    private ColorUtil() {try{__CLR4_5_2brkbrkm68iyhtt.R.inc(15248);
    }finally{__CLR4_5_2brkbrkm68iyhtt.R.flushNeeded();}}


    /**
     * Lightens up a color for groove, ridge, inset and outset border effects.
     * @param col the color to lighten up
     * @param factor factor by which to lighten up (negative values darken the color)
     * @return the modified color
     */
    public static Color lightenColor(Color col, float factor) {try{__CLR4_5_2brkbrkm68iyhtt.R.inc(15249);
        // TODO: This function converts the color into the sRGB namespace.
        // This should be avoided if possible.
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15250);float[] cols = new float[4];
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15251);cols = col.getRGBComponents(cols);
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15252);if ((((factor > 0)&&(__CLR4_5_2brkbrkm68iyhtt.R.iget(15253)!=0|true))||(__CLR4_5_2brkbrkm68iyhtt.R.iget(15254)==0&false))) {{
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15255);cols[0] += (1.0 - cols[0]) * factor;
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15256);cols[1] += (1.0 - cols[1]) * factor;
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15257);cols[2] += (1.0 - cols[2]) * factor;
        } }else {{
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15258);cols[0] -= cols[0] * -factor;
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15259);cols[1] -= cols[1] * -factor;
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15260);cols[2] -= cols[2] * -factor;
        }
        }__CLR4_5_2brkbrkm68iyhtt.R.inc(15261);return new Color(cols[0], cols[1], cols[2], cols[3]);
    }finally{__CLR4_5_2brkbrkm68iyhtt.R.flushNeeded();}}



    /**
     * Indicates whether the color is a gray value.
     * @param col the color
     * @return true if it is a gray value
     */
    public static boolean isGray(Color col) {try{__CLR4_5_2brkbrkm68iyhtt.R.inc(15262);
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15263);return (col.getRed() == col.getBlue() && col.getRed() == col.getGreen());
    }finally{__CLR4_5_2brkbrkm68iyhtt.R.flushNeeded();}}

    /**
     * Creates an uncalibrated CMYK color with the given gray value.
     * @param black the gray component (0 - 1)
     * @return the CMYK color
     */
    public static Color toCMYKGrayColor(float black) {try{__CLR4_5_2brkbrkm68iyhtt.R.inc(15264);
        //Calculated color components
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15265);float[] cmyk = new float[] {0f, 0f, 0f, 1.0f - black};
        //Create native color
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15266);return DeviceCMYKColorSpace.createCMYKColor(cmyk);
    }finally{__CLR4_5_2brkbrkm68iyhtt.R.flushNeeded();}}

    /**
     * Converts an arbitrary {@link Color} to a plain sRGB color doing the conversion at the
     * best possible conversion quality.
     * @param col the original color
     * @return the sRGB equivalent
     */
    public static Color toSRGBColor(Color col) {try{__CLR4_5_2brkbrkm68iyhtt.R.inc(15267);
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15268);if ((((col.getColorSpace().isCS_sRGB())&&(__CLR4_5_2brkbrkm68iyhtt.R.iget(15269)!=0|true))||(__CLR4_5_2brkbrkm68iyhtt.R.iget(15270)==0&false))) {{
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15271);return col; //Don't convert if already sRGB to avoid conversion differences
        }
        }__CLR4_5_2brkbrkm68iyhtt.R.inc(15272);float[] comps = col.getColorComponents(null);
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15273);float[] srgb = col.getColorSpace().toRGB(comps);
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15274);comps = col.getComponents(null);
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15275);float alpha = comps[comps.length - 1];
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15276);return new Color(srgb[0], srgb[1], srgb[2], alpha);
    }finally{__CLR4_5_2brkbrkm68iyhtt.R.flushNeeded();}}

    /**
     * Checks if two colors are the same color. This check is much more restrictive than
     * {@link Color#equals(Object)} in that it doesn't only check if both colors result in the
     * same sRGB value. For example, if two colors not of the same exact class are compared,
     * they are treated as not the same.
     * <p>
     * Note: At the moment, this method only supports {@link Color} and
     * {@link ColorWithAlternatives} only. Other subclasses of {@link Color} are checked only using
     * the {@link Color#equals(Object)} method.
     * @param col1 the first color
     * @param col2 the second color
     * @return true if both colors are the same color
     */
    public static boolean isSameColor(Color col1, Color col2) {try{__CLR4_5_2brkbrkm68iyhtt.R.inc(15277);
        //Check fallback sRGB values first, then go into details
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15278);if ((((!col1.equals(col2))&&(__CLR4_5_2brkbrkm68iyhtt.R.iget(15279)!=0|true))||(__CLR4_5_2brkbrkm68iyhtt.R.iget(15280)==0&false))) {{
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15281);return false;
        }

        //Consider same-ness only between colors of the same class (not subclasses)
        //but consider a ColorWithAlternatives without alternatives to be the same as a Color.
        }__CLR4_5_2brkbrkm68iyhtt.R.inc(15282);Class<?> cl1 = col1.getClass();
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15283);if ((((col1 instanceof ColorWithAlternatives
                && !((ColorWithAlternatives) col1).hasAlternativeColors())&&(__CLR4_5_2brkbrkm68iyhtt.R.iget(15284)!=0|true))||(__CLR4_5_2brkbrkm68iyhtt.R.iget(15285)==0&false))) {{
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15286);cl1 = Color.class;
        }
        }__CLR4_5_2brkbrkm68iyhtt.R.inc(15287);Class<?> cl2 = col2.getClass();
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15288);if ((((col2 instanceof ColorWithAlternatives
                && !((ColorWithAlternatives) col2).hasAlternativeColors())&&(__CLR4_5_2brkbrkm68iyhtt.R.iget(15289)!=0|true))||(__CLR4_5_2brkbrkm68iyhtt.R.iget(15290)==0&false))) {{
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15291);cl2 = Color.class;
        }
        }__CLR4_5_2brkbrkm68iyhtt.R.inc(15292);if ((((cl1 != cl2)&&(__CLR4_5_2brkbrkm68iyhtt.R.iget(15293)!=0|true))||(__CLR4_5_2brkbrkm68iyhtt.R.iget(15294)==0&false))) {{
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15295);return false;
        }

        //Check color space
        }__CLR4_5_2brkbrkm68iyhtt.R.inc(15296);if ((((!col1.getColorSpace().equals(col2.getColorSpace()))&&(__CLR4_5_2brkbrkm68iyhtt.R.iget(15297)!=0|true))||(__CLR4_5_2brkbrkm68iyhtt.R.iget(15298)==0&false))) {{
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15299);return false;
        }

        //Check native components
        }__CLR4_5_2brkbrkm68iyhtt.R.inc(15300);float[] comps1 = col1.getComponents(null);
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15301);float[] comps2 = col2.getComponents(null);
        __CLR4_5_2brkbrkm68iyhtt.R.inc(15302);if ((((comps1.length != comps2.length)&&(__CLR4_5_2brkbrkm68iyhtt.R.iget(15303)!=0|true))||(__CLR4_5_2brkbrkm68iyhtt.R.iget(15304)==0&false))) {{
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15305);return false;
        }
        }__CLR4_5_2brkbrkm68iyhtt.R.inc(15306);for (int i = 0, c = comps1.length; (((i < c)&&(__CLR4_5_2brkbrkm68iyhtt.R.iget(15307)!=0|true))||(__CLR4_5_2brkbrkm68iyhtt.R.iget(15308)==0&false)); i++) {{
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15309);if ((((comps1[i] != comps2[i])&&(__CLR4_5_2brkbrkm68iyhtt.R.iget(15310)!=0|true))||(__CLR4_5_2brkbrkm68iyhtt.R.iget(15311)==0&false))) {{
                __CLR4_5_2brkbrkm68iyhtt.R.inc(15312);return false;
            }
        }}

        //Compare alternative colors, order is relevant
        }__CLR4_5_2brkbrkm68iyhtt.R.inc(15313);if ((((col1 instanceof ColorWithAlternatives && col2 instanceof ColorWithAlternatives)&&(__CLR4_5_2brkbrkm68iyhtt.R.iget(15314)!=0|true))||(__CLR4_5_2brkbrkm68iyhtt.R.iget(15315)==0&false))) {{
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15316);ColorWithAlternatives ca1 = (ColorWithAlternatives) col1;
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15317);ColorWithAlternatives ca2 = (ColorWithAlternatives) col2;
            __CLR4_5_2brkbrkm68iyhtt.R.inc(15318);return ca1.hasSameAlternativeColors(ca2);
        }

        }__CLR4_5_2brkbrkm68iyhtt.R.inc(15319);return true;
    }finally{__CLR4_5_2brkbrkm68iyhtt.R.flushNeeded();}}

}
