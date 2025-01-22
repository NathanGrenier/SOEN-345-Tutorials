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

/* $Id: ASCII85OutputStream.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.util.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * This class applies a ASCII85 encoding to the stream.
 *
 * @version $Id: ASCII85OutputStream.java 1804124 2017-08-04 14:13:54Z ssteiner $
 */
public class ASCII85OutputStream extends FilterOutputStream
            implements ASCII85Constants, Finalizable {public static class __CLR4_5_2fwjfwjm68iyifx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,20712,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final boolean DEBUG = false;

    private int pos;
    private long buffer;
    private int posinline;
    private int bw;

    /** @see java.io.FilterOutputStream **/
    public ASCII85OutputStream(OutputStream out) {
        super(out);__CLR4_5_2fwjfwjm68iyifx.R.inc(20612);try{__CLR4_5_2fwjfwjm68iyifx.R.inc(20611);
    }finally{__CLR4_5_2fwjfwjm68iyifx.R.flushNeeded();}}

    /** @see java.io.FilterOutputStream **/
    public void write(int b) throws IOException {try{__CLR4_5_2fwjfwjm68iyifx.R.inc(20613);
        __CLR4_5_2fwjfwjm68iyifx.R.inc(20614);if ((((pos == 0)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20615)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20616)==0&false))) {{
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20617);buffer += (b << 24) & 0xff000000L;
        } }else {__CLR4_5_2fwjfwjm68iyifx.R.inc(20618);if ((((pos == 1)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20619)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20620)==0&false))) {{
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20621);buffer += (b << 16) & 0xff0000L;
        } }else {__CLR4_5_2fwjfwjm68iyifx.R.inc(20622);if ((((pos == 2)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20623)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20624)==0&false))) {{
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20625);buffer += (b << 8) & 0xff00L;
        } }else {{
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20626);buffer += b & 0xffL;
        }
        }}}__CLR4_5_2fwjfwjm68iyifx.R.inc(20627);pos++;

        __CLR4_5_2fwjfwjm68iyifx.R.inc(20628);if ((((pos > 3)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20629)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20630)==0&false))) {{
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20631);checkedWrite(convertWord(buffer));
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20632);buffer = 0;
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20633);pos = 0;
        }
    }}finally{__CLR4_5_2fwjfwjm68iyifx.R.flushNeeded();}}

    /* UNUSED ATM
    private void checkedWrite(int b) throws IOException {
        if (posinline == 80) {
            out.write(EOL); bw++;
            posinline = 0;
        }
        checkedWrite(b);
        posinline++;
        bw++;
    }*/

    private void checkedWrite(byte[] buf) throws IOException {try{__CLR4_5_2fwjfwjm68iyifx.R.inc(20634);
        __CLR4_5_2fwjfwjm68iyifx.R.inc(20635);checkedWrite(buf, buf.length, false);
    }finally{__CLR4_5_2fwjfwjm68iyifx.R.flushNeeded();}}

    private void checkedWrite(byte[] buf, boolean nosplit) throws IOException {try{__CLR4_5_2fwjfwjm68iyifx.R.inc(20636);
        __CLR4_5_2fwjfwjm68iyifx.R.inc(20637);checkedWrite(buf, buf.length, nosplit);
    }finally{__CLR4_5_2fwjfwjm68iyifx.R.flushNeeded();}}

    private void checkedWrite(byte[] buf , int len) throws IOException {try{__CLR4_5_2fwjfwjm68iyifx.R.inc(20638);
        __CLR4_5_2fwjfwjm68iyifx.R.inc(20639);checkedWrite(buf, len, false);
    }finally{__CLR4_5_2fwjfwjm68iyifx.R.flushNeeded();}}

    private void checkedWrite(byte[] buf , int len, boolean nosplit) throws IOException {try{__CLR4_5_2fwjfwjm68iyifx.R.inc(20640);
        __CLR4_5_2fwjfwjm68iyifx.R.inc(20641);if ((((posinline + len > 80)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20642)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20643)==0&false))) {{
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20644);int firstpart = ((((nosplit )&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20645)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20646)==0&false))? 0 : len - (posinline + len - 80));
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20647);if ((((firstpart > 0)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20648)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20649)==0&false))) {{
                __CLR4_5_2fwjfwjm68iyifx.R.inc(20650);out.write(buf, 0, firstpart);
            }
            }__CLR4_5_2fwjfwjm68iyifx.R.inc(20651);out.write(EOL);
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20652);bw++;
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20653);int rest = len - firstpart;
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20654);if ((((rest > 0)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20655)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20656)==0&false))) {{
                __CLR4_5_2fwjfwjm68iyifx.R.inc(20657);out.write(buf, firstpart, rest);
            }
            }__CLR4_5_2fwjfwjm68iyifx.R.inc(20658);posinline = rest;
        } }else {{
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20659);out.write(buf, 0, len);
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20660);posinline += len;
        }
        }__CLR4_5_2fwjfwjm68iyifx.R.inc(20661);bw += len;
    }finally{__CLR4_5_2fwjfwjm68iyifx.R.flushNeeded();}}

    /**
     * This converts a 32 bit value (4 bytes) into 5 bytes using base 85.
     * each byte in the result starts with zero at the '!' character so
     * the resulting base85 number fits into printable ascii chars
     *
     * @param word the 32 bit unsigned (hence the long datatype) word
     * @return 5 bytes (or a single byte of the 'z' character for word
     * values of 0)
     */
    private byte[] convertWord(long word) {try{__CLR4_5_2fwjfwjm68iyifx.R.inc(20662);
        __CLR4_5_2fwjfwjm68iyifx.R.inc(20663);word = word & 0xffffffff;

        __CLR4_5_2fwjfwjm68iyifx.R.inc(20664);if ((((word == 0)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20665)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20666)==0&false))) {{
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20667);return ZERO_ARRAY;
        } }else {{
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20668);if ((((word < 0)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20669)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20670)==0&false))) {{
                __CLR4_5_2fwjfwjm68iyifx.R.inc(20671);word = -word;
            }
            }__CLR4_5_2fwjfwjm68iyifx.R.inc(20672);byte c1 =
                (byte)((word
                        / POW85[0]) & 0xFF);
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20673);byte c2 =
                (byte)(((word - (c1 * POW85[0]))
                        / POW85[1]) & 0xFF);
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20674);byte c3 =
                (byte)(((word - (c1 * POW85[0])
                              - (c2 * POW85[1]))
                        / POW85[2]) & 0xFF);
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20675);byte c4 =
                (byte)(((word - (c1 * POW85[0])
                              - (c2 * POW85[1])
                              - (c3 * POW85[2]))
                        / POW85[3]) & 0xFF);
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20676);byte c5 =
                (byte)(((word - (c1 * POW85[0])
                              - (c2 * POW85[1])
                              - (c3 * POW85[2])
                              - (c4 * POW85[3])))
                        & 0xFF);

            __CLR4_5_2fwjfwjm68iyifx.R.inc(20677);byte[] ret = {
                (byte)(c1 + START), (byte)(c2 + START),
                (byte)(c3 + START), (byte)(c4 + START),
                (byte)(c5 + START)
            };

            __CLR4_5_2fwjfwjm68iyifx.R.inc(20678);if ((((DEBUG)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20679)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20680)==0&false))) {{
                __CLR4_5_2fwjfwjm68iyifx.R.inc(20681);for (byte aRet : ret) {{
                    __CLR4_5_2fwjfwjm68iyifx.R.inc(20682);if ((((aRet < 33 || aRet > 117)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20683)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20684)==0&false))) {{
                        __CLR4_5_2fwjfwjm68iyifx.R.inc(20685);System.out.println("Illegal char value "
                                + (int) aRet);
                    }
                }}
            }}
            }__CLR4_5_2fwjfwjm68iyifx.R.inc(20686);return ret;
        }
    }}finally{__CLR4_5_2fwjfwjm68iyifx.R.flushNeeded();}}

    /** @see Finalizable **/
    public void finalizeStream() throws IOException {try{__CLR4_5_2fwjfwjm68iyifx.R.inc(20687);
        // now take care of the trailing few bytes.
        // with n leftover bytes, we append 0 bytes to make a full group of 4
        // then convert like normal (except not applying the special zero rule)
        // and write out the first n+1 bytes from the result
        __CLR4_5_2fwjfwjm68iyifx.R.inc(20688);if ((((pos > 0)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20689)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20690)==0&false))) {{
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20691);int rest = pos;
            /*
            byte[] lastdata = new byte[4];
            int i = 0;
            for (int j = 0; j < 4; j++) {
                if (j < rest) {
                    lastdata[j] = data[i++];
                } else {
                    lastdata[j] = 0;
                }
            }

            long val = ((lastdata[0] << 24) & 0xff000000L)
                       + ((lastdata[1] << 16) & 0xff0000L)
                       + ((lastdata[2] << 8) & 0xff00L)
                       + (lastdata[3] & 0xffL);
            */

            __CLR4_5_2fwjfwjm68iyifx.R.inc(20692);byte[] conv;
            // special rule for handling zeros at the end
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20693);if ((((buffer != 0)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20694)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20695)==0&false))) {{
                __CLR4_5_2fwjfwjm68iyifx.R.inc(20696);conv = convertWord(buffer);
            } }else {{
                __CLR4_5_2fwjfwjm68iyifx.R.inc(20697);conv = new byte[5];
                __CLR4_5_2fwjfwjm68iyifx.R.inc(20698);for (int j = 0; (((j < 5)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20699)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20700)==0&false)); j++) {{
                    __CLR4_5_2fwjfwjm68iyifx.R.inc(20701);conv[j] = (byte)'!';
                }
            }}
            // assert rest+1 <= 5
            }__CLR4_5_2fwjfwjm68iyifx.R.inc(20702);checkedWrite(conv, rest + 1);
        }
        // finally write the two character end of data marker
        }__CLR4_5_2fwjfwjm68iyifx.R.inc(20703);checkedWrite(EOD, true);

        __CLR4_5_2fwjfwjm68iyifx.R.inc(20704);flush();
        __CLR4_5_2fwjfwjm68iyifx.R.inc(20705);if ((((out instanceof Finalizable)&&(__CLR4_5_2fwjfwjm68iyifx.R.iget(20706)!=0|true))||(__CLR4_5_2fwjfwjm68iyifx.R.iget(20707)==0&false))) {{
            __CLR4_5_2fwjfwjm68iyifx.R.inc(20708);((Finalizable)out).finalizeStream();
        }
    }}finally{__CLR4_5_2fwjfwjm68iyifx.R.flushNeeded();}}

    /** @see java.io.FilterOutputStream **/
    public void close() throws IOException {try{__CLR4_5_2fwjfwjm68iyifx.R.inc(20709);
        __CLR4_5_2fwjfwjm68iyifx.R.inc(20710);finalizeStream();
        __CLR4_5_2fwjfwjm68iyifx.R.inc(20711);super.close();
    }finally{__CLR4_5_2fwjfwjm68iyifx.R.flushNeeded();}}

}


