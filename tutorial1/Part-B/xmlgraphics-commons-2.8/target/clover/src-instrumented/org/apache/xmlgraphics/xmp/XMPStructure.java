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

/* $Id: XMPStructure.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.xmp;

import java.util.Iterator;
import java.util.Map;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import org.apache.xmlgraphics.util.QName;

/**
 * Represents an XMP structure as defined by the XMP specification.
 */
public class XMPStructure extends XMPComplexValue implements PropertyAccess {public static class __CLR4_5_2h4dh4dm68iyile{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,22217,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map properties = new java.util.HashMap();

    /**
     * Main constructor
     */
    public XMPStructure() {try{__CLR4_5_2h4dh4dm68iyile.R.inc(22189);
    }finally{__CLR4_5_2h4dh4dm68iyile.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Object getSimpleValue() {try{__CLR4_5_2h4dh4dm68iyile.R.inc(22190);
        __CLR4_5_2h4dh4dm68iyile.R.inc(22191);return null;
    }finally{__CLR4_5_2h4dh4dm68iyile.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setProperty(XMPProperty prop) {try{__CLR4_5_2h4dh4dm68iyile.R.inc(22192);
        __CLR4_5_2h4dh4dm68iyile.R.inc(22193);properties.put(prop.getName(), prop);
    }finally{__CLR4_5_2h4dh4dm68iyile.R.flushNeeded();}}

    /** {@inheritDoc} */
    public XMPProperty getProperty(String uri, String localName) {try{__CLR4_5_2h4dh4dm68iyile.R.inc(22194);
        __CLR4_5_2h4dh4dm68iyile.R.inc(22195);return getProperty(new QName(uri, localName));
    }finally{__CLR4_5_2h4dh4dm68iyile.R.flushNeeded();}}

    /** {@inheritDoc} */
    public XMPProperty getValueProperty() {try{__CLR4_5_2h4dh4dm68iyile.R.inc(22196);
        __CLR4_5_2h4dh4dm68iyile.R.inc(22197);return getProperty(XMPConstants.RDF_VALUE);
    }finally{__CLR4_5_2h4dh4dm68iyile.R.flushNeeded();}}

    /** {@inheritDoc} */
    public XMPProperty getProperty(QName name) {try{__CLR4_5_2h4dh4dm68iyile.R.inc(22198);
        __CLR4_5_2h4dh4dm68iyile.R.inc(22199);XMPProperty prop = (XMPProperty)properties.get(name);
        __CLR4_5_2h4dh4dm68iyile.R.inc(22200);return prop;
    }finally{__CLR4_5_2h4dh4dm68iyile.R.flushNeeded();}}

    /** {@inheritDoc} */
    public XMPProperty removeProperty(QName name) {try{__CLR4_5_2h4dh4dm68iyile.R.inc(22201);
        __CLR4_5_2h4dh4dm68iyile.R.inc(22202);return (XMPProperty)properties.remove(name);
    }finally{__CLR4_5_2h4dh4dm68iyile.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getPropertyCount() {try{__CLR4_5_2h4dh4dm68iyile.R.inc(22203);
        __CLR4_5_2h4dh4dm68iyile.R.inc(22204);return this.properties.size();
    }finally{__CLR4_5_2h4dh4dm68iyile.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Iterator iterator() {try{__CLR4_5_2h4dh4dm68iyile.R.inc(22205);
        __CLR4_5_2h4dh4dm68iyile.R.inc(22206);return this.properties.keySet().iterator();
    }finally{__CLR4_5_2h4dh4dm68iyile.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void toSAX(ContentHandler handler) throws SAXException {try{__CLR4_5_2h4dh4dm68iyile.R.inc(22207);
        __CLR4_5_2h4dh4dm68iyile.R.inc(22208);AttributesImpl atts = new AttributesImpl();
        __CLR4_5_2h4dh4dm68iyile.R.inc(22209);atts.clear();
        __CLR4_5_2h4dh4dm68iyile.R.inc(22210);handler.startElement(XMPConstants.RDF_NAMESPACE, "RDF", "rdf:Description", atts);

        __CLR4_5_2h4dh4dm68iyile.R.inc(22211);for (Object o : properties.values()) {{
            __CLR4_5_2h4dh4dm68iyile.R.inc(22212);XMPProperty prop = (XMPProperty) o;
            //if (prop.getName().getNamespaceURI().equals(ns)) {
            __CLR4_5_2h4dh4dm68iyile.R.inc(22213);prop.toSAX(handler);
            //}
        }
        }__CLR4_5_2h4dh4dm68iyile.R.inc(22214);handler.endElement(XMPConstants.RDF_NAMESPACE, "RDF", "rdf:Description");
    }finally{__CLR4_5_2h4dh4dm68iyile.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_2h4dh4dm68iyile.R.inc(22215);
        __CLR4_5_2h4dh4dm68iyile.R.inc(22216);return "XMP structure: " + getPropertyCount();
    }finally{__CLR4_5_2h4dh4dm68iyile.R.flushNeeded();}}


}
