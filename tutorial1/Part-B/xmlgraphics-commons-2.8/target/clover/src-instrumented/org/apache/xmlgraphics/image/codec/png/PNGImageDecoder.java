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

/* $Id: PNGImageDecoder.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.png;

import java.awt.Color;
import java.awt.Point;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferUShort;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
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
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

import javax.imageio.stream.ImageInputStream;

import org.apache.xmlgraphics.image.codec.util.ImageDecoderImpl;
import org.apache.xmlgraphics.image.codec.util.ImageInputStreamSeekableStreamAdapter;
import org.apache.xmlgraphics.image.codec.util.PropertyUtil;
import org.apache.xmlgraphics.image.codec.util.SeekableStream;
import org.apache.xmlgraphics.image.codec.util.SimpleRenderedImage;
import org.apache.xmlgraphics.image.loader.ImageSize;
import org.apache.xmlgraphics.image.loader.impl.PNGConstants;

// CSOFF: ConstantName
// CSOFF: InnerAssignment
// CSOFF: MethodName
// CSOFF: MissingSwitchDefault
// CSOFF: MultipleVariableDeclarations
// CSOFF: NoWhitespaceAfter
// CSOFF: OperatorWrap
// CSOFF: WhitespaceAround

/**
 * @version $Id: PNGImageDecoder.java 1732018 2016-02-24 04:51:06Z gadams $
 */
public class PNGImageDecoder extends ImageDecoderImpl {public static class __CLR4_5_2187187m68iyfyx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,1619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public PNGImageDecoder(InputStream input,
                           PNGDecodeParam param) {
        super(input, param);__CLR4_5_2187187m68iyfyx.R.inc(1592);try{__CLR4_5_2187187m68iyfyx.R.inc(1591);
    }finally{__CLR4_5_2187187m68iyfyx.R.flushNeeded();}}

    @Override
    public RenderedImage decodeAsRenderedImage(int page) throws IOException {try{__CLR4_5_2187187m68iyfyx.R.inc(1593);
        __CLR4_5_2187187m68iyfyx.R.inc(1594);if ((((page != 0)&&(__CLR4_5_2187187m68iyfyx.R.iget(1595)!=0|true))||(__CLR4_5_2187187m68iyfyx.R.iget(1596)==0&false))) {{
            __CLR4_5_2187187m68iyfyx.R.inc(1597);throw new IOException(PropertyUtil.getString("PNGImageDecoder19"));
        }
        }__CLR4_5_2187187m68iyfyx.R.inc(1598);return new PNGImage(input, (PNGDecodeParam)param);
    }finally{__CLR4_5_2187187m68iyfyx.R.flushNeeded();}}

    public static void readPNGHeader(ImageInputStream inputStream, ImageSize size) throws IOException {try{__CLR4_5_2187187m68iyfyx.R.inc(1599);
        __CLR4_5_2187187m68iyfyx.R.inc(1600);SeekableStream seekStream = new ImageInputStreamSeekableStreamAdapter(inputStream) {
            public void close() throws IOException {try{__CLR4_5_2187187m68iyfyx.R.inc(1601);
            }finally{__CLR4_5_2187187m68iyfyx.R.flushNeeded();}}
        };
        __CLR4_5_2187187m68iyfyx.R.inc(1602);PNGImage pngImage = new PNGImage(seekStream);
        __CLR4_5_2187187m68iyfyx.R.inc(1603);size.setSizeInPixels(pngImage.getWidth(), pngImage.getHeight());
        __CLR4_5_2187187m68iyfyx.R.inc(1604);double dpiHorz = size.getDpiHorizontal();
        __CLR4_5_2187187m68iyfyx.R.inc(1605);double dpiVert = size.getDpiVertical();
        __CLR4_5_2187187m68iyfyx.R.inc(1606);if ((((pngImage.unitSpecifier == 1)&&(__CLR4_5_2187187m68iyfyx.R.iget(1607)!=0|true))||(__CLR4_5_2187187m68iyfyx.R.iget(1608)==0&false))) {{
            __CLR4_5_2187187m68iyfyx.R.inc(1609);if ((((pngImage.xPixelsPerUnit != 0)&&(__CLR4_5_2187187m68iyfyx.R.iget(1610)!=0|true))||(__CLR4_5_2187187m68iyfyx.R.iget(1611)==0&false))) {{
                __CLR4_5_2187187m68iyfyx.R.inc(1612);dpiHorz = pngImage.xPixelsPerUnit * 0.0254;
            }
            }__CLR4_5_2187187m68iyfyx.R.inc(1613);if ((((pngImage.yPixelsPerUnit != 0)&&(__CLR4_5_2187187m68iyfyx.R.iget(1614)!=0|true))||(__CLR4_5_2187187m68iyfyx.R.iget(1615)==0&false))) {{
                __CLR4_5_2187187m68iyfyx.R.inc(1616);dpiVert = pngImage.yPixelsPerUnit * 0.0254;
            }
        }}
        }__CLR4_5_2187187m68iyfyx.R.inc(1617);size.setResolution(dpiHorz, dpiVert);
        __CLR4_5_2187187m68iyfyx.R.inc(1618);size.calcSizeFromPixels();
    }finally{__CLR4_5_2187187m68iyfyx.R.flushNeeded();}}
}

/**
 * TO DO:
 *
 * zTXt chunks
 *
 */
