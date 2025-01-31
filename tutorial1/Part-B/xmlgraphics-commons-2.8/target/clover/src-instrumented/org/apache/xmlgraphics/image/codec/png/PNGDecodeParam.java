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

/* $Id: PNGDecodeParam.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.png;

import org.apache.xmlgraphics.image.codec.util.ImageDecodeParam;
import org.apache.xmlgraphics.image.codec.util.PropertyUtil;

// CSOFF: WhitespaceAround

/**
 * An instance of <code>ImageDecodeParam</code> for decoding images in
 * the PNG format.
 *
 * <code>PNGDecodeParam</code> allows several aspects of the decoding
 * process for PNG images to be controlled.  By default, decoding produces
 * output images with the following properties:
 *
 * <p> Images with a bit depth of 8 or less use a
 * <code>DataBufferByte</code> to hold the pixel data.  16-bit images
 * use a <code>DataBufferUShort</code>.
 *
 * <p> Palette color images and non-transparent grayscale images with
 * bit depths of 1, 2, or 4 will have a
 * <code>MultiPixelPackedSampleModel</code> and an
 * <code>IndexColorModel</code>.  For palette color images, the
 * <code>ColorModel</code> palette contains the red, green, blue, and
 * optionally alpha palette information.  For grayscale images, the
 * palette is used to expand the pixel data to cover the range 0-255.
 * The pixels are stored packed 8, 4, or 2 to the byte.
 *
 * <p> All other images are stored using a
 * <code>PixelInterleavedSampleModel</code> with each sample of a pixel
 * occupying its own <code>byte</code> or <code>short</code> within
 * the <code>DataBuffer</code>.  A <code>ComponentColorModel</code> is
 * used which simply extracts the red, green, blue, gray, and/or alpha
 * information from separate <code>DataBuffer</code> entries.
 *
 * <p> Five aspects of this process may be altered by means of methods
 * in this class.
 *
 * <p> <code>setSuppressAlpha()</code> prevents an alpha channel
 * from appearing in the output.
 *
 * <p> <code>setExpandPalette()</code> turns palette-color images into
 * 3-or 4-channel full-color images.
 *
 * <p> <code>setOutput8BitGray()</code> causes 1, 2, or 4 bit
 * grayscale images to be output in 8-bit form, using a
 * <code>ComponentSampleModel</code> and
 * <code>ComponentColorModel</code>.
 *
 * <p> <code>setDecodingExponent()</code> causes the output image to be
 * gamma-corrected using a supplied output gamma value.
 *
 * <p> <code>setExpandGrayAlpha()</code> causes 2-channel gray/alpha
 * (GA) images to be output as full-color (GGGA) images, which may
 * simplify further processing and display.
 *
 * <p><b> This class is not a committed part of the JAI API.  It may
 * be removed or changed in future releases of JAI.</b>
 */
public class PNGDecodeParam implements ImageDecodeParam {public static class __CLR4_5_2swswm6lb4xmw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,1085,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 3957265194926624623L;

