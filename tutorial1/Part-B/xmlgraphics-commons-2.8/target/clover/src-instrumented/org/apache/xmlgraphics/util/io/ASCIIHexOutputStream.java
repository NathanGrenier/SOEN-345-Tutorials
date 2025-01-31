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

/* $Id: ASCIIHexOutputStream.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.util.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * This class applies a ASCII Hex encoding to the stream.
 *
 * @version $Id: ASCIIHexOutputStream.java 1732018 2016-02-24 04:51:06Z gadams $
 */
public class ASCIIHexOutputStream extends FilterOutputStream
        implements Finalizable {public static class __CLR4_5_2fzcfzcm6lb513y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,20747,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int EOL   = 0x0A; //"\n"
    private static final int EOD   = 0x3E; //">"
    private static final int ZERO  = 0x30; //"0"
    private static final int NINE  = 0x39; //"9"
    private static final int A     = 0x41; //"A"
    private static final int ADIFF = A - NINE - 1;

    private int posinline;


    /** @see java.io.FilterOutputStream **/
    public ASCIIHexOutputStream(OutputStream out) {
        super(out);__CLR4_5_2fzcfzcm6lb513y.R.inc(20713);try{__CLR4_5_2fzcfzcm6lb513y.R.inc(20712);
    }finally{__CLR4_5_2fzcfzcm6lb513y.R.flushNeeded();}}


    /** @see java.io.FilterOutputStream **/
    public void write(int b) throws IOException {try{__CLR4_5_2fzcfzcm6lb513y.R.inc(20714);
        __CLR4_5_2fzcfzcm6lb513y.R.inc(20715);b &= 0xFF;

        __CLR4_5_2fzcfzcm6lb513y.R.inc(20716);int digit1 = ((b & 0xF0) >> 4) + ZERO;
        __CLR4_5_2fzcfzcm6lb513y.R.inc(20717);if ((((digit1 > NINE)&&(__CLR4_5_2fzcfzcm6lb513y.R.iget(20718)!=0|true))||(__CLR4_5_2fzcfzcm6lb513y.R.iget(20719)==0&false))) {{
            __CLR4_5_2fzcfzcm6lb513y.R.inc(20720);digit1 += ADIFF;
        }
        }__CLR4_5_2fzcfzcm6lb513y.R.inc(20721);out.write(digit1);

        __CLR4_5_2fzcfzcm6lb513y.R.inc(20722);int digit2 = (b & 0x0F) + ZERO;
        __CLR4_5_2fzcfzcm6lb513y.R.inc(20723);if ((((digit2 > NINE)&&(__CLR4_5_2fzcfzcm6lb513y.R.iget(20724)!=0|true))||(__CLR4_5_2fzcfzcm6lb513y.R.iget(20725)==0&false))) {{
            __CLR4_5_2fzcfzcm6lb513y.R.inc(20726);digit2 += ADIFF;
        }
        }__CLR4_5_2fzcfzcm6lb513y.R.inc(20727);out.write(digit2);

        __CLR4_5_2fzcfzcm6lb513y.R.inc(20728);posinline++;
        __CLR4_5_2fzcfzcm6lb513y.R.inc(20729);checkLineWrap();
    }finally{__CLR4_5_2fzcfzcm6lb513y.R.flushNeeded();}}


    private void checkLineWrap() throws IOException {try{__CLR4_5_2fzcfzcm6lb513y.R.inc(20730);
        //Maximum line length is 80 characters
        __CLR4_5_2fzcfzcm6lb513y.R.inc(20731);if ((((posinline >= 40)&&(__CLR4_5_2fzcfzcm6lb513y.R.iget(20732)!=0|true))||(__CLR4_5_2fzcfzcm6lb513y.R.iget(20733)==0&false))) {{
            __CLR4_5_2fzcfzcm6lb513y.R.inc(20734);out.write(EOL);
            __CLR4_5_2fzcfzcm6lb513y.R.inc(20735);posinline = 0;
        }
    }}finally{__CLR4_5_2fzcfzcm6lb513y.R.flushNeeded();}}


    /** @see Finalizable **/
    public void finalizeStream() throws IOException {try{__CLR4_5_2fzcfzcm6lb513y.R.inc(20736);
        __CLR4_5_2fzcfzcm6lb513y.R.inc(20737);checkLineWrap();
        //Write closing character ">"
        __CLR4_5_2fzcfzcm6lb513y.R.inc(20738);super.write(EOD);

        __CLR4_5_2fzcfzcm6lb513y.R.inc(20739);flush();
        __CLR4_5_2fzcfzcm6lb513y.R.inc(20740);if ((((out instanceof Finalizable)&&(__CLR4_5_2fzcfzcm6lb513y.R.iget(20741)!=0|true))||(__CLR4_5_2fzcfzcm6lb513y.R.iget(20742)==0&false))) {{
            __CLR4_5_2fzcfzcm6lb513y.R.inc(20743);((Finalizable) out).finalizeStream();
        }
    }}finally{__CLR4_5_2fzcfzcm6lb513y.R.flushNeeded();}}


    /** @see java.io.FilterOutputStream **/
    public void close() throws IOException {try{__CLR4_5_2fzcfzcm6lb513y.R.inc(20744);
        __CLR4_5_2fzcfzcm6lb513y.R.inc(20745);finalizeStream();
        __CLR4_5_2fzcfzcm6lb513y.R.inc(20746);super.close();
    }finally{__CLR4_5_2fzcfzcm6lb513y.R.flushNeeded();}}


}


