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

package org.apache.xmlgraphics.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

import javax.imageio.stream.ImageInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;

import org.junit.Before;
import org.junit.Test;
import org.xml.sax.InputSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Ignore;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.commons.io.IOUtils;

import org.apache.xmlgraphics.image.loader.ImageSource;

import static org.apache.xmlgraphics.io.XmlSourceUtil.closeQuietly;
import static org.apache.xmlgraphics.io.XmlSourceUtil.getInputStream;
import static org.apache.xmlgraphics.io.XmlSourceUtil.hasInputStream;
import static org.apache.xmlgraphics.io.XmlSourceUtil.hasReader;
import static org.apache.xmlgraphics.io.XmlSourceUtil.needInputStream;
import static org.apache.xmlgraphics.io.XmlSourceUtil.removeStreams;

public class XmlSourceUtilTestCase {static class __CLR4_5_2ioxioxm68iyj4y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,24323,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private StreamSource streamSource;
    private SAXSource saxSource;
    private InputSource inputSource;
    private ImageSource imgSource;
    private ImageInputStream imgInStream;
    private DOMSource domSource;
    private StringWriter writer;
    private InputStream testStream;
    private Reader reader;

    @Before
    public void setUp() throws IOException, ParserConfigurationException {try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24225);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24226);testStream = mock(InputStream.class);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24227);reader = mock(Reader.class);

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24228);streamSource = mock(StreamSource.class);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24229);when(streamSource.getInputStream()).thenReturn(testStream);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24230);when(streamSource.getReader()).thenReturn(reader);

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24231);saxSource = mock(SAXSource.class);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24232);inputSource = mock(InputSource.class);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24233);when(saxSource.getInputSource()).thenReturn(inputSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24234);when(inputSource.getByteStream()).thenReturn(testStream);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24235);when(inputSource.getCharacterStream()).thenReturn(reader);

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24236);imgSource = mock(ImageSource.class);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24237);imgInStream = mock(ImageInputStream.class);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24238);when(imgSource.getImageInputStream()).thenReturn(imgInStream);


        __CLR4_5_2ioxioxm68iyj4y.R.inc(24239);DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24240);DocumentBuilder db = dbf.newDocumentBuilder();
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24241);domSource = new DOMSource(db.newDocument().createElement("test"));
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24242);InputStream inStream = XmlSourceUtil.getInputStream(domSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24243);writer = new StringWriter();
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24244);IOUtils.copy(inStream, writer, Charset.defaultCharset());
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test
    public void testGetInputStream() throws ParserConfigurationException, IOException {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ypcb7iph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testGetInputStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24245,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ypcb7iph() throws ParserConfigurationException, IOException{try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24245);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24246);getInputStream(streamSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24247);verify(streamSource).getInputStream();

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24248);getInputStream(saxSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24249);verify(inputSource).getByteStream();

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24250);getInputStream(imgSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24251);verify(imgSource).getImageInputStream();

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24252);assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><test/>", writer.toString());

        // Test negative case
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24253);Source src = mock(Source.class);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24254);assertNull(getInputStream(src));

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24255);getInputStream(null);
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test
    public void testNeedInputStream() throws IOException, ParserConfigurationException {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21mc51lips();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testNeedInputStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21mc51lips() throws IOException, ParserConfigurationException{try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24256);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24257);assertEquals(testStream, needInputStream(streamSource));

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24258);assertEquals(testStream, needInputStream(saxSource));

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24259);needInputStream(imgSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24260);verify(imgSource).getImageInputStream();

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24261);assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><test/>", writer.toString());
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNeedInputStreamFailureCaseSource() {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gaahwaipy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,101,100,73,110,112,117,116,83,116,114,101,97,109,70,97,105,108,117,114,101,67,97,115,101,83,111,117,114,99,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testNeedInputStreamFailureCaseSource",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gaahwaipy(){try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24262);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24263);Source src = mock(Source.class);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24264);needInputStream(src);
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNeedInputStreamFailureCaseStreamSource() {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jzz2o6iq1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,101,100,73,110,112,117,116,83,116,114,101,97,109,70,97,105,108,117,114,101,67,97,115,101,83,116,114,101,97,109,83,111,117,114,99,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testNeedInputStreamFailureCaseStreamSource",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jzz2o6iq1(){try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24265);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24266);needInputStream(mock(StreamSource.class));
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNeedInputStreamFailureCaseSAXSource() {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0jwsiq3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,101,100,73,110,112,117,116,83,116,114,101,97,109,70,97,105,108,117,114,101,67,97,115,101,83,65,88,83,111,117,114,99,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testNeedInputStreamFailureCaseSAXSource",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24267,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0jwsiq3(){try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24267);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24268);needInputStream(mock(SAXSource.class));
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    public void testNeedInputStreamFailureCaseDOMSource() throws IOException {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f26b90iq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testNeedInputStreamFailureCaseDOMSource",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24269,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f26b90iq5() throws IOException{try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24269);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24270);InputStream inStream = needInputStream(new DOMSource());
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24271);StringWriter writer = new StringWriter();
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24272);IOUtils.copy(inStream, writer, Charset.defaultCharset());
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24273);assertEquals("", writer.toString());
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Ignore
	@Test(expected = AssertionError.class)
    public void testNeedInputStreamFailureCaseStreamImage() {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gd3p12iqa();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,101,100,73,110,112,117,116,83,116,114,101,97,109,70,97,105,108,117,114,101,67,97,115,101,83,116,114,101,97,109,73,109,97,103,101,58,32,91,65,115,115,101,114,116,105,111,110,69,114,114,111,114,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof AssertionError){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testNeedInputStreamFailureCaseStreamImage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24274,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gd3p12iqa(){try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24274);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24275);needInputStream(mock(ImageSource.class));
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNeedInputStreamFailureCaseNullArg() {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ua0p0eiqc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,101,100,73,110,112,117,116,83,116,114,101,97,109,70,97,105,108,117,114,101,67,97,115,101,78,117,108,108,65,114,103,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testNeedInputStreamFailureCaseNullArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ua0p0eiqc(){try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24276);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24277);needInputStream(null);
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test
    public void testHasReader() {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22rstwyiqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testHasReader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24278,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22rstwyiqe(){try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24278);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24279);assertTrue(hasReader(streamSource));

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24280);assertTrue(hasReader(saxSource));

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24281);when(streamSource.getReader()).thenReturn(null);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24282);when(inputSource.getCharacterStream()).thenReturn(null);

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24283);assertFalse(hasReader(streamSource));
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24284);assertFalse(hasReader(saxSource));
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24285);assertFalse(hasReader(imgSource));
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24286);assertFalse(hasReader(domSource));

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24287);hasReader(null);
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test
    public void testRemoveStreams() {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zb9gcciqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testRemoveStreams",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zb9gcciqo(){try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24288);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24289);removeStreams(streamSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24290);verify(streamSource).setInputStream(null);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24291);verify(streamSource).setReader(null);

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24292);removeStreams(imgSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24293);verify(imgSource).setImageInputStream(null);

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24294);removeStreams(saxSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24295);verify(inputSource).setByteStream(null);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24296);verify(inputSource).setCharacterStream(null);

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24297);removeStreams(null);
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test
    public void testCloseQuietlyStreamSource() throws IOException {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bbthabiqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testCloseQuietlyStreamSource",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bbthabiqy() throws IOException{try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24298);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24299);closeQuietly(streamSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24300);verify(reader).close();
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24301);verify(streamSource).setInputStream(null);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24302);verify(streamSource).setReader(null);
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test
    public void testCloseQuietlySaxSource() throws IOException {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_247ujrlir3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testCloseQuietlySaxSource",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_247ujrlir3() throws IOException{try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24303);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24304);closeQuietly(saxSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24305);verify(testStream).close();
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24306);verify(reader).close();
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24307);verify(inputSource).setByteStream(null);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24308);verify(inputSource).setCharacterStream(null);
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test
    public void testCloseQuietlyImageSource() throws IOException {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cijs2qir9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testCloseQuietlyImageSource",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cijs2qir9() throws IOException{try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24309);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24310);closeQuietly(imgSource);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24311);verify(imgInStream).close();
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24312);verify(imgSource).setImageInputStream(null);
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test
    public void testCloseQuietlyNull() {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jrvmuvird();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testCloseQuietlyNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jrvmuvird(){try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24313);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24314);XmlSourceUtil.closeQuietly(null);
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}

    @Test
    public void testHasInputStream() {__CLR4_5_2ioxioxm68iyj4y.R.globalSliceStart(getClass().getName(),24315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gtdck7irf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ioxioxm68iyj4y.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ioxioxm68iyj4y.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.XmlSourceUtilTestCase.testHasInputStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gtdck7irf(){try{__CLR4_5_2ioxioxm68iyj4y.R.inc(24315);
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24316);assertTrue(hasInputStream(streamSource));
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24317);assertTrue(hasInputStream(saxSource));
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24318);assertTrue(hasInputStream(imgSource));
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24319);assertTrue(hasInputStream(domSource));

        __CLR4_5_2ioxioxm68iyj4y.R.inc(24320);assertFalse(hasInputStream(mock(StreamSource.class)));
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24321);assertFalse(hasInputStream(mock(SAXSource.class)));
        // Can't do the ImageSource test because of an assert, do we want that assert there?
        // assertFalse(hasInputStream(mock(ImageSource.class)));
        __CLR4_5_2ioxioxm68iyj4y.R.inc(24322);assertFalse(hasInputStream(mock(StreamSource.class)));
    }finally{__CLR4_5_2ioxioxm68iyj4y.R.flushNeeded();}}
}