    /**
     * Constructs a default instance of <code>PNGDecodeParam</code>.
     */
    public PNGDecodeParam() {try{__CLR4_5_2swswm6lb4xmw.R.inc(1040); }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    private boolean suppressAlpha;

    /**
     * Returns <code>true</code> if alpha (transparency) will
     * be prevented from appearing in the output.
     */
    public boolean getSuppressAlpha() {try{__CLR4_5_2swswm6lb4xmw.R.inc(1041);
        __CLR4_5_2swswm6lb4xmw.R.inc(1042);return suppressAlpha;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    /**
     * If set, no alpha (transparency) channel will appear in the
     * output image.
     *
     * <p> The default is to allow transparency to appear in the
     * output image.
     */
    public void setSuppressAlpha(boolean suppressAlpha) {try{__CLR4_5_2swswm6lb4xmw.R.inc(1043);
        __CLR4_5_2swswm6lb4xmw.R.inc(1044);this.suppressAlpha = suppressAlpha;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    private boolean expandPalette;

    /**
     * Returns true if palette-color images will be expanded to
     * produce full-color output.
     */
    public boolean getExpandPalette() {try{__CLR4_5_2swswm6lb4xmw.R.inc(1045);
        __CLR4_5_2swswm6lb4xmw.R.inc(1046);return expandPalette;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    /**
     * If set, palette color images (PNG color type 3) will
     * be decoded into full-color (RGB) output images.  The output
     * image may have 3 or 4 channels, depending on the presence of
     * transparency information.
     *
     * <p> The default is to output palette images using a single
     * channel.  The palette information is used to construct the
     * output image's <code>ColorModel</code>.
     */
    public void setExpandPalette(boolean expandPalette) {try{__CLR4_5_2swswm6lb4xmw.R.inc(1047);
        __CLR4_5_2swswm6lb4xmw.R.inc(1048);this.expandPalette = expandPalette;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    private boolean output8BitGray;

    /**
     * Returns the current value of the 8-bit gray output parameter.
     */
    public boolean getOutput8BitGray() {try{__CLR4_5_2swswm6lb4xmw.R.inc(1049);
        __CLR4_5_2swswm6lb4xmw.R.inc(1050);return output8BitGray;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    /**
     * If set, grayscale images with a bit depth less than 8
     * (1, 2, or 4) will be output in 8 bit form.  The output values
     * will occupy the full 8-bit range.  For example, gray values
     * 0, 1, 2, and 3 of a 2-bit image will be output as
     * 0, 85, 170, and 255.
     *
     * <p> The decoding of non-grayscale images and grayscale images
     * with a bit depth of 8 or 16 are unaffected by this setting.
     *
     * <p> The default is not to perform expansion.  Grayscale images
     * with a depth of 1, 2, or 4 bits will be represented using
     * a <code>MultiPixelPackedSampleModel</code> and an
     * <code>IndexColorModel</code>.
     */
    public void setOutput8BitGray(boolean output8BitGray) {try{__CLR4_5_2swswm6lb4xmw.R.inc(1051);
        __CLR4_5_2swswm6lb4xmw.R.inc(1052);this.output8BitGray = output8BitGray;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    private boolean performGammaCorrection = true;

    /**
     * Returns <code>true</code> if gamma correction is to be performed
     * on the image data.  The default is <code>true</code>.
     *
     * <p> If gamma correction is to be performed, the
     * <code>getUserExponent()</code> and
     * <code>getDisplayExponent()</code> methods are used in addition to
     * the gamma value stored within the file (or the default value of
     * 1/2.2 used if no value is found) to produce a single exponent
     * using the formula:
     * <pre>
     * decoding_exponent = user_exponent/(gamma_from_file * display_exponent)
     * </pre>
     */
    public boolean getPerformGammaCorrection() {try{__CLR4_5_2swswm6lb4xmw.R.inc(1053);
        __CLR4_5_2swswm6lb4xmw.R.inc(1054);return performGammaCorrection;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    /**
     * Turns gamma corection of the image data on or off.
     */
    public void setPerformGammaCorrection(boolean performGammaCorrection) {try{__CLR4_5_2swswm6lb4xmw.R.inc(1055);
        __CLR4_5_2swswm6lb4xmw.R.inc(1056);this.performGammaCorrection = performGammaCorrection;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    private float userExponent = 1.0F;

    /**
     * Returns the current value of the user exponent parameter.
     * By default, the user exponent is equal to 1.0F.
     */
    public float getUserExponent() {try{__CLR4_5_2swswm6lb4xmw.R.inc(1057);
        __CLR4_5_2swswm6lb4xmw.R.inc(1058);return userExponent;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    /**
     * Sets the user exponent to a given value.  The exponent
     * must be positive.  If not, an
     * <code>IllegalArgumentException</code> will be thrown.
     *
     * <p> The output image pixels will be placed through a transformation
     * of the form:
     *
     * <pre>
     * sample = integer_sample / (2^bitdepth - 1.0)
     * decoding_exponent = user_exponent/(gamma_from_file * display_exponent)
     * output = sample ^ decoding_exponent
     * </pre>
     *
     * where <code>gamma_from_file</code> is the gamma of the file
     * data, as determined by the <code>gAMA</code>, <code>sRGB</code>,
     * and/or <code>iCCP</code> chunks, and <code>display_exponent</code>
     * is the exponent of the intrinsic transfer curve of the display,
     * generally 2.2.
     *
     * <p> Input files which do not specify any gamma are assumed to
     * have a gamma of <code>1/2.2</code>; such images may be displayed
     * on a CRT with an exponent of 2.2 using the default user
     * exponent of 1.0.
     *
     * <p> The user exponent may be used in order to change the
     * effective gamma of a file.  If a file has a stored gamma of
     * X, but the decoder believes that the true file gamma is Y,
     * setting a user exponent of Y/X will produce the same result
     * as changing the file gamma.
     *
     * <p> This parameter affects the decoding of all image types.
     *
     * @throws IllegalArgumentException if <code>userExponent</code> is
     * negative.
     */
    public void setUserExponent(float userExponent) {try{__CLR4_5_2swswm6lb4xmw.R.inc(1059);
        __CLR4_5_2swswm6lb4xmw.R.inc(1060);if ((((userExponent <= 0.0F)&&(__CLR4_5_2swswm6lb4xmw.R.iget(1061)!=0|true))||(__CLR4_5_2swswm6lb4xmw.R.iget(1062)==0&false))) {{
            __CLR4_5_2swswm6lb4xmw.R.inc(1063);throw new IllegalArgumentException(PropertyUtil.getString("PNGDecodeParam0"));
        }
        }__CLR4_5_2swswm6lb4xmw.R.inc(1064);this.userExponent = userExponent;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    private float displayExponent = 2.2F;

    /**
     * Returns the current value of the display exponent parameter.
     * By default, the display exponent is equal to 2.2F.
     */
    public float getDisplayExponent() {try{__CLR4_5_2swswm6lb4xmw.R.inc(1065);
        __CLR4_5_2swswm6lb4xmw.R.inc(1066);return displayExponent;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    /**
     * Sets the display exponent to a given value.  The exponent
     * must be positive.  If not, an
     * <code>IllegalArgumentException</code> will be thrown.
     *
     * <p> The output image pixels will be placed through a transformation
     * of the form:
     *
     * <pre>
     * sample = integer_sample / (2^bitdepth - 1.0)
     * decoding_exponent = user_exponent/(gamma_from_file * display_exponent)
     * output = sample ^ decoding_exponent
     * </pre>
     *
     * where <code>gamma_from_file</code> is the gamma of the file
     * data, as determined by the <code>gAMA</code>, <code>sRGB</code>,
     * and/or <code>iCCP</code> chunks, and <code>user_exponent</code>
     * is an additional user-supplied parameter.
     *
     * <p> Input files which do not specify any gamma are assumed to
     * have a gamma of <code>1/2.2</code>; such images should be
     * decoding using the default display exponent of 2.2.
     *
     * <p> If an image is to be processed further before being displayed,
     * it may be preferable to set the display exponent to 1.0 in order
     * to produce a linear output image.
     *
     * <p> This parameter affects the decoding of all image types.
     *
     * @throws IllegalArgumentException if <code>userExponent</code> is
     * negative.
     */
    public void setDisplayExponent(float displayExponent) {try{__CLR4_5_2swswm6lb4xmw.R.inc(1067);
        __CLR4_5_2swswm6lb4xmw.R.inc(1068);if ((((displayExponent <= 0.0F)&&(__CLR4_5_2swswm6lb4xmw.R.iget(1069)!=0|true))||(__CLR4_5_2swswm6lb4xmw.R.iget(1070)==0&false))) {{
            __CLR4_5_2swswm6lb4xmw.R.inc(1071);throw new IllegalArgumentException(PropertyUtil.getString("PNGDecodeParam1"));
        }
        }__CLR4_5_2swswm6lb4xmw.R.inc(1072);this.displayExponent = displayExponent;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    private boolean expandGrayAlpha;

    /**
     * Returns the current setting of the gray/alpha expansion.
     */
    public boolean getExpandGrayAlpha() {try{__CLR4_5_2swswm6lb4xmw.R.inc(1073);
        __CLR4_5_2swswm6lb4xmw.R.inc(1074);return expandGrayAlpha;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    /**
     * If set, images containing one channel of gray and one channel of
     * alpha (GA) will be output in a 4-channel format (GGGA).  This
     * produces output that may be simpler to process and display.
     *
     * <p> This setting affects both images of color type 4 (explicit
     * alpha) and images of color type 0 (grayscale) that contain
     * transparency information.
     *
     * <p> By default, no expansion is performed.
     */
    public void setExpandGrayAlpha(boolean expandGrayAlpha) {try{__CLR4_5_2swswm6lb4xmw.R.inc(1075);
        __CLR4_5_2swswm6lb4xmw.R.inc(1076);this.expandGrayAlpha = expandGrayAlpha;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    private boolean generateEncodeParam;

    private PNGEncodeParam encodeParam;

    /**
     * Returns <code>true</code> if an instance of
     * <code>PNGEncodeParam</code> will be available after an image
     * has been decoded via the <code>getEncodeParam</code> method.
     */
    public boolean getGenerateEncodeParam() {try{__CLR4_5_2swswm6lb4xmw.R.inc(1077);
        __CLR4_5_2swswm6lb4xmw.R.inc(1078);return generateEncodeParam;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    /**
     * If set, an instance of <code>PNGEncodeParam</code> will be
     * available after an image has been decoded via the
     * <code>getEncodeParam</code> method that encapsulates information
     * about the contents of the PNG file.  If not set, this information
     * will not be recorded and <code>getEncodeParam()</code> will
     * return <code>null</code>.
     */
    public void setGenerateEncodeParam(boolean generateEncodeParam) {try{__CLR4_5_2swswm6lb4xmw.R.inc(1079);
        __CLR4_5_2swswm6lb4xmw.R.inc(1080);this.generateEncodeParam = generateEncodeParam;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    /**
     * If <code>getGenerateEncodeParam()</code> is <code>true</code>,
     * this method may be called after decoding has completed, and
     * will return an instance of <code>PNGEncodeParam</code> containing
     * information about the contents of the PNG file just decoded.
     */
    public PNGEncodeParam getEncodeParam() {try{__CLR4_5_2swswm6lb4xmw.R.inc(1081);
        __CLR4_5_2swswm6lb4xmw.R.inc(1082);return encodeParam;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}

    /**
     * Sets the current encoder param instance.  This method is
     * intended to be called by the PNG decoder and will overwrite the
     * current instance returned by <code>getEncodeParam</code>.
     */
    public void setEncodeParam(PNGEncodeParam encodeParam) {try{__CLR4_5_2swswm6lb4xmw.R.inc(1083);
        __CLR4_5_2swswm6lb4xmw.R.inc(1084);this.encodeParam = encodeParam;
    }finally{__CLR4_5_2swswm6lb4xmw.R.flushNeeded();}}
}
