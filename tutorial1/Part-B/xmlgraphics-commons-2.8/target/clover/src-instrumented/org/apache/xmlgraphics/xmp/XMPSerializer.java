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

/* $Id: XMPSerializer.java 1345683 2012-06-03 14:50:33Z gadams $ */

package org.apache.xmlgraphics.xmp;

import java.io.OutputStream;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.SAXException;

/**
 * Serializes an XMP tree to XML or to an XMP packet.
 */
public final class XMPSerializer {public static class __CLR4_5_2h34h34m68iyil9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,22189,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private XMPSerializer() {try{__CLR4_5_2h34h34m68iyil9.R.inc(22144);
    }finally{__CLR4_5_2h34h34m68iyil9.R.flushNeeded();}}

    private static final String DEFAULT_ENCODING = "UTF-8";

    /**
     * Writes the in-memory representation of the XMP metadata to a JAXP Result.
     * @param meta the metadata
     * @param res the JAXP Result to write to
     * @throws TransformerConfigurationException if an error occurs setting up the XML
     *              infrastructure.
     * @throws SAXException if a SAX-related problem occurs while writing the XML
     */
    public static void writeXML(Metadata meta, Result res)
            throws TransformerConfigurationException, SAXException {try{__CLR4_5_2h34h34m68iyil9.R.inc(22145);
        __CLR4_5_2h34h34m68iyil9.R.inc(22146);writeXML(meta, res, false, false);
    }finally{__CLR4_5_2h34h34m68iyil9.R.flushNeeded();}}

    /**
     * Writes the in-memory representation of the XMP metadata to an OutputStream as an XMP packet.
     * @param meta the metadata
     * @param out the stream to write to
     * @param readOnlyXMP true if the generated XMP packet should be read-only
     * @throws TransformerConfigurationException if an error occurs setting up the XML
     *              infrastructure.
     * @throws SAXException if a SAX-related problem occurs while writing the XML
     */
    public static void writeXMPPacket(Metadata meta, OutputStream out, boolean readOnlyXMP)
            throws TransformerConfigurationException, SAXException {try{__CLR4_5_2h34h34m68iyil9.R.inc(22147);
        __CLR4_5_2h34h34m68iyil9.R.inc(22148);StreamResult res = new StreamResult(out);
        __CLR4_5_2h34h34m68iyil9.R.inc(22149);writeXML(meta, res, true, readOnlyXMP);

    }finally{__CLR4_5_2h34h34m68iyil9.R.flushNeeded();}}

    private static void writeXML(Metadata meta, Result res,
                    boolean asXMPPacket, boolean readOnlyXMP)
                            throws TransformerConfigurationException, SAXException {try{__CLR4_5_2h34h34m68iyil9.R.inc(22150);
        __CLR4_5_2h34h34m68iyil9.R.inc(22151);SAXTransformerFactory tFactory = (SAXTransformerFactory)SAXTransformerFactory.newInstance();
        __CLR4_5_2h34h34m68iyil9.R.inc(22152);TransformerHandler handler = tFactory.newTransformerHandler();
        __CLR4_5_2h34h34m68iyil9.R.inc(22153);Transformer transformer = handler.getTransformer();
        __CLR4_5_2h34h34m68iyil9.R.inc(22154);if ((((asXMPPacket)&&(__CLR4_5_2h34h34m68iyil9.R.iget(22155)!=0|true))||(__CLR4_5_2h34h34m68iyil9.R.iget(22156)==0&false))) {{
            __CLR4_5_2h34h34m68iyil9.R.inc(22157);transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        }
        }__CLR4_5_2h34h34m68iyil9.R.inc(22158);transformer.setOutputProperty(OutputKeys.ENCODING, DEFAULT_ENCODING);
        __CLR4_5_2h34h34m68iyil9.R.inc(22159);try {
            __CLR4_5_2h34h34m68iyil9.R.inc(22160);transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        } catch (IllegalArgumentException iae) {
            //INDENT key is not supported by implementation. That's not tragic, so just ignore.
        }
        __CLR4_5_2h34h34m68iyil9.R.inc(22161);handler.setResult(res);
        __CLR4_5_2h34h34m68iyil9.R.inc(22162);handler.startDocument();
        __CLR4_5_2h34h34m68iyil9.R.inc(22163);if ((((asXMPPacket)&&(__CLR4_5_2h34h34m68iyil9.R.iget(22164)!=0|true))||(__CLR4_5_2h34h34m68iyil9.R.iget(22165)==0&false))) {{
            __CLR4_5_2h34h34m68iyil9.R.inc(22166);handler.processingInstruction("xpacket",
                    "begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"");
        }
        }__CLR4_5_2h34h34m68iyil9.R.inc(22167);meta.toSAX(handler);
        __CLR4_5_2h34h34m68iyil9.R.inc(22168);if ((((asXMPPacket)&&(__CLR4_5_2h34h34m68iyil9.R.iget(22169)!=0|true))||(__CLR4_5_2h34h34m68iyil9.R.iget(22170)==0&false))) {{
            __CLR4_5_2h34h34m68iyil9.R.inc(22171);if ((((readOnlyXMP)&&(__CLR4_5_2h34h34m68iyil9.R.iget(22172)!=0|true))||(__CLR4_5_2h34h34m68iyil9.R.iget(22173)==0&false))) {{
                __CLR4_5_2h34h34m68iyil9.R.inc(22174);handler.processingInstruction("xpacket", "end=\"r\"");
            } }else {{
                //Create padding string (40 * 101 characters is more or less the recommended 4KB)
                __CLR4_5_2h34h34m68iyil9.R.inc(22175);StringBuffer sb = new StringBuffer(101);
                __CLR4_5_2h34h34m68iyil9.R.inc(22176);sb.append('\n');
                __CLR4_5_2h34h34m68iyil9.R.inc(22177);for (int i = 0; (((i < 100)&&(__CLR4_5_2h34h34m68iyil9.R.iget(22178)!=0|true))||(__CLR4_5_2h34h34m68iyil9.R.iget(22179)==0&false)); i++) {{
                    __CLR4_5_2h34h34m68iyil9.R.inc(22180);sb.append(" ");
                }
                }__CLR4_5_2h34h34m68iyil9.R.inc(22181);char[] padding = sb.toString().toCharArray();
                __CLR4_5_2h34h34m68iyil9.R.inc(22182);for (int i = 0; (((i < 40)&&(__CLR4_5_2h34h34m68iyil9.R.iget(22183)!=0|true))||(__CLR4_5_2h34h34m68iyil9.R.iget(22184)==0&false)); i++) {{
                    __CLR4_5_2h34h34m68iyil9.R.inc(22185);handler.characters(padding, 0, padding.length);
                }
                }__CLR4_5_2h34h34m68iyil9.R.inc(22186);handler.characters(new char[] {'\n'}, 0, 1);
                __CLR4_5_2h34h34m68iyil9.R.inc(22187);handler.processingInstruction("xpacket", "end=\"w\"");
            }

        }}
        }__CLR4_5_2h34h34m68iyil9.R.inc(22188);handler.endDocument();
    }finally{__CLR4_5_2h34h34m68iyil9.R.flushNeeded();}}

}
