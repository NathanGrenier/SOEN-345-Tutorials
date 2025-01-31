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

/* $Id: PSImageUtils.java 1903802 2022-09-01 09:35:58Z ssteiner $ */

package org.apache.xmlgraphics.ps;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.color.ColorSpace;
import java.awt.geom.Dimension2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import org.apache.commons.io.IOUtils;

import org.apache.xmlgraphics.util.io.ASCII85OutputStream;
import org.apache.xmlgraphics.util.io.Finalizable;
import org.apache.xmlgraphics.util.io.FlateEncodeOutputStream;
import org.apache.xmlgraphics.util.io.RunLengthEncodeOutputStream;

// CSOFF: HideUtilityClassConstructor

/**
 * Utility code for rendering images in PostScript.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PSImageUtils {public static class __CLR4_5_2dkzdkzm6lb51bb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,18073,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public PSImageUtils() {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17603);
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Writes a bitmap image to the PostScript stream.
     * @param img the bitmap image as a byte array
     * @param imgDim the dimensions of the image
     * @param imgDescription the name of the image
     * @param targetRect the target rectangle to place the image in
     * @param isJPEG true if "img" contains a DCT-encoded images, false if "img" contains the
     *               decoded bitmap
     * @param colorSpace the color space of the image
     * @param gen the PostScript generator
     * @throws IOException In case of an I/O exception
     * @deprecated Please use the variant with the more versatile ImageEncoder as parameter
     */
    public static void writeImage(final byte[] img,
            Dimension imgDim, String imgDescription,
            Rectangle2D targetRect,
            final boolean isJPEG, ColorSpace colorSpace,
            PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17604);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17605);ImageEncoder encoder = new ImageEncoder() {
            public void writeTo(OutputStream out) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17606);
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17607);out.write(img);
            }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

            public String getImplicitFilter() {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17608);
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17609);if ((((isJPEG)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17610)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17611)==0&false))) {{
                    __CLR4_5_2dkzdkzm6lb51bb.R.inc(17612);return "<< >> /DCTDecode";
                } }else {{
                    __CLR4_5_2dkzdkzm6lb51bb.R.inc(17613);return null;
                }
            }}finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}
        };
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17614);writeImage(encoder, imgDim, imgDescription, targetRect, colorSpace, 8, false, gen);
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Writes a bitmap image to the PostScript stream.
     * @param encoder the image encoder
     * @param imgDim the dimensions of the image
     * @param imgDescription the name of the image
     * @param targetRect the target rectangle to place the image in
     * @param colorSpace the color space of the image
     * @param bitsPerComponent the number of bits per component
     * @param invertImage true if the image shall be inverted
     * @param gen the PostScript generator
     * @throws IOException In case of an I/O exception
     */
    public static void writeImage(ImageEncoder encoder,
            Dimension imgDim, String imgDescription,
            Rectangle2D targetRect,
            ColorSpace colorSpace, int bitsPerComponent, boolean invertImage,
            PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17615);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17616);gen.saveGraphicsState();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17617);translateAndScale(gen, null, targetRect);

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17618);gen.commentln("%AXGBeginBitmap: " + imgDescription);

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17619);gen.writeln("{{");
        // Template: (RawData is used for the EOF signal only)
        // gen.write("/RawData currentfile <first filter> filter def");
        // gen.write("/Data RawData <second filter> <third filter> [...] def");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17620);String implicitFilter = encoder.getImplicitFilter();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17621);if ((((implicitFilter != null)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17622)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17623)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17624);gen.writeln("/RawData currentfile /ASCII85Decode filter def");
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17625);gen.writeln("/Data RawData " + implicitFilter + " filter def");
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17626);if ((((gen.getPSLevel() >= 3)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17627)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17628)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17629);gen.writeln("/RawData currentfile /ASCII85Decode filter def");
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17630);gen.writeln("/Data RawData /FlateDecode filter def");
            } }else {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17631);gen.writeln("/RawData currentfile /ASCII85Decode filter def");
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17632);gen.writeln("/Data RawData /RunLengthDecode filter def");
            }
        }}
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17633);PSDictionary imageDict = new PSDictionary();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17634);imageDict.put("/DataSource", "Data");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17635);imageDict.put("/BitsPerComponent", Integer.toString(bitsPerComponent));
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17636);writeImageCommand(imageDict, imgDim, colorSpace, invertImage, gen);
        /* the following two lines could be enabled if something still goes wrong
         * gen.write("Data closefile");
         * gen.write("RawData flushfile");
         */
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17637);gen.writeln("} stopped {handleerror} if");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17638);gen.writeln("  RawData flushfile");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17639);gen.writeln("} exec");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17640);compressAndWriteBitmap(encoder, gen);

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17641);gen.newLine();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17642);gen.commentln("%AXGEndBitmap");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17643);gen.restoreGraphicsState();
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    public static void writeImage(ImageEncoder encoder, Dimension imgDim, String imgDescription,
                                  Rectangle2D targetRect, ColorModel colorModel, PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17644);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17645);writeImage(encoder, imgDim, imgDescription, targetRect, colorModel, gen, null, false);
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Writes a bitmap image to the PostScript stream.
     * @param encoder the image encoder
     * @param imgDim the dimensions of the image
     * @param imgDescription the name of the image
     * @param targetRect the target rectangle to place the image in
     * @param colorModel the color model of the image
     * @param gen the PostScript generator
     * @throws IOException In case of an I/O exception
     */
    public static void writeImage(ImageEncoder encoder, Dimension imgDim, String imgDescription,
            Rectangle2D targetRect, ColorModel colorModel, PSGenerator gen, RenderedImage ri, boolean maskBitmap)
            throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17646);

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17647);gen.saveGraphicsState();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17648);translateAndScale(gen, null, targetRect);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17649);gen.commentln("%AXGBeginBitmap: " + imgDescription);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17650);gen.writeln("{{");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17651);String implicitFilter = encoder.getImplicitFilter();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17652);if ((((implicitFilter != null)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17653)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17654)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17655);gen.writeln("/RawData currentfile /ASCII85Decode filter def");
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17656);gen.writeln("/Data RawData " + implicitFilter + " filter def");
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17657);if ((((gen.getPSLevel() >= 3)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17658)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17659)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17660);gen.writeln("/RawData currentfile /ASCII85Decode filter def");
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17661);gen.writeln("/Data RawData /FlateDecode filter def");
            } }else {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17662);gen.writeln("/RawData currentfile /ASCII85Decode filter def");
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17663);gen.writeln("/Data RawData /RunLengthDecode filter def");
            }
        }}

        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17664);PSDictionary imageDict = new PSDictionary();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17665);imageDict.put("/DataSource", "Data");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17666);populateImageDictionary(imgDim, colorModel, imageDict);

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17667);if ((((ri != null)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17668)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17669)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17670);DataBuffer buffer = ri.getData().getDataBuffer();
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17671);if ((((!(buffer instanceof DataBufferByte))&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17672)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17673)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17674);imageDict.put("/BitsPerComponent", 8);
            }
        }}
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17675);writeImageCommand(imageDict, colorModel, gen, maskBitmap);

        /*
         * the following two lines could be enabled if something still goes wrong
         * gen.write("Data closefile");
         * gen.write("RawData flushfile");
         */
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17676);gen.writeln("} stopped {handleerror} if");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17677);gen.writeln("  RawData flushfile");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17678);gen.writeln("} exec");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17679);compressAndWriteBitmap(encoder, gen);

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17680);gen.newLine();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17681);gen.commentln("%AXGEndBitmap");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17682);gen.restoreGraphicsState();
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Writes a bitmap image to the PostScript stream.
     * @param encoder the image encoder
     * @param imgDim the dimensions of the image
     * @param imgDescription the name of the image
     * @param targetRect the target rectangle to place the image in
     * @param colorModel the color model of the image
     * @param gen the PostScript generator
     * @throws IOException In case of an I/O exception
     */
    public static void writeImage(ImageEncoder encoder, Dimension imgDim, String imgDescription,
            Rectangle2D targetRect, ColorModel colorModel, PSGenerator gen, RenderedImage ri,
            Color maskColor)
            throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17683);

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17684);gen.saveGraphicsState();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17685);translateAndScale(gen, null, targetRect);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17686);gen.commentln("%AXGBeginBitmap: " + imgDescription);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17687);gen.writeln("{{");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17688);String implicitFilter = encoder.getImplicitFilter();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17689);if ((((implicitFilter != null)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17690)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17691)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17692);gen.writeln("/RawData currentfile /ASCII85Decode filter def");
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17693);gen.writeln("/Data RawData " + implicitFilter + " filter def");
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17694);if ((((gen.getPSLevel() >= 3)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17695)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17696)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17697);gen.writeln("/RawData currentfile /ASCII85Decode filter def");
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17698);gen.writeln("/Data RawData /FlateDecode filter def");
            } }else {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17699);gen.writeln("/RawData currentfile /ASCII85Decode filter def");
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17700);gen.writeln("/Data RawData /RunLengthDecode filter def");
            }
        }}

        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17701);PSDictionary imageDict = new PSDictionary();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17702);imageDict.put("/DataSource", "Data");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17703);populateImageDictionary(imgDim, colorModel, imageDict, maskColor);

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17704);if ((((ri != null)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17705)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17706)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17707);DataBuffer buffer = ri.getData().getDataBuffer();
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17708);if ((((!(buffer instanceof DataBufferByte))&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17709)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17710)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17711);imageDict.put("/BitsPerComponent", 8);
            }
        }}
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17712);writeImageCommand(imageDict, colorModel, gen, false);

        /*
         * the following two lines could be enabled if something still goes wrong
         * gen.write("Data closefile");
         * gen.write("RawData flushfile");
         */
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17713);gen.writeln("} stopped {handleerror} if");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17714);gen.writeln("  RawData flushfile");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17715);gen.writeln("} exec");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17716);compressAndWriteBitmap(encoder, gen);

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17717);gen.newLine();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17718);gen.commentln("%AXGEndBitmap");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17719);gen.restoreGraphicsState();
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    private static ColorModel populateImageDictionary(Dimension imgDim, ColorModel colorModel,
            PSDictionary imageDict) {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17720);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17721);imageDict.put("/ImageType", "1");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17722);colorModel = writeImageDictionary(imgDim, imageDict, colorModel);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17723);return colorModel;
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    private static ColorModel populateImageDictionary(Dimension imgDim, ColorModel colorModel,
            PSDictionary imageDict, Color maskColor) {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17724);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17725);imageDict.put("/ImageType", "4");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17726);colorModel = writeImageDictionary(imgDim, imageDict, colorModel);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17727);imageDict.put("/MaskColor", String.format("[ %d %d %d ]", maskColor.getRed(),
                maskColor.getGreen(), maskColor.getBlue()));
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17728);return colorModel;
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    private static ColorModel writeImageDictionary(Dimension imgDim, PSDictionary imageDict,
            ColorModel colorModel) {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17729);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17730);String w = Integer.toString(imgDim.width);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17731);String h = Integer.toString(imgDim.height);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17732);imageDict.put("/Width", w);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17733);imageDict.put("/Height", h);

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17734);boolean invertColors = false;
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17735);String decodeArray = getDecodeArray(colorModel.getNumColorComponents(), invertColors);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17736);int bitsPerComp = colorModel.getComponentSize(0);

        // Setup scanning for left-to-right and top-to-bottom
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17737);imageDict.put("/ImageMatrix", "[" + w + " 0 0 " + h + " 0 0]");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17738);if (((((colorModel instanceof IndexColorModel))&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17739)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17740)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17741);IndexColorModel indexColorModel = (IndexColorModel) colorModel;
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17742);int c = indexColorModel.getMapSize();
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17743);int hival = c - 1;
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17744);if ((((hival > 4095)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17745)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17746)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17747);throw new UnsupportedOperationException("hival must not go beyond 4095");
            }
            }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17748);bitsPerComp = indexColorModel.getPixelSize();
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17749);int ceiling = ((int) Math.pow(2, bitsPerComp)) - 1;
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17750);decodeArray = "[0 " + ceiling + "]";
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17751);imageDict.put("/BitsPerComponent", Integer.toString(bitsPerComp));
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17752);imageDict.put("/Decode", decodeArray);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17753);return colorModel;
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    private static String getDecodeArray(int numComponents, boolean invertColors) {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17754);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17755);String decodeArray;
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17756);StringBuffer sb = new StringBuffer("[");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17757);for (int i = 0; (((i < numComponents)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17758)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17759)==0&false)); i++) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17760);if ((((i > 0)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17761)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17762)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17763);sb.append(" ");
            }
            }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17764);if ((((invertColors)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17765)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17766)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17767);sb.append("1 0");
            } }else {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17768);sb.append("0 1");
            }
        }}
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17769);sb.append("]");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17770);decodeArray = sb.toString();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17771);return decodeArray;
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    private static void prepareColorspace(PSGenerator gen, ColorSpace colorSpace)
            throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17772);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17773);gen.writeln(getColorSpaceName(colorSpace) + " setcolorspace");
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    private static void prepareColorSpace(PSGenerator gen, ColorModel cm) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17774);
        //Prepare color space
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17775);if (((((cm instanceof IndexColorModel))&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17776)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17777)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17778);ColorSpace cs = cm.getColorSpace();
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17779);IndexColorModel im = (IndexColorModel)cm;
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17780);boolean isDeviceGray;
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17781);int c = im.getMapSize();
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17782);int[] palette = new int[c];
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17783);im.getRGBs(palette);
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17784);byte[] reds = new byte[c];
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17785);byte[] greens = new byte[c];
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17786);byte[] blues = new byte[c];
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17787);im.getReds(reds);
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17788);im.getGreens(greens);
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17789);im.getBlues(blues);
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17790);int hival = c - 1;
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17791);if ((((hival > 4095)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17792)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17793)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17794);throw new UnsupportedOperationException("hival must not go beyond 4095");
            }
            }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17795);isDeviceGray = Arrays.equals(reds, blues) && Arrays.equals(blues, greens);
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17796);if ((((isDeviceGray)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17797)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17798)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17799);gen.write("[/Indexed " + "/DeviceGray");
            } }else {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17800);gen.write("[/Indexed " + getColorSpaceName(cs));
            }
            }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17801);gen.writeln(" " + Integer.toString(hival));
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17802);gen.write("  <");
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17803);if ((((isDeviceGray)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17804)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17805)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17806);gen.write(toHexString(blues));
            } }else {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17807);for (int i = 0; (((i < c)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17808)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17809)==0&false)); i++) {{
                    __CLR4_5_2dkzdkzm6lb51bb.R.inc(17810);if ((((i > 0)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17811)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17812)==0&false))) {{
                        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17813);if (((((i % 8) == 0)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17814)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17815)==0&false))) {{
                            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17816);gen.newLine();
                            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17817);gen.write("   ");
                        } }else {{
                            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17818);gen.write(" ");
                        }
                    }}
                    }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17819);gen.write(rgb2Hex(palette[i]));
                }
            }}
            }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17820);gen.writeln(">");
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17821);gen.writeln("] setcolorspace");
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17822);gen.writeln(getColorSpaceName(cm.getColorSpace()) + " setcolorspace");
        }
    }}finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    static String toHexString(byte[] color) {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17823);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17824);char[] hexChars = new char[color.length * 2];
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17825);int x;
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17826);for (int i = 0; (((i < color.length)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17827)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17828)==0&false)); i++) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17829);x = color[i] & 0xFF;
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17830);hexChars[i * 2] = HEX[x >>> 4];
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17831);hexChars[i * 2 + 1] = HEX[x & 0x0F];
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17832);return new String(hexChars);
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    static void writeImageCommand(RenderedImage img,
            PSDictionary imageDict, PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17833);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17834);ImageEncodingHelper helper = new ImageEncodingHelper(img, true);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17835);ColorModel cm = helper.getEncodedColorModel();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17836);Dimension imgDim = new Dimension(img.getWidth(), img.getHeight());

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17837);populateImageDictionary(imgDim, cm, imageDict);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17838);writeImageCommand(imageDict, cm, gen, false);
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    static void writeImageCommand(PSDictionary imageDict, ColorModel cm, PSGenerator gen, boolean maskBitmap)
                throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17839);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17840);if ((((!maskBitmap)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17841)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17842)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17843);prepareColorSpace(gen, cm);
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17844);gen.write(imageDict.toString());
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17845);if ((((maskBitmap)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17846)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17847)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17848);gen.writeln(" imagemask");
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17849);gen.writeln(" image");
        }
    }}finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    static void writeImageCommand(PSDictionary imageDict,
            Dimension imgDim, ColorSpace colorSpace, boolean invertImage,
            PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17850);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17851);imageDict.put("/ImageType", "1");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17852);imageDict.put("/Width", Integer.toString(imgDim.width));
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17853);imageDict.put("/Height", Integer.toString(imgDim.height));
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17854);String decodeArray = getDecodeArray(colorSpace.getNumComponents(), invertImage);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17855);imageDict.put("/Decode", decodeArray);
        // Setup scanning for left-to-right and top-to-bottom
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17856);imageDict.put("/ImageMatrix", "[" + imgDim.width + " 0 0 " + imgDim.height + " 0 0]");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17857);prepareColorspace(gen, colorSpace);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17858);gen.write(imageDict.toString());
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17859);gen.writeln(" image");
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    private static final char[] HEX = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };

    private static String rgb2Hex(int rgb) {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17860);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17861);StringBuffer sb = new StringBuffer();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17862);for (int i = 5; (((i >= 0)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17863)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17864)==0&false)); i--) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17865);int shift = i * 4;
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17866);int n = (rgb & (15 << shift)) >> shift;
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17867);sb.append(HEX[n % 16]);
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17868);return sb.toString();
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Renders a bitmap image to PostScript.
     * @param img image to render
     * @param x x position
     * @param y y position
     * @param w width
     * @param h height
     * @param gen PS generator
     * @throws IOException In case of an I/O problem while rendering the image
     */
    public static void renderBitmapImage(RenderedImage img,
                float x, float y, float w, float h, PSGenerator gen, Color mask, boolean maskBitmap)
                    throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17869);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17870);Rectangle2D targetRect = new Rectangle2D.Double(x, y, w, h);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17871);ImageEncoder encoder = ImageEncodingHelper.createRenderedImageEncoder(img);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17872);Dimension imgDim = new Dimension(img.getWidth(), img.getHeight());
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17873);String imgDescription = img.getClass().getName();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17874);ImageEncodingHelper helper = new ImageEncodingHelper(img);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17875);ColorModel cm = helper.getEncodedColorModel();

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17876);if ((((mask == null)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17877)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17878)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17879);writeImage(encoder, imgDim, imgDescription, targetRect, cm, gen, img, maskBitmap);
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17880);writeImage(encoder, imgDim, imgDescription, targetRect, cm, gen, img, mask);
        }
    }}finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Writes a bitmap image as a PostScript form enclosed by DSC resource wrappers to the
     * PostScript file.
     * @param img the raw bitmap data
     * @param imgDim the dimensions of the image
     * @param formName the name of the PostScript form to use
     * @param imageDescription a description of the image added as a DSC Title comment
     * @param isJPEG true if "img" contains a DCT-encoded images, false if "img" contains the
     *               decoded bitmap
     * @param colorSpace the color space of the image
     * @param gen the PostScript generator
     * @return a PSResource representing the form for resource tracking
     * @throws IOException In case of an I/O exception
     * @deprecated Please use {@link FormGenerator}
     */
    public static PSResource writeReusableImage(final byte[] img,
            Dimension imgDim, String formName, String imageDescription,
            final boolean isJPEG, ColorSpace colorSpace,
            PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17881);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17882);ImageEncoder encoder = new ImageEncoder() {
            public void writeTo(OutputStream out) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17883);
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17884);out.write(img);
            }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}
            public String getImplicitFilter() {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17885);
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17886);if ((((isJPEG)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17887)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17888)==0&false))) {{
                    __CLR4_5_2dkzdkzm6lb51bb.R.inc(17889);return "<< >> /DCTDecode";
                } }else {{
                    __CLR4_5_2dkzdkzm6lb51bb.R.inc(17890);return null;
                }
            }}finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}
        };
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17891);return writeReusableImage(encoder, imgDim, formName,
                imageDescription, colorSpace, false, gen);
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Writes a bitmap image as a PostScript form enclosed by DSC resource wrappers to the
     * PostScript file.
     * @param encoder the ImageEncoder that will provide the raw bitmap data
     * @param imgDim the dimensions of the image
     * @param formName the name of the PostScript form to use
     * @param imageDescription a description of the image added as a DSC Title comment
     * @param colorSpace the color space of the image
     * @param invertImage true if the image shall be inverted
     * @param gen the PostScript generator
     * @return a PSResource representing the form for resource tracking
     * @throws IOException In case of an I/O exception
     * @deprecated Please use {@link FormGenerator}
     */
    protected static PSResource writeReusableImage(ImageEncoder encoder,
            Dimension imgDim,
            String formName, String imageDescription,
            ColorSpace colorSpace, boolean invertImage,
            PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17892);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17893);if ((((gen.getPSLevel() < 2)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17894)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17895)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17896);throw new UnsupportedOperationException(
                    "Reusable images requires at least Level 2 PostScript");
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17897);String dataName = formName + ":Data";
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17898);gen.writeDSCComment(DSCConstants.BEGIN_RESOURCE, formName);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17899);if ((((imageDescription != null)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17900)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17901)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17902);gen.writeDSCComment(DSCConstants.TITLE, imageDescription);
        }

        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17903);String additionalFilters;
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17904);String implicitFilter = encoder.getImplicitFilter();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17905);if ((((implicitFilter != null)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17906)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17907)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17908);additionalFilters = "/ASCII85Decode filter " + implicitFilter + " filter";
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17909);if ((((gen.getPSLevel() >= 3)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17910)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17911)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17912);additionalFilters = "/ASCII85Decode filter /FlateDecode filter";
            } }else {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17913);additionalFilters = "/ASCII85Decode filter /RunLengthDecode filter";
            }
        }}

        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17914);gen.writeln("/" + formName);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17915);gen.writeln("<< /FormType 1");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17916);gen.writeln("  /BBox [0 0 " + imgDim.width + " " + imgDim.height + "]");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17917);gen.writeln("  /Matrix [1 0 0 1 0 0]");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17918);gen.writeln("  /PaintProc {");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17919);gen.writeln("    pop");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17920);gen.writeln("    gsave");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17921);if ((((gen.getPSLevel() == 2)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17922)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17923)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17924);gen.writeln("    userdict /i 0 put"); //rewind image data
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17925);gen.writeln("    " + dataName + " 0 setfileposition"); //rewind image data
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17926);String dataSource;
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17927);if ((((gen.getPSLevel() == 2)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17928)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17929)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17930);dataSource = "{ " + dataName + " i get /i i 1 add store } bind";
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17931);dataSource = dataName;
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17932);PSDictionary imageDict = new PSDictionary();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17933);imageDict.put("/DataSource", dataSource);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17934);imageDict.put("/BitsPerComponent", Integer.toString(8));
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17935);writeImageCommand(imageDict, imgDim, colorSpace, invertImage, gen);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17936);gen.writeln("    grestore");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17937);gen.writeln("  } bind");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17938);gen.writeln(">> def");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17939);gen.writeln("/" + dataName + " currentfile");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17940);gen.writeln(additionalFilters);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17941);if ((((gen.getPSLevel() == 2)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17942)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17943)==0&false))) {{
            //Creates a data array from the inline file
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17944);gen.writeln("{ /temp exch def ["
                    + " { temp 16384 string readstring not {exit } if } loop ] } exec");
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17945);gen.writeln("/ReusableStreamDecode filter");
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17946);compressAndWriteBitmap(encoder, gen);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17947);gen.writeln("def");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17948);gen.writeDSCComment(DSCConstants.END_RESOURCE);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17949);PSResource res = new PSResource(PSResource.TYPE_FORM, formName);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17950);gen.getResourceTracker().registerSuppliedResource(res);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17951);return res;
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Paints a reusable image (previously added as a PostScript form).
     * @param formName the name of the PostScript form implementing the image
     * @param targetRect the target rectangle to place the image in
     * @param gen the PostScript generator
     * @throws IOException In case of an I/O exception
     * @deprecated Please use {@link #paintForm(PSResource, Dimension2D, Rectangle2D, PSGenerator)}
     *          instead.
     */
    public static void paintReusableImage(
            String formName,
            Rectangle2D targetRect,
            PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17952);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17953);PSResource form = new PSResource(PSResource.TYPE_FORM, formName);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17954);paintForm(form, null, targetRect, gen);
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Paints a reusable image (previously added as a PostScript form).
     * @param form the PostScript form resource implementing the image
     * @param targetRect the target rectangle to place the image in
     * @param gen the PostScript generator
     * @throws IOException In case of an I/O exception
     * @deprecated Please use {@link #paintForm(PSResource, Dimension2D, Rectangle2D, PSGenerator)}
     *          instead.
     */
    public static void paintForm(
            PSResource form,
            Rectangle2D targetRect,
            PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17955);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17956);paintForm(form, null, targetRect, gen);
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Paints a reusable image (previously added as a PostScript form).
     * @param form the PostScript form resource implementing the image
     * @param formDimensions the original dimensions of the form
     * @param targetRect the target rectangle to place the image in
     * @param gen the PostScript generator
     * @throws IOException In case of an I/O exception
     */
    public static void paintForm(
            PSResource form,
            Dimension2D formDimensions,
            Rectangle2D targetRect,
            PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17957);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17958);gen.saveGraphicsState();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17959);translateAndScale(gen, formDimensions, targetRect);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17960);gen.writeln(form.getName() + " execform");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17961);gen.getResourceTracker().notifyResourceUsageOnPage(form);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17962);gen.restoreGraphicsState();
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    private static String getColorSpaceName(ColorSpace colorSpace) {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17963);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17964);if ((((colorSpace.getType() == ColorSpace.TYPE_CMYK)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17965)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17966)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17967);return "/DeviceCMYK";
        } }else {__CLR4_5_2dkzdkzm6lb51bb.R.inc(17968);if ((((colorSpace.getType() == ColorSpace.TYPE_GRAY)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17969)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17970)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17971);return "/DeviceGray";
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17972);return "/DeviceRGB";
        }
    }}}finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    static void compressAndWriteBitmap(ImageEncoder encoder, PSGenerator gen)
                throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17973);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17974);OutputStream out = gen.getOutputStream();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17975);out = new ASCII85OutputStream(out);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17976);String implicitFilter = encoder.getImplicitFilter();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17977);if ((((implicitFilter != null)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17978)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17979)==0&false))) {{
            //nop
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17980);if ((((gen.getPSLevel() >= 3)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17981)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17982)==0&false))) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17983);out = new FlateEncodeOutputStream(out);
            } }else {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(17984);out = new RunLengthEncodeOutputStream(out);
            }
        }}
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17985);encoder.writeTo(out);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17986);if ((((out instanceof Finalizable)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17987)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17988)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17989);((Finalizable)out).finalizeStream();
        } }else {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17990);out.flush();
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17991);gen.newLine(); //Just to be sure
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Generates commands to modify the current transformation matrix so an image fits
     * into a given rectangle.
     * @param gen the PostScript generator
     * @param imageDimensions the image's dimensions
     * @param targetRect the target rectangle
     * @throws IOException if an I/O error occurs
     */
    public static void translateAndScale(PSGenerator gen,
            Dimension2D imageDimensions, Rectangle2D targetRect)
                throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(17992);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17993);gen.writeln(gen.formatDouble(targetRect.getX()) + " "
                + gen.formatDouble(targetRect.getY()) + " translate");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17994);if ((((imageDimensions == null)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17995)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(17996)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(17997);imageDimensions = new Dimension(1, 1);
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(17998);double sx = targetRect.getWidth() / imageDimensions.getWidth();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(17999);double sy = targetRect.getHeight() / imageDimensions.getHeight();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18000);if ((((sx != 1 || sy != 1)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18001)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18002)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18003);gen.writeln(gen.formatDouble(sx) + " "
                    + gen.formatDouble(sy) + " scale");
        }
    }}finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Extracts a packed RGB integer array of a RenderedImage.
     * @param img the image
     * @param startX the starting X coordinate
     * @param startY the starting Y coordinate
     * @param w the width of the cropped image
     * @param h the height of the cropped image
     * @param rgbArray the prepared integer array to write to
     * @param offset offset in the target array
     * @param scansize width of a row in the target array
     * @return the populated integer array previously passed in as rgbArray parameter
     */
    public static int[] getRGB(RenderedImage img,
                int startX, int startY,
                int w, int h,
                int[] rgbArray, int offset, int scansize) {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(18004);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18005);Raster raster = img.getData();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18006);int yoff = offset;
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18007);int off;
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18008);Object data;
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18009);int nbands = raster.getNumBands();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18010);int dataType = raster.getDataBuffer().getDataType();
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2dkzdkzm6lb51bb.R.inc(18011);switch (dataType) {
        case DataBuffer.TYPE_BYTE:if (!__CLB4_5_2_bool0) {__CLR4_5_2dkzdkzm6lb51bb.R.inc(18012);__CLB4_5_2_bool0=true;}
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18013);data = new byte[nbands];
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18014);break;
        case DataBuffer.TYPE_USHORT:if (!__CLB4_5_2_bool0) {__CLR4_5_2dkzdkzm6lb51bb.R.inc(18015);__CLB4_5_2_bool0=true;}
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18016);data = new short[nbands];
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18017);break;
        case DataBuffer.TYPE_INT:if (!__CLB4_5_2_bool0) {__CLR4_5_2dkzdkzm6lb51bb.R.inc(18018);__CLB4_5_2_bool0=true;}
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18019);data = new int[nbands];
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18020);break;
        case DataBuffer.TYPE_FLOAT:if (!__CLB4_5_2_bool0) {__CLR4_5_2dkzdkzm6lb51bb.R.inc(18021);__CLB4_5_2_bool0=true;}
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18022);data = new float[nbands];
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18023);break;
        case DataBuffer.TYPE_DOUBLE:if (!__CLB4_5_2_bool0) {__CLR4_5_2dkzdkzm6lb51bb.R.inc(18024);__CLB4_5_2_bool0=true;}
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18025);data = new double[nbands];
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18026);break;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2dkzdkzm6lb51bb.R.inc(18027);__CLB4_5_2_bool0=true;}
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18028);throw new IllegalArgumentException("Unknown data buffer type: "
                                               + dataType);
        }

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18029);if ((((rgbArray == null)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18030)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18031)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18032);rgbArray = new int[offset + h * scansize];
        }

        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(18033);ColorModel colorModel = img.getColorModel();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18034);for (int y = startY; (((y < startY + h)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18035)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18036)==0&false)); y++, yoff += scansize) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18037);off = yoff;
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18038);for (int x = startX; (((x < startX + w)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18039)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18040)==0&false)); x++) {{
                __CLR4_5_2dkzdkzm6lb51bb.R.inc(18041);rgbArray[off++] = colorModel.getRGB(raster.getDataElements(x, y, data));
            }
        }}

        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(18042);return rgbArray;
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Places an EPS file in the PostScript stream.
     * @param rawEPS byte array containing the raw EPS data
     * @param name name for the EPS document
     * @param x x-coordinate of viewport in points
     * @param y y-coordinate of viewport in points
     * @param w width of viewport in points
     * @param h height of viewport in points
     * @param bboxx x-coordinate of EPS bounding box in points
     * @param bboxy y-coordinate of EPS bounding box in points
     * @param bboxw width of EPS bounding box in points
     * @param bboxh height of EPS bounding box in points
     * @param gen the PS generator
     * @throws IOException in case an I/O error happens during output
     * @deprecated Please use the variant with the InputStream as parameter
     */
    public static void renderEPS(byte[] rawEPS, String name,
                    float x, float y, float w, float h,
                    float bboxx, float bboxy, float bboxw, float bboxh,
                    PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(18043);
       __CLR4_5_2dkzdkzm6lb51bb.R.inc(18044);renderEPS(new java.io.ByteArrayInputStream(rawEPS), name,
               new Rectangle2D.Float(x, y, w, h),
               new Rectangle2D.Float(bboxx, bboxy, bboxw, bboxh),
               gen);
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

    /**
     * Places an EPS file in the PostScript stream.
     * @param in the InputStream that contains the EPS stream
     * @param name name for the EPS document
     * @param viewport the viewport in points in which to place the EPS
     * @param bbox the EPS bounding box in points
     * @param gen the PS generator
     * @throws IOException in case an I/O error happens during output
     */
    public static void renderEPS(InputStream in, String name,
            Rectangle2D viewport, Rectangle2D bbox,
                    PSGenerator gen) throws IOException {try{__CLR4_5_2dkzdkzm6lb51bb.R.inc(18045);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18046);gen.getResourceTracker().notifyResourceUsageOnPage(PSProcSets.EPS_PROCSET);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18047);gen.writeln("%AXGBeginEPS: " + name);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18048);gen.writeln("BeginEPSF");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18049);gen.writeln(gen.formatDouble(viewport.getX())
                + " " + gen.formatDouble(viewport.getY()) + " translate");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18050);gen.writeln("0 " + gen.formatDouble(viewport.getHeight()) + " translate");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18051);gen.writeln("1 -1 scale");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18052);double sx = viewport.getWidth() / bbox.getWidth();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18053);double sy = viewport.getHeight() / bbox.getHeight();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18054);if ((((sx != 1 || sy != 1)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18055)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18056)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18057);gen.writeln(gen.formatDouble(sx) + " " + gen.formatDouble(sy) + " scale");
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(18058);if ((((bbox.getX() != 0 || bbox.getY() != 0)&&(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18059)!=0|true))||(__CLR4_5_2dkzdkzm6lb51bb.R.iget(18060)==0&false))) {{
            __CLR4_5_2dkzdkzm6lb51bb.R.inc(18061);gen.writeln(gen.formatDouble(-bbox.getX())
                    + " " + gen.formatDouble(-bbox.getY()) + " translate");
        }
        }__CLR4_5_2dkzdkzm6lb51bb.R.inc(18062);gen.writeln(gen.formatDouble(bbox.getX())
                + " " + gen.formatDouble(bbox.getY())
                + " " + gen.formatDouble(bbox.getWidth())
                + " " + gen.formatDouble(bbox.getHeight()) + " re clip");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18063);gen.writeln("newpath");

        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18064);PSResource res = new PSResource(PSResource.TYPE_FILE, name);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18065);gen.getResourceTracker().registerSuppliedResource(res);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18066);gen.getResourceTracker().notifyResourceUsageOnPage(res);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18067);gen.writeDSCComment(DSCConstants.BEGIN_DOCUMENT, res.getName());
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18068);IOUtils.copy(in, gen.getOutputStream());
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18069);gen.newLine();
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18070);gen.writeDSCComment(DSCConstants.END_DOCUMENT);
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18071);gen.writeln("EndEPSF");
        __CLR4_5_2dkzdkzm6lb51bb.R.inc(18072);gen.writeln("%AXGEndEPS");
    }finally{__CLR4_5_2dkzdkzm6lb51bb.R.flushNeeded();}}

}
