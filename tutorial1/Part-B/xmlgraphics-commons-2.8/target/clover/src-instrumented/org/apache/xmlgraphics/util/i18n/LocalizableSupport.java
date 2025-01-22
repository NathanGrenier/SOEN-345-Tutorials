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

/* $Id: LocalizableSupport.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.util.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

// CSOFF: InnerAssignment

/**
 * This class provides a default implementation of the Localizable interface.
 * You can use it as a base class or as a member field and delegates various
 * work to it.<p>
 * For example, to implement Localizable, the following code can be used:
 * <pre>
 *  package mypackage;
 *  ...
 *  public class MyClass implements Localizable {
 *      // This code fragment requires a file named
 *      // 'mypackage/resources/Messages.properties', or a
 *      // 'mypackage.resources.Messages' class which extends
 *      // java.util.ResourceBundle, accessible using the current
 *      // classpath.
 *      LocalizableSupport localizableSupport =
 *          new LocalizableSupport("mypackage.resources.Messages");
 *
 *      public void setLocale(Locale l) {
 *          localizableSupport.setLocale(l);
 *      }
 *      public Local getLocale() {
 *          return localizableSupport.getLocale();
 *      }
 *      public String formatMessage(String key, Object[] args) {
 *          return localizableSupport.formatMessage(key, args);
 *      }
 *  }
 * </pre>
 * The algorithm for the Locale lookup in a LocalizableSupport object is:
 * <ul>
 *   <li>
 *     if a Locale has been set by a call to setLocale(), use this Locale,
 *     else,
 *   </li>
 *   <li>
 *     if a Locale has been set by a call to the setDefaultLocale() method
 *     of a LocalizableSupport object in the current LocaleGroup, use this
 *     Locale, else,
 *   </li>
 *   <li>
 *     use the object returned by Locale.getDefault() (and set by
 *     Locale.setDefault()).
 *   </li>
 * </ul>
 * This offers the possibility to have a different Locale for each object,
 * a Locale for a group of object and/or a Locale for the JVM instance.
 * <p>
 * Note: if no group is specified a LocalizableSupport object belongs to a
 * default group common to each instance of LocalizableSupport.
 *
 * @version $Id: LocalizableSupport.java 1732018 2016-02-24 04:51:06Z gadams $
 *
 * Originally authored by Stephane Hillion.
 */
public class LocalizableSupport implements Localizable {public static class __CLR4_5_2frnfrnm68iyiel{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,20503,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * The locale group to which this object belongs.
     */
    protected LocaleGroup localeGroup = LocaleGroup.DEFAULT;

    /**
     * The resource bundle classname.
     */
    protected String bundleName;

    /**
     * The classloader to use to create the resource bundle.
     */
    protected ClassLoader classLoader;

    /**
     * The current locale.
     */
    protected Locale locale;

    /**
     * The locale in use.
     */
    protected Locale usedLocale;

    /**
     * The resources
     */
    protected ResourceBundle resourceBundle;

    /**
     * Same as LocalizableSupport(s, null).
     */
    public LocalizableSupport(String s) {
        this(s, null);__CLR4_5_2frnfrnm68iyiel.R.inc(20436);try{__CLR4_5_2frnfrnm68iyiel.R.inc(20435);
    }finally{__CLR4_5_2frnfrnm68iyiel.R.flushNeeded();}}

    /**
     * Creates a new Localizable object.
     * The resource bundle class name is required allows the use of custom
     * classes of resource bundles.
     * @param s  must be the name of the class to use to get the appropriate
     *           resource bundle given the current locale.
     * @param cl is the classloader used to create the resource bundle,
     *           or null.
     * @see java.util.ResourceBundle
     */
    public LocalizableSupport(String s, ClassLoader cl) {try{__CLR4_5_2frnfrnm68iyiel.R.inc(20437);
        __CLR4_5_2frnfrnm68iyiel.R.inc(20438);bundleName = s;
        __CLR4_5_2frnfrnm68iyiel.R.inc(20439);classLoader = cl;
    }finally{__CLR4_5_2frnfrnm68iyiel.R.flushNeeded();}}

