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

/* $Id: RenderedImageCachableRed.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.rendered;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.util.Vector;

// CSOFF: NeedBraces
// CSOFF: WhitespaceAround

/**
 * This implements CachableRed around a RenderedImage.
 * You can use this to wrap a RenderedImage that you want to
 * appear as a CachableRed.
 * It essentially ignores the dependency and dirty region methods.
 *
 * @version $Id: RenderedImageCachableRed.java 1732018 2016-02-24 04:51:06Z gadams $
 *
 * Originally authored by Thomas DeWeese.
 */
public class RenderedImageCachableRed implements CachableRed {public static class __CLR4_5_2ajoajom6lb50mp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,13732,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static CachableRed wrap(RenderedImage ri) {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13668);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13669);if ((((ri instanceof CachableRed)&&(__CLR4_5_2ajoajom6lb50mp.R.iget(13670)!=0|true))||(__CLR4_5_2ajoajom6lb50mp.R.iget(13671)==0&false))) {{
            __CLR4_5_2ajoajom6lb50mp.R.inc(13672);return (CachableRed) ri;
        }
        }__CLR4_5_2ajoajom6lb50mp.R.inc(13673);if ((((ri instanceof BufferedImage)&&(__CLR4_5_2ajoajom6lb50mp.R.iget(13674)!=0|true))||(__CLR4_5_2ajoajom6lb50mp.R.iget(13675)==0&false))) {{
            __CLR4_5_2ajoajom6lb50mp.R.inc(13676);return new BufferedImageCachableRed((BufferedImage)ri);
        }
        }__CLR4_5_2ajoajom6lb50mp.R.inc(13677);return new RenderedImageCachableRed(ri);
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    private RenderedImage src;
    private Vector srcs = new Vector(0);

    public RenderedImageCachableRed(RenderedImage src) {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13678);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13679);if ((((src == null)&&(__CLR4_5_2ajoajom6lb50mp.R.iget(13680)!=0|true))||(__CLR4_5_2ajoajom6lb50mp.R.iget(13681)==0&false))) {{
            __CLR4_5_2ajoajom6lb50mp.R.inc(13682);throw new NullPointerException();
        }
        }__CLR4_5_2ajoajom6lb50mp.R.inc(13683);this.src = src;
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public Vector getSources() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13684);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13685);return srcs; // should always be empty...
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public Rectangle getBounds() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13686);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13687);return new Rectangle(getMinX(),    // could we cache the rectangle??
                             getMinY(),
                             getWidth(),
                             getHeight());
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public int getMinX() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13688);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13689);return src.getMinX();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}
    public int getMinY() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13690);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13691);return src.getMinY();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public int getWidth() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13692);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13693);return src.getWidth();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}
    public int getHeight() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13694);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13695);return src.getHeight();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public ColorModel getColorModel() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13696);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13697);return src.getColorModel();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public SampleModel getSampleModel() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13698);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13699);return src.getSampleModel();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public int getMinTileX() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13700);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13701);return src.getMinTileX();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}
    public int getMinTileY() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13702);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13703);return src.getMinTileY();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public int getNumXTiles() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13704);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13705);return src.getNumXTiles();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}
    public int getNumYTiles() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13706);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13707);return src.getNumYTiles();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public int getTileGridXOffset() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13708);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13709);return src.getTileGridXOffset();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public int getTileGridYOffset() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13710);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13711);return src.getTileGridYOffset();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public int getTileWidth() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13712);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13713);return src.getTileWidth();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}
    public int getTileHeight() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13714);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13715);return src.getTileHeight();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public Object getProperty(String name) {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13716);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13717);return src.getProperty(name);
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public String[] getPropertyNames() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13718);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13719);return src.getPropertyNames();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public Raster getTile(int tileX, int tileY) {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13720);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13721);return src.getTile(tileX, tileY);
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public WritableRaster copyData(WritableRaster raster) {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13722);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13723);return src.copyData(raster);
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public Raster getData() {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13724);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13725);return src.getData();
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public Raster getData(Rectangle rect) {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13726);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13727);return src.getData(rect);
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public Shape getDependencyRegion(int srcIndex, Rectangle outputRgn) {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13728);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13729);throw new IndexOutOfBoundsException(
            "Nonexistant source requested.");
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}

    public Shape getDirtyRegion(int srcIndex, Rectangle inputRgn) {try{__CLR4_5_2ajoajom6lb50mp.R.inc(13730);
        __CLR4_5_2ajoajom6lb50mp.R.inc(13731);throw new IndexOutOfBoundsException(
            "Nonexistant source requested.");
    }finally{__CLR4_5_2ajoajom6lb50mp.R.flushNeeded();}}
}
