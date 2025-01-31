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

/* $Id: ASCII85InputStream.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.util.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * This class applies a ASCII85 decoding to the stream.
 * <p>
 * The class is derived from InputStream instead of FilteredInputStream because
 * we can use the read(byte[], int, int) method from InputStream which simply
 * delegates to read(). This makes the implementation easier.
 * <p>
 * The filter is described in chapter 3.13.3 of the PostScript Language
 * Reference (third edition).
 *
 * @version $Id: ASCII85InputStream.java 1732018 2016-02-24 04:51:06Z gadams $
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ASCII85InputStream extends InputStream
            implements ASCII85Constants {public static class __CLR4_5_2ftjftjm6lb511y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,20611,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private InputStream in;
    private boolean eodReached;
    private int[] b = new int[4]; //decoded
    private int bSize;
    private int bIndex;

    /** @see java.io.FilterInputStream **/
    public ASCII85InputStream(InputStream in) {
        super();__CLR4_5_2ftjftjm6lb511y.R.inc(20504);try{__CLR4_5_2ftjftjm6lb511y.R.inc(20503);
        __CLR4_5_2ftjftjm6lb511y.R.inc(20505);this.in = in;
    }finally{__CLR4_5_2ftjftjm6lb511y.R.flushNeeded();}}

    /** @see java.io.FilterInputStream **/
    public int read() throws IOException {try{__CLR4_5_2ftjftjm6lb511y.R.inc(20506);
        //Check if we need to read the next tuple
        __CLR4_5_2ftjftjm6lb511y.R.inc(20507);if ((((bIndex >= bSize)&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20508)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20509)==0&false))) {{
            __CLR4_5_2ftjftjm6lb511y.R.inc(20510);if ((((eodReached)&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20511)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20512)==0&false))) {{
                __CLR4_5_2ftjftjm6lb511y.R.inc(20513);return -1;
            }
            }__CLR4_5_2ftjftjm6lb511y.R.inc(20514);readNextTuple();
            __CLR4_5_2ftjftjm6lb511y.R.inc(20515);if ((((bSize == 0)&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20516)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20517)==0&false))) {{
                __CLR4_5_2ftjftjm6lb511y.R.inc(20518);if ((((!eodReached)&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20519)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20520)==0&false))) {{
                    __CLR4_5_2ftjftjm6lb511y.R.inc(20521);throw new IllegalStateException("Internal error");
                }
                }__CLR4_5_2ftjftjm6lb511y.R.inc(20522);return -1;
            }
        }}
        }__CLR4_5_2ftjftjm6lb511y.R.inc(20523);int result = b[bIndex];
        __CLR4_5_2ftjftjm6lb511y.R.inc(20524);result = ((((result < 0 )&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20525)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20526)==0&false))? 256 + result : result);
        __CLR4_5_2ftjftjm6lb511y.R.inc(20527);bIndex++;
        __CLR4_5_2ftjftjm6lb511y.R.inc(20528);return result;
    }finally{__CLR4_5_2ftjftjm6lb511y.R.flushNeeded();}}

    private int filteredRead() throws IOException {try{__CLR4_5_2ftjftjm6lb511y.R.inc(20529);
        __CLR4_5_2ftjftjm6lb511y.R.inc(20530);int buf;
        __CLR4_5_2ftjftjm6lb511y.R.inc(20531);while (true) {{
            __CLR4_5_2ftjftjm6lb511y.R.inc(20532);buf = in.read();
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2ftjftjm6lb511y.R.inc(20533);switch (buf) {
                case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2ftjftjm6lb511y.R.inc(20534);__CLB4_5_2_bool0=true;} //null
                case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_2ftjftjm6lb511y.R.inc(20535);__CLB4_5_2_bool0=true;} //tab
                case 10:if (!__CLB4_5_2_bool0) {__CLR4_5_2ftjftjm6lb511y.R.inc(20536);__CLB4_5_2_bool0=true;} //LF
                case 12:if (!__CLB4_5_2_bool0) {__CLR4_5_2ftjftjm6lb511y.R.inc(20537);__CLB4_5_2_bool0=true;} //FF
                case 13:if (!__CLB4_5_2_bool0) {__CLR4_5_2ftjftjm6lb511y.R.inc(20538);__CLB4_5_2_bool0=true;} //CR
                case 32:if (!__CLB4_5_2_bool0) {__CLR4_5_2ftjftjm6lb511y.R.inc(20539);__CLB4_5_2_bool0=true;} //space
                    __CLR4_5_2ftjftjm6lb511y.R.inc(20540);continue; //ignore
                case ZERO:if (!__CLB4_5_2_bool0) {__CLR4_5_2ftjftjm6lb511y.R.inc(20541);__CLB4_5_2_bool0=true;}
                case 126:if (!__CLB4_5_2_bool0) {__CLR4_5_2ftjftjm6lb511y.R.inc(20542);__CLB4_5_2_bool0=true;} //= EOD[0] = '~'
                    __CLR4_5_2ftjftjm6lb511y.R.inc(20543);return buf;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ftjftjm6lb511y.R.inc(20544);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ftjftjm6lb511y.R.inc(20545);if (((((buf >= START) && (buf <= END))&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20546)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20547)==0&false))) {{
                        __CLR4_5_2ftjftjm6lb511y.R.inc(20548);return buf;
                    } }else {{
                        __CLR4_5_2ftjftjm6lb511y.R.inc(20549);throw new IOException("Illegal character detected: " + buf);
                    }
            }}
        }
    }}finally{__CLR4_5_2ftjftjm6lb511y.R.flushNeeded();}}

    private void handleEOD() throws IOException {try{__CLR4_5_2ftjftjm6lb511y.R.inc(20550);
        __CLR4_5_2ftjftjm6lb511y.R.inc(20551);final int buf = in.read();
        __CLR4_5_2ftjftjm6lb511y.R.inc(20552);if ((((buf != EOD[1])&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20553)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20554)==0&false))) {{
            __CLR4_5_2ftjftjm6lb511y.R.inc(20555);throw new IOException("'>' expected after '~' (EOD)");
        }
        }__CLR4_5_2ftjftjm6lb511y.R.inc(20556);eodReached = true;
        __CLR4_5_2ftjftjm6lb511y.R.inc(20557);bSize = 0;
        __CLR4_5_2ftjftjm6lb511y.R.inc(20558);bIndex = 0;
    }finally{__CLR4_5_2ftjftjm6lb511y.R.flushNeeded();}}

    private void readNextTuple() throws IOException {try{__CLR4_5_2ftjftjm6lb511y.R.inc(20559);
        __CLR4_5_2ftjftjm6lb511y.R.inc(20560);int buf;
        __CLR4_5_2ftjftjm6lb511y.R.inc(20561);long tuple = 0;
        //Read ahead and check for special "z"
        __CLR4_5_2ftjftjm6lb511y.R.inc(20562);buf = filteredRead();
        __CLR4_5_2ftjftjm6lb511y.R.inc(20563);if ((((buf == ZERO)&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20564)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20565)==0&false))) {{
            __CLR4_5_2ftjftjm6lb511y.R.inc(20566);java.util.Arrays.fill(b, 0);
            __CLR4_5_2ftjftjm6lb511y.R.inc(20567);bSize = 4;
            __CLR4_5_2ftjftjm6lb511y.R.inc(20568);bIndex = 0;
        } }else {__CLR4_5_2ftjftjm6lb511y.R.inc(20569);if ((((buf == EOD[0])&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20570)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20571)==0&false))) {{
            __CLR4_5_2ftjftjm6lb511y.R.inc(20572);handleEOD();
        } }else {{
            __CLR4_5_2ftjftjm6lb511y.R.inc(20573);int cIndex = 0;
            __CLR4_5_2ftjftjm6lb511y.R.inc(20574);tuple = (buf - START) * POW85[cIndex];
            __CLR4_5_2ftjftjm6lb511y.R.inc(20575);cIndex++;
            __CLR4_5_2ftjftjm6lb511y.R.inc(20576);while ((((cIndex < 5)&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20577)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20578)==0&false))) {{
                __CLR4_5_2ftjftjm6lb511y.R.inc(20579);buf = filteredRead();
                __CLR4_5_2ftjftjm6lb511y.R.inc(20580);if ((((buf == EOD[0])&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20581)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20582)==0&false))) {{
                    __CLR4_5_2ftjftjm6lb511y.R.inc(20583);handleEOD();
                    __CLR4_5_2ftjftjm6lb511y.R.inc(20584);break;
                } }else {__CLR4_5_2ftjftjm6lb511y.R.inc(20585);if ((((buf == ZERO)&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20586)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20587)==0&false))) {{
                    //Violation 2
                    __CLR4_5_2ftjftjm6lb511y.R.inc(20588);throw new IOException("Illegal 'z' within tuple");
                } }else {{
                    __CLR4_5_2ftjftjm6lb511y.R.inc(20589);tuple += (buf - START) * POW85[cIndex];
                    __CLR4_5_2ftjftjm6lb511y.R.inc(20590);cIndex++;
                }
            }}}
            }__CLR4_5_2ftjftjm6lb511y.R.inc(20591);int cSize = cIndex;
            __CLR4_5_2ftjftjm6lb511y.R.inc(20592);if ((((cSize == 1)&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20593)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20594)==0&false))) {{
                //Violation 3
                __CLR4_5_2ftjftjm6lb511y.R.inc(20595);throw new IOException("Only one character in tuple");
            }
            //Handle optional, trailing, incomplete tuple
            }__CLR4_5_2ftjftjm6lb511y.R.inc(20596);while ((((cIndex < 5)&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20597)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20598)==0&false))) {{
                __CLR4_5_2ftjftjm6lb511y.R.inc(20599);tuple += POW85[cIndex - 1];
                __CLR4_5_2ftjftjm6lb511y.R.inc(20600);cIndex++;
            }
            }__CLR4_5_2ftjftjm6lb511y.R.inc(20601);if ((((tuple > (2L << 31) - 1)&&(__CLR4_5_2ftjftjm6lb511y.R.iget(20602)!=0|true))||(__CLR4_5_2ftjftjm6lb511y.R.iget(20603)==0&false))) {{
                //Violation 1
                __CLR4_5_2ftjftjm6lb511y.R.inc(20604);throw new IOException("Illegal tuple (> 2^32 - 1)");
            }
            //Convert tuple
            }__CLR4_5_2ftjftjm6lb511y.R.inc(20605);b[0] = (byte)((tuple >> 24) & 0xFF);
            __CLR4_5_2ftjftjm6lb511y.R.inc(20606);b[1] = (byte)((tuple >> 16) & 0xFF);
            __CLR4_5_2ftjftjm6lb511y.R.inc(20607);b[2] = (byte)((tuple >> 8) & 0xFF);
            __CLR4_5_2ftjftjm6lb511y.R.inc(20608);b[3] = (byte)((tuple) & 0xFF);
            __CLR4_5_2ftjftjm6lb511y.R.inc(20609);bSize = cSize - 1;
            __CLR4_5_2ftjftjm6lb511y.R.inc(20610);bIndex = 0;
        }
    }}}finally{__CLR4_5_2ftjftjm6lb511y.R.flushNeeded();}}

}


