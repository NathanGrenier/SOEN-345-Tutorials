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

/* $Id: ASCII85OutputStreamTestCase.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.util.io;

import java.io.OutputStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.io.output.ByteArrayOutputStream;

/**
 * Test case for ASCII85OutputStream
 */
public class ASCII85OutputStreamTestCase {static class __CLR4_5_2jonjonm6lb52ds{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,25539,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Test data */
    public static final byte[] DATA = new byte[100];

    static {try{__CLR4_5_2jonjonm6lb52ds.R.inc(25511);
        //Fill in some data
        __CLR4_5_2jonjonm6lb52ds.R.inc(25512);for (int i = 0; (((i < 100)&&(__CLR4_5_2jonjonm6lb52ds.R.iget(25513)!=0|true))||(__CLR4_5_2jonjonm6lb52ds.R.iget(25514)==0&false)); i++) {{
            __CLR4_5_2jonjonm6lb52ds.R.inc(25515);DATA[i] = (byte) i;
        }
    }}finally{__CLR4_5_2jonjonm6lb52ds.R.flushNeeded();}}

    private String encode(int count) throws Exception {try{__CLR4_5_2jonjonm6lb52ds.R.inc(25516);
        __CLR4_5_2jonjonm6lb52ds.R.inc(25517);return encode(DATA, count);
    }finally{__CLR4_5_2jonjonm6lb52ds.R.flushNeeded();}}

    private String encode(byte[] data, int len) throws Exception {try{__CLR4_5_2jonjonm6lb52ds.R.inc(25518);
        __CLR4_5_2jonjonm6lb52ds.R.inc(25519);ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_5_2jonjonm6lb52ds.R.inc(25520);OutputStream out = new ASCII85OutputStream(baout);
        __CLR4_5_2jonjonm6lb52ds.R.inc(25521);out.write(data, 0, len);
        __CLR4_5_2jonjonm6lb52ds.R.inc(25522);out.close();
        __CLR4_5_2jonjonm6lb52ds.R.inc(25523);return new String(baout.toByteArray(), "US-ASCII");
    }finally{__CLR4_5_2jonjonm6lb52ds.R.flushNeeded();}}

    /**
     * Tests the output of ASCII85.
     * @throws Exception if an error occurs
     */
    @Test
    public void testOutput() throws Exception {__CLR4_5_2jonjonm6lb52ds.R.globalSliceStart(getClass().getName(),25524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a5q8kmjp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jonjonm6lb52ds.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jonjonm6lb52ds.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.io.ASCII85OutputStreamTestCase.testOutput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25524,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a5q8kmjp0() throws Exception{try{__CLR4_5_2jonjonm6lb52ds.R.inc(25524);
        __CLR4_5_2jonjonm6lb52ds.R.inc(25525);String sz = encode(new byte[] {0, 0, 0, 0, 0, 0, 0, 0}, 8);
        __CLR4_5_2jonjonm6lb52ds.R.inc(25526);assertEquals("zz~>", sz);

        __CLR4_5_2jonjonm6lb52ds.R.inc(25527);String s3 = encode(3);
        //System.out.println(">>>" + s3 + "<<<");
        __CLR4_5_2jonjonm6lb52ds.R.inc(25528);assertEquals("!!*-~>", s3);

        __CLR4_5_2jonjonm6lb52ds.R.inc(25529);String s10 = encode(10);
        //System.out.println(">>>" + s10 + "<<<");
        __CLR4_5_2jonjonm6lb52ds.R.inc(25530);assertEquals("!!*-'\"9eu7#RL~>", s10);

        __CLR4_5_2jonjonm6lb52ds.R.inc(25531);String s62 = encode(62);
        //System.out.println(">>>" + s62 + "<<<");
        __CLR4_5_2jonjonm6lb52ds.R.inc(25532);assertEquals("!!*-'\"9eu7#RLhG$k3[W&.oNg'GVB\"(`=52*$$(B+<_pR,"
            + "UFcb-n-Vr/1iJ-0JP==1c70M3&s#]4?W~>", s62);

        __CLR4_5_2jonjonm6lb52ds.R.inc(25533);String s63 = encode(63);
        //System.out.println(">>>" + s63 + "<<<");
        __CLR4_5_2jonjonm6lb52ds.R.inc(25534);assertEquals("!!*-'\"9eu7#RLhG$k3[W&.oNg'GVB\"(`=52*$$(B+<_pR,"
            + "UFcb-n-Vr/1iJ-0JP==1c70M3&s#]4?Yk\n~>", s63);

        __CLR4_5_2jonjonm6lb52ds.R.inc(25535);String s64 = encode(64);
        //System.out.println(">>>" + s64 + "<<<");
        __CLR4_5_2jonjonm6lb52ds.R.inc(25536);assertEquals("!!*-'\"9eu7#RLhG$k3[W&.oNg'GVB\"(`=52*$$(B+<_pR,"
            + "UFcb-n-Vr/1iJ-0JP==1c70M3&s#]4?Ykm\n~>", s64);

        __CLR4_5_2jonjonm6lb52ds.R.inc(25537);String s65 = encode(65);
        //System.out.println(">>>" + s65 + "<<<");
        __CLR4_5_2jonjonm6lb52ds.R.inc(25538);assertEquals("!!*-'\"9eu7#RLhG$k3[W&.oNg'GVB\"(`=52*$$(B+<_pR,"
            + "UFcb-n-Vr/1iJ-0JP==1c70M3&s#]4?Ykm\n5Q~>", s65);

    }finally{__CLR4_5_2jonjonm6lb52ds.R.flushNeeded();}}

}
