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

/* $Id: ClasspathResource.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.util;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/**
 * A class to find resources in the classpath by their mime-type specified in
 * the MANIFEST.
 * <p>
 * This class searches for content entries in all META-INF/MANIFEST.MF files. It
 * will find files with a given Content-Type: attribute. This allows to add
 * arbitrary resources by content-type just by creating a JAR wrapper and adding
 * them to the classpath.
 * <p>
 * Example:<br>
 *
 * <pre>
 * Name: test.txt
 * Content-Type: text/plain
 * </pre>
 */
public final class ClasspathResource {public static class __CLR4_5_2f60f60m6lb50v5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,19727,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Actual Type: Map&lt;String,List&lt;URL&gt;&gt;.
     */
    private final Map contentMappings;

    private static final String MANIFEST_PATH = "META-INF/MANIFEST.MF";

    private static final String CONTENT_TYPE_KEY = "Content-Type";

    private static ClasspathResource classpathResource;

    private ClasspathResource() {try{__CLR4_5_2f60f60m6lb50v5.R.inc(19656);
        __CLR4_5_2f60f60m6lb50v5.R.inc(19657);contentMappings = new HashMap();
        __CLR4_5_2f60f60m6lb50v5.R.inc(19658);loadManifests();
    }finally{__CLR4_5_2f60f60m6lb50v5.R.flushNeeded();}}

    /**
     * Retrieve the singleton instance of this class.
     *
     * @return the ClassPathResource instance.
     */
    public static synchronized ClasspathResource getInstance() {try{__CLR4_5_2f60f60m6lb50v5.R.inc(19659);
        __CLR4_5_2f60f60m6lb50v5.R.inc(19660);if ((((classpathResource == null)&&(__CLR4_5_2f60f60m6lb50v5.R.iget(19661)!=0|true))||(__CLR4_5_2f60f60m6lb50v5.R.iget(19662)==0&false))) {{
            __CLR4_5_2f60f60m6lb50v5.R.inc(19663);classpathResource = new ClasspathResource();
        }
        }__CLR4_5_2f60f60m6lb50v5.R.inc(19664);return classpathResource;
    }finally{__CLR4_5_2f60f60m6lb50v5.R.flushNeeded();}}

    /* Actual return type: Set<ClassLoader> */
    private Set getClassLoadersForResources() {try{__CLR4_5_2f60f60m6lb50v5.R.inc(19665);
        __CLR4_5_2f60f60m6lb50v5.R.inc(19666);Set v = new HashSet();
        __CLR4_5_2f60f60m6lb50v5.R.inc(19667);try {
            __CLR4_5_2f60f60m6lb50v5.R.inc(19668);ClassLoader l = ClassLoader.getSystemClassLoader();
            __CLR4_5_2f60f60m6lb50v5.R.inc(19669);if ((((l != null)&&(__CLR4_5_2f60f60m6lb50v5.R.iget(19670)!=0|true))||(__CLR4_5_2f60f60m6lb50v5.R.iget(19671)==0&false))) {{
                __CLR4_5_2f60f60m6lb50v5.R.inc(19672);v.add(l);
            }
        }} catch (SecurityException e) {
            // Ignore
        }
        __CLR4_5_2f60f60m6lb50v5.R.inc(19673);try {
            __CLR4_5_2f60f60m6lb50v5.R.inc(19674);ClassLoader l = Thread.currentThread().getContextClassLoader();
            __CLR4_5_2f60f60m6lb50v5.R.inc(19675);if ((((l != null)&&(__CLR4_5_2f60f60m6lb50v5.R.iget(19676)!=0|true))||(__CLR4_5_2f60f60m6lb50v5.R.iget(19677)==0&false))) {{
                __CLR4_5_2f60f60m6lb50v5.R.inc(19678);v.add(l);
            }
        }} catch (SecurityException e) {
            // Ignore
        }
        __CLR4_5_2f60f60m6lb50v5.R.inc(19679);try {
            __CLR4_5_2f60f60m6lb50v5.R.inc(19680);ClassLoader l = ClasspathResource.class.getClassLoader();
            __CLR4_5_2f60f60m6lb50v5.R.inc(19681);if ((((l != null)&&(__CLR4_5_2f60f60m6lb50v5.R.iget(19682)!=0|true))||(__CLR4_5_2f60f60m6lb50v5.R.iget(19683)==0&false))) {{
                __CLR4_5_2f60f60m6lb50v5.R.inc(19684);v.add(l);
            }
        }} catch (SecurityException e) {
            // Ignore
        }
        __CLR4_5_2f60f60m6lb50v5.R.inc(19685);return v;
    }finally{__CLR4_5_2f60f60m6lb50v5.R.flushNeeded();}}

