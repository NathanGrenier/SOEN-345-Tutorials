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

/* $Id: Base64DecodeStream.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.util.io;

import java.io.IOException;
import java.io.InputStream;

// CSOFF: ConstantName
// CSOFF: MemberName
// CSOFF: MultipleVariableDeclarations
// CSOFF: NeedBraces
// CSOFF: OperatorWrap
// CSOFF: WhitespaceAround

/**
 * This class implements a Base64 Character decoder as specified in RFC1113.
 * Unlike some other encoding schemes there is nothing in this encoding that
 * tells the decoder where a buffer starts or stops, so to use it you will need
 * to isolate your encoded data into a single chunk and then feed them
 * this decoder. The simplest way to do that is to read all of the encoded
 * data into a string and then use:
 * <pre>
 *      byte    data[];
 *      InputStream is = new ByteArrayInputStream(data);
 *      is = new Base64DecodeStream(is);
 * </pre>
 *
 * On errors, this class throws a IOException with the following detail
 * strings:
 * <pre>
 *    "Base64DecodeStream: Bad Padding byte (2)."
 *    "Base64DecodeStream: Bad Padding byte (1)."
 * </pre>
 *
 * @version $Id: Base64DecodeStream.java 1732018 2016-02-24 04:51:06Z gadams $
 *
 * Originally authored by Thomas DeWeese, Vincent Hardy, and Chuck McManis.
 */

public class Base64DecodeStream extends InputStream {public static class __CLR4_5_2g0bg0bm68iyigf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,20853,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    InputStream src;

