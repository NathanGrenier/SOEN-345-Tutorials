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

/* $Id: ColorWithAlternatives.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.java2d.color;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.util.Arrays;

/**
 * Extended {@link Color} class allowing to specify a prioritized list of alternative colors.
 * The alternative colors shall be the ones that are preferred if an output format supports them.
 * This is normally used for passing device-specific colors through to the output format.
 * <p>
 * This class only adds a single reference to a color array which should not increase memory
 * consumption by much if no alternative colors are specified.
 * <p>
 * <b>Important:</b> Due to a flaw in {@link Color#equals(Object)}, the <code>equals()</code>
 * method should not be used to compare two colors, especially when used to update the current
 * color for some output format. {@link Color} only takes the sRGB values into account but not
 * more the advanced facets of this class. Use {@link ColorUtil#isSameColor(Color, Color)} for
 * such a check.
 */
public class ColorWithAlternatives extends Color {public static class __CLR4_5_2btkbtkm68iyhtz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,15399,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -6125884937776779150L;

    private Color[] alternativeColors;

    /**
     * Constructor for RGBA colors.
     * @param r the red component
     * @param g the green component
     * @param b the blue component
     * @param a the alpha component
     * @param alternativeColors the prioritized list of alternative colors.
     * @see Color#Color(float, float, float, float)
     */
    public ColorWithAlternatives(float r, float g, float b, float a, Color[] alternativeColors) {
        super(r, g, b, a);__CLR4_5_2btkbtkm68iyhtz.R.inc(15321);try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15320);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15322);initAlternativeColors(alternativeColors);
    }finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    /**
     * Constructor for RGB colors.
     * @param r the red component
     * @param g the green component
     * @param b the blue component
     * @param alternativeColors the prioritized list of alternative colors.
     * @see Color#Color(float, float, float)
     */
    public ColorWithAlternatives(float r, float g, float b, Color[] alternativeColors) {
        super(r, g, b);__CLR4_5_2btkbtkm68iyhtz.R.inc(15324);try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15323);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15325);initAlternativeColors(alternativeColors);
    }finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    /**
     * Constructor for RGBA colors.
     * @param rgba the combined RGBA value
     * @param hasalpha true if the alpha bits are valid, false otherwise
     * @param alternativeColors the prioritized list of alternative colors.
     * @see Color#Color(int, boolean)
     */
    public ColorWithAlternatives(int rgba, boolean hasalpha, Color[] alternativeColors) {
        super(rgba, hasalpha);__CLR4_5_2btkbtkm68iyhtz.R.inc(15327);try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15326);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15328);initAlternativeColors(alternativeColors);
    }finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    /**
     * Constructor for RGBA colors.
     * @param r the red component
     * @param g the green component
     * @param b the blue component
     * @param a the alpha component
     * @param alternativeColors the prioritized list of alternative colors.
     * @see Color#Color(int, int, int, int)
     */
    public ColorWithAlternatives(int r, int g, int b, int a, Color[] alternativeColors) {
        super(r, g, b, a);__CLR4_5_2btkbtkm68iyhtz.R.inc(15330);try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15329);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15331);initAlternativeColors(alternativeColors);
    }finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    /**
     * Constructor for RGB colors.
     * @param r the red component
     * @param g the green component
     * @param b the blue component
     * @param alternativeColors the prioritized list of alternative colors.
     * @see Color#Color(int, int, int)
     */
    public ColorWithAlternatives(int r, int g, int b, Color[] alternativeColors) {
        super(r, g, b);__CLR4_5_2btkbtkm68iyhtz.R.inc(15333);try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15332);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15334);initAlternativeColors(alternativeColors);
    }finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    /**
     * Constructor for RGB colors.
     * @param rgb the combined RGB components
     * @param alternativeColors the prioritized list of alternative colors.
     * @see Color#Color(int)
     */
    public ColorWithAlternatives(int rgb, Color[] alternativeColors) {
        super(rgb);__CLR4_5_2btkbtkm68iyhtz.R.inc(15336);try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15335);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15337);initAlternativeColors(alternativeColors);
    }finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    /**
     * Constructor for colors with an arbitrary color space.
     * @param cspace the color space
     * @param components the color components
     * @param alpha the alpha component
     * @param alternativeColors the prioritized list of alternative colors.
     * @see Color#Color(ColorSpace, float[], float)
     */
    public ColorWithAlternatives(ColorSpace cspace, float[] components, float alpha,
            Color[] alternativeColors) {
        super(cspace, components, alpha);__CLR4_5_2btkbtkm68iyhtz.R.inc(15339);try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15338);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15340);initAlternativeColors(alternativeColors);
    }finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    private void initAlternativeColors(Color[] colors) {try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15341);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15342);if ((((colors != null)&&(__CLR4_5_2btkbtkm68iyhtz.R.iget(15343)!=0|true))||(__CLR4_5_2btkbtkm68iyhtz.R.iget(15344)==0&false))) {{
            //Colors are immutable but array are not, so copy
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15345);this.alternativeColors = new Color[colors.length];
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15346);System.arraycopy(colors, 0, this.alternativeColors, 0, colors.length);
        }
    }}finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    /**
     * Returns the list of alternative colors. An empty array will be returned if no alternative
     * colors are available.
     * @return the list of alternative colors
     */
    public Color[] getAlternativeColors() {try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15347);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15348);if ((((this.alternativeColors != null)&&(__CLR4_5_2btkbtkm68iyhtz.R.iget(15349)!=0|true))||(__CLR4_5_2btkbtkm68iyhtz.R.iget(15350)==0&false))) {{
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15351);Color[] cols = new Color[this.alternativeColors.length];
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15352);System.arraycopy(this.alternativeColors, 0, cols, 0, this.alternativeColors.length);
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15353);return cols;
        } }else {{
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15354);return new Color[0];
        }
    }}finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    /**
     * Indicates whether alternative colors are available.
     * @return true if alternative colors are available.
     */
    public boolean hasAlternativeColors() {try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15355);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15356);return this.alternativeColors != null && this.alternativeColors.length > 0;
    }finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    /**
     * Indicates whether another instance has the same alternative colors.
     * @param col the color to compare the alternatives to
     * @return true if the same alternative colors are present
     */
    public boolean hasSameAlternativeColors(ColorWithAlternatives col) {try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15357);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15358);if ((((!hasAlternativeColors())&&(__CLR4_5_2btkbtkm68iyhtz.R.iget(15359)!=0|true))||(__CLR4_5_2btkbtkm68iyhtz.R.iget(15360)==0&false))) {{
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15361);return !col.hasAlternativeColors();
        }
        // this.hasAlternativeColors()
        }__CLR4_5_2btkbtkm68iyhtz.R.inc(15362);if ((((!col.hasAlternativeColors())&&(__CLR4_5_2btkbtkm68iyhtz.R.iget(15363)!=0|true))||(__CLR4_5_2btkbtkm68iyhtz.R.iget(15364)==0&false))) {{
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15365);return false;
        }
        // this.hasAlternativeColors() && col.hasAlternativeColors()
        }__CLR4_5_2btkbtkm68iyhtz.R.inc(15366);Color[] alt1 = getAlternativeColors();
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15367);Color[] alt2 = col.getAlternativeColors();
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15368);if ((((alt1.length != alt2.length)&&(__CLR4_5_2btkbtkm68iyhtz.R.iget(15369)!=0|true))||(__CLR4_5_2btkbtkm68iyhtz.R.iget(15370)==0&false))) {{
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15371);return false;
        }
        }__CLR4_5_2btkbtkm68iyhtz.R.inc(15372);for (int i = 0, c = alt1.length; (((i < c)&&(__CLR4_5_2btkbtkm68iyhtz.R.iget(15373)!=0|true))||(__CLR4_5_2btkbtkm68iyhtz.R.iget(15374)==0&false)); i++) {{
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15375);Color c1 = alt1[i];
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15376);Color c2 = alt2[i];
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15377);if ((((!ColorUtil.isSameColor(c1, c2))&&(__CLR4_5_2btkbtkm68iyhtz.R.iget(15378)!=0|true))||(__CLR4_5_2btkbtkm68iyhtz.R.iget(15379)==0&false))) {{
                __CLR4_5_2btkbtkm68iyhtz.R.inc(15380);return false;
            }
        }}
        }__CLR4_5_2btkbtkm68iyhtz.R.inc(15381);return true;
    }finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    /**
     * Returns the first alternative color found with the given color space type.
     * @param colorSpaceType the color space type ({@link ColorSpace}.TYPE_*).
     * @return the requested alternative color or null, if no match was found
     */
    public Color getFirstAlternativeOfType(int colorSpaceType) {try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15382);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15383);if ((((hasAlternativeColors())&&(__CLR4_5_2btkbtkm68iyhtz.R.iget(15384)!=0|true))||(__CLR4_5_2btkbtkm68iyhtz.R.iget(15385)==0&false))) {{
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15386);for (Color alternativeColor : this.alternativeColors) {{
                __CLR4_5_2btkbtkm68iyhtz.R.inc(15387);if ((((alternativeColor.getColorSpace().getType() == colorSpaceType)&&(__CLR4_5_2btkbtkm68iyhtz.R.iget(15388)!=0|true))||(__CLR4_5_2btkbtkm68iyhtz.R.iget(15389)==0&false))) {{
                    __CLR4_5_2btkbtkm68iyhtz.R.inc(15390);return alternativeColor;
                }
            }}
        }}
        }__CLR4_5_2btkbtkm68iyhtz.R.inc(15391);return null;
    }finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}

    public int hashCode() {try{__CLR4_5_2btkbtkm68iyhtz.R.inc(15392);
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15393);int hash = super.hashCode();
        __CLR4_5_2btkbtkm68iyhtz.R.inc(15394);if ((((alternativeColors != null)&&(__CLR4_5_2btkbtkm68iyhtz.R.iget(15395)!=0|true))||(__CLR4_5_2btkbtkm68iyhtz.R.iget(15396)==0&false))) {{
            __CLR4_5_2btkbtkm68iyhtz.R.inc(15397);hash = 37 * hash + Arrays.hashCode(alternativeColors);
        }
        }__CLR4_5_2btkbtkm68iyhtz.R.inc(15398);return hash;
    }finally{__CLR4_5_2btkbtkm68iyhtz.R.flushNeeded();}}
}
