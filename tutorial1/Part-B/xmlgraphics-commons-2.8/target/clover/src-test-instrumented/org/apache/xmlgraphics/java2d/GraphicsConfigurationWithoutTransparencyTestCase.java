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

package org.apache.xmlgraphics.java2d;

import java.awt.GraphicsConfiguration;
import java.awt.Transparency;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphicsConfigurationWithoutTransparencyTestCase {static class __CLR4_5_2isjisjm68iyj5h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,24376,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ColorModel nonTransparencyColorModel;
    private GraphicsConfiguration sut;

    @Before
    public void setUp() {try{__CLR4_5_2isjisjm68iyj5h.R.inc(24355);
        __CLR4_5_2isjisjm68iyj5h.R.inc(24356);sut = new GraphicsConfigurationWithoutTransparency();
        __CLR4_5_2isjisjm68iyj5h.R.inc(24357);nonTransparencyColorModel = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB).getColorModel();
    }finally{__CLR4_5_2isjisjm68iyj5h.R.flushNeeded();}}

    @Test
    public void testGetNormalizationTransformation() {__CLR4_5_2isjisjm68iyj5h.R.globalSliceStart(getClass().getName(),24358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qb0s8nism();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2isjisjm68iyj5h.R.rethrow($CLV_t2$);}finally{__CLR4_5_2isjisjm68iyj5h.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.GraphicsConfigurationWithoutTransparencyTestCase.testGetNormalizationTransformation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24358,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qb0s8nism(){try{__CLR4_5_2isjisjm68iyj5h.R.inc(24358);
        __CLR4_5_2isjisjm68iyj5h.R.inc(24359);AffineTransform transform = new AffineTransform(2, 0, 0, 2, 0, 0);
        __CLR4_5_2isjisjm68iyj5h.R.inc(24360);assertEquals(transform, sut.getNormalizingTransform());
    }finally{__CLR4_5_2isjisjm68iyj5h.R.flushNeeded();}}

    void testImage(int width, int height, boolean hasTransparency, BufferedImage image) {try{__CLR4_5_2isjisjm68iyj5h.R.inc(24361);
        __CLR4_5_2isjisjm68iyj5h.R.inc(24362);assertEquals(width, image.getWidth());
        __CLR4_5_2isjisjm68iyj5h.R.inc(24363);assertEquals(height, image.getHeight());
        __CLR4_5_2isjisjm68iyj5h.R.inc(24364);assertEquals(hasTransparency, image.getColorModel().hasAlpha());
    }finally{__CLR4_5_2isjisjm68iyj5h.R.flushNeeded();}}

    @Test
    public void testCreateCompatibleImage() {__CLR4_5_2isjisjm68iyj5h.R.globalSliceStart(getClass().getName(),24365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2htkflsist();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2isjisjm68iyj5h.R.rethrow($CLV_t2$);}finally{__CLR4_5_2isjisjm68iyj5h.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.GraphicsConfigurationWithoutTransparencyTestCase.testCreateCompatibleImage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24365,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2htkflsist(){try{__CLR4_5_2isjisjm68iyj5h.R.inc(24365);
        __CLR4_5_2isjisjm68iyj5h.R.inc(24366);testImage(1, 2, false, sut.createCompatibleImage(1, 2, Transparency.TRANSLUCENT));
        __CLR4_5_2isjisjm68iyj5h.R.inc(24367);testImage(100, 90, false, sut.createCompatibleImage(100, 90, Transparency.TRANSLUCENT));
        __CLR4_5_2isjisjm68iyj5h.R.inc(24368);testImage(1, 2, false, sut.createCompatibleImage(1, 2, Transparency.OPAQUE));
        __CLR4_5_2isjisjm68iyj5h.R.inc(24369);testImage(1010, 2020, false, sut.createCompatibleImage(1010, 2020, Transparency.OPAQUE));

        // test the 2 argument overriden method
        __CLR4_5_2isjisjm68iyj5h.R.inc(24370);testImage(1, 2, false, sut.createCompatibleImage(1, 2));
        __CLR4_5_2isjisjm68iyj5h.R.inc(24371);testImage(1010, 2020, false, sut.createCompatibleImage(1010, 2020));
    }finally{__CLR4_5_2isjisjm68iyj5h.R.flushNeeded();}}

    @Test
    public void testGetColorModel() {__CLR4_5_2isjisjm68iyj5h.R.globalSliceStart(getClass().getName(),24372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24uawi9it0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2isjisjm68iyj5h.R.rethrow($CLV_t2$);}finally{__CLR4_5_2isjisjm68iyj5h.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.GraphicsConfigurationWithoutTransparencyTestCase.testGetColorModel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24372,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24uawi9it0(){try{__CLR4_5_2isjisjm68iyj5h.R.inc(24372);
        __CLR4_5_2isjisjm68iyj5h.R.inc(24373);assertEquals(nonTransparencyColorModel, sut.getColorModel());

        __CLR4_5_2isjisjm68iyj5h.R.inc(24374);assertEquals(nonTransparencyColorModel, sut.getColorModel(Transparency.TRANSLUCENT));
        __CLR4_5_2isjisjm68iyj5h.R.inc(24375);assertEquals(nonTransparencyColorModel, sut.getColorModel(Transparency.OPAQUE));
    }finally{__CLR4_5_2isjisjm68iyj5h.R.flushNeeded();}}
}
