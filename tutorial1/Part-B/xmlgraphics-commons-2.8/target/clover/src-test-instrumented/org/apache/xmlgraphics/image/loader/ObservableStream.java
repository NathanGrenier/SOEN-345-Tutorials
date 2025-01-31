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

/* $Id: ObservableStream.java 1365650 2012-07-25 15:59:30Z mehdi $ */

package org.apache.xmlgraphics.image.loader;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.imageio.stream.ImageInputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Implemented by observable streams.
 */
public interface ObservableStream {public static class __CLR4_5_2i4yi4ym6lb521e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,23534,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Indicates whether the stream has been closed.
     * @return true if the stream is closed
     */
    boolean isClosed();

    /**
     * Returns the system ID for the stream being observed.
     * @return the system ID
     */
    String getSystemID();

    public static class Factory {

        public static ImageInputStream observe(ImageInputStream iin, String systemID) {try{__CLR4_5_2i4yi4ym6lb521e.R.inc(23506);
            __CLR4_5_2i4yi4ym6lb521e.R.inc(23507);return (ImageInputStream) Proxy.newProxyInstance(
                    Factory.class.getClassLoader(),
                    new Class[] {ImageInputStream.class, ObservableStream.class},
                    new ObservingImageInputStreamInvocationHandler(iin, systemID));
        }finally{__CLR4_5_2i4yi4ym6lb521e.R.flushNeeded();}}

    }

    public static class ObservingImageInputStreamInvocationHandler
            implements InvocationHandler, ObservableStream {

        /** logger */
        protected static Log log = LogFactory.getLog(ObservableInputStream.class);

        private ImageInputStream iin;
        private boolean closed;
        private String systemID;

        public ObservingImageInputStreamInvocationHandler(ImageInputStream iin, String systemID) {try{__CLR4_5_2i4yi4ym6lb521e.R.inc(23508);
            __CLR4_5_2i4yi4ym6lb521e.R.inc(23509);this.iin = iin;
            __CLR4_5_2i4yi4ym6lb521e.R.inc(23510);this.systemID = systemID;
        }finally{__CLR4_5_2i4yi4ym6lb521e.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {try{__CLR4_5_2i4yi4ym6lb521e.R.inc(23511);
            __CLR4_5_2i4yi4ym6lb521e.R.inc(23512);if ((((method.getDeclaringClass().equals(ObservableStream.class))&&(__CLR4_5_2i4yi4ym6lb521e.R.iget(23513)!=0|true))||(__CLR4_5_2i4yi4ym6lb521e.R.iget(23514)==0&false))) {{
                __CLR4_5_2i4yi4ym6lb521e.R.inc(23515);return method.invoke(this, args);
            } }else {__CLR4_5_2i4yi4ym6lb521e.R.inc(23516);if (((("close".equals(method.getName()))&&(__CLR4_5_2i4yi4ym6lb521e.R.iget(23517)!=0|true))||(__CLR4_5_2i4yi4ym6lb521e.R.iget(23518)==0&false))) {{
                __CLR4_5_2i4yi4ym6lb521e.R.inc(23519);if ((((!closed)&&(__CLR4_5_2i4yi4ym6lb521e.R.iget(23520)!=0|true))||(__CLR4_5_2i4yi4ym6lb521e.R.iget(23521)==0&false))) {{
                    __CLR4_5_2i4yi4ym6lb521e.R.inc(23522);log.debug("Stream is being closed: " + getSystemID());
                    __CLR4_5_2i4yi4ym6lb521e.R.inc(23523);closed = true;
                    __CLR4_5_2i4yi4ym6lb521e.R.inc(23524);try {
                        __CLR4_5_2i4yi4ym6lb521e.R.inc(23525);return method.invoke(iin, args);
                    } catch (InvocationTargetException ite) {
                        __CLR4_5_2i4yi4ym6lb521e.R.inc(23526);log.error("Error while closing underlying stream: " + ite.getMessage());
                        __CLR4_5_2i4yi4ym6lb521e.R.inc(23527);throw ite;
                    }
                } }else {{
                    __CLR4_5_2i4yi4ym6lb521e.R.inc(23528);throw new IllegalStateException("Stream is already closed!");
                }
            }} }else {{
                __CLR4_5_2i4yi4ym6lb521e.R.inc(23529);return method.invoke(iin, args);
            }
        }}}finally{__CLR4_5_2i4yi4ym6lb521e.R.flushNeeded();}}

        /** {@inheritDoc} */
        public String getSystemID() {try{__CLR4_5_2i4yi4ym6lb521e.R.inc(23530);
            __CLR4_5_2i4yi4ym6lb521e.R.inc(23531);return this.systemID;
        }finally{__CLR4_5_2i4yi4ym6lb521e.R.flushNeeded();}}

        /** {@inheritDoc} */
        public boolean isClosed() {try{__CLR4_5_2i4yi4ym6lb521e.R.inc(23532);
            __CLR4_5_2i4yi4ym6lb521e.R.inc(23533);return this.closed;
        }finally{__CLR4_5_2i4yi4ym6lb521e.R.flushNeeded();}}

    }

}