    /**
     * Implements {@link org.apache.xmlgraphics.util.i18n.Localizable#setLocale(Locale)}.
     */
    public void setLocale(Locale l) {try{__CLR4_5_2frnfrnm68iyiel.R.inc(20440);
        __CLR4_5_2frnfrnm68iyiel.R.inc(20441);if ((((locale != l)&&(__CLR4_5_2frnfrnm68iyiel.R.iget(20442)!=0|true))||(__CLR4_5_2frnfrnm68iyiel.R.iget(20443)==0&false))) {{
            __CLR4_5_2frnfrnm68iyiel.R.inc(20444);locale = l;
            __CLR4_5_2frnfrnm68iyiel.R.inc(20445);resourceBundle = null;
        }
    }}finally{__CLR4_5_2frnfrnm68iyiel.R.flushNeeded();}}

    /**
     * Implements {@link org.apache.xmlgraphics.util.i18n.Localizable#getLocale()}.
     */
    public Locale getLocale() {try{__CLR4_5_2frnfrnm68iyiel.R.inc(20446);
        __CLR4_5_2frnfrnm68iyiel.R.inc(20447);return locale;
    }finally{__CLR4_5_2frnfrnm68iyiel.R.flushNeeded();}}

    /**
     * Implements {@link
     * org.apache.xmlgraphics.util.i18n.ExtendedLocalizable#setLocaleGroup(LocaleGroup)}.
     */
    public void setLocaleGroup(LocaleGroup lg) {try{__CLR4_5_2frnfrnm68iyiel.R.inc(20448);
        __CLR4_5_2frnfrnm68iyiel.R.inc(20449);localeGroup = lg;
    }finally{__CLR4_5_2frnfrnm68iyiel.R.flushNeeded();}}

    /**
     * Implements {@link
     * org.apache.xmlgraphics.util.i18n.ExtendedLocalizable#getLocaleGroup()}.
     */
    public LocaleGroup getLocaleGroup() {try{__CLR4_5_2frnfrnm68iyiel.R.inc(20450);
        __CLR4_5_2frnfrnm68iyiel.R.inc(20451);return localeGroup;
    }finally{__CLR4_5_2frnfrnm68iyiel.R.flushNeeded();}}

    /**
     * Implements {@link
     * org.apache.xmlgraphics.util.i18n.ExtendedLocalizable#setDefaultLocale(Locale)}.
     * Later invocations of the instance methods will lead to update the
     * resource bundle used.
     */
    public void setDefaultLocale(Locale l) {try{__CLR4_5_2frnfrnm68iyiel.R.inc(20452);
        __CLR4_5_2frnfrnm68iyiel.R.inc(20453);localeGroup.setLocale(l);
    }finally{__CLR4_5_2frnfrnm68iyiel.R.flushNeeded();}}

    /**
     * Implements {@link
     * org.apache.xmlgraphics.util.i18n.ExtendedLocalizable#getDefaultLocale()}.
     */
    public Locale getDefaultLocale() {try{__CLR4_5_2frnfrnm68iyiel.R.inc(20454);
        __CLR4_5_2frnfrnm68iyiel.R.inc(20455);return localeGroup.getLocale();
    }finally{__CLR4_5_2frnfrnm68iyiel.R.flushNeeded();}}

    /**
     * Implements {@link
     * org.apache.xmlgraphics.util.i18n.Localizable#formatMessage(String,Object[])}.
     */
    public String formatMessage(String key, Object[] args) {try{__CLR4_5_2frnfrnm68iyiel.R.inc(20456);
        __CLR4_5_2frnfrnm68iyiel.R.inc(20457);getResourceBundle();
        __CLR4_5_2frnfrnm68iyiel.R.inc(20458);return MessageFormat.format(resourceBundle.getString(key), args);
    }finally{__CLR4_5_2frnfrnm68iyiel.R.flushNeeded();}}

