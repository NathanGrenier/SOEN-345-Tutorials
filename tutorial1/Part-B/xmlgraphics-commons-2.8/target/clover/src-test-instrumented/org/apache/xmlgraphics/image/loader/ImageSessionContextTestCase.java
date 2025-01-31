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

/* $Id: ImageSessionContextTestCase.java 1391005 2012-09-27 13:39:57Z mehdi $ */

package org.apache.xmlgraphics.image.loader;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.URIResolver;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;

import org.junit.Test;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.xmlgraphics.image.loader.util.ImageUtil;
import org.apache.xmlgraphics.io.XmlSourceUtil;

/**
 * Tests for AbstractImageSessionContext.
 */
public class ImageSessionContextTestCase {static class __CLR4_5_2hy9hy9m6lb520p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,23430,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private MockImageContext imageContext = MockImageContext.getInstance();

    @Test
    public void testStreamSourceWithSystemID() throws Exception {__CLR4_5_2hy9hy9m6lb520p.R.globalSliceStart(getClass().getName(),23265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25moijghy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hy9hy9m6lb520p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hy9hy9m6lb520p.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageSessionContextTestCase.testStreamSourceWithSystemID",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25moijghy9() throws Exception{try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23265);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23266);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23267);
                __CLR4_5_2hy9hy9m6lb520p.R.inc(23268);if ((((href.startsWith("img:"))&&(__CLR4_5_2hy9hy9m6lb520p.R.iget(23269)!=0|true))||(__CLR4_5_2hy9hy9m6lb520p.R.iget(23270)==0&false))) {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23271);String filename = href.substring(4);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23272);return new StreamSource(base + filename);
                } }else {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23273);return null;
                }
            }}finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}
        };
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23274);String uri = "img:asf-logo.png";

        __CLR4_5_2hy9hy9m6lb520p.R.inc(23275);ImageSource imgSrc = checkImageInputStreamAvailable(uri, resolver);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23276);assertTrue(imgSrc.isFastSource()); //Access through local file system
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    @Test
    public void testStreamSourceWithInputStream() throws Exception {__CLR4_5_2hy9hy9m6lb520p.R.globalSliceStart(getClass().getName(),23277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2itjz42hyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hy9hy9m6lb520p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hy9hy9m6lb520p.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageSessionContextTestCase.testStreamSourceWithInputStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23277,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2itjz42hyl() throws Exception{try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23277);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23278);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23279);
                __CLR4_5_2hy9hy9m6lb520p.R.inc(23280);if ((((href.startsWith("img:"))&&(__CLR4_5_2hy9hy9m6lb520p.R.iget(23281)!=0|true))||(__CLR4_5_2hy9hy9m6lb520p.R.iget(23282)==0&false))) {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23283);String filename = href.substring(4);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23284);try {
                        __CLR4_5_2hy9hy9m6lb520p.R.inc(23285);return new StreamSource(new java.io.FileInputStream(
                                new File(MockImageSessionContext.IMAGE_BASE_DIR, filename)));
                    } catch (FileNotFoundException e) {
                        __CLR4_5_2hy9hy9m6lb520p.R.inc(23286);throw new TransformerException(e);
                    }
                } }else {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23287);return null;
                }
            }}finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}
        };
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23288);String uri = "img:asf-logo.png";

        __CLR4_5_2hy9hy9m6lb520p.R.inc(23289);ImageSource imgSrc = checkImageInputStreamAvailable(uri, resolver);
        //We don't pass in the URI, so no fast source is possible
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23290);assertTrue(!imgSrc.isFastSource());
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    @Test
    public void testStreamSourceWithFile() throws Exception {__CLR4_5_2hy9hy9m6lb520p.R.globalSliceStart(getClass().getName(),23291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gl2us6hyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hy9hy9m6lb520p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hy9hy9m6lb520p.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageSessionContextTestCase.testStreamSourceWithFile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23291,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gl2us6hyz() throws Exception{try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23291);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23292);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23293);
                __CLR4_5_2hy9hy9m6lb520p.R.inc(23294);if ((((href.startsWith("img:"))&&(__CLR4_5_2hy9hy9m6lb520p.R.iget(23295)!=0|true))||(__CLR4_5_2hy9hy9m6lb520p.R.iget(23296)==0&false))) {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23297);String filename = href.substring(4);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23298);File f = new File(MockImageSessionContext.IMAGE_BASE_DIR, filename);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23299);return new StreamSource(f);
                } }else {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23300);return null;
                }
            }}finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}
        };
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23301);String uri = "img:asf-logo.png";

        __CLR4_5_2hy9hy9m6lb520p.R.inc(23302);ImageSource imgSrc = checkImageInputStreamAvailable(uri, resolver);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23303);assertTrue(imgSrc.isFastSource()); //Accessed through the local file system
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    @Test
    public void testStreamSourceWithInputStreamAndSystemID() throws Exception {__CLR4_5_2hy9hy9m6lb520p.R.globalSliceStart(getClass().getName(),23304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26l4j5dhzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hy9hy9m6lb520p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hy9hy9m6lb520p.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageSessionContextTestCase.testStreamSourceWithInputStreamAndSystemID",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23304,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26l4j5dhzc() throws Exception{try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23304);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23305);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23306);
                __CLR4_5_2hy9hy9m6lb520p.R.inc(23307);if ((((href.startsWith("img:"))&&(__CLR4_5_2hy9hy9m6lb520p.R.iget(23308)!=0|true))||(__CLR4_5_2hy9hy9m6lb520p.R.iget(23309)==0&false))) {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23310);String filename = href.substring(4);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23311);try {
                        __CLR4_5_2hy9hy9m6lb520p.R.inc(23312);File f = new File(MockImageSessionContext.IMAGE_BASE_DIR, filename);
                        __CLR4_5_2hy9hy9m6lb520p.R.inc(23313);return new StreamSource(
                                new java.io.FileInputStream(f),
                                f.toURI().toASCIIString());
                    } catch (FileNotFoundException e) {
                        __CLR4_5_2hy9hy9m6lb520p.R.inc(23314);throw new TransformerException(e);
                    }
                } }else {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23315);return null;
                }
            }}finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}
        };
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23316);String uri = "img:asf-logo.png";

        __CLR4_5_2hy9hy9m6lb520p.R.inc(23317);ImageSource imgSrc = checkImageInputStreamAvailable(uri, resolver);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23318);assertTrue(imgSrc.isFastSource()); //Access through local file system (thanks to the URI
                                           //being passed through by the URIResolver)
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    @Test
    public void testStreamSourceWithReader() throws Exception {__CLR4_5_2hy9hy9m6lb520p.R.globalSliceStart(getClass().getName(),23319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xdlt6rhzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hy9hy9m6lb520p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hy9hy9m6lb520p.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageSessionContextTestCase.testStreamSourceWithReader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23319,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xdlt6rhzr() throws Exception{try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23319);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23320);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23321);
                __CLR4_5_2hy9hy9m6lb520p.R.inc(23322);if ((((href.startsWith("img:"))&&(__CLR4_5_2hy9hy9m6lb520p.R.iget(23323)!=0|true))||(__CLR4_5_2hy9hy9m6lb520p.R.iget(23324)==0&false))) {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23325);String filename = href.substring(4);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23326);return new StreamSource(new java.io.StringReader(filename));
                } }else {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23327);return null;
                }
            }}finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}
        };
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23328);String uri = "img:asf-logo.png";

        __CLR4_5_2hy9hy9m6lb520p.R.inc(23329);Source src = resolve(uri, resolver);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23330);assertTrue(src instanceof StreamSource); //Source remains unchanged
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23331);assertTrue(XmlSourceUtil.hasReader(src));
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    private ImageSource checkImageInputStreamAvailable(String uri, URIResolver resolver) {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23332);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23333);Source src = resolve(uri, resolver);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23334);assertNotNull("Source must not be null", src);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23335);assertTrue("Source must be an ImageSource", src instanceof ImageSource);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23336);ImageSource imgSrc = (ImageSource) src;
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23337);assertTrue(ImageUtil.hasImageInputStream(imgSrc));
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23338);return imgSrc;
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    private Source resolve(String uri, URIResolver resolver) {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23339);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23340);ImageSessionContext sessionContext = new SimpleURIResolverBasedImageSessionContext(
                imageContext, MockImageSessionContext.IMAGE_BASE_DIR, resolver);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23341);Source src = sessionContext.newSource(uri);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23342);return src;
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    @Test
    public void testSAXSourceWithSystemID() throws Exception {__CLR4_5_2hy9hy9m6lb520p.R.globalSliceStart(getClass().getName(),23343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qsbgoai0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hy9hy9m6lb520p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hy9hy9m6lb520p.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageSessionContextTestCase.testSAXSourceWithSystemID",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23343,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qsbgoai0f() throws Exception{try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23343);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23344);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23345);
                __CLR4_5_2hy9hy9m6lb520p.R.inc(23346);if ((((href.startsWith("img:"))&&(__CLR4_5_2hy9hy9m6lb520p.R.iget(23347)!=0|true))||(__CLR4_5_2hy9hy9m6lb520p.R.iget(23348)==0&false))) {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23349);String filename = href.substring(4);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23350);InputSource is = new InputSource(base + filename);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23351);return new SAXSource(is);
                } }else {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23352);return null;
                }
            }}finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}
        };
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23353);String uri = "img:asf-logo.png";

        __CLR4_5_2hy9hy9m6lb520p.R.inc(23354);ImageSource imgSrc = checkImageInputStreamAvailable(uri, resolver);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23355);assertTrue(imgSrc.isFastSource());
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    @Test
    public void testSAXSourceWithInputStream() throws Exception {__CLR4_5_2hy9hy9m6lb520p.R.globalSliceStart(getClass().getName(),23356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2um0020i0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hy9hy9m6lb520p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hy9hy9m6lb520p.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageSessionContextTestCase.testSAXSourceWithInputStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23356,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2um0020i0s() throws Exception{try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23356);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23357);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23358);
                __CLR4_5_2hy9hy9m6lb520p.R.inc(23359);if ((((href.startsWith("img:"))&&(__CLR4_5_2hy9hy9m6lb520p.R.iget(23360)!=0|true))||(__CLR4_5_2hy9hy9m6lb520p.R.iget(23361)==0&false))) {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23362);String filename = href.substring(4);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23363);InputSource is;
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23364);try {
                        __CLR4_5_2hy9hy9m6lb520p.R.inc(23365);is = new InputSource(new java.io.FileInputStream(
                                new File(MockImageSessionContext.IMAGE_BASE_DIR, filename)));
                    } catch (FileNotFoundException e) {
                        __CLR4_5_2hy9hy9m6lb520p.R.inc(23366);throw new TransformerException(e);
                    }
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23367);return new SAXSource(is);
                } }else {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23368);return null;
                }
            }}finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}
        };
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23369);String uri = "img:asf-logo.png";

        __CLR4_5_2hy9hy9m6lb520p.R.inc(23370);checkImageInputStreamAvailable(uri, resolver);
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    @Test
    public void testSAXSourceWithReader() throws Exception {__CLR4_5_2hy9hy9m6lb520p.R.globalSliceStart(getClass().getName(),23371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gucmtfi17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hy9hy9m6lb520p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hy9hy9m6lb520p.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageSessionContextTestCase.testSAXSourceWithReader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23371,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gucmtfi17() throws Exception{try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23371);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23372);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23373);
                __CLR4_5_2hy9hy9m6lb520p.R.inc(23374);if ((((href.startsWith("img:"))&&(__CLR4_5_2hy9hy9m6lb520p.R.iget(23375)!=0|true))||(__CLR4_5_2hy9hy9m6lb520p.R.iget(23376)==0&false))) {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23377);String filename = href.substring(4);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23378);InputSource is;
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23379);is = new InputSource(new java.io.StringReader(filename));
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23380);return new SAXSource(is);
                } }else {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23381);return null;
                }
            }}finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}
        };
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23382);String uri = "img:asf-logo.png";

        __CLR4_5_2hy9hy9m6lb520p.R.inc(23383);Source src = resolve(uri, resolver);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23384);assertTrue(src instanceof SAXSource); //Source remains unchanged
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23385);assertTrue(XmlSourceUtil.hasReader(src));
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    private static final String SOME_XML = "<root><child id='1'>Hello World!</child></root>";

    @Test
    public void testSAXSourceWithXMLReader() throws Exception {__CLR4_5_2hy9hy9m6lb520p.R.globalSliceStart(getClass().getName(),23386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jwmrw8i1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hy9hy9m6lb520p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hy9hy9m6lb520p.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageSessionContextTestCase.testSAXSourceWithXMLReader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23386,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jwmrw8i1m() throws Exception{try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23386);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23387);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23388);
                __CLR4_5_2hy9hy9m6lb520p.R.inc(23389);if ((((href.startsWith("xml:"))&&(__CLR4_5_2hy9hy9m6lb520p.R.iget(23390)!=0|true))||(__CLR4_5_2hy9hy9m6lb520p.R.iget(23391)==0&false))) {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23392);String xml = href.substring(4);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23393);InputSource is = new InputSource(new java.io.StringReader(xml));
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23394);return new SAXSource(createSomeXMLReader(), is);
                } }else {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23395);return null;
                }
            }}finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}
        };
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23396);String uri = "xml:" + SOME_XML;

        __CLR4_5_2hy9hy9m6lb520p.R.inc(23397);Source src = resolve(uri, resolver);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23398);assertTrue(src instanceof SAXSource); //Source remains unchanged
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23399);SAXSource saxSrc = (SAXSource) src;
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23400);assertNotNull(saxSrc.getXMLReader());
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23401);assertNotNull(saxSrc.getInputSource());
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    @Test
    public void testDOMSource() throws Exception {__CLR4_5_2hy9hy9m6lb520p.R.globalSliceStart(getClass().getName(),23402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s1r2j2i22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hy9hy9m6lb520p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hy9hy9m6lb520p.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.loader.ImageSessionContextTestCase.testDOMSource",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s1r2j2i22() throws Exception{try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23402);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23403);URIResolver resolver = new URIResolver() {
            public Source resolve(String href, String base) throws TransformerException {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23404);
                __CLR4_5_2hy9hy9m6lb520p.R.inc(23405);if ((((href.startsWith("xml:"))&&(__CLR4_5_2hy9hy9m6lb520p.R.iget(23406)!=0|true))||(__CLR4_5_2hy9hy9m6lb520p.R.iget(23407)==0&false))) {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23408);String xml = href.substring(4);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23409);InputSource is = new InputSource(new java.io.StringReader(xml));
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23410);SAXSource sax = new SAXSource(createSomeXMLReader(), is);

                    //Convert SAXSource to DOMSource
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23411);TransformerFactory tFactory = TransformerFactory.newInstance();
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23412);Transformer transformer = tFactory.newTransformer();
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23413);DOMResult res = new DOMResult();
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23414);transformer.transform(sax, res);
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23415);return new DOMSource(res.getNode());
                } }else {{
                    __CLR4_5_2hy9hy9m6lb520p.R.inc(23416);return null;
                }
            }}finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}
        };
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23417);String uri = "xml:" + SOME_XML;

        __CLR4_5_2hy9hy9m6lb520p.R.inc(23418);Source src = resolve(uri, resolver);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23419);assertTrue(src instanceof DOMSource); //Source remains unchanged
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23420);DOMSource domSrc = (DOMSource) src;
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23421);assertNotNull(domSrc.getNode());
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

    private XMLReader createSomeXMLReader() {try{__CLR4_5_2hy9hy9m6lb520p.R.inc(23422);
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23423);SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23424);SAXParser parser;
        __CLR4_5_2hy9hy9m6lb520p.R.inc(23425);try {
            __CLR4_5_2hy9hy9m6lb520p.R.inc(23426);parser = parserFactory.newSAXParser();
            __CLR4_5_2hy9hy9m6lb520p.R.inc(23427);return parser.getXMLReader();
        } catch (Exception e) {
            __CLR4_5_2hy9hy9m6lb520p.R.inc(23428);fail("Could not create XMLReader");
            __CLR4_5_2hy9hy9m6lb520p.R.inc(23429);return null;
        }
    }finally{__CLR4_5_2hy9hy9m6lb520p.R.flushNeeded();}}

}
