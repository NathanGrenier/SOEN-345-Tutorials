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

/* $Id: ASCII85InputStreamTestCase.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.util.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;

import org.apache.xmlgraphics.util.HexUtil;

/**
 * Test case for ASCII85InputStream.
 * <p>
 * ATTENTION: Some of the tests here depend on the correct behaviour of
 * ASCII85OutputStream. If something fails here make sure
 * ASCII85OutputStreamTestCase runs!
 */
public class ASCII85InputStreamTestCase {static class __CLR4_5_2jmejmem68iyjc0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,25511,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final boolean DEBUG = false;

    private byte[] decode(String text) throws Exception {try{__CLR4_5_2jmejmem68iyjc0.R.inc(25430);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25431);byte[] ascii85 = text.getBytes("US-ASCII");
        __CLR4_5_2jmejmem68iyjc0.R.inc(25432);InputStream in = new ByteArrayInputStream(ascii85);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25433);InputStream decoder = new ASCII85InputStream(in);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25434);return IOUtils.toByteArray(decoder);
    }finally{__CLR4_5_2jmejmem68iyjc0.R.flushNeeded();}}

    private byte[] getChunk(int count) {try{__CLR4_5_2jmejmem68iyjc0.R.inc(25435);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25436);byte[] buf = new byte[count];
        __CLR4_5_2jmejmem68iyjc0.R.inc(25437);System.arraycopy(ASCII85OutputStreamTestCase.DATA, 0, buf, 0, buf.length);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25438);return buf;
    }finally{__CLR4_5_2jmejmem68iyjc0.R.flushNeeded();}}

    private String encode(byte[] data, int len) throws Exception {try{__CLR4_5_2jmejmem68iyjc0.R.inc(25439);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25440);ByteArrayOutputStream baout = new ByteArrayOutputStream();
        __CLR4_5_2jmejmem68iyjc0.R.inc(25441);java.io.OutputStream out = new ASCII85OutputStream(baout);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25442);out.write(data, 0, len);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25443);out.close();
        __CLR4_5_2jmejmem68iyjc0.R.inc(25444);return new String(baout.toByteArray(), "US-ASCII");
    }finally{__CLR4_5_2jmejmem68iyjc0.R.flushNeeded();}}


    private void innerTestDecode(byte[] data) throws Exception {try{__CLR4_5_2jmejmem68iyjc0.R.inc(25445);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25446);String encoded = encode(data, data.length);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25447);if ((((DEBUG)&&(__CLR4_5_2jmejmem68iyjc0.R.iget(25448)!=0|true))||(__CLR4_5_2jmejmem68iyjc0.R.iget(25449)==0&false))) {{
            __CLR4_5_2jmejmem68iyjc0.R.inc(25450);if ((((data[0] == 0)&&(__CLR4_5_2jmejmem68iyjc0.R.iget(25451)!=0|true))||(__CLR4_5_2jmejmem68iyjc0.R.iget(25452)==0&false))) {{
                __CLR4_5_2jmejmem68iyjc0.R.inc(25453);System.out.println("self-encode: " + data.length + " chunk 000102030405...");
            } }else {{
                __CLR4_5_2jmejmem68iyjc0.R.inc(25454);System.out.println("self-encode: " + new String(data, "US-ASCII")
                    + " " + HexUtil.toHex(data));
            }
            }__CLR4_5_2jmejmem68iyjc0.R.inc(25455);System.out.println("  ---> " + encoded);
        }
        }__CLR4_5_2jmejmem68iyjc0.R.inc(25456);byte[] decoded = decode(encoded);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25457);if ((((DEBUG)&&(__CLR4_5_2jmejmem68iyjc0.R.iget(25458)!=0|true))||(__CLR4_5_2jmejmem68iyjc0.R.iget(25459)==0&false))) {{
            __CLR4_5_2jmejmem68iyjc0.R.inc(25460);if ((((data[0] == 0)&&(__CLR4_5_2jmejmem68iyjc0.R.iget(25461)!=0|true))||(__CLR4_5_2jmejmem68iyjc0.R.iget(25462)==0&false))) {{
                __CLR4_5_2jmejmem68iyjc0.R.inc(25463);System.out.println("decoded: " + data.length + " chunk 000102030405...");
            } }else {{
                __CLR4_5_2jmejmem68iyjc0.R.inc(25464);System.out.println("decoded: " + new String(decoded, "US-ASCII")
                    + " " + HexUtil.toHex(decoded));
            }
        }}
        }__CLR4_5_2jmejmem68iyjc0.R.inc(25465);assertEquals(HexUtil.toHex(data), HexUtil.toHex(decoded));
    }finally{__CLR4_5_2jmejmem68iyjc0.R.flushNeeded();}}

    /**
     * Tests the output of ASCII85.
     * @throws Exception if an error occurs
     */
    @Test
    public void testDecode() throws Exception {__CLR4_5_2jmejmem68iyjc0.R.globalSliceStart(getClass().getName(),25466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jmejmem68iyjc0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jmejmem68iyjc0.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.io.ASCII85InputStreamTestCase.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjne() throws Exception{try{__CLR4_5_2jmejmem68iyjc0.R.inc(25466);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25467);innerTestDecode("1. Bodypart".getBytes("US-ASCII"));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25468);if ((((DEBUG)&&(__CLR4_5_2jmejmem68iyjc0.R.iget(25469)!=0|true))||(__CLR4_5_2jmejmem68iyjc0.R.iget(25470)==0&false))) {{
            __CLR4_5_2jmejmem68iyjc0.R.inc(25471);System.out.println("===========================================");
        }

        }__CLR4_5_2jmejmem68iyjc0.R.inc(25472);innerTestDecode(getChunk(1));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25473);innerTestDecode(getChunk(2));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25474);innerTestDecode(getChunk(3));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25475);innerTestDecode(getChunk(4));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25476);innerTestDecode(getChunk(5));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25477);if ((((DEBUG)&&(__CLR4_5_2jmejmem68iyjc0.R.iget(25478)!=0|true))||(__CLR4_5_2jmejmem68iyjc0.R.iget(25479)==0&false))) {{
            __CLR4_5_2jmejmem68iyjc0.R.inc(25480);System.out.println("===========================================");
        }

        }__CLR4_5_2jmejmem68iyjc0.R.inc(25481);innerTestDecode(getChunk(10));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25482);innerTestDecode(getChunk(62));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25483);innerTestDecode(getChunk(63));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25484);innerTestDecode(getChunk(64));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25485);innerTestDecode(getChunk(65));

        __CLR4_5_2jmejmem68iyjc0.R.inc(25486);if ((((DEBUG)&&(__CLR4_5_2jmejmem68iyjc0.R.iget(25487)!=0|true))||(__CLR4_5_2jmejmem68iyjc0.R.iget(25488)==0&false))) {{
            __CLR4_5_2jmejmem68iyjc0.R.inc(25489);System.out.println("===========================================");
        }
        }__CLR4_5_2jmejmem68iyjc0.R.inc(25490);String sz;
        __CLR4_5_2jmejmem68iyjc0.R.inc(25491);sz = HexUtil.toHex(decode("zz~>"));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25492);assertEquals(HexUtil.toHex(new byte[] {0, 0, 0, 0, 0, 0, 0, 0}), sz);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25493);sz = HexUtil.toHex(decode("z\t \0z\n~>"));
        __CLR4_5_2jmejmem68iyjc0.R.inc(25494);assertEquals(HexUtil.toHex(new byte[] {0, 0, 0, 0, 0, 0, 0, 0}), sz);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25495);if ((((DEBUG)&&(__CLR4_5_2jmejmem68iyjc0.R.iget(25496)!=0|true))||(__CLR4_5_2jmejmem68iyjc0.R.iget(25497)==0&false))) {{
            __CLR4_5_2jmejmem68iyjc0.R.inc(25498);System.out.println("===========================================");
        }
        }__CLR4_5_2jmejmem68iyjc0.R.inc(25499);try {
            __CLR4_5_2jmejmem68iyjc0.R.inc(25500);decode("vz~>");
            __CLR4_5_2jmejmem68iyjc0.R.inc(25501);fail("Illegal character should be detected");
        } catch (IOException ioe) {
            //expected
        }
        /* DISABLED because of try/catch in InputStream.read(byte[], int, int).
         * Only the exception happening on the first byte in a block is being
         * reported. BUG in JDK???
         *
        try {
            decode("zv~>");
            fail("Illegal character should be detected");
        } catch (IOException ioe) {
            //expected
        }*/
    }finally{__CLR4_5_2jmejmem68iyjc0.R.flushNeeded();}}

    private byte[] getFullASCIIRange() {try{__CLR4_5_2jmejmem68iyjc0.R.inc(25502);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25503);java.io.ByteArrayOutputStream baout = new java.io.ByteArrayOutputStream(256);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25504);for (int i = 254; (((i < 256)&&(__CLR4_5_2jmejmem68iyjc0.R.iget(25505)!=0|true))||(__CLR4_5_2jmejmem68iyjc0.R.iget(25506)==0&false)); i++) {{
            __CLR4_5_2jmejmem68iyjc0.R.inc(25507);baout.write(i);
        }
        }__CLR4_5_2jmejmem68iyjc0.R.inc(25508);return baout.toByteArray();
    }finally{__CLR4_5_2jmejmem68iyjc0.R.flushNeeded();}}

    /**
     * Tests the full 8-bit ASCII range.
     * @throws Exception if an error occurs
     */
    @Test
    public void testFullASCIIRange() throws Exception {__CLR4_5_2jmejmem68iyjc0.R.globalSliceStart(getClass().getName(),25509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eps1ccjol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jmejmem68iyjc0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jmejmem68iyjc0.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.util.io.ASCII85InputStreamTestCase.testFullASCIIRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25509,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eps1ccjol() throws Exception{try{__CLR4_5_2jmejmem68iyjc0.R.inc(25509);
        __CLR4_5_2jmejmem68iyjc0.R.inc(25510);innerTestDecode(getFullASCIIRange());
    }finally{__CLR4_5_2jmejmem68iyjc0.R.flushNeeded();}}

}
