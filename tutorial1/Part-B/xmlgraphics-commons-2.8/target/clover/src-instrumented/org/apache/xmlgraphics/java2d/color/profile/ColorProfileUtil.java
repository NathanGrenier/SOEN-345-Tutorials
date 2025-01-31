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

/* $Id: ColorProfileUtil.java 1400525 2012-10-20 22:03:56Z lbernardo $ */

package org.apache.xmlgraphics.java2d.color.profile;

import java.awt.color.ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.color.ICC_ProfileRGB;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

// CSOFF: MethodName

/**
 * Helper methods for handling color profiles.
 */
public final class ColorProfileUtil {public static class __CLR4_5_2c0uc0um6lb50xp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,15629,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ColorProfileUtil() {try{__CLR4_5_2c0uc0um6lb50xp.R.inc(15582);
    }finally{__CLR4_5_2c0uc0um6lb50xp.R.flushNeeded();}}

    /**
     * Returns the profile description of an ICC profile
     * @param profile the profile
     * @return the description
     */
    public static String getICCProfileDescription(ICC_Profile profile) {try{__CLR4_5_2c0uc0um6lb50xp.R.inc(15583);
        __CLR4_5_2c0uc0um6lb50xp.R.inc(15584);byte[] data = profile.getData(ICC_Profile.icSigProfileDescriptionTag);
        __CLR4_5_2c0uc0um6lb50xp.R.inc(15585);if ((((data == null)&&(__CLR4_5_2c0uc0um6lb50xp.R.iget(15586)!=0|true))||(__CLR4_5_2c0uc0um6lb50xp.R.iget(15587)==0&false))) {{
            __CLR4_5_2c0uc0um6lb50xp.R.inc(15588);return null;
        } }else {{
            //Info on the data format: http://www.color.org/ICC-1_1998-09.PDF
            __CLR4_5_2c0uc0um6lb50xp.R.inc(15589);int length = (data[8] << 3 * 8) | (data[9] << 2 * 8) | (data[10] << 8) | data[11];
            __CLR4_5_2c0uc0um6lb50xp.R.inc(15590);length--; //Remove trailing NUL character
            __CLR4_5_2c0uc0um6lb50xp.R.inc(15591);try {
                __CLR4_5_2c0uc0um6lb50xp.R.inc(15592);return new String(data, 12, length, "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                __CLR4_5_2c0uc0um6lb50xp.R.inc(15593);throw new UnsupportedOperationException("Incompatible VM");
            }
        }
    }}finally{__CLR4_5_2c0uc0um6lb50xp.R.flushNeeded();}}

    /**
     * Indicates whether a given color profile is identical to the default sRGB profile
     * provided by the Java class library.
     * @param profile the color profile to check
     * @return true if it is the default sRGB profile
     */
    public static boolean isDefaultsRGB(ICC_Profile profile) {try{__CLR4_5_2c0uc0um6lb50xp.R.inc(15594);
        __CLR4_5_2c0uc0um6lb50xp.R.inc(15595);if ((((!(profile instanceof ICC_ProfileRGB))&&(__CLR4_5_2c0uc0um6lb50xp.R.iget(15596)!=0|true))||(__CLR4_5_2c0uc0um6lb50xp.R.iget(15597)==0&false))) {{
          __CLR4_5_2c0uc0um6lb50xp.R.inc(15598);return false;
        }
        // not sure what the best way to compare two profiles is, but comparing instances is not the right way
        }__CLR4_5_2c0uc0um6lb50xp.R.inc(15599);ICC_Profile sRGBProfile = ICC_Profile.getInstance(ColorSpace.CS_sRGB);
        __CLR4_5_2c0uc0um6lb50xp.R.inc(15600);if ((((profile.getProfileClass() != sRGBProfile.getProfileClass())&&(__CLR4_5_2c0uc0um6lb50xp.R.iget(15601)!=0|true))||(__CLR4_5_2c0uc0um6lb50xp.R.iget(15602)==0&false))) {{
          __CLR4_5_2c0uc0um6lb50xp.R.inc(15603);return false;
        }
        }__CLR4_5_2c0uc0um6lb50xp.R.inc(15604);if ((((profile.getMajorVersion() != sRGBProfile.getMajorVersion())&&(__CLR4_5_2c0uc0um6lb50xp.R.iget(15605)!=0|true))||(__CLR4_5_2c0uc0um6lb50xp.R.iget(15606)==0&false))) {{
          __CLR4_5_2c0uc0um6lb50xp.R.inc(15607);return false;
        }
        }__CLR4_5_2c0uc0um6lb50xp.R.inc(15608);if ((((profile.getMinorVersion() != sRGBProfile.getMinorVersion())&&(__CLR4_5_2c0uc0um6lb50xp.R.iget(15609)!=0|true))||(__CLR4_5_2c0uc0um6lb50xp.R.iget(15610)==0&false))) {{
          __CLR4_5_2c0uc0um6lb50xp.R.inc(15611);return false;
        }
        }__CLR4_5_2c0uc0um6lb50xp.R.inc(15612);if ((((!Arrays.equals(profile.getData(), sRGBProfile.getData()))&&(__CLR4_5_2c0uc0um6lb50xp.R.iget(15613)!=0|true))||(__CLR4_5_2c0uc0um6lb50xp.R.iget(15614)==0&false))) {{
          __CLR4_5_2c0uc0um6lb50xp.R.inc(15615);return false;
        }
        }__CLR4_5_2c0uc0um6lb50xp.R.inc(15616);return true;
    }finally{__CLR4_5_2c0uc0um6lb50xp.R.flushNeeded();}}

    /**
     * Proxy method for {@link ICC_Profile#getInstance(byte[])}
     * that properly synchronizes the call to avoid a potential race condition.
     * @param data    the specified ICC Profile data
     * @return  an {@link ICC_Profile} instance corresponding to the data in the
     *          specified byte array
     */
    public static ICC_Profile getICC_Profile(byte[] data) {try{__CLR4_5_2c0uc0um6lb50xp.R.inc(15617);
        __CLR4_5_2c0uc0um6lb50xp.R.inc(15618);synchronized (ICC_Profile.class) {
            __CLR4_5_2c0uc0um6lb50xp.R.inc(15619);return ICC_Profile.getInstance(data);
        }
    }finally{__CLR4_5_2c0uc0um6lb50xp.R.flushNeeded();}}

    /**
     * Proxy method for {@link ICC_Profile#getInstance(int)}
     * that properly synchronizes the call to avoid a potential race condition.
     * @param colorSpace    the type of color space to create a profile for. The specified type is
     *                      one of the color space constants defined in the {@link ColorSpace}
     *                      class.
     * @return  an {@link ICC_Profile} instance corresponding to the specified {@code ColorSpace}
     * @throws IllegalArgumentException if {@code colorSpace} is not one of the predefined types
     */
    public static ICC_Profile getICC_Profile(int colorSpace) {try{__CLR4_5_2c0uc0um6lb50xp.R.inc(15620);
        __CLR4_5_2c0uc0um6lb50xp.R.inc(15621);synchronized (ICC_Profile.class) {
            __CLR4_5_2c0uc0um6lb50xp.R.inc(15622);return ICC_Profile.getInstance(colorSpace);
        }
    }finally{__CLR4_5_2c0uc0um6lb50xp.R.flushNeeded();}}

    /**
     * Proxy method for {@link ICC_Profile#getInstance(java.io.InputStream)}
     * that properly synchronizes the call to avoid a potential race condition.
     * @param in    the input stream from which to read the profile data
     * @return  an {@link ICC_Profile} instance corresponding to the data in the
     *          specified {@link InputStream}
     * @throws IOException  if an I/O error occurs while reading the stream
     * @throws IllegalArgumentException if the stream does not contain valid ICC Profile data
     */
    public static ICC_Profile getICC_Profile(InputStream in) throws IOException {try{__CLR4_5_2c0uc0um6lb50xp.R.inc(15623);
        __CLR4_5_2c0uc0um6lb50xp.R.inc(15624);synchronized (ICC_Profile.class) {
            __CLR4_5_2c0uc0um6lb50xp.R.inc(15625);return ICC_Profile.getInstance(in);
        }
    }finally{__CLR4_5_2c0uc0um6lb50xp.R.flushNeeded();}}

    /**
     * Proxy method for {@link ICC_Profile#getInstance(java.lang.String)}
     * that properly synchronizes the call to avoid a potential race condition.
     * @param fileName    the name of the file that contains the profile data
     * @return  an {@link ICC_Profile} instance corresponding to the data in the specified file
     * @throws IOException  if the file cannot be opened, or an I/O error occurs while reading
     *          the stream
     * @throws IllegalArgumentException if the stream does not contain valid ICC Profile data
     * @throws SecurityException if a security manager is installed and it does not permit read
     *          access to the given file.
     */
    public static ICC_Profile getICC_Profile(String fileName) throws IOException {try{__CLR4_5_2c0uc0um6lb50xp.R.inc(15626);
        __CLR4_5_2c0uc0um6lb50xp.R.inc(15627);synchronized (ICC_Profile.class) {
            __CLR4_5_2c0uc0um6lb50xp.R.inc(15628);return ICC_Profile.getInstance(fileName);
        }
    }finally{__CLR4_5_2c0uc0um6lb50xp.R.flushNeeded();}}

}
