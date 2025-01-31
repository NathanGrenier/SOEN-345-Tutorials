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

/* $Id: PenaltyTestCase.java 1365650 2012-07-25 15:59:30Z mehdi $ */

package org.apache.xmlgraphics.image.loader;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.xmlgraphics.image.loader.util.Penalty;

/**
 * Tests for the {@link Penalty}.
 */
public class PenaltyTestCase {static class __CLR4_5_2i5qi5qm6lb521k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,23559,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Tests for penalty handling.
     * @throws Exception if an error occurs
     */
    @Test
    public void testTruncatePenalty() throws Exception {__CLR4_5_2i5qi5qm6lb521k.R.globalSliceStart(getClass().getName(),23534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bfop6gi5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i5qi5qm6lb521k.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i5qi5qm6lb521k.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.PenaltyTestCase.testTruncatePenalty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bfop6gi5q() throws Exception{try{__CLR4_5_2i5qi5qm6lb521k.R.inc(23534);
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23535);assertEquals(0, Penalty.truncate(0));
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23536);long penalty = Integer.MAX_VALUE;
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23537);assertEquals(Integer.MAX_VALUE, Penalty.truncate(penalty));

        //Force integer wrap-around
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23538);penalty++;
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23539);assertEquals(Integer.MAX_VALUE, Penalty.truncate(penalty));
        //For comparison, normal casting does this
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23540);assertEquals(Integer.MIN_VALUE, (int) penalty);

        //Now on the other end of the spectrum...
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23541);penalty = Integer.MIN_VALUE;
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23542);assertEquals(Integer.MIN_VALUE, Penalty.truncate(penalty));

        //Force integer wrap-around
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23543);penalty -= 500;
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23544);assertEquals(Integer.MIN_VALUE, Penalty.truncate(penalty));
        //For comparison, normal casting does this
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23545);assertEquals(Integer.MAX_VALUE - 499, (int) penalty);
    }finally{__CLR4_5_2i5qi5qm6lb521k.R.flushNeeded();}}

    /**
     * Tests for the {@link Penalty} class.
     * @throws Exception if an error occurs
     */
    @Test
    public void testPenalty() throws Exception {__CLR4_5_2i5qi5qm6lb521k.R.globalSliceStart(getClass().getName(),23546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwcv0ii62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i5qi5qm6lb521k.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i5qi5qm6lb521k.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.PenaltyTestCase.testPenalty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwcv0ii62() throws Exception{try{__CLR4_5_2i5qi5qm6lb521k.R.inc(23546);
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23547);Penalty p1 = Penalty.toPenalty(100);
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23548);assertEquals(100, p1.getValue());
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23549);Penalty p2 = p1.add(Penalty.toPenalty(50));
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23550);assertEquals(150, p2.getValue());

        __CLR4_5_2i5qi5qm6lb521k.R.inc(23551);p1 = Penalty.toPenalty(0);
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23552);assertEquals(0, p1.getValue());

        __CLR4_5_2i5qi5qm6lb521k.R.inc(23553);p1 = Penalty.INFINITE_PENALTY;
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23554);assertEquals(Integer.MAX_VALUE, p1.getValue());
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23555);assertTrue(p1.isInfinitePenalty());
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23556);p2 = p1.add(p2);
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23557);assertEquals(Integer.MAX_VALUE, p2.getValue());
        __CLR4_5_2i5qi5qm6lb521k.R.inc(23558);assertTrue(p2.isInfinitePenalty());
    }finally{__CLR4_5_2i5qi5qm6lb521k.R.flushNeeded();}}

}
