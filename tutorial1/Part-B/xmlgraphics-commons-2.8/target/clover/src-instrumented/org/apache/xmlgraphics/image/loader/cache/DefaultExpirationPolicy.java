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

/* $Id: DefaultExpirationPolicy.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.cache;

/**
 * Implements the default expiration policy for the image cache.
 */
public class DefaultExpirationPolicy implements ExpirationPolicy {public static class __CLR4_5_27cq7cqm68iyh2e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,9543,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final int EXPIRATION_IMMEDIATE = 0;
    public static final int EXPIRATION_NEVER = -1;

    private int expirationAfter; //in seconds

    /**
     * Creates a new policy with default settings (expiration in 60 seconds).
     */
    public DefaultExpirationPolicy() {
        this(60);__CLR4_5_27cq7cqm68iyh2e.R.inc(9531);try{__CLR4_5_27cq7cqm68iyh2e.R.inc(9530);
    }finally{__CLR4_5_27cq7cqm68iyh2e.R.flushNeeded();}}

    /**
     * Creates a new policy.
     * @param expirationAfter the expiration in seconds (a negative value means: never expire)
     */
    public DefaultExpirationPolicy(int expirationAfter) {try{__CLR4_5_27cq7cqm68iyh2e.R.inc(9532);
        __CLR4_5_27cq7cqm68iyh2e.R.inc(9533);this.expirationAfter = expirationAfter;
    }finally{__CLR4_5_27cq7cqm68iyh2e.R.flushNeeded();}}

    private boolean isNeverExpired() {try{__CLR4_5_27cq7cqm68iyh2e.R.inc(9534);
        __CLR4_5_27cq7cqm68iyh2e.R.inc(9535);return (this.expirationAfter < 0);
    }finally{__CLR4_5_27cq7cqm68iyh2e.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isExpired(TimeStampProvider provider, long timestamp) {try{__CLR4_5_27cq7cqm68iyh2e.R.inc(9536);
        __CLR4_5_27cq7cqm68iyh2e.R.inc(9537);if ((((isNeverExpired())&&(__CLR4_5_27cq7cqm68iyh2e.R.iget(9538)!=0|true))||(__CLR4_5_27cq7cqm68iyh2e.R.iget(9539)==0&false))) {{
            __CLR4_5_27cq7cqm68iyh2e.R.inc(9540);return false;
        } }else {{
            __CLR4_5_27cq7cqm68iyh2e.R.inc(9541);long now = provider.getTimeStamp();
            __CLR4_5_27cq7cqm68iyh2e.R.inc(9542);return now >= (timestamp + (this.expirationAfter * 1000L));
        }
    }}finally{__CLR4_5_27cq7cqm68iyh2e.R.flushNeeded();}}

}
