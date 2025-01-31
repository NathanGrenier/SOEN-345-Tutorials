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

/* $Id: ImageConverterBitmap2G2D.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.RenderedImage;
import java.util.Map;

import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.java2d.Graphics2DImagePainter;

/**
 * This ImageConverter wraps a bitmap image in a Graphics2D image.
 */
public class ImageConverterBitmap2G2D extends AbstractImageConverter {public static class __CLR4_5_27si7sim6lb4zwm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,10127,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** {@inheritDoc} */
    public Image convert(Image src, Map hints) {try{__CLR4_5_27si7sim6lb4zwm.R.inc(10098);
        __CLR4_5_27si7sim6lb4zwm.R.inc(10099);checkSourceFlavor(src);
        assert (((src instanceof ImageRendered)&&(__CLR4_5_27si7sim6lb4zwm.R.iget(10100)!=0|true))||(__CLR4_5_27si7sim6lb4zwm.R.iget(10101)==0&false));
        __CLR4_5_27si7sim6lb4zwm.R.inc(10102);final ImageRendered rendImage = (ImageRendered)src;

        __CLR4_5_27si7sim6lb4zwm.R.inc(10103);Graphics2DImagePainterImpl painter = new Graphics2DImagePainterImpl(rendImage);
        __CLR4_5_27si7sim6lb4zwm.R.inc(10104);ImageGraphics2D g2dImage = new ImageGraphics2D(src.getInfo(), painter);
        __CLR4_5_27si7sim6lb4zwm.R.inc(10105);return g2dImage;
    }finally{__CLR4_5_27si7sim6lb4zwm.R.flushNeeded();}}

    static class Graphics2DImagePainterImpl implements Graphics2DImagePainter {
        ImageRendered rendImage;
        public Graphics2DImagePainterImpl(ImageRendered rendImage) {try{__CLR4_5_27si7sim6lb4zwm.R.inc(10106);
            __CLR4_5_27si7sim6lb4zwm.R.inc(10107);this.rendImage = rendImage;
        }finally{__CLR4_5_27si7sim6lb4zwm.R.flushNeeded();}}
        public Dimension getImageSize() {try{__CLR4_5_27si7sim6lb4zwm.R.inc(10108);
            __CLR4_5_27si7sim6lb4zwm.R.inc(10109);return rendImage.getSize().getDimensionMpt();
        }finally{__CLR4_5_27si7sim6lb4zwm.R.flushNeeded();}}
        public void paint(Graphics2D g2d, Rectangle2D area) {try{__CLR4_5_27si7sim6lb4zwm.R.inc(10110);
            __CLR4_5_27si7sim6lb4zwm.R.inc(10111);RenderedImage ri = rendImage.getRenderedImage();
            __CLR4_5_27si7sim6lb4zwm.R.inc(10112);double w = area.getWidth();
            __CLR4_5_27si7sim6lb4zwm.R.inc(10113);double h = area.getHeight();

            __CLR4_5_27si7sim6lb4zwm.R.inc(10114);AffineTransform at = new AffineTransform();
            __CLR4_5_27si7sim6lb4zwm.R.inc(10115);at.translate(area.getX(), area.getY());
            //Scale image to fit
            __CLR4_5_27si7sim6lb4zwm.R.inc(10116);double sx = w / ri.getWidth();
            __CLR4_5_27si7sim6lb4zwm.R.inc(10117);double sy = h / ri.getHeight();
            __CLR4_5_27si7sim6lb4zwm.R.inc(10118);if ((((sx != 1.0 || sy != 1.0)&&(__CLR4_5_27si7sim6lb4zwm.R.iget(10119)!=0|true))||(__CLR4_5_27si7sim6lb4zwm.R.iget(10120)==0&false))) {{
                __CLR4_5_27si7sim6lb4zwm.R.inc(10121);at.scale(sx, sy);
            }
            }__CLR4_5_27si7sim6lb4zwm.R.inc(10122);g2d.drawRenderedImage(ri, at);
        }finally{__CLR4_5_27si7sim6lb4zwm.R.flushNeeded();}}
    }

    /** {@inheritDoc} */
    public ImageFlavor getSourceFlavor() {try{__CLR4_5_27si7sim6lb4zwm.R.inc(10123);
        __CLR4_5_27si7sim6lb4zwm.R.inc(10124);return ImageFlavor.RENDERED_IMAGE;
    }finally{__CLR4_5_27si7sim6lb4zwm.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor getTargetFlavor() {try{__CLR4_5_27si7sim6lb4zwm.R.inc(10125);
        __CLR4_5_27si7sim6lb4zwm.R.inc(10126);return ImageFlavor.GRAPHICS2D;
    }finally{__CLR4_5_27si7sim6lb4zwm.R.flushNeeded();}}

}
