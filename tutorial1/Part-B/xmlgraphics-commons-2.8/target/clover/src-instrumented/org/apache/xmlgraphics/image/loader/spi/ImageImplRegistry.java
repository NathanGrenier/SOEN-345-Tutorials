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

/* $Id: ImageImplRegistry.java 1904425 2022-10-06 12:37:37Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.spi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.util.Penalty;
import org.apache.xmlgraphics.util.Service;

/**
 * This class is the registry for all implementations of the various service provider interfaces
 * for the image package.
 */
public class ImageImplRegistry {public static class __CLR4_5_29ke9kem6lb50hb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,12612,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** logger */
    protected static final Log log = LogFactory.getLog(ImageImplRegistry.class);

    /** Infinite penalty value which shall force any implementation to become ineligible. */
    public static final int INFINITE_PENALTY = Integer.MAX_VALUE;

    /** Holds the list of preloaders */
    private List preloaders = new java.util.ArrayList();
    //Content: List<ImagePreloader>
    private int lastPreloaderIdentifier;
    private int lastPreloaderSort;

    /** Holds the list of ImageLoaderFactories */
    private Map loaders = new java.util.HashMap();
    //Content: Map<String,Map<ImageFlavor,ImageLoaderFactory>>

    /** Holds the list of ImageConverters */
    private List converters = new java.util.ArrayList();
    //Content: List<ImageConverter>

    private int converterModifications;

    /** A Map (key: implementation classes) with additional penalties to fine-tune the registry. */
    private Map additionalPenalties = new java.util.HashMap(); //<String, Penalty>
    //Note: String as key chosen to avoid possible class-unloading leaks

    /** Singleton instance */
    private static ImageImplRegistry defaultInstance = new ImageImplRegistry();

