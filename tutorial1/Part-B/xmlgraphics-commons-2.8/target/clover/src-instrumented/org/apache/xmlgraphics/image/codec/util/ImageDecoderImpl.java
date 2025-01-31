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

/* $Id: ImageDecoderImpl.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.util;

import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * A partial implementation of the <code>ImageDecoder</code> interface
 * useful for subclassing.
 *
 */
public abstract class ImageDecoderImpl implements ImageDecoder {public static class __CLR4_5_26o66o6m6lb4zii{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,8667,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The <code>SeekableStream</code> associcted with this
     * <code>ImageEncoder</code>.
     */
    protected SeekableStream input;

    /**
     * The <code>ImageDecodeParam</code> object associated with this
     * <code>ImageEncoder</code>.
     */
    protected ImageDecodeParam param;

    /**
     * Constructs an <code>ImageDecoderImpl</code> with a given
     * <code>SeekableStream</code> and <code>ImageDecodeParam</code>
     * instance.
     */
    public ImageDecoderImpl(SeekableStream input,
                            ImageDecodeParam param) {try{__CLR4_5_26o66o6m6lb4zii.R.inc(8646);
        __CLR4_5_26o66o6m6lb4zii.R.inc(8647);this.input = input;
        __CLR4_5_26o66o6m6lb4zii.R.inc(8648);this.param = param;
    }finally{__CLR4_5_26o66o6m6lb4zii.R.flushNeeded();}}

    /**
     * Constructs an <code>ImageDecoderImpl</code> with a given
     * <code>InputStream</code> and <code>ImageDecodeParam</code>
     * instance.  The <code>input</code> parameter will be used to
     * construct a <code>ForwardSeekableStream</code>; if the ability
     * to seek backwards is required, the caller should construct
     * an instance of <code>SeekableStream</code> and
     * make use of the other contructor.
     */
    public ImageDecoderImpl(InputStream input,
                            ImageDecodeParam param) {try{__CLR4_5_26o66o6m6lb4zii.R.inc(8649);
        __CLR4_5_26o66o6m6lb4zii.R.inc(8650);this.input = new ForwardSeekableStream(input);
        __CLR4_5_26o66o6m6lb4zii.R.inc(8651);this.param = param;
    }finally{__CLR4_5_26o66o6m6lb4zii.R.flushNeeded();}}

    /**
     * Returns the current parameters as an instance of the
     * <code>ImageDecodeParam</code> interface.  Concrete
     * implementations of this interface will return corresponding
     * concrete implementations of the <code>ImageDecodeParam</code>
     * interface.  For example, a <code>JPEGImageDecoder</code> will
     * return an instance of <code>JPEGDecodeParam</code>.
     */
    public ImageDecodeParam getParam() {try{__CLR4_5_26o66o6m6lb4zii.R.inc(8652);
        __CLR4_5_26o66o6m6lb4zii.R.inc(8653);return param;
    }finally{__CLR4_5_26o66o6m6lb4zii.R.flushNeeded();}}

    /**
     * Sets the current parameters to an instance of the
     * <code>ImageDecodeParam</code> interface.  Concrete
     * implementations of <code>ImageDecoder</code> may throw a
     * <code>RuntimeException</code> if the <code>param</code>
     * argument is not an instance of the appropriate subclass or
     * subinterface.  For example, a <code>JPEGImageDecoder</code>
     * will expect <code>param</code> to be an instance of
     * <code>JPEGDecodeParam</code>.
     */
    public void setParam(ImageDecodeParam param) {try{__CLR4_5_26o66o6m6lb4zii.R.inc(8654);
        __CLR4_5_26o66o6m6lb4zii.R.inc(8655);this.param = param;
    }finally{__CLR4_5_26o66o6m6lb4zii.R.flushNeeded();}}

    /**
     * Returns the <code>SeekableStream</code> associated with
     * this <code>ImageDecoder</code>.
     */
    public SeekableStream getInputStream() {try{__CLR4_5_26o66o6m6lb4zii.R.inc(8656);
        __CLR4_5_26o66o6m6lb4zii.R.inc(8657);return input;
    }finally{__CLR4_5_26o66o6m6lb4zii.R.flushNeeded();}}

    /**
     * Returns the number of pages present in the current stream.
     * By default, the return value is 1.  Subclasses that deal with
     * multi-page formats should override this method.
     */
    public int getNumPages() throws IOException {try{__CLR4_5_26o66o6m6lb4zii.R.inc(8658);
        __CLR4_5_26o66o6m6lb4zii.R.inc(8659);return 1;
    }finally{__CLR4_5_26o66o6m6lb4zii.R.flushNeeded();}}

    /**
     * Returns a <code>Raster</code> that contains the decoded
     * contents of the <code>SeekableStream</code> associated
     * with this <code>ImageDecoder</code>.  Only
     * the first page of a multi-page image is decoded.
     */
    public Raster decodeAsRaster() throws IOException {try{__CLR4_5_26o66o6m6lb4zii.R.inc(8660);
        __CLR4_5_26o66o6m6lb4zii.R.inc(8661);return decodeAsRaster(0);
    }finally{__CLR4_5_26o66o6m6lb4zii.R.flushNeeded();}}

    /**
     * Returns a <code>Raster</code> that contains the decoded
     * contents of the <code>SeekableStream</code> associated
     * with this <code>ImageDecoder</code>.
     * The given page of a multi-page image is decoded.  If
     * the page does not exist, an IOException will be thrown.
     * Page numbering begins at zero.
     *
     * @param page The page to be decoded.
     */
    public Raster decodeAsRaster(int page) throws IOException {try{__CLR4_5_26o66o6m6lb4zii.R.inc(8662);
        __CLR4_5_26o66o6m6lb4zii.R.inc(8663);RenderedImage im = decodeAsRenderedImage(page);
        __CLR4_5_26o66o6m6lb4zii.R.inc(8664);return im.getData();
    }finally{__CLR4_5_26o66o6m6lb4zii.R.flushNeeded();}}

    /**
     * Returns a <code>RenderedImage</code> that contains the decoded
     * contents of the <code>SeekableStream</code> associated
     * with this <code>ImageDecoder</code>.  Only
     * the first page of a multi-page image is decoded.
     */
    public RenderedImage decodeAsRenderedImage() throws IOException {try{__CLR4_5_26o66o6m6lb4zii.R.inc(8665);
        __CLR4_5_26o66o6m6lb4zii.R.inc(8666);return decodeAsRenderedImage(0);
    }finally{__CLR4_5_26o66o6m6lb4zii.R.flushNeeded();}}

    /**
     * Returns a <code>RenderedImage</code> that contains the decoded
     * contents of the <code>SeekableStream</code> associated
     * with this <code>ImageDecoder</code>.
     * The given page of a multi-page image is decoded.  If
     * the page does not exist, an IOException will be thrown.
     * Page numbering begins at zero.
     *
     * @param page The page to be decoded.
     */
    public abstract RenderedImage decodeAsRenderedImage(int page)
        throws IOException;
}
