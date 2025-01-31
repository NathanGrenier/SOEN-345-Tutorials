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

/* $Id: ImageRendered.java 995366 2010-09-09 10:02:17Z jeremias $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.RenderedImage;

import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;

/**
 * This class is an implementation of the Image interface exposing a RenderedImage.
 */
public class ImageRendered extends AbstractImage {public static class __CLR4_5_28ej8ejm6lb5050{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,10914,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final RenderedImage red;
    private final Color transparentColor;
    private final ColorSpace colorSpace;
    private final ICC_Profile iccProfile;

    /**
     * Main constructor.
     * @param info the image info object
     * @param red the RenderedImage instance
     * @param transparentColor the transparent color or null
     */
    public ImageRendered(ImageInfo info, RenderedImage red, Color transparentColor) {
        super(info);__CLR4_5_28ej8ejm6lb5050.R.inc(10892);try{__CLR4_5_28ej8ejm6lb5050.R.inc(10891);
        __CLR4_5_28ej8ejm6lb5050.R.inc(10893);this.red = red;
        __CLR4_5_28ej8ejm6lb5050.R.inc(10894);this.transparentColor = transparentColor;
        __CLR4_5_28ej8ejm6lb5050.R.inc(10895);this.colorSpace = red.getColorModel().getColorSpace();
        __CLR4_5_28ej8ejm6lb5050.R.inc(10896);if ((((this.colorSpace instanceof ICC_ColorSpace)&&(__CLR4_5_28ej8ejm6lb5050.R.iget(10897)!=0|true))||(__CLR4_5_28ej8ejm6lb5050.R.iget(10898)==0&false))) {{
            __CLR4_5_28ej8ejm6lb5050.R.inc(10899);ICC_ColorSpace icccs = (ICC_ColorSpace) this.colorSpace;
            __CLR4_5_28ej8ejm6lb5050.R.inc(10900);this.iccProfile = icccs.getProfile();
        } }else {{
            __CLR4_5_28ej8ejm6lb5050.R.inc(10901);this.iccProfile = null;
        }
    }}finally{__CLR4_5_28ej8ejm6lb5050.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor getFlavor() {try{__CLR4_5_28ej8ejm6lb5050.R.inc(10902);
        __CLR4_5_28ej8ejm6lb5050.R.inc(10903);return ImageFlavor.RENDERED_IMAGE;
    }finally{__CLR4_5_28ej8ejm6lb5050.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isCacheable() {try{__CLR4_5_28ej8ejm6lb5050.R.inc(10904);
        __CLR4_5_28ej8ejm6lb5050.R.inc(10905);return true;
    }finally{__CLR4_5_28ej8ejm6lb5050.R.flushNeeded();}}

    /**
     * Returns the contained RenderedImage instance.
     * @return the RenderedImage instance
     */
    public RenderedImage getRenderedImage() {try{__CLR4_5_28ej8ejm6lb5050.R.inc(10906);
        __CLR4_5_28ej8ejm6lb5050.R.inc(10907);return this.red;
    }finally{__CLR4_5_28ej8ejm6lb5050.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ColorSpace getColorSpace() {try{__CLR4_5_28ej8ejm6lb5050.R.inc(10908);
        __CLR4_5_28ej8ejm6lb5050.R.inc(10909);return this.colorSpace;
    }finally{__CLR4_5_28ej8ejm6lb5050.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ICC_Profile getICCProfile() {try{__CLR4_5_28ej8ejm6lb5050.R.inc(10910);
        __CLR4_5_28ej8ejm6lb5050.R.inc(10911);return this.iccProfile;
    }finally{__CLR4_5_28ej8ejm6lb5050.R.flushNeeded();}}

    /**
     * Returns the transparent color if available.
     * @return the transparent color or null
     */
    public Color getTransparentColor() {try{__CLR4_5_28ej8ejm6lb5050.R.inc(10912);
        __CLR4_5_28ej8ejm6lb5050.R.inc(10913);return this.transparentColor;
    }finally{__CLR4_5_28ej8ejm6lb5050.R.flushNeeded();}}

}