    /**
     * Main constructor. This constructor allows to disable plug-in discovery for testing purposes.
     * @param discover true if implementation classes shall automatically be discovered.
     */
    public ImageImplRegistry(boolean discover) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12398);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12399);if ((((discover)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12400)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12401)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12402);discoverClasspathImplementations();
        }
    }}finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Main constructor.
     */
    public ImageImplRegistry() {
        this(true);__CLR4_5_29ke9kem6lb50hb.R.inc(12404);try{__CLR4_5_29ke9kem6lb50hb.R.inc(12403);
    }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Returns the default instance of the Image implementation registry.
     * @return the default instance
     */
    public static ImageImplRegistry getDefaultInstance() {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12405);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12406);return defaultInstance;
    }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Discovers all implementations in the application's classpath.
     */
    public void discoverClasspathImplementations() {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12407);
        //Dynamic registration of ImagePreloaders
        __CLR4_5_29ke9kem6lb50hb.R.inc(12408);Iterator iter = Service.providers(ImagePreloader.class);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12409);while ((((iter.hasNext())&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12410)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12411)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12412);registerPreloader((ImagePreloader)iter.next());
        }

        //Dynamic registration of ImageLoaderFactories
        }__CLR4_5_29ke9kem6lb50hb.R.inc(12413);iter = Service.providers(ImageLoaderFactory.class);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12414);while ((((iter.hasNext())&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12415)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12416)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12417);registerLoaderFactory((ImageLoaderFactory)iter.next());
        }

        //Dynamic registration of ImageConverters
        }__CLR4_5_29ke9kem6lb50hb.R.inc(12418);iter = Service.providers(ImageConverter.class);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12419);while ((((iter.hasNext())&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12420)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12421)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12422);registerConverter((ImageConverter)iter.next());
        }
    }}finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Registers a new ImagePreloader.
     * @param preloader An ImagePreloader instance
     */
    public void registerPreloader(ImagePreloader preloader) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12423);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12424);if ((((log.isDebugEnabled())&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12425)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12426)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12427);log.debug("Registered " + preloader.getClass().getName()
                    + " with priority " + preloader.getPriority());
        }
        }__CLR4_5_29ke9kem6lb50hb.R.inc(12428);preloaders.add(newPreloaderHolder(preloader));
    }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    private synchronized PreloaderHolder newPreloaderHolder(ImagePreloader preloader) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12429);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12430);PreloaderHolder holder = new PreloaderHolder();
        __CLR4_5_29ke9kem6lb50hb.R.inc(12431);holder.preloader = preloader;
        __CLR4_5_29ke9kem6lb50hb.R.inc(12432);holder.identifier = ++lastPreloaderIdentifier;
        __CLR4_5_29ke9kem6lb50hb.R.inc(12433);return holder;
    }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /** Holder class for registered {@link ImagePreloader} instances. */
    private static class PreloaderHolder {
        private ImagePreloader preloader;
        private int identifier;

        public String toString() {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12434);
            __CLR4_5_29ke9kem6lb50hb.R.inc(12435);return preloader + " " + identifier;
        }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}
    }

    private synchronized void sortPreloaders() {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12436);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12437);if ((((this.lastPreloaderIdentifier != this.lastPreloaderSort)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12438)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12439)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12440);Collections.sort(this.preloaders, new Comparator() {

                public int compare(Object o1, Object o2) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12441);
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12442);PreloaderHolder h1 = (PreloaderHolder)o1;
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12443);long p1 = h1.preloader.getPriority();
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12444);p1 += getAdditionalPenalty(h1.preloader.getClass().getName()).getValue();

                    __CLR4_5_29ke9kem6lb50hb.R.inc(12445);PreloaderHolder h2 = (PreloaderHolder)o2;
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12446);int p2 = h2.preloader.getPriority();
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12447);p2 += getAdditionalPenalty(h2.preloader.getClass().getName()).getValue();

                    __CLR4_5_29ke9kem6lb50hb.R.inc(12448);int diff = Penalty.truncate(p1 - p2);
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12449);if ((((diff != 0)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12450)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12451)==0&false))) {{
                        __CLR4_5_29ke9kem6lb50hb.R.inc(12452);return diff;
                    } }else {{
                        __CLR4_5_29ke9kem6lb50hb.R.inc(12453);diff = h1.identifier - h2.identifier;
                        __CLR4_5_29ke9kem6lb50hb.R.inc(12454);return diff;
                    }
                }}finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

            });
            __CLR4_5_29ke9kem6lb50hb.R.inc(12455);this.lastPreloaderSort = lastPreloaderIdentifier;
        }
    }}finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Registers a new ImageLoaderFactory.
     * @param loaderFactory An ImageLoaderFactory instance
     */
    public void registerLoaderFactory(ImageLoaderFactory loaderFactory) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12456);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12457);if ((((!loaderFactory.isAvailable())&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12458)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12459)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12460);if ((((log.isDebugEnabled())&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12461)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12462)==0&false))) {{
                __CLR4_5_29ke9kem6lb50hb.R.inc(12463);log.debug("ImageLoaderFactory reports not available: "
                        + loaderFactory.getClass().getName());
            }
            }__CLR4_5_29ke9kem6lb50hb.R.inc(12464);return;
        }
        }__CLR4_5_29ke9kem6lb50hb.R.inc(12465);String[] mimes = loaderFactory.getSupportedMIMETypes();
        __CLR4_5_29ke9kem6lb50hb.R.inc(12466);for (String mime : mimes) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12467);synchronized (loaders) {
                __CLR4_5_29ke9kem6lb50hb.R.inc(12468);Map flavorMap = (Map) loaders.get(mime);
                __CLR4_5_29ke9kem6lb50hb.R.inc(12469);if ((((flavorMap == null)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12470)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12471)==0&false))) {{
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12472);flavorMap = new HashMap();
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12473);loaders.put(mime, flavorMap);
                }

                }__CLR4_5_29ke9kem6lb50hb.R.inc(12474);ImageFlavor[] flavors = loaderFactory.getSupportedFlavors(mime);
                __CLR4_5_29ke9kem6lb50hb.R.inc(12475);for (ImageFlavor flavor : flavors) {{
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12476);List factoryList = (List) flavorMap.get(flavor);
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12477);if ((((factoryList == null)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12478)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12479)==0&false))) {{
                        __CLR4_5_29ke9kem6lb50hb.R.inc(12480);factoryList = new ArrayList();
                        __CLR4_5_29ke9kem6lb50hb.R.inc(12481);flavorMap.put(flavor, factoryList);
                    }
                    }__CLR4_5_29ke9kem6lb50hb.R.inc(12482);factoryList.add(loaderFactory);

                    __CLR4_5_29ke9kem6lb50hb.R.inc(12483);if ((((log.isDebugEnabled())&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12484)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12485)==0&false))) {{
                        __CLR4_5_29ke9kem6lb50hb.R.inc(12486);log.debug("Registered " + loaderFactory.getClass().getName()
                                + ": MIME = " + mime + ", Flavor = " + flavor);
                    }
                }}
            }}
        }
    }}finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Returns the Collection of registered ImageConverter instances.
     * @return a Collection&lt;ImageConverter&gt;
     */
    public Collection getImageConverters() {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12487);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12488);return Collections.unmodifiableList(this.converters);
    }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Returns the number of modifications to the collection of registered ImageConverter instances.
     * This is used to detect changes in the registry concerning ImageConverters.
     * @return the number of modifications
     */
    public int getImageConverterModifications() {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12489);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12490);return this.converterModifications;
    }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Registers a new ImageConverter.
     * @param converter An ImageConverter instance
     */
    public void registerConverter(ImageConverter converter) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12491);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12492);converters.add(converter);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12493);converterModifications++;
        __CLR4_5_29ke9kem6lb50hb.R.inc(12494);if ((((log.isDebugEnabled())&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12495)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12496)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12497);log.debug("Registered: " + converter.getClass().getName());
        }
    }}finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Returns an iterator over all registered ImagePreloader instances.
     * @return an iterator over ImagePreloader instances.
     */
    public Iterator getPreloaderIterator() {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12498);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12499);sortPreloaders();
        __CLR4_5_29ke9kem6lb50hb.R.inc(12500);final Iterator iter = this.preloaders.iterator();
        //Unpack the holders
        __CLR4_5_29ke9kem6lb50hb.R.inc(12501);MyIterator i = new MyIterator();
        __CLR4_5_29ke9kem6lb50hb.R.inc(12502);i.iter = iter;
        __CLR4_5_29ke9kem6lb50hb.R.inc(12503);return i;
    }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    static class MyIterator implements Iterator {
        Iterator iter;
        public boolean hasNext() {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12504);
            __CLR4_5_29ke9kem6lb50hb.R.inc(12505);return iter.hasNext();
        }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

        public Object next() {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12506);
            __CLR4_5_29ke9kem6lb50hb.R.inc(12507);Object obj = iter.next();
            __CLR4_5_29ke9kem6lb50hb.R.inc(12508);if ((((obj != null)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12509)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12510)==0&false))) {{
                __CLR4_5_29ke9kem6lb50hb.R.inc(12511);return ((PreloaderHolder)obj).preloader;
            } }else {{
                __CLR4_5_29ke9kem6lb50hb.R.inc(12512);return null;
            }
        }}finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

        public void remove() {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12513);
            __CLR4_5_29ke9kem6lb50hb.R.inc(12514);iter.remove();
        }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    }

    /**
     * Returns the best ImageLoaderFactory supporting the {@link ImageInfo} and image flavor.
     * If there are multiple ImageLoaderFactories the one with the least usage penalty is selected.
     * @param imageInfo the image info object
     * @param flavor the image flavor.
     * @return an ImageLoaderFactory instance or null, if no suitable implementation was found
     */
    public ImageLoaderFactory getImageLoaderFactory(ImageInfo imageInfo, ImageFlavor flavor) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12515);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12516);String mime = imageInfo.getMimeType();
        __CLR4_5_29ke9kem6lb50hb.R.inc(12517);Map flavorMap = (Map)loaders.get(mime);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12518);if ((((flavorMap != null)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12519)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12520)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12521);List factoryList = (List)flavorMap.get(flavor);
            __CLR4_5_29ke9kem6lb50hb.R.inc(12522);if ((((factoryList != null && factoryList.size() > 0)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12523)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12524)==0&false))) {{
                __CLR4_5_29ke9kem6lb50hb.R.inc(12525);Iterator iter = factoryList.iterator();
                __CLR4_5_29ke9kem6lb50hb.R.inc(12526);int bestPenalty = Integer.MAX_VALUE;
                __CLR4_5_29ke9kem6lb50hb.R.inc(12527);ImageLoaderFactory bestFactory = null;
                __CLR4_5_29ke9kem6lb50hb.R.inc(12528);while ((((iter.hasNext())&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12529)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12530)==0&false))) {{
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12531);ImageLoaderFactory factory = (ImageLoaderFactory)iter.next();
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12532);if ((((!factory.isSupported(imageInfo))&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12533)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12534)==0&false))) {{
                        __CLR4_5_29ke9kem6lb50hb.R.inc(12535);continue;
                    }
                    }__CLR4_5_29ke9kem6lb50hb.R.inc(12536);ImageLoader loader = factory.newImageLoader(flavor);
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12537);int penalty = loader.getUsagePenalty();
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12538);if ((((penalty < bestPenalty)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12539)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12540)==0&false))) {{
                        __CLR4_5_29ke9kem6lb50hb.R.inc(12541);bestPenalty = penalty;
                        __CLR4_5_29ke9kem6lb50hb.R.inc(12542);bestFactory = factory;
                    }
                }}
                }__CLR4_5_29ke9kem6lb50hb.R.inc(12543);return bestFactory;
            }
        }}
        }__CLR4_5_29ke9kem6lb50hb.R.inc(12544);return null;
    }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Returns an array of {@link ImageLoaderFactory} instances that support the MIME type
     * indicated by an {@link ImageInfo} object and can generate the given image flavor.
     * @param imageInfo the image info object
     * @param flavor the target image flavor
     * @return the array of image loader factories
     */
    public ImageLoaderFactory[] getImageLoaderFactories(ImageInfo imageInfo, ImageFlavor flavor) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12545);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12546);String mime = imageInfo.getMimeType();
        __CLR4_5_29ke9kem6lb50hb.R.inc(12547);Collection matches = new java.util.TreeSet(new ImageLoaderFactoryComparator(flavor));
        __CLR4_5_29ke9kem6lb50hb.R.inc(12548);imageInfo.getCustomObjects().put("additionalPenalties", additionalPenalties);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12549);Map flavorMap = (Map) loaders.get(mime);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12550);if ((((flavorMap != null)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12551)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12552)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12553);for (Object i : flavorMap.entrySet()) {{
                __CLR4_5_29ke9kem6lb50hb.R.inc(12554);Map.Entry e = (Map.Entry) i;
                __CLR4_5_29ke9kem6lb50hb.R.inc(12555);ImageFlavor checkFlavor = (ImageFlavor) e.getKey();
                __CLR4_5_29ke9kem6lb50hb.R.inc(12556);if ((((checkFlavor.isCompatible(flavor))&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12557)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12558)==0&false))) {{
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12559);List factoryList = (List)e.getValue();
                    __CLR4_5_29ke9kem6lb50hb.R.inc(12560);if ((((factoryList != null && factoryList.size() > 0)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12561)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12562)==0&false))) {{
                        __CLR4_5_29ke9kem6lb50hb.R.inc(12563);for (Object aFactoryList : factoryList) {{
                            __CLR4_5_29ke9kem6lb50hb.R.inc(12564);ImageLoaderFactory factory = (ImageLoaderFactory) aFactoryList;
                            __CLR4_5_29ke9kem6lb50hb.R.inc(12565);if ((((factory.isSupported(imageInfo))&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12566)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12567)==0&false))) {{
                                __CLR4_5_29ke9kem6lb50hb.R.inc(12568);matches.add(factory);
                            }
                        }}
                    }}
                }}
            }}
        }}
        }__CLR4_5_29ke9kem6lb50hb.R.inc(12569);if ((((matches.size() == 0)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12570)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12571)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12572);return null;
        } }else {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12573);return (ImageLoaderFactory[])matches.toArray(new ImageLoaderFactory[matches.size()]);
        }
    }}finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /** Comparator for {@link ImageLoaderFactory} classes. */
    private class ImageLoaderFactoryComparator implements Comparator {

        private ImageFlavor targetFlavor;

        public ImageLoaderFactoryComparator(ImageFlavor targetFlavor) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12574);
            __CLR4_5_29ke9kem6lb50hb.R.inc(12575);this.targetFlavor = targetFlavor;
        }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

        public int compare(Object o1, Object o2) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12576);
            __CLR4_5_29ke9kem6lb50hb.R.inc(12577);ImageLoaderFactory f1 = (ImageLoaderFactory)o1;
            __CLR4_5_29ke9kem6lb50hb.R.inc(12578);ImageLoader l1 = f1.newImageLoader(targetFlavor);
            __CLR4_5_29ke9kem6lb50hb.R.inc(12579);long p1 = l1.getUsagePenalty();
            __CLR4_5_29ke9kem6lb50hb.R.inc(12580);p1 += getAdditionalPenalty(l1.getClass().getName()).getValue();

            __CLR4_5_29ke9kem6lb50hb.R.inc(12581);ImageLoaderFactory f2 = (ImageLoaderFactory)o2;
            __CLR4_5_29ke9kem6lb50hb.R.inc(12582);ImageLoader l2 = f2.newImageLoader(targetFlavor);
