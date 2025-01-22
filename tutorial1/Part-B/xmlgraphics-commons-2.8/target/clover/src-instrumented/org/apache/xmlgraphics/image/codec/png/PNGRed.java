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

/* $Id: PNGRed.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.png;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferUShort;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

import org.apache.xmlgraphics.image.GraphicsUtil;
import org.apache.xmlgraphics.image.codec.util.PropertyUtil;
import org.apache.xmlgraphics.image.rendered.AbstractRed;
import org.apache.xmlgraphics.image.rendered.CachableRed;

// CSOFF: ConstantName
// CSOFF: InnerAssignment
// CSOFF: MethodName
// CSOFF: MissingSwitchDefault
// CSOFF: MultipleVariableDeclarations
// CSOFF: NoWhitespaceAfter
// CSOFF: OperatorWrap
// CSOFF: WhitespaceAround

/**
 * @version $Id: PNGRed.java 1732018 2016-02-24 04:51:06Z gadams $
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PNGRed extends AbstractRed {public static class __CLR4_5_22sw2swm68iygad{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,4945,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static class PNGChunk {
        int length;
        int type;
        byte[] data;

        String typeString;

        public PNGChunk(int length, int type, byte[] data, int crc) {try{__CLR4_5_22sw2swm68iygad.R.inc(3632);
            __CLR4_5_22sw2swm68iygad.R.inc(3633);this.length = length;
            __CLR4_5_22sw2swm68iygad.R.inc(3634);this.type = type;
            __CLR4_5_22sw2swm68iygad.R.inc(3635);this.data = data;

            __CLR4_5_22sw2swm68iygad.R.inc(3636);typeString = "";
            __CLR4_5_22sw2swm68iygad.R.inc(3637);typeString += (char)(type >> 24);
            __CLR4_5_22sw2swm68iygad.R.inc(3638);typeString += (char)((type >> 16) & 0xff);
            __CLR4_5_22sw2swm68iygad.R.inc(3639);typeString += (char)((type >> 8) & 0xff);
            __CLR4_5_22sw2swm68iygad.R.inc(3640);typeString += (char)(type & 0xff);
        }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

        public int getLength() {try{__CLR4_5_22sw2swm68iygad.R.inc(3641);
            __CLR4_5_22sw2swm68iygad.R.inc(3642);return length;
        }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

        public int getType() {try{__CLR4_5_22sw2swm68iygad.R.inc(3643);
            __CLR4_5_22sw2swm68iygad.R.inc(3644);return type;
        }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

        public String getTypeString() {try{__CLR4_5_22sw2swm68iygad.R.inc(3645);
            __CLR4_5_22sw2swm68iygad.R.inc(3646);return typeString;
        }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

        public byte[] getData() {try{__CLR4_5_22sw2swm68iygad.R.inc(3647);
            __CLR4_5_22sw2swm68iygad.R.inc(3648);return data;
        }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

        public byte getByte(int offset) {try{__CLR4_5_22sw2swm68iygad.R.inc(3649);
            __CLR4_5_22sw2swm68iygad.R.inc(3650);return data[offset];
        }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

        public int getInt1(int offset) {try{__CLR4_5_22sw2swm68iygad.R.inc(3651);
            __CLR4_5_22sw2swm68iygad.R.inc(3652);return data[offset] & 0xff;
        }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

        public int getInt2(int offset) {try{__CLR4_5_22sw2swm68iygad.R.inc(3653);
            __CLR4_5_22sw2swm68iygad.R.inc(3654);return ((data[offset] & 0xff) << 8)
                | (data[offset + 1] & 0xff);
        }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

        public int getInt4(int offset) {try{__CLR4_5_22sw2swm68iygad.R.inc(3655);
            __CLR4_5_22sw2swm68iygad.R.inc(3656);return ((data[offset] & 0xff) << 24)
                | ((data[offset + 1] & 0xff) << 16)
                | ((data[offset + 2] & 0xff) << 8)
                | (data[offset + 3] & 0xff);
        }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

        public String getString4(int offset) {try{__CLR4_5_22sw2swm68iygad.R.inc(3657);
            __CLR4_5_22sw2swm68iygad.R.inc(3658);String s = "";
            __CLR4_5_22sw2swm68iygad.R.inc(3659);s += (char)data[offset];
            __CLR4_5_22sw2swm68iygad.R.inc(3660);s += (char)data[offset + 1];
            __CLR4_5_22sw2swm68iygad.R.inc(3661);s += (char)data[offset + 2];
            __CLR4_5_22sw2swm68iygad.R.inc(3662);s += (char)data[offset + 3];
            __CLR4_5_22sw2swm68iygad.R.inc(3663);return s;
        }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

        public boolean isType(String typeName) {try{__CLR4_5_22sw2swm68iygad.R.inc(3664);
            __CLR4_5_22sw2swm68iygad.R.inc(3665);return typeString.equals(typeName);
        }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}
    }

    public static final int PNG_COLOR_GRAY = 0;
    public static final int PNG_COLOR_RGB = 2;
    public static final int PNG_COLOR_PALETTE = 3;
    public static final int PNG_COLOR_GRAY_ALPHA = 4;
    public static final int PNG_COLOR_RGB_ALPHA = 6;

    private static final String[] colorTypeNames = {
        "Grayscale", "Error", "Truecolor", "Index",
        "Grayscale with alpha", "Error", "Truecolor with alpha"
    };

    public static final int PNG_FILTER_NONE = 0;
    public static final int PNG_FILTER_SUB = 1;
    public static final int PNG_FILTER_UP = 2;
    public static final int PNG_FILTER_AVERAGE = 3;
    public static final int PNG_FILTER_PAETH = 4;

    private int[][] bandOffsets = {
        null,
        { 0 }, // G
        { 0, 1 }, // GA in GA order
        { 0, 1, 2 }, // RGB in RGB order
        { 0, 1, 2, 3 } // RGBA in RGBA order
    };

    private int bitDepth;
    private int colorType;

    private int compressionMethod;
    private int filterMethod;
    private int interlaceMethod;

    private int paletteEntries;
    private byte[] redPalette;
    private byte[] greenPalette;
    private byte[] bluePalette;
    private byte[] alphaPalette;

    private int bkgdRed;
    private int bkgdGreen;
    private int bkgdBlue;

    private int grayTransparentAlpha;
    private int redTransparentAlpha;
    private int greenTransparentAlpha;
    private int blueTransparentAlpha;

    private int maxOpacity;

    private int[] significantBits;

    // Parameter information

    // If true, the user wants destination alpha where applicable.
    private boolean suppressAlpha;

    // If true, perform palette lookup internally
    private boolean expandPalette;

    // If true, output < 8 bit gray images in 8 bit components format
    private boolean output8BitGray;

    // Create an alpha channel in the destination color model.
    private boolean outputHasAlphaPalette;

    // Perform gamma correction on the image
    private boolean performGammaCorrection;

    // Expand GA to GGGA for compatbility with Java2D
    private boolean expandGrayAlpha;

    // Produce an instance of PNGEncodeParam
    private boolean generateEncodeParam;

    // PNGDecodeParam controlling decode process
    private PNGDecodeParam decodeParam;

    // PNGEncodeParam to store file details in
    private PNGEncodeParam encodeParam;

    private boolean emitProperties = true;

    private float fileGamma = 45455 / 100000.0F;

    private float userExponent = 1.0F;

    private float displayExponent = 2.2F;

    private float[] chromaticity;

    private int sRGBRenderingIntent = -1;

    // Post-processing step implied by above parameters
    private int postProcess = POST_NONE;

    // Possible post-processing steps

    // Do nothing
    private static final int POST_NONE = 0;

    // Gamma correct only
    private static final int POST_GAMMA = 1;

    // Push gray values through grayLut to expand to 8 bits
    private static final int POST_GRAY_LUT = 2;

    // Push gray values through grayLut to expand to 8 bits, add alpha
    private static final int POST_GRAY_LUT_ADD_TRANS = 3;

    // Push palette value through R,G,B lookup tables
    private static final int POST_PALETTE_TO_RGB = 4;

    // Push palette value through R,G,B,A lookup tables
    private static final int POST_PALETTE_TO_RGBA = 5;

    // Add transparency to a given gray value (w/ optional gamma)
    private static final int POST_ADD_GRAY_TRANS = 6;

    // Add transparency to a given RGB value (w/ optional gamma)
    private static final int POST_ADD_RGB_TRANS = 7;

    // Remove the alpha channel from a gray image (w/ optional gamma)
    private static final int POST_REMOVE_GRAY_TRANS = 8;

    // Remove the alpha channel from an RGB image (w/optional gamma)
    private static final int POST_REMOVE_RGB_TRANS = 9;

    // Mask to add expansion of GA -> GGGA
    private static final int POST_EXP_MASK = 16;

    // Expand gray to G/G/G
    private static final int POST_GRAY_ALPHA_EXP =
        POST_NONE | POST_EXP_MASK;

    // Expand gray to G/G/G through a gamma lut
    private static final int POST_GAMMA_EXP =
        POST_GAMMA | POST_EXP_MASK;

    // Push gray values through grayLut to expand to 8 bits, expand, add alpha
    private static final int POST_GRAY_LUT_ADD_TRANS_EXP =
        POST_GRAY_LUT_ADD_TRANS | POST_EXP_MASK;

    // Add transparency to a given gray value, expand
    private static final int POST_ADD_GRAY_TRANS_EXP =
        POST_ADD_GRAY_TRANS | POST_EXP_MASK;

    private List<InputStream> streamVec = new ArrayList<InputStream>();
    private DataInputStream dataStream;

    private int bytesPerPixel; // number of bytes per input pixel
    private int inputBands;
    private int outputBands;

    // Number of private chunks
    private int chunkIndex;

    private List textKeys = new ArrayList();
    private List textStrings = new ArrayList();

    private List ztextKeys = new ArrayList();
    private List ztextStrings = new ArrayList();

    private WritableRaster theTile;
    private Rectangle bounds;

    /** A Hashtable containing the image properties. */
    private Map<String, Object> properties = new HashMap<String, Object>();


    private int[] gammaLut;

    private void initGammaLut(int bits) {try{__CLR4_5_22sw2swm68iygad.R.inc(3666);
        __CLR4_5_22sw2swm68iygad.R.inc(3667);double exp = (double)userExponent / (fileGamma * displayExponent);
        __CLR4_5_22sw2swm68iygad.R.inc(3668);int numSamples = 1 << bits;
        __CLR4_5_22sw2swm68iygad.R.inc(3669);int maxOutSample = ((((bits == 16) )&&(__CLR4_5_22sw2swm68iygad.R.iget(3670)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3671)==0&false))? 65535 : 255;

        __CLR4_5_22sw2swm68iygad.R.inc(3672);gammaLut = new int[numSamples];
        __CLR4_5_22sw2swm68iygad.R.inc(3673);for (int i = 0; (((i < numSamples)&&(__CLR4_5_22sw2swm68iygad.R.iget(3674)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3675)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3676);double gbright = (double)i / (numSamples - 1);
            __CLR4_5_22sw2swm68iygad.R.inc(3677);double gamma = Math.pow(gbright, exp);
            __CLR4_5_22sw2swm68iygad.R.inc(3678);int igamma = (int)(gamma * maxOutSample + 0.5);
            __CLR4_5_22sw2swm68iygad.R.inc(3679);if ((((igamma > maxOutSample)&&(__CLR4_5_22sw2swm68iygad.R.iget(3680)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3681)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3682);igamma = maxOutSample;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(3683);gammaLut[i] = igamma;
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private final byte[][] expandBits = {
        null,
        { (byte)0x00, (byte)0xff },
        { (byte)0x00, (byte)0x55, (byte)0xaa, (byte)0xff },
        null,
        { (byte)0x00, (byte)0x11, (byte)0x22, (byte)0x33,
          (byte)0x44, (byte)0x55, (byte)0x66, (byte)0x77,
          (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb,
          (byte)0xcc, (byte)0xdd, (byte)0xee, (byte)0xff }
    };

    private int[] grayLut;

    private void initGrayLut(int bits) {try{__CLR4_5_22sw2swm68iygad.R.inc(3684);
        __CLR4_5_22sw2swm68iygad.R.inc(3685);int len = 1 << bits;
        __CLR4_5_22sw2swm68iygad.R.inc(3686);grayLut = new int[len];

        __CLR4_5_22sw2swm68iygad.R.inc(3687);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(3688)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3689)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3690);System.arraycopy(gammaLut, 0, grayLut, 0, len);
        } }else {{
            __CLR4_5_22sw2swm68iygad.R.inc(3691);for (int i = 0; (((i < len)&&(__CLR4_5_22sw2swm68iygad.R.iget(3692)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3693)==0&false)); i++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3694);grayLut[i] = expandBits[bits][i];
            }
        }}
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    public PNGRed(InputStream stream) throws IOException {
        this(stream, null);__CLR4_5_22sw2swm68iygad.R.inc(3696);try{__CLR4_5_22sw2swm68iygad.R.inc(3695);
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    public PNGRed(InputStream stream, PNGDecodeParam decodeParam)
        throws IOException {try{__CLR4_5_22sw2swm68iygad.R.inc(3697);

        __CLR4_5_22sw2swm68iygad.R.inc(3698);if ((((!stream.markSupported())&&(__CLR4_5_22sw2swm68iygad.R.iget(3699)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3700)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3701);stream = new BufferedInputStream(stream);
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(3702);DataInputStream distream = new DataInputStream(stream);

        __CLR4_5_22sw2swm68iygad.R.inc(3703);if ((((decodeParam == null)&&(__CLR4_5_22sw2swm68iygad.R.iget(3704)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3705)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3706);decodeParam = new PNGDecodeParam();
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(3707);this.decodeParam = decodeParam;

        // Get parameter values
        __CLR4_5_22sw2swm68iygad.R.inc(3708);this.suppressAlpha = decodeParam.getSuppressAlpha();
        __CLR4_5_22sw2swm68iygad.R.inc(3709);this.expandPalette = decodeParam.getExpandPalette();
        __CLR4_5_22sw2swm68iygad.R.inc(3710);this.output8BitGray = decodeParam.getOutput8BitGray();
        __CLR4_5_22sw2swm68iygad.R.inc(3711);this.expandGrayAlpha = decodeParam.getExpandGrayAlpha();
        __CLR4_5_22sw2swm68iygad.R.inc(3712);if ((((decodeParam.getPerformGammaCorrection())&&(__CLR4_5_22sw2swm68iygad.R.iget(3713)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3714)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3715);this.userExponent = decodeParam.getUserExponent();
            __CLR4_5_22sw2swm68iygad.R.inc(3716);this.displayExponent = decodeParam.getDisplayExponent();
            __CLR4_5_22sw2swm68iygad.R.inc(3717);performGammaCorrection = true;
            __CLR4_5_22sw2swm68iygad.R.inc(3718);output8BitGray = true;
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(3719);this.generateEncodeParam = decodeParam.getGenerateEncodeParam();

        __CLR4_5_22sw2swm68iygad.R.inc(3720);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(3721)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3722)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3723);properties.put("file_type", "PNG v. 1.0");
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3724);long magic = distream.readLong();
        __CLR4_5_22sw2swm68iygad.R.inc(3725);if ((((magic != 0x89504e470d0a1a0aL)&&(__CLR4_5_22sw2swm68iygad.R.iget(3726)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3727)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3728);String msg = PropertyUtil.getString("PNGImageDecoder0");
            __CLR4_5_22sw2swm68iygad.R.inc(3729);throw new RuntimeException(msg);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3730);do {{
            __CLR4_5_22sw2swm68iygad.R.inc(3731);PNGChunk chunk;

            __CLR4_5_22sw2swm68iygad.R.inc(3732);String chunkType = getChunkType(distream);
            __CLR4_5_22sw2swm68iygad.R.inc(3733);if ((((chunkType.equals("IHDR"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3734)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3735)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3736);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3737);parse_IHDR_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3738);if ((((chunkType.equals("PLTE"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3739)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3740)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3741);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3742);parse_PLTE_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3743);if ((((chunkType.equals("IDAT"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3744)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3745)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3746);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3747);streamVec.add(new ByteArrayInputStream(chunk.getData()));
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3748);if ((((chunkType.equals("IEND"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3749)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3750)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3751);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3752);try {
                    __CLR4_5_22sw2swm68iygad.R.inc(3753);parse_IEND_chunk(chunk);
                } catch (Exception e) {
                    __CLR4_5_22sw2swm68iygad.R.inc(3754);e.printStackTrace();
                    __CLR4_5_22sw2swm68iygad.R.inc(3755);String msg = PropertyUtil.getString("PNGImageDecoder2");
                    __CLR4_5_22sw2swm68iygad.R.inc(3756);throw new RuntimeException(msg);
                }
                __CLR4_5_22sw2swm68iygad.R.inc(3757);break; // fall through to the bottom
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3758);if ((((chunkType.equals("bKGD"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3759)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3760)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3761);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3762);parse_bKGD_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3763);if ((((chunkType.equals("cHRM"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3764)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3765)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3766);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3767);parse_cHRM_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3768);if ((((chunkType.equals("gAMA"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3769)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3770)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3771);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3772);parse_gAMA_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3773);if ((((chunkType.equals("hIST"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3774)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3775)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3776);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3777);parse_hIST_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3778);if ((((chunkType.equals("iCCP"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3779)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3780)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3781);chunk = readChunk(distream);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3782);if ((((chunkType.equals("pHYs"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3783)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3784)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3785);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3786);parse_pHYs_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3787);if ((((chunkType.equals("sBIT"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3788)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3789)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3790);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3791);parse_sBIT_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3792);if ((((chunkType.equals("sRGB"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3793)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3794)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3795);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3796);parse_sRGB_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3797);if ((((chunkType.equals("tEXt"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3798)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3799)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3800);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3801);parse_tEXt_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3802);if ((((chunkType.equals("tIME"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3803)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3804)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3805);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3806);parse_tIME_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3807);if ((((chunkType.equals("tRNS"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3808)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3809)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3810);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3811);parse_tRNS_chunk(chunk);
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3812);if ((((chunkType.equals("zTXt"))&&(__CLR4_5_22sw2swm68iygad.R.iget(3813)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3814)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3815);chunk = readChunk(distream);
                __CLR4_5_22sw2swm68iygad.R.inc(3816);parse_zTXt_chunk(chunk);
            } }else {{
                __CLR4_5_22sw2swm68iygad.R.inc(3817);chunk = readChunk(distream);
                // Output the chunk data in raw form

                __CLR4_5_22sw2swm68iygad.R.inc(3818);String type = chunk.getTypeString();
                __CLR4_5_22sw2swm68iygad.R.inc(3819);byte[] data = chunk.getData();
                __CLR4_5_22sw2swm68iygad.R.inc(3820);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(3821)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3822)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(3823);encodeParam.addPrivateChunk(type, data);
                }
                }__CLR4_5_22sw2swm68iygad.R.inc(3824);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(3825)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3826)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(3827);String key = "chunk_" + chunkIndex++ + ':' + type;
                    __CLR4_5_22sw2swm68iygad.R.inc(3828);properties.put(key.toLowerCase(Locale.getDefault()), data);
                }
            }}
        }}}}}}}}}}}}}}}}} }while (true);

        // Final post-processing

        __CLR4_5_22sw2swm68iygad.R.inc(3829);if ((((significantBits == null)&&(__CLR4_5_22sw2swm68iygad.R.iget(3830)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3831)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3832);significantBits = new int[inputBands];
            __CLR4_5_22sw2swm68iygad.R.inc(3833);for (int i = 0; (((i < inputBands)&&(__CLR4_5_22sw2swm68iygad.R.iget(3834)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3835)==0&false)); i++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3836);significantBits[i] = bitDepth;
            }

            }__CLR4_5_22sw2swm68iygad.R.inc(3837);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(3838)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3839)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3840);properties.put("significant_bits", significantBits);
            }
        }}
        }__CLR4_5_22sw2swm68iygad.R.inc(3841);distream.close();
        __CLR4_5_22sw2swm68iygad.R.inc(3842);stream.close();
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private static String getChunkType(DataInputStream distream) {try{__CLR4_5_22sw2swm68iygad.R.inc(3843);
        __CLR4_5_22sw2swm68iygad.R.inc(3844);try {
            __CLR4_5_22sw2swm68iygad.R.inc(3845);distream.mark(8);
            /* int length = */ __CLR4_5_22sw2swm68iygad.R.inc(3846);distream.readInt();
            __CLR4_5_22sw2swm68iygad.R.inc(3847);int type      =    distream.readInt();
            __CLR4_5_22sw2swm68iygad.R.inc(3848);distream.reset();

            __CLR4_5_22sw2swm68iygad.R.inc(3849);String typeString = ""
                              + (char)((type >> 24) & 0xff)
                              + (char)((type >> 16) & 0xff)
                              + (char)((type >>  8) & 0xff)
                              + (char)(type        & 0xff);
            __CLR4_5_22sw2swm68iygad.R.inc(3850);return typeString;
        } catch (Exception e) {
            __CLR4_5_22sw2swm68iygad.R.inc(3851);e.printStackTrace();
            __CLR4_5_22sw2swm68iygad.R.inc(3852);return null;
        }
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private static PNGChunk readChunk(DataInputStream distream) {try{__CLR4_5_22sw2swm68iygad.R.inc(3853);
        __CLR4_5_22sw2swm68iygad.R.inc(3854);try {
            __CLR4_5_22sw2swm68iygad.R.inc(3855);int length = distream.readInt();
            __CLR4_5_22sw2swm68iygad.R.inc(3856);int type = distream.readInt();
            __CLR4_5_22sw2swm68iygad.R.inc(3857);byte[] data = new byte[length];
            __CLR4_5_22sw2swm68iygad.R.inc(3858);distream.readFully(data);
            __CLR4_5_22sw2swm68iygad.R.inc(3859);int crc = distream.readInt();

            __CLR4_5_22sw2swm68iygad.R.inc(3860);return new PNGChunk(length, type, data, crc);
        } catch (Exception e) {
            __CLR4_5_22sw2swm68iygad.R.inc(3861);e.printStackTrace();
            __CLR4_5_22sw2swm68iygad.R.inc(3862);return null;
        }
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_IHDR_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(3863);
        __CLR4_5_22sw2swm68iygad.R.inc(3864);int width  = chunk.getInt4(0);
        __CLR4_5_22sw2swm68iygad.R.inc(3865);int height = chunk.getInt4(4);

        __CLR4_5_22sw2swm68iygad.R.inc(3866);bounds = new Rectangle(0, 0, width, height);

        __CLR4_5_22sw2swm68iygad.R.inc(3867);bitDepth = chunk.getInt1(8);

        __CLR4_5_22sw2swm68iygad.R.inc(3868);int validMask = (1 << 1) | (1 << 2) | (1 << 4) | (1 << 8) | (1 << 16);
        __CLR4_5_22sw2swm68iygad.R.inc(3869);if ((((((1 << bitDepth) & validMask) == 0)&&(__CLR4_5_22sw2swm68iygad.R.iget(3870)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3871)==0&false))) {{
            // bitDepth is not one of { 1, 2, 4, 8, 16 }: Error -- bad bit depth
            __CLR4_5_22sw2swm68iygad.R.inc(3872);String msg = PropertyUtil.getString("PNGImageDecoder3");
            __CLR4_5_22sw2swm68iygad.R.inc(3873);throw new RuntimeException(msg);
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(3874);maxOpacity = (1 << bitDepth) - 1;

        __CLR4_5_22sw2swm68iygad.R.inc(3875);colorType = chunk.getInt1(9);
        __CLR4_5_22sw2swm68iygad.R.inc(3876);if (((((colorType != PNG_COLOR_GRAY)
            && (colorType != PNG_COLOR_RGB)
            && (colorType != PNG_COLOR_PALETTE)
            && (colorType != PNG_COLOR_GRAY_ALPHA)
            && (colorType != PNG_COLOR_RGB_ALPHA))&&(__CLR4_5_22sw2swm68iygad.R.iget(3877)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3878)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3879);System.out.println(PropertyUtil.getString("PNGImageDecoder4"));
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3880);if (((((colorType == PNG_COLOR_RGB) && (bitDepth < 8))&&(__CLR4_5_22sw2swm68iygad.R.iget(3881)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3882)==0&false))) {{
            // Error -- RGB images must have 8 or 16 bits
            __CLR4_5_22sw2swm68iygad.R.inc(3883);String msg = PropertyUtil.getString("PNGImageDecoder5");
            __CLR4_5_22sw2swm68iygad.R.inc(3884);throw new RuntimeException(msg);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3885);if (((((colorType == PNG_COLOR_PALETTE) && (bitDepth == 16))&&(__CLR4_5_22sw2swm68iygad.R.iget(3886)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3887)==0&false))) {{
            // Error -- palette images must have < 16 bits
            __CLR4_5_22sw2swm68iygad.R.inc(3888);String msg = PropertyUtil.getString("PNGImageDecoder6");
            __CLR4_5_22sw2swm68iygad.R.inc(3889);throw new RuntimeException(msg);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3890);if (((((colorType == PNG_COLOR_GRAY_ALPHA) && (bitDepth < 8))&&(__CLR4_5_22sw2swm68iygad.R.iget(3891)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3892)==0&false))) {{
            // Error -- gray/alpha images must have >= 8 bits
            __CLR4_5_22sw2swm68iygad.R.inc(3893);String msg = PropertyUtil.getString("PNGImageDecoder7");
            __CLR4_5_22sw2swm68iygad.R.inc(3894);throw new RuntimeException(msg);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3895);if (((((colorType == PNG_COLOR_RGB_ALPHA) && (bitDepth < 8))&&(__CLR4_5_22sw2swm68iygad.R.iget(3896)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3897)==0&false))) {{
            // Error -- RGB/alpha images must have >= 8 bits
            __CLR4_5_22sw2swm68iygad.R.inc(3898);String msg = PropertyUtil.getString("PNGImageDecoder8");
            __CLR4_5_22sw2swm68iygad.R.inc(3899);throw new RuntimeException(msg);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3900);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(3901)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3902)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3903);properties.put("color_type", colorTypeNames[colorType]);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3904);if ((((generateEncodeParam)&&(__CLR4_5_22sw2swm68iygad.R.iget(3905)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3906)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3907);if ((((colorType == PNG_COLOR_PALETTE)&&(__CLR4_5_22sw2swm68iygad.R.iget(3908)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3909)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3910);encodeParam = new PNGEncodeParam.Palette();
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3911);if ((((colorType == PNG_COLOR_GRAY
                       || colorType == PNG_COLOR_GRAY_ALPHA)&&(__CLR4_5_22sw2swm68iygad.R.iget(3912)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3913)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3914);encodeParam = new PNGEncodeParam.Gray();
            } }else {{
                __CLR4_5_22sw2swm68iygad.R.inc(3915);encodeParam = new PNGEncodeParam.RGB();
            }
            }}__CLR4_5_22sw2swm68iygad.R.inc(3916);decodeParam.setEncodeParam(encodeParam);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3917);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(3918)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3919)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3920);encodeParam.setBitDepth(bitDepth);
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(3921);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(3922)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3923)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3924);properties.put("bit_depth", bitDepth);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3925);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(3926)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3927)==0&false))) {{
            // Assume file gamma is 1/2.2 unless we get a gAMA chunk
            __CLR4_5_22sw2swm68iygad.R.inc(3928);float gamma = (1.0F / 2.2F) * (displayExponent / userExponent);
            __CLR4_5_22sw2swm68iygad.R.inc(3929);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(3930)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3931)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3932);encodeParam.setGamma(gamma);
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(3933);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(3934)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3935)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3936);properties.put("gamma", gamma);
            }
        }}

        }__CLR4_5_22sw2swm68iygad.R.inc(3937);compressionMethod = chunk.getInt1(10);
        __CLR4_5_22sw2swm68iygad.R.inc(3938);if ((((compressionMethod != 0)&&(__CLR4_5_22sw2swm68iygad.R.iget(3939)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3940)==0&false))) {{
            // Error -- only know about compression method 0
            __CLR4_5_22sw2swm68iygad.R.inc(3941);String msg = PropertyUtil.getString("PNGImageDecoder9");
            __CLR4_5_22sw2swm68iygad.R.inc(3942);throw new RuntimeException(msg);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3943);filterMethod = chunk.getInt1(11);
        __CLR4_5_22sw2swm68iygad.R.inc(3944);if ((((filterMethod != 0)&&(__CLR4_5_22sw2swm68iygad.R.iget(3945)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3946)==0&false))) {{
            // Error -- only know about filter method 0
            __CLR4_5_22sw2swm68iygad.R.inc(3947);String msg = PropertyUtil.getString("PNGImageDecoder10");
            __CLR4_5_22sw2swm68iygad.R.inc(3948);throw new RuntimeException(msg);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(3949);interlaceMethod = chunk.getInt1(12);
        __CLR4_5_22sw2swm68iygad.R.inc(3950);if ((((interlaceMethod == 0)&&(__CLR4_5_22sw2swm68iygad.R.iget(3951)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3952)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3953);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(3954)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3955)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3956);encodeParam.setInterlacing(false);
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(3957);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(3958)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3959)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3960);properties.put("interlace_method", "None");
            }
        }} }else {__CLR4_5_22sw2swm68iygad.R.inc(3961);if ((((interlaceMethod == 1)&&(__CLR4_5_22sw2swm68iygad.R.iget(3962)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3963)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(3964);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(3965)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3966)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3967);encodeParam.setInterlacing(true);
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(3968);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(3969)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3970)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3971);properties.put("interlace_method", "Adam7");
            }
        }} }else {{
            // Error -- only know about Adam7 interlacing
            __CLR4_5_22sw2swm68iygad.R.inc(3972);String msg = PropertyUtil.getString("PNGImageDecoder11");
            __CLR4_5_22sw2swm68iygad.R.inc(3973);throw new RuntimeException(msg);
        }

        }}__CLR4_5_22sw2swm68iygad.R.inc(3974);bytesPerPixel = ((((bitDepth == 16) )&&(__CLR4_5_22sw2swm68iygad.R.iget(3975)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3976)==0&false))? 2 : 1;

        boolean __CLB4_5_2_bool0=false;__CLR4_5_22sw2swm68iygad.R.inc(3977);switch (colorType) {
        case PNG_COLOR_GRAY:if (!__CLB4_5_2_bool0) {__CLR4_5_22sw2swm68iygad.R.inc(3978);__CLB4_5_2_bool0=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(3979);inputBands = 1;
            __CLR4_5_22sw2swm68iygad.R.inc(3980);outputBands = 1;

            __CLR4_5_22sw2swm68iygad.R.inc(3981);if ((((output8BitGray && (bitDepth < 8))&&(__CLR4_5_22sw2swm68iygad.R.iget(3982)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3983)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3984);postProcess = POST_GRAY_LUT;
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(3985);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(3986)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3987)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3988);postProcess = POST_GAMMA;
            } }else {{
                __CLR4_5_22sw2swm68iygad.R.inc(3989);postProcess = POST_NONE;
            }
            }}__CLR4_5_22sw2swm68iygad.R.inc(3990);break;

        case PNG_COLOR_RGB:if (!__CLB4_5_2_bool0) {__CLR4_5_22sw2swm68iygad.R.inc(3991);__CLB4_5_2_bool0=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(3992);inputBands = 3;
            __CLR4_5_22sw2swm68iygad.R.inc(3993);bytesPerPixel *= 3;
            __CLR4_5_22sw2swm68iygad.R.inc(3994);outputBands = 3;

            __CLR4_5_22sw2swm68iygad.R.inc(3995);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(3996)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(3997)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(3998);postProcess = POST_GAMMA;
            } }else {{
                __CLR4_5_22sw2swm68iygad.R.inc(3999);postProcess = POST_NONE;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4000);break;

        case PNG_COLOR_PALETTE:if (!__CLB4_5_2_bool0) {__CLR4_5_22sw2swm68iygad.R.inc(4001);__CLB4_5_2_bool0=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4002);inputBands = 1;
            __CLR4_5_22sw2swm68iygad.R.inc(4003);bytesPerPixel = 1;
            __CLR4_5_22sw2swm68iygad.R.inc(4004);outputBands = (((expandPalette )&&(__CLR4_5_22sw2swm68iygad.R.iget(4005)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4006)==0&false))? 3 : 1;

            __CLR4_5_22sw2swm68iygad.R.inc(4007);if ((((expandPalette)&&(__CLR4_5_22sw2swm68iygad.R.iget(4008)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4009)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4010);postProcess = POST_PALETTE_TO_RGB;
            } }else {{
                __CLR4_5_22sw2swm68iygad.R.inc(4011);postProcess = POST_NONE;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4012);break;

        case PNG_COLOR_GRAY_ALPHA:if (!__CLB4_5_2_bool0) {__CLR4_5_22sw2swm68iygad.R.inc(4013);__CLB4_5_2_bool0=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4014);inputBands = 2;
            __CLR4_5_22sw2swm68iygad.R.inc(4015);bytesPerPixel *= 2;

            __CLR4_5_22sw2swm68iygad.R.inc(4016);if ((((suppressAlpha)&&(__CLR4_5_22sw2swm68iygad.R.iget(4017)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4018)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4019);outputBands = 1;
                __CLR4_5_22sw2swm68iygad.R.inc(4020);postProcess = POST_REMOVE_GRAY_TRANS;
            } }else {{
                __CLR4_5_22sw2swm68iygad.R.inc(4021);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(4022)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4023)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4024);postProcess = POST_GAMMA;
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4025);postProcess = POST_NONE;
                }
                }__CLR4_5_22sw2swm68iygad.R.inc(4026);if ((((expandGrayAlpha)&&(__CLR4_5_22sw2swm68iygad.R.iget(4027)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4028)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4029);postProcess |= POST_EXP_MASK;
                    __CLR4_5_22sw2swm68iygad.R.inc(4030);outputBands = 4;
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4031);outputBands = 2;
                }
            }}
            }__CLR4_5_22sw2swm68iygad.R.inc(4032);break;

        case PNG_COLOR_RGB_ALPHA:if (!__CLB4_5_2_bool0) {__CLR4_5_22sw2swm68iygad.R.inc(4033);__CLB4_5_2_bool0=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4034);inputBands = 4;
            __CLR4_5_22sw2swm68iygad.R.inc(4035);bytesPerPixel *= 4;
            __CLR4_5_22sw2swm68iygad.R.inc(4036);outputBands = ((((!suppressAlpha) )&&(__CLR4_5_22sw2swm68iygad.R.iget(4037)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4038)==0&false))? 4 : 3;

            __CLR4_5_22sw2swm68iygad.R.inc(4039);if ((((suppressAlpha)&&(__CLR4_5_22sw2swm68iygad.R.iget(4040)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4041)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4042);postProcess = POST_REMOVE_RGB_TRANS;
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(4043);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(4044)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4045)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4046);postProcess = POST_GAMMA;
            } }else {{
                __CLR4_5_22sw2swm68iygad.R.inc(4047);postProcess = POST_NONE;
            }
            }}__CLR4_5_22sw2swm68iygad.R.inc(4048);break;
        }
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_IEND_chunk(PNGChunk chunk) throws Exception {try{__CLR4_5_22sw2swm68iygad.R.inc(4049);
        // Store text strings
        __CLR4_5_22sw2swm68iygad.R.inc(4050);int textLen = textKeys.size();
        __CLR4_5_22sw2swm68iygad.R.inc(4051);String[] textArray = new String[2 * textLen];
        __CLR4_5_22sw2swm68iygad.R.inc(4052);for (int i = 0; (((i < textLen)&&(__CLR4_5_22sw2swm68iygad.R.iget(4053)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4054)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4055);String key = (String)textKeys.get(i);
            __CLR4_5_22sw2swm68iygad.R.inc(4056);String val = (String)textStrings.get(i);
            __CLR4_5_22sw2swm68iygad.R.inc(4057);textArray[2 * i] = key;
            __CLR4_5_22sw2swm68iygad.R.inc(4058);textArray[2 * i + 1] = val;
            __CLR4_5_22sw2swm68iygad.R.inc(4059);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(4060)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4061)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4062);String uniqueKey = "text_" + i + ':' + key;
                __CLR4_5_22sw2swm68iygad.R.inc(4063);properties.put(uniqueKey.toLowerCase(Locale.getDefault()), val);
            }
        }}
        }__CLR4_5_22sw2swm68iygad.R.inc(4064);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4065)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4066)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4067);encodeParam.setText(textArray);
        }

        // Store compressed text strings
        }__CLR4_5_22sw2swm68iygad.R.inc(4068);int ztextLen = ztextKeys.size();
        __CLR4_5_22sw2swm68iygad.R.inc(4069);String[] ztextArray = new String[2 * ztextLen];
        __CLR4_5_22sw2swm68iygad.R.inc(4070);for (int i = 0; (((i < ztextLen)&&(__CLR4_5_22sw2swm68iygad.R.iget(4071)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4072)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4073);String key = (String)ztextKeys.get(i);
            __CLR4_5_22sw2swm68iygad.R.inc(4074);String val = (String)ztextStrings.get(i);
            __CLR4_5_22sw2swm68iygad.R.inc(4075);ztextArray[2 * i] = key;
            __CLR4_5_22sw2swm68iygad.R.inc(4076);ztextArray[2 * i + 1] = val;
            __CLR4_5_22sw2swm68iygad.R.inc(4077);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(4078)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4079)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4080);String uniqueKey = "ztext_" + i + ':' + key;
                __CLR4_5_22sw2swm68iygad.R.inc(4081);properties.put(uniqueKey.toLowerCase(Locale.getDefault()), val);
            }
        }}
        }__CLR4_5_22sw2swm68iygad.R.inc(4082);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4083)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4084)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4085);encodeParam.setCompressedText(ztextArray);
        }

        // Parse prior IDAT chunks
        }__CLR4_5_22sw2swm68iygad.R.inc(4086);InputStream seqStream =
            new SequenceInputStream(Collections.enumeration(streamVec));
        __CLR4_5_22sw2swm68iygad.R.inc(4087);InputStream infStream =
            new InflaterInputStream(seqStream, new Inflater());
        __CLR4_5_22sw2swm68iygad.R.inc(4088);dataStream = new DataInputStream(infStream);

        // Create an empty WritableRaster
        __CLR4_5_22sw2swm68iygad.R.inc(4089);int depth = bitDepth;
        __CLR4_5_22sw2swm68iygad.R.inc(4090);if (((((colorType == PNG_COLOR_GRAY)
            && (bitDepth < 8) && output8BitGray)&&(__CLR4_5_22sw2swm68iygad.R.iget(4091)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4092)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4093);depth = 8;
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(4094);if (((((colorType == PNG_COLOR_PALETTE) && expandPalette)&&(__CLR4_5_22sw2swm68iygad.R.iget(4095)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4096)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4097);depth = 8;
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(4098);int width  = bounds.width;
        __CLR4_5_22sw2swm68iygad.R.inc(4099);int height = bounds.height;

        __CLR4_5_22sw2swm68iygad.R.inc(4100);int bytesPerRow = (outputBands * width * depth + 7) / 8;
        __CLR4_5_22sw2swm68iygad.R.inc(4101);int scanlineStride =
            ((((depth == 16) )&&(__CLR4_5_22sw2swm68iygad.R.iget(4102)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4103)==0&false))? (bytesPerRow / 2) : bytesPerRow;

        __CLR4_5_22sw2swm68iygad.R.inc(4104);theTile = createRaster(width, height, outputBands,
                               scanlineStride,
                               depth);

        __CLR4_5_22sw2swm68iygad.R.inc(4105);if ((((performGammaCorrection && (gammaLut == null))&&(__CLR4_5_22sw2swm68iygad.R.iget(4106)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4107)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4108);initGammaLut(bitDepth);
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(4109);if (((((postProcess == POST_GRAY_LUT)
            || (postProcess == POST_GRAY_LUT_ADD_TRANS)
            || (postProcess == POST_GRAY_LUT_ADD_TRANS_EXP))&&(__CLR4_5_22sw2swm68iygad.R.iget(4110)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4111)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4112);initGrayLut(bitDepth);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(4113);decodeImage(interlaceMethod == 1);

        // Free resources associated with compressed data.
        __CLR4_5_22sw2swm68iygad.R.inc(4114);dataStream.close();
        __CLR4_5_22sw2swm68iygad.R.inc(4115);infStream.close();
        __CLR4_5_22sw2swm68iygad.R.inc(4116);seqStream.close();
        __CLR4_5_22sw2swm68iygad.R.inc(4117);streamVec = null;

        __CLR4_5_22sw2swm68iygad.R.inc(4118);SampleModel sm = theTile.getSampleModel();
        __CLR4_5_22sw2swm68iygad.R.inc(4119);ColorModel  cm;

        __CLR4_5_22sw2swm68iygad.R.inc(4120);if (((((colorType == PNG_COLOR_PALETTE) && !expandPalette)&&(__CLR4_5_22sw2swm68iygad.R.iget(4121)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4122)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4123);if ((((outputHasAlphaPalette)&&(__CLR4_5_22sw2swm68iygad.R.iget(4124)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4125)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4126);cm = new IndexColorModel(bitDepth,
                                                 paletteEntries,
                                                 redPalette,
                                                 greenPalette,
                                                 bluePalette,
                                                 alphaPalette);
            } }else {{
                __CLR4_5_22sw2swm68iygad.R.inc(4127);cm = new IndexColorModel(bitDepth,
                                                 paletteEntries,
                                                 redPalette,
                                                 greenPalette,
                                                 bluePalette);
            }
        }} }else {__CLR4_5_22sw2swm68iygad.R.inc(4128);if (((((colorType == PNG_COLOR_GRAY)
                   && (bitDepth < 8) && !output8BitGray)&&(__CLR4_5_22sw2swm68iygad.R.iget(4129)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4130)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4131);byte[] palette = expandBits[bitDepth];
            __CLR4_5_22sw2swm68iygad.R.inc(4132);cm = new IndexColorModel(bitDepth,
                                             palette.length,
                                             palette,
                                             palette,
                                             palette);
        } }else {{
            __CLR4_5_22sw2swm68iygad.R.inc(4133);cm =
                createComponentColorModel(sm);
        }

        }}__CLR4_5_22sw2swm68iygad.R.inc(4134);init((CachableRed)null, bounds, cm, sm, 0, 0, properties);
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private static final int[] GrayBits8 = { 8 };
    private static final ComponentColorModel colorModelGray8 =
        new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY),
                                GrayBits8, false, false,
                                Transparency.OPAQUE,
                                DataBuffer.TYPE_BYTE);

    private static final int[] GrayAlphaBits8 = { 8, 8 };
    private static final ComponentColorModel colorModelGrayAlpha8 =
        new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY),
                                GrayAlphaBits8, true, false,
                                Transparency.TRANSLUCENT,
                                DataBuffer.TYPE_BYTE);

    private static final int[] GrayBits16 = { 16 };
    private static final ComponentColorModel colorModelGray16 =
        new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY),
                                GrayBits16, false, false,
                                Transparency.OPAQUE,
                                DataBuffer.TYPE_USHORT);

    private static final int[] GrayAlphaBits16 = { 16, 16 };
    private static final ComponentColorModel colorModelGrayAlpha16 =
        new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY),
                                GrayAlphaBits16, true, false,
                                Transparency.TRANSLUCENT,
                                DataBuffer.TYPE_USHORT);

    private static final int[] GrayBits32 = { 32 };
    private static final ComponentColorModel colorModelGray32 =
        new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY),
                                GrayBits32, false, false,
                                Transparency.OPAQUE,
                                DataBuffer.TYPE_INT);

    private static final int[] GrayAlphaBits32 = { 32, 32 };
    private static final ComponentColorModel colorModelGrayAlpha32 =
        new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY),
                                GrayAlphaBits32, true, false,
                                Transparency.TRANSLUCENT,
                                DataBuffer.TYPE_INT);

    private static final int[] RGBBits8 = { 8, 8, 8 };
    private static final ComponentColorModel colorModelRGB8 =
      new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB),
                              RGBBits8, false, false,
                              Transparency.OPAQUE,
                              DataBuffer.TYPE_BYTE);

    private static final int[] RGBABits8 = { 8, 8, 8, 8 };
    private static final ComponentColorModel colorModelRGBA8 =
      new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB),
                              RGBABits8, true, false,
                              Transparency.TRANSLUCENT,
                              DataBuffer.TYPE_BYTE);

    private static final int[] RGBBits16 = { 16, 16, 16 };
    private static final ComponentColorModel colorModelRGB16 =
      new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB),
                              RGBBits16, false, false,
                              Transparency.OPAQUE,
                              DataBuffer.TYPE_USHORT);

    private static final int[] RGBABits16 = { 16, 16, 16, 16 };
    private static final ComponentColorModel colorModelRGBA16 =
      new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB),
                              RGBABits16, true, false,
                              Transparency.TRANSLUCENT,
                              DataBuffer.TYPE_USHORT);

    private static final int[] RGBBits32 = { 32, 32, 32 };
    private static final ComponentColorModel colorModelRGB32 =
      new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB),
                              RGBBits32, false, false,
                              Transparency.OPAQUE,
                              DataBuffer.TYPE_INT);

    private static final int[] RGBABits32 = { 32, 32, 32, 32 };
    private static final ComponentColorModel colorModelRGBA32 =
      new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB),
                              RGBABits32, true, false,
                              Transparency.TRANSLUCENT,
                              DataBuffer.TYPE_INT);
    /**
     * A convenience method to create an instance of
     * <code>ComponentColorModel</code> suitable for use with the
     * given <code>SampleModel</code>.  The <code>SampleModel</code>
     * should have a data type of <code>DataBuffer.TYPE_BYTE</code>,
     * <code>TYPE_USHORT</code>, or <code>TYPE_INT</code> and between
     * 1 and 4 bands.  Depending on the number of bands of the
     * <code>SampleModel</code>, either a gray, gray+alpha, rgb, or
     * rgb+alpha <code>ColorModel</code> is returned.
     */
    public static ColorModel createComponentColorModel(SampleModel sm) {try{__CLR4_5_22sw2swm68iygad.R.inc(4135);
        __CLR4_5_22sw2swm68iygad.R.inc(4136);int type = sm.getDataType();
        __CLR4_5_22sw2swm68iygad.R.inc(4137);int bands = sm.getNumBands();
        __CLR4_5_22sw2swm68iygad.R.inc(4138);ComponentColorModel cm = null;

        __CLR4_5_22sw2swm68iygad.R.inc(4139);if ((((type == DataBuffer.TYPE_BYTE)&&(__CLR4_5_22sw2swm68iygad.R.iget(4140)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4141)==0&false))) {{
            boolean __CLB4_5_2_bool1=false;__CLR4_5_22sw2swm68iygad.R.inc(4142);switch (bands) {
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_22sw2swm68iygad.R.inc(4143);__CLB4_5_2_bool1=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4144);cm = colorModelGray8;
                __CLR4_5_22sw2swm68iygad.R.inc(4145);break;
            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_22sw2swm68iygad.R.inc(4146);__CLB4_5_2_bool1=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4147);cm = colorModelGrayAlpha8;
                __CLR4_5_22sw2swm68iygad.R.inc(4148);break;
            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_22sw2swm68iygad.R.inc(4149);__CLB4_5_2_bool1=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4150);cm = colorModelRGB8;
                __CLR4_5_22sw2swm68iygad.R.inc(4151);break;
            case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_22sw2swm68iygad.R.inc(4152);__CLB4_5_2_bool1=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4153);cm = colorModelRGBA8;
                __CLR4_5_22sw2swm68iygad.R.inc(4154);break;
            }
        } }else {__CLR4_5_22sw2swm68iygad.R.inc(4155);if ((((type == DataBuffer.TYPE_USHORT)&&(__CLR4_5_22sw2swm68iygad.R.iget(4156)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4157)==0&false))) {{
            boolean __CLB4_5_2_bool2=false;__CLR4_5_22sw2swm68iygad.R.inc(4158);switch (bands) {
            case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_22sw2swm68iygad.R.inc(4159);__CLB4_5_2_bool2=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4160);cm = colorModelGray16;
                __CLR4_5_22sw2swm68iygad.R.inc(4161);break;
            case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_22sw2swm68iygad.R.inc(4162);__CLB4_5_2_bool2=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4163);cm = colorModelGrayAlpha16;
                __CLR4_5_22sw2swm68iygad.R.inc(4164);break;
            case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_22sw2swm68iygad.R.inc(4165);__CLB4_5_2_bool2=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4166);cm = colorModelRGB16;
                __CLR4_5_22sw2swm68iygad.R.inc(4167);break;
            case 4:if (!__CLB4_5_2_bool2) {__CLR4_5_22sw2swm68iygad.R.inc(4168);__CLB4_5_2_bool2=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4169);cm = colorModelRGBA16;
                __CLR4_5_22sw2swm68iygad.R.inc(4170);break;
            }
        } }else {__CLR4_5_22sw2swm68iygad.R.inc(4171);if ((((type == DataBuffer.TYPE_INT)&&(__CLR4_5_22sw2swm68iygad.R.iget(4172)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4173)==0&false))) {{
            boolean __CLB4_5_2_bool3=false;__CLR4_5_22sw2swm68iygad.R.inc(4174);switch (bands) {
            case 1:if (!__CLB4_5_2_bool3) {__CLR4_5_22sw2swm68iygad.R.inc(4175);__CLB4_5_2_bool3=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4176);cm = colorModelGray32;
                __CLR4_5_22sw2swm68iygad.R.inc(4177);break;
            case 2:if (!__CLB4_5_2_bool3) {__CLR4_5_22sw2swm68iygad.R.inc(4178);__CLB4_5_2_bool3=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4179);cm = colorModelGrayAlpha32;
                __CLR4_5_22sw2swm68iygad.R.inc(4180);break;
            case 3:if (!__CLB4_5_2_bool3) {__CLR4_5_22sw2swm68iygad.R.inc(4181);__CLB4_5_2_bool3=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4182);cm = colorModelRGB32;
                __CLR4_5_22sw2swm68iygad.R.inc(4183);break;
            case 4:if (!__CLB4_5_2_bool3) {__CLR4_5_22sw2swm68iygad.R.inc(4184);__CLB4_5_2_bool3=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4185);cm = colorModelRGBA32;
                __CLR4_5_22sw2swm68iygad.R.inc(4186);break;
            }
        }

        }}}__CLR4_5_22sw2swm68iygad.R.inc(4187);return cm;
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_PLTE_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4188);
        __CLR4_5_22sw2swm68iygad.R.inc(4189);paletteEntries = chunk.getLength() / 3;
        __CLR4_5_22sw2swm68iygad.R.inc(4190);redPalette = new byte[paletteEntries];
        __CLR4_5_22sw2swm68iygad.R.inc(4191);greenPalette = new byte[paletteEntries];
        __CLR4_5_22sw2swm68iygad.R.inc(4192);bluePalette = new byte[paletteEntries];

        __CLR4_5_22sw2swm68iygad.R.inc(4193);int pltIndex = 0;

        // gAMA chunk must precede PLTE chunk
        __CLR4_5_22sw2swm68iygad.R.inc(4194);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(4195)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4196)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4197);if ((((gammaLut == null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4198)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4199)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4200);initGammaLut((((bitDepth == 16 )&&(__CLR4_5_22sw2swm68iygad.R.iget(4201)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4202)==0&false))? 16 : 8);
            }

            }__CLR4_5_22sw2swm68iygad.R.inc(4203);for (int i = 0; (((i < paletteEntries)&&(__CLR4_5_22sw2swm68iygad.R.iget(4204)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4205)==0&false)); i++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4206);byte r = chunk.getByte(pltIndex++);
                __CLR4_5_22sw2swm68iygad.R.inc(4207);byte g = chunk.getByte(pltIndex++);
                __CLR4_5_22sw2swm68iygad.R.inc(4208);byte b = chunk.getByte(pltIndex++);

                __CLR4_5_22sw2swm68iygad.R.inc(4209);redPalette[i]   = (byte)gammaLut[r & 0xff];
                __CLR4_5_22sw2swm68iygad.R.inc(4210);greenPalette[i] = (byte)gammaLut[g & 0xff];
                __CLR4_5_22sw2swm68iygad.R.inc(4211);bluePalette[i]  = (byte)gammaLut[b & 0xff];
            }
        }} }else {{
            __CLR4_5_22sw2swm68iygad.R.inc(4212);for (int i = 0; (((i < paletteEntries)&&(__CLR4_5_22sw2swm68iygad.R.iget(4213)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4214)==0&false)); i++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4215);redPalette[i] = chunk.getByte(pltIndex++);
                __CLR4_5_22sw2swm68iygad.R.inc(4216);greenPalette[i] = chunk.getByte(pltIndex++);
                __CLR4_5_22sw2swm68iygad.R.inc(4217);bluePalette[i] = chunk.getByte(pltIndex++);
            }
        }}
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_bKGD_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4218);
        boolean __CLB4_5_2_bool4=false;__CLR4_5_22sw2swm68iygad.R.inc(4219);switch (colorType) {
        case PNG_COLOR_PALETTE:if (!__CLB4_5_2_bool4) {__CLR4_5_22sw2swm68iygad.R.inc(4220);__CLB4_5_2_bool4=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4221);int bkgdIndex = chunk.getByte(0) & 0xff;

            __CLR4_5_22sw2swm68iygad.R.inc(4222);bkgdRed   = redPalette[bkgdIndex]   & 0xff;
            __CLR4_5_22sw2swm68iygad.R.inc(4223);bkgdGreen = greenPalette[bkgdIndex] & 0xff;
            __CLR4_5_22sw2swm68iygad.R.inc(4224);bkgdBlue  = bluePalette[bkgdIndex]  & 0xff;

            __CLR4_5_22sw2swm68iygad.R.inc(4225);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4226)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4227)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4228);((PNGEncodeParam.Palette)encodeParam).setBackgroundPaletteIndex(bkgdIndex);
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4229);break;
        case PNG_COLOR_GRAY:if (!__CLB4_5_2_bool4) {__CLR4_5_22sw2swm68iygad.R.inc(4230);__CLB4_5_2_bool4=true;} case PNG_COLOR_GRAY_ALPHA:if (!__CLB4_5_2_bool4) {__CLR4_5_22sw2swm68iygad.R.inc(4231);__CLB4_5_2_bool4=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4232);int bkgdGray = chunk.getInt2(0);
            __CLR4_5_22sw2swm68iygad.R.inc(4233);bkgdRed = bkgdGreen = bkgdBlue = bkgdGray;

            __CLR4_5_22sw2swm68iygad.R.inc(4234);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4235)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4236)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4237);((PNGEncodeParam.Gray)encodeParam).setBackgroundGray(bkgdGray);
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4238);break;
        case PNG_COLOR_RGB:if (!__CLB4_5_2_bool4) {__CLR4_5_22sw2swm68iygad.R.inc(4239);__CLB4_5_2_bool4=true;} case PNG_COLOR_RGB_ALPHA:if (!__CLB4_5_2_bool4) {__CLR4_5_22sw2swm68iygad.R.inc(4240);__CLB4_5_2_bool4=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4241);bkgdRed = chunk.getInt2(0);
            __CLR4_5_22sw2swm68iygad.R.inc(4242);bkgdGreen = chunk.getInt2(2);
            __CLR4_5_22sw2swm68iygad.R.inc(4243);bkgdBlue = chunk.getInt2(4);

            __CLR4_5_22sw2swm68iygad.R.inc(4244);int[] bkgdRGB = new int[3];
            __CLR4_5_22sw2swm68iygad.R.inc(4245);bkgdRGB[0] = bkgdRed;
            __CLR4_5_22sw2swm68iygad.R.inc(4246);bkgdRGB[1] = bkgdGreen;
            __CLR4_5_22sw2swm68iygad.R.inc(4247);bkgdRGB[2] = bkgdBlue;
            __CLR4_5_22sw2swm68iygad.R.inc(4248);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4249)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4250)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4251);((PNGEncodeParam.RGB)encodeParam).setBackgroundRGB(bkgdRGB);
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4252);break;
        }

        __CLR4_5_22sw2swm68iygad.R.inc(4253);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(4254)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4255)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4256);int r = 0;
            __CLR4_5_22sw2swm68iygad.R.inc(4257);int g = 0;
            __CLR4_5_22sw2swm68iygad.R.inc(4258);int b = 0;
            __CLR4_5_22sw2swm68iygad.R.inc(4259);if (((((colorType == PNG_COLOR_PALETTE) || (bitDepth == 8))&&(__CLR4_5_22sw2swm68iygad.R.iget(4260)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4261)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4262);r = bkgdRed;
                __CLR4_5_22sw2swm68iygad.R.inc(4263);g = bkgdGreen;
                __CLR4_5_22sw2swm68iygad.R.inc(4264);b = bkgdBlue;
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(4265);if ((((bitDepth < 8)&&(__CLR4_5_22sw2swm68iygad.R.iget(4266)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4267)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4268);r = expandBits[bitDepth][bkgdRed];
                __CLR4_5_22sw2swm68iygad.R.inc(4269);g = expandBits[bitDepth][bkgdGreen];
                __CLR4_5_22sw2swm68iygad.R.inc(4270);b = expandBits[bitDepth][bkgdBlue];
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(4271);if ((((bitDepth == 16)&&(__CLR4_5_22sw2swm68iygad.R.iget(4272)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4273)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4274);r = bkgdRed >> 8;
                __CLR4_5_22sw2swm68iygad.R.inc(4275);g = bkgdGreen >> 8;
                __CLR4_5_22sw2swm68iygad.R.inc(4276);b = bkgdBlue >> 8;
            }
            }}}__CLR4_5_22sw2swm68iygad.R.inc(4277);properties.put("background_color", new Color(r, g, b));
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_cHRM_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4278);
        // If an sRGB chunk exists, ignore cHRM chunks
        __CLR4_5_22sw2swm68iygad.R.inc(4279);if ((((sRGBRenderingIntent != -1)&&(__CLR4_5_22sw2swm68iygad.R.iget(4280)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4281)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4282);return;
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(4283);chromaticity = new float[8];
        __CLR4_5_22sw2swm68iygad.R.inc(4284);chromaticity[0] = chunk.getInt4(0) / 100000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4285);chromaticity[1] = chunk.getInt4(4) / 100000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4286);chromaticity[2] = chunk.getInt4(8) / 100000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4287);chromaticity[3] = chunk.getInt4(12) / 100000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4288);chromaticity[4] = chunk.getInt4(16) / 100000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4289);chromaticity[5] = chunk.getInt4(20) / 100000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4290);chromaticity[6] = chunk.getInt4(24) / 100000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4291);chromaticity[7] = chunk.getInt4(28) / 100000.0F;

        __CLR4_5_22sw2swm68iygad.R.inc(4292);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4293)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4294)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4295);encodeParam.setChromaticity(chromaticity);
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(4296);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(4297)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4298)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4299);properties.put("white_point_x", chromaticity[0]);
            __CLR4_5_22sw2swm68iygad.R.inc(4300);properties.put("white_point_y", chromaticity[1]);
            __CLR4_5_22sw2swm68iygad.R.inc(4301);properties.put("red_x", chromaticity[2]);
            __CLR4_5_22sw2swm68iygad.R.inc(4302);properties.put("red_y", chromaticity[3]);
            __CLR4_5_22sw2swm68iygad.R.inc(4303);properties.put("green_x", chromaticity[4]);
            __CLR4_5_22sw2swm68iygad.R.inc(4304);properties.put("green_y", chromaticity[5]);
            __CLR4_5_22sw2swm68iygad.R.inc(4305);properties.put("blue_x", chromaticity[6]);
            __CLR4_5_22sw2swm68iygad.R.inc(4306);properties.put("blue_y", chromaticity[7]);
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_gAMA_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4307);
        // If an sRGB chunk exists, ignore gAMA chunks
        __CLR4_5_22sw2swm68iygad.R.inc(4308);if ((((sRGBRenderingIntent != -1)&&(__CLR4_5_22sw2swm68iygad.R.iget(4309)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4310)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4311);return;
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(4312);fileGamma = chunk.getInt4(0) / 100000.0F;
        // System.out.println("Gamma: " + fileGamma);
        __CLR4_5_22sw2swm68iygad.R.inc(4313);float exp =
            (((performGammaCorrection )&&(__CLR4_5_22sw2swm68iygad.R.iget(4314)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4315)==0&false))? displayExponent / userExponent : 1.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4316);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4317)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4318)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4319);encodeParam.setGamma(fileGamma * exp);
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(4320);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(4321)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4322)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4323);properties.put("gamma", fileGamma * exp);
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_hIST_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4324);
        __CLR4_5_22sw2swm68iygad.R.inc(4325);if ((((redPalette == null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4326)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4327)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4328);String msg = PropertyUtil.getString("PNGImageDecoder18");
            __CLR4_5_22sw2swm68iygad.R.inc(4329);throw new RuntimeException(msg);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(4330);int length = redPalette.length;
        __CLR4_5_22sw2swm68iygad.R.inc(4331);int[] hist = new int[length];
        __CLR4_5_22sw2swm68iygad.R.inc(4332);for (int i = 0; (((i < length)&&(__CLR4_5_22sw2swm68iygad.R.iget(4333)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4334)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4335);hist[i] = chunk.getInt2(2 * i);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(4336);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4337)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4338)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4339);encodeParam.setPaletteHistogram(hist);
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_pHYs_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4340);
        __CLR4_5_22sw2swm68iygad.R.inc(4341);int xPixelsPerUnit = chunk.getInt4(0);
        __CLR4_5_22sw2swm68iygad.R.inc(4342);int yPixelsPerUnit = chunk.getInt4(4);
        __CLR4_5_22sw2swm68iygad.R.inc(4343);int unitSpecifier = chunk.getInt1(8);

        __CLR4_5_22sw2swm68iygad.R.inc(4344);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4345)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4346)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4347);encodeParam.setPhysicalDimension(xPixelsPerUnit,
                                             yPixelsPerUnit,
                                             unitSpecifier);
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(4348);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(4349)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4350)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4351);properties.put("x_pixels_per_unit", xPixelsPerUnit);
            __CLR4_5_22sw2swm68iygad.R.inc(4352);properties.put("y_pixels_per_unit", yPixelsPerUnit);
            __CLR4_5_22sw2swm68iygad.R.inc(4353);properties.put("pixel_aspect_ratio",
                    (float) xPixelsPerUnit / yPixelsPerUnit);
            __CLR4_5_22sw2swm68iygad.R.inc(4354);if ((((unitSpecifier == 1)&&(__CLR4_5_22sw2swm68iygad.R.iget(4355)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4356)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4357);properties.put("pixel_units", "Meters");
            } }else {__CLR4_5_22sw2swm68iygad.R.inc(4358);if ((((unitSpecifier != 0)&&(__CLR4_5_22sw2swm68iygad.R.iget(4359)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4360)==0&false))) {{
                // Error -- unit specifier must be 0 or 1
                __CLR4_5_22sw2swm68iygad.R.inc(4361);String msg = PropertyUtil.getString("PNGImageDecoder12");
                __CLR4_5_22sw2swm68iygad.R.inc(4362);throw new RuntimeException(msg);
            }
        }}}
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_sBIT_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4363);
        __CLR4_5_22sw2swm68iygad.R.inc(4364);if ((((colorType == PNG_COLOR_PALETTE)&&(__CLR4_5_22sw2swm68iygad.R.iget(4365)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4366)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4367);significantBits = new int[3];
        } }else {{
            __CLR4_5_22sw2swm68iygad.R.inc(4368);significantBits = new int[inputBands];
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(4369);for (int i = 0; (((i < significantBits.length)&&(__CLR4_5_22sw2swm68iygad.R.iget(4370)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4371)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4372);int bits = chunk.getByte(i);
            __CLR4_5_22sw2swm68iygad.R.inc(4373);int depth = ((((colorType == PNG_COLOR_PALETTE) )&&(__CLR4_5_22sw2swm68iygad.R.iget(4374)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4375)==0&false))? 8 : bitDepth;
            __CLR4_5_22sw2swm68iygad.R.inc(4376);if ((((bits <= 0 || bits > depth)&&(__CLR4_5_22sw2swm68iygad.R.iget(4377)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4378)==0&false))) {{
                // Error -- significant bits must be between 0 and
                // image bit depth.
                __CLR4_5_22sw2swm68iygad.R.inc(4379);String msg = PropertyUtil.getString("PNGImageDecoder13");
                __CLR4_5_22sw2swm68iygad.R.inc(4380);throw new RuntimeException(msg);
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4381);significantBits[i] = bits;
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(4382);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4383)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4384)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4385);encodeParam.setSignificantBits(significantBits);
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(4386);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(4387)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4388)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4389);properties.put("significant_bits", significantBits);
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_sRGB_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4390);
        __CLR4_5_22sw2swm68iygad.R.inc(4391);sRGBRenderingIntent = chunk.getByte(0);

        // The presence of an sRGB chunk implies particular
        // settings for gamma and chroma.
        __CLR4_5_22sw2swm68iygad.R.inc(4392);fileGamma = 45455 / 100000.0F;

        __CLR4_5_22sw2swm68iygad.R.inc(4393);chromaticity = new float[8];
        __CLR4_5_22sw2swm68iygad.R.inc(4394);chromaticity[0] = 31270 / 10000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4395);chromaticity[1] = 32900 / 10000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4396);chromaticity[2] = 64000 / 10000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4397);chromaticity[3] = 33000 / 10000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4398);chromaticity[4] = 30000 / 10000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4399);chromaticity[5] = 60000 / 10000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4400);chromaticity[6] = 15000 / 10000.0F;
        __CLR4_5_22sw2swm68iygad.R.inc(4401);chromaticity[7] =  6000 / 10000.0F;

        __CLR4_5_22sw2swm68iygad.R.inc(4402);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(4403)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4404)==0&false))) {{
            // File gamma is 1/2.2
            __CLR4_5_22sw2swm68iygad.R.inc(4405);float gamma = fileGamma * (displayExponent / userExponent);
            __CLR4_5_22sw2swm68iygad.R.inc(4406);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4407)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4408)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4409);encodeParam.setGamma(gamma);
                __CLR4_5_22sw2swm68iygad.R.inc(4410);encodeParam.setChromaticity(chromaticity);
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4411);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(4412)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4413)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4414);properties.put("gamma", gamma);
                __CLR4_5_22sw2swm68iygad.R.inc(4415);properties.put("white_point_x", chromaticity[0]);
                __CLR4_5_22sw2swm68iygad.R.inc(4416);properties.put("white_point_y", chromaticity[1]);
                __CLR4_5_22sw2swm68iygad.R.inc(4417);properties.put("red_x", chromaticity[2]);
                __CLR4_5_22sw2swm68iygad.R.inc(4418);properties.put("red_y", chromaticity[3]);
                __CLR4_5_22sw2swm68iygad.R.inc(4419);properties.put("green_x", chromaticity[4]);
                __CLR4_5_22sw2swm68iygad.R.inc(4420);properties.put("green_y", chromaticity[5]);
                __CLR4_5_22sw2swm68iygad.R.inc(4421);properties.put("blue_x", chromaticity[6]);
                __CLR4_5_22sw2swm68iygad.R.inc(4422);properties.put("blue_y", chromaticity[7]);
            }
        }}
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_tEXt_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4423);
        __CLR4_5_22sw2swm68iygad.R.inc(4424);StringBuffer key = new StringBuffer();
        __CLR4_5_22sw2swm68iygad.R.inc(4425);StringBuffer value = new StringBuffer();
        __CLR4_5_22sw2swm68iygad.R.inc(4426);byte b;

        __CLR4_5_22sw2swm68iygad.R.inc(4427);int textIndex = 0;
        __CLR4_5_22sw2swm68iygad.R.inc(4428);while ((b = chunk.getByte(textIndex++)) != 0) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4431);key.append((char)b);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(4432);for (int i = textIndex; (((i < chunk.getLength())&&(__CLR4_5_22sw2swm68iygad.R.iget(4433)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4434)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4435);value.append((char)chunk.getByte(i));
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(4436);textKeys.add(key.toString());
        __CLR4_5_22sw2swm68iygad.R.inc(4437);textStrings.add(value.toString());
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_tIME_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4438);
        __CLR4_5_22sw2swm68iygad.R.inc(4439);int year = chunk.getInt2(0);
        __CLR4_5_22sw2swm68iygad.R.inc(4440);int month = chunk.getInt1(2) - 1;
        __CLR4_5_22sw2swm68iygad.R.inc(4441);int day = chunk.getInt1(3);
        __CLR4_5_22sw2swm68iygad.R.inc(4442);int hour = chunk.getInt1(4);
        __CLR4_5_22sw2swm68iygad.R.inc(4443);int minute = chunk.getInt1(5);
        __CLR4_5_22sw2swm68iygad.R.inc(4444);int second = chunk.getInt1(6);

        __CLR4_5_22sw2swm68iygad.R.inc(4445);TimeZone gmt = TimeZone.getTimeZone("GMT");

        __CLR4_5_22sw2swm68iygad.R.inc(4446);GregorianCalendar cal = new GregorianCalendar(gmt);
        __CLR4_5_22sw2swm68iygad.R.inc(4447);cal.set(year, month, day,
                hour, minute, second);
        __CLR4_5_22sw2swm68iygad.R.inc(4448);Date date = cal.getTime();

        __CLR4_5_22sw2swm68iygad.R.inc(4449);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4450)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4451)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4452);encodeParam.setModificationTime(date);
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(4453);if ((((emitProperties)&&(__CLR4_5_22sw2swm68iygad.R.iget(4454)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4455)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4456);properties.put("timestamp", date);
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_tRNS_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4457);
        __CLR4_5_22sw2swm68iygad.R.inc(4458);if ((((colorType == PNG_COLOR_PALETTE)&&(__CLR4_5_22sw2swm68iygad.R.iget(4459)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4460)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4461);int entries = chunk.getLength();
            __CLR4_5_22sw2swm68iygad.R.inc(4462);if ((((entries > paletteEntries)&&(__CLR4_5_22sw2swm68iygad.R.iget(4463)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4464)==0&false))) {{
                // Error -- mustn't have more alpha than RGB palette entries
                __CLR4_5_22sw2swm68iygad.R.inc(4465);String msg = PropertyUtil.getString("PNGImageDecoder14");
                __CLR4_5_22sw2swm68iygad.R.inc(4466);throw new RuntimeException(msg);
            }

            // Load beginning of palette from the chunk
            }__CLR4_5_22sw2swm68iygad.R.inc(4467);alphaPalette = new byte[paletteEntries];
            __CLR4_5_22sw2swm68iygad.R.inc(4468);for (int i = 0; (((i < entries)&&(__CLR4_5_22sw2swm68iygad.R.iget(4469)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4470)==0&false)); i++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4471);alphaPalette[i] = chunk.getByte(i);
            }

            // Fill rest of palette with 255
            }__CLR4_5_22sw2swm68iygad.R.inc(4472);for (int i = entries; (((i < paletteEntries)&&(__CLR4_5_22sw2swm68iygad.R.iget(4473)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4474)==0&false)); i++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4475);alphaPalette[i] = (byte)255;
            }

            }__CLR4_5_22sw2swm68iygad.R.inc(4476);if ((((!suppressAlpha)&&(__CLR4_5_22sw2swm68iygad.R.iget(4477)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4478)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4479);if ((((expandPalette)&&(__CLR4_5_22sw2swm68iygad.R.iget(4480)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4481)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4482);postProcess = POST_PALETTE_TO_RGBA;
                    __CLR4_5_22sw2swm68iygad.R.inc(4483);outputBands = 4;
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4484);outputHasAlphaPalette = true;
                }
            }}
        }} }else {__CLR4_5_22sw2swm68iygad.R.inc(4485);if ((((colorType == PNG_COLOR_GRAY)&&(__CLR4_5_22sw2swm68iygad.R.iget(4486)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4487)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4488);grayTransparentAlpha = chunk.getInt2(0);

            __CLR4_5_22sw2swm68iygad.R.inc(4489);if ((((!suppressAlpha)&&(__CLR4_5_22sw2swm68iygad.R.iget(4490)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4491)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4492);if ((((bitDepth < 8)&&(__CLR4_5_22sw2swm68iygad.R.iget(4493)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4494)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4495);output8BitGray = true;
                    __CLR4_5_22sw2swm68iygad.R.inc(4496);maxOpacity = 255;
                    __CLR4_5_22sw2swm68iygad.R.inc(4497);postProcess = POST_GRAY_LUT_ADD_TRANS;
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4498);postProcess = POST_ADD_GRAY_TRANS;
                }

                }__CLR4_5_22sw2swm68iygad.R.inc(4499);if ((((expandGrayAlpha)&&(__CLR4_5_22sw2swm68iygad.R.iget(4500)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4501)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4502);outputBands = 4;
                    __CLR4_5_22sw2swm68iygad.R.inc(4503);postProcess |= POST_EXP_MASK;
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4504);outputBands = 2;
                }

                }__CLR4_5_22sw2swm68iygad.R.inc(4505);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4506)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4507)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4508);((PNGEncodeParam.Gray)encodeParam).setTransparentGray(grayTransparentAlpha);
                }
            }}
        }} }else {__CLR4_5_22sw2swm68iygad.R.inc(4509);if ((((colorType == PNG_COLOR_RGB)&&(__CLR4_5_22sw2swm68iygad.R.iget(4510)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4511)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4512);redTransparentAlpha = chunk.getInt2(0);
            __CLR4_5_22sw2swm68iygad.R.inc(4513);greenTransparentAlpha = chunk.getInt2(2);
            __CLR4_5_22sw2swm68iygad.R.inc(4514);blueTransparentAlpha = chunk.getInt2(4);

            __CLR4_5_22sw2swm68iygad.R.inc(4515);if ((((!suppressAlpha)&&(__CLR4_5_22sw2swm68iygad.R.iget(4516)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4517)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4518);outputBands = 4;
                __CLR4_5_22sw2swm68iygad.R.inc(4519);postProcess = POST_ADD_RGB_TRANS;

                __CLR4_5_22sw2swm68iygad.R.inc(4520);if ((((encodeParam != null)&&(__CLR4_5_22sw2swm68iygad.R.iget(4521)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4522)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4523);int[] rgbTrans = new int[3];
                    __CLR4_5_22sw2swm68iygad.R.inc(4524);rgbTrans[0] = redTransparentAlpha;
                    __CLR4_5_22sw2swm68iygad.R.inc(4525);rgbTrans[1] = greenTransparentAlpha;
                    __CLR4_5_22sw2swm68iygad.R.inc(4526);rgbTrans[2] = blueTransparentAlpha;
                    __CLR4_5_22sw2swm68iygad.R.inc(4527);((PNGEncodeParam.RGB)encodeParam).setTransparentRGB(rgbTrans);
                }
            }}
        }} }else {__CLR4_5_22sw2swm68iygad.R.inc(4528);if ((((colorType == PNG_COLOR_GRAY_ALPHA
                   || colorType == PNG_COLOR_RGB_ALPHA)&&(__CLR4_5_22sw2swm68iygad.R.iget(4529)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4530)==0&false))) {{
            // Error -- GA or RGBA image can't have a tRNS chunk.
            __CLR4_5_22sw2swm68iygad.R.inc(4531);String msg = PropertyUtil.getString("PNGImageDecoder15");
            __CLR4_5_22sw2swm68iygad.R.inc(4532);throw new RuntimeException(msg);
        }
    }}}}}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void parse_zTXt_chunk(PNGChunk chunk) {try{__CLR4_5_22sw2swm68iygad.R.inc(4533);
        __CLR4_5_22sw2swm68iygad.R.inc(4534);StringBuffer key = new StringBuffer();
        __CLR4_5_22sw2swm68iygad.R.inc(4535);StringBuffer value = new StringBuffer();
        __CLR4_5_22sw2swm68iygad.R.inc(4536);byte b;

        __CLR4_5_22sw2swm68iygad.R.inc(4537);int textIndex = 0;
        __CLR4_5_22sw2swm68iygad.R.inc(4538);while ((b = chunk.getByte(textIndex++)) != 0) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4541);key.append((char)b);
        }

        // skip method
        }__CLR4_5_22sw2swm68iygad.R.inc(4542);textIndex++;

        __CLR4_5_22sw2swm68iygad.R.inc(4543);try {
            __CLR4_5_22sw2swm68iygad.R.inc(4544);int length = chunk.getLength() - textIndex;
            __CLR4_5_22sw2swm68iygad.R.inc(4545);byte[] data = chunk.getData();
            __CLR4_5_22sw2swm68iygad.R.inc(4546);InputStream cis =
                new ByteArrayInputStream(data, textIndex, length);
            __CLR4_5_22sw2swm68iygad.R.inc(4547);InputStream iis = new InflaterInputStream(cis);

            __CLR4_5_22sw2swm68iygad.R.inc(4548);int c;
            __CLR4_5_22sw2swm68iygad.R.inc(4549);while ((c = iis.read()) != -1) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4552);value.append((char)c);
            }

            }__CLR4_5_22sw2swm68iygad.R.inc(4553);ztextKeys.add(key.toString());
            __CLR4_5_22sw2swm68iygad.R.inc(4554);ztextStrings.add(value.toString());
        } catch (Exception e) {
            __CLR4_5_22sw2swm68iygad.R.inc(4555);e.printStackTrace();
        }
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private WritableRaster createRaster(int width, int height, int bands,
                                        int scanlineStride,
                                        int bitDepth) {try{__CLR4_5_22sw2swm68iygad.R.inc(4556);

        __CLR4_5_22sw2swm68iygad.R.inc(4557);DataBuffer dataBuffer;
        __CLR4_5_22sw2swm68iygad.R.inc(4558);WritableRaster ras = null;
        __CLR4_5_22sw2swm68iygad.R.inc(4559);Point origin = new Point(0, 0);
        __CLR4_5_22sw2swm68iygad.R.inc(4560);if (((((bitDepth < 8) && (bands == 1))&&(__CLR4_5_22sw2swm68iygad.R.iget(4561)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4562)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4563);dataBuffer = new DataBufferByte(height * scanlineStride);
            __CLR4_5_22sw2swm68iygad.R.inc(4564);ras = Raster.createPackedRaster(dataBuffer,
                                            width, height,
                                            bitDepth,
                                            origin);
        } }else {__CLR4_5_22sw2swm68iygad.R.inc(4565);if ((((bitDepth <= 8)&&(__CLR4_5_22sw2swm68iygad.R.iget(4566)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4567)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4568);dataBuffer = new DataBufferByte(height * scanlineStride);
           __CLR4_5_22sw2swm68iygad.R.inc(4569);ras = Raster.createInterleavedRaster(dataBuffer,
                                                 width, height,
                                                 scanlineStride,
                                                 bands,
                                                 bandOffsets[bands],
                                                 origin);
        } }else {{
            __CLR4_5_22sw2swm68iygad.R.inc(4570);dataBuffer = new DataBufferUShort(height * scanlineStride);
            __CLR4_5_22sw2swm68iygad.R.inc(4571);ras = Raster.createInterleavedRaster(dataBuffer,
                                                 width, height,
                                                 scanlineStride,
                                                 bands,
                                                 bandOffsets[bands],
                                                 origin);
        }

        }}__CLR4_5_22sw2swm68iygad.R.inc(4572);return ras;
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    // Data filtering methods

    private static void decodeSubFilter(byte[] curr, int count, int bpp) {try{__CLR4_5_22sw2swm68iygad.R.inc(4573);
        __CLR4_5_22sw2swm68iygad.R.inc(4574);for (int i = bpp; (((i < count)&&(__CLR4_5_22sw2swm68iygad.R.iget(4575)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4576)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4577);int val;

            __CLR4_5_22sw2swm68iygad.R.inc(4578);val = curr[i] & 0xff;
            __CLR4_5_22sw2swm68iygad.R.inc(4579);val += curr[i - bpp] & 0xff;

            __CLR4_5_22sw2swm68iygad.R.inc(4580);curr[i] = (byte)val;
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private static void decodeUpFilter(byte[] curr, byte[] prev,
                                       int count) {try{__CLR4_5_22sw2swm68iygad.R.inc(4581);
        __CLR4_5_22sw2swm68iygad.R.inc(4582);for (int i = 0; (((i < count)&&(__CLR4_5_22sw2swm68iygad.R.iget(4583)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4584)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4585);int raw   = curr[i] & 0xff;
            __CLR4_5_22sw2swm68iygad.R.inc(4586);int prior = prev[i] & 0xff;

            __CLR4_5_22sw2swm68iygad.R.inc(4587);curr[i] = (byte)(raw + prior);
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private static void decodeAverageFilter(byte[] curr, byte[] prev,
                                            int count, int bpp) {try{__CLR4_5_22sw2swm68iygad.R.inc(4588);
        __CLR4_5_22sw2swm68iygad.R.inc(4589);for (int i = 0; (((i < bpp)&&(__CLR4_5_22sw2swm68iygad.R.iget(4590)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4591)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4592);int raw      = curr[i] & 0xff;
            __CLR4_5_22sw2swm68iygad.R.inc(4593);int priorRow = prev[i] & 0xff;

            __CLR4_5_22sw2swm68iygad.R.inc(4594);curr[i] = (byte)(raw + priorRow / 2);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(4595);for (int i = bpp; (((i < count)&&(__CLR4_5_22sw2swm68iygad.R.iget(4596)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4597)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4598);int raw = curr[i] & 0xff;
            __CLR4_5_22sw2swm68iygad.R.inc(4599);int priorPixel = curr[i - bpp] & 0xff;
            __CLR4_5_22sw2swm68iygad.R.inc(4600);int priorRow = prev[i] & 0xff;

            __CLR4_5_22sw2swm68iygad.R.inc(4601);curr[i] = (byte)(raw + (priorPixel + priorRow) / 2);
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private static int paethPredictor(int a, int b, int c) {try{__CLR4_5_22sw2swm68iygad.R.inc(4602);
        __CLR4_5_22sw2swm68iygad.R.inc(4603);int p = a + b - c;
        __CLR4_5_22sw2swm68iygad.R.inc(4604);int pa = Math.abs(p - a);
        __CLR4_5_22sw2swm68iygad.R.inc(4605);int pb = Math.abs(p - b);
        __CLR4_5_22sw2swm68iygad.R.inc(4606);int pc = Math.abs(p - c);

        __CLR4_5_22sw2swm68iygad.R.inc(4607);if (((((pa <= pb) && (pa <= pc))&&(__CLR4_5_22sw2swm68iygad.R.iget(4608)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4609)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4610);return a;
        } }else {__CLR4_5_22sw2swm68iygad.R.inc(4611);if ((((pb <= pc)&&(__CLR4_5_22sw2swm68iygad.R.iget(4612)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4613)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4614);return b;
        } }else {{
            __CLR4_5_22sw2swm68iygad.R.inc(4615);return c;
        }
    }}}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private static void decodePaethFilter(byte[] curr, byte[] prev,
                                          int count, int bpp) {try{__CLR4_5_22sw2swm68iygad.R.inc(4616);
        __CLR4_5_22sw2swm68iygad.R.inc(4617);int priorPixel;
        __CLR4_5_22sw2swm68iygad.R.inc(4618);int priorRowPixel;

        __CLR4_5_22sw2swm68iygad.R.inc(4619);for (int i = 0; (((i < bpp)&&(__CLR4_5_22sw2swm68iygad.R.iget(4620)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4621)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4622);int raw = curr[i] & 0xff;
            __CLR4_5_22sw2swm68iygad.R.inc(4623);int priorRow = prev[i] & 0xff;

            __CLR4_5_22sw2swm68iygad.R.inc(4624);curr[i] = (byte)(raw + priorRow);
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(4625);for (int i = bpp; (((i < count)&&(__CLR4_5_22sw2swm68iygad.R.iget(4626)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4627)==0&false)); i++) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4628);int raw = curr[i] & 0xff;
            __CLR4_5_22sw2swm68iygad.R.inc(4629);priorPixel = curr[i - bpp] & 0xff;
            __CLR4_5_22sw2swm68iygad.R.inc(4630);int priorRow = prev[i] & 0xff;
            __CLR4_5_22sw2swm68iygad.R.inc(4631);priorRowPixel = prev[i - bpp] & 0xff;

            __CLR4_5_22sw2swm68iygad.R.inc(4632);curr[i] = (byte)(raw + paethPredictor(priorPixel,
                                                  priorRow,
                                                  priorRowPixel));
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void processPixels(int process,
                               Raster src, WritableRaster dst,
                               int xOffset, int step, int y, int width) {try{__CLR4_5_22sw2swm68iygad.R.inc(4633);
        __CLR4_5_22sw2swm68iygad.R.inc(4634);int srcX;
        __CLR4_5_22sw2swm68iygad.R.inc(4635);int dstX;

        // Create an array suitable for holding one pixel
        __CLR4_5_22sw2swm68iygad.R.inc(4636);int[] ps = src.getPixel(0, 0, (int[])null);
        __CLR4_5_22sw2swm68iygad.R.inc(4637);int[] pd = dst.getPixel(0, 0, (int[])null);

        __CLR4_5_22sw2swm68iygad.R.inc(4638);dstX = xOffset;
        boolean __CLB4_5_2_bool5=false;__CLR4_5_22sw2swm68iygad.R.inc(4639);switch (process) {
        case POST_NONE:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4640);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4641);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4642)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4643)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4644);src.getPixel(srcX, 0, ps);
                __CLR4_5_22sw2swm68iygad.R.inc(4645);dst.setPixel(dstX, y, ps);
                __CLR4_5_22sw2swm68iygad.R.inc(4646);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4647);break;

        case POST_GAMMA:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4648);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4649);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4650)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4651)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4652);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4653);for (int i = 0; (((i < inputBands)&&(__CLR4_5_22sw2swm68iygad.R.iget(4654)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4655)==0&false)); i++) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4656);int x = ps[i];
                    __CLR4_5_22sw2swm68iygad.R.inc(4657);ps[i] = gammaLut[x];
                }

                }__CLR4_5_22sw2swm68iygad.R.inc(4658);dst.setPixel(dstX, y, ps);
                __CLR4_5_22sw2swm68iygad.R.inc(4659);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4660);break;

        case POST_GRAY_LUT:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4661);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4662);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4663)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4664)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4665);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4666);pd[0] = grayLut[ps[0]];

                __CLR4_5_22sw2swm68iygad.R.inc(4667);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4668);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4669);break;

        case POST_GRAY_LUT_ADD_TRANS:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4670);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4671);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4672)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4673)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4674);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4675);int val = ps[0];
                __CLR4_5_22sw2swm68iygad.R.inc(4676);pd[0] = grayLut[val];
                __CLR4_5_22sw2swm68iygad.R.inc(4677);if ((((val == grayTransparentAlpha)&&(__CLR4_5_22sw2swm68iygad.R.iget(4678)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4679)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4680);pd[1] = 0;
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4681);pd[1] = maxOpacity;
                }

                }__CLR4_5_22sw2swm68iygad.R.inc(4682);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4683);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4684);break;

        case POST_PALETTE_TO_RGB:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4685);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4686);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4687)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4688)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4689);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4690);int val = ps[0];
                __CLR4_5_22sw2swm68iygad.R.inc(4691);pd[0] = redPalette[val];
                __CLR4_5_22sw2swm68iygad.R.inc(4692);pd[1] = greenPalette[val];
                __CLR4_5_22sw2swm68iygad.R.inc(4693);pd[2] = bluePalette[val];

                __CLR4_5_22sw2swm68iygad.R.inc(4694);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4695);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4696);break;

        case POST_PALETTE_TO_RGBA:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4697);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4698);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4699)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4700)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4701);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4702);int val = ps[0];
                __CLR4_5_22sw2swm68iygad.R.inc(4703);pd[0] = redPalette[val];
                __CLR4_5_22sw2swm68iygad.R.inc(4704);pd[1] = greenPalette[val];
                __CLR4_5_22sw2swm68iygad.R.inc(4705);pd[2] = bluePalette[val];
                __CLR4_5_22sw2swm68iygad.R.inc(4706);pd[3] = alphaPalette[val];

                __CLR4_5_22sw2swm68iygad.R.inc(4707);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4708);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4709);break;

        case POST_ADD_GRAY_TRANS:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4710);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4711);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4712)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4713)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4714);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4715);int val = ps[0];
                __CLR4_5_22sw2swm68iygad.R.inc(4716);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(4717)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4718)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4719);val = gammaLut[val];
                }
                }__CLR4_5_22sw2swm68iygad.R.inc(4720);pd[0] = val;
                __CLR4_5_22sw2swm68iygad.R.inc(4721);if ((((val == grayTransparentAlpha)&&(__CLR4_5_22sw2swm68iygad.R.iget(4722)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4723)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4724);pd[1] = 0;
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4725);pd[1] = maxOpacity;
                }

                }__CLR4_5_22sw2swm68iygad.R.inc(4726);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4727);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4728);break;

        case POST_ADD_RGB_TRANS:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4729);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4730);boolean flagGammaCorrection = performGammaCorrection; // local is cheaper
            __CLR4_5_22sw2swm68iygad.R.inc(4731);int[] workGammaLut = gammaLut;
            __CLR4_5_22sw2swm68iygad.R.inc(4732);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4733)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4734)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4735);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4736);int r = ps[0];
                __CLR4_5_22sw2swm68iygad.R.inc(4737);int g = ps[1];
                __CLR4_5_22sw2swm68iygad.R.inc(4738);int b = ps[2];
                __CLR4_5_22sw2swm68iygad.R.inc(4739);if ((((flagGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(4740)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4741)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4742);pd[0] = workGammaLut[r];
                    __CLR4_5_22sw2swm68iygad.R.inc(4743);pd[1] = workGammaLut[g];
                    __CLR4_5_22sw2swm68iygad.R.inc(4744);pd[2] = workGammaLut[b];
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4745);pd[0] = r;
                    __CLR4_5_22sw2swm68iygad.R.inc(4746);pd[1] = g;
                    __CLR4_5_22sw2swm68iygad.R.inc(4747);pd[2] = b;
                }
                }__CLR4_5_22sw2swm68iygad.R.inc(4748);if (((((r == redTransparentAlpha)
                    && (g == greenTransparentAlpha)
                    && (b == blueTransparentAlpha))&&(__CLR4_5_22sw2swm68iygad.R.iget(4749)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4750)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4751);pd[3] = 0;
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4752);pd[3] = maxOpacity;
                }

                }__CLR4_5_22sw2swm68iygad.R.inc(4753);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4754);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4755);break;

        case POST_REMOVE_GRAY_TRANS:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4756);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4757);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4758)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4759)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4760);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4761);int g = ps[0];
                __CLR4_5_22sw2swm68iygad.R.inc(4762);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(4763)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4764)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4765);pd[0] = gammaLut[g];
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4766);pd[0] = g;
                }

                }__CLR4_5_22sw2swm68iygad.R.inc(4767);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4768);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4769);break;

        case POST_REMOVE_RGB_TRANS:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4770);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4771);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4772)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4773)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4774);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4775);int r = ps[0];
                __CLR4_5_22sw2swm68iygad.R.inc(4776);int g = ps[1];
                __CLR4_5_22sw2swm68iygad.R.inc(4777);int b = ps[2];
                __CLR4_5_22sw2swm68iygad.R.inc(4778);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(4779)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4780)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4781);pd[0] = gammaLut[r];
                    __CLR4_5_22sw2swm68iygad.R.inc(4782);pd[1] = gammaLut[g];
                    __CLR4_5_22sw2swm68iygad.R.inc(4783);pd[2] = gammaLut[b];
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4784);pd[0] = r;
                    __CLR4_5_22sw2swm68iygad.R.inc(4785);pd[1] = g;
                    __CLR4_5_22sw2swm68iygad.R.inc(4786);pd[2] = b;
                }

                }__CLR4_5_22sw2swm68iygad.R.inc(4787);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4788);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4789);break;

        case POST_GAMMA_EXP:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4790);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4791);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4792)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4793)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4794);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4795);int val = ps[0];
                __CLR4_5_22sw2swm68iygad.R.inc(4796);int alpha = ps[1];
                __CLR4_5_22sw2swm68iygad.R.inc(4797);int gamma = gammaLut[val];
                __CLR4_5_22sw2swm68iygad.R.inc(4798);pd[0] = gamma;
                __CLR4_5_22sw2swm68iygad.R.inc(4799);pd[1] = gamma;
                __CLR4_5_22sw2swm68iygad.R.inc(4800);pd[2] = gamma;
                __CLR4_5_22sw2swm68iygad.R.inc(4801);pd[3] = alpha;

                __CLR4_5_22sw2swm68iygad.R.inc(4802);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4803);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4804);break;

        case POST_GRAY_ALPHA_EXP:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4805);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4806);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4807)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4808)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4809);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4810);int val = ps[0];
                __CLR4_5_22sw2swm68iygad.R.inc(4811);int alpha = ps[1];
                __CLR4_5_22sw2swm68iygad.R.inc(4812);pd[0] = val;
                __CLR4_5_22sw2swm68iygad.R.inc(4813);pd[1] = val;
                __CLR4_5_22sw2swm68iygad.R.inc(4814);pd[2] = val;
                __CLR4_5_22sw2swm68iygad.R.inc(4815);pd[3] = alpha;

                __CLR4_5_22sw2swm68iygad.R.inc(4816);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4817);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4818);break;

        case POST_ADD_GRAY_TRANS_EXP:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4819);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4820);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4821)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4822)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4823);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4824);int val = ps[0];
                __CLR4_5_22sw2swm68iygad.R.inc(4825);if ((((performGammaCorrection)&&(__CLR4_5_22sw2swm68iygad.R.iget(4826)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4827)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4828);val = gammaLut[val];
                }
                }__CLR4_5_22sw2swm68iygad.R.inc(4829);pd[0] = val;
                __CLR4_5_22sw2swm68iygad.R.inc(4830);pd[1] = val;
                __CLR4_5_22sw2swm68iygad.R.inc(4831);pd[2] = val;
                __CLR4_5_22sw2swm68iygad.R.inc(4832);if ((((val == grayTransparentAlpha)&&(__CLR4_5_22sw2swm68iygad.R.iget(4833)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4834)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4835);pd[3] = 0;
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4836);pd[3] = maxOpacity;
                }

                }__CLR4_5_22sw2swm68iygad.R.inc(4837);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4838);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4839);break;

        case POST_GRAY_LUT_ADD_TRANS_EXP:if (!__CLB4_5_2_bool5) {__CLR4_5_22sw2swm68iygad.R.inc(4840);__CLB4_5_2_bool5=true;}
            __CLR4_5_22sw2swm68iygad.R.inc(4841);for (srcX = 0; (((srcX < width)&&(__CLR4_5_22sw2swm68iygad.R.iget(4842)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4843)==0&false)); srcX++) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4844);src.getPixel(srcX, 0, ps);

                __CLR4_5_22sw2swm68iygad.R.inc(4845);int val = ps[0];
                __CLR4_5_22sw2swm68iygad.R.inc(4846);int val2 = grayLut[val];
                __CLR4_5_22sw2swm68iygad.R.inc(4847);pd[0] = val2;
                __CLR4_5_22sw2swm68iygad.R.inc(4848);pd[1] = val2;
                __CLR4_5_22sw2swm68iygad.R.inc(4849);pd[2] = val2;
                __CLR4_5_22sw2swm68iygad.R.inc(4850);if ((((val == grayTransparentAlpha)&&(__CLR4_5_22sw2swm68iygad.R.iget(4851)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4852)==0&false))) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4853);pd[3] = 0;
                } }else {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4854);pd[3] = maxOpacity;
                }

                }__CLR4_5_22sw2swm68iygad.R.inc(4855);dst.setPixel(dstX, y, pd);
                __CLR4_5_22sw2swm68iygad.R.inc(4856);dstX += step;
            }
            }__CLR4_5_22sw2swm68iygad.R.inc(4857);break;
        }
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    /**
     * Reads in an image of a given size and returns it as a
     * WritableRaster.
     */
    private void decodePass(WritableRaster imRas,
                            int xOffset, int yOffset,
                            int xStep, int yStep,
                            int passWidth, int passHeight) {try{__CLR4_5_22sw2swm68iygad.R.inc(4858);
        __CLR4_5_22sw2swm68iygad.R.inc(4859);if (((((passWidth == 0) || (passHeight == 0))&&(__CLR4_5_22sw2swm68iygad.R.iget(4860)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4861)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4862);return;
        }

        }__CLR4_5_22sw2swm68iygad.R.inc(4863);int bytesPerRow = (inputBands * passWidth * bitDepth + 7) / 8;
        __CLR4_5_22sw2swm68iygad.R.inc(4864);int eltsPerRow = ((((bitDepth == 16) )&&(__CLR4_5_22sw2swm68iygad.R.iget(4865)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4866)==0&false))? bytesPerRow / 2 : bytesPerRow;
        __CLR4_5_22sw2swm68iygad.R.inc(4867);byte[] curr = new byte[bytesPerRow];
        __CLR4_5_22sw2swm68iygad.R.inc(4868);byte[] prior = new byte[bytesPerRow];

        // Create a 1-row tall Raster to hold the data
        __CLR4_5_22sw2swm68iygad.R.inc(4869);WritableRaster passRow =
            createRaster(passWidth, 1, inputBands,
                         eltsPerRow,
                         bitDepth);
        __CLR4_5_22sw2swm68iygad.R.inc(4870);DataBuffer dataBuffer = passRow.getDataBuffer();
        __CLR4_5_22sw2swm68iygad.R.inc(4871);int type = dataBuffer.getDataType();
        __CLR4_5_22sw2swm68iygad.R.inc(4872);byte[] byteData = null;
        __CLR4_5_22sw2swm68iygad.R.inc(4873);short[] shortData = null;
        __CLR4_5_22sw2swm68iygad.R.inc(4874);if ((((type == DataBuffer.TYPE_BYTE)&&(__CLR4_5_22sw2swm68iygad.R.iget(4875)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4876)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4877);byteData = ((DataBufferByte)dataBuffer).getData();
        } }else {{
            __CLR4_5_22sw2swm68iygad.R.inc(4878);shortData = ((DataBufferUShort)dataBuffer).getData();
        }

        // Decode the (sub)image row-by-row
        }__CLR4_5_22sw2swm68iygad.R.inc(4879);int srcY;
        __CLR4_5_22sw2swm68iygad.R.inc(4880);int dstY;
        __CLR4_5_22sw2swm68iygad.R.inc(4881);for (srcY = 0, dstY = yOffset;
             (((srcY < passHeight)&&(__CLR4_5_22sw2swm68iygad.R.iget(4882)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4883)==0&false));
             srcY++, dstY += yStep) {{
            // Read the filter type byte and a row of data
            __CLR4_5_22sw2swm68iygad.R.inc(4884);int filter = 0;
            __CLR4_5_22sw2swm68iygad.R.inc(4885);try {
                __CLR4_5_22sw2swm68iygad.R.inc(4886);filter = dataStream.read();
                __CLR4_5_22sw2swm68iygad.R.inc(4887);dataStream.readFully(curr, 0, bytesPerRow);
            } catch (Exception e) {
                __CLR4_5_22sw2swm68iygad.R.inc(4888);e.printStackTrace();
            }

            boolean __CLB4_5_2_bool6=false;__CLR4_5_22sw2swm68iygad.R.inc(4889);switch (filter) {
            case PNG_FILTER_NONE:if (!__CLB4_5_2_bool6) {__CLR4_5_22sw2swm68iygad.R.inc(4890);__CLB4_5_2_bool6=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4891);break;
            case PNG_FILTER_SUB:if (!__CLB4_5_2_bool6) {__CLR4_5_22sw2swm68iygad.R.inc(4892);__CLB4_5_2_bool6=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4893);decodeSubFilter(curr, bytesPerRow, bytesPerPixel);
                __CLR4_5_22sw2swm68iygad.R.inc(4894);break;
            case PNG_FILTER_UP:if (!__CLB4_5_2_bool6) {__CLR4_5_22sw2swm68iygad.R.inc(4895);__CLB4_5_2_bool6=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4896);decodeUpFilter(curr, prior, bytesPerRow);
                __CLR4_5_22sw2swm68iygad.R.inc(4897);break;
            case PNG_FILTER_AVERAGE:if (!__CLB4_5_2_bool6) {__CLR4_5_22sw2swm68iygad.R.inc(4898);__CLB4_5_2_bool6=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4899);decodeAverageFilter(curr, prior, bytesPerRow, bytesPerPixel);
                __CLR4_5_22sw2swm68iygad.R.inc(4900);break;
            case PNG_FILTER_PAETH:if (!__CLB4_5_2_bool6) {__CLR4_5_22sw2swm68iygad.R.inc(4901);__CLB4_5_2_bool6=true;}
                __CLR4_5_22sw2swm68iygad.R.inc(4902);decodePaethFilter(curr, prior, bytesPerRow, bytesPerPixel);
                __CLR4_5_22sw2swm68iygad.R.inc(4903);break;
            default:if (!__CLB4_5_2_bool6) {__CLR4_5_22sw2swm68iygad.R.inc(4904);__CLB4_5_2_bool6=true;}
                // Error -- unknown filter type
                __CLR4_5_22sw2swm68iygad.R.inc(4905);String msg = PropertyUtil.getString("PNGImageDecoder16");
                __CLR4_5_22sw2swm68iygad.R.inc(4906);throw new RuntimeException(msg);
            }

            // Copy data into passRow byte by byte
            __CLR4_5_22sw2swm68iygad.R.inc(4907);if ((((bitDepth < 16)&&(__CLR4_5_22sw2swm68iygad.R.iget(4908)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4909)==0&false))) {{
                __CLR4_5_22sw2swm68iygad.R.inc(4910);System.arraycopy(curr, 0, byteData, 0, bytesPerRow);
            } }else {{
                __CLR4_5_22sw2swm68iygad.R.inc(4911);int idx = 0;
                __CLR4_5_22sw2swm68iygad.R.inc(4912);for (int j = 0; (((j < eltsPerRow)&&(__CLR4_5_22sw2swm68iygad.R.iget(4913)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4914)==0&false)); j++) {{
                    __CLR4_5_22sw2swm68iygad.R.inc(4915);shortData[j] =
                        (short)((curr[idx] << 8) | (curr[idx + 1] & 0xff));
                    __CLR4_5_22sw2swm68iygad.R.inc(4916);idx += 2;
                }
            }}

            }__CLR4_5_22sw2swm68iygad.R.inc(4917);processPixels(postProcess,
                          passRow, imRas, xOffset, xStep, dstY, passWidth);

            // Swap curr and prior
            __CLR4_5_22sw2swm68iygad.R.inc(4918);byte[] tmp = prior;
            __CLR4_5_22sw2swm68iygad.R.inc(4919);prior = curr;
            __CLR4_5_22sw2swm68iygad.R.inc(4920);curr = tmp;
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    private void decodeImage(boolean useInterlacing) {try{__CLR4_5_22sw2swm68iygad.R.inc(4921);
        __CLR4_5_22sw2swm68iygad.R.inc(4922);int width = bounds.width;
        __CLR4_5_22sw2swm68iygad.R.inc(4923);int height = bounds.height;

        __CLR4_5_22sw2swm68iygad.R.inc(4924);if ((((!useInterlacing)&&(__CLR4_5_22sw2swm68iygad.R.iget(4925)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4926)==0&false))) {{
            __CLR4_5_22sw2swm68iygad.R.inc(4927);decodePass(theTile, 0, 0, 1, 1, width, height);
        } }else {{
            __CLR4_5_22sw2swm68iygad.R.inc(4928);decodePass(theTile, 0, 0, 8, 8, (width + 7) / 8, (height + 7) / 8);
            __CLR4_5_22sw2swm68iygad.R.inc(4929);decodePass(theTile, 4, 0, 8, 8, (width + 3) / 8, (height + 7) / 8);
            __CLR4_5_22sw2swm68iygad.R.inc(4930);decodePass(theTile, 0, 4, 4, 8, (width + 3) / 4, (height + 3) / 8);
            __CLR4_5_22sw2swm68iygad.R.inc(4931);decodePass(theTile, 2, 0, 4, 4, (width + 1) / 4, (height + 3) / 4);
            __CLR4_5_22sw2swm68iygad.R.inc(4932);decodePass(theTile, 0, 2, 2, 4, (width + 1) / 2, (height + 1) / 4);
            __CLR4_5_22sw2swm68iygad.R.inc(4933);decodePass(theTile, 1, 0, 2, 2, width / 2, (height + 1) / 2);
            __CLR4_5_22sw2swm68iygad.R.inc(4934);decodePass(theTile, 0, 1, 1, 2, width, height / 2);
        }
    }}finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    public WritableRaster copyData(WritableRaster wr) {try{__CLR4_5_22sw2swm68iygad.R.inc(4935);
        __CLR4_5_22sw2swm68iygad.R.inc(4936);GraphicsUtil.copyData(theTile, wr);
        __CLR4_5_22sw2swm68iygad.R.inc(4937);return wr;
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}

    // RenderedImage stuff
    @Override
    public Raster getTile(int tileX, int tileY) {try{__CLR4_5_22sw2swm68iygad.R.inc(4938);
        __CLR4_5_22sw2swm68iygad.R.inc(4939);if ((((tileX != 0 || tileY != 0)&&(__CLR4_5_22sw2swm68iygad.R.iget(4940)!=0|true))||(__CLR4_5_22sw2swm68iygad.R.iget(4941)==0&false))) {{
            // Error -- bad tile requested
            __CLR4_5_22sw2swm68iygad.R.inc(4942);String msg = PropertyUtil.getString("PNGImageDecoder17");
            __CLR4_5_22sw2swm68iygad.R.inc(4943);throw new IllegalArgumentException(msg);
        }
        }__CLR4_5_22sw2swm68iygad.R.inc(4944);return theTile;
    }finally{__CLR4_5_22sw2swm68iygad.R.flushNeeded();}}
}