    private void loadManifests() {try{__CLR4_5_2f60f60m6lb50v5.R.inc(19686);
        __CLR4_5_2f60f60m6lb50v5.R.inc(19687);Enumeration e;
        __CLR4_5_2f60f60m6lb50v5.R.inc(19688);try {

            __CLR4_5_2f60f60m6lb50v5.R.inc(19689);for (Object o1 : getClassLoadersForResources()) {{
                __CLR4_5_2f60f60m6lb50v5.R.inc(19690);ClassLoader classLoader = (ClassLoader) o1;

                __CLR4_5_2f60f60m6lb50v5.R.inc(19691);e = classLoader.getResources(MANIFEST_PATH);

                __CLR4_5_2f60f60m6lb50v5.R.inc(19692);while ((((e.hasMoreElements())&&(__CLR4_5_2f60f60m6lb50v5.R.iget(19693)!=0|true))||(__CLR4_5_2f60f60m6lb50v5.R.iget(19694)==0&false))) {{
                    __CLR4_5_2f60f60m6lb50v5.R.inc(19695);final URL u = (URL) e.nextElement();
                    __CLR4_5_2f60f60m6lb50v5.R.inc(19696);try {
                        __CLR4_5_2f60f60m6lb50v5.R.inc(19697);final Manifest manifest = new Manifest(u.openStream());
                        __CLR4_5_2f60f60m6lb50v5.R.inc(19698);final Map entries = manifest.getEntries();
                        __CLR4_5_2f60f60m6lb50v5.R.inc(19699);for (Object o : entries.entrySet()) {{
                            __CLR4_5_2f60f60m6lb50v5.R.inc(19700);final Map.Entry entry = (Map.Entry) o;
                            __CLR4_5_2f60f60m6lb50v5.R.inc(19701);final String name = (String) entry.getKey();
                            __CLR4_5_2f60f60m6lb50v5.R.inc(19702);final Attributes attributes = (Attributes) entry
                                    .getValue();
                            __CLR4_5_2f60f60m6lb50v5.R.inc(19703);final String contentType = attributes
                                    .getValue(CONTENT_TYPE_KEY);
                            __CLR4_5_2f60f60m6lb50v5.R.inc(19704);if ((((contentType != null)&&(__CLR4_5_2f60f60m6lb50v5.R.iget(19705)!=0|true))||(__CLR4_5_2f60f60m6lb50v5.R.iget(19706)==0&false))) {{
                                __CLR4_5_2f60f60m6lb50v5.R.inc(19707);addToMapping(contentType, name, classLoader);
                            }
                        }}
                    }} catch (IOException io) {
                        // TODO: Log.
                    }
                }
            }}

        }} catch (IOException io) {
            // TODO: Log.
        }
    }finally{__CLR4_5_2f60f60m6lb50v5.R.flushNeeded();}}

    private void addToMapping(final String contentType, final String name,
            final ClassLoader classLoader) {try{__CLR4_5_2f60f60m6lb50v5.R.inc(19708);
        __CLR4_5_2f60f60m6lb50v5.R.inc(19709);List existingFiles = (List) contentMappings.get(contentType);
        __CLR4_5_2f60f60m6lb50v5.R.inc(19710);if ((((existingFiles == null)&&(__CLR4_5_2f60f60m6lb50v5.R.iget(19711)!=0|true))||(__CLR4_5_2f60f60m6lb50v5.R.iget(19712)==0&false))) {{
            __CLR4_5_2f60f60m6lb50v5.R.inc(19713);existingFiles = new Vector();
            __CLR4_5_2f60f60m6lb50v5.R.inc(19714);contentMappings.put(contentType, existingFiles);
        }
        }__CLR4_5_2f60f60m6lb50v5.R.inc(19715);final URL url = classLoader.getResource(name);
        __CLR4_5_2f60f60m6lb50v5.R.inc(19716);if ((((url != null)&&(__CLR4_5_2f60f60m6lb50v5.R.iget(19717)!=0|true))||(__CLR4_5_2f60f60m6lb50v5.R.iget(19718)==0&false))) {{
            __CLR4_5_2f60f60m6lb50v5.R.inc(19719);existingFiles.add(url);
        }
    }}finally{__CLR4_5_2f60f60m6lb50v5.R.flushNeeded();}}

    /**
     * Retrieve a list of resources known to have the given mime-type.
     *
     * @param mimeType
     *            the mime-type to search for.
     * @return a List&lt;URL&gt;, guaranteed to be != null.
     */
    public List listResourcesOfMimeType(final String mimeType) {try{__CLR4_5_2f60f60m6lb50v5.R.inc(19720);
        __CLR4_5_2f60f60m6lb50v5.R.inc(19721);final List content = (List) contentMappings.get(mimeType);
        __CLR4_5_2f60f60m6lb50v5.R.inc(19722);if ((((content == null)&&(__CLR4_5_2f60f60m6lb50v5.R.iget(19723)!=0|true))||(__CLR4_5_2f60f60m6lb50v5.R.iget(19724)==0&false))) {{
            __CLR4_5_2f60f60m6lb50v5.R.inc(19725);return Collections.EMPTY_LIST;
        } }else {{
            __CLR4_5_2f60f60m6lb50v5.R.inc(19726);return content;
        }
    }}finally{__CLR4_5_2f60f60m6lb50v5.R.flushNeeded();}}

}
