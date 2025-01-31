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

/* $Id: ImageInfo.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.image.loader;

import java.util.Map;

/**
 * Represents an image that may not have been fully loaded. Usually, the loading only goes as far
 * as necessary to know the intrinsic size of the image. The image will only fully loaded later
 * when the image needs to be presented in a particular format so the consuming component can
 * actually process it. The "preloading" is done so a layout engine can work with the image without
 * having to fully load it (in memory).
 */
public class ImageInfo {public static class __CLR4_5_273g73gm6lb4zny{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,9213,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Key to register the "original object" among the custom objects of an ImageInfo instance.
     * @see #getOriginalImage()
     */
    public static final Object ORIGINAL_IMAGE = Image.class;

    /**
     * Key to register information about additional (sub-)images in the image file after the
     * selected one. Valid values for this key is either a positive Integer or the constant
     * {@link Boolean#TRUE} or {@link Boolean#FALSE}. A value of TRUE indicates that there are
     * more subimages available but the exact number of additional images has not been determined
     * for performance reasons.
     */
    public static final Object HAS_MORE_IMAGES = "HAS_MORE_IMAGES";

    /** Original URI the image was accessed with */
    private String originalURI;
    /** MIME type of the image */
    private String mimeType;

    /** the image size */
    private ImageSize size;

    /**
     * Map of custom objects that components further down the processing pipeline might need.
     * Example: The DOM of an XML document.
     */
    private Map customObjects = new java.util.HashMap();

    /**
     * Main constructor.
     * @param originalURI the original URI that was specified by the user (not the resolved URI!)
     * @param mimeType the MIME type of the image
     */
    public ImageInfo(String originalURI, String mimeType) {try{__CLR4_5_273g73gm6lb4zny.R.inc(9196);
        __CLR4_5_273g73gm6lb4zny.R.inc(9197);this.originalURI = originalURI;
        __CLR4_5_273g73gm6lb4zny.R.inc(9198);this.mimeType = mimeType;
    }finally{__CLR4_5_273g73gm6lb4zny.R.flushNeeded();}}

    /**
     * Returns the original URI of the image.
     * @return the original URI
     */
    public String getOriginalURI() {try{__CLR4_5_273g73gm6lb4zny.R.inc(9199);
        __CLR4_5_273g73gm6lb4zny.R.inc(9200);return this.originalURI;
    }finally{__CLR4_5_273g73gm6lb4zny.R.flushNeeded();}}

    /**
     * Returns the image's MIME type.
     * @return the MIME type
     */
    public String getMimeType() {try{__CLR4_5_273g73gm6lb4zny.R.inc(9201);
        __CLR4_5_273g73gm6lb4zny.R.inc(9202);return this.mimeType;
    }finally{__CLR4_5_273g73gm6lb4zny.R.flushNeeded();}}

    /**
     * Returns the image's intrinsic size.
     * @return the image size
     */
    public ImageSize getSize() {try{__CLR4_5_273g73gm6lb4zny.R.inc(9203);
        __CLR4_5_273g73gm6lb4zny.R.inc(9204);return this.size;
    }finally{__CLR4_5_273g73gm6lb4zny.R.flushNeeded();}}

    /**
     * Sets the image's intrinsic size.
     * @param size the size
     */
    public void setSize(ImageSize size) {try{__CLR4_5_273g73gm6lb4zny.R.inc(9205);
        __CLR4_5_273g73gm6lb4zny.R.inc(9206);this.size = size;
    }finally{__CLR4_5_273g73gm6lb4zny.R.flushNeeded();}}

    /**
     * Returns a Map of custom objects associated with this instance.
     * @return the Map of custom objects
     */
    public Map getCustomObjects() {try{__CLR4_5_273g73gm6lb4zny.R.inc(9207);
        __CLR4_5_273g73gm6lb4zny.R.inc(9208);return this.customObjects;
    }finally{__CLR4_5_273g73gm6lb4zny.R.flushNeeded();}}

    /**
     * Returns the original Image instance if such an Image instance is created while building
     * this ImageInfo object. Some images cannot be "preloaded". They have to be fully loaded
     * in order to determine the intrinsic image size. This method allows access to that fully
     * loaded image so no additional re-loading has to be done later.
     * <p>
     * This method is short for: (Image)this.customObjects.get(ORIGINAL_IMAGE);
     * @return the original Image instance or null if none is set
     * @see #ORIGINAL_IMAGE
     */
    public Image getOriginalImage() {try{__CLR4_5_273g73gm6lb4zny.R.inc(9209);
        __CLR4_5_273g73gm6lb4zny.R.inc(9210);return (Image)this.customObjects.get(ORIGINAL_IMAGE);
    }finally{__CLR4_5_273g73gm6lb4zny.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_273g73gm6lb4zny.R.inc(9211);
        __CLR4_5_273g73gm6lb4zny.R.inc(9212);return getOriginalURI() + " (" + getMimeType() + ")";
    }finally{__CLR4_5_273g73gm6lb4zny.R.flushNeeded();}}

}
