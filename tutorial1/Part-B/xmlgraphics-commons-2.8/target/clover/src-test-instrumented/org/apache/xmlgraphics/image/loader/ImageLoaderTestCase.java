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

/* $Id: ImageLoaderTestCase.java 1365650 2012-07-25 15:59:30Z mehdi $ */

package org.apache.xmlgraphics.image.loader;

import java.awt.color.ICC_Profile;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.apache.commons.io.IOUtils;

import org.apache.xmlgraphics.image.loader.impl.ImageLoaderPNG;
import org.apache.xmlgraphics.image.loader.impl.ImageLoaderRawPNG;
import org.apache.xmlgraphics.image.loader.impl.ImageRawStream;
import org.apache.xmlgraphics.image.loader.impl.ImageRendered;
import org.apache.xmlgraphics.image.loader.spi.ImageImplRegistry;
import org.apache.xmlgraphics.image.loader.spi.ImageLoader;
import org.apache.xmlgraphics.image.loader.spi.ImageLoaderFactory;

/**
 * Tests for bundled ImageLoader implementations.
 */
public class ImageLoaderTestCase {static class __CLR4_5_2hluhlum68iyiw6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,22994,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private MockImageContext imageContext = MockImageContext.getInstance();

    private MyImageSessionContext createImageSessionContext() {try{__CLR4_5_2hluhlum68iyiw6.R.inc(22818);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22819);return new MyImageSessionContext(imageContext);
    }finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

