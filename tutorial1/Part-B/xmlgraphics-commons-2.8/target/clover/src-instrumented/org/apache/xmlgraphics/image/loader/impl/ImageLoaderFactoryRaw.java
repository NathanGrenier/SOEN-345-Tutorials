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

/* $Id: ImageLoaderFactoryRaw.java 1904425 2022-10-06 12:37:37Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.util.Map;

import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.spi.ImageLoader;
import org.apache.xmlgraphics.image.loader.util.Penalty;
import org.apache.xmlgraphics.util.MimeConstants;

/**
 * Factory class for the ImageLoader for raw/undecoded images.
 */
public class ImageLoaderFactoryRaw extends AbstractImageLoaderFactory {public static class __CLR4_5_27z57z5m6lb4zzc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,10404,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** MIME type for EMF (Windows Enhanced Metafile) */
    public static final String MIME_EMF = "image/x-emf";

    private static final String[] MIMES = new String[] {
        MimeConstants.MIME_PNG,
        MimeConstants.MIME_JPEG,
        MimeConstants.MIME_TIFF,
        MIME_EMF};

    private static final ImageFlavor[][] FLAVORS = new ImageFlavor[][] {
        {ImageFlavor.RAW_PNG},
        {ImageFlavor.RAW_JPEG},
        {ImageFlavor.RAW_TIFF},
        {ImageFlavor.RAW_EMF}};


