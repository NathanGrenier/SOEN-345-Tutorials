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

/* $Id: ImageCache.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.cache;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.transform.Source;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageManager;
import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.image.loader.util.SoftMapCache;


/**
 * This class provides a cache for images. The main key into the images is the original URI the
 * image was accessed with.
 * <p>
 * Don't use one ImageCache instance in the context of multiple base URIs because relative URIs
 * would not work correctly anymore.
 * <p>
 * By default, the URIs of inaccessible images are remembered but these entries are discarded
 * after 60 seconds (which causes a retry next time the same URI is requested). This allows
 * to counteract performance loss when accessing invalid or temporarily unavailable images
 * over slow connections.
 */
public class ImageCache {public static class __CLR4_5_27d37d3m6lb4zru{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,9669,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** logger */
    protected static final Log log = LogFactory.getLog(ImageCache.class);

    //Handling of invalid URIs
    private Map invalidURIs = Collections.synchronizedMap(new java.util.HashMap());
    private ExpirationPolicy invalidURIExpirationPolicy;

    //Actual image cache
    private SoftMapCache imageInfos = new SoftMapCache(true);
    private SoftMapCache images = new SoftMapCache(true);

    private ImageCacheListener cacheListener;
    private TimeStampProvider timeStampProvider;
    private long lastHouseKeeping;

