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

/* $Id: ImageEncodingHelper.java 1896317 2021-12-23 14:30:49Z ssteiner $ */

package org.apache.xmlgraphics.ps;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

import org.apache.xmlgraphics.image.GraphicsUtil;

/**
 * Helper class for encoding bitmap images.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ImageEncodingHelper {public static class __CLR4_5_2ct3ct3m6lb5142{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,16905,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final ColorModel DEFAULT_RGB_COLOR_MODEL = new ComponentColorModel(
            ColorSpace.getInstance(ColorSpace.CS_sRGB),
            false, false, ColorModel.OPAQUE, DataBuffer.TYPE_BYTE);

    private final RenderedImage image;
    private ColorModel encodedColorModel;
    private boolean firstTileDump;
    private boolean enableCMYK;
    private boolean isBGR;
    private boolean isKMYC;
    private boolean outputbw;
    private boolean bwinvert;

    /**
     * Main constructor
     * @param image the image
     */
    public ImageEncodingHelper(RenderedImage image) {
        this(image, true);__CLR4_5_2ct3ct3m6lb5142.R.inc(16600);try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16599);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16601);outputbw = true;
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Main constructor
     * @param image the image
     * @param enableCMYK true to enable CMYK, false to disable
     */
    public ImageEncodingHelper(RenderedImage image, boolean enableCMYK) {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16602);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16603);this.image = image;
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16604);this.enableCMYK = enableCMYK;
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16605);determineEncodedColorModel();
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Returns the associated image.
     * @return the image
     */
    public RenderedImage getImage() {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16606);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16607);return this.image;
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Returns the native {@link ColorModel} used by the image.
     * @return the native color model
     */
    public ColorModel getNativeColorModel() {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16608);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16609);return getImage().getColorModel();
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Returns the effective {@link ColorModel} used to encode the image. If this is different
     * from the value returned by {@link #getNativeColorModel()} this means that the image
     * is converted in order to encode it because no native encoding is currently possible.
     * @return the effective color model
     */
    public ColorModel getEncodedColorModel() {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16610);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16611);return this.encodedColorModel;
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Indicates whether the image has an alpha channel.
     * @return true if the image has an alpha channel
     */
    public boolean hasAlpha() {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16612);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16613);return image.getColorModel().hasAlpha();
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Indicates whether the image is converted during encodation.
     * @return true if the image cannot be encoded in its native format
     */
    public boolean isConverted() {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16614);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16615);return getNativeColorModel() != getEncodedColorModel();
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    private void writeRGBTo(OutputStream out) throws IOException {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16616);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16617);boolean encoded = encodeRenderedImageWithDirectColorModelAsRGB(image, out);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16618);if ((((encoded)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16619)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16620)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16621);return;
        }
        }__CLR4_5_2ct3ct3m6lb5142.R.inc(16622);encodeRenderedImageAsRGB(image, out, outputbw, bwinvert);
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    public static void encodeRenderedImageAsRGB(RenderedImage image, OutputStream out)
            throws IOException {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16623);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16624);encodeRenderedImageAsRGB(image, out, false, false);
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Writes a RenderedImage to an OutputStream by converting it to RGB.
     * @param image the image
     * @param out the OutputStream to write the pixels to
     * @throws IOException if an I/O error occurs
     */
    public static void encodeRenderedImageAsRGB(RenderedImage image, OutputStream out,
            boolean outputbw, boolean bwinvert) throws IOException {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16625);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16626);Raster raster = getRaster(image);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16627);Object data;
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16628);int nbands = raster.getNumBands();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16629);int dataType = raster.getDataBuffer().getDataType();
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2ct3ct3m6lb5142.R.inc(16630);switch (dataType) {
        case DataBuffer.TYPE_BYTE:if (!__CLB4_5_2_bool0) {__CLR4_5_2ct3ct3m6lb5142.R.inc(16631);__CLB4_5_2_bool0=true;}
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16632);data = new byte[nbands];
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16633);break;
        case DataBuffer.TYPE_USHORT:if (!__CLB4_5_2_bool0) {__CLR4_5_2ct3ct3m6lb5142.R.inc(16634);__CLB4_5_2_bool0=true;}
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16635);data = null;
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16636);break;
        case DataBuffer.TYPE_INT:if (!__CLB4_5_2_bool0) {__CLR4_5_2ct3ct3m6lb5142.R.inc(16637);__CLB4_5_2_bool0=true;}
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16638);data = new int[nbands];
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16639);break;
        case DataBuffer.TYPE_FLOAT:if (!__CLB4_5_2_bool0) {__CLR4_5_2ct3ct3m6lb5142.R.inc(16640);__CLB4_5_2_bool0=true;}
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16641);data = new float[nbands];
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16642);break;
        case DataBuffer.TYPE_DOUBLE:if (!__CLB4_5_2_bool0) {__CLR4_5_2ct3ct3m6lb5142.R.inc(16643);__CLB4_5_2_bool0=true;}
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16644);data = new double[nbands];
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16645);break;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ct3ct3m6lb5142.R.inc(16646);__CLB4_5_2_bool0=true;}
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16647);throw new IllegalArgumentException("Unknown data buffer type: " + dataType);
        }

        __CLR4_5_2ct3ct3m6lb5142.R.inc(16648);ColorModel colorModel = image.getColorModel();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16649);int w = image.getWidth();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16650);int h = image.getHeight();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16651);int numDataElements = 3;
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16652);if ((((colorModel.getPixelSize() == 1 && outputbw)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16653)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16654)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16655);numDataElements = 1;
        }

        }__CLR4_5_2ct3ct3m6lb5142.R.inc(16656);byte[] buf = new byte[w * numDataElements];

        __CLR4_5_2ct3ct3m6lb5142.R.inc(16657);for (int y = 0; (((y < h)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16658)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16659)==0&false)); y++) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16660);int idx = -1;
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16661);for (int x = 0; (((x < w)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16662)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16663)==0&false)); x++) {{
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16664);int rgb = colorModel.getRGB(raster.getDataElements(x, y, data));
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16665);if ((((numDataElements > 1)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16666)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16667)==0&false))) {{
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16668);buf[++idx] = (byte)(rgb >> 16);
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16669);buf[++idx] = (byte)(rgb >> 8);
                } }else {__CLR4_5_2ct3ct3m6lb5142.R.inc(16670);if ((((bwinvert && rgb == -1)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16671)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16672)==0&false))) {{
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16673);rgb = 1;
                }
                }}__CLR4_5_2ct3ct3m6lb5142.R.inc(16674);buf[++idx] = (byte)(rgb);
            }
            }__CLR4_5_2ct3ct3m6lb5142.R.inc(16675);out.write(buf);
        }
    }}finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Writes a RenderedImage to an OutputStream. This method optimizes the encoding
     * of the {@link DirectColorModel} as it is returned by {@link ColorModel#getRGBdefault}.
     * @param image the image
     * @param out the OutputStream to write the pixels to
     * @return true if this method encoded this image, false if the image is incompatible
     * @throws IOException if an I/O error occurs
     */
    public static boolean encodeRenderedImageWithDirectColorModelAsRGB(
            RenderedImage image, OutputStream out) throws IOException {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16676);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16677);ColorModel cm = image.getColorModel();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16678);if ((((cm.getColorSpace() != ColorSpace.getInstance(ColorSpace.CS_sRGB))&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16679)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16680)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16681);return false; //Need to go through color management
        }
        }__CLR4_5_2ct3ct3m6lb5142.R.inc(16682);if ((((!(cm instanceof DirectColorModel))&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16683)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16684)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16685);return false; //Only DirectColorModel is supported here
        }
        }__CLR4_5_2ct3ct3m6lb5142.R.inc(16686);DirectColorModel dcm = (DirectColorModel)cm;
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16687);final int[] templateMasks = new int[]
                {0x00ff0000 /*R*/, 0x0000ff00 /*G*/, 0x000000ff /*B*/, 0xff000000 /*A*/};
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16688);int[] masks = dcm.getMasks();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16689);if ((((!Arrays.equals(templateMasks, masks))&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16690)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16691)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16692);return false; //no flexibility here right now, might never be used anyway
        }

        }__CLR4_5_2ct3ct3m6lb5142.R.inc(16693);Raster raster = getRaster(image);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16694);int dataType = raster.getDataBuffer().getDataType();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16695);if ((((dataType != DataBuffer.TYPE_INT)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16696)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16697)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16698);return false; //not supported
        }

        }__CLR4_5_2ct3ct3m6lb5142.R.inc(16699);int w = image.getWidth();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16700);int h = image.getHeight();

        __CLR4_5_2ct3ct3m6lb5142.R.inc(16701);int[] data = new int[w];
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16702);byte[] buf = new byte[w * 3];
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16703);for (int y = 0; (((y < h)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16704)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16705)==0&false)); y++) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16706);int idx = -1;
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16707);raster.getDataElements(0, y, w, 1, data);
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16708);for (int x = 0; (((x < w)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16709)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16710)==0&false)); x++) {{
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16711);int rgb = data[x];
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16712);buf[++idx] = (byte)(rgb >> 16);
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16713);buf[++idx] = (byte)(rgb >> 8);
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16714);buf[++idx] = (byte)(rgb);
            }
            }__CLR4_5_2ct3ct3m6lb5142.R.inc(16715);out.write(buf);
        }

        }__CLR4_5_2ct3ct3m6lb5142.R.inc(16716);return true;
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    private static Raster getRaster(RenderedImage image) {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16717);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16718);if ((((image instanceof BufferedImage)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16719)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16720)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16721);return ((BufferedImage)image).getRaster();
        } }else {{
            //Note: this copies the image data (double memory consumption)
            //TODO Investigate encoding in stripes: RenderedImage.copyData(WritableRaster)
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16722);return image.getData();
        }
    }}finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Converts a byte array containing 24 bit RGB image data to a grayscale
     * image.
     *
     * @param raw
     *            the buffer containing the RGB image data
     * @param width
     *            the width of the image in pixels
     * @param height
     *            the height of the image in pixels
     * @param bitsPerPixel
     *            the number of bits to use per pixel
     * @param out the OutputStream to write the pixels to
     *
     * @throws IOException if an I/O error occurs
     */
    public static void encodeRGBAsGrayScale(
            byte[] raw, int width, int height, int bitsPerPixel, OutputStream out)
    throws IOException {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16723);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16724);int pixelsPerByte = 8 / bitsPerPixel;
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16725);int bytewidth = (width / pixelsPerByte);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16726);if (((((width % pixelsPerByte) != 0)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16727)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16728)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16729);bytewidth++;
        }

        //TODO Rewrite to encode directly from a RenderedImage to avoid buffering the whole RGB
        //image in memory
        }__CLR4_5_2ct3ct3m6lb5142.R.inc(16730);byte[] linedata = new byte[bytewidth];
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16731);byte ib;
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16732);for (int y = 0; (((y < height)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16733)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16734)==0&false)); y++) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16735);ib = 0;
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16736);int i = 3 * y * width;
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16737);for (int x = 0; (((x < width)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16738)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16739)==0&false)); x++, i += 3) {{

                // see http://www.jguru.com/faq/view.jsp?EID=221919
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16740);double greyVal = 0.212671d * (raw[i] & 0xff) + 0.715160d
                        * (raw[i + 1] & 0xff) + 0.072169d
                        * (raw[i + 2] & 0xff);
                boolean __CLB4_5_2_bool1=false;__CLR4_5_2ct3ct3m6lb5142.R.inc(16741);switch (bitsPerPixel) {
                case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2ct3ct3m6lb5142.R.inc(16742);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16743);if ((((greyVal < 128)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16744)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16745)==0&false))) {{
                        __CLR4_5_2ct3ct3m6lb5142.R.inc(16746);ib |= (byte) (1 << (7 - (x % 8)));
                    }
                    }__CLR4_5_2ct3ct3m6lb5142.R.inc(16747);break;
                case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_2ct3ct3m6lb5142.R.inc(16748);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16749);greyVal /= 16;
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16750);ib |= (byte) ((byte) greyVal << ((1 - (x % 2)) * 4));
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16751);break;
                case 8:if (!__CLB4_5_2_bool1) {__CLR4_5_2ct3ct3m6lb5142.R.inc(16752);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16753);ib = (byte) greyVal;
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16754);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_2ct3ct3m6lb5142.R.inc(16755);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16756);throw new UnsupportedOperationException(
                            "Unsupported bits per pixel: " + bitsPerPixel);
                }

                __CLR4_5_2ct3ct3m6lb5142.R.inc(16757);if (((((x % pixelsPerByte) == (pixelsPerByte - 1)
                        || ((x + 1) == width))&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16758)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16759)==0&false))) {{
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16760);linedata[(x / pixelsPerByte)] = ib;
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16761);ib = 0;
                }
            }}
            }__CLR4_5_2ct3ct3m6lb5142.R.inc(16762);out.write(linedata);
        }
    }}finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    private boolean optimizedWriteTo(OutputStream out)
            throws IOException {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16763);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16764);if ((((this.firstTileDump)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16765)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16766)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16767);Raster raster = image.getTile(0, 0);
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16768);DataBuffer buffer = raster.getDataBuffer();
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16769);if ((((buffer instanceof DataBufferByte)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16770)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16771)==0&false))) {{
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16772);byte[] bytes = ((DataBufferByte) buffer).getData();
                // see determineEncodingColorModel() to see why we permute B and R here
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16773);if ((((isBGR)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16774)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16775)==0&false))) {{
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16776);byte[] bytesPermutated = new byte[bytes.length];
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16777);for (int i = 0; (((i < bytes.length)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16778)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16779)==0&false)); i += 3) {{
                        __CLR4_5_2ct3ct3m6lb5142.R.inc(16780);bytesPermutated[i] = bytes[i + 2];
                        __CLR4_5_2ct3ct3m6lb5142.R.inc(16781);bytesPermutated[i + 1] = bytes[i + 1];
                        __CLR4_5_2ct3ct3m6lb5142.R.inc(16782);bytesPermutated[i + 2] = bytes[i];
                    }
                    }__CLR4_5_2ct3ct3m6lb5142.R.inc(16783);out.write(bytesPermutated);
                } }else {__CLR4_5_2ct3ct3m6lb5142.R.inc(16784);if ((((isKMYC)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16785)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16786)==0&false))) {{
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16787);byte[] bytesPermutated = new byte[bytes.length];
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16788);for (int i = 0; (((i < bytes.length)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16789)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16790)==0&false)); i += 4) {{
                        __CLR4_5_2ct3ct3m6lb5142.R.inc(16791);bytesPermutated[i] = bytes[i + 3];
                        __CLR4_5_2ct3ct3m6lb5142.R.inc(16792);bytesPermutated[i + 1] = bytes[i + 2];
                        __CLR4_5_2ct3ct3m6lb5142.R.inc(16793);bytesPermutated[i + 2] = bytes[i + 1];
                        __CLR4_5_2ct3ct3m6lb5142.R.inc(16794);bytesPermutated[i + 3] = bytes[i];
                    }
                    }__CLR4_5_2ct3ct3m6lb5142.R.inc(16795);out.write(bytesPermutated);
                } }else {{
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16796);out.write(bytes);
                }
                }}__CLR4_5_2ct3ct3m6lb5142.R.inc(16797);return true;
            }
        }}
        }__CLR4_5_2ct3ct3m6lb5142.R.inc(16798);return false;
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Indicates whether the image consists of multiple tiles.
     * @return true if there are multiple tiles
     */
    protected boolean isMultiTile() {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16799);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16800);int tilesX = image.getNumXTiles();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16801);int tilesY = image.getNumYTiles();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16802);return (tilesX != 1 || tilesY != 1);
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Determines the color model used for encoding the image.
     */
    protected void determineEncodedColorModel() {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16803);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16804);this.firstTileDump = false;
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16805);this.encodedColorModel = DEFAULT_RGB_COLOR_MODEL;

        __CLR4_5_2ct3ct3m6lb5142.R.inc(16806);ColorModel cm = image.getColorModel();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16807);ColorSpace cs = cm.getColorSpace();

        __CLR4_5_2ct3ct3m6lb5142.R.inc(16808);int numComponents = cm.getNumComponents();

        __CLR4_5_2ct3ct3m6lb5142.R.inc(16809);if ((((!isMultiTile())&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16810)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16811)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16812);if ((((numComponents == 1 && cs.getType() == ColorSpace.TYPE_GRAY)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16813)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16814)==0&false))) {{
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16815);if ((((cm.getTransferType() == DataBuffer.TYPE_BYTE)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16816)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16817)==0&false))) {{
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16818);this.firstTileDump = true;
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16819);this.encodedColorModel = cm;
                }
            }} }else {__CLR4_5_2ct3ct3m6lb5142.R.inc(16820);if ((((cm instanceof IndexColorModel)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16821)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16822)==0&false))) {{
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16823);if ((((cm.getTransferType() == DataBuffer.TYPE_BYTE)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16824)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16825)==0&false))) {{
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16826);this.firstTileDump = true;
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16827);this.encodedColorModel = cm;
                }
            }} }else {__CLR4_5_2ct3ct3m6lb5142.R.inc(16828);if ((((cm instanceof ComponentColorModel
                    && (numComponents == 3 || (enableCMYK && numComponents == 4))
                    && !cm.hasAlpha())&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16829)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16830)==0&false))) {{
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16831);Raster raster = image.getTile(0, 0);
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16832);DataBuffer buffer = raster.getDataBuffer();
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16833);SampleModel sampleModel = raster.getSampleModel();
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16834);if ((((sampleModel instanceof PixelInterleavedSampleModel)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16835)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16836)==0&false))) {{
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16837);PixelInterleavedSampleModel piSampleModel;
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16838);piSampleModel = (PixelInterleavedSampleModel)sampleModel;
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16839);int[] offsets = piSampleModel.getBandOffsets();
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16840);for (int i = 0; (((i < offsets.length)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16841)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16842)==0&false)); i++) {{
                        __CLR4_5_2ct3ct3m6lb5142.R.inc(16843);if ((((offsets[i] != i && offsets[i] != offsets.length - 1 - i)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16844)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16845)==0&false))) {{
                            //Don't encode directly as samples are not next to each other
                            //i.e. offsets are not 012 (RGB) or 0123 (CMYK)
                            // let also pass 210 BGR and 3210 (KYMC); 3210 will be skipped below
                            // if 210 (BGR) the B and R bytes will be permuted later in optimizeWriteTo()
                            __CLR4_5_2ct3ct3m6lb5142.R.inc(16846);return;
                        }
                    }}
                    // check if we are in a BGR case; this is added here as a workaround for bug fix
                    // http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6549882 that causes some PNG
                    // images to be loaded as BGR with the consequence that performance was being impacted
                    }__CLR4_5_2ct3ct3m6lb5142.R.inc(16847);this.isBGR = false;
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16848);if ((((offsets.length == 3 && offsets[0] == 2 && offsets[1] == 1 && offsets[2] == 0)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16849)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16850)==0&false))) {{
                        __CLR4_5_2ct3ct3m6lb5142.R.inc(16851);this.isBGR = true;
                    }
                    // make sure we did not get here due to a KMYC image
                    }__CLR4_5_2ct3ct3m6lb5142.R.inc(16852);if ((((offsets.length == 4 && offsets[0] == 3 && offsets[1] == 2 && offsets[2] == 1
                            && offsets[3] == 0)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16853)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16854)==0&false))) {{
                        __CLR4_5_2ct3ct3m6lb5142.R.inc(16855);isKMYC = true;
                    }
                }}
                }__CLR4_5_2ct3ct3m6lb5142.R.inc(16856);if ((((cm.getTransferType() == DataBuffer.TYPE_BYTE
                        && buffer.getOffset() == 0
                        && buffer.getNumBanks() == 1)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16857)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16858)==0&false))) {{
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16859);this.firstTileDump = true;
                    __CLR4_5_2ct3ct3m6lb5142.R.inc(16860);this.encodedColorModel = cm;
                }
            }}
        }}}}

    }}finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Encodes the image and writes everything to the given OutputStream.
     * @param out the OutputStream
     * @throws IOException if an I/O error occurs
     */
    public void encode(OutputStream out) throws IOException {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16861);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16862);if ((((!isConverted())&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16863)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16864)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16865);if ((((optimizedWriteTo(out))&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16866)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16867)==0&false))) {{
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16868);return;
            }
        }}
        }__CLR4_5_2ct3ct3m6lb5142.R.inc(16869);writeRGBTo(out);
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Encodes the image's alpha channel. If it doesn't have an alpha channel, an
     * {@link IllegalStateException} is thrown.
     * @param out the OutputStream
     * @throws IOException if an I/O error occurs
     */
    public void encodeAlpha(OutputStream out) throws IOException {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16870);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16871);if ((((!hasAlpha())&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16872)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16873)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16874);throw new IllegalStateException("Image doesn't have an alpha channel");
        }
        }__CLR4_5_2ct3ct3m6lb5142.R.inc(16875);Raster alpha = GraphicsUtil.getAlphaRaster(image);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16876);DataBuffer buffer = alpha.getDataBuffer();
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16877);if ((((buffer instanceof DataBufferByte)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16878)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16879)==0&false))) {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16880);out.write(((DataBufferByte)buffer).getData());
        } }else {{
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16881);throw new UnsupportedOperationException(
                    "Alpha raster not supported: " + buffer.getClass().getName());
        }
    }}finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Writes all pixels (color components only) of a RenderedImage to an OutputStream.
     * @param image the image to be encoded
     * @param out the OutputStream to write to
     * @throws IOException if an I/O error occurs
     */
    public static void encodePackedColorComponents(RenderedImage image, OutputStream out)
                throws IOException {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16882);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16883);ImageEncodingHelper helper = new ImageEncodingHelper(image);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16884);helper.encode(out);
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * Create an ImageEncoder for the given RenderImage instance.
     * @param img the image
     * @return the requested ImageEncoder
     */
    public static ImageEncoder createRenderedImageEncoder(RenderedImage img) {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16885);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16886);return new RenderedImageEncoder(img);
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

    /**
     * ImageEncoder implementation for RenderedImage instances.
     */
    private static class RenderedImageEncoder implements ImageEncoder {

        private final RenderedImage img;

        public RenderedImageEncoder(RenderedImage ri) {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16887);
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16888);if ((((ri instanceof BufferedImage && ((BufferedImage) ri).getType() == BufferedImage.TYPE_4BYTE_ABGR)&&(__CLR4_5_2ct3ct3m6lb5142.R.iget(16889)!=0|true))||(__CLR4_5_2ct3ct3m6lb5142.R.iget(16890)==0&false))) {{
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16891);BufferedImage convertedImg =
                        new BufferedImage(ri.getWidth(), ri.getHeight(), BufferedImage.TYPE_INT_RGB);
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16892);Graphics2D g = (Graphics2D) convertedImg.getGraphics();
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16893);g.setBackground(Color.WHITE);
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16894);g.clearRect(0, 0, ri.getWidth(), ri.getHeight());
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16895);g.drawImage((BufferedImage)ri, 0, 0, null);
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16896);g.dispose();
                __CLR4_5_2ct3ct3m6lb5142.R.inc(16897);ri = convertedImg;
            }
            }__CLR4_5_2ct3ct3m6lb5142.R.inc(16898);img = ri;
        }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

        public void writeTo(OutputStream out) throws IOException {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16899);
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16900);ImageEncodingHelper.encodePackedColorComponents(img, out);
        }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}

        public String getImplicitFilter() {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16901);
            __CLR4_5_2ct3ct3m6lb5142.R.inc(16902);return null; //No implicit filters with RenderedImage instances
        }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}
    }

    public void setBWInvert(boolean v) {try{__CLR4_5_2ct3ct3m6lb5142.R.inc(16903);
        __CLR4_5_2ct3ct3m6lb5142.R.inc(16904);bwinvert = v;
    }finally{__CLR4_5_2ct3ct3m6lb5142.R.flushNeeded();}}
}
