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

/* $Id: XMPHandler.java 1902231 2022-06-24 12:44:08Z ssteiner $ */

package org.apache.xmlgraphics.xmp;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

import org.apache.xmlgraphics.util.QName;

/**
 * Passive XMP parser implemented as a SAX DefaultHandler. After the XML document has been parsed
 * the Metadata object can be retrieved.
 */
public class XMPHandler extends DefaultHandler {public static class __CLR4_5_2gjigjim6lb51b3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,21663,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Metadata meta;

    private StringBuffer content = new StringBuffer();
    private Stack attributesStack = new Stack();
    private Stack nestingInfoStack = new Stack();
    private Stack contextStack = new Stack();

    /** @return the parsed metadata, available after the parsing. */
    public Metadata getMetadata() {try{__CLR4_5_2gjigjim6lb51b3.R.inc(21438);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21439);return this.meta;
    }finally{__CLR4_5_2gjigjim6lb51b3.R.flushNeeded();}}

    private boolean hasComplexContent() {try{__CLR4_5_2gjigjim6lb51b3.R.inc(21440);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21441);Object obj = this.contextStack.peek();
        __CLR4_5_2gjigjim6lb51b3.R.inc(21442);return !(obj instanceof QName);
    }finally{__CLR4_5_2gjigjim6lb51b3.R.flushNeeded();}}

    private PropertyAccess getCurrentProperties() {try{__CLR4_5_2gjigjim6lb51b3.R.inc(21443);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21444);Object obj = this.contextStack.peek();
        __CLR4_5_2gjigjim6lb51b3.R.inc(21445);if ((((obj instanceof PropertyAccess)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21446)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21447)==0&false))) {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21448);return (PropertyAccess)obj;
        } }else {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21449);return null;
        }
    }}finally{__CLR4_5_2gjigjim6lb51b3.R.flushNeeded();}}

    private QName getCurrentPropName() {try{__CLR4_5_2gjigjim6lb51b3.R.inc(21450);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21451);Object obj = this.contextStack.peek();
        __CLR4_5_2gjigjim6lb51b3.R.inc(21452);if ((((obj instanceof QName)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21453)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21454)==0&false))) {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21455);return (QName)obj;
        } }else {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21456);return null;
        }
    }}finally{__CLR4_5_2gjigjim6lb51b3.R.flushNeeded();}}

    private QName popCurrentPropName() throws SAXException {try{__CLR4_5_2gjigjim6lb51b3.R.inc(21457);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21458);Object obj = this.contextStack.pop();
        __CLR4_5_2gjigjim6lb51b3.R.inc(21459);this.nestingInfoStack.pop();
        __CLR4_5_2gjigjim6lb51b3.R.inc(21460);if ((((obj instanceof QName)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21461)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21462)==0&false))) {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21463);return (QName)obj;
        } }else {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21464);throw new SAXException("Invalid XMP structure. Property name expected");
        }
    }}finally{__CLR4_5_2gjigjim6lb51b3.R.flushNeeded();}}

