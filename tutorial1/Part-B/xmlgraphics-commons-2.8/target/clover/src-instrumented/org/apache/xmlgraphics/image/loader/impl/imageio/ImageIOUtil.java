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

/* $Id: ImageIOUtil.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl.imageio;

import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.apache.xmlgraphics.image.loader.ImageSize;
import org.apache.xmlgraphics.util.UnitConv;

/**
 * Helper and convenience methods for ImageIO.
 */
public final class ImageIOUtil {public static class __CLR4_5_291s91sm6lb50ci{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,11784,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ImageIOUtil() {try{__CLR4_5_291s91sm6lb50ci.R.inc(11728);
    }finally{__CLR4_5_291s91sm6lb50ci.R.flushNeeded();}}

    /** Key for ImageInfo's custom objects to embed the ImageIO metadata */
    public static final Object IMAGEIO_METADATA = IIOMetadata.class;

    /**
     * Extracts the resolution information from the standard ImageIO metadata.
     * @param iiometa the metadata provided by ImageIO
     * @param size the image size object
     */
    public static void extractResolution(IIOMetadata iiometa, ImageSize size) {try{__CLR4_5_291s91sm6lb50ci.R.inc(11729);
        __CLR4_5_291s91sm6lb50ci.R.inc(11730);if ((((iiometa != null && iiometa.isStandardMetadataFormatSupported())&&(__CLR4_5_291s91sm6lb50ci.R.iget(11731)!=0|true))||(__CLR4_5_291s91sm6lb50ci.R.iget(11732)==0&false))) {{
            __CLR4_5_291s91sm6lb50ci.R.inc(11733);Element metanode = (Element)iiometa.getAsTree(
                    IIOMetadataFormatImpl.standardMetadataFormatName);
            __CLR4_5_291s91sm6lb50ci.R.inc(11734);Element dim = getChild(metanode, "Dimension");
            __CLR4_5_291s91sm6lb50ci.R.inc(11735);if ((((dim != null)&&(__CLR4_5_291s91sm6lb50ci.R.iget(11736)!=0|true))||(__CLR4_5_291s91sm6lb50ci.R.iget(11737)==0&false))) {{
                __CLR4_5_291s91sm6lb50ci.R.inc(11738);Element child;
                __CLR4_5_291s91sm6lb50ci.R.inc(11739);double dpiHorz = size.getDpiHorizontal();
                __CLR4_5_291s91sm6lb50ci.R.inc(11740);double dpiVert = size.getDpiVertical();
                __CLR4_5_291s91sm6lb50ci.R.inc(11741);child = getChild(dim, "HorizontalPixelSize");
                __CLR4_5_291s91sm6lb50ci.R.inc(11742);if ((((child != null)&&(__CLR4_5_291s91sm6lb50ci.R.iget(11743)!=0|true))||(__CLR4_5_291s91sm6lb50ci.R.iget(11744)==0&false))) {{
                    __CLR4_5_291s91sm6lb50ci.R.inc(11745);float value = Float.parseFloat(child.getAttribute("value"));
                    __CLR4_5_291s91sm6lb50ci.R.inc(11746);if ((((value != 0 && !Float.isInfinite(value))&&(__CLR4_5_291s91sm6lb50ci.R.iget(11747)!=0|true))||(__CLR4_5_291s91sm6lb50ci.R.iget(11748)==0&false))) {{
                        __CLR4_5_291s91sm6lb50ci.R.inc(11749);dpiHorz = UnitConv.IN2MM / value;
                    }
                }}
                }__CLR4_5_291s91sm6lb50ci.R.inc(11750);child = getChild(dim, "VerticalPixelSize");
                __CLR4_5_291s91sm6lb50ci.R.inc(11751);if ((((child != null)&&(__CLR4_5_291s91sm6lb50ci.R.iget(11752)!=0|true))||(__CLR4_5_291s91sm6lb50ci.R.iget(11753)==0&false))) {{
                    __CLR4_5_291s91sm6lb50ci.R.inc(11754);float value = Float.parseFloat(child.getAttribute("value"));
                    __CLR4_5_291s91sm6lb50ci.R.inc(11755);if ((((value != 0 && !Float.isInfinite(value))&&(__CLR4_5_291s91sm6lb50ci.R.iget(11756)!=0|true))||(__CLR4_5_291s91sm6lb50ci.R.iget(11757)==0&false))) {{
                        __CLR4_5_291s91sm6lb50ci.R.inc(11758);dpiVert = UnitConv.IN2MM / value;
                    }
                }}
                }__CLR4_5_291s91sm6lb50ci.R.inc(11759);size.setResolution(dpiHorz, dpiVert);
                __CLR4_5_291s91sm6lb50ci.R.inc(11760);size.calcSizeFromPixels();
            }
        }}
    }}finally{__CLR4_5_291s91sm6lb50ci.R.flushNeeded();}}

