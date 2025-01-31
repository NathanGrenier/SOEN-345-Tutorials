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

/* $Id: ImageXMLDOM.java 682720 2008-08-05 14:22:29Z jeremias $ */

package org.apache.xmlgraphics.image.loader.impl;

import org.w3c.dom.Document;

import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.XMLNamespaceEnabledImageFlavor;

/**
 * This class is an implementation of the Image interface exposing an XML DOM (W3C).
 */
public class ImageXMLDOM extends AbstractImage {public static class __CLR4_5_28f68f6m6lb5057{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,10932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ImageFlavor flavor;
    private Document doc;
    private String rootNamespace;

    /**
     * Main constructor.
     * @param info the image info object
     * @param doc the W3C DOM document
     * @param rootNamespace the root XML namespace of the XML document in the DOM
     */
    public ImageXMLDOM(ImageInfo info, Document doc, String rootNamespace) {
        super(info);__CLR4_5_28f68f6m6lb5057.R.inc(10915);try{__CLR4_5_28f68f6m6lb5057.R.inc(10914);
        __CLR4_5_28f68f6m6lb5057.R.inc(10916);this.doc = doc;
        __CLR4_5_28f68f6m6lb5057.R.inc(10917);this.rootNamespace = rootNamespace;
        __CLR4_5_28f68f6m6lb5057.R.inc(10918);this.flavor = new XMLNamespaceEnabledImageFlavor(ImageFlavor.XML_DOM, rootNamespace);
    }finally{__CLR4_5_28f68f6m6lb5057.R.flushNeeded();}}

    /**
     * Main constructor.
     * @param info the image info object
     * @param doc the W3C DOM document
     * @param flavor the image flavor
     */
    public ImageXMLDOM(ImageInfo info, Document doc, XMLNamespaceEnabledImageFlavor flavor) {
        super(info);__CLR4_5_28f68f6m6lb5057.R.inc(10920);try{__CLR4_5_28f68f6m6lb5057.R.inc(10919);
        __CLR4_5_28f68f6m6lb5057.R.inc(10921);this.doc = doc;
        __CLR4_5_28f68f6m6lb5057.R.inc(10922);this.rootNamespace = flavor.getNamespace();
        __CLR4_5_28f68f6m6lb5057.R.inc(10923);this.flavor = flavor;
    }finally{__CLR4_5_28f68f6m6lb5057.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor getFlavor() {try{__CLR4_5_28f68f6m6lb5057.R.inc(10924);
        __CLR4_5_28f68f6m6lb5057.R.inc(10925);return this.flavor;
    }finally{__CLR4_5_28f68f6m6lb5057.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isCacheable() {try{__CLR4_5_28f68f6m6lb5057.R.inc(10926);
        __CLR4_5_28f68f6m6lb5057.R.inc(10927);return true;
    }finally{__CLR4_5_28f68f6m6lb5057.R.flushNeeded();}}

    /**
     * Returns the contained W3C DOM document.
     * @return the DOM
     */
    public Document getDocument() {try{__CLR4_5_28f68f6m6lb5057.R.inc(10928);
        __CLR4_5_28f68f6m6lb5057.R.inc(10929);return this.doc;
    }finally{__CLR4_5_28f68f6m6lb5057.R.flushNeeded();}}

    /**
     * Returns the root XML namespace of the XML document.
     * @return the root namespace
     */
    public String getRootNamespace() {try{__CLR4_5_28f68f6m6lb5057.R.inc(10930);
        __CLR4_5_28f68f6m6lb5057.R.inc(10931);return this.rootNamespace;
    }finally{__CLR4_5_28f68f6m6lb5057.R.flushNeeded();}}

}
