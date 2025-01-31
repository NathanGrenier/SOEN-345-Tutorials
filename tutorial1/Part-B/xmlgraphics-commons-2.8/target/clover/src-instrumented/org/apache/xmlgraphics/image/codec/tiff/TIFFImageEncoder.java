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

/* $Id: TIFFImageEncoder.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.image.codec.tiff;

import java.awt.Rectangle;
import java.awt.image.ColorModel;
import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.MultiPixelPackedSampleModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.zip.Deflater;

import org.apache.xmlgraphics.image.codec.util.ImageEncodeParam;
import org.apache.xmlgraphics.image.codec.util.ImageEncoderImpl;
import org.apache.xmlgraphics.image.codec.util.PropertyUtil;
import org.apache.xmlgraphics.image.codec.util.SeekableOutputStream;

// CSOFF: ConstantName
// CSOFF: MissingSwitchDefault
// CSOFF: MultipleVariableDeclarations
// CSOFF: OperatorWrap
// CSOFF: WhitespaceAround

/**
 * A baseline TIFF writer. The writer outputs TIFF images in either Bilevel,
 * Greyscale, Palette color or Full Color modes.
 *
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TIFFImageEncoder extends ImageEncoderImpl {public static class __CLR4_5_25sy5sym6lb4zgb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,8404,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Incidental tags
    private static final int TIFF_JPEG_TABLES       = 347;
    private static final int TIFF_YCBCR_SUBSAMPLING = 530;
    private static final int TIFF_YCBCR_POSITIONING = 531;
    private static final int TIFF_REF_BLACK_WHITE   = 532;



    public TIFFImageEncoder(OutputStream output, ImageEncodeParam param) {
        super(output, param);__CLR4_5_25sy5sym6lb4zgb.R.inc(7523);try{__CLR4_5_25sy5sym6lb4zgb.R.inc(7522);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7524);if ((((this.param == null)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7525)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7526)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7527);this.param = new TIFFEncodeParam();
        }
    }}finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    /**
     * Encodes a RenderedImage and writes the output to the
     * OutputStream associated with this ImageEncoder.
     */
    public void encode(RenderedImage im) throws IOException {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(7528);
        // Write the file header (8 bytes).
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7529);writeFileHeader();

        // Get the encoding parameters.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7530);TIFFEncodeParam encodeParam = (TIFFEncodeParam)param;

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7531);Iterator iter = encodeParam.getExtraImages();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7532);if ((((iter != null)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7533)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7534)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7535);int ifdOffset = 8;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7536);RenderedImage nextImage = im;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7537);TIFFEncodeParam nextParam = encodeParam;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7538);boolean hasNext;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7539);do {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7540);hasNext = iter.hasNext();
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7541);ifdOffset = encode(nextImage, nextParam, ifdOffset, !hasNext);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7542);if ((((hasNext)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7543)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7544)==0&false))) {{
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7545);Object obj = iter.next();
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7546);if ((((obj instanceof RenderedImage)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7547)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7548)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7549);nextImage = (RenderedImage)obj;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7550);nextParam = encodeParam;
                    } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7551);if ((((obj instanceof Object[])&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7552)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7553)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7554);Object[] o = (Object[])obj;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7555);nextImage = (RenderedImage)o[0];
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7556);nextParam = (TIFFEncodeParam)o[1];
                    }
                }}}
            }} }while((((hasNext)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7557)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7558)==0&false)));
        } }else {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7559);encode(im, encodeParam, 8, true);
        }
    }}finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    /**
     * Encodes a RenderedImage as part of a multi-page file and writes the output to the
     * OutputStream associated with this ImageEncoder.
     * <p>
     * When you sent all pages, make sure you call finishMultiple() in the end. Otherwise,
     * the generated file will be corrupted.
     * @param context the context object you receive as return value to a previous call to
     *                encodeMultiple(). Set null for the first image.
     * @param img the image
     * @return a context object needed for writing multiple pages for a single image file
     * @throws IOException In case of an I/O error
     */
    public Object encodeMultiple(Object context, RenderedImage img) throws IOException {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(7560);
        // Get the encoding parameters.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7561);TIFFEncodeParam encodeParam = (TIFFEncodeParam)param;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7562);if ((((encodeParam.getExtraImages() != null)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7563)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7564)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7565);throw new IllegalStateException(PropertyUtil.getString("TIFFImageEncoder11"));
        }

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7566);Context c = (Context)context;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7567);if ((((c == null)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7568)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7569)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7570);c = new Context();
            // Write the file header (8 bytes).
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7571);writeFileHeader();
        } }else {{
            //write image
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7572);c.ifdOffset = encode(c.nextImage, encodeParam, c.ifdOffset, false);
        }
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7573);c.nextImage = img;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7574);return c;
    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    /**
     * Signals the encoder that you've finished sending pages for a multi-page image files.
     * @param context the context object you receive as return value to a previous call to
     *                encodeMultiple()
     * @throws IOException In case of an I/O error
     */
    public void finishMultiple(Object context) throws IOException {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(7575);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7576);if ((((context == null)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7577)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7578)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7579);throw new NullPointerException();
        }
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7580);Context c = (Context)context;
        // Get the encoding parameters.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7581);TIFFEncodeParam encodeParam = (TIFFEncodeParam)param;

        //write last image
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7582);c.ifdOffset = encode(c.nextImage, encodeParam, c.ifdOffset, true);
    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    private static class Context {
        //TODO This approach causes always two images to be present at the same time.
        //The encoder has to be changed a little to avoid that.
        private RenderedImage nextImage;
        private int ifdOffset = 8; //Initial offset
    }

    private int encode(RenderedImage im, TIFFEncodeParam encodeParam,
                       int ifdOffset, boolean isLast) throws IOException {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(7583);
        // Currently all images are stored uncompressed.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7584);CompressionValue compression = encodeParam.getCompression();

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7585);if ((((compression == CompressionValue.JPEG_TTN2)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7586)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7587)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7588);throw new IllegalArgumentException(PropertyUtil.getString("TIFFImageEncoder12"));
        }

        // Get tiled output preference.
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7589);boolean isTiled = encodeParam.getWriteTiled();

        // Set bounds.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7590);int minX = im.getMinX();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7591);int minY = im.getMinY();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7592);int width = im.getWidth();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7593);int height = im.getHeight();

        // Get SampleModel.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7594);SampleModel sampleModel = im.getSampleModel();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7595);ColorModel colorModel = im.getColorModel();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7596);int[] sampleSize = sampleModel.getSampleSize();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7597);int dataTypeSize = sampleSize[0];
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7598);int numBands = sampleModel.getNumBands();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7599);int dataType = sampleModel.getDataType();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7600);validateImage(dataTypeSize, sampleSize, numBands, dataType, colorModel);

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7601);boolean dataTypeIsShort = dataType == DataBuffer.TYPE_SHORT
                || dataType == DataBuffer.TYPE_USHORT;

        // Set image type.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7602);ImageInfo imageInfo = ImageInfo.newInstance(im, dataTypeSize, numBands, colorModel,
                encodeParam);

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7603);if ((((imageInfo.getType() == ImageType.UNSUPPORTED)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7604)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7605)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7606);throw new RuntimeException(PropertyUtil.getString("TIFFImageEncoder8"));
        }

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7607);final int numTiles = imageInfo.getNumTiles();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7608);final long bytesPerTile = imageInfo.getBytesPerTile();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7609);final long bytesPerRow = imageInfo.getBytesPerRow();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7610);final int tileHeight = imageInfo.getTileHeight();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7611);final int tileWidth = imageInfo.getTileWidth();

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7612);long[] tileByteCounts = new long[numTiles];
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7613);for (int i = 0; (((i < numTiles)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7614)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7615)==0&false)); i++) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7616);tileByteCounts[i] = bytesPerTile;
        }

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7617);if ((((!isTiled)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7618)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7619)==0&false))) {{
            // Last strip may have lesser rows
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7620);long lastStripRows = height - (tileHeight * (numTiles - 1));
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7621);tileByteCounts[numTiles - 1] = lastStripRows * bytesPerRow;
        }
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7622);long totalBytesOfData = bytesPerTile * (numTiles - 1) + tileByteCounts[numTiles - 1];
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7623);long[] tileOffsets = new long[numTiles];

        // Basic fields - have to be in increasing numerical order.
        // ImageWidth                     256
        // ImageLength                    257
        // BitsPerSample                  258
        // Compression                    259
        // PhotoMetricInterpretation      262
        // StripOffsets                   273
        // RowsPerStrip                   278
        // StripByteCounts                279
        // XResolution                    282
        // YResolution                    283
        // ResolutionUnit                 296

        // Create Directory
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7624);SortedSet<TIFFField> fields = new TreeSet<TIFFField>();

        // Image Width
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7625);fields.add(new TIFFField(TIFFImageDecoder.TIFF_IMAGE_WIDTH,
                                 TIFFField.TIFF_LONG, 1,
                                 new long[] {width}));

        // Image Length
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7626);fields.add(new TIFFField(TIFFImageDecoder.TIFF_IMAGE_LENGTH,
                                 TIFFField.TIFF_LONG, 1,
                                 new long[] {height}));

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7627);char [] shortSampleSize = new char[numBands];
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7628);for (int i = 0; (((i < numBands)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7629)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7630)==0&false)); i++) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7631);shortSampleSize[i] = (char) dataTypeSize;
        }
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7632);fields.add(new TIFFField(TIFFImageDecoder.TIFF_BITS_PER_SAMPLE,
                                 TIFFField.TIFF_SHORT, numBands,
                                 shortSampleSize));

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7633);fields.add(new TIFFField(TIFFImageDecoder.TIFF_COMPRESSION,
                                 TIFFField.TIFF_SHORT, 1,
                                 new char[] {(char)compression.getValue()}));

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7634);fields.add(
            new TIFFField(TIFFImageDecoder.TIFF_PHOTOMETRIC_INTERPRETATION,
                          TIFFField.TIFF_SHORT, 1,
                      new char[] {(char) imageInfo.getType().getPhotometricInterpretation()}));

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7635);if ((((!isTiled)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7636)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7637)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7638);fields.add(new TIFFField(TIFFImageDecoder.TIFF_STRIP_OFFSETS,
                                     TIFFField.TIFF_LONG, numTiles,
                                     tileOffsets));
        }

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7639);fields.add(new TIFFField(TIFFImageDecoder.TIFF_SAMPLES_PER_PIXEL,
                                 TIFFField.TIFF_SHORT, 1,
                                 new char[] {(char)numBands}));

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7640);if ((((!isTiled)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7641)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7642)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7643);fields.add(new TIFFField(TIFFImageDecoder.TIFF_ROWS_PER_STRIP,
                                     TIFFField.TIFF_LONG, 1,
                                     new long[] {tileHeight}));

            __CLR4_5_25sy5sym6lb4zgb.R.inc(7644);fields.add(new TIFFField(TIFFImageDecoder.TIFF_STRIP_BYTE_COUNTS,
                                     TIFFField.TIFF_LONG, numTiles,
                                     tileByteCounts));
        }

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7645);if ((((imageInfo.getColormap() != null)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7646)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7647)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7648);fields.add(new TIFFField(TIFFImageDecoder.TIFF_COLORMAP,
                    TIFFField.TIFF_SHORT, imageInfo.getColormapSize(),
                    imageInfo.getColormap()));
        }

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7649);if ((((isTiled)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7650)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7651)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7652);fields.add(new TIFFField(TIFFImageDecoder.TIFF_TILE_WIDTH,
                                     TIFFField.TIFF_LONG, 1,
                                     new long[] {tileWidth}));

            __CLR4_5_25sy5sym6lb4zgb.R.inc(7653);fields.add(new TIFFField(TIFFImageDecoder.TIFF_TILE_LENGTH,
                                     TIFFField.TIFF_LONG, 1,
                                     new long[] {tileHeight}));

            __CLR4_5_25sy5sym6lb4zgb.R.inc(7654);fields.add(new TIFFField(TIFFImageDecoder.TIFF_TILE_OFFSETS,
                                     TIFFField.TIFF_LONG, numTiles,
                                     tileOffsets));

            __CLR4_5_25sy5sym6lb4zgb.R.inc(7655);fields.add(new TIFFField(TIFFImageDecoder.TIFF_TILE_BYTE_COUNTS,
                                     TIFFField.TIFF_LONG, numTiles,
                                     tileByteCounts));
        }

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7656);if ((((imageInfo.getNumberOfExtraSamples() > 0)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7657)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7658)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7659);char[] extraSamples = new char[imageInfo.getNumberOfExtraSamples()];
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7660);for (int i = 0; (((i < imageInfo.getNumberOfExtraSamples())&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7661)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7662)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7663);extraSamples[i] = (char) imageInfo.getExtraSamplesType().getValue();
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(7664);fields.add(new TIFFField(TIFFImageDecoder.TIFF_EXTRA_SAMPLES,
                    TIFFField.TIFF_SHORT, imageInfo.getNumberOfExtraSamples(),
                                     extraSamples));
        }

        // Data Sample Format Extension fields.
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7665);if ((((dataType != DataBuffer.TYPE_BYTE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7666)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7667)==0&false))) {{
            // SampleFormat
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7668);char[] sampleFormat = new char[numBands];
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7669);if ((((dataType == DataBuffer.TYPE_FLOAT)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7670)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7671)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7672);sampleFormat[0] = 3;
            } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7673);if ((((dataType == DataBuffer.TYPE_USHORT)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7674)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7675)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7676);sampleFormat[0] = 1;
            } }else {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7677);sampleFormat[0] = 2;
            }
            }}__CLR4_5_25sy5sym6lb4zgb.R.inc(7678);for (int b = 1; (((b < numBands)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7679)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7680)==0&false)); b++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7681);sampleFormat[b] = sampleFormat[0];
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(7682);fields.add(new TIFFField(TIFFImageDecoder.TIFF_SAMPLE_FORMAT,
                                     TIFFField.TIFF_SHORT, numBands,
                                     sampleFormat));

            // NOTE: We don't bother setting the SMinSampleValue and
            // SMaxSampleValue fields as these both default to the
            // extrema of the respective data types.  Probably we should
            // check for the presence of the "extrema" property and
            // use it if available.
        }

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7683);if ((((imageInfo.getType() == ImageType.YCBCR)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7684)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7685)==0&false))) {{
            // YCbCrSubSampling: 2 is the default so we must write 1 as
            // we do not (yet) do any subsampling.
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7686);char subsampleH = 1;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7687);char subsampleV = 1;

            __CLR4_5_25sy5sym6lb4zgb.R.inc(7688);fields.add(new TIFFField(TIFF_YCBCR_SUBSAMPLING,
                                     TIFFField.TIFF_SHORT, 2,
                                     new char[] {subsampleH, subsampleV}));


            // YCbCr positioning.
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7689);fields.add(new TIFFField(TIFF_YCBCR_POSITIONING,
                                     TIFFField.TIFF_SHORT, 1,
                                     new char[]
                    {(char) (((((compression == CompressionValue.JPEG_TTN2) )&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7690)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7691)==0&false))? 1 : 2)}));

            // Reference black/white.
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7692);long[][] refbw;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7693);refbw = new long[][] // CCIR 601.1 headroom/footroom (presumptive)
                    {{15, 1}, {235, 1}, {128, 1}, {240, 1}, {128, 1}, {240, 1}};

            __CLR4_5_25sy5sym6lb4zgb.R.inc(7694);fields.add(new TIFFField(TIFF_REF_BLACK_WHITE,
                                     TIFFField.TIFF_RATIONAL, 6,
                                     refbw));
        }

        // ---- No more automatically generated fields should be added
        //      after this point. ----

        // Add extra fields specified via the encoding parameters.
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7695);TIFFField[] extraFields = encodeParam.getExtraFields();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7696);List extantTags = new ArrayList(fields.size());
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7697);for (TIFFField fld : fields) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7698);extantTags.add(fld.getTag());
        }

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7699);for (TIFFField fld : extraFields) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7700);Integer tagValue = fld.getTag();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7701);if ((((!extantTags.contains(tagValue))&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7702)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7703)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7704);fields.add(fld);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7705);extantTags.add(tagValue);
            }
        }}

        // ---- No more fields of any type should be added after this. ----

        // Determine the size of the IFD which is written after the header
        // of the stream or after the data of the previous image in a
        // multi-page stream.
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7706);int dirSize = getDirectorySize(fields);

        // The first data segment is written after the field overflow
        // following the IFD so initialize the first offset accordingly.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7707);tileOffsets[0] = ifdOffset + dirSize;

        // Branch here depending on whether data are being compressed.
        // If not, then the IFD is written immediately.
        // If so then there are three possibilities:
        // A) the OutputStream is a SeekableOutputStream (outCache null);
        // B) the OutputStream is not a SeekableOutputStream and a file cache
        //    is used (outCache non-null, tempFile non-null);
        // C) the OutputStream is not a SeekableOutputStream and a memory cache
        //    is used (outCache non-null, tempFile null).

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7708);OutputStream outCache = null;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7709);byte[] compressBuf = null;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7710);File tempFile = null;

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7711);int nextIFDOffset = 0;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7712);boolean skipByte = false;

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7713);Deflater deflater = null;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7714);boolean jpegRGBToYCbCr = false;

        __CLR4_5_25sy5sym6lb4zgb.R.inc(7715);if ((((compression == CompressionValue.NONE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7716)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7717)==0&false))) {{
            // Determine the number of bytes of padding necessary between
            // the end of the IFD and the first data segment such that the
            // alignment of the data conforms to the specification (required
            // for uncompressed data only).
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7718);int numBytesPadding = 0;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7719);if ((((dataTypeSize == 16 && tileOffsets[0] % 2 != 0)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7720)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7721)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7722);numBytesPadding = 1;
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7723);tileOffsets[0]++;
            } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7724);if ((((dataTypeSize == 32 && tileOffsets[0] % 4 != 0)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7725)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7726)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7727);numBytesPadding = (int)(4 - tileOffsets[0] % 4);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7728);tileOffsets[0] += numBytesPadding;
            }

            // Update the data offsets (which TIFFField stores by reference).
            }}__CLR4_5_25sy5sym6lb4zgb.R.inc(7729);for (int i = 1; (((i < numTiles)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7730)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7731)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7732);tileOffsets[i] = tileOffsets[i - 1] + tileByteCounts[i - 1];
            }

            }__CLR4_5_25sy5sym6lb4zgb.R.inc(7733);if ((((!isLast)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7734)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7735)==0&false))) {{
                // Determine the offset of the next IFD.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7736);nextIFDOffset = (int)(tileOffsets[0] + totalBytesOfData);

                // IFD offsets must be on a word boundary.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7737);if (((((nextIFDOffset & 0x01) != 0)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7738)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7739)==0&false))) {{
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7740);nextIFDOffset++;
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7741);skipByte = true;
                }
            }}

            // Write the IFD and field overflow before the image data.
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(7742);writeDirectory(ifdOffset, fields, nextIFDOffset);

            // Write any padding bytes needed between the end of the IFD
            // and the start of the actual image data.
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7743);if ((((numBytesPadding != 0)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7744)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7745)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7746);for (int padding = 0; (((padding < numBytesPadding)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7747)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7748)==0&false)); padding++) {{
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7749);output.write((byte)0);
                }
            }}
        }} }else {{
            // If compressing, the cannot be written yet as the size of the
            // data segments is unknown.

            __CLR4_5_25sy5sym6lb4zgb.R.inc(7750);if ((((output instanceof SeekableOutputStream)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7751)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7752)==0&false))) {{
                // Simply seek to the first data segment position.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7753);((SeekableOutputStream)output).seek(tileOffsets[0]);
            } }else {{
                // Cache the original OutputStream.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7754);outCache = output;

                __CLR4_5_25sy5sym6lb4zgb.R.inc(7755);try {
                    // Attempt to create a temporary file.
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7756);tempFile = File.createTempFile("jai-SOS-", ".tmp");
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7757);tempFile.deleteOnExit();
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7758);RandomAccessFile raFile = new RandomAccessFile(tempFile, "rw");
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7759);output = new SeekableOutputStream(raFile);

                    // this method is exited!
                } catch (IOException e) {
                    // Allocate memory for the entire image data (!).
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7760);output = new ByteArrayOutputStream((int)totalBytesOfData);
                }
            }

            }__CLR4_5_25sy5sym6lb4zgb.R.inc(7761);int bufSize = 0;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_25sy5sym6lb4zgb.R.inc(7762);switch(compression) {
            case PACKBITS:if (!__CLB4_5_2_bool0) {__CLR4_5_25sy5sym6lb4zgb.R.inc(7763);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7764);bufSize = (int) (bytesPerTile + ((bytesPerRow + 127) / 128) * tileHeight);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7765);break;
            case DEFLATE:if (!__CLB4_5_2_bool0) {__CLR4_5_25sy5sym6lb4zgb.R.inc(7766);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7767);bufSize = (int) bytesPerTile;
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7768);deflater = new Deflater(encodeParam.getDeflateLevel());
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7769);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_25sy5sym6lb4zgb.R.inc(7770);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7771);bufSize = 0;
            }
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7772);if ((((bufSize != 0)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7773)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7774)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7775);compressBuf = new byte[bufSize];
            }
        }}

        // ---- Writing of actual image data ----

        // Buffer for up to tileHeight rows of pixels
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7776);int[] pixels = null;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7777);float[] fpixels = null;

        // Whether to test for contiguous data.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7778);boolean checkContiguous =
            ((dataTypeSize == 1
              && sampleModel instanceof MultiPixelPackedSampleModel
              && dataType == DataBuffer.TYPE_BYTE)
             || (dataTypeSize == 8
              && sampleModel instanceof ComponentSampleModel));

        // Also create a buffer to hold tileHeight lines of the
        // data to be written to the file, so we can use array writes.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7779);byte[] bpixels = null;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7780);if ((((compression != CompressionValue.JPEG_TTN2)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7781)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7782)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7783);if ((((dataType == DataBuffer.TYPE_BYTE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7784)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7785)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7786);bpixels = new byte[tileHeight * tileWidth * numBands];
            } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7787);if ((((dataTypeIsShort)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7788)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7789)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7790);bpixels = new byte[2 * tileHeight * tileWidth * numBands];
            } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7791);if ((((dataType == DataBuffer.TYPE_INT
                      || dataType == DataBuffer.TYPE_FLOAT)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7792)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7793)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7794);bpixels = new byte[4 * tileHeight * tileWidth * numBands];
            }
        }}}}

        // Process tileHeight rows at a time
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7795);int lastRow = minY + height;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7796);int lastCol = minX + width;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7797);int tileNum = 0;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(7798);for (int row = minY; (((row < lastRow)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7799)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7800)==0&false)); row += tileHeight) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7801);int rows = (((isTiled
                )&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7802)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7803)==0&false))? tileHeight : Math.min(tileHeight, lastRow - row);
            __CLR4_5_25sy5sym6lb4zgb.R.inc(7804);int size = rows * tileWidth * numBands;

            __CLR4_5_25sy5sym6lb4zgb.R.inc(7805);for (int col = minX; (((col < lastCol)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7806)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7807)==0&false)); col += tileWidth) {{
                // Grab the pixels
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7808);Raster src =
                    im.getData(new Rectangle(col, row, tileWidth, rows));

                __CLR4_5_25sy5sym6lb4zgb.R.inc(7809);boolean useDataBuffer = false;
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7810);if ((((compression != CompressionValue.JPEG_TTN2)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7811)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7812)==0&false))) {{ // JPEG access Raster
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7813);if ((((checkContiguous)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7814)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7815)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7816);if ((((dataTypeSize == 8)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7817)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7818)==0&false))) {{ // 8-bit
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7819);ComponentSampleModel csm =
                                (ComponentSampleModel)src.getSampleModel();
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7820);int[] bankIndices = csm.getBankIndices();
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7821);int[] bandOffsets = csm.getBandOffsets();
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7822);int pixelStride = csm.getPixelStride();
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7823);int lineStride = csm.getScanlineStride();

                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7824);if ((((pixelStride != numBands
                               || lineStride != bytesPerRow)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7825)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7826)==0&false))) {{
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7827);useDataBuffer = false;
                            } }else {{
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7828);useDataBuffer = true;
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7829);for (int i = 0;
                                    (((useDataBuffer && i < numBands)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7830)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7831)==0&false));
                                    i++) {{
                                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7832);if ((((bankIndices[i] != 0
                                       || bandOffsets[i] != i)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7833)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7834)==0&false))) {{
                                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7835);useDataBuffer = false;
                                    }
                                }}
                            }}
                        }} }else {{ // 1-bit
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7836);MultiPixelPackedSampleModel mpp =
                                (MultiPixelPackedSampleModel)src.getSampleModel();
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7837);if ((((mpp.getNumBands() == 1
                               && mpp.getDataBitOffset() == 0
                               && mpp.getPixelBitStride() == 1)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7838)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7839)==0&false))) {{
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7840);useDataBuffer = true;
                            }
                        }}
                    }}

                    }__CLR4_5_25sy5sym6lb4zgb.R.inc(7841);if ((((!useDataBuffer)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7842)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7843)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7844);if ((((dataType == DataBuffer.TYPE_FLOAT)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7845)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7846)==0&false))) {{
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7847);fpixels = src.getPixels(col, row, tileWidth, rows,
                                                    fpixels);
                        } }else {{
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7848);pixels = src.getPixels(col, row, tileWidth, rows,
                                                   pixels);
                        }
                    }}
                }}

                }__CLR4_5_25sy5sym6lb4zgb.R.inc(7849);int index;

                __CLR4_5_25sy5sym6lb4zgb.R.inc(7850);int pixel = 0;
                __CLR4_5_25sy5sym6lb4zgb.R.inc(7851);int k = 0;
                boolean __CLB4_5_2_bool1=false;__CLR4_5_25sy5sym6lb4zgb.R.inc(7852);switch (dataTypeSize) {

                case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_25sy5sym6lb4zgb.R.inc(7853);__CLB4_5_2_bool1=true;}

                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7854);if ((((useDataBuffer)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7855)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7856)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7857);byte[] btmp =
                            ((DataBufferByte)src.getDataBuffer()).getData();
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7858);MultiPixelPackedSampleModel mpp =
                            (MultiPixelPackedSampleModel)src.getSampleModel();
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7859);int lineStride = mpp.getScanlineStride();
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7860);int inOffset =
                            mpp.getOffset(col
                                          - src.getSampleModelTranslateX(),
                                          row
                                          - src.getSampleModelTranslateY());
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7861);if ((((lineStride == bytesPerRow)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7862)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7863)==0&false))) {{
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7864);System.arraycopy(btmp, inOffset,
                                             bpixels, 0,
                                             (int) bytesPerRow * rows);
                        } }else {{
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7865);int outOffset = 0;
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7866);for (int j = 0; (((j < rows)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7867)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7868)==0&false)); j++) {{
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7869);System.arraycopy(btmp, inOffset,
                                                 bpixels, outOffset,
                                                 (int) bytesPerRow);
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7870);inOffset += lineStride;
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7871);outOffset += bytesPerRow;
                            }
                        }}
                    }} }else {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7872);index = 0;

                        // For each of the rows in a strip
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7873);for (int i = 0; (((i < rows)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7874)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7875)==0&false)); i++) {{

                            // Write number of pixels exactly divisible by 8
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7876);for (int j = 0; (((j < tileWidth / 8)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7877)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7878)==0&false)); j++) {{

                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7879);pixel =
                                    (pixels[index++] << 7)
                                    | (pixels[index++] << 6)
                                    | (pixels[index++] << 5)
                                    | (pixels[index++] << 4)
                                    | (pixels[index++] << 3)
                                    | (pixels[index++] << 2)
                                    | (pixels[index++] << 1)
                                    | pixels[index++];
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7880);bpixels[k++] = (byte)pixel;
                            }

                            // Write the pixels remaining after division by 8
                            }__CLR4_5_25sy5sym6lb4zgb.R.inc(7881);if ((((tileWidth % 8 > 0)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7882)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7883)==0&false))) {{
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7884);pixel = 0;
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7885);for (int j = 0; (((j < tileWidth % 8)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7886)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7887)==0&false)); j++) {{
                                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7888);pixel |= (pixels[index++] << (7 - j));
                                }
                                }__CLR4_5_25sy5sym6lb4zgb.R.inc(7889);bpixels[k++] = (byte)pixel;
                            }
                        }}
                    }}

                    }__CLR4_5_25sy5sym6lb4zgb.R.inc(7890);if ((((compression == CompressionValue.NONE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7891)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7892)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7893);output.write(bpixels, 0, rows * ((tileWidth + 7) / 8));
                    } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7894);if ((((compression == CompressionValue.PACKBITS)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7895)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7896)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7897);int numCompressedBytes =
                            compressPackBits(bpixels, rows,
                                             bytesPerRow,
                                             compressBuf);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7898);tileByteCounts[tileNum++] = numCompressedBytes;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7899);output.write(compressBuf, 0, numCompressedBytes);
                    } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7900);if ((((compression == CompressionValue.DEFLATE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7901)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7902)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7903);int numCompressedBytes =
                            deflate(deflater, bpixels, compressBuf);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7904);tileByteCounts[tileNum++] = numCompressedBytes;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7905);output.write(compressBuf, 0, numCompressedBytes);
                    }

                    }}}__CLR4_5_25sy5sym6lb4zgb.R.inc(7906);break;

                case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_25sy5sym6lb4zgb.R.inc(7907);__CLB4_5_2_bool1=true;}

                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7908);index = 0;

                    // For each of the rows in a strip
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7909);for (int i = 0; (((i < rows)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7910)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7911)==0&false)); i++) {{

                        // Write  the number of pixels that will fit into an
                        // even number of nibbles.
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7912);for (int j = 0; (((j < tileWidth / 2)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7913)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7914)==0&false)); j++) {{
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7915);pixel = (pixels[index++] << 4) | pixels[index++];
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7916);bpixels[k++] = (byte)pixel;
                        }

                        // Last pixel for odd-length lines
                        }__CLR4_5_25sy5sym6lb4zgb.R.inc(7917);if (((((tileWidth & 1) == 1)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7918)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7919)==0&false))) {{
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7920);pixel = pixels[index++] << 4;
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7921);bpixels[k++] = (byte)pixel;
                        }
                    }}

                    }__CLR4_5_25sy5sym6lb4zgb.R.inc(7922);if ((((compression == CompressionValue.NONE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7923)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7924)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7925);output.write(bpixels, 0, rows * ((tileWidth + 1) / 2));
                    } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7926);if ((((compression == CompressionValue.PACKBITS)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7927)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7928)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7929);int numCompressedBytes =
                            compressPackBits(bpixels, rows,
                                             bytesPerRow,
                                             compressBuf);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7930);tileByteCounts[tileNum++] = numCompressedBytes;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7931);output.write(compressBuf, 0, numCompressedBytes);
                    } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7932);if ((((compression == CompressionValue.DEFLATE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7933)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7934)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7935);int numCompressedBytes =
                            deflate(deflater, bpixels, compressBuf);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7936);tileByteCounts[tileNum++] = numCompressedBytes;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7937);output.write(compressBuf, 0, numCompressedBytes);
                    }
                    }}}__CLR4_5_25sy5sym6lb4zgb.R.inc(7938);break;

                case 8:if (!__CLB4_5_2_bool1) {__CLR4_5_25sy5sym6lb4zgb.R.inc(7939);__CLB4_5_2_bool1=true;}

                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7940);if ((((compression != CompressionValue.JPEG_TTN2)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7941)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7942)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7943);if ((((useDataBuffer)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7944)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7945)==0&false))) {{
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7946);byte[] btmp =
                                ((DataBufferByte)src.getDataBuffer()).getData();
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7947);ComponentSampleModel csm =
                                (ComponentSampleModel)src.getSampleModel();
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7948);int inOffset =
                                csm.getOffset(col
                                              - src.getSampleModelTranslateX(),
                                              row
                                              - src.getSampleModelTranslateY());
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7949);int lineStride = csm.getScanlineStride();
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7950);if ((((lineStride == bytesPerRow)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7951)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7952)==0&false))) {{
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7953);System.arraycopy(btmp,
                                                 inOffset,
                                                 bpixels, 0,
                                                 (int) bytesPerRow * rows);
                            } }else {{
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7954);int outOffset = 0;
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7955);for (int j = 0; (((j < rows)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7956)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7957)==0&false)); j++) {{
                                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7958);System.arraycopy(btmp, inOffset,
                                                     bpixels, outOffset,
                                                     (int) bytesPerRow);
                                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7959);inOffset += lineStride;
                                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7960);outOffset += bytesPerRow;
                                }
                            }}
                        }} }else {{
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(7961);for (int i = 0; (((i < size)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7962)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7963)==0&false)); i++) {{
                                __CLR4_5_25sy5sym6lb4zgb.R.inc(7964);bpixels[i] = (byte)pixels[i];
                            }
                        }}
                    }}

                    }__CLR4_5_25sy5sym6lb4zgb.R.inc(7965);if ((((compression == CompressionValue.NONE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7966)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7967)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7968);output.write(bpixels, 0, size);
                    } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7969);if ((((compression == CompressionValue.PACKBITS)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7970)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7971)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7972);int numCompressedBytes =
                            compressPackBits(bpixels, rows,
                                             bytesPerRow,
                                             compressBuf);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7973);tileByteCounts[tileNum++] = numCompressedBytes;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7974);output.write(compressBuf, 0, numCompressedBytes);
                    } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7975);if ((((compression == CompressionValue.DEFLATE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7976)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7977)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7978);int numCompressedBytes =
                            deflate(deflater, bpixels, compressBuf);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7979);tileByteCounts[tileNum++] = numCompressedBytes;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7980);output.write(compressBuf, 0, numCompressedBytes);
                    }
                    }}}__CLR4_5_25sy5sym6lb4zgb.R.inc(7981);break;

                case 16:if (!__CLB4_5_2_bool1) {__CLR4_5_25sy5sym6lb4zgb.R.inc(7982);__CLB4_5_2_bool1=true;}

                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7983);int ls = 0;
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(7984);for (int i = 0; (((i < size)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7985)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7986)==0&false)); i++) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7987);int value = pixels[i];
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7988);bpixels[ls++] = (byte)((value & 0xff00) >> 8);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7989);bpixels[ls++] = (byte) (value & 0x00ff);
                    }

                    }__CLR4_5_25sy5sym6lb4zgb.R.inc(7990);if ((((compression == CompressionValue.NONE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7991)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7992)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7993);output.write(bpixels, 0, size * 2);
                    } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(7994);if ((((compression == CompressionValue.PACKBITS)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(7995)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(7996)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7997);int numCompressedBytes =
                            compressPackBits(bpixels, rows,
                                             bytesPerRow,
                                             compressBuf);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7998);tileByteCounts[tileNum++] = numCompressedBytes;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(7999);output.write(compressBuf, 0, numCompressedBytes);
                    } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(8000);if ((((compression == CompressionValue.DEFLATE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8001)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8002)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8003);int numCompressedBytes =
                            deflate(deflater, bpixels, compressBuf);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8004);tileByteCounts[tileNum++] = numCompressedBytes;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8005);output.write(compressBuf, 0, numCompressedBytes);
                    }
                    }}}__CLR4_5_25sy5sym6lb4zgb.R.inc(8006);break;

                case 32:if (!__CLB4_5_2_bool1) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8007);__CLB4_5_2_bool1=true;}
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8008);if ((((dataType == DataBuffer.TYPE_INT)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8009)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8010)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8011);int li = 0;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8012);for (int i = 0; (((i < size)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8013)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8014)==0&false)); i++) {{
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(8015);int value = pixels[i];
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(8016);bpixels[li++] = (byte)((value & 0xff000000) >>> 24);
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(8017);bpixels[li++] = (byte)((value & 0x00ff0000) >>> 16);
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(8018);bpixels[li++] = (byte)((value & 0x0000ff00) >>> 8);
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(8019);bpixels[li++] = (byte)(value & 0x000000ff);
                        }
                    }} }else {{ // DataBuffer.TYPE_FLOAT
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8020);int lf = 0;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8021);for (int i = 0; (((i < size)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8022)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8023)==0&false)); i++) {{
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(8024);int value = Float.floatToIntBits(fpixels[i]);
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(8025);bpixels[lf++] = (byte)((value & 0xff000000) >>> 24);
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(8026);bpixels[lf++] = (byte)((value & 0x00ff0000) >>> 16);
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(8027);bpixels[lf++] = (byte)((value & 0x0000ff00) >>> 8);
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(8028);bpixels[lf++] = (byte)(value & 0x000000ff);
                        }
                    }}
                    }__CLR4_5_25sy5sym6lb4zgb.R.inc(8029);if ((((compression == CompressionValue.NONE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8030)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8031)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8032);output.write(bpixels, 0, size * 4);
                    } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(8033);if ((((compression == CompressionValue.PACKBITS)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8034)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8035)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8036);int numCompressedBytes =
                            compressPackBits(bpixels, rows,
                                             bytesPerRow,
                                             compressBuf);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8037);tileByteCounts[tileNum++] = numCompressedBytes;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8038);output.write(compressBuf, 0, numCompressedBytes);
                    } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(8039);if ((((compression == CompressionValue.DEFLATE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8040)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8041)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8042);int numCompressedBytes =
                            deflate(deflater, bpixels, compressBuf);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8043);tileByteCounts[tileNum++] = numCompressedBytes;
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8044);output.write(compressBuf, 0, numCompressedBytes);
                    }
                    }}}__CLR4_5_25sy5sym6lb4zgb.R.inc(8045);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8046);__CLB4_5_2_bool1=true;}
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8047);break;
                }
            }
        }}

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(8048);if ((((compression == CompressionValue.NONE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8049)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8050)==0&false))) {{
            // Write an extra byte for IFD word alignment if needed.
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8051);if ((((skipByte)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8052)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8053)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8054);output.write((byte)0);
            }
        }} }else {{
            // Recompute the tile offsets the size of the compressed tiles.
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8055);int totalBytes = 0;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8056);for (int i = 1; (((i < numTiles)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8057)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8058)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8059);int numBytes = (int)tileByteCounts[i - 1];
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8060);totalBytes += numBytes;
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8061);tileOffsets[i] = tileOffsets[i - 1] + numBytes;
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8062);totalBytes += (int)tileByteCounts[numTiles - 1];

            __CLR4_5_25sy5sym6lb4zgb.R.inc(8063);nextIFDOffset = (((isLast
                )&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8064)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8065)==0&false))? 0 : ifdOffset + dirSize + totalBytes;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8066);if (((((nextIFDOffset & 0x01) != 0)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8067)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8068)==0&false))) {{   // make it even
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8069);nextIFDOffset++;
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8070);skipByte = true;
            }

            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8071);if ((((outCache == null)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8072)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8073)==0&false))) {{
                // Original OutputStream must be a SeekableOutputStream.

                // Write an extra byte for IFD word alignment if needed.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8074);if ((((skipByte)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8075)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8076)==0&false))) {{
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8077);output.write((byte)0);
                }

                }__CLR4_5_25sy5sym6lb4zgb.R.inc(8078);SeekableOutputStream sos = (SeekableOutputStream)output;

                // Save current position.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8079);long savePos = sos.getFilePointer();

                // Seek backward to the IFD offset and write IFD.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8080);sos.seek(ifdOffset);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8081);writeDirectory(ifdOffset, fields, nextIFDOffset);

                // Seek forward to position after data.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8082);sos.seek(savePos);
            } }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(8083);if ((((tempFile != null)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8084)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8085)==0&false))) {{

                // Using a file cache for the image data.

                // Open a FileInputStream from which to copy the data.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8086);FileInputStream fileStream = new FileInputStream(tempFile);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8087);try {
                    // Close the original SeekableOutputStream.
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8088);output.close();

                    // Reset variable to the original OutputStream.
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8089);output = outCache;

                    // Write the IFD.
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8090);writeDirectory(ifdOffset, fields, nextIFDOffset);

                    // Write the image data.
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8091);byte[] copyBuffer = new byte[8192];
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8092);int bytesCopied = 0;
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8093);while ((((bytesCopied < totalBytes)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8094)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8095)==0&false))) {{
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8096);int bytesRead = fileStream.read(copyBuffer);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8097);if ((((bytesRead == -1)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8098)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8099)==0&false))) {{
                            __CLR4_5_25sy5sym6lb4zgb.R.inc(8100);break;
                        }
                        }__CLR4_5_25sy5sym6lb4zgb.R.inc(8101);output.write(copyBuffer, 0, bytesRead);
                        __CLR4_5_25sy5sym6lb4zgb.R.inc(8102);bytesCopied += bytesRead;
                    }
                }} finally {
                    // Delete the temporary file.
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8103);fileStream.close();
                }
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8104);boolean isDeleted = tempFile.delete();
                assert (((isDeleted)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8105)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8106)==0&false));

                // Write an extra byte for IFD word alignment if needed.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8107);if ((((skipByte)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8108)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8109)==0&false))) {{
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8110);output.write((byte)0);
                }
            }} }else {__CLR4_5_25sy5sym6lb4zgb.R.inc(8111);if ((((output instanceof ByteArrayOutputStream)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8112)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8113)==0&false))) {{

                // Using a memory cache for the image data.

                __CLR4_5_25sy5sym6lb4zgb.R.inc(8114);ByteArrayOutputStream memoryStream = (ByteArrayOutputStream)output;

                // Reset variable to the original OutputStream.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8115);output = outCache;

                // Write the IFD.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8116);writeDirectory(ifdOffset, fields, nextIFDOffset);

                // Write the image data.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8117);memoryStream.writeTo(output);

                // Write an extra byte for IFD word alignment if needed.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8118);if ((((skipByte)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8119)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8120)==0&false))) {{
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8121);output.write((byte)0);
                }
            }} }else {{
                // This should never happen.
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8122);throw new IllegalStateException(PropertyUtil.getString("TIFFImageEncoder13"));
            }
        }}}}


        }__CLR4_5_25sy5sym6lb4zgb.R.inc(8123);return nextIFDOffset;
    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    private void validateImage(int dataTypeSize, int[] sampleSize, int numBands, int dataType,
            ColorModel colorModel) {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8124);
        // Retrieve and verify sample size.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8125);for (int i = 1; (((i < sampleSize.length)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8126)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8127)==0&false)); i++) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8128);if ((((sampleSize[i] != dataTypeSize)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8129)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8130)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8131);throw new RuntimeException(PropertyUtil.getString("TIFFImageEncoder0"));
            }
        }}

        // Check low bit limits.
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(8132);if (((((dataTypeSize == 1 || dataTypeSize == 4) && numBands != 1)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8133)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8134)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8135);throw new RuntimeException(PropertyUtil.getString("TIFFImageEncoder1"));
        }

        // Retrieve and verify data type.
        }boolean __CLB4_5_2_bool2=false;__CLR4_5_25sy5sym6lb4zgb.R.inc(8136);switch (dataType) {
        case DataBuffer.TYPE_BYTE:if (!__CLB4_5_2_bool2) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8137);__CLB4_5_2_bool2=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8138);if ((((dataTypeSize == 4)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8139)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8140)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8141);throw new RuntimeException(PropertyUtil.getString("TIFFImageEncoder2"));
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8142);break;
        case DataBuffer.TYPE_SHORT:if (!__CLB4_5_2_bool2) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8143);__CLB4_5_2_bool2=true;}
        case DataBuffer.TYPE_USHORT:if (!__CLB4_5_2_bool2) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8144);__CLB4_5_2_bool2=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8145);if ((((dataTypeSize != 16)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8146)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8147)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8148);throw new RuntimeException(PropertyUtil.getString("TIFFImageEncoder3"));
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8149);break;
        case DataBuffer.TYPE_INT:if (!__CLB4_5_2_bool2) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8150);__CLB4_5_2_bool2=true;}
        case DataBuffer.TYPE_FLOAT:if (!__CLB4_5_2_bool2) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8151);__CLB4_5_2_bool2=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8152);if ((((dataTypeSize != 32)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8153)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8154)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8155);throw new RuntimeException(PropertyUtil.getString("TIFFImageEncoder4"));
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8156);break;
        default:if (!__CLB4_5_2_bool2) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8157);__CLB4_5_2_bool2=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8158);throw new RuntimeException(PropertyUtil.getString("TIFFImageEncoder5"));
        }

        __CLR4_5_25sy5sym6lb4zgb.R.inc(8159);if ((((colorModel instanceof IndexColorModel && dataType != DataBuffer.TYPE_BYTE)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8160)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8161)==0&false))) {{
            // Don't support (unsigned) short palette-color images.
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8162);throw new RuntimeException(PropertyUtil.getString("TIFFImageEncoder6"));
        }
    }}finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    /**
     * Calculates the size of the IFD.
     */
    private int getDirectorySize(SortedSet fields) {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8163);
        // Get the number of entries.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8164);int numEntries = fields.size();

        // Initialize the size excluding that of any values > 4 bytes.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8165);int dirSize = 2 + numEntries * 12 + 4;

        // Loop over fields adding the size of all values > 4 bytes.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8166);for (Object field1 : fields) {{
            // Get the field.
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8167);TIFFField field = (TIFFField) field1;

            // Determine the size of the field value.
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8168);int valueSize = field.getCount() * SIZE_OF_TYPE[field.getType()];

            // Add any excess size.
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8169);if ((((valueSize > 4)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8170)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8171)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8172);dirSize += valueSize;
            }
        }}

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(8173);return dirSize;
    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    private void writeFileHeader() throws IOException {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8174);
        // 8 byte image file header

        // Byte order used within the file - Big Endian
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8175);output.write('M');
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8176);output.write('M');

        // Magic value
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8177);output.write(0);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8178);output.write(42);

        // Offset in bytes of the first IFD.
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8179);writeLong(8);
    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    private void writeDirectory(int thisIFDOffset, SortedSet fields,
                                int nextIFDOffset)
        throws IOException {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8180);

        // 2 byte count of number of directory entries (fields)
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8181);int numEntries = fields.size();

        __CLR4_5_25sy5sym6lb4zgb.R.inc(8182);long offsetBeyondIFD = thisIFDOffset + 12 * numEntries + 4 + 2;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8183);List tooBig = new ArrayList();

        // Write number of fields in the IFD
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8184);writeUnsignedShort(numEntries);

        __CLR4_5_25sy5sym6lb4zgb.R.inc(8185);for (Object field1 : fields) {{

            // 12 byte field entry TIFFField
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8186);TIFFField field = (TIFFField) field1;

            // byte 0-1 Tag that identifies a field
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8187);int tag = field.getTag();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8188);writeUnsignedShort(tag);

            // byte 2-3 The field type
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8189);int type = field.getType();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8190);writeUnsignedShort(type);

            // bytes 4-7 the number of values of the indicated type except
            // ASCII-valued fields which require the total number of bytes.
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8191);int count = field.getCount();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8192);int valueSize = getValueSize(field);
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8193);writeLong((((type == TIFFField.TIFF_ASCII )&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8194)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8195)==0&false))? valueSize : count);

            // bytes 8 - 11 the value or value offset
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8196);if ((((valueSize > 4)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8197)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8198)==0&false))) {{

                // We need an offset as data won't fit into 4 bytes
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8199);writeLong(offsetBeyondIFD);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8200);offsetBeyondIFD += valueSize;
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8201);tooBig.add(field);

            } }else {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8202);writeValuesAsFourBytes(field);
            }

        }}

        // Address of next IFD
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(8203);writeLong(nextIFDOffset);

        // Write the tag values that did not fit into 4 bytes
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8204);for (Object aTooBig : tooBig) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8205);writeValues((TIFFField) aTooBig);
        }
    }}finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    /**
     * Determine the number of bytes in the value portion of the field.
     */
    private static int getValueSize(TIFFField field) throws UnsupportedEncodingException {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8206);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8207);int type = field.getType();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8208);int count = field.getCount();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8209);int valueSize = 0;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8210);if ((((type == TIFFField.TIFF_ASCII)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8211)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8212)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8213);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8214)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8215)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8216);byte[] stringBytes = field.getAsString(i).getBytes("UTF-8");   // note: default encoding @work here!
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8217);valueSize += stringBytes.length;
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8218);if ((((stringBytes[stringBytes.length - 1] != 0)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8219)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8220)==0&false))) {{
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8221);valueSize++;
                }
            }}
        }} }else {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8222);valueSize = count * SIZE_OF_TYPE[type];
        }
        }__CLR4_5_25sy5sym6lb4zgb.R.inc(8223);return valueSize;
    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    private static final int[] SIZE_OF_TYPE = {
        0, //  0 = n/a
        1, //  1 = byte
        1, //  2 = ascii
        2, //  3 = short
        4, //  4 = long
        8, //  5 = rational
        1, //  6 = sbyte
        1, //  7 = undefined
        2, //  8 = sshort
        4, //  9 = slong
        8, // 10 = srational
        4, // 11 = float
        8  // 12 = double
    };

    private void writeValuesAsFourBytes(TIFFField field) throws IOException {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8224);

        __CLR4_5_25sy5sym6lb4zgb.R.inc(8225);int dataType = field.getType();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8226);int count = field.getCount();

        boolean __CLB4_5_2_bool3=false;__CLR4_5_25sy5sym6lb4zgb.R.inc(8227);switch (dataType) {

            // unsigned 8 bits
        case TIFFField.TIFF_BYTE:if (!__CLB4_5_2_bool3) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8228);__CLB4_5_2_bool3=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8229);byte[] bytes = field.getAsBytes();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8230);if ((((count > 4)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8231)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8232)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8233);count = 4;
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8234);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8235)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8236)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8237);output.write(bytes[i]);
            }

            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8238);for (int i = 0; (((i < (4 - count))&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8239)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8240)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8241);output.write(0);
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8242);break;

            // unsigned 16 bits
        case TIFFField.TIFF_SHORT:if (!__CLB4_5_2_bool3) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8243);__CLB4_5_2_bool3=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8244);char[] chars = field.getAsChars();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8245);if ((((count > 2)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8246)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8247)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8248);count = 2;
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8249);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8250)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8251)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8252);writeUnsignedShort(chars[i]);
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8253);for (int i = 0; (((i < (2 - count))&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8254)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8255)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8256);writeUnsignedShort(0);
            }

            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8257);break;

            // unsigned 32 bits
        case TIFFField.TIFF_LONG:if (!__CLB4_5_2_bool3) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8258);__CLB4_5_2_bool3=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8259);long[] longs = field.getAsLongs();

            __CLR4_5_25sy5sym6lb4zgb.R.inc(8260);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8261)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8262)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8263);writeLong(longs[i]);
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8264);break;
        }

    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    private void writeValues(TIFFField field) throws IOException {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8265);

        __CLR4_5_25sy5sym6lb4zgb.R.inc(8266);int dataType = field.getType();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8267);int count = field.getCount();

        boolean __CLB4_5_2_bool4=false;__CLR4_5_25sy5sym6lb4zgb.R.inc(8268);switch (dataType) {

            // unsigned 8 bits
        case TIFFField.TIFF_BYTE:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8269);__CLB4_5_2_bool4=true;}
        case TIFFField.TIFF_SBYTE:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8270);__CLB4_5_2_bool4=true;}
        case TIFFField.TIFF_UNDEFINED:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8271);__CLB4_5_2_bool4=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8272);byte[] bytes = field.getAsBytes();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8273);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8274)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8275)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8276);output.write(bytes[i]);
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8277);break;

            // unsigned 16 bits
        case TIFFField.TIFF_SHORT:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8278);__CLB4_5_2_bool4=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8279);char[] chars = field.getAsChars();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8280);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8281)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8282)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8283);writeUnsignedShort(chars[i]);
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8284);break;
        case TIFFField.TIFF_SSHORT:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8285);__CLB4_5_2_bool4=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8286);short[] shorts = field.getAsShorts();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8287);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8288)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8289)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8290);writeUnsignedShort(shorts[i]);
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8291);break;

            // unsigned 32 bits
        case TIFFField.TIFF_LONG:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8292);__CLB4_5_2_bool4=true;}
        case TIFFField.TIFF_SLONG:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8293);__CLB4_5_2_bool4=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8294);long[] longs = field.getAsLongs();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8295);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8296)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8297)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8298);writeLong(longs[i]);
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8299);break;

        case TIFFField.TIFF_FLOAT:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8300);__CLB4_5_2_bool4=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8301);float[] floats = field.getAsFloats();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8302);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8303)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8304)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8305);int intBits = Float.floatToIntBits(floats[i]);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8306);writeLong(intBits);
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8307);break;

        case TIFFField.TIFF_DOUBLE:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8308);__CLB4_5_2_bool4=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8309);double[] doubles = field.getAsDoubles();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8310);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8311)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8312)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8313);long longBits = Double.doubleToLongBits(doubles[i]);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8314);writeLong(longBits >>> 32);           // write upper 32 bits
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8315);writeLong(longBits & 0xffffffffL);    // write lower 32 bits
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8316);break;

        case TIFFField.TIFF_RATIONAL:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8317);__CLB4_5_2_bool4=true;}
        case TIFFField.TIFF_SRATIONAL:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8318);__CLB4_5_2_bool4=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8319);long[][] rationals = field.getAsRationals();
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8320);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8321)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8322)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8323);writeLong(rationals[i][0]);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8324);writeLong(rationals[i][1]);
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8325);break;

        case TIFFField.TIFF_ASCII:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8326);__CLB4_5_2_bool4=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8327);for (int i = 0; (((i < count)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8328)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8329)==0&false)); i++) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8330);byte[] stringBytes = field.getAsString(i).getBytes("UTF-8");
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8331);output.write(stringBytes);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8332);if ((((stringBytes[stringBytes.length - 1] != (byte)0)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8333)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8334)==0&false))) {{
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8335);output.write((byte)0);
                }
            }}
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8336);break;

        default:if (!__CLB4_5_2_bool4) {__CLR4_5_25sy5sym6lb4zgb.R.inc(8337);__CLB4_5_2_bool4=true;}
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8338);throw new RuntimeException(PropertyUtil.getString("TIFFImageEncoder10"));

        }

    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    // Here s is never expected to have value greater than what can be
    // stored in 2 bytes.
    private void writeUnsignedShort(int s) throws IOException {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8339);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8340);output.write((s & 0xff00) >>> 8);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8341);output.write(s & 0x00ff);
    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    /**
     * despite its name, this method writes only 4 bytes to output.
     * @param l 32bits of this are written as 4 bytes
     * @throws IOException
     */
    private void writeLong(long l) throws IOException {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8342);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8343);output.write((int)((l & 0xff000000) >>> 24));
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8344);output.write((int)((l & 0x00ff0000) >>> 16));
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8345);output.write((int)((l & 0x0000ff00) >>> 8));
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8346);output.write((int) (l & 0x000000ff));
    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

