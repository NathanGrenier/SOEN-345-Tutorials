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

/* $Id: MockImageContext.java 924666 2010-03-18 08:26:30Z jeremias $ */

package org.apache.xmlgraphics.image.loader;

import org.apache.xmlgraphics.image.loader.impl.ImageConverterBitmap2G2D;
import org.apache.xmlgraphics.image.loader.impl.ImageConverterBuffered2Rendered;
import org.apache.xmlgraphics.image.loader.impl.ImageConverterG2D2Bitmap;
import org.apache.xmlgraphics.image.loader.impl.ImageLoaderFactoryInternalTIFF;
import org.apache.xmlgraphics.image.loader.impl.ImageLoaderFactoryRawCCITTFax;
import org.apache.xmlgraphics.image.loader.impl.PreloaderEPS;
import org.apache.xmlgraphics.image.loader.impl.PreloaderJPEG;
import org.apache.xmlgraphics.image.loader.impl.PreloaderTIFF;
import org.apache.xmlgraphics.image.loader.spi.ImageImplRegistry;

/**
 * Mock implementation for testing.
 */
public class MockImageContext implements ImageContext {public static class __CLR4_5_2i3ni3nm6lb5213{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,23485,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static MockImageContext instance;

    private ImageManager imageManager;

    /**
     * Returns a singleton instance of the mock image context.
     * @return the singleton
     */
    public static MockImageContext getInstance() {try{__CLR4_5_2i3ni3nm6lb5213.R.inc(23459);
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23460);if ((((instance == null)&&(__CLR4_5_2i3ni3nm6lb5213.R.iget(23461)!=0|true))||(__CLR4_5_2i3ni3nm6lb5213.R.iget(23462)==0&false))) {{
            __CLR4_5_2i3ni3nm6lb5213.R.inc(23463);instance = new MockImageContext(true);
        }
        }__CLR4_5_2i3ni3nm6lb5213.R.inc(23464);return instance;
    }finally{__CLR4_5_2i3ni3nm6lb5213.R.flushNeeded();}}

    /**
     * Returns an image context for testing that only contains platform- and classpath-independent
     * implementations so consistent test results can be obtained irrespective of the test
     * environment.
     * @return a new image context
     */
    public static MockImageContext newSafeInstance() {try{__CLR4_5_2i3ni3nm6lb5213.R.inc(23465);
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23466);MockImageContext ic = new MockImageContext(false);
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23467);ImageImplRegistry registry = ic.getImageManager().getRegistry();
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23468);registry.registerPreloader(new PreloaderTIFF());
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23469);registry.registerPreloader(new PreloaderJPEG());
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23470);registry.registerPreloader(new PreloaderEPS());
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23471);registry.registerLoaderFactory(new ImageLoaderFactoryInternalTIFF());
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23472);registry.registerLoaderFactory(new ImageLoaderFactoryRawCCITTFax());
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23473);registry.registerConverter(new ImageConverterBitmap2G2D());
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23474);registry.registerConverter(new ImageConverterG2D2Bitmap());
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23475);registry.registerConverter(new ImageConverterBuffered2Rendered());
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23476);return ic;
    }finally{__CLR4_5_2i3ni3nm6lb5213.R.flushNeeded();}}

    /**
     * Creates a new mock image context.
     * @param discover true to enable plug-in discovery
     */
    public MockImageContext(boolean discover) {try{__CLR4_5_2i3ni3nm6lb5213.R.inc(23477);
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23478);this.imageManager = new ImageManager(new ImageImplRegistry(discover), this);
    }finally{__CLR4_5_2i3ni3nm6lb5213.R.flushNeeded();}}

    /** {@inheritDoc} */
    public float getSourceResolution() {try{__CLR4_5_2i3ni3nm6lb5213.R.inc(23479);
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23480);return 72;
    }finally{__CLR4_5_2i3ni3nm6lb5213.R.flushNeeded();}}

    /**
     * Returns the image manager.
     * @return the image manager
     */
    public ImageManager getImageManager() {try{__CLR4_5_2i3ni3nm6lb5213.R.inc(23481);
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23482);return this.imageManager;
    }finally{__CLR4_5_2i3ni3nm6lb5213.R.flushNeeded();}}

    /**
     * Creates a new image session context.
     * @return the image session context
     */
    public ImageSessionContext newSessionContext() {try{__CLR4_5_2i3ni3nm6lb5213.R.inc(23483);
        __CLR4_5_2i3ni3nm6lb5213.R.inc(23484);return new MockImageSessionContext(this);
    }finally{__CLR4_5_2i3ni3nm6lb5213.R.flushNeeded();}}
}
