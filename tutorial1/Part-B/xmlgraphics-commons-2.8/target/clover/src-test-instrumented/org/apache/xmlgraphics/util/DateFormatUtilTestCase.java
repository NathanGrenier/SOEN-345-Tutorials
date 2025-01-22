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

/* $Id: DateFormatUtilTestCase.java 1365650 2012-07-25 15:59:30Z mehdi $ */

package org.apache.xmlgraphics.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.apache.xmlgraphics.xmp.XMPSchemaAdapter;

/**
 * Tests date formatting for XMP.
 */
public class DateFormatUtilTestCase {static class __CLR4_5_2j6zj6zm68iyj9c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,24920,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Checks date formatting for XMP.
     * @throws Exception if an error occurs
     */
    @Test
    public void testDateFormattingISO8601() throws Exception {__CLR4_5_2j6zj6zm68iyj9c.R.globalSliceStart(getClass().getName(),24875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0c11ij6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j6zj6zm68iyj9c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j6zj6zm68iyj9c.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.DateFormatUtilTestCase.testDateFormattingISO8601",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24875,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0c11ij6z() throws Exception{try{__CLR4_5_2j6zj6zm68iyj9c.R.inc(24875);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24876);Date dt = createTestDate();

        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24877);String s = XMPSchemaAdapter.formatISO8601Date(dt, TimeZone.getTimeZone("GMT"));
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24878);assertEquals("2008-02-07T15:11:07Z", s);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24879);assertEquals(dt, DateFormatUtil.parseISO8601Date(s));

        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24880);s = XMPSchemaAdapter.formatISO8601Date(dt, TimeZone.getTimeZone("GMT+02:00"));
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24881);assertEquals("2008-02-07T17:11:07+02:00", s);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24882);assertEquals(dt, DateFormatUtil.parseISO8601Date(s));

        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24883);s = XMPSchemaAdapter.formatISO8601Date(dt, TimeZone.getTimeZone("GMT+02:30"));
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24884);assertEquals("2008-02-07T17:41:07+02:30", s);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24885);assertEquals(dt, DateFormatUtil.parseISO8601Date(s));

        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24886);s = XMPSchemaAdapter.formatISO8601Date(dt, TimeZone.getTimeZone("GMT-08:00"));
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24887);assertEquals("2008-02-07T07:11:07-08:00", s);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24888);assertEquals(dt, DateFormatUtil.parseISO8601Date(s));

        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24889);s = XMPSchemaAdapter.formatISO8601Date(dt, TimeZone.getTimeZone("GMT-11:00"));
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24890);assertEquals("2008-02-07T04:11:07-11:00", s);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24891);assertEquals(dt, DateFormatUtil.parseISO8601Date(s));
    }finally{__CLR4_5_2j6zj6zm68iyj9c.R.flushNeeded();}}

    private Date createTestDate() {try{__CLR4_5_2j6zj6zm68iyj9c.R.inc(24892);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24893);Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ENGLISH);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24894);cal.set(2008, Calendar.FEBRUARY, 07, 15, 11, 07);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24895);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24896);Date dt = cal.getTime();
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24897);return dt;
    }finally{__CLR4_5_2j6zj6zm68iyj9c.R.flushNeeded();}}

    @Test
    public void testDateFormattingPDF() throws Exception {__CLR4_5_2j6zj6zm68iyj9c.R.globalSliceStart(getClass().getName(),24898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uwkdccj7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j6zj6zm68iyj9c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j6zj6zm68iyj9c.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.DateFormatUtilTestCase.testDateFormattingPDF",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24898,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uwkdccj7m() throws Exception{try{__CLR4_5_2j6zj6zm68iyj9c.R.inc(24898);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24899);Date dt = createTestDate();

        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24900);String s = DateFormatUtil.formatPDFDate(dt, TimeZone.getTimeZone("GMT"));
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24901);assertEquals("D:20080207151107Z", s);

        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24902);s = DateFormatUtil.formatPDFDate(dt, TimeZone.getTimeZone("GMT+02:00"));
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24903);assertEquals("D:20080207171107+02'00'", s);

        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24904);s = DateFormatUtil.formatPDFDate(dt, TimeZone.getTimeZone("GMT+02:30"));
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24905);assertEquals("D:20080207174107+02'30'", s);

        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24906);s = DateFormatUtil.formatPDFDate(dt, TimeZone.getTimeZone("GMT-08:00"));
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24907);assertEquals("D:20080207071107-08'00'", s);

        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24908);s = DateFormatUtil.formatPDFDate(dt, TimeZone.getTimeZone("GMT-11:00"));
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24909);assertEquals("D:20080207041107-11'00'", s);
    }finally{__CLR4_5_2j6zj6zm68iyj9c.R.flushNeeded();}}

    @Test
    public void testParseInvalidDateNoColonUTC() {__CLR4_5_2j6zj6zm68iyj9c.R.globalSliceStart(getClass().getName(),24910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25vs7blj7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j6zj6zm68iyj9c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j6zj6zm68iyj9c.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.DateFormatUtilTestCase.testParseInvalidDateNoColonUTC",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25vs7blj7y(){try{__CLR4_5_2j6zj6zm68iyj9c.R.inc(24910);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24911);testInvalidDate("2008-02-07T151107Z");
    }finally{__CLR4_5_2j6zj6zm68iyj9c.R.flushNeeded();}}

    @Test
    public void testParseInvalidDateNoColonLocal() {__CLR4_5_2j6zj6zm68iyj9c.R.globalSliceStart(getClass().getName(),24912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p7fjsj80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j6zj6zm68iyj9c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j6zj6zm68iyj9c.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.DateFormatUtilTestCase.testParseInvalidDateNoColonLocal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24912,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p7fjsj80(){try{__CLR4_5_2j6zj6zm68iyj9c.R.inc(24912);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24913);testInvalidDate("2008-02-07T151107+0000");
    }finally{__CLR4_5_2j6zj6zm68iyj9c.R.flushNeeded();}}

    @Test
    public void testParseInvalidDateColonLast() {__CLR4_5_2j6zj6zm68iyj9c.R.globalSliceStart(getClass().getName(),24914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2up5e54j82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j6zj6zm68iyj9c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j6zj6zm68iyj9c.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.DateFormatUtilTestCase.testParseInvalidDateColonLast",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2up5e54j82(){try{__CLR4_5_2j6zj6zm68iyj9c.R.inc(24914);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24915);testInvalidDate("2008-02-07T151107Z:");
    }finally{__CLR4_5_2j6zj6zm68iyj9c.R.flushNeeded();}}

    private void testInvalidDate(String date) {try{__CLR4_5_2j6zj6zm68iyj9c.R.inc(24916);
        __CLR4_5_2j6zj6zm68iyj9c.R.inc(24917);try {
            __CLR4_5_2j6zj6zm68iyj9c.R.inc(24918);DateFormatUtil.parseISO8601Date(date);
            __CLR4_5_2j6zj6zm68iyj9c.R.inc(24919);fail();
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }finally{__CLR4_5_2j6zj6zm68iyj9c.R.flushNeeded();}}
}
