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

/* $Id: DefaultImageSessionContext.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.apache.xmlgraphics.image.loader.ImageContext;

/**
 * Very simple implementation of the ImageSessionContext interface. It works for absolute URLs
 * and local filenames only. Consider writing your own implementation of the ImageSessionContext
 * if you need more sophisticated functionality.
 */
public class DefaultImageSessionContext extends AbstractImageSessionContext {public static class __CLR4_5_27rs7rsm68iyh5f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,10092,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ImageContext context;
    private File baseDir;

    /**
     * Main constructor.
     * @param context the parent image context
     * @param baseDir the base directory for resolving relative filenames
     */
    public DefaultImageSessionContext(ImageContext context, File baseDir) {try{__CLR4_5_27rs7rsm68iyh5f.R.inc(10072);
        __CLR4_5_27rs7rsm68iyh5f.R.inc(10073);this.context = context;
        __CLR4_5_27rs7rsm68iyh5f.R.inc(10074);this.baseDir = baseDir;
    }finally{__CLR4_5_27rs7rsm68iyh5f.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageContext getParentContext() {try{__CLR4_5_27rs7rsm68iyh5f.R.inc(10075);
        __CLR4_5_27rs7rsm68iyh5f.R.inc(10076);return this.context;
    }finally{__CLR4_5_27rs7rsm68iyh5f.R.flushNeeded();}}

    /**
     * Returns the base directory for resolving relative filenames.
     * @return the base directory
     */
    public File getBaseDir() {try{__CLR4_5_27rs7rsm68iyh5f.R.inc(10077);
        __CLR4_5_27rs7rsm68iyh5f.R.inc(10078);return this.baseDir;
    }finally{__CLR4_5_27rs7rsm68iyh5f.R.flushNeeded();}}

    /** {@inheritDoc} */
    protected Source resolveURI(String uri) {try{__CLR4_5_27rs7rsm68iyh5f.R.inc(10079);
        __CLR4_5_27rs7rsm68iyh5f.R.inc(10080);try {
            __CLR4_5_27rs7rsm68iyh5f.R.inc(10081);URL url = new URL(uri);
            __CLR4_5_27rs7rsm68iyh5f.R.inc(10082);return new StreamSource(url.openStream(), url.toExternalForm());
        } catch (MalformedURLException e) {
            __CLR4_5_27rs7rsm68iyh5f.R.inc(10083);File f = new File(baseDir, uri);
            __CLR4_5_27rs7rsm68iyh5f.R.inc(10084);if ((((f.isFile())&&(__CLR4_5_27rs7rsm68iyh5f.R.iget(10085)!=0|true))||(__CLR4_5_27rs7rsm68iyh5f.R.iget(10086)==0&false))) {{
                __CLR4_5_27rs7rsm68iyh5f.R.inc(10087);return new StreamSource(f);
            } }else {{
                __CLR4_5_27rs7rsm68iyh5f.R.inc(10088);return null;
            }
        }} catch (IOException ioe) {
            __CLR4_5_27rs7rsm68iyh5f.R.inc(10089);return null;
        }
    }finally{__CLR4_5_27rs7rsm68iyh5f.R.flushNeeded();}}

    /** {@inheritDoc} */
    public float getTargetResolution() {try{__CLR4_5_27rs7rsm68iyh5f.R.inc(10090);
        __CLR4_5_27rs7rsm68iyh5f.R.inc(10091);return getParentContext().getSourceResolution(); //same as source resolution
    }finally{__CLR4_5_27rs7rsm68iyh5f.R.flushNeeded();}}

}
