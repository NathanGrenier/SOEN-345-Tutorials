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

/* $Id: ImageSize.java 696968 2008-09-19 07:52:04Z jeremias $ */

package org.apache.xmlgraphics.image.loader;

import java.awt.Dimension;
import java.awt.geom.Dimension2D;

import org.apache.xmlgraphics.java2d.Dimension2DDouble;
import org.apache.xmlgraphics.util.UnitConv;

/**
 * Encapsulates the size of an image.
 */
public class ImageSize {public static class __CLR4_5_277z77zm68iyh1b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,9421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int widthPx;
    private int heightPx;

    private int widthMpt;
    private int heightMpt;
    private int baselinePositionFromBottomMpt;

    private double dpiHorizontal;
    private double dpiVertical;


    /**
     * Constructor.
     * @param widthPx the width of the image in pixels
     * @param heightPx the height of the image in pixels
     * @param dpiHorizontal the horizontal resolution in dots per inch
     * @param dpiVertical the vertical resolution in dots per inch
     */
    public ImageSize(int widthPx, int heightPx, double dpiHorizontal, double dpiVertical) {try{__CLR4_5_277z77zm68iyh1b.R.inc(9359);
        __CLR4_5_277z77zm68iyh1b.R.inc(9360);setSizeInPixels(widthPx, heightPx);
        __CLR4_5_277z77zm68iyh1b.R.inc(9361);setResolution(dpiHorizontal, dpiVertical);
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Constructor.
     * @param widthPx the width of the image in pixels
     * @param heightPx the height of the image in pixels
     * @param dpi the resolution in dots per inch
     */
    public ImageSize(int widthPx, int heightPx, double dpi) {
        this(widthPx, heightPx, dpi, dpi);__CLR4_5_277z77zm68iyh1b.R.inc(9363);try{__CLR4_5_277z77zm68iyh1b.R.inc(9362);
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Default Constructor.
     */
    public ImageSize() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9364);
        //nop
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Sets the image's size in pixels.
     * @param width the width in pixels
     * @param height the height in pixels
     */
    public void setSizeInPixels(int width, int height) {try{__CLR4_5_277z77zm68iyh1b.R.inc(9365);
        __CLR4_5_277z77zm68iyh1b.R.inc(9366);this.widthPx = width;
        __CLR4_5_277z77zm68iyh1b.R.inc(9367);this.heightPx = height;
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Sets the image's size in millipoints.
     * @param width the width in millipoints
     * @param height the height in millipoints
     */
    public void setSizeInMillipoints(int width, int height) {try{__CLR4_5_277z77zm68iyh1b.R.inc(9368);
        __CLR4_5_277z77zm68iyh1b.R.inc(9369);this.widthMpt = width;
        __CLR4_5_277z77zm68iyh1b.R.inc(9370);this.heightMpt = height;
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Sets the image's resolution for interpreting the pixel size.
     * @param horizontal the horizontal resolution in dpi
     * @param vertical the vertical resolution in dpi
     */
    public void setResolution(double horizontal, double vertical) {try{__CLR4_5_277z77zm68iyh1b.R.inc(9371);
        __CLR4_5_277z77zm68iyh1b.R.inc(9372);this.dpiHorizontal = horizontal;
        __CLR4_5_277z77zm68iyh1b.R.inc(9373);this.dpiVertical = vertical;
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Sets the image's resolution for interpreting the pixel size.
     * @param resolution the resolution in dpi
     */
    public void setResolution(double resolution) {try{__CLR4_5_277z77zm68iyh1b.R.inc(9374);
        __CLR4_5_277z77zm68iyh1b.R.inc(9375);setResolution(resolution, resolution);
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Sets the vertical position of the baseline of the image relative to the bottom of the image.
     * The default is 0mpt (i.e. the image is bottom-aligned). This is used for MathML images, for
     * example, which have a baseline. Using the value the images can be properly aligned with
     * other text. Most other image don't have an implicit baseline.
     * @param distance the distance from the bottom of the image in millipoints
     */
    public void setBaselinePositionFromBottom(int distance) {try{__CLR4_5_277z77zm68iyh1b.R.inc(9376);
        __CLR4_5_277z77zm68iyh1b.R.inc(9377);this.baselinePositionFromBottomMpt = distance;
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Returns the vertical position of the baseline of the image relative to the bottom of the
     * image. The default is 0mpt (i.e. the image is bottom-aligned). This is used for MathML
     * images, for example, which have a baseline. Using the value the images can be properly
     * aligned with other text. Most other image don't have an implicit baseline.
     * @return the distance from the bottom of the image in millipoints
     */
    public int getBaselinePositionFromBottom() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9378);
        __CLR4_5_277z77zm68iyh1b.R.inc(9379);return this.baselinePositionFromBottomMpt;
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Returns the image's width in pixels.
     * @return the width in pixels
     */
    public int getWidthPx() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9380);
        __CLR4_5_277z77zm68iyh1b.R.inc(9381);return widthPx;
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Returns the image's height in pixels.
     * @return the height in pixels
     */
    public int getHeightPx() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9382);
        __CLR4_5_277z77zm68iyh1b.R.inc(9383);return heightPx;
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Returns the image's width in millipoints.
     * @return the width in millipoints
     */
    public int getWidthMpt() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9384);
        __CLR4_5_277z77zm68iyh1b.R.inc(9385);return widthMpt;
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Returns the image's height in millipoints.
     * @return the height in millipoints
     */
    public int getHeightMpt() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9386);
        __CLR4_5_277z77zm68iyh1b.R.inc(9387);return heightMpt;
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Returns the image's horizontal resolution in dpi (dots per inch).
     * @return the horizontal resolution in dpi
     */
    public double getDpiHorizontal() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9388);
        __CLR4_5_277z77zm68iyh1b.R.inc(9389);return dpiHorizontal;
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Returns the image's vertical resolution in dpi (dots per inch).
     * @return the vertical resolution in dpi
     */
    public double getDpiVertical() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9390);
        __CLR4_5_277z77zm68iyh1b.R.inc(9391);return dpiVertical;
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Returns the size in millipoints as a Dimension object.
     * @return the size in millipoints
     */
    public Dimension getDimensionMpt() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9392);
        __CLR4_5_277z77zm68iyh1b.R.inc(9393);return new Dimension(getWidthMpt(), getHeightMpt());
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Returns the size in points as a Dimension2D object.
     * @return the size in points
     */
    public Dimension2D getDimensionPt() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9394);
        __CLR4_5_277z77zm68iyh1b.R.inc(9395);return new Dimension2DDouble(getWidthMpt() / 1000.0, getHeightMpt() / 1000.0);
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Returns the size in pixels as a Dimension object.
     * @return the size in pixels
     */
    public Dimension getDimensionPx() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9396);
        __CLR4_5_277z77zm68iyh1b.R.inc(9397);return new Dimension(getWidthPx(), getHeightPx());
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    private void checkResolutionAvailable() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9398);
        __CLR4_5_277z77zm68iyh1b.R.inc(9399);if ((((this.dpiHorizontal == 0 || this.dpiVertical == 0)&&(__CLR4_5_277z77zm68iyh1b.R.iget(9400)!=0|true))||(__CLR4_5_277z77zm68iyh1b.R.iget(9401)==0&false))) {{
            __CLR4_5_277z77zm68iyh1b.R.inc(9402);throw new IllegalStateException("The resolution must be set");
        }
    }}finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Calculates the size in millipoints based on the size in pixels and the resolution.
     */
    public void calcSizeFromPixels() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9403);
        __CLR4_5_277z77zm68iyh1b.R.inc(9404);checkResolutionAvailable();
        __CLR4_5_277z77zm68iyh1b.R.inc(9405);this.widthMpt = (int)Math.round(UnitConv.in2mpt(this.widthPx / this.dpiHorizontal));
        __CLR4_5_277z77zm68iyh1b.R.inc(9406);this.heightMpt = (int)Math.round(UnitConv.in2mpt(this.heightPx / this.dpiVertical));
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /**
     * Calculates the size in pixels based on the size in millipoints and the resolution.
     */
    public void calcPixelsFromSize() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9407);
        __CLR4_5_277z77zm68iyh1b.R.inc(9408);checkResolutionAvailable();
        __CLR4_5_277z77zm68iyh1b.R.inc(9409);this.widthPx = (int)Math.round(UnitConv.mpt2in(this.widthMpt * this.dpiHorizontal));
        __CLR4_5_277z77zm68iyh1b.R.inc(9410);this.heightPx = (int)Math.round(UnitConv.mpt2in(this.heightMpt * this.dpiVertical));
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_277z77zm68iyh1b.R.inc(9411);
        __CLR4_5_277z77zm68iyh1b.R.inc(9412);StringBuffer sb = new StringBuffer();
        __CLR4_5_277z77zm68iyh1b.R.inc(9413);sb.append("Size: ");
        __CLR4_5_277z77zm68iyh1b.R.inc(9414);sb.append(getWidthMpt()).append('x').append(getHeightMpt()).append(" mpt");
        __CLR4_5_277z77zm68iyh1b.R.inc(9415);sb.append(" (");
        __CLR4_5_277z77zm68iyh1b.R.inc(9416);sb.append(getWidthPx()).append('x').append(getHeightPx()).append(" px");
        __CLR4_5_277z77zm68iyh1b.R.inc(9417);sb.append(" at ").append(getDpiHorizontal()).append('x').append(getDpiVertical());
        __CLR4_5_277z77zm68iyh1b.R.inc(9418);sb.append(" dpi");
        __CLR4_5_277z77zm68iyh1b.R.inc(9419);sb.append(")");
        __CLR4_5_277z77zm68iyh1b.R.inc(9420);return sb.toString();
    }finally{__CLR4_5_277z77zm68iyh1b.R.flushNeeded();}}

}
