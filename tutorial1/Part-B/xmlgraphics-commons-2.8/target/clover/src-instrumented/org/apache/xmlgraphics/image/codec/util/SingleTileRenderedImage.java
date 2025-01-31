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

/* $Id: SingleTileRenderedImage.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.util;

import java.awt.image.ColorModel;
import java.awt.image.Raster;

// CSOFF: InnerAssignment

/**
 * A simple class that provides RenderedImage functionality
 * given a Raster and a ColorModel.
 *
 * @version $Id: SingleTileRenderedImage.java 1732018 2016-02-24 04:51:06Z gadams $
 */
public class SingleTileRenderedImage extends SimpleRenderedImage {public static class __CLR4_5_271p71pm6lb4zmx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,9147,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Raster ras;

    /**
     * Constructs a SingleTileRenderedImage based on a Raster
     * and a ColorModel.
     *
     * @param ras A Raster that will define tile (0, 0) of the image.
     * @param colorModel A ColorModel that will serve as the image's
     *                   ColorModel.
     */
    public SingleTileRenderedImage(Raster ras, ColorModel colorModel) {try{__CLR4_5_271p71pm6lb4zmx.R.inc(9133);
        __CLR4_5_271p71pm6lb4zmx.R.inc(9134);this.ras = ras;

        __CLR4_5_271p71pm6lb4zmx.R.inc(9135);this.tileGridXOffset = this.minX = ras.getMinX();
        __CLR4_5_271p71pm6lb4zmx.R.inc(9136);this.tileGridYOffset = this.minY = ras.getMinY();
        __CLR4_5_271p71pm6lb4zmx.R.inc(9137);this.tileWidth = this.width = ras.getWidth();
        __CLR4_5_271p71pm6lb4zmx.R.inc(9138);this.tileHeight = this.height = ras.getHeight();
        __CLR4_5_271p71pm6lb4zmx.R.inc(9139);this.sampleModel = ras.getSampleModel();
        __CLR4_5_271p71pm6lb4zmx.R.inc(9140);this.colorModel = colorModel;
    }finally{__CLR4_5_271p71pm6lb4zmx.R.flushNeeded();}}

    /**
     * Returns the image's Raster as tile (0, 0).
     */
    public Raster getTile(int tileX, int tileY) {try{__CLR4_5_271p71pm6lb4zmx.R.inc(9141);
        __CLR4_5_271p71pm6lb4zmx.R.inc(9142);if ((((tileX != 0 || tileY != 0)&&(__CLR4_5_271p71pm6lb4zmx.R.iget(9143)!=0|true))||(__CLR4_5_271p71pm6lb4zmx.R.iget(9144)==0&false))) {{
            __CLR4_5_271p71pm6lb4zmx.R.inc(9145);throw new IllegalArgumentException(PropertyUtil.getString("SingleTileRenderedImage0"));
        }
        }__CLR4_5_271p71pm6lb4zmx.R.inc(9146);return ras;
    }finally{__CLR4_5_271p71pm6lb4zmx.R.flushNeeded();}}
}
