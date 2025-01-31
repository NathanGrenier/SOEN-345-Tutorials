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

/* $Id: RunLengthEncodeOutputStream.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.util.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/**
 * This class applies a RunLengthEncode filter to the stream.
 *
 * @version  $Id: RunLengthEncodeOutputStream.java 1804124 2017-08-04 14:13:54Z ssteiner $
 *
 * Originally authored by Stephen Wolke.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class RunLengthEncodeOutputStream extends FilterOutputStream
            implements Finalizable {public static class __CLR4_5_2g74g74m6lb518a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,21097,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MAX_SEQUENCE_COUNT    = 127;
    private static final int END_OF_DATA           = 128;
    private static final int BYTE_MAX              = 256;

    private static final int NOT_IDENTIFY_SEQUENCE = 0;
    private static final int START_SEQUENCE        = 1;
    private static final int IN_SEQUENCE           = 2;
    private static final int NOT_IN_SEQUENCE       = 3;

    private int runCount;
    private int isSequence = NOT_IDENTIFY_SEQUENCE;
    private byte[] runBuffer = new byte[MAX_SEQUENCE_COUNT + 1];


    /** @see java.io.FilterOutputStream **/
    public RunLengthEncodeOutputStream(OutputStream out) {
        super(out);__CLR4_5_2g74g74m6lb518a.R.inc(20993);try{__CLR4_5_2g74g74m6lb518a.R.inc(20992);
    }finally{__CLR4_5_2g74g74m6lb518a.R.flushNeeded();}}


    /** @see java.io.FilterOutputStream **/
    public void write(byte b)
        throws java.io.IOException {try{__CLR4_5_2g74g74m6lb518a.R.inc(20994);
        __CLR4_5_2g74g74m6lb518a.R.inc(20995);runBuffer[runCount] = b;

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2g74g74m6lb518a.R.inc(20996);switch (runCount) {
        case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2g74g74m6lb518a.R.inc(20997);__CLB4_5_2_bool0=true;}
            __CLR4_5_2g74g74m6lb518a.R.inc(20998);runCount = 0;
            __CLR4_5_2g74g74m6lb518a.R.inc(20999);isSequence = NOT_IDENTIFY_SEQUENCE;
            __CLR4_5_2g74g74m6lb518a.R.inc(21000);runCount++;
            __CLR4_5_2g74g74m6lb518a.R.inc(21001);break;
        case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2g74g74m6lb518a.R.inc(21002);__CLB4_5_2_bool0=true;}
            __CLR4_5_2g74g74m6lb518a.R.inc(21003);if ((((runBuffer[runCount] != runBuffer[runCount - 1])&&(__CLR4_5_2g74g74m6lb518a.R.iget(21004)!=0|true))||(__CLR4_5_2g74g74m6lb518a.R.iget(21005)==0&false))) {{
                __CLR4_5_2g74g74m6lb518a.R.inc(21006);isSequence = NOT_IN_SEQUENCE;
            }
            }__CLR4_5_2g74g74m6lb518a.R.inc(21007);runCount++;
            __CLR4_5_2g74g74m6lb518a.R.inc(21008);break;
        case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2g74g74m6lb518a.R.inc(21009);__CLB4_5_2_bool0=true;}
            __CLR4_5_2g74g74m6lb518a.R.inc(21010);if ((((runBuffer[runCount] != runBuffer[runCount - 1])&&(__CLR4_5_2g74g74m6lb518a.R.iget(21011)!=0|true))||(__CLR4_5_2g74g74m6lb518a.R.iget(21012)==0&false))) {{
                __CLR4_5_2g74g74m6lb518a.R.inc(21013);isSequence = NOT_IN_SEQUENCE;
            } }else {{
                __CLR4_5_2g74g74m6lb518a.R.inc(21014);if ((((isSequence == NOT_IN_SEQUENCE)&&(__CLR4_5_2g74g74m6lb518a.R.iget(21015)!=0|true))||(__CLR4_5_2g74g74m6lb518a.R.iget(21016)==0&false))) {{
                    __CLR4_5_2g74g74m6lb518a.R.inc(21017);isSequence = START_SEQUENCE;
                } }else {{
                    __CLR4_5_2g74g74m6lb518a.R.inc(21018);isSequence = IN_SEQUENCE;
                }
            }}
            }__CLR4_5_2g74g74m6lb518a.R.inc(21019);runCount++;
            __CLR4_5_2g74g74m6lb518a.R.inc(21020);break;
        case MAX_SEQUENCE_COUNT:if (!__CLB4_5_2_bool0) {__CLR4_5_2g74g74m6lb518a.R.inc(21021);__CLB4_5_2_bool0=true;}
            __CLR4_5_2g74g74m6lb518a.R.inc(21022);if ((((isSequence == IN_SEQUENCE)&&(__CLR4_5_2g74g74m6lb518a.R.iget(21023)!=0|true))||(__CLR4_5_2g74g74m6lb518a.R.iget(21024)==0&false))) {{
                __CLR4_5_2g74g74m6lb518a.R.inc(21025);out.write(BYTE_MAX - (MAX_SEQUENCE_COUNT - 1));
                __CLR4_5_2g74g74m6lb518a.R.inc(21026);out.write(runBuffer[runCount - 1]);
                __CLR4_5_2g74g74m6lb518a.R.inc(21027);runBuffer[0] = runBuffer[runCount];
                __CLR4_5_2g74g74m6lb518a.R.inc(21028);runCount = 1;
            } }else {{
                __CLR4_5_2g74g74m6lb518a.R.inc(21029);out.write(MAX_SEQUENCE_COUNT);
                __CLR4_5_2g74g74m6lb518a.R.inc(21030);out.write(runBuffer, 0, runCount + 1);
                __CLR4_5_2g74g74m6lb518a.R.inc(21031);runCount = 0;
            }
            }__CLR4_5_2g74g74m6lb518a.R.inc(21032);isSequence = NOT_IDENTIFY_SEQUENCE;
            __CLR4_5_2g74g74m6lb518a.R.inc(21033);break;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2g74g74m6lb518a.R.inc(21034);__CLB4_5_2_bool0=true;}
            boolean __CLB4_5_2_bool1=false;__CLR4_5_2g74g74m6lb518a.R.inc(21035);switch (isSequence) {
            case NOT_IN_SEQUENCE:if (!__CLB4_5_2_bool1) {__CLR4_5_2g74g74m6lb518a.R.inc(21036);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g74g74m6lb518a.R.inc(21037);if ((((runBuffer[runCount] == runBuffer[runCount - 1])&&(__CLR4_5_2g74g74m6lb518a.R.iget(21038)!=0|true))||(__CLR4_5_2g74g74m6lb518a.R.iget(21039)==0&false))) {{
                    __CLR4_5_2g74g74m6lb518a.R.inc(21040);isSequence = START_SEQUENCE;
                }
                }__CLR4_5_2g74g74m6lb518a.R.inc(21041);runCount++;
                __CLR4_5_2g74g74m6lb518a.R.inc(21042);break;
            case START_SEQUENCE:if (!__CLB4_5_2_bool1) {__CLR4_5_2g74g74m6lb518a.R.inc(21043);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g74g74m6lb518a.R.inc(21044);if ((((runBuffer[runCount] == runBuffer[runCount - 1])&&(__CLR4_5_2g74g74m6lb518a.R.iget(21045)!=0|true))||(__CLR4_5_2g74g74m6lb518a.R.iget(21046)==0&false))) {{
                    __CLR4_5_2g74g74m6lb518a.R.inc(21047);out.write(runCount - 3);
                    __CLR4_5_2g74g74m6lb518a.R.inc(21048);out.write(runBuffer, 0, runCount - 2);
                    __CLR4_5_2g74g74m6lb518a.R.inc(21049);runBuffer[0] = runBuffer[runCount];
                    __CLR4_5_2g74g74m6lb518a.R.inc(21050);runBuffer[1] = runBuffer[runCount];
                    __CLR4_5_2g74g74m6lb518a.R.inc(21051);runBuffer[2] = runBuffer[runCount];
                    __CLR4_5_2g74g74m6lb518a.R.inc(21052);runCount = 3;
                    __CLR4_5_2g74g74m6lb518a.R.inc(21053);isSequence = IN_SEQUENCE;
                    __CLR4_5_2g74g74m6lb518a.R.inc(21054);break;
                } }else {{
                    __CLR4_5_2g74g74m6lb518a.R.inc(21055);isSequence = NOT_IN_SEQUENCE;
                    __CLR4_5_2g74g74m6lb518a.R.inc(21056);runCount++;
                    __CLR4_5_2g74g74m6lb518a.R.inc(21057);break;
                }
            }case IN_SEQUENCE:if (!__CLB4_5_2_bool1) {__CLR4_5_2g74g74m6lb518a.R.inc(21058);__CLB4_5_2_bool1=true;}
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2g74g74m6lb518a.R.inc(21059);__CLB4_5_2_bool1=true;}
                __CLR4_5_2g74g74m6lb518a.R.inc(21060);if ((((runBuffer[runCount] != runBuffer[runCount - 1])&&(__CLR4_5_2g74g74m6lb518a.R.iget(21061)!=0|true))||(__CLR4_5_2g74g74m6lb518a.R.iget(21062)==0&false))) {{
                    __CLR4_5_2g74g74m6lb518a.R.inc(21063);out.write(BYTE_MAX - (runCount - 1));
                    __CLR4_5_2g74g74m6lb518a.R.inc(21064);out.write(runBuffer[runCount - 1]);
                    __CLR4_5_2g74g74m6lb518a.R.inc(21065);runBuffer[0] = runBuffer[runCount];
                    __CLR4_5_2g74g74m6lb518a.R.inc(21066);runCount = 1;
                    __CLR4_5_2g74g74m6lb518a.R.inc(21067);isSequence = NOT_IDENTIFY_SEQUENCE;
                    __CLR4_5_2g74g74m6lb518a.R.inc(21068);break;
                }
                }__CLR4_5_2g74g74m6lb518a.R.inc(21069);runCount++;
                __CLR4_5_2g74g74m6lb518a.R.inc(21070);break;
            }
        }
    }finally{__CLR4_5_2g74g74m6lb518a.R.flushNeeded();}}


    /** @see java.io.FilterOutputStream **/
    public void write(byte[] b)
        throws IOException {try{__CLR4_5_2g74g74m6lb518a.R.inc(21071);

        __CLR4_5_2g74g74m6lb518a.R.inc(21072);for (byte aB : b) {{
            __CLR4_5_2g74g74m6lb518a.R.inc(21073);this.write(aB);
        }
    }}finally{__CLR4_5_2g74g74m6lb518a.R.flushNeeded();}}


    /** @see java.io.FilterOutputStream **/
    public void write(byte[] b, int off, int len)
        throws IOException {try{__CLR4_5_2g74g74m6lb518a.R.inc(21074);

        __CLR4_5_2g74g74m6lb518a.R.inc(21075);for (int i = 0; (((i < len)&&(__CLR4_5_2g74g74m6lb518a.R.iget(21076)!=0|true))||(__CLR4_5_2g74g74m6lb518a.R.iget(21077)==0&false)); i++) {{
            __CLR4_5_2g74g74m6lb518a.R.inc(21078);this.write(b[off + i]);
        }
    }}finally{__CLR4_5_2g74g74m6lb518a.R.flushNeeded();}}


    /** @see Finalizable **/
    public void finalizeStream()
        throws IOException {try{__CLR4_5_2g74g74m6lb518a.R.inc(21079);
        boolean __CLB4_5_2_bool2=false;__CLR4_5_2g74g74m6lb518a.R.inc(21080);switch (isSequence) {
        case IN_SEQUENCE:if (!__CLB4_5_2_bool2) {__CLR4_5_2g74g74m6lb518a.R.inc(21081);__CLB4_5_2_bool2=true;}
            __CLR4_5_2g74g74m6lb518a.R.inc(21082);out.write(BYTE_MAX - (runCount - 1));
            __CLR4_5_2g74g74m6lb518a.R.inc(21083);out.write(runBuffer[runCount - 1]);
            __CLR4_5_2g74g74m6lb518a.R.inc(21084);break;
        default:if (!__CLB4_5_2_bool2) {__CLR4_5_2g74g74m6lb518a.R.inc(21085);__CLB4_5_2_bool2=true;}
            __CLR4_5_2g74g74m6lb518a.R.inc(21086);out.write(runCount - 1);
            __CLR4_5_2g74g74m6lb518a.R.inc(21087);out.write(runBuffer, 0, runCount);
        }

        __CLR4_5_2g74g74m6lb518a.R.inc(21088);out.write(END_OF_DATA);

        __CLR4_5_2g74g74m6lb518a.R.inc(21089);flush();
        __CLR4_5_2g74g74m6lb518a.R.inc(21090);if ((((out instanceof Finalizable)&&(__CLR4_5_2g74g74m6lb518a.R.iget(21091)!=0|true))||(__CLR4_5_2g74g74m6lb518a.R.iget(21092)==0&false))) {{
            __CLR4_5_2g74g74m6lb518a.R.inc(21093);((Finalizable) out).finalizeStream();
        }
    }}finally{__CLR4_5_2g74g74m6lb518a.R.flushNeeded();}}


    /** @see java.io.FilterOutputStream **/
    public void close()
        throws IOException {try{__CLR4_5_2g74g74m6lb518a.R.inc(21094);
        __CLR4_5_2g74g74m6lb518a.R.inc(21095);finalizeStream();
        __CLR4_5_2g74g74m6lb518a.R.inc(21096);super.close();
    }finally{__CLR4_5_2g74g74m6lb518a.R.flushNeeded();}}

}

