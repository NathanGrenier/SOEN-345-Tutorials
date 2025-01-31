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

/* $Id: ImageManager.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.image.loader;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.xml.transform.Source;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.image.loader.cache.ImageCache;
import org.apache.xmlgraphics.image.loader.pipeline.ImageProviderPipeline;
import org.apache.xmlgraphics.image.loader.pipeline.PipelineFactory;
import org.apache.xmlgraphics.image.loader.spi.ImageImplRegistry;
import org.apache.xmlgraphics.image.loader.spi.ImagePreloader;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;
import org.apache.xmlgraphics.image.loader.util.Penalty;
import org.apache.xmlgraphics.io.XmlSourceUtil;

/**
 * ImageManager is the central starting point for image access.
 */
public class ImageManager {public static class __CLR4_5_273x73xm6lb4zow{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,9359,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** logger */
    protected static final Log log = LogFactory.getLog(ImageManager.class);

    /** Holds all registered interface implementations for the image package */
    private ImageImplRegistry registry;

    /** Provides session-independent information */
    private ImageContext imageContext;

    /** The image cache for this instance */
    private ImageCache cache = new ImageCache();

    private PipelineFactory pipelineFactory = new PipelineFactory(this);

    /**
     * Main constructor.
     * @param context the session-independent context information
     */
    public ImageManager(ImageContext context) {
        this(ImageImplRegistry.getDefaultInstance(), context);__CLR4_5_273x73xm6lb4zow.R.inc(9214);try{__CLR4_5_273x73xm6lb4zow.R.inc(9213);
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Constructor for testing purposes.
     * @param registry the implementation registry with all plug-ins
     * @param context the session-independent context information
     */
    public ImageManager(ImageImplRegistry registry, ImageContext context) {try{__CLR4_5_273x73xm6lb4zow.R.inc(9215);
        __CLR4_5_273x73xm6lb4zow.R.inc(9216);this.registry = registry;
        __CLR4_5_273x73xm6lb4zow.R.inc(9217);this.imageContext = context;
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Returns the ImageImplRegistry in use by the ImageManager.
     * @return the ImageImplRegistry
     */
    public ImageImplRegistry getRegistry() {try{__CLR4_5_273x73xm6lb4zow.R.inc(9218);
        __CLR4_5_273x73xm6lb4zow.R.inc(9219);return this.registry;
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Returns the ImageContext in use by the ImageManager.
     * @return the ImageContext
     */
    public ImageContext getImageContext() {try{__CLR4_5_273x73xm6lb4zow.R.inc(9220);
        __CLR4_5_273x73xm6lb4zow.R.inc(9221);return this.imageContext;
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Returns the ImageCache in use by the ImageManager.
     * @return the ImageCache
     */
    public ImageCache getCache() {try{__CLR4_5_273x73xm6lb4zow.R.inc(9222);
        __CLR4_5_273x73xm6lb4zow.R.inc(9223);return this.cache;
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Returns the PipelineFactory in use by the ImageManager.
     * @return the PipelineFactory
     */
    public PipelineFactory getPipelineFactory() {try{__CLR4_5_273x73xm6lb4zow.R.inc(9224);
        __CLR4_5_273x73xm6lb4zow.R.inc(9225);return this.pipelineFactory;
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Returns an ImageInfo object containing its intrinsic size for a given URI. The ImageInfo
     * is retrieved from an image cache if it has been requested before.
     * @param uri the URI of the image
     * @param session the session context through which to resolve the URI if the image is not in
     *                the cache
     * @return the ImageInfo object created from the image
     * @throws ImageException If no suitable ImagePreloader can be found to load the image or
     *          if an error occurred while preloading the image.
     * @throws IOException If an I/O error occurs while preloading the image
     */
    public ImageInfo getImageInfo(String uri, ImageSessionContext session)
                throws ImageException, IOException {try{__CLR4_5_273x73xm6lb4zow.R.inc(9226);
        __CLR4_5_273x73xm6lb4zow.R.inc(9227);if ((((getCache() != null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9228)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9229)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9230);return getCache().needImageInfo(uri, session, this);
        } }else {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9231);return preloadImage(uri, session);
        }
    }}finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Preloads an image, i.e. the format of the image is identified and some basic information
     * (MIME type, intrinsic size and possibly other values) are loaded and returned as an
     * ImageInfo object. Note that the image is not fully loaded normally. Only with certain formats
     * the image is already fully loaded and references added to the ImageInfo's custom objects
     * (see {@link ImageInfo#getOriginalImage()}).
     * <p>
     * The reason for the preloading: Apache FOP, for example, only needs the image's intrinsic
     * size during layout. Only when the document is rendered to the final format does FOP need
     * to load the full image. Like this a lot of memory can be saved.
     * @param uri the original URI of the image
     * @param session the session context through which to resolve the URI
     * @return the ImageInfo object created from the image
     * @throws ImageException If no suitable ImagePreloader can be found to load the image or
     *          if an error occurred while preloading the image.
     * @throws IOException If an I/O error occurs while preloading the image
     */
    public ImageInfo preloadImage(String uri, ImageSessionContext session)
            throws ImageException, IOException {try{__CLR4_5_273x73xm6lb4zow.R.inc(9232);
        __CLR4_5_273x73xm6lb4zow.R.inc(9233);Source src = session.needSource(uri);
        __CLR4_5_273x73xm6lb4zow.R.inc(9234);ImageInfo info = preloadImage(uri, src);
        __CLR4_5_273x73xm6lb4zow.R.inc(9235);session.returnSource(uri, src);
        __CLR4_5_273x73xm6lb4zow.R.inc(9236);return info;
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Preloads an image, i.e. the format of the image is identified and some basic information
     * (MIME type, intrinsic size and possibly other values) are loaded and returned as an
     * ImageInfo object. Note that the image is not fully loaded normally. Only with certain formats
     * the image is already fully loaded and references added to the ImageInfo's custom objects
     * (see {@link ImageInfo#getOriginalImage()}).
     * <p>
     * The reason for the preloading: Apache FOP, for example, only needs the image's intrinsic
     * size during layout. Only when the document is rendered to the final format does FOP need
     * to load the full image. Like this a lot of memory can be saved.
     * @param uri the original URI of the image
     * @param src the Source object to load the image from
     * @return the ImageInfo object created from the image
     * @throws ImageException If no suitable ImagePreloader can be found to load the image or
     *          if an error occurred while preloading the image.
     * @throws IOException If an I/O error occurs while preloading the image
     */
    public ImageInfo preloadImage(String uri, Source src)
            throws ImageException, IOException {try{__CLR4_5_273x73xm6lb4zow.R.inc(9237);
        __CLR4_5_273x73xm6lb4zow.R.inc(9238);Iterator iter = registry.getPreloaderIterator();
        __CLR4_5_273x73xm6lb4zow.R.inc(9239);while ((((iter.hasNext())&&(__CLR4_5_273x73xm6lb4zow.R.iget(9240)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9241)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9242);ImagePreloader preloader = (ImagePreloader) iter.next();
            __CLR4_5_273x73xm6lb4zow.R.inc(9243);ImageInfo info = preloader.preloadImage(uri, src, imageContext);
            __CLR4_5_273x73xm6lb4zow.R.inc(9244);if ((((info != null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9245)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9246)==0&false))) {{
                __CLR4_5_273x73xm6lb4zow.R.inc(9247);return info;
            }
        }}
        }__CLR4_5_273x73xm6lb4zow.R.inc(9248);throw new ImageException("The file format is not supported. No ImagePreloader found for "
                + uri);
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    private Map prepareHints(Map hints, ImageSessionContext sessionContext) {try{__CLR4_5_273x73xm6lb4zow.R.inc(9249);
        __CLR4_5_273x73xm6lb4zow.R.inc(9250);Map newHints = new java.util.HashMap();
        __CLR4_5_273x73xm6lb4zow.R.inc(9251);if ((((hints != null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9252)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9253)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9254);newHints.putAll(hints); //Copy in case an unmodifiable map is passed in
        }
        }__CLR4_5_273x73xm6lb4zow.R.inc(9255);if ((((!newHints.containsKey(ImageProcessingHints.IMAGE_SESSION_CONTEXT)
                && sessionContext != null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9256)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9257)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9258);newHints.put(ImageProcessingHints.IMAGE_SESSION_CONTEXT, sessionContext);

        }
        }__CLR4_5_273x73xm6lb4zow.R.inc(9259);if ((((!newHints.containsKey(ImageProcessingHints.IMAGE_MANAGER))&&(__CLR4_5_273x73xm6lb4zow.R.iget(9260)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9261)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9262);newHints.put(ImageProcessingHints.IMAGE_MANAGER, this);
        }
        }__CLR4_5_273x73xm6lb4zow.R.inc(9263);return newHints;
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Loads an image. The caller can indicate what kind of image flavor is requested. When this
     * method is called the code looks for a suitable ImageLoader and, if necessary, builds
     * a conversion pipeline so it can return the image in exactly the form the caller needs.
     * <p>
     * Optionally, it is possible to pass in Map of hints. These hints may be used by ImageLoaders
     * and ImageConverters to act on the image. See {@link ImageProcessingHints} for common hints
     * used by the bundled implementations. You can, of course, define your own hints.
     * @param info the ImageInfo instance for the image (obtained by
     *                  {@link #getImageInfo(String, ImageSessionContext)})
     * @param flavor the requested image flavor.
     * @param hints a Map of hints to any of the background components or null
     * @param session the session context
     * @return the fully loaded image
     * @throws ImageException If no suitable loader/converter combination is available to fulfill
     *                  the request or if an error occurred while loading the image.
     * @throws IOException If an I/O error occurs
     */
    public Image getImage(ImageInfo info, ImageFlavor flavor, Map hints,
                ImageSessionContext session)
            throws ImageException, IOException {try{__CLR4_5_273x73xm6lb4zow.R.inc(9264);
        __CLR4_5_273x73xm6lb4zow.R.inc(9265);hints = prepareHints(hints, session);

        __CLR4_5_273x73xm6lb4zow.R.inc(9266);Image img = null;
        __CLR4_5_273x73xm6lb4zow.R.inc(9267);ImageProviderPipeline pipeline = getPipelineFactory().newImageConverterPipeline(
                info, flavor);
        __CLR4_5_273x73xm6lb4zow.R.inc(9268);if ((((pipeline != null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9269)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9270)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9271);img = pipeline.execute(info, hints, session);
        }
        }__CLR4_5_273x73xm6lb4zow.R.inc(9272);if ((((img == null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9273)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9274)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9275);throw new ImageException(
                    "Cannot load image (no suitable loader/converter combination available) for "
                        + info);
        }
        }__CLR4_5_273x73xm6lb4zow.R.inc(9276);XmlSourceUtil.closeQuietly(session.getSource(info.getOriginalURI()));
        __CLR4_5_273x73xm6lb4zow.R.inc(9277);return img;
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Loads an image. The caller can indicate what kind of image flavors are requested. When this
     * method is called the code looks for a suitable ImageLoader and, if necessary, builds
     * a conversion pipeline so it can return the image in exactly the form the caller needs.
     * The array of image flavors is ordered, so the first image flavor is given highest priority.
     * <p>
     * Optionally, it is possible to pass in Map of hints. These hints may be used by ImageLoaders
     * and ImageConverters to act on the image. See {@link ImageProcessingHints} for common hints
     * used by the bundled implementations. You can, of course, define your own hints.
     * @param info the ImageInfo instance for the image (obtained by
     *                  {@link #getImageInfo(String, ImageSessionContext)})
     * @param flavors the requested image flavors (in preferred order).
     * @param hints a Map of hints to any of the background components or null
     * @param session the session context
     * @return the fully loaded image
     * @throws ImageException If no suitable loader/converter combination is available to fulfill
     *                  the request or if an error occurred while loading the image.
     * @throws IOException If an I/O error occurs
     */
    public Image getImage(ImageInfo info, ImageFlavor[] flavors, Map hints,
                        ImageSessionContext session)
                throws ImageException, IOException {try{__CLR4_5_273x73xm6lb4zow.R.inc(9278);
        __CLR4_5_273x73xm6lb4zow.R.inc(9279);hints = prepareHints(hints, session);

        __CLR4_5_273x73xm6lb4zow.R.inc(9280);Image img = null;
        __CLR4_5_273x73xm6lb4zow.R.inc(9281);ImageProviderPipeline[] candidates = getPipelineFactory().determineCandidatePipelines(
                info, flavors);
        __CLR4_5_273x73xm6lb4zow.R.inc(9282);ImageProviderPipeline pipeline = choosePipeline(candidates);

        __CLR4_5_273x73xm6lb4zow.R.inc(9283);if ((((pipeline != null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9284)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9285)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9286);img = pipeline.execute(info, hints, session);
        }
        }__CLR4_5_273x73xm6lb4zow.R.inc(9287);if ((((img == null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9288)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9289)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9290);throw new ImageException(
                    "Cannot load image (no suitable loader/converter combination available) for "
                            + info);
        }
        }__CLR4_5_273x73xm6lb4zow.R.inc(9291);XmlSourceUtil.closeQuietly(session.getSource(info.getOriginalURI()));
        __CLR4_5_273x73xm6lb4zow.R.inc(9292);return img;
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Loads an image with no hints. See
     * {@link #getImage(ImageInfo, ImageFlavor, Map, ImageSessionContext)} for more
     * information.
     * @param info the ImageInfo instance for the image (obtained by
     *                  {@link #getImageInfo(String, ImageSessionContext)})
     * @param flavor the requested image flavor.
     * @param session the session context
     * @return the fully loaded image
     * @throws ImageException If no suitable loader/converter combination is available to fulfill
     *                  the request or if an error occurred while loading the image.
     * @throws IOException If an I/O error occurs
     */
    public Image getImage(ImageInfo info, ImageFlavor flavor, ImageSessionContext session)
            throws ImageException, IOException {try{__CLR4_5_273x73xm6lb4zow.R.inc(9293);
        __CLR4_5_273x73xm6lb4zow.R.inc(9294);return getImage(info, flavor, ImageUtil.getDefaultHints(session), session);
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Loads an image with no hints. See
     * {@link #getImage(ImageInfo, ImageFlavor[], Map, ImageSessionContext)} for more
     * information.
     * @param info the ImageInfo instance for the image (obtained by
     *                  {@link #getImageInfo(String, ImageSessionContext)})
     * @param flavors the requested image flavors (in preferred order).
     * @param session the session context
     * @return the fully loaded image
     * @throws ImageException If no suitable loader/converter combination is available to fulfill
     *                  the request or if an error occurred while loading the image.
     * @throws IOException If an I/O error occurs
     */
    public Image getImage(ImageInfo info, ImageFlavor[] flavors, ImageSessionContext session)
            throws ImageException, IOException {try{__CLR4_5_273x73xm6lb4zow.R.inc(9295);
        __CLR4_5_273x73xm6lb4zow.R.inc(9296);return getImage(info, flavors, ImageUtil.getDefaultHints(session), session);
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Closes the resources associated to the given image. This method should be
     * used only when none of the {@code getImage} methods is called by the
     * client application.
     *
     * @param uri the URI of the image
     * @param session the session context that was used to resolve the URI
     */
    public void closeImage(String uri, ImageSessionContext session) {try{__CLR4_5_273x73xm6lb4zow.R.inc(9297);
        __CLR4_5_273x73xm6lb4zow.R.inc(9298);XmlSourceUtil.closeQuietly(session.getSource(uri));
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Converts an image. The caller can indicate what kind of image flavors are requested. When
     * this method is called the code looks for a suitable combination of ImageConverters so it
     * can return the image in exactly the form the caller needs.
     * The array of image flavors is ordered, so the first image flavor is given highest priority.
     * <p>
     * Optionally, it is possible to pass in Map of hints. These hints may be used by
     * ImageConverters to act on the image. See {@link ImageProcessingHints} for common hints
     * used by the bundled implementations. You can, of course, define your own hints.
     * @param image the image to convert
     * @param flavors the requested image flavors (in preferred order).
     * @param hints a Map of hints to any of the background components or null
     * @return the fully loaded image
     * @throws ImageException If no suitable loader/converter combination is available to fulfill
     *                  the request or if an error occurred while loading the image.
     * @throws IOException If an I/O error occurs
     */
    public Image convertImage(Image image, ImageFlavor[] flavors, Map hints)
                throws ImageException, IOException {try{__CLR4_5_273x73xm6lb4zow.R.inc(9299);
        __CLR4_5_273x73xm6lb4zow.R.inc(9300);hints = prepareHints(hints, null);
        __CLR4_5_273x73xm6lb4zow.R.inc(9301);ImageInfo info = image.getInfo();

        __CLR4_5_273x73xm6lb4zow.R.inc(9302);Image img = null;
        __CLR4_5_273x73xm6lb4zow.R.inc(9303);for (ImageFlavor flavor : flavors) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9304);if ((((image.getFlavor().equals(flavor))&&(__CLR4_5_273x73xm6lb4zow.R.iget(9305)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9306)==0&false))) {{
                //Shortcut (the image is already in one of the requested formats)
                __CLR4_5_273x73xm6lb4zow.R.inc(9307);return image;
            }
        }}
        }__CLR4_5_273x73xm6lb4zow.R.inc(9308);ImageProviderPipeline[] candidates = getPipelineFactory().determineCandidatePipelines(
                image, flavors);
        __CLR4_5_273x73xm6lb4zow.R.inc(9309);ImageProviderPipeline pipeline = choosePipeline(candidates);

        __CLR4_5_273x73xm6lb4zow.R.inc(9310);if ((((pipeline != null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9311)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9312)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9313);img = pipeline.execute(info, image, hints, null);
        }
        }__CLR4_5_273x73xm6lb4zow.R.inc(9314);if ((((img == null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9315)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9316)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9317);throw new ImageException(
                    "Cannot convert image " + image
                    + " (no suitable converter combination available)");
        }
        }__CLR4_5_273x73xm6lb4zow.R.inc(9318);return img;
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Converts an image with no hints. See
     * {@link #convertImage(Image, ImageFlavor[], Map)} for more
     * information.
     * @param image the image to convert
     * @param flavors the requested image flavors (in preferred order).
     * @return the fully loaded image
     * @throws ImageException If no suitable loader/converter combination is available to fulfill
     *                  the request or if an error occurred while loading the image.
     * @throws IOException If an I/O error occurs
     */
    public Image convertImage(Image image, ImageFlavor[] flavors)
                throws ImageException, IOException {try{__CLR4_5_273x73xm6lb4zow.R.inc(9319);
        __CLR4_5_273x73xm6lb4zow.R.inc(9320);return convertImage(image, flavors, null);
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

    /**
     * Chooses the best {@link ImageProviderPipeline} from a set of candidates.
     * @param candidates the candidates
     * @return the best pipeline
     */
    public ImageProviderPipeline choosePipeline(ImageProviderPipeline[] candidates) {try{__CLR4_5_273x73xm6lb4zow.R.inc(9321);
        __CLR4_5_273x73xm6lb4zow.R.inc(9322);ImageProviderPipeline pipeline = null;
        __CLR4_5_273x73xm6lb4zow.R.inc(9323);int minPenalty = Integer.MAX_VALUE;
        __CLR4_5_273x73xm6lb4zow.R.inc(9324);int count = candidates.length;
        __CLR4_5_273x73xm6lb4zow.R.inc(9325);if ((((log.isTraceEnabled())&&(__CLR4_5_273x73xm6lb4zow.R.iget(9326)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9327)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9328);log.trace("Candidate Pipelines:");
            __CLR4_5_273x73xm6lb4zow.R.inc(9329);for (int i = 0; (((i < count)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9330)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9331)==0&false)); i++) {{
                __CLR4_5_273x73xm6lb4zow.R.inc(9332);if ((((candidates[i] == null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9333)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9334)==0&false))) {{
                    __CLR4_5_273x73xm6lb4zow.R.inc(9335);continue;
                }
                }__CLR4_5_273x73xm6lb4zow.R.inc(9336);log.trace("  " + i + ": "
                        + candidates[i].getConversionPenalty(getRegistry()) + " for " + candidates[i]);
            }
        }}
        }__CLR4_5_273x73xm6lb4zow.R.inc(9337);for (int i = count - 1; (((i >= 0)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9338)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9339)==0&false)); i--) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9340);if ((((candidates[i] == null)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9341)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9342)==0&false))) {{
                __CLR4_5_273x73xm6lb4zow.R.inc(9343);continue;
            }
            }__CLR4_5_273x73xm6lb4zow.R.inc(9344);Penalty penalty = candidates[i].getConversionPenalty(getRegistry());
            __CLR4_5_273x73xm6lb4zow.R.inc(9345);if ((((penalty.isInfinitePenalty())&&(__CLR4_5_273x73xm6lb4zow.R.iget(9346)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9347)==0&false))) {{
                __CLR4_5_273x73xm6lb4zow.R.inc(9348);continue; //Exclude candidate on infinite penalty
            }
            }__CLR4_5_273x73xm6lb4zow.R.inc(9349);if ((((penalty.getValue() <= minPenalty)&&(__CLR4_5_273x73xm6lb4zow.R.iget(9350)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9351)==0&false))) {{
                __CLR4_5_273x73xm6lb4zow.R.inc(9352);pipeline = candidates[i];
                __CLR4_5_273x73xm6lb4zow.R.inc(9353);minPenalty = penalty.getValue();
            }
        }}
        }__CLR4_5_273x73xm6lb4zow.R.inc(9354);if ((((log.isDebugEnabled())&&(__CLR4_5_273x73xm6lb4zow.R.iget(9355)!=0|true))||(__CLR4_5_273x73xm6lb4zow.R.iget(9356)==0&false))) {{
            __CLR4_5_273x73xm6lb4zow.R.inc(9357);log.debug("Chosen pipeline: " + pipeline);
        }
        }__CLR4_5_273x73xm6lb4zow.R.inc(9358);return pipeline;
    }finally{__CLR4_5_273x73xm6lb4zow.R.flushNeeded();}}

}
