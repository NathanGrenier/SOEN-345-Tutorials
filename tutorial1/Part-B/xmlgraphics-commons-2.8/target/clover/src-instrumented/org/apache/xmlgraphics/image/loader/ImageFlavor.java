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

/* $Id: ImageFlavor.java 1894758 2021-11-05 13:34:47Z ssteiner $ */

package org.apache.xmlgraphics.image.loader;

import org.apache.xmlgraphics.util.MimeConstants;

/**
 * The flavor of an image indicates in which form it is available. A bitmap image loaded into
 * memory might be represented as a BufferedImage (indicated by ImageFlavor.BUFFERED_IMAGE).
 * It is mostly used by consuming code to indicate what kind of flavors can be processed so a
 * processing pipeline can do the necessary loading operations and conversions.
 */
public class ImageFlavor {public static class __CLR4_5_2727727m68iyh02{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,9196,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** An image in form of a RenderedImage instance */
    public static final ImageFlavor RENDERED_IMAGE = new ImageFlavor("RenderedImage");
    /** An image in form of a BufferedImage instance */
    public static final ImageFlavor BUFFERED_IMAGE = new SimpleRefinedImageFlavor(
                                                            RENDERED_IMAGE, "BufferedImage");
    /** An image in form of a W3C DOM instance */
    private static final ImageFlavor DOM = new ImageFlavor("DOM");
    /** An XML-based image in form of a W3C DOM instance */
    public static final ImageFlavor XML_DOM = new MimeEnabledImageFlavor(DOM, "text/xml");
    /** An image in form of a raw PNG file/stream */
    public static final ImageFlavor RAW = new ImageFlavor("Raw");
    /** An image in form of a raw PNG file/stream */
    public static final ImageFlavor RAW_PNG = new MimeEnabledImageFlavor(RAW,
                                                        MimeConstants.MIME_PNG);
    /** An image in form of a raw JPEG/JFIF file/stream */
    public static final ImageFlavor RAW_JPEG = new MimeEnabledImageFlavor(RAW,
                                                        MimeConstants.MIME_JPEG);
    /** An image in form of a raw TIFF file/stream */
    public static final ImageFlavor RAW_TIFF = new MimeEnabledImageFlavor(RAW,
                                                        MimeConstants.MIME_TIFF);
    /** An image in form of a raw EMF (Windows Enhanced Metafile) file/stream */
    public static final ImageFlavor RAW_EMF = new MimeEnabledImageFlavor(RAW,
                                                        MimeConstants.MIME_EMF);
    /** An image in form of a raw EPS (Encapsulated PostScript) file/stream */
    public static final ImageFlavor RAW_EPS = new MimeEnabledImageFlavor(RAW,
                                                        MimeConstants.MIME_EPS);
    public static final ImageFlavor RAW_PDF = new MimeEnabledImageFlavor(RAW, MimeConstants.MIME_PDF);

    /** An image in form of a raw LZW file/stream */
    public static final ImageFlavor RAW_LZW = new ImageFlavor("RawLZW");
    /** An image in form of a raw CCITTFax stream */
    public static final ImageFlavor RAW_CCITTFAX = new ImageFlavor("RawCCITTFax");
    /** An image in form of a Graphics2DImage (can be painted on a Graphics2D interface) */
    public static final ImageFlavor GRAPHICS2D = new ImageFlavor("Graphics2DImage");

    private String name;

    /**
     * Constructs a new ImageFlavor. Please reuse existing constants wherever possible!
     * @param name the name of the flavor (must be unique)
     */
    public ImageFlavor(String name) {try{__CLR4_5_2727727m68iyh02.R.inc(9151);
        __CLR4_5_2727727m68iyh02.R.inc(9152);this.name = name;
    }finally{__CLR4_5_2727727m68iyh02.R.flushNeeded();}}

    /**
     * Returns the name of the ImageFlavor.
     * @return the flavor name
     */
    public String getName() {try{__CLR4_5_2727727m68iyh02.R.inc(9153);
        __CLR4_5_2727727m68iyh02.R.inc(9154);return this.name;
    }finally{__CLR4_5_2727727m68iyh02.R.flushNeeded();}}

    /**
     * Returns the MIME type that the image flavor represents if a MIME type is available. This
     * is only applicable to images which can also exist as files. For images flavors like
     * decoded in-memory images (Rendered/BufferedImage), this method will return null.
     * @return the MIME type or null if no MIME type can be provided (like for in-memory images)
     */
    public String getMimeType() {try{__CLR4_5_2727727m68iyh02.R.inc(9155);
        __CLR4_5_2727727m68iyh02.R.inc(9156);return null;
    }finally{__CLR4_5_2727727m68iyh02.R.flushNeeded();}}

