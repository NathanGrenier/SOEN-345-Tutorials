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

/* $Id: UnitConv.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.util;

import java.awt.geom.AffineTransform;
import java.util.Locale;

/**
 * Utility class for unit conversions.
 */
public final class UnitConv {public static class __CLR4_5_2fleflem68iyidd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,20283,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private UnitConv() {try{__CLR4_5_2fleflem68iyidd.R.inc(20210);
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /** conversion factory from millimeters to inches. */
    public static final float IN2MM = 25.4f;

    /** conversion factory from centimeters to inches. */
    public static final float IN2CM = 2.54f;

    /** conversion factory from inches to points. */
    public static final int IN2PT = 72;

    /** Describes the unit pica. */
    public static final String PICA = "pc";

    /** Describes the unit point. */
    public static final String POINT = "pt";

    /** Describes the unit millimeter. */
    public static final String MM = "mm";

    /** Describes the unit centimeter. */
    public static final String CM = "cm";

    /** Describes the unit inch. */
    public static final String INCH = "in";

    /** Describes the unit millipoint. */
    public static final String MPT = "mpt";

        /** Describes the unit pixel. */
    public static final String PX = "px";

    /**
     * Converts millimeters (mm) to points (pt)
     * @param mm the value in mm
     * @return the value in pt
     */
    public static double mm2pt(double mm) {try{__CLR4_5_2fleflem68iyidd.R.inc(20211);
        __CLR4_5_2fleflem68iyidd.R.inc(20212);return mm * IN2PT / IN2MM;
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Converts millimeters (mm) to millipoints (mpt)
     * @param mm the value in mm
     * @return the value in mpt
     */
    public static double mm2mpt(double mm) {try{__CLR4_5_2fleflem68iyidd.R.inc(20213);
        __CLR4_5_2fleflem68iyidd.R.inc(20214);return mm * 1000 * IN2PT / IN2MM;
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Converts points (pt) to millimeters (mm)
     * @param pt the value in pt
     * @return the value in mm
     */
    public static double pt2mm(double pt) {try{__CLR4_5_2fleflem68iyidd.R.inc(20215);
        __CLR4_5_2fleflem68iyidd.R.inc(20216);return pt * IN2MM / IN2PT;
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Converts millimeters (mm) to inches (in)
     * @param mm the value in mm
     * @return the value in inches
     */
    public static double mm2in(double mm) {try{__CLR4_5_2fleflem68iyidd.R.inc(20217);
        __CLR4_5_2fleflem68iyidd.R.inc(20218);return mm / IN2MM;
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Converts inches (in) to millimeters (mm)
     * @param in the value in inches
     * @return the value in mm
     */
    public static double in2mm(double in) {try{__CLR4_5_2fleflem68iyidd.R.inc(20219);
        __CLR4_5_2fleflem68iyidd.R.inc(20220);return in * IN2MM;
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Converts inches (in) to millipoints (mpt)
     * @param in the value in inches
     * @return the value in mpt
     */
    public static double in2mpt(double in) {try{__CLR4_5_2fleflem68iyidd.R.inc(20221);
        __CLR4_5_2fleflem68iyidd.R.inc(20222);return in * IN2PT * 1000;
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Converts inches (in) to points (pt)
     * @param in the value in inches
     * @return the value in pt
     */
    public static double in2pt(double in) {try{__CLR4_5_2fleflem68iyidd.R.inc(20223);
        __CLR4_5_2fleflem68iyidd.R.inc(20224);return in * IN2PT;
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Converts millipoints (mpt) to inches (in)
     * @param mpt the value in mpt
     * @return the value in inches
     */
    public static double mpt2in(double mpt) {try{__CLR4_5_2fleflem68iyidd.R.inc(20225);
        __CLR4_5_2fleflem68iyidd.R.inc(20226);return mpt / IN2PT / 1000;
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Converts millimeters (mm) to pixels (px)
     * @param mm the value in mm
     * @param resolution the resolution in dpi (dots per inch)
     * @return the value in pixels
     */
    public static double mm2px(double mm, int resolution) {try{__CLR4_5_2fleflem68iyidd.R.inc(20227);
        __CLR4_5_2fleflem68iyidd.R.inc(20228);return mm2in(mm) * resolution;
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Converts millipoints (mpt) to pixels (px)
     * @param mpt the value in mpt
     * @param resolution the resolution in dpi (dots per inch)
     * @return the value in pixels
     */
    public static double mpt2px(double mpt, int resolution) {try{__CLR4_5_2fleflem68iyidd.R.inc(20229);
        __CLR4_5_2fleflem68iyidd.R.inc(20230);return mpt2in(mpt) * resolution;
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Converts a millipoint-based transformation matrix to points.
     * @param at a millipoint-based transformation matrix
     * @return a point-based transformation matrix
     */
    public static AffineTransform mptToPt(AffineTransform at) {try{__CLR4_5_2fleflem68iyidd.R.inc(20231);
        __CLR4_5_2fleflem68iyidd.R.inc(20232);double[] matrix = new double[6];
        __CLR4_5_2fleflem68iyidd.R.inc(20233);at.getMatrix(matrix);
        //Convert to points
        __CLR4_5_2fleflem68iyidd.R.inc(20234);matrix[4] = matrix[4] / 1000;
        __CLR4_5_2fleflem68iyidd.R.inc(20235);matrix[5] = matrix[5] / 1000;
        __CLR4_5_2fleflem68iyidd.R.inc(20236);return new AffineTransform(matrix);
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Converts a point-based transformation matrix to millipoints.
     * @param at a point-based transformation matrix
     * @return a millipoint-based transformation matrix
     */
    public static AffineTransform ptToMpt(AffineTransform at) {try{__CLR4_5_2fleflem68iyidd.R.inc(20237);
        __CLR4_5_2fleflem68iyidd.R.inc(20238);double[] matrix = new double[6];
        __CLR4_5_2fleflem68iyidd.R.inc(20239);at.getMatrix(matrix);
        //Convert to millipoints
        __CLR4_5_2fleflem68iyidd.R.inc(20240);matrix[4] = matrix[4] * 1000;
        __CLR4_5_2fleflem68iyidd.R.inc(20241);matrix[5] = matrix[5] * 1000;
        __CLR4_5_2fleflem68iyidd.R.inc(20242);return new AffineTransform(matrix);
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}

    /**
     * Convert the given unit length to a dimensionless integer representing
     * a whole number of base units (milli-points).
     *
     * @param value input unit value
     * @return int millipoints
     */
    public static int convert(String value) {try{__CLR4_5_2fleflem68iyidd.R.inc(20243);
        __CLR4_5_2fleflem68iyidd.R.inc(20244);double retValue = 0;
        __CLR4_5_2fleflem68iyidd.R.inc(20245);if ((((value != null)&&(__CLR4_5_2fleflem68iyidd.R.iget(20246)!=0|true))||(__CLR4_5_2fleflem68iyidd.R.iget(20247)==0&false))) {{
            __CLR4_5_2fleflem68iyidd.R.inc(20248);if ((((value.toLowerCase(Locale.getDefault()).indexOf(PX) >= 0)&&(__CLR4_5_2fleflem68iyidd.R.iget(20249)!=0|true))||(__CLR4_5_2fleflem68iyidd.R.iget(20250)==0&false))) {{
                __CLR4_5_2fleflem68iyidd.R.inc(20251);retValue = Double.parseDouble(value.substring(0, value.length() - 2));
                __CLR4_5_2fleflem68iyidd.R.inc(20252);retValue *= 1000;
            } }else {__CLR4_5_2fleflem68iyidd.R.inc(20253);if ((((value.toLowerCase(Locale.getDefault()).indexOf(INCH) >= 0)&&(__CLR4_5_2fleflem68iyidd.R.iget(20254)!=0|true))||(__CLR4_5_2fleflem68iyidd.R.iget(20255)==0&false))) {{
                __CLR4_5_2fleflem68iyidd.R.inc(20256);retValue = Double.parseDouble(value.substring(0, value.length() - 2));
                __CLR4_5_2fleflem68iyidd.R.inc(20257);retValue *= 72000;
            } }else {__CLR4_5_2fleflem68iyidd.R.inc(20258);if ((((value.toLowerCase(Locale.getDefault()).indexOf(CM) >= 0)&&(__CLR4_5_2fleflem68iyidd.R.iget(20259)!=0|true))||(__CLR4_5_2fleflem68iyidd.R.iget(20260)==0&false))) {{
                __CLR4_5_2fleflem68iyidd.R.inc(20261);retValue = Double.parseDouble(value.substring(0, value.length() - 2));
                __CLR4_5_2fleflem68iyidd.R.inc(20262);retValue *= 28346.4567;
            } }else {__CLR4_5_2fleflem68iyidd.R.inc(20263);if ((((value.toLowerCase(Locale.getDefault()).indexOf(MM) >= 0)&&(__CLR4_5_2fleflem68iyidd.R.iget(20264)!=0|true))||(__CLR4_5_2fleflem68iyidd.R.iget(20265)==0&false))) {{
                __CLR4_5_2fleflem68iyidd.R.inc(20266);retValue = Double.parseDouble(value.substring(0, value.length() - 2));
                __CLR4_5_2fleflem68iyidd.R.inc(20267);retValue *= 2834.64567;
            } }else {__CLR4_5_2fleflem68iyidd.R.inc(20268);if ((((value.toLowerCase(Locale.getDefault()).indexOf(MPT) >= 0)&&(__CLR4_5_2fleflem68iyidd.R.iget(20269)!=0|true))||(__CLR4_5_2fleflem68iyidd.R.iget(20270)==0&false))) {{
                __CLR4_5_2fleflem68iyidd.R.inc(20271);retValue = Double.parseDouble(value.substring(0, value.length() - 3));
            } }else {__CLR4_5_2fleflem68iyidd.R.inc(20272);if ((((value.toLowerCase(Locale.getDefault()).indexOf(POINT) >= 0)&&(__CLR4_5_2fleflem68iyidd.R.iget(20273)!=0|true))||(__CLR4_5_2fleflem68iyidd.R.iget(20274)==0&false))) {{
                __CLR4_5_2fleflem68iyidd.R.inc(20275);retValue = Double.parseDouble(value.substring(0, value.length() - 2));
                __CLR4_5_2fleflem68iyidd.R.inc(20276);retValue *= 1000;
            } }else {__CLR4_5_2fleflem68iyidd.R.inc(20277);if ((((value.toLowerCase(Locale.getDefault()).indexOf(PICA) >= 0)&&(__CLR4_5_2fleflem68iyidd.R.iget(20278)!=0|true))||(__CLR4_5_2fleflem68iyidd.R.iget(20279)==0&false))) {{
                __CLR4_5_2fleflem68iyidd.R.inc(20280);retValue = Double.parseDouble(value.substring(0, value.length() - 2));
                __CLR4_5_2fleflem68iyidd.R.inc(20281);retValue *= 12000;
            }
        }}}}}}}}
        }__CLR4_5_2fleflem68iyidd.R.inc(20282);return (int)retValue;
    }finally{__CLR4_5_2fleflem68iyidd.R.flushNeeded();}}
}
