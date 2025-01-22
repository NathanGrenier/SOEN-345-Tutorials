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

package org.apache.xmlgraphics.ps;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.color.ColorSpace;

import java.awt.geom.Dimension2D;
import java.awt.image.BufferedImage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import org.apache.xmlgraphics.java2d.Dimension2DDouble;
import org.apache.xmlgraphics.java2d.color.NamedColorSpace;


public class FormGeneratorTestCase {static class __CLR4_5_2iy7iy7m68iyj70{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,24626,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testGeneratePaintProc() throws IOException {__CLR4_5_2iy7iy7m68iyj70.R.globalSliceStart(getClass().getName(),24559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21krp4ciy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iy7iy7m68iyj70.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iy7iy7m68iyj70.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.FormGeneratorTestCase.testGeneratePaintProc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21krp4ciy7() throws IOException{try{__CLR4_5_2iy7iy7m68iyj70.R.inc(24559);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24560);Dimension2D dimension = new Dimension2DDouble(300, 500);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24561);BufferedImage im = new BufferedImage(100, 75, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24562);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24563);ImageFormGenerator formImageGen = new  ImageFormGenerator("form", "title", dimension, im, false);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24564);PSGenerator gen = new PSGenerator(out);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24565);formImageGen.generatePaintProc(gen);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24566);String test = out.toString("UTF-8");

        __CLR4_5_2iy7iy7m68iyj70.R.inc(24567);String  expected = "    form:Data 0 setfileposition\n"
        + "[300 0 0 500 0 0] CT\n"
        + "/DeviceRGB setcolorspace\n"
        + "<<\n";
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24568);Assert.assertTrue(test.contains(expected));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24569);Assert.assertTrue(test.contains("  /DataSource form:Data"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24570);Assert.assertTrue(test.contains("  /ImageMatrix [100 0 0 75 0 0]\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24571);Assert.assertTrue(test.contains("  /BitsPerComponent 8\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24572);Assert.assertTrue(test.contains("  /Height 75\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24573);Assert.assertTrue(test.contains("  /ImageType 1\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24574);Assert.assertTrue(test.contains("  /Decode [0 1 0 1 0 1]\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24575);Assert.assertTrue(test.contains(">> image\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24576);out.reset();
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24577);im = null;

        __CLR4_5_2iy7iy7m68iyj70.R.inc(24578);Color c = Color.BLUE;
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24579);Dimension dimensionPX = new Dimension(200, 400);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24580);ImageEncoder enco = ImageEncodingHelper.createRenderedImageEncoder(im);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24581);ColorSpace cs = new NamedColorSpace("myColor", c);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24582);formImageGen = new  ImageFormGenerator("form", "title", dimension, dimensionPX, enco, cs, false);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24583);gen = new PSGenerator(out);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24584);gen.setPSLevel(2);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24585);formImageGen.generatePaintProc(gen);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24586);test = out.toString("UTF-8");
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24587);expected = "    userdict /i 0 put\n"
            + "[300 0 0 500 0 0] CT\n"
            + "/DeviceGray setcolorspace\n"
            + "<<\n";
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24588);Assert.assertTrue(test.contains(expected));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24589);Assert.assertTrue(test.contains("  /DataSource { form:Data i get /i i 1 add store } bind\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24590);Assert.assertTrue(test.contains("  /ImageMatrix [200 0 0 400 0 0]\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24591);Assert.assertTrue(test.contains("  /Height 400\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24592);Assert.assertTrue(test.contains("  /BitsPerComponent 8\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24593);Assert.assertTrue(test.contains("  /ImageType 1\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24594);Assert.assertTrue(test.contains("  /Decode [0 1]\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24595);Assert.assertTrue(test.contains("  /Width 200\n"));
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24596);Assert.assertTrue(test.contains(">> image\n"));
    }finally{__CLR4_5_2iy7iy7m68iyj70.R.flushNeeded();}}

    @Test
    public void testFlateDecodeCommand() throws IOException {__CLR4_5_2iy7iy7m68iyj70.R.globalSliceStart(getClass().getName(),24597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnlvyuiz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iy7iy7m68iyj70.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iy7iy7m68iyj70.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.FormGeneratorTestCase.testFlateDecodeCommand",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24597,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnlvyuiz9() throws IOException{try{__CLR4_5_2iy7iy7m68iyj70.R.inc(24597);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24598);Dimension2D dimension = new Dimension2DDouble(300, 500);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24599);BufferedImage im = new BufferedImage(100, 75, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24600);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24601);ImageFormGenerator formImageGen = new ImageFormGenerator("form", "title", dimension, im, false);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24602);PSGenerator gen = new PSGenerator(out);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24603);formImageGen.generate(gen);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24604);String test = out.toString("UTF-8");
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24605);Assert.assertTrue(test.contains("/ASCII85Decode filter\n"));
        //FlateDecode at DataSource so executed on page load rather than document load so viewer loads faster
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24606);Assert.assertTrue(test.contains("/DataSource form:Data /FlateDecode filter\n"));
    }finally{__CLR4_5_2iy7iy7m68iyj70.R.flushNeeded();}}

    @Test
    public void testAlphaImage() throws IOException {__CLR4_5_2iy7iy7m68iyj70.R.globalSliceStart(getClass().getName(),24607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sr02x6izj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iy7iy7m68iyj70.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iy7iy7m68iyj70.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.FormGeneratorTestCase.testAlphaImage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sr02x6izj() throws IOException{try{__CLR4_5_2iy7iy7m68iyj70.R.inc(24607);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24608);Assert.assertEquals(buildPSImage(BufferedImage.TYPE_4BYTE_ABGR), buildPSImage(BufferedImage.TYPE_INT_RGB));
    }finally{__CLR4_5_2iy7iy7m68iyj70.R.flushNeeded();}}

    private String buildPSImage(int type) throws IOException {try{__CLR4_5_2iy7iy7m68iyj70.R.inc(24609);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24610);Dimension2D dimension = new Dimension2DDouble(1, 1);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24611);BufferedImage im = new BufferedImage(1, 1, type);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24612);Graphics2D g = (Graphics2D) im.getGraphics();
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24613);if ((((type == BufferedImage.TYPE_4BYTE_ABGR)&&(__CLR4_5_2iy7iy7m68iyj70.R.iget(24614)!=0|true))||(__CLR4_5_2iy7iy7m68iyj70.R.iget(24615)==0&false))) {{
            __CLR4_5_2iy7iy7m68iyj70.R.inc(24616);g.setBackground(new Color(0, 0, 0, 0));
        } }else {{
            __CLR4_5_2iy7iy7m68iyj70.R.inc(24617);g.setBackground(Color.white);
        }
        }__CLR4_5_2iy7iy7m68iyj70.R.inc(24618);g.clearRect(0, 0, im.getWidth(), im.getHeight());
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24619);g.drawImage(im, 0, 0, null);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24620);g.dispose();
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24621);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24622);ImageFormGenerator formImageGen = new  ImageFormGenerator("form", "title", dimension, im, false);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24623);PSGenerator gen = new PSGenerator(out);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24624);formImageGen.generate(gen);
        __CLR4_5_2iy7iy7m68iyj70.R.inc(24625);return out.toString("utf-8");
    }finally{__CLR4_5_2iy7iy7m68iyj70.R.flushNeeded();}}
}
