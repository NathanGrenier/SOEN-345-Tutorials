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

/* $Id: Base64TestCase.java 1876186 2020-04-06 13:37:10Z ssteiner $ */

package org.apache.xmlgraphics.util.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URL;

import org.junit.Test;

import static org.junit.Assert.fail;

import org.apache.commons.io.IOUtils;

/**
 * This test validates that the Base64 encoder/decoders work properly.
 *
 * @version $Id: Base64TestCase.java 1876186 2020-04-06 13:37:10Z ssteiner $
 */
public class Base64TestCase {static class __CLR4_5_2jpfjpfm6lb52e8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,25717,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private void innerBase64Test(String action, URL in, URL ref) throws Exception {try{__CLR4_5_2jpfjpfm6lb52e8.R.inc(25539);
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25540);InputStream inIS = dos2Unix(in);

        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25541);if ((((action.equals("ROUND"))&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25542)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25543)==0&false))) {{
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25544);ref = in;
        } }else {__CLR4_5_2jpfjpfm6lb52e8.R.inc(25545);if ((((!action.equals("ENCODE") && !action.equals("DECODE"))&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25546)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25547)==0&false))) {{
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25548);fail("Bad action string");
        }

        }}__CLR4_5_2jpfjpfm6lb52e8.R.inc(25549);InputStream refIS = dos2Unix(ref);

        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25550);if ((((action.equals("ENCODE") || action.equals("ROUND"))&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25551)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25552)==0&false))) {{
            // We need to encode the incomming data
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25553);PipedOutputStream pos = new PipedOutputStream();
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25554);OutputStream os = new Base64EncodeStream(pos);

            // Copy the input to the Base64 Encoder (in a seperate thread).
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25555);Thread t = new StreamCopier(inIS, os);

            // Read that from the piped output stream.
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25556);inIS = new PipedInputStream(pos);
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25557);t.start();
        }

        }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25558);if ((((action.equals("DECODE") || action.equals("ROUND"))&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25559)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25560)==0&false))) {{
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25561);inIS = new Base64DecodeStream(inIS);
        }


        }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25562);int mismatch = compareStreams(inIS, refIS, action.equals("ENCODE"));

        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25563);if ((((mismatch != -1)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25564)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25565)==0&false))) {{
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25566);fail("Wrong result");
        }
    }}finally{__CLR4_5_2jpfjpfm6lb52e8.R.flushNeeded();}}

    private InputStream dos2Unix(URL url) throws IOException {try{__CLR4_5_2jpfjpfm6lb52e8.R.inc(25567);
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25568);InputStream is = url.openStream();
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25569);byte[] data = IOUtils.toByteArray(is);
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25570);if ((((data.length > 1 && data[data.length - 1] == '\n')&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25571)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25572)==0&false))) {{
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25573);ByteArrayOutputStream bos = new ByteArrayOutputStream();
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25574);for (byte b : data) {{
                __CLR4_5_2jpfjpfm6lb52e8.R.inc(25575);if ((((b != '\r')&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25576)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25577)==0&false))) {{
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25578);bos.write(b);
                }
            }}
            }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25579);return new ByteArrayInputStream(bos.toByteArray());
        }
        }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25580);return new ByteArrayInputStream(data);
    }finally{__CLR4_5_2jpfjpfm6lb52e8.R.flushNeeded();}}

    private void innerBase64Test(String action, String in, String ref) throws Exception {try{__CLR4_5_2jpfjpfm6lb52e8.R.inc(25581);
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25582);final String baseURL = "file:src/test/resources/org/apache/xmlgraphics/util/io/";
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25583);innerBase64Test(action, new URL(baseURL + in), new URL(baseURL + ref));
    }finally{__CLR4_5_2jpfjpfm6lb52e8.R.flushNeeded();}}

    private void innerBase64Test(String in) throws Exception {try{__CLR4_5_2jpfjpfm6lb52e8.R.inc(25584);
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25585);innerBase64Test("ROUND", in, in);
    }finally{__CLR4_5_2jpfjpfm6lb52e8.R.flushNeeded();}}

    private void testBase64Group(String name) throws Exception {try{__CLR4_5_2jpfjpfm6lb52e8.R.inc(25586);
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25587);innerBase64Test("ENCODE", name, name + ".64");
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25588);innerBase64Test("DECODE", name + ".64", name);
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25589);innerBase64Test(name);
    }finally{__CLR4_5_2jpfjpfm6lb52e8.R.flushNeeded();}}

    /**
     * This method will only throw exceptions if some aspect
     * of the test's internal operation fails.
     */
    @Test
    public void testBase64() throws Exception {__CLR4_5_2jpfjpfm6lb52e8.R.globalSliceStart(getClass().getName(),25590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22yar3cjqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jpfjpfm6lb52e8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jpfjpfm6lb52e8.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.io.Base64TestCase.testBase64",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25590,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22yar3cjqu() throws Exception{try{__CLR4_5_2jpfjpfm6lb52e8.R.inc(25590);
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25591);System.out.println(new File(".").getCanonicalPath());
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25592);testBase64Group("zeroByte");
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25593);testBase64Group("oneByte");
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25594);testBase64Group("twoByte");
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25595);testBase64Group("threeByte");
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25596);testBase64Group("fourByte");
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25597);testBase64Group("tenByte");
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25598);testBase64Group("small");
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25599);testBase64Group("medium");
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25600);innerBase64Test("DECODE", "medium.pc.64", "medium");
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25601);innerBase64Test("large");
}finally{__CLR4_5_2jpfjpfm6lb52e8.R.flushNeeded();}}

    /**
     * Returns true if the contents of <tt>is1</tt> match the
     * contents of <tt>is2</tt>
     */
    public static int compareStreams(InputStream is1, InputStream is2,
                              boolean skipws) {try{__CLR4_5_2jpfjpfm6lb52e8.R.inc(25602);
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25603);byte[] data1 = new byte[100];
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25604);byte[] data2 = new byte[100];
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25605);int off1 = 0;
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25606);int off2 = 0;
        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25607);int idx = 0;

        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25608);try {
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25609);while (true) {{
                __CLR4_5_2jpfjpfm6lb52e8.R.inc(25610);int len1 = is1.read(data1, off1, data1.length - off1);
                __CLR4_5_2jpfjpfm6lb52e8.R.inc(25611);int len2 = is2.read(data2, off2, data2.length - off2);

                __CLR4_5_2jpfjpfm6lb52e8.R.inc(25612);if ((((off1 != 0)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25613)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25614)==0&false))) {{
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25615);if ((((len1 == -1)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25616)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25617)==0&false))) {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25618);len1 = off1;
                    } }else {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25619);len1 += off1;
                    }
                }}

                }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25620);if ((((off2 != 0)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25621)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25622)==0&false))) {{
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25623);if ((((len2 == -1)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25624)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25625)==0&false))) {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25626);len2 = off2;
                    } }else {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25627);len2 += off2;
                    }
                }}

                }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25628);if ((((len1 == -1)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25629)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25630)==0&false))) {{
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25631);if ((((len2 == -1)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25632)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25633)==0&false))) {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25634);break; // Both done...
                    }
                    // Only is1 is done...
                    }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25635);if ((((!skipws)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25636)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25637)==0&false))) {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25638);return idx;
                    }
                    // check if the rest of is2 is whitespace...
                    }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25639);for (int i2 = 0; (((i2 < len2)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25640)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25641)==0&false)); i2++) {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25642);if (((((data2[i2] != '\n') && (data2[i2] != '\r') && (data2[i2] != ' '))&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25643)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25644)==0&false))) {{
                            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25645);return idx + i2;
                        }
                    }}
                    }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25646);off1 = off2 = 0;
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25647);continue;
                }

                }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25648);if ((((len2 == -1)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25649)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25650)==0&false))) {{
                    // Only is2 is done...
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25651);if ((((!skipws)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25652)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25653)==0&false))) {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25654);return idx;
                    }

                    // Check if rest of is1 is whitespace...
                    }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25655);for (int i1 = 0; (((i1 < len1)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25656)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25657)==0&false)); i1++) {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25658);if (((((data1[i1] != '\n') && (data1[i1] != '\r') && (data1[i1] != ' '))&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25659)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25660)==0&false))) {{
                            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25661);return idx + i1;
                        }
                    }}
                    }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25662);off1 = off2 = 0;
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25663);continue;
                }

                }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25664);int i1 = 0;
                __CLR4_5_2jpfjpfm6lb52e8.R.inc(25665);int i2 = 0;
                __CLR4_5_2jpfjpfm6lb52e8.R.inc(25666);while (((((i1 < len1) && (i2 < len2))&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25667)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25668)==0&false))) {{
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25669);if ((((skipws)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25670)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25671)==0&false))) {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25672);if (((((data1[i1] == '\n') || (data1[i1] == '\r') || (data1[i1] == ' '))&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25673)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25674)==0&false))) {{
                            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25675);i1++;
                            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25676);continue;
                        }
                        }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25677);if (((((data2[i2] == '\n') || (data2[i2] == '\r') || (data2[i2] == ' '))&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25678)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25679)==0&false))) {{
                            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25680);i2++;
                            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25681);continue;
                        }
                    }}
                    }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25682);if ((((data1[i1] != data2[i2])&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25683)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25684)==0&false))) {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25685);return idx + i2;
                    }

                    }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25686);i1++;
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25687);i2++;
                }

                }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25688);if ((((i1 != len1)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25689)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25690)==0&false))) {{
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25691);System.arraycopy(data1, i1, data1, 0, len1 - i1);
                }
                }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25692);if ((((i2 != len2)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25693)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25694)==0&false))) {{
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25695);System.arraycopy(data2, i2, data2, 0, len2 - i2);
                }
                }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25696);off1 = len1 - i1;
                __CLR4_5_2jpfjpfm6lb52e8.R.inc(25697);off2 = len2 - i2;
                __CLR4_5_2jpfjpfm6lb52e8.R.inc(25698);idx += i2;
            }
        }} catch (IOException ioe) {
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25699);ioe.printStackTrace();
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25700);return idx;
        }

        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25701);return -1;
    }finally{__CLR4_5_2jpfjpfm6lb52e8.R.flushNeeded();}}


    static class StreamCopier extends Thread {
        InputStream src;
        OutputStream dst;

        public StreamCopier(InputStream src,
                            OutputStream dst) {try{__CLR4_5_2jpfjpfm6lb52e8.R.inc(25702);
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25703);this.src = src;
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25704);this.dst = dst;
        }finally{__CLR4_5_2jpfjpfm6lb52e8.R.flushNeeded();}}

        public void run() {try{__CLR4_5_2jpfjpfm6lb52e8.R.inc(25705);
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25706);try {
                __CLR4_5_2jpfjpfm6lb52e8.R.inc(25707);byte[] data = new byte[1000];
                __CLR4_5_2jpfjpfm6lb52e8.R.inc(25708);while (true) {{
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25709);int len = src.read(data, 0, data.length);
                    __CLR4_5_2jpfjpfm6lb52e8.R.inc(25710);if ((((len == -1)&&(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25711)!=0|true))||(__CLR4_5_2jpfjpfm6lb52e8.R.iget(25712)==0&false))) {{
                        __CLR4_5_2jpfjpfm6lb52e8.R.inc(25713);break;
                    }

                    }__CLR4_5_2jpfjpfm6lb52e8.R.inc(25714);dst.write(data, 0, len);
                }
            }} catch (IOException ioe) {
                // Nothing
            }
            __CLR4_5_2jpfjpfm6lb52e8.R.inc(25715);try {
                __CLR4_5_2jpfjpfm6lb52e8.R.inc(25716);dst.close();
            } catch (IOException ioe) {
                // Nothing
            }
        }finally{__CLR4_5_2jpfjpfm6lb52e8.R.flushNeeded();}}
    }
}
