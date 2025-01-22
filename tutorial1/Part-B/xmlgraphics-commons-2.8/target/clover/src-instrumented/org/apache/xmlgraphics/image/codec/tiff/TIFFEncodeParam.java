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

/* $Id: TIFFEncodeParam.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.tiff;

import java.util.Iterator;
import java.util.zip.Deflater;

import org.apache.xmlgraphics.image.codec.util.ImageEncodeParam;
import org.apache.xmlgraphics.image.codec.util.PropertyUtil;

/**
 * An instance of <code>ImageEncodeParam</code> for encoding images in
 * the TIFF format.
 *
 * <p> This class allows for the specification of encoding parameters. By
 * default, the image is encoded without any compression, and is written
 * out consisting of strips, not tiles. The particular compression scheme
 * to be used can be specified by using the <code>setCompression()</code>
 * method. The compression scheme specified will be honored only if it is
 * compatible with the type of image being written out. For example,
 * Group3 and Group4 compressions can only be used with Bilevel images.
 * Writing of tiled TIFF images can be enabled by calling the
 * <code>setWriteTiled()</code> method.
 *
 * <p><b> This class is not a committed part of the JAI API.  It may
 * be removed or changed in future releases of JAI.</b>
 *
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TIFFEncodeParam implements ImageEncodeParam {public static class __CLR4_5_247x47xm68iygem{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,5516,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 2471949735040024055L;
    private CompressionValue compression = CompressionValue.NONE;

    private boolean writeTiled;
    private int tileWidth;
    private int tileHeight;

    private Iterator extraImages;

    private TIFFField[] extraFields;

    private boolean convertJPEGRGBToYCbCr = true;

    private int deflateLevel = Deflater.DEFAULT_COMPRESSION;

    /**
     * Constructs a TIFFEncodeParam object with default values for
     * all parameters.
     */
    public TIFFEncodeParam() {try{__CLR4_5_247x47xm68iygem.R.inc(5469);
        //nop
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /** Returns the value of the compression parameter. */
    public CompressionValue getCompression() {try{__CLR4_5_247x47xm68iygem.R.inc(5470);
        __CLR4_5_247x47xm68iygem.R.inc(5471);return compression;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Specifies the type of compression to be used.  The compression type
     * specified will be honored only if it is compatible with the image
     * being written out.  Currently only PackBits, JPEG, and DEFLATE
     * compression schemes are supported.
     *
     * <p> If <code>compression</code> is set to any value but
     * <code>COMPRESSION_NONE</code> and the <code>OutputStream</code>
     * supplied to the <code>ImageEncoder</code> is not a
     * <code>SeekableOutputStream</code>, then the encoder will use either
     * a temporary file or a memory cache when compressing the data
     * depending on whether the file system is accessible.  Compression
     * will therefore be more efficient if a <code>SeekableOutputStream</code>
     * is supplied.
     *
     * @param compression    The compression type.
     */
    public void setCompression(CompressionValue compression) {try{__CLR4_5_247x47xm68iygem.R.inc(5472);

        boolean __CLB4_5_2_bool0=false;__CLR4_5_247x47xm68iygem.R.inc(5473);switch(compression) {
        case NONE:if (!__CLB4_5_2_bool0) {__CLR4_5_247x47xm68iygem.R.inc(5474);__CLB4_5_2_bool0=true;}
        case PACKBITS:if (!__CLB4_5_2_bool0) {__CLR4_5_247x47xm68iygem.R.inc(5475);__CLB4_5_2_bool0=true;}
        case DEFLATE:if (!__CLB4_5_2_bool0) {__CLR4_5_247x47xm68iygem.R.inc(5476);__CLB4_5_2_bool0=true;}
            // Do nothing.
            __CLR4_5_247x47xm68iygem.R.inc(5477);break;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_247x47xm68iygem.R.inc(5478);__CLB4_5_2_bool0=true;}
            __CLR4_5_247x47xm68iygem.R.inc(5479);throw new RuntimeException(PropertyUtil.getString("TIFFEncodeParam0"));
        }

        __CLR4_5_247x47xm68iygem.R.inc(5480);this.compression = compression;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Returns the value of the writeTiled parameter.
     */
    public boolean getWriteTiled() {try{__CLR4_5_247x47xm68iygem.R.inc(5481);
        __CLR4_5_247x47xm68iygem.R.inc(5482);return writeTiled;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * If set, the data will be written out in tiled format, instead of
     * in strips.
     *
     * @param writeTiled     Specifies whether the image data should be
     *                       wriiten out in tiled format.
     */
    public void setWriteTiled(boolean writeTiled) {try{__CLR4_5_247x47xm68iygem.R.inc(5483);
        __CLR4_5_247x47xm68iygem.R.inc(5484);this.writeTiled = writeTiled;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Sets the dimensions of the tiles to be written.  If either
     * value is non-positive, the encoder will use a default value.
     *
     * <p> If the data are being written as tiles, i.e.,
     * <code>getWriteTiled()</code> returns <code>true</code>, then the
     * default tile dimensions used by the encoder are those of the tiles
     * of the image being encoded.
     *
     * <p> If the data are being written as strips, i.e.,
     * <code>getWriteTiled()</code> returns <code>false</code>, the width
     * of each strip is always the width of the image and the default
     * number of rows per strip is 8.
     *
     * @param tileWidth The tile width; ignored if strips are used.
     * @param tileHeight The tile height or number of rows per strip.
     */
    public void setTileSize(int tileWidth, int tileHeight) {try{__CLR4_5_247x47xm68iygem.R.inc(5485);
        __CLR4_5_247x47xm68iygem.R.inc(5486);this.tileWidth = tileWidth;
        __CLR4_5_247x47xm68iygem.R.inc(5487);this.tileHeight = tileHeight;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Retrieves the tile width set via <code>setTileSize()</code>.
     */
    public int getTileWidth() {try{__CLR4_5_247x47xm68iygem.R.inc(5488);
        __CLR4_5_247x47xm68iygem.R.inc(5489);return tileWidth;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Retrieves the tile height set via <code>setTileSize()</code>.
     */
    public int getTileHeight() {try{__CLR4_5_247x47xm68iygem.R.inc(5490);
        __CLR4_5_247x47xm68iygem.R.inc(5491);return tileHeight;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Sets an <code>Iterator</code> of additional images to be written
     * after the image passed as an argument to the <code>ImageEncoder</code>.
     * The methods on the supplied <code>Iterator</code> must only be invoked
     * by the <code>ImageEncoder</code> which will exhaust the available
     * values unless an error occurs.
     *
     * <p> The value returned by an invocation of <code>next()</code> on the
     * <code>Iterator</code> must return either a <code>RenderedImage</code>
     * or an <code>Object[]</code> of length 2 wherein the element at index
     * zero is a <code>RenderedImage</code> amd the other element is a
     * <code>TIFFEncodeParam</code>.  If no <code>TIFFEncodeParam</code> is
     * supplied in this manner for an additional image, the parameters used
     * to create the <code>ImageEncoder</code> will be used.  The extra
     * image <code>Iterator</code> set on any <code>TIFFEncodeParam</code>
     * of an additional image will in all cases be ignored.
     */
    public synchronized void setExtraImages(Iterator extraImages) {try{__CLR4_5_247x47xm68iygem.R.inc(5492);
        __CLR4_5_247x47xm68iygem.R.inc(5493);this.extraImages = extraImages;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Returns the additional image <code>Iterator</code> specified via
     * <code>setExtraImages()</code> or <code>null</code> if none was
     * supplied or if a <code>null</code> value was supplied.
     */
    public synchronized Iterator getExtraImages() {try{__CLR4_5_247x47xm68iygem.R.inc(5494);
        __CLR4_5_247x47xm68iygem.R.inc(5495);return extraImages;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Sets the compression level for DEFLATE-compressed data which should
     * either be <code>java.util.Deflater.DEFAULT_COMPRESSION</code> or a
     * value in the range [1,9] where larger values indicate more compression.
     * The default setting is <code>Deflater.DEFAULT_COMPRESSION</code>.  This
     * setting is ignored if the compression type is not DEFLATE.
     */
    public void setDeflateLevel(int deflateLevel) {try{__CLR4_5_247x47xm68iygem.R.inc(5496);
        __CLR4_5_247x47xm68iygem.R.inc(5497);if ((((deflateLevel != Deflater.DEFAULT_COMPRESSION)&&(__CLR4_5_247x47xm68iygem.R.iget(5498)!=0|true))||(__CLR4_5_247x47xm68iygem.R.iget(5499)==0&false))) {{
            __CLR4_5_247x47xm68iygem.R.inc(5500);throw new RuntimeException(PropertyUtil.getString("TIFFEncodeParam1"));
        }

        }__CLR4_5_247x47xm68iygem.R.inc(5501);this.deflateLevel = deflateLevel;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Gets the compression level for DEFLATE compression.
     */
    public int getDeflateLevel() {try{__CLR4_5_247x47xm68iygem.R.inc(5502);
        __CLR4_5_247x47xm68iygem.R.inc(5503);return deflateLevel;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Sets flag indicating whether to convert RGB data to YCbCr when the
     * compression type is JPEG.  The default value is <code>true</code>.
     * This flag is ignored if the compression type is not JPEG.
     */
    public void setJPEGCompressRGBToYCbCr(boolean convertJPEGRGBToYCbCr) {try{__CLR4_5_247x47xm68iygem.R.inc(5504);
        __CLR4_5_247x47xm68iygem.R.inc(5505);this.convertJPEGRGBToYCbCr = convertJPEGRGBToYCbCr;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Whether RGB data will be converted to YCbCr when using JPEG compression.
     */
    public boolean getJPEGCompressRGBToYCbCr() {try{__CLR4_5_247x47xm68iygem.R.inc(5506);
        __CLR4_5_247x47xm68iygem.R.inc(5507);return convertJPEGRGBToYCbCr;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Sets an array of extra fields to be written to the TIFF Image File
     * Directory (IFD).  Fields with tags equal to the tag of any
     * automatically generated fields are ignored.  No error checking is
     * performed with respect to the validity of the field contents or
     * the appropriateness of the field for the image being encoded.
     *
     * @param extraFields An array of extra fields; the parameter is
     * copied by reference.
     */
    public void setExtraFields(TIFFField[] extraFields) {try{__CLR4_5_247x47xm68iygem.R.inc(5508);
        __CLR4_5_247x47xm68iygem.R.inc(5509);this.extraFields = extraFields;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}

    /**
     * Returns the value set by <code>setExtraFields()</code>.
     */
    public TIFFField[] getExtraFields() {try{__CLR4_5_247x47xm68iygem.R.inc(5510);
        __CLR4_5_247x47xm68iygem.R.inc(5511);if ((((extraFields == null)&&(__CLR4_5_247x47xm68iygem.R.iget(5512)!=0|true))||(__CLR4_5_247x47xm68iygem.R.iget(5513)==0&false))) {{
            __CLR4_5_247x47xm68iygem.R.inc(5514);return new TIFFField[0];
        }
        }__CLR4_5_247x47xm68iygem.R.inc(5515);return extraFields;
    }finally{__CLR4_5_247x47xm68iygem.R.flushNeeded();}}
}
