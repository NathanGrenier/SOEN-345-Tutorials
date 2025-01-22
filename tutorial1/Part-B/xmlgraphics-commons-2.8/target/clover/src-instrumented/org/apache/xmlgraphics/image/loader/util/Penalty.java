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

/* $Id: Penalty.java 1345683 2012-06-03 14:50:33Z gadams $ */

package org.apache.xmlgraphics.image.loader.util;

/**
 * Immutable class representing a penalty value. It's valid value range is that of an
 * {@link Integer}, but giving {@link Integer#MAX_VALUE} a special meaning: it means infinite
 * penalty, i.e. a candidate with this penalty will be excluded from any choice.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class Penalty {public static class __CLR4_5_29u79u7m68iyhjv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,12778,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final Penalty ZERO_PENALTY = new Penalty(0);
    public static final Penalty INFINITE_PENALTY = new Penalty(Integer.MAX_VALUE);

    private final int value;

    /**
     * Turns a penalty value into a penaly object.
     * @param value the penalty value
     * @return the penalty object
     */
    public static Penalty toPenalty(int value) {try{__CLR4_5_29u79u7m68iyhjv.R.inc(12751);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_29u79u7m68iyhjv.R.inc(12752);switch (value) {
        case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_29u79u7m68iyhjv.R.inc(12753);__CLB4_5_2_bool0=true;}
            __CLR4_5_29u79u7m68iyhjv.R.inc(12754);return ZERO_PENALTY;
        case Integer.MAX_VALUE:if (!__CLB4_5_2_bool0) {__CLR4_5_29u79u7m68iyhjv.R.inc(12755);__CLB4_5_2_bool0=true;}
            __CLR4_5_29u79u7m68iyhjv.R.inc(12756);return INFINITE_PENALTY;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_29u79u7m68iyhjv.R.inc(12757);__CLB4_5_2_bool0=true;}
            __CLR4_5_29u79u7m68iyhjv.R.inc(12758);return new Penalty(value);
        }
    }finally{__CLR4_5_29u79u7m68iyhjv.R.flushNeeded();}}

    private Penalty(int value) {try{__CLR4_5_29u79u7m68iyhjv.R.inc(12759);
        __CLR4_5_29u79u7m68iyhjv.R.inc(12760);this.value = value;
    }finally{__CLR4_5_29u79u7m68iyhjv.R.flushNeeded();}}

    /**
     * Adds a penalty to this one and returns the combined penalty.
     * @param value the penalty value to add
     * @return the resulting penalty
     */
    public Penalty add(Penalty value) {try{__CLR4_5_29u79u7m68iyhjv.R.inc(12761);
        __CLR4_5_29u79u7m68iyhjv.R.inc(12762);return add(value.getValue());
    }finally{__CLR4_5_29u79u7m68iyhjv.R.flushNeeded();}}

    /**
     * Adds a penalty to this one and returns the combined penalty.
     * @param value the penalty value to add
     * @return the resulting penalty
     */
    public Penalty add(int value) {try{__CLR4_5_29u79u7m68iyhjv.R.inc(12763);
        __CLR4_5_29u79u7m68iyhjv.R.inc(12764);long p = (long)getValue() + value;
        __CLR4_5_29u79u7m68iyhjv.R.inc(12765);return toPenalty(truncate(p));
    }finally{__CLR4_5_29u79u7m68iyhjv.R.flushNeeded();}}

    /**
     * Returns the penalty value.
     * @return the penalty value
     */
    public int getValue() {try{__CLR4_5_29u79u7m68iyhjv.R.inc(12766);
        __CLR4_5_29u79u7m68iyhjv.R.inc(12767);return this.value;
    }finally{__CLR4_5_29u79u7m68iyhjv.R.flushNeeded();}}

    /**
     * Indicates whether this is an infinite penalty, meaning that a solution with this penalty
     * is effectively ineligible.
     * @return true if this is an infinite penalty
     */
    public boolean isInfinitePenalty() {try{__CLR4_5_29u79u7m68iyhjv.R.inc(12768);
        __CLR4_5_29u79u7m68iyhjv.R.inc(12769);return (value == Integer.MAX_VALUE);
    }finally{__CLR4_5_29u79u7m68iyhjv.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_29u79u7m68iyhjv.R.inc(12770);
        __CLR4_5_29u79u7m68iyhjv.R.inc(12771);return "Penalty: " + ((((isInfinitePenalty() )&&(__CLR4_5_29u79u7m68iyhjv.R.iget(12772)!=0|true))||(__CLR4_5_29u79u7m68iyhjv.R.iget(12773)==0&false))? "INF" : Integer.toString(getValue()));
    }finally{__CLR4_5_29u79u7m68iyhjv.R.flushNeeded();}}

    /**
     * Truncates the long penalty value to an integer without sign side-effects.
     * @param penalty the penalty value as a long
     * @return the penalty value as an int
     */
    public static int truncate(long penalty) {try{__CLR4_5_29u79u7m68iyhjv.R.inc(12774);
        __CLR4_5_29u79u7m68iyhjv.R.inc(12775);penalty = Math.min(Integer.MAX_VALUE, penalty);
        __CLR4_5_29u79u7m68iyhjv.R.inc(12776);penalty = Math.max(Integer.MIN_VALUE, penalty);
        __CLR4_5_29u79u7m68iyhjv.R.inc(12777);return (int)penalty;
    }finally{__CLR4_5_29u79u7m68iyhjv.R.flushNeeded();}}

}
