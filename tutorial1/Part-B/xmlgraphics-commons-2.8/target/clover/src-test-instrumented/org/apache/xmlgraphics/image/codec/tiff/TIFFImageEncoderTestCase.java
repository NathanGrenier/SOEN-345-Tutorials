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

package org.apache.xmlgraphics.image.codec.tiff;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import org.apache.commons.io.IOUtils;

public class TIFFImageEncoderTestCase {static class __CLR4_5_2hjohjom6lb51xc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,22759,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testGrayImage() throws IOException {__CLR4_5_2hjohjom6lb51xc.R.globalSliceStart(getClass().getName(),22740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xx4vylhjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hjohjom6lb51xc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hjohjom6lb51xc.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.TIFFImageEncoderTestCase.testGrayImage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xx4vylhjo() throws IOException{try{__CLR4_5_2hjohjom6lb51xc.R.inc(22740);
        __CLR4_5_2hjohjom6lb51xc.R.inc(22741);testImage(BufferedImage.TYPE_BYTE_GRAY, "gray.tiff");
    }finally{__CLR4_5_2hjohjom6lb51xc.R.flushNeeded();}}

    @Test
    public void testBilevelImage() throws IOException {__CLR4_5_2hjohjom6lb51xc.R.globalSliceStart(getClass().getName(),22742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2glwr49hjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hjohjom6lb51xc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hjohjom6lb51xc.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.tiff.TIFFImageEncoderTestCase.testBilevelImage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2glwr49hjq() throws IOException{try{__CLR4_5_2hjohjom6lb51xc.R.inc(22742);
        __CLR4_5_2hjohjom6lb51xc.R.inc(22743);testImage(BufferedImage.TYPE_BYTE_BINARY, "bilevel.tiff");
    }finally{__CLR4_5_2hjohjom6lb51xc.R.flushNeeded();}}

    private void testImage(int imageType, String imageFileName) throws IOException {try{__CLR4_5_2hjohjom6lb51xc.R.inc(22744);
        __CLR4_5_2hjohjom6lb51xc.R.inc(22745);ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        __CLR4_5_2hjohjom6lb51xc.R.inc(22746);TIFFImageEncoder encoder = new TIFFImageEncoder(byteStream, null);
        __CLR4_5_2hjohjom6lb51xc.R.inc(22747);encoder.encode(getImage(imageType));
        __CLR4_5_2hjohjom6lb51xc.R.inc(22748);byte[] actualArray = IOUtils.toByteArray(getClass().getResource(imageFileName).openStream());
        __CLR4_5_2hjohjom6lb51xc.R.inc(22749);assertArrayEquals(byteStream.toByteArray(), actualArray);
    }finally{__CLR4_5_2hjohjom6lb51xc.R.flushNeeded();}}

    private RenderedImage getImage(int imageType) {try{__CLR4_5_2hjohjom6lb51xc.R.inc(22750);
        __CLR4_5_2hjohjom6lb51xc.R.inc(22751);BufferedImage img = new BufferedImage(400, 400, imageType);
        __CLR4_5_2hjohjom6lb51xc.R.inc(22752);img.getSampleModel();
        __CLR4_5_2hjohjom6lb51xc.R.inc(22753);Graphics gfx = img.getGraphics();
        __CLR4_5_2hjohjom6lb51xc.R.inc(22754);gfx.setColor(Color.RED);
        __CLR4_5_2hjohjom6lb51xc.R.inc(22755);gfx.fillRect(10, 10, 100, 100);
        __CLR4_5_2hjohjom6lb51xc.R.inc(22756);gfx.setColor(Color.WHITE);
        __CLR4_5_2hjohjom6lb51xc.R.inc(22757);gfx.fillRect(50, 50, 100, 100);
        __CLR4_5_2hjohjom6lb51xc.R.inc(22758);return img;
    }finally{__CLR4_5_2hjohjom6lb51xc.R.flushNeeded();}}
}
