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

/* $Id: XMPSchemaRegistry.java 1685768 2015-06-16 11:46:06Z ssteiner $ */

package org.apache.xmlgraphics.xmp;

import java.util.Map;

import org.apache.xmlgraphics.xmp.schemas.DublinCoreSchema;
import org.apache.xmlgraphics.xmp.schemas.XMPBasicSchema;
import org.apache.xmlgraphics.xmp.schemas.pdf.AdobePDFSchema;
import org.apache.xmlgraphics.xmp.schemas.pdf.PDFAXMPSchema;
import org.apache.xmlgraphics.xmp.schemas.pdf.PDFUAXMPSchema;
import org.apache.xmlgraphics.xmp.schemas.pdf.PDFVTXMPSchema;
import org.apache.xmlgraphics.xmp.schemas.pdf.PDFXXMPSchema;
import org.apache.xmlgraphics.xmp.schemas.pdf.XAPMMXMPSchema;

/**
 * This class is a registry of XMP schemas. It's implemented as a singleton.
 */
public final class XMPSchemaRegistry {public static class __CLR4_5_2h2nh2nm6lb51dc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,22144,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static XMPSchemaRegistry instance = new XMPSchemaRegistry();

    private Map schemas = new java.util.HashMap();

    private XMPSchemaRegistry() {try{__CLR4_5_2h2nh2nm6lb51dc.R.inc(22127);
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22128);init();
    }finally{__CLR4_5_2h2nh2nm6lb51dc.R.flushNeeded();}}

    /** @return the singleton instance of the XMP schema registry. */
    public static XMPSchemaRegistry getInstance() {try{__CLR4_5_2h2nh2nm6lb51dc.R.inc(22129);
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22130);return instance;
    }finally{__CLR4_5_2h2nh2nm6lb51dc.R.flushNeeded();}}

    private void init() {try{__CLR4_5_2h2nh2nm6lb51dc.R.inc(22131);
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22132);addSchema(new DublinCoreSchema());
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22133);addSchema(new PDFAXMPSchema());
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22134);addSchema(new XMPBasicSchema());
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22135);addSchema(new AdobePDFSchema());
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22136);addSchema(new PDFXXMPSchema());
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22137);addSchema(new PDFVTXMPSchema());
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22138);addSchema(new XAPMMXMPSchema());
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22139);addSchema(new PDFUAXMPSchema());
    }finally{__CLR4_5_2h2nh2nm6lb51dc.R.flushNeeded();}}

    /**
     * Adds an XMP schema to the registry.
     * @param schema the XMP schema
     */
    public void addSchema(XMPSchema schema) {try{__CLR4_5_2h2nh2nm6lb51dc.R.inc(22140);
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22141);schemas.put(schema.getNamespace(), schema);
    }finally{__CLR4_5_2h2nh2nm6lb51dc.R.flushNeeded();}}

    /**
     * Returns the XMP schema object for a given namespace.
     * @param namespace the namespace URI
     * @return the XMP schema or null if none is available
     */
    public XMPSchema getSchema(String namespace) {try{__CLR4_5_2h2nh2nm6lb51dc.R.inc(22142);
        __CLR4_5_2h2nh2nm6lb51dc.R.inc(22143);return (XMPSchema)schemas.get(namespace);
    }finally{__CLR4_5_2h2nh2nm6lb51dc.R.flushNeeded();}}

}
