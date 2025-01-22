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

/* $Id: ColorWithAlternativesTestCase.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.java2d.color;

import java.awt.Color;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests the {@link ColorWithAlternatives} class.
 */
public class ColorWithAlternativesTestCase {static class __CLR4_5_2itjitjm68iyj5u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,24411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testEquals() throws Exception {__CLR4_5_2itjitjm68iyj5u.R.globalSliceStart(getClass().getName(),24391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e608itj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2itjitjm68iyj5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_2itjitjm68iyj5u.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.color.ColorWithAlternativesTestCase.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24391,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e608itj() throws Exception{try{__CLR4_5_2itjitjm68iyj5u.R.inc(24391);
        __CLR4_5_2itjitjm68iyj5u.R.inc(24392);Color col1 = new ColorWithAlternatives(255, 204, 0, null);
        __CLR4_5_2itjitjm68iyj5u.R.inc(24393);Color col2 = new Color(255, 204, 0);

        __CLR4_5_2itjitjm68iyj5u.R.inc(24394);assertEquals(col1, col2);
        __CLR4_5_2itjitjm68iyj5u.R.inc(24395);assertEquals(col2, col1);

        __CLR4_5_2itjitjm68iyj5u.R.inc(24396);CIELabColorSpace lab = ColorSpaces.getCIELabColorSpaceD50();
        __CLR4_5_2itjitjm68iyj5u.R.inc(24397);Color postgelbLab = lab.toColor(83.25f, 16.45f, 96.89f, 1.0f);
        __CLR4_5_2itjitjm68iyj5u.R.inc(24398);col1 = new ColorWithAlternatives(255, 204, 0, new Color[] {postgelbLab});

        //java.awt.Color tests on the sRGB value only
        __CLR4_5_2itjitjm68iyj5u.R.inc(24399);assertEquals(col1, col2);
        __CLR4_5_2itjitjm68iyj5u.R.inc(24400);assertEquals(col2, col1);
    }finally{__CLR4_5_2itjitjm68iyj5u.R.flushNeeded();}}

    @Test
    public void testSameColor() throws Exception {__CLR4_5_2itjitjm68iyj5u.R.globalSliceStart(getClass().getName(),24401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27obciaitt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2itjitjm68iyj5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_2itjitjm68iyj5u.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.color.ColorWithAlternativesTestCase.testSameColor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27obciaitt() throws Exception{try{__CLR4_5_2itjitjm68iyj5u.R.inc(24401);
        __CLR4_5_2itjitjm68iyj5u.R.inc(24402);Color col1 = new ColorWithAlternatives(255, 204, 0, null);
        __CLR4_5_2itjitjm68iyj5u.R.inc(24403);Color col2 = new Color(255, 204, 0);

        //No alternatives. Only sRGB counts.
        __CLR4_5_2itjitjm68iyj5u.R.inc(24404);assertTrue(ColorUtil.isSameColor(col1, col2));

        __CLR4_5_2itjitjm68iyj5u.R.inc(24405);CIELabColorSpace lab = ColorSpaces.getCIELabColorSpaceD50();
        __CLR4_5_2itjitjm68iyj5u.R.inc(24406);Color postgelbLab = lab.toColor(83.25f, 16.45f, 96.89f, 1.0f);
        __CLR4_5_2itjitjm68iyj5u.R.inc(24407);col1 = new ColorWithAlternatives(255, 204, 0, new Color[] {postgelbLab});

        //Same sRGB value but one color with alternatives:
        __CLR4_5_2itjitjm68iyj5u.R.inc(24408);assertFalse(ColorUtil.isSameColor(col1, col2));

        //Once the spotcolor naked and once as part of a color with alternatives
        __CLR4_5_2itjitjm68iyj5u.R.inc(24409);assertFalse(ColorUtil.isSameColor(postgelbLab, col1));

        //sRGB values is calculated from Lab color and doesn't exactly match the selected fallback
        __CLR4_5_2itjitjm68iyj5u.R.inc(24410);assertFalse(postgelbLab.equals(col1));
    }finally{__CLR4_5_2itjitjm68iyj5u.R.flushNeeded();}}
}
