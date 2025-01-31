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
import java.io.StringWriter;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.sax.SAXSource;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.io.IOUtils;
import org.apache.xml.resolver.tools.CatalogResolver;

public class URIResolverAdapterTestCase {static class __CLR4_5_2iociocm6lb525m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,24225,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final URI textFileURI = URI.create("test:catalog:resolver:testResource.txt");
    private final URI httpURL = URI.create("test:http:protocol:test.html");
    private final String pathOfTestFile = "src/test/resources/org/apache/xmlgraphics/io/test-catalog.xml";

    @Before
    public void setUp() {try{__CLR4_5_2iociocm6lb525m.R.inc(24204);
        __CLR4_5_2iociocm6lb525m.R.inc(24205);System.setProperty("xml.catalog.files", pathOfTestFile);
    }finally{__CLR4_5_2iociocm6lb525m.R.flushNeeded();}}

    @Test
    @Ignore("Literally no idea why this doesn't work... Gonna look at the catalog resolver source")
    public void testCatalogResolver() throws TransformerException, IOException {__CLR4_5_2iociocm6lb525m.R.globalSliceStart(getClass().getName(),24206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ktyicioe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iociocm6lb525m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iociocm6lb525m.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.URIResolverAdapterTestCase.testCatalogResolver",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24206,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ktyicioe() throws TransformerException, IOException{try{__CLR4_5_2iociocm6lb525m.R.inc(24206);
        __CLR4_5_2iociocm6lb525m.R.inc(24207);CatalogResolver catalogResolver = new CatalogResolver();
        __CLR4_5_2iociocm6lb525m.R.inc(24208);Source src = catalogResolver.resolve(textFileURI.toASCIIString(), null);
        __CLR4_5_2iociocm6lb525m.R.inc(24209);if ((((src instanceof SAXSource)&&(__CLR4_5_2iociocm6lb525m.R.iget(24210)!=0|true))||(__CLR4_5_2iociocm6lb525m.R.iget(24211)==0&false))) {{
            __CLR4_5_2iociocm6lb525m.R.inc(24212);testInputStream(new URL(src.getSystemId()).openStream());
        }
    }}finally{__CLR4_5_2iociocm6lb525m.R.flushNeeded();}}

    @Test
    @Ignore("Literally no idea why this doesn't work... Gonna look at the catalog resolver source")
    public void testCatalogResolverInAdapter() throws IOException {__CLR4_5_2iociocm6lb525m.R.globalSliceStart(getClass().getName(),24213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2npuny4iol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iociocm6lb525m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iociocm6lb525m.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.URIResolverAdapterTestCase.testCatalogResolverInAdapter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24213,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2npuny4iol() throws IOException{try{__CLR4_5_2iociocm6lb525m.R.inc(24213);
        __CLR4_5_2iociocm6lb525m.R.inc(24214);ResourceResolver resourceResolver = new URIResolverAdapter(new CatalogResolver());
        __CLR4_5_2iociocm6lb525m.R.inc(24215);testInputStream(resourceResolver.getResource(textFileURI));
    }finally{__CLR4_5_2iociocm6lb525m.R.flushNeeded();}}

    private void testInputStream(InputStream stream) throws IOException {try{__CLR4_5_2iociocm6lb525m.R.inc(24216);
        __CLR4_5_2iociocm6lb525m.R.inc(24217);StringWriter writer = new StringWriter();
        __CLR4_5_2iociocm6lb525m.R.inc(24218);IOUtils.copy(stream, writer, Charset.defaultCharset());
        __CLR4_5_2iociocm6lb525m.R.inc(24219);assertEquals("This is a text file used to test the CatalogResolver\n", writer.toString());
    }finally{__CLR4_5_2iociocm6lb525m.R.flushNeeded();}}

    @Test
    public void testHttpProtocol() throws TransformerException {__CLR4_5_2iociocm6lb525m.R.globalSliceStart(getClass().getName(),24220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25zhwcnios();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iociocm6lb525m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iociocm6lb525m.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.io.URIResolverAdapterTestCase.testHttpProtocol",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25zhwcnios() throws TransformerException{try{__CLR4_5_2iociocm6lb525m.R.inc(24220);
        __CLR4_5_2iociocm6lb525m.R.inc(24221);String url = "http://svn.apache.org/repos/asf/xmlgraphics/fop/trunk/test/resources/images/test.html";
        __CLR4_5_2iociocm6lb525m.R.inc(24222);CatalogResolver catalogResolver = new CatalogResolver();
        __CLR4_5_2iociocm6lb525m.R.inc(24223);Source src = catalogResolver.resolve(httpURL.toASCIIString(), null);
        __CLR4_5_2iociocm6lb525m.R.inc(24224);assertEquals(url, src.getSystemId());
    }finally{__CLR4_5_2iociocm6lb525m.R.flushNeeded();}}
}
