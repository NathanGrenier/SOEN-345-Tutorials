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

/* $Id: PreloaderRawPNG.java 1732018 2016-02-24 04:51:06Z gadams $ */
package org.apache.xmlgraphics.image.loader.impl;

import java.io.IOException;
import java.nio.ByteBuffer;

import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;

import org.apache.xmlgraphics.image.codec.png.PNGImageDecoder;
import org.apache.xmlgraphics.image.loader.ImageContext;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSize;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;

public class PreloaderRawPNG extends AbstractImagePreloader {public static class __CLR4_5_28xs8xsm6lb50b9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,11606,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public ImageInfo preloadImage(String uri, Source src, ImageContext context) throws ImageException, IOException {try{__CLR4_5_28xs8xsm6lb50b9.R.inc(11584);
        __CLR4_5_28xs8xsm6lb50b9.R.inc(11585);if ((((!ImageUtil.hasImageInputStream(src))&&(__CLR4_5_28xs8xsm6lb50b9.R.iget(11586)!=0|true))||(__CLR4_5_28xs8xsm6lb50b9.R.iget(11587)==0&false))) {{
            __CLR4_5_28xs8xsm6lb50b9.R.inc(11588);return null;
        }
        }__CLR4_5_28xs8xsm6lb50b9.R.inc(11589);ImageInputStream in = ImageUtil.needImageInputStream(src);
        __CLR4_5_28xs8xsm6lb50b9.R.inc(11590);long bb = ByteBuffer.wrap(getHeader(in, 8)).getLong();
        __CLR4_5_28xs8xsm6lb50b9.R.inc(11591);if ((((bb != PNGConstants.PNG_SIGNATURE)&&(__CLR4_5_28xs8xsm6lb50b9.R.iget(11592)!=0|true))||(__CLR4_5_28xs8xsm6lb50b9.R.iget(11593)==0&false))) {{
            __CLR4_5_28xs8xsm6lb50b9.R.inc(11594);return null;
        }
        }__CLR4_5_28xs8xsm6lb50b9.R.inc(11595);in.mark();
        __CLR4_5_28xs8xsm6lb50b9.R.inc(11596);ImageSize size = new ImageSize();
        //Resolution (first a default, then try to read the metadata)
        __CLR4_5_28xs8xsm6lb50b9.R.inc(11597);size.setResolution(context.getSourceResolution());
        __CLR4_5_28xs8xsm6lb50b9.R.inc(11598);try {
            __CLR4_5_28xs8xsm6lb50b9.R.inc(11599);PNGImageDecoder.readPNGHeader(in, size);
        } finally {
            __CLR4_5_28xs8xsm6lb50b9.R.inc(11600);in.reset();
        }

        __CLR4_5_28xs8xsm6lb50b9.R.inc(11601);ImageInfo info = new ImageInfo(uri, "image/png");
        __CLR4_5_28xs8xsm6lb50b9.R.inc(11602);info.setSize(size);
        __CLR4_5_28xs8xsm6lb50b9.R.inc(11603);return info;
    }finally{__CLR4_5_28xs8xsm6lb50b9.R.flushNeeded();}}

    public int getPriority() {try{__CLR4_5_28xs8xsm6lb50b9.R.inc(11604);
        __CLR4_5_28xs8xsm6lb50b9.R.inc(11605);return DEFAULT_PRIORITY * 2;
    }finally{__CLR4_5_28xs8xsm6lb50b9.R.flushNeeded();}}
}
