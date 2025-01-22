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

/* $Id: ColorSpaces.java 1051421 2010-12-21 08:54:25Z jeremias $ */

package org.apache.xmlgraphics.java2d.color;

import java.awt.color.ColorSpace;

/**
 * Provides access to various color spaces.
 */
public final class ColorSpaces {public static class __CLR4_5_2bqpbqpm68iyhtn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,15248,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static DeviceCMYKColorSpace deviceCMYK;
    private static CIELabColorSpace cieLabD50;
    private static CIELabColorSpace cieLabD65;

    private ColorSpaces() {try{__CLR4_5_2bqpbqpm68iyhtn.R.inc(15217);
        //Don't instantiate this class
    }finally{__CLR4_5_2bqpbqpm68iyhtn.R.flushNeeded();}}

    /**
     * Returns an instance of the device-specific CMYK color space.
     * @return an instance of the device-specific CMYK color space
     */
    public static synchronized DeviceCMYKColorSpace getDeviceCMYKColorSpace() {try{__CLR4_5_2bqpbqpm68iyhtn.R.inc(15218);
        __CLR4_5_2bqpbqpm68iyhtn.R.inc(15219);if ((((deviceCMYK == null)&&(__CLR4_5_2bqpbqpm68iyhtn.R.iget(15220)!=0|true))||(__CLR4_5_2bqpbqpm68iyhtn.R.iget(15221)==0&false))) {{
            __CLR4_5_2bqpbqpm68iyhtn.R.inc(15222);deviceCMYK = new DeviceCMYKColorSpace();
        }
        }__CLR4_5_2bqpbqpm68iyhtn.R.inc(15223);return deviceCMYK;
    }finally{__CLR4_5_2bqpbqpm68iyhtn.R.flushNeeded();}}

    /**
     * Indicates whether the given color space is device-specific (i.e. uncalibrated).
     * @param cs the color space to check
     * @return true if the color space is device-specific
     */
    public static boolean isDeviceColorSpace(ColorSpace cs) {try{__CLR4_5_2bqpbqpm68iyhtn.R.inc(15224);
        __CLR4_5_2bqpbqpm68iyhtn.R.inc(15225);return (cs instanceof AbstractDeviceSpecificColorSpace);
    }finally{__CLR4_5_2bqpbqpm68iyhtn.R.flushNeeded();}}

    /**
     * Returns an instance of the CIE L*a*b* color space using the D50 white point.
     * @return an instance of the requested CIE L*a*b* color space
     */
    public static synchronized CIELabColorSpace getCIELabColorSpaceD50() {try{__CLR4_5_2bqpbqpm68iyhtn.R.inc(15226);
        __CLR4_5_2bqpbqpm68iyhtn.R.inc(15227);if ((((cieLabD50 == null)&&(__CLR4_5_2bqpbqpm68iyhtn.R.iget(15228)!=0|true))||(__CLR4_5_2bqpbqpm68iyhtn.R.iget(15229)==0&false))) {{
            __CLR4_5_2bqpbqpm68iyhtn.R.inc(15230);cieLabD50 = new CIELabColorSpace(CIELabColorSpace.getD50WhitePoint());
        }
        }__CLR4_5_2bqpbqpm68iyhtn.R.inc(15231);return cieLabD50;
    }finally{__CLR4_5_2bqpbqpm68iyhtn.R.flushNeeded();}}

    /**
     * Returns an instance of the CIE L*a*b* color space using the D65 white point.
     * @return an instance of the requested CIE L*a*b* color space
     */
    public static synchronized CIELabColorSpace getCIELabColorSpaceD65() {try{__CLR4_5_2bqpbqpm68iyhtn.R.inc(15232);
        __CLR4_5_2bqpbqpm68iyhtn.R.inc(15233);if ((((cieLabD65 == null)&&(__CLR4_5_2bqpbqpm68iyhtn.R.iget(15234)!=0|true))||(__CLR4_5_2bqpbqpm68iyhtn.R.iget(15235)==0&false))) {{
            __CLR4_5_2bqpbqpm68iyhtn.R.inc(15236);cieLabD65 = new CIELabColorSpace(CIELabColorSpace.getD65WhitePoint());
        }
        }__CLR4_5_2bqpbqpm68iyhtn.R.inc(15237);return cieLabD65;
    }finally{__CLR4_5_2bqpbqpm68iyhtn.R.flushNeeded();}}

    private static final ColorSpaceOrigin UNKNOWN_ORIGIN = new ColorSpaceOrigin() {

        public String getProfileURI() {try{__CLR4_5_2bqpbqpm68iyhtn.R.inc(15238);
            __CLR4_5_2bqpbqpm68iyhtn.R.inc(15239);return null;
        }finally{__CLR4_5_2bqpbqpm68iyhtn.R.flushNeeded();}}

        public String getProfileName() {try{__CLR4_5_2bqpbqpm68iyhtn.R.inc(15240);
            __CLR4_5_2bqpbqpm68iyhtn.R.inc(15241);return null;
        }finally{__CLR4_5_2bqpbqpm68iyhtn.R.flushNeeded();}}
    };

    /**
     * Returns information about the origin of a color space.
     * @param cs the color space
     * @return the origin information
     */
    public static ColorSpaceOrigin getColorSpaceOrigin(ColorSpace cs) {try{__CLR4_5_2bqpbqpm68iyhtn.R.inc(15242);
        __CLR4_5_2bqpbqpm68iyhtn.R.inc(15243);if ((((cs instanceof ColorSpaceOrigin)&&(__CLR4_5_2bqpbqpm68iyhtn.R.iget(15244)!=0|true))||(__CLR4_5_2bqpbqpm68iyhtn.R.iget(15245)==0&false))) {{
            __CLR4_5_2bqpbqpm68iyhtn.R.inc(15246);return (ColorSpaceOrigin)cs;
        } }else {{
            __CLR4_5_2bqpbqpm68iyhtn.R.inc(15247);return UNKNOWN_ORIGIN;
        }
    }}finally{__CLR4_5_2bqpbqpm68iyhtn.R.flushNeeded();}}

}
