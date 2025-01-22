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

/* $Id: PSGraphics2DTestCase.java 1903802 2022-09-01 09:35:58Z ssteiner $ */

package org.apache.xmlgraphics.java2d.ps;

import java.awt.AlphaComposite;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.TexturePaint;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.xmlgraphics.java2d.GraphicContext;
import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.PSState;

public class PSGraphics2DTestCase {static class __CLR4_5_2ivxivxm68iyj6m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,24559,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private PSGenerator gen;
    private PSGraphics2D gfx2d;
    private final AffineTransform transform = new AffineTransform(1, 0, 0, -1, 0, 792);

    @Before
    public void setup() {try{__CLR4_5_2ivxivxm68iyj6m.R.inc(24477);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24478);gen = mock(PSGenerator.class);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24479);createGraphics2D();
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24480);PSState pState = new PSState();
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24481);when(gen.getCurrentState()).thenReturn(pState);
    }finally{__CLR4_5_2ivxivxm68iyj6m.R.flushNeeded();}}

    private void createGraphics2D() {try{__CLR4_5_2ivxivxm68iyj6m.R.inc(24482);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24483);gfx2d = new PSGraphics2D(false, gen);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24484);gfx2d.setGraphicContext(new GraphicContext());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24485);gfx2d.setTransform(transform);
    }finally{__CLR4_5_2ivxivxm68iyj6m.R.flushNeeded();}}

    @Test
    public void draw() throws IOException {__CLR4_5_2ivxivxm68iyj6m.R.globalSliceStart(getClass().getName(),24486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qslrzpiw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ivxivxm68iyj6m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ivxivxm68iyj6m.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.ps.PSGraphics2DTestCase.draw",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qslrzpiw6() throws IOException{try{__CLR4_5_2ivxivxm68iyj6m.R.inc(24486);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24487);assertEquals(gfx2d.getTransform(), transform);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24488);gfx2d.draw(new Rectangle(10, 10, 100, 100));
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24489);verify(gen, times(1)).concatMatrix(transform);
    }finally{__CLR4_5_2ivxivxm68iyj6m.R.flushNeeded();}}

    @Test
    public void testShouldBeClipped() {__CLR4_5_2ivxivxm68iyj6m.R.globalSliceStart(getClass().getName(),24490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gh1pmqiwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ivxivxm68iyj6m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ivxivxm68iyj6m.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.ps.PSGraphics2DTestCase.testShouldBeClipped",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gh1pmqiwa(){try{__CLR4_5_2ivxivxm68iyj6m.R.inc(24490);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24491);Shape line = new Line2D.Float(10, 10, 50, 50);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24492);Shape clipArea = new Rectangle2D.Float(20, 20, 100, 100);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24493);assertTrue(gfx2d.shouldBeClipped(clipArea, line));
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24494);Shape rect = new Rectangle2D.Float(30, 30, 40, 40);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24495);assertFalse(gfx2d.shouldBeClipped(clipArea, rect));
    }finally{__CLR4_5_2ivxivxm68iyj6m.R.flushNeeded();}}

    @Test
    public void testFill() {__CLR4_5_2ivxivxm68iyj6m.R.globalSliceStart(getClass().getName(),24496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m9bwv8iwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ivxivxm68iyj6m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ivxivxm68iyj6m.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.ps.PSGraphics2DTestCase.testFill",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m9bwv8iwg(){try{__CLR4_5_2ivxivxm68iyj6m.R.inc(24496);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24497);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24498);PSGenerator gen = new PSGenerator(out);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24499);PSGraphics2D p = new PSGraphics2D(false, gen);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24500);p.setGraphicContext(new GraphicContext());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24501);p.fill(new RoundRectangle2D.Float());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24502);out.reset();

        __CLR4_5_2ivxivxm68iyj6m.R.inc(24503);p.fill(new RoundRectangle2D.Float());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24504);assertEquals(out.toString(),
                "GS\nN\n/f1943450110{0 0 M\n0 0 L\n0 0 0 0 0 0 C\n0 0 L\n0 0 0 0 0 0 C\n"
                        + "0 0 L\n0 0 0 0 0 0 C\n0 0 L\n0 0 0 0 0 0 C\ncp}def\nf1943450110\nf\nGR\n");
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24505);out.reset();

        __CLR4_5_2ivxivxm68iyj6m.R.inc(24506);BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24507);p.drawImage(img, 0, 0, null);

        __CLR4_5_2ivxivxm68iyj6m.R.inc(24508);String res = "[1 0 0 1 0 0] CT\n"
                + "GS\n"
                + "0 0 translate\n"
                + "%AXGBeginBitmap: java.awt.image.BufferedImage\n"
                + "{{\n"
                + "/RawData currentfile /ASCII85Decode filter def\n"
                + "/Data RawData /FlateDecode filter def\n"
                + "/DeviceRGB setcolorspace\n";

        __CLR4_5_2ivxivxm68iyj6m.R.inc(24509);assertTrue(out.toString(), out.toString().startsWith("GS\n" + res));
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24510);out.reset();

        __CLR4_5_2ivxivxm68iyj6m.R.inc(24511);p.drawRenderedImage(img, new AffineTransform());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24512);assertTrue(out.toString(), out.toString().startsWith("GS\n[1 0 0 1 0 0] CT\n" + res));

        __CLR4_5_2ivxivxm68iyj6m.R.inc(24513);out.reset();

        __CLR4_5_2ivxivxm68iyj6m.R.inc(24514);p.writeClip(new RoundRectangle2D.Float());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24515);assertEquals(out.toString(), "N\n"
                + "0 0 M\n"
                + "0 0 L\n"
                + "0 0 0 0 0 0 C\n"
                + "0 0 L\n"
                + "0 0 0 0 0 0 C\n"
                + "0 0 L\n"
                + "0 0 0 0 0 0 C\n"
                + "0 0 L\n"
                + "0 0 0 0 0 0 C\n"
                + "cp\n"
                + "clip\n");
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24516);out.reset();

        __CLR4_5_2ivxivxm68iyj6m.R.inc(24517);p.drawString("hi", 0f, 0f);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24518);assertTrue(out.toString(), out.toString().startsWith("GS\nN\n/f"));
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24519);out.reset();

        __CLR4_5_2ivxivxm68iyj6m.R.inc(24520);TexturePaint tp = new TexturePaint(img, new Rectangle());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24521);p.setPaint(tp);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24522);p.fill(new Rectangle());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24523);assertTrue(out.toString().startsWith("GS\n<<\n/PatternType 1\n"));

        __CLR4_5_2ivxivxm68iyj6m.R.inc(24524);p.dispose();
    }finally{__CLR4_5_2ivxivxm68iyj6m.R.flushNeeded();}}

    @Test
    public void testAcrobatDownsample() {__CLR4_5_2ivxivxm68iyj6m.R.globalSliceStart(getClass().getName(),24525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28d1nmxix9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ivxivxm68iyj6m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ivxivxm68iyj6m.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.ps.PSGraphics2DTestCase.testAcrobatDownsample",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24525,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28d1nmxix9(){try{__CLR4_5_2ivxivxm68iyj6m.R.inc(24525);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24526);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24527);PSGenerator gen = new PSGenerator(out);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24528);PSGraphics2D p = new PSGraphics2D(false, gen);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24529);p.setGraphicContext(new GraphicContext());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24530);BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24531);TexturePaint tp = new TexturePaint(img, new Rectangle());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24532);p.setPaint(tp);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24533);p.fill(new Rectangle());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24534);assertTrue(out.toString().contains("1 1 8 matrix\n{<\nffffff\n>} false 3 colorimage"));
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24535);out.reset();

        __CLR4_5_2ivxivxm68iyj6m.R.inc(24536);gen.setAcrobatDownsample(true);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24537);p.fill(new Rectangle());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24538);assertTrue(out.toString().contains("1 1 4 matrix\n{<\nfff\n>} false 3 colorimage"));
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24539);p.dispose();
    }finally{__CLR4_5_2ivxivxm68iyj6m.R.flushNeeded();}}

    @Test
    public void testFillAlpha() {__CLR4_5_2ivxivxm68iyj6m.R.globalSliceStart(getClass().getName(),24540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jfnjqoixo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ivxivxm68iyj6m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ivxivxm68iyj6m.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.ps.PSGraphics2DTestCase.testFillAlpha",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jfnjqoixo(){try{__CLR4_5_2ivxivxm68iyj6m.R.inc(24540);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24541);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24542);PSGenerator gen = new PSGenerator(out);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24543);PSGraphics2D p = new PSGraphics2D(false, gen);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24544);p.setGraphicContext(new GraphicContext());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24545);p.setComposite(AlphaComposite.getInstance(3, 0));
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24546);p.fill(new Rectangle());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24547);assertEquals(out.toString(), "");
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24548);p.setComposite(AlphaComposite.getInstance(3, 0.5f));
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24549);p.fill(new Rectangle());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24550);assertTrue(out.toString().contains("\nN\n"));
    }finally{__CLR4_5_2ivxivxm68iyj6m.R.flushNeeded();}}

    @Test
    public void testMask() {__CLR4_5_2ivxivxm68iyj6m.R.globalSliceStart(getClass().getName(),24551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kgybl1ixz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ivxivxm68iyj6m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ivxivxm68iyj6m.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.ps.PSGraphics2DTestCase.testMask",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24551,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kgybl1ixz(){try{__CLR4_5_2ivxivxm68iyj6m.R.inc(24551);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24552);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24553);PSGenerator generator = new PSGenerator(out);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24554);PSGraphics2D graphics = new PSGraphics2D(false, generator);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24555);graphics.setGraphicContext(new GraphicContext());
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24556);BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24557);graphics.drawImage(image, 0, 0, null, null, image);
        __CLR4_5_2ivxivxm68iyj6m.R.inc(24558);assertTrue(out.toString().contains("imagemask"));
    }finally{__CLR4_5_2ivxivxm68iyj6m.R.flushNeeded();}}
}
