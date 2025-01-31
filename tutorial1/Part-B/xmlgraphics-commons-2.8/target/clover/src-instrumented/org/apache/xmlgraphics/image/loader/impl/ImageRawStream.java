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

/* $Id: ImageRawStream.java 1681137 2015-05-22 14:54:05Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.MimeEnabledImageFlavor;

/**
 * This class is an implementation of the Image interface exposing an InputStream for loading the
 * raw/undecoded image.
 */
public class ImageRawStream extends AbstractImage {public static class __CLR4_5_28d28d2m6lb504t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,10891,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ImageFlavor flavor;
    private InputStreamFactory streamFactory;

    /**
     * Main constructor.
     * @param info the image info object
     * @param flavor the image flavor for the raw image
     * @param streamFactory the InputStreamFactory that is used to create InputStream instances
     */
    public ImageRawStream(ImageInfo info, ImageFlavor flavor, InputStreamFactory streamFactory) {
        super(info);__CLR4_5_28d28d2m6lb504t.R.inc(10839);try{__CLR4_5_28d28d2m6lb504t.R.inc(10838);
        __CLR4_5_28d28d2m6lb504t.R.inc(10840);this.flavor = flavor;
        __CLR4_5_28d28d2m6lb504t.R.inc(10841);setInputStreamFactory(streamFactory);
    }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

    /**
     * Constructor for a simple InputStream as parameter.
     * @param info the image info object
     * @param flavor the image flavor for the raw image
     * @param in the InputStream with the raw content
     */
    public ImageRawStream(ImageInfo info, ImageFlavor flavor, InputStream in) {
        this(info, flavor, new SingleStreamFactory(in));__CLR4_5_28d28d2m6lb504t.R.inc(10843);try{__CLR4_5_28d28d2m6lb504t.R.inc(10842);
    }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor getFlavor() {try{__CLR4_5_28d28d2m6lb504t.R.inc(10844);
        __CLR4_5_28d28d2m6lb504t.R.inc(10845);return this.flavor;
    }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

    /**
     * Returns the MIME type of the stream data.
     * @return the MIME type
     */
    public String getMimeType() {try{__CLR4_5_28d28d2m6lb504t.R.inc(10846);
        __CLR4_5_28d28d2m6lb504t.R.inc(10847);if ((((getFlavor() instanceof MimeEnabledImageFlavor)&&(__CLR4_5_28d28d2m6lb504t.R.iget(10848)!=0|true))||(__CLR4_5_28d28d2m6lb504t.R.iget(10849)==0&false))) {{
            __CLR4_5_28d28d2m6lb504t.R.inc(10850);return getFlavor().getMimeType();
        } }else {{
            //Undetermined
            __CLR4_5_28d28d2m6lb504t.R.inc(10851);return "application/octet-stream";
        }
    }}finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isCacheable() {try{__CLR4_5_28d28d2m6lb504t.R.inc(10852);
        __CLR4_5_28d28d2m6lb504t.R.inc(10853);return !this.streamFactory.isUsedOnceOnly();
    }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

    /**
     * Sets the InputStreamFactory to be used by this image. This method allows to replace the
     * original factory.
     * @param factory the new InputStreamFactory
     */
    public void setInputStreamFactory(InputStreamFactory factory) {try{__CLR4_5_28d28d2m6lb504t.R.inc(10854);
        __CLR4_5_28d28d2m6lb504t.R.inc(10855);if ((((this.streamFactory != null)&&(__CLR4_5_28d28d2m6lb504t.R.iget(10856)!=0|true))||(__CLR4_5_28d28d2m6lb504t.R.iget(10857)==0&false))) {{
            __CLR4_5_28d28d2m6lb504t.R.inc(10858);this.streamFactory.close();
        }
        }__CLR4_5_28d28d2m6lb504t.R.inc(10859);this.streamFactory = factory;
    }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

    /**
     * Returns a new InputStream to access the raw image.
     * @return the InputStream
     */
    public InputStream createInputStream() {try{__CLR4_5_28d28d2m6lb504t.R.inc(10860);
        __CLR4_5_28d28d2m6lb504t.R.inc(10861);return this.streamFactory.createInputStream();
    }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

    /**
     * Writes the content of the image to an OutputStream. The OutputStream in NOT closed at the
     * end.
     * @param out the OutputStream
     * @throws IOException if an I/O error occurs
     */
    public void writeTo(OutputStream out) throws IOException {try{__CLR4_5_28d28d2m6lb504t.R.inc(10862);
        __CLR4_5_28d28d2m6lb504t.R.inc(10863);InputStream in = createInputStream();
        __CLR4_5_28d28d2m6lb504t.R.inc(10864);try {
            __CLR4_5_28d28d2m6lb504t.R.inc(10865);IOUtils.copy(in, out);
        } finally {
            __CLR4_5_28d28d2m6lb504t.R.inc(10866);IOUtils.closeQuietly(in);
        }
    }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

    /**
     * Represents a factory for InputStream objects. Make sure the class is thread-safe!
     */
    public interface InputStreamFactory {

        /**
         * Indicates whether this factory is only usable once or many times.
         * @return true if the factory can only be used once
         */
        boolean isUsedOnceOnly();

        /**
         * Creates and returns a new InputStream.
         * @return the new InputStream
         */
        InputStream createInputStream();

        /**
         * Closes the factory and releases any resources held open during the lifetime of this
         * object.
         */
        void close();

    }

    /**
     * InputStream factory that can return a pre-constructed InputStream exactly once.
     */
    private static class SingleStreamFactory implements InputStreamFactory {

        private InputStream in;

        public SingleStreamFactory(InputStream in) {try{__CLR4_5_28d28d2m6lb504t.R.inc(10867);
            __CLR4_5_28d28d2m6lb504t.R.inc(10868);this.in = in;
        }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

        public synchronized InputStream createInputStream() {try{__CLR4_5_28d28d2m6lb504t.R.inc(10869);
            __CLR4_5_28d28d2m6lb504t.R.inc(10870);if ((((this.in != null)&&(__CLR4_5_28d28d2m6lb504t.R.iget(10871)!=0|true))||(__CLR4_5_28d28d2m6lb504t.R.iget(10872)==0&false))) {{
                __CLR4_5_28d28d2m6lb504t.R.inc(10873);InputStream tempin = this.in;
                __CLR4_5_28d28d2m6lb504t.R.inc(10874);this.in = null; //Don't close, just remove the reference
                __CLR4_5_28d28d2m6lb504t.R.inc(10875);return tempin;
            } }else {{
                __CLR4_5_28d28d2m6lb504t.R.inc(10876);throw new IllegalStateException("Can only create an InputStream once!");
            }
        }}finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

        public synchronized void close() {try{__CLR4_5_28d28d2m6lb504t.R.inc(10877);
            __CLR4_5_28d28d2m6lb504t.R.inc(10878);IOUtils.closeQuietly(this.in);
            __CLR4_5_28d28d2m6lb504t.R.inc(10879);this.in = null;
        }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

        public boolean isUsedOnceOnly() {try{__CLR4_5_28d28d2m6lb504t.R.inc(10880);
            __CLR4_5_28d28d2m6lb504t.R.inc(10881);return true;
        }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

        /** {@inheritDoc} */
        protected void finalize() {try{__CLR4_5_28d28d2m6lb504t.R.inc(10882);
            __CLR4_5_28d28d2m6lb504t.R.inc(10883);close();
        }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

    }

    /**
     * InputStream factory that wraps a byte array.
     */
    public static class ByteArrayStreamFactory implements InputStreamFactory {

        private byte[] data;

        /**
         * Main constructor.
         * @param data the byte array
         */
        public ByteArrayStreamFactory(byte[] data) {try{__CLR4_5_28d28d2m6lb504t.R.inc(10884);
            __CLR4_5_28d28d2m6lb504t.R.inc(10885);this.data = data;
        }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public InputStream createInputStream() {try{__CLR4_5_28d28d2m6lb504t.R.inc(10886);
            __CLR4_5_28d28d2m6lb504t.R.inc(10887);return new ByteArrayInputStream(data);
        }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void close() {try{__CLR4_5_28d28d2m6lb504t.R.inc(10888);
            //nop
        }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public boolean isUsedOnceOnly() {try{__CLR4_5_28d28d2m6lb504t.R.inc(10889);
            __CLR4_5_28d28d2m6lb504t.R.inc(10890);return false;
        }finally{__CLR4_5_28d28d2m6lb504t.R.flushNeeded();}}

    }

}
