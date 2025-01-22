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

/* $Id: PSFontUtils.java 1345759 2012-06-03 20:09:09Z gadams $ */

package org.apache.xmlgraphics.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.EndianUtils;
import org.apache.commons.io.IOUtils;

import org.apache.xmlgraphics.fonts.Glyphs;
import org.apache.xmlgraphics.util.io.ASCIIHexOutputStream;
import org.apache.xmlgraphics.util.io.SubInputStream;

// CSOFF: HideUtilityClassConstructor

/**
 * Utility code for font handling in PostScript.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PSFontUtils {public static class __CLR4_5_2d85d85m68iyi17{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,17244,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public PSFontUtils() {try{__CLR4_5_2d85d85m68iyi17.R.inc(17141);
    }finally{__CLR4_5_2d85d85m68iyi17.R.flushNeeded();}}

    /**
     * This method reads a Type 1 font from a stream and embeds it into a PostScript stream.
     * Note: Only the IBM PC Format as described in section 3.3 of the Adobe Technical Note #5040
     * is supported.
     * @param gen The PostScript generator
     * @param in the InputStream from which to read the Type 1 font
     * @throws IOException in case an I/O problem occurs
     */
    public static void embedType1Font(PSGenerator gen, InputStream in) throws IOException {try{__CLR4_5_2d85d85m68iyi17.R.inc(17142);
        __CLR4_5_2d85d85m68iyi17.R.inc(17143);boolean finished = false;
        __CLR4_5_2d85d85m68iyi17.R.inc(17144);while ((((!finished)&&(__CLR4_5_2d85d85m68iyi17.R.iget(17145)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17146)==0&false))) {{
            __CLR4_5_2d85d85m68iyi17.R.inc(17147);int segIndicator = in.read();
            __CLR4_5_2d85d85m68iyi17.R.inc(17148);if ((((segIndicator < 0)&&(__CLR4_5_2d85d85m68iyi17.R.iget(17149)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17150)==0&false))) {{
                __CLR4_5_2d85d85m68iyi17.R.inc(17151);throw new IOException("Unexpected end-of-file while reading segment indicator");
            } }else {__CLR4_5_2d85d85m68iyi17.R.inc(17152);if ((((segIndicator != 128)&&(__CLR4_5_2d85d85m68iyi17.R.iget(17153)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17154)==0&false))) {{
                __CLR4_5_2d85d85m68iyi17.R.inc(17155);throw new IOException("Expected ASCII 128, found: " + segIndicator);
            }
            }}__CLR4_5_2d85d85m68iyi17.R.inc(17156);int segType = in.read();
            __CLR4_5_2d85d85m68iyi17.R.inc(17157);if ((((segType < 0)&&(__CLR4_5_2d85d85m68iyi17.R.iget(17158)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17159)==0&false))) {{
                __CLR4_5_2d85d85m68iyi17.R.inc(17160);throw new IOException("Unexpected end-of-file while reading segment type");
            }
            }__CLR4_5_2d85d85m68iyi17.R.inc(17161);int dataSegLen = 0;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2d85d85m68iyi17.R.inc(17162);switch (segType) {
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2d85d85m68iyi17.R.inc(17163);__CLB4_5_2_bool0=true;} //ASCII
                    __CLR4_5_2d85d85m68iyi17.R.inc(17164);dataSegLen = EndianUtils.readSwappedInteger(in);

                    __CLR4_5_2d85d85m68iyi17.R.inc(17165);BufferedReader reader = new BufferedReader(
                            new java.io.InputStreamReader(
                                    new SubInputStream(in, dataSegLen), "US-ASCII"));
                    __CLR4_5_2d85d85m68iyi17.R.inc(17166);String line;
                    __CLR4_5_2d85d85m68iyi17.R.inc(17167);while ((line = reader.readLine()) != null) {{
                        __CLR4_5_2d85d85m68iyi17.R.inc(17170);gen.writeln(line);
                        }
                    }__CLR4_5_2d85d85m68iyi17.R.inc(17171);break;
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2d85d85m68iyi17.R.inc(17172);__CLB4_5_2_bool0=true;} //binary
                    __CLR4_5_2d85d85m68iyi17.R.inc(17173);dataSegLen = EndianUtils.readSwappedInteger(in);

                    __CLR4_5_2d85d85m68iyi17.R.inc(17174);SubInputStream sin = new SubInputStream(in, dataSegLen);
                    __CLR4_5_2d85d85m68iyi17.R.inc(17175);ASCIIHexOutputStream hexOut = new ASCIIHexOutputStream(gen.getOutputStream());
                    __CLR4_5_2d85d85m68iyi17.R.inc(17176);IOUtils.copy(sin, hexOut);
                    __CLR4_5_2d85d85m68iyi17.R.inc(17177);gen.newLine();
                    __CLR4_5_2d85d85m68iyi17.R.inc(17178);break;
                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2d85d85m68iyi17.R.inc(17179);__CLB4_5_2_bool0=true;} //EOF
                    __CLR4_5_2d85d85m68iyi17.R.inc(17180);finished = true;
                    __CLR4_5_2d85d85m68iyi17.R.inc(17181);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2d85d85m68iyi17.R.inc(17182);__CLB4_5_2_bool0=true;} __CLR4_5_2d85d85m68iyi17.R.inc(17183);throw new IOException("Unsupported segment type: " + segType);
            }
        }
    }}finally{__CLR4_5_2d85d85m68iyi17.R.flushNeeded();}}

    /** the PSResource representing the WinAnsiEncoding. */
    public static final PSResource WINANSI_ENCODING_RESOURCE
            = new PSResource(PSResource.TYPE_ENCODING, "WinAnsiEncoding");

    /**
     * Defines the WinAnsi encoding for use in PostScript files.
     * @param gen the PostScript generator
     * @throws IOException In case of an I/O problem
     */
    public static void defineWinAnsiEncoding(PSGenerator gen) throws IOException {try{__CLR4_5_2d85d85m68iyi17.R.inc(17184);
        __CLR4_5_2d85d85m68iyi17.R.inc(17185);gen.writeDSCComment(DSCConstants.BEGIN_RESOURCE, WINANSI_ENCODING_RESOURCE);
        __CLR4_5_2d85d85m68iyi17.R.inc(17186);gen.writeln("/WinAnsiEncoding [");
        __CLR4_5_2d85d85m68iyi17.R.inc(17187);for (int i = 0; (((i < Glyphs.WINANSI_ENCODING.length)&&(__CLR4_5_2d85d85m68iyi17.R.iget(17188)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17189)==0&false)); i++) {{
            __CLR4_5_2d85d85m68iyi17.R.inc(17190);if ((((i > 0)&&(__CLR4_5_2d85d85m68iyi17.R.iget(17191)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17192)==0&false))) {{
                __CLR4_5_2d85d85m68iyi17.R.inc(17193);if (((((i % 5) == 0)&&(__CLR4_5_2d85d85m68iyi17.R.iget(17194)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17195)==0&false))) {{
                    __CLR4_5_2d85d85m68iyi17.R.inc(17196);gen.newLine();
                } }else {{
                    __CLR4_5_2d85d85m68iyi17.R.inc(17197);gen.write(" ");
                }
            }}
            }__CLR4_5_2d85d85m68iyi17.R.inc(17198);final char ch = Glyphs.WINANSI_ENCODING[i];
            __CLR4_5_2d85d85m68iyi17.R.inc(17199);final String glyphname = Glyphs.charToGlyphName(ch);
            __CLR4_5_2d85d85m68iyi17.R.inc(17200);if (((("".equals(glyphname))&&(__CLR4_5_2d85d85m68iyi17.R.iget(17201)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17202)==0&false))) {{
                __CLR4_5_2d85d85m68iyi17.R.inc(17203);gen.write("/" + Glyphs.NOTDEF);
            } }else {{
                __CLR4_5_2d85d85m68iyi17.R.inc(17204);gen.write("/");
                __CLR4_5_2d85d85m68iyi17.R.inc(17205);gen.write(glyphname);
            }
        }}
        }__CLR4_5_2d85d85m68iyi17.R.inc(17206);gen.newLine();
        __CLR4_5_2d85d85m68iyi17.R.inc(17207);gen.writeln("] def");
        __CLR4_5_2d85d85m68iyi17.R.inc(17208);gen.writeDSCComment(DSCConstants.END_RESOURCE);
        __CLR4_5_2d85d85m68iyi17.R.inc(17209);gen.getResourceTracker().registerSuppliedResource(WINANSI_ENCODING_RESOURCE);
    }finally{__CLR4_5_2d85d85m68iyi17.R.flushNeeded();}}

    /** the PSResource representing the AdobeStandardCyrillicEncoding. */
    public static final PSResource ADOBECYRILLIC_ENCODING_RESOURCE
            = new PSResource(PSResource.TYPE_ENCODING, "AdobeStandardCyrillicEncoding");

    /**
     * Defines the AdobeStandardCyrillic encoding for use in PostScript files.
     * @param gen the PostScript generator
     * @throws IOException In case of an I/O problem
     */
    public static void defineAdobeCyrillicEncoding(PSGenerator gen) throws IOException {try{__CLR4_5_2d85d85m68iyi17.R.inc(17210);
        __CLR4_5_2d85d85m68iyi17.R.inc(17211);gen.writeDSCComment(DSCConstants.BEGIN_RESOURCE, ADOBECYRILLIC_ENCODING_RESOURCE);
        __CLR4_5_2d85d85m68iyi17.R.inc(17212);gen.writeln("/AdobeStandardCyrillicEncoding [");
        __CLR4_5_2d85d85m68iyi17.R.inc(17213);for (int i = 0; (((i < Glyphs.ADOBECYRILLIC_ENCODING.length)&&(__CLR4_5_2d85d85m68iyi17.R.iget(17214)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17215)==0&false)); i++) {{
            __CLR4_5_2d85d85m68iyi17.R.inc(17216);if ((((i > 0)&&(__CLR4_5_2d85d85m68iyi17.R.iget(17217)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17218)==0&false))) {{
                __CLR4_5_2d85d85m68iyi17.R.inc(17219);if (((((i % 5) == 0)&&(__CLR4_5_2d85d85m68iyi17.R.iget(17220)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17221)==0&false))) {{
                    __CLR4_5_2d85d85m68iyi17.R.inc(17222);gen.newLine();
                } }else {{
                    __CLR4_5_2d85d85m68iyi17.R.inc(17223);gen.write(" ");
                }
            }}
            }__CLR4_5_2d85d85m68iyi17.R.inc(17224);final char ch = Glyphs.ADOBECYRILLIC_ENCODING[i];
            __CLR4_5_2d85d85m68iyi17.R.inc(17225);final String glyphname = Glyphs.charToGlyphName(ch);
            __CLR4_5_2d85d85m68iyi17.R.inc(17226);if (((("".equals(glyphname))&&(__CLR4_5_2d85d85m68iyi17.R.iget(17227)!=0|true))||(__CLR4_5_2d85d85m68iyi17.R.iget(17228)==0&false))) {{
                __CLR4_5_2d85d85m68iyi17.R.inc(17229);gen.write("/" + Glyphs.NOTDEF);
            } }else {{
                __CLR4_5_2d85d85m68iyi17.R.inc(17230);gen.write("/");
                __CLR4_5_2d85d85m68iyi17.R.inc(17231);gen.write(glyphname);
            }
        }}
        }__CLR4_5_2d85d85m68iyi17.R.inc(17232);gen.newLine();
        __CLR4_5_2d85d85m68iyi17.R.inc(17233);gen.writeln("] def");
        __CLR4_5_2d85d85m68iyi17.R.inc(17234);gen.writeDSCComment(DSCConstants.END_RESOURCE);
        __CLR4_5_2d85d85m68iyi17.R.inc(17235);gen.getResourceTracker().registerSuppliedResource(ADOBECYRILLIC_ENCODING_RESOURCE);
    }finally{__CLR4_5_2d85d85m68iyi17.R.flushNeeded();}}


    /**
     * Redefines the encoding of a font.
     * @param gen the PostScript generator
     * @param fontName the font name
     * @param encoding the new encoding (must be predefined in the PS file)
     * @throws IOException In case of an I/O problem
     */
    public static void redefineFontEncoding(PSGenerator gen, String fontName, String encoding)
                throws IOException {try{__CLR4_5_2d85d85m68iyi17.R.inc(17236);
        __CLR4_5_2d85d85m68iyi17.R.inc(17237);gen.writeln("/" + fontName + " findfont");
        __CLR4_5_2d85d85m68iyi17.R.inc(17238);gen.writeln("dup length dict begin");
        __CLR4_5_2d85d85m68iyi17.R.inc(17239);gen.writeln("  {1 index /FID ne {def} {pop pop} ifelse} forall");
        __CLR4_5_2d85d85m68iyi17.R.inc(17240);gen.writeln("  /Encoding " + encoding + " def");
        __CLR4_5_2d85d85m68iyi17.R.inc(17241);gen.writeln("  currentdict");
        __CLR4_5_2d85d85m68iyi17.R.inc(17242);gen.writeln("end");
        __CLR4_5_2d85d85m68iyi17.R.inc(17243);gen.writeln("/" + fontName + " exch definefont pop");
    }finally{__CLR4_5_2d85d85m68iyi17.R.flushNeeded();}}

}
