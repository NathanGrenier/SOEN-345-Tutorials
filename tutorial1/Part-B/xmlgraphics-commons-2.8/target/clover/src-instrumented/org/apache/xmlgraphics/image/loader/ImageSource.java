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

/* $Id: ImageSource.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.image.loader;

import java.io.InputStream;

import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;

import org.apache.xmlgraphics.image.loader.util.ImageInputStreamAdapter;

/**
 * Acts as a holder for the input to image loading operations.
 */
public class ImageSource implements Source {public static class __CLR4_5_279p79pm68iyh1i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,9447,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String systemId;
    private ImageInputStream iin;
    private boolean fastSource;

    /**
     * Main constructor.
     * @param in the ImageInputStream to load from
     * @param systemId the system identifier (resolved URI) of the image
     * @param fastSource true if it's a fast source (accessing local files)
     */
    public ImageSource(ImageInputStream in, String systemId, boolean fastSource) {try{__CLR4_5_279p79pm68iyh1i.R.inc(9421);
        assert (((in != null )&&(__CLR4_5_279p79pm68iyh1i.R.iget(9422)!=0|true))||(__CLR4_5_279p79pm68iyh1i.R.iget(9423)==0&false)): "InputStream is null";
        __CLR4_5_279p79pm68iyh1i.R.inc(9424);this.iin = in;
        __CLR4_5_279p79pm68iyh1i.R.inc(9425);this.systemId = systemId;
        __CLR4_5_279p79pm68iyh1i.R.inc(9426);this.fastSource = fastSource;
    }finally{__CLR4_5_279p79pm68iyh1i.R.flushNeeded();}}

    /**
     * Returns an InputStream which operates on the underlying ImageInputStream.
     * @return the InputStream or null if the stream has been closed
     */
    public InputStream getInputStream() {try{__CLR4_5_279p79pm68iyh1i.R.inc(9427);
        __CLR4_5_279p79pm68iyh1i.R.inc(9428);if ((((this.iin == null)&&(__CLR4_5_279p79pm68iyh1i.R.iget(9429)!=0|true))||(__CLR4_5_279p79pm68iyh1i.R.iget(9430)==0&false))) {{
            __CLR4_5_279p79pm68iyh1i.R.inc(9431);return null;
        } }else {{
            __CLR4_5_279p79pm68iyh1i.R.inc(9432);return new ImageInputStreamAdapter(this.iin);
        }
    }}finally{__CLR4_5_279p79pm68iyh1i.R.flushNeeded();}}

    /**
     * Returns the ImageInputStream.
     * @return the ImageInputStream or null if the stream has been closed
     */
    public ImageInputStream getImageInputStream() {try{__CLR4_5_279p79pm68iyh1i.R.inc(9433);
        __CLR4_5_279p79pm68iyh1i.R.inc(9434);return this.iin;
    }finally{__CLR4_5_279p79pm68iyh1i.R.flushNeeded();}}

    /**
     * Sets the ImageInputStream.
     * @param in the ImageInputStream
     */
    public void setImageInputStream(ImageInputStream in) {try{__CLR4_5_279p79pm68iyh1i.R.inc(9435);
        __CLR4_5_279p79pm68iyh1i.R.inc(9436);this.iin = in;
    }finally{__CLR4_5_279p79pm68iyh1i.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getSystemId() {try{__CLR4_5_279p79pm68iyh1i.R.inc(9437);
        __CLR4_5_279p79pm68iyh1i.R.inc(9438);return this.systemId;
    }finally{__CLR4_5_279p79pm68iyh1i.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setSystemId(String systemId) {try{__CLR4_5_279p79pm68iyh1i.R.inc(9439);
        __CLR4_5_279p79pm68iyh1i.R.inc(9440);this.systemId = systemId;
    }finally{__CLR4_5_279p79pm68iyh1i.R.flushNeeded();}}

    /**
     * Indicates whether this ImageSource is a fast source, i.e. accesses local files rather than
     * network resources.
     * @return true if it's a fast source
     */
    public boolean isFastSource() {try{__CLR4_5_279p79pm68iyh1i.R.inc(9441);
        __CLR4_5_279p79pm68iyh1i.R.inc(9442);return this.fastSource;
    }finally{__CLR4_5_279p79pm68iyh1i.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_279p79pm68iyh1i.R.inc(9443);
        __CLR4_5_279p79pm68iyh1i.R.inc(9444);return ((((isFastSource() )&&(__CLR4_5_279p79pm68iyh1i.R.iget(9445)!=0|true))||(__CLR4_5_279p79pm68iyh1i.R.iget(9446)==0&false))? "FAST " : "") + "ImageSource: "
            + getSystemId() + " " + getImageInputStream();
    }finally{__CLR4_5_279p79pm68iyh1i.R.flushNeeded();}}

}