//            long p2 = l2.getUsagePenalty();
            __CLR4_5_29ke9kem6lb50hb.R.inc(12583);long p2 = getAdditionalPenalty(l2.getClass().getName()).getValue();

            //Lowest penalty first
            __CLR4_5_29ke9kem6lb50hb.R.inc(12584);return Penalty.truncate(p1 - p2);
        }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    }


    /**
     * Returns an array of ImageLoaderFactory instances which support the given MIME type. The
     * instances are returned in no particular order.
     * @param mime the MIME type to find ImageLoaderFactories for
     * @return the array of ImageLoaderFactory instances
     */
    public ImageLoaderFactory[] getImageLoaderFactories(String mime) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12585);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12586);Map flavorMap = (Map)loaders.get(mime);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12587);if ((((flavorMap != null)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12588)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12589)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12590);Set factories = new java.util.HashSet();
            __CLR4_5_29ke9kem6lb50hb.R.inc(12591);for (Object o : flavorMap.values()) {{
                __CLR4_5_29ke9kem6lb50hb.R.inc(12592);List factoryList = (List) o;
                __CLR4_5_29ke9kem6lb50hb.R.inc(12593);factories.addAll(factoryList);
            }
            }__CLR4_5_29ke9kem6lb50hb.R.inc(12594);int factoryCount = factories.size();
            __CLR4_5_29ke9kem6lb50hb.R.inc(12595);if ((((factoryCount > 0)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12596)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12597)==0&false))) {{
                __CLR4_5_29ke9kem6lb50hb.R.inc(12598);return (ImageLoaderFactory[])factories.toArray(
                        new ImageLoaderFactory[factoryCount]);
            }
        }}
        }__CLR4_5_29ke9kem6lb50hb.R.inc(12599);return new ImageLoaderFactory[0];
    }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Sets an additional penalty for a particular implementation class for any of the interface
     * administered by this registry class. No checking is performed to verify if the className
     * parameter is valid.
     * @param className the fully qualified class name of the implementation class
     * @param penalty the additional penalty or null to clear any existing value
     */
    public void setAdditionalPenalty(String className, Penalty penalty) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12600);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12601);if ((((penalty != null)&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12602)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12603)==0&false))) {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12604);this.additionalPenalties.put(className, penalty);
        } }else {{
            __CLR4_5_29ke9kem6lb50hb.R.inc(12605);this.additionalPenalties.remove(className);
        }
        }__CLR4_5_29ke9kem6lb50hb.R.inc(12606);this.lastPreloaderSort = -1; //Force resort, just in case this was a preloader
    }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

    /**
     * Returns the additional penalty value set for a particular implementation class.
     * If no such value is set, 0 is returned.
     * @param className the fully qualified class name of the implementation class
     * @return the additional penalty value
     */
    public Penalty getAdditionalPenalty(String className) {try{__CLR4_5_29ke9kem6lb50hb.R.inc(12607);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12608);Penalty p = (Penalty)this.additionalPenalties.get(className);
        __CLR4_5_29ke9kem6lb50hb.R.inc(12609);return ((((p != null )&&(__CLR4_5_29ke9kem6lb50hb.R.iget(12610)!=0|true))||(__CLR4_5_29ke9kem6lb50hb.R.iget(12611)==0&false))? p : Penalty.ZERO_PENALTY);
    }finally{__CLR4_5_29ke9kem6lb50hb.R.flushNeeded();}}

}
