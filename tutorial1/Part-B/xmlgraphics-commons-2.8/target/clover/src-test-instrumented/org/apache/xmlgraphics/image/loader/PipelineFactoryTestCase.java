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

/* $Id: PipelineFactoryTestCase.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.apache.xmlgraphics.image.codec.tiff.TIFFImage;
import org.apache.xmlgraphics.image.loader.impl.ImageLoaderRawCCITTFax;
import org.apache.xmlgraphics.image.loader.mocks.MockImageLoaderFactoryTIFF;
import org.apache.xmlgraphics.image.loader.pipeline.ImageProviderPipeline;
import org.apache.xmlgraphics.image.loader.pipeline.PipelineFactory;
import org.apache.xmlgraphics.image.loader.spi.ImageImplRegistry;
import org.apache.xmlgraphics.image.loader.util.Penalty;

/**
 * Tests the pipeline factory.
 */
public class PipelineFactoryTestCase {static class __CLR4_5_2i6fi6fm68iyizz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,23657,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Tests the pipeline factory by checking to load a TIFF image.
     * @throws Exception if an error occurs
     */
    @Test
    public void testPipelineFactoryPlain() throws Exception {__CLR4_5_2i6fi6fm68iyizz.R.globalSliceStart(getClass().getName(),23559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l56jobi6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i6fi6fm68iyizz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i6fi6fm68iyizz.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.PipelineFactoryTestCase.testPipelineFactoryPlain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l56jobi6f() throws Exception{try{__CLR4_5_2i6fi6fm68iyizz.R.inc(23559);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23560);MockImageContext imageContext = MockImageContext.newSafeInstance();
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23561);ImageManager manager = imageContext.getImageManager();
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23562);PipelineFactory pFactory = new PipelineFactory(manager);

        //Input is some TIFF file
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23563);ImageInfo imageInfo = new ImageInfo("test:tiff", "image/tiff");