//    /**
//     * Returns the current offset in the supplied OutputStream.
//     * This method should only be used if compressing data.
//     */
//    private long getOffset(OutputStream out) throws IOException {
//        if (out instanceof ByteArrayOutputStream) {
//            return ((ByteArrayOutputStream)out).size();
//        } else if (out instanceof SeekableOutputStream) {
//            return ((SeekableOutputStream)out).getFilePointer();
//        } else {
//            // Shouldn't happen.
//            throw new IllegalStateException(PropertyUtil.getString("TIFFImageEncoder13"));
//        }
//    }

    /**
     * Performs PackBits compression on a tile of data.
     */
    private static int compressPackBits(byte[] data, int numRows,
                                        long bytesPerRow, byte[] compData) {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8347);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8348);int inOffset = 0;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8349);int outOffset = 0;

        __CLR4_5_25sy5sym6lb4zgb.R.inc(8350);for (int i = 0; (((i < numRows)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8351)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8352)==0&false)); i++) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8353);outOffset = packBits(data, inOffset, (int) bytesPerRow,
                                 compData, outOffset);
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8354);inOffset += bytesPerRow;
        }

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(8355);return outOffset;
    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    /**
     * Performs PackBits compression for a single buffer of data.
     * This should be called for each row of each tile. The returned
     * value is the offset into the output buffer after compression.
     */
    private static int packBits(byte[] input, int inOffset, int inCount,
                                byte[] output, int outOffset) {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8356);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8357);int inMax = inOffset + inCount - 1;
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8358);int inMaxMinus1 = inMax - 1;

        __CLR4_5_25sy5sym6lb4zgb.R.inc(8359);while ((((inOffset <= inMax)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8360)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8361)==0&false))) {{
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8362);int run = 1;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8363);byte replicate = input[inOffset];
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8364);while ((((run < 127 && inOffset < inMax
                  && input[inOffset] == input[inOffset + 1])&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8365)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8366)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8367);run++;
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8368);inOffset++;
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8369);if ((((run > 1)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8370)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8371)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8372);inOffset++;
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8373);output[outOffset++] = (byte)(-(run - 1));
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8374);output[outOffset++] = replicate;
            }

            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8375);run = 0;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8376);int saveOffset = outOffset;
            __CLR4_5_25sy5sym6lb4zgb.R.inc(8377);while ((((run < 128
                  && ((inOffset < inMax
                    && input[inOffset] != input[inOffset + 1])
                   || (inOffset < inMaxMinus1
                    && input[inOffset] != input[inOffset + 2])))&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8378)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8379)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8380);run++;
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8381);output[++outOffset] = input[inOffset++];
            }
            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8382);if ((((run > 0)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8383)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8384)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8385);output[saveOffset] = (byte)(run - 1);
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8386);outOffset++;
            }

            }__CLR4_5_25sy5sym6lb4zgb.R.inc(8387);if ((((inOffset == inMax)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8388)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8389)==0&false))) {{
                __CLR4_5_25sy5sym6lb4zgb.R.inc(8390);if ((((run > 0 && run < 128)&&(__CLR4_5_25sy5sym6lb4zgb.R.iget(8391)!=0|true))||(__CLR4_5_25sy5sym6lb4zgb.R.iget(8392)==0&false))) {{
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8393);output[saveOffset]++;
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8394);output[outOffset++] = input[inOffset++];
                } }else {{
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8395);output[outOffset++] = (byte)0;
                    __CLR4_5_25sy5sym6lb4zgb.R.inc(8396);output[outOffset++] = input[inOffset++];
                }
            }}
        }}

        }__CLR4_5_25sy5sym6lb4zgb.R.inc(8397);return outOffset;
    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

    private static int deflate(Deflater deflater,
                               byte[] inflated, byte[] deflated) {try{__CLR4_5_25sy5sym6lb4zgb.R.inc(8398);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8399);deflater.setInput(inflated);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8400);deflater.finish();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8401);int numCompressedBytes = deflater.deflate(deflated);
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8402);deflater.reset();
        __CLR4_5_25sy5sym6lb4zgb.R.inc(8403);return numCompressedBytes;
    }finally{__CLR4_5_25sy5sym6lb4zgb.R.flushNeeded();}}

}
