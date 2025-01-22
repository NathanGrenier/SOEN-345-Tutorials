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

/* $Id: DataURIResolverTestCase.java 1365650 2012-07-25 15:59:30Z mehdi $ */

package org.apache.xmlgraphics.util.uri;

import java.io.ByteArrayInputStream;

import javax.xml.transform.Source;
import javax.xml.transform.URIResolver;
import javax.xml.transform.stream.StreamSource;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.io.IOUtils;

/**
 * Test case for the RFC 2397 data URL/URI resolver.
 */
public class DataURIResolverTestCase {static class __CLR4_5_2jvbjvbm68iyjdg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,25812,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final byte[] TESTDATA = new byte[] {0, 1, 2, 3, 4, 5};

    /**
     * Tests DataURLUtil.
     *
     * @throws Exception
     *             if an error occurs
     */
    @Test
    public void testRFC2397Generator() throws Exception {__CLR4_5_2jvbjvbm68iyjdg.R.globalSliceStart(getClass().getName(),25751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bh14cejvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jvbjvbm68iyjdg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jvbjvbm68iyjdg.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.uri.DataURIResolverTestCase.testRFC2397Generator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25751,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bh14cejvb() throws Exception{try{__CLR4_5_2jvbjvbm68iyjdg.R.inc(25751);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25752);String url = DataURLUtil.createDataURL(new ByteArrayInputStream(
                TESTDATA), null);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25753);assertEquals("Generated data URL is wrong", "data:;base64,AAECAwQF",
                url);

        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25754);url = DataURLUtil.createDataURL(new ByteArrayInputStream(TESTDATA),
                "application/pdf");
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25755);assertEquals("Generated data URL is wrong",
                "data:application/pdf;base64,AAECAwQF", url);
    }finally{__CLR4_5_2jvbjvbm68iyjdg.R.flushNeeded();}}

    /**
     * Test the URIResolver contract if the protocol doesn't match. Resolver
     * must return null in this case.
     *
     * @throws Exception
     *             if an error occurs
     */
    @Test
    public void testNonMatchingContract() throws Exception {__CLR4_5_2jvbjvbm68iyjdg.R.globalSliceStart(getClass().getName(),25756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vf14xdjvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jvbjvbm68iyjdg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jvbjvbm68iyjdg.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.uri.DataURIResolverTestCase.testNonMatchingContract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25756,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vf14xdjvg() throws Exception{try{__CLR4_5_2jvbjvbm68iyjdg.R.inc(25756);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25757);URIResolver resolver = new DataURIResolver();
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25758);Source src;

        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25759);src = resolver.resolve("http://xmlgraphics.apache.org/fop/index.html",
                null);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25760);assertNull(src);

        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25761);src = resolver.resolve("index.html",
                "http://xmlgraphics.apache.org/fop/");
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25762);assertNull(src);
    }finally{__CLR4_5_2jvbjvbm68iyjdg.R.flushNeeded();}}

    private static boolean byteCmp(byte[] src, int srcOffset, byte[] cmp) {try{__CLR4_5_2jvbjvbm68iyjdg.R.inc(25763);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25764);for (int i = 0, c = cmp.length; (((i < c)&&(__CLR4_5_2jvbjvbm68iyjdg.R.iget(25765)!=0|true))||(__CLR4_5_2jvbjvbm68iyjdg.R.iget(25766)==0&false)); i++) {{
            __CLR4_5_2jvbjvbm68iyjdg.R.inc(25767);if ((((src[srcOffset + i] != cmp[i])&&(__CLR4_5_2jvbjvbm68iyjdg.R.iget(25768)!=0|true))||(__CLR4_5_2jvbjvbm68iyjdg.R.iget(25769)==0&false))) {{
                __CLR4_5_2jvbjvbm68iyjdg.R.inc(25770);return false;
            }
        }}
        }__CLR4_5_2jvbjvbm68iyjdg.R.inc(25771);return true;
    }finally{__CLR4_5_2jvbjvbm68iyjdg.R.flushNeeded();}}

    /**
     * Test the DataURIResolver with correct values.
     *
     * @throws Exception
     *             if an error occurs
     */
    @Test
    public void testDataURLHandling() throws Exception {__CLR4_5_2jvbjvbm68iyjdg.R.globalSliceStart(getClass().getName(),25772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn9irljvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jvbjvbm68iyjdg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jvbjvbm68iyjdg.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.uri.DataURIResolverTestCase.testDataURLHandling",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn9irljvw() throws Exception{try{__CLR4_5_2jvbjvbm68iyjdg.R.inc(25772);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25773);URIResolver resolver = new DataURIResolver();
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25774);actualURLHAndlingTest(resolver);
    }finally{__CLR4_5_2jvbjvbm68iyjdg.R.flushNeeded();}}

    static final void actualURLHAndlingTest(URIResolver resolver)
            throws Exception {try{__CLR4_5_2jvbjvbm68iyjdg.R.inc(25775);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25776);Source src;

        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25777);src = resolver.resolve("data:;base64,AAECAwQF", null);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25778);assertNotNull(src);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25779);StreamSource streamSource = (StreamSource) src;
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25780);byte[] data = IOUtils.toByteArray(streamSource.getInputStream());
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25781);assertTrue("Decoded data doesn't match the test data", byteCmp(
                TESTDATA, 0, data));

        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25782);src = resolver
                .resolve(
                        "data:application/octet-stream;interpreter=fop;base64,AAECAwQF",
                        null);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25783);assertNotNull(src);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25784);streamSource = (StreamSource) src;
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25785);assertNotNull(streamSource.getInputStream());
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25786);assertNull(streamSource.getReader());
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25787);data = IOUtils.toByteArray(streamSource.getInputStream());
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25788);assertTrue("Decoded data doesn't match the test data", byteCmp(
                TESTDATA, 0, data));

        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25789);src = resolver.resolve("data:,FOP", null);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25790);assertNotNull(src);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25791);streamSource = (StreamSource) src;
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25792);assertNull(streamSource.getInputStream());
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25793);assertNotNull(streamSource.getReader());
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25794);String text = IOUtils.toString(streamSource.getReader());
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25795);assertEquals("FOP", text);

        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25796);src = resolver.resolve("data:,A%20brief%20note", null);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25797);assertNotNull(src);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25798);streamSource = (StreamSource) src;
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25799);text = IOUtils.toString(streamSource.getReader());
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25800);assertEquals("A brief note", text);

        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25801);src = resolver.resolve("data:text/plain;charset=iso-8859-7,%be%f9%be", null);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25802);assertNotNull(src);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25803);streamSource = (StreamSource) src;
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25804);text = IOUtils.toString(streamSource.getReader());
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25805);assertEquals("\u038e\u03c9\u038e", text);
    }finally{__CLR4_5_2jvbjvbm68iyjdg.R.flushNeeded();}}

    /**
     * Test that the system Id is not null for the resulting stream objects
     * @throws Exception If an error occurs.
     */
    @Test
    public void testSystemIdForNull() throws Exception {__CLR4_5_2jvbjvbm68iyjdg.R.globalSliceStart(getClass().getName(),25806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_216j7p7jwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jvbjvbm68iyjdg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jvbjvbm68iyjdg.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.uri.DataURIResolverTestCase.testSystemIdForNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25806,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_216j7p7jwu() throws Exception{try{__CLR4_5_2jvbjvbm68iyjdg.R.inc(25806);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25807);URIResolver resolver = new DataURIResolver();
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25808);Source source = resolver.resolve("data:;base64,AAECAwQF", null);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25809);assertNotNull(source.getSystemId());

        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25810);source = resolver.resolve("data:text/plain;charset=iso-8859-7,%be%f9%be", null);
        __CLR4_5_2jvbjvbm68iyjdg.R.inc(25811);assertNotNull(source.getSystemId());
    }finally{__CLR4_5_2jvbjvbm68iyjdg.R.flushNeeded();}}
}
