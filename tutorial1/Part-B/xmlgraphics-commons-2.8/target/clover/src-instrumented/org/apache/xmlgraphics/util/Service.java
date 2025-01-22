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

/* $Id: Service.java 1780540 2017-01-27 11:10:50Z ssteiner $ */

package org.apache.xmlgraphics.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;

/**
 * This class handles looking up service providers on the class path.
 * It implements the system described in:
 *
 * <a href='http://docs.oracle.com/javase/6/docs/technotes/guides/jar/jar.html#Service%20Provider'>JAR
 * File Specification Under Service Provider</a>. Note that this
 * interface is very similar to the one they describe which seems to
 * be missing in the JDK.
 *
 * @version $Id: Service.java 1780540 2017-01-27 11:10:50Z ssteiner $
 *
 * Originally authored by Thomas DeWeese.
 */
public final class Service {public static class __CLR4_5_2fizfizm68iyid1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,20210,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Service() {try{__CLR4_5_2fizfizm68iyid1.R.inc(20123);
    }finally{__CLR4_5_2fizfizm68iyid1.R.flushNeeded();}}

    // Remember providers we have looked up before.
    static Map<String, List<String>> classMap = new java.util.HashMap<String, List<String>>();
    static Map<String, List<Object>> instanceMap = new java.util.HashMap<String, List<Object>>();

    /**
     * Returns an iterator where each element should implement the
     * interface (or subclass the baseclass) described by cls.  The
     * Classes are found by searching the classpath for service files
     * named: 'META-INF/services/&lt;fully qualified classname&gt; that list
     * fully qualifted classnames of classes that implement the
     * service files classes interface.  These classes must have
     * default constructors.
     *
     * @param cls The class/interface to search for providers of.
     */
    public static synchronized Iterator<Object> providers(Class<?> cls) {try{__CLR4_5_2fizfizm68iyid1.R.inc(20124);
        __CLR4_5_2fizfizm68iyid1.R.inc(20125);String serviceFile = getServiceFilename(cls);

        __CLR4_5_2fizfizm68iyid1.R.inc(20126);List<Object> l = instanceMap.get(serviceFile);
        __CLR4_5_2fizfizm68iyid1.R.inc(20127);if ((((l != null)&&(__CLR4_5_2fizfizm68iyid1.R.iget(20128)!=0|true))||(__CLR4_5_2fizfizm68iyid1.R.iget(20129)==0&false))) {{
            __CLR4_5_2fizfizm68iyid1.R.inc(20130);return l.iterator();
        }

        }__CLR4_5_2fizfizm68iyid1.R.inc(20131);l = new java.util.ArrayList<Object>();
        __CLR4_5_2fizfizm68iyid1.R.inc(20132);instanceMap.put(serviceFile, l);

        __CLR4_5_2fizfizm68iyid1.R.inc(20133);ClassLoader cl = getClassLoader(cls);
        __CLR4_5_2fizfizm68iyid1.R.inc(20134);if ((((cl != null)&&(__CLR4_5_2fizfizm68iyid1.R.iget(20135)!=0|true))||(__CLR4_5_2fizfizm68iyid1.R.iget(20136)==0&false))) {{
            __CLR4_5_2fizfizm68iyid1.R.inc(20137);List<String> names = getProviderNames(cls, cl);
            __CLR4_5_2fizfizm68iyid1.R.inc(20138);for (String name : names) {{
                __CLR4_5_2fizfizm68iyid1.R.inc(20139);try {
                    // Try and load the class
                    __CLR4_5_2fizfizm68iyid1.R.inc(20140);Object obj = cl.loadClass(name).getDeclaredConstructor().newInstance();
                    // stick it into our vector...
                    __CLR4_5_2fizfizm68iyid1.R.inc(20141);l.add(obj);
                } catch (Exception ex) {
                    // Just try the next name
                }
            }
        }}
        }__CLR4_5_2fizfizm68iyid1.R.inc(20142);return l.iterator();
    }finally{__CLR4_5_2fizfizm68iyid1.R.flushNeeded();}}

