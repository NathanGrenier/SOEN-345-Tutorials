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

/* $Id$ */
package org.apache.xmlgraphics.image.loader.impl;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageProcessingHints;
import org.apache.xmlgraphics.image.loader.ImageSize;
import org.apache.xmlgraphics.java2d.Graphics2DImagePainter;
import org.apache.xmlgraphics.java2d.color.DeviceCMYKColorSpace;

public class ImageConverterG2D2BitmapTestCase {static class __CLR4_5_2icyicym68iyj14{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,23808,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testConvert() {__CLR4_5_2icyicym68iyj14.R.globalSliceStart(getClass().getName(),23794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fbsq20icy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2icyicym68iyj14.R.rethrow($CLV_t2$);}finally{__CLR4_5_2icyicym68iyj14.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.ImageConverterG2D2BitmapTestCase.testConvert",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23794,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fbsq20icy(){try{__CLR4_5_2icyicym68iyj14.R.inc(23794);
        __CLR4_5_2icyicym68iyj14.R.inc(23795);ImageInfo info = new ImageInfo(null, null);
        __CLR4_5_2icyicym68iyj14.R.inc(23796);ImageSize imageSize = new ImageSize(100, 100, 72);
        __CLR4_5_2icyicym68iyj14.R.inc(23797);imageSize.calcSizeFromPixels();
        __CLR4_5_2icyicym68iyj14.R.inc(23798);info.setSize(imageSize);
        __CLR4_5_2icyicym68iyj14.R.inc(23799);HashMap hints = new HashMap();
        __CLR4_5_2icyicym68iyj14.R.inc(23800);hints.put(ImageProcessingHints.TRANSPARENCY_INTENT, ImageProcessingHints.TRANSPARENCY_INTENT_IGNORE);
        __CLR4_5_2icyicym68iyj14.R.inc(23801);hints.put("CMYK", true);
        __CLR4_5_2icyicym68iyj14.R.inc(23802);ImageBuffered image = (ImageBuffered) new ImageConverterG2D2Bitmap().convert(
                new ImageGraphics2D(info, new EmptyGraphics2DImagePainter()), hints);
        __CLR4_5_2icyicym68iyj14.R.inc(23803);Assert.assertEquals(image.getBufferedImage().getColorModel().getNumColorComponents(), 4);
        __CLR4_5_2icyicym68iyj14.R.inc(23804);Assert.assertEquals(image.getColorSpace().getClass(), DeviceCMYKColorSpace.class);
    }finally{__CLR4_5_2icyicym68iyj14.R.flushNeeded();}}

    private static class EmptyGraphics2DImagePainter implements Graphics2DImagePainter {
        public void paint(Graphics2D g2d, Rectangle2D area) {try{__CLR4_5_2icyicym68iyj14.R.inc(23805);
        }finally{__CLR4_5_2icyicym68iyj14.R.flushNeeded();}}

        public Dimension getImageSize() {try{__CLR4_5_2icyicym68iyj14.R.inc(23806);
            __CLR4_5_2icyicym68iyj14.R.inc(23807);return null;
        }finally{__CLR4_5_2icyicym68iyj14.R.flushNeeded();}}
    }
}
