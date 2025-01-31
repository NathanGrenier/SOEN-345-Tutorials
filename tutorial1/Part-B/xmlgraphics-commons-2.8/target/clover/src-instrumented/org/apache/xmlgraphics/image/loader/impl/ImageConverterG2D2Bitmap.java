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

/* $Id: ImageConverterG2D2Bitmap.java 1754511 2016-07-29 13:09:37Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Map;

import org.apache.xmlgraphics.image.GraphicsConstants;
import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageProcessingHints;
import org.apache.xmlgraphics.image.loader.ImageSize;
import org.apache.xmlgraphics.java2d.color.DeviceCMYKColorSpace;
import org.apache.xmlgraphics.util.UnitConv;

/**
 * This ImageConverter converts Graphics2D images to a BufferedImage.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ImageConverterG2D2Bitmap extends AbstractImageConverter {public static class __CLR4_5_27tn7tnm6lb4zxx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,10245,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** {@inheritDoc} */
    public Image convert(Image src, Map hints) {try{__CLR4_5_27tn7tnm6lb4zxx.R.inc(10139);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10140);checkSourceFlavor(src);
        assert (((src instanceof ImageGraphics2D)&&(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10141)!=0|true))||(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10142)==0&false));
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10143);ImageGraphics2D g2dImage = (ImageGraphics2D)src;

        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10144);Object formatIntent = hints.get(ImageProcessingHints.BITMAP_TYPE_INTENT);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10145);int bitsPerPixel = 24;
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10146);if ((((ImageProcessingHints.BITMAP_TYPE_INTENT_GRAY.equals(formatIntent))&&(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10147)!=0|true))||(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10148)==0&false))) {{
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10149);bitsPerPixel = 8;
        } }else {__CLR4_5_27tn7tnm6lb4zxx.R.inc(10150);if ((((ImageProcessingHints.BITMAP_TYPE_INTENT_MONO.equals(formatIntent))&&(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10151)!=0|true))||(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10152)==0&false))) {{
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10153);bitsPerPixel = 1;
        }

        }}__CLR4_5_27tn7tnm6lb4zxx.R.inc(10154);Object transparencyIntent = hints.get(ImageProcessingHints.TRANSPARENCY_INTENT);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10155);boolean withAlpha = true;
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10156);if ((((ImageProcessingHints.TRANSPARENCY_INTENT_IGNORE.equals(transparencyIntent))&&(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10157)!=0|true))||(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10158)==0&false))) {{
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10159);withAlpha = false;
        }

        }__CLR4_5_27tn7tnm6lb4zxx.R.inc(10160);int resolution = GraphicsConstants.DEFAULT_SAMPLE_DPI;
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10161);Number res = (Number)hints.get(ImageProcessingHints.TARGET_RESOLUTION);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10162);if ((((res != null)&&(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10163)!=0|true))||(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10164)==0&false))) {{
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10165);resolution = res.intValue();
        }
        }__CLR4_5_27tn7tnm6lb4zxx.R.inc(10166);boolean cmyk = Boolean.TRUE.equals(hints.get("CMYK"));

        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10167);BufferedImage bi = paintToBufferedImage(g2dImage, bitsPerPixel, withAlpha, resolution, cmyk);

        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10168);ImageBuffered bufImage = new ImageBuffered(src.getInfo(), bi, null);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10169);return bufImage;
    }finally{__CLR4_5_27tn7tnm6lb4zxx.R.flushNeeded();}}

    /**
     * Paints a Graphics2D image on a BufferedImage and returns this bitmap.
     * @param g2dImage the Graphics2D image
     * @param bitsPerPixel the desired number of bits per pixel (supported: 1, 8, 24)
     * @param withAlpha true if the generated image should have an alpha channel
     * @param resolution the requested bitmap resolution
     * @return the newly created BufferedImage
     */
    protected BufferedImage paintToBufferedImage(ImageGraphics2D g2dImage,
            int bitsPerPixel, boolean withAlpha, int resolution, boolean cmyk) {try{__CLR4_5_27tn7tnm6lb4zxx.R.inc(10170);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10171);ImageSize size = g2dImage.getSize();

        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10172);RenderingHints additionalHints = null;
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10173);int bmw = (int)Math.ceil(UnitConv.mpt2px(size.getWidthMpt(), resolution));
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10174);int bmh = (int)Math.ceil(UnitConv.mpt2px(size.getHeightMpt(), resolution));
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10175);BufferedImage bi;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_27tn7tnm6lb4zxx.R.inc(10176);switch (bitsPerPixel) {
        case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_27tn7tnm6lb4zxx.R.inc(10177);__CLB4_5_2_bool0=true;}
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10178);bi = new BufferedImage(bmw, bmh, BufferedImage.TYPE_BYTE_BINARY);
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10179);withAlpha = false;
            //withAlpha is ignored in this case
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10180);additionalHints = new RenderingHints(null);
            //The following usually has no effect but some class libraries might support it
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10181);additionalHints.put(RenderingHints.KEY_DITHERING,
                    RenderingHints.VALUE_DITHER_ENABLE);
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10182);break;
        case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_27tn7tnm6lb4zxx.R.inc(10183);__CLB4_5_2_bool0=true;}
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10184);if ((((withAlpha)&&(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10185)!=0|true))||(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10186)==0&false))) {{
                __CLR4_5_27tn7tnm6lb4zxx.R.inc(10187);bi = createGrayBufferedImageWithAlpha(bmw, bmh);
            } }else {{
                __CLR4_5_27tn7tnm6lb4zxx.R.inc(10188);bi = new BufferedImage(bmw, bmh, BufferedImage.TYPE_BYTE_GRAY);
            }
            }__CLR4_5_27tn7tnm6lb4zxx.R.inc(10189);break;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_27tn7tnm6lb4zxx.R.inc(10190);__CLB4_5_2_bool0=true;}
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10191);if ((((withAlpha)&&(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10192)!=0|true))||(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10193)==0&false))) {{
                __CLR4_5_27tn7tnm6lb4zxx.R.inc(10194);bi = new BufferedImage(bmw, bmh, BufferedImage.TYPE_INT_ARGB);
            } }else {{
                __CLR4_5_27tn7tnm6lb4zxx.R.inc(10195);if ((((cmyk)&&(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10196)!=0|true))||(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10197)==0&false))) {{
                    __CLR4_5_27tn7tnm6lb4zxx.R.inc(10198);ComponentColorModel ccm = new ComponentColorModel(
                            new DeviceCMYKColorSpace(), false, false, 1, DataBuffer.TYPE_BYTE);
                    __CLR4_5_27tn7tnm6lb4zxx.R.inc(10199);int[] bands = {0, 1, 2, 3};
                    __CLR4_5_27tn7tnm6lb4zxx.R.inc(10200);PixelInterleavedSampleModel sm = new PixelInterleavedSampleModel(
                            DataBuffer.TYPE_BYTE, bmw, bmh, 4, bmw * 4, bands);
                    __CLR4_5_27tn7tnm6lb4zxx.R.inc(10201);WritableRaster raster = WritableRaster.createWritableRaster(sm, new Point(0, 0));
                    __CLR4_5_27tn7tnm6lb4zxx.R.inc(10202);bi = new BufferedImage(ccm, raster, false, null);
                } }else {{
                    __CLR4_5_27tn7tnm6lb4zxx.R.inc(10203);bi = new BufferedImage(bmw, bmh, BufferedImage.TYPE_INT_RGB);
                }
            }}
        }}

        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10204);Graphics2D g2d = bi.createGraphics();
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10205);try {
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10206);g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,
                    RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10207);setRenderingHintsForBufferedImage(g2d);
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10208);if ((((additionalHints != null)&&(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10209)!=0|true))||(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10210)==0&false))) {{
                __CLR4_5_27tn7tnm6lb4zxx.R.inc(10211);g2d.addRenderingHints(additionalHints);
            }

            }__CLR4_5_27tn7tnm6lb4zxx.R.inc(10212);g2d.setBackground(Color.white);
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10213);g2d.setColor(Color.black);
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10214);if ((((!withAlpha)&&(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10215)!=0|true))||(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10216)==0&false))) {{
                __CLR4_5_27tn7tnm6lb4zxx.R.inc(10217);g2d.clearRect(0, 0, bmw, bmh);
            }
            /* debug code
            int off = 2;
            g2d.drawLine(off, 0, off, bmh);
            g2d.drawLine(bmw - off, 0, bmw - off, bmh);
            g2d.drawLine(0, off, bmw, off);
            g2d.drawLine(0, bmh - off, bmw, bmh - off);
            */
            }__CLR4_5_27tn7tnm6lb4zxx.R.inc(10218);double sx = (double)bmw / size.getWidthMpt();
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10219);double sy = (double)bmh / size.getHeightMpt();
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10220);g2d.scale(sx, sy);

            //Paint the image on the BufferedImage
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10221);Rectangle2D area = new Rectangle2D.Double(
                    0.0, 0.0, size.getWidthMpt(), size.getHeightMpt());
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10222);g2dImage.getGraphics2DImagePainter().paint(g2d, area);
        } finally {
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10223);g2d.dispose();
        }
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10224);return bi;
    }finally{__CLR4_5_27tn7tnm6lb4zxx.R.flushNeeded();}}

    private static BufferedImage createGrayBufferedImageWithAlpha(int width, int height) {try{__CLR4_5_27tn7tnm6lb4zxx.R.inc(10225);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10226);BufferedImage bi;
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10227);boolean alphaPremultiplied = true;
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10228);int bands = 2;
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10229);int[] bits = new int[bands];
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10230);for (int i = 0; (((i < bands)&&(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10231)!=0|true))||(__CLR4_5_27tn7tnm6lb4zxx.R.iget(10232)==0&false)); i++) {{
            __CLR4_5_27tn7tnm6lb4zxx.R.inc(10233);bits[i] = 8;
        }
        }__CLR4_5_27tn7tnm6lb4zxx.R.inc(10234);ColorModel cm = new ComponentColorModel(
                ColorSpace.getInstance(ColorSpace.CS_GRAY),
                bits,
                true, alphaPremultiplied,
                Transparency.TRANSLUCENT,
                DataBuffer.TYPE_BYTE);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10235);WritableRaster wr = Raster.createInterleavedRaster(
                DataBuffer.TYPE_BYTE,
                width, height, bands,
                new Point(0, 0));
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10236);bi = new BufferedImage(cm, wr, alphaPremultiplied, null);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10237);return bi;
    }finally{__CLR4_5_27tn7tnm6lb4zxx.R.flushNeeded();}}

    /**
     * Sets rendering hints on the Graphics2D created for painting to a BufferedImage. Subclasses
     * can modify the settings to customize the behaviour.
     * @param g2d the Graphics2D instance
     */
    protected void setRenderingHintsForBufferedImage(Graphics2D g2d) {try{__CLR4_5_27tn7tnm6lb4zxx.R.inc(10238);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10239);g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_OFF);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10240);g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
            RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
    }finally{__CLR4_5_27tn7tnm6lb4zxx.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor getSourceFlavor() {try{__CLR4_5_27tn7tnm6lb4zxx.R.inc(10241);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10242);return ImageFlavor.GRAPHICS2D;
    }finally{__CLR4_5_27tn7tnm6lb4zxx.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor getTargetFlavor() {try{__CLR4_5_27tn7tnm6lb4zxx.R.inc(10243);
        __CLR4_5_27tn7tnm6lb4zxx.R.inc(10244);return ImageFlavor.BUFFERED_IMAGE;
    }finally{__CLR4_5_27tn7tnm6lb4zxx.R.flushNeeded();}}

}
