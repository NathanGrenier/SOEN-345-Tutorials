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

/* $Id: ImageCacheStatistics.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.cache;

import java.util.Collections;
import java.util.Map;

/**
 * Convenience class that gathers statistical information about the image cache.
 */
public class ImageCacheStatistics implements ImageCacheListener {public static class __CLR4_5_27gl7glm6lb4zsk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,9719,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int invalidHits;
    private int imageInfoCacheHits;
    private int imageInfoCacheMisses;
    private int imageCacheHits;
    private int imageCacheMisses;
    private Map imageCacheHitMap;
    private Map imageCacheMissMap;

    /**
     * Main constructor.
     * @param detailed true if the cache hits/misses for each Image instance should be recorded.
     */
    public ImageCacheStatistics(boolean detailed) {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9669);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9670);if ((((detailed)&&(__CLR4_5_27gl7glm6lb4zsk.R.iget(9671)!=0|true))||(__CLR4_5_27gl7glm6lb4zsk.R.iget(9672)==0&false))) {{
            __CLR4_5_27gl7glm6lb4zsk.R.inc(9673);imageCacheHitMap = new java.util.HashMap();
            __CLR4_5_27gl7glm6lb4zsk.R.inc(9674);imageCacheMissMap = new java.util.HashMap();
        }
    }}finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /**
     * Reset the gathered statistics information.
     */
    public void reset() {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9675);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9676);this.imageInfoCacheHits = 0;
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9677);this.imageInfoCacheMisses = 0;
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9678);this.invalidHits = 0;
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void invalidHit(String uri) {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9679);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9680);invalidHits++;
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void cacheHitImageInfo(String uri) {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9681);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9682);imageInfoCacheHits++;
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void cacheMissImageInfo(String uri) {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9683);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9684);imageInfoCacheMisses++;
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    private void increaseEntry(Map map, Object key) {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9685);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9686);Integer v = (Integer)map.get(key);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9687);if ((((v == null)&&(__CLR4_5_27gl7glm6lb4zsk.R.iget(9688)!=0|true))||(__CLR4_5_27gl7glm6lb4zsk.R.iget(9689)==0&false))) {{
            __CLR4_5_27gl7glm6lb4zsk.R.inc(9690);v = 1;
        } }else {{
            __CLR4_5_27gl7glm6lb4zsk.R.inc(9691);v++;
        }
        }__CLR4_5_27gl7glm6lb4zsk.R.inc(9692);map.put(key, v);
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void cacheHitImage(ImageKey key) {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9693);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9694);imageCacheHits++;
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9695);if ((((imageCacheHitMap != null)&&(__CLR4_5_27gl7glm6lb4zsk.R.iget(9696)!=0|true))||(__CLR4_5_27gl7glm6lb4zsk.R.iget(9697)==0&false))) {{
            __CLR4_5_27gl7glm6lb4zsk.R.inc(9698);increaseEntry(imageCacheHitMap, key);
        }
    }}finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void cacheMissImage(ImageKey key) {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9699);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9700);imageCacheMisses++;
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9701);if ((((imageCacheMissMap != null)&&(__CLR4_5_27gl7glm6lb4zsk.R.iget(9702)!=0|true))||(__CLR4_5_27gl7glm6lb4zsk.R.iget(9703)==0&false))) {{
            __CLR4_5_27gl7glm6lb4zsk.R.inc(9704);increaseEntry(imageCacheMissMap, key);
        }
    }}finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /**
     * Returns the number of times an invalid URI is tried.
     * @return the number of times an invalid URI is tried.
     */
    public int getInvalidHits() {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9705);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9706);return invalidHits;
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /**
     * Returns the number of cache hits for ImageInfo instances.
     * @return the number of cache hits for ImageInfo instances.
     */
    public int getImageInfoCacheHits() {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9707);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9708);return imageInfoCacheHits;
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /**
     * Returns the number of cache misses for ImageInfo instances.
     * @return the number of cache misses for ImageInfo instances.
     */
    public int getImageInfoCacheMisses() {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9709);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9710);return imageInfoCacheMisses;
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /**
     * Returns the number of cache hits for Image instances.
     * @return the number of cache hits for Image instances.
     */
    public int getImageCacheHits() {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9711);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9712);return imageCacheHits;
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /**
     * Returns the number of cache misses for Image instances.
     * @return the number of cache misses for Image instances.
     */
    public int getImageCacheMisses() {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9713);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9714);return imageCacheMisses;
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /**
     * Returns a Map&lt;ImageKey, Integer&gt; with the number of cache hits.
     * @return a Map&lt;ImageKey, Integer&gt; with the number of cache hits
     */
    public Map getImageCacheHitMap() {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9715);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9716);return Collections.unmodifiableMap(imageCacheHitMap);
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

    /**
     * Returns a Map&lt;ImageKey, Integer&gt; with the number of cache misses.
     * @return a Map&lt;ImageKey, Integer&gt; with the number of cache misses
     */
    public Map getImageCacheMissMap() {try{__CLR4_5_27gl7glm6lb4zsk.R.inc(9717);
        __CLR4_5_27gl7glm6lb4zsk.R.inc(9718);return Collections.unmodifiableMap(imageCacheMissMap);
    }finally{__CLR4_5_27gl7glm6lb4zsk.R.flushNeeded();}}

}
