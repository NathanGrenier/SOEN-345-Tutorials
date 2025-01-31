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

/* $Id: ImageCacheTestCase.java 1365650 2012-07-25 15:59:30Z mehdi $ */

package org.apache.xmlgraphics.image.loader.cache;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageManager;
import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.image.loader.MockImageContext;
import org.apache.xmlgraphics.image.loader.impl.ImageBuffered;

/**
 * Tests for bundled ImageLoader implementations.
 */
public class ImageCacheTestCase {static class __CLR4_5_2iafiafm6lb522r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,23786,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final boolean DEBUG = false;

    private MockImageContext imageContext = MockImageContext.getInstance();
    private ImageSessionContext sessionContext = imageContext.newSessionContext();
    private ImageManager manager = imageContext.getImageManager();
    private ImageCacheStatistics statistics = (DEBUG
                ? new ImageCacheLoggingStatistics(true) : new ImageCacheStatistics(true));

    /** {@inheritDoc} */
    @Before
    public void setUp() throws Exception {try{__CLR4_5_2iafiafm6lb522r.R.inc(23703);
        __CLR4_5_2iafiafm6lb522r.R.inc(23704);manager.getCache().clearCache();
        __CLR4_5_2iafiafm6lb522r.R.inc(23705);statistics.reset();
        __CLR4_5_2iafiafm6lb522r.R.inc(23706);manager.getCache().setCacheListener(statistics);
    }finally{__CLR4_5_2iafiafm6lb522r.R.flushNeeded();}}

    /**
     * Tests the ImageInfo cache.
     * @throws Exception if an error occurs
     */
    @Test
    public void testImageInfoCache() throws Exception {__CLR4_5_2iafiafm6lb522r.R.globalSliceStart(getClass().getName(),23707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzzqeqiaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iafiafm6lb522r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iafiafm6lb522r.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.cache.ImageCacheTestCase.testImageInfoCache",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzzqeqiaj() throws Exception{try{__CLR4_5_2iafiafm6lb522r.R.inc(23707);
        __CLR4_5_2iafiafm6lb522r.R.inc(23708);String invalid1 = "invalid1.jpg";
        __CLR4_5_2iafiafm6lb522r.R.inc(23709);String invalid2 = "invalid2.jpg";
        __CLR4_5_2iafiafm6lb522r.R.inc(23710);String valid1 = "bgimg300dpi.bmp";
        __CLR4_5_2iafiafm6lb522r.R.inc(23711);String valid2 = "big-image.png";


        __CLR4_5_2iafiafm6lb522r.R.inc(23712);ImageInfo info1;
        __CLR4_5_2iafiafm6lb522r.R.inc(23713);ImageInfo info2;
        __CLR4_5_2iafiafm6lb522r.R.inc(23714);info1 = manager.getImageInfo(valid1, sessionContext);
        __CLR4_5_2iafiafm6lb522r.R.inc(23715);assertNotNull(info1);
        __CLR4_5_2iafiafm6lb522r.R.inc(23716);assertEquals(valid1, info1.getOriginalURI());

        __CLR4_5_2iafiafm6lb522r.R.inc(23717);try {
            __CLR4_5_2iafiafm6lb522r.R.inc(23718);manager.getImageInfo(invalid1, sessionContext);
            __CLR4_5_2iafiafm6lb522r.R.inc(23719);fail("Expected FileNotFoundException for invalid URI");
        } catch (FileNotFoundException e) {
            //expected
        }

        //2 requests:
        __CLR4_5_2iafiafm6lb522r.R.inc(23720);assertEquals(0, statistics.getImageInfoCacheHits());
        __CLR4_5_2iafiafm6lb522r.R.inc(23721);assertEquals(2, statistics.getImageInfoCacheMisses());
        __CLR4_5_2iafiafm6lb522r.R.inc(23722);assertEquals(0, statistics.getInvalidHits());
        __CLR4_5_2iafiafm6lb522r.R.inc(23723);statistics.reset();

        //Cache Hit
        __CLR4_5_2iafiafm6lb522r.R.inc(23724);info1 = manager.getImageInfo(valid1, sessionContext);
        __CLR4_5_2iafiafm6lb522r.R.inc(23725);assertNotNull(info1);
        __CLR4_5_2iafiafm6lb522r.R.inc(23726);assertEquals(valid1, info1.getOriginalURI());

        //Cache Miss
        __CLR4_5_2iafiafm6lb522r.R.inc(23727);info2 = manager.getImageInfo(valid2, sessionContext);
        __CLR4_5_2iafiafm6lb522r.R.inc(23728);assertNotNull(info2);
        __CLR4_5_2iafiafm6lb522r.R.inc(23729);assertEquals(valid2, info2.getOriginalURI());

        __CLR4_5_2iafiafm6lb522r.R.inc(23730);try {
            //Invalid Hit
            __CLR4_5_2iafiafm6lb522r.R.inc(23731);manager.getImageInfo(invalid1, sessionContext);
            __CLR4_5_2iafiafm6lb522r.R.inc(23732);fail("Expected FileNotFoundException for invalid URI");
        } catch (FileNotFoundException e) {
            //expected
        }
        __CLR4_5_2iafiafm6lb522r.R.inc(23733);try {
            //Invalid (Cache Miss)
            __CLR4_5_2iafiafm6lb522r.R.inc(23734);manager.getImageInfo(invalid2, sessionContext);
            __CLR4_5_2iafiafm6lb522r.R.inc(23735);fail("Expected FileNotFoundException for invalid URI");
        } catch (FileNotFoundException e) {
            //expected
        }

        //4 requests:
        __CLR4_5_2iafiafm6lb522r.R.inc(23736);assertEquals(1, statistics.getImageInfoCacheHits());
        __CLR4_5_2iafiafm6lb522r.R.inc(23737);assertEquals(2, statistics.getImageInfoCacheMisses());
        __CLR4_5_2iafiafm6lb522r.R.inc(23738);assertEquals(1, statistics.getInvalidHits());
        __CLR4_5_2iafiafm6lb522r.R.inc(23739);statistics.reset();
    }finally{__CLR4_5_2iafiafm6lb522r.R.flushNeeded();}}