    /**
     * Implements {@link
     * org.apache.xmlgraphics.util.i18n.ExtendedLocalizable#getResourceBundle()}.
     */
    public ResourceBundle getResourceBundle() {try{__CLR4_5_2frnfrnm68iyiel.R.inc(20459);
        __CLR4_5_2frnfrnm68iyiel.R.inc(20460);Locale l;

        __CLR4_5_2frnfrnm68iyiel.R.inc(20461);if ((((resourceBundle == null)&&(__CLR4_5_2frnfrnm68iyiel.R.iget(20462)!=0|true))||(__CLR4_5_2frnfrnm68iyiel.R.iget(20463)==0&false))) {{
            __CLR4_5_2frnfrnm68iyiel.R.inc(20464);if ((((locale == null)&&(__CLR4_5_2frnfrnm68iyiel.R.iget(20465)!=0|true))||(__CLR4_5_2frnfrnm68iyiel.R.iget(20466)==0&false))) {{
                __CLR4_5_2frnfrnm68iyiel.R.inc(20467);if ((l = localeGroup.getLocale()) == null) {{
                    __CLR4_5_2frnfrnm68iyiel.R.inc(20470);usedLocale = Locale.getDefault();
                } }else {{
                    __CLR4_5_2frnfrnm68iyiel.R.inc(20471);usedLocale = l;
                }
            }} }else {{
                __CLR4_5_2frnfrnm68iyiel.R.inc(20472);usedLocale = locale;
            }
            }__CLR4_5_2frnfrnm68iyiel.R.inc(20473);if ((((classLoader == null)&&(__CLR4_5_2frnfrnm68iyiel.R.iget(20474)!=0|true))||(__CLR4_5_2frnfrnm68iyiel.R.iget(20475)==0&false))) {{
                __CLR4_5_2frnfrnm68iyiel.R.inc(20476);resourceBundle = ResourceBundle.getBundle(bundleName,
                                                          usedLocale);
            } }else {{
                __CLR4_5_2frnfrnm68iyiel.R.inc(20477);resourceBundle = ResourceBundle.getBundle(bundleName,
                                                          usedLocale,
                                                          classLoader);
            }
        }} }else {__CLR4_5_2frnfrnm68iyiel.R.inc(20478);if ((((locale == null)&&(__CLR4_5_2frnfrnm68iyiel.R.iget(20479)!=0|true))||(__CLR4_5_2frnfrnm68iyiel.R.iget(20480)==0&false))) {{
            // Check for group Locale and JVM default locale changes.
            __CLR4_5_2frnfrnm68iyiel.R.inc(20481);if ((l = localeGroup.getLocale()) == null) {{
                __CLR4_5_2frnfrnm68iyiel.R.inc(20484);if (usedLocale != (l = Locale.getDefault())) {{
                    __CLR4_5_2frnfrnm68iyiel.R.inc(20487);usedLocale = l;
                    __CLR4_5_2frnfrnm68iyiel.R.inc(20488);if ((((classLoader == null)&&(__CLR4_5_2frnfrnm68iyiel.R.iget(20489)!=0|true))||(__CLR4_5_2frnfrnm68iyiel.R.iget(20490)==0&false))) {{
                        __CLR4_5_2frnfrnm68iyiel.R.inc(20491);resourceBundle = ResourceBundle.getBundle(bundleName,
                                                                  usedLocale);
                    } }else {{
                        __CLR4_5_2frnfrnm68iyiel.R.inc(20492);resourceBundle = ResourceBundle.getBundle(bundleName,
                                                                  usedLocale,
                                                                  classLoader);
                    }
                }}
            }} }else {__CLR4_5_2frnfrnm68iyiel.R.inc(20493);if ((((usedLocale != l)&&(__CLR4_5_2frnfrnm68iyiel.R.iget(20494)!=0|true))||(__CLR4_5_2frnfrnm68iyiel.R.iget(20495)==0&false))) {{
                __CLR4_5_2frnfrnm68iyiel.R.inc(20496);usedLocale = l;
                __CLR4_5_2frnfrnm68iyiel.R.inc(20497);if ((((classLoader == null)&&(__CLR4_5_2frnfrnm68iyiel.R.iget(20498)!=0|true))||(__CLR4_5_2frnfrnm68iyiel.R.iget(20499)==0&false))) {{
                    __CLR4_5_2frnfrnm68iyiel.R.inc(20500);resourceBundle = ResourceBundle.getBundle(bundleName,
                                                              usedLocale);
                } }else {{
                    __CLR4_5_2frnfrnm68iyiel.R.inc(20501);resourceBundle = ResourceBundle.getBundle(bundleName,
                                                              usedLocale,
                                                              classLoader);
                }
            }}
        }}}

        }}__CLR4_5_2frnfrnm68iyiel.R.inc(20502);return resourceBundle;
    }finally{__CLR4_5_2frnfrnm68iyiel.R.flushNeeded();}}
}
