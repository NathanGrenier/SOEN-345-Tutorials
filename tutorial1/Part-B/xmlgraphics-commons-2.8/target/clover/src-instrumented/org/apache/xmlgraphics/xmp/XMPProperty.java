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

/* $Id: XMPProperty.java 1731596 2016-02-22 08:28:54Z gadams $ */

package org.apache.xmlgraphics.xmp;

import java.net.URI;

import java.util.Iterator;
import java.util.Map;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import org.apache.xmlgraphics.util.QName;
import org.apache.xmlgraphics.util.XMLizable;

/**
 * This class is the base class for all XMP properties.
 */
public class XMPProperty implements XMLizable {public static class __CLR4_5_2grsgrsm6lb51c3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,21847,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private QName name;
    private Object value;
    private String xmllang;
    private Map qualifiers;

    /**
     * Creates a new XMP property.
     * @param name the name of the property
     * @param value the value for the property
     */
    public XMPProperty(QName name, Object value) {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21736);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21737);this.name = name;
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21738);this.value = value;
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /** @return the qualified name of the property (namespace URI + local name) */
    public QName getName() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21739);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21740);return this.name;
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /** @return the namespace URI of the property */
    public String getNamespace() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21741);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21742);return getName().getNamespaceURI();
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /**
     * Sets the value of the property
     * @param value the new value
     */
    public void setValue(Object value) {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21743);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21744);this.value = value;
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /**
     * @return the property value (can be a normal Java object (normally a String) or a descendant
     *         of XMPComplexValue.
     */
    public Object getValue() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21745);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21746);return this.value;
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /**
     * Sets the xml:lang value for this property
     * @param lang the language ("x-default" for the default language, null to make the value
     *             language-independent)
     */
    public void setXMLLang(String lang) {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21747);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21748);this.xmllang = lang;
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /**
     * @return the language for language-dependent values ("x-default" for the default language)
     */
    public String getXMLLang() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21749);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21750);return this.xmllang;
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /**
     * Indicates whether the property is an array.
     * @return true if the property is an array
     */
    public boolean isArray() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21751);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21752);return value instanceof XMPArray;
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /** @return the XMPArray for an array or null if the value is not an array. */
    public XMPArray getArrayValue() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21753);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21754);return ((((isArray() )&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21755)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21756)==0&false))? (XMPArray)value : null);
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /**
     * Converts a simple value to an array of a given type if the value is not already an array.
     * @param type the desired type of array
     * @return the array value
     */
    public XMPArray convertSimpleValueToArray(XMPArrayType type) {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21757);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21758);if ((((getArrayValue() == null)&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21759)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21760)==0&false))) {{
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21761);XMPArray array = new XMPArray(type);
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21762);if ((((getXMLLang() != null)&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21763)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21764)==0&false))) {{
                __CLR4_5_2grsgrsm6lb51c3.R.inc(21765);array.add(getValue().toString(), getXMLLang());
            } }else {{
                __CLR4_5_2grsgrsm6lb51c3.R.inc(21766);array.add(getValue());
            }
            }__CLR4_5_2grsgrsm6lb51c3.R.inc(21767);setValue(array);
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21768);setXMLLang(null);
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21769);return array;
        } }else {{
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21770);return getArrayValue();
        }
    }}finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /** @return the XMPStructure for a structure or null if the value is not a structure. */
    public PropertyAccess getStructureValue() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21771);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21772);return ((((value instanceof XMPStructure )&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21773)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21774)==0&false))? (XMPStructure)value : null);
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    private boolean hasPropertyQualifiers() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21775);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21776);return (this.qualifiers == null) || (this.qualifiers.size() == 0);
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /**
     * Indicates whether this property is actually not a structure, but a normal property with
     * property qualifiers. If this method returns true, this structure can be converted to
     * an simple XMPProperty using the simplify() method.
     * @return true if this property is a structure property with property qualifiers
     */
    public boolean isQualifiedProperty() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21777);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21778);PropertyAccess props = getStructureValue();
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21779);if ((((props != null)&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21780)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21781)==0&false))) {{
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21782);XMPProperty rdfValue = props.getValueProperty();
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21783);return (rdfValue != null);
        } }else {{
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21784);return hasPropertyQualifiers();
        }
    }}finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    public void simplify() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21785);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21786);PropertyAccess props = getStructureValue();
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21787);if ((((props != null)&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21788)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21789)==0&false))) {{
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21790);XMPProperty rdfValue = props.getValueProperty();
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21791);if ((((rdfValue != null)&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21792)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21793)==0&false))) {{
                __CLR4_5_2grsgrsm6lb51c3.R.inc(21794);if ((((hasPropertyQualifiers())&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21795)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21796)==0&false))) {{
                    __CLR4_5_2grsgrsm6lb51c3.R.inc(21797);throw new IllegalStateException("Illegal internal state"
                            + " (qualifiers present on non-simplified property)");
                }
                }__CLR4_5_2grsgrsm6lb51c3.R.inc(21798);XMPProperty prop = new XMPProperty(getName(), rdfValue);
                __CLR4_5_2grsgrsm6lb51c3.R.inc(21799);Iterator iter = props.iterator();
                __CLR4_5_2grsgrsm6lb51c3.R.inc(21800);while ((((iter.hasNext())&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21801)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21802)==0&false))) {{
                    __CLR4_5_2grsgrsm6lb51c3.R.inc(21803);QName name = (QName)iter.next();
                    __CLR4_5_2grsgrsm6lb51c3.R.inc(21804);if ((((!XMPConstants.RDF_VALUE.equals(name))&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21805)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21806)==0&false))) {{
                        __CLR4_5_2grsgrsm6lb51c3.R.inc(21807);prop.setPropertyQualifier(name, props.getProperty(name));
                    }
                }}
                }__CLR4_5_2grsgrsm6lb51c3.R.inc(21808);props.setProperty(prop);
            }
        }}
    }}finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}


    private void setPropertyQualifier(QName name, XMPProperty property) {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21809);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21810);if ((((this.qualifiers == null)&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21811)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21812)==0&false))) {{
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21813);this.qualifiers = new java.util.HashMap();
        }
        }__CLR4_5_2grsgrsm6lb51c3.R.inc(21814);this.qualifiers.put(name, property);
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    private String getEffectiveQName() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21815);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21816);String prefix = getName().getPrefix();
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21817);if ((((prefix == null || "".equals(prefix))&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21818)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21819)==0&false))) {{
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21820);XMPSchema schema = XMPSchemaRegistry.getInstance().getSchema(getNamespace());
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21821);prefix = schema.getPreferredPrefix();
        }
        }__CLR4_5_2grsgrsm6lb51c3.R.inc(21822);return prefix + ":" + getName().getLocalName();
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /** @see org.apache.xmlgraphics.util.XMLizable#toSAX(org.xml.sax.ContentHandler) */
    public void toSAX(ContentHandler handler) throws SAXException {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21823);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21824);AttributesImpl atts = new AttributesImpl();
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21825);String qName = getEffectiveQName();
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21826);if ((((value instanceof URI)&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21827)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21828)==0&false))) {{
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21829);atts.addAttribute(XMPConstants.RDF_NAMESPACE, "resource", "rdf:resource", "CDATA", ((URI)value).toString());
        }
        }__CLR4_5_2grsgrsm6lb51c3.R.inc(21830);handler.startElement(getName().getNamespaceURI(),
                getName().getLocalName(), qName, atts);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21831);if ((((value instanceof XMPComplexValue)&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21832)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21833)==0&false))) {{
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21834);XMPComplexValue cv = ((XMPComplexValue)value);
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21835);cv.toSAX(handler);
        } }else {__CLR4_5_2grsgrsm6lb51c3.R.inc(21836);if ((((!(value instanceof URI))&&(__CLR4_5_2grsgrsm6lb51c3.R.iget(21837)!=0|true))||(__CLR4_5_2grsgrsm6lb51c3.R.iget(21838)==0&false))) {{
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21839);char[] chars = value.toString().toCharArray();
            __CLR4_5_2grsgrsm6lb51c3.R.inc(21840);handler.characters(chars, 0, chars.length);
        }
        }}__CLR4_5_2grsgrsm6lb51c3.R.inc(21841);handler.endElement(getName().getNamespaceURI(),
                getName().getLocalName(), qName);
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

    /** @see java.lang.Object#toString() */
    public String toString() {try{__CLR4_5_2grsgrsm6lb51c3.R.inc(21842);
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21843);StringBuffer sb = new StringBuffer("XMP Property ");
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21844);sb.append(getName()).append(": ");
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21845);sb.append(getValue());
        __CLR4_5_2grsgrsm6lb51c3.R.inc(21846);return sb.toString();
    }finally{__CLR4_5_2grsgrsm6lb51c3.R.flushNeeded();}}

}