    public Base64DecodeStream(InputStream src) {try{__CLR4_5_2g0bg0bm68iyigf.R.inc(20747);
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20748);this.src = src;
    }finally{__CLR4_5_2g0bg0bm68iyigf.R.flushNeeded();}}

    private static final byte[] PEM_ARRAY = new byte[256];
    static {try{__CLR4_5_2g0bg0bm68iyigf.R.inc(20749);
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20750);for (int i = 0; (((i < PEM_ARRAY.length)&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20751)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20752)==0&false)); i++) {{
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20753);PEM_ARRAY[i] = -1;
        }

        }__CLR4_5_2g0bg0bm68iyigf.R.inc(20754);int idx = 0;
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20755);for (char c = 'A'; (((c <= 'Z')&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20756)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20757)==0&false)); c++) {{
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20758);PEM_ARRAY[c] = (byte)idx++;
        }
        }__CLR4_5_2g0bg0bm68iyigf.R.inc(20759);for (char c = 'a'; (((c <= 'z')&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20760)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20761)==0&false)); c++) {{
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20762);PEM_ARRAY[c] = (byte)idx++;
        }

        }__CLR4_5_2g0bg0bm68iyigf.R.inc(20763);for (char c = '0'; (((c <= '9')&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20764)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20765)==0&false)); c++) {{
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20766);PEM_ARRAY[c] = (byte)idx++;
        }

        }__CLR4_5_2g0bg0bm68iyigf.R.inc(20767);PEM_ARRAY['+'] = (byte)idx++;
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20768);PEM_ARRAY['/'] = (byte)idx++;
    }finally{__CLR4_5_2g0bg0bm68iyigf.R.flushNeeded();}}

    public boolean markSupported() {try{__CLR4_5_2g0bg0bm68iyigf.R.inc(20769);
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20770);return false;
    }finally{__CLR4_5_2g0bg0bm68iyigf.R.flushNeeded();}}

    public void close()
        throws IOException {try{__CLR4_5_2g0bg0bm68iyigf.R.inc(20771);
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20772);eof = true;
    }finally{__CLR4_5_2g0bg0bm68iyigf.R.flushNeeded();}}

    public int available()
        throws IOException {try{__CLR4_5_2g0bg0bm68iyigf.R.inc(20773);
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20774);return 3 - outOffset;
    }finally{__CLR4_5_2g0bg0bm68iyigf.R.flushNeeded();}}

    byte[] decodeBuffer = new byte[4];
    byte[] outBuffer = new byte[3];
    int  outOffset = 3;
    boolean eof;

    public int read() throws IOException {try{__CLR4_5_2g0bg0bm68iyigf.R.inc(20775);

        __CLR4_5_2g0bg0bm68iyigf.R.inc(20776);if ((((outOffset == 3)&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20777)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20778)==0&false))) {{
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20779);if ((((eof || getNextAtom())&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20780)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20781)==0&false))) {{
                __CLR4_5_2g0bg0bm68iyigf.R.inc(20782);eof = true;
                __CLR4_5_2g0bg0bm68iyigf.R.inc(20783);return -1;
            }
        }}

        }__CLR4_5_2g0bg0bm68iyigf.R.inc(20784);return ((int)outBuffer[outOffset++]) & 0xFF;
    }finally{__CLR4_5_2g0bg0bm68iyigf.R.flushNeeded();}}

    public int read(byte []out, int offset, int len)
        throws IOException {try{__CLR4_5_2g0bg0bm68iyigf.R.inc(20785);

        __CLR4_5_2g0bg0bm68iyigf.R.inc(20786);int idx = 0;
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20787);while ((((idx < len)&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20788)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20789)==0&false))) {{
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20790);if ((((outOffset == 3)&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20791)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20792)==0&false))) {{
                __CLR4_5_2g0bg0bm68iyigf.R.inc(20793);if ((((eof || getNextAtom())&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20794)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20795)==0&false))) {{
                    __CLR4_5_2g0bg0bm68iyigf.R.inc(20796);eof = true;
                    __CLR4_5_2g0bg0bm68iyigf.R.inc(20797);if ((((idx == 0)&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20798)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20799)==0&false))) {{
                        __CLR4_5_2g0bg0bm68iyigf.R.inc(20800);return -1;
                    } }else {{
                        __CLR4_5_2g0bg0bm68iyigf.R.inc(20801);return idx;
                    }
                }}
            }}

            }__CLR4_5_2g0bg0bm68iyigf.R.inc(20802);out[offset + idx] = outBuffer[outOffset++];

            __CLR4_5_2g0bg0bm68iyigf.R.inc(20803);idx++;
        }
        }__CLR4_5_2g0bg0bm68iyigf.R.inc(20804);return idx;
    }finally{__CLR4_5_2g0bg0bm68iyigf.R.flushNeeded();}}

    final boolean getNextAtom() throws IOException {try{__CLR4_5_2g0bg0bm68iyigf.R.inc(20805);
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20806);int count;
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20807);int a;
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20808);int b;
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20809);int c;
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20810);int d;

        __CLR4_5_2g0bg0bm68iyigf.R.inc(20811);int off = 0;
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20812);while ((((off != 4)&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20813)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20814)==0&false))) {{
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20815);count = src.read(decodeBuffer, off, 4 - off);
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20816);if ((((count == -1)&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20817)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20818)==0&false))) {{
                __CLR4_5_2g0bg0bm68iyigf.R.inc(20819);return true;
            }

            }__CLR4_5_2g0bg0bm68iyigf.R.inc(20820);int in = off;
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20821);int out = off;
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20822);while ((((in < off + count)&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20823)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20824)==0&false))) {{
                __CLR4_5_2g0bg0bm68iyigf.R.inc(20825);if (((((decodeBuffer[in] != '\n')
                    && (decodeBuffer[in] != '\r')
                    && (decodeBuffer[in] != ' '))&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20826)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20827)==0&false))) {{
                    __CLR4_5_2g0bg0bm68iyigf.R.inc(20828);decodeBuffer[out++] = decodeBuffer[in];
                }
                }__CLR4_5_2g0bg0bm68iyigf.R.inc(20829);in++;
            }

            }__CLR4_5_2g0bg0bm68iyigf.R.inc(20830);off = out;
        }

        }__CLR4_5_2g0bg0bm68iyigf.R.inc(20831);a = PEM_ARRAY[((int)decodeBuffer[0]) & 0xFF];
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20832);b = PEM_ARRAY[((int)decodeBuffer[1]) & 0xFF];
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20833);c = PEM_ARRAY[((int)decodeBuffer[2]) & 0xFF];
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20834);d = PEM_ARRAY[((int)decodeBuffer[3]) & 0xFF];

        __CLR4_5_2g0bg0bm68iyigf.R.inc(20835);outBuffer[0] = (byte)((a << 2) | (b >>> 4));
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20836);outBuffer[1] = (byte)((b << 4) | (c >>> 2));
        __CLR4_5_2g0bg0bm68iyigf.R.inc(20837);outBuffer[2] = (byte)((c << 6) |  d);

        __CLR4_5_2g0bg0bm68iyigf.R.inc(20838);if ((((decodeBuffer[3] != '=')&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20839)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20840)==0&false))) {{
            // All three bytes are good.
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20841);outOffset = 0;
        } }else {__CLR4_5_2g0bg0bm68iyigf.R.inc(20842);if ((((decodeBuffer[2] == '=')&&(__CLR4_5_2g0bg0bm68iyigf.R.iget(20843)!=0|true))||(__CLR4_5_2g0bg0bm68iyigf.R.iget(20844)==0&false))) {{
            // Only one byte of output.
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20845);outBuffer[2] = outBuffer[0];
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20846);outOffset = 2;
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20847);eof = true;
        } }else {{
            // Only two bytes of output.
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20848);outBuffer[2] = outBuffer[1];
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20849);outBuffer[1] = outBuffer[0];
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20850);outOffset = 1;
            __CLR4_5_2g0bg0bm68iyigf.R.inc(20851);eof = true;
        }

        }}__CLR4_5_2g0bg0bm68iyigf.R.inc(20852);return false;
    }finally{__CLR4_5_2g0bg0bm68iyigf.R.flushNeeded();}}
}
