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

/* $Id: SoftMapCache.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.image.loader.util;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Provides a simple cache using soft references and storing the values in a Map. The keys into
 * the Map are hard references, the values are referenced through soft references. The collected
 * values are cleaned up through a ReferenceQueue.
 */
public class SoftMapCache {public static class __CLR4_5_29vc9vcm6lb50ip{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,12837,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** logger */
    private static Log log = LogFactory.getLog(SoftMapCache.class);

    private Map map;
    private ReferenceQueue refQueue = new ReferenceQueue();

    /**
     * Creates a new soft cache.
     * @param synched true if the Map containing the values should by synchronized
     */
    public SoftMapCache(boolean synched) {try{__CLR4_5_29vc9vcm6lb50ip.R.inc(12792);
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12793);this.map = new java.util.HashMap();
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12794);if ((((synched)&&(__CLR4_5_29vc9vcm6lb50ip.R.iget(12795)!=0|true))||(__CLR4_5_29vc9vcm6lb50ip.R.iget(12796)==0&false))) {{
            __CLR4_5_29vc9vcm6lb50ip.R.inc(12797);this.map = Collections.synchronizedMap(this.map);
        }
    }}finally{__CLR4_5_29vc9vcm6lb50ip.R.flushNeeded();}}

    /**
     * Returns the value associated with the given key. If the value is not found or the value
     * has been collected, null is returned.
     * @param key the key
     * @return the requested value or null
     */
    public Object get(Object key) {try{__CLR4_5_29vc9vcm6lb50ip.R.inc(12798);
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12799);Reference ref = (Reference)map.get(key);
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12800);return getReference(key, ref);
    }finally{__CLR4_5_29vc9vcm6lb50ip.R.flushNeeded();}}

    /**
     * Removed the value associated with the given key. The value that is removed is returned
     * as the methods result. If the value is not found or the value has been collected,
     * null is returned.
     * @param key the key
     * @return the requested value or null
     */
    public Object remove(Object key) {try{__CLR4_5_29vc9vcm6lb50ip.R.inc(12801);
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12802);Reference ref = (Reference)map.remove(key);
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12803);return getReference(key, ref);
    }finally{__CLR4_5_29vc9vcm6lb50ip.R.flushNeeded();}}

    private Object getReference(Object key, Reference ref) {try{__CLR4_5_29vc9vcm6lb50ip.R.inc(12804);
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12805);Object value = null;
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12806);if ((((ref != null)&&(__CLR4_5_29vc9vcm6lb50ip.R.iget(12807)!=0|true))||(__CLR4_5_29vc9vcm6lb50ip.R.iget(12808)==0&false))) {{
            __CLR4_5_29vc9vcm6lb50ip.R.inc(12809);value = ref.get();
            __CLR4_5_29vc9vcm6lb50ip.R.inc(12810);if ((((value == null)&&(__CLR4_5_29vc9vcm6lb50ip.R.iget(12811)!=0|true))||(__CLR4_5_29vc9vcm6lb50ip.R.iget(12812)==0&false))) {{
                //Remove key if its value has been garbage collected
                __CLR4_5_29vc9vcm6lb50ip.R.inc(12813);if ((((log.isTraceEnabled())&&(__CLR4_5_29vc9vcm6lb50ip.R.iget(12814)!=0|true))||(__CLR4_5_29vc9vcm6lb50ip.R.iget(12815)==0&false))) {{
                    __CLR4_5_29vc9vcm6lb50ip.R.inc(12816);log.trace("Image has been collected: " + key);
                }
                }__CLR4_5_29vc9vcm6lb50ip.R.inc(12817);checkReferenceQueue();
            }
        }}
        }__CLR4_5_29vc9vcm6lb50ip.R.inc(12818);return value;
    }finally{__CLR4_5_29vc9vcm6lb50ip.R.flushNeeded();}}

    /**
     * Put a new value in the cache overwriting any existing value with the same key.
     * @param key The key
     * @param value the value
     */
    public void put(Object key, Object value) {try{__CLR4_5_29vc9vcm6lb50ip.R.inc(12819);
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12820);map.put(key, wrapInReference(value, key));
    }finally{__CLR4_5_29vc9vcm6lb50ip.R.flushNeeded();}}

    /**
     * Clears the cache.
     */
    public void clear() {try{__CLR4_5_29vc9vcm6lb50ip.R.inc(12821);
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12822);map.clear();
    }finally{__CLR4_5_29vc9vcm6lb50ip.R.flushNeeded();}}

    /**
     * Triggers some house-keeping, i.e. processes any pending objects in the reference queue.
     */
    public void doHouseKeeping() {try{__CLR4_5_29vc9vcm6lb50ip.R.inc(12823);
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12824);checkReferenceQueue();
    }finally{__CLR4_5_29vc9vcm6lb50ip.R.flushNeeded();}}

    private Reference wrapInReference(Object obj, Object key) {try{__CLR4_5_29vc9vcm6lb50ip.R.inc(12825);
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12826);return new SoftReferenceWithKey(obj, key, refQueue);
    }finally{__CLR4_5_29vc9vcm6lb50ip.R.flushNeeded();}}

    /**
     * Checks the reference queue if any references have been cleared and removes them from the
     * cache.
     */
    private void checkReferenceQueue() {try{__CLR4_5_29vc9vcm6lb50ip.R.inc(12827);
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12828);SoftReferenceWithKey ref;
        __CLR4_5_29vc9vcm6lb50ip.R.inc(12829);while ((ref = (SoftReferenceWithKey)refQueue.poll()) != null) {{
            __CLR4_5_29vc9vcm6lb50ip.R.inc(12832);if ((((log.isTraceEnabled())&&(__CLR4_5_29vc9vcm6lb50ip.R.iget(12833)!=0|true))||(__CLR4_5_29vc9vcm6lb50ip.R.iget(12834)==0&false))) {{
                __CLR4_5_29vc9vcm6lb50ip.R.inc(12835);log.trace("Removing ImageInfo from ref queue: " + ref.getKey());
            }
            }__CLR4_5_29vc9vcm6lb50ip.R.inc(12836);map.remove(ref.getKey());
        }
    }}finally{__CLR4_5_29vc9vcm6lb50ip.R.flushNeeded();}}
}
