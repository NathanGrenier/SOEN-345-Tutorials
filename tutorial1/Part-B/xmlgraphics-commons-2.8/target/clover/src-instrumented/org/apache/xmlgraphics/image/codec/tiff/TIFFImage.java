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

/* $Id: TIFFImage.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.tiff;

import java.awt.Rectangle;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.awt.image.DataBufferShort;
import java.awt.image.DataBufferUShort;
import java.awt.image.IndexColorModel;
import java.awt.image.MultiPixelPackedSampleModel;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

import org.apache.xmlgraphics.image.codec.util.PropertyUtil;
import org.apache.xmlgraphics.image.codec.util.SeekableStream;
import org.apache.xmlgraphics.image.rendered.AbstractRed;
import org.apache.xmlgraphics.image.rendered.CachableRed;

// CSOFF: LocalVariableName
// CSOFF: MissingSwitchDefault
// CSOFF: MultipleVariableDeclarations
// CSOFF: OperatorWrap
// CSOFF: WhitespaceAround

@java.lang.SuppressWarnings({"fallthrough"}) public class TIFFImage extends AbstractRed {public static class __CLR4_5_24wh4whm6lb4z68{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,7512,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Compression types
    public static final int COMP_NONE      = 1;
    public static final int COMP_FAX_G3_1D = 2;
    public static final int COMP_FAX_G3_2D = 3;
    public static final int COMP_FAX_G4_2D = 4;
    public static final int COMP_LZW       = 5;
    public static final int COMP_JPEG_OLD  = 6;
    public static final int COMP_JPEG_TTN2 = 7;
    public static final int COMP_PACKBITS  = 32773;
    public static final int COMP_DEFLATE   = 32946;

    // Image types
    private static final int TYPE_UNSUPPORTED = -1;
    private static final int TYPE_BILEVEL      = 0;
    private static final int TYPE_GRAY_4BIT    = 1;
    private static final int TYPE_GRAY         = 2;
    private static final int TYPE_GRAY_ALPHA   = 3;
    private static final int TYPE_PALETTE      = 4;
    private static final int TYPE_RGB          = 5;
    private static final int TYPE_RGB_ALPHA    = 6;
    private static final int TYPE_YCBCR_SUB    = 7;
    private static final int TYPE_GENERIC      = 8;

    // Incidental tags
    private static final int TIFF_JPEG_TABLES       = 347;
    private static final int TIFF_YCBCR_SUBSAMPLING = 530;

    SeekableStream stream;
    int tileSize;
    int tilesX;
    int tilesY;
    long[] tileOffsets;
    long[] tileByteCounts;
    char[] colormap;
    int sampleSize;
    int compression;
    byte[] palette;
    int numBands;

    int chromaSubH;
    int chromaSubV;

    // Fax compression related variables
    long tiffT4Options;
    long tiffT6Options;
    int fillOrder;

    // LZW compression related variable
    int predictor;

    // DEFLATE variables
    Inflater inflater;

    // Endian-ness indicator
    boolean isBigEndian;

    int imageType;
    boolean isWhiteZero;
    int dataType;

    boolean decodePaletteAsShorts;
    boolean tiled;

    // Decoders
    private TIFFFaxDecoder decoder;
    private TIFFLZWDecoder lzwDecoder;

    /**
     * Inflates <code>deflated</code> into <code>inflated</code> using the
     * <code>Inflater</code> constructed during class instantiation.
     */
    private void inflate(byte[] deflated, byte[] inflated) {try{__CLR4_5_24wh4whm6lb4z68.R.inc(6353);
        __CLR4_5_24wh4whm6lb4z68.R.inc(6354);inflater.setInput(deflated);
        __CLR4_5_24wh4whm6lb4z68.R.inc(6355);try {
            __CLR4_5_24wh4whm6lb4z68.R.inc(6356);inflater.inflate(inflated);
        } catch (DataFormatException dfe) {
            __CLR4_5_24wh4whm6lb4z68.R.inc(6357);throw new RuntimeException(PropertyUtil.getString("TIFFImage17") + ": "
                                       + dfe.getMessage());
        }
        __CLR4_5_24wh4whm6lb4z68.R.inc(6358);inflater.reset();
    }finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}

    private static SampleModel createPixelInterleavedSampleModel(
        int dataType, int tileWidth, int tileHeight, int bands) {try{__CLR4_5_24wh4whm6lb4z68.R.inc(6359);
        __CLR4_5_24wh4whm6lb4z68.R.inc(6360);int [] bandOffsets = new int[bands];
        __CLR4_5_24wh4whm6lb4z68.R.inc(6361);for (int i = 0; (((i < bands)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6362)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6363)==0&false)); i++) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6364);bandOffsets[i] = i;
        }
        }__CLR4_5_24wh4whm6lb4z68.R.inc(6365);return new PixelInterleavedSampleModel(
            dataType, tileWidth, tileHeight, bands,
             tileWidth * bands, bandOffsets);
    }finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}

    /**
     * Return as a long[] the value of a TIFF_LONG or TIFF_SHORT field.
     */
    private long[] getFieldAsLongs(TIFFField field) {try{__CLR4_5_24wh4whm6lb4z68.R.inc(6366);
        __CLR4_5_24wh4whm6lb4z68.R.inc(6367);long[] value = null;

        __CLR4_5_24wh4whm6lb4z68.R.inc(6368);if ((((field.getType() == TIFFField.TIFF_SHORT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6369)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6370)==0&false))) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6371);char[] charValue = field.getAsChars();
            __CLR4_5_24wh4whm6lb4z68.R.inc(6372);value = new long[charValue.length];
            __CLR4_5_24wh4whm6lb4z68.R.inc(6373);for (int i = 0; (((i < charValue.length)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6374)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6375)==0&false)); i++) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6376);value[i] = charValue[i] & 0xffff;
            }
        }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6377);if ((((field.getType() == TIFFField.TIFF_LONG)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6378)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6379)==0&false))) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6380);value = field.getAsLongs();
        } }else {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6381);throw new RuntimeException(PropertyUtil.getString("TIFFImage18") + ": "
                                       + field.getType());
        }

        }}__CLR4_5_24wh4whm6lb4z68.R.inc(6382);return value;
    }finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}

    /**
     * Constructs a TIFFImage that acquires its data from a given
     * SeekableStream and reads from a particular IFD of the stream.
     * The index of the first IFD is 0.
     *
     * @param stream the SeekableStream to read from.
     * @param param an instance of TIFFDecodeParam, or null.
     * @param directory the index of the IFD to read from.
     */
    public TIFFImage(SeekableStream stream,
                     TIFFDecodeParam param,
                     int directory)
        throws IOException {try{__CLR4_5_24wh4whm6lb4z68.R.inc(6383);

        __CLR4_5_24wh4whm6lb4z68.R.inc(6384);this.stream = stream;
        __CLR4_5_24wh4whm6lb4z68.R.inc(6385);if ((((param == null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6386)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6387)==0&false))) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6388);param = new TIFFDecodeParam();
        }

        }__CLR4_5_24wh4whm6lb4z68.R.inc(6389);decodePaletteAsShorts = param.getDecodePaletteAsShorts();

        // Read the specified directory.
        __CLR4_5_24wh4whm6lb4z68.R.inc(6390);TIFFDirectory dir = (((param.getIFDOffset() == null
            )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6391)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6392)==0&false))? new TIFFDirectory(stream, directory)
            : new TIFFDirectory(stream, param.getIFDOffset(),
                              directory);

        // Get the number of samples per pixel
        __CLR4_5_24wh4whm6lb4z68.R.inc(6393);TIFFField sfield = dir.getField(TIFFImageDecoder.TIFF_SAMPLES_PER_PIXEL);
        __CLR4_5_24wh4whm6lb4z68.R.inc(6394);int samplesPerPixel = (((sfield == null )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6395)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6396)==0&false))? 1 : (int)sfield.getAsLong(0);

        // Read the TIFF_PLANAR_CONFIGURATION field
        __CLR4_5_24wh4whm6lb4z68.R.inc(6397);TIFFField planarConfigurationField =
            dir.getField(TIFFImageDecoder.TIFF_PLANAR_CONFIGURATION);
        __CLR4_5_24wh4whm6lb4z68.R.inc(6398);char[] planarConfiguration = (((planarConfigurationField == null
            )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6399)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6400)==0&false))? new char[] {1}
            : planarConfigurationField.getAsChars();

            // Support planar format (band sequential) only for 1 sample/pixel.
            __CLR4_5_24wh4whm6lb4z68.R.inc(6401);if ((((planarConfiguration[0] != 1 && samplesPerPixel != 1)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6402)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6403)==0&false))) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6404);throw new RuntimeException(PropertyUtil.getString("TIFFImage0"));
            }

            // Read the TIFF_BITS_PER_SAMPLE field
            }__CLR4_5_24wh4whm6lb4z68.R.inc(6405);TIFFField bitsField =
                dir.getField(TIFFImageDecoder.TIFF_BITS_PER_SAMPLE);
            __CLR4_5_24wh4whm6lb4z68.R.inc(6406);char[] bitsPerSample = null;
            __CLR4_5_24wh4whm6lb4z68.R.inc(6407);if ((((bitsField != null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6408)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6409)==0&false))) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6410);bitsPerSample = bitsField.getAsChars();
            } }else {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6411);bitsPerSample = new char[] {1};

                // Ensure that all samples have the same bit depth.
                __CLR4_5_24wh4whm6lb4z68.R.inc(6412);for (int i = 1; (((i < bitsPerSample.length)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6413)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6414)==0&false)); i++) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6415);if ((((bitsPerSample[i] != bitsPerSample[0])&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6416)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6417)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6418);throw new RuntimeException(PropertyUtil.getString("TIFFImage1"));
                    }
                }}
            }}
            }__CLR4_5_24wh4whm6lb4z68.R.inc(6419);sampleSize = bitsPerSample[0];

            // Read the TIFF_SAMPLE_FORMAT tag to see whether the data might be
            // signed or floating point
            __CLR4_5_24wh4whm6lb4z68.R.inc(6420);TIFFField sampleFormatField =
                dir.getField(TIFFImageDecoder.TIFF_SAMPLE_FORMAT);

            __CLR4_5_24wh4whm6lb4z68.R.inc(6421);char[] sampleFormat = null;
            __CLR4_5_24wh4whm6lb4z68.R.inc(6422);if ((((sampleFormatField != null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6423)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6424)==0&false))) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6425);sampleFormat = sampleFormatField.getAsChars();

                // Check that all the samples have the same format
                __CLR4_5_24wh4whm6lb4z68.R.inc(6426);for (int l = 1; (((l < sampleFormat.length)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6427)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6428)==0&false)); l++) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6429);if ((((sampleFormat[l] != sampleFormat[0])&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6430)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6431)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6432);throw new RuntimeException(PropertyUtil.getString("TIFFImage2"));
                    }
                }}

            }} }else {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6433);sampleFormat = new char[] {1};
            }

            // Set the data type based on the sample size and format.
            }__CLR4_5_24wh4whm6lb4z68.R.inc(6434);boolean isValidDataFormat = false;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_24wh4whm6lb4z68.R.inc(6435);switch (sampleSize) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_24wh4whm6lb4z68.R.inc(6436);__CLB4_5_2_bool0=true;}
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_24wh4whm6lb4z68.R.inc(6437);__CLB4_5_2_bool0=true;}
            case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_24wh4whm6lb4z68.R.inc(6438);__CLB4_5_2_bool0=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(6439);if ((((sampleFormat[0] != 3)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6440)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6441)==0&false))) {{
                    // Ignore whether signed or unsigned: treat all as unsigned.
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6442);dataType = DataBuffer.TYPE_BYTE;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6443);isValidDataFormat = true;
                }
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6444);break;
            case 16:if (!__CLB4_5_2_bool0) {__CLR4_5_24wh4whm6lb4z68.R.inc(6445);__CLB4_5_2_bool0=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(6446);if ((((sampleFormat[0] != 3)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6447)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6448)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6449);dataType = (((sampleFormat[0] == 2
                        )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6450)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6451)==0&false))? DataBuffer.TYPE_SHORT : DataBuffer.TYPE_USHORT;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6452);isValidDataFormat = true;
                }
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6453);break;
            case 32:if (!__CLB4_5_2_bool0) {__CLR4_5_24wh4whm6lb4z68.R.inc(6454);__CLB4_5_2_bool0=true;}
              __CLR4_5_24wh4whm6lb4z68.R.inc(6455);if ((((sampleFormat[0] == 3)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6456)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6457)==0&false))) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6458);isValidDataFormat = false;
            } }else {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6459);dataType = DataBuffer.TYPE_INT;
                __CLR4_5_24wh4whm6lb4z68.R.inc(6460);isValidDataFormat = true;
              }
              }__CLR4_5_24wh4whm6lb4z68.R.inc(6461);break;
            }

            __CLR4_5_24wh4whm6lb4z68.R.inc(6462);if ((((!isValidDataFormat)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6463)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6464)==0&false))) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6465);throw new RuntimeException(PropertyUtil.getString("TIFFImage3"));
            }

            // Figure out what compression if any, is being used.
            }__CLR4_5_24wh4whm6lb4z68.R.inc(6466);TIFFField compField = dir.getField(TIFFImageDecoder.TIFF_COMPRESSION);
            __CLR4_5_24wh4whm6lb4z68.R.inc(6467);compression = (((compField == null )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6468)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6469)==0&false))? COMP_NONE : compField.getAsInt(0);

            // Get the photometric interpretation.
            __CLR4_5_24wh4whm6lb4z68.R.inc(6470);int photometricType;
            __CLR4_5_24wh4whm6lb4z68.R.inc(6471);TIFFField photometricTypeField = dir.getField(
                    TIFFImageDecoder.TIFF_PHOTOMETRIC_INTERPRETATION);
            __CLR4_5_24wh4whm6lb4z68.R.inc(6472);if ((((photometricTypeField == null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6473)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6474)==0&false))) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6475);photometricType = 0; // White is zero
            } }else {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6476);photometricType = photometricTypeField.getAsInt(0);
            }

            // Determine which kind of image we are dealing with.
            }__CLR4_5_24wh4whm6lb4z68.R.inc(6477);imageType = TYPE_UNSUPPORTED;
            boolean __CLB4_5_2_bool1=false;__CLR4_5_24wh4whm6lb4z68.R.inc(6478);switch(photometricType) {
            case 0:if (!__CLB4_5_2_bool1) {__CLR4_5_24wh4whm6lb4z68.R.inc(6479);__CLB4_5_2_bool1=true;} // WhiteIsZero
                __CLR4_5_24wh4whm6lb4z68.R.inc(6480);isWhiteZero = true;
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_24wh4whm6lb4z68.R.inc(6481);__CLB4_5_2_bool1=true;} // BlackIsZero
                __CLR4_5_24wh4whm6lb4z68.R.inc(6482);if ((((sampleSize == 1 && samplesPerPixel == 1)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6483)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6484)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6485);imageType = TYPE_BILEVEL;
                } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6486);if ((((sampleSize == 4 && samplesPerPixel == 1)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6487)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6488)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6489);imageType = TYPE_GRAY_4BIT;
                } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6490);if ((((sampleSize % 8 == 0)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6491)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6492)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6493);if ((((samplesPerPixel == 1)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6494)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6495)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6496);imageType = TYPE_GRAY;
                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6497);if ((((samplesPerPixel == 2)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6498)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6499)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6500);imageType = TYPE_GRAY_ALPHA;
                    } }else {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6501);imageType = TYPE_GENERIC;
                    }
                }}}
                }}}__CLR4_5_24wh4whm6lb4z68.R.inc(6502);break;
            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_24wh4whm6lb4z68.R.inc(6503);__CLB4_5_2_bool1=true;} // RGB
                __CLR4_5_24wh4whm6lb4z68.R.inc(6504);if ((((sampleSize % 8 == 0)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6505)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6506)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6507);if ((((samplesPerPixel == 3)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6508)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6509)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6510);imageType = TYPE_RGB;
                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6511);if ((((samplesPerPixel == 4)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6512)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6513)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6514);imageType = TYPE_RGB_ALPHA;
                    } }else {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6515);imageType = TYPE_GENERIC;
                    }
                }}}
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6516);break;
            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_24wh4whm6lb4z68.R.inc(6517);__CLB4_5_2_bool1=true;} // RGB Palette
                __CLR4_5_24wh4whm6lb4z68.R.inc(6518);if ((((samplesPerPixel == 1
                   && (sampleSize == 4 || sampleSize == 8 || sampleSize == 16))&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6519)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6520)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6521);imageType = TYPE_PALETTE;
                }
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6522);break;
            case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_24wh4whm6lb4z68.R.inc(6523);__CLB4_5_2_bool1=true;} // Transparency mask
                __CLR4_5_24wh4whm6lb4z68.R.inc(6524);if ((((sampleSize == 1 && samplesPerPixel == 1)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6525)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6526)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6527);imageType = TYPE_BILEVEL;
                }
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6528);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_24wh4whm6lb4z68.R.inc(6529);__CLB4_5_2_bool1=true;} // Other including CMYK, CIE L*a*b*, unknown.
                __CLR4_5_24wh4whm6lb4z68.R.inc(6530);if ((((sampleSize % 8 == 0)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6531)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6532)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6533);imageType = TYPE_GENERIC;
                }
            }}

            // Bail out if not one of the supported types.
            __CLR4_5_24wh4whm6lb4z68.R.inc(6534);if ((((imageType == TYPE_UNSUPPORTED)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6535)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6536)==0&false))) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6537);throw new RuntimeException(PropertyUtil.getString("TIFFImage4") + ": "
                                           + imageType);
            }

            // Set basic image layout
            }__CLR4_5_24wh4whm6lb4z68.R.inc(6538);Rectangle bounds = new Rectangle(
                0, 0,
                 (int)dir.getFieldAsLong(TIFFImageDecoder.TIFF_IMAGE_WIDTH),
                 (int)dir.getFieldAsLong(TIFFImageDecoder.TIFF_IMAGE_LENGTH));

            // Set a preliminary band count. This may be changed later as needed.
            __CLR4_5_24wh4whm6lb4z68.R.inc(6539);numBands = samplesPerPixel;

            // Figure out if any extra samples are present.
            __CLR4_5_24wh4whm6lb4z68.R.inc(6540);TIFFField efield = dir.getField(TIFFImageDecoder.TIFF_EXTRA_SAMPLES);
            __CLR4_5_24wh4whm6lb4z68.R.inc(6541);int extraSamples = (((efield == null )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6542)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6543)==0&false))? 0 : (int)efield.getAsLong(0);

            __CLR4_5_24wh4whm6lb4z68.R.inc(6544);int tileWidth;
            __CLR4_5_24wh4whm6lb4z68.R.inc(6545);int tileHeight;
            __CLR4_5_24wh4whm6lb4z68.R.inc(6546);if ((((dir.getField(TIFFImageDecoder.TIFF_TILE_OFFSETS) != null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6547)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6548)==0&false))) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6549);tiled = true;
                // Image is in tiled format
                __CLR4_5_24wh4whm6lb4z68.R.inc(6550);tileWidth =
                    (int)dir.getFieldAsLong(TIFFImageDecoder.TIFF_TILE_WIDTH);
                __CLR4_5_24wh4whm6lb4z68.R.inc(6551);tileHeight =
                    (int)dir.getFieldAsLong(TIFFImageDecoder.TIFF_TILE_LENGTH);
                __CLR4_5_24wh4whm6lb4z68.R.inc(6552);tileOffsets =
                    (dir.getField(TIFFImageDecoder.TIFF_TILE_OFFSETS)).getAsLongs();
                __CLR4_5_24wh4whm6lb4z68.R.inc(6553);tileByteCounts =
                    getFieldAsLongs(dir.getField(TIFFImageDecoder.TIFF_TILE_BYTE_COUNTS));

            } }else {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6554);tiled = false;

                // Image is in stripped format, looks like tiles to us
                // Note: Some legacy files may have tile width and height
                // written but use the strip offsets and byte counts fields
                // instead of the tile offsets and byte counts. Therefore
                // we default here to the tile dimensions if they are written.
                __CLR4_5_24wh4whm6lb4z68.R.inc(6555);tileWidth =
                    (((dir.getField(TIFFImageDecoder.TIFF_TILE_WIDTH) != null
                    )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6556)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6557)==0&false))? (int)dir.getFieldAsLong(TIFFImageDecoder.TIFF_TILE_WIDTH)
                    : bounds.width;
                __CLR4_5_24wh4whm6lb4z68.R.inc(6558);TIFFField field =
                    dir.getField(TIFFImageDecoder.TIFF_ROWS_PER_STRIP);
                __CLR4_5_24wh4whm6lb4z68.R.inc(6559);if ((((field == null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6560)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6561)==0&false))) {{
                    // Default is infinity (2^32 -1), basically the entire image

                    __CLR4_5_24wh4whm6lb4z68.R.inc(6562);tileHeight =
                        (((dir.getField(TIFFImageDecoder.TIFF_TILE_LENGTH) != null
                        )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6563)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6564)==0&false))? (int)dir.getFieldAsLong(TIFFImageDecoder.TIFF_TILE_LENGTH)
                        : bounds.height;
                } }else {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6565);long l = field.getAsLong(0);
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6566);long infinity = 1;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6567);infinity = (infinity << 32) - 1;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6568);if ((((l == infinity)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6569)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6570)==0&false))) {{
                        // 2^32 - 1 (effectively infinity, entire image is 1 strip)
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6571);tileHeight = bounds.height;
                    } }else {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6572);tileHeight = (int)l;
                    }
                }}

                }__CLR4_5_24wh4whm6lb4z68.R.inc(6573);TIFFField tileOffsetsField =
                    dir.getField(TIFFImageDecoder.TIFF_STRIP_OFFSETS);
                __CLR4_5_24wh4whm6lb4z68.R.inc(6574);if ((((tileOffsetsField == null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6575)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6576)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6577);throw new RuntimeException(PropertyUtil.getString("TIFFImage5"));
                } }else {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6578);tileOffsets = getFieldAsLongs(tileOffsetsField);
                }

                }__CLR4_5_24wh4whm6lb4z68.R.inc(6579);TIFFField tileByteCountsField =
                    dir.getField(TIFFImageDecoder.TIFF_STRIP_BYTE_COUNTS);
                __CLR4_5_24wh4whm6lb4z68.R.inc(6580);if ((((tileByteCountsField == null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6581)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6582)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6583);throw new RuntimeException(PropertyUtil.getString("TIFFImage6"));
                } }else {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6584);tileByteCounts = getFieldAsLongs(tileByteCountsField);
                }
            }}

            // Calculate number of tiles and the tileSize in bytes
            }__CLR4_5_24wh4whm6lb4z68.R.inc(6585);tilesX = (bounds.width + tileWidth - 1) / tileWidth;
            __CLR4_5_24wh4whm6lb4z68.R.inc(6586);tilesY = (bounds.height + tileHeight - 1) / tileHeight;
            __CLR4_5_24wh4whm6lb4z68.R.inc(6587);tileSize = tileWidth * tileHeight * numBands;

            // Check whether big endian or little endian format is used.
            __CLR4_5_24wh4whm6lb4z68.R.inc(6588);isBigEndian = dir.isBigEndian();

            __CLR4_5_24wh4whm6lb4z68.R.inc(6589);TIFFField fillOrderField =
                dir.getField(TIFFImageDecoder.TIFF_FILL_ORDER);
            __CLR4_5_24wh4whm6lb4z68.R.inc(6590);if ((((fillOrderField != null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6591)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6592)==0&false))) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(6593);fillOrder = fillOrderField.getAsInt(0);
            } }else {{
                // Default Fill Order
                __CLR4_5_24wh4whm6lb4z68.R.inc(6594);fillOrder = 1;
            }

            }boolean __CLB4_5_2_bool2=false;__CLR4_5_24wh4whm6lb4z68.R.inc(6595);switch(compression) {
            case COMP_NONE:if (!__CLB4_5_2_bool2) {__CLR4_5_24wh4whm6lb4z68.R.inc(6596);__CLB4_5_2_bool2=true;}
            case COMP_PACKBITS:if (!__CLB4_5_2_bool2) {__CLR4_5_24wh4whm6lb4z68.R.inc(6597);__CLB4_5_2_bool2=true;}
                // Do nothing.
                __CLR4_5_24wh4whm6lb4z68.R.inc(6598);break;
            case COMP_DEFLATE:if (!__CLB4_5_2_bool2) {__CLR4_5_24wh4whm6lb4z68.R.inc(6599);__CLB4_5_2_bool2=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(6600);inflater = new Inflater();
                __CLR4_5_24wh4whm6lb4z68.R.inc(6601);break;
            case COMP_FAX_G3_1D:if (!__CLB4_5_2_bool2) {__CLR4_5_24wh4whm6lb4z68.R.inc(6602);__CLB4_5_2_bool2=true;}
            case COMP_FAX_G3_2D:if (!__CLB4_5_2_bool2) {__CLR4_5_24wh4whm6lb4z68.R.inc(6603);__CLB4_5_2_bool2=true;}
            case COMP_FAX_G4_2D:if (!__CLB4_5_2_bool2) {__CLR4_5_24wh4whm6lb4z68.R.inc(6604);__CLB4_5_2_bool2=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(6605);if ((((sampleSize != 1)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6606)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6607)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6608);throw new RuntimeException(PropertyUtil.getString("TIFFImage7"));
                }

                // Fax T.4 compression options
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6609);if ((((compression == 3)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6610)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6611)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6612);TIFFField t4OptionsField =
                        dir.getField(TIFFImageDecoder.TIFF_T4_OPTIONS);
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6613);if ((((t4OptionsField != null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6614)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6615)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6616);tiffT4Options = t4OptionsField.getAsLong(0);
                    } }else {{
                        // Use default value
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6617);tiffT4Options = 0;
                    }
                }}

                // Fax T.6 compression options
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6618);if ((((compression == 4)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6619)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6620)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6621);TIFFField t6OptionsField =
                        dir.getField(TIFFImageDecoder.TIFF_T6_OPTIONS);
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6622);if ((((t6OptionsField != null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6623)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6624)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6625);tiffT6Options = t6OptionsField.getAsLong(0);
                    } }else {{
                        // Use default value
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6626);tiffT6Options = 0;
                    }
                }}

                // Fax encoding, need to create the Fax decoder.
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6627);decoder = new TIFFFaxDecoder(fillOrder,
                                             tileWidth, tileHeight);
                __CLR4_5_24wh4whm6lb4z68.R.inc(6628);break;

            case COMP_LZW:if (!__CLB4_5_2_bool2) {__CLR4_5_24wh4whm6lb4z68.R.inc(6629);__CLB4_5_2_bool2=true;}
                // LZW compression used, need to create the LZW decoder.
                __CLR4_5_24wh4whm6lb4z68.R.inc(6630);TIFFField predictorField =
                    dir.getField(TIFFImageDecoder.TIFF_PREDICTOR);

                __CLR4_5_24wh4whm6lb4z68.R.inc(6631);if ((((predictorField == null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6632)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6633)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6634);predictor = 1;
                } }else {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6635);predictor = predictorField.getAsInt(0);

                    __CLR4_5_24wh4whm6lb4z68.R.inc(6636);if ((((predictor != 1 && predictor != 2)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6637)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6638)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6639);throw new RuntimeException(PropertyUtil.getString("TIFFImage8"));
                    }

                    }__CLR4_5_24wh4whm6lb4z68.R.inc(6640);if ((((predictor == 2 && sampleSize != 8)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6641)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6642)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6643);throw new RuntimeException(PropertyUtil.getString("TIFFImage9"));
                    }
                }}

                }__CLR4_5_24wh4whm6lb4z68.R.inc(6644);lzwDecoder = new TIFFLZWDecoder(tileWidth, predictor,
                                                samplesPerPixel);
                __CLR4_5_24wh4whm6lb4z68.R.inc(6645);break;

            case COMP_JPEG_OLD:if (!__CLB4_5_2_bool2) {__CLR4_5_24wh4whm6lb4z68.R.inc(6646);__CLB4_5_2_bool2=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(6647);throw new RuntimeException(PropertyUtil.getString("TIFFImage15"));

            default:if (!__CLB4_5_2_bool2) {__CLR4_5_24wh4whm6lb4z68.R.inc(6648);__CLB4_5_2_bool2=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(6649);throw new RuntimeException(PropertyUtil.getString("TIFFImage10") + ": "
                                           + compression);
            }

            __CLR4_5_24wh4whm6lb4z68.R.inc(6650);ColorModel  colorModel  = null;
            __CLR4_5_24wh4whm6lb4z68.R.inc(6651);SampleModel sampleModel = null;
            boolean __CLB4_5_2_bool3=false;__CLR4_5_24wh4whm6lb4z68.R.inc(6652);switch(imageType) {
            case TYPE_BILEVEL:if (!__CLB4_5_2_bool3) {__CLR4_5_24wh4whm6lb4z68.R.inc(6653);__CLB4_5_2_bool3=true;}
            case TYPE_GRAY_4BIT:if (!__CLB4_5_2_bool3) {__CLR4_5_24wh4whm6lb4z68.R.inc(6654);__CLB4_5_2_bool3=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(6655);sampleModel =
                    new MultiPixelPackedSampleModel(dataType,
                                                    tileWidth,
                                                    tileHeight,
                                                    sampleSize);
                __CLR4_5_24wh4whm6lb4z68.R.inc(6656);if ((((imageType == TYPE_BILEVEL)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6657)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6658)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6659);byte[] map = new byte[] {(byte)((((isWhiteZero )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6660)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6661)==0&false))? 255 : 0),
                                             (byte)((((isWhiteZero )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6662)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6663)==0&false))? 0 : 255)};
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6664);colorModel = new IndexColorModel(1, 2, map, map, map);
                } }else {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6665);byte [] map = new byte[16];
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6666);if ((((isWhiteZero)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6667)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6668)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6669);for (int i = 0; (((i < map.length)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6670)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6671)==0&false)); i++) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6672);map[i] = (byte)(255 - (16 * i));
                        }
                    }} }else {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6673);for (int i = 0; (((i < map.length)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6674)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6675)==0&false)); i++) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6676);map[i] = (byte)(16 * i);
                        }
                    }}
                    }__CLR4_5_24wh4whm6lb4z68.R.inc(6677);colorModel = new IndexColorModel(4, 16, map, map, map);
                }
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6678);break;

            case TYPE_GRAY:if (!__CLB4_5_2_bool3) {__CLR4_5_24wh4whm6lb4z68.R.inc(6679);__CLB4_5_2_bool3=true;}
            case TYPE_GRAY_ALPHA:if (!__CLB4_5_2_bool3) {__CLR4_5_24wh4whm6lb4z68.R.inc(6680);__CLB4_5_2_bool3=true;}
            case TYPE_RGB:if (!__CLB4_5_2_bool3) {__CLR4_5_24wh4whm6lb4z68.R.inc(6681);__CLB4_5_2_bool3=true;}
            case TYPE_RGB_ALPHA:if (!__CLB4_5_2_bool3) {__CLR4_5_24wh4whm6lb4z68.R.inc(6682);__CLB4_5_2_bool3=true;}
                // Create a pixel interleaved SampleModel with decreasing
                // band offsets.
                __CLR4_5_24wh4whm6lb4z68.R.inc(6683);int[] reverseOffsets = new int[numBands];
                __CLR4_5_24wh4whm6lb4z68.R.inc(6684);for (int i = 0; (((i < numBands)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6685)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6686)==0&false)); i++) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6687);reverseOffsets[i] = numBands - 1 - i;
                }
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6688);sampleModel = new PixelInterleavedSampleModel(
                    dataType, tileWidth, tileHeight,
                     numBands, numBands * tileWidth, reverseOffsets);

                __CLR4_5_24wh4whm6lb4z68.R.inc(6689);if ((((imageType == TYPE_GRAY)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6690)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6691)==0&false))) {{
                  __CLR4_5_24wh4whm6lb4z68.R.inc(6692);colorModel = new ComponentColorModel(
                    ColorSpace.getInstance(ColorSpace.CS_GRAY),
                     new int[] {sampleSize}, false, false,
                     Transparency.OPAQUE, dataType);
                } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6693);if ((((imageType == TYPE_RGB)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6694)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6695)==0&false))) {{
                  __CLR4_5_24wh4whm6lb4z68.R.inc(6696);colorModel = new ComponentColorModel(
                    ColorSpace.getInstance(ColorSpace.CS_sRGB),
                     new int[] {sampleSize, sampleSize, sampleSize},
                     false, false, Transparency.OPAQUE, dataType);
                } }else {{ // hasAlpha
                    // Transparency.OPAQUE signifies image data that is
                    // completely opaque, meaning that all pixels have an alpha
                    // value of 1.0. So the extra band gets ignored, which is
                    // what we want.
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6697);int transparency = Transparency.OPAQUE;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6698);if ((((extraSamples == 1)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6699)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6700)==0&false))) {{ // associated (premultiplied) alpha
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6701);transparency = Transparency.TRANSLUCENT;
                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6702);if ((((extraSamples == 2)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6703)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6704)==0&false))) {{ // unassociated alpha
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6705);transparency = Transparency.BITMASK;
                    }

                    }}__CLR4_5_24wh4whm6lb4z68.R.inc(6706);colorModel =
                        createAlphaComponentColorModel(dataType,
                                                       numBands,
                                                       extraSamples == 1,
                                                       transparency);
                }
                }}__CLR4_5_24wh4whm6lb4z68.R.inc(6707);break;

            case TYPE_GENERIC:if (!__CLB4_5_2_bool3) {__CLR4_5_24wh4whm6lb4z68.R.inc(6708);__CLB4_5_2_bool3=true;}
            case TYPE_YCBCR_SUB:if (!__CLB4_5_2_bool3) {__CLR4_5_24wh4whm6lb4z68.R.inc(6709);__CLB4_5_2_bool3=true;}
                // For this case we can't display the image, so we create a
                // SampleModel with increasing bandOffsets, and keep the
                // ColorModel as null, as there is no appropriate ColorModel.

                __CLR4_5_24wh4whm6lb4z68.R.inc(6710);int[] bandOffsets = new int[numBands];
                __CLR4_5_24wh4whm6lb4z68.R.inc(6711);for (int i = 0; (((i < numBands)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6712)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6713)==0&false)); i++) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6714);bandOffsets[i] = i;
                }

                }__CLR4_5_24wh4whm6lb4z68.R.inc(6715);sampleModel = new PixelInterleavedSampleModel(
                    dataType, tileWidth, tileHeight,
                     numBands, numBands * tileWidth, bandOffsets);
                __CLR4_5_24wh4whm6lb4z68.R.inc(6716);colorModel = null;
                __CLR4_5_24wh4whm6lb4z68.R.inc(6717);break;

            case TYPE_PALETTE:if (!__CLB4_5_2_bool3) {__CLR4_5_24wh4whm6lb4z68.R.inc(6718);__CLB4_5_2_bool3=true;}
                // Get the colormap
                __CLR4_5_24wh4whm6lb4z68.R.inc(6719);TIFFField cfield = dir.getField(TIFFImageDecoder.TIFF_COLORMAP);
                __CLR4_5_24wh4whm6lb4z68.R.inc(6720);if ((((cfield == null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6721)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6722)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6723);throw new RuntimeException(PropertyUtil.getString("TIFFImage11"));
                } }else {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6724);colormap = cfield.getAsChars();
                }

                // Could be either 1 or 3 bands depending on whether we use
                // IndexColorModel or not.
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6725);if ((((decodePaletteAsShorts)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6726)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6727)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6728);numBands = 3;

                    // If no SampleFormat tag was specified and if the
                    // sampleSize is less than or equal to 8, then the
                    // dataType was initially set to byte, but now we want to
                    // expand the palette as shorts, so the dataType should
                    // be ushort.
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6729);if ((((dataType == DataBuffer.TYPE_BYTE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6730)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6731)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6732);dataType = DataBuffer.TYPE_USHORT;
                    }

                    // Data will have to be unpacked into a 3 band short image
                    // as we do not have a IndexColorModel that can deal with
                    // a colormodel whose entries are of short data type.
                    }__CLR4_5_24wh4whm6lb4z68.R.inc(6733);sampleModel = createPixelInterleavedSampleModel(
                        dataType, tileWidth, tileHeight, numBands);

                  __CLR4_5_24wh4whm6lb4z68.R.inc(6734);colorModel = new ComponentColorModel(
                    ColorSpace.getInstance(ColorSpace.CS_sRGB),
                     new int[] {16, 16, 16}, false, false,
                     Transparency.OPAQUE, dataType);

                } }else {{

                    __CLR4_5_24wh4whm6lb4z68.R.inc(6735);numBands = 1;

                    __CLR4_5_24wh4whm6lb4z68.R.inc(6736);if ((((sampleSize == 4)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6737)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6738)==0&false))) {{
                        // Pixel data will not be unpacked, will use
                        // MPPSM to store packed data and
                        // IndexColorModel to do the unpacking.
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6739);sampleModel = new MultiPixelPackedSampleModel(
                            DataBuffer.TYPE_BYTE, tileWidth, tileHeight,
                             sampleSize);
                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6740);if ((((sampleSize == 8)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6741)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6742)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(6743);sampleModel = createPixelInterleavedSampleModel(
                            DataBuffer.TYPE_BYTE, tileWidth, tileHeight,
                             numBands);
                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6744);if ((((sampleSize == 16)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6745)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6746)==0&false))) {{

                        // Here datatype has to be unsigned since we
                        // are storing indices into the
                        // IndexColorModel palette. Ofcourse the
                        // actual palette entries are allowed to be
                        // negative.
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6747);dataType = DataBuffer.TYPE_USHORT;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6748);sampleModel = createPixelInterleavedSampleModel(
                            DataBuffer.TYPE_USHORT, tileWidth, tileHeight,
                             numBands);
                    }

                    }}}__CLR4_5_24wh4whm6lb4z68.R.inc(6749);int bandLength = colormap.length / 3;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6750);byte[] r = new byte[bandLength];
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6751);byte[] g = new byte[bandLength];
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6752);byte[] b = new byte[bandLength];

                    __CLR4_5_24wh4whm6lb4z68.R.inc(6753);int gIndex = bandLength;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6754);int bIndex = bandLength * 2;

                    __CLR4_5_24wh4whm6lb4z68.R.inc(6755);if ((((dataType == DataBuffer.TYPE_SHORT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6756)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6757)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(6758);for (int i = 0; (((i < bandLength)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6759)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6760)==0&false)); i++) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6761);r[i] = param.decodeSigned16BitsTo8Bits(
                                (short)colormap[i]);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6762);g[i] = param.decodeSigned16BitsTo8Bits(
                                (short)colormap[gIndex + i]);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6763);b[i] = param.decodeSigned16BitsTo8Bits(
                                (short)colormap[bIndex + i]);
                        }

                    }} }else {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(6764);for (int i = 0; (((i < bandLength)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6765)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6766)==0&false)); i++) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6767);r[i] = param.decode16BitsTo8Bits(
                                colormap[i] & 0xffff);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6768);g[i] = param.decode16BitsTo8Bits(
                                colormap[gIndex + i] & 0xffff);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6769);b[i] = param.decode16BitsTo8Bits(
                                colormap[bIndex + i] & 0xffff);
                        }

                    }}

                    }__CLR4_5_24wh4whm6lb4z68.R.inc(6770);colorModel = new IndexColorModel(sampleSize,
                                                     bandLength, r, g, b);
                }
                }__CLR4_5_24wh4whm6lb4z68.R.inc(6771);break;

            default:if (!__CLB4_5_2_bool3) {__CLR4_5_24wh4whm6lb4z68.R.inc(6772);__CLB4_5_2_bool3=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(6773);throw new RuntimeException(PropertyUtil.getString("TIFFImage4") + ": "
                                           + imageType);
            }

        __CLR4_5_24wh4whm6lb4z68.R.inc(6774);Map properties = new HashMap();
        // Set a property "tiff_directory".
        __CLR4_5_24wh4whm6lb4z68.R.inc(6775);properties.put("tiff_directory", dir);

        // System.out.println("Constructed TIFF");

        __CLR4_5_24wh4whm6lb4z68.R.inc(6776);init((CachableRed)null, bounds, colorModel, sampleModel,
             0, 0, properties);
    }finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}

    /**
     * Reads a private IFD from a given offset in the stream.  This
     * method may be used to obtain IFDs that are referenced
     * only by private tag values.
     */
    public TIFFDirectory getPrivateIFD(long offset) throws IOException {try{__CLR4_5_24wh4whm6lb4z68.R.inc(6777);
        __CLR4_5_24wh4whm6lb4z68.R.inc(6778);return new TIFFDirectory(stream, offset, 0);
    }finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}


    public WritableRaster copyData(WritableRaster wr) {try{__CLR4_5_24wh4whm6lb4z68.R.inc(6779);
        __CLR4_5_24wh4whm6lb4z68.R.inc(6780);copyToRaster(wr);
        __CLR4_5_24wh4whm6lb4z68.R.inc(6781);return wr;
    }finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}


    /**
     * Returns tile (tileX, tileY) as a Raster.
     */
    public synchronized Raster getTile(int tileX, int tileY) {try{__CLR4_5_24wh4whm6lb4z68.R.inc(6782);
        __CLR4_5_24wh4whm6lb4z68.R.inc(6783);if (((((tileX < 0) || (tileX >= tilesX)
            || (tileY < 0) || (tileY >= tilesY))&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6784)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6785)==0&false))) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6786);throw new IllegalArgumentException(PropertyUtil.getString("TIFFImage12"));
        }

        // System.out.println("Called TIFF getTile:" + tileX + "," + tileY);


        // Get the data array out of the DataBuffer
        }__CLR4_5_24wh4whm6lb4z68.R.inc(6787);byte[] bdata = null;
        __CLR4_5_24wh4whm6lb4z68.R.inc(6788);short[] sdata = null;
        __CLR4_5_24wh4whm6lb4z68.R.inc(6789);int[] idata = null;

        __CLR4_5_24wh4whm6lb4z68.R.inc(6790);SampleModel sampleModel = getSampleModel();
        __CLR4_5_24wh4whm6lb4z68.R.inc(6791);WritableRaster tile = makeTile(tileX, tileY);

        __CLR4_5_24wh4whm6lb4z68.R.inc(6792);DataBuffer buffer = tile.getDataBuffer();

        __CLR4_5_24wh4whm6lb4z68.R.inc(6793);int dataType = sampleModel.getDataType();
        __CLR4_5_24wh4whm6lb4z68.R.inc(6794);if ((((dataType == DataBuffer.TYPE_BYTE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6795)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6796)==0&false))) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6797);bdata = ((DataBufferByte)buffer).getData();
        } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6798);if ((((dataType == DataBuffer.TYPE_USHORT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6799)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6800)==0&false))) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6801);sdata = ((DataBufferUShort)buffer).getData();
        } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6802);if ((((dataType == DataBuffer.TYPE_SHORT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6803)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6804)==0&false))) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6805);sdata = ((DataBufferShort)buffer).getData();
        } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6806);if ((((dataType == DataBuffer.TYPE_INT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6807)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6808)==0&false))) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6809);idata = ((DataBufferInt)buffer).getData();
        }

        // Variables used for swapping when converting from RGB to BGR
        }}}}__CLR4_5_24wh4whm6lb4z68.R.inc(6810);byte bswap;
        __CLR4_5_24wh4whm6lb4z68.R.inc(6811);short sswap;
        __CLR4_5_24wh4whm6lb4z68.R.inc(6812);int iswap;

        // Save original file pointer position and seek to tile data location.
        __CLR4_5_24wh4whm6lb4z68.R.inc(6813);long saveOffset = 0;
        __CLR4_5_24wh4whm6lb4z68.R.inc(6814);try {
            __CLR4_5_24wh4whm6lb4z68.R.inc(6815);saveOffset = stream.getFilePointer();
            __CLR4_5_24wh4whm6lb4z68.R.inc(6816);stream.seek(tileOffsets[tileY * tilesX + tileX]);
        } catch (IOException ioe) {
            __CLR4_5_24wh4whm6lb4z68.R.inc(6817);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
        }

        // Number of bytes in this tile (strip) after compression.
        __CLR4_5_24wh4whm6lb4z68.R.inc(6818);int byteCount = (int)tileByteCounts[tileY * tilesX + tileX];

        // Find out the number of bytes in the current tile
        __CLR4_5_24wh4whm6lb4z68.R.inc(6819);Rectangle newRect;
        __CLR4_5_24wh4whm6lb4z68.R.inc(6820);if ((((!tiled)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6821)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6822)==0&false))) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6823);newRect = tile.getBounds();
        } }else {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(6824);newRect = new Rectangle(tile.getMinX(), tile.getMinY(),
                                    tileWidth, tileHeight);
        }

        }__CLR4_5_24wh4whm6lb4z68.R.inc(6825);int unitsInThisTile = newRect.width * newRect.height * numBands;

        // Allocate read buffer if needed.
        __CLR4_5_24wh4whm6lb4z68.R.inc(6826);byte[] data = (((compression != COMP_NONE || imageType == TYPE_PALETTE
            )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6827)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6828)==0&false))? new byte[byteCount] : null;

        // Read the data, uncompressing as needed. There are four cases:
        // bilevel, palette-RGB, 4-bit grayscale, and everything else.
        __CLR4_5_24wh4whm6lb4z68.R.inc(6829);if ((((imageType == TYPE_BILEVEL)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6830)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6831)==0&false))) {{ // bilevel
            __CLR4_5_24wh4whm6lb4z68.R.inc(6832);try {
                __CLR4_5_24wh4whm6lb4z68.R.inc(6833);if ((((compression == COMP_PACKBITS)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6834)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6835)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6836);stream.readFully(data, 0, byteCount);

                    // Since the decompressed data will still be packed
                    // 8 pixels into 1 byte, calculate bytesInThisTile
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6837);int bytesInThisTile;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6838);if (((((newRect.width % 8) == 0)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6839)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6840)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6841);bytesInThisTile = (newRect.width / 8) * newRect.height;
                    } }else {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6842);bytesInThisTile =
                            (newRect.width / 8 + 1) * newRect.height;
                    }
                    }__CLR4_5_24wh4whm6lb4z68.R.inc(6843);decodePackbits(data, bytesInThisTile, bdata);
                } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6844);if ((((compression == COMP_LZW)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6845)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6846)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6847);stream.readFully(data, 0, byteCount);
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6848);lzwDecoder.decode(data, bdata, newRect.height);
                } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6849);if ((((compression == COMP_FAX_G3_1D)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6850)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6851)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6852);stream.readFully(data, 0, byteCount);
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6853);decoder.decode1D(bdata, data, 0, newRect.height);
                } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6854);if ((((compression == COMP_FAX_G3_2D)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6855)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6856)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6857);stream.readFully(data, 0, byteCount);
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6858);decoder.decode2D(bdata, data, 0, newRect.height,
                                     tiffT4Options);
                } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6859);if ((((compression == COMP_FAX_G4_2D)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6860)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6861)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6862);stream.readFully(data, 0, byteCount);
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6863);decoder.decodeT6(bdata, data, 0, newRect.height,
                                     tiffT6Options);
                } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6864);if ((((compression == COMP_DEFLATE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6865)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6866)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6867);stream.readFully(data, 0, byteCount);
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6868);inflate(data, bdata);
                } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6869);if ((((compression == COMP_NONE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6870)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6871)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6872);stream.readFully(bdata, 0, byteCount);
                }

                }}}}}}}__CLR4_5_24wh4whm6lb4z68.R.inc(6873);stream.seek(saveOffset);
            } catch (IOException ioe) {
                __CLR4_5_24wh4whm6lb4z68.R.inc(6874);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
            }
        } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6875);if ((((imageType == TYPE_PALETTE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6876)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6877)==0&false))) {{ // palette-RGB
            __CLR4_5_24wh4whm6lb4z68.R.inc(6878);if ((((sampleSize == 16)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6879)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6880)==0&false))) {{

                __CLR4_5_24wh4whm6lb4z68.R.inc(6881);if ((((decodePaletteAsShorts)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6882)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6883)==0&false))) {{

                    __CLR4_5_24wh4whm6lb4z68.R.inc(6884);short[] tempData = null;

                    // At this point the data is 1 banded and will
                    // become 3 banded only after we've done the palette
                    // lookup, since unitsInThisTile was calculated with
                    // 3 bands, we need to divide this by 3.
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6885);int unitsBeforeLookup = unitsInThisTile / 3;

                    // Since unitsBeforeLookup is the number of shorts,
                    // but we do our decompression in terms of bytes, we
                    // need to multiply it by 2 in order to figure out
                    // how many bytes we'll get after decompression.
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6886);int entries = unitsBeforeLookup * 2;

                    // Read the data, if compressed, decode it, reset the pointer
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6887);try {

                        __CLR4_5_24wh4whm6lb4z68.R.inc(6888);if ((((compression == COMP_PACKBITS)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6889)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6890)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(6891);stream.readFully(data, 0, byteCount);

                            __CLR4_5_24wh4whm6lb4z68.R.inc(6892);byte[] byteArray = new byte[entries];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6893);decodePackbits(data, entries, byteArray);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6894);tempData = new short[unitsBeforeLookup];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6895);interpretBytesAsShorts(byteArray, tempData,
                                                   unitsBeforeLookup);

                        }  }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6896);if ((((compression == COMP_LZW)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6897)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6898)==0&false))) {{

                            // Read in all the compressed data for this tile
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6899);stream.readFully(data, 0, byteCount);

                            __CLR4_5_24wh4whm6lb4z68.R.inc(6900);byte[] byteArray = new byte[entries];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6901);lzwDecoder.decode(data, byteArray, newRect.height);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6902);tempData = new short[unitsBeforeLookup];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6903);interpretBytesAsShorts(byteArray, tempData,
                                                   unitsBeforeLookup);

                        }  }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6904);if ((((compression == COMP_DEFLATE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6905)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6906)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(6907);stream.readFully(data, 0, byteCount);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6908);byte[] byteArray = new byte[entries];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6909);inflate(data, byteArray);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6910);tempData = new short[unitsBeforeLookup];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6911);interpretBytesAsShorts(byteArray, tempData,
                                                   unitsBeforeLookup);

                        } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6912);if ((((compression == COMP_NONE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6913)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6914)==0&false))) {{

                            // byteCount tells us how many bytes are there
                            // in this tile, but we need to read in shorts,
                            // which will take half the space, so while
                            // allocating we divide byteCount by 2.
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6915);tempData = new short[byteCount / 2];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6916);readShorts(byteCount / 2, tempData);
                        }

                        }}}}__CLR4_5_24wh4whm6lb4z68.R.inc(6917);stream.seek(saveOffset);

                    } catch (IOException ioe) {
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6918);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
                    }

                    __CLR4_5_24wh4whm6lb4z68.R.inc(6919);if ((((dataType == DataBuffer.TYPE_USHORT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6920)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6921)==0&false))) {{

                        // Expand the palette image into an rgb image with ushort
                        // data type.
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6922);int cmapValue;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6923);int count = 0;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6924);int lookup;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6925);int len = colormap.length / 3;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6926);int len2 = len * 2;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6927);for (int i = 0; (((i < unitsBeforeLookup)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6928)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6929)==0&false)); i++) {{
                            // Get the index into the colormap
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6930);lookup = tempData[i] & 0xffff;
                            // Get the blue value
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6931);cmapValue = colormap[lookup + len2];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6932);sdata[count++] = (short)(cmapValue & 0xffff);
                            // Get the green value
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6933);cmapValue = colormap[lookup + len];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6934);sdata[count++] = (short)(cmapValue & 0xffff);
                            // Get the red value
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6935);cmapValue = colormap[lookup];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6936);sdata[count++] = (short)(cmapValue & 0xffff);
                        }

                    }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6937);if ((((dataType == DataBuffer.TYPE_SHORT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6938)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6939)==0&false))) {{

                        // Expand the palette image into an rgb image with
                        // short data type.
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6940);int cmapValue;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6941);int count = 0;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6942);int lookup;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6943);int len = colormap.length / 3;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6944);int len2 = len * 2;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6945);for (int i = 0; (((i < unitsBeforeLookup)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6946)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6947)==0&false)); i++) {{
                            // Get the index into the colormap
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6948);lookup = tempData[i] & 0xffff;
                            // Get the blue value
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6949);cmapValue = colormap[lookup + len2];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6950);sdata[count++] = (short)cmapValue;
                            // Get the green value
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6951);cmapValue = colormap[lookup + len];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6952);sdata[count++] = (short)cmapValue;
                            // Get the red value
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6953);cmapValue = colormap[lookup];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6954);sdata[count++] = (short)cmapValue;
                        }
                    }}

                }}} }else {{

                    // No lookup being done here, when RGB values are needed,
                    // the associated IndexColorModel can be used to get them.

                    __CLR4_5_24wh4whm6lb4z68.R.inc(6955);try {

                        __CLR4_5_24wh4whm6lb4z68.R.inc(6956);if ((((compression == COMP_PACKBITS)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6957)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6958)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(6959);stream.readFully(data, 0, byteCount);

                            // Since unitsInThisTile is the number of shorts,
                            // but we do our decompression in terms of bytes, we
                            // need to multiply unitsInThisTile by 2 in order to
                            // figure out how many bytes we'll get after
                            // decompression.
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6960);int bytesInThisTile = unitsInThisTile * 2;

                            __CLR4_5_24wh4whm6lb4z68.R.inc(6961);byte[] byteArray = new byte[bytesInThisTile];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6962);decodePackbits(data, bytesInThisTile, byteArray);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6963);interpretBytesAsShorts(byteArray, sdata,
                                                   unitsInThisTile);

                        } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6964);if ((((compression == COMP_LZW)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6965)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6966)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(6967);stream.readFully(data, 0, byteCount);

                            // Since unitsInThisTile is the number of shorts,
                            // but we do our decompression in terms of bytes, we
                            // need to multiply unitsInThisTile by 2 in order to
                            // figure out how many bytes we'll get after
                            // decompression.
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6968);byte[] byteArray = new byte[unitsInThisTile * 2];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6969);lzwDecoder.decode(data, byteArray, newRect.height);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6970);interpretBytesAsShorts(byteArray, sdata,
                                                   unitsInThisTile);

                        }  }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6971);if ((((compression == COMP_DEFLATE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6972)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6973)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(6974);stream.readFully(data, 0, byteCount);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6975);byte[] byteArray = new byte[unitsInThisTile * 2];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6976);inflate(data, byteArray);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6977);interpretBytesAsShorts(byteArray, sdata,
                                                   unitsInThisTile);

                        } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6978);if ((((compression == COMP_NONE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6979)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6980)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(6981);readShorts(byteCount / 2, sdata);
                        }

                        }}}}__CLR4_5_24wh4whm6lb4z68.R.inc(6982);stream.seek(saveOffset);

                    } catch (IOException ioe) {
                        __CLR4_5_24wh4whm6lb4z68.R.inc(6983);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
                    }
                }

            }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6984);if ((((sampleSize == 8)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6985)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6986)==0&false))) {{

                __CLR4_5_24wh4whm6lb4z68.R.inc(6987);if ((((decodePaletteAsShorts)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6988)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6989)==0&false))) {{

                    __CLR4_5_24wh4whm6lb4z68.R.inc(6990);byte[] tempData = null;

                    // At this point the data is 1 banded and will
                    // become 3 banded only after we've done the palette
                    // lookup, since unitsInThisTile was calculated with
                    // 3 bands, we need to divide this by 3.
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6991);int unitsBeforeLookup = unitsInThisTile / 3;

                    // Read the data, if compressed, decode it, reset the pointer
                    __CLR4_5_24wh4whm6lb4z68.R.inc(6992);try {

                        __CLR4_5_24wh4whm6lb4z68.R.inc(6993);if ((((compression == COMP_PACKBITS)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(6994)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(6995)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(6996);stream.readFully(data, 0, byteCount);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6997);tempData = new byte[unitsBeforeLookup];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(6998);decodePackbits(data, unitsBeforeLookup, tempData);

                        }  }else {__CLR4_5_24wh4whm6lb4z68.R.inc(6999);if ((((compression == COMP_LZW)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7000)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7001)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(7002);stream.readFully(data, 0, byteCount);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7003);tempData = new byte[unitsBeforeLookup];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7004);lzwDecoder.decode(data, tempData, newRect.height);

                        }  }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7005);if ((((compression == COMP_DEFLATE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7006)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7007)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(7008);stream.readFully(data, 0, byteCount);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7009);tempData = new byte[unitsBeforeLookup];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7010);inflate(data, tempData);

                        } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7011);if ((((compression == COMP_NONE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7012)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7013)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(7014);tempData = new byte[byteCount];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7015);stream.readFully(tempData, 0, byteCount);
                        } }else {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7016);throw new RuntimeException(PropertyUtil.getString("IFFImage10") + ": "
                                                       + compression);
                        }

                        }}}}__CLR4_5_24wh4whm6lb4z68.R.inc(7017);stream.seek(saveOffset);

                    } catch (IOException ioe) {
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7018);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
                    }

                    // Expand the palette image into an rgb image with ushort
                    // data type.
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7019);int cmapValue;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7020);int count = 0;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7021);int lookup;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7022);int len = colormap.length / 3;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7023);int len2 = len * 2;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7024);for (int i = 0; (((i < unitsBeforeLookup)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7025)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7026)==0&false)); i++) {{
                        // Get the index into the colormap
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7027);lookup = tempData[i] & 0xff;
                        // Get the blue value
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7028);cmapValue = colormap[lookup + len2];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7029);sdata[count++] = (short)(cmapValue & 0xffff);
                        // Get the green value
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7030);cmapValue = colormap[lookup + len];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7031);sdata[count++] = (short)(cmapValue & 0xffff);
                        // Get the red value
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7032);cmapValue = colormap[lookup];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7033);sdata[count++] = (short)(cmapValue & 0xffff);
                    }
                }} }else {{

                    // No lookup being done here, when RGB values are needed,
                    // the associated IndexColorModel can be used to get them.

                    __CLR4_5_24wh4whm6lb4z68.R.inc(7034);try {

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7035);if ((((compression == COMP_PACKBITS)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7036)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7037)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(7038);stream.readFully(data, 0, byteCount);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7039);decodePackbits(data, unitsInThisTile, bdata);

                        } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7040);if ((((compression == COMP_LZW)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7041)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7042)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(7043);stream.readFully(data, 0, byteCount);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7044);lzwDecoder.decode(data, bdata, newRect.height);

                        }  }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7045);if ((((compression == COMP_DEFLATE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7046)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7047)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(7048);stream.readFully(data, 0, byteCount);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7049);inflate(data, bdata);

                        } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7050);if ((((compression == COMP_NONE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7051)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7052)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(7053);stream.readFully(bdata, 0, byteCount);

                        } }else {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7054);throw new RuntimeException(PropertyUtil.getString("TIFFImage10")
                                                       + ": " + compression);
                        }

                        }}}}__CLR4_5_24wh4whm6lb4z68.R.inc(7055);stream.seek(saveOffset);

                    } catch (IOException ioe) {
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7056);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
                    }
                }

            }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7057);if ((((sampleSize == 4)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7058)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7059)==0&false))) {{

                __CLR4_5_24wh4whm6lb4z68.R.inc(7060);int padding = ((((newRect.width % 2 == 0) )&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7061)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7062)==0&false))? 0 : 1;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7063);int bytesPostDecoding = ((newRect.width / 2 + padding) * newRect.height);

                // Output short images
                __CLR4_5_24wh4whm6lb4z68.R.inc(7064);if ((((decodePaletteAsShorts)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7065)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7066)==0&false))) {{

                    __CLR4_5_24wh4whm6lb4z68.R.inc(7067);byte[] tempData = null;

                    __CLR4_5_24wh4whm6lb4z68.R.inc(7068);try {
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7069);stream.readFully(data, 0, byteCount);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7070);stream.seek(saveOffset);
                    } catch (IOException ioe) {
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7071);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
                    }

                    // If compressed, decode the data.
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7072);if ((((compression == COMP_PACKBITS)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7073)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7074)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7075);tempData = new byte[bytesPostDecoding];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7076);decodePackbits(data, bytesPostDecoding, tempData);

                    }  }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7077);if ((((compression == COMP_LZW)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7078)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7079)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7080);tempData = new byte[bytesPostDecoding];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7081);lzwDecoder.decode(data, tempData, newRect.height);

                    }  }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7082);if ((((compression == COMP_DEFLATE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7083)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7084)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7085);tempData = new byte[bytesPostDecoding];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7086);inflate(data, tempData);

                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7087);if ((((compression == COMP_NONE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7088)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7089)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7090);tempData = data;
                    }

                    }}}}__CLR4_5_24wh4whm6lb4z68.R.inc(7091);int bytes = unitsInThisTile / 3;

                    // Unpack the 2 pixels packed into each byte.
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7092);data = new byte[bytes];

                    __CLR4_5_24wh4whm6lb4z68.R.inc(7093);int srcCount = 0;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7094);int dstCount = 0;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7095);for (int j = 0; (((j < newRect.height)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7096)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7097)==0&false)); j++) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7098);for (int i = 0; (((i < newRect.width / 2)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7099)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7100)==0&false)); i++) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7101);data[dstCount++] =
                                (byte)((tempData[srcCount] & 0xf0) >> 4);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7102);data[dstCount++] =
                                (byte)(tempData[srcCount++] & 0x0f);
                        }

                        }__CLR4_5_24wh4whm6lb4z68.R.inc(7103);if ((((padding == 1)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7104)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7105)==0&false))) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7106);data[dstCount++] =
                                (byte)((tempData[srcCount++] & 0xf0) >> 4);
                        }
                    }}

                    }__CLR4_5_24wh4whm6lb4z68.R.inc(7107);int len = colormap.length / 3;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7108);int len2 = len * 2;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7109);int cmapValue;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7110);int lookup;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7111);int count = 0;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7112);for (int i = 0; (((i < bytes)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7113)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7114)==0&false)); i++) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7115);lookup = data[i] & 0xff;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7116);cmapValue = colormap[lookup + len2];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7117);sdata[count++] = (short)(cmapValue & 0xffff);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7118);cmapValue = colormap[lookup + len];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7119);sdata[count++] = (short)(cmapValue & 0xffff);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7120);cmapValue = colormap[lookup];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7121);sdata[count++] = (short)(cmapValue & 0xffff);
                    }
                }} }else {{

                    // Output byte values, use IndexColorModel for unpacking
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7122);try {

                        // If compressed, decode the data.
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7123);if ((((compression == COMP_PACKBITS)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7124)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7125)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(7126);stream.readFully(data, 0, byteCount);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7127);decodePackbits(data, bytesPostDecoding, bdata);

                        }  }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7128);if ((((compression == COMP_LZW)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7129)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7130)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(7131);stream.readFully(data, 0, byteCount);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7132);lzwDecoder.decode(data, bdata, newRect.height);

                        }  }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7133);if ((((compression == COMP_DEFLATE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7134)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7135)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(7136);stream.readFully(data, 0, byteCount);
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7137);inflate(data, bdata);

                        } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7138);if ((((compression == COMP_NONE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7139)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7140)==0&false))) {{

                            __CLR4_5_24wh4whm6lb4z68.R.inc(7141);stream.readFully(bdata, 0, byteCount);
                        }

                        }}}}__CLR4_5_24wh4whm6lb4z68.R.inc(7142);stream.seek(saveOffset);

                    } catch (IOException ioe) {
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7143);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
                    }
                }
            }}
        }}}} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7144);if ((((imageType == TYPE_GRAY_4BIT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7145)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7146)==0&false))) {{ // 4-bit gray
            __CLR4_5_24wh4whm6lb4z68.R.inc(7147);try {
                __CLR4_5_24wh4whm6lb4z68.R.inc(7148);if ((((compression == COMP_PACKBITS)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7149)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7150)==0&false))) {{

                    __CLR4_5_24wh4whm6lb4z68.R.inc(7151);stream.readFully(data, 0, byteCount);

                    // Since the decompressed data will still be packed
                    // 2 pixels into 1 byte, calculate bytesInThisTile
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7152);int bytesInThisTile;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7153);if (((((newRect.width % 8) == 0)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7154)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7155)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7156);bytesInThisTile = (newRect.width / 2) * newRect.height;
                    } }else {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7157);bytesInThisTile = (newRect.width / 2 + 1)
                            * newRect.height;
                    }

                    }__CLR4_5_24wh4whm6lb4z68.R.inc(7158);decodePackbits(data, bytesInThisTile, bdata);

                } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7159);if ((((compression == COMP_LZW)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7160)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7161)==0&false))) {{

                    __CLR4_5_24wh4whm6lb4z68.R.inc(7162);stream.readFully(data, 0, byteCount);
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7163);lzwDecoder.decode(data, bdata, newRect.height);

                }  }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7164);if ((((compression == COMP_DEFLATE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7165)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7166)==0&false))) {{

                    __CLR4_5_24wh4whm6lb4z68.R.inc(7167);stream.readFully(data, 0, byteCount);
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7168);inflate(data, bdata);

                } }else {{

                    __CLR4_5_24wh4whm6lb4z68.R.inc(7169);stream.readFully(bdata, 0, byteCount);
                }

                }}}__CLR4_5_24wh4whm6lb4z68.R.inc(7170);stream.seek(saveOffset);
            } catch (IOException ioe) {
                __CLR4_5_24wh4whm6lb4z68.R.inc(7171);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
            }
        } }else {{ // everything else
            __CLR4_5_24wh4whm6lb4z68.R.inc(7172);try {

                __CLR4_5_24wh4whm6lb4z68.R.inc(7173);if ((((sampleSize == 8)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7174)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7175)==0&false))) {{

                    __CLR4_5_24wh4whm6lb4z68.R.inc(7176);if ((((compression == COMP_NONE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7177)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7178)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7179);stream.readFully(bdata, 0, byteCount);

                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7180);if ((((compression == COMP_LZW)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7181)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7182)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7183);stream.readFully(data, 0, byteCount);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7184);lzwDecoder.decode(data, bdata, newRect.height);

                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7185);if ((((compression == COMP_PACKBITS)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7186)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7187)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7188);stream.readFully(data, 0, byteCount);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7189);decodePackbits(data, unitsInThisTile, bdata);

                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7190);if ((((compression == COMP_DEFLATE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7191)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7192)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7193);stream.readFully(data, 0, byteCount);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7194);inflate(data, bdata);

                    } }else {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7195);throw new RuntimeException(PropertyUtil.getString("TIFFImage10")
                                                   + ": " + compression);
                    }

                }}}}} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7196);if ((((sampleSize == 16)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7197)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7198)==0&false))) {{

                    __CLR4_5_24wh4whm6lb4z68.R.inc(7199);if ((((compression == COMP_NONE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7200)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7201)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7202);readShorts(byteCount / 2, sdata);

                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7203);if ((((compression == COMP_LZW)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7204)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7205)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7206);stream.readFully(data, 0, byteCount);

                        // Since unitsInThisTile is the number of shorts,
                        // but we do our decompression in terms of bytes, we
                        // need to multiply unitsInThisTile by 2 in order to
                        // figure out how many bytes we'll get after
                        // decompression.
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7207);byte[] byteArray = new byte[unitsInThisTile * 2];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7208);lzwDecoder.decode(data, byteArray, newRect.height);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7209);interpretBytesAsShorts(byteArray, sdata,
                                               unitsInThisTile);

                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7210);if ((((compression == COMP_PACKBITS)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7211)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7212)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7213);stream.readFully(data, 0, byteCount);

                        // Since unitsInThisTile is the number of shorts,
                        // but we do our decompression in terms of bytes, we
                        // need to multiply unitsInThisTile by 2 in order to
                        // figure out how many bytes we'll get after
                        // decompression.
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7214);int bytesInThisTile = unitsInThisTile * 2;

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7215);byte[] byteArray = new byte[bytesInThisTile];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7216);decodePackbits(data, bytesInThisTile, byteArray);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7217);interpretBytesAsShorts(byteArray, sdata,
                                               unitsInThisTile);
                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7218);if ((((compression == COMP_DEFLATE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7219)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7220)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7221);stream.readFully(data, 0, byteCount);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7222);byte[] byteArray = new byte[unitsInThisTile * 2];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7223);inflate(data, byteArray);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7224);interpretBytesAsShorts(byteArray, sdata,
                                               unitsInThisTile);

                    }
                }}}}} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7225);if ((((sampleSize == 32
                           && dataType == DataBuffer.TYPE_INT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7226)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7227)==0&false))) {{ // redundant
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7228);if ((((compression == COMP_NONE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7229)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7230)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7231);readInts(byteCount / 4, idata);

                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7232);if ((((compression == COMP_LZW)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7233)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7234)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7235);stream.readFully(data, 0, byteCount);

                        // Since unitsInThisTile is the number of ints,
                        // but we do our decompression in terms of bytes, we
                        // need to multiply unitsInThisTile by 4 in order to
                        // figure out how many bytes we'll get after
                        // decompression.
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7236);byte[] byteArray = new byte[unitsInThisTile * 4];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7237);lzwDecoder.decode(data, byteArray, newRect.height);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7238);interpretBytesAsInts(byteArray, idata,
                                             unitsInThisTile);

                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7239);if ((((compression == COMP_PACKBITS)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7240)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7241)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7242);stream.readFully(data, 0, byteCount);

                        // Since unitsInThisTile is the number of ints,
                        // but we do our decompression in terms of bytes, we
                        // need to multiply unitsInThisTile by 4 in order to
                        // figure out how many bytes we'll get after
                        // decompression.
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7243);int bytesInThisTile = unitsInThisTile * 4;

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7244);byte[] byteArray = new byte[bytesInThisTile];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7245);decodePackbits(data, bytesInThisTile, byteArray);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7246);interpretBytesAsInts(byteArray, idata,
                                             unitsInThisTile);
                    } }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7247);if ((((compression == COMP_DEFLATE)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7248)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7249)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7250);stream.readFully(data, 0, byteCount);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7251);byte[] byteArray = new byte[unitsInThisTile * 4];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7252);inflate(data, byteArray);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7253);interpretBytesAsInts(byteArray, idata,
                                             unitsInThisTile);

                    }
                }}}}}

                }}}__CLR4_5_24wh4whm6lb4z68.R.inc(7254);stream.seek(saveOffset);

            } catch (IOException ioe) {
                __CLR4_5_24wh4whm6lb4z68.R.inc(7255);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
            }

            // Modify the data for certain special cases.
            boolean __CLB4_5_2_bool4=false;__CLR4_5_24wh4whm6lb4z68.R.inc(7256);switch (imageType) {
            case TYPE_GRAY:if (!__CLB4_5_2_bool4) {__CLR4_5_24wh4whm6lb4z68.R.inc(7257);__CLB4_5_2_bool4=true;}
            case TYPE_GRAY_ALPHA:if (!__CLB4_5_2_bool4) {__CLR4_5_24wh4whm6lb4z68.R.inc(7258);__CLB4_5_2_bool4=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(7259);if ((((isWhiteZero)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7260)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7261)==0&false))) {{
                    // Since we are using a ComponentColorModel with this
                    // image, we need to change the WhiteIsZero data to
                    // BlackIsZero data so it will display properly.
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7262);if ((((dataType == DataBuffer.TYPE_BYTE
                        && !(getColorModel() instanceof IndexColorModel))&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7263)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7264)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7265);for (int l = 0; (((l < bdata.length)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7266)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7267)==0&false)); l += numBands) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7268);bdata[l] = (byte)(255 - bdata[l]);
                        }
                    }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7269);if ((((dataType == DataBuffer.TYPE_USHORT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7270)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7271)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7272);int ushortMax = Short.MAX_VALUE - Short.MIN_VALUE;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7273);for (int l = 0; (((l < sdata.length)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7274)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7275)==0&false)); l += numBands) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7276);sdata[l] = (short)(ushortMax - sdata[l]);
                        }

                    }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7277);if ((((dataType == DataBuffer.TYPE_SHORT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7278)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7279)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7280);for (int l = 0; (((l < sdata.length)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7281)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7282)==0&false)); l += numBands) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7283);sdata[l] = (short)(~sdata[l]);
                        }
                    }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7284);if ((((dataType == DataBuffer.TYPE_INT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7285)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7286)==0&false))) {{

                        __CLR4_5_24wh4whm6lb4z68.R.inc(7287);long uintMax = ((long)Integer.MAX_VALUE
                                        - (long)Integer.MIN_VALUE);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7288);for (int l = 0; (((l < idata.length)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7289)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7290)==0&false)); l += numBands) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7291);idata[l] = (int)(uintMax - idata[l]);
                        }
                    }}
                }}}}}
                }__CLR4_5_24wh4whm6lb4z68.R.inc(7292);break;
            case TYPE_RGB:if (!__CLB4_5_2_bool4) {__CLR4_5_24wh4whm6lb4z68.R.inc(7293);__CLB4_5_2_bool4=true;}
                // Change RGB to BGR order, as Java2D displays that faster.
                // Unnecessary for JPEG-in-TIFF as the decoder handles it.
                __CLR4_5_24wh4whm6lb4z68.R.inc(7294);if ((((sampleSize == 8 && compression != COMP_JPEG_TTN2)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7295)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7296)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7297);for (int i = 0; (((i < unitsInThisTile)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7298)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7299)==0&false)); i += 3) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7300);bswap = bdata[i];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7301);bdata[i] = bdata[i + 2];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7302);bdata[i + 2] = bswap;
                    }
                }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7303);if ((((sampleSize == 16)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7304)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7305)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7306);for (int i = 0; (((i < unitsInThisTile)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7307)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7308)==0&false)); i += 3) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7309);sswap = sdata[i];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7310);sdata[i] = sdata[i + 2];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7311);sdata[i + 2] = sswap;
                    }
                }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7312);if ((((sampleSize == 32)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7313)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7314)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7315);if ((((dataType == DataBuffer.TYPE_INT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7316)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7317)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7318);for (int i = 0; (((i < unitsInThisTile)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7319)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7320)==0&false)); i += 3) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7321);iswap = idata[i];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7322);idata[i] = idata[i + 2];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7323);idata[i + 2] = iswap;
                        }
                    }}
                }}
                }}}__CLR4_5_24wh4whm6lb4z68.R.inc(7324);break;
            case TYPE_RGB_ALPHA:if (!__CLB4_5_2_bool4) {__CLR4_5_24wh4whm6lb4z68.R.inc(7325);__CLB4_5_2_bool4=true;}
                // Convert from RGBA to ABGR for Java2D
                __CLR4_5_24wh4whm6lb4z68.R.inc(7326);if ((((sampleSize == 8)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7327)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7328)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7329);for (int i = 0; (((i < unitsInThisTile)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7330)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7331)==0&false)); i += 4) {{
                        // Swap R and A
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7332);bswap = bdata[i];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7333);bdata[i] = bdata[i + 3];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7334);bdata[i + 3] = bswap;

                        // Swap G and B
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7335);bswap = bdata[i + 1];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7336);bdata[i + 1] = bdata[i + 2];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7337);bdata[i + 2] = bswap;
                    }
                }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7338);if ((((sampleSize == 16)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7339)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7340)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7341);for (int i = 0; (((i < unitsInThisTile)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7342)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7343)==0&false)); i += 4) {{
                        // Swap R and A
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7344);sswap = sdata[i];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7345);sdata[i] = sdata[i + 3];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7346);sdata[i + 3] = sswap;

                        // Swap G and B
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7347);sswap = sdata[i + 1];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7348);sdata[i + 1] = sdata[i + 2];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7349);sdata[i + 2] = sswap;
                    }
                }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7350);if ((((sampleSize == 32)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7351)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7352)==0&false))) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7353);if ((((dataType == DataBuffer.TYPE_INT)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7354)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7355)==0&false))) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7356);for (int i = 0; (((i < unitsInThisTile)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7357)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7358)==0&false)); i += 4) {{
                            // Swap R and A
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7359);iswap = idata[i];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7360);idata[i] = idata[i + 3];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7361);idata[i + 3] = iswap;

                            // Swap G and B
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7362);iswap = idata[i + 1];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7363);idata[i + 1] = idata[i + 2];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7364);idata[i + 2] = iswap;
                        }
                    }}
                }}
                }}}__CLR4_5_24wh4whm6lb4z68.R.inc(7365);break;
            case TYPE_YCBCR_SUB:if (!__CLB4_5_2_bool4) {__CLR4_5_24wh4whm6lb4z68.R.inc(7366);__CLB4_5_2_bool4=true;}
                // Post-processing for YCbCr with subsampled chrominance:
                // simply replicate the chroma channels for displayability.
                __CLR4_5_24wh4whm6lb4z68.R.inc(7367);int pixelsPerDataUnit = chromaSubH * chromaSubV;

                __CLR4_5_24wh4whm6lb4z68.R.inc(7368);int numH = newRect.width / chromaSubH;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7369);int numV = newRect.height / chromaSubV;

                __CLR4_5_24wh4whm6lb4z68.R.inc(7370);byte[] tempData = new byte[numH * numV * (pixelsPerDataUnit + 2)];
                __CLR4_5_24wh4whm6lb4z68.R.inc(7371);System.arraycopy(bdata, 0, tempData, 0, tempData.length);

                __CLR4_5_24wh4whm6lb4z68.R.inc(7372);int samplesPerDataUnit = pixelsPerDataUnit * 3;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7373);int[] pixels = new int[samplesPerDataUnit];

                __CLR4_5_24wh4whm6lb4z68.R.inc(7374);int bOffset = 0;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7375);int offsetCb = pixelsPerDataUnit;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7376);int offsetCr = offsetCb + 1;

                __CLR4_5_24wh4whm6lb4z68.R.inc(7377);int y = newRect.y;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7378);for (int j = 0; (((j < numV)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7379)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7380)==0&false)); j++) {{
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7381);int x = newRect.x;
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7382);for (int i = 0; (((i < numH)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7383)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7384)==0&false)); i++) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7385);int cb = tempData[bOffset + offsetCb];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7386);int cr = tempData[bOffset + offsetCr];
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7387);int k = 0;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7388);while ((((k < samplesPerDataUnit)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7389)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7390)==0&false))) {{
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7391);pixels[k++] = tempData[bOffset++];
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7392);pixels[k++] = cb;
                            __CLR4_5_24wh4whm6lb4z68.R.inc(7393);pixels[k++] = cr;
                        }
                        }__CLR4_5_24wh4whm6lb4z68.R.inc(7394);bOffset += 2;
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7395);tile.setPixels(x, y, chromaSubH, chromaSubV, pixels);
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7396);x += chromaSubH;
                    }
                    }__CLR4_5_24wh4whm6lb4z68.R.inc(7397);y += chromaSubV;
                }

                }__CLR4_5_24wh4whm6lb4z68.R.inc(7398);break;
            }
        }

        }}}__CLR4_5_24wh4whm6lb4z68.R.inc(7399);return tile;
    }finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}

    private void readShorts(int shortCount, short[] shortArray) {try{__CLR4_5_24wh4whm6lb4z68.R.inc(7400);

        // Since each short consists of 2 bytes, we need a
        // byte array of double size
        __CLR4_5_24wh4whm6lb4z68.R.inc(7401);int byteCount = 2 * shortCount;
        __CLR4_5_24wh4whm6lb4z68.R.inc(7402);byte[] byteArray = new byte[byteCount];

        __CLR4_5_24wh4whm6lb4z68.R.inc(7403);try {
            __CLR4_5_24wh4whm6lb4z68.R.inc(7404);stream.readFully(byteArray, 0, byteCount);
        } catch (IOException ioe) {
            __CLR4_5_24wh4whm6lb4z68.R.inc(7405);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
        }

        __CLR4_5_24wh4whm6lb4z68.R.inc(7406);interpretBytesAsShorts(byteArray, shortArray, shortCount);
    }finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}

    private void readInts(int intCount, int[] intArray) {try{__CLR4_5_24wh4whm6lb4z68.R.inc(7407);

        // Since each int consists of 4 bytes, we need a
        // byte array of quadruple size
        __CLR4_5_24wh4whm6lb4z68.R.inc(7408);int byteCount = 4 * intCount;
        __CLR4_5_24wh4whm6lb4z68.R.inc(7409);byte[] byteArray = new byte[byteCount];

        __CLR4_5_24wh4whm6lb4z68.R.inc(7410);try {
            __CLR4_5_24wh4whm6lb4z68.R.inc(7411);stream.readFully(byteArray, 0, byteCount);
        } catch (IOException ioe) {
            __CLR4_5_24wh4whm6lb4z68.R.inc(7412);throw new RuntimeException(PropertyUtil.getString("TIFFImage13") + ": "
                                       + ioe.getMessage());
        }

        __CLR4_5_24wh4whm6lb4z68.R.inc(7413);interpretBytesAsInts(byteArray, intArray, intCount);
    }finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}

    // Method to interpret a byte array to a short array, depending on
    // whether the bytes are stored in a big endian or little endian format.
    private void interpretBytesAsShorts(byte[] byteArray,
                                        short[] shortArray,
                                        int shortCount) {try{__CLR4_5_24wh4whm6lb4z68.R.inc(7414);

        __CLR4_5_24wh4whm6lb4z68.R.inc(7415);int j = 0;
        __CLR4_5_24wh4whm6lb4z68.R.inc(7416);int firstByte;
        __CLR4_5_24wh4whm6lb4z68.R.inc(7417);int secondByte;

        __CLR4_5_24wh4whm6lb4z68.R.inc(7418);if ((((isBigEndian)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7419)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7420)==0&false))) {{

            __CLR4_5_24wh4whm6lb4z68.R.inc(7421);for (int i = 0; (((i < shortCount)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7422)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7423)==0&false)); i++) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(7424);firstByte = byteArray[j++] & 0xff;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7425);secondByte = byteArray[j++] & 0xff;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7426);shortArray[i] = (short)((firstByte << 8) + secondByte);
            }

        }} }else {{

            __CLR4_5_24wh4whm6lb4z68.R.inc(7427);for (int i = 0; (((i < shortCount)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7428)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7429)==0&false)); i++) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(7430);firstByte = byteArray[j++] & 0xff;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7431);secondByte = byteArray[j++] & 0xff;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7432);shortArray[i] = (short)((secondByte << 8) + firstByte);
            }
        }}
    }}finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}

    // Method to interpret a byte array to a int array, depending on
    // whether the bytes are stored in a big endian or little endian format.
    private void interpretBytesAsInts(byte[] byteArray,
                                      int[] intArray,
                                      int intCount) {try{__CLR4_5_24wh4whm6lb4z68.R.inc(7433);

        __CLR4_5_24wh4whm6lb4z68.R.inc(7434);int j = 0;

        __CLR4_5_24wh4whm6lb4z68.R.inc(7435);if ((((isBigEndian)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7436)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7437)==0&false))) {{

            __CLR4_5_24wh4whm6lb4z68.R.inc(7438);for (int i = 0; (((i < intCount)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7439)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7440)==0&false)); i++) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(7441);intArray[i] = (((byteArray[j++] & 0xff) << 24)
                               | ((byteArray[j++] & 0xff) << 16)
                               | ((byteArray[j++] & 0xff) << 8)
                               | (byteArray[j++] & 0xff));
            }

        }} }else {{

            __CLR4_5_24wh4whm6lb4z68.R.inc(7442);for (int i = 0; (((i < intCount)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7443)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7444)==0&false)); i++) {{
                __CLR4_5_24wh4whm6lb4z68.R.inc(7445);intArray[i] = ((byteArray[j++] & 0xff)
                              | ((byteArray[j++] & 0xff) << 8)
                              | ((byteArray[j++] & 0xff) << 16)
                              | ((byteArray[j++] & 0xff) << 24));
            }
        }}
    }}finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}

    // Uncompress packbits compressed image data.
    private byte[] decodePackbits(byte[] data, int arraySize, byte[] dst) {try{__CLR4_5_24wh4whm6lb4z68.R.inc(7446);

        __CLR4_5_24wh4whm6lb4z68.R.inc(7447);if ((((dst == null)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7448)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7449)==0&false))) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(7450);dst = new byte[arraySize];
        }

        }__CLR4_5_24wh4whm6lb4z68.R.inc(7451);int srcCount = 0;
        __CLR4_5_24wh4whm6lb4z68.R.inc(7452);int dstCount = 0;
        __CLR4_5_24wh4whm6lb4z68.R.inc(7453);byte repeat;
        __CLR4_5_24wh4whm6lb4z68.R.inc(7454);byte b;

        __CLR4_5_24wh4whm6lb4z68.R.inc(7455);try {

            __CLR4_5_24wh4whm6lb4z68.R.inc(7456);while ((((dstCount < arraySize)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7457)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7458)==0&false))) {{

                __CLR4_5_24wh4whm6lb4z68.R.inc(7459);b = data[srcCount++];

                __CLR4_5_24wh4whm6lb4z68.R.inc(7460);if ((((b >= 0 && b <= 127)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7461)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7462)==0&false))) {{

                    // literal run packet
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7463);for (int i = 0; (((i < (b + 1))&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7464)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7465)==0&false)); i++) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7466);dst[dstCount++] = data[srcCount++];
                    }

                }} }else {__CLR4_5_24wh4whm6lb4z68.R.inc(7467);if ((((b <= -1 && b >= -127)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7468)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7469)==0&false))) {{

                    // 2 byte encoded run packet
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7470);repeat = data[srcCount++];
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7471);for (int i = 0; (((i < (-b + 1))&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7472)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7473)==0&false)); i++) {{
                        __CLR4_5_24wh4whm6lb4z68.R.inc(7474);dst[dstCount++] = repeat;
                    }

                }} }else {{
                    // no-op packet. Do nothing
                    __CLR4_5_24wh4whm6lb4z68.R.inc(7475);srcCount++;
                }
            }}}
        }} catch (java.lang.ArrayIndexOutOfBoundsException ae) {
            __CLR4_5_24wh4whm6lb4z68.R.inc(7476);throw new RuntimeException(PropertyUtil.getString("TIFFImage14") + ": "
                                       + ae.getMessage());
        }

        __CLR4_5_24wh4whm6lb4z68.R.inc(7477);return dst;
    }finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}

    // Need a createColorModel().
    // Create ComponentColorModel for TYPE_RGB images
    private ComponentColorModel createAlphaComponentColorModel(
    int dataType, int numBands,
     boolean isAlphaPremultiplied, int transparency) {try{__CLR4_5_24wh4whm6lb4z68.R.inc(7478);

        __CLR4_5_24wh4whm6lb4z68.R.inc(7479);ComponentColorModel ccm = null;
        __CLR4_5_24wh4whm6lb4z68.R.inc(7480);int[] rgbBits = null;
        __CLR4_5_24wh4whm6lb4z68.R.inc(7481);ColorSpace cs = null;
        boolean __CLB4_5_2_bool5=false;__CLR4_5_24wh4whm6lb4z68.R.inc(7482);switch(numBands) {
            case 2:if (!__CLB4_5_2_bool5) {__CLR4_5_24wh4whm6lb4z68.R.inc(7483);__CLB4_5_2_bool5=true;} // gray+alpha
                __CLR4_5_24wh4whm6lb4z68.R.inc(7484);cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
                __CLR4_5_24wh4whm6lb4z68.R.inc(7485);break;
            case 4:if (!__CLB4_5_2_bool5) {__CLR4_5_24wh4whm6lb4z68.R.inc(7486);__CLB4_5_2_bool5=true;} // RGB+alpha
                __CLR4_5_24wh4whm6lb4z68.R.inc(7487);cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
                __CLR4_5_24wh4whm6lb4z68.R.inc(7488);break;
            default:if (!__CLB4_5_2_bool5) {__CLR4_5_24wh4whm6lb4z68.R.inc(7489);__CLB4_5_2_bool5=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(7490);throw new IllegalArgumentException(PropertyUtil.getString("TIFFImage19") + ": "
                                                   + numBands);
        }

        __CLR4_5_24wh4whm6lb4z68.R.inc(7491);int componentSize = 0;
        boolean __CLB4_5_2_bool6=false;__CLR4_5_24wh4whm6lb4z68.R.inc(7492);switch(dataType) {
            case DataBuffer.TYPE_BYTE:if (!__CLB4_5_2_bool6) {__CLR4_5_24wh4whm6lb4z68.R.inc(7493);__CLB4_5_2_bool6=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(7494);componentSize = 8;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7495);break;
            case DataBuffer.TYPE_USHORT:if (!__CLB4_5_2_bool6) {__CLR4_5_24wh4whm6lb4z68.R.inc(7496);__CLB4_5_2_bool6=true;}
            case DataBuffer.TYPE_SHORT:if (!__CLB4_5_2_bool6) {__CLR4_5_24wh4whm6lb4z68.R.inc(7497);__CLB4_5_2_bool6=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(7498);componentSize = 16;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7499);break;
            case DataBuffer.TYPE_INT:if (!__CLB4_5_2_bool6) {__CLR4_5_24wh4whm6lb4z68.R.inc(7500);__CLB4_5_2_bool6=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(7501);componentSize = 32;
                __CLR4_5_24wh4whm6lb4z68.R.inc(7502);break;
            default:if (!__CLB4_5_2_bool6) {__CLR4_5_24wh4whm6lb4z68.R.inc(7503);__CLB4_5_2_bool6=true;}
                __CLR4_5_24wh4whm6lb4z68.R.inc(7504);throw new IllegalArgumentException(PropertyUtil.getString("TIFFImage20") + ": "
                                                   + dataType);
        }

        __CLR4_5_24wh4whm6lb4z68.R.inc(7505);rgbBits = new int[numBands];
        __CLR4_5_24wh4whm6lb4z68.R.inc(7506);for (int i = 0; (((i < numBands)&&(__CLR4_5_24wh4whm6lb4z68.R.iget(7507)!=0|true))||(__CLR4_5_24wh4whm6lb4z68.R.iget(7508)==0&false)); i++) {{
            __CLR4_5_24wh4whm6lb4z68.R.inc(7509);rgbBits[i] = componentSize;
        }

        }__CLR4_5_24wh4whm6lb4z68.R.inc(7510);ccm = new ComponentColorModel(cs,
                                      rgbBits,
                                      true,
                                      isAlphaPremultiplied,
                                      transparency,
                                      dataType);


        __CLR4_5_24wh4whm6lb4z68.R.inc(7511);return ccm;
    }finally{__CLR4_5_24wh4whm6lb4z68.R.flushNeeded();}}

}
