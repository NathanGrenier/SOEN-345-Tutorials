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

/* $Id: TIFFImageDecoder.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.tiff;

import java.awt.image.RenderedImage;
import java.io.IOException;

import org.apache.xmlgraphics.image.codec.util.ImageDecoderImpl;
import org.apache.xmlgraphics.image.codec.util.PropertyUtil;
import org.apache.xmlgraphics.image.codec.util.SeekableStream;

/**
 * A baseline TIFF reader. The reader has some functionality in addition to
 * the baseline specifications for Bilevel images, for which the group 3 and
 * group 4 decompression schemes have been implemented. Support for LZW
 * decompression has also been added. Support for Horizontal differencing
 * predictor decoding is also included, when used with LZW compression.
 * However, this support is limited to data with bitsPerSample value of 8.
 * When reading in RGB images, support for alpha and extraSamples being
 * present has been added. Support for reading in images with 16 bit samples
 * has been added. Support for the SampleFormat tag (signed samples as well
 * as floating-point samples) has also been added. In all other cases, support
 * is limited to Baseline specifications.
 *
 *
 */
public class TIFFImageDecoder extends ImageDecoderImpl {public static class __CLR4_5_25so5som6lb4z7a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,7522,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // All the TIFF tags that we care about
    public static final int TIFF_IMAGE_WIDTH                = 256;
    public static final int TIFF_IMAGE_LENGTH               = 257;
    public static final int TIFF_BITS_PER_SAMPLE            = 258;
    public static final int TIFF_COMPRESSION                = 259;
    public static final int TIFF_PHOTOMETRIC_INTERPRETATION = 262;
    public static final int TIFF_FILL_ORDER                 = 266;
    public static final int TIFF_STRIP_OFFSETS              = 273;
    public static final int TIFF_SAMPLES_PER_PIXEL          = 277;
    public static final int TIFF_ROWS_PER_STRIP             = 278;
    public static final int TIFF_STRIP_BYTE_COUNTS          = 279;
    public static final int TIFF_X_RESOLUTION               = 282;
    public static final int TIFF_Y_RESOLUTION               = 283;
    public static final int TIFF_PLANAR_CONFIGURATION       = 284;
    public static final int TIFF_T4_OPTIONS                 = 292;
    public static final int TIFF_T6_OPTIONS                 = 293;
    public static final int TIFF_RESOLUTION_UNIT            = 296;
    public static final int TIFF_PREDICTOR                  = 317;
    public static final int TIFF_COLORMAP                   = 320;
    public static final int TIFF_TILE_WIDTH                 = 322;
    public static final int TIFF_TILE_LENGTH                = 323;
    public static final int TIFF_TILE_OFFSETS               = 324;
    public static final int TIFF_TILE_BYTE_COUNTS           = 325;
    public static final int TIFF_EXTRA_SAMPLES              = 338;
    public static final int TIFF_SAMPLE_FORMAT              = 339;
    public static final int TIFF_S_MIN_SAMPLE_VALUE         = 340;
    public static final int TIFF_S_MAX_SAMPLE_VALUE         = 341;

    public static final int TIFF_ICC_PROFILE                = 34675;

    public TIFFImageDecoder(SeekableStream input, TIFFDecodeParam param) {
        super(input, param);__CLR4_5_25so5som6lb4z7a.R.inc(7513);try{__CLR4_5_25so5som6lb4z7a.R.inc(7512);
    }finally{__CLR4_5_25so5som6lb4z7a.R.flushNeeded();}}

    public int getNumPages() throws IOException {try{__CLR4_5_25so5som6lb4z7a.R.inc(7514);
        __CLR4_5_25so5som6lb4z7a.R.inc(7515);return TIFFDirectory.getNumDirectories(input);
    }finally{__CLR4_5_25so5som6lb4z7a.R.flushNeeded();}}

    public RenderedImage decodeAsRenderedImage(int page) throws IOException {try{__CLR4_5_25so5som6lb4z7a.R.inc(7516);
        __CLR4_5_25so5som6lb4z7a.R.inc(7517);if  (((((page < 0) || (page >= getNumPages()))&&(__CLR4_5_25so5som6lb4z7a.R.iget(7518)!=0|true))||(__CLR4_5_25so5som6lb4z7a.R.iget(7519)==0&false))) {{
            __CLR4_5_25so5som6lb4z7a.R.inc(7520);throw new IOException(PropertyUtil.getString("TIFFImageDecoder0"));
        }
        }__CLR4_5_25so5som6lb4z7a.R.inc(7521);return new TIFFImage(input, (TIFFDecodeParam) param, page);
    }finally{__CLR4_5_25so5som6lb4z7a.R.flushNeeded();}}
}
