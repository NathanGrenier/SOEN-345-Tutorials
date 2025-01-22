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

/* $Id: ImageLoaderPNGTestCase.java 1732019 2016-02-24 05:01:10Z gadams $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageContext;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.image.loader.MockImageContext;
import org.apache.xmlgraphics.image.loader.MockImageSessionContext;
import org.apache.xmlgraphics.util.MimeConstants;

public class ImageLoaderPNGTestCase {static class __CLR4_5_2idyidym68iyj1i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,23840,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ImageLoaderPNG ilpng = new ImageLoaderPNG();

    @Test
    public void testGetUsagePenalty() {__CLR4_5_2idyidym68iyj1i.R.globalSliceStart(getClass().getName(),23830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yauq5idy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2idyidym68iyj1i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2idyidym68iyj1i.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.ImageLoaderPNGTestCase.testGetUsagePenalty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23830,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yauq5idy(){try{__CLR4_5_2idyidym68iyj1i.R.inc(23830);
        __CLR4_5_2idyidym68iyj1i.R.inc(23831);assertEquals(1000, ilpng.getUsagePenalty());
    }finally{__CLR4_5_2idyidym68iyj1i.R.flushNeeded();}}

    @Test
    public void testLoadImageImageInfoMapImageSessionContext() throws ImageException, IOException {__CLR4_5_2idyidym68iyj1i.R.globalSliceStart(getClass().getName(),23832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qpxsytie0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2idyidym68iyj1i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2idyidym68iyj1i.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.ImageLoaderPNGTestCase.testLoadImageImageInfoMapImageSessionContext",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qpxsytie0() throws ImageException, IOException{try{__CLR4_5_2idyidym68iyj1i.R.inc(23832);
        __CLR4_5_2idyidym68iyj1i.R.inc(23833);ImageContext context = MockImageContext.newSafeInstance();
        __CLR4_5_2idyidym68iyj1i.R.inc(23834);ImageSessionContext session = new MockImageSessionContext(context);
        __CLR4_5_2idyidym68iyj1i.R.inc(23835);ImageInfo info = new ImageInfo("basn2c08.png", MimeConstants.MIME_PNG);
        __CLR4_5_2idyidym68iyj1i.R.inc(23836);Image im = ilpng.loadImage(info, null, session);
        __CLR4_5_2idyidym68iyj1i.R.inc(23837);assertTrue(im instanceof ImageRendered);
    }finally{__CLR4_5_2idyidym68iyj1i.R.flushNeeded();}}

    @Test
    public void testGetTargetFlavor() {__CLR4_5_2idyidym68iyj1i.R.globalSliceStart(getClass().getName(),23838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28q3tvqie6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2idyidym68iyj1i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2idyidym68iyj1i.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.impl.ImageLoaderPNGTestCase.testGetTargetFlavor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23838,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28q3tvqie6(){try{__CLR4_5_2idyidym68iyj1i.R.inc(23838);
        __CLR4_5_2idyidym68iyj1i.R.inc(23839);assertEquals(ImageFlavor.RENDERED_IMAGE, ilpng.getTargetFlavor());
    }finally{__CLR4_5_2idyidym68iyj1i.R.flushNeeded();}}

}