    @Test
    public void testPNG() throws Exception {__CLR4_5_2hluhlum68iyiw6.R.globalSliceStart(getClass().getName(),22820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x3ijz2hlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hluhlum68iyiw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hluhlum68iyiw6.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageLoaderTestCase.testPNG",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x3ijz2hlw() throws Exception{try{__CLR4_5_2hluhlum68iyiw6.R.inc(22820);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22821);String uri = "asf-logo.png";

        __CLR4_5_2hluhlum68iyiw6.R.inc(22822);MyImageSessionContext sessionContext = createImageSessionContext();
        __CLR4_5_2hluhlum68iyiw6.R.inc(22823);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hluhlum68iyiw6.R.inc(22824);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22825);assertNotNull("ImageInfo must not be null", info);

        __CLR4_5_2hluhlum68iyiw6.R.inc(22826);Image img = manager.getImage(info, ImageFlavor.RENDERED_IMAGE, sessionContext);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22827);assertNotNull("Image must not be null", img);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22828);assertEquals(ImageFlavor.RENDERED_IMAGE, img.getFlavor());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22829);ImageRendered imgRed = (ImageRendered) img;
        __CLR4_5_2hluhlum68iyiw6.R.inc(22830);assertNotNull(imgRed.getRenderedImage());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22831);assertEquals(169, imgRed.getRenderedImage().getWidth());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22832);assertEquals(51, imgRed.getRenderedImage().getHeight());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22833);info = imgRed.getInfo(); //Switch to the ImageInfo returned by the image
        __CLR4_5_2hluhlum68iyiw6.R.inc(22834);assertEquals(126734, info.getSize().getWidthMpt());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22835);assertEquals(38245, info.getSize().getHeightMpt());

        __CLR4_5_2hluhlum68iyiw6.R.inc(22836);sessionContext.checkAllStreamsClosed();
    }finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

    @Test
    public void testGIF() throws Exception {__CLR4_5_2hluhlum68iyiw6.R.globalSliceStart(getClass().getName(),22837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2shzns7hmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hluhlum68iyiw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hluhlum68iyiw6.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageLoaderTestCase.testGIF",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22837,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2shzns7hmd() throws Exception{try{__CLR4_5_2hluhlum68iyiw6.R.inc(22837);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22838);String uri = "bgimg72dpi.gif";

        __CLR4_5_2hluhlum68iyiw6.R.inc(22839);MyImageSessionContext sessionContext = createImageSessionContext();
        __CLR4_5_2hluhlum68iyiw6.R.inc(22840);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hluhlum68iyiw6.R.inc(22841);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22842);assertNotNull("ImageInfo must not be null", info);

        __CLR4_5_2hluhlum68iyiw6.R.inc(22843);Image img = manager.getImage(info, ImageFlavor.RENDERED_IMAGE, sessionContext);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22844);assertNotNull("Image must not be null", img);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22845);assertEquals(ImageFlavor.RENDERED_IMAGE, img.getFlavor());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22846);ImageRendered imgRed = (ImageRendered) img;
        __CLR4_5_2hluhlum68iyiw6.R.inc(22847);assertNotNull(imgRed.getRenderedImage());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22848);assertEquals(192, imgRed.getRenderedImage().getWidth());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22849);assertEquals(192, imgRed.getRenderedImage().getHeight());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22850);info = imgRed.getInfo(); //Switch to the ImageInfo returned by the image
        __CLR4_5_2hluhlum68iyiw6.R.inc(22851);assertEquals(192000, info.getSize().getWidthMpt());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22852);assertEquals(192000, info.getSize().getHeightMpt());

        __CLR4_5_2hluhlum68iyiw6.R.inc(22853);sessionContext.checkAllStreamsClosed();
    }finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

    @Test
    public void testEPSASCII() throws Exception {__CLR4_5_2hluhlum68iyiw6.R.globalSliceStart(getClass().getName(),22854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2woajkyhmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hluhlum68iyiw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hluhlum68iyiw6.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageLoaderTestCase.testEPSASCII",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22854,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2woajkyhmu() throws Exception{try{__CLR4_5_2hluhlum68iyiw6.R.inc(22854);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22855);String uri = "barcode.eps";

        __CLR4_5_2hluhlum68iyiw6.R.inc(22856);MyImageSessionContext sessionContext = createImageSessionContext();
        __CLR4_5_2hluhlum68iyiw6.R.inc(22857);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hluhlum68iyiw6.R.inc(22858);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22859);assertNotNull("ImageInfo must not be null", info);

        __CLR4_5_2hluhlum68iyiw6.R.inc(22860);Image img = manager.getImage(info, ImageFlavor.RAW_EPS, sessionContext);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22861);assertNotNull("Image must not be null", img);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22862);assertEquals(ImageFlavor.RAW_EPS, img.getFlavor());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22863);ImageRawStream imgEPS = (ImageRawStream) img;
        __CLR4_5_2hluhlum68iyiw6.R.inc(22864);InputStream in = imgEPS.createInputStream();
        __CLR4_5_2hluhlum68iyiw6.R.inc(22865);try {
            __CLR4_5_2hluhlum68iyiw6.R.inc(22866);assertNotNull(in);
            __CLR4_5_2hluhlum68iyiw6.R.inc(22867);Reader reader = new InputStreamReader(in, "US-ASCII");
            __CLR4_5_2hluhlum68iyiw6.R.inc(22868);char[] c = new char[4];
            __CLR4_5_2hluhlum68iyiw6.R.inc(22869);reader.read(c);
            __CLR4_5_2hluhlum68iyiw6.R.inc(22870);if ((((!("%!PS".equals(new String(c))))&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22871)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22872)==0&false))) {{
                __CLR4_5_2hluhlum68iyiw6.R.inc(22873);fail("EPS header expected");
            }
        }} finally {
            __CLR4_5_2hluhlum68iyiw6.R.inc(22874);IOUtils.closeQuietly(in);
        }

        __CLR4_5_2hluhlum68iyiw6.R.inc(22875);sessionContext.checkAllStreamsClosed();
    }finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

    @Test
    public void testEPSBinary() throws Exception {__CLR4_5_2hluhlum68iyiw6.R.globalSliceStart(getClass().getName(),22876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jwi2f6hng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hluhlum68iyiw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hluhlum68iyiw6.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageLoaderTestCase.testEPSBinary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22876,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jwi2f6hng() throws Exception{try{__CLR4_5_2hluhlum68iyiw6.R.inc(22876);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22877);String uri = "img-with-tiff-preview.eps";

        __CLR4_5_2hluhlum68iyiw6.R.inc(22878);MyImageSessionContext sessionContext = createImageSessionContext();
        __CLR4_5_2hluhlum68iyiw6.R.inc(22879);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hluhlum68iyiw6.R.inc(22880);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22881);assertNotNull("ImageInfo must not be null", info);

        __CLR4_5_2hluhlum68iyiw6.R.inc(22882);Image img = manager.getImage(info, ImageFlavor.RAW_EPS, sessionContext);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22883);assertNotNull("Image must not be null", img);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22884);assertEquals(ImageFlavor.RAW_EPS, img.getFlavor());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22885);ImageRawStream imgEPS = (ImageRawStream) img;
        __CLR4_5_2hluhlum68iyiw6.R.inc(22886);InputStream in = imgEPS.createInputStream();
        __CLR4_5_2hluhlum68iyiw6.R.inc(22887);try {
            __CLR4_5_2hluhlum68iyiw6.R.inc(22888);assertNotNull(in);
            __CLR4_5_2hluhlum68iyiw6.R.inc(22889);Reader reader = new InputStreamReader(in, "US-ASCII");
            __CLR4_5_2hluhlum68iyiw6.R.inc(22890);char[] c = new char[4];
            __CLR4_5_2hluhlum68iyiw6.R.inc(22891);reader.read(c);
            __CLR4_5_2hluhlum68iyiw6.R.inc(22892);if ((((!("%!PS".equals(new String(c))))&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22893)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22894)==0&false))) {{
                __CLR4_5_2hluhlum68iyiw6.R.inc(22895);fail("EPS header expected");
            }
        }} finally {
            __CLR4_5_2hluhlum68iyiw6.R.inc(22896);IOUtils.closeQuietly(in);
        }

        __CLR4_5_2hluhlum68iyiw6.R.inc(22897);sessionContext.checkAllStreamsClosed();
    }finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

    @Test
    public void testICCProfiles() throws Exception {__CLR4_5_2hluhlum68iyiw6.R.globalSliceStart(getClass().getName(),22898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_272kb0oho2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hluhlum68iyiw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hluhlum68iyiw6.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageLoaderTestCase.testICCProfiles",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22898,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_272kb0oho2() throws Exception{try{__CLR4_5_2hluhlum68iyiw6.R.inc(22898);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22899);MyImageSessionContext sessionContext = createImageSessionContext();
        __CLR4_5_2hluhlum68iyiw6.R.inc(22900);List<ICC_Profile> profiles = new ArrayList<ICC_Profile>();

        __CLR4_5_2hluhlum68iyiw6.R.inc(22901);runReaders(profiles, sessionContext, "iccTest.png", "image/png",
                ImageFlavor.RAW_PNG);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22902);runReaders(profiles, sessionContext, "iccTest.jpg", "image/jpeg",
                ImageFlavor.RAW_JPEG);

        __CLR4_5_2hluhlum68iyiw6.R.inc(22903);ICC_Profile first = profiles.get(0);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22904);byte[] firstData = first.getData();
        __CLR4_5_2hluhlum68iyiw6.R.inc(22905);for (int i = 1; (((i < profiles.size())&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22906)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22907)==0&false)); i++) {{
            __CLR4_5_2hluhlum68iyiw6.R.inc(22908);ICC_Profile icc = profiles.get(i);
            __CLR4_5_2hluhlum68iyiw6.R.inc(22909);byte[] data = icc.getData();
            __CLR4_5_2hluhlum68iyiw6.R.inc(22910);assertEquals("Embedded ICC Profiles are not the same size!",
                    firstData.length, data.length);
            __CLR4_5_2hluhlum68iyiw6.R.inc(22911);for (int j = 0; (((j < firstData.length)&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22912)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22913)==0&false)); j++) {{
                __CLR4_5_2hluhlum68iyiw6.R.inc(22914);assertEquals("Embedded ICC Profiles differ at index " + j,
                        firstData[j], data[j]);
            }
        }}
    }}finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

    private void runReaders(List<ICC_Profile> profiles, ImageSessionContext isc, String uri,
            String mime, ImageFlavor rawFlavor) throws Exception {try{__CLR4_5_2hluhlum68iyiw6.R.inc(22915);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22916);ImageLoaderFactory[] ilfs = ImageImplRegistry.getDefaultInstance()
                .getImageLoaderFactories(mime);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22917);if ((((ilfs != null)&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22918)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22919)==0&false))) {{
            __CLR4_5_2hluhlum68iyiw6.R.inc(22920);for (int i = 0; (((i < ilfs.length)&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22921)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22922)==0&false)); i++) {{
                __CLR4_5_2hluhlum68iyiw6.R.inc(22923);ImageLoaderFactory ilf = ilfs[i];
                __CLR4_5_2hluhlum68iyiw6.R.inc(22924);try {
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22925);final ImageLoader il = ilf.newImageLoader(rawFlavor);
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22926);if ((((il instanceof ImageLoaderRawPNG || il instanceof ImageLoaderPNG)&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22927)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22928)==0&false))) {{
                        // temporary measure until ImageLoaderRawPNG and ImageLoader PNG handle ICC profiles
                        __CLR4_5_2hluhlum68iyiw6.R.inc(22929);continue;
                    }
                    }__CLR4_5_2hluhlum68iyiw6.R.inc(22930);final ImageInfo im = new ImageInfo(uri, mime);
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22931);final Image img = il.loadImage(im, isc);
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22932);final ICC_Profile icc = img.getICCProfile();
                    // Assume the profile can only be correct if the image could
                    // actually be interpreted.
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22933);if ((((img.getColorSpace() != null)&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22934)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22935)==0&false))) {{
                        __CLR4_5_2hluhlum68iyiw6.R.inc(22936);profiles.add(icc);
                    }
                }} catch (IllegalArgumentException e) {
                    // Ignore. This imageLoader does not support RAW
                }
                __CLR4_5_2hluhlum68iyiw6.R.inc(22937);try {
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22938);final ImageLoader il = ilf.newImageLoader(ImageFlavor.BUFFERED_IMAGE);
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22939);final ImageInfo im = new ImageInfo(uri, mime);
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22940);final Image img = il.loadImage(im, isc);
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22941);final ICC_Profile icc = img.getICCProfile();
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22942);profiles.add(icc);
                } catch (IllegalArgumentException e) {
                    // Ignore. This imageLoader does not support Buffered.
                }
            }
        }}
    }}finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

    @Test
    public void testBrokenIccPng() throws Exception {__CLR4_5_2hluhlum68iyiw6.R.globalSliceStart(getClass().getName(),22943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g0u4oehpb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hluhlum68iyiw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hluhlum68iyiw6.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageLoaderTestCase.testBrokenIccPng",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22943,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g0u4oehpb() throws Exception{try{__CLR4_5_2hluhlum68iyiw6.R.inc(22943);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22944);String uri = "corrupt-icc.png";

        __CLR4_5_2hluhlum68iyiw6.R.inc(22945);MyImageSessionContext sessionContext = createImageSessionContext();
        __CLR4_5_2hluhlum68iyiw6.R.inc(22946);ImageManager manager = imageContext.getImageManager();

        __CLR4_5_2hluhlum68iyiw6.R.inc(22947);ImageInfo info = manager.preloadImage(uri, sessionContext);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22948);assertNotNull("ImageInfo must not be null", info);

        __CLR4_5_2hluhlum68iyiw6.R.inc(22949);Image img = manager.getImage(info, ImageFlavor.RENDERED_IMAGE, sessionContext);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22950);assertNotNull("Image must not be null", img);
        __CLR4_5_2hluhlum68iyiw6.R.inc(22951);assertEquals(ImageFlavor.RENDERED_IMAGE, img.getFlavor());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22952);ImageRendered imgRed = (ImageRendered) img;
        __CLR4_5_2hluhlum68iyiw6.R.inc(22953);assertNotNull(imgRed.getRenderedImage());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22954);assertEquals(400, imgRed.getRenderedImage().getWidth());
        __CLR4_5_2hluhlum68iyiw6.R.inc(22955);assertEquals(300, imgRed.getRenderedImage().getHeight());

        __CLR4_5_2hluhlum68iyiw6.R.inc(22956);sessionContext.checkAllStreamsClosed();
    }finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

    private static class MyImageSessionContext extends MockImageSessionContext {

        private List streams = new java.util.ArrayList();

        public MyImageSessionContext(ImageContext context) {
            super(context);__CLR4_5_2hluhlum68iyiw6.R.inc(22958);try{__CLR4_5_2hluhlum68iyiw6.R.inc(22957);
        }finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

        public Source newSource(String uri) {try{__CLR4_5_2hluhlum68iyiw6.R.inc(22959);
            __CLR4_5_2hluhlum68iyiw6.R.inc(22960);Source src = super.newSource(uri);
            __CLR4_5_2hluhlum68iyiw6.R.inc(22961);if ((((src instanceof ImageSource)&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22962)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22963)==0&false))) {{
                __CLR4_5_2hluhlum68iyiw6.R.inc(22964);ImageSource is = (ImageSource) src;
                __CLR4_5_2hluhlum68iyiw6.R.inc(22965);ImageInputStream in = is.getImageInputStream();
                //in = new ObservableImageInputStream(in, is.getSystemId());
                __CLR4_5_2hluhlum68iyiw6.R.inc(22966);in = ObservableStream.Factory.observe(in, is.getSystemId());
                __CLR4_5_2hluhlum68iyiw6.R.inc(22967);streams.add(in);
                __CLR4_5_2hluhlum68iyiw6.R.inc(22968);is.setImageInputStream(in);
            }
            }__CLR4_5_2hluhlum68iyiw6.R.inc(22969);return src;
        }finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

        /** {@inheritDoc} */
        protected Source resolveURI(String uri) {try{__CLR4_5_2hluhlum68iyiw6.R.inc(22970);
            __CLR4_5_2hluhlum68iyiw6.R.inc(22971);Source src = super.resolveURI(uri);
            __CLR4_5_2hluhlum68iyiw6.R.inc(22972);if ((((src instanceof StreamSource)&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22973)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22974)==0&false))) {{
                __CLR4_5_2hluhlum68iyiw6.R.inc(22975);StreamSource ss = (StreamSource) src;
                __CLR4_5_2hluhlum68iyiw6.R.inc(22976);if ((((ss.getInputStream() != null)&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22977)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22978)==0&false))) {{
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22979);InputStream in = new ObservableInputStream(
                            ss.getInputStream(), ss.getSystemId());
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22980);streams.add(in);
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22981);ss.setInputStream(in);
                }
            }}
            }__CLR4_5_2hluhlum68iyiw6.R.inc(22982);return src;
        }finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

        public void checkAllStreamsClosed() {try{__CLR4_5_2hluhlum68iyiw6.R.inc(22983);
            __CLR4_5_2hluhlum68iyiw6.R.inc(22984);Iterator iter = streams.iterator();
            __CLR4_5_2hluhlum68iyiw6.R.inc(22985);while ((((iter.hasNext())&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22986)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22987)==0&false))) {{
                __CLR4_5_2hluhlum68iyiw6.R.inc(22988);ObservableStream stream = (ObservableStream) iter.next();
                __CLR4_5_2hluhlum68iyiw6.R.inc(22989);iter.remove();
                __CLR4_5_2hluhlum68iyiw6.R.inc(22990);if ((((!stream.isClosed())&&(__CLR4_5_2hluhlum68iyiw6.R.iget(22991)!=0|true))||(__CLR4_5_2hluhlum68iyiw6.R.iget(22992)==0&false))) {{
                    __CLR4_5_2hluhlum68iyiw6.R.inc(22993);fail(stream.getClass().getName() + " is NOT closed: " + stream.getSystemID());
                }
            }}
        }}finally{__CLR4_5_2hluhlum68iyiw6.R.flushNeeded();}}

    }

}
