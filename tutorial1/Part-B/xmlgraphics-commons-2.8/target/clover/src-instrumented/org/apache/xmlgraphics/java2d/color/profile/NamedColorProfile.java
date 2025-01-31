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

/* $Id: NamedColorProfile.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.java2d.color.profile;

import org.apache.xmlgraphics.java2d.color.NamedColorSpace;
import org.apache.xmlgraphics.java2d.color.RenderingIntent;

/**
 * Simplified in-memory representation of an ICC named color profile.
 */
public class NamedColorProfile {public static class __CLR4_5_2c25c25m6lb50xu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,15659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String profileName;
    private String copyright;
    private NamedColorSpace[] namedColors;
    private RenderingIntent renderingIntent = RenderingIntent.PERCEPTUAL;

    /**
     * Creates a new named color profile.
     * @param profileName the profile name
     * @param copyright the copyright
     * @param namedColors the array of named colors
     * @param intent the rendering intent
     */
    public NamedColorProfile(String profileName, String copyright, NamedColorSpace[] namedColors,
            RenderingIntent intent) {try{__CLR4_5_2c25c25m6lb50xu.R.inc(15629);
        __CLR4_5_2c25c25m6lb50xu.R.inc(15630);this.profileName = profileName;
        __CLR4_5_2c25c25m6lb50xu.R.inc(15631);this.copyright = copyright;
        __CLR4_5_2c25c25m6lb50xu.R.inc(15632);this.namedColors = namedColors;
        __CLR4_5_2c25c25m6lb50xu.R.inc(15633);this.renderingIntent = intent;
    }finally{__CLR4_5_2c25c25m6lb50xu.R.flushNeeded();}}

    /**
     * Returns the color profile's rendering intent.
     * @return the rendering intent
     * (See {@link java.awt.color.ICC_Profile}.ic*)
     */
    public RenderingIntent getRenderingIntent() {try{__CLR4_5_2c25c25m6lb50xu.R.inc(15634);
        __CLR4_5_2c25c25m6lb50xu.R.inc(15635);return this.renderingIntent;
    }finally{__CLR4_5_2c25c25m6lb50xu.R.flushNeeded();}}

    /**
     * Returns the array of named colors.
     * @return the array of named colors
     */
    public NamedColorSpace[] getNamedColors() {try{__CLR4_5_2c25c25m6lb50xu.R.inc(15636);
        __CLR4_5_2c25c25m6lb50xu.R.inc(15637);NamedColorSpace[] copy = new NamedColorSpace[this.namedColors.length];
        __CLR4_5_2c25c25m6lb50xu.R.inc(15638);System.arraycopy(this.namedColors, 0, copy, 0, this.namedColors.length);
        __CLR4_5_2c25c25m6lb50xu.R.inc(15639);return copy;
    }finally{__CLR4_5_2c25c25m6lb50xu.R.flushNeeded();}}

    /**
     * Returns a named color.
     * @param name the color name
     * @return the named color (or null if it is not available)
     */
    public NamedColorSpace getNamedColor(String name) {try{__CLR4_5_2c25c25m6lb50xu.R.inc(15640);
        __CLR4_5_2c25c25m6lb50xu.R.inc(15641);if ((((this.namedColors != null)&&(__CLR4_5_2c25c25m6lb50xu.R.iget(15642)!=0|true))||(__CLR4_5_2c25c25m6lb50xu.R.iget(15643)==0&false))) {{
            __CLR4_5_2c25c25m6lb50xu.R.inc(15644);for (NamedColorSpace namedColor : this.namedColors) {{
                __CLR4_5_2c25c25m6lb50xu.R.inc(15645);if ((((namedColor.getColorName().equals(name))&&(__CLR4_5_2c25c25m6lb50xu.R.iget(15646)!=0|true))||(__CLR4_5_2c25c25m6lb50xu.R.iget(15647)==0&false))) {{
                    __CLR4_5_2c25c25m6lb50xu.R.inc(15648);return namedColor;
                }
            }}
        }}
        }__CLR4_5_2c25c25m6lb50xu.R.inc(15649);return null;
    }finally{__CLR4_5_2c25c25m6lb50xu.R.flushNeeded();}}

    /**
     * Returns the profile name.
     * @return the profile name
     */
    public String getProfileName() {try{__CLR4_5_2c25c25m6lb50xu.R.inc(15650);
        __CLR4_5_2c25c25m6lb50xu.R.inc(15651);return this.profileName;
    }finally{__CLR4_5_2c25c25m6lb50xu.R.flushNeeded();}}

    /**
     * Returns the profile copyright.
     * @return the profile copyright
     */
    public String getCopyright() {try{__CLR4_5_2c25c25m6lb50xu.R.inc(15652);
        __CLR4_5_2c25c25m6lb50xu.R.inc(15653);return this.copyright;
    }finally{__CLR4_5_2c25c25m6lb50xu.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public String toString() {try{__CLR4_5_2c25c25m6lb50xu.R.inc(15654);
        __CLR4_5_2c25c25m6lb50xu.R.inc(15655);StringBuffer sb = new StringBuffer("Named color profile: ");
        __CLR4_5_2c25c25m6lb50xu.R.inc(15656);sb.append(getProfileName());
        __CLR4_5_2c25c25m6lb50xu.R.inc(15657);sb.append(", ").append(namedColors.length).append(" colors");
        __CLR4_5_2c25c25m6lb50xu.R.inc(15658);return sb.toString();
    }finally{__CLR4_5_2c25c25m6lb50xu.R.flushNeeded();}}

}
