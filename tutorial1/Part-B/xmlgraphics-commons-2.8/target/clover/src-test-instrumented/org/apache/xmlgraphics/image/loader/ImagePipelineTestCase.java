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

/* $Id: ImagePipelineTestCase.java 1365650 2012-07-25 15:59:30Z mehdi $ */

package org.apache.xmlgraphics.image.loader;

import java.awt.Dimension;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.apache.xmlgraphics.image.loader.impl.ImageConverterBuffered2Rendered;
import org.apache.xmlgraphics.image.loader.impl.ImageConverterG2D2Bitmap;
import org.apache.xmlgraphics.image.loader.impl.ImageConverterRendered2PNG;
import org.apache.xmlgraphics.image.loader.impl.ImageGraphics2D;
import org.apache.xmlgraphics.image.loader.impl.ImageRawStream;
import org.apache.xmlgraphics.image.loader.impl.imageio.ImageLoaderImageIO;
import org.apache.xmlgraphics.image.loader.pipeline.ImageProviderPipeline;
import org.apache.xmlgraphics.image.loader.spi.ImageLoader;
import org.apache.xmlgraphics.java2d.Graphics2DImagePainter;
import org.apache.xmlgraphics.util.MimeConstants;

/**
 * Tests for the image pipeline functionality.
 */
public class ImagePipelineTestCase {static class __CLR4_5_2hqqhqqm68iyiwj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,23053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private MockImageContext imageContext = MockImageContext.getInstance();

    @Test
    public void testPipelineWithLoader() throws Exception {__CLR4_5_2hqqhqqm68iyiwj.R.globalSliceStart(getClass().getName(),22994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ojyopghqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hqqhqqm68iyiwj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hqqhqqm68iyiwj.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePipelineTestCase.testPipelineWithLoader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ojyopghqq() throws Exception{try{__CLR4_5_2hqqhqqm68iyiwj.R.inc(22994);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(22995);String uri = "bgimg72dpi.gif";

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(22996);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(22997);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(22998);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(22999);assertNotNull("ImageInfo must not be null", info);

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23000);ImageLoader loader = new ImageLoaderImageIO(ImageFlavor.RENDERED_IMAGE);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23001);ImageProviderPipeline pipeline = new ImageProviderPipeline(manager.getCache(), loader);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23002);pipeline.addConverter(new ImageConverterRendered2PNG());

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23003);Image img = pipeline.execute(info, null, sessionContext);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23004);assertNotNull("Image must not be null", img);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23005);assertEquals(ImageFlavor.RAW_PNG, img.getFlavor());
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23006);assertTrue(img instanceof ImageRawStream);

        //Original MIME type stays the same, but the flavor MIME changes
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23007);assertEquals(MimeConstants.MIME_GIF, img.getInfo().getMimeType());
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23008);assertEquals(MimeConstants.MIME_PNG, img.getFlavor().getMimeType());
    }finally{__CLR4_5_2hqqhqqm68iyiwj.R.flushNeeded();}}

    @Test
    public void testPipelineWithoutLoader() throws Exception {__CLR4_5_2hqqhqqm68iyiwj.R.globalSliceStart(getClass().getName(),23009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kssdpqhr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hqqhqqm68iyiwj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hqqhqqm68iyiwj.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePipelineTestCase.testPipelineWithoutLoader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kssdpqhr5() throws Exception{try{__CLR4_5_2hqqhqqm68iyiwj.R.inc(23009);

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23010);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23011);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23012);Image original = createG2DImage();

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23013);ImageProviderPipeline pipeline = new ImageProviderPipeline(manager.getCache(), null);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23014);pipeline.addConverter(new ImageConverterG2D2Bitmap());
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23015);pipeline.addConverter(new ImageConverterBuffered2Rendered());
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23016);pipeline.addConverter(new ImageConverterRendered2PNG());

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23017);Image img = pipeline.execute(original.getInfo(), original, null,
                sessionContext);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23018);assertNotNull("Image must not be null", img);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23019);assertEquals(ImageFlavor.RAW_PNG, img.getFlavor());
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23020);assertTrue(img instanceof ImageRawStream);

        //Original MIME type stays the same, but the flavor MIME changes
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23021);assertNull(img.getInfo().getMimeType());
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23022);assertEquals(MimeConstants.MIME_PNG, img.getFlavor().getMimeType());

    }finally{__CLR4_5_2hqqhqqm68iyiwj.R.flushNeeded();}}

    private Image createG2DImage() {try{__CLR4_5_2hqqhqqm68iyiwj.R.inc(23023);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23024);Graphics2DImagePainter painter = new DemoPainter();
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23025);Dimension dim = painter.getImageSize();

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23026);ImageSize size = new ImageSize();
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23027);size.setSizeInMillipoints(dim.width, dim.height);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23028);size.setResolution(72);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23029);size.calcPixelsFromSize();

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23030);ImageInfo info = new ImageInfo(null /*null is the intention here*/, null);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23031);info.setSize(size);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23032);ImageGraphics2D g2dImage = new ImageGraphics2D(info, painter);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23033);return g2dImage;
    }finally{__CLR4_5_2hqqhqqm68iyiwj.R.flushNeeded();}}

    @Test
    public void testPipelineFromURIThroughManager() throws Exception {__CLR4_5_2hqqhqqm68iyiwj.R.globalSliceStart(getClass().getName(),23034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oh8zhhru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hqqhqqm68iyiwj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hqqhqqm68iyiwj.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePipelineTestCase.testPipelineFromURIThroughManager",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23034,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oh8zhhru() throws Exception{try{__CLR4_5_2hqqhqqm68iyiwj.R.inc(23034);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23035);String uri = "asf-logo.png";

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23036);ImageSessionContext sessionContext = imageContext.newSessionContext();
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23037);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23038);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23039);assertNotNull("ImageInfo must not be null", info);

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23040);ImageFlavor[] flavors = new ImageFlavor[] {
                ImageFlavor.RAW_PNG, ImageFlavor.RAW_JPEG
        };
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23041);Image img = manager.getImage(info, flavors, sessionContext);

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23042);assertNotNull("Image must not be null", img);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23043);assertEquals(ImageFlavor.RAW_PNG, img.getFlavor());
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23044);assertTrue(img instanceof ImageRawStream);
    }finally{__CLR4_5_2hqqhqqm68iyiwj.R.flushNeeded();}}

    @Test
    public void testPipelineWithoutURIThroughManager() throws Exception {__CLR4_5_2hqqhqqm68iyiwj.R.globalSliceStart(getClass().getName(),23045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qybtyxhs5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hqqhqqm68iyiwj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hqqhqqm68iyiwj.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImagePipelineTestCase.testPipelineWithoutURIThroughManager",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qybtyxhs5() throws Exception{try{__CLR4_5_2hqqhqqm68iyiwj.R.inc(23045);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23046);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23047);Image original = createG2DImage();

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23048);ImageFlavor[] flavors = new ImageFlavor[] {
                ImageFlavor.RAW_PNG, ImageFlavor.RAW_JPEG
        };
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23049);Image img = manager.convertImage(original, flavors);

        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23050);assertNotNull("Image must not be null", img);
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23051);assertEquals(ImageFlavor.RAW_PNG, img.getFlavor());
        __CLR4_5_2hqqhqqm68iyiwj.R.inc(23052);assertTrue(img instanceof ImageRawStream);
    }finally{__CLR4_5_2hqqhqqm68iyiwj.R.flushNeeded();}}

}