    /**
     * Default constructor with default settings.
     */
    public ImageCache() {
        this(new TimeStampProvider(), new DefaultExpirationPolicy());__CLR4_5_27d37d3m6lb4zru.R.inc(9544);try{__CLR4_5_27d37d3m6lb4zru.R.inc(9543);
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    /**
     * Constructor for customized behaviour and testing.
     * @param timeStampProvider the time stamp provider to use
     * @param invalidURIExpirationPolicy the expiration policy for invalid URIs
     */
    public ImageCache(TimeStampProvider timeStampProvider,
            ExpirationPolicy invalidURIExpirationPolicy) {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9545);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9546);this.timeStampProvider = timeStampProvider;
        __CLR4_5_27d37d3m6lb4zru.R.inc(9547);this.invalidURIExpirationPolicy = invalidURIExpirationPolicy;
        __CLR4_5_27d37d3m6lb4zru.R.inc(9548);this.lastHouseKeeping = this.timeStampProvider.getTimeStamp();
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    /**
     * Sets an ImageCacheListener instance so the events in the image cache can be observed.
     * @param listener the listener instance
     */
    public void setCacheListener(ImageCacheListener listener) {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9549);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9550);this.cacheListener = listener;
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    /**
     * Returns an ImageInfo instance for a given URI.
     * @param uri the image's URI
     * @param session the session context
     * @param manager the ImageManager handling the images
     * @return the ImageInfo instance
     * @throws ImageException if an error occurs while parsing image data
     * @throws IOException if an I/O error occurs while loading image data
     */
    public ImageInfo needImageInfo(String uri, ImageSessionContext session, ImageManager manager)
            throws ImageException, IOException {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9551);
        //Fetch unique version of the URI and use it for synchronization so we have some sort of
        //"row-level" locking instead of "table-level" locking (to use a database analogy).
        //The fine locking strategy is necessary since preloading an image is a potentially long
        //operation.
        __CLR4_5_27d37d3m6lb4zru.R.inc(9552);if ((((isInvalidURI(uri))&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9553)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9554)==0&false))) {{
            __CLR4_5_27d37d3m6lb4zru.R.inc(9555);throw new FileNotFoundException("Image not found: " + uri);
        }
        }__CLR4_5_27d37d3m6lb4zru.R.inc(9556);String lockURI = uri.intern();
        __CLR4_5_27d37d3m6lb4zru.R.inc(9557);synchronized (lockURI) {
            __CLR4_5_27d37d3m6lb4zru.R.inc(9558);ImageInfo info = getImageInfo(uri);
            __CLR4_5_27d37d3m6lb4zru.R.inc(9559);if ((((info == null)&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9560)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9561)==0&false))) {{
                __CLR4_5_27d37d3m6lb4zru.R.inc(9562);try {
                    __CLR4_5_27d37d3m6lb4zru.R.inc(9563);Source src = session.needSource(uri);
                    __CLR4_5_27d37d3m6lb4zru.R.inc(9564);if ((((src == null)&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9565)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9566)==0&false))) {{
                        __CLR4_5_27d37d3m6lb4zru.R.inc(9567);registerInvalidURI(uri);
                        __CLR4_5_27d37d3m6lb4zru.R.inc(9568);throw new FileNotFoundException("Image not found: " + uri);
                    }
                    }__CLR4_5_27d37d3m6lb4zru.R.inc(9569);info = manager.preloadImage(uri, src);
                    __CLR4_5_27d37d3m6lb4zru.R.inc(9570);session.returnSource(uri, src);
                } catch (IOException ioe) {
                    __CLR4_5_27d37d3m6lb4zru.R.inc(9571);registerInvalidURI(uri);
                    __CLR4_5_27d37d3m6lb4zru.R.inc(9572);throw ioe;
                } catch (ImageException e) {
                    __CLR4_5_27d37d3m6lb4zru.R.inc(9573);registerInvalidURI(uri);
                    __CLR4_5_27d37d3m6lb4zru.R.inc(9574);throw e;
                }
                __CLR4_5_27d37d3m6lb4zru.R.inc(9575);if ((((info.getOriginalImage() == null || info.getOriginalImage().isCacheable())&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9576)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9577)==0&false))) {{
                    __CLR4_5_27d37d3m6lb4zru.R.inc(9578);putImageInfo(info);
                }
            }}
            }__CLR4_5_27d37d3m6lb4zru.R.inc(9579);return info;
        }
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    /**
     * Indicates whether a URI has previously been identified as an invalid URI.
     * @param uri the image's URI
     * @return true if the URI is invalid
     */
    public boolean isInvalidURI(String uri) {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9580);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9581);boolean expired = removeInvalidURIIfExpired(uri);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9582);if ((((expired)&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9583)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9584)==0&false))) {{
            __CLR4_5_27d37d3m6lb4zru.R.inc(9585);return false;
        } }else {{
            __CLR4_5_27d37d3m6lb4zru.R.inc(9586);if ((((cacheListener != null)&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9587)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9588)==0&false))) {{
                __CLR4_5_27d37d3m6lb4zru.R.inc(9589);cacheListener.invalidHit(uri);
            }
            }__CLR4_5_27d37d3m6lb4zru.R.inc(9590);return true;
        }
    }}finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    private boolean removeInvalidURIIfExpired(String uri) {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9591);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9592);Long timestamp = (Long) invalidURIs.get(uri);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9593);boolean expired = (timestamp == null)
                || this.invalidURIExpirationPolicy.isExpired(
                        this.timeStampProvider, timestamp);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9594);if ((((expired)&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9595)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9596)==0&false))) {{
            __CLR4_5_27d37d3m6lb4zru.R.inc(9597);this.invalidURIs.remove(uri);
        }
        }__CLR4_5_27d37d3m6lb4zru.R.inc(9598);return expired;
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    /**
     * Returns an ImageInfo instance from the cache or null if none is found.
     * @param uri the image's URI
     * @return the ImageInfo instance or null if the requested information is not in the cache
     */
    protected ImageInfo getImageInfo(String uri) {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9599);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9600);ImageInfo info = (ImageInfo)imageInfos.get(uri);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9601);if ((((cacheListener != null)&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9602)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9603)==0&false))) {{
            __CLR4_5_27d37d3m6lb4zru.R.inc(9604);if ((((info != null)&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9605)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9606)==0&false))) {{
                __CLR4_5_27d37d3m6lb4zru.R.inc(9607);cacheListener.cacheHitImageInfo(uri);
            } }else {{
                __CLR4_5_27d37d3m6lb4zru.R.inc(9608);if ((((!isInvalidURI(uri))&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9609)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9610)==0&false))) {{
                    __CLR4_5_27d37d3m6lb4zru.R.inc(9611);cacheListener.cacheMissImageInfo(uri);
                }
            }}
        }}
        }__CLR4_5_27d37d3m6lb4zru.R.inc(9612);return info;
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    /**
     * Registers an ImageInfo instance with the cache.
     * @param info the ImageInfo instance
     */
    protected void putImageInfo(ImageInfo info) {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9613);
        //An already existing ImageInfo is replaced.
        __CLR4_5_27d37d3m6lb4zru.R.inc(9614);imageInfos.put(info.getOriginalURI(), info);
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    private static final long ONE_HOUR = 60 * 60 * 1000;

    /**
     * Registers a URI as invalid so getImageInfo can indicate that quickly with no I/O access.
     * @param uri the URI of the invalid image
     */
    void registerInvalidURI(String uri) {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9615);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9616);invalidURIs.put(uri, timeStampProvider.getTimeStamp());

        __CLR4_5_27d37d3m6lb4zru.R.inc(9617);considerHouseKeeping();
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    /**
     * Returns an image from the cache or null if it wasn't found.
     * @param info the ImageInfo instance representing the image
     * @param flavor the requested ImageFlavor for the image
     * @return the requested image or null if the image is not in the cache
     */
    public Image getImage(ImageInfo info, ImageFlavor flavor) {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9618);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9619);return getImage(info.getOriginalURI(), flavor);
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    /**
     * Returns an image from the cache or null if it wasn't found.
     * @param uri the image's URI
     * @param flavor the requested ImageFlavor for the image
     * @return the requested image or null if the image is not in the cache
     */
    public Image getImage(String uri, ImageFlavor flavor) {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9620);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9621);if ((((uri == null || "".equals(uri))&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9622)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9623)==0&false))) {{
            __CLR4_5_27d37d3m6lb4zru.R.inc(9624);return null;
        }
        }__CLR4_5_27d37d3m6lb4zru.R.inc(9625);ImageKey key = new ImageKey(uri, flavor);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9626);Image img = (Image)images.get(key);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9627);if ((((cacheListener != null)&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9628)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9629)==0&false))) {{
            __CLR4_5_27d37d3m6lb4zru.R.inc(9630);if ((((img != null)&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9631)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9632)==0&false))) {{
                __CLR4_5_27d37d3m6lb4zru.R.inc(9633);cacheListener.cacheHitImage(key);
            } }else {{
                __CLR4_5_27d37d3m6lb4zru.R.inc(9634);cacheListener.cacheMissImage(key);
            }
        }}
        }__CLR4_5_27d37d3m6lb4zru.R.inc(9635);return img;
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    /**
     * Registers an image with the cache.
     * @param img the image
     */
    public void putImage(Image img) {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9636);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9637);String originalURI = img.getInfo().getOriginalURI();
        __CLR4_5_27d37d3m6lb4zru.R.inc(9638);if ((((originalURI == null || "".equals(originalURI))&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9639)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9640)==0&false))) {{
            __CLR4_5_27d37d3m6lb4zru.R.inc(9641);return; //Don't cache if there's no URI
        }
        //An already existing Image is replaced.
        }__CLR4_5_27d37d3m6lb4zru.R.inc(9642);if ((((!img.isCacheable())&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9643)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9644)==0&false))) {{
            __CLR4_5_27d37d3m6lb4zru.R.inc(9645);throw new IllegalArgumentException(
                    "Image is not cacheable! (Flavor: " + img.getFlavor() + ")");
        }
        }__CLR4_5_27d37d3m6lb4zru.R.inc(9646);ImageKey key = new ImageKey(originalURI, img.getFlavor());
        __CLR4_5_27d37d3m6lb4zru.R.inc(9647);images.put(key, img);
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    /**
     * Clears the image cache (all ImageInfo and Image objects).
     */
    public void clearCache() {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9648);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9649);invalidURIs.clear();
        __CLR4_5_27d37d3m6lb4zru.R.inc(9650);imageInfos.clear();
        __CLR4_5_27d37d3m6lb4zru.R.inc(9651);images.clear();
        __CLR4_5_27d37d3m6lb4zru.R.inc(9652);doHouseKeeping();
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    private void considerHouseKeeping() {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9653);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9654);long ts = timeStampProvider.getTimeStamp();
        __CLR4_5_27d37d3m6lb4zru.R.inc(9655);if ((((this.lastHouseKeeping + ONE_HOUR > ts)&&(__CLR4_5_27d37d3m6lb4zru.R.iget(9656)!=0|true))||(__CLR4_5_27d37d3m6lb4zru.R.iget(9657)==0&false))) {{
            //Housekeeping is only triggered through registration of an invalid URI at the moment.
            //Depending on the environment this could be triggered next to never.
            //Doing this check for every image access could be relatively costly.
            //The only alternative is a cleanup thread which is rather heavy-weight.
            __CLR4_5_27d37d3m6lb4zru.R.inc(9658);this.lastHouseKeeping = ts;
            __CLR4_5_27d37d3m6lb4zru.R.inc(9659);doHouseKeeping();
        }
    }}finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    /**
     * Triggers some house-keeping, i.e. removes stale entries.
     */
    public void doHouseKeeping() {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9660);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9661);imageInfos.doHouseKeeping();
        __CLR4_5_27d37d3m6lb4zru.R.inc(9662);images.doHouseKeeping();
        __CLR4_5_27d37d3m6lb4zru.R.inc(9663);doInvalidURIHouseKeeping();
    }finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

    private void doInvalidURIHouseKeeping() {try{__CLR4_5_27d37d3m6lb4zru.R.inc(9664);
        __CLR4_5_27d37d3m6lb4zru.R.inc(9665);final Set currentEntries = new HashSet(this.invalidURIs.keySet());
        __CLR4_5_27d37d3m6lb4zru.R.inc(9666);for (Object currentEntry : currentEntries) {{
            __CLR4_5_27d37d3m6lb4zru.R.inc(9667);final String key = (String) currentEntry;
            __CLR4_5_27d37d3m6lb4zru.R.inc(9668);removeInvalidURIIfExpired(key);
        }
    }}finally{__CLR4_5_27d37d3m6lb4zru.R.flushNeeded();}}

}
