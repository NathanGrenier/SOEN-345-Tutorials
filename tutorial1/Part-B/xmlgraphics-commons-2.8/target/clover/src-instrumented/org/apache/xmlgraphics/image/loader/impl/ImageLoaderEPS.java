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

/* $Id: ImageLoaderEPS.java 1391005 2012-09-27 13:39:57Z mehdi $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.transform.Source;

import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.io.XmlSourceUtil;
import org.apache.xmlgraphics.util.MimeConstants;
import org.apache.xmlgraphics.util.io.SubInputStream;

/**
 * ImageLoader for EPS (Encapsulated PostScript) images.
 */
public class ImageLoaderEPS extends AbstractImageLoader {public static class __CLR4_5_27xk7xkm6lb4zyi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,10300,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Main constructor.
     */
    public ImageLoaderEPS() {try{__CLR4_5_27xk7xkm6lb4zyi.R.inc(10280);
    }finally{__CLR4_5_27xk7xkm6lb4zyi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor getTargetFlavor() {try{__CLR4_5_27xk7xkm6lb4zyi.R.inc(10281);
        __CLR4_5_27xk7xkm6lb4zyi.R.inc(10282);return ImageFlavor.RAW_EPS;
    }finally{__CLR4_5_27xk7xkm6lb4zyi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Image loadImage(ImageInfo info, Map hints, ImageSessionContext session)
                throws ImageException, IOException {try{__CLR4_5_27xk7xkm6lb4zyi.R.inc(10283);
        __CLR4_5_27xk7xkm6lb4zyi.R.inc(10284);if ((((!MimeConstants.MIME_EPS.equals(info.getMimeType()))&&(__CLR4_5_27xk7xkm6lb4zyi.R.iget(10285)!=0|true))||(__CLR4_5_27xk7xkm6lb4zyi.R.iget(10286)==0&false))) {{
            __CLR4_5_27xk7xkm6lb4zyi.R.inc(10287);throw new IllegalArgumentException(
                    "ImageInfo must be from a image with MIME type: " + MimeConstants.MIME_EPS);
        }
        }__CLR4_5_27xk7xkm6lb4zyi.R.inc(10288);Source src = session.needSource(info.getOriginalURI());
        __CLR4_5_27xk7xkm6lb4zyi.R.inc(10289);InputStream in = XmlSourceUtil.needInputStream(src);
        __CLR4_5_27xk7xkm6lb4zyi.R.inc(10290);XmlSourceUtil.removeStreams(src); //so others cannot close them, we take them over

        __CLR4_5_27xk7xkm6lb4zyi.R.inc(10291);PreloaderEPS.EPSBinaryFileHeader binaryHeader;
        __CLR4_5_27xk7xkm6lb4zyi.R.inc(10292);binaryHeader = (PreloaderEPS.EPSBinaryFileHeader)info.getCustomObjects().get(
                PreloaderEPS.EPS_BINARY_HEADER);
        __CLR4_5_27xk7xkm6lb4zyi.R.inc(10293);if ((((binaryHeader != null)&&(__CLR4_5_27xk7xkm6lb4zyi.R.iget(10294)!=0|true))||(__CLR4_5_27xk7xkm6lb4zyi.R.iget(10295)==0&false))) {{
            //Binary EPS: just extract the EPS part
            __CLR4_5_27xk7xkm6lb4zyi.R.inc(10296);in.skip(binaryHeader.getPSStart());
            __CLR4_5_27xk7xkm6lb4zyi.R.inc(10297);in = new SubInputStream(in, binaryHeader.getPSLength(), true);
        }

        }__CLR4_5_27xk7xkm6lb4zyi.R.inc(10298);ImageRawEPS epsImage = new ImageRawEPS(info, in);
        __CLR4_5_27xk7xkm6lb4zyi.R.inc(10299);return epsImage;
    }finally{__CLR4_5_27xk7xkm6lb4zyi.R.flushNeeded();}}

}
