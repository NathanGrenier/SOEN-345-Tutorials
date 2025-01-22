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

/* $Id: Base64EncodeStream.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.util.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

// CSOFF: ConstantName
// CSOFF: InnerAssignment
// CSOFF: MultipleVariableDeclarations
// CSOFF: NeedBraces
// CSOFF: OneStatementPerLine
// CSOFF: WhitespaceAfter
// CSOFF: WhitespaceAround

/**
 * This class implements a Base64 Character encoder as specified in RFC1113.
 * Unlike some other encoding schemes there is nothing in this encoding
 * that indicates where a buffer starts or ends.
 *
 * This means that the encoded text will simply start with the first line
 * of encoded text and end with the last line of encoded text.
 *
 * @version $Id: Base64EncodeStream.java 1732018 2016-02-24 04:51:06Z gadams $
 *
 * Originally authored by Thomas DeWeese, Vincent Hardy, and Chuck McManis.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Base64EncodeStream extends OutputStream {public static class __CLR4_5_2g39g39m68iyihe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,20982,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** This array maps the 6 bit values to their characters */
    private static final byte[] PEM_ARRAY = {
    //   0   1   2   3   4   5   6   7
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', // 0
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', // 1
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', // 2
        'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', // 3
        'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', // 4
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', // 5
        'w', 'x', 'y', 'z', '0', '1', '2', '3', // 6
        '4', '5', '6', '7', '8', '9', '+', '/'  // 7
    };

    byte [] atom = new byte[3];
    int     atomLen;
    byte [] encodeBuf = new byte[4];
    int     lineLen;

    PrintStream  out;
    boolean closeOutOnClose;

    public Base64EncodeStream(OutputStream out) {try{__CLR4_5_2g39g39m68iyihe.R.inc(20853);
        __CLR4_5_2g39g39m68iyihe.R.inc(20854);try {
            __CLR4_5_2g39g39m68iyihe.R.inc(20855);this.out = new PrintStream(out, false, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            __CLR4_5_2g39g39m68iyihe.R.inc(20856);e.printStackTrace();
        }
        __CLR4_5_2g39g39m68iyihe.R.inc(20857);closeOutOnClose = true;
    }finally{__CLR4_5_2g39g39m68iyihe.R.flushNeeded();}}

    public Base64EncodeStream(OutputStream out, boolean closeOutOnClose) {try{__CLR4_5_2g39g39m68iyihe.R.inc(20858);
        __CLR4_5_2g39g39m68iyihe.R.inc(20859);try {
            __CLR4_5_2g39g39m68iyihe.R.inc(20860);this.out = new PrintStream(out, false, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            __CLR4_5_2g39g39m68iyihe.R.inc(20861);e.printStackTrace();
        }
        __CLR4_5_2g39g39m68iyihe.R.inc(20862);this.closeOutOnClose = closeOutOnClose;
    }finally{__CLR4_5_2g39g39m68iyihe.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_2g39g39m68iyihe.R.inc(20863);
        __CLR4_5_2g39g39m68iyihe.R.inc(20864);if ((((out != null)&&(__CLR4_5_2g39g39m68iyihe.R.iget(20865)!=0|true))||(__CLR4_5_2g39g39m68iyihe.R.iget(20866)==0&false))) {{
            __CLR4_5_2g39g39m68iyihe.R.inc(20867);encodeAtom();
            __CLR4_5_2g39g39m68iyihe.R.inc(20868);out.flush();
            __CLR4_5_2g39g39m68iyihe.R.inc(20869);if ((((closeOutOnClose)&&(__CLR4_5_2g39g39m68iyihe.R.iget(20870)!=0|true))||(__CLR4_5_2g39g39m68iyihe.R.iget(20871)==0&false))) {{
                __CLR4_5_2g39g39m68iyihe.R.inc(20872);out.close();
            }
            }__CLR4_5_2g39g39m68iyihe.R.inc(20873);out = null;
        }
    }}finally{__CLR4_5_2g39g39m68iyihe.R.flushNeeded();}}

    /**
     * This can't really flush out output since that may generate
     * '=' chars which would indicate the end of the stream.
     * Instead we flush out.  You can only be sure all output is
     * writen by closing this stream.
     */
    public void flush() throws IOException {try{__CLR4_5_2g39g39m68iyihe.R.inc(20874);
        __CLR4_5_2g39g39m68iyihe.R.inc(20875);out.flush();
    }finally{__CLR4_5_2g39g39m68iyihe.R.flushNeeded();}}

    public void write(int b) throws IOException {try{__CLR4_5_2g39g39m68iyihe.R.inc(20876);
        __CLR4_5_2g39g39m68iyihe.R.inc(20877);atom[atomLen++] = (byte)b;
        __CLR4_5_2g39g39m68iyihe.R.inc(20878);if ((((atomLen == 3)&&(__CLR4_5_2g39g39m68iyihe.R.iget(20879)!=0|true))||(__CLR4_5_2g39g39m68iyihe.R.iget(20880)==0&false))) {{
            __CLR4_5_2g39g39m68iyihe.R.inc(20881);encodeAtom();
        }
    }}finally{__CLR4_5_2g39g39m68iyihe.R.flushNeeded();}}

    public void write(byte []data) throws IOException {try{__CLR4_5_2g39g39m68iyihe.R.inc(20882);
        __CLR4_5_2g39g39m68iyihe.R.inc(20883);encodeFromArray(data, 0, data.length);
    }finally{__CLR4_5_2g39g39m68iyihe.R.flushNeeded();}}

    public void write(byte [] data, int off, int len) throws IOException {try{__CLR4_5_2g39g39m68iyihe.R.inc(20884);
        __CLR4_5_2g39g39m68iyihe.R.inc(20885);encodeFromArray(data, off, len);
    }finally{__CLR4_5_2g39g39m68iyihe.R.flushNeeded();}}

    /**
     * enocodeAtom - Take three bytes of input and encode it as 4
     * printable characters. Note that if the length in len is less
     * than three is encodes either one or two '=' signs to indicate
     * padding characters.
     */
    void encodeAtom() throws IOException {try{__CLR4_5_2g39g39m68iyihe.R.inc(20886);
        __CLR4_5_2g39g39m68iyihe.R.inc(20887);byte a;
        __CLR4_5_2g39g39m68iyihe.R.inc(20888);byte b;
        __CLR4_5_2g39g39m68iyihe.R.inc(20889);byte c;

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2g39g39m68iyihe.R.inc(20890);switch (atomLen) {
        case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2g39g39m68iyihe.R.inc(20891);__CLB4_5_2_bool0=true;} __CLR4_5_2g39g39m68iyihe.R.inc(20892);return;
        case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2g39g39m68iyihe.R.inc(20893);__CLB4_5_2_bool0=true;}
            __CLR4_5_2g39g39m68iyihe.R.inc(20894);a = atom[0];
            __CLR4_5_2g39g39m68iyihe.R.inc(20895);encodeBuf[0] = PEM_ARRAY[((a >>> 2) & 0x3F)];
            __CLR4_5_2g39g39m68iyihe.R.inc(20896);encodeBuf[1] = PEM_ARRAY[((a <<  4) & 0x30)];
            __CLR4_5_2g39g39m68iyihe.R.inc(20897);encodeBuf[2] = encodeBuf[3] = '=';
            __CLR4_5_2g39g39m68iyihe.R.inc(20898);break;
        case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2g39g39m68iyihe.R.inc(20899);__CLB4_5_2_bool0=true;}
            __CLR4_5_2g39g39m68iyihe.R.inc(20900);a = atom[0];
            __CLR4_5_2g39g39m68iyihe.R.inc(20901);b = atom[1];
            __CLR4_5_2g39g39m68iyihe.R.inc(20902);encodeBuf[0] = PEM_ARRAY[((a >>> 2) & 0x3F)];
            __CLR4_5_2g39g39m68iyihe.R.inc(20903);encodeBuf[1] = PEM_ARRAY[(((a << 4) & 0x30) | ((b >>> 4) & 0x0F))];
            __CLR4_5_2g39g39m68iyihe.R.inc(20904);encodeBuf[2] = PEM_ARRAY[((b  << 2) & 0x3C)];
            __CLR4_5_2g39g39m68iyihe.R.inc(20905);encodeBuf[3] = '=';
            __CLR4_5_2g39g39m68iyihe.R.inc(20906);break;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2g39g39m68iyihe.R.inc(20907);__CLB4_5_2_bool0=true;}
            __CLR4_5_2g39g39m68iyihe.R.inc(20908);a = atom[0];
            __CLR4_5_2g39g39m68iyihe.R.inc(20909);b = atom[1];
            __CLR4_5_2g39g39m68iyihe.R.inc(20910);c = atom[2];
            __CLR4_5_2g39g39m68iyihe.R.inc(20911);encodeBuf[0] = PEM_ARRAY[((a >>> 2) & 0x3F)];
            __CLR4_5_2g39g39m68iyihe.R.inc(20912);encodeBuf[1] = PEM_ARRAY[(((a << 4) & 0x30) | ((b >>> 4) & 0x0F))];
            __CLR4_5_2g39g39m68iyihe.R.inc(20913);encodeBuf[2] = PEM_ARRAY[(((b << 2) & 0x3C) | ((c >>> 6) & 0x03))];
            __CLR4_5_2g39g39m68iyihe.R.inc(20914);encodeBuf[3] = PEM_ARRAY[c & 0x3F];
        }
        __CLR4_5_2g39g39m68iyihe.R.inc(20915);if ((((lineLen == 64)&&(__CLR4_5_2g39g39m68iyihe.R.iget(20916)!=0|true))||(__CLR4_5_2g39g39m68iyihe.R.iget(20917)==0&false))) {{
            __CLR4_5_2g39g39m68iyihe.R.inc(20918);out.println();
            __CLR4_5_2g39g39m68iyihe.R.inc(20919);lineLen = 0;
        }
        }__CLR4_5_2g39g39m68iyihe.R.inc(20920);out.write(encodeBuf);

        __CLR4_5_2g39g39m68iyihe.R.inc(20921);lineLen += 4;
        __CLR4_5_2g39g39m68iyihe.R.inc(20922);atomLen = 0;
    }finally{__CLR4_5_2g39g39m68iyihe.R.flushNeeded();}}

    /**
     * enocodeAtom - Take three bytes of input and encode it as 4
     * printable characters. Note that if the length in len is less
     * than three is encodes either one or two '=' signs to indicate
     * padding characters.
     */
    void encodeFromArray(byte[] data, int offset, int len)
        throws IOException {try{__CLR4_5_2g39g39m68iyihe.R.inc(20923);
        __CLR4_5_2g39g39m68iyihe.R.inc(20924);byte a;
        __CLR4_5_2g39g39m68iyihe.R.inc(20925);byte b;
        __CLR4_5_2g39g39m68iyihe.R.inc(20926);byte c;
        __CLR4_5_2g39g39m68iyihe.R.inc(20927);if ((((len == 0)&&(__CLR4_5_2g39g39m68iyihe.R.iget(20928)!=0|true))||(__CLR4_5_2g39g39m68iyihe.R.iget(20929)==0&false))) {{
            __CLR4_5_2g39g39m68iyihe.R.inc(20930);return;
        }

        // System.out.println("atomLen: " + atomLen +
        //                    " len: " + len +
        //                    " offset:  " + offset);

        }__CLR4_5_2g39g39m68iyihe.R.inc(20931);if ((((atomLen != 0)&&(__CLR4_5_2g39g39m68iyihe.R.iget(20932)!=0|true))||(__CLR4_5_2g39g39m68iyihe.R.iget(20933)==0&false))) {{
            boolean __CLB4_5_2_bool1=false;__CLR4_5_2g39g39m68iyihe.R.inc(20934);switch(atomLen) {
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2g39g39m68iyihe.R.inc(20935);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g39g39m68iyihe.R.inc(20936);atom[1] = data[offset++];
                __CLR4_5_2g39g39m68iyihe.R.inc(20937);len--;
                __CLR4_5_2g39g39m68iyihe.R.inc(20938);atomLen++;
                __CLR4_5_2g39g39m68iyihe.R.inc(20939);if ((((len == 0)&&(__CLR4_5_2g39g39m68iyihe.R.iget(20940)!=0|true))||(__CLR4_5_2g39g39m68iyihe.R.iget(20941)==0&false))) {{
                    __CLR4_5_2g39g39m68iyihe.R.inc(20942);return;
                }
                }__CLR4_5_2g39g39m68iyihe.R.inc(20943);atom[2] = data[offset++];
                __CLR4_5_2g39g39m68iyihe.R.inc(20944);len--;
                __CLR4_5_2g39g39m68iyihe.R.inc(20945);atomLen++;
                __CLR4_5_2g39g39m68iyihe.R.inc(20946);break;
            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_2g39g39m68iyihe.R.inc(20947);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g39g39m68iyihe.R.inc(20948);atom[2] = data[offset++];
                __CLR4_5_2g39g39m68iyihe.R.inc(20949);len--;
                __CLR4_5_2g39g39m68iyihe.R.inc(20950);atomLen++;
                __CLR4_5_2g39g39m68iyihe.R.inc(20951);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2g39g39m68iyihe.R.inc(20952);__CLB4_5_2_bool1=true;}
            }
            __CLR4_5_2g39g39m68iyihe.R.inc(20953);encodeAtom();
        }

        }__CLR4_5_2g39g39m68iyihe.R.inc(20954);while ((((len >= 3)&&(__CLR4_5_2g39g39m68iyihe.R.iget(20955)!=0|true))||(__CLR4_5_2g39g39m68iyihe.R.iget(20956)==0&false))) {{
            __CLR4_5_2g39g39m68iyihe.R.inc(20957);a = data[offset++];
            __CLR4_5_2g39g39m68iyihe.R.inc(20958);b = data[offset++];
            __CLR4_5_2g39g39m68iyihe.R.inc(20959);c = data[offset++];

            __CLR4_5_2g39g39m68iyihe.R.inc(20960);encodeBuf[0] = PEM_ARRAY[((a >>> 2) & 0x3F)];
            __CLR4_5_2g39g39m68iyihe.R.inc(20961);encodeBuf[1] = PEM_ARRAY[(((a << 4) & 0x30) | ((b >>> 4) & 0x0F))];
            __CLR4_5_2g39g39m68iyihe.R.inc(20962);encodeBuf[2] = PEM_ARRAY[(((b << 2) & 0x3C) | ((c >>> 6) & 0x03))];
            __CLR4_5_2g39g39m68iyihe.R.inc(20963);encodeBuf[3] = PEM_ARRAY[c & 0x3F];
            __CLR4_5_2g39g39m68iyihe.R.inc(20964);out.write(encodeBuf);

            __CLR4_5_2g39g39m68iyihe.R.inc(20965);lineLen += 4;
            __CLR4_5_2g39g39m68iyihe.R.inc(20966);if ((((lineLen == 64)&&(__CLR4_5_2g39g39m68iyihe.R.iget(20967)!=0|true))||(__CLR4_5_2g39g39m68iyihe.R.iget(20968)==0&false))) {{
                __CLR4_5_2g39g39m68iyihe.R.inc(20969);out.println();
                __CLR4_5_2g39g39m68iyihe.R.inc(20970);lineLen = 0;
            }

            }__CLR4_5_2g39g39m68iyihe.R.inc(20971);len -= 3;
        }

        }boolean __CLB4_5_2_bool2=false;__CLR4_5_2g39g39m68iyihe.R.inc(20972);switch (len) {
        case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_2g39g39m68iyihe.R.inc(20973);__CLB4_5_2_bool2=true;}
            __CLR4_5_2g39g39m68iyihe.R.inc(20974);atom[0] = data[offset];
            __CLR4_5_2g39g39m68iyihe.R.inc(20975);break;
        case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_2g39g39m68iyihe.R.inc(20976);__CLB4_5_2_bool2=true;}
            __CLR4_5_2g39g39m68iyihe.R.inc(20977);atom[0] = data[offset];
            __CLR4_5_2g39g39m68iyihe.R.inc(20978);atom[1] = data[offset + 1];
            __CLR4_5_2g39g39m68iyihe.R.inc(20979);break;
        default:if (!__CLB4_5_2_bool2) {__CLR4_5_2g39g39m68iyihe.R.inc(20980);__CLB4_5_2_bool2=true;}
        }
        __CLR4_5_2g39g39m68iyihe.R.inc(20981);atomLen = len;
    }finally{__CLR4_5_2g39g39m68iyihe.R.flushNeeded();}}



}
