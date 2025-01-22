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

/* $Id: NamedColorSpace.java 1051421 2010-12-21 08:54:25Z jeremias $ */

package org.apache.xmlgraphics.java2d.color;

import java.awt.Color;
import java.awt.color.ColorSpace;

/**
 * Implements a pseudo color space for a named color which is defined in the CIE XYZ color space.
 * At the moment, this color space always returns the fully opaque color regardless of the single
 * component value (tint) given to its conversion methods.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class NamedColorSpace extends ColorSpace implements ColorSpaceOrigin {public static class __CLR4_5_2bxzbxzm68iyhul{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,15566,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -8957543225908514658L;

    private final String name;
    private final float[] xyz;

    private final String profileName;
    private final String profileURI;

    /**
     * Creates a new named color.
     * @param name the color name
     * @param xyz the CIE XYZ coordinates (valid values: 0.0f to 1.0f, although
     *                  values slightly larger than 1.0f are common)
     */
    public NamedColorSpace(String name, float[] xyz) {
        this(name, xyz, null, null);__CLR4_5_2bxzbxzm68iyhul.R.inc(15480);try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15479);
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /**
     * Creates a new named color.
     * @param name the color name
     * @param xyz the CIE XYZ coordinates (valid values: 0.0f to 1.0f, although
     *                  values slightly larger than 1.0f are common)
     * @param profileName Optional profile name associated with this color space
     * @param profileURI Optional profile URI associated with this color space
     */
    public NamedColorSpace(String name, float[] xyz, String profileName, String profileURI) {
        super(ColorSpace.TYPE_GRAY, 1);__CLR4_5_2bxzbxzm68iyhul.R.inc(15482);try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15481);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15483);checkNumComponents(xyz, 3);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15484);if ((((name == null || name.trim().length() == 0)&&(__CLR4_5_2bxzbxzm68iyhul.R.iget(15485)!=0|true))||(__CLR4_5_2bxzbxzm68iyhul.R.iget(15486)==0&false))) {{
            __CLR4_5_2bxzbxzm68iyhul.R.inc(15487);throw new IllegalArgumentException("No name provided for named color space");
        }
        }__CLR4_5_2bxzbxzm68iyhul.R.inc(15488);this.name = name.trim();
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15489);this.xyz = new float[3];
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15490);System.arraycopy(xyz, 0, this.xyz, 0, 3);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15491);this.profileName = profileName;
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15492);this.profileURI = profileURI;
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /**
     * Creates a new named color.
     * @param name the color name
     * @param color the color to use when the named color's specific color properties are not
     *                  available.
     * @param profileName Optional profile name associated with this color space
     * @param profileURI Optional profile URI associated with this color space
     */
    public NamedColorSpace(String name, Color color, String profileName, String profileURI) {
        this(name, color.getColorSpace().toCIEXYZ(color.getColorComponents(null)),
                profileName, profileURI);__CLR4_5_2bxzbxzm68iyhul.R.inc(15494);try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15493);
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /**
     * Creates a new named color.
     * @param name the color name
     * @param color the color to use when the named color's specific color properties are not
     *                  available.
     */
    public NamedColorSpace(String name, Color color) {
        this(name, color.getColorSpace().toCIEXYZ(color.getColorComponents(null)), null, null);__CLR4_5_2bxzbxzm68iyhul.R.inc(15496);try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15495);
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    private void checkNumComponents(float[] colorvalue, int expected) {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15497);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15498);if ((((colorvalue == null)&&(__CLR4_5_2bxzbxzm68iyhul.R.iget(15499)!=0|true))||(__CLR4_5_2bxzbxzm68iyhul.R.iget(15500)==0&false))) {{
            __CLR4_5_2bxzbxzm68iyhul.R.inc(15501);throw new NullPointerException("color value may not be null");
        }
        }__CLR4_5_2bxzbxzm68iyhul.R.inc(15502);if ((((colorvalue.length != expected)&&(__CLR4_5_2bxzbxzm68iyhul.R.iget(15503)!=0|true))||(__CLR4_5_2bxzbxzm68iyhul.R.iget(15504)==0&false))) {{
            __CLR4_5_2bxzbxzm68iyhul.R.inc(15505);throw new IllegalArgumentException("Expected " + expected
                    + " components, but got " + colorvalue.length);
        }
    }}finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /**
     * Returns the color name.
     * @return the color name
     */
    public String getColorName() {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15506);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15507);return this.name;
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getProfileName() {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15508);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15509);return this.profileName;
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getProfileURI() {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15510);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15511);return this.profileURI;
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /**
     * Returns the XYZ coordinates of the named color.
     * @return the XYZ coordinates of the named color
     */
    public float[] getXYZ() {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15512);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15513);float[] result = new float[this.xyz.length];
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15514);System.arraycopy(this.xyz, 0, result, 0, this.xyz.length);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15515);return result;
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /**
     * Returns an sRGB-based color representing the full-tint color defined by this named color
     * space.
     * @return the sRGB color
     */
    public Color getRGBColor() {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15516);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15517);float[] comps = toRGB(this.xyz);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15518);return new Color(comps[0], comps[1], comps[2]);
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public float getMinValue(int component) {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15519);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15520);return getMaxValue(component); //same as min, i.e. always 1.0
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public float getMaxValue(int component) {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15521);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2bxzbxzm68iyhul.R.inc(15522);switch (component) {
        case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2bxzbxzm68iyhul.R.inc(15523);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bxzbxzm68iyhul.R.inc(15524);return 1f;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2bxzbxzm68iyhul.R.inc(15525);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bxzbxzm68iyhul.R.inc(15526);throw new IllegalArgumentException("A named color space only has 1 component!");
        }
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getName(int component) {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15527);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2bxzbxzm68iyhul.R.inc(15528);switch (component) {
        case 0:if (!__CLB4_5_2_bool1) {__CLR4_5_2bxzbxzm68iyhul.R.inc(15529);__CLB4_5_2_bool1=true;}
            __CLR4_5_2bxzbxzm68iyhul.R.inc(15530);return "Tint";
        default:if (!__CLB4_5_2_bool1) {__CLR4_5_2bxzbxzm68iyhul.R.inc(15531);__CLB4_5_2_bool1=true;}
            __CLR4_5_2bxzbxzm68iyhul.R.inc(15532);throw new IllegalArgumentException("A named color space only has 1 component!");
        }
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public float[] fromCIEXYZ(float[] colorvalue) {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15533);
        //ignore the given color values as this is a fixed color.
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15534);return new float[] {1.0f}; //Return value for full tint
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public float[] fromRGB(float[] rgbvalue) {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15535);
        //ignore the given color values as this is a fixed color.
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15536);return new float[] {1.0f}; //Return value for full tint
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public float[] toCIEXYZ(float[] colorvalue) {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15537);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15538);float[] ret = new float[3];
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15539);System.arraycopy(this.xyz, 0, ret, 0, this.xyz.length);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15540);return ret;
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public float[] toRGB(float[] colorvalue) {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15541);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15542);ColorSpace sRGB = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15543);return sRGB.fromCIEXYZ(this.xyz);
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean equals(Object obj) {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15544);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15545);if ((((!(obj instanceof NamedColorSpace))&&(__CLR4_5_2bxzbxzm68iyhul.R.iget(15546)!=0|true))||(__CLR4_5_2bxzbxzm68iyhul.R.iget(15547)==0&false))) {{
            __CLR4_5_2bxzbxzm68iyhul.R.inc(15548);return false;
        }
        }__CLR4_5_2bxzbxzm68iyhul.R.inc(15549);NamedColorSpace other = (NamedColorSpace)obj;
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15550);if ((((!this.name.equals(other.name))&&(__CLR4_5_2bxzbxzm68iyhul.R.iget(15551)!=0|true))||(__CLR4_5_2bxzbxzm68iyhul.R.iget(15552)==0&false))) {{
            __CLR4_5_2bxzbxzm68iyhul.R.inc(15553);return false;
        }
        }__CLR4_5_2bxzbxzm68iyhul.R.inc(15554);for (int i = 0, c = this.xyz.length; (((i < c)&&(__CLR4_5_2bxzbxzm68iyhul.R.iget(15555)!=0|true))||(__CLR4_5_2bxzbxzm68iyhul.R.iget(15556)==0&false)); i++) {{
            __CLR4_5_2bxzbxzm68iyhul.R.inc(15557);if ((((this.xyz[i] != other.xyz[i])&&(__CLR4_5_2bxzbxzm68iyhul.R.iget(15558)!=0|true))||(__CLR4_5_2bxzbxzm68iyhul.R.iget(15559)==0&false))) {{
                __CLR4_5_2bxzbxzm68iyhul.R.inc(15560);return false;
            }
        }}
        }__CLR4_5_2bxzbxzm68iyhul.R.inc(15561);return true;
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int hashCode() {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15562);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15563);return (this.profileName + name).hashCode();
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_2bxzbxzm68iyhul.R.inc(15564);
        __CLR4_5_2bxzbxzm68iyhul.R.inc(15565);return "Named Color Space: " + getColorName();
    }finally{__CLR4_5_2bxzbxzm68iyhul.R.flushNeeded();}}

}
