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

/* $Id: Metadata.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.xmp;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import org.apache.xmlgraphics.util.QName;
import org.apache.xmlgraphics.util.XMLizable;
import org.apache.xmlgraphics.xmp.merge.MergeRuleSet;
import org.apache.xmlgraphics.xmp.merge.PropertyMerger;

/**
 * This class represents the root of an XMP metadata tree. It's more or less equivalent to the
 * x:xmpmeta element together with its nested rdf:RDF element.
 */
public class Metadata implements XMLizable, PropertyAccess {public static class __CLR4_5_2gd7gd7m6lb519h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,21295,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map properties = new java.util.HashMap();

    /** {@inheritDoc} */
    public void setProperty(XMPProperty prop) {try{__CLR4_5_2gd7gd7m6lb519h.R.inc(21211);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21212);properties.put(prop.getName(), prop);
    }finally{__CLR4_5_2gd7gd7m6lb519h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public XMPProperty getProperty(String uri, String localName) {try{__CLR4_5_2gd7gd7m6lb519h.R.inc(21213);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21214);return getProperty(new QName(uri, localName));
    }finally{__CLR4_5_2gd7gd7m6lb519h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public XMPProperty getProperty(QName name) {try{__CLR4_5_2gd7gd7m6lb519h.R.inc(21215);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21216);XMPProperty prop = (XMPProperty)properties.get(name);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21217);return prop;
    }finally{__CLR4_5_2gd7gd7m6lb519h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public XMPProperty removeProperty(QName name) {try{__CLR4_5_2gd7gd7m6lb519h.R.inc(21218);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21219);return (XMPProperty)properties.remove(name);
    }finally{__CLR4_5_2gd7gd7m6lb519h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public XMPProperty getValueProperty() {try{__CLR4_5_2gd7gd7m6lb519h.R.inc(21220);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21221);return getProperty(XMPConstants.RDF_VALUE);
    }finally{__CLR4_5_2gd7gd7m6lb519h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getPropertyCount() {try{__CLR4_5_2gd7gd7m6lb519h.R.inc(21222);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21223);return this.properties.size();
    }finally{__CLR4_5_2gd7gd7m6lb519h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Iterator iterator() {try{__CLR4_5_2gd7gd7m6lb519h.R.inc(21224);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21225);return this.properties.keySet().iterator();
    }finally{__CLR4_5_2gd7gd7m6lb519h.R.flushNeeded();}}

    /**
     * Merges this metadata object into a given target metadata object. The merge rule set provided
     * by each schema is used for the merge.
     * @param target the target metadata to merge the local metadata into
     */
    public void mergeInto(Metadata target, List<Class> exclude) {try{__CLR4_5_2gd7gd7m6lb519h.R.inc(21226);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21227);XMPSchemaRegistry registry = XMPSchemaRegistry.getInstance();
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21228);for (Object o : properties.values()) {{
            __CLR4_5_2gd7gd7m6lb519h.R.inc(21229);XMPProperty prop = (XMPProperty) o;
            __CLR4_5_2gd7gd7m6lb519h.R.inc(21230);XMPSchema schema = registry.getSchema(prop.getNamespace());
            __CLR4_5_2gd7gd7m6lb519h.R.inc(21231);if ((((!exclude.contains(schema.getClass()))&&(__CLR4_5_2gd7gd7m6lb519h.R.iget(21232)!=0|true))||(__CLR4_5_2gd7gd7m6lb519h.R.iget(21233)==0&false))) {{
                __CLR4_5_2gd7gd7m6lb519h.R.inc(21234);MergeRuleSet rules = schema.getDefaultMergeRuleSet();
                __CLR4_5_2gd7gd7m6lb519h.R.inc(21235);PropertyMerger merger = rules.getPropertyMergerFor(prop);
                __CLR4_5_2gd7gd7m6lb519h.R.inc(21236);merger.merge(prop, target);
            }
        }}
    }}finally{__CLR4_5_2gd7gd7m6lb519h.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void toSAX(ContentHandler handler) throws SAXException {try{__CLR4_5_2gd7gd7m6lb519h.R.inc(21237);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21238);AttributesImpl atts = new AttributesImpl();
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21239);handler.startPrefixMapping("x", XMPConstants.XMP_NAMESPACE);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21240);handler.startElement(XMPConstants.XMP_NAMESPACE, "xmpmeta", "x:xmpmeta", atts);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21241);handler.startPrefixMapping("rdf", XMPConstants.RDF_NAMESPACE);
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21242);handler.startElement(XMPConstants.RDF_NAMESPACE, "RDF", "rdf:RDF", atts);
        //Get all property namespaces
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21243);Set namespaces = new java.util.HashSet();
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21244);Iterator iter = properties.keySet().iterator();
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21245);while ((((iter.hasNext())&&(__CLR4_5_2gd7gd7m6lb519h.R.iget(21246)!=0|true))||(__CLR4_5_2gd7gd7m6lb519h.R.iget(21247)==0&false))) {{
            __CLR4_5_2gd7gd7m6lb519h.R.inc(21248);QName n = ((QName)iter.next());
            __CLR4_5_2gd7gd7m6lb519h.R.inc(21249);namespaces.add(n.getNamespaceURI());
        }
        //One Description element per namespace
        }__CLR4_5_2gd7gd7m6lb519h.R.inc(21250);iter = namespaces.iterator();
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21251);while ((((iter.hasNext())&&(__CLR4_5_2gd7gd7m6lb519h.R.iget(21252)!=0|true))||(__CLR4_5_2gd7gd7m6lb519h.R.iget(21253)==0&false))) {{
            __CLR4_5_2gd7gd7m6lb519h.R.inc(21254);String ns = (String)iter.next();
            __CLR4_5_2gd7gd7m6lb519h.R.inc(21255);XMPSchema schema = XMPSchemaRegistry.getInstance().getSchema(ns);
            __CLR4_5_2gd7gd7m6lb519h.R.inc(21256);String prefix = ((((schema != null )&&(__CLR4_5_2gd7gd7m6lb519h.R.iget(21257)!=0|true))||(__CLR4_5_2gd7gd7m6lb519h.R.iget(21258)==0&false))? schema.getPreferredPrefix() : null);

            __CLR4_5_2gd7gd7m6lb519h.R.inc(21259);boolean first = true;
            __CLR4_5_2gd7gd7m6lb519h.R.inc(21260);boolean empty = true;

            __CLR4_5_2gd7gd7m6lb519h.R.inc(21261);for (Object o : properties.values()) {{
                __CLR4_5_2gd7gd7m6lb519h.R.inc(21262);XMPProperty prop = (XMPProperty) o;
                __CLR4_5_2gd7gd7m6lb519h.R.inc(21263);if ((((prop.getName().getNamespaceURI().equals(ns))&&(__CLR4_5_2gd7gd7m6lb519h.R.iget(21264)!=0|true))||(__CLR4_5_2gd7gd7m6lb519h.R.iget(21265)==0&false))) {{
                    __CLR4_5_2gd7gd7m6lb519h.R.inc(21266);if ((((first)&&(__CLR4_5_2gd7gd7m6lb519h.R.iget(21267)!=0|true))||(__CLR4_5_2gd7gd7m6lb519h.R.iget(21268)==0&false))) {{
                        __CLR4_5_2gd7gd7m6lb519h.R.inc(21269);if ((((prefix == null)&&(__CLR4_5_2gd7gd7m6lb519h.R.iget(21270)!=0|true))||(__CLR4_5_2gd7gd7m6lb519h.R.iget(21271)==0&false))) {{
                            __CLR4_5_2gd7gd7m6lb519h.R.inc(21272);prefix = prop.getName().getPrefix();
                        }
                        }__CLR4_5_2gd7gd7m6lb519h.R.inc(21273);atts.clear();
                        __CLR4_5_2gd7gd7m6lb519h.R.inc(21274);atts.addAttribute(XMPConstants.RDF_NAMESPACE,
                                "about", "rdf:about", "CDATA", "");
                        __CLR4_5_2gd7gd7m6lb519h.R.inc(21275);if ((((prefix != null)&&(__CLR4_5_2gd7gd7m6lb519h.R.iget(21276)!=0|true))||(__CLR4_5_2gd7gd7m6lb519h.R.iget(21277)==0&false))) {{
                            __CLR4_5_2gd7gd7m6lb519h.R.inc(21278);handler.startPrefixMapping(prefix, ns);
                        }
                        }__CLR4_5_2gd7gd7m6lb519h.R.inc(21279);handler.startElement(XMPConstants.RDF_NAMESPACE,
                                "Description", "rdf:Description", atts);
                        __CLR4_5_2gd7gd7m6lb519h.R.inc(21280);empty = false;
                        __CLR4_5_2gd7gd7m6lb519h.R.inc(21281);first = false;
                    }
                    }__CLR4_5_2gd7gd7m6lb519h.R.inc(21282);prop.toSAX(handler);
                }
            }}
            }__CLR4_5_2gd7gd7m6lb519h.R.inc(21283);if ((((!empty)&&(__CLR4_5_2gd7gd7m6lb519h.R.iget(21284)!=0|true))||(__CLR4_5_2gd7gd7m6lb519h.R.iget(21285)==0&false))) {{
                __CLR4_5_2gd7gd7m6lb519h.R.inc(21286);handler.endElement(XMPConstants.RDF_NAMESPACE, "Description", "rdf:Description");
                __CLR4_5_2gd7gd7m6lb519h.R.inc(21287);if ((((prefix != null)&&(__CLR4_5_2gd7gd7m6lb519h.R.iget(21288)!=0|true))||(__CLR4_5_2gd7gd7m6lb519h.R.iget(21289)==0&false))) {{
                    __CLR4_5_2gd7gd7m6lb519h.R.inc(21290);handler.endPrefixMapping(prefix);
                }
            }}
        }}

        }__CLR4_5_2gd7gd7m6lb519h.R.inc(21291);handler.endElement(XMPConstants.RDF_NAMESPACE, "RDF", "rdf:RDF");
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21292);handler.endPrefixMapping("rdf");
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21293);handler.endElement(XMPConstants.XMP_NAMESPACE, "xmpmeta", "x:xmpmeta");
        __CLR4_5_2gd7gd7m6lb519h.R.inc(21294);handler.endPrefixMapping("x");
    }finally{__CLR4_5_2gd7gd7m6lb519h.R.flushNeeded();}}

}
