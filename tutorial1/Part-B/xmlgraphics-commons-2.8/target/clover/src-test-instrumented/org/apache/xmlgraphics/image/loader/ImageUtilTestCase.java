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

/* $Id: ImageUtilTestCase.java 1365650 2012-07-25 15:59:30Z mehdi $ */

package org.apache.xmlgraphics.image.loader;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.apache.xmlgraphics.image.loader.util.ImageUtil;

/**
 * Tests for the ImageUtil class.
 */
public class ImageUtilTestCase {static class __CLR4_5_2i2ui2um68iyiyw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,23459,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Tests {@link ImageUtil.needPageIndexFromURI(String)}.
     * @throws Exception if an error occurs
     */
    @Test
    public void testNeedPageIndex() throws Exception {__CLR4_5_2i2ui2um68iyiyw.R.globalSliceStart(getClass().getName(),23430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oa4xdui2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i2ui2um68iyiyw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i2ui2um68iyiyw.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageUtilTestCase.testNeedPageIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23430,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oa4xdui2u() throws Exception{try{__CLR4_5_2i2ui2um68iyiyw.R.inc(23430);
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23431);int pageIndex;

        __CLR4_5_2i2ui2um68iyiyw.R.inc(23432);pageIndex = ImageUtil.needPageIndexFromURI("http://localhost/images/scan1.tif");
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23433);assertEquals(0, pageIndex);
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23434);pageIndex = ImageUtil.needPageIndexFromURI("http://localhost/images/scan1.tif#page=3");
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23435);assertEquals(2, pageIndex);
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23436);pageIndex = ImageUtil.needPageIndexFromURI("http://localhost/images/scan1.tif#page=0");
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23437);assertEquals(0, pageIndex);
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23438);pageIndex = ImageUtil.needPageIndexFromURI("http://localhost/images/scan1.tif#page=");
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23439);assertEquals(0, pageIndex);
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23440);pageIndex = ImageUtil.needPageIndexFromURI("http://localhost/images/scan1.tif#page=x");
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23441);assertEquals(0, pageIndex);
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23442);pageIndex = ImageUtil.needPageIndexFromURI("http://localhost/images/scan1.tif#page=-1");
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23443);assertEquals(0, pageIndex);
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23444);pageIndex = ImageUtil.needPageIndexFromURI("#page=2");
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23445);assertEquals(1, pageIndex);

        //Not a valid URI
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23446);try {
            __CLR4_5_2i2ui2um68iyiyw.R.inc(23447);pageIndex = ImageUtil.needPageIndexFromURI("C:\\images\\scan1.tif#page=44");
            __CLR4_5_2i2ui2um68iyiyw.R.inc(23448);fail("Invalid URI. Method must fail.");
        } catch (IllegalArgumentException e) {
            //expected
        }
        //Valid URI
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23449);pageIndex = ImageUtil.needPageIndexFromURI("file:///C:/images/scan1.tif#page=44");
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23450);assertEquals(43, pageIndex);
    }finally{__CLR4_5_2i2ui2um68iyiyw.R.flushNeeded();}}

    /**
     * Tests {@link ImageUtil.getPageIndexFromURI(String)}.
     * @throws Exception if an error occurs
     */
    @Test
    public void testGetPageIndex() throws Exception {__CLR4_5_2i2ui2um68iyiyw.R.globalSliceStart(getClass().getName(),23451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bc5rdyi3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i2ui2um68iyiyw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i2ui2um68iyiyw.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageUtilTestCase.testGetPageIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bc5rdyi3f() throws Exception{try{__CLR4_5_2i2ui2um68iyiyw.R.inc(23451);
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23452);Integer pageIndex;

        __CLR4_5_2i2ui2um68iyiyw.R.inc(23453);pageIndex = ImageUtil.getPageIndexFromURI("http://localhost/images/scan1.tif");
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23454);assertNull(pageIndex);
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23455);pageIndex = ImageUtil.getPageIndexFromURI("http://localhost/images/scan1.tif#page=3");
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23456);assertEquals(2, pageIndex.intValue());
        //Note: no detailed test anymore as this is tested through needPageIndexFromURI().

        //getPageIndexFromURI only works on URIs, so ignore anything that doesn't have a '#'
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23457);pageIndex = ImageUtil.getPageIndexFromURI("C:\\Temp\\scan1.tif");
        __CLR4_5_2i2ui2um68iyiyw.R.inc(23458);assertNull(pageIndex);
    }finally{__CLR4_5_2i2ui2um68iyiyw.R.flushNeeded();}}

}
