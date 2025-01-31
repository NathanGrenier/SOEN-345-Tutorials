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

/* $Id: ForwardSeekableStream.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.util;

import java.io.IOException;
import java.io.InputStream;

/**
 * A subclass of <code>SeekableStream</code> that may be used
 * to wrap a regular <code>InputStream</code> efficiently.
 * Seeking backwards is not supported.
 *
 */
public class ForwardSeekableStream extends SeekableStream {public static class __CLR4_5_26my6mym6lb4zi1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,8646,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The source <code>InputStream</code>. */
    private InputStream src;

    /** The current position. */
    long pointer;

    /**
     * Constructs a <code>InputStreamForwardSeekableStream</code> from a
     * regular <code>InputStream</code>.
     */
    public ForwardSeekableStream(InputStream src) {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8602);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8603);this.src = src;
    }finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}

    /** Forwards the request to the real <code>InputStream</code>. */
    public final int read() throws IOException {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8604);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8605);int result = src.read();
        __CLR4_5_26my6mym6lb4zi1.R.inc(8606);if ((((result != -1)&&(__CLR4_5_26my6mym6lb4zi1.R.iget(8607)!=0|true))||(__CLR4_5_26my6mym6lb4zi1.R.iget(8608)==0&false))) {{
            __CLR4_5_26my6mym6lb4zi1.R.inc(8609);++pointer;
        }
        }__CLR4_5_26my6mym6lb4zi1.R.inc(8610);return result;
    }finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}

    /** Forwards the request to the real <code>InputStream</code>. */
    public final int read(byte[] b, int off, int len) throws IOException {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8611);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8612);int result = src.read(b, off, len);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8613);if ((((result != -1)&&(__CLR4_5_26my6mym6lb4zi1.R.iget(8614)!=0|true))||(__CLR4_5_26my6mym6lb4zi1.R.iget(8615)==0&false))) {{
            __CLR4_5_26my6mym6lb4zi1.R.inc(8616);pointer += result;
        }
        }__CLR4_5_26my6mym6lb4zi1.R.inc(8617);return result;
    }finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}

    /** Forwards the request to the real <code>InputStream</code>. */
    public final long skip(long n) throws IOException {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8618);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8619);long skipped = src.skip(n);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8620);pointer += skipped;
        __CLR4_5_26my6mym6lb4zi1.R.inc(8621);return skipped;
    }finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}

    /** Forwards the request to the real <code>InputStream</code>. */
    public final int available() throws IOException {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8622);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8623);return src.available();
    }finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}

    /** Forwards the request to the real <code>InputStream</code>. */
    public final void close() throws IOException {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8624);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8625);src.close();
    }finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}

    /**
     * Forwards the request to the real <code>InputStream</code>.
     * We use {@link SeekableStream#markPos}
     */
    public final synchronized void mark(int readLimit) {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8626);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8627);markPos = pointer;
        __CLR4_5_26my6mym6lb4zi1.R.inc(8628);src.mark(readLimit);
    }finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}

    /**
     * Forwards the request to the real <code>InputStream</code>.
     * We use {@link SeekableStream#markPos}
     */
    public final synchronized void reset() throws IOException {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8629);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8630);if ((((markPos != -1)&&(__CLR4_5_26my6mym6lb4zi1.R.iget(8631)!=0|true))||(__CLR4_5_26my6mym6lb4zi1.R.iget(8632)==0&false))) {{
            __CLR4_5_26my6mym6lb4zi1.R.inc(8633);pointer = markPos;
        }
        }__CLR4_5_26my6mym6lb4zi1.R.inc(8634);src.reset();
    }finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}

    /** Forwards the request to the real <code>InputStream</code>. */
    public boolean markSupported() {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8635);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8636);return src.markSupported();
    }finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}

    /** Returns <code>false</code> since seking backwards is not supported. */
    public final boolean canSeekBackwards() {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8637);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8638);return false;
    }finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}

    /** Returns the current position in the stream (bytes read). */
    public final long getFilePointer() {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8639);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8640);return pointer;
    }finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}

    /**
     * Seeks forward to the given position in the stream.
     * If <code>pos</code> is smaller than the current position
     * as returned by <code>getFilePointer()</code>, nothing
     * happens.
     */
    public final void seek(long pos) throws IOException {try{__CLR4_5_26my6mym6lb4zi1.R.inc(8641);
        __CLR4_5_26my6mym6lb4zi1.R.inc(8642);while ((((pos - pointer > 0)&&(__CLR4_5_26my6mym6lb4zi1.R.iget(8643)!=0|true))||(__CLR4_5_26my6mym6lb4zi1.R.iget(8644)==0&false))) {{
            __CLR4_5_26my6mym6lb4zi1.R.inc(8645);pointer += src.skip(pos - pointer);
        }
    }}finally{__CLR4_5_26my6mym6lb4zi1.R.flushNeeded();}}
}
