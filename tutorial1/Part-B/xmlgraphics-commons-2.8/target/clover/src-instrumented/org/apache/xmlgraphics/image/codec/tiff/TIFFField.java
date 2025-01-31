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

/* $Id: TIFFField.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.tiff;

import java.io.Serializable;

// CSOFF: WhitespaceAround

/**
 * A class representing a field in a TIFF 6.0 Image File Directory.
 *
 * <p> The TIFF file format is described in more detail in the
 * comments for the TIFFDescriptor class.
 *
 * <p> A field in a TIFF Image File Directory (IFD).  A field is defined
 * as a sequence of values of identical data type.  TIFF 6.0 defines
 * 12 data types, which are mapped internally onto the Java datatypes
 * byte, int, long, float, and double.
 *
 * <p><b> This class is not a committed part of the JAI API.  It may
 * be removed or changed in future releases of JAI.</b>
 *
 * @see TIFFDirectory
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TIFFField implements Comparable, Serializable {public static class __CLR4_5_24sq4sqm6lb4ytp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,6353,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Flag for 8 bit unsigned integers. */
    public static final int TIFF_BYTE      =  1;

    /** Flag for null-terminated ASCII strings. */
    public static final int TIFF_ASCII     =  2;

    /** Flag for 16 bit unsigned integers. */
    public static final int TIFF_SHORT     =  3;

    /** Flag for 32 bit unsigned integers. */
    public static final int TIFF_LONG      =  4;

    /** Flag for pairs of 32 bit unsigned integers. */
    public static final int TIFF_RATIONAL  =  5;

    /** Flag for 8 bit signed integers. */
    public static final int TIFF_SBYTE     =  6;

    /** Flag for 8 bit uninterpreted bytes. */
    public static final int TIFF_UNDEFINED =  7;

    /** Flag for 16 bit signed integers. */
    public static final int TIFF_SSHORT    =  8;

    /** Flag for 32 bit signed integers. */
    public static final int TIFF_SLONG     =  9;

    /** Flag for pairs of 32 bit signed integers. */
    public static final int TIFF_SRATIONAL = 10;

    /** Flag for 32 bit IEEE floats. */
    public static final int TIFF_FLOAT     = 11;

    /** Flag for 64 bit IEEE doubles. */
    public static final int TIFF_DOUBLE    = 12;
    private static final long serialVersionUID = 207783128222415437L;

    /** The tag number. */
    int tag;

    /** The tag type. */
    int type;

    /** The number of data items present in the field. */
    int count;

    /** The field data. */
    Object data;

    /** The default constructor. */
    TIFFField() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6218); }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Constructs a TIFFField with arbitrary data.  The data
     * parameter must be an array of a Java type appropriate for the
     * type of the TIFF field.  Since there is no available 32-bit
     * unsigned datatype, long is used. The mapping between types is
     * as follows:
     *
     * <table border=1 summary="TIFF">
     * <tr>
     * <th> TIFF type </th> <th> Java type </th>
     * <tr>
     * <td><tt>TIFF_BYTE</tt></td>      <td><tt>byte</tt></td>
     * <tr>
     * <td><tt>TIFF_ASCII</tt></td>     <td><tt>String</tt></td>
     * <tr>
     * <td><tt>TIFF_SHORT</tt></td>     <td><tt>char</tt></td>
     * <tr>
     * <td><tt>TIFF_LONG</tt></td>      <td><tt>long</tt></td>
     * <tr>
     * <td><tt>TIFF_RATIONAL</tt></td>  <td><tt>long[2]</tt></td>
     * <tr>
     * <td><tt>TIFF_SBYTE</tt></td>     <td><tt>byte</tt></td>
     * <tr>
     * <td><tt>TIFF_UNDEFINED</tt></td> <td><tt>byte</tt></td>
     * <tr>
     * <td><tt>TIFF_SSHORT</tt></td>    <td><tt>short</tt></td>
     * <tr>
     * <td><tt>TIFF_SLONG</tt></td>     <td><tt>int</tt></td>
     * <tr>
     * <td><tt>TIFF_SRATIONAL</tt></td> <td><tt>int[2]</tt></td>
     * <tr>
     * <td><tt>TIFF_FLOAT</tt></td>     <td><tt>float</tt></td>
     * <tr>
     * <td><tt>TIFF_DOUBLE</tt></td>    <td><tt>double</tt></td>
     * </table>
     */
    public TIFFField(int tag, int type, int count, Object data) {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6219);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6220);this.tag = tag;
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6221);this.type = type;
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6222);this.count = count;
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6223);this.data = data;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns the tag number, between 0 and 65535.
     */
    public int getTag() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6224);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6225);return tag;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns the type of the data stored in the IFD.
     * For a TIFF6.0 file, the value will equal one of the
     * TIFF_ constants defined in this class.  For future
     * revisions of TIFF, higher values are possible.
     *
     */
    public int getType() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6226);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6227);return type;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns the number of elements in the IFD.
     */
    public int getCount() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6228);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6229);return count;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns the data as an uninterpreted array of bytes.
     * The type of the field must be one of TIFF_BYTE, TIFF_SBYTE,
     * or TIFF_UNDEFINED;
     *
     * <p> For data in TIFF_BYTE format, the application must take
     * care when promoting the data to longer integral types
     * to avoid sign extension.
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_BYTE, TIFF_SBYTE, or TIFF_UNDEFINED.
     */
    public byte[] getAsBytes() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6230);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6231);return (byte[])data;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns TIFF_SHORT data as an array of chars (unsigned 16-bit
     * integers).
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_SHORT.
     */
    public char[] getAsChars() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6232);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6233);return (char[])data;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns TIFF_SSHORT data as an array of shorts (signed 16-bit
     * integers).
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_SSHORT.
     */
    public short[] getAsShorts() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6234);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6235);return (short[])data;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns TIFF_SLONG data as an array of ints (signed 32-bit
     * integers).
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_SLONG.
     */
    public int[] getAsInts() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6236);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6237);return (int[])data;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns TIFF_LONG data as an array of longs (signed 64-bit
     * integers).
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_LONG.
     */
    public long[] getAsLongs() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6238);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6239);return (long[])data;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns TIFF_FLOAT data as an array of floats.
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_FLOAT.
     */
    public float[] getAsFloats() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6240);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6241);return (float[])data;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns TIFF_DOUBLE data as an array of doubles.
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_DOUBLE.
     */
    public double[] getAsDoubles() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6242);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6243);return (double[])data;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns TIFF_SRATIONAL data as an array of 2-element arrays of ints.
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_SRATIONAL.
     */
    public int[][] getAsSRationals() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6244);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6245);return (int[][])data;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns TIFF_RATIONAL data as an array of 2-element arrays of longs.
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_RATTIONAL.
     */
    public long[][] getAsRationals() {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6246);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6247);return (long[][])data;
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns data in TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT,
     * TIFF_SSHORT, or TIFF_SLONG format as an int.
     *
     * <p> TIFF_BYTE and TIFF_UNDEFINED data are treated as unsigned;
     * that is, no sign extension will take place and the returned
     * value will be in the range [0, 255].  TIFF_SBYTE data will
     * be returned in the range [-128, 127].
     *
     * <p> A ClassCastException will be thrown if the field is not of
     * type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT,
     * TIFF_SSHORT, or TIFF_SLONG.
     */
    public int getAsInt(int index) {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6248);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_24sq4sqm6lb4ytp.R.inc(6249);switch (type) {
        case TIFF_BYTE:if (!__CLB4_5_2_bool0) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6250);__CLB4_5_2_bool0=true;} case TIFF_UNDEFINED:if (!__CLB4_5_2_bool0) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6251);__CLB4_5_2_bool0=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6252);return ((byte[])data)[index] & 0xff;
        case TIFF_SBYTE:if (!__CLB4_5_2_bool0) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6253);__CLB4_5_2_bool0=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6254);return ((byte[])data)[index];
        case TIFF_SHORT:if (!__CLB4_5_2_bool0) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6255);__CLB4_5_2_bool0=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6256);return ((char[])data)[index] & 0xffff;
        case TIFF_SSHORT:if (!__CLB4_5_2_bool0) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6257);__CLB4_5_2_bool0=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6258);return ((short[])data)[index];
        case TIFF_SLONG:if (!__CLB4_5_2_bool0) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6259);__CLB4_5_2_bool0=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6260);return ((int[])data)[index];
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6261);__CLB4_5_2_bool0=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6262);throw new ClassCastException();
        }
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns data in TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT,
     * TIFF_SSHORT, TIFF_SLONG, or TIFF_LONG format as a long.
     *
     * <p> TIFF_BYTE and TIFF_UNDEFINED data are treated as unsigned;
     * that is, no sign extension will take place and the returned
     * value will be in the range [0, 255].  TIFF_SBYTE data will
     * be returned in the range [-128, 127].
     *
     * <p> A ClassCastException will be thrown if the field is not of
     * type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED, TIFF_SHORT,
     * TIFF_SSHORT, TIFF_SLONG, or TIFF_LONG.
     */
    public long getAsLong(int index) {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6263);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_24sq4sqm6lb4ytp.R.inc(6264);switch (type) {
        case TIFF_BYTE:if (!__CLB4_5_2_bool1) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6265);__CLB4_5_2_bool1=true;} case TIFF_UNDEFINED:if (!__CLB4_5_2_bool1) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6266);__CLB4_5_2_bool1=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6267);return ((byte[])data)[index] & 0xff;
        case TIFF_SBYTE:if (!__CLB4_5_2_bool1) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6268);__CLB4_5_2_bool1=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6269);return ((byte[])data)[index];
        case TIFF_SHORT:if (!__CLB4_5_2_bool1) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6270);__CLB4_5_2_bool1=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6271);return ((char[])data)[index] & 0xffff;
        case TIFF_SSHORT:if (!__CLB4_5_2_bool1) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6272);__CLB4_5_2_bool1=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6273);return ((short[])data)[index];
        case TIFF_SLONG:if (!__CLB4_5_2_bool1) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6274);__CLB4_5_2_bool1=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6275);return ((int[])data)[index];
        case TIFF_LONG:if (!__CLB4_5_2_bool1) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6276);__CLB4_5_2_bool1=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6277);return ((long[])data)[index];
        default:if (!__CLB4_5_2_bool1) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6278);__CLB4_5_2_bool1=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6279);throw new ClassCastException();
        }
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns data in any numerical format as a float.  Data in
     * TIFF_SRATIONAL or TIFF_RATIONAL format are evaluated by
     * dividing the numerator into the denominator using
     * double-precision arithmetic and then truncating to single
     * precision.  Data in TIFF_SLONG, TIFF_LONG, or TIFF_DOUBLE
     * format may suffer from truncation.
     *
     * <p> A ClassCastException will be thrown if the field is
     * of type TIFF_UNDEFINED or TIFF_ASCII.
     */
    public float getAsFloat(int index) {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6280);
        boolean __CLB4_5_2_bool2=false;__CLR4_5_24sq4sqm6lb4ytp.R.inc(6281);switch (type) {
        case TIFF_BYTE:if (!__CLB4_5_2_bool2) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6282);__CLB4_5_2_bool2=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6283);return ((byte[])data)[index] & 0xff;
        case TIFF_SBYTE:if (!__CLB4_5_2_bool2) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6284);__CLB4_5_2_bool2=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6285);return ((byte[])data)[index];
        case TIFF_SHORT:if (!__CLB4_5_2_bool2) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6286);__CLB4_5_2_bool2=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6287);return ((char[])data)[index] & 0xffff;
        case TIFF_SSHORT:if (!__CLB4_5_2_bool2) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6288);__CLB4_5_2_bool2=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6289);return ((short[])data)[index];
        case TIFF_SLONG:if (!__CLB4_5_2_bool2) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6290);__CLB4_5_2_bool2=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6291);return ((int[])data)[index];
        case TIFF_LONG:if (!__CLB4_5_2_bool2) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6292);__CLB4_5_2_bool2=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6293);return ((long[])data)[index];
        case TIFF_FLOAT:if (!__CLB4_5_2_bool2) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6294);__CLB4_5_2_bool2=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6295);return ((float[])data)[index];
        case TIFF_DOUBLE:if (!__CLB4_5_2_bool2) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6296);__CLB4_5_2_bool2=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6297);return (float)((double[])data)[index];
        case TIFF_SRATIONAL:if (!__CLB4_5_2_bool2) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6298);__CLB4_5_2_bool2=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6299);int[] ivalue = getAsSRational(index);
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6300);return (float)((double)ivalue[0] / ivalue[1]);
        case TIFF_RATIONAL:if (!__CLB4_5_2_bool2) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6301);__CLB4_5_2_bool2=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6302);long[] lvalue = getAsRational(index);
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6303);return (float)((double)lvalue[0] / lvalue[1]);
        default:if (!__CLB4_5_2_bool2) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6304);__CLB4_5_2_bool2=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6305);throw new ClassCastException();
        }
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns data in any numerical format as a float.  Data in
     * TIFF_SRATIONAL or TIFF_RATIONAL format are evaluated by
     * dividing the numerator into the denominator using
     * double-precision arithmetic.
     *
     * <p> A ClassCastException will be thrown if the field is of
     * type TIFF_UNDEFINED or TIFF_ASCII.
     */
    public double getAsDouble(int index) {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6306);
        boolean __CLB4_5_2_bool3=false;__CLR4_5_24sq4sqm6lb4ytp.R.inc(6307);switch (type) {
        case TIFF_BYTE:if (!__CLB4_5_2_bool3) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6308);__CLB4_5_2_bool3=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6309);return ((byte[])data)[index] & 0xff;
        case TIFF_SBYTE:if (!__CLB4_5_2_bool3) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6310);__CLB4_5_2_bool3=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6311);return ((byte[])data)[index];
        case TIFF_SHORT:if (!__CLB4_5_2_bool3) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6312);__CLB4_5_2_bool3=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6313);return ((char[])data)[index] & 0xffff;
        case TIFF_SSHORT:if (!__CLB4_5_2_bool3) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6314);__CLB4_5_2_bool3=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6315);return ((short[])data)[index];
        case TIFF_SLONG:if (!__CLB4_5_2_bool3) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6316);__CLB4_5_2_bool3=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6317);return ((int[])data)[index];
        case TIFF_LONG:if (!__CLB4_5_2_bool3) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6318);__CLB4_5_2_bool3=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6319);return ((long[])data)[index];
        case TIFF_FLOAT:if (!__CLB4_5_2_bool3) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6320);__CLB4_5_2_bool3=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6321);return ((float[])data)[index];
        case TIFF_DOUBLE:if (!__CLB4_5_2_bool3) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6322);__CLB4_5_2_bool3=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6323);return ((double[])data)[index];
        case TIFF_SRATIONAL:if (!__CLB4_5_2_bool3) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6324);__CLB4_5_2_bool3=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6325);int[] ivalue = getAsSRational(index);
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6326);return (double)ivalue[0] / ivalue[1];
        case TIFF_RATIONAL:if (!__CLB4_5_2_bool3) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6327);__CLB4_5_2_bool3=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6328);long[] lvalue = getAsRational(index);
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6329);return (double)lvalue[0] / lvalue[1];
        default:if (!__CLB4_5_2_bool3) {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6330);__CLB4_5_2_bool3=true;}
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6331);throw new ClassCastException();
        }
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns a TIFF_ASCII data item as a String.
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_ASCII.
     */
    public String getAsString(int index) {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6332);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6333);return ((String[])data)[index];
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns a TIFF_SRATIONAL data item as a two-element array
     * of ints.
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_SRATIONAL.
     */
    public int[] getAsSRational(int index) {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6334);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6335);return ((int[][])data)[index];
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Returns a TIFF_RATIONAL data item as a two-element array
     * of ints.
     *
     * <p> A ClassCastException will be thrown if the field is not
     * of type TIFF_RATIONAL.
     */
    public long[] getAsRational(int index) {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6336);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6337);return ((long[][])data)[index];
    }finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}

    /**
     * Compares this <code>TIFFField</code> with another
     * <code>TIFFField</code> by comparing the tags.
     *
     * <p><b>Note: this class has a natural ordering that is inconsistent
     * with <code>equals()</code>.</b>
     *
     * @throws NullPointerException if the parameter is <code>null</code>.
     * @throws ClassCastException if the parameter is not a
     *         <code>TIFFField</code>.
     */
    public int compareTo(Object o) {try{__CLR4_5_24sq4sqm6lb4ytp.R.inc(6338);
        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6339);if ((((o == null)&&(__CLR4_5_24sq4sqm6lb4ytp.R.iget(6340)!=0|true))||(__CLR4_5_24sq4sqm6lb4ytp.R.iget(6341)==0&false))) {{
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6342);throw new NullPointerException();
        }

        }__CLR4_5_24sq4sqm6lb4ytp.R.inc(6343);int oTag = ((TIFFField)o).getTag();

        __CLR4_5_24sq4sqm6lb4ytp.R.inc(6344);if ((((tag < oTag)&&(__CLR4_5_24sq4sqm6lb4ytp.R.iget(6345)!=0|true))||(__CLR4_5_24sq4sqm6lb4ytp.R.iget(6346)==0&false))) {{
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6347);return -1;
        } }else {__CLR4_5_24sq4sqm6lb4ytp.R.inc(6348);if ((((tag > oTag)&&(__CLR4_5_24sq4sqm6lb4ytp.R.iget(6349)!=0|true))||(__CLR4_5_24sq4sqm6lb4ytp.R.iget(6350)==0&false))) {{
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6351);return 1;
        } }else {{
            __CLR4_5_24sq4sqm6lb4ytp.R.inc(6352);return 0;
        }
    }}}finally{__CLR4_5_24sq4sqm6lb4ytp.R.flushNeeded();}}
}
