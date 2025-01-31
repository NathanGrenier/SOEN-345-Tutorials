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

/* $Id: JPEGFile.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.ImageInputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Provides methods useful for processing JPEG files.
 */
public class JPEGFile implements JPEGConstants {public static class __CLR4_5_28fo8fom6lb505j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,10956,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** logger */
    protected static final Log log = LogFactory.getLog(JPEGFile.class);

    private DataInput in;

    /**
     * Constructor for ImageInputStreams.
     * @param in the input stream to read the image from
     */
    public JPEGFile(ImageInputStream in) {try{__CLR4_5_28fo8fom6lb505j.R.inc(10932);
        __CLR4_5_28fo8fom6lb505j.R.inc(10933);this.in = in;
    }finally{__CLR4_5_28fo8fom6lb505j.R.flushNeeded();}}

    /**
     * Constructor for InputStreams.
     * @param in the input stream to read the image from
     */
    public JPEGFile(InputStream in) {try{__CLR4_5_28fo8fom6lb505j.R.inc(10934);
        __CLR4_5_28fo8fom6lb505j.R.inc(10935);this.in = new java.io.DataInputStream(in);
    }finally{__CLR4_5_28fo8fom6lb505j.R.flushNeeded();}}

    /**
     * Returns the {@link DataInput} instance this object operates on.
     * @return the data input instance
     */
    public DataInput getDataInput() {try{__CLR4_5_28fo8fom6lb505j.R.inc(10936);
        __CLR4_5_28fo8fom6lb505j.R.inc(10937);return this.in;
    }finally{__CLR4_5_28fo8fom6lb505j.R.flushNeeded();}}

    /**
     * Reads the next marker segment identifier and returns it.
     * @return the marker segment identifier
     * @throws IOException if an I/O error occurs while reading from the image file
     */
    public int readMarkerSegment() throws IOException {try{__CLR4_5_28fo8fom6lb505j.R.inc(10938);
        __CLR4_5_28fo8fom6lb505j.R.inc(10939);int marker;
        __CLR4_5_28fo8fom6lb505j.R.inc(10940);do {{
            __CLR4_5_28fo8fom6lb505j.R.inc(10941);marker = in.readByte() & 0xFF;
            //Skip any non-0xFF bytes (useful for JPEG files with bad record lengths)
        } }while ((((marker != MARK)&&(__CLR4_5_28fo8fom6lb505j.R.iget(10942)!=0|true))||(__CLR4_5_28fo8fom6lb505j.R.iget(10943)==0&false)));

        __CLR4_5_28fo8fom6lb505j.R.inc(10944);int segID;
        __CLR4_5_28fo8fom6lb505j.R.inc(10945);do {{
            __CLR4_5_28fo8fom6lb505j.R.inc(10946);segID = in.readByte() & 0xFF;
            //Skip any pad bytes (0xFF) which are legal here.
        } }while ((((segID == 0xFF)&&(__CLR4_5_28fo8fom6lb505j.R.iget(10947)!=0|true))||(__CLR4_5_28fo8fom6lb505j.R.iget(10948)==0&false)));
        __CLR4_5_28fo8fom6lb505j.R.inc(10949);return segID;
    }finally{__CLR4_5_28fo8fom6lb505j.R.flushNeeded();}}

    /**
     * Reads the segment length of the current marker segment and returns it.
     * The method assumes the file cursor is right after the segment header.
     * @return the segment length
     * @throws IOException if an I/O error occurs while reading from the image file
     */
    public int readSegmentLength() throws IOException {try{__CLR4_5_28fo8fom6lb505j.R.inc(10950);
        __CLR4_5_28fo8fom6lb505j.R.inc(10951);int reclen = in.readUnsignedShort();
        __CLR4_5_28fo8fom6lb505j.R.inc(10952);return reclen;
    }finally{__CLR4_5_28fo8fom6lb505j.R.flushNeeded();}}

    /**
     * Skips the current marker segment.
     * The method assumes the file cursor is right after the segment header.
     * @throws IOException if an I/O error occurs while reading from the image file
     */
    public void skipCurrentMarkerSegment() throws IOException {try{__CLR4_5_28fo8fom6lb505j.R.inc(10953);
        __CLR4_5_28fo8fom6lb505j.R.inc(10954);int reclen = readSegmentLength();
        __CLR4_5_28fo8fom6lb505j.R.inc(10955);in.skipBytes(reclen - 2);
    }finally{__CLR4_5_28fo8fom6lb505j.R.flushNeeded();}}

}
