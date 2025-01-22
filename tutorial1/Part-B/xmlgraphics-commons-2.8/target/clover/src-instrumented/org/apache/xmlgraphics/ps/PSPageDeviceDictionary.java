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

/* $Id: PSPageDeviceDictionary.java 1715211 2015-11-19 16:35:44Z ssteiner $ */

package org.apache.xmlgraphics.ps;

import java.util.Map;

/**
 * Postscript page device dictionary object
 *
 * This object is used by the postscript renderer to hold postscript page device
 * values.  It can also be used to minimize the number of setpagedevice calls when
 * DSC compliance is false.
 */
public class PSPageDeviceDictionary extends PSDictionary {public static class __CLR4_5_2dy1dy1m68iyi40{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,18114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 845943256485806509L;

    /**
     * Whether or not the contents of the dictionary are flushed on retrieval
     */
    private boolean flushOnRetrieval;

    /**
     * Dictionary content that has not been output/written yet
     */
    private PSDictionary unRetrievedContentDictionary;

    /**
     * @param key key with which the specified value is to be associated.
     * @param value value to be associated with the specified key.
     * @return the previous value associated with the key or null
     * @see java.util.Map#put(Object, Object)
     */
    public Object put(Object key, Object value) {try{__CLR4_5_2dy1dy1m68iyi40.R.inc(18073);
        __CLR4_5_2dy1dy1m68iyi40.R.inc(18074);Object previousValue = super.put(key, value);
        __CLR4_5_2dy1dy1m68iyi40.R.inc(18075);if ((((flushOnRetrieval)&&(__CLR4_5_2dy1dy1m68iyi40.R.iget(18076)!=0|true))||(__CLR4_5_2dy1dy1m68iyi40.R.iget(18077)==0&false))) {{
            __CLR4_5_2dy1dy1m68iyi40.R.inc(18078);if ((((previousValue == null || !previousValue.equals(value))&&(__CLR4_5_2dy1dy1m68iyi40.R.iget(18079)!=0|true))||(__CLR4_5_2dy1dy1m68iyi40.R.iget(18080)==0&false))) {{
                __CLR4_5_2dy1dy1m68iyi40.R.inc(18081);unRetrievedContentDictionary.put(key, value);
            }
        }}
        }__CLR4_5_2dy1dy1m68iyi40.R.inc(18082);return previousValue;
    }finally{__CLR4_5_2dy1dy1m68iyi40.R.flushNeeded();}}

    public void putAll(Map m) {try{__CLR4_5_2dy1dy1m68iyi40.R.inc(18083);
        __CLR4_5_2dy1dy1m68iyi40.R.inc(18084);for (Object x : m.entrySet()) {{
            __CLR4_5_2dy1dy1m68iyi40.R.inc(18085);Map.Entry e = (Map.Entry) x;
            __CLR4_5_2dy1dy1m68iyi40.R.inc(18086);put(e.getKey(), e.getValue());
        }
    }}finally{__CLR4_5_2dy1dy1m68iyi40.R.flushNeeded();}}

    /**
     * @see java.util.Map#clear()
     */
    public void clear() {try{__CLR4_5_2dy1dy1m68iyi40.R.inc(18087);
        __CLR4_5_2dy1dy1m68iyi40.R.inc(18088);super.clear();
        __CLR4_5_2dy1dy1m68iyi40.R.inc(18089);if ((((unRetrievedContentDictionary != null)&&(__CLR4_5_2dy1dy1m68iyi40.R.iget(18090)!=0|true))||(__CLR4_5_2dy1dy1m68iyi40.R.iget(18091)==0&false))) {{
            __CLR4_5_2dy1dy1m68iyi40.R.inc(18092);unRetrievedContentDictionary.clear();
        }
    }}finally{__CLR4_5_2dy1dy1m68iyi40.R.flushNeeded();}}

    /**
     * Returns <tt>true</tt> if this map contains no key-value mappings.
     *
     * @return <tt>true</tt> if this map contains no key-value mappings.
     */
    public boolean isEmpty() {try{__CLR4_5_2dy1dy1m68iyi40.R.inc(18093);
        __CLR4_5_2dy1dy1m68iyi40.R.inc(18094);if ((((flushOnRetrieval)&&(__CLR4_5_2dy1dy1m68iyi40.R.iget(18095)!=0|true))||(__CLR4_5_2dy1dy1m68iyi40.R.iget(18096)==0&false))) {{
            __CLR4_5_2dy1dy1m68iyi40.R.inc(18097);return unRetrievedContentDictionary.isEmpty();
        }
        }__CLR4_5_2dy1dy1m68iyi40.R.inc(18098);return super.isEmpty();
    }finally{__CLR4_5_2dy1dy1m68iyi40.R.flushNeeded();}}

    /**
     * The contents of the dictionary are flushed when written
     * @param flushOnRetrieval boolean value
     */
    public void setFlushOnRetrieval(boolean flushOnRetrieval) {try{__CLR4_5_2dy1dy1m68iyi40.R.inc(18099);
        __CLR4_5_2dy1dy1m68iyi40.R.inc(18100);this.flushOnRetrieval = flushOnRetrieval;
        __CLR4_5_2dy1dy1m68iyi40.R.inc(18101);if ((((flushOnRetrieval)&&(__CLR4_5_2dy1dy1m68iyi40.R.iget(18102)!=0|true))||(__CLR4_5_2dy1dy1m68iyi40.R.iget(18103)==0&false))) {{
            __CLR4_5_2dy1dy1m68iyi40.R.inc(18104);unRetrievedContentDictionary = new PSDictionary();
        }
    }}finally{__CLR4_5_2dy1dy1m68iyi40.R.flushNeeded();}}

    /**
     * Returns a dictionary string with containing all unwritten content note:
     * unnecessary writes are important as there is a device specific
     * initgraphics call by the underlying postscript interpreter on every
     * setpagedevice call which can result in blank pages etc.
     *
     * @return unwritten content dictionary string
     */
    public String getContent() {try{__CLR4_5_2dy1dy1m68iyi40.R.inc(18105);
        __CLR4_5_2dy1dy1m68iyi40.R.inc(18106);String content;
        __CLR4_5_2dy1dy1m68iyi40.R.inc(18107);if ((((flushOnRetrieval)&&(__CLR4_5_2dy1dy1m68iyi40.R.iget(18108)!=0|true))||(__CLR4_5_2dy1dy1m68iyi40.R.iget(18109)==0&false))) {{
            __CLR4_5_2dy1dy1m68iyi40.R.inc(18110);content = unRetrievedContentDictionary.toString();
            __CLR4_5_2dy1dy1m68iyi40.R.inc(18111);unRetrievedContentDictionary.clear();
        } }else {{
            __CLR4_5_2dy1dy1m68iyi40.R.inc(18112);content = super.toString();
        }
        }__CLR4_5_2dy1dy1m68iyi40.R.inc(18113);return content;
    }finally{__CLR4_5_2dy1dy1m68iyi40.R.flushNeeded();}}
}