@java.lang.SuppressWarnings({"fallthrough"}) class PNGImage extends SimpleRenderedImage implements PNGConstants {public static class __CLR4_5_218718zm68iyfyy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,2879,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String[] colorTypeNames = {
        "Grayscale", "Error", "Truecolor", "Index",
        "Grayscale with alpha", "Error", "Truecolor with alpha"
    };

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

    protected int xPixelsPerUnit;
    protected int yPixelsPerUnit;
    protected int unitSpecifier;

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

    private int[] gammaLut;

    private void initGammaLut(int bits) {try{__CLR4_5_218718zm68iyfyy.R.inc(1619);
        __CLR4_5_218718zm68iyfyy.R.inc(1620);double exp = (double)userExponent / (fileGamma * displayExponent);
        __CLR4_5_218718zm68iyfyy.R.inc(1621);int numSamples = 1 << bits;
        __CLR4_5_218718zm68iyfyy.R.inc(1622);int maxOutSample = ((((bits == 16) )&&(__CLR4_5_218718zm68iyfyy.R.iget(1623)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1624)==0&false))? 65535 : 255;

        __CLR4_5_218718zm68iyfyy.R.inc(1625);gammaLut = new int[numSamples];
        __CLR4_5_218718zm68iyfyy.R.inc(1626);for (int i = 0; (((i < numSamples)&&(__CLR4_5_218718zm68iyfyy.R.iget(1627)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1628)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1629);double gbright = (double)i / (numSamples - 1);
            __CLR4_5_218718zm68iyfyy.R.inc(1630);double gamma = Math.pow(gbright, exp);
            __CLR4_5_218718zm68iyfyy.R.inc(1631);int igamma = (int)(gamma * maxOutSample + 0.5);
            __CLR4_5_218718zm68iyfyy.R.inc(1632);if ((((igamma > maxOutSample)&&(__CLR4_5_218718zm68iyfyy.R.iget(1633)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1634)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1635);igamma = maxOutSample;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(1636);gammaLut[i] = igamma;
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

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

    private void initGrayLut(int bits) {try{__CLR4_5_218718zm68iyfyy.R.inc(1637);
        __CLR4_5_218718zm68iyfyy.R.inc(1638);int len = 1 << bits;
        __CLR4_5_218718zm68iyfyy.R.inc(1639);grayLut = new int[len];

        __CLR4_5_218718zm68iyfyy.R.inc(1640);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(1641)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1642)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1643);System.arraycopy(gammaLut, 0, grayLut, 0, len);
        } }else {{
            __CLR4_5_218718zm68iyfyy.R.inc(1644);for (int i = 0; (((i < len)&&(__CLR4_5_218718zm68iyfyy.R.iget(1645)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1646)==0&false)); i++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1647);grayLut[i] = expandBits[bits][i];
            }
        }}
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    public PNGImage(InputStream stream) throws IOException {try{__CLR4_5_218718zm68iyfyy.R.inc(1648);
        __CLR4_5_218718zm68iyfyy.R.inc(1649);DataInputStream distream = new DataInputStream(stream);
        __CLR4_5_218718zm68iyfyy.R.inc(1650);long magic = distream.readLong();
        __CLR4_5_218718zm68iyfyy.R.inc(1651);if ((((magic != PNG_SIGNATURE)&&(__CLR4_5_218718zm68iyfyy.R.iget(1652)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1653)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1654);throw new IOException("Not a png file");
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(1655);while (true) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1656);String chunkType = PNGChunk.getChunkType(distream);
            __CLR4_5_218718zm68iyfyy.R.inc(1657);if ((((chunkType.equals(PNGChunk.ChunkType.IHDR.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1658)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1659)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1660);PNGChunk chunk = PNGChunk.readChunk(distream);
                __CLR4_5_218718zm68iyfyy.R.inc(1661);parse_IHDR_chunk(chunk);
            } }else {__CLR4_5_218718zm68iyfyy.R.inc(1662);if ((((chunkType.equals(PNGChunk.ChunkType.pHYs.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1663)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1664)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1665);PNGChunk chunk = PNGChunk.readChunk(distream);
                __CLR4_5_218718zm68iyfyy.R.inc(1666);parse_pHYs_chunk(chunk);
                __CLR4_5_218718zm68iyfyy.R.inc(1667);return;
            } }else {__CLR4_5_218718zm68iyfyy.R.inc(1668);if ((((chunkType.equals(PNGChunk.ChunkType.IEND.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1669)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1670)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1671);return;
            } }else {{
                __CLR4_5_218718zm68iyfyy.R.inc(1672);PNGChunk.readChunk(distream);
            }
        }}}}
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    public PNGImage(InputStream stream, PNGDecodeParam decodeParam)
        throws IOException {try{__CLR4_5_218718zm68iyfyy.R.inc(1673);

        __CLR4_5_218718zm68iyfyy.R.inc(1674);if ((((!stream.markSupported())&&(__CLR4_5_218718zm68iyfyy.R.iget(1675)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1676)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1677);stream = new BufferedInputStream(stream);
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(1678);DataInputStream distream = new DataInputStream(stream);

        __CLR4_5_218718zm68iyfyy.R.inc(1679);if ((((decodeParam == null)&&(__CLR4_5_218718zm68iyfyy.R.iget(1680)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1681)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1682);decodeParam = new PNGDecodeParam();
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(1683);this.decodeParam = decodeParam;

        // Get parameter values
        __CLR4_5_218718zm68iyfyy.R.inc(1684);this.suppressAlpha = decodeParam.getSuppressAlpha();
        __CLR4_5_218718zm68iyfyy.R.inc(1685);this.expandPalette = decodeParam.getExpandPalette();
        __CLR4_5_218718zm68iyfyy.R.inc(1686);this.output8BitGray = decodeParam.getOutput8BitGray();
        __CLR4_5_218718zm68iyfyy.R.inc(1687);this.expandGrayAlpha = decodeParam.getExpandGrayAlpha();
        __CLR4_5_218718zm68iyfyy.R.inc(1688);if ((((decodeParam.getPerformGammaCorrection())&&(__CLR4_5_218718zm68iyfyy.R.iget(1689)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1690)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1691);this.userExponent = decodeParam.getUserExponent();
            __CLR4_5_218718zm68iyfyy.R.inc(1692);this.displayExponent = decodeParam.getDisplayExponent();
            __CLR4_5_218718zm68iyfyy.R.inc(1693);performGammaCorrection = true;
            __CLR4_5_218718zm68iyfyy.R.inc(1694);output8BitGray = true;
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(1695);this.generateEncodeParam = decodeParam.getGenerateEncodeParam();

        __CLR4_5_218718zm68iyfyy.R.inc(1696);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(1697)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1698)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1699);properties.put("file_type", "PNG v. 1.0");
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(1700);try {
            __CLR4_5_218718zm68iyfyy.R.inc(1701);long magic = distream.readLong();
            __CLR4_5_218718zm68iyfyy.R.inc(1702);if ((((magic != PNG_SIGNATURE)&&(__CLR4_5_218718zm68iyfyy.R.iget(1703)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1704)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1705);String msg = PropertyUtil.getString("PNGImageDecoder0");
                __CLR4_5_218718zm68iyfyy.R.inc(1706);throw new RuntimeException(msg);
            }
        }} catch (IOException ioe) {
            __CLR4_5_218718zm68iyfyy.R.inc(1707);ioe.printStackTrace();
            __CLR4_5_218718zm68iyfyy.R.inc(1708);String msg = PropertyUtil.getString("PNGImageDecoder1");
            __CLR4_5_218718zm68iyfyy.R.inc(1709);throw new RuntimeException(msg);
        }

        __CLR4_5_218718zm68iyfyy.R.inc(1710);do {{
//            try {
                __CLR4_5_218718zm68iyfyy.R.inc(1711);PNGChunk chunk;

                __CLR4_5_218718zm68iyfyy.R.inc(1712);String chunkType = PNGChunk.getChunkType(distream);
                __CLR4_5_218718zm68iyfyy.R.inc(1713);if ((((chunkType.equals(PNGChunk.ChunkType.IHDR.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1714)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1715)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1716);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1717);parse_IHDR_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1718);if ((((chunkType.equals(PNGChunk.ChunkType.PLTE.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1719)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1720)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1721);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1722);parse_PLTE_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1723);if ((((chunkType.equals(PNGChunk.ChunkType.IDAT.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1724)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1725)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1726);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1727);streamVec.add(new ByteArrayInputStream(chunk.getData()));
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1728);if ((((chunkType.equals(PNGChunk.ChunkType.IEND.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1729)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1730)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1731);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1732);try {
                        __CLR4_5_218718zm68iyfyy.R.inc(1733);parse_IEND_chunk(chunk);
                    } catch (Exception e) {
                        __CLR4_5_218718zm68iyfyy.R.inc(1734);e.printStackTrace();
                        __CLR4_5_218718zm68iyfyy.R.inc(1735);String msg = PropertyUtil.getString("PNGImageDecoder2");
                        __CLR4_5_218718zm68iyfyy.R.inc(1736);throw new RuntimeException(msg);
                    }
                    __CLR4_5_218718zm68iyfyy.R.inc(1737);break; // fall through to the bottom
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1738);if ((((chunkType.equals(PNGChunk.ChunkType.bKGD.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1739)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1740)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1741);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1742);parse_bKGD_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1743);if ((((chunkType.equals(PNGChunk.ChunkType.cHRM.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1744)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1745)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1746);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1747);parse_cHRM_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1748);if ((((chunkType.equals(PNGChunk.ChunkType.gAMA.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1749)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1750)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1751);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1752);parse_gAMA_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1753);if ((((chunkType.equals(PNGChunk.ChunkType.hIST.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1754)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1755)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1756);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1757);parse_hIST_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1758);if ((((chunkType.equals(PNGChunk.ChunkType.iCCP.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1759)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1760)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1761);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1762);parse_iCCP_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1763);if ((((chunkType.equals(PNGChunk.ChunkType.pHYs.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1764)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1765)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1766);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1767);parse_pHYs_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1768);if ((((chunkType.equals(PNGChunk.ChunkType.sBIT.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1769)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1770)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1771);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1772);parse_sBIT_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1773);if ((((chunkType.equals(PNGChunk.ChunkType.sRGB.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1774)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1775)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1776);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1777);parse_sRGB_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1778);if ((((chunkType.equals(PNGChunk.ChunkType.tEXt.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1779)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1780)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1781);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1782);parse_tEXt_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1783);if ((((chunkType.equals(PNGChunk.ChunkType.tIME.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1784)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1785)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1786);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1787);parse_tIME_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1788);if ((((chunkType.equals(PNGChunk.ChunkType.tRNS.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1789)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1790)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1791);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1792);parse_tRNS_chunk(chunk);
                } }else {__CLR4_5_218718zm68iyfyy.R.inc(1793);if ((((chunkType.equals(PNGChunk.ChunkType.zTXt.name()))&&(__CLR4_5_218718zm68iyfyy.R.iget(1794)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1795)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1796);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_218718zm68iyfyy.R.inc(1797);parse_zTXt_chunk(chunk);
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1798);chunk = PNGChunk.readChunk(distream);
                    // Output the chunk data in raw form

                    __CLR4_5_218718zm68iyfyy.R.inc(1799);String type = chunk.getTypeString();
                    __CLR4_5_218718zm68iyfyy.R.inc(1800);byte[] data = chunk.getData();
                    __CLR4_5_218718zm68iyfyy.R.inc(1801);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(1802)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1803)==0&false))) {{
                        __CLR4_5_218718zm68iyfyy.R.inc(1804);encodeParam.addPrivateChunk(type, data);
                    }
                    }__CLR4_5_218718zm68iyfyy.R.inc(1805);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(1806)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1807)==0&false))) {{
                        __CLR4_5_218718zm68iyfyy.R.inc(1808);String key = "chunk_" + chunkIndex++ + ':' + type;
                        __CLR4_5_218718zm68iyfyy.R.inc(1809);properties.put(key.toLowerCase(Locale.getDefault()), data);
                    }
                }}
//            } catch (Exception e) {
//                e.printStackTrace();
//                String msg = PropertyUtil.getString("PNGImageDecoder2");
//                throw new RuntimeException(msg);
//            }
        }}}}}}}}}}}}}}}}} }while (true);

        // Final post-processing

        __CLR4_5_218718zm68iyfyy.R.inc(1810);if ((((significantBits == null)&&(__CLR4_5_218718zm68iyfyy.R.iget(1811)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1812)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1813);significantBits = new int[inputBands];
            __CLR4_5_218718zm68iyfyy.R.inc(1814);for (int i = 0; (((i < inputBands)&&(__CLR4_5_218718zm68iyfyy.R.iget(1815)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1816)==0&false)); i++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1817);significantBits[i] = bitDepth;
            }

            }__CLR4_5_218718zm68iyfyy.R.inc(1818);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(1819)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1820)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1821);properties.put("significant_bits", significantBits);
            }
        }}
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_IHDR_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(1822);
        __CLR4_5_218718zm68iyfyy.R.inc(1823);tileWidth = width = chunk.getInt4(0);
        __CLR4_5_218718zm68iyfyy.R.inc(1824);tileHeight = height = chunk.getInt4(4);

        __CLR4_5_218718zm68iyfyy.R.inc(1825);bitDepth = chunk.getInt1(8);

        __CLR4_5_218718zm68iyfyy.R.inc(1826);if (((((bitDepth != 1) && (bitDepth != 2) && (bitDepth != 4)
            && (bitDepth != 8) && (bitDepth != 16))&&(__CLR4_5_218718zm68iyfyy.R.iget(1827)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1828)==0&false))) {{
            // Error -- bad bit depth
            __CLR4_5_218718zm68iyfyy.R.inc(1829);String msg = PropertyUtil.getString("PNGImageDecoder3");
            __CLR4_5_218718zm68iyfyy.R.inc(1830);throw new RuntimeException(msg);
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(1831);maxOpacity = (1 << bitDepth) - 1;

        __CLR4_5_218718zm68iyfyy.R.inc(1832);colorType = chunk.getInt1(9);
        __CLR4_5_218718zm68iyfyy.R.inc(1833);if (((((colorType != PNG_COLOR_GRAY)
            && (colorType != PNG_COLOR_RGB)
            && (colorType != PNG_COLOR_PALETTE)
            && (colorType != PNG_COLOR_GRAY_ALPHA)
            && (colorType != PNG_COLOR_RGB_ALPHA))&&(__CLR4_5_218718zm68iyfyy.R.iget(1834)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1835)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1836);System.out.println(PropertyUtil.getString("PNGImageDecoder4"));
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(1837);if (((((colorType == PNG_COLOR_RGB) && (bitDepth < 8))&&(__CLR4_5_218718zm68iyfyy.R.iget(1838)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1839)==0&false))) {{
            // Error -- RGB images must have 8 or 16 bits
            __CLR4_5_218718zm68iyfyy.R.inc(1840);String msg = PropertyUtil.getString("PNGImageDecoder5");
            __CLR4_5_218718zm68iyfyy.R.inc(1841);throw new RuntimeException(msg);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(1842);if (((((colorType == PNG_COLOR_PALETTE) && (bitDepth == 16))&&(__CLR4_5_218718zm68iyfyy.R.iget(1843)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1844)==0&false))) {{
            // Error -- palette images must have < 16 bits
            __CLR4_5_218718zm68iyfyy.R.inc(1845);String msg = PropertyUtil.getString("PNGImageDecoder6");
            __CLR4_5_218718zm68iyfyy.R.inc(1846);throw new RuntimeException(msg);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(1847);if (((((colorType == PNG_COLOR_GRAY_ALPHA) && (bitDepth < 8))&&(__CLR4_5_218718zm68iyfyy.R.iget(1848)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1849)==0&false))) {{
            // Error -- gray/alpha images must have >= 8 bits
            __CLR4_5_218718zm68iyfyy.R.inc(1850);String msg = PropertyUtil.getString("PNGImageDecoder7");
            __CLR4_5_218718zm68iyfyy.R.inc(1851);throw new RuntimeException(msg);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(1852);if (((((colorType == PNG_COLOR_RGB_ALPHA) && (bitDepth < 8))&&(__CLR4_5_218718zm68iyfyy.R.iget(1853)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1854)==0&false))) {{
            // Error -- RGB/alpha images must have >= 8 bits
            __CLR4_5_218718zm68iyfyy.R.inc(1855);String msg = PropertyUtil.getString("PNGImageDecoder8");
            __CLR4_5_218718zm68iyfyy.R.inc(1856);throw new RuntimeException(msg);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(1857);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(1858)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1859)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1860);properties.put("color_type", colorTypeNames[colorType]);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(1861);if ((((generateEncodeParam)&&(__CLR4_5_218718zm68iyfyy.R.iget(1862)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1863)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1864);if ((((colorType == PNG_COLOR_PALETTE)&&(__CLR4_5_218718zm68iyfyy.R.iget(1865)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1866)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1867);encodeParam = new PNGEncodeParam.Palette();
            } }else {__CLR4_5_218718zm68iyfyy.R.inc(1868);if ((((colorType == PNG_COLOR_GRAY
                       || colorType == PNG_COLOR_GRAY_ALPHA)&&(__CLR4_5_218718zm68iyfyy.R.iget(1869)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1870)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1871);encodeParam = new PNGEncodeParam.Gray();
            } }else {{
                __CLR4_5_218718zm68iyfyy.R.inc(1872);encodeParam = new PNGEncodeParam.RGB();
            }
            }}__CLR4_5_218718zm68iyfyy.R.inc(1873);decodeParam.setEncodeParam(encodeParam);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(1874);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(1875)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1876)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1877);encodeParam.setBitDepth(bitDepth);
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(1878);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(1879)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1880)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1881);properties.put("bit_depth", bitDepth);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(1882);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(1883)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1884)==0&false))) {{
            // Assume file gamma is 1/2.2 unless we get a gAMA chunk
            __CLR4_5_218718zm68iyfyy.R.inc(1885);float gamma = (1.0F / 2.2F) * (displayExponent / userExponent);
            __CLR4_5_218718zm68iyfyy.R.inc(1886);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(1887)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1888)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1889);encodeParam.setGamma(gamma);
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(1890);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(1891)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1892)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1893);properties.put("gamma", gamma);
            }
        }}

        }__CLR4_5_218718zm68iyfyy.R.inc(1894);compressionMethod = chunk.getInt1(10);
        __CLR4_5_218718zm68iyfyy.R.inc(1895);if ((((compressionMethod != 0)&&(__CLR4_5_218718zm68iyfyy.R.iget(1896)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1897)==0&false))) {{
            // Error -- only know about compression method 0
            __CLR4_5_218718zm68iyfyy.R.inc(1898);String msg = PropertyUtil.getString("PNGImageDecoder9");
            __CLR4_5_218718zm68iyfyy.R.inc(1899);throw new RuntimeException(msg);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(1900);filterMethod = chunk.getInt1(11);
        __CLR4_5_218718zm68iyfyy.R.inc(1901);if ((((filterMethod != 0)&&(__CLR4_5_218718zm68iyfyy.R.iget(1902)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1903)==0&false))) {{
            // Error -- only know about filter method 0
            __CLR4_5_218718zm68iyfyy.R.inc(1904);String msg = PropertyUtil.getString("PNGImageDecoder10");
            __CLR4_5_218718zm68iyfyy.R.inc(1905);throw new RuntimeException(msg);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(1906);interlaceMethod = chunk.getInt1(12);
        __CLR4_5_218718zm68iyfyy.R.inc(1907);if ((((interlaceMethod == 0)&&(__CLR4_5_218718zm68iyfyy.R.iget(1908)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1909)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1910);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(1911)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1912)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1913);encodeParam.setInterlacing(false);
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(1914);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(1915)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1916)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1917);properties.put("interlace_method", "None");
            }
        }} }else {__CLR4_5_218718zm68iyfyy.R.inc(1918);if ((((interlaceMethod == 1)&&(__CLR4_5_218718zm68iyfyy.R.iget(1919)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1920)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(1921);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(1922)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1923)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1924);encodeParam.setInterlacing(true);
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(1925);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(1926)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1927)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1928);properties.put("interlace_method", "Adam7");
            }
        }} }else {{
            // Error -- only know about Adam7 interlacing
            __CLR4_5_218718zm68iyfyy.R.inc(1929);String msg = PropertyUtil.getString("PNGImageDecoder11");
            __CLR4_5_218718zm68iyfyy.R.inc(1930);throw new RuntimeException(msg);
        }

        }}__CLR4_5_218718zm68iyfyy.R.inc(1931);bytesPerPixel = ((((bitDepth == 16) )&&(__CLR4_5_218718zm68iyfyy.R.iget(1932)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1933)==0&false))? 2 : 1;

        boolean __CLB4_5_2_bool0=false;__CLR4_5_218718zm68iyfyy.R.inc(1934);switch (colorType) {
        case PNG_COLOR_GRAY:if (!__CLB4_5_2_bool0) {__CLR4_5_218718zm68iyfyy.R.inc(1935);__CLB4_5_2_bool0=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(1936);inputBands = 1;
            __CLR4_5_218718zm68iyfyy.R.inc(1937);outputBands = 1;

            __CLR4_5_218718zm68iyfyy.R.inc(1938);if ((((output8BitGray && (bitDepth < 8))&&(__CLR4_5_218718zm68iyfyy.R.iget(1939)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1940)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1941);postProcess = POST_GRAY_LUT;
            } }else {__CLR4_5_218718zm68iyfyy.R.inc(1942);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(1943)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1944)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1945);postProcess = POST_GAMMA;
            } }else {{
                __CLR4_5_218718zm68iyfyy.R.inc(1946);postProcess = POST_NONE;
            }
            }}__CLR4_5_218718zm68iyfyy.R.inc(1947);break;

        case PNG_COLOR_RGB:if (!__CLB4_5_2_bool0) {__CLR4_5_218718zm68iyfyy.R.inc(1948);__CLB4_5_2_bool0=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(1949);inputBands = 3;
            __CLR4_5_218718zm68iyfyy.R.inc(1950);bytesPerPixel *= 3;
            __CLR4_5_218718zm68iyfyy.R.inc(1951);outputBands = 3;

            __CLR4_5_218718zm68iyfyy.R.inc(1952);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(1953)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1954)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1955);postProcess = POST_GAMMA;
            } }else {{
                __CLR4_5_218718zm68iyfyy.R.inc(1956);postProcess = POST_NONE;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(1957);break;

        case PNG_COLOR_PALETTE:if (!__CLB4_5_2_bool0) {__CLR4_5_218718zm68iyfyy.R.inc(1958);__CLB4_5_2_bool0=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(1959);inputBands = 1;
            __CLR4_5_218718zm68iyfyy.R.inc(1960);bytesPerPixel = 1;
            __CLR4_5_218718zm68iyfyy.R.inc(1961);outputBands = (((expandPalette )&&(__CLR4_5_218718zm68iyfyy.R.iget(1962)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1963)==0&false))? 3 : 1;

            __CLR4_5_218718zm68iyfyy.R.inc(1964);if ((((expandPalette)&&(__CLR4_5_218718zm68iyfyy.R.iget(1965)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1966)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1967);postProcess = POST_PALETTE_TO_RGB;
            } }else {{
                __CLR4_5_218718zm68iyfyy.R.inc(1968);postProcess = POST_NONE;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(1969);break;

        case PNG_COLOR_GRAY_ALPHA:if (!__CLB4_5_2_bool0) {__CLR4_5_218718zm68iyfyy.R.inc(1970);__CLB4_5_2_bool0=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(1971);inputBands = 2;
            __CLR4_5_218718zm68iyfyy.R.inc(1972);bytesPerPixel *= 2;

            __CLR4_5_218718zm68iyfyy.R.inc(1973);if ((((suppressAlpha)&&(__CLR4_5_218718zm68iyfyy.R.iget(1974)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1975)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1976);outputBands = 1;
                __CLR4_5_218718zm68iyfyy.R.inc(1977);postProcess = POST_REMOVE_GRAY_TRANS;
            } }else {{
                __CLR4_5_218718zm68iyfyy.R.inc(1978);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(1979)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1980)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1981);postProcess = POST_GAMMA;
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1982);postProcess = POST_NONE;
                }
                }__CLR4_5_218718zm68iyfyy.R.inc(1983);if ((((expandGrayAlpha)&&(__CLR4_5_218718zm68iyfyy.R.iget(1984)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1985)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1986);postProcess |= POST_EXP_MASK;
                    __CLR4_5_218718zm68iyfyy.R.inc(1987);outputBands = 4;
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(1988);outputBands = 2;
                }
            }}
            }__CLR4_5_218718zm68iyfyy.R.inc(1989);break;

        case PNG_COLOR_RGB_ALPHA:if (!__CLB4_5_2_bool0) {__CLR4_5_218718zm68iyfyy.R.inc(1990);__CLB4_5_2_bool0=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(1991);inputBands = 4;
            __CLR4_5_218718zm68iyfyy.R.inc(1992);bytesPerPixel *= 4;
            __CLR4_5_218718zm68iyfyy.R.inc(1993);outputBands = ((((!suppressAlpha) )&&(__CLR4_5_218718zm68iyfyy.R.iget(1994)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1995)==0&false))? 4 : 3;

            __CLR4_5_218718zm68iyfyy.R.inc(1996);if ((((suppressAlpha)&&(__CLR4_5_218718zm68iyfyy.R.iget(1997)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(1998)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(1999);postProcess = POST_REMOVE_RGB_TRANS;
            } }else {__CLR4_5_218718zm68iyfyy.R.inc(2000);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(2001)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2002)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2003);postProcess = POST_GAMMA;
            } }else {{
                __CLR4_5_218718zm68iyfyy.R.inc(2004);postProcess = POST_NONE;
            }
            }}__CLR4_5_218718zm68iyfyy.R.inc(2005);break;
        }
    }finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_IEND_chunk(PNGChunk chunk) throws Exception {try{__CLR4_5_218718zm68iyfyy.R.inc(2006);
        // Store text strings
        __CLR4_5_218718zm68iyfyy.R.inc(2007);int textLen = textKeys.size();
        __CLR4_5_218718zm68iyfyy.R.inc(2008);String[] textArray = new String[2 * textLen];
        __CLR4_5_218718zm68iyfyy.R.inc(2009);for (int i = 0; (((i < textLen)&&(__CLR4_5_218718zm68iyfyy.R.iget(2010)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2011)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2012);String key = (String)textKeys.get(i);
            __CLR4_5_218718zm68iyfyy.R.inc(2013);String val = (String)textStrings.get(i);
            __CLR4_5_218718zm68iyfyy.R.inc(2014);textArray[2 * i] = key;
            __CLR4_5_218718zm68iyfyy.R.inc(2015);textArray[2 * i + 1] = val;
            __CLR4_5_218718zm68iyfyy.R.inc(2016);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(2017)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2018)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2019);String uniqueKey = "text_" + i + ':' + key;
                __CLR4_5_218718zm68iyfyy.R.inc(2020);properties.put(uniqueKey.toLowerCase(Locale.getDefault()), val);
            }
        }}
        }__CLR4_5_218718zm68iyfyy.R.inc(2021);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2022)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2023)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2024);encodeParam.setText(textArray);
        }

        // Store compressed text strings
        }__CLR4_5_218718zm68iyfyy.R.inc(2025);int ztextLen = ztextKeys.size();
        __CLR4_5_218718zm68iyfyy.R.inc(2026);String[] ztextArray = new String[2 * ztextLen];
        __CLR4_5_218718zm68iyfyy.R.inc(2027);for (int i = 0; (((i < ztextLen)&&(__CLR4_5_218718zm68iyfyy.R.iget(2028)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2029)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2030);String key = (String)ztextKeys.get(i);
            __CLR4_5_218718zm68iyfyy.R.inc(2031);String val = (String)ztextStrings.get(i);
            __CLR4_5_218718zm68iyfyy.R.inc(2032);ztextArray[2 * i] = key;
            __CLR4_5_218718zm68iyfyy.R.inc(2033);ztextArray[2 * i + 1] = val;
            __CLR4_5_218718zm68iyfyy.R.inc(2034);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(2035)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2036)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2037);String uniqueKey = "ztext_" + i + ':' + key;
                __CLR4_5_218718zm68iyfyy.R.inc(2038);properties.put(uniqueKey.toLowerCase(Locale.getDefault()), val);
            }
        }}
        }__CLR4_5_218718zm68iyfyy.R.inc(2039);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2040)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2041)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2042);encodeParam.setCompressedText(ztextArray);
        }

        // Parse prior IDAT chunks
        }__CLR4_5_218718zm68iyfyy.R.inc(2043);InputStream seqStream =
            new SequenceInputStream(Collections.enumeration(streamVec));
        __CLR4_5_218718zm68iyfyy.R.inc(2044);InputStream infStream =
            new InflaterInputStream(seqStream, new Inflater());
        __CLR4_5_218718zm68iyfyy.R.inc(2045);dataStream = new DataInputStream(infStream);

        // Create an empty WritableRaster
        __CLR4_5_218718zm68iyfyy.R.inc(2046);int depth = bitDepth;
        __CLR4_5_218718zm68iyfyy.R.inc(2047);if (((((colorType == PNG_COLOR_GRAY)
            && (bitDepth < 8) && output8BitGray)&&(__CLR4_5_218718zm68iyfyy.R.iget(2048)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2049)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2050);depth = 8;
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(2051);if (((((colorType == PNG_COLOR_PALETTE) && expandPalette)&&(__CLR4_5_218718zm68iyfyy.R.iget(2052)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2053)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2054);depth = 8;
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(2055);int bytesPerRow = (outputBands * width * depth + 7) / 8;
        __CLR4_5_218718zm68iyfyy.R.inc(2056);int scanlineStride =
            ((((depth == 16) )&&(__CLR4_5_218718zm68iyfyy.R.iget(2057)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2058)==0&false))? (bytesPerRow / 2) : bytesPerRow;

        __CLR4_5_218718zm68iyfyy.R.inc(2059);theTile = createRaster(width, height, outputBands,
                               scanlineStride,
                               depth);

        __CLR4_5_218718zm68iyfyy.R.inc(2060);if ((((performGammaCorrection && (gammaLut == null))&&(__CLR4_5_218718zm68iyfyy.R.iget(2061)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2062)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2063);initGammaLut(bitDepth);
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(2064);if (((((postProcess == POST_GRAY_LUT)
            || (postProcess == POST_GRAY_LUT_ADD_TRANS)
            || (postProcess == POST_GRAY_LUT_ADD_TRANS_EXP))&&(__CLR4_5_218718zm68iyfyy.R.iget(2065)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2066)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2067);initGrayLut(bitDepth);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(2068);decodeImage(interlaceMethod == 1);
        __CLR4_5_218718zm68iyfyy.R.inc(2069);sampleModel = theTile.getSampleModel();

        __CLR4_5_218718zm68iyfyy.R.inc(2070);if (((((colorType == PNG_COLOR_PALETTE) && !expandPalette)&&(__CLR4_5_218718zm68iyfyy.R.iget(2071)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2072)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2073);if ((((outputHasAlphaPalette)&&(__CLR4_5_218718zm68iyfyy.R.iget(2074)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2075)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2076);colorModel = new IndexColorModel(bitDepth,
                                                 paletteEntries,
                                                 redPalette,
                                                 greenPalette,
                                                 bluePalette,
                                                 alphaPalette);
            } }else {{
                __CLR4_5_218718zm68iyfyy.R.inc(2077);colorModel = new IndexColorModel(bitDepth,
                                                 paletteEntries,
                                                 redPalette,
                                                 greenPalette,
                                                 bluePalette);
            }
        }} }else {__CLR4_5_218718zm68iyfyy.R.inc(2078);if (((((colorType == PNG_COLOR_GRAY)
                   && (bitDepth < 8) && !output8BitGray)&&(__CLR4_5_218718zm68iyfyy.R.iget(2079)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2080)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2081);byte[] palette = expandBits[bitDepth];
            __CLR4_5_218718zm68iyfyy.R.inc(2082);colorModel = new IndexColorModel(bitDepth,
                                             palette.length,
                                             palette,
                                             palette,
                                             palette);
        } }else {{
            __CLR4_5_218718zm68iyfyy.R.inc(2083);colorModel =
                createComponentColorModel(sampleModel);
        }
    }}}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

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
    public static ColorModel createComponentColorModel(SampleModel sm) {try{__CLR4_5_218718zm68iyfyy.R.inc(2084);
        __CLR4_5_218718zm68iyfyy.R.inc(2085);int type = sm.getDataType();
        __CLR4_5_218718zm68iyfyy.R.inc(2086);int bands = sm.getNumBands();
        __CLR4_5_218718zm68iyfyy.R.inc(2087);ComponentColorModel cm = null;

        __CLR4_5_218718zm68iyfyy.R.inc(2088);if ((((type == DataBuffer.TYPE_BYTE)&&(__CLR4_5_218718zm68iyfyy.R.iget(2089)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2090)==0&false))) {{
            boolean __CLB4_5_2_bool1=false;__CLR4_5_218718zm68iyfyy.R.inc(2091);switch (bands) {
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_218718zm68iyfyy.R.inc(2092);__CLB4_5_2_bool1=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2093);cm = colorModelGray8;
                __CLR4_5_218718zm68iyfyy.R.inc(2094);break;
            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_218718zm68iyfyy.R.inc(2095);__CLB4_5_2_bool1=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2096);cm = colorModelGrayAlpha8;
                __CLR4_5_218718zm68iyfyy.R.inc(2097);break;
            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_218718zm68iyfyy.R.inc(2098);__CLB4_5_2_bool1=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2099);cm = colorModelRGB8;
                __CLR4_5_218718zm68iyfyy.R.inc(2100);break;
            case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_218718zm68iyfyy.R.inc(2101);__CLB4_5_2_bool1=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2102);cm = colorModelRGBA8;
                __CLR4_5_218718zm68iyfyy.R.inc(2103);break;
            }
        } }else {__CLR4_5_218718zm68iyfyy.R.inc(2104);if ((((type == DataBuffer.TYPE_USHORT)&&(__CLR4_5_218718zm68iyfyy.R.iget(2105)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2106)==0&false))) {{
            boolean __CLB4_5_2_bool2=false;__CLR4_5_218718zm68iyfyy.R.inc(2107);switch (bands) {
            case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_218718zm68iyfyy.R.inc(2108);__CLB4_5_2_bool2=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2109);cm = colorModelGray16;
                __CLR4_5_218718zm68iyfyy.R.inc(2110);break;
            case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_218718zm68iyfyy.R.inc(2111);__CLB4_5_2_bool2=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2112);cm = colorModelGrayAlpha16;
                __CLR4_5_218718zm68iyfyy.R.inc(2113);break;
            case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_218718zm68iyfyy.R.inc(2114);__CLB4_5_2_bool2=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2115);cm = colorModelRGB16;
                __CLR4_5_218718zm68iyfyy.R.inc(2116);break;
            case 4:if (!__CLB4_5_2_bool2) {__CLR4_5_218718zm68iyfyy.R.inc(2117);__CLB4_5_2_bool2=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2118);cm = colorModelRGBA16;
                __CLR4_5_218718zm68iyfyy.R.inc(2119);break;
            }
        } }else {__CLR4_5_218718zm68iyfyy.R.inc(2120);if ((((type == DataBuffer.TYPE_INT)&&(__CLR4_5_218718zm68iyfyy.R.iget(2121)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2122)==0&false))) {{
            boolean __CLB4_5_2_bool3=false;__CLR4_5_218718zm68iyfyy.R.inc(2123);switch (bands) {
            case 1:if (!__CLB4_5_2_bool3) {__CLR4_5_218718zm68iyfyy.R.inc(2124);__CLB4_5_2_bool3=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2125);cm = colorModelGray32;
                __CLR4_5_218718zm68iyfyy.R.inc(2126);break;
            case 2:if (!__CLB4_5_2_bool3) {__CLR4_5_218718zm68iyfyy.R.inc(2127);__CLB4_5_2_bool3=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2128);cm = colorModelGrayAlpha32;
                __CLR4_5_218718zm68iyfyy.R.inc(2129);break;
            case 3:if (!__CLB4_5_2_bool3) {__CLR4_5_218718zm68iyfyy.R.inc(2130);__CLB4_5_2_bool3=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2131);cm = colorModelRGB32;
                __CLR4_5_218718zm68iyfyy.R.inc(2132);break;
            case 4:if (!__CLB4_5_2_bool3) {__CLR4_5_218718zm68iyfyy.R.inc(2133);__CLB4_5_2_bool3=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2134);cm = colorModelRGBA32;
                __CLR4_5_218718zm68iyfyy.R.inc(2135);break;
            }
        }

        }}}__CLR4_5_218718zm68iyfyy.R.inc(2136);return cm;
    }finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_PLTE_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2137);
        __CLR4_5_218718zm68iyfyy.R.inc(2138);paletteEntries = chunk.getLength() / 3;
        __CLR4_5_218718zm68iyfyy.R.inc(2139);redPalette = new byte[paletteEntries];
        __CLR4_5_218718zm68iyfyy.R.inc(2140);greenPalette = new byte[paletteEntries];
        __CLR4_5_218718zm68iyfyy.R.inc(2141);bluePalette = new byte[paletteEntries];

        __CLR4_5_218718zm68iyfyy.R.inc(2142);int pltIndex = 0;

        // gAMA chunk must precede PLTE chunk
        __CLR4_5_218718zm68iyfyy.R.inc(2143);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(2144)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2145)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2146);if ((((gammaLut == null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2147)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2148)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2149);initGammaLut((((bitDepth == 16 )&&(__CLR4_5_218718zm68iyfyy.R.iget(2150)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2151)==0&false))? 16 : 8);
            }

            }__CLR4_5_218718zm68iyfyy.R.inc(2152);for (int i = 0; (((i < paletteEntries)&&(__CLR4_5_218718zm68iyfyy.R.iget(2153)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2154)==0&false)); i++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2155);byte r = chunk.getByte(pltIndex++);
                __CLR4_5_218718zm68iyfyy.R.inc(2156);byte g = chunk.getByte(pltIndex++);
                __CLR4_5_218718zm68iyfyy.R.inc(2157);byte b = chunk.getByte(pltIndex++);

                __CLR4_5_218718zm68iyfyy.R.inc(2158);redPalette[i] = (byte)gammaLut[r & 0xff];
                __CLR4_5_218718zm68iyfyy.R.inc(2159);greenPalette[i] = (byte)gammaLut[g & 0xff];
                __CLR4_5_218718zm68iyfyy.R.inc(2160);bluePalette[i] = (byte)gammaLut[b & 0xff];
            }
        }} }else {{
            __CLR4_5_218718zm68iyfyy.R.inc(2161);for (int i = 0; (((i < paletteEntries)&&(__CLR4_5_218718zm68iyfyy.R.iget(2162)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2163)==0&false)); i++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2164);redPalette[i] = chunk.getByte(pltIndex++);
                __CLR4_5_218718zm68iyfyy.R.inc(2165);greenPalette[i] = chunk.getByte(pltIndex++);
                __CLR4_5_218718zm68iyfyy.R.inc(2166);bluePalette[i] = chunk.getByte(pltIndex++);
            }
        }}
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_bKGD_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2167);
        boolean __CLB4_5_2_bool4=false;__CLR4_5_218718zm68iyfyy.R.inc(2168);switch (colorType) {
        case PNG_COLOR_PALETTE:if (!__CLB4_5_2_bool4) {__CLR4_5_218718zm68iyfyy.R.inc(2169);__CLB4_5_2_bool4=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2170);int bkgdIndex = chunk.getByte(0) & 0xff;

            __CLR4_5_218718zm68iyfyy.R.inc(2171);bkgdRed = redPalette[bkgdIndex] & 0xff;
            __CLR4_5_218718zm68iyfyy.R.inc(2172);bkgdGreen = greenPalette[bkgdIndex] & 0xff;
            __CLR4_5_218718zm68iyfyy.R.inc(2173);bkgdBlue = bluePalette[bkgdIndex] & 0xff;

            __CLR4_5_218718zm68iyfyy.R.inc(2174);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2175)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2176)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2177);((PNGEncodeParam.Palette)encodeParam).setBackgroundPaletteIndex(bkgdIndex);
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2178);break;
        case PNG_COLOR_GRAY:if (!__CLB4_5_2_bool4) {__CLR4_5_218718zm68iyfyy.R.inc(2179);__CLB4_5_2_bool4=true;} case PNG_COLOR_GRAY_ALPHA:if (!__CLB4_5_2_bool4) {__CLR4_5_218718zm68iyfyy.R.inc(2180);__CLB4_5_2_bool4=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2181);int bkgdGray = chunk.getInt2(0);
            __CLR4_5_218718zm68iyfyy.R.inc(2182);bkgdRed = bkgdGreen = bkgdBlue = bkgdGray;

            __CLR4_5_218718zm68iyfyy.R.inc(2183);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2184)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2185)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2186);((PNGEncodeParam.Gray)encodeParam).setBackgroundGray(bkgdGray);
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2187);break;
        case PNG_COLOR_RGB:if (!__CLB4_5_2_bool4) {__CLR4_5_218718zm68iyfyy.R.inc(2188);__CLB4_5_2_bool4=true;} case PNG_COLOR_RGB_ALPHA:if (!__CLB4_5_2_bool4) {__CLR4_5_218718zm68iyfyy.R.inc(2189);__CLB4_5_2_bool4=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2190);bkgdRed = chunk.getInt2(0);
            __CLR4_5_218718zm68iyfyy.R.inc(2191);bkgdGreen = chunk.getInt2(2);
            __CLR4_5_218718zm68iyfyy.R.inc(2192);bkgdBlue = chunk.getInt2(4);

            __CLR4_5_218718zm68iyfyy.R.inc(2193);int[] bkgdRGB = new int[3];
            __CLR4_5_218718zm68iyfyy.R.inc(2194);bkgdRGB[0] = bkgdRed;
            __CLR4_5_218718zm68iyfyy.R.inc(2195);bkgdRGB[1] = bkgdGreen;
            __CLR4_5_218718zm68iyfyy.R.inc(2196);bkgdRGB[2] = bkgdBlue;
            __CLR4_5_218718zm68iyfyy.R.inc(2197);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2198)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2199)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2200);((PNGEncodeParam.RGB)encodeParam).setBackgroundRGB(bkgdRGB);
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2201);break;
        }

        __CLR4_5_218718zm68iyfyy.R.inc(2202);int r = 0;
        __CLR4_5_218718zm68iyfyy.R.inc(2203);int g = 0;
        __CLR4_5_218718zm68iyfyy.R.inc(2204);int b = 0;
        __CLR4_5_218718zm68iyfyy.R.inc(2205);if ((((bitDepth < 8)&&(__CLR4_5_218718zm68iyfyy.R.iget(2206)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2207)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2208);r = expandBits[bitDepth][bkgdRed];
            __CLR4_5_218718zm68iyfyy.R.inc(2209);g = expandBits[bitDepth][bkgdGreen];
            __CLR4_5_218718zm68iyfyy.R.inc(2210);b = expandBits[bitDepth][bkgdBlue];
        } }else {__CLR4_5_218718zm68iyfyy.R.inc(2211);if ((((bitDepth == 8)&&(__CLR4_5_218718zm68iyfyy.R.iget(2212)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2213)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2214);r = bkgdRed;
            __CLR4_5_218718zm68iyfyy.R.inc(2215);g = bkgdGreen;
            __CLR4_5_218718zm68iyfyy.R.inc(2216);b = bkgdBlue;
        } }else {__CLR4_5_218718zm68iyfyy.R.inc(2217);if ((((bitDepth == 16)&&(__CLR4_5_218718zm68iyfyy.R.iget(2218)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2219)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2220);r = bkgdRed >> 8;
            __CLR4_5_218718zm68iyfyy.R.inc(2221);g = bkgdGreen >> 8;
            __CLR4_5_218718zm68iyfyy.R.inc(2222);b = bkgdBlue >> 8;
        }
        }}}__CLR4_5_218718zm68iyfyy.R.inc(2223);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(2224)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2225)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2226);properties.put("background_color", new Color(r, g, b));
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_cHRM_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2227);
        // If an sRGB chunk exists, ignore cHRM chunks
        __CLR4_5_218718zm68iyfyy.R.inc(2228);if ((((sRGBRenderingIntent != -1)&&(__CLR4_5_218718zm68iyfyy.R.iget(2229)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2230)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2231);return;
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(2232);chromaticity = new float[8];
        __CLR4_5_218718zm68iyfyy.R.inc(2233);chromaticity[0] = chunk.getInt4(0) / 100000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2234);chromaticity[1] = chunk.getInt4(4) / 100000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2235);chromaticity[2] = chunk.getInt4(8) / 100000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2236);chromaticity[3] = chunk.getInt4(12) / 100000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2237);chromaticity[4] = chunk.getInt4(16) / 100000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2238);chromaticity[5] = chunk.getInt4(20) / 100000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2239);chromaticity[6] = chunk.getInt4(24) / 100000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2240);chromaticity[7] = chunk.getInt4(28) / 100000.0F;

        __CLR4_5_218718zm68iyfyy.R.inc(2241);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2242)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2243)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2244);encodeParam.setChromaticity(chromaticity);
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(2245);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(2246)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2247)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2248);properties.put("white_point_x", chromaticity[0]);
            __CLR4_5_218718zm68iyfyy.R.inc(2249);properties.put("white_point_y", chromaticity[1]);
            __CLR4_5_218718zm68iyfyy.R.inc(2250);properties.put("red_x", chromaticity[2]);
            __CLR4_5_218718zm68iyfyy.R.inc(2251);properties.put("red_y", chromaticity[3]);
            __CLR4_5_218718zm68iyfyy.R.inc(2252);properties.put("green_x", chromaticity[4]);
            __CLR4_5_218718zm68iyfyy.R.inc(2253);properties.put("green_y", chromaticity[5]);
            __CLR4_5_218718zm68iyfyy.R.inc(2254);properties.put("blue_x", chromaticity[6]);
            __CLR4_5_218718zm68iyfyy.R.inc(2255);properties.put("blue_y", chromaticity[7]);
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_gAMA_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2256);
        // If an sRGB chunk exists, ignore gAMA chunks
        __CLR4_5_218718zm68iyfyy.R.inc(2257);if ((((sRGBRenderingIntent != -1)&&(__CLR4_5_218718zm68iyfyy.R.iget(2258)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2259)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2260);return;
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(2261);fileGamma = chunk.getInt4(0) / 100000.0F;

        __CLR4_5_218718zm68iyfyy.R.inc(2262);float exp =
            (((performGammaCorrection )&&(__CLR4_5_218718zm68iyfyy.R.iget(2263)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2264)==0&false))? displayExponent / userExponent : 1.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2265);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2266)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2267)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2268);encodeParam.setGamma(fileGamma * exp);
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(2269);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(2270)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2271)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2272);properties.put("gamma", fileGamma * exp);
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_hIST_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2273);
        __CLR4_5_218718zm68iyfyy.R.inc(2274);if ((((redPalette == null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2275)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2276)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2277);String msg = PropertyUtil.getString("PNGImageDecoder18");
            __CLR4_5_218718zm68iyfyy.R.inc(2278);throw new RuntimeException(msg);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(2279);int length = redPalette.length;
        __CLR4_5_218718zm68iyfyy.R.inc(2280);int[] hist = new int[length];
        __CLR4_5_218718zm68iyfyy.R.inc(2281);for (int i = 0; (((i < length)&&(__CLR4_5_218718zm68iyfyy.R.iget(2282)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2283)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2284);hist[i] = chunk.getInt2(2 * i);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(2285);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2286)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2287)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2288);encodeParam.setPaletteHistogram(hist);
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_iCCP_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2289);
//        String name = "";  // todo simplify this
//        byte b;