    /**
     * Returns the XML namespace URI that the image flavor represents if such a namespace URI
     * is available. This is only applicable to images in XML form. Other image types will return
     * null.
     * @return the XML or null if no MIME type can be provided (like for in-memory images)
     */
    public String getNamespace() {try{__CLR4_5_2727727m68iyh02.R.inc(9157);
        __CLR4_5_2727727m68iyh02.R.inc(9158);return null;
    }finally{__CLR4_5_2727727m68iyh02.R.flushNeeded();}}

    /**
     * Indicates whether a particular image flavor is compatible with this one.
     * @param flavor the other image flavor
     * @return true if the two are compatible
     */
    public boolean isCompatible(ImageFlavor flavor) {try{__CLR4_5_2727727m68iyh02.R.inc(9159);
        __CLR4_5_2727727m68iyh02.R.inc(9160);return this.equals(flavor);
    }finally{__CLR4_5_2727727m68iyh02.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int hashCode() {try{__CLR4_5_2727727m68iyh02.R.inc(9161);
        __CLR4_5_2727727m68iyh02.R.inc(9162);final int prime = 31;
        __CLR4_5_2727727m68iyh02.R.inc(9163);int result = 1;
        __CLR4_5_2727727m68iyh02.R.inc(9164);result = prime * result + (((((name == null) )&&(__CLR4_5_2727727m68iyh02.R.iget(9165)!=0|true))||(__CLR4_5_2727727m68iyh02.R.iget(9166)==0&false))? 0 : name.hashCode());
        __CLR4_5_2727727m68iyh02.R.inc(9167);return result;
    }finally{__CLR4_5_2727727m68iyh02.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean equals(Object obj) {try{__CLR4_5_2727727m68iyh02.R.inc(9168);
        __CLR4_5_2727727m68iyh02.R.inc(9169);if ((((this == obj)&&(__CLR4_5_2727727m68iyh02.R.iget(9170)!=0|true))||(__CLR4_5_2727727m68iyh02.R.iget(9171)==0&false))) {{
            __CLR4_5_2727727m68iyh02.R.inc(9172);return true;
        }
        }__CLR4_5_2727727m68iyh02.R.inc(9173);if ((((obj == null)&&(__CLR4_5_2727727m68iyh02.R.iget(9174)!=0|true))||(__CLR4_5_2727727m68iyh02.R.iget(9175)==0&false))) {{
            __CLR4_5_2727727m68iyh02.R.inc(9176);return false;
        }
        }__CLR4_5_2727727m68iyh02.R.inc(9177);if ((((getClass() != obj.getClass())&&(__CLR4_5_2727727m68iyh02.R.iget(9178)!=0|true))||(__CLR4_5_2727727m68iyh02.R.iget(9179)==0&false))) {{
            __CLR4_5_2727727m68iyh02.R.inc(9180);return false;
        }
        }__CLR4_5_2727727m68iyh02.R.inc(9181);final ImageFlavor other = (ImageFlavor)obj;
        __CLR4_5_2727727m68iyh02.R.inc(9182);if ((((name == null)&&(__CLR4_5_2727727m68iyh02.R.iget(9183)!=0|true))||(__CLR4_5_2727727m68iyh02.R.iget(9184)==0&false))) {{
            __CLR4_5_2727727m68iyh02.R.inc(9185);if ((((other.name != null)&&(__CLR4_5_2727727m68iyh02.R.iget(9186)!=0|true))||(__CLR4_5_2727727m68iyh02.R.iget(9187)==0&false))) {{
                __CLR4_5_2727727m68iyh02.R.inc(9188);return false;
            }
        }} }else {__CLR4_5_2727727m68iyh02.R.inc(9189);if ((((!name.equals(other.name))&&(__CLR4_5_2727727m68iyh02.R.iget(9190)!=0|true))||(__CLR4_5_2727727m68iyh02.R.iget(9191)==0&false))) {{
            __CLR4_5_2727727m68iyh02.R.inc(9192);return false;
        }
        }}__CLR4_5_2727727m68iyh02.R.inc(9193);return true;
    }finally{__CLR4_5_2727727m68iyh02.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_2727727m68iyh02.R.inc(9194);
        __CLR4_5_2727727m68iyh02.R.inc(9195);return getName();
    }finally{__CLR4_5_2727727m68iyh02.R.flushNeeded();}}

}