    /**
     * Returns the MIME type for a given ImageFlavor if it is from a format that is consumed
     * without being undecoded. If the ImageFlavor is no raw flavor, an IllegalArgumentException
     * is thrown.
     * @param flavor the image flavor
     * @return the associated MIME type
     */
    public static String getMimeForRawFlavor(ImageFlavor flavor) {try{__CLR4_5_27z57z5m6lb4zzc.R.inc(10337);
        __CLR4_5_27z57z5m6lb4zzc.R.inc(10338);for (int i = 0, ci = FLAVORS.length; (((i < ci)&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10339)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10340)==0&false)); i++) {{
            __CLR4_5_27z57z5m6lb4zzc.R.inc(10341);for (int j = 0, cj = FLAVORS[i].length; (((j < cj)&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10342)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10343)==0&false)); j++) {{
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10344);if ((((FLAVORS[i][j].equals(flavor))&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10345)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10346)==0&false))) {{
                    __CLR4_5_27z57z5m6lb4zzc.R.inc(10347);return MIMES[i];
                }
            }}
        }}
        }__CLR4_5_27z57z5m6lb4zzc.R.inc(10348);throw new IllegalArgumentException("ImageFlavor is not a \"raw\" flavor: " + flavor);
    }finally{__CLR4_5_27z57z5m6lb4zzc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String[] getSupportedMIMETypes() {try{__CLR4_5_27z57z5m6lb4zzc.R.inc(10349);
        __CLR4_5_27z57z5m6lb4zzc.R.inc(10350);return MIMES;
    }finally{__CLR4_5_27z57z5m6lb4zzc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor[] getSupportedFlavors(String mime) {try{__CLR4_5_27z57z5m6lb4zzc.R.inc(10351);
        __CLR4_5_27z57z5m6lb4zzc.R.inc(10352);for (int i = 0, c = MIMES.length; (((i < c)&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10353)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10354)==0&false)); i++) {{
            __CLR4_5_27z57z5m6lb4zzc.R.inc(10355);if ((((MIMES[i].equals(mime))&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10356)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10357)==0&false))) {{
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10358);return FLAVORS[i];
            }
        }}
        }__CLR4_5_27z57z5m6lb4zzc.R.inc(10359);throw new IllegalArgumentException("Unsupported MIME type: " + mime);
    }finally{__CLR4_5_27z57z5m6lb4zzc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageLoader newImageLoader(ImageFlavor targetFlavor) {try{__CLR4_5_27z57z5m6lb4zzc.R.inc(10360);
        __CLR4_5_27z57z5m6lb4zzc.R.inc(10361);if ((((targetFlavor.equals(ImageFlavor.RAW_JPEG))&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10362)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10363)==0&false))) {{
            __CLR4_5_27z57z5m6lb4zzc.R.inc(10364);return new ImageLoaderRawJPEG();
        } }else {__CLR4_5_27z57z5m6lb4zzc.R.inc(10365);if ((((targetFlavor.equals(ImageFlavor.RAW_PNG))&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10366)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10367)==0&false))) {{
            __CLR4_5_27z57z5m6lb4zzc.R.inc(10368);return new ImageLoaderRawPNG();
        } }else {{
            __CLR4_5_27z57z5m6lb4zzc.R.inc(10369);return new ImageLoaderRaw(targetFlavor);
        }
    }}}finally{__CLR4_5_27z57z5m6lb4zzc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isAvailable() {try{__CLR4_5_27z57z5m6lb4zzc.R.inc(10370);
        __CLR4_5_27z57z5m6lb4zzc.R.inc(10371);return true;
    }finally{__CLR4_5_27z57z5m6lb4zzc.R.flushNeeded();}}

    @Override
    public boolean isSupported(ImageInfo imageInfo) {try{__CLR4_5_27z57z5m6lb4zzc.R.inc(10372);
        __CLR4_5_27z57z5m6lb4zzc.R.inc(10373);if (((("image/png".equals(imageInfo.getMimeType()))&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10374)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10375)==0&false))) {{
            __CLR4_5_27z57z5m6lb4zzc.R.inc(10376);Map additionalPenalties = (Map) imageInfo.getCustomObjects().get("additionalPenalties");
            __CLR4_5_27z57z5m6lb4zzc.R.inc(10377);int penalty = 0;
            __CLR4_5_27z57z5m6lb4zzc.R.inc(10378);Penalty penaltyObj = ((Penalty)additionalPenalties.get(ImageLoaderRawPNG.class.getName()));
            __CLR4_5_27z57z5m6lb4zzc.R.inc(10379);if ((((penaltyObj != null)&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10380)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10381)==0&false))) {{
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10382);penalty = penaltyObj.getValue();
            }
            }__CLR4_5_27z57z5m6lb4zzc.R.inc(10383);IIOMetadata metadata = (IIOMetadata) imageInfo.getCustomObjects().get(IIOMetadata.class);
            __CLR4_5_27z57z5m6lb4zzc.R.inc(10384);if ((((metadata != null)&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10385)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10386)==0&false))) {{
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10387);IIOMetadataNode children = (IIOMetadataNode)metadata.getAsTree("javax_imageio_png_1.0").getChildNodes();
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10388);NamedNodeMap attr = children.getElementsByTagName("IHDR").item(0).getAttributes();
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10389);String bitDepth = attr.getNamedItem("bitDepth").getNodeValue();
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10390);String interlaceMethod = attr.getNamedItem("interlaceMethod").getNodeValue();
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10391);String colorType = attr.getNamedItem("colorType").getNodeValue();
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10392);if ((((!bitDepth.equals("8") || !interlaceMethod.equals("none")
                        || ((colorType.equals("RGBAlpha") || colorType.equals("GrayAlpha")) && penalty >= 0))&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10393)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10394)==0&false))) {{
                    __CLR4_5_27z57z5m6lb4zzc.R.inc(10395);return false;
                }
                }__CLR4_5_27z57z5m6lb4zzc.R.inc(10396);children = (IIOMetadataNode)metadata.getAsTree("javax_imageio_1.0").getChildNodes();
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10397);Node numChannels = children.getElementsByTagName("NumChannels").item(0);
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10398);String numChannelsStr = numChannels.getAttributes().getNamedItem("value").getNodeValue();
                __CLR4_5_27z57z5m6lb4zzc.R.inc(10399);if (((("4".equals(numChannelsStr) && "Palette".equals(colorType) && penalty >= 0)&&(__CLR4_5_27z57z5m6lb4zzc.R.iget(10400)!=0|true))||(__CLR4_5_27z57z5m6lb4zzc.R.iget(10401)==0&false))) {{
                    __CLR4_5_27z57z5m6lb4zzc.R.inc(10402);return false;
                }
            }}
        }}
        }__CLR4_5_27z57z5m6lb4zzc.R.inc(10403);return true;
    }finally{__CLR4_5_27z57z5m6lb4zzc.R.flushNeeded();}}
}