//    private XMPComplexValue getCurrentComplexValue() {
//        Object obj = this.contextStack.peek();
//        if (obj instanceof XMPComplexValue) {
//            return (XMPComplexValue)obj;
//        } else {
//            return null;
//        }
//    }

    private XMPStructure getCurrentStructure() {try{__CLR4_5_2gjigjim6lb51b3.R.inc(21465);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21466);Object obj = this.contextStack.peek();
        __CLR4_5_2gjigjim6lb51b3.R.inc(21467);if ((((obj instanceof XMPStructure)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21468)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21469)==0&false))) {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21470);return (XMPStructure)obj;
        } }else {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21471);return null;
        }
    }}finally{__CLR4_5_2gjigjim6lb51b3.R.flushNeeded();}}

    private XMPArray getCurrentArray(boolean required) throws SAXException {try{__CLR4_5_2gjigjim6lb51b3.R.inc(21472);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21473);Object obj = this.contextStack.peek();
        __CLR4_5_2gjigjim6lb51b3.R.inc(21474);if ((((obj instanceof XMPArray)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21475)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21476)==0&false))) {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21477);return (XMPArray)obj;
        } }else {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21478);if ((((required)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21479)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21480)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21481);throw new SAXException("Invalid XMP structure. Not in array");
            } }else {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21482);return null;
            }
        }}
    }}finally{__CLR4_5_2gjigjim6lb51b3.R.flushNeeded();}}

    // --- Overrides ---

    /** {@inheritDoc} */
    public void startElement(String uri, String localName, String qName, Attributes attributes)
                throws SAXException {try{__CLR4_5_2gjigjim6lb51b3.R.inc(21483);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21484);super.startElement(uri, localName, qName, attributes);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21485);content.setLength(0); //Reset text buffer (see characters())
        __CLR4_5_2gjigjim6lb51b3.R.inc(21486);attributesStack.push(new AttributesImpl(attributes));

        __CLR4_5_2gjigjim6lb51b3.R.inc(21487);if ((((XMPConstants.XMP_NAMESPACE.equals(uri))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21488)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21489)==0&false))) {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21490);if ((((!"xmpmeta".equals(localName))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21491)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21492)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21493);throw new SAXException("Expected x:xmpmeta element, not " + qName);
            }
            }__CLR4_5_2gjigjim6lb51b3.R.inc(21494);if ((((this.meta != null)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21495)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21496)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21497);throw new SAXException("Invalid XMP document. Root already received earlier.");
            }
            }__CLR4_5_2gjigjim6lb51b3.R.inc(21498);this.meta = new Metadata();
            __CLR4_5_2gjigjim6lb51b3.R.inc(21499);this.contextStack.push(this.meta);
            __CLR4_5_2gjigjim6lb51b3.R.inc(21500);this.nestingInfoStack.push("metadata");
        } }else {__CLR4_5_2gjigjim6lb51b3.R.inc(21501);if ((((XMPConstants.RDF_NAMESPACE.equals(uri))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21502)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21503)==0&false))) {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21504);if (((("RDF".equals(localName))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21505)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21506)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21507);if ((((this.meta == null)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21508)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21509)==0&false))) {{
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21510);this.meta = new Metadata();
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21511);this.contextStack.push(this.meta);
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21512);this.nestingInfoStack.push("metadata");
                }
            }} }else {__CLR4_5_2gjigjim6lb51b3.R.inc(21513);if (((("Description".equals(localName))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21514)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21515)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21516);String about = attributes.getValue(XMPConstants.RDF_NAMESPACE, "about");
                __CLR4_5_2gjigjim6lb51b3.R.inc(21517);for (int i = 0, c = attributes.getLength(); (((i < c)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21518)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21519)==0&false)); i++) {{
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21520);String ns = attributes.getURI(i);
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21521);if ((((XMPConstants.RDF_NAMESPACE.equals(ns))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21522)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21523)==0&false))) {{
                        //ignore
                    } }else {__CLR4_5_2gjigjim6lb51b3.R.inc(21524);if ((((XMPConstants.XMLNS_NAMESPACE.equals(ns))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21525)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21526)==0&false))) {{
                        //ignore
                    } }else {__CLR4_5_2gjigjim6lb51b3.R.inc(21527);if (((("".equals(ns))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21528)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21529)==0&false))) {{
                        //ignore
                    } }else {{
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21530);String qn = attributes.getQName(i);
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21531);String v = attributes.getValue(i);
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21532);XMPProperty prop = new XMPProperty(new QName(ns, qn), v);
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21533);getCurrentProperties().setProperty(prop);
                    }
                }}}}
                }__CLR4_5_2gjigjim6lb51b3.R.inc(21534);if ((((this.contextStack.peek().equals(this.meta))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21535)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21536)==0&false))) {{
                    //rdf:RDF is the parent
                } }else {{
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21537);if ((((about != null)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21538)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21539)==0&false))) {{
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21540);throw new SAXException(
                                "Nested rdf:Description elements may not have an about property");
                    }
                    }__CLR4_5_2gjigjim6lb51b3.R.inc(21541);startStructure();
                }
            }} }else {__CLR4_5_2gjigjim6lb51b3.R.inc(21542);if (((("Seq".equals(localName))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21543)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21544)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21545);XMPArray array = new XMPArray(XMPArrayType.SEQ);
                __CLR4_5_2gjigjim6lb51b3.R.inc(21546);this.contextStack.push(array);
                __CLR4_5_2gjigjim6lb51b3.R.inc(21547);this.nestingInfoStack.push("Seq");
            } }else {__CLR4_5_2gjigjim6lb51b3.R.inc(21548);if (((("Bag".equals(localName))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21549)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21550)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21551);XMPArray array = new XMPArray(XMPArrayType.BAG);
                __CLR4_5_2gjigjim6lb51b3.R.inc(21552);this.contextStack.push(array);
                __CLR4_5_2gjigjim6lb51b3.R.inc(21553);this.nestingInfoStack.push("Bag");
            } }else {__CLR4_5_2gjigjim6lb51b3.R.inc(21554);if (((("Alt".equals(localName))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21555)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21556)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21557);XMPArray array = new XMPArray(XMPArrayType.ALT);
                __CLR4_5_2gjigjim6lb51b3.R.inc(21558);this.contextStack.push(array);
                __CLR4_5_2gjigjim6lb51b3.R.inc(21559);this.nestingInfoStack.push("Alt");
            } }else {__CLR4_5_2gjigjim6lb51b3.R.inc(21560);if (((("li".equals(localName))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21561)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21562)==0&false))) {{
                //nop, handle in endElement()
            } }else {__CLR4_5_2gjigjim6lb51b3.R.inc(21563);if (((("value".equals(localName))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21564)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21565)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21566);QName name = new QName(uri, qName);
                __CLR4_5_2gjigjim6lb51b3.R.inc(21567);this.contextStack.push(name);
                __CLR4_5_2gjigjim6lb51b3.R.inc(21568);this.nestingInfoStack.push("prop:" + name);
            } }else {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21569);throw new SAXException("Unexpected element in the RDF namespace: " + localName);
            }
        }}}}}}}} }else {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21570);if ((((getCurrentPropName() != null)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21571)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21572)==0&false))) {{
                //Structure (shorthand form)
                __CLR4_5_2gjigjim6lb51b3.R.inc(21573);startStructure();
            }
            }__CLR4_5_2gjigjim6lb51b3.R.inc(21574);QName name = new QName(uri, qName);
            __CLR4_5_2gjigjim6lb51b3.R.inc(21575);this.contextStack.push(name);
            __CLR4_5_2gjigjim6lb51b3.R.inc(21576);this.nestingInfoStack.push("prop:" + name);
        }
    }}}finally{__CLR4_5_2gjigjim6lb51b3.R.flushNeeded();}}

    private void startStructure() {try{__CLR4_5_2gjigjim6lb51b3.R.inc(21577);
        //a structured property is the parent
        __CLR4_5_2gjigjim6lb51b3.R.inc(21578);XMPStructure struct = new XMPStructure();
        __CLR4_5_2gjigjim6lb51b3.R.inc(21579);this.contextStack.push(struct);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21580);this.nestingInfoStack.push("struct");
    }finally{__CLR4_5_2gjigjim6lb51b3.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void endElement(String uri, String localName, String qName) throws SAXException {try{__CLR4_5_2gjigjim6lb51b3.R.inc(21581);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21582);Attributes atts = (Attributes)attributesStack.pop();
        __CLR4_5_2gjigjim6lb51b3.R.inc(21583);if ((((XMPConstants.XMP_NAMESPACE.equals(uri))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21584)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21585)==0&false))) {{
            //nop
        } }else {__CLR4_5_2gjigjim6lb51b3.R.inc(21586);if ((((XMPConstants.RDF_NAMESPACE.equals(uri) && !"value".equals(localName))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21587)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21588)==0&false))) {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21589);if (((("li".equals(localName))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21590)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21591)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21592);XMPStructure struct = getCurrentStructure();
                __CLR4_5_2gjigjim6lb51b3.R.inc(21593);if ((((struct != null)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21594)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21595)==0&false))) {{
                    //Pop the structure
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21596);this.contextStack.pop();
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21597);this.nestingInfoStack.pop();
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21598);getCurrentArray(true).add(struct);
                } }else {{
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21599);String s = content.toString().trim();
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21600);if ((((s.length() > 0)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21601)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21602)==0&false))) {{
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21603);String lang = atts.getValue(XMPConstants.XML_NS, "lang");
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21604);if ((((lang != null)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21605)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21606)==0&false))) {{
                            __CLR4_5_2gjigjim6lb51b3.R.inc(21607);getCurrentArray(true).add(s, lang);
                        } }else {{
                            __CLR4_5_2gjigjim6lb51b3.R.inc(21608);getCurrentArray(true).add(s);
                        }
                    }} }else {{
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21609);String res = atts.getValue(XMPConstants.RDF_NAMESPACE,
                                "resource");
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21610);if ((((res != null)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21611)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21612)==0&false))) {{
                            __CLR4_5_2gjigjim6lb51b3.R.inc(21613);try {
                                __CLR4_5_2gjigjim6lb51b3.R.inc(21614);URI resource = new URI(res);
                                __CLR4_5_2gjigjim6lb51b3.R.inc(21615);getCurrentArray(true).add(resource);
                            } catch (URISyntaxException e) {
                                __CLR4_5_2gjigjim6lb51b3.R.inc(21616);throw new SAXException("rdf:resource value is not a well-formed URI", e);
                            }
                        }
                    }}
                }}
            }} }else {__CLR4_5_2gjigjim6lb51b3.R.inc(21617);if (((("Description".equals(localName))&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21618)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21619)==0&false))) {{
                /*
                if (isInStructure()) {
                    //Description is indicating a structure
                    //this.currentProperties = (PropertyAccess)propertiesStack.pop();
                    this.nestingInfoStack.pop();
                }*/
            } }else {{
                //nop, don't pop stack so the parent element has access
            }
        }}} }else {{
            __CLR4_5_2gjigjim6lb51b3.R.inc(21620);XMPProperty prop;
            __CLR4_5_2gjigjim6lb51b3.R.inc(21621);QName name;
            __CLR4_5_2gjigjim6lb51b3.R.inc(21622);if ((((hasComplexContent())&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21623)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21624)==0&false))) {{
                //Pop content of property
                __CLR4_5_2gjigjim6lb51b3.R.inc(21625);Object obj = this.contextStack.pop();
                __CLR4_5_2gjigjim6lb51b3.R.inc(21626);this.nestingInfoStack.pop();

                __CLR4_5_2gjigjim6lb51b3.R.inc(21627);name = popCurrentPropName();

                __CLR4_5_2gjigjim6lb51b3.R.inc(21628);if ((((obj instanceof XMPComplexValue)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21629)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21630)==0&false))) {{
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21631);XMPComplexValue complexValue = (XMPComplexValue)obj;
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21632);prop = new XMPProperty(name, complexValue);
                } }else {{
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21633);throw new UnsupportedOperationException("NYI");
                }
            }} }else {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21634);name = popCurrentPropName();

                __CLR4_5_2gjigjim6lb51b3.R.inc(21635);String s = content.toString().trim();
                __CLR4_5_2gjigjim6lb51b3.R.inc(21636);prop = new XMPProperty(name, s);
                __CLR4_5_2gjigjim6lb51b3.R.inc(21637);String lang = atts.getValue(XMPConstants.XML_NS, "lang");
                __CLR4_5_2gjigjim6lb51b3.R.inc(21638);String res = atts.getValue(XMPConstants.RDF_NAMESPACE, "resource");
                __CLR4_5_2gjigjim6lb51b3.R.inc(21639);if ((((lang != null)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21640)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21641)==0&false))) {{
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21642);prop.setXMLLang(lang);
                }
                }__CLR4_5_2gjigjim6lb51b3.R.inc(21643);if ((((res != null)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21644)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21645)==0&false))) {{
                    __CLR4_5_2gjigjim6lb51b3.R.inc(21646);try {
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21647);URI resource = new URI(res);
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21648);prop.setValue(resource);
                    } catch (URISyntaxException e) {
                        __CLR4_5_2gjigjim6lb51b3.R.inc(21649);throw new SAXException("rdf:resource value is not a well-formed URI", e);
                    }
                }
            }}
            }__CLR4_5_2gjigjim6lb51b3.R.inc(21650);if ((((prop.getName() == null)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21651)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21652)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21653);throw new IllegalStateException("No content in XMP property");
            }
            }__CLR4_5_2gjigjim6lb51b3.R.inc(21654);if ((((getCurrentProperties() == null)&&(__CLR4_5_2gjigjim6lb51b3.R.iget(21655)!=0|true))||(__CLR4_5_2gjigjim6lb51b3.R.iget(21656)==0&false))) {{
                __CLR4_5_2gjigjim6lb51b3.R.inc(21657);startStructure();
            }
            }__CLR4_5_2gjigjim6lb51b3.R.inc(21658);getCurrentProperties().setProperty(prop);
        }

        }}__CLR4_5_2gjigjim6lb51b3.R.inc(21659);content.setLength(0); //Reset text buffer (see characters())
        __CLR4_5_2gjigjim6lb51b3.R.inc(21660);super.endElement(uri, localName, qName);
    }finally{__CLR4_5_2gjigjim6lb51b3.R.flushNeeded();}}

    /*
    private boolean isInStructure() {
        return !propertiesStack.isEmpty();
    }
    */

    /** {@inheritDoc} */
    public void characters(char[] ch, int start, int length) throws SAXException {try{__CLR4_5_2gjigjim6lb51b3.R.inc(21661);
        __CLR4_5_2gjigjim6lb51b3.R.inc(21662);content.append(ch, start, length);
    }finally{__CLR4_5_2gjigjim6lb51b3.R.flushNeeded();}}

}
