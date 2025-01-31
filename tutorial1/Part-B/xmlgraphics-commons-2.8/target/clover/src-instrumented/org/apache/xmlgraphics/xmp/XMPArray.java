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

/* $Id: XMPArray.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.xmp;

import java.net.URI;

import java.util.List;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/**
 * Represents an XMP array as defined by the XMP specification.
 */
public class XMPArray extends XMPComplexValue {public static class __CLR4_5_2gfjgfjm6lb51a0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,21432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    //TODO Property qualifiers are currently not supported, yet.

    private XMPArrayType type;
    private List values = new java.util.ArrayList();
    private List xmllang = new java.util.ArrayList();

    /**
     * Main constructor
     * @param type the intended type of array
     */
    public XMPArray(XMPArrayType type) {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21295);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21296);this.type = type;
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /** @return the type of array */
    public XMPArrayType getType() {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21297);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21298);return this.type;
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /**
     * Returns the value at a given position.
     * @param idx the index of the requested value
     * @return the value at the given position
     */
    public Object getValue(int idx) {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21299);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21300);return this.values.get(idx);
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /**
     * Returns the structure at a given position. If the value is not a structure a
     * ClassCastException is thrown.
     * @param idx the index of the requested value
     * @return the structure at the given position
     */
    public XMPStructure getStructure(int idx) {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21301);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21302);return (XMPStructure)this.values.get(idx);
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Object getSimpleValue() {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21303);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21304);if ((((values.size() == 1)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21305)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21306)==0&false))) {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21307);return getValue(0);
        } }else {__CLR4_5_2gfjgfjm6lb51a0.R.inc(21308);if ((((values.size() > 1)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21309)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21310)==0&false))) {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21311);return getLangValue(XMPConstants.DEFAULT_LANGUAGE);
        } }else {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21312);return null;
        }
    }}}finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    private String getParentLanguage(String lang) {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21313);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21314);if ((((lang == null)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21315)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21316)==0&false))) {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21317);return null;
        }
        }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21318);int pos = lang.indexOf('-');
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21319);if ((((pos > 0)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21320)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21321)==0&false))) {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21322);String parent = lang.substring(0, pos);
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21323);return parent;
        }
        }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21324);return null;
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /**
     * Returns a language-dependent values (available for alternative arrays).
     * @param lang the language ("x-default" for the default value)
     * @return the requested value
     */
    public String getLangValue(String lang) {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21325);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21326);String v = null;
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21327);String valueForParentLanguage = null;
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21328);for (int i = 0, c = values.size(); (((i < c)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21329)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21330)==0&false)); i++) {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21331);String l = (String)xmllang.get(i);
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21332);if (((((l == null && lang == null) || (l != null && l.equals(lang)))&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21333)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21334)==0&false))) {{
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21335);v = values.get(i).toString();
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21336);break;
            }
            }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21337);if ((((l != null && lang != null)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21338)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21339)==0&false))) {{
                //Check for "parent" language, too ("en" matches "en-GB")
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21340);String parent = getParentLanguage(l);
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21341);if ((((parent != null && parent.equals(lang))&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21342)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21343)==0&false))) {{
                    __CLR4_5_2gfjgfjm6lb51a0.R.inc(21344);valueForParentLanguage = values.get(i).toString();
                }
            }}
        }}
        }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21345);if ((((lang != null && v == null && valueForParentLanguage != null)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21346)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21347)==0&false))) {{
            //Use value found for parent language
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21348);v = valueForParentLanguage;
        }
        }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21349);if ((((lang == null && v == null)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21350)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21351)==0&false))) {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21352);v = getLangValue(XMPConstants.DEFAULT_LANGUAGE);
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21353);if ((((v == null && values.size() > 0)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21354)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21355)==0&false))) {{
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21356);v = getValue(0).toString(); //get first
            }
        }}
        }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21357);return v;
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /**
     * Removes a language-dependent value.
     * @param lang the language ("x-default" for the default value)
     * @return the removed value (or null if no value was set)
     */
    public String removeLangValue(String lang) {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21358);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21359);if ((((lang == null || "".equals(lang))&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21360)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21361)==0&false))) {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21362);lang = XMPConstants.DEFAULT_LANGUAGE;
        }
        }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21363);for (int i = 0, c = values.size(); (((i < c)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21364)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21365)==0&false)); i++) {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21366);String l = (String)xmllang.get(i);
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21367);if (((((XMPConstants.DEFAULT_LANGUAGE.equals(lang) && l == null) || lang.equals(l))&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21368)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21369)==0&false))) {{
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21370);String value = (String)values.remove(i);
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21371);xmllang.remove(i);
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21372);return value;
            }
        }}
        }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21373);return null;
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /**
     * Adds a new value to the array
     * @param value the value
     */
    public void add(Object value) {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21374);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21375);values.add(value);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21376);xmllang.add(null);
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /**
     * Removes a value from the array. If the value doesn't exist, nothing happens.
     * @param value the value to be removed
     * @return true if the value was removed, false if it wasn't found
     */
    public boolean remove(String value) {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21377);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21378);int idx = values.indexOf(value);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21379);if ((((idx >= 0)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21380)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21381)==0&false))) {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21382);values.remove(idx);
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21383);xmllang.remove(idx);
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21384);return true;
        }
        }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21385);return false;

    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /**
     * Adds a language-dependent value to the array. Make sure not to add the same language twice.
     * @param value the value
     * @param lang the language ("x-default" for the default value)
     */
    public void add(String value, String lang) {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21386);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21387);values.add(value);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21388);xmllang.add(lang);
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /**
     * Returns the current number of values in the array.
     * @return the current number of values in the array
     */
    public int getSize() {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21389);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21390);return this.values.size();
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /**
     * Indicates whether the array is empty or not.
     * @return true if the array is empty
     */
    public boolean isEmpty() {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21391);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21392);return getSize() == 0;
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /**
     * Converts the array to an object array.
     * @return an object array of all values in the array
     */
    public Object[] toObjectArray() {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21393);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21394);Object[] res = new Object[getSize()];
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21395);for (int i = 0, c = res.length; (((i < c)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21396)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21397)==0&false)); i++) {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21398);res[i] = getValue(i);
        }
        }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21399);return res;
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void toSAX(ContentHandler handler) throws SAXException {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21400);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21401);AttributesImpl atts = new AttributesImpl();
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21402);handler.startElement(XMPConstants.RDF_NAMESPACE,
                type.getName(), "rdf:" + type.getName(), atts);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21403);for (int i = 0, c = values.size(); (((i < c)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21404)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21405)==0&false)); i++) {{
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21406);String lang = (String)xmllang.get(i);
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21407);atts.clear();
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21408);Object v = values.get(i);
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21409);if ((((lang != null)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21410)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21411)==0&false))) {{
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21412);atts.addAttribute(XMPConstants.XML_NS, "lang", "xml:lang", "CDATA", lang);
            }
            }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21413);if ((((v instanceof URI)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21414)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21415)==0&false))) {{
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21416);atts.addAttribute(XMPConstants.RDF_NAMESPACE, "resource",
                        "rdf:resource", "CDATA", ((URI)v).toString());
            }
            }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21417);handler.startElement(XMPConstants.RDF_NAMESPACE,
                    "li", "rdf:li", atts);
            __CLR4_5_2gfjgfjm6lb51a0.R.inc(21418);if ((((v instanceof XMPComplexValue)&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21419)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21420)==0&false))) {{
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21421);((XMPComplexValue)v).toSAX(handler);
            } }else {__CLR4_5_2gfjgfjm6lb51a0.R.inc(21422);if ((((!(v instanceof URI))&&(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21423)!=0|true))||(__CLR4_5_2gfjgfjm6lb51a0.R.iget(21424)==0&false))) {{
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21425);String value = (String)values.get(i);
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21426);char[] chars = value.toCharArray();
                __CLR4_5_2gfjgfjm6lb51a0.R.inc(21427);handler.characters(chars, 0, chars.length);
            }
            }}__CLR4_5_2gfjgfjm6lb51a0.R.inc(21428);handler.endElement(XMPConstants.RDF_NAMESPACE,
                    "li", "rdf:li");
        }
        }__CLR4_5_2gfjgfjm6lb51a0.R.inc(21429);handler.endElement(XMPConstants.RDF_NAMESPACE,
                type.getName(), "rdf:" + type.getName());
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_2gfjgfjm6lb51a0.R.inc(21430);
        __CLR4_5_2gfjgfjm6lb51a0.R.inc(21431);return "XMP array: " + type + ", " + getSize();
    }finally{__CLR4_5_2gfjgfjm6lb51a0.R.flushNeeded();}}

}