        //We want a G2D image
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23564);ImageFlavor targetFlavor = ImageFlavor.GRAPHICS2D;

        __CLR4_5_2i6fi6fm68iyizz.R.inc(23565);ImageProviderPipeline pipeline = pFactory.newImageConverterPipeline(
                imageInfo, targetFlavor);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23566);assertNotNull(pipeline);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23567);assertEquals(pipeline.getTargetFlavor(), targetFlavor);

        //penalty for internal TIFF implementation (fallback role) is 1000 + 10 for the conversion
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23568);assertEquals(1010, pipeline.getConversionPenalty());
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23569);assertEquals(ImageFlavor.GRAPHICS2D, pipeline.getTargetFlavor());
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23570);if ((((pipeline.toString().indexOf("LoaderInternalTIFF") < 0)&&(__CLR4_5_2i6fi6fm68iyizz.R.iget(23571)!=0|true))||(__CLR4_5_2i6fi6fm68iyizz.R.iget(23572)==0&false))) {{
            __CLR4_5_2i6fi6fm68iyizz.R.inc(23573);fail("Chose the wrong pipeline: " + pipeline.toString());
        }
        }__CLR4_5_2i6fi6fm68iyizz.R.inc(23574);if ((((pipeline.toString().indexOf("ImageConverterBitmap2G2D") < 0)&&(__CLR4_5_2i6fi6fm68iyizz.R.iget(23575)!=0|true))||(__CLR4_5_2i6fi6fm68iyizz.R.iget(23576)==0&false))) {{
            __CLR4_5_2i6fi6fm68iyizz.R.inc(23577);fail("Chose the wrong pipeline: " + pipeline.toString());
        }

        }__CLR4_5_2i6fi6fm68iyizz.R.inc(23578);ImageProviderPipeline[] candidates = pFactory.determineCandidatePipelines(
                imageInfo, new ImageFlavor[] {targetFlavor});
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23579);assertEquals(1, candidates.length);

        //Now add another implementation that poses as TIFF loader
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23580);imageContext.getImageManager().getRegistry().registerLoaderFactory(
                new MockImageLoaderFactoryTIFF());

        __CLR4_5_2i6fi6fm68iyizz.R.inc(23581);candidates = pFactory.determineCandidatePipelines(
                imageInfo, targetFlavor);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23582);assertEquals(3, candidates.length);
        //3 because the mock impl provides Buffered- and RenderedImage capabilities

        __CLR4_5_2i6fi6fm68iyizz.R.inc(23583);pipeline = pFactory.newImageConverterPipeline(imageInfo, targetFlavor);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23584);assertNotNull(pipeline);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23585);assertEquals(pipeline.getTargetFlavor(), targetFlavor);

        //Assuming mock impl without penalty + 10 for the conversion
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23586);assertEquals(10, pipeline.getConversionPenalty());
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23587);assertEquals(ImageFlavor.GRAPHICS2D, pipeline.getTargetFlavor());
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23588);if ((((pipeline.toString().indexOf(MockImageLoaderFactoryTIFF.class.getName()) < 0)&&(__CLR4_5_2i6fi6fm68iyizz.R.iget(23589)!=0|true))||(__CLR4_5_2i6fi6fm68iyizz.R.iget(23590)==0&false))) {{
            __CLR4_5_2i6fi6fm68iyizz.R.inc(23591);fail("Chose the wrong pipeline: " + pipeline.toString());
        }
        }__CLR4_5_2i6fi6fm68iyizz.R.inc(23592);if ((((pipeline.toString().indexOf("ImageConverterBitmap2G2D") < 0)&&(__CLR4_5_2i6fi6fm68iyizz.R.iget(23593)!=0|true))||(__CLR4_5_2i6fi6fm68iyizz.R.iget(23594)==0&false))) {{
            __CLR4_5_2i6fi6fm68iyizz.R.inc(23595);fail("Chose the wrong pipeline: " + pipeline.toString());
        }
    }}finally{__CLR4_5_2i6fi6fm68iyizz.R.flushNeeded();}}

    /**
     * Similar test as above but here we take raw CCITT loading into consideration, too.
     * @throws Exception if an error occurs
     */
    @Test
    public void testPipelineFactoryImageInfoDependency() throws Exception {__CLR4_5_2i6fi6fm68iyizz.R.globalSliceStart(getClass().getName(),23596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l5uxydi7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i6fi6fm68iyizz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i6fi6fm68iyizz.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.PipelineFactoryTestCase.testPipelineFactoryImageInfoDependency",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23596,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l5uxydi7g() throws Exception{try{__CLR4_5_2i6fi6fm68iyizz.R.inc(23596);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23597);MockImageContext imageContext = MockImageContext.newSafeInstance();
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23598);ImageManager manager = imageContext.getImageManager();
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23599);PipelineFactory pFactory = new PipelineFactory(manager);

        //Input is some TIFF file with CCITT Group 4 compression
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23600);ImageInfo imageInfo = new ImageInfo("test:tiff", "image/tiff");
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23601);imageInfo.getCustomObjects().put("TIFF_STRIP_COUNT", 1);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23602);imageInfo.getCustomObjects().put("TIFF_COMPRESSION", TIFFImage.COMP_FAX_G4_2D);

        //We want either a G2D image or a raw CCITT image
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23603);ImageFlavor[] targetFlavors = new ImageFlavor[] {
                ImageFlavor.GRAPHICS2D, ImageFlavor.RAW_CCITTFAX};

        __CLR4_5_2i6fi6fm68iyizz.R.inc(23604);ImageProviderPipeline[] candidates = pFactory.determineCandidatePipelines(
                imageInfo, targetFlavors);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23605);assertNotNull(candidates);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23606);assertEquals(2, candidates.length);

        __CLR4_5_2i6fi6fm68iyizz.R.inc(23607);ImageProviderPipeline pipeline = manager.choosePipeline(candidates);

        //0 penalty because the raw loader is the most efficient choice here
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23608);assertEquals(0, pipeline.getConversionPenalty());
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23609);assertEquals(ImageFlavor.RAW_CCITTFAX, pipeline.getTargetFlavor());
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23610);if ((((pipeline.toString().indexOf("LoaderRawCCITTFax") < 0)&&(__CLR4_5_2i6fi6fm68iyizz.R.iget(23611)!=0|true))||(__CLR4_5_2i6fi6fm68iyizz.R.iget(23612)==0&false))) {{
            __CLR4_5_2i6fi6fm68iyizz.R.inc(23613);fail("Chose the wrong pipeline: " + pipeline.toString());
        }

        //Now, we set this to a multi-strip TIFF which should disable the raw loader
        }__CLR4_5_2i6fi6fm68iyizz.R.inc(23614);imageInfo.getCustomObjects().put("TIFF_STRIP_COUNT", 7);

        __CLR4_5_2i6fi6fm68iyizz.R.inc(23615);candidates = pFactory.determineCandidatePipelines(
                imageInfo, targetFlavors);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23616);assertNotNull(candidates);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23617);assertEquals(1, candidates.length);

        __CLR4_5_2i6fi6fm68iyizz.R.inc(23618);pipeline = manager.choosePipeline(candidates);

        //penalty for internal TIFF implementation (fallback role) is 1000 + 10 for the conversion
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23619);assertEquals(1010, pipeline.getConversionPenalty());
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23620);assertEquals(ImageFlavor.GRAPHICS2D, pipeline.getTargetFlavor());
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23621);if ((((pipeline.toString().indexOf("LoaderInternalTIFF") < 0)&&(__CLR4_5_2i6fi6fm68iyizz.R.iget(23622)!=0|true))||(__CLR4_5_2i6fi6fm68iyizz.R.iget(23623)==0&false))) {{
            __CLR4_5_2i6fi6fm68iyizz.R.inc(23624);fail("Chose the wrong pipeline: " + pipeline.toString());
        }
        }__CLR4_5_2i6fi6fm68iyizz.R.inc(23625);if ((((pipeline.toString().indexOf("ImageConverterBitmap2G2D") < 0)&&(__CLR4_5_2i6fi6fm68iyizz.R.iget(23626)!=0|true))||(__CLR4_5_2i6fi6fm68iyizz.R.iget(23627)==0&false))) {{
            __CLR4_5_2i6fi6fm68iyizz.R.inc(23628);fail("Chose the wrong pipeline: " + pipeline.toString());
        }
    }}finally{__CLR4_5_2i6fi6fm68iyizz.R.flushNeeded();}}

    /**
     * Similar test as above but now we're playing with additional penalties in the registry.
     * @throws Exception if an error occurs
     */
    @Test
    public void testPipelineFactoryAdditionalPenalty() throws Exception {__CLR4_5_2i6fi6fm68iyizz.R.globalSliceStart(getClass().getName(),23629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2162ibxi8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i6fi6fm68iyizz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i6fi6fm68iyizz.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.PipelineFactoryTestCase.testPipelineFactoryAdditionalPenalty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23629,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2162ibxi8d() throws Exception{try{__CLR4_5_2i6fi6fm68iyizz.R.inc(23629);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23630);MockImageContext imageContext = MockImageContext.newSafeInstance();
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23631);ImageManager manager = imageContext.getImageManager();
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23632);PipelineFactory pFactory = new PipelineFactory(manager);

        //Adding additional penalty for CCITT loading
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23633);ImageImplRegistry registry = imageContext.getImageManager().getRegistry();
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23634);registry.setAdditionalPenalty(ImageLoaderRawCCITTFax.class.getName(),
                Penalty.toPenalty(10000));

        //Input is some TIFF file with CCITT Group 4 compression
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23635);ImageInfo imageInfo = new ImageInfo("test:tiff", "image/tiff");
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23636);imageInfo.getCustomObjects().put("TIFF_STRIP_COUNT", 1);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23637);imageInfo.getCustomObjects().put("TIFF_COMPRESSION", TIFFImage.COMP_FAX_G4_2D);

        //We want either a G2D image or a raw CCITT image
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23638);ImageFlavor[] targetFlavors = new ImageFlavor[] {
                ImageFlavor.GRAPHICS2D, ImageFlavor.RAW_CCITTFAX};

        __CLR4_5_2i6fi6fm68iyizz.R.inc(23639);ImageProviderPipeline[] candidates = pFactory.determineCandidatePipelines(
                imageInfo, targetFlavors);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23640);assertNotNull(candidates);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23641);assertEquals(2, candidates.length);

        __CLR4_5_2i6fi6fm68iyizz.R.inc(23642);ImageProviderPipeline pipeline = manager.choosePipeline(candidates);

        //penalty for internal TIFF implementation (fallback role) is 1000 + 10 for the conversion
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23643);assertEquals(1010, pipeline.getConversionPenalty());
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23644);assertEquals(ImageFlavor.GRAPHICS2D, pipeline.getTargetFlavor());
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23645);if ((((pipeline.toString().indexOf("LoaderInternalTIFF") < 0)&&(__CLR4_5_2i6fi6fm68iyizz.R.iget(23646)!=0|true))||(__CLR4_5_2i6fi6fm68iyizz.R.iget(23647)==0&false))) {{
            __CLR4_5_2i6fi6fm68iyizz.R.inc(23648);fail("Chose the wrong pipeline: " + pipeline.toString());
        }
        }__CLR4_5_2i6fi6fm68iyizz.R.inc(23649);if ((((pipeline.toString().indexOf("ImageConverterBitmap2G2D") < 0)&&(__CLR4_5_2i6fi6fm68iyizz.R.iget(23650)!=0|true))||(__CLR4_5_2i6fi6fm68iyizz.R.iget(23651)==0&false))) {{
            __CLR4_5_2i6fi6fm68iyizz.R.inc(23652);fail("Chose the wrong pipeline: " + pipeline.toString());
        }

        //Now set an infinite penalty making the solution ineligible
        }__CLR4_5_2i6fi6fm68iyizz.R.inc(23653);registry.setAdditionalPenalty(ImageLoaderRawCCITTFax.class.getName(),
                Penalty.INFINITE_PENALTY);

        __CLR4_5_2i6fi6fm68iyizz.R.inc(23654);candidates = pFactory.determineCandidatePipelines(imageInfo, targetFlavors);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23655);assertNotNull(candidates);
        __CLR4_5_2i6fi6fm68iyizz.R.inc(23656);assertEquals(1, candidates.length);
        //While earlier 2 candidates were returned, here we only get 1 because of the infinite
        //penalty.
    }finally{__CLR4_5_2i6fi6fm68iyizz.R.flushNeeded();}}

}
