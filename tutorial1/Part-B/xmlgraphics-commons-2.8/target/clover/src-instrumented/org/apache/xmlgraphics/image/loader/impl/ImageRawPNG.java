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

/* $Id: ImageRawPNG.java 1732019 2016-02-24 05:01:10Z gadams $ */

// Original author: Matthias Reichenbacher

package org.apache.xmlgraphics.image.loader.impl;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.ColorModel;
import java.io.InputStream;

import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;

public class ImageRawPNG extends ImageRawStream {public static class __CLR4_5_28bx8bxm6lb5049{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,10838,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ColorModel cm;
    private ICC_Profile iccProfile;
    private int bitDepth;
    private boolean isTransparent;
    private int grayTransparentAlpha;
    private int redTransparentAlpha;
    private int greenTransparentAlpha;
    private int blueTransparentAlpha;
    private int renderingIntent = -1;

    /**
     * Main constructor.
     * @param info the image info object
     * @param in the ImageInputStream with the raw content
     * @param colorModel the color model
     * @param bitDepth the bit depth
     * @param iccProfile an ICC color profile or null if no profile is associated
     */
    public ImageRawPNG(ImageInfo info, InputStream in, ColorModel colorModel, int bitDepth, ICC_Profile iccProfile) {
        super(info, ImageFlavor.RAW_PNG, in);__CLR4_5_28bx8bxm6lb5049.R.inc(10798);try{__CLR4_5_28bx8bxm6lb5049.R.inc(10797);
        __CLR4_5_28bx8bxm6lb5049.R.inc(10799);this.iccProfile = iccProfile;
        __CLR4_5_28bx8bxm6lb5049.R.inc(10800);this.cm = colorModel;
        __CLR4_5_28bx8bxm6lb5049.R.inc(10801);this.bitDepth = bitDepth;
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

    /**
     * The bit depth of each color channel.
     * @return the bit depth of one channel (same for all)
     */
    public int getBitDepth() {try{__CLR4_5_28bx8bxm6lb5049.R.inc(10802);
        __CLR4_5_28bx8bxm6lb5049.R.inc(10803);return bitDepth;
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

    /**
     * Returns the ICC color profile if one is associated with the PNG image.
     * @return the ICC color profile or null if there's no profile
     */
    public ICC_Profile getICCProfile() {try{__CLR4_5_28bx8bxm6lb5049.R.inc(10804);
        __CLR4_5_28bx8bxm6lb5049.R.inc(10805);return this.iccProfile;
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

    /**
     * Returns the image's color model.
     * @return the color model
     */
    public ColorModel getColorModel() {try{__CLR4_5_28bx8bxm6lb5049.R.inc(10806);
        __CLR4_5_28bx8bxm6lb5049.R.inc(10807);return this.cm;
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

    /**
     * Returns the image's color space.
     * @return the color space
     */
    public ColorSpace getColorSpace() {try{__CLR4_5_28bx8bxm6lb5049.R.inc(10808);
        __CLR4_5_28bx8bxm6lb5049.R.inc(10809);return this.cm.getColorSpace();
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

    /**
     * Sets the gray transparent pixel value.
     * @param gray the transparent pixel gray value (0...255)
     */
    protected void setGrayTransparentAlpha(int gray) {try{__CLR4_5_28bx8bxm6lb5049.R.inc(10810);
        __CLR4_5_28bx8bxm6lb5049.R.inc(10811);this.isTransparent = true;
        __CLR4_5_28bx8bxm6lb5049.R.inc(10812);this.grayTransparentAlpha = gray;
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

    /**
     * Sets the RGB transparent pixel values.
     * @param red the transparent pixel red value (0...255)
     * @param green the transparent pixel green value (0...255)
     * @param blue the transparent pixel blue value (0...255)
     */
    protected void setRGBTransparentAlpha(int red, int green, int blue) {try{__CLR4_5_28bx8bxm6lb5049.R.inc(10813);
        __CLR4_5_28bx8bxm6lb5049.R.inc(10814);this.isTransparent = true;
        __CLR4_5_28bx8bxm6lb5049.R.inc(10815);this.redTransparentAlpha = red;
        __CLR4_5_28bx8bxm6lb5049.R.inc(10816);this.greenTransparentAlpha = green;
        __CLR4_5_28bx8bxm6lb5049.R.inc(10817);this.blueTransparentAlpha = blue;
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

    /**
     * Used to flag image as transparent when the image is of pallete type.
     */
    protected void setTransparent() {try{__CLR4_5_28bx8bxm6lb5049.R.inc(10818);
        __CLR4_5_28bx8bxm6lb5049.R.inc(10819);this.isTransparent = true;
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

    /**
     * Whether the image is transparent (meaning there is a transparent pixel)
     * @return true if transparent pixel exists
     */
    public boolean isTransparent() {try{__CLR4_5_28bx8bxm6lb5049.R.inc(10820);
        __CLR4_5_28bx8bxm6lb5049.R.inc(10821);return this.isTransparent;
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

    /**
     * The color of the transparent pixel.
     * @return the color of the transparent pixel.
     */
    public Color getTransparentColor() {try{__CLR4_5_28bx8bxm6lb5049.R.inc(10822);
        __CLR4_5_28bx8bxm6lb5049.R.inc(10823);Color color = null;
        __CLR4_5_28bx8bxm6lb5049.R.inc(10824);if ((((!this.isTransparent)&&(__CLR4_5_28bx8bxm6lb5049.R.iget(10825)!=0|true))||(__CLR4_5_28bx8bxm6lb5049.R.iget(10826)==0&false))) {{
            __CLR4_5_28bx8bxm6lb5049.R.inc(10827);return color;
        }
        }__CLR4_5_28bx8bxm6lb5049.R.inc(10828);if ((((cm.getNumColorComponents() == 3)&&(__CLR4_5_28bx8bxm6lb5049.R.iget(10829)!=0|true))||(__CLR4_5_28bx8bxm6lb5049.R.iget(10830)==0&false))) {{
            __CLR4_5_28bx8bxm6lb5049.R.inc(10831);color = new Color(this.redTransparentAlpha, this.greenTransparentAlpha, this.blueTransparentAlpha);
        } }else {{
            __CLR4_5_28bx8bxm6lb5049.R.inc(10832);color = new Color(this.grayTransparentAlpha, 0, 0);
        }
        }__CLR4_5_28bx8bxm6lb5049.R.inc(10833);return color;
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

    /**
     * Used to set the rendering intent when the color space is sRGB.
     * @param intent the rendering intent of the sRGB color space
     */
    public void setRenderingIntent(int intent) {try{__CLR4_5_28bx8bxm6lb5049.R.inc(10834);
        __CLR4_5_28bx8bxm6lb5049.R.inc(10835);renderingIntent = intent;
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

    /**
     * Returns the rendering intent of the sRGB color space.
     * @return the rendering intent
     */
    public int getRenderingIntent() {try{__CLR4_5_28bx8bxm6lb5049.R.inc(10836);
      __CLR4_5_28bx8bxm6lb5049.R.inc(10837);return this.renderingIntent;
    }finally{__CLR4_5_28bx8bxm6lb5049.R.flushNeeded();}}

}
