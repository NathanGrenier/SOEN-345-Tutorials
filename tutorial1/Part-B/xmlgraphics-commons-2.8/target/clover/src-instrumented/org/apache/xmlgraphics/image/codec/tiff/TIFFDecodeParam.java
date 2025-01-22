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

/* $Id: TIFFDecodeParam.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.tiff;

import  org.apache.xmlgraphics.image.codec.util.ImageDecodeParam;

/**
 * An instance of <code>ImageDecodeParam</code> for decoding images in
 * the TIFF format.
 *
 * <p> To determine the number of images present in a TIFF file, use
 * the <code>getNumPages()</code> method on the
 * <code>ImageDecoder</code> object that will be used to perform the
 * decoding.  The desired page number may be passed as an argument to
 * the <code>ImageDecoder.decodeAsRaster)()</code> or
 * <code>decodeAsRenderedImage()</code> methods.
 *
 * <p> For TIFF Palette color images, the colorMap always has entries
 * of short data type, the color Black being represented by 0,0,0 and
 * White by 65536,65536,65536. In order to display these images, the
 * default behavior is to dither the short values down to 8 bits.
 * The dithering is done by calling the <code>decode16BitsTo8Bits</code>
 * method for each short value that needs to be dithered. The method has
 * the following implementation:
 * <code>
 *       byte b;
 *       short s;
 *       s = s &amp; 0xffff;
 *       b = (byte)((s &gt;&gt; 8) &amp; 0xff);
 * </code>
 * If a different algorithm is to be used for the dithering, this class
 * should be subclassed and an appropriate implementation should be
 * provided for the <code>decode16BitsTo8Bits</code> method in the subclass.
 *
 * <p>If the palette contains image data that is signed short, as specified
 * by the SampleFormat tag, the dithering is done by calling
 * <code>decodeSigned16BitsTo8Bits</code> instead. The method has the
 * following implementation:
 * <code>
 *       byte b;
 *       short s;
 *       b = (byte)((s + Short.MIN_VALUE) &gt;&gt; 8);
 * </code>
 * In order to use a different algorithm for the dithering, this class
 * should be subclassed and the method overridden.
 *
 * <p> If it is desired that the Palette be decoded such that the output
 * image is of short data type and no dithering is performed, the
 * <code>setDecodePaletteAsShorts</code> method should be used.
 *
 * <p><b> This class is not a committed part of the JAI API.  It may
 * be removed or changed in future releases of JAI.</b>
 *
 * @see TIFFDirectory
 */
public class TIFFDecodeParam implements ImageDecodeParam {public static class __CLR4_5_23yz3yzm68iygcm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,5164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -2371665950056848358L;
    private boolean decodePaletteAsShorts;
    private Long ifdOffset;
    private boolean convertJPEGYCbCrToRGB = true;

    /** Constructs a default instance of <code>TIFFDecodeParam</code>. */
    public TIFFDecodeParam() {try{__CLR4_5_23yz3yzm68iygcm.R.inc(5147);
    }finally{__CLR4_5_23yz3yzm68iygcm.R.flushNeeded();}}

    /**
     * If set, the entries in the palette will be decoded as shorts
     * and no short to byte lookup will be applied to them.
     */
    public void setDecodePaletteAsShorts(boolean decodePaletteAsShorts) {try{__CLR4_5_23yz3yzm68iygcm.R.inc(5148);
        __CLR4_5_23yz3yzm68iygcm.R.inc(5149);this.decodePaletteAsShorts = decodePaletteAsShorts;
    }finally{__CLR4_5_23yz3yzm68iygcm.R.flushNeeded();}}

    /**
     * Returns <code>true</code> if palette entries will be decoded as
     * shorts, resulting in an output image with short datatype.
     */
    public boolean getDecodePaletteAsShorts() {try{__CLR4_5_23yz3yzm68iygcm.R.inc(5150);
        __CLR4_5_23yz3yzm68iygcm.R.inc(5151);return decodePaletteAsShorts;
    }finally{__CLR4_5_23yz3yzm68iygcm.R.flushNeeded();}}

