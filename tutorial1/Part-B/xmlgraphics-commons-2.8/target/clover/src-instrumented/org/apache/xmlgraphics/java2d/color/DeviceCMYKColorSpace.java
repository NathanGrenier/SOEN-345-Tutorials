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

/* $Id: DeviceCMYKColorSpace.java 1400596 2012-10-21 08:49:02Z gadams $ */

package org.apache.xmlgraphics.java2d.color;

import java.awt.Color;

/**
 * This class represents an uncalibrated CMYK color space.
 */
public class DeviceCMYKColorSpace extends AbstractDeviceSpecificColorSpace
            implements ColorSpaceOrigin {public static class __CLR4_5_2bvwbvwm68iyhu6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,15437,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 2925508946083542974L;

    /** The name for the uncalibrated CMYK pseudo-profile */
    public static final String PSEUDO_PROFILE_NAME = "#CMYK";

    /**
     * Constructs an uncalibrated CMYK ColorSpace object with
     * {@link java.awt.color.ColorSpace#TYPE_CMYK} and 4 components.
     * @see java.awt.color.ColorSpace#ColorSpace(int, int)
     */
    public DeviceCMYKColorSpace() {
        super(TYPE_CMYK, 4);__CLR4_5_2bvwbvwm68iyhu6.R.inc(15405);try{__CLR4_5_2bvwbvwm68iyhu6.R.inc(15404);
    }finally{__CLR4_5_2bvwbvwm68iyhu6.R.flushNeeded();}}

    /**
     * Returns an instance of an uncalibrated CMYK color space.
     * @return CMYKColorSpace the requested color space object
     * @deprecated Use {@link ColorSpaces#getDeviceCMYKColorSpace()} instead.
     */
    @Deprecated
    public static DeviceCMYKColorSpace getInstance() {try{__CLR4_5_2bvwbvwm68iyhu6.R.inc(15406);
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15407);return ColorSpaces.getDeviceCMYKColorSpace();
    }finally{__CLR4_5_2bvwbvwm68iyhu6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public float[] toRGB(float[] colorvalue) {try{__CLR4_5_2bvwbvwm68iyhu6.R.inc(15408);
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15409);return new float [] {
            (1 - colorvalue[0]) * (1 - colorvalue[3]),
            (1 - colorvalue[1]) * (1 - colorvalue[3]),
            (1 - colorvalue[2]) * (1 - colorvalue[3])};
    }finally{__CLR4_5_2bvwbvwm68iyhu6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public float[] fromRGB(float[] rgbvalue) {try{__CLR4_5_2bvwbvwm68iyhu6.R.inc(15410);
        assert (((rgbvalue.length == 3)&&(__CLR4_5_2bvwbvwm68iyhu6.R.iget(15411)!=0|true))||(__CLR4_5_2bvwbvwm68iyhu6.R.iget(15412)==0&false));
        //Note: this is an arbitrary conversion, not a color-managed one!
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15413);float r = rgbvalue[0];
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15414);float g = rgbvalue[1];
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15415);float b = rgbvalue[2];
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15416);if ((((r == g && r == b)&&(__CLR4_5_2bvwbvwm68iyhu6.R.iget(15417)!=0|true))||(__CLR4_5_2bvwbvwm68iyhu6.R.iget(15418)==0&false))) {{
            __CLR4_5_2bvwbvwm68iyhu6.R.inc(15419);return new float[] {0, 0, 0, 1 - r};
        } }else {{
            __CLR4_5_2bvwbvwm68iyhu6.R.inc(15420);float c = 1 - r;
            __CLR4_5_2bvwbvwm68iyhu6.R.inc(15421);float m = 1 - g;
            __CLR4_5_2bvwbvwm68iyhu6.R.inc(15422);float y = 1 - b;
            __CLR4_5_2bvwbvwm68iyhu6.R.inc(15423);float k = Math.min(c, Math.min(m, y));
            __CLR4_5_2bvwbvwm68iyhu6.R.inc(15424);return new float[] {c, m, y, k};
        }
    }}finally{__CLR4_5_2bvwbvwm68iyhu6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public float[] toCIEXYZ(float[] colorvalue) {try{__CLR4_5_2bvwbvwm68iyhu6.R.inc(15425);
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15426);throw new UnsupportedOperationException("NYI");
    }finally{__CLR4_5_2bvwbvwm68iyhu6.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public float[] fromCIEXYZ(float[] colorvalue) {try{__CLR4_5_2bvwbvwm68iyhu6.R.inc(15427);
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15428);throw new UnsupportedOperationException("NYI");
    }finally{__CLR4_5_2bvwbvwm68iyhu6.R.flushNeeded();}}

    /**
     * Creates a color instance representing a device-specific CMYK color. An sRGB value
     * is calculated from the CMYK colors but it may not correctly represent the given CMYK
     * values.
     * @param cmykComponents the CMYK components
     * @return the device-specific color
     */
    public static Color createCMYKColor(float[] cmykComponents) {try{__CLR4_5_2bvwbvwm68iyhu6.R.inc(15429);
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15430);DeviceCMYKColorSpace cmykCs = ColorSpaces.getDeviceCMYKColorSpace();
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15431);Color cmykColor = new ColorWithAlternatives(cmykCs, cmykComponents, 1.0f, null);
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15432);return cmykColor;
    }finally{__CLR4_5_2bvwbvwm68iyhu6.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getProfileName() {try{__CLR4_5_2bvwbvwm68iyhu6.R.inc(15433);
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15434);return PSEUDO_PROFILE_NAME;
    }finally{__CLR4_5_2bvwbvwm68iyhu6.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getProfileURI() {try{__CLR4_5_2bvwbvwm68iyhu6.R.inc(15435);
        __CLR4_5_2bvwbvwm68iyhu6.R.inc(15436);return null; //No URI
    }finally{__CLR4_5_2bvwbvwm68iyhu6.R.flushNeeded();}}

}