    /**
     * Returns a child element of another element or null if there's no such child.
     * @param el the parent element
     * @param name the name of the requested child
     * @return the child or null if there's no such child
     */
    public static Element getChild(Element el, String name) {try{__CLR4_5_291s91sm6lb50ci.R.inc(11761);
        __CLR4_5_291s91sm6lb50ci.R.inc(11762);NodeList nodes = el.getElementsByTagName(name);
        __CLR4_5_291s91sm6lb50ci.R.inc(11763);if ((((nodes.getLength() > 0)&&(__CLR4_5_291s91sm6lb50ci.R.iget(11764)!=0|true))||(__CLR4_5_291s91sm6lb50ci.R.iget(11765)==0&false))) {{
            __CLR4_5_291s91sm6lb50ci.R.inc(11766);return (Element)nodes.item(0);
        } }else {{
            __CLR4_5_291s91sm6lb50ci.R.inc(11767);return null;
        }
    }}finally{__CLR4_5_291s91sm6lb50ci.R.flushNeeded();}}

    /**
     * Dumps the content of an IIOMetadata instance to System.out.
     * @param iiometa the metadata
     */
    public static void dumpMetadataToSystemOut(IIOMetadata iiometa) {try{__CLR4_5_291s91sm6lb50ci.R.inc(11768);
        __CLR4_5_291s91sm6lb50ci.R.inc(11769);String[] metanames = iiometa.getMetadataFormatNames();
        __CLR4_5_291s91sm6lb50ci.R.inc(11770);for (String metaname : metanames) {{
            __CLR4_5_291s91sm6lb50ci.R.inc(11771);System.out.println("--->" + metaname);
            __CLR4_5_291s91sm6lb50ci.R.inc(11772);dumpNodeToSystemOut(iiometa.getAsTree(metaname));
        }
    }}finally{__CLR4_5_291s91sm6lb50ci.R.flushNeeded();}}

    /**
     * Serializes a W3C DOM node to a String and dumps it to System.out.
     * @param node a W3C DOM node
     */
    private static void dumpNodeToSystemOut(Node node) {try{__CLR4_5_291s91sm6lb50ci.R.inc(11773);
        __CLR4_5_291s91sm6lb50ci.R.inc(11774);Transformer trans = null;
        __CLR4_5_291s91sm6lb50ci.R.inc(11775);try {
            __CLR4_5_291s91sm6lb50ci.R.inc(11776);trans = TransformerFactory.newInstance().newTransformer();
            __CLR4_5_291s91sm6lb50ci.R.inc(11777);trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            __CLR4_5_291s91sm6lb50ci.R.inc(11778);trans.setOutputProperty(OutputKeys.INDENT, "yes");
            __CLR4_5_291s91sm6lb50ci.R.inc(11779);Source src = new DOMSource(node);
            __CLR4_5_291s91sm6lb50ci.R.inc(11780);Result res = new StreamResult(System.out);
            __CLR4_5_291s91sm6lb50ci.R.inc(11781);trans.transform(src, res);
        } catch (TransformerConfigurationException e) {
            __CLR4_5_291s91sm6lb50ci.R.inc(11782);e.printStackTrace();
        } catch (TransformerException e) {
            __CLR4_5_291s91sm6lb50ci.R.inc(11783);e.printStackTrace();
        }
    }finally{__CLR4_5_291s91sm6lb50ci.R.flushNeeded();}}

}