    /**
     * Returns an iterator where each element should be the name
     * of a class that implements the
     * interface (or subclass the baseclass) described by cls.  The
     * Classes are found by searching the classpath for service files
     * named: 'META-INF/services/&lt;fully qualified classname&gt; that list
     * fully qualified classnames of classes that implement the
     * service files classes interface.
     *
     * @param cls The class/interface to search for providers of.
     */
    public static synchronized Iterator<String> providerNames(Class<?> cls) {try{__CLR4_5_2fizfizm68iyid1.R.inc(20143);
        __CLR4_5_2fizfizm68iyid1.R.inc(20144);String serviceFile = getServiceFilename(cls);

        __CLR4_5_2fizfizm68iyid1.R.inc(20145);List<String> l = classMap.get(serviceFile);
        __CLR4_5_2fizfizm68iyid1.R.inc(20146);if ((((l != null)&&(__CLR4_5_2fizfizm68iyid1.R.iget(20147)!=0|true))||(__CLR4_5_2fizfizm68iyid1.R.iget(20148)==0&false))) {{
            __CLR4_5_2fizfizm68iyid1.R.inc(20149);return l.iterator();
        }

        }__CLR4_5_2fizfizm68iyid1.R.inc(20150);l = new java.util.ArrayList<String>();
        __CLR4_5_2fizfizm68iyid1.R.inc(20151);classMap.put(serviceFile, l);
        __CLR4_5_2fizfizm68iyid1.R.inc(20152);l.addAll(getProviderNames(cls));
        __CLR4_5_2fizfizm68iyid1.R.inc(20153);return l.iterator();
    }finally{__CLR4_5_2fizfizm68iyid1.R.flushNeeded();}}

    /**
     * Returns an iterator where each element should implement the
     * interface (or subclass the baseclass) described by cls.  The
     * Classes are found by searching the classpath for service files
     * named: 'META-INF/services/&lt;fully qualified classname&gt; that list
     * fully qualified classnames of classes that implement the
     * service files classes interface.  These classes must have
     * default constructors if returnInstances is true.
     *
     * This is a deprecated, type-unsafe legacy method.
     *
     * @param cls The class/interface to search for providers of.
     * @param returnInstances true if the iterator should return instances rather than class names.
     * @deprecated use the type-safe methods providers(Class) or providerNames(Class) instead.
     */
    public static Iterator<?> providers(Class<?> cls, boolean returnInstances) {try{__CLR4_5_2fizfizm68iyid1.R.inc(20154);
        __CLR4_5_2fizfizm68iyid1.R.inc(20155);return ((((returnInstances )&&(__CLR4_5_2fizfizm68iyid1.R.iget(20156)!=0|true))||(__CLR4_5_2fizfizm68iyid1.R.iget(20157)==0&false))? providers(cls) : providerNames(cls));
    }finally{__CLR4_5_2fizfizm68iyid1.R.flushNeeded();}}

    private static List<String> getProviderNames(Class<?> cls) {try{__CLR4_5_2fizfizm68iyid1.R.inc(20158);
        __CLR4_5_2fizfizm68iyid1.R.inc(20159);return getProviderNames(cls, getClassLoader(cls));
    }finally{__CLR4_5_2fizfizm68iyid1.R.flushNeeded();}}

