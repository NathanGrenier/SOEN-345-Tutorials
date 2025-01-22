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

/* $Id: ImagePreloaderTestCase.java 1365650 2012-07-25 15:59:30Z mehdi $ */

package org.apache.xmlgraphics.image.loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.URIResolver;
import javax.xml.transform.sax.SAXSource;

import org.junit.Test;
import org.xml.sax.InputSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.apache.xmlgraphics.image.loader.spi.ImageLoaderFactory;
import org.apache.xmlgraphics.util.MimeConstants;

/**
 * Tests for bundled Imagepreloader implementations.
 */
public class ImagePreloaderTestCase {static class __CLR4_5_2hsdhsdm68iyixm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,23265,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private MockImageContext imageContext = MockImageContext.getInstance();

    @Test
    public void testImageLoaderFactory() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obufl7hsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testImageLoaderFactory",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obufl7hsd() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23053);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23054);ImageManager manager = imageContext.getImageManager();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23055);ImageInfo info = new ImageInfo(null, MimeConstants.MIME_PNG);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23056);ImageLoaderFactory ilf = manager.getRegistry().getImageLoaderFactory(
                info, ImageFlavor.BUFFERED_IMAGE);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23057);assertNotNull(ilf);
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testFileNotFound() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r27li4hsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testFileNotFound",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23058,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r27li4hsi() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23058);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23059);String uri = "doesnotexistanywhere.png";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23060);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23061);ImageManager manager = imageContext.getImageManager();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23062);try {
            __CLR4_5_2hsdhsdm68iyixm.R.inc(23063);manager.preloadImage(uri, sessionContext);
            __CLR4_5_2hsdhsdm68iyixm.R.inc(23064);fail("Expected a FileNotFoundException!");
        } catch (FileNotFoundException e) {
            //expected!
        }
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testPNG() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x3ijz2hsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testPNG",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23065,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x3ijz2hsp() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23065);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23066);String uri = "asf-logo.png";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23067);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23068);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23069);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23070);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23071);assertEquals(MimeConstants.MIME_PNG, info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23072);assertEquals("asf-logo.png", info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23073);assertEquals(169, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23074);assertEquals(51, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23075);assertEquals(96, info.getSize().getDpiHorizontal(), 0.1);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23076);assertEquals(126734, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23077);assertEquals(38245, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testPNGNoResolution() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u1hlnvht2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testPNGNoResolution",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23078,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u1hlnvht2() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23078);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23079);String uri = "no-resolution.png";
        //This file contains a pHYs chunk but the resolution is set to zero.
        //Reported in Bugzilla #45789

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23080);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23081);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23082);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23083);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23084);assertEquals(MimeConstants.MIME_PNG, info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23085);assertEquals("no-resolution.png", info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23086);assertEquals(51, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23087);assertEquals(24, info.getSize().getHeightPx());
        //Without resolution information (or resolution=0), the default shall be used
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23088);assertEquals(72, info.getSize().getDpiHorizontal(), 0.1);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23089);assertEquals(51000, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23090);assertEquals(24000, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testTIFF() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22b8zdehtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testTIFF",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22b8zdehtf() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23091);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23092);String uri = "tiff_group4.tif";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23093);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23094);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23095);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23096);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23097);assertEquals(MimeConstants.MIME_TIFF, info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23098);assertEquals(uri, info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23099);assertEquals(1560, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23100);assertEquals(189, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23101);assertEquals(204, info.getSize().getDpiHorizontal(), 0.1);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23102);assertEquals(550588, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23103);assertEquals(66706, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testTIFFNoResolution() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24xx5mthts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testTIFFNoResolution",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24xx5mthts() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23104);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23105);String uri = "no-resolution.tif";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23106);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23107);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23108);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23109);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23110);assertEquals(MimeConstants.MIME_TIFF, info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23111);assertEquals(uri, info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23112);assertEquals(51, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23113);assertEquals(24, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23114);assertEquals(imageContext.getSourceResolution(), info.getSize().getDpiHorizontal(), 0.1);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23115);assertEquals(51000, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23116);assertEquals(24000, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testGIF() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2shzns7hu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testGIF",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23117,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2shzns7hu5() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23117);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23118);String uri = "bgimg72dpi.gif";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23119);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23120);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23121);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23122);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23123);assertEquals(MimeConstants.MIME_GIF, info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23124);assertEquals(uri, info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23125);assertEquals(192, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23126);assertEquals(192, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23127);assertEquals(imageContext.getSourceResolution(), info.getSize().getDpiHorizontal(), 0.1);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23128);assertEquals(192000, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23129);assertEquals(192000, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testEMF() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nm1a4zhui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testEMF",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23130,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nm1a4zhui() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23130);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23131);String uri = "img.emf";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23132);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23133);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23134);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23135);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23136);assertEquals("image/emf", info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23137);assertEquals(uri, info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23138);assertEquals(76, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23139);assertEquals(76, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23140);assertEquals(96, info.getSize().getDpiHorizontal(), 1.0);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23141);assertEquals(56665, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23142);assertEquals(56665, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testJPEG1() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l3d7tqhuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testJPEG1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23143,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l3d7tqhuv() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23143);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23144);String uri = "bgimg300dpi.jpg";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23145);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23146);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23147);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23148);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23149);assertEquals(MimeConstants.MIME_JPEG, info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23150);assertEquals(uri, info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23151);assertEquals(192, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23152);assertEquals(192, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23153);assertEquals(300, info.getSize().getDpiHorizontal(), 0.1);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23154);assertEquals(46080, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23155);assertEquals(46080, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testJPEG2() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocd6m7hv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testJPEG2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23156,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocd6m7hv8() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23156);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23157);String uri = "cmyk.jpg";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23158);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23159);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23160);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23161);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23162);assertEquals(MimeConstants.MIME_JPEG, info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23163);assertEquals(uri, info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23164);assertEquals(160, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23165);assertEquals(35, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23166);assertEquals(72, info.getSize().getDpiHorizontal(), 0.1);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23167);assertEquals(160000, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23168);assertEquals(35000, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testJPEG3() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rld5eohvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testJPEG3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rld5eohvl() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23169);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23170);String uri = "cmyk-pxcm.jpg"; //Contains resolution as pixels per centimeter

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23171);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23172);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23173);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23174);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23175);assertEquals(MimeConstants.MIME_JPEG, info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23176);assertEquals(uri, info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23177);assertEquals(160, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23178);assertEquals(35, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23179);assertEquals(71.1, info.getSize().getDpiHorizontal(), 0.1); //28 px/cm = 71.1199 dpi
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23180);assertEquals(161980, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23181);assertEquals(35433, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testBMP() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ij1c6hvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testBMP",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23182,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ij1c6hvy() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23182);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23183);String uri = "bgimg300dpi.bmp";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23184);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23185);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23186);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23187);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23188);assertEquals("image/bmp", info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23189);assertEquals(uri, info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23190);assertEquals(192, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23191);assertEquals(192, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23192);assertEquals(300, info.getSize().getDpiHorizontal(), 0.1);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23193);assertEquals(46092, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23194);assertEquals(46092, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testBMPNoResolution() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gou3i1hwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testBMPNoResolution",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23195,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gou3i1hwb() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23195);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23196);String uri = "no-resolution.bmp";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23197);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23198);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23199);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23200);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23201);assertEquals("image/bmp", info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23202);assertEquals(uri, info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23203);assertEquals(50, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23204);assertEquals(50, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23205);assertEquals(imageContext.getSourceResolution(), info.getSize().getDpiHorizontal(), 0.1);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23206);assertEquals(50000, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23207);assertEquals(50000, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testEPSAscii() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wwk09qhwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testEPSAscii",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23208,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wwk09qhwo() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23208);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23209);String uri = "barcode.eps";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23210);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23211);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23212);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23213);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23214);assertEquals(MimeConstants.MIME_EPS, info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23215);assertEquals(uri, info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23216);assertEquals(136, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23217);assertEquals(43, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23218);assertEquals(imageContext.getSourceResolution(), info.getSize().getDpiHorizontal(), 0.1);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23219);assertEquals(135655, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23220);assertEquals(42525, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testEPSBinary() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jwi2f6hx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testEPSBinary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23221,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jwi2f6hx1() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23221);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23222);String uri = "img-with-tiff-preview.eps";

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23223);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23224);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23225);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23226);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23227);assertEquals(MimeConstants.MIME_EPS, info.getMimeType());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23228);assertEquals(uri, info.getOriginalURI());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23229);assertEquals(17, info.getSize().getWidthPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23230);assertEquals(17, info.getSize().getHeightPx());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23231);assertEquals(imageContext.getSourceResolution(), info.getSize().getDpiHorizontal(), 0.1);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23232);assertEquals(17000, info.getSize().getWidthMpt());
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23233);assertEquals(17000, info.getSize().getHeightMpt());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testSAXSourceWithSystemID() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qsbgoahxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testSAXSourceWithSystemID",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qsbgoahxe() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23234);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23235);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23236);
                __CLR4_5_2hsdhsdm68iyixm.R.inc(23237);if ((((href.startsWith("img:"))&&(__CLR4_5_2hsdhsdm68iyixm.R.iget(23238)!=0|true))||(__CLR4_5_2hsdhsdm68iyixm.R.iget(23239)==0&false))) {{
                    __CLR4_5_2hsdhsdm68iyixm.R.inc(23240);String filename = href.substring(4);
                    __CLR4_5_2hsdhsdm68iyixm.R.inc(23241);InputSource is = new InputSource(base + filename);
                    __CLR4_5_2hsdhsdm68iyixm.R.inc(23242);return new SAXSource(is);
                } }else {{
                    __CLR4_5_2hsdhsdm68iyixm.R.inc(23243);return null;
                }
            }}finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}
        };
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23244);checkImageFound("img:asf-logo.png", resolver);
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    @Test
    public void testSAXSourceWithInputStream() throws Exception {__CLR4_5_2hsdhsdm68iyixm.R.globalSliceStart(getClass().getName(),23245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2um0020hxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdm68iyixm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdm68iyixm.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePreloaderTestCase.testSAXSourceWithInputStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23245,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2um0020hxp() throws Exception{try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23245);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23246);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23247);
                __CLR4_5_2hsdhsdm68iyixm.R.inc(23248);if ((((href.startsWith("img:"))&&(__CLR4_5_2hsdhsdm68iyixm.R.iget(23249)!=0|true))||(__CLR4_5_2hsdhsdm68iyixm.R.iget(23250)==0&false))) {{
                    __CLR4_5_2hsdhsdm68iyixm.R.inc(23251);String filename = href.substring(4);
                    __CLR4_5_2hsdhsdm68iyixm.R.inc(23252);InputSource is;
                    __CLR4_5_2hsdhsdm68iyixm.R.inc(23253);try {
                        __CLR4_5_2hsdhsdm68iyixm.R.inc(23254);is = new InputSource(new java.io.FileInputStream(
                                new File(MockImageSessionContext.IMAGE_BASE_DIR, filename)));
                    } catch (FileNotFoundException e) {
                        __CLR4_5_2hsdhsdm68iyixm.R.inc(23255);throw new TransformerException(e);
                    }
                    __CLR4_5_2hsdhsdm68iyixm.R.inc(23256);return new SAXSource(is);
                } }else {{
                    __CLR4_5_2hsdhsdm68iyixm.R.inc(23257);return null;
                }
            }}finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}
        };
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23258);checkImageFound("img:asf-logo.png", resolver);
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

    private void checkImageFound(String uri, URIResolver resolver)
                throws ImageException, IOException {try{__CLR4_5_2hsdhsdm68iyixm.R.inc(23259);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23260);ImageSessionContext sessionContext = new SimpleURIResolverBasedImageSessionContext(
                imageContext, MockImageSessionContext.IMAGE_BASE_DIR, resolver);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23261);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hsdhsdm68iyixm.R.inc(23262);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23263);assertNotNull("ImageInfo must not be null", info);
        __CLR4_5_2hsdhsdm68iyixm.R.inc(23264);assertEquals(uri, info.getOriginalURI());
    }finally{__CLR4_5_2hsdhsdm68iyixm.R.flushNeeded();}}

}
