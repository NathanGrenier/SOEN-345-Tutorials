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

/* $Id: PNGChunk.java 1732019 2016-02-24 05:01:10Z gadams $ */

package org.apache.xmlgraphics.image.codec.png;

import java.io.DataInputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PNGChunk {public static class __CLR4_5_2r2r2m68iyfrb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,1040,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    int length;
    int type;
    byte[] data;
    int crc;

    String typeString;

    /** logger */
    protected static final Log log = LogFactory.getLog(PNGChunk.class);

    /**
     * See http://en.wikipedia.org/wiki/Portable_Network_Graphics for a light explanation;
     * See http://www.libpng.org/pub/png/spec/1.2/PNG-Chunks.html for the spec.
     */
    public enum ChunkType {
        IHDR, // IHDR must be the first chunk
        PLTE, // PLTE contains the palette
        IDAT, // IDAT contains the image, which may be split among multiple IDAT chunks
        IEND, // IEND marks the image end
        bKGD, // bKGD gives the default background color
        cHRM, // cHRM gives the chromaticity coordinates
        gAMA, // gAMA specifies gamma
        hIST, // hIST can store the histogram
        iCCP, // iCCP is an ICC color profile
        iTXt, // iTXt contains UTF-8 text
        pHYs, // pHYs holds the intended pixel size
        sBIT, // sBIT (significant bits) indicates the color-accuracy
        sPLT, // sPLT suggests a palette to use
        sRGB, // sRGB indicates that the standard sRGB color space is used
        sTER, // sTER stereo-image indicator chunk for stereoscopic images
        tEXt, // tEXt can store text that can be represented in ISO/IEC 8859-1
        tIME, // tIME stores the time that the image was last changed
        tRNS, // tRNS contains transparency information
        zTXt; // zTXt contains compressed text with the same limits as tEXt
    }

    public PNGChunk(int length, int type, byte[] data, int crc) {try{__CLR4_5_2r2r2m68iyfrb.R.inc(974);
        __CLR4_5_2r2r2m68iyfrb.R.inc(975);this.length = length;
        __CLR4_5_2r2r2m68iyfrb.R.inc(976);this.type = type;
        __CLR4_5_2r2r2m68iyfrb.R.inc(977);this.data = data;
        __CLR4_5_2r2r2m68iyfrb.R.inc(978);this.crc = crc;
        __CLR4_5_2r2r2m68iyfrb.R.inc(979);this.typeString = typeIntToString(this.type);
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    public int getLength() {try{__CLR4_5_2r2r2m68iyfrb.R.inc(980);
        __CLR4_5_2r2r2m68iyfrb.R.inc(981);return length;
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    public int getType() {try{__CLR4_5_2r2r2m68iyfrb.R.inc(982);
        __CLR4_5_2r2r2m68iyfrb.R.inc(983);return type;
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    public String getTypeString() {try{__CLR4_5_2r2r2m68iyfrb.R.inc(984);
        __CLR4_5_2r2r2m68iyfrb.R.inc(985);return typeString;
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    public byte[] getData() {try{__CLR4_5_2r2r2m68iyfrb.R.inc(986);
        __CLR4_5_2r2r2m68iyfrb.R.inc(987);return data;
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    public byte getByte(int offset) {try{__CLR4_5_2r2r2m68iyfrb.R.inc(988);
        __CLR4_5_2r2r2m68iyfrb.R.inc(989);return data[offset];
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    public int getInt1(int offset) {try{__CLR4_5_2r2r2m68iyfrb.R.inc(990);
        __CLR4_5_2r2r2m68iyfrb.R.inc(991);return data[offset] & 0xff;
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    public int getInt2(int offset) {try{__CLR4_5_2r2r2m68iyfrb.R.inc(992);
        __CLR4_5_2r2r2m68iyfrb.R.inc(993);return ((data[offset] & 0xff) << 8) | (data[offset + 1] & 0xff);
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    public int getInt4(int offset) {try{__CLR4_5_2r2r2m68iyfrb.R.inc(994);
        __CLR4_5_2r2r2m68iyfrb.R.inc(995);return ((data[offset] & 0xff) << 24) | ((data[offset + 1] & 0xff) << 16)
                | ((data[offset + 2] & 0xff) << 8) | (data[offset + 3] & 0xff);
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    public String getString4(int offset) {try{__CLR4_5_2r2r2m68iyfrb.R.inc(996);
        __CLR4_5_2r2r2m68iyfrb.R.inc(997);return "" + (char) data[offset] + (char) data[offset + 1] + (char) data[offset + 2]
                + (char) data[offset + 3];
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    public boolean isType(String typeName) {try{__CLR4_5_2r2r2m68iyfrb.R.inc(998);
        __CLR4_5_2r2r2m68iyfrb.R.inc(999);return typeString.equals(typeName);
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    /**
     * Reads the next chunk from the input stream.
     * @param distream the input stream
     * @return the chunk
     */
    public static PNGChunk readChunk(DataInputStream distream) {try{__CLR4_5_2r2r2m68iyfrb.R.inc(1000);
        __CLR4_5_2r2r2m68iyfrb.R.inc(1001);try {
            __CLR4_5_2r2r2m68iyfrb.R.inc(1002);int length = distream.readInt();
            __CLR4_5_2r2r2m68iyfrb.R.inc(1003);int type = distream.readInt();
            __CLR4_5_2r2r2m68iyfrb.R.inc(1004);byte[] data = new byte[length];
            __CLR4_5_2r2r2m68iyfrb.R.inc(1005);distream.readFully(data);
            __CLR4_5_2r2r2m68iyfrb.R.inc(1006);int crc = distream.readInt();

            __CLR4_5_2r2r2m68iyfrb.R.inc(1007);return new PNGChunk(length, type, data, crc);
        } catch (Exception e) {
            __CLR4_5_2r2r2m68iyfrb.R.inc(1008);e.printStackTrace();
            __CLR4_5_2r2r2m68iyfrb.R.inc(1009);return null;
        }
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    /**
     * Returns the PNG chunk type, a four letter case sensitive ASCII type/name.
     * @param distream the input stream
     * @return a four letter case sensitive ASCII type/name
     */
    public static String getChunkType(DataInputStream distream) {try{__CLR4_5_2r2r2m68iyfrb.R.inc(1010);
        __CLR4_5_2r2r2m68iyfrb.R.inc(1011);try {
            __CLR4_5_2r2r2m68iyfrb.R.inc(1012);distream.mark(8);
            /* int length = */__CLR4_5_2r2r2m68iyfrb.R.inc(1013);distream.readInt();
            __CLR4_5_2r2r2m68iyfrb.R.inc(1014);int type = distream.readInt();
            __CLR4_5_2r2r2m68iyfrb.R.inc(1015);distream.reset();

            __CLR4_5_2r2r2m68iyfrb.R.inc(1016);return typeIntToString(type);
        } catch (Exception e) {
            __CLR4_5_2r2r2m68iyfrb.R.inc(1017);e.printStackTrace();
            __CLR4_5_2r2r2m68iyfrb.R.inc(1018);return null;
        }
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    private static String typeIntToString(int type) {try{__CLR4_5_2r2r2m68iyfrb.R.inc(1019);
        __CLR4_5_2r2r2m68iyfrb.R.inc(1020);String typeString = "";
        __CLR4_5_2r2r2m68iyfrb.R.inc(1021);typeString += (char) (type >> 24);
        __CLR4_5_2r2r2m68iyfrb.R.inc(1022);typeString += (char) ((type >> 16) & 0xff);
        __CLR4_5_2r2r2m68iyfrb.R.inc(1023);typeString += (char) ((type >> 8) & 0xff);
        __CLR4_5_2r2r2m68iyfrb.R.inc(1024);typeString += (char) (type & 0xff);
        __CLR4_5_2r2r2m68iyfrb.R.inc(1025);return typeString;
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}

    /**
     * Skips the next chunk from the input stream.
     * @param distream the input stream
     * @return true if skipping successful, false otherwise
     */
    public static boolean skipChunk(DataInputStream distream) {try{__CLR4_5_2r2r2m68iyfrb.R.inc(1026);
        __CLR4_5_2r2r2m68iyfrb.R.inc(1027);try {
            __CLR4_5_2r2r2m68iyfrb.R.inc(1028);int length = distream.readInt();
            __CLR4_5_2r2r2m68iyfrb.R.inc(1029);distream.readInt();
            // is this really faster than reading?
            __CLR4_5_2r2r2m68iyfrb.R.inc(1030);int skipped = distream.skipBytes(length);
            __CLR4_5_2r2r2m68iyfrb.R.inc(1031);distream.readInt();
            __CLR4_5_2r2r2m68iyfrb.R.inc(1032);if ((((skipped != length)&&(__CLR4_5_2r2r2m68iyfrb.R.iget(1033)!=0|true))||(__CLR4_5_2r2r2m68iyfrb.R.iget(1034)==0&false))) {{
                __CLR4_5_2r2r2m68iyfrb.R.inc(1035);log.warn("Incorrect number of bytes skipped.");
                __CLR4_5_2r2r2m68iyfrb.R.inc(1036);return false;
            }
            }__CLR4_5_2r2r2m68iyfrb.R.inc(1037);return true;
        } catch (Exception e) {
            __CLR4_5_2r2r2m68iyfrb.R.inc(1038);log.warn(e.getMessage());
            __CLR4_5_2r2r2m68iyfrb.R.inc(1039);return false;
        }
    }finally{__CLR4_5_2r2r2m68iyfrb.R.flushNeeded();}}
}
