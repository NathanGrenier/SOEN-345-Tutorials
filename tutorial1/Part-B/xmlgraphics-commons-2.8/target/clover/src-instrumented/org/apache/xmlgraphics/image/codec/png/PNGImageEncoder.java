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

/* $Id: PNGImageEncoder.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.image.codec.png;

import java.awt.Rectangle;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import org.apache.xmlgraphics.image.codec.util.ImageEncoderImpl;
import org.apache.xmlgraphics.image.codec.util.PropertyUtil;

// CSOFF: ConstantName
// CSOFF: InnerAssignment
// CSOFF: LocalVariableName
// CSOFF: MissingSwitchDefault
// CSOFF: OperatorWrap
// CSOFF: WhitespaceAround

final class CRC {public static class __CLR4_5_227z27zm68iyg2u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,2901,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private CRC() {try{__CLR4_5_227z27zm68iyg2u.R.inc(2879);
    }finally{__CLR4_5_227z27zm68iyg2u.R.flushNeeded();}}

    private static int[] crcTable = new int[256];

    static {try{__CLR4_5_227z27zm68iyg2u.R.inc(2880);
        // Initialize CRC table
        __CLR4_5_227z27zm68iyg2u.R.inc(2881);for (int n = 0; (((n < 256)&&(__CLR4_5_227z27zm68iyg2u.R.iget(2882)!=0|true))||(__CLR4_5_227z27zm68iyg2u.R.iget(2883)==0&false)); n++) {{
            __CLR4_5_227z27zm68iyg2u.R.inc(2884);int c = n;
            __CLR4_5_227z27zm68iyg2u.R.inc(2885);for (int k = 0; (((k < 8)&&(__CLR4_5_227z27zm68iyg2u.R.iget(2886)!=0|true))||(__CLR4_5_227z27zm68iyg2u.R.iget(2887)==0&false)); k++) {{
                __CLR4_5_227z27zm68iyg2u.R.inc(2888);if (((((c & 1) == 1)&&(__CLR4_5_227z27zm68iyg2u.R.iget(2889)!=0|true))||(__CLR4_5_227z27zm68iyg2u.R.iget(2890)==0&false))) {{
                    __CLR4_5_227z27zm68iyg2u.R.inc(2891);c = 0xedb88320 ^ (c >>> 1);
                } }else {{
                    __CLR4_5_227z27zm68iyg2u.R.inc(2892);c >>>= 1;
                }

                }__CLR4_5_227z27zm68iyg2u.R.inc(2893);crcTable[n] = c;
            }
        }}
    }}finally{__CLR4_5_227z27zm68iyg2u.R.flushNeeded();}}

    public static int updateCRC(int crc, byte[] data, int off, int len) {try{__CLR4_5_227z27zm68iyg2u.R.inc(2894);
        __CLR4_5_227z27zm68iyg2u.R.inc(2895);int c = crc;

        __CLR4_5_227z27zm68iyg2u.R.inc(2896);for (int n = 0; (((n < len)&&(__CLR4_5_227z27zm68iyg2u.R.iget(2897)!=0|true))||(__CLR4_5_227z27zm68iyg2u.R.iget(2898)==0&false)); n++) {{
             __CLR4_5_227z27zm68iyg2u.R.inc(2899);c = crcTable[(c ^ data[off + n]) & 0xff] ^ (c >>> 8);
        }

        }__CLR4_5_227z27zm68iyg2u.R.inc(2900);return c;
    }finally{__CLR4_5_227z27zm68iyg2u.R.flushNeeded();}}
}


class ChunkStream extends OutputStream implements DataOutput {public static class __CLR4_5_227z28lm68iyg2u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,2961,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String type;
    private ByteArrayOutputStream baos;
    private DataOutputStream dos;

    ChunkStream(String type) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2901);
        __CLR4_5_227z28lm68iyg2u.R.inc(2902);this.type = type;

        __CLR4_5_227z28lm68iyg2u.R.inc(2903);this.baos = new ByteArrayOutputStream();
        __CLR4_5_227z28lm68iyg2u.R.inc(2904);this.dos = new DataOutputStream(baos);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    @Override
    public void write(byte[] b) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2905);
        __CLR4_5_227z28lm68iyg2u.R.inc(2906);dos.write(b);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    @Override
    public void write(byte[] b, int off, int len) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2907);
        __CLR4_5_227z28lm68iyg2u.R.inc(2908);dos.write(b, off, len);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    @Override
    public void write(int b) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2909);
        __CLR4_5_227z28lm68iyg2u.R.inc(2910);dos.write(b);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeBoolean(boolean v) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2911);
        __CLR4_5_227z28lm68iyg2u.R.inc(2912);dos.writeBoolean(v);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeByte(int v) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2913);
        __CLR4_5_227z28lm68iyg2u.R.inc(2914);dos.writeByte(v);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeBytes(String s) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2915);
        __CLR4_5_227z28lm68iyg2u.R.inc(2916);dos.writeBytes(s);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeChar(int v) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2917);
        __CLR4_5_227z28lm68iyg2u.R.inc(2918);dos.writeChar(v);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeChars(String s) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2919);
        __CLR4_5_227z28lm68iyg2u.R.inc(2920);dos.writeChars(s);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeDouble(double v) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2921);
        __CLR4_5_227z28lm68iyg2u.R.inc(2922);dos.writeDouble(v);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeFloat(float v) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2923);
        __CLR4_5_227z28lm68iyg2u.R.inc(2924);dos.writeFloat(v);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeInt(int v) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2925);
        __CLR4_5_227z28lm68iyg2u.R.inc(2926);dos.writeInt(v);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeLong(long v) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2927);
        __CLR4_5_227z28lm68iyg2u.R.inc(2928);dos.writeLong(v);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeShort(int v) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2929);
        __CLR4_5_227z28lm68iyg2u.R.inc(2930);dos.writeShort(v);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeUTF(String str) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2931);
        __CLR4_5_227z28lm68iyg2u.R.inc(2932);dos.writeUTF(str);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    public void writeToStream(DataOutputStream output) throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2933);
        __CLR4_5_227z28lm68iyg2u.R.inc(2934);byte[] typeSignature = new byte[4];
        __CLR4_5_227z28lm68iyg2u.R.inc(2935);typeSignature[0] = (byte)type.charAt(0);
        __CLR4_5_227z28lm68iyg2u.R.inc(2936);typeSignature[1] = (byte)type.charAt(1);
        __CLR4_5_227z28lm68iyg2u.R.inc(2937);typeSignature[2] = (byte)type.charAt(2);
        __CLR4_5_227z28lm68iyg2u.R.inc(2938);typeSignature[3] = (byte)type.charAt(3);

        __CLR4_5_227z28lm68iyg2u.R.inc(2939);dos.flush();
        __CLR4_5_227z28lm68iyg2u.R.inc(2940);baos.flush();

        __CLR4_5_227z28lm68iyg2u.R.inc(2941);byte[] data = baos.toByteArray();
        __CLR4_5_227z28lm68iyg2u.R.inc(2942);int len = data.length;

        __CLR4_5_227z28lm68iyg2u.R.inc(2943);output.writeInt(len);
        __CLR4_5_227z28lm68iyg2u.R.inc(2944);output.write(typeSignature);
        __CLR4_5_227z28lm68iyg2u.R.inc(2945);output.write(data, 0, len);

        __CLR4_5_227z28lm68iyg2u.R.inc(2946);int crc = 0xffffffff;
        __CLR4_5_227z28lm68iyg2u.R.inc(2947);crc = CRC.updateCRC(crc, typeSignature, 0, 4);
        __CLR4_5_227z28lm68iyg2u.R.inc(2948);crc = CRC.updateCRC(crc, data, 0, len);
        __CLR4_5_227z28lm68iyg2u.R.inc(2949);output.writeInt(crc ^ 0xffffffff);
    }finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void close() throws IOException {try{__CLR4_5_227z28lm68iyg2u.R.inc(2950);

        __CLR4_5_227z28lm68iyg2u.R.inc(2951);if ((((baos != null)&&(__CLR4_5_227z28lm68iyg2u.R.iget(2952)!=0|true))||(__CLR4_5_227z28lm68iyg2u.R.iget(2953)==0&false))) {{
            __CLR4_5_227z28lm68iyg2u.R.inc(2954);baos.close();
            __CLR4_5_227z28lm68iyg2u.R.inc(2955);baos = null;
        }
        }__CLR4_5_227z28lm68iyg2u.R.inc(2956);if ((((dos != null)&&(__CLR4_5_227z28lm68iyg2u.R.iget(2957)!=0|true))||(__CLR4_5_227z28lm68iyg2u.R.iget(2958)==0&false))) {{
            __CLR4_5_227z28lm68iyg2u.R.inc(2959);dos.close();
            __CLR4_5_227z28lm68iyg2u.R.inc(2960);dos = null;
        }
    }}finally{__CLR4_5_227z28lm68iyg2u.R.flushNeeded();}}
}


class IDATOutputStream extends FilterOutputStream {public static class __CLR4_5_227z2a9m68iyg2v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,3006,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final byte[] TYPE_SIGNATURE
         = {(byte)'I', (byte)'D', (byte)'A', (byte)'T'};

    private int bytesWritten;
    private int segmentLength;
    private byte[] buffer;

    public IDATOutputStream(OutputStream output,
                            int segmentLength) {
        super(output);__CLR4_5_227z2a9m68iyg2v.R.inc(2962);try{__CLR4_5_227z2a9m68iyg2v.R.inc(2961);
        __CLR4_5_227z2a9m68iyg2v.R.inc(2963);this.segmentLength = segmentLength;
        __CLR4_5_227z2a9m68iyg2v.R.inc(2964);this.buffer = new byte[segmentLength];
    }finally{__CLR4_5_227z2a9m68iyg2v.R.flushNeeded();}}

    @Override
    public void close() throws IOException {try{__CLR4_5_227z2a9m68iyg2v.R.inc(2965);
        __CLR4_5_227z2a9m68iyg2v.R.inc(2966);flush();
    }finally{__CLR4_5_227z2a9m68iyg2v.R.flushNeeded();}}

    private void writeInt(int x) throws IOException {try{__CLR4_5_227z2a9m68iyg2v.R.inc(2967);
        __CLR4_5_227z2a9m68iyg2v.R.inc(2968);out.write(x >> 24);
        __CLR4_5_227z2a9m68iyg2v.R.inc(2969);out.write((x >> 16) & 0xff);
        __CLR4_5_227z2a9m68iyg2v.R.inc(2970);out.write((x >> 8) & 0xff);
        __CLR4_5_227z2a9m68iyg2v.R.inc(2971);out.write(x & 0xff);
    }finally{__CLR4_5_227z2a9m68iyg2v.R.flushNeeded();}}

    @Override
    public void flush() throws IOException {try{__CLR4_5_227z2a9m68iyg2v.R.inc(2972);
        __CLR4_5_227z2a9m68iyg2v.R.inc(2973);if ((((bytesWritten == 0)&&(__CLR4_5_227z2a9m68iyg2v.R.iget(2974)!=0|true))||(__CLR4_5_227z2a9m68iyg2v.R.iget(2975)==0&false))) {{
            __CLR4_5_227z2a9m68iyg2v.R.inc(2976);return;
        }

        // Length
        }__CLR4_5_227z2a9m68iyg2v.R.inc(2977);writeInt(bytesWritten);
        // 'IDAT' signature
        __CLR4_5_227z2a9m68iyg2v.R.inc(2978);out.write(TYPE_SIGNATURE);
        // Data
        __CLR4_5_227z2a9m68iyg2v.R.inc(2979);out.write(buffer, 0, bytesWritten);

        __CLR4_5_227z2a9m68iyg2v.R.inc(2980);int crc = 0xffffffff;
        __CLR4_5_227z2a9m68iyg2v.R.inc(2981);crc = CRC.updateCRC(crc, TYPE_SIGNATURE, 0, 4);
        __CLR4_5_227z2a9m68iyg2v.R.inc(2982);crc = CRC.updateCRC(crc, buffer, 0, bytesWritten);

        // CRC
        __CLR4_5_227z2a9m68iyg2v.R.inc(2983);writeInt(crc ^ 0xffffffff);

        // Reset buffer
        __CLR4_5_227z2a9m68iyg2v.R.inc(2984);bytesWritten = 0;
    }finally{__CLR4_5_227z2a9m68iyg2v.R.flushNeeded();}}

    @Override
    public void write(byte[] b) throws IOException {try{__CLR4_5_227z2a9m68iyg2v.R.inc(2985);
        __CLR4_5_227z2a9m68iyg2v.R.inc(2986);this.write(b, 0, b.length);
    }finally{__CLR4_5_227z2a9m68iyg2v.R.flushNeeded();}}

    @Override
    public void write(byte[] b, int off, int len) throws IOException {try{__CLR4_5_227z2a9m68iyg2v.R.inc(2987);
        __CLR4_5_227z2a9m68iyg2v.R.inc(2988);while ((((len > 0)&&(__CLR4_5_227z2a9m68iyg2v.R.iget(2989)!=0|true))||(__CLR4_5_227z2a9m68iyg2v.R.iget(2990)==0&false))) {{
            __CLR4_5_227z2a9m68iyg2v.R.inc(2991);int bytes = Math.min(segmentLength - bytesWritten, len);
            __CLR4_5_227z2a9m68iyg2v.R.inc(2992);System.arraycopy(b, off, buffer, bytesWritten, bytes);
            __CLR4_5_227z2a9m68iyg2v.R.inc(2993);off += bytes;
            __CLR4_5_227z2a9m68iyg2v.R.inc(2994);len -= bytes;
            __CLR4_5_227z2a9m68iyg2v.R.inc(2995);bytesWritten += bytes;

            __CLR4_5_227z2a9m68iyg2v.R.inc(2996);if ((((bytesWritten == segmentLength)&&(__CLR4_5_227z2a9m68iyg2v.R.iget(2997)!=0|true))||(__CLR4_5_227z2a9m68iyg2v.R.iget(2998)==0&false))) {{
                __CLR4_5_227z2a9m68iyg2v.R.inc(2999);flush();
            }
        }}
    }}finally{__CLR4_5_227z2a9m68iyg2v.R.flushNeeded();}}

    @Override
    public void write(int b) throws IOException {try{__CLR4_5_227z2a9m68iyg2v.R.inc(3000);
        __CLR4_5_227z2a9m68iyg2v.R.inc(3001);buffer[bytesWritten++] = (byte)b;
        __CLR4_5_227z2a9m68iyg2v.R.inc(3002);if ((((bytesWritten == segmentLength)&&(__CLR4_5_227z2a9m68iyg2v.R.iget(3003)!=0|true))||(__CLR4_5_227z2a9m68iyg2v.R.iget(3004)==0&false))) {{
            __CLR4_5_227z2a9m68iyg2v.R.inc(3005);flush();
        }
    }}finally{__CLR4_5_227z2a9m68iyg2v.R.flushNeeded();}}
}

/**
 * An ImageEncoder for the PNG file format.
 *
 * @since EA4
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PNGImageEncoder extends ImageEncoderImpl {public static class __CLR4_5_227z2bim68iyg2v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,3632,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int PNG_COLOR_GRAY = 0;
    private static final int PNG_COLOR_RGB = 2;
    private static final int PNG_COLOR_PALETTE = 3;
    private static final int PNG_COLOR_GRAY_ALPHA = 4;
    private static final int PNG_COLOR_RGB_ALPHA = 6;

    private static final byte[] MAGIC = {
        (byte)137, (byte) 80, (byte) 78, (byte) 71,
        (byte) 13, (byte) 10, (byte) 26, (byte) 10
    };

    private PNGEncodeParam param;

    private RenderedImage image;
    private int width;
    private int height;
    private int bitDepth;
    private int bitShift;
    private int numBands;
    private int colorType;

    private int bpp; // bytes per pixel, rounded up

    private boolean skipAlpha;
    private boolean compressGray;

    private boolean interlace;

    private byte[] redPalette;
    private byte[] greenPalette;
    private byte[] bluePalette;
    private byte[] alphaPalette;

    private DataOutputStream dataOutput;

    public PNGImageEncoder(OutputStream output,
                           PNGEncodeParam param) {
        super(output, param);__CLR4_5_227z2bim68iyg2v.R.inc(3007);try{__CLR4_5_227z2bim68iyg2v.R.inc(3006);

        __CLR4_5_227z2bim68iyg2v.R.inc(3008);if ((((param != null)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3009)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3010)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3011);this.param = param;
        }
        }__CLR4_5_227z2bim68iyg2v.R.inc(3012);this.dataOutput = new DataOutputStream(output);
    }finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeMagic() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3013);
        __CLR4_5_227z2bim68iyg2v.R.inc(3014);dataOutput.write(MAGIC);
    }finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeIHDR() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3015);
        __CLR4_5_227z2bim68iyg2v.R.inc(3016);ChunkStream cs = new ChunkStream("IHDR");
        __CLR4_5_227z2bim68iyg2v.R.inc(3017);try {
            __CLR4_5_227z2bim68iyg2v.R.inc(3018);cs.writeInt(width);
            __CLR4_5_227z2bim68iyg2v.R.inc(3019);cs.writeInt(height);
            __CLR4_5_227z2bim68iyg2v.R.inc(3020);cs.writeByte((byte)bitDepth);
            __CLR4_5_227z2bim68iyg2v.R.inc(3021);cs.writeByte((byte)colorType);
            __CLR4_5_227z2bim68iyg2v.R.inc(3022);cs.writeByte((byte)0);
            __CLR4_5_227z2bim68iyg2v.R.inc(3023);cs.writeByte((byte)0);
            __CLR4_5_227z2bim68iyg2v.R.inc(3024);cs.writeByte((((interlace )&&(__CLR4_5_227z2bim68iyg2v.R.iget(3025)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3026)==0&false))? (byte)1 : (byte)0);

            __CLR4_5_227z2bim68iyg2v.R.inc(3027);cs.writeToStream(dataOutput);
        } finally {
            __CLR4_5_227z2bim68iyg2v.R.inc(3028);cs.close();
        }
    }finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private byte[] prevRow;
    private byte[] currRow;

    private byte[][] filteredRows;

    private static int clamp(int val, int maxValue) {try{__CLR4_5_227z2bim68iyg2v.R.inc(3029);
        __CLR4_5_227z2bim68iyg2v.R.inc(3030);return ((((val > maxValue) )&&(__CLR4_5_227z2bim68iyg2v.R.iget(3031)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3032)==0&false))? maxValue : val;
    }finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void encodePass(OutputStream os, Raster ras,
                            int xOffset,     int yOffset,
                            int xSkip,       int ySkip)
        throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3033);
        __CLR4_5_227z2bim68iyg2v.R.inc(3034);int minX   = ras.getMinX();
        __CLR4_5_227z2bim68iyg2v.R.inc(3035);int minY   = ras.getMinY();
        __CLR4_5_227z2bim68iyg2v.R.inc(3036);int width  = ras.getWidth();
        __CLR4_5_227z2bim68iyg2v.R.inc(3037);int height = ras.getHeight();

        __CLR4_5_227z2bim68iyg2v.R.inc(3038);xOffset *= numBands;
        __CLR4_5_227z2bim68iyg2v.R.inc(3039);xSkip   *= numBands;

        __CLR4_5_227z2bim68iyg2v.R.inc(3040);int samplesPerByte = 8 / bitDepth;

        __CLR4_5_227z2bim68iyg2v.R.inc(3041);int numSamples = width * numBands;
        __CLR4_5_227z2bim68iyg2v.R.inc(3042);int[] samples = new int[numSamples];

        __CLR4_5_227z2bim68iyg2v.R.inc(3043);int pixels = (numSamples - xOffset + xSkip - 1) / xSkip;
        __CLR4_5_227z2bim68iyg2v.R.inc(3044);int bytesPerRow = pixels * numBands;
        __CLR4_5_227z2bim68iyg2v.R.inc(3045);if ((((bitDepth < 8)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3046)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3047)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3048);bytesPerRow = (bytesPerRow + samplesPerByte - 1) / samplesPerByte;
        } }else {__CLR4_5_227z2bim68iyg2v.R.inc(3049);if ((((bitDepth == 16)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3050)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3051)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3052);bytesPerRow *= 2;
        }

        }}__CLR4_5_227z2bim68iyg2v.R.inc(3053);if ((((bytesPerRow == 0)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3054)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3055)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3056);return;
        }

        }__CLR4_5_227z2bim68iyg2v.R.inc(3057);currRow = new byte[bytesPerRow + bpp];
        __CLR4_5_227z2bim68iyg2v.R.inc(3058);prevRow = new byte[bytesPerRow + bpp];

        __CLR4_5_227z2bim68iyg2v.R.inc(3059);filteredRows = new byte[5][bytesPerRow + bpp];

        __CLR4_5_227z2bim68iyg2v.R.inc(3060);int maxValue = (1 << bitDepth) - 1;

        __CLR4_5_227z2bim68iyg2v.R.inc(3061);for (int row = minY + yOffset; (((row < minY + height)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3062)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3063)==0&false)); row += ySkip) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3064);ras.getPixels(minX, row, width, 1, samples);

            __CLR4_5_227z2bim68iyg2v.R.inc(3065);if ((((compressGray)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3066)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3067)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3068);int shift = 8 - bitDepth;
                __CLR4_5_227z2bim68iyg2v.R.inc(3069);for (int i = 0; (((i < width)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3070)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3071)==0&false)); i++) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3072);samples[i] >>= shift;
                }
            }}

            }__CLR4_5_227z2bim68iyg2v.R.inc(3073);int count = bpp; // leave first 'bpp' bytes zero
            __CLR4_5_227z2bim68iyg2v.R.inc(3074);int pos = 0;
            __CLR4_5_227z2bim68iyg2v.R.inc(3075);int tmp = 0;

            boolean __CLB4_5_2_bool0=false;__CLR4_5_227z2bim68iyg2v.R.inc(3076);switch (bitDepth) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_227z2bim68iyg2v.R.inc(3077);__CLB4_5_2_bool0=true;} case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_227z2bim68iyg2v.R.inc(3078);__CLB4_5_2_bool0=true;} case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_227z2bim68iyg2v.R.inc(3079);__CLB4_5_2_bool0=true;}
                // Image can only have a single band

                __CLR4_5_227z2bim68iyg2v.R.inc(3080);int mask = samplesPerByte - 1;
                __CLR4_5_227z2bim68iyg2v.R.inc(3081);for (int s = xOffset; (((s < numSamples)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3082)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3083)==0&false)); s += xSkip) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3084);int val = clamp(samples[s] >> bitShift, maxValue);
                    __CLR4_5_227z2bim68iyg2v.R.inc(3085);tmp = (tmp << bitDepth) | val;

                    __CLR4_5_227z2bim68iyg2v.R.inc(3086);if ((((pos++  == mask)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3087)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3088)==0&false))) {{
                        __CLR4_5_227z2bim68iyg2v.R.inc(3089);currRow[count++] = (byte)tmp;
                        __CLR4_5_227z2bim68iyg2v.R.inc(3090);tmp = 0;
                        __CLR4_5_227z2bim68iyg2v.R.inc(3091);pos = 0;
                    }
                }}

                // Left shift the last byte
                }__CLR4_5_227z2bim68iyg2v.R.inc(3092);if ((((pos != 0)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3093)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3094)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3095);tmp <<= (samplesPerByte - pos) * bitDepth;
                    __CLR4_5_227z2bim68iyg2v.R.inc(3096);currRow[count++] = (byte)tmp;
                }
                }__CLR4_5_227z2bim68iyg2v.R.inc(3097);break;

            case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_227z2bim68iyg2v.R.inc(3098);__CLB4_5_2_bool0=true;}
                __CLR4_5_227z2bim68iyg2v.R.inc(3099);for (int s = xOffset; (((s < numSamples)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3100)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3101)==0&false)); s += xSkip) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3102);for (int b = 0; (((b < numBands)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3103)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3104)==0&false)); b++) {{
                        __CLR4_5_227z2bim68iyg2v.R.inc(3105);currRow[count++] =
                            (byte)clamp(samples[s + b] >> bitShift, maxValue);
                    }
                }}
                }__CLR4_5_227z2bim68iyg2v.R.inc(3106);break;

            case 16:if (!__CLB4_5_2_bool0) {__CLR4_5_227z2bim68iyg2v.R.inc(3107);__CLB4_5_2_bool0=true;}
                __CLR4_5_227z2bim68iyg2v.R.inc(3108);for (int s = xOffset; (((s < numSamples)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3109)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3110)==0&false)); s += xSkip) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3111);for (int b = 0; (((b < numBands)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3112)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3113)==0&false)); b++) {{
                        __CLR4_5_227z2bim68iyg2v.R.inc(3114);int val = clamp(samples[s + b] >> bitShift, maxValue);
                        __CLR4_5_227z2bim68iyg2v.R.inc(3115);currRow[count++] = (byte)(val >> 8);
                        __CLR4_5_227z2bim68iyg2v.R.inc(3116);currRow[count++] = (byte)(val & 0xff);
                    }
                }}
                }__CLR4_5_227z2bim68iyg2v.R.inc(3117);break;
            }

            // Perform filtering
            __CLR4_5_227z2bim68iyg2v.R.inc(3118);int filterType = param.filterRow(currRow, prevRow,
                                             filteredRows,
                                             bytesPerRow, bpp);

            __CLR4_5_227z2bim68iyg2v.R.inc(3119);os.write(filterType);
            __CLR4_5_227z2bim68iyg2v.R.inc(3120);os.write(filteredRows[filterType], bpp, bytesPerRow);

            // Swap current and previous rows
            __CLR4_5_227z2bim68iyg2v.R.inc(3121);byte[] swap = currRow;
            __CLR4_5_227z2bim68iyg2v.R.inc(3122);currRow = prevRow;
            __CLR4_5_227z2bim68iyg2v.R.inc(3123);prevRow = swap;
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeIDAT() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3124);
        __CLR4_5_227z2bim68iyg2v.R.inc(3125);IDATOutputStream ios = new IDATOutputStream(dataOutput, 8192);
        __CLR4_5_227z2bim68iyg2v.R.inc(3126);DeflaterOutputStream dos =
            new DeflaterOutputStream(ios, new Deflater(9));

        // Future work - don't convert entire image to a Raster It
        // might seem that you could just call image.getData() but
        // 'BufferedImage.subImage' doesn't appear to set the Width
        // and height properly of the Child Raster, so the Raster
        // you get back here appears larger than it should.
        // This solves that problem by bounding the raster to the
        // image's bounds...
        __CLR4_5_227z2bim68iyg2v.R.inc(3127);Raster ras = image.getData(new Rectangle(image.getMinX(),
                                                 image.getMinY(),
                                                 image.getWidth(),
                                                 image.getHeight()));
        // System.out.println("Image: [" +
        //                    image.getMinY()  + ", " +
        //                    image.getMinX()  + ", " +
        //                    image.getWidth()  + ", " +
        //                    image.getHeight() + "]");
        // System.out.println("Ras: [" +
        //                    ras.getMinX()  + ", " +
        //                    ras.getMinY()  + ", " +
        //                    ras.getWidth()  + ", " +
        //                    ras.getHeight() + "]");

        __CLR4_5_227z2bim68iyg2v.R.inc(3128);if ((((skipAlpha)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3129)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3130)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3131);int numBands = ras.getNumBands() - 1;
            __CLR4_5_227z2bim68iyg2v.R.inc(3132);int[] bandList = new int[numBands];
            __CLR4_5_227z2bim68iyg2v.R.inc(3133);for (int i = 0; (((i < numBands)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3134)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3135)==0&false)); i++) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3136);bandList[i] = i;
            }
            }__CLR4_5_227z2bim68iyg2v.R.inc(3137);ras = ras.createChild(0, 0,
                                  ras.getWidth(), ras.getHeight(),
                                  0, 0,
                                  bandList);
        }

        }__CLR4_5_227z2bim68iyg2v.R.inc(3138);if ((((interlace)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3139)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3140)==0&false))) {{
            // Interlacing pass 1
            __CLR4_5_227z2bim68iyg2v.R.inc(3141);encodePass(dos, ras, 0, 0, 8, 8);
            // Interlacing pass 2
            __CLR4_5_227z2bim68iyg2v.R.inc(3142);encodePass(dos, ras, 4, 0, 8, 8);
            // Interlacing pass 3
            __CLR4_5_227z2bim68iyg2v.R.inc(3143);encodePass(dos, ras, 0, 4, 4, 8);
            // Interlacing pass 4
            __CLR4_5_227z2bim68iyg2v.R.inc(3144);encodePass(dos, ras, 2, 0, 4, 4);
            // Interlacing pass 5
            __CLR4_5_227z2bim68iyg2v.R.inc(3145);encodePass(dos, ras, 0, 2, 2, 4);
            // Interlacing pass 6
            __CLR4_5_227z2bim68iyg2v.R.inc(3146);encodePass(dos, ras, 1, 0, 2, 2);
            // Interlacing pass 7
            __CLR4_5_227z2bim68iyg2v.R.inc(3147);encodePass(dos, ras, 0, 1, 1, 2);
        } }else {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3148);encodePass(dos, ras, 0, 0, 1, 1);
        }

        }__CLR4_5_227z2bim68iyg2v.R.inc(3149);dos.finish();
        __CLR4_5_227z2bim68iyg2v.R.inc(3150);dos.close();
        __CLR4_5_227z2bim68iyg2v.R.inc(3151);ios.flush();
        __CLR4_5_227z2bim68iyg2v.R.inc(3152);ios.close();
    }finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeIEND() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3153);
        __CLR4_5_227z2bim68iyg2v.R.inc(3154);ChunkStream cs = new ChunkStream("IEND");
        __CLR4_5_227z2bim68iyg2v.R.inc(3155);try {
            __CLR4_5_227z2bim68iyg2v.R.inc(3156);cs.writeToStream(dataOutput);
        } finally {
            __CLR4_5_227z2bim68iyg2v.R.inc(3157);cs.close();
        }
    }finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private static final float[] SRGB_CHROMA = {
        0.31270F, 0.329F, 0.64F, 0.33F, 0.3F, 0.6F, 0.15F, 0.06F
    };

    private void writeCHRM() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3158);
        __CLR4_5_227z2bim68iyg2v.R.inc(3159);if ((((param.isChromaticitySet() || param.isSRGBIntentSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3160)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3161)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3162);ChunkStream cs = new ChunkStream("cHRM");
            __CLR4_5_227z2bim68iyg2v.R.inc(3163);try {
                __CLR4_5_227z2bim68iyg2v.R.inc(3164);float[] chroma;
                __CLR4_5_227z2bim68iyg2v.R.inc(3165);if ((((!param.isSRGBIntentSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3166)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3167)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3168);chroma = param.getChromaticity();
                } }else {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3169);chroma = SRGB_CHROMA; // SRGB chromaticities
                }

                }__CLR4_5_227z2bim68iyg2v.R.inc(3170);for (int i = 0; (((i < 8)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3171)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3172)==0&false)); i++) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3173);cs.writeInt((int)(chroma[i] * 100000));
                }
                }__CLR4_5_227z2bim68iyg2v.R.inc(3174);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3175);cs.close();
            }
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeGAMA() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3176);
        __CLR4_5_227z2bim68iyg2v.R.inc(3177);if ((((param.isGammaSet() || param.isSRGBIntentSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3178)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3179)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3180);ChunkStream cs = new ChunkStream("gAMA");
            __CLR4_5_227z2bim68iyg2v.R.inc(3181);try {
                __CLR4_5_227z2bim68iyg2v.R.inc(3182);float gamma;
                __CLR4_5_227z2bim68iyg2v.R.inc(3183);if ((((!param.isSRGBIntentSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3184)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3185)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3186);gamma = param.getGamma();
                } }else {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3187);gamma = 1.0F / 2.2F; // SRGB gamma
                }
                // TD should include the .5 but causes regard to say
                // everything is different.
                }__CLR4_5_227z2bim68iyg2v.R.inc(3188);cs.writeInt((int)(gamma * 100000/*+0.5*/));
                __CLR4_5_227z2bim68iyg2v.R.inc(3189);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3190);cs.close();
            }
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeICCP() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3191);
        __CLR4_5_227z2bim68iyg2v.R.inc(3192);if ((((param.isICCProfileDataSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3193)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3194)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3195);ChunkStream cs = new ChunkStream("iCCP");
            __CLR4_5_227z2bim68iyg2v.R.inc(3196);try {
                __CLR4_5_227z2bim68iyg2v.R.inc(3197);byte[] iccProfileData = param.getICCProfileData();
                __CLR4_5_227z2bim68iyg2v.R.inc(3198);cs.write(iccProfileData);
                __CLR4_5_227z2bim68iyg2v.R.inc(3199);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3200);cs.close();
            }
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeSBIT() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3201);
        __CLR4_5_227z2bim68iyg2v.R.inc(3202);if ((((param.isSignificantBitsSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3203)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3204)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3205);ChunkStream cs = new ChunkStream("sBIT");
            __CLR4_5_227z2bim68iyg2v.R.inc(3206);try {
                __CLR4_5_227z2bim68iyg2v.R.inc(3207);int[] significantBits = param.getSignificantBits();
                __CLR4_5_227z2bim68iyg2v.R.inc(3208);for (int significantBit : significantBits) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3209);cs.writeByte(significantBit);
                }
                }__CLR4_5_227z2bim68iyg2v.R.inc(3210);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3211);cs.close();
            }
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeSRGB() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3212);
        __CLR4_5_227z2bim68iyg2v.R.inc(3213);if ((((param.isSRGBIntentSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3214)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3215)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3216);ChunkStream cs = new ChunkStream("sRGB");
            __CLR4_5_227z2bim68iyg2v.R.inc(3217);try {
                __CLR4_5_227z2bim68iyg2v.R.inc(3218);int intent = param.getSRGBIntent();
                __CLR4_5_227z2bim68iyg2v.R.inc(3219);cs.write(intent);
                __CLR4_5_227z2bim68iyg2v.R.inc(3220);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3221);cs.close();
            }
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writePLTE() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3222);
        __CLR4_5_227z2bim68iyg2v.R.inc(3223);if ((((redPalette == null)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3224)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3225)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3226);return;
        }

        }__CLR4_5_227z2bim68iyg2v.R.inc(3227);ChunkStream cs = new ChunkStream("PLTE");
        __CLR4_5_227z2bim68iyg2v.R.inc(3228);try {
            __CLR4_5_227z2bim68iyg2v.R.inc(3229);for (int i = 0; (((i < redPalette.length)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3230)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3231)==0&false)); i++) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3232);cs.writeByte(redPalette[i]);
                __CLR4_5_227z2bim68iyg2v.R.inc(3233);cs.writeByte(greenPalette[i]);
                __CLR4_5_227z2bim68iyg2v.R.inc(3234);cs.writeByte(bluePalette[i]);
            }

            }__CLR4_5_227z2bim68iyg2v.R.inc(3235);cs.writeToStream(dataOutput);
        } finally {
            __CLR4_5_227z2bim68iyg2v.R.inc(3236);cs.close();
        }
    }finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeBKGD() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3237);
        __CLR4_5_227z2bim68iyg2v.R.inc(3238);if ((((param.isBackgroundSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3239)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3240)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3241);ChunkStream cs = new ChunkStream("bKGD");
            __CLR4_5_227z2bim68iyg2v.R.inc(3242);try {
                boolean __CLB4_5_2_bool1=false;__CLR4_5_227z2bim68iyg2v.R.inc(3243);switch (colorType) {
                case PNG_COLOR_GRAY:if (!__CLB4_5_2_bool1) {__CLR4_5_227z2bim68iyg2v.R.inc(3244);__CLB4_5_2_bool1=true;}
                case PNG_COLOR_GRAY_ALPHA:if (!__CLB4_5_2_bool1) {__CLR4_5_227z2bim68iyg2v.R.inc(3245);__CLB4_5_2_bool1=true;}
                    __CLR4_5_227z2bim68iyg2v.R.inc(3246);int gray = ((PNGEncodeParam.Gray)param).getBackgroundGray();
                    __CLR4_5_227z2bim68iyg2v.R.inc(3247);cs.writeShort(gray);
                    __CLR4_5_227z2bim68iyg2v.R.inc(3248);break;

                case PNG_COLOR_PALETTE:if (!__CLB4_5_2_bool1) {__CLR4_5_227z2bim68iyg2v.R.inc(3249);__CLB4_5_2_bool1=true;}
                    __CLR4_5_227z2bim68iyg2v.R.inc(3250);int index =
                       ((PNGEncodeParam.Palette)param).getBackgroundPaletteIndex();
                    __CLR4_5_227z2bim68iyg2v.R.inc(3251);cs.writeByte(index);
                    __CLR4_5_227z2bim68iyg2v.R.inc(3252);break;

                case PNG_COLOR_RGB:if (!__CLB4_5_2_bool1) {__CLR4_5_227z2bim68iyg2v.R.inc(3253);__CLB4_5_2_bool1=true;}
                case PNG_COLOR_RGB_ALPHA:if (!__CLB4_5_2_bool1) {__CLR4_5_227z2bim68iyg2v.R.inc(3254);__CLB4_5_2_bool1=true;}
                    __CLR4_5_227z2bim68iyg2v.R.inc(3255);int[] rgb = ((PNGEncodeParam.RGB)param).getBackgroundRGB();
                    __CLR4_5_227z2bim68iyg2v.R.inc(3256);cs.writeShort(rgb[0]);
                    __CLR4_5_227z2bim68iyg2v.R.inc(3257);cs.writeShort(rgb[1]);
                    __CLR4_5_227z2bim68iyg2v.R.inc(3258);cs.writeShort(rgb[2]);
                    __CLR4_5_227z2bim68iyg2v.R.inc(3259);break;
                }

                __CLR4_5_227z2bim68iyg2v.R.inc(3260);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3261);cs.close();
            }
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeHIST() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3262);
        __CLR4_5_227z2bim68iyg2v.R.inc(3263);if ((((param.isPaletteHistogramSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3264)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3265)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3266);ChunkStream cs = new ChunkStream("hIST");
            __CLR4_5_227z2bim68iyg2v.R.inc(3267);try {
                __CLR4_5_227z2bim68iyg2v.R.inc(3268);int[] hist = param.getPaletteHistogram();
                __CLR4_5_227z2bim68iyg2v.R.inc(3269);for (int aHist : hist) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3270);cs.writeShort(aHist);
                }

                }__CLR4_5_227z2bim68iyg2v.R.inc(3271);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3272);cs.close();
            }
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeTRNS() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3273);
        __CLR4_5_227z2bim68iyg2v.R.inc(3274);if ((((param.isTransparencySet()
            && (colorType != PNG_COLOR_GRAY_ALPHA)
            && (colorType != PNG_COLOR_RGB_ALPHA))&&(__CLR4_5_227z2bim68iyg2v.R.iget(3275)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3276)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3277);ChunkStream cs = new ChunkStream("tRNS");
            __CLR4_5_227z2bim68iyg2v.R.inc(3278);try {
                __CLR4_5_227z2bim68iyg2v.R.inc(3279);if ((((param instanceof PNGEncodeParam.Palette)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3280)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3281)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3282);byte[] t =
                        ((PNGEncodeParam.Palette)param).getPaletteTransparency();
                    __CLR4_5_227z2bim68iyg2v.R.inc(3283);for (byte aT : t) {{
                        __CLR4_5_227z2bim68iyg2v.R.inc(3284);cs.writeByte(aT);
                    }
                }} }else {__CLR4_5_227z2bim68iyg2v.R.inc(3285);if ((((param instanceof PNGEncodeParam.Gray)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3286)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3287)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3288);int t = ((PNGEncodeParam.Gray)param).getTransparentGray();
                    __CLR4_5_227z2bim68iyg2v.R.inc(3289);cs.writeShort(t);
                } }else {__CLR4_5_227z2bim68iyg2v.R.inc(3290);if ((((param instanceof PNGEncodeParam.RGB)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3291)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3292)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3293);int[] t = ((PNGEncodeParam.RGB)param).getTransparentRGB();
                    __CLR4_5_227z2bim68iyg2v.R.inc(3294);cs.writeShort(t[0]);
                    __CLR4_5_227z2bim68iyg2v.R.inc(3295);cs.writeShort(t[1]);
                    __CLR4_5_227z2bim68iyg2v.R.inc(3296);cs.writeShort(t[2]);
                }

                }}}__CLR4_5_227z2bim68iyg2v.R.inc(3297);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3298);cs.close();
            }
        } }else {__CLR4_5_227z2bim68iyg2v.R.inc(3299);if ((((colorType == PNG_COLOR_PALETTE)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3300)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3301)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3302);int lastEntry = Math.min(255, alphaPalette.length - 1);
            __CLR4_5_227z2bim68iyg2v.R.inc(3303);int nonOpaque;
            __CLR4_5_227z2bim68iyg2v.R.inc(3304);for (nonOpaque = lastEntry; (((nonOpaque >= 0)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3305)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3306)==0&false)); nonOpaque--) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3307);if ((((alphaPalette[nonOpaque] != (byte)255)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3308)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3309)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3310);break;
                }
            }}

            }__CLR4_5_227z2bim68iyg2v.R.inc(3311);if ((((nonOpaque >= 0)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3312)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3313)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3314);ChunkStream cs = new ChunkStream("tRNS");
                __CLR4_5_227z2bim68iyg2v.R.inc(3315);try {
                    __CLR4_5_227z2bim68iyg2v.R.inc(3316);for (int i = 0; (((i <= nonOpaque)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3317)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3318)==0&false)); i++) {{
                        __CLR4_5_227z2bim68iyg2v.R.inc(3319);cs.writeByte(alphaPalette[i]);
                    }
                    }__CLR4_5_227z2bim68iyg2v.R.inc(3320);cs.writeToStream(dataOutput);
                } finally {
                    __CLR4_5_227z2bim68iyg2v.R.inc(3321);cs.close();
                }
            }
        }}
    }}}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writePHYS() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3322);
        __CLR4_5_227z2bim68iyg2v.R.inc(3323);if ((((param.isPhysicalDimensionSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3324)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3325)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3326);ChunkStream cs = new ChunkStream("pHYs");
            __CLR4_5_227z2bim68iyg2v.R.inc(3327);try {
                __CLR4_5_227z2bim68iyg2v.R.inc(3328);int[] dims = param.getPhysicalDimension();
                __CLR4_5_227z2bim68iyg2v.R.inc(3329);cs.writeInt(dims[0]);
                __CLR4_5_227z2bim68iyg2v.R.inc(3330);cs.writeInt(dims[1]);
                __CLR4_5_227z2bim68iyg2v.R.inc(3331);cs.writeByte((byte)dims[2]);

                __CLR4_5_227z2bim68iyg2v.R.inc(3332);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3333);cs.close();
            }
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeSPLT() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3334);
        __CLR4_5_227z2bim68iyg2v.R.inc(3335);if ((((param.isSuggestedPaletteSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3336)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3337)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3338);ChunkStream cs = new ChunkStream("sPLT");
            __CLR4_5_227z2bim68iyg2v.R.inc(3339);try {
                __CLR4_5_227z2bim68iyg2v.R.inc(3340);System.out.println("sPLT not supported yet.");

                __CLR4_5_227z2bim68iyg2v.R.inc(3341);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3342);cs.close();
            }
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeTIME() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3343);
        __CLR4_5_227z2bim68iyg2v.R.inc(3344);if ((((param.isModificationTimeSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3345)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3346)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3347);ChunkStream cs = new ChunkStream("tIME");
            __CLR4_5_227z2bim68iyg2v.R.inc(3348);try {
                __CLR4_5_227z2bim68iyg2v.R.inc(3349);Date date = param.getModificationTime();
                __CLR4_5_227z2bim68iyg2v.R.inc(3350);TimeZone gmt = TimeZone.getTimeZone("GMT");

                __CLR4_5_227z2bim68iyg2v.R.inc(3351);GregorianCalendar cal = new GregorianCalendar(gmt);
                __CLR4_5_227z2bim68iyg2v.R.inc(3352);cal.setTime(date);

                __CLR4_5_227z2bim68iyg2v.R.inc(3353);int year = cal.get(Calendar.YEAR);
                __CLR4_5_227z2bim68iyg2v.R.inc(3354);int month = cal.get(Calendar.MONTH);
                __CLR4_5_227z2bim68iyg2v.R.inc(3355);int day = cal.get(Calendar.DAY_OF_MONTH);
                __CLR4_5_227z2bim68iyg2v.R.inc(3356);int hour = cal.get(Calendar.HOUR_OF_DAY);
                __CLR4_5_227z2bim68iyg2v.R.inc(3357);int minute = cal.get(Calendar.MINUTE);
                __CLR4_5_227z2bim68iyg2v.R.inc(3358);int second = cal.get(Calendar.SECOND);

                __CLR4_5_227z2bim68iyg2v.R.inc(3359);cs.writeShort(year);
                __CLR4_5_227z2bim68iyg2v.R.inc(3360);cs.writeByte(month + 1);
                __CLR4_5_227z2bim68iyg2v.R.inc(3361);cs.writeByte(day);
                __CLR4_5_227z2bim68iyg2v.R.inc(3362);cs.writeByte(hour);
                __CLR4_5_227z2bim68iyg2v.R.inc(3363);cs.writeByte(minute);
                __CLR4_5_227z2bim68iyg2v.R.inc(3364);cs.writeByte(second);

                __CLR4_5_227z2bim68iyg2v.R.inc(3365);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3366);cs.close();
            }
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeTEXT() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3367);
        __CLR4_5_227z2bim68iyg2v.R.inc(3368);if ((((param.isTextSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3369)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3370)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3371);String[] text = param.getText();

            __CLR4_5_227z2bim68iyg2v.R.inc(3372);for (int i = 0; (((i < text.length / 2)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3373)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3374)==0&false)); i++) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3375);byte[] keyword = text[2 * i].getBytes("UTF-8");
                __CLR4_5_227z2bim68iyg2v.R.inc(3376);byte[] value = text[2 * i + 1].getBytes("UTF-8");

                __CLR4_5_227z2bim68iyg2v.R.inc(3377);ChunkStream cs = new ChunkStream("tEXt");
                __CLR4_5_227z2bim68iyg2v.R.inc(3378);try {
                    __CLR4_5_227z2bim68iyg2v.R.inc(3379);cs.write(keyword, 0, Math.min(keyword.length, 79));
                    __CLR4_5_227z2bim68iyg2v.R.inc(3380);cs.write(0);
                    __CLR4_5_227z2bim68iyg2v.R.inc(3381);cs.write(value);

                    __CLR4_5_227z2bim68iyg2v.R.inc(3382);cs.writeToStream(dataOutput);
                } finally {
                    __CLR4_5_227z2bim68iyg2v.R.inc(3383);cs.close();
                }
            }
        }}
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writeZTXT() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3384);
        __CLR4_5_227z2bim68iyg2v.R.inc(3385);if ((((param.isCompressedTextSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3386)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3387)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3388);String[] text = param.getCompressedText();

            __CLR4_5_227z2bim68iyg2v.R.inc(3389);for (int i = 0; (((i < text.length / 2)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3390)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3391)==0&false)); i++) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3392);byte[] keyword = text[2 * i].getBytes("UTF-8");
                __CLR4_5_227z2bim68iyg2v.R.inc(3393);byte[] value = text[2 * i + 1].getBytes("UTF-8");

                __CLR4_5_227z2bim68iyg2v.R.inc(3394);ChunkStream cs = new ChunkStream("zTXt");
                __CLR4_5_227z2bim68iyg2v.R.inc(3395);try {
                    __CLR4_5_227z2bim68iyg2v.R.inc(3396);cs.write(keyword, 0, Math.min(keyword.length, 79));
                    __CLR4_5_227z2bim68iyg2v.R.inc(3397);cs.write(0);
                    __CLR4_5_227z2bim68iyg2v.R.inc(3398);cs.write(0);

                    __CLR4_5_227z2bim68iyg2v.R.inc(3399);DeflaterOutputStream dos = new DeflaterOutputStream(cs);
                    __CLR4_5_227z2bim68iyg2v.R.inc(3400);try {
                        __CLR4_5_227z2bim68iyg2v.R.inc(3401);dos.write(value);
                        __CLR4_5_227z2bim68iyg2v.R.inc(3402);dos.finish();
                    } finally {
                        __CLR4_5_227z2bim68iyg2v.R.inc(3403);dos.close();
                    }

                    __CLR4_5_227z2bim68iyg2v.R.inc(3404);cs.writeToStream(dataOutput);
                } finally {
                    __CLR4_5_227z2bim68iyg2v.R.inc(3405);cs.close();
                }
            }
        }}
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    private void writePrivateChunks() throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3406);
        __CLR4_5_227z2bim68iyg2v.R.inc(3407);int numChunks = param.getNumPrivateChunks();
        __CLR4_5_227z2bim68iyg2v.R.inc(3408);for (int i = 0; (((i < numChunks)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3409)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3410)==0&false)); i++) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3411);String type = param.getPrivateChunkType(i);
            __CLR4_5_227z2bim68iyg2v.R.inc(3412);byte[] data = param.getPrivateChunkData(i);

            __CLR4_5_227z2bim68iyg2v.R.inc(3413);ChunkStream cs = new ChunkStream(type);
            __CLR4_5_227z2bim68iyg2v.R.inc(3414);try {
                __CLR4_5_227z2bim68iyg2v.R.inc(3415);cs.write(data);
                __CLR4_5_227z2bim68iyg2v.R.inc(3416);cs.writeToStream(dataOutput);
            } finally {
                __CLR4_5_227z2bim68iyg2v.R.inc(3417);cs.close();
            }
        }
    }}finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    /**
     * Analyzes a set of palettes and determines if it can be expressed
     * as a standard set of gray values, with zero or one values being
     * fully transparent and the rest being fully opaque.  If it
     * is possible to express the data thusly, the method returns
     * a suitable instance of PNGEncodeParam.Gray; otherwise it
     * returns null.
     */
    private PNGEncodeParam.Gray createGrayParam(byte[] redPalette,
                                                byte[] greenPalette,
                                                byte[] bluePalette,
                                                byte[] alphaPalette) {try{__CLR4_5_227z2bim68iyg2v.R.inc(3418);
        __CLR4_5_227z2bim68iyg2v.R.inc(3419);PNGEncodeParam.Gray param = new PNGEncodeParam.Gray();
        __CLR4_5_227z2bim68iyg2v.R.inc(3420);int numTransparent = 0;

        __CLR4_5_227z2bim68iyg2v.R.inc(3421);int grayFactor = 255 / ((1 << bitDepth) - 1);
        __CLR4_5_227z2bim68iyg2v.R.inc(3422);int entries = 1 << bitDepth;
        __CLR4_5_227z2bim68iyg2v.R.inc(3423);for (int i = 0; (((i < entries)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3424)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3425)==0&false)); i++) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3426);byte red = redPalette[i];
            __CLR4_5_227z2bim68iyg2v.R.inc(3427);if (((((red != i * grayFactor)
                || (red != greenPalette[i])
                || (red != bluePalette[i]))&&(__CLR4_5_227z2bim68iyg2v.R.iget(3428)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3429)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3430);return null;
            }

            // All alphas must be 255 except at most 1 can be 0
            }__CLR4_5_227z2bim68iyg2v.R.inc(3431);byte alpha = alphaPalette[i];
            __CLR4_5_227z2bim68iyg2v.R.inc(3432);if ((((alpha == (byte)0)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3433)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3434)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3435);param.setTransparentGray(i);

                __CLR4_5_227z2bim68iyg2v.R.inc(3436);++numTransparent;
                __CLR4_5_227z2bim68iyg2v.R.inc(3437);if ((((numTransparent > 1)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3438)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3439)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3440);return null;
                }
            }} }else {__CLR4_5_227z2bim68iyg2v.R.inc(3441);if ((((alpha != (byte)255)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3442)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3443)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3444);return null;
            }
        }}}

        }__CLR4_5_227z2bim68iyg2v.R.inc(3445);return param;
    }finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}

    /**
     * This method encodes a <code>RenderedImage</code> into PNG.
     * The stream into which the PNG is dumped is not closed at
     * the end of the operation, this should be done if needed
     * by the caller of this method.
     */
    @Override
    public void encode(RenderedImage im) throws IOException {try{__CLR4_5_227z2bim68iyg2v.R.inc(3446);
        __CLR4_5_227z2bim68iyg2v.R.inc(3447);this.image = im;
        __CLR4_5_227z2bim68iyg2v.R.inc(3448);this.width = image.getWidth();
        __CLR4_5_227z2bim68iyg2v.R.inc(3449);this.height = image.getHeight();

        __CLR4_5_227z2bim68iyg2v.R.inc(3450);SampleModel sampleModel = image.getSampleModel();

        __CLR4_5_227z2bim68iyg2v.R.inc(3451);int[] sampleSize = sampleModel.getSampleSize();

        // Set bitDepth to a sentinel value
        __CLR4_5_227z2bim68iyg2v.R.inc(3452);this.bitDepth = -1;
        __CLR4_5_227z2bim68iyg2v.R.inc(3453);this.bitShift = 0;

        // Allow user to override the bit depth of gray images
        __CLR4_5_227z2bim68iyg2v.R.inc(3454);if ((((param instanceof PNGEncodeParam.Gray)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3455)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3456)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3457);PNGEncodeParam.Gray paramg = (PNGEncodeParam.Gray)param;
            __CLR4_5_227z2bim68iyg2v.R.inc(3458);if ((((paramg.isBitDepthSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3459)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3460)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3461);this.bitDepth = paramg.getBitDepth();
            }

            }__CLR4_5_227z2bim68iyg2v.R.inc(3462);if ((((paramg.isBitShiftSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3463)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3464)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3465);this.bitShift = paramg.getBitShift();
            }
        }}

        // Get bit depth from image if not set in param
        }__CLR4_5_227z2bim68iyg2v.R.inc(3466);if ((((this.bitDepth == -1)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3467)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3468)==0&false))) {{
            // Get bit depth from channel 0 of the image

            __CLR4_5_227z2bim68iyg2v.R.inc(3469);this.bitDepth = sampleSize[0];
            // Ensure all channels have the same bit depth
            __CLR4_5_227z2bim68iyg2v.R.inc(3470);for (int i = 1; (((i < sampleSize.length)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3471)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3472)==0&false)); i++) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3473);if ((((sampleSize[i] != bitDepth)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3474)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3475)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3476);throw new RuntimeException(PropertyUtil.getString("PNGImageEncoder0"));
                }
            }}

            // Round bit depth up to a power of 2
            }__CLR4_5_227z2bim68iyg2v.R.inc(3477);if ((((bitDepth > 2 && bitDepth < 4)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3478)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3479)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3480);bitDepth = 4;
            } }else {__CLR4_5_227z2bim68iyg2v.R.inc(3481);if ((((bitDepth > 4 && bitDepth < 8)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3482)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3483)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3484);bitDepth = 8;
            } }else {__CLR4_5_227z2bim68iyg2v.R.inc(3485);if ((((bitDepth > 8 && bitDepth < 16)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3486)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3487)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3488);bitDepth = 16;
            } }else {__CLR4_5_227z2bim68iyg2v.R.inc(3489);if ((((bitDepth > 16)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3490)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3491)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3492);throw new RuntimeException(PropertyUtil.getString("PNGImageEncoder1"));
            }
        }}}}}

        }__CLR4_5_227z2bim68iyg2v.R.inc(3493);this.numBands = sampleModel.getNumBands();
        __CLR4_5_227z2bim68iyg2v.R.inc(3494);this.bpp = numBands * (((((bitDepth == 16) )&&(__CLR4_5_227z2bim68iyg2v.R.iget(3495)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3496)==0&false))? 2 : 1);

        __CLR4_5_227z2bim68iyg2v.R.inc(3497);ColorModel colorModel = image.getColorModel();
        __CLR4_5_227z2bim68iyg2v.R.inc(3498);if ((((colorModel instanceof IndexColorModel)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3499)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3500)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3501);if ((((bitDepth < 1 || bitDepth > 8)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3502)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3503)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3504);throw new RuntimeException(PropertyUtil.getString("PNGImageEncoder2"));
            }
            }__CLR4_5_227z2bim68iyg2v.R.inc(3505);if ((((sampleModel.getNumBands() != 1)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3506)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3507)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3508);throw new RuntimeException(PropertyUtil.getString("PNGImageEncoder3"));
            }

            }__CLR4_5_227z2bim68iyg2v.R.inc(3509);IndexColorModel icm = (IndexColorModel)colorModel;
            __CLR4_5_227z2bim68iyg2v.R.inc(3510);int size = icm.getMapSize();

            __CLR4_5_227z2bim68iyg2v.R.inc(3511);redPalette = new byte[size];
            __CLR4_5_227z2bim68iyg2v.R.inc(3512);greenPalette = new byte[size];
            __CLR4_5_227z2bim68iyg2v.R.inc(3513);bluePalette = new byte[size];
            __CLR4_5_227z2bim68iyg2v.R.inc(3514);alphaPalette = new byte[size];

            __CLR4_5_227z2bim68iyg2v.R.inc(3515);icm.getReds(redPalette);
            __CLR4_5_227z2bim68iyg2v.R.inc(3516);icm.getGreens(greenPalette);
            __CLR4_5_227z2bim68iyg2v.R.inc(3517);icm.getBlues(bluePalette);
            __CLR4_5_227z2bim68iyg2v.R.inc(3518);icm.getAlphas(alphaPalette);

            __CLR4_5_227z2bim68iyg2v.R.inc(3519);this.bpp = 1;

            __CLR4_5_227z2bim68iyg2v.R.inc(3520);if ((((param == null)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3521)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3522)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3523);param = createGrayParam(redPalette,
                                        greenPalette,
                                        bluePalette,
                                        alphaPalette);
            }

            // If param is still null, it can't be expressed as gray
            }__CLR4_5_227z2bim68iyg2v.R.inc(3524);if ((((param == null)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3525)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3526)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3527);param = new PNGEncodeParam.Palette();
            }

            }__CLR4_5_227z2bim68iyg2v.R.inc(3528);if ((((param instanceof PNGEncodeParam.Palette)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3529)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3530)==0&false))) {{
                // If palette not set in param, create one from the ColorModel.
                __CLR4_5_227z2bim68iyg2v.R.inc(3531);PNGEncodeParam.Palette parami = (PNGEncodeParam.Palette)param;
                __CLR4_5_227z2bim68iyg2v.R.inc(3532);if ((((parami.isPaletteSet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3533)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3534)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3535);int[] palette = parami.getPalette();
                    __CLR4_5_227z2bim68iyg2v.R.inc(3536);size = palette.length / 3;

                    __CLR4_5_227z2bim68iyg2v.R.inc(3537);int index = 0;
                    __CLR4_5_227z2bim68iyg2v.R.inc(3538);for (int i = 0; (((i < size)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3539)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3540)==0&false)); i++) {{
                        __CLR4_5_227z2bim68iyg2v.R.inc(3541);redPalette[i] = (byte)palette[index++];
                        __CLR4_5_227z2bim68iyg2v.R.inc(3542);greenPalette[i] = (byte)palette[index++];
                        __CLR4_5_227z2bim68iyg2v.R.inc(3543);bluePalette[i] = (byte)palette[index++];
                        __CLR4_5_227z2bim68iyg2v.R.inc(3544);alphaPalette[i] = (byte)255;
                    }
                }}
                }__CLR4_5_227z2bim68iyg2v.R.inc(3545);this.colorType = PNG_COLOR_PALETTE;
            } }else {__CLR4_5_227z2bim68iyg2v.R.inc(3546);if ((((param instanceof PNGEncodeParam.Gray)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3547)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3548)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3549);redPalette = greenPalette = bluePalette = alphaPalette = null;
                __CLR4_5_227z2bim68iyg2v.R.inc(3550);this.colorType = PNG_COLOR_GRAY;
            } }else {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3551);throw new RuntimeException(PropertyUtil.getString("PNGImageEncoder4"));
            }
        }}} }else {__CLR4_5_227z2bim68iyg2v.R.inc(3552);if ((((numBands == 1)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3553)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3554)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3555);if ((((param == null)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3556)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3557)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3558);param = new PNGEncodeParam.Gray();
            }
            }__CLR4_5_227z2bim68iyg2v.R.inc(3559);this.colorType = PNG_COLOR_GRAY;
        } }else {__CLR4_5_227z2bim68iyg2v.R.inc(3560);if ((((numBands == 2)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3561)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3562)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3563);if ((((param == null)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3564)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3565)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3566);param = new PNGEncodeParam.Gray();
            }

            }__CLR4_5_227z2bim68iyg2v.R.inc(3567);if ((((param.isTransparencySet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3568)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3569)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3570);skipAlpha = true;
                __CLR4_5_227z2bim68iyg2v.R.inc(3571);numBands = 1;
                __CLR4_5_227z2bim68iyg2v.R.inc(3572);if (((((sampleSize[0] == 8) && (bitDepth < 8))&&(__CLR4_5_227z2bim68iyg2v.R.iget(3573)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3574)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3575);compressGray = true;
                }
                }__CLR4_5_227z2bim68iyg2v.R.inc(3576);bpp = ((((bitDepth == 16) )&&(__CLR4_5_227z2bim68iyg2v.R.iget(3577)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3578)==0&false))? 2 : 1;
                __CLR4_5_227z2bim68iyg2v.R.inc(3579);this.colorType = PNG_COLOR_GRAY;
            } }else {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3580);if ((((this.bitDepth < 8)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3581)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3582)==0&false))) {{
                    __CLR4_5_227z2bim68iyg2v.R.inc(3583);this.bitDepth = 8;
                }
                }__CLR4_5_227z2bim68iyg2v.R.inc(3584);this.colorType = PNG_COLOR_GRAY_ALPHA;
            }
        }} }else {__CLR4_5_227z2bim68iyg2v.R.inc(3585);if ((((numBands == 3)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3586)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3587)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3588);if ((((param == null)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3589)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3590)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3591);param = new PNGEncodeParam.RGB();
            }
            }__CLR4_5_227z2bim68iyg2v.R.inc(3592);this.colorType = PNG_COLOR_RGB;
        } }else {__CLR4_5_227z2bim68iyg2v.R.inc(3593);if ((((numBands == 4)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3594)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3595)==0&false))) {{
            __CLR4_5_227z2bim68iyg2v.R.inc(3596);if ((((param == null)&&(__CLR4_5_227z2bim68iyg2v.R.iget(3597)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3598)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3599);param = new PNGEncodeParam.RGB();
            }
            }__CLR4_5_227z2bim68iyg2v.R.inc(3600);if ((((param.isTransparencySet())&&(__CLR4_5_227z2bim68iyg2v.R.iget(3601)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3602)==0&false))) {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3603);skipAlpha = true;
                __CLR4_5_227z2bim68iyg2v.R.inc(3604);numBands = 3;
                __CLR4_5_227z2bim68iyg2v.R.inc(3605);bpp = ((((bitDepth == 16) )&&(__CLR4_5_227z2bim68iyg2v.R.iget(3606)!=0|true))||(__CLR4_5_227z2bim68iyg2v.R.iget(3607)==0&false))? 6 : 3;
                __CLR4_5_227z2bim68iyg2v.R.inc(3608);this.colorType = PNG_COLOR_RGB;
            } }else {{
                __CLR4_5_227z2bim68iyg2v.R.inc(3609);this.colorType = PNG_COLOR_RGB_ALPHA;
            }
        }}

        }}}}}__CLR4_5_227z2bim68iyg2v.R.inc(3610);interlace = param.getInterlacing();

        __CLR4_5_227z2bim68iyg2v.R.inc(3611);writeMagic();

        __CLR4_5_227z2bim68iyg2v.R.inc(3612);writeIHDR();

        __CLR4_5_227z2bim68iyg2v.R.inc(3613);writeCHRM();
        __CLR4_5_227z2bim68iyg2v.R.inc(3614);writeGAMA();
        __CLR4_5_227z2bim68iyg2v.R.inc(3615);writeICCP();
        __CLR4_5_227z2bim68iyg2v.R.inc(3616);writeSBIT();
        __CLR4_5_227z2bim68iyg2v.R.inc(3617);writeSRGB();

        __CLR4_5_227z2bim68iyg2v.R.inc(3618);writePLTE();

        __CLR4_5_227z2bim68iyg2v.R.inc(3619);writeHIST();
        __CLR4_5_227z2bim68iyg2v.R.inc(3620);writeTRNS();
        __CLR4_5_227z2bim68iyg2v.R.inc(3621);writeBKGD();

        __CLR4_5_227z2bim68iyg2v.R.inc(3622);writePHYS();
        __CLR4_5_227z2bim68iyg2v.R.inc(3623);writeSPLT();
        __CLR4_5_227z2bim68iyg2v.R.inc(3624);writeTIME();
        __CLR4_5_227z2bim68iyg2v.R.inc(3625);writeTEXT();
        __CLR4_5_227z2bim68iyg2v.R.inc(3626);writeZTXT();

        __CLR4_5_227z2bim68iyg2v.R.inc(3627);writePrivateChunks();

        __CLR4_5_227z2bim68iyg2v.R.inc(3628);writeIDAT();

        __CLR4_5_227z2bim68iyg2v.R.inc(3629);writeIEND();

        __CLR4_5_227z2bim68iyg2v.R.inc(3630);dataOutput.flush();
        __CLR4_5_227z2bim68iyg2v.R.inc(3631);dataOutput.close();
    }finally{__CLR4_5_227z2bim68iyg2v.R.flushNeeded();}}
}