//        int textIndex = 0;
//        while ((b = chunk.getByte(textIndex++)) != 0) {
//            name += (char)b;
//        }
    }finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_pHYs_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2290);
        __CLR4_5_218718zm68iyfyy.R.inc(2291);xPixelsPerUnit = chunk.getInt4(0);
        __CLR4_5_218718zm68iyfyy.R.inc(2292);yPixelsPerUnit = chunk.getInt4(4);
        __CLR4_5_218718zm68iyfyy.R.inc(2293);unitSpecifier = chunk.getInt1(8);

        __CLR4_5_218718zm68iyfyy.R.inc(2294);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2295)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2296)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2297);encodeParam.setPhysicalDimension(xPixelsPerUnit,
                                             yPixelsPerUnit,
                                             unitSpecifier);
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(2298);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(2299)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2300)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2301);properties.put("x_pixels_per_unit", xPixelsPerUnit);
            __CLR4_5_218718zm68iyfyy.R.inc(2302);properties.put("y_pixels_per_unit", yPixelsPerUnit);
            __CLR4_5_218718zm68iyfyy.R.inc(2303);properties.put("pixel_aspect_ratio",
                    (float) xPixelsPerUnit / yPixelsPerUnit);
            __CLR4_5_218718zm68iyfyy.R.inc(2304);if ((((unitSpecifier == 1)&&(__CLR4_5_218718zm68iyfyy.R.iget(2305)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2306)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2307);properties.put("pixel_units", "Meters");
            } }else {__CLR4_5_218718zm68iyfyy.R.inc(2308);if ((((unitSpecifier != 0)&&(__CLR4_5_218718zm68iyfyy.R.iget(2309)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2310)==0&false))) {{
                // Error -- unit specifier must be 0 or 1
                __CLR4_5_218718zm68iyfyy.R.inc(2311);String msg = PropertyUtil.getString("PNGImageDecoder12");
                __CLR4_5_218718zm68iyfyy.R.inc(2312);throw new RuntimeException(msg);
            }
        }}}
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_sBIT_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2313);
        __CLR4_5_218718zm68iyfyy.R.inc(2314);if ((((colorType == PNG_COLOR_PALETTE)&&(__CLR4_5_218718zm68iyfyy.R.iget(2315)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2316)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2317);significantBits = new int[3];
        } }else {{
            __CLR4_5_218718zm68iyfyy.R.inc(2318);significantBits = new int[inputBands];
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(2319);for (int i = 0; (((i < significantBits.length)&&(__CLR4_5_218718zm68iyfyy.R.iget(2320)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2321)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2322);int bits = chunk.getByte(i);
            __CLR4_5_218718zm68iyfyy.R.inc(2323);int depth = ((((colorType == PNG_COLOR_PALETTE) )&&(__CLR4_5_218718zm68iyfyy.R.iget(2324)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2325)==0&false))? 8 : bitDepth;
            __CLR4_5_218718zm68iyfyy.R.inc(2326);if ((((bits <= 0 || bits > depth)&&(__CLR4_5_218718zm68iyfyy.R.iget(2327)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2328)==0&false))) {{
                // Error -- significant bits must be between 0 and
                // image bit depth.
                __CLR4_5_218718zm68iyfyy.R.inc(2329);String msg = PropertyUtil.getString("PNGImageDecoder13");
                __CLR4_5_218718zm68iyfyy.R.inc(2330);throw new RuntimeException(msg);
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2331);significantBits[i] = bits;
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(2332);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2333)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2334)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2335);encodeParam.setSignificantBits(significantBits);
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(2336);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(2337)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2338)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2339);properties.put("significant_bits", significantBits);
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_sRGB_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2340);
        __CLR4_5_218718zm68iyfyy.R.inc(2341);sRGBRenderingIntent = chunk.getByte(0);

        // The presence of an sRGB chunk implies particular
        // settings for gamma and chroma.
        __CLR4_5_218718zm68iyfyy.R.inc(2342);fileGamma = 45455 / 100000.0F;

        __CLR4_5_218718zm68iyfyy.R.inc(2343);chromaticity = new float[8];
        __CLR4_5_218718zm68iyfyy.R.inc(2344);chromaticity[0] = 31270 / 10000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2345);chromaticity[1] = 32900 / 10000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2346);chromaticity[2] = 64000 / 10000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2347);chromaticity[3] = 33000 / 10000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2348);chromaticity[4] = 30000 / 10000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2349);chromaticity[5] = 60000 / 10000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2350);chromaticity[6] = 15000 / 10000.0F;
        __CLR4_5_218718zm68iyfyy.R.inc(2351);chromaticity[7] =  6000 / 10000.0F;

        __CLR4_5_218718zm68iyfyy.R.inc(2352);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(2353)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2354)==0&false))) {{
            // File gamma is 1/2.2
            __CLR4_5_218718zm68iyfyy.R.inc(2355);float gamma = fileGamma * (displayExponent / userExponent);
            __CLR4_5_218718zm68iyfyy.R.inc(2356);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2357)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2358)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2359);encodeParam.setGamma(gamma);
                __CLR4_5_218718zm68iyfyy.R.inc(2360);encodeParam.setChromaticity(chromaticity);
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2361);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(2362)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2363)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2364);properties.put("gamma", gamma);
                __CLR4_5_218718zm68iyfyy.R.inc(2365);properties.put("white_point_x", chromaticity[0]);
                __CLR4_5_218718zm68iyfyy.R.inc(2366);properties.put("white_point_y", chromaticity[1]);
                __CLR4_5_218718zm68iyfyy.R.inc(2367);properties.put("red_x", chromaticity[2]);
                __CLR4_5_218718zm68iyfyy.R.inc(2368);properties.put("red_y", chromaticity[3]);
                __CLR4_5_218718zm68iyfyy.R.inc(2369);properties.put("green_x", chromaticity[4]);
                __CLR4_5_218718zm68iyfyy.R.inc(2370);properties.put("green_y", chromaticity[5]);
                __CLR4_5_218718zm68iyfyy.R.inc(2371);properties.put("blue_x", chromaticity[6]);
                __CLR4_5_218718zm68iyfyy.R.inc(2372);properties.put("blue_y", chromaticity[7]);
            }
        }}
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_tEXt_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2373);

        __CLR4_5_218718zm68iyfyy.R.inc(2374);byte b;
        __CLR4_5_218718zm68iyfyy.R.inc(2375);StringBuffer key = new StringBuffer();
        __CLR4_5_218718zm68iyfyy.R.inc(2376);int textIndex = 0;
        __CLR4_5_218718zm68iyfyy.R.inc(2377);while ((b = chunk.getByte(textIndex++)) != 0) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2380);key.append((char)b);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(2381);StringBuilder value = new StringBuilder();
        __CLR4_5_218718zm68iyfyy.R.inc(2382);for (int i = textIndex; (((i < chunk.getLength())&&(__CLR4_5_218718zm68iyfyy.R.iget(2383)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2384)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2385);value.append((char)chunk.getByte(i));
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(2386);textKeys.add(key.toString());
        __CLR4_5_218718zm68iyfyy.R.inc(2387);textStrings.add(value.toString());
    }finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_tIME_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2388);
        __CLR4_5_218718zm68iyfyy.R.inc(2389);int year = chunk.getInt2(0);
        __CLR4_5_218718zm68iyfyy.R.inc(2390);int month = chunk.getInt1(2) - 1;
        __CLR4_5_218718zm68iyfyy.R.inc(2391);int day = chunk.getInt1(3);
        __CLR4_5_218718zm68iyfyy.R.inc(2392);int hour = chunk.getInt1(4);
        __CLR4_5_218718zm68iyfyy.R.inc(2393);int minute = chunk.getInt1(5);
        __CLR4_5_218718zm68iyfyy.R.inc(2394);int second = chunk.getInt1(6);

        __CLR4_5_218718zm68iyfyy.R.inc(2395);TimeZone gmt = TimeZone.getTimeZone("GMT");

        __CLR4_5_218718zm68iyfyy.R.inc(2396);GregorianCalendar cal = new GregorianCalendar(gmt);
        __CLR4_5_218718zm68iyfyy.R.inc(2397);cal.set(year, month, day,
                hour, minute, second);
        __CLR4_5_218718zm68iyfyy.R.inc(2398);Date date = cal.getTime();

        __CLR4_5_218718zm68iyfyy.R.inc(2399);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2400)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2401)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2402);encodeParam.setModificationTime(date);
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(2403);if ((((emitProperties)&&(__CLR4_5_218718zm68iyfyy.R.iget(2404)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2405)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2406);properties.put("timestamp", date);
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_tRNS_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2407);
        __CLR4_5_218718zm68iyfyy.R.inc(2408);if ((((colorType == PNG_COLOR_PALETTE)&&(__CLR4_5_218718zm68iyfyy.R.iget(2409)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2410)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2411);int entries = chunk.getLength();
            __CLR4_5_218718zm68iyfyy.R.inc(2412);if ((((entries > paletteEntries)&&(__CLR4_5_218718zm68iyfyy.R.iget(2413)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2414)==0&false))) {{
                // Error -- mustn't have more alpha than RGB palette entries
                __CLR4_5_218718zm68iyfyy.R.inc(2415);String msg = PropertyUtil.getString("PNGImageDecoder14");
                __CLR4_5_218718zm68iyfyy.R.inc(2416);throw new RuntimeException(msg);
            }

            // Load beginning of palette from the chunk
            }__CLR4_5_218718zm68iyfyy.R.inc(2417);alphaPalette = new byte[paletteEntries];
            __CLR4_5_218718zm68iyfyy.R.inc(2418);for (int i = 0; (((i < entries)&&(__CLR4_5_218718zm68iyfyy.R.iget(2419)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2420)==0&false)); i++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2421);alphaPalette[i] = chunk.getByte(i);
            }

            // Fill rest of palette with 255
            }__CLR4_5_218718zm68iyfyy.R.inc(2422);for (int i = entries; (((i < paletteEntries)&&(__CLR4_5_218718zm68iyfyy.R.iget(2423)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2424)==0&false)); i++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2425);alphaPalette[i] = (byte)255;
            }

            }__CLR4_5_218718zm68iyfyy.R.inc(2426);if ((((!suppressAlpha)&&(__CLR4_5_218718zm68iyfyy.R.iget(2427)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2428)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2429);if ((((expandPalette)&&(__CLR4_5_218718zm68iyfyy.R.iget(2430)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2431)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2432);postProcess = POST_PALETTE_TO_RGBA;
                    __CLR4_5_218718zm68iyfyy.R.inc(2433);outputBands = 4;
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2434);outputHasAlphaPalette = true;
                }
            }}
        }} }else {__CLR4_5_218718zm68iyfyy.R.inc(2435);if ((((colorType == PNG_COLOR_GRAY)&&(__CLR4_5_218718zm68iyfyy.R.iget(2436)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2437)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2438);grayTransparentAlpha = chunk.getInt2(0);

            __CLR4_5_218718zm68iyfyy.R.inc(2439);if ((((!suppressAlpha)&&(__CLR4_5_218718zm68iyfyy.R.iget(2440)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2441)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2442);if ((((bitDepth < 8)&&(__CLR4_5_218718zm68iyfyy.R.iget(2443)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2444)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2445);output8BitGray = true;
                    __CLR4_5_218718zm68iyfyy.R.inc(2446);maxOpacity = 255;
                    __CLR4_5_218718zm68iyfyy.R.inc(2447);postProcess = POST_GRAY_LUT_ADD_TRANS;
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2448);postProcess = POST_ADD_GRAY_TRANS;
                }

                }__CLR4_5_218718zm68iyfyy.R.inc(2449);if ((((expandGrayAlpha)&&(__CLR4_5_218718zm68iyfyy.R.iget(2450)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2451)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2452);outputBands = 4;
                    __CLR4_5_218718zm68iyfyy.R.inc(2453);postProcess |= POST_EXP_MASK;
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2454);outputBands = 2;
                }

                }__CLR4_5_218718zm68iyfyy.R.inc(2455);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2456)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2457)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2458);((PNGEncodeParam.Gray)encodeParam).setTransparentGray(grayTransparentAlpha);
                }
            }}
        }} }else {__CLR4_5_218718zm68iyfyy.R.inc(2459);if ((((colorType == PNG_COLOR_RGB)&&(__CLR4_5_218718zm68iyfyy.R.iget(2460)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2461)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2462);redTransparentAlpha = chunk.getInt2(0);
            __CLR4_5_218718zm68iyfyy.R.inc(2463);greenTransparentAlpha = chunk.getInt2(2);
            __CLR4_5_218718zm68iyfyy.R.inc(2464);blueTransparentAlpha = chunk.getInt2(4);

            __CLR4_5_218718zm68iyfyy.R.inc(2465);if ((((!suppressAlpha)&&(__CLR4_5_218718zm68iyfyy.R.iget(2466)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2467)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2468);outputBands = 4;
                __CLR4_5_218718zm68iyfyy.R.inc(2469);postProcess = POST_ADD_RGB_TRANS;

                __CLR4_5_218718zm68iyfyy.R.inc(2470);if ((((encodeParam != null)&&(__CLR4_5_218718zm68iyfyy.R.iget(2471)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2472)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2473);int[] rgbTrans = new int[3];
                    __CLR4_5_218718zm68iyfyy.R.inc(2474);rgbTrans[0] = redTransparentAlpha;
                    __CLR4_5_218718zm68iyfyy.R.inc(2475);rgbTrans[1] = greenTransparentAlpha;
                    __CLR4_5_218718zm68iyfyy.R.inc(2476);rgbTrans[2] = blueTransparentAlpha;
                    __CLR4_5_218718zm68iyfyy.R.inc(2477);((PNGEncodeParam.RGB)encodeParam).setTransparentRGB(rgbTrans);
                }
            }}
        }} }else {__CLR4_5_218718zm68iyfyy.R.inc(2478);if ((((colorType == PNG_COLOR_GRAY_ALPHA
                   || colorType == PNG_COLOR_RGB_ALPHA)&&(__CLR4_5_218718zm68iyfyy.R.iget(2479)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2480)==0&false))) {{
            // Error -- GA or RGBA image can't have a tRNS chunk.
            __CLR4_5_218718zm68iyfyy.R.inc(2481);String msg = PropertyUtil.getString("PNGImageDecoder15");
            __CLR4_5_218718zm68iyfyy.R.inc(2482);throw new RuntimeException(msg);
        }
    }}}}}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void parse_zTXt_chunk(PNGChunk chunk) {try{__CLR4_5_218718zm68iyfyy.R.inc(2483);

        __CLR4_5_218718zm68iyfyy.R.inc(2484);int textIndex = 0;
        __CLR4_5_218718zm68iyfyy.R.inc(2485);StringBuffer key = new StringBuffer();
        __CLR4_5_218718zm68iyfyy.R.inc(2486);byte b;
        __CLR4_5_218718zm68iyfyy.R.inc(2487);while ((b = chunk.getByte(textIndex++)) != 0) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2490);key.append((char)b);
        }

        // skip method
        }__CLR4_5_218718zm68iyfyy.R.inc(2491);textIndex++;

        __CLR4_5_218718zm68iyfyy.R.inc(2492);StringBuffer value = new StringBuffer();
        __CLR4_5_218718zm68iyfyy.R.inc(2493);try {
            __CLR4_5_218718zm68iyfyy.R.inc(2494);int length = chunk.getLength() - textIndex;
            __CLR4_5_218718zm68iyfyy.R.inc(2495);byte[] data = chunk.getData();
            __CLR4_5_218718zm68iyfyy.R.inc(2496);InputStream cis =
                new ByteArrayInputStream(data, textIndex, length);
            __CLR4_5_218718zm68iyfyy.R.inc(2497);InputStream iis = new InflaterInputStream(cis);

            __CLR4_5_218718zm68iyfyy.R.inc(2498);int c;
            __CLR4_5_218718zm68iyfyy.R.inc(2499);while ((c = iis.read()) != -1) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2502);value.append((char)c);
            }

            }__CLR4_5_218718zm68iyfyy.R.inc(2503);ztextKeys.add(key.toString());
            __CLR4_5_218718zm68iyfyy.R.inc(2504);ztextStrings.add(value.toString());
        } catch (Exception e) {
            __CLR4_5_218718zm68iyfyy.R.inc(2505);e.printStackTrace();
        }
    }finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private WritableRaster createRaster(int width, int height, int bands,
                                        int scanlineStride,
                                        int bitDepth) {try{__CLR4_5_218718zm68iyfyy.R.inc(2506);

        __CLR4_5_218718zm68iyfyy.R.inc(2507);DataBuffer dataBuffer;
        __CLR4_5_218718zm68iyfyy.R.inc(2508);WritableRaster ras = null;
        __CLR4_5_218718zm68iyfyy.R.inc(2509);Point origin = new Point(0, 0);
        __CLR4_5_218718zm68iyfyy.R.inc(2510);if (((((bitDepth < 8) && (bands == 1))&&(__CLR4_5_218718zm68iyfyy.R.iget(2511)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2512)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2513);dataBuffer = new DataBufferByte(height * scanlineStride);
            __CLR4_5_218718zm68iyfyy.R.inc(2514);ras = Raster.createPackedRaster(dataBuffer,
                                            width, height,
                                            bitDepth,
                                            origin);
        } }else {__CLR4_5_218718zm68iyfyy.R.inc(2515);if ((((bitDepth <= 8)&&(__CLR4_5_218718zm68iyfyy.R.iget(2516)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2517)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2518);dataBuffer = new DataBufferByte(height * scanlineStride);
           __CLR4_5_218718zm68iyfyy.R.inc(2519);ras = Raster.createInterleavedRaster(dataBuffer,
                                                 width, height,
                                                 scanlineStride,
                                                 bands,
                                                 bandOffsets[bands],
                                                 origin);
        } }else {{
            __CLR4_5_218718zm68iyfyy.R.inc(2520);dataBuffer = new DataBufferUShort(height * scanlineStride);
            __CLR4_5_218718zm68iyfyy.R.inc(2521);ras = Raster.createInterleavedRaster(dataBuffer,
                                                 width, height,
                                                 scanlineStride,
                                                 bands,
                                                 bandOffsets[bands],
                                                 origin);
        }

        }}__CLR4_5_218718zm68iyfyy.R.inc(2522);return ras;
    }finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    // Data filtering methods

    private static void decodeSubFilter(byte[] curr, int count, int bpp) {try{__CLR4_5_218718zm68iyfyy.R.inc(2523);
        __CLR4_5_218718zm68iyfyy.R.inc(2524);for (int i = bpp; (((i < count)&&(__CLR4_5_218718zm68iyfyy.R.iget(2525)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2526)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2527);int val;

            __CLR4_5_218718zm68iyfyy.R.inc(2528);val = curr[i] & 0xff;
            __CLR4_5_218718zm68iyfyy.R.inc(2529);val += curr[i - bpp] & 0xff;

            __CLR4_5_218718zm68iyfyy.R.inc(2530);curr[i] = (byte)val;
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private static void decodeUpFilter(byte[] curr, byte[] prev,
                                       int count) {try{__CLR4_5_218718zm68iyfyy.R.inc(2531);
        __CLR4_5_218718zm68iyfyy.R.inc(2532);for (int i = 0; (((i < count)&&(__CLR4_5_218718zm68iyfyy.R.iget(2533)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2534)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2535);int raw = curr[i] & 0xff;
            __CLR4_5_218718zm68iyfyy.R.inc(2536);int prior = prev[i] & 0xff;

            __CLR4_5_218718zm68iyfyy.R.inc(2537);curr[i] = (byte)(raw + prior);
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private static void decodeAverageFilter(byte[] curr, byte[] prev,
                                            int count, int bpp) {try{__CLR4_5_218718zm68iyfyy.R.inc(2538);
        __CLR4_5_218718zm68iyfyy.R.inc(2539);int raw;
        __CLR4_5_218718zm68iyfyy.R.inc(2540);int priorPixel;
        __CLR4_5_218718zm68iyfyy.R.inc(2541);int priorRow;

        __CLR4_5_218718zm68iyfyy.R.inc(2542);for (int i = 0; (((i < bpp)&&(__CLR4_5_218718zm68iyfyy.R.iget(2543)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2544)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2545);raw = curr[i] & 0xff;
            __CLR4_5_218718zm68iyfyy.R.inc(2546);priorRow = prev[i] & 0xff;

            __CLR4_5_218718zm68iyfyy.R.inc(2547);curr[i] = (byte)(raw + priorRow / 2);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(2548);for (int i = bpp; (((i < count)&&(__CLR4_5_218718zm68iyfyy.R.iget(2549)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2550)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2551);raw = curr[i] & 0xff;
            __CLR4_5_218718zm68iyfyy.R.inc(2552);priorPixel = curr[i - bpp] & 0xff;
            __CLR4_5_218718zm68iyfyy.R.inc(2553);priorRow = prev[i] & 0xff;

            __CLR4_5_218718zm68iyfyy.R.inc(2554);curr[i] = (byte)(raw + (priorPixel + priorRow) / 2);
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private static void decodePaethFilter(byte[] curr, byte[] prev,
                                          int count, int bpp) {try{__CLR4_5_218718zm68iyfyy.R.inc(2555);
        __CLR4_5_218718zm68iyfyy.R.inc(2556);int raw;
        __CLR4_5_218718zm68iyfyy.R.inc(2557);int priorPixel;
        __CLR4_5_218718zm68iyfyy.R.inc(2558);int priorRow;
        __CLR4_5_218718zm68iyfyy.R.inc(2559);int priorRowPixel;

        __CLR4_5_218718zm68iyfyy.R.inc(2560);for (int i = 0; (((i < bpp)&&(__CLR4_5_218718zm68iyfyy.R.iget(2561)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2562)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2563);raw = curr[i] & 0xff;
            __CLR4_5_218718zm68iyfyy.R.inc(2564);priorRow = prev[i] & 0xff;

            __CLR4_5_218718zm68iyfyy.R.inc(2565);curr[i] = (byte)(raw + priorRow);
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(2566);for (int i = bpp; (((i < count)&&(__CLR4_5_218718zm68iyfyy.R.iget(2567)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2568)==0&false)); i++) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2569);raw = curr[i] & 0xff;
            __CLR4_5_218718zm68iyfyy.R.inc(2570);priorPixel = curr[i - bpp] & 0xff;
            __CLR4_5_218718zm68iyfyy.R.inc(2571);priorRow = prev[i] & 0xff;
            __CLR4_5_218718zm68iyfyy.R.inc(2572);priorRowPixel = prev[i - bpp] & 0xff;

            __CLR4_5_218718zm68iyfyy.R.inc(2573);curr[i] = (byte)(raw + PNGEncodeParam.paethPredictor(priorPixel,
                                                  priorRow,
                                                  priorRowPixel));
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void processPixels(int process,
                               Raster src, WritableRaster dst,
                               int xOffset, int step, int y, int width) {try{__CLR4_5_218718zm68iyfyy.R.inc(2574);
        __CLR4_5_218718zm68iyfyy.R.inc(2575);int srcX;
        __CLR4_5_218718zm68iyfyy.R.inc(2576);int dstX;

        // Create an array suitable for holding one pixel
        __CLR4_5_218718zm68iyfyy.R.inc(2577);int[] ps = src.getPixel(0, 0, (int[])null);
        __CLR4_5_218718zm68iyfyy.R.inc(2578);int[] pd = dst.getPixel(0, 0, (int[])null);

        __CLR4_5_218718zm68iyfyy.R.inc(2579);dstX = xOffset;
        boolean __CLB4_5_2_bool5=false;__CLR4_5_218718zm68iyfyy.R.inc(2580);switch (process) {
        case POST_NONE:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2581);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2582);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2583)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2584)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2585);src.getPixel(srcX, 0, ps);
                __CLR4_5_218718zm68iyfyy.R.inc(2586);dst.setPixel(dstX, y, ps);
                __CLR4_5_218718zm68iyfyy.R.inc(2587);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2588);break;

        case POST_GAMMA:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2589);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2590);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2591)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2592)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2593);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2594);for (int i = 0; (((i < inputBands)&&(__CLR4_5_218718zm68iyfyy.R.iget(2595)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2596)==0&false)); i++) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2597);int x = ps[i];
                    __CLR4_5_218718zm68iyfyy.R.inc(2598);ps[i] = gammaLut[x];
                }

                }__CLR4_5_218718zm68iyfyy.R.inc(2599);dst.setPixel(dstX, y, ps);
                __CLR4_5_218718zm68iyfyy.R.inc(2600);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2601);break;

        case POST_GRAY_LUT:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2602);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2603);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2604)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2605)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2606);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2607);pd[0] = grayLut[ps[0]];

                __CLR4_5_218718zm68iyfyy.R.inc(2608);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2609);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2610);break;

        case POST_GRAY_LUT_ADD_TRANS:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2611);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2612);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2613)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2614)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2615);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2616);int val = ps[0];
                __CLR4_5_218718zm68iyfyy.R.inc(2617);pd[0] = grayLut[val];
                __CLR4_5_218718zm68iyfyy.R.inc(2618);if ((((val == grayTransparentAlpha)&&(__CLR4_5_218718zm68iyfyy.R.iget(2619)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2620)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2621);pd[1] = 0;
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2622);pd[1] = maxOpacity;
                }

                }__CLR4_5_218718zm68iyfyy.R.inc(2623);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2624);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2625);break;

        case POST_PALETTE_TO_RGB:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2626);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2627);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2628)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2629)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2630);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2631);int val = ps[0];
                __CLR4_5_218718zm68iyfyy.R.inc(2632);pd[0] = redPalette[val];
                __CLR4_5_218718zm68iyfyy.R.inc(2633);pd[1] = greenPalette[val];
                __CLR4_5_218718zm68iyfyy.R.inc(2634);pd[2] = bluePalette[val];

                __CLR4_5_218718zm68iyfyy.R.inc(2635);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2636);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2637);break;

        case POST_PALETTE_TO_RGBA:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2638);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2639);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2640)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2641)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2642);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2643);int val = ps[0];
                __CLR4_5_218718zm68iyfyy.R.inc(2644);pd[0] = redPalette[val];
                __CLR4_5_218718zm68iyfyy.R.inc(2645);pd[1] = greenPalette[val];
                __CLR4_5_218718zm68iyfyy.R.inc(2646);pd[2] = bluePalette[val];
                __CLR4_5_218718zm68iyfyy.R.inc(2647);pd[3] = alphaPalette[val];

                __CLR4_5_218718zm68iyfyy.R.inc(2648);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2649);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2650);break;

        case POST_ADD_GRAY_TRANS:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2651);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2652);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2653)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2654)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2655);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2656);int val = ps[0];
                __CLR4_5_218718zm68iyfyy.R.inc(2657);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(2658)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2659)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2660);val = gammaLut[val];
                }
                }__CLR4_5_218718zm68iyfyy.R.inc(2661);pd[0] = val;
                __CLR4_5_218718zm68iyfyy.R.inc(2662);if ((((val == grayTransparentAlpha)&&(__CLR4_5_218718zm68iyfyy.R.iget(2663)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2664)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2665);pd[1] = 0;
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2666);pd[1] = maxOpacity;
                }

                }__CLR4_5_218718zm68iyfyy.R.inc(2667);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2668);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2669);break;

        case POST_ADD_RGB_TRANS:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2670);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2671);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2672)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2673)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2674);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2675);int r = ps[0];
                __CLR4_5_218718zm68iyfyy.R.inc(2676);int g = ps[1];
                __CLR4_5_218718zm68iyfyy.R.inc(2677);int b = ps[2];
                __CLR4_5_218718zm68iyfyy.R.inc(2678);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(2679)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2680)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2681);pd[0] = gammaLut[r];
                    __CLR4_5_218718zm68iyfyy.R.inc(2682);pd[1] = gammaLut[g];
                    __CLR4_5_218718zm68iyfyy.R.inc(2683);pd[2] = gammaLut[b];
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2684);pd[0] = r;
                    __CLR4_5_218718zm68iyfyy.R.inc(2685);pd[1] = g;
                    __CLR4_5_218718zm68iyfyy.R.inc(2686);pd[2] = b;
                }
                }__CLR4_5_218718zm68iyfyy.R.inc(2687);if (((((r == redTransparentAlpha)
                    && (g == greenTransparentAlpha)
                    && (b == blueTransparentAlpha))&&(__CLR4_5_218718zm68iyfyy.R.iget(2688)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2689)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2690);pd[3] = 0;
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2691);pd[3] = maxOpacity;
                }

                }__CLR4_5_218718zm68iyfyy.R.inc(2692);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2693);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2694);break;

        case POST_REMOVE_GRAY_TRANS:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2695);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2696);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2697)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2698)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2699);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2700);int g = ps[0];
                __CLR4_5_218718zm68iyfyy.R.inc(2701);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(2702)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2703)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2704);pd[0] = gammaLut[g];
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2705);pd[0] = g;
                }

                }__CLR4_5_218718zm68iyfyy.R.inc(2706);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2707);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2708);break;

        case POST_REMOVE_RGB_TRANS:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2709);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2710);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2711)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2712)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2713);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2714);int r = ps[0];
                __CLR4_5_218718zm68iyfyy.R.inc(2715);int g = ps[1];
                __CLR4_5_218718zm68iyfyy.R.inc(2716);int b = ps[2];
                __CLR4_5_218718zm68iyfyy.R.inc(2717);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(2718)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2719)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2720);pd[0] = gammaLut[r];
                    __CLR4_5_218718zm68iyfyy.R.inc(2721);pd[1] = gammaLut[g];
                    __CLR4_5_218718zm68iyfyy.R.inc(2722);pd[2] = gammaLut[b];
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2723);pd[0] = r;
                    __CLR4_5_218718zm68iyfyy.R.inc(2724);pd[1] = g;
                    __CLR4_5_218718zm68iyfyy.R.inc(2725);pd[2] = b;
                }

                }__CLR4_5_218718zm68iyfyy.R.inc(2726);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2727);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2728);break;

        case POST_GAMMA_EXP:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2729);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2730);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2731)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2732)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2733);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2734);int val = ps[0];
                __CLR4_5_218718zm68iyfyy.R.inc(2735);int alpha = ps[1];
                __CLR4_5_218718zm68iyfyy.R.inc(2736);int gamma = gammaLut[val];
                __CLR4_5_218718zm68iyfyy.R.inc(2737);pd[0] = gamma;
                __CLR4_5_218718zm68iyfyy.R.inc(2738);pd[1] = gamma;
                __CLR4_5_218718zm68iyfyy.R.inc(2739);pd[2] = gamma;
                __CLR4_5_218718zm68iyfyy.R.inc(2740);pd[3] = alpha;

                __CLR4_5_218718zm68iyfyy.R.inc(2741);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2742);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2743);break;

        case POST_GRAY_ALPHA_EXP:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2744);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2745);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2746)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2747)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2748);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2749);int val = ps[0];
                __CLR4_5_218718zm68iyfyy.R.inc(2750);int alpha = ps[1];
                __CLR4_5_218718zm68iyfyy.R.inc(2751);pd[0] = val;
                __CLR4_5_218718zm68iyfyy.R.inc(2752);pd[1] = val;
                __CLR4_5_218718zm68iyfyy.R.inc(2753);pd[2] = val;
                __CLR4_5_218718zm68iyfyy.R.inc(2754);pd[3] = alpha;

                __CLR4_5_218718zm68iyfyy.R.inc(2755);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2756);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2757);break;

        case POST_ADD_GRAY_TRANS_EXP:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2758);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2759);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2760)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2761)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2762);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2763);int val = ps[0];
                __CLR4_5_218718zm68iyfyy.R.inc(2764);if ((((performGammaCorrection)&&(__CLR4_5_218718zm68iyfyy.R.iget(2765)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2766)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2767);val = gammaLut[val];
                }
                }__CLR4_5_218718zm68iyfyy.R.inc(2768);pd[0] = val;
                __CLR4_5_218718zm68iyfyy.R.inc(2769);pd[1] = val;
                __CLR4_5_218718zm68iyfyy.R.inc(2770);pd[2] = val;
                __CLR4_5_218718zm68iyfyy.R.inc(2771);if ((((val == grayTransparentAlpha)&&(__CLR4_5_218718zm68iyfyy.R.iget(2772)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2773)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2774);pd[3] = 0;
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2775);pd[3] = maxOpacity;
                }

                }__CLR4_5_218718zm68iyfyy.R.inc(2776);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2777);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2778);break;

        case POST_GRAY_LUT_ADD_TRANS_EXP:if (!__CLB4_5_2_bool5) {__CLR4_5_218718zm68iyfyy.R.inc(2779);__CLB4_5_2_bool5=true;}
            __CLR4_5_218718zm68iyfyy.R.inc(2780);for (srcX = 0; (((srcX < width)&&(__CLR4_5_218718zm68iyfyy.R.iget(2781)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2782)==0&false)); srcX++) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2783);src.getPixel(srcX, 0, ps);

                __CLR4_5_218718zm68iyfyy.R.inc(2784);int val = ps[0];
                __CLR4_5_218718zm68iyfyy.R.inc(2785);int val2 = grayLut[val];
                __CLR4_5_218718zm68iyfyy.R.inc(2786);pd[0] = val2;
                __CLR4_5_218718zm68iyfyy.R.inc(2787);pd[1] = val2;
                __CLR4_5_218718zm68iyfyy.R.inc(2788);pd[2] = val2;
                __CLR4_5_218718zm68iyfyy.R.inc(2789);if ((((val == grayTransparentAlpha)&&(__CLR4_5_218718zm68iyfyy.R.iget(2790)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2791)==0&false))) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2792);pd[3] = 0;
                } }else {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2793);pd[3] = maxOpacity;
                }

                }__CLR4_5_218718zm68iyfyy.R.inc(2794);dst.setPixel(dstX, y, pd);
                __CLR4_5_218718zm68iyfyy.R.inc(2795);dstX += step;
            }
            }__CLR4_5_218718zm68iyfyy.R.inc(2796);break;
        }
    }finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    /**
     * Reads in an image of a given size and returns it as a
     * WritableRaster.
     */
    private void decodePass(WritableRaster imRas,
                            int xOffset, int yOffset,
                            int xStep, int yStep,
                            int passWidth, int passHeight) {try{__CLR4_5_218718zm68iyfyy.R.inc(2797);
        __CLR4_5_218718zm68iyfyy.R.inc(2798);if (((((passWidth == 0) || (passHeight == 0))&&(__CLR4_5_218718zm68iyfyy.R.iget(2799)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2800)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2801);return;
        }

        }__CLR4_5_218718zm68iyfyy.R.inc(2802);int bytesPerRow = (inputBands * passWidth * bitDepth + 7) / 8;
        __CLR4_5_218718zm68iyfyy.R.inc(2803);int eltsPerRow = ((((bitDepth == 16) )&&(__CLR4_5_218718zm68iyfyy.R.iget(2804)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2805)==0&false))? bytesPerRow / 2 : bytesPerRow;
        __CLR4_5_218718zm68iyfyy.R.inc(2806);byte[] curr = new byte[bytesPerRow];
        __CLR4_5_218718zm68iyfyy.R.inc(2807);byte[] prior = new byte[bytesPerRow];

        // Create a 1-row tall Raster to hold the data
        __CLR4_5_218718zm68iyfyy.R.inc(2808);WritableRaster passRow =
            createRaster(passWidth, 1, inputBands,
                         eltsPerRow,
                         bitDepth);
        __CLR4_5_218718zm68iyfyy.R.inc(2809);DataBuffer dataBuffer = passRow.getDataBuffer();
        __CLR4_5_218718zm68iyfyy.R.inc(2810);int type = dataBuffer.getDataType();
        __CLR4_5_218718zm68iyfyy.R.inc(2811);byte[] byteData = null;
        __CLR4_5_218718zm68iyfyy.R.inc(2812);short[] shortData = null;
        __CLR4_5_218718zm68iyfyy.R.inc(2813);if ((((type == DataBuffer.TYPE_BYTE)&&(__CLR4_5_218718zm68iyfyy.R.iget(2814)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2815)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2816);byteData = ((DataBufferByte)dataBuffer).getData();
        } }else {{
            __CLR4_5_218718zm68iyfyy.R.inc(2817);shortData = ((DataBufferUShort)dataBuffer).getData();
        }

        // Decode the (sub)image row-by-row
        }__CLR4_5_218718zm68iyfyy.R.inc(2818);int srcY;
        __CLR4_5_218718zm68iyfyy.R.inc(2819);int dstY;
        __CLR4_5_218718zm68iyfyy.R.inc(2820);for (srcY = 0, dstY = yOffset;
             (((srcY < passHeight)&&(__CLR4_5_218718zm68iyfyy.R.iget(2821)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2822)==0&false));
             srcY++, dstY += yStep) {{
            // Read the filter type byte and a row of data
            __CLR4_5_218718zm68iyfyy.R.inc(2823);int filter = 0;
            __CLR4_5_218718zm68iyfyy.R.inc(2824);try {
                __CLR4_5_218718zm68iyfyy.R.inc(2825);filter = dataStream.read();
                __CLR4_5_218718zm68iyfyy.R.inc(2826);dataStream.readFully(curr, 0, bytesPerRow);
            } catch (Exception e) {
                __CLR4_5_218718zm68iyfyy.R.inc(2827);e.printStackTrace();
            }

            boolean __CLB4_5_2_bool6=false;__CLR4_5_218718zm68iyfyy.R.inc(2828);switch (filter) {
            case PNG_FILTER_NONE:if (!__CLB4_5_2_bool6) {__CLR4_5_218718zm68iyfyy.R.inc(2829);__CLB4_5_2_bool6=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2830);break;
            case PNG_FILTER_SUB:if (!__CLB4_5_2_bool6) {__CLR4_5_218718zm68iyfyy.R.inc(2831);__CLB4_5_2_bool6=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2832);decodeSubFilter(curr, bytesPerRow, bytesPerPixel);
                __CLR4_5_218718zm68iyfyy.R.inc(2833);break;
            case PNG_FILTER_UP:if (!__CLB4_5_2_bool6) {__CLR4_5_218718zm68iyfyy.R.inc(2834);__CLB4_5_2_bool6=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2835);decodeUpFilter(curr, prior, bytesPerRow);
                __CLR4_5_218718zm68iyfyy.R.inc(2836);break;
            case PNG_FILTER_AVERAGE:if (!__CLB4_5_2_bool6) {__CLR4_5_218718zm68iyfyy.R.inc(2837);__CLB4_5_2_bool6=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2838);decodeAverageFilter(curr, prior, bytesPerRow, bytesPerPixel);
                __CLR4_5_218718zm68iyfyy.R.inc(2839);break;
            case PNG_FILTER_PAETH:if (!__CLB4_5_2_bool6) {__CLR4_5_218718zm68iyfyy.R.inc(2840);__CLB4_5_2_bool6=true;}
                __CLR4_5_218718zm68iyfyy.R.inc(2841);decodePaethFilter(curr, prior, bytesPerRow, bytesPerPixel);
                __CLR4_5_218718zm68iyfyy.R.inc(2842);break;
            default:if (!__CLB4_5_2_bool6) {__CLR4_5_218718zm68iyfyy.R.inc(2843);__CLB4_5_2_bool6=true;}
                // Error -- uknown filter type
                __CLR4_5_218718zm68iyfyy.R.inc(2844);String msg = PropertyUtil.getString("PNGImageDecoder16");
                __CLR4_5_218718zm68iyfyy.R.inc(2845);throw new RuntimeException(msg);
            }

            // Copy data into passRow byte by byte
            __CLR4_5_218718zm68iyfyy.R.inc(2846);if ((((bitDepth < 16)&&(__CLR4_5_218718zm68iyfyy.R.iget(2847)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2848)==0&false))) {{
                __CLR4_5_218718zm68iyfyy.R.inc(2849);System.arraycopy(curr, 0, byteData, 0, bytesPerRow);
            } }else {{
                __CLR4_5_218718zm68iyfyy.R.inc(2850);int idx = 0;
                __CLR4_5_218718zm68iyfyy.R.inc(2851);for (int j = 0; (((j < eltsPerRow)&&(__CLR4_5_218718zm68iyfyy.R.iget(2852)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2853)==0&false)); j++) {{
                    __CLR4_5_218718zm68iyfyy.R.inc(2854);shortData[j] =
                        (short)((curr[idx] << 8) | (curr[idx + 1] & 0xff));
                    __CLR4_5_218718zm68iyfyy.R.inc(2855);idx += 2;
                }
            }}

            }__CLR4_5_218718zm68iyfyy.R.inc(2856);processPixels(postProcess,
                          passRow, imRas, xOffset, xStep, dstY, passWidth);

            // Swap curr and prior
            __CLR4_5_218718zm68iyfyy.R.inc(2857);byte[] tmp = prior;
            __CLR4_5_218718zm68iyfyy.R.inc(2858);prior = curr;
            __CLR4_5_218718zm68iyfyy.R.inc(2859);curr = tmp;
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    private void decodeImage(boolean useInterlacing) {try{__CLR4_5_218718zm68iyfyy.R.inc(2860);
        __CLR4_5_218718zm68iyfyy.R.inc(2861);if ((((!useInterlacing)&&(__CLR4_5_218718zm68iyfyy.R.iget(2862)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2863)==0&false))) {{
            __CLR4_5_218718zm68iyfyy.R.inc(2864);decodePass(theTile, 0, 0, 1, 1, width, height);
        } }else {{
            __CLR4_5_218718zm68iyfyy.R.inc(2865);decodePass(theTile, 0, 0, 8, 8, (width + 7) / 8, (height + 7) / 8);
            __CLR4_5_218718zm68iyfyy.R.inc(2866);decodePass(theTile, 4, 0, 8, 8, (width + 3) / 8, (height + 7) / 8);
            __CLR4_5_218718zm68iyfyy.R.inc(2867);decodePass(theTile, 0, 4, 4, 8, (width + 3) / 4, (height + 3) / 8);
            __CLR4_5_218718zm68iyfyy.R.inc(2868);decodePass(theTile, 2, 0, 4, 4, (width + 1) / 4, (height + 3) / 4);
            __CLR4_5_218718zm68iyfyy.R.inc(2869);decodePass(theTile, 0, 2, 2, 4, (width + 1) / 2, (height + 1) / 4);
            __CLR4_5_218718zm68iyfyy.R.inc(2870);decodePass(theTile, 1, 0, 2, 2, width / 2, (height + 1) / 2);
            __CLR4_5_218718zm68iyfyy.R.inc(2871);decodePass(theTile, 0, 1, 1, 2, width, height / 2);
        }
    }}finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}

    // RenderedImage stuff

    public Raster getTile(int tileX, int tileY) {try{__CLR4_5_218718zm68iyfyy.R.inc(2872);
        __CLR4_5_218718zm68iyfyy.R.inc(2873);if ((((tileX != 0 || tileY != 0)&&(__CLR4_5_218718zm68iyfyy.R.iget(2874)!=0|true))||(__CLR4_5_218718zm68iyfyy.R.iget(2875)==0&false))) {{
            // Error -- bad tile requested
            __CLR4_5_218718zm68iyfyy.R.inc(2876);String msg = PropertyUtil.getString("PNGImageDecoder17");
            __CLR4_5_218718zm68iyfyy.R.inc(2877);throw new IllegalArgumentException(msg);
        }
        }__CLR4_5_218718zm68iyfyy.R.inc(2878);return theTile;
    }finally{__CLR4_5_218718zm68iyfyy.R.flushNeeded();}}
}
