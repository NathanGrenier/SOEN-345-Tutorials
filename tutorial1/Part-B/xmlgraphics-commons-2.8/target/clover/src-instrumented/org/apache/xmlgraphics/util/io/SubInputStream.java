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

/* $Id: SubInputStream.java 1610846 2014-07-15 20:44:18Z vhennebert $ */

package org.apache.xmlgraphics.util.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * This class is a FilterInputStream descendant that reads from an underlying InputStream
 * up to a defined number of bytes or the end of the underlying stream. Closing this InputStream
 * will not result in the underlying InputStream to be closed, too.
 * <p>
 * This InputStream can be used to read chunks from a larger file of which the length is
 * known in advance.
 */
public class SubInputStream extends FilterInputStream {public static class __CLR4_5_2ga1ga1m6lb518h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,21138,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Indicates the number of bytes remaining to be read from the underlying InputStream. */
    private long bytesToRead;

    /**
     * Indicates whether the underlying stream should be closed when the {@link #close()} method
     * is called.
     */
    private boolean closeUnderlying;

    /**
     * Creates a new SubInputStream.
     * @param in the InputStream to read from
     * @param maxLen the maximum number of bytes to read from the underlying InputStream until
     *               the end-of-file is signalled.
     * @param closeUnderlying true if the underlying stream should be closed when the
     *               {@link #close()} method is called.
     */
    public SubInputStream(InputStream in, long maxLen, boolean closeUnderlying) {
        super(in);__CLR4_5_2ga1ga1m6lb518h.R.inc(21098);try{__CLR4_5_2ga1ga1m6lb518h.R.inc(21097);
        __CLR4_5_2ga1ga1m6lb518h.R.inc(21099);this.bytesToRead = maxLen;
        __CLR4_5_2ga1ga1m6lb518h.R.inc(21100);this.closeUnderlying = closeUnderlying;
    }finally{__CLR4_5_2ga1ga1m6lb518h.R.flushNeeded();}}

    /**
     * Creates a new SubInputStream. The underlying stream is not closed, when close() is called.
     * @param in the InputStream to read from
     * @param maxLen the maximum number of bytes to read from the underlying InputStream until
     *               the end-of-file is signalled.
     */
    public SubInputStream(InputStream in, long maxLen) {
        this(in, maxLen, false);__CLR4_5_2ga1ga1m6lb518h.R.inc(21102);try{__CLR4_5_2ga1ga1m6lb518h.R.inc(21101);
    }finally{__CLR4_5_2ga1ga1m6lb518h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int read() throws IOException {try{__CLR4_5_2ga1ga1m6lb518h.R.inc(21103);
        __CLR4_5_2ga1ga1m6lb518h.R.inc(21104);if ((((bytesToRead > 0)&&(__CLR4_5_2ga1ga1m6lb518h.R.iget(21105)!=0|true))||(__CLR4_5_2ga1ga1m6lb518h.R.iget(21106)==0&false))) {{
            __CLR4_5_2ga1ga1m6lb518h.R.inc(21107);int result = super.read();
            __CLR4_5_2ga1ga1m6lb518h.R.inc(21108);if ((((result >= 0)&&(__CLR4_5_2ga1ga1m6lb518h.R.iget(21109)!=0|true))||(__CLR4_5_2ga1ga1m6lb518h.R.iget(21110)==0&false))) {{
                __CLR4_5_2ga1ga1m6lb518h.R.inc(21111);bytesToRead--;
                __CLR4_5_2ga1ga1m6lb518h.R.inc(21112);return result;
            } }else {{
                __CLR4_5_2ga1ga1m6lb518h.R.inc(21113);return -1;
            }
        }} }else {{
            __CLR4_5_2ga1ga1m6lb518h.R.inc(21114);return -1;
        }
    }}finally{__CLR4_5_2ga1ga1m6lb518h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int read(byte[] b, int off, int len) throws IOException {try{__CLR4_5_2ga1ga1m6lb518h.R.inc(21115);
        __CLR4_5_2ga1ga1m6lb518h.R.inc(21116);if ((((bytesToRead == 0)&&(__CLR4_5_2ga1ga1m6lb518h.R.iget(21117)!=0|true))||(__CLR4_5_2ga1ga1m6lb518h.R.iget(21118)==0&false))) {{
            __CLR4_5_2ga1ga1m6lb518h.R.inc(21119);return -1;
        }
        }__CLR4_5_2ga1ga1m6lb518h.R.inc(21120);int effRead = (int)Math.min(bytesToRead, len);
        //cast to int is safe because len can never be bigger than Integer.MAX_VALUE

        __CLR4_5_2ga1ga1m6lb518h.R.inc(21121);int result = super.read(b, off, effRead);
        __CLR4_5_2ga1ga1m6lb518h.R.inc(21122);if ((((result >= 0)&&(__CLR4_5_2ga1ga1m6lb518h.R.iget(21123)!=0|true))||(__CLR4_5_2ga1ga1m6lb518h.R.iget(21124)==0&false))) {{
            __CLR4_5_2ga1ga1m6lb518h.R.inc(21125);bytesToRead -= result;
        }
        }__CLR4_5_2ga1ga1m6lb518h.R.inc(21126);return result;
    }finally{__CLR4_5_2ga1ga1m6lb518h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public long skip(long n) throws IOException {try{__CLR4_5_2ga1ga1m6lb518h.R.inc(21127);
        __CLR4_5_2ga1ga1m6lb518h.R.inc(21128);long effRead = Math.min(bytesToRead, n);
        __CLR4_5_2ga1ga1m6lb518h.R.inc(21129);long result = super.skip(effRead);
        __CLR4_5_2ga1ga1m6lb518h.R.inc(21130);bytesToRead -= result;
        __CLR4_5_2ga1ga1m6lb518h.R.inc(21131);return result;
    }finally{__CLR4_5_2ga1ga1m6lb518h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void close() throws IOException {try{__CLR4_5_2ga1ga1m6lb518h.R.inc(21132);
        __CLR4_5_2ga1ga1m6lb518h.R.inc(21133);this.bytesToRead = 0;
        __CLR4_5_2ga1ga1m6lb518h.R.inc(21134);if ((((this.closeUnderlying)&&(__CLR4_5_2ga1ga1m6lb518h.R.iget(21135)!=0|true))||(__CLR4_5_2ga1ga1m6lb518h.R.iget(21136)==0&false))) {{
            __CLR4_5_2ga1ga1m6lb518h.R.inc(21137);super.close();
        }
    }}finally{__CLR4_5_2ga1ga1m6lb518h.R.flushNeeded();}}
}
