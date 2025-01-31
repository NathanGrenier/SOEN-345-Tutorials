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

/* $Id: XMPSchemaAdapter.java 1829045 2018-04-13 09:22:33Z ssteiner $ */

package org.apache.xmlgraphics.xmp;

import java.util.Date;
import java.util.TimeZone;

import org.apache.xmlgraphics.util.DateFormatUtil;
import org.apache.xmlgraphics.util.QName;

/**
 * Base class for schema-specific adapters that provide user-friendly access to XMP values.
 */
public class XMPSchemaAdapter {public static class __CLR4_5_2gv6gv6m6lb51d3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,22127,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** the Metadata object this schema instance operates on */
    protected Metadata meta;
    private XMPSchema schema;
    private boolean compact = true;

    /**
     * Main constructor.
     * @param meta the Metadata object to wrao
     * @param schema the XMP schema for which this adapter was written
     */
    public XMPSchemaAdapter(Metadata meta, XMPSchema schema) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21858);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21859);if ((((meta == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21860)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21861)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21862);throw new NullPointerException("Parameter meta must not be null");
        }
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(21863);if ((((schema == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21864)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21865)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21866);throw new NullPointerException("Parameter schema must not be null");
        }
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(21867);this.meta = meta;
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21868);this.schema = schema;
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /** @return the XMP schema associated with this adapter */
    public XMPSchema getSchema() {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21869);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21870);return this.schema;
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Returns the QName for a given property
     * @param propName the property name
     * @return the resulting QName
     */
    protected QName getQName(String propName) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21871);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21872);return new QName(getSchema().getNamespace(), getSchema().getPreferredPrefix(), propName);
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Adds a String value to an array.
     * @param propName the property name
     * @param value the String value
     * @param arrayType the type of array to operate on
     */
    private void addStringToArray(String propName, String value, XMPArrayType arrayType) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21873);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21874);if ((((value == null || value.length() == 0)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21875)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21876)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21877);throw new IllegalArgumentException("'" + propName + "' value must not be empty");
        }
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(21878);addObjectToArray(propName, value, arrayType);
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Adds a Object value to an array.
     * @param propName the property name
     * @param value the Object value
     * @param arrayType the type of array to operate on
     */
    protected void addObjectToArray(String propName, Object value, XMPArrayType arrayType) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21879);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21880);if ((((value == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21881)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21882)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21883);throw new IllegalArgumentException("'" + propName + "' value must not be null");
        }
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(21884);QName name = getQName(propName);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21885);XMPProperty prop = meta.getProperty(name);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21886);if ((((prop == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21887)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21888)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21889);prop = new XMPProperty(name, value);
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21890);meta.setProperty(prop);
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21891);if ((((!compact)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21892)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21893)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21894);prop.convertSimpleValueToArray(arrayType);
            }
        }} }else {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21895);prop.convertSimpleValueToArray(arrayType);
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21896);prop.getArrayValue().add(value);
        }
    }}finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Removes a value from an array.
     * @param propName the name of the property
     * @param value the value to be removed
     * @return true if the value was removed, false if it was not found
     */
    protected boolean removeStringFromArray(String propName, String value) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21897);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21898);if ((((value == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21899)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21900)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21901);return false;
        }
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(21902);QName name = getQName(propName);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21903);XMPProperty prop = meta.getProperty(name);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21904);if ((((prop != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21905)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21906)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21907);if ((((prop.isArray())&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21908)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21909)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21910);XMPArray arr = prop.getArrayValue();
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21911);boolean removed = arr.remove(value);
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21912);if ((((arr.isEmpty())&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21913)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21914)==0&false))) {{
                    __CLR4_5_2gv6gv6m6lb51d3.R.inc(21915);meta.removeProperty(name);
                }
                }__CLR4_5_2gv6gv6m6lb51d3.R.inc(21916);return removed;
            } }else {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21917);Object currentValue = prop.getValue();
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21918);if ((((value.equals(currentValue))&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21919)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21920)==0&false))) {{
                    __CLR4_5_2gv6gv6m6lb51d3.R.inc(21921);meta.removeProperty(name);
                    __CLR4_5_2gv6gv6m6lb51d3.R.inc(21922);return true;
                }
            }}
        }}
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(21923);return false;
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Adds a String value to an ordered array.
     * @param propName the property name
     * @param value the String value
     */
    protected void addStringToSeq(String propName, String value) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21924);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21925);addStringToArray(propName, value, XMPArrayType.SEQ);
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Adds a String value to an unordered array.
     * @param propName the property name
     * @param value the String value
     */
    protected void addStringToBag(String propName, String value) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21926);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21927);addStringToArray(propName, value, XMPArrayType.BAG);
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Formats a Date using ISO 8601 format in the default time zone.
     * @param dt the date
     * @return the formatted date
     */
    public static String formatISO8601Date(Date dt) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21928);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21929);return formatISO8601Date(dt, TimeZone.getDefault());
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Formats a Date using ISO 8601 format in the given time zone.
     * @param dt the date
     * @param tz the time zone
     * @return the formatted date
     */
    public static String formatISO8601Date(Date dt, TimeZone tz) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21930);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21931);return DateFormatUtil.formatISO8601(dt, tz);
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Adds a date value to an ordered array.
     * @param propName the property name
     * @param value the date value
     */
    protected void addDateToSeq(String propName, Date value) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21932);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21933);String dt = formatISO8601Date(value);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21934);addStringToSeq(propName, dt);
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Set a date value.
     * @param propName the property name
     * @param value the date value
     */
    protected void setDateValue(String propName, Date value) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21935);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21936);String dt = formatISO8601Date(value);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21937);setValue(propName, dt);
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Returns a date value.
     * @param propName the property name
     * @return the date value or null if the value is not set
     */
    protected Date getDateValue(String propName) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21938);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21939);String dt = getValue(propName);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21940);if ((((dt == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21941)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21942)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21943);return null;
        } }else {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21944);return DateFormatUtil.parseISO8601Date(dt);
        }
    }}finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Sets a language-dependent value.
     * @param propName the property name
     * @param lang the language ("x-default" or null for the default language)
     * @param value the value
     */
    protected void setLangAlt(String propName, String lang, String value) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21945);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21946);if ((((lang == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21947)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21948)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21949);lang = XMPConstants.DEFAULT_LANGUAGE;
        }
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(21950);QName name = getQName(propName);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21951);XMPProperty prop = meta.getProperty(name);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21952);XMPArray array;
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21953);if ((((prop == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21954)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21955)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21956);if ((((value != null && value.length() > 0)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21957)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21958)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21959);prop = new XMPProperty(name, value);
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21960);prop.setXMLLang(lang);
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21961);meta.setProperty(prop);
            }
        }} }else {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21962);prop.convertSimpleValueToArray(XMPArrayType.ALT);
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21963);array = prop.getArrayValue();
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21964);array.removeLangValue(lang);
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21965);if ((((value != null && value.length() > 0)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21966)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21967)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21968);array.add(value, lang);
            } }else {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21969);if ((((array.isEmpty())&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21970)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21971)==0&false))) {{
                    __CLR4_5_2gv6gv6m6lb51d3.R.inc(21972);meta.removeProperty(name);
                }
            }}
        }}
    }}finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Sets a simple value.
     * @param propName the property name
     * @param value the value
     */
    protected void setValue(String propName, String value) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21973);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21974);QName name = getQName(propName);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21975);XMPProperty prop = meta.getProperty(name);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21976);if ((((value != null && value.length() > 0)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21977)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21978)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21979);if ((((prop != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21980)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21981)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21982);prop.setValue(value);
            } }else {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21983);prop = new XMPProperty(name, value);
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21984);meta.setProperty(prop);
            }
        }} }else {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21985);if ((((prop != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21986)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21987)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(21988);meta.removeProperty(name);
            }
        }}
    }}finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Returns a simple value.
     * @param propName the property name
     * @return the requested value or null if it isn't set
     */
    protected String getValue(String propName) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21989);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21990);QName name = getQName(propName);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21991);XMPProperty prop = meta.getProperty(name);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21992);if ((((prop == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21993)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(21994)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21995);return null;
        } }else {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(21996);return prop.getValue().toString();
        }
    }}finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Removes a language-dependent value from an alternative array.
     * @param lang the language ("x-default" for the default language)
     * @param propName the property name
     * @return the removed value
     */
    protected String removeLangAlt(String lang, String propName) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(21997);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21998);QName name = getQName(propName);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(21999);XMPProperty prop = meta.getProperty(name);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22000);XMPArray array;
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22001);if ((((prop != null && lang != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22002)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22003)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22004);array = prop.getArrayValue();
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22005);if ((((array != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22006)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22007)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22008);String removed = array.removeLangValue(lang);
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22009);if ((((array.isEmpty())&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22010)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22011)==0&false))) {{
                    __CLR4_5_2gv6gv6m6lb51d3.R.inc(22012);meta.removeProperty(name);
                }
                }__CLR4_5_2gv6gv6m6lb51d3.R.inc(22013);return removed;
            } }else {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22014);String removed = prop.getValue().toString();
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22015);if ((((lang.equals(prop.getXMLLang()))&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22016)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22017)==0&false))) {{
                    __CLR4_5_2gv6gv6m6lb51d3.R.inc(22018);meta.removeProperty(name);
                }
                }__CLR4_5_2gv6gv6m6lb51d3.R.inc(22019);return removed;
            }
        }}
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(22020);return null;
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Returns a language-dependent value. If the value in the requested language is not available
     * the value for the default language is returned.
     * @param lang the language ("x-default" for the default language)
     * @param propName the property name
     * @return the requested value
     */
    protected String getLangAlt(String lang, String propName) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(22021);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22022);XMPProperty prop = meta.getProperty(getQName(propName));
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22023);XMPArray array;
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22024);if ((((prop == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22025)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22026)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22027);return null;
        } }else {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22028);array = prop.getArrayValue();
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22029);if ((((array != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22030)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22031)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22032);return array.getLangValue(lang);
            } }else {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22033);return prop.getValue().toString();
            }
        }}
    }}finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Finds a structure that matches a given qualifier.
     * @param propName the property name
     * @param qualifier the qualifier
     * @param qualifierValue the qualifier value
     * @return the structure if a match was found (or null if no match was found)
     */
    protected PropertyAccess findQualifiedStructure(String propName,
            QName qualifier, String qualifierValue) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(22034);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22035);XMPProperty prop = meta.getProperty(getQName(propName));
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22036);XMPArray array;
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22037);if ((((prop != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22038)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22039)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22040);array = prop.getArrayValue();
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22041);if ((((array != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22042)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22043)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22044);for (int i = 0, c = array.getSize(); (((i < c)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22045)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22046)==0&false)); i++) {{
                    __CLR4_5_2gv6gv6m6lb51d3.R.inc(22047);Object value = array.getValue(i);
                    __CLR4_5_2gv6gv6m6lb51d3.R.inc(22048);if ((((value instanceof PropertyAccess)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22049)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22050)==0&false))) {{
                        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22051);PropertyAccess pa = (PropertyAccess)value;
                        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22052);XMPProperty q = pa.getProperty(qualifier);
                        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22053);if ((((q != null && q.getValue().equals(qualifierValue))&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22054)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22055)==0&false))) {{
                            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22056);return pa;
                        }
                    }}
                }}
            }} }else {__CLR4_5_2gv6gv6m6lb51d3.R.inc(22057);if ((((prop.getStructureValue() != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22058)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22059)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22060);PropertyAccess pa = prop.getStructureValue();
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22061);XMPProperty q = pa.getProperty(qualifier);
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22062);if ((((q != null && q.getValue().equals(qualifierValue))&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22063)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22064)==0&false))) {{
                    __CLR4_5_2gv6gv6m6lb51d3.R.inc(22065);return pa;
                }
            }}
        }}}
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(22066);return null;
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Finds a value that matches a given qualifier.
     * @param propName the property name
     * @param qualifier the qualifier
     * @param qualifierValue the qualifier value
     * @return the value if a match was found (or null if no match was found)
     */
    protected Object findQualifiedValue(String propName,
            QName qualifier, String qualifierValue) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(22067);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22068);PropertyAccess pa = findQualifiedStructure(propName, qualifier, qualifierValue);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22069);if ((((pa != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22070)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22071)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22072);XMPProperty rdfValue = pa.getValueProperty();
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22073);if ((((rdfValue != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22074)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22075)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22076);return rdfValue.getValue();
            }
        }}
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(22077);return null;
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Returns an object array representation of the property's values.
     * @param propName the property name
     * @return the object array or null if the property isn't set
     */
    protected Object[] getObjectArray(String propName) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(22078);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22079);XMPProperty prop = meta.getProperty(getQName(propName));
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22080);if ((((prop == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22081)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22082)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22083);return null;
        }
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(22084);XMPArray array = prop.getArrayValue();
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22085);if ((((array != null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22086)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22087)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22088);return array.toObjectArray();
        } }else {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22089);return new Object[] {prop.getValue()};
        }
    }}finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Returns a String array representation of the property's values. Complex values are converted
     * to Strings using the toString() method.
     * @param propName the property name
     * @return the String array or null if the property isn't set
     */
    protected String[] getStringArray(String propName) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(22090);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22091);Object[] arr = getObjectArray(propName);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22092);if ((((arr == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22093)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22094)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22095);return null;
        }
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(22096);String[] res = new String[arr.length];
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22097);for (int i = 0, c = res.length; (((i < c)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22098)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22099)==0&false)); i++) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22100);Object o = arr[i];
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22101);if ((((o instanceof PropertyAccess)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22102)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22103)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22104);XMPProperty prop = ((PropertyAccess)o).getValueProperty();
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22105);res[i] = prop.getValue().toString();
            } }else {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22106);res[i] = o.toString();
            }
        }}
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(22107);return res;
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    /**
     * Returns a Date array representation of the property's values.
     * @param propName the property name
     * @return the Date array or null if the property isn't set
     */
    protected Date[] getDateArray(String propName) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(22108);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22109);Object[] arr = getObjectArray(propName);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22110);if ((((arr == null)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22111)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22112)==0&false))) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22113);return null;
        }
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(22114);Date[] res = new Date[arr.length];
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22115);for (int i = 0, c = res.length; (((i < c)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22116)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22117)==0&false)); i++) {{
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22118);Object obj = arr[i];
            __CLR4_5_2gv6gv6m6lb51d3.R.inc(22119);if ((((obj instanceof Date)&&(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22120)!=0|true))||(__CLR4_5_2gv6gv6m6lb51d3.R.iget(22121)==0&false))) {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22122);res[i] = (Date) ((Date) obj).clone();
            } }else {{
                __CLR4_5_2gv6gv6m6lb51d3.R.inc(22123);res[i] = DateFormatUtil.parseISO8601Date(obj.toString());
            }
        }}
        }__CLR4_5_2gv6gv6m6lb51d3.R.inc(22124);return res;
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}

    public void setCompact(boolean c) {try{__CLR4_5_2gv6gv6m6lb51d3.R.inc(22125);
        __CLR4_5_2gv6gv6m6lb51d3.R.inc(22126);compact = c;
    }finally{__CLR4_5_2gv6gv6m6lb51d3.R.flushNeeded();}}
}