    private static List<String> getProviderNames(Class<?> cls, ClassLoader cl) {try{__CLR4_5_2fizfizm68iyid1.R.inc(20160);
        __CLR4_5_2fizfizm68iyid1.R.inc(20161);List<String> l = new java.util.ArrayList<String>();

        // No class loader so we can't find 'serviceFile'.
        __CLR4_5_2fizfizm68iyid1.R.inc(20162);if ((((cl == null)&&(__CLR4_5_2fizfizm68iyid1.R.iget(20163)!=0|true))||(__CLR4_5_2fizfizm68iyid1.R.iget(20164)==0&false))) {{
            __CLR4_5_2fizfizm68iyid1.R.inc(20165);return l;
        }

        }__CLR4_5_2fizfizm68iyid1.R.inc(20166);Enumeration<URL> e;
        __CLR4_5_2fizfizm68iyid1.R.inc(20167);try {
            __CLR4_5_2fizfizm68iyid1.R.inc(20168);e = cl.getResources(getServiceFilename(cls));
        } catch (IOException ioe) {
            __CLR4_5_2fizfizm68iyid1.R.inc(20169);return l;
        }

        __CLR4_5_2fizfizm68iyid1.R.inc(20170);while ((((e.hasMoreElements())&&(__CLR4_5_2fizfizm68iyid1.R.iget(20171)!=0|true))||(__CLR4_5_2fizfizm68iyid1.R.iget(20172)==0&false))) {{
            __CLR4_5_2fizfizm68iyid1.R.inc(20173);try {
                __CLR4_5_2fizfizm68iyid1.R.inc(20174);URL u = e.nextElement();

                __CLR4_5_2fizfizm68iyid1.R.inc(20175);InputStream    is = u.openStream();
                __CLR4_5_2fizfizm68iyid1.R.inc(20176);Reader         r  = new InputStreamReader(is, "UTF-8");
                __CLR4_5_2fizfizm68iyid1.R.inc(20177);BufferedReader br = new BufferedReader(r);
                __CLR4_5_2fizfizm68iyid1.R.inc(20178);try {
                    __CLR4_5_2fizfizm68iyid1.R.inc(20179);for (String line = br.readLine(); (((line != null)&&(__CLR4_5_2fizfizm68iyid1.R.iget(20180)!=0|true))||(__CLR4_5_2fizfizm68iyid1.R.iget(20181)==0&false)); line = br.readLine()) {{
                        // First strip any comment...
                        __CLR4_5_2fizfizm68iyid1.R.inc(20182);int idx = line.indexOf('#');
                        __CLR4_5_2fizfizm68iyid1.R.inc(20183);if ((((idx != -1)&&(__CLR4_5_2fizfizm68iyid1.R.iget(20184)!=0|true))||(__CLR4_5_2fizfizm68iyid1.R.iget(20185)==0&false))) {{
                            __CLR4_5_2fizfizm68iyid1.R.inc(20186);line = line.substring(0, idx);
                        }

                        // Trim whitespace.
                        }__CLR4_5_2fizfizm68iyid1.R.inc(20187);line = line.trim();

                        __CLR4_5_2fizfizm68iyid1.R.inc(20188);if ((((line.length() != 0)&&(__CLR4_5_2fizfizm68iyid1.R.iget(20189)!=0|true))||(__CLR4_5_2fizfizm68iyid1.R.iget(20190)==0&false))) {{
                            __CLR4_5_2fizfizm68iyid1.R.inc(20191);l.add(line);
                        }
                    }}
                }} finally {
                    __CLR4_5_2fizfizm68iyid1.R.inc(20192);IOUtils.closeQuietly(br);
                    __CLR4_5_2fizfizm68iyid1.R.inc(20193);IOUtils.closeQuietly(is);
                }
            } catch (Exception ex) {
                // Just try the next file...
            }
        }
        }__CLR4_5_2fizfizm68iyid1.R.inc(20194);return l;
    }finally{__CLR4_5_2fizfizm68iyid1.R.flushNeeded();}}

    private static ClassLoader getClassLoader(Class<?> cls) {try{__CLR4_5_2fizfizm68iyid1.R.inc(20195);
        __CLR4_5_2fizfizm68iyid1.R.inc(20196);ClassLoader cl = null;
        __CLR4_5_2fizfizm68iyid1.R.inc(20197);try {
            __CLR4_5_2fizfizm68iyid1.R.inc(20198);cl = cls.getClassLoader();
        } catch (SecurityException se) {
            // Ooops! can't get his class loader.
        }
        // Can always request your own class loader. But it might be 'null'.
        __CLR4_5_2fizfizm68iyid1.R.inc(20199);if ((((cl == null)&&(__CLR4_5_2fizfizm68iyid1.R.iget(20200)!=0|true))||(__CLR4_5_2fizfizm68iyid1.R.iget(20201)==0&false))) {{
            __CLR4_5_2fizfizm68iyid1.R.inc(20202);cl = Service.class.getClassLoader();
        }
        }__CLR4_5_2fizfizm68iyid1.R.inc(20203);if ((((cl == null)&&(__CLR4_5_2fizfizm68iyid1.R.iget(20204)!=0|true))||(__CLR4_5_2fizfizm68iyid1.R.iget(20205)==0&false))) {{
            __CLR4_5_2fizfizm68iyid1.R.inc(20206);cl = ClassLoader.getSystemClassLoader();
        }
        }__CLR4_5_2fizfizm68iyid1.R.inc(20207);return cl;
    }finally{__CLR4_5_2fizfizm68iyid1.R.flushNeeded();}}

    private static String getServiceFilename(Class<?> cls) {try{__CLR4_5_2fizfizm68iyid1.R.inc(20208);
        __CLR4_5_2fizfizm68iyid1.R.inc(20209);return "META-INF/services/" + cls.getName();
    }finally{__CLR4_5_2fizfizm68iyid1.R.flushNeeded();}}

}