    @Test
    public void testInvalidURIExpiration() throws Exception {__CLR4_5_2iafiafm6lb522r.R.globalSliceStart(getClass().getName(),23740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h24ymbibg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iafiafm6lb522r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iafiafm6lb522r.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.cache.ImageCacheTestCase.testInvalidURIExpiration",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h24ymbibg() throws Exception{try{__CLR4_5_2iafiafm6lb522r.R.inc(23740);
        __CLR4_5_2iafiafm6lb522r.R.inc(23741);MockTimeStampProvider provider = new MockTimeStampProvider();
        __CLR4_5_2iafiafm6lb522r.R.inc(23742);ImageCache cache = new ImageCache(provider, new DefaultExpirationPolicy(2));
        __CLR4_5_2iafiafm6lb522r.R.inc(23743);cache.setCacheListener(statistics);

        __CLR4_5_2iafiafm6lb522r.R.inc(23744);String invalid1 = "invalid1.jpg";
        __CLR4_5_2iafiafm6lb522r.R.inc(23745);String invalid2 = "invalid2.jpg";
        __CLR4_5_2iafiafm6lb522r.R.inc(23746);String valid1 = "valid1.jpg";

        __CLR4_5_2iafiafm6lb522r.R.inc(23747);provider.setTimeStamp(1000);
        __CLR4_5_2iafiafm6lb522r.R.inc(23748);cache.registerInvalidURI(invalid1);
        __CLR4_5_2iafiafm6lb522r.R.inc(23749);provider.setTimeStamp(1100);
        __CLR4_5_2iafiafm6lb522r.R.inc(23750);cache.registerInvalidURI(invalid2);

        __CLR4_5_2iafiafm6lb522r.R.inc(23751);assertEquals(0, statistics.getInvalidHits());

        //not expired, yet
        __CLR4_5_2iafiafm6lb522r.R.inc(23752);provider.setTimeStamp(1200);
        __CLR4_5_2iafiafm6lb522r.R.inc(23753);assertFalse(cache.isInvalidURI(valid1));
        __CLR4_5_2iafiafm6lb522r.R.inc(23754);assertTrue(cache.isInvalidURI(invalid1));
        __CLR4_5_2iafiafm6lb522r.R.inc(23755);assertTrue(cache.isInvalidURI(invalid2));
        __CLR4_5_2iafiafm6lb522r.R.inc(23756);assertEquals(2, statistics.getInvalidHits());

        //first expiration time reached
        __CLR4_5_2iafiafm6lb522r.R.inc(23757);provider.setTimeStamp(3050);
        __CLR4_5_2iafiafm6lb522r.R.inc(23758);assertFalse(cache.isInvalidURI(valid1));
        __CLR4_5_2iafiafm6lb522r.R.inc(23759);assertFalse(cache.isInvalidURI(invalid1));
        __CLR4_5_2iafiafm6lb522r.R.inc(23760);assertTrue(cache.isInvalidURI(invalid2));
        __CLR4_5_2iafiafm6lb522r.R.inc(23761);assertEquals(3, statistics.getInvalidHits());

        //second expiration time reached
        __CLR4_5_2iafiafm6lb522r.R.inc(23762);provider.setTimeStamp(3200);
        __CLR4_5_2iafiafm6lb522r.R.inc(23763);assertFalse(cache.isInvalidURI(valid1));
        __CLR4_5_2iafiafm6lb522r.R.inc(23764);assertFalse(cache.isInvalidURI(invalid1));
        __CLR4_5_2iafiafm6lb522r.R.inc(23765);assertFalse(cache.isInvalidURI(invalid2));
        __CLR4_5_2iafiafm6lb522r.R.inc(23766);assertEquals(3, statistics.getInvalidHits());
    }finally{__CLR4_5_2iafiafm6lb522r.R.flushNeeded();}}

