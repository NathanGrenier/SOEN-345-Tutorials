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

/* $Id: DSCParserTestCase.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.ps.dsc;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public class DSCParserTestCase {static class __CLR4_5_2j2qj2qm6lb5296{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,24737,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String correctDSC
            = "%!PS-Adobe-3.0\n"
            + "%%LanguageLevel: 3\n"
            + "%%EOF";

    private final String spuriousContentAfterEOF
            = "%!PS-Adobe-3.0\n"
            + "%%LanguageLevel: 3\n"
            + "%%EOF\n"
            + "%%SpuriousContent";

    @Test
    public void eofDetectedWhenCheckEOFEnabled() throws Exception {__CLR4_5_2j2qj2qm6lb5296.R.globalSliceStart(getClass().getName(),24722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a4zl24j2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j2qj2qm6lb5296.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j2qj2qm6lb5296.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.dsc.DSCParserTestCase.eofDetectedWhenCheckEOFEnabled",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a4zl24j2q() throws Exception{try{__CLR4_5_2j2qj2qm6lb5296.R.inc(24722);
        __CLR4_5_2j2qj2qm6lb5296.R.inc(24723);parseDSC(correctDSC, true);
    }finally{__CLR4_5_2j2qj2qm6lb5296.R.flushNeeded();}}

    @Test
    public void eofDetectedWhenCheckEOFDisabled() throws Exception {__CLR4_5_2j2qj2qm6lb5296.R.globalSliceStart(getClass().getName(),24724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uzr9rj2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j2qj2qm6lb5296.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j2qj2qm6lb5296.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.dsc.DSCParserTestCase.eofDetectedWhenCheckEOFDisabled",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24724,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uzr9rj2s() throws Exception{try{__CLR4_5_2j2qj2qm6lb5296.R.inc(24724);
        __CLR4_5_2j2qj2qm6lb5296.R.inc(24725);parseDSC(correctDSC, false);
    }finally{__CLR4_5_2j2qj2qm6lb5296.R.flushNeeded();}}

    @Test(expected = DSCException.class)
    public void spuriousContentDetected() throws Exception {__CLR4_5_2j2qj2qm6lb5296.R.globalSliceStart(getClass().getName(),24726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2evx8j2u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,112,117,114,105,111,117,115,67,111,110,116,101,110,116,68,101,116,101,99,116,101,100,58,32,91,68,83,67,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DSCException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j2qj2qm6lb5296.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j2qj2qm6lb5296.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.dsc.DSCParserTestCase.spuriousContentDetected",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24726,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2evx8j2u() throws Exception{try{__CLR4_5_2j2qj2qm6lb5296.R.inc(24726);
        __CLR4_5_2j2qj2qm6lb5296.R.inc(24727);parseDSC(spuriousContentAfterEOF, true);
    }finally{__CLR4_5_2j2qj2qm6lb5296.R.flushNeeded();}}

    @Test
    public void spuriousContentIgnored() throws Exception {__CLR4_5_2j2qj2qm6lb5296.R.globalSliceStart(getClass().getName(),24728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pmk1k2j2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j2qj2qm6lb5296.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j2qj2qm6lb5296.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.dsc.DSCParserTestCase.spuriousContentIgnored",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pmk1k2j2w() throws Exception{try{__CLR4_5_2j2qj2qm6lb5296.R.inc(24728);
        __CLR4_5_2j2qj2qm6lb5296.R.inc(24729);parseDSC(spuriousContentAfterEOF, false);
    }finally{__CLR4_5_2j2qj2qm6lb5296.R.flushNeeded();}}

    private void parseDSC(String dsc, boolean checkEOF) throws Exception {try{__CLR4_5_2j2qj2qm6lb5296.R.inc(24730);
        __CLR4_5_2j2qj2qm6lb5296.R.inc(24731);DSCParser parser = new DSCParser(new ByteArrayInputStream(dsc.getBytes("US-ASCII")));
        __CLR4_5_2j2qj2qm6lb5296.R.inc(24732);parser.setCheckEOF(checkEOF);
        __CLR4_5_2j2qj2qm6lb5296.R.inc(24733);while ((((parser.hasNext())&&(__CLR4_5_2j2qj2qm6lb5296.R.iget(24734)!=0|true))||(__CLR4_5_2j2qj2qm6lb5296.R.iget(24735)==0&false))) {{
            __CLR4_5_2j2qj2qm6lb5296.R.inc(24736);parser.next();
        }
    }}finally{__CLR4_5_2j2qj2qm6lb5296.R.flushNeeded();}}

}
