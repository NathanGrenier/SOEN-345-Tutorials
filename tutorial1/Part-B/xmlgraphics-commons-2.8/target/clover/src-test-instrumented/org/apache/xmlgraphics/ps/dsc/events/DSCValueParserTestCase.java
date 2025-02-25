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

/* $Id: DSCValueParserTestCase.java 1365650 2012-07-25 15:59:30Z mehdi $ */

package org.apache.xmlgraphics.ps.dsc.events;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DSCValueParserTestCase {static class __CLR4_5_2j58j58m6lb529x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,24843,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String[] toArray(List params) {try{__CLR4_5_2j58j58m6lb529x.R.inc(24812);
        __CLR4_5_2j58j58m6lb529x.R.inc(24813);return (String[]) params.toArray(new String[params.size()]);
    }finally{__CLR4_5_2j58j58m6lb529x.R.flushNeeded();}}

    @Test
    public void testText() throws Exception {__CLR4_5_2j58j58m6lb529x.R.globalSliceStart(getClass().getName(),24814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ana4hyj5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j58j58m6lb529x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j58j58m6lb529x.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.dsc.events.DSCValueParserTestCase.testText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ana4hyj5a() throws Exception{try{__CLR4_5_2j58j58m6lb529x.R.inc(24814);
        __CLR4_5_2j58j58m6lb529x.R.inc(24815);DSCCommentBeginResource obj = new DSCCommentBeginResource();
        __CLR4_5_2j58j58m6lb529x.R.inc(24816);String[] res = toArray(obj.splitParams("procset Test"));
        __CLR4_5_2j58j58m6lb529x.R.inc(24817);assertEquals(2, res.length);
        __CLR4_5_2j58j58m6lb529x.R.inc(24818);assertEquals("procset", res[0]);
        __CLR4_5_2j58j58m6lb529x.R.inc(24819);assertEquals("Test", res[1]);

        __CLR4_5_2j58j58m6lb529x.R.inc(24820);res = toArray(obj.splitParams("procset\tTest"));
        __CLR4_5_2j58j58m6lb529x.R.inc(24821);assertEquals(2, res.length);
        __CLR4_5_2j58j58m6lb529x.R.inc(24822);assertEquals("procset", res[0]);
        __CLR4_5_2j58j58m6lb529x.R.inc(24823);assertEquals("Test", res[1]);
    }finally{__CLR4_5_2j58j58m6lb529x.R.flushNeeded();}}

    @Test
    public void testParentheseText() throws Exception {__CLR4_5_2j58j58m6lb529x.R.globalSliceStart(getClass().getName(),24824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l3603jj5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j58j58m6lb529x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j58j58m6lb529x.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.dsc.events.DSCValueParserTestCase.testParentheseText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24824,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l3603jj5k() throws Exception{try{__CLR4_5_2j58j58m6lb529x.R.inc(24824);
        __CLR4_5_2j58j58m6lb529x.R.inc(24825);DSCCommentBeginResource obj = new DSCCommentBeginResource();
        __CLR4_5_2j58j58m6lb529x.R.inc(24826);String[] res = toArray(obj.splitParams("procset (Hello World!)"));
        __CLR4_5_2j58j58m6lb529x.R.inc(24827);assertEquals(2, res.length);
        __CLR4_5_2j58j58m6lb529x.R.inc(24828);assertEquals("procset", res[0]);
        __CLR4_5_2j58j58m6lb529x.R.inc(24829);assertEquals("Hello World!", res[1]);

        __CLR4_5_2j58j58m6lb529x.R.inc(24830);res = toArray(obj.splitParams("procset\t(Hello\t\\\\wonderful/ World!)"));
        __CLR4_5_2j58j58m6lb529x.R.inc(24831);assertEquals(2, res.length);
        __CLR4_5_2j58j58m6lb529x.R.inc(24832);assertEquals("procset", res[0]);
        __CLR4_5_2j58j58m6lb529x.R.inc(24833);assertEquals("Hello\t\\wonderful/ World!", res[1]);

        __CLR4_5_2j58j58m6lb529x.R.inc(24834);res = toArray(obj.splitParams("procset (Hello \\042wonderful\\042 World!) blahblah"));
        __CLR4_5_2j58j58m6lb529x.R.inc(24835);assertEquals(3, res.length);
        __CLR4_5_2j58j58m6lb529x.R.inc(24836);assertEquals("procset", res[0]);
        __CLR4_5_2j58j58m6lb529x.R.inc(24837);assertEquals("Hello \"wonderful\" World!", res[1]);
        __CLR4_5_2j58j58m6lb529x.R.inc(24838);assertEquals("blahblah", res[2]);

        //Parentheses not balanced
        __CLR4_5_2j58j58m6lb529x.R.inc(24839);res = toArray(obj.splitParams("procset (Hello (wonderful) World! blahblah"));
        __CLR4_5_2j58j58m6lb529x.R.inc(24840);assertEquals(2, res.length);
        __CLR4_5_2j58j58m6lb529x.R.inc(24841);assertEquals("procset", res[0]);
        __CLR4_5_2j58j58m6lb529x.R.inc(24842);assertEquals("Hello (wonderful) World! blahblah", res[1]);
    }finally{__CLR4_5_2j58j58m6lb529x.R.flushNeeded();}}

}
