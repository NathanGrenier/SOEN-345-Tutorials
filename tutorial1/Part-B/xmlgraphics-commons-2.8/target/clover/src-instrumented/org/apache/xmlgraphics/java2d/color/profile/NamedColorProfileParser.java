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

/* $Id: NamedColorProfileParser.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.java2d.color.profile;

import java.awt.color.ColorSpace;
import java.awt.color.ICC_Profile;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

import org.apache.xmlgraphics.java2d.color.CIELabColorSpace;
import org.apache.xmlgraphics.java2d.color.ColorSpaces;
import org.apache.xmlgraphics.java2d.color.NamedColorSpace;
import org.apache.xmlgraphics.java2d.color.RenderingIntent;

/**
 * This class is a parser for ICC named color profiles. It uses Java's {@link ICC_Profile} class
 * for parsing the basic structure but adds functionality to parse certain profile tags.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class NamedColorProfileParser {public static class __CLR4_5_2c2zc2zm68iyhvl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,15765,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MLUC = 0x6D6C7563; //'mluc'
    private static final int NCL2 = 0x6E636C32; //'ncl2'

    /**
     * Indicates whether the profile is a named color profile.
     * @param profile the color profile
     * @return true if the profile is a named color profile, false otherwise
     */
    public static boolean isNamedColorProfile(ICC_Profile profile) {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15659);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15660);return profile.getProfileClass() == ICC_Profile.CLASS_NAMEDCOLOR;
    }finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

    /**
     * Parses a named color profile (NCP).
     * @param profile the profile to analyze
     * @param profileName Optional profile name associated with this color profile
     * @param profileURI Optional profile URI associated with this color profile
     * @return an object representing the parsed NCP
     * @throws IOException if an I/O error occurs
     */
    public NamedColorProfile parseProfile(ICC_Profile profile,
            String profileName, String profileURI) throws IOException {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15661);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15662);if ((((!isNamedColorProfile(profile))&&(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15663)!=0|true))||(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15664)==0&false))) {{
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15665);throw new IllegalArgumentException("Given profile is not a named color profile (NCP)");
        }
        }__CLR4_5_2c2zc2zm68iyhvl.R.inc(15666);String profileDescription = getProfileDescription(profile);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15667);String copyright = getCopyright(profile);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15668);RenderingIntent intent = getRenderingIntent(profile);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15669);NamedColorSpace[] ncs = readNamedColors(profile, profileName, profileURI);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15670);return new NamedColorProfile(profileDescription, copyright, ncs, intent);
    }finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

    /**
     * Parses a named color profile (NCP).
     * @param profile the profile to analyze
     * @return an object representing the parsed NCP
     * @throws IOException if an I/O error occurs
     */
    public NamedColorProfile parseProfile(ICC_Profile profile) throws IOException {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15671);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15672);return parseProfile(profile, null, null);
    }finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

    private String getProfileDescription(ICC_Profile profile) throws IOException {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15673);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15674);byte[] tag = profile.getData(ICC_Profile.icSigProfileDescriptionTag);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15675);return readSimpleString(tag);
    }finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

    private String getCopyright(ICC_Profile profile) throws IOException {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15676);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15677);byte[] tag = profile.getData(ICC_Profile.icSigCopyrightTag);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15678);return readSimpleString(tag);
    }finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

    private RenderingIntent getRenderingIntent(ICC_Profile profile) throws IOException {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15679);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15680);byte[] hdr = profile.getData(ICC_Profile.icSigHead);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15681);int value = hdr[ICC_Profile.icHdrRenderingIntent];
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15682);return RenderingIntent.fromICCValue(value);
    }finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

    private NamedColorSpace[] readNamedColors(ICC_Profile profile,
            String profileName, String profileURI) throws IOException {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15683);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15684);byte[] tag = profile.getData(ICC_Profile.icSigNamedColor2Tag);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15685);DataInput din = new DataInputStream(new ByteArrayInputStream(tag));
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15686);int sig = din.readInt();
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15687);if ((((sig != NCL2)&&(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15688)!=0|true))||(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15689)==0&false))) {{
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15690);throw new UnsupportedOperationException("Unsupported structure type: "
                    + toSignatureString(sig) + ". Expected " + toSignatureString(NCL2));
        }
        }__CLR4_5_2c2zc2zm68iyhvl.R.inc(15691);din.skipBytes(8);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15692);int numColors = din.readInt();
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15693);NamedColorSpace[] result = new NamedColorSpace[numColors];
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15694);int numDeviceCoord = din.readInt();
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15695);String prefix = readAscii(din, 32);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15696);String suffix = readAscii(din, 32);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15697);for (int i = 0; (((i < numColors)&&(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15698)!=0|true))||(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15699)==0&false)); i++) {{
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15700);String name = prefix + readAscii(din, 32) + suffix;
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15701);int[] pcs = readUInt16Array(din, 3);
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15702);float[] colorvalue = new float[3];
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15703);for (int j = 0; (((j < pcs.length)&&(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15704)!=0|true))||(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15705)==0&false)); j++) {{
                __CLR4_5_2c2zc2zm68iyhvl.R.inc(15706);colorvalue[j] = ((float)pcs[j]) / 0x8000;
            }

            //device coordinates are ignored for now
            /*int[] deviceCoord =*/ }__CLR4_5_2c2zc2zm68iyhvl.R.inc(15707);readUInt16Array(din, numDeviceCoord);

            boolean __CLB4_5_2_bool0=false;__CLR4_5_2c2zc2zm68iyhvl.R.inc(15708);switch (profile.getPCSType()) {
            case ColorSpace.TYPE_XYZ:if (!__CLB4_5_2_bool0) {__CLR4_5_2c2zc2zm68iyhvl.R.inc(15709);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c2zc2zm68iyhvl.R.inc(15710);result[i] = new NamedColorSpace(name, colorvalue, profileName, profileURI);
                __CLR4_5_2c2zc2zm68iyhvl.R.inc(15711);break;
            case ColorSpace.TYPE_Lab:if (!__CLB4_5_2_bool0) {__CLR4_5_2c2zc2zm68iyhvl.R.inc(15712);__CLB4_5_2_bool0=true;}
                //Not sure if this always D50 here,
                //but the illuminant in the header is fixed to D50.
                __CLR4_5_2c2zc2zm68iyhvl.R.inc(15713);CIELabColorSpace labCS = ColorSpaces.getCIELabColorSpaceD50();
                __CLR4_5_2c2zc2zm68iyhvl.R.inc(15714);result[i] = new NamedColorSpace(name, labCS.toColor(colorvalue, 1.0f),
                        profileName, profileURI);
                __CLR4_5_2c2zc2zm68iyhvl.R.inc(15715);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2c2zc2zm68iyhvl.R.inc(15716);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c2zc2zm68iyhvl.R.inc(15717);throw new UnsupportedOperationException(
                        "PCS type is not supported: " + profile.getPCSType());
            }
        }
        }__CLR4_5_2c2zc2zm68iyhvl.R.inc(15718);return result;
    }finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

    private int[] readUInt16Array(DataInput din, int count) throws IOException {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15719);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15720);if ((((count == 0)&&(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15721)!=0|true))||(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15722)==0&false))) {{
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15723);return new int[0];
        }
        }__CLR4_5_2c2zc2zm68iyhvl.R.inc(15724);int[] result = new int[count];
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15725);for (int i = 0; (((i < count)&&(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15726)!=0|true))||(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15727)==0&false)); i++) {{
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15728);int v = din.readUnsignedShort();
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15729);result[i] = v;
        }
        }__CLR4_5_2c2zc2zm68iyhvl.R.inc(15730);return result;
    }finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

    private String readAscii(DataInput in, int maxLength) throws IOException {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15731);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15732);byte[] data = new byte[maxLength];
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15733);in.readFully(data);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15734);String result = new String(data, "US-ASCII");
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15735);int idx = result.indexOf('\0');
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15736);if ((((idx >= 0)&&(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15737)!=0|true))||(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15738)==0&false))) {{
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15739);result = result.substring(0, idx);
        }
        }__CLR4_5_2c2zc2zm68iyhvl.R.inc(15740);return result;
    }finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

    private String readSimpleString(byte[] tag) throws IOException {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15741);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15742);DataInput din = new DataInputStream(new ByteArrayInputStream(tag));
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15743);int sig = din.readInt();
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15744);if ((((sig == MLUC)&&(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15745)!=0|true))||(__CLR4_5_2c2zc2zm68iyhvl.R.iget(15746)==0&false))) {{
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15747);return readMLUC(din);
        } }else {{
            __CLR4_5_2c2zc2zm68iyhvl.R.inc(15748);return null; //Unsupported tag structure type
        }
    }}finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

    private String readMLUC(DataInput din) throws IOException {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15749);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15750);din.skipBytes(16);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15751);int firstLength = din.readInt();
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15752);int firstOffset = din.readInt();
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15753);int offset = 28;
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15754);din.skipBytes(firstOffset - offset);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15755);byte[] utf16 = new byte[firstLength];
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15756);din.readFully(utf16);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15757);return new String(utf16, "UTF-16BE");
    }finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

    private String toSignatureString(int sig) {try{__CLR4_5_2c2zc2zm68iyhvl.R.inc(15758);
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15759);StringBuffer sb = new StringBuffer();
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15760);sb.append((char)(sig >> 24 & 0xFF));
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15761);sb.append((char)(sig >> 16 & 0xFF));
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15762);sb.append((char)(sig >> 8 & 0xFF));
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15763);sb.append((char)(sig & 0xFF));
        __CLR4_5_2c2zc2zm68iyhvl.R.inc(15764);return sb.toString();
    }finally{__CLR4_5_2c2zc2zm68iyhvl.R.flushNeeded();}}

}
