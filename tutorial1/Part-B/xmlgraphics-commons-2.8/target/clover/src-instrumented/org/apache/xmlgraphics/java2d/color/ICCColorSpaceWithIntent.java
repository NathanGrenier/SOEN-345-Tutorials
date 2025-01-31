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

/* $Id: ICCColorSpaceWithIntent.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.java2d.color;

import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;

/**
 * This class extends the ICCColorSpace class by providing
 * convenience methods to convert to sRGB using various
 * methods, forcing a given intent, such as perceptual or
 * relative colorimetric. It also additionally holds the name
 * and source URI of the color profile.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ICCColorSpaceWithIntent extends ICC_ColorSpace implements ColorSpaceOrigin {public static class __CLR4_5_2bwzbwzm6lb50x5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,15479,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -3338065900662625221L;

    static final ColorSpace SRGB = ColorSpace.getInstance(ColorSpace.CS_sRGB);

    private RenderingIntent intent;
    private String profileName;
    private String profileURI;

    /**
     * Creates a new ICC-based color space.
     * @param p the color profile
     * @param intent the overriding rendering intent (use {@link RenderingIntent#AUTO}
     *          to preserve the profile's)
     * @param profileName the color profile name
     * @param profileURI the source URI of the color profile
     */
    public ICCColorSpaceWithIntent(ICC_Profile p, RenderingIntent intent,
            String profileName, String profileURI) {
        super(p);__CLR4_5_2bwzbwzm6lb50x5.R.inc(15444);try{__CLR4_5_2bwzbwzm6lb50x5.R.inc(15443);

        __CLR4_5_2bwzbwzm6lb50x5.R.inc(15445);this.intent = intent;

        /**
         * Apply the requested intent into the profile
         */
        __CLR4_5_2bwzbwzm6lb50x5.R.inc(15446);if ((((intent != RenderingIntent.AUTO)&&(__CLR4_5_2bwzbwzm6lb50x5.R.iget(15447)!=0|true))||(__CLR4_5_2bwzbwzm6lb50x5.R.iget(15448)==0&false))) {{
            __CLR4_5_2bwzbwzm6lb50x5.R.inc(15449);byte[] hdr = p.getData(ICC_Profile.icSigHead);
            __CLR4_5_2bwzbwzm6lb50x5.R.inc(15450);hdr[ICC_Profile.icHdrRenderingIntent] = (byte)intent.getIntegerValue();
        }

        }__CLR4_5_2bwzbwzm6lb50x5.R.inc(15451);this.profileName = profileName;
        __CLR4_5_2bwzbwzm6lb50x5.R.inc(15452);this.profileURI = profileURI;
    }finally{__CLR4_5_2bwzbwzm6lb50x5.R.flushNeeded();}}

    /**
     * Returns the sRGB value obtained by forcing the
     * conversion method to the intent passed to the
     * constructor.
     * @param values the color values in the local color space
     * @return the sRGB values
     */
    public float[] intendedToRGB(float[] values) {try{__CLR4_5_2bwzbwzm6lb50x5.R.inc(15453);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2bwzbwzm6lb50x5.R.inc(15454);switch(intent) {
        case ABSOLUTE_COLORIMETRIC:if (!__CLB4_5_2_bool0) {__CLR4_5_2bwzbwzm6lb50x5.R.inc(15455);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bwzbwzm6lb50x5.R.inc(15456);return absoluteColorimetricToRGB(values);
        case PERCEPTUAL:if (!__CLB4_5_2_bool0) {__CLR4_5_2bwzbwzm6lb50x5.R.inc(15457);__CLB4_5_2_bool0=true;}
        case AUTO:if (!__CLB4_5_2_bool0) {__CLR4_5_2bwzbwzm6lb50x5.R.inc(15458);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bwzbwzm6lb50x5.R.inc(15459);return perceptualToRGB(values);
        case RELATIVE_COLORIMETRIC:if (!__CLB4_5_2_bool0) {__CLR4_5_2bwzbwzm6lb50x5.R.inc(15460);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bwzbwzm6lb50x5.R.inc(15461);return relativeColorimetricToRGB(values);
        case SATURATION:if (!__CLB4_5_2_bool0) {__CLR4_5_2bwzbwzm6lb50x5.R.inc(15462);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bwzbwzm6lb50x5.R.inc(15463);return saturationToRGB(values);
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2bwzbwzm6lb50x5.R.inc(15464);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bwzbwzm6lb50x5.R.inc(15465);throw new RuntimeException("invalid intent:" + intent);
        }
    }finally{__CLR4_5_2bwzbwzm6lb50x5.R.flushNeeded();}}

    /**
     * Perceptual conversion is the method implemented by the
     * base class's toRGB method
     * @param values the color values in the local color space
     * @return the sRGB values
     */
    private float[] perceptualToRGB(float[] values) {try{__CLR4_5_2bwzbwzm6lb50x5.R.inc(15466);
        __CLR4_5_2bwzbwzm6lb50x5.R.inc(15467);return toRGB(values);
    }finally{__CLR4_5_2bwzbwzm6lb50x5.R.flushNeeded();}}

    /**
     * Relative colorimetric needs to happen through CIEXYZ
     * conversion.
     * @param values the color values in the local color space
     * @return the sRGB values
     */
    private float[] relativeColorimetricToRGB(float[] values) {try{__CLR4_5_2bwzbwzm6lb50x5.R.inc(15468);
        __CLR4_5_2bwzbwzm6lb50x5.R.inc(15469);float[] ciexyz = toCIEXYZ(values);
        __CLR4_5_2bwzbwzm6lb50x5.R.inc(15470);return SRGB.fromCIEXYZ(ciexyz);
    }finally{__CLR4_5_2bwzbwzm6lb50x5.R.flushNeeded();}}

    /**
     * Absolute colorimetric. NOT IMPLEMENTED.
     * Temporarily returns same as perceptual.
     * @param values the color values in the local color space
     * @return the sRGB values
     */
    private float[] absoluteColorimetricToRGB(float[] values) {try{__CLR4_5_2bwzbwzm6lb50x5.R.inc(15471);
        __CLR4_5_2bwzbwzm6lb50x5.R.inc(15472);return perceptualToRGB(values);
    }finally{__CLR4_5_2bwzbwzm6lb50x5.R.flushNeeded();}}

    /**
     * Saturation. NOT IMPLEMENTED. Temporarily returns same
     * as perceptual.
     * @param values the color values in the local color space
     * @return the sRGB values
     */
    private float[] saturationToRGB(float[] values) {try{__CLR4_5_2bwzbwzm6lb50x5.R.inc(15473);
        __CLR4_5_2bwzbwzm6lb50x5.R.inc(15474);return perceptualToRGB(values);
    }finally{__CLR4_5_2bwzbwzm6lb50x5.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getProfileName() {try{__CLR4_5_2bwzbwzm6lb50x5.R.inc(15475);
        __CLR4_5_2bwzbwzm6lb50x5.R.inc(15476);return this.profileName;
    }finally{__CLR4_5_2bwzbwzm6lb50x5.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getProfileURI() {try{__CLR4_5_2bwzbwzm6lb50x5.R.inc(15477);
        __CLR4_5_2bwzbwzm6lb50x5.R.inc(15478);return this.profileURI;
    }finally{__CLR4_5_2bwzbwzm6lb50x5.R.flushNeeded();}}

}