    /**
     * Tests the image cache reusing a cacheable Image created by the ImageLoader.
     * @throws Exception if an error occurs
     */
    @Test
    public void testImageCache1() throws Exception {__CLR4_5_2iafiafm6lb522r.R.globalSliceStart(getClass().getName(),23767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25duhkvic7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iafiafm6lb522r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iafiafm6lb522r.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.cache.ImageCacheTestCase.testImageCache1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25duhkvic7() throws Exception{try{__CLR4_5_2iafiafm6lb522r.R.inc(23767);
        __CLR4_5_2iafiafm6lb522r.R.inc(23768);String valid1 = "bgimg72dpi.gif";

        __CLR4_5_2iafiafm6lb522r.R.inc(23769);ImageInfo info = manager.getImageInfo(valid1, sessionContext);
        __CLR4_5_2iafiafm6lb522r.R.inc(23770);assertNotNull(info);

        __CLR4_5_2iafiafm6lb522r.R.inc(23771);ImageBuffered img1 = (ImageBuffered) manager.getImage(
                info, ImageFlavor.BUFFERED_IMAGE, sessionContext);
        __CLR4_5_2iafiafm6lb522r.R.inc(23772);assertNotNull(img1);
        __CLR4_5_2iafiafm6lb522r.R.inc(23773);assertNotNull(img1.getBufferedImage());

        __CLR4_5_2iafiafm6lb522r.R.inc(23774);ImageBuffered img2 = (ImageBuffered) manager.getImage(
                info, ImageFlavor.BUFFERED_IMAGE, sessionContext);
        //ImageBuffered does not have to be the same instance but we want at least the
        //BufferedImage to be reused.
        __CLR4_5_2iafiafm6lb522r.R.inc(23775);assertTrue("BufferedImage must be reused",
                img1.getBufferedImage() == img2.getBufferedImage());

        __CLR4_5_2iafiafm6lb522r.R.inc(23776);assertEquals(1, statistics.getImageCacheHits());
        __CLR4_5_2iafiafm6lb522r.R.inc(23777);assertEquals(1, statistics.getImageCacheMisses());
    }finally{__CLR4_5_2iafiafm6lb522r.R.flushNeeded();}}


    /**
     * Test to check if doInvalidURIHouseKeeping() throws a
     * ConcurrentModificationException.
     */
    @Test
    public void testImageCacheHouseKeeping() {__CLR4_5_2iafiafm6lb522r.R.globalSliceStart(getClass().getName(),23778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24m2r7hici();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iafiafm6lb522r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iafiafm6lb522r.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.cache.ImageCacheTestCase.testImageCacheHouseKeeping",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24m2r7hici(){try{__CLR4_5_2iafiafm6lb522r.R.inc(23778);
        __CLR4_5_2iafiafm6lb522r.R.inc(23779);ImageCache imageCache = new ImageCache(new TimeStampProvider(),
                new DefaultExpirationPolicy(1));
        __CLR4_5_2iafiafm6lb522r.R.inc(23780);imageCache.registerInvalidURI("invalid");
        __CLR4_5_2iafiafm6lb522r.R.inc(23781);imageCache.registerInvalidURI("invalid2");
        __CLR4_5_2iafiafm6lb522r.R.inc(23782);try {
            __CLR4_5_2iafiafm6lb522r.R.inc(23783);Thread.sleep(1200);
        } catch (InterruptedException e) {
            __CLR4_5_2iafiafm6lb522r.R.inc(23784);e.printStackTrace();
        }
        __CLR4_5_2iafiafm6lb522r.R.inc(23785);imageCache.doHouseKeeping();
    }finally{__CLR4_5_2iafiafm6lb522r.R.flushNeeded();}}
}
