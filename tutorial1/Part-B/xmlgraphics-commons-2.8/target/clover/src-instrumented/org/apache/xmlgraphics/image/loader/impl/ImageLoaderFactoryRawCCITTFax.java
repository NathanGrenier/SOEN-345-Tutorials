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

/* $Id: ImageLoaderFactoryRawCCITTFax.java 1681137 2015-05-22 14:54:05Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.image.codec.tiff.TIFFImage;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.spi.ImageLoader;
import org.apache.xmlgraphics.util.MimeConstants;

/**
 * Factory class for the ImageLoader for raw/undecoded CCITT encoded images.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ImageLoaderFactoryRawCCITTFax extends AbstractImageLoaderFactory {public static class __CLR4_5_2810810m68iyh7h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,10460,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** logger */
    private transient Log log = LogFactory.getLog(ImageLoaderFactoryRawCCITTFax.class);

    private static final String[] MIMES = new String[] {
        MimeConstants.MIME_TIFF};

    private static final ImageFlavor[][] FLAVORS = new ImageFlavor[][] {
        {ImageFlavor.RAW_CCITTFAX}};


    /**
     * Returns the MIME type for a given ImageFlavor if it is from a format that is consumed
     * without being undecoded. If the ImageFlavor is no raw flavor, an IllegalArgumentException
     * is thrown.
     * @param flavor the image flavor
     * @return the associated MIME type
     */
    public static String getMimeForRawFlavor(ImageFlavor flavor) {try{__CLR4_5_2810810m68iyh7h.R.inc(10404);
        __CLR4_5_2810810m68iyh7h.R.inc(10405);for (int i = 0, ci = FLAVORS.length; (((i < ci)&&(__CLR4_5_2810810m68iyh7h.R.iget(10406)!=0|true))||(__CLR4_5_2810810m68iyh7h.R.iget(10407)==0&false)); i++) {{
            __CLR4_5_2810810m68iyh7h.R.inc(10408);for (int j = 0, cj = FLAVORS[i].length; (((j < cj)&&(__CLR4_5_2810810m68iyh7h.R.iget(10409)!=0|true))||(__CLR4_5_2810810m68iyh7h.R.iget(10410)==0&false)); j++) {{
                __CLR4_5_2810810m68iyh7h.R.inc(10411);if ((((FLAVORS[i][j].equals(flavor))&&(__CLR4_5_2810810m68iyh7h.R.iget(10412)!=0|true))||(__CLR4_5_2810810m68iyh7h.R.iget(10413)==0&false))) {{
                    __CLR4_5_2810810m68iyh7h.R.inc(10414);return MIMES[i];
                }
            }}
        }}
        }__CLR4_5_2810810m68iyh7h.R.inc(10415);throw new IllegalArgumentException("ImageFlavor is not a \"raw\" flavor: " + flavor);
    }finally{__CLR4_5_2810810m68iyh7h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String[] getSupportedMIMETypes() {try{__CLR4_5_2810810m68iyh7h.R.inc(10416);
        __CLR4_5_2810810m68iyh7h.R.inc(10417);return MIMES;
    }finally{__CLR4_5_2810810m68iyh7h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor[] getSupportedFlavors(String mime) {try{__CLR4_5_2810810m68iyh7h.R.inc(10418);
        __CLR4_5_2810810m68iyh7h.R.inc(10419);for (int i = 0, c = MIMES.length; (((i < c)&&(__CLR4_5_2810810m68iyh7h.R.iget(10420)!=0|true))||(__CLR4_5_2810810m68iyh7h.R.iget(10421)==0&false)); i++) {{
            __CLR4_5_2810810m68iyh7h.R.inc(10422);if ((((MIMES[i].equals(mime))&&(__CLR4_5_2810810m68iyh7h.R.iget(10423)!=0|true))||(__CLR4_5_2810810m68iyh7h.R.iget(10424)==0&false))) {{
                __CLR4_5_2810810m68iyh7h.R.inc(10425);return FLAVORS[i];
            }
        }}
        }__CLR4_5_2810810m68iyh7h.R.inc(10426);throw new IllegalArgumentException("Unsupported MIME type: " + mime);
    }finally{__CLR4_5_2810810m68iyh7h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageLoader newImageLoader(ImageFlavor targetFlavor) {try{__CLR4_5_2810810m68iyh7h.R.inc(10427);
        __CLR4_5_2810810m68iyh7h.R.inc(10428);if ((((targetFlavor.equals(ImageFlavor.RAW_CCITTFAX))&&(__CLR4_5_2810810m68iyh7h.R.iget(10429)!=0|true))||(__CLR4_5_2810810m68iyh7h.R.iget(10430)==0&false))) {{
            __CLR4_5_2810810m68iyh7h.R.inc(10431);return new ImageLoaderRawCCITTFax();
        } }else {{
            __CLR4_5_2810810m68iyh7h.R.inc(10432);throw new IllegalArgumentException("Unsupported image flavor: " + targetFlavor);
        }
    }}finally{__CLR4_5_2810810m68iyh7h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isAvailable() {try{__CLR4_5_2810810m68iyh7h.R.inc(10433);
        __CLR4_5_2810810m68iyh7h.R.inc(10434);return true;
    }finally{__CLR4_5_2810810m68iyh7h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupported(ImageInfo imageInfo) {try{__CLR4_5_2810810m68iyh7h.R.inc(10435);
        __CLR4_5_2810810m68iyh7h.R.inc(10436);Boolean tiled = (Boolean)imageInfo.getCustomObjects().get("TIFF_TILED");
        __CLR4_5_2810810m68iyh7h.R.inc(10437);if ((((Boolean.TRUE.equals(tiled))&&(__CLR4_5_2810810m68iyh7h.R.iget(10438)!=0|true))||(__CLR4_5_2810810m68iyh7h.R.iget(10439)==0&false))) {{
            //We don't support tiled images
            __CLR4_5_2810810m68iyh7h.R.inc(10440);log.trace("Raw CCITT loading not supported for tiled TIFF image");
            __CLR4_5_2810810m68iyh7h.R.inc(10441);return false;
        }
        }__CLR4_5_2810810m68iyh7h.R.inc(10442);Integer compression = (Integer)imageInfo.getCustomObjects().get("TIFF_COMPRESSION");
        __CLR4_5_2810810m68iyh7h.R.inc(10443);if ((((compression == null)&&(__CLR4_5_2810810m68iyh7h.R.iget(10444)!=0|true))||(__CLR4_5_2810810m68iyh7h.R.iget(10445)==0&false))) {{
            __CLR4_5_2810810m68iyh7h.R.inc(10446);return false;
        }
        }boolean __CLB4_5_2_bool0=false;__CLR4_5_2810810m68iyh7h.R.inc(10447);switch (compression) {
        case TIFFImage.COMP_FAX_G3_1D:if (!__CLB4_5_2_bool0) {__CLR4_5_2810810m68iyh7h.R.inc(10448);__CLB4_5_2_bool0=true;}
        case TIFFImage.COMP_FAX_G3_2D:if (!__CLB4_5_2_bool0) {__CLR4_5_2810810m68iyh7h.R.inc(10449);__CLB4_5_2_bool0=true;}
        case TIFFImage.COMP_FAX_G4_2D:if (!__CLB4_5_2_bool0) {__CLR4_5_2810810m68iyh7h.R.inc(10450);__CLB4_5_2_bool0=true;}
            __CLR4_5_2810810m68iyh7h.R.inc(10451);Integer stripCount = (Integer)imageInfo.getCustomObjects().get("TIFF_STRIP_COUNT");
            __CLR4_5_2810810m68iyh7h.R.inc(10452);boolean supported = (stripCount != null && stripCount == 1);
            __CLR4_5_2810810m68iyh7h.R.inc(10453);if ((((!supported)&&(__CLR4_5_2810810m68iyh7h.R.iget(10454)!=0|true))||(__CLR4_5_2810810m68iyh7h.R.iget(10455)==0&false))) {{
                __CLR4_5_2810810m68iyh7h.R.inc(10456);log.trace("Raw CCITT loading not supported for multi-strip TIFF image");
            }
            }__CLR4_5_2810810m68iyh7h.R.inc(10457);return supported;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2810810m68iyh7h.R.inc(10458);__CLB4_5_2_bool0=true;}
            __CLR4_5_2810810m68iyh7h.R.inc(10459);return false;
        }
    }finally{__CLR4_5_2810810m68iyh7h.R.flushNeeded();}}

}
