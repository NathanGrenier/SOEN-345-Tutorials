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

/* $Id: GraphicsConfigurationWithTransparency.java 1862543 2019-07-04 09:25:38Z ssteiner $ */

package org.apache.xmlgraphics.java2d;

import java.awt.GraphicsDevice;
import java.awt.Rectangle;
import java.awt.Transparency;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

/**
 * An implementation of {@link java.awt.GraphicsConfiguration} that supports transparencies (alpha
 * channels).
 */
public class GraphicsConfigurationWithTransparency extends AbstractGraphicsConfiguration {public static class __CLR4_5_2bilbilm68iyhsa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,14949,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // We use this to get a good colormodel..
    private static final BufferedImage BI_WITH_ALPHA =
        new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
    // We use this to get a good colormodel..
    private static final BufferedImage BI_WITHOUT_ALPHA =
        new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);

    /**
     * Construct a buffered image with an alpha channel, unless transparency is OPAQUE (no alpha
     * at all).
     *
     * @param width the width of the image
     * @param height the height of the image
     * @param transparency the alpha value of the image
     * @return the new buffered image
     */
    public BufferedImage createCompatibleImage(int width, int height, int transparency) {try{__CLR4_5_2bilbilm68iyhsa.R.inc(14925);
        __CLR4_5_2bilbilm68iyhsa.R.inc(14926);if ((((transparency == Transparency.OPAQUE)&&(__CLR4_5_2bilbilm68iyhsa.R.iget(14927)!=0|true))||(__CLR4_5_2bilbilm68iyhsa.R.iget(14928)==0&false))) {{
            __CLR4_5_2bilbilm68iyhsa.R.inc(14929);return new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        } }else {{
            __CLR4_5_2bilbilm68iyhsa.R.inc(14930);return new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        }
    }}finally{__CLR4_5_2bilbilm68iyhsa.R.flushNeeded();}}

    /**
     * Construct a buffered image with an alpha channel.
     *
     * @param width the width of the image
     * @param height the height of the image
     * @return the new buffered image
     */
    public BufferedImage createCompatibleImage(int width, int height) {try{__CLR4_5_2bilbilm68iyhsa.R.inc(14931);
        __CLR4_5_2bilbilm68iyhsa.R.inc(14932);return new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    }finally{__CLR4_5_2bilbilm68iyhsa.R.flushNeeded();}}

    /**
     * TODO: This should return the page bounds in Pts,  I couldn't figure out how to get this for
     * the current page (this still works for now, but it should be fixed...).
     *
     * @return the bounds of the document page
     */
    public Rectangle getBounds() {try{__CLR4_5_2bilbilm68iyhsa.R.inc(14933);
        __CLR4_5_2bilbilm68iyhsa.R.inc(14934);return new Rectangle();
    }finally{__CLR4_5_2bilbilm68iyhsa.R.flushNeeded();}}

    /**
     * Return a good default color model for this 'device'.
     * @return the colour model for the configuration
     */
    public ColorModel getColorModel() {try{__CLR4_5_2bilbilm68iyhsa.R.inc(14935);
        __CLR4_5_2bilbilm68iyhsa.R.inc(14936);return BI_WITH_ALPHA.getColorModel();
    }finally{__CLR4_5_2bilbilm68iyhsa.R.flushNeeded();}}

    /**
     * Return a good color model given <code>transparency</code>
     *
     * @param transparency the alpha value for the colour model
     * @return the colour model for the configuration
     */
    public ColorModel getColorModel(int transparency) {try{__CLR4_5_2bilbilm68iyhsa.R.inc(14937);
        __CLR4_5_2bilbilm68iyhsa.R.inc(14938);if ((((transparency == Transparency.OPAQUE)&&(__CLR4_5_2bilbilm68iyhsa.R.iget(14939)!=0|true))||(__CLR4_5_2bilbilm68iyhsa.R.iget(14940)==0&false))) {{
            __CLR4_5_2bilbilm68iyhsa.R.inc(14941);return BI_WITHOUT_ALPHA.getColorModel();
        } }else {{
            __CLR4_5_2bilbilm68iyhsa.R.inc(14942);return BI_WITH_ALPHA.getColorModel();
        }
    }}finally{__CLR4_5_2bilbilm68iyhsa.R.flushNeeded();}}

    /**
     * The default transform (1:1).
     *
     * @return the default transform for the configuration
     */
    public AffineTransform getDefaultTransform() {try{__CLR4_5_2bilbilm68iyhsa.R.inc(14943);
        __CLR4_5_2bilbilm68iyhsa.R.inc(14944);return new AffineTransform();
    }finally{__CLR4_5_2bilbilm68iyhsa.R.flushNeeded();}}

    /**
     * The normalizing transform (1:1) (since we currently
     * render images at 72dpi, which we might want to change
     * in the future).
     *
     * @return the normalizing transform for the configuration
     */
    public AffineTransform getNormalizingTransform() {try{__CLR4_5_2bilbilm68iyhsa.R.inc(14945);
        __CLR4_5_2bilbilm68iyhsa.R.inc(14946);return new AffineTransform(2, 0, 0, 2, 0, 0);
    }finally{__CLR4_5_2bilbilm68iyhsa.R.flushNeeded();}}

    /**
     * Return our dummy instance of GraphicsDevice
     *
     * @return the graphics device
     */
    public GraphicsDevice getDevice() {try{__CLR4_5_2bilbilm68iyhsa.R.inc(14947);
        __CLR4_5_2bilbilm68iyhsa.R.inc(14948);return new GenericGraphicsDevice(this);
    }finally{__CLR4_5_2bilbilm68iyhsa.R.flushNeeded();}}
}
