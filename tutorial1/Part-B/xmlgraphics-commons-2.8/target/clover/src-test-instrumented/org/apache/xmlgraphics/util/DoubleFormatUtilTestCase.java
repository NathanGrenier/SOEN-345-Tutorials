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

/* $Id: DoubleFormatUtilTestCase.java 1780540 2017-01-27 11:10:50Z ssteiner $ */

package org.apache.xmlgraphics.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Test class of DoubleFormatUtil
 */
public class DoubleFormatUtilTestCase {static class __CLR4_5_2j88j88m68iyjb2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,25347,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test simple values as specified in the format contract.
     * <p>
     * Note: Some of these tests will fail if formatFast is used.
     */
    @Test
    public void testSimple() {__CLR4_5_2j88j88m68iyjb2.R.globalSliceStart(getClass().getName(),24920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uh9yjj88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j88j88m68iyjb2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j88j88m68iyjb2.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.DoubleFormatUtilTestCase.testSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uh9yjj88(){try{__CLR4_5_2j88j88m68iyjb2.R.inc(24920);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24921);int decimals = 4;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24922);int precision = 8;

        __CLR4_5_2j88j88m68iyjb2.R.inc(24923);double value = 0.0;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24924);String expected = "0";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24925);String actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24926);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24927);value = 0.1;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24928);expected = "0.1";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24929);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24930);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24931);value = 1234.1;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24932);expected = "1234.1";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24933);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24934);assertEquals(value, decimals, precision, expected, actual);

        // rounding
        __CLR4_5_2j88j88m68iyjb2.R.inc(24935);value = 1234.1234567;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24936);expected = "1234.1235";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24937);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24938);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24939);value = 1234.99995;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24940);expected = "1235";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24941);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24942);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24943);value = -1234.99995;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24944);expected = "-1235";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24945);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24946);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24947);value = 1234.99994999;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24948);expected = "1234.9999";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24949);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24950);assertEquals(value, decimals, precision, expected, actual);

        // decimals / precision switch
        __CLR4_5_2j88j88m68iyjb2.R.inc(24951);value = 0.00000001;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24952);expected = "0.00000001";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24953);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24954);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24955);value = -0.00000001;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24956);expected = "-0.00000001";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24957);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24958);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24959);value = 72.00001234;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24960);expected = "72";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24961);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24962);assertEquals(value, decimals, precision, expected, actual);

        // limit precision
        __CLR4_5_2j88j88m68iyjb2.R.inc(24963);value = 0.000000001;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24964);expected = "0";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24965);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24966);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24967);value = 5.0e-9;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24968);expected = "0.00000001";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24969);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24970);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24971);value = 4.9999999999e-9;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24972);expected = "0";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24973);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24974);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24975);value = 2.0005e-5;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24976);expected = "0.00002001";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24977);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24978);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24979);value = 2.00049999999999e-5;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24980);expected = "0.00002";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24981);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24982);assertEquals(value, decimals, precision, expected, actual);

        // Test added after bug #43940 was reopened
        __CLR4_5_2j88j88m68iyjb2.R.inc(24983);value = 0.005859375;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24984);expected = "0.00585938";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24985);actual = format(value, 8, 8);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24986);assertEquals(value, 8, 8, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24987);value = 5.22534294505995E-4;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24988);expected = "0.000522534294506";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24989);actual = format(value, 17, 17);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24990);assertEquals(value, 17, 17, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24991);value = 4.9E-324;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24992);expected = "0";
        __CLR4_5_2j88j88m68iyjb2.R.inc(24993);actual = format(value, 309, 309);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24994);assertEquals(value, 309, 309, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24995);value = 7.003868765287485E-280;
        __CLR4_5_2j88j88m68iyjb2.R.inc(24996);expected = refFormat(value, 294, 294);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24997);actual = format(value, 294, 294);
        __CLR4_5_2j88j88m68iyjb2.R.inc(24998);assertEquals(value, 294, 294, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(24999);value = 5E-304;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25000);expected = refFormat(value, 303, 303);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25001);actual = format(value, 303, 303);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25002);assertEquals(value, 303, 303, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25003);value = 9.999999999999999E-250;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25004);expected = refFormat(value, 265, 265);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25005);actual = format(value, 265, 265);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25006);assertEquals(value, 265, 265, expected, actual);
    }finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    @Test
    public void testLimits() {__CLR4_5_2j88j88m68iyjb2.R.globalSliceStart(getClass().getName(),25007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gnl1gvjan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j88j88m68iyjb2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j88j88m68iyjb2.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.DoubleFormatUtilTestCase.testLimits",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25007,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gnl1gvjan(){try{__CLR4_5_2j88j88m68iyjb2.R.inc(25007);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25008);int decimals = 19;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25009);int precision = 19;

        __CLR4_5_2j88j88m68iyjb2.R.inc(25010);double value = Double.NaN;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25011);String expected = "NaN";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25012);String actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25013);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25014);value = Double.POSITIVE_INFINITY;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25015);expected = "Infinity";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25016);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25017);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25018);value = Double.NEGATIVE_INFINITY;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25019);expected = "-Infinity";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25020);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25021);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25022);value = 1e-3 + Double.MIN_VALUE;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25023);expected = "0.001";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25024);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25025);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25026);value = 1e-3 - Double.MIN_VALUE;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25027);expected = "0.001";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25028);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25029);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25030);value = 1e-3;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25031);expected = "0.001";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25032);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25033);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25034);value = 0.0010000000000000002; // == Math.nextAfter(1e-3, Double.POSITIVE_INFINITY);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25035);expected = "0.0010000000000000002";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25036);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25037);assertEquals(value, decimals, precision, expected, actual);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25038);expected = "0.001";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25039);actual = format(value, 18, 18);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25040);assertEquals(value, 18, 18, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25041);value = 0.0009999999999999998; // == Math.nextAfter(1e-3, Double.NEGATIVE_INFINITY);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25042);expected = "0.0009999999999999998";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25043);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25044);assertEquals(value, decimals, precision, expected, actual);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25045);expected = "0.001";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25046);actual = format(value, 18, 18);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25047);assertEquals(value, 18, 18, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25048);value = 1e7 + Double.MIN_VALUE;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25049);expected = "10000000";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25050);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25051);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25052);value = 1e7 - Double.MIN_VALUE;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25053);expected = "10000000";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25054);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25055);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25056);value = 1e7;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25057);expected = "10000000";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25058);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25059);assertEquals(value, decimals, precision, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25060);value = 1.0000000000000002E7; // == Math.nextAfter(1e7, Double.POSITIVE_INFINITY);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25061);expected = "10000000.000000002";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25062);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25063);assertEquals(value, decimals, precision, expected, actual);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25064);expected = "10000000";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25065);actual = format(value, 8, 8);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25066);assertEquals(value, 8, 8, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25067);value = 9999999.999999998; // == Math.nextAfter(1e7, Double.NEGATIVE_INFINITY);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25068);expected = "9999999.999999998";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25069);actual = format(value, decimals, precision);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25070);assertEquals(value, decimals, precision, expected, actual);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25071);expected = "10000000";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25072);actual = format(value, 8, 8);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25073);assertEquals(value, 8, 8, expected, actual);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25074);value = 0.000009999999999999997; // Check higher precision
        __CLR4_5_2j88j88m68iyjb2.R.inc(25075);expected = "0.000009999999999999997";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25076);actual = format(value, 21, 21);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25077);assertEquals(value, 21, 21, expected, actual);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25078);expected = "0.00001";
        __CLR4_5_2j88j88m68iyjb2.R.inc(25079);actual = format(value, 20, 20);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25080);assertEquals(value, 20, 20, expected, actual);
    }finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    /**
     * AssertEquals with a more detailed message
     */
    private static void assertEquals(double value, int decimals, int precision, String expected, String actual) {try{__CLR4_5_2j88j88m68iyjb2.R.inc(25081);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25082);assertTrue("value: " + value + ", decimals: " + decimals + ", precision: " + precision,
                expected.equals(actual));
    }finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    /**
     * The buffer used to format
     */
    private StringBuffer buf = new StringBuffer();

    /**
     * Formats using FormatUtil#formatDouble method
     */
    private String format(double value, int decimals, int precision) {try{__CLR4_5_2j88j88m68iyjb2.R.inc(25083);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25084);buf.setLength(0);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25085);DoubleFormatUtil.formatDouble(value, decimals, precision, buf);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25086);return buf.toString();
    }finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    /**
     * Formats using FormatUtil#formatDoublePrecise method
     */
    private String formatPrecise(double value, int decimals, int precision) {try{__CLR4_5_2j88j88m68iyjb2.R.inc(25087);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25088);buf.setLength(0);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25089);DoubleFormatUtil.formatDoublePrecise(value, decimals, precision, buf);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25090);return buf.toString();
    }finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    /**
     * Formats using FormatUtil#formatDoubleFast method
     */
    private String formatFast(double value, int decimals, int precision) {try{__CLR4_5_2j88j88m68iyjb2.R.inc(25091);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25092);buf.setLength(0);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25093);DoubleFormatUtil.formatDoubleFast(value, decimals, precision, buf);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25094);return buf.toString();
    }finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    /**
     * Formats using a BigDecimal. This is the reference (always returns the correct format)
     * whereas DecimalFormat may have some formating errors regarding the last digit.
     */
    private String refFormat(double value, int decimals, int precision) {try{__CLR4_5_2j88j88m68iyjb2.R.inc(25095);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25096);if ((((Double.isNaN(value) || Double.isInfinite(value))&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25097)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25098)==0&false))) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25099);return Double.toString(value);
        }
        }__CLR4_5_2j88j88m68iyjb2.R.inc(25100);buf.setLength(0);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25101);BigDecimal bg = new BigDecimal(Double.toString(value));
        __CLR4_5_2j88j88m68iyjb2.R.inc(25102);int scale = (((Math.abs(value) < 1.0 )&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25103)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25104)==0&false))? precision : decimals;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25105);bg = bg.setScale(scale, RoundingMode.HALF_UP);
        //buf.append(bg.toString()); // Java 1.4
        __CLR4_5_2j88j88m68iyjb2.R.inc(25106);buf.append(bg.toPlainString()); // Java 1.5 and more !
        __CLR4_5_2j88j88m68iyjb2.R.inc(25107);if ((((buf.indexOf(".") >= 0)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25108)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25109)==0&false))) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25110);for (int i = buf.length() - 1; (((i > 1 && buf.charAt(i) == '0')&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25111)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25112)==0&false)); i--) {{
                __CLR4_5_2j88j88m68iyjb2.R.inc(25113);buf.setLength(i);
            }
            }__CLR4_5_2j88j88m68iyjb2.R.inc(25114);if ((((buf.charAt(buf.length() - 1) == '.')&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25115)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25116)==0&false))) {{
                __CLR4_5_2j88j88m68iyjb2.R.inc(25117);buf.setLength(buf.length() - 1);
            }
        }}
        }__CLR4_5_2j88j88m68iyjb2.R.inc(25118);return buf.toString();
    }finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    /**
     * The decimal format used within formatDf method
     */
    private DecimalFormat df = new DecimalFormat("0", new DecimalFormatSymbols(Locale.US));

    /**
     * Formats using DecimalFormat#format method
     */
    private String formatDf(double value, int decimals, int precision) {try{__CLR4_5_2j88j88m68iyjb2.R.inc(25119);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25120);int scale = (((Math.abs(value) < 1.0 )&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25121)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25122)==0&false))? precision : decimals;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25123);df.setMaximumFractionDigits(scale);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25124);return df.format(value);
    }finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    /**
     * The maximum power of ten to use when testing high values double
     */
    private static final int MAX_POW = 12;

    /**
     * Tests the formatPrecise method against the reference, with random values
     */
    @Test
    public void testPrecise() {__CLR4_5_2j88j88m68iyjb2.R.globalSliceStart(getClass().getName(),25125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22np3sgjdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j88j88m68iyjb2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j88j88m68iyjb2.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.DoubleFormatUtilTestCase.testPrecise",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22np3sgjdx(){try{__CLR4_5_2j88j88m68iyjb2.R.inc(25125);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25126);long seed = System.currentTimeMillis();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25127);Random r = new Random();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25128);r.setSeed(seed);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25129);double value;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25130);double highValue;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25131);double lowValue;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25132);int nbTest = 10000;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25133);int maxDecimals = 12;

        __CLR4_5_2j88j88m68iyjb2.R.inc(25134);String actual;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25135);String expected;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25136);for (int i = nbTest; (((i > 0)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25137)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25138)==0&false)); i--) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25139);int decimals = r.nextInt(maxDecimals);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25140);int precision = decimals + 3;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25141);value = 1 + r.nextDouble(); // Use decimals and not precision
            __CLR4_5_2j88j88m68iyjb2.R.inc(25142);expected = refFormat(value, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25143);actual = formatPrecise(value, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25144);assertEquals(value, decimals, precision, expected, actual);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25145);highValue = value * DoubleFormatUtil.tenPow(r.nextInt(MAX_POW));
            __CLR4_5_2j88j88m68iyjb2.R.inc(25146);expected = refFormat(highValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25147);actual = formatPrecise(highValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25148);assertEquals(highValue, decimals, precision, expected, actual);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25149);lowValue = (value - 1) / 1000;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25150);expected = refFormat(lowValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25151);actual = formatPrecise(lowValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25152);assertEquals(lowValue, decimals, precision, expected, actual);
        }
    }}finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    /**
     * Tests the format method against the reference, with random values
     */
    @Test
    public void testFormat() {__CLR4_5_2j88j88m68iyjb2.R.globalSliceStart(getClass().getName(),25153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ezuswjep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j88j88m68iyjb2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j88j88m68iyjb2.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.DoubleFormatUtilTestCase.testFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ezuswjep(){try{__CLR4_5_2j88j88m68iyjb2.R.inc(25153);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25154);long seed = System.currentTimeMillis();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25155);Random r = new Random();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25156);r.setSeed(seed);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25157);double value;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25158);double highValue;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25159);double lowValue;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25160);int nbTest = 10000;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25161);int maxDecimals = 12;

        __CLR4_5_2j88j88m68iyjb2.R.inc(25162);String actual;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25163);String expected;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25164);for (int i = nbTest; (((i > 0)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25165)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25166)==0&false)); i--) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25167);int decimals = r.nextInt(maxDecimals);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25168);int precision = decimals + 3;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25169);value = 1 + r.nextDouble(); // Use decimals and not precision
            __CLR4_5_2j88j88m68iyjb2.R.inc(25170);expected = refFormat(value, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25171);actual = format(value, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25172);assertEquals(value, decimals, precision, expected, actual);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25173);highValue = value * DoubleFormatUtil.tenPow(r.nextInt(MAX_POW));
            __CLR4_5_2j88j88m68iyjb2.R.inc(25174);expected = refFormat(highValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25175);actual = format(highValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25176);assertEquals(highValue, decimals, precision, expected, actual);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25177);lowValue = (value - 1) / 1000;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25178);expected = refFormat(lowValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25179);actual = format(lowValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25180);assertEquals(lowValue, decimals, precision, expected, actual);
        }
    }}finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    /**
     * Tests the formatFast method against the reference, with random values.
     * Disabled since the formatFast method is not accurate.
     */
    @Test
    @Ignore("Disabled since the formatFast method is not accurate.")
    public void fast() {try{__CLR4_5_2j88j88m68iyjb2.R.inc(25181);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25182);long seed = System.currentTimeMillis();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25183);Random r = new Random();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25184);r.setSeed(seed);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25185);double value;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25186);double highValue;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25187);double lowValue;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25188);int nbTest = 10000;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25189);int maxDecimals = 12;

        __CLR4_5_2j88j88m68iyjb2.R.inc(25190);String actual;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25191);String expected;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25192);for (int i = nbTest; (((i > 0)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25193)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25194)==0&false)); i--) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25195);int decimals = r.nextInt(maxDecimals);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25196);int precision = decimals + 3;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25197);value = 1 + r.nextDouble(); // Use decimals and not precision
            __CLR4_5_2j88j88m68iyjb2.R.inc(25198);expected = refFormat(value, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25199);actual = formatFast(value, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25200);assertEquals(value, decimals, precision, expected, actual);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25201);highValue = value * DoubleFormatUtil.tenPow(r.nextInt(MAX_POW));
            __CLR4_5_2j88j88m68iyjb2.R.inc(25202);expected = refFormat(highValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25203);actual = formatFast(highValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25204);System.out.println(expected);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25205);System.out.println(actual);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25206);assertEquals(highValue, decimals, precision, expected, actual);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25207);lowValue = (value - 1) / 1000;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25208);expected = refFormat(lowValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25209);actual = formatFast(lowValue, decimals, precision);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25210);assertEquals(lowValue, decimals, precision, expected, actual);
        }
    }}finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    /**
     * Performance comparison of the differents formatXXX methods,
     * to see which one is the fastest in the same conditions.
     */
    @Test
    @Ignore("Disabled since this doesn't test correctness.")
    public void performanceCompare() {try{__CLR4_5_2j88j88m68iyjb2.R.inc(25211);
        // Rename this method in testPerformanceCompare to run it within JUnit tests
        // This method is quite long (depends of the value of nbTest).
        __CLR4_5_2j88j88m68iyjb2.R.inc(25212);long seed = System.currentTimeMillis();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25213);Random r = new Random();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25214);r.setSeed(seed);

        __CLR4_5_2j88j88m68iyjb2.R.inc(25215);double value;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25216);double highValue;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25217);double lowValue;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25218);long start = System.currentTimeMillis();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25219);int nbTest = 1000000;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25220);int maxDecimals = 16;

        __CLR4_5_2j88j88m68iyjb2.R.inc(25221);r.setSeed(seed);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25222);start = System.currentTimeMillis();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25223);for (int i = nbTest; (((i > 0)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25224)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25225)==0&false)); i--) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25226);int decimals = r.nextInt(maxDecimals);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25227);int precision = decimals + 3;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25228);value = 1 + r.nextDouble(); // Use decimals and not precision
            __CLR4_5_2j88j88m68iyjb2.R.inc(25229);format(value, decimals, precision);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25230);highValue = value * DoubleFormatUtil.tenPow(r.nextInt(MAX_POW));
            __CLR4_5_2j88j88m68iyjb2.R.inc(25231);format(highValue, decimals, precision);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25232);lowValue = (value - 1) / 1000;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25233);format(lowValue, decimals, precision);
        }
        }__CLR4_5_2j88j88m68iyjb2.R.inc(25234);long formatDuration = System.currentTimeMillis() - start;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25235);System.out.println("Format duration: " + formatDuration + "ms to format " + (3 * nbTest) + " doubles");

        __CLR4_5_2j88j88m68iyjb2.R.inc(25236);r.setSeed(seed);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25237);start = System.currentTimeMillis();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25238);for (int i = nbTest; (((i > 0)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25239)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25240)==0&false)); i--) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25241);int decimals = r.nextInt(maxDecimals);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25242);int precision = decimals + 3;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25243);value = 1 + r.nextDouble(); // Use decimals and not precision
            __CLR4_5_2j88j88m68iyjb2.R.inc(25244);formatPrecise(value, decimals, precision);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25245);highValue = value * DoubleFormatUtil.tenPow(r.nextInt(MAX_POW));
            __CLR4_5_2j88j88m68iyjb2.R.inc(25246);formatPrecise(highValue, decimals, precision);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25247);lowValue = (value - 1) / 1000;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25248);formatPrecise(lowValue, decimals, precision);
        }
        }__CLR4_5_2j88j88m68iyjb2.R.inc(25249);long preciseFormatDuration = System.currentTimeMillis() - start;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25250);System.out.println("Format Precise duration: " + preciseFormatDuration
                + "ms to format " + (3 * nbTest) + " doubles");

        __CLR4_5_2j88j88m68iyjb2.R.inc(25251);r.setSeed(seed);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25252);start = System.currentTimeMillis();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25253);for (int i = nbTest; (((i > 0)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25254)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25255)==0&false)); i--) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25256);int decimals = r.nextInt(maxDecimals);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25257);int precision = decimals + 3;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25258);value = 1 + r.nextDouble(); // Use decimals and not precision
            __CLR4_5_2j88j88m68iyjb2.R.inc(25259);formatFast(value, decimals, precision);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25260);highValue = value * DoubleFormatUtil.tenPow(r.nextInt(MAX_POW));
            __CLR4_5_2j88j88m68iyjb2.R.inc(25261);formatFast(highValue, decimals, precision);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25262);lowValue = (value - 1) / 1000;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25263);formatFast(lowValue, decimals, precision);
        }
        }__CLR4_5_2j88j88m68iyjb2.R.inc(25264);long fastFormatDuration = System.currentTimeMillis() - start;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25265);System.out.println("Fast Format duration: " + fastFormatDuration + "ms to format " + (3 * nbTest) + " doubles");

        __CLR4_5_2j88j88m68iyjb2.R.inc(25266);r.setSeed(seed);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25267);start = System.currentTimeMillis();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25268);for (int i = nbTest; (((i > 0)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25269)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25270)==0&false)); i--) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25271);int decimals = r.nextInt(maxDecimals);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25272);int precision = decimals + 3;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25273);value = 1 + r.nextDouble(); // Use decimals and not precision
            __CLR4_5_2j88j88m68iyjb2.R.inc(25274);refFormat(value, decimals, precision);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25275);highValue = value * DoubleFormatUtil.tenPow(r.nextInt(MAX_POW));
            __CLR4_5_2j88j88m68iyjb2.R.inc(25276);refFormat(highValue, decimals, precision);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25277);lowValue = (value - 1) / 1000;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25278);refFormat(lowValue, decimals, precision);
        }
        }__CLR4_5_2j88j88m68iyjb2.R.inc(25279);long bgDuration = System.currentTimeMillis() - start;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25280);System.out.println("BigDecimal format duration: " + bgDuration + "ms to format " + (3 * nbTest) + " doubles");

        __CLR4_5_2j88j88m68iyjb2.R.inc(25281);r.setSeed(seed);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25282);start = System.currentTimeMillis();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25283);for (int i = nbTest; (((i > 0)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25284)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25285)==0&false)); i--) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25286);int decimals = r.nextInt(maxDecimals);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25287);int precision = decimals + 3;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25288);value = 1 + r.nextDouble(); // Use decimals and not precision
            __CLR4_5_2j88j88m68iyjb2.R.inc(25289);formatDf(value, decimals, precision);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25290);highValue = value * DoubleFormatUtil.tenPow(r.nextInt(MAX_POW));
            __CLR4_5_2j88j88m68iyjb2.R.inc(25291);formatDf(highValue, decimals, precision);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25292);lowValue = (value - 1) / 1000;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25293);formatDf(lowValue, decimals, precision);
        }
        }__CLR4_5_2j88j88m68iyjb2.R.inc(25294);long dfDuration = System.currentTimeMillis() - start;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25295);System.out.println("DecimalFormat duration: " + dfDuration + "ms to format " + (3 * nbTest) + " doubles");

        __CLR4_5_2j88j88m68iyjb2.R.inc(25296);r.setSeed(seed);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25297);start = System.currentTimeMillis();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25298);for (int i = nbTest; (((i > 0)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25299)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25300)==0&false)); i--) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25301);int decimals = r.nextInt(maxDecimals);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25302);int precision = decimals + 3;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25303);precision++; // Avoid warning unused local variable
            __CLR4_5_2j88j88m68iyjb2.R.inc(25304);value = 1 + r.nextDouble(); // Use decimals and not precision
            __CLR4_5_2j88j88m68iyjb2.R.inc(25305);Double.toString(value);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25306);highValue = value * DoubleFormatUtil.tenPow(r.nextInt(MAX_POW));
            __CLR4_5_2j88j88m68iyjb2.R.inc(25307);Double.toString(highValue);

            __CLR4_5_2j88j88m68iyjb2.R.inc(25308);lowValue = (value - 1) / 1000;
            __CLR4_5_2j88j88m68iyjb2.R.inc(25309);Double.toString(lowValue);
        }
        }__CLR4_5_2j88j88m68iyjb2.R.inc(25310);long toStringDuration = System.currentTimeMillis() - start;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25311);System.out.println("toString duration: " + toStringDuration + "ms to format " + (3 * nbTest) + " doubles");
    }finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}

    @Test
    public void testAllDoubleRanges() {__CLR4_5_2j88j88m68iyjb2.R.globalSliceStart(getClass().getName(),25312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4mkf1jj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j88j88m68iyjb2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j88j88m68iyjb2.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.DoubleFormatUtilTestCase.testAllDoubleRanges",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25312,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4mkf1jj4(){try{__CLR4_5_2j88j88m68iyjb2.R.inc(25312);
        __CLR4_5_2j88j88m68iyjb2.R.inc(25313);double[] values = {0, 1, 5, 4.9999, 5.0001, 9.9999, 1234567890, 0 /* The last one is random */};
        __CLR4_5_2j88j88m68iyjb2.R.inc(25314);Random r = new Random();
        __CLR4_5_2j88j88m68iyjb2.R.inc(25315);double value;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25316);String expected;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25317);String actual;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25318);int minScale;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25319);int maxScale;
        __CLR4_5_2j88j88m68iyjb2.R.inc(25320);for (int i = -330; (((i <= 315)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25321)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25322)==0&false)); i++) {{
            __CLR4_5_2j88j88m68iyjb2.R.inc(25323);values[values.length - 1] = r.nextDouble();
            __CLR4_5_2j88j88m68iyjb2.R.inc(25324);double pow = Math.pow(10.0, i);
            __CLR4_5_2j88j88m68iyjb2.R.inc(25325);for (double d : values) {{
                __CLR4_5_2j88j88m68iyjb2.R.inc(25326);value = d * pow;
                __CLR4_5_2j88j88m68iyjb2.R.inc(25327);minScale = 1;
                __CLR4_5_2j88j88m68iyjb2.R.inc(25328);maxScale = 350;
                // Reduce scales (unnecessary tests)
                __CLR4_5_2j88j88m68iyjb2.R.inc(25329);if ((((i < -30)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25330)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25331)==0&false))) {{
                    __CLR4_5_2j88j88m68iyjb2.R.inc(25332);minScale = -i - 30;
                    __CLR4_5_2j88j88m68iyjb2.R.inc(25333);maxScale = -i + 30;
                } }else {__CLR4_5_2j88j88m68iyjb2.R.inc(25334);if ((((i <= 0)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25335)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25336)==0&false))) {{
                    __CLR4_5_2j88j88m68iyjb2.R.inc(25337);minScale = 1;
                    __CLR4_5_2j88j88m68iyjb2.R.inc(25338);maxScale = -i + 30;
                } }else {{
                    __CLR4_5_2j88j88m68iyjb2.R.inc(25339);minScale = 1;
                    __CLR4_5_2j88j88m68iyjb2.R.inc(25340);maxScale = 30;
                }
                }}__CLR4_5_2j88j88m68iyjb2.R.inc(25341);for (int scale = minScale; (((scale <= maxScale)&&(__CLR4_5_2j88j88m68iyjb2.R.iget(25342)!=0|true))||(__CLR4_5_2j88j88m68iyjb2.R.iget(25343)==0&false)); scale++) {{
                    __CLR4_5_2j88j88m68iyjb2.R.inc(25344);expected = refFormat(value, scale, scale);
                    __CLR4_5_2j88j88m68iyjb2.R.inc(25345);actual = format(value, scale, scale);
                    __CLR4_5_2j88j88m68iyjb2.R.inc(25346);assertEquals(value, scale, scale, expected, actual);
                }
            }}

        }}
    }}finally{__CLR4_5_2j88j88m68iyjb2.R.flushNeeded();}}
}