    /**
     * Returns an unsigned 8 bit value computed by dithering the unsigned
     * 16 bit value. Note that the TIFF specified short datatype is an
     * unsigned value, while Java's <code>short</code> datatype is a
     * signed value. Therefore the Java <code>short</code> datatype cannot
     * be used to store the TIFF specified short value. A Java
     * <code>int</code> is used as input instead to this method. The method
     * deals correctly only with 16 bit unsigned values.
     */
    public byte decode16BitsTo8Bits(int s) {try{__CLR4_5_23yz3yzm68iygcm.R.inc(5152);
        __CLR4_5_23yz3yzm68iygcm.R.inc(5153);return (byte)((s >> 8) & 0xffff);
    }finally{__CLR4_5_23yz3yzm68iygcm.R.flushNeeded();}}

    /**
     * Returns an unsigned 8 bit value computed by dithering the signed
     * 16 bit value. This method deals correctly only with values in the
     * 16 bit signed range.
     */
    public byte decodeSigned16BitsTo8Bits(short s) {try{__CLR4_5_23yz3yzm68iygcm.R.inc(5154);
        __CLR4_5_23yz3yzm68iygcm.R.inc(5155);return (byte)((s + Short.MIN_VALUE) >> 8);
    }finally{__CLR4_5_23yz3yzm68iygcm.R.flushNeeded();}}

    /**
     * Sets the offset in the stream from which to read the image.  There
     * must be an Image File Directory (IFD) at that position or an error
     * will occur.  If <code>setIFDOffset()</code> is never invoked then
     * the decoder will assume that the TIFF stream is at the beginning of
     * the 8-byte image header.  If the directory offset is set and a page
     * number is supplied to the TIFF <code>ImageDecoder</code> then the
     * page will be the zero-relative index of the IFD in linked list of
     * IFDs beginning at the specified offset with a page of zero indicating
     * the directory at that offset.
     */
    public void setIFDOffset(long offset) {try{__CLR4_5_23yz3yzm68iygcm.R.inc(5156);
        __CLR4_5_23yz3yzm68iygcm.R.inc(5157);ifdOffset = offset;
    }finally{__CLR4_5_23yz3yzm68iygcm.R.flushNeeded();}}

    /**
     * Returns the value set by <code>setIFDOffset()</code> or
     * <code>null</code> if no value has been set.
     */
    public Long getIFDOffset() {try{__CLR4_5_23yz3yzm68iygcm.R.inc(5158);
        __CLR4_5_23yz3yzm68iygcm.R.inc(5159);return ifdOffset;
    }finally{__CLR4_5_23yz3yzm68iygcm.R.flushNeeded();}}

    /**
     * Sets a flag indicating whether to convert JPEG-compressed YCbCr data
     * to RGB.  The default value is <code>true</code>.  This flag is
     * ignored if the image data are not JPEG-compressed.
     */
    public void setJPEGDecompressYCbCrToRGB(boolean convertJPEGYCbCrToRGB) {try{__CLR4_5_23yz3yzm68iygcm.R.inc(5160);
        __CLR4_5_23yz3yzm68iygcm.R.inc(5161);this.convertJPEGYCbCrToRGB = convertJPEGYCbCrToRGB;
    }finally{__CLR4_5_23yz3yzm68iygcm.R.flushNeeded();}}

    /**
     * Whether JPEG-compressed YCbCr data will be converted to RGB.
     */
    public boolean getJPEGDecompressYCbCrToRGB() {try{__CLR4_5_23yz3yzm68iygcm.R.inc(5162);
        __CLR4_5_23yz3yzm68iygcm.R.inc(5163);return convertJPEGYCbCrToRGB;
    }finally{__CLR4_5_23yz3yzm68iygcm.R.flushNeeded();}}
}
