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

/* $Id: ServiceTestCase.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.util;

import java.util.Iterator;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.xmlgraphics.image.writer.ImageWriter;

/**
 * Test for the Service class.
 */
public class ServiceTestCase {static class __CLR4_5_2jkcjkcm6lb52d4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,25420,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Tests the mode where Service returns instances.
     * @throws Exception in case of an error
     */
    @Test
    public void testWithInstances() throws Exception {__CLR4_5_2jkcjkcm6lb52d4.R.globalSliceStart(getClass().getName(),25356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lkbatvjkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jkcjkcm6lb52d4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jkcjkcm6lb52d4.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.ServiceTestCase.testWithInstances",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25356,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lkbatvjkc() throws Exception{try{__CLR4_5_2jkcjkcm6lb52d4.R.inc(25356);
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25357);Class cls = ImageWriter.class;
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25358);boolean found = false;
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25359);Object writer1 = null;
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25360);Object writer2 = null;

        //First run: Find a writer implementation (one of the two must be available)
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25361);Iterator iter = Service.providers(cls);
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25362);while ((((iter.hasNext())&&(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25363)!=0|true))||(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25364)==0&false))) {{
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25365);Object obj = iter.next();
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25366);assertNotNull(obj);
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25367);String className = obj.getClass().getName();
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25368);if (((("org.apache.xmlgraphics.image.writer.internal.PNGImageWriter".equals(className))&&(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25369)!=0|true))||(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25370)==0&false))) {{
                __CLR4_5_2jkcjkcm6lb52d4.R.inc(25371);writer1 = obj;
                __CLR4_5_2jkcjkcm6lb52d4.R.inc(25372);found = true;
                __CLR4_5_2jkcjkcm6lb52d4.R.inc(25373);break;
            } }else {__CLR4_5_2jkcjkcm6lb52d4.R.inc(25374);if (((("org.apache.xmlgraphics.image.writer.imageio.ImageIOPNGImageWriter".equals(
                    className))&&(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25375)!=0|true))||(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25376)==0&false))) {{
                __CLR4_5_2jkcjkcm6lb52d4.R.inc(25377);writer2 = obj;
                __CLR4_5_2jkcjkcm6lb52d4.R.inc(25378);found = true;
                __CLR4_5_2jkcjkcm6lb52d4.R.inc(25379);break;
            }
        }}}
        }__CLR4_5_2jkcjkcm6lb52d4.R.inc(25380);assertTrue("None of the expected classes found", found);

        //Second run: verify that the same instances are returned
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25381);iter = Service.providers(cls);
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25382);while ((((iter.hasNext())&&(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25383)!=0|true))||(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25384)==0&false))) {{
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25385);Object obj = iter.next();
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25386);assertNotNull(obj);
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25387);String className = obj.getClass().getName();
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25388);if (((("org.apache.xmlgraphics.image.writer.internal.PNGImageWriter".equals(className))&&(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25389)!=0|true))||(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25390)==0&false))) {{
                __CLR4_5_2jkcjkcm6lb52d4.R.inc(25391);assertTrue(obj == writer1);
                __CLR4_5_2jkcjkcm6lb52d4.R.inc(25392);break;
            } }else {__CLR4_5_2jkcjkcm6lb52d4.R.inc(25393);if (((("org.apache.xmlgraphics.image.writer.imageio.ImageIOPNGImageWriter".equals(
                    className))&&(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25394)!=0|true))||(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25395)==0&false))) {{
                __CLR4_5_2jkcjkcm6lb52d4.R.inc(25396);assertTrue(obj == writer2);
                __CLR4_5_2jkcjkcm6lb52d4.R.inc(25397);break;
            }
        }}}
    }}finally{__CLR4_5_2jkcjkcm6lb52d4.R.flushNeeded();}}

    /**
     * Tests the mode where Service returns class names.
     * @throws Exception in case of an error
     */
    @Test
    public void testWithClassNames() throws Exception {__CLR4_5_2jkcjkcm6lb52d4.R.globalSliceStart(getClass().getName(),25398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hf9i7ljli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jkcjkcm6lb52d4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jkcjkcm6lb52d4.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.ServiceTestCase.testWithClassNames",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hf9i7ljli() throws Exception{try{__CLR4_5_2jkcjkcm6lb52d4.R.inc(25398);
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25399);Class cls = ImageWriter.class;
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25400);boolean found = true;
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25401);Iterator iter = Service.providerNames(cls);
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25402);while ((((iter.hasNext())&&(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25403)!=0|true))||(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25404)==0&false))) {{
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25405);Object obj = iter.next();
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25406);assertNotNull(obj);
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25407);assertTrue("Returned object must be a class name", obj instanceof String);
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25408);if (((("org.apache.xmlgraphics.image.writer.internal.PNGImageWriter".equals(obj)
                    || ("org.apache.xmlgraphics.image.writer.imageio.ImageIOPNGImageWriter".equals(
                                obj)))&&(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25409)!=0|true))||(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25410)==0&false))) {{
                __CLR4_5_2jkcjkcm6lb52d4.R.inc(25411);found = true;
            }
        }}
        }__CLR4_5_2jkcjkcm6lb52d4.R.inc(25412);assertTrue("None of the expected classes found", found);

        //Do it a second time to make sure the cache works as expected
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25413);iter = Service.providerNames(cls);
        __CLR4_5_2jkcjkcm6lb52d4.R.inc(25414);while ((((iter.hasNext())&&(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25415)!=0|true))||(__CLR4_5_2jkcjkcm6lb52d4.R.iget(25416)==0&false))) {{
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25417);Object obj = iter.next();
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25418);assertNotNull(obj);
            __CLR4_5_2jkcjkcm6lb52d4.R.inc(25419);assertTrue("Returned object must be a class name", obj instanceof String);
        }
    }}finally{__CLR4_5_2jkcjkcm6lb52d4.R.flushNeeded();}}
}
