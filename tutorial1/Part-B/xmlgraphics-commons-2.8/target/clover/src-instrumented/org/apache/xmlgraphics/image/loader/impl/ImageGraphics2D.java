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

/* $Id: ImageGraphics2D.java 1784728 2017-02-28 11:53:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.java2d.Graphics2DImagePainter;

/**
 * This class is an implementation of the Image interface exposing a Graphics2DImagePainter.
 */
public class ImageGraphics2D extends AbstractImage {public static class __CLR4_5_27x47x4m68iyh6h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,10280,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Graphics2DImagePainter painter;

    /**
     * Main constructor.
     * @param info the image info object
     * @param painter the image painter that will paint the Java2D image
     */
    public ImageGraphics2D(ImageInfo info, Graphics2DImagePainter painter) {
        super(info);__CLR4_5_27x47x4m68iyh6h.R.inc(10265);try{__CLR4_5_27x47x4m68iyh6h.R.inc(10264);
        __CLR4_5_27x47x4m68iyh6h.R.inc(10266);setGraphics2DImagePainter(painter);
    }finally{__CLR4_5_27x47x4m68iyh6h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor getFlavor() {try{__CLR4_5_27x47x4m68iyh6h.R.inc(10267);
        __CLR4_5_27x47x4m68iyh6h.R.inc(10268);return ImageFlavor.GRAPHICS2D;
    }finally{__CLR4_5_27x47x4m68iyh6h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isCacheable() {try{__CLR4_5_27x47x4m68iyh6h.R.inc(10269);
        __CLR4_5_27x47x4m68iyh6h.R.inc(10270);Image img = getInfo().getOriginalImage();
        __CLR4_5_27x47x4m68iyh6h.R.inc(10271);if ((((img == null)&&(__CLR4_5_27x47x4m68iyh6h.R.iget(10272)!=0|true))||(__CLR4_5_27x47x4m68iyh6h.R.iget(10273)==0&false))) {{
            __CLR4_5_27x47x4m68iyh6h.R.inc(10274);return true;
        }
        }__CLR4_5_27x47x4m68iyh6h.R.inc(10275);return img.isCacheable();
    }finally{__CLR4_5_27x47x4m68iyh6h.R.flushNeeded();}}

    /**
     * Returns the contained Graphics2DImagePainter instance.
     * @return the image painter
     */
    public Graphics2DImagePainter getGraphics2DImagePainter() {try{__CLR4_5_27x47x4m68iyh6h.R.inc(10276);
        __CLR4_5_27x47x4m68iyh6h.R.inc(10277);return this.painter;
    }finally{__CLR4_5_27x47x4m68iyh6h.R.flushNeeded();}}

    /**
     * Sets the Graphics2DImagePainter instance.
     * @param painter the image painter
     */
    public void setGraphics2DImagePainter(Graphics2DImagePainter painter) {try{__CLR4_5_27x47x4m68iyh6h.R.inc(10278);
        __CLR4_5_27x47x4m68iyh6h.R.inc(10279);this.painter = painter;
    }finally{__CLR4_5_27x47x4m68iyh6h.R.flushNeeded();}}

}
