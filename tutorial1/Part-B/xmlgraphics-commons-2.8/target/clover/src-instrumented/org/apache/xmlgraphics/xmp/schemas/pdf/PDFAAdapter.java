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

/* $Id: PDFAAdapter.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.xmp.schemas.pdf;

import org.apache.xmlgraphics.xmp.Metadata;
import org.apache.xmlgraphics.xmp.XMPSchemaAdapter;
import org.apache.xmlgraphics.xmp.XMPSchemaRegistry;

/**
 * Schema adapter implementation for both the old (deprecated) and the current PDF/A schema.
 * The old namespace is still needed to make Adobe Acrobat happy.
 */
public class PDFAAdapter extends XMPSchemaAdapter {public static class __CLR4_5_2hauhaum6lb51fy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,22436,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String PART = "part";
    private static final String AMD = "amd";
    private static final String CONFORMANCE = "conformance";

    /**
     * Constructs a new adapter for PDF/A around the given metadata object.
     * @param meta the underlying metadata
     * @param namespace the namespace to access the schema (must be one of the PDF/A schema
     *                  namespaces)
     */
    public PDFAAdapter(Metadata meta, String namespace) {
        super(meta, XMPSchemaRegistry.getInstance().getSchema(namespace));__CLR4_5_2hauhaum6lb51fy.R.inc(22423);try{__CLR4_5_2hauhaum6lb51fy.R.inc(22422);
    }finally{__CLR4_5_2hauhaum6lb51fy.R.flushNeeded();}}

    /**
     * Sets the PDF/A version identifier ("part").
     * @param value the version identifier ("1" for PDF/A-1)
     */
    public void setPart(int value) {try{__CLR4_5_2hauhaum6lb51fy.R.inc(22424);
        __CLR4_5_2hauhaum6lb51fy.R.inc(22425);setValue(PART, Integer.toString(value));
    }finally{__CLR4_5_2hauhaum6lb51fy.R.flushNeeded();}}

    /** @return the PDF/A version identifier */
    public int getPart() {try{__CLR4_5_2hauhaum6lb51fy.R.inc(22426);
        __CLR4_5_2hauhaum6lb51fy.R.inc(22427);return Integer.parseInt(getValue(PART));
    }finally{__CLR4_5_2hauhaum6lb51fy.R.flushNeeded();}}

    /**
     * Sets the PDF/A amendment identifier ("amd").
     * @param value the amendment identifiert
     */
    public void setAmendment(String value) {try{__CLR4_5_2hauhaum6lb51fy.R.inc(22428);
        __CLR4_5_2hauhaum6lb51fy.R.inc(22429);setValue(AMD, value);
    }finally{__CLR4_5_2hauhaum6lb51fy.R.flushNeeded();}}

    /** @return the PDF/A amendment identifier */
    public String getAmendment() {try{__CLR4_5_2hauhaum6lb51fy.R.inc(22430);
        __CLR4_5_2hauhaum6lb51fy.R.inc(22431);return getValue(AMD);
    }finally{__CLR4_5_2hauhaum6lb51fy.R.flushNeeded();}}

    /**
     * Sets the PDF/A conformance level.
     * @param value the conformance level ("A" or "B" for PDF/A-1)
     */
    public void setConformance(String value) {try{__CLR4_5_2hauhaum6lb51fy.R.inc(22432);
        __CLR4_5_2hauhaum6lb51fy.R.inc(22433);setValue(CONFORMANCE, value);
    }finally{__CLR4_5_2hauhaum6lb51fy.R.flushNeeded();}}

    /** @return the PDF/A conformance level */
    public String getConformance() {try{__CLR4_5_2hauhaum6lb51fy.R.inc(22434);
        __CLR4_5_2hauhaum6lb51fy.R.inc(22435);return getValue(CONFORMANCE);
    }finally{__CLR4_5_2hauhaum6lb51fy.R.flushNeeded();}}

}
