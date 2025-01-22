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

/* $Id: XMPParserTestCase.java 1902231 2022-06-24 12:44:08Z ssteiner $ */

package org.apache.xmlgraphics.xmp;

import java.io.StringReader;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamSource;

import org.junit.Test;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.apache.xmlgraphics.xmp.schemas.DublinCoreAdapter;
import org.apache.xmlgraphics.xmp.schemas.DublinCoreSchema;
import org.apache.xmlgraphics.xmp.schemas.XMPBasicAdapter;
import org.apache.xmlgraphics.xmp.schemas.XMPBasicSchema;
import org.apache.xmlgraphics.xmp.schemas.pdf.AdobePDFAdapter;
import org.apache.xmlgraphics.xmp.schemas.pdf.AdobePDFSchema;

/**
 * Tests for the XMP parser.
 */
public class XMPParserTestCase {static class __CLR4_5_2jx0jx0m68iyje0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,25929,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testParseBasics() throws Exception {__CLR4_5_2jx0jx0m68iyje0.R.globalSliceStart(getClass().getName(),25812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ab0x0tjx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jx0jx0m68iyje0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jx0jx0m68iyje0.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPParserTestCase.testParseBasics",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25812,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ab0x0tjx0() throws Exception{try{__CLR4_5_2jx0jx0m68iyje0.R.inc(25812);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25813);URL url = getClass().getResource("test-basics.xmp");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25814);Metadata meta = XMPParser.parseXMP(url);

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25815);DublinCoreAdapter dcAdapter = DublinCoreSchema.getAdapter(meta);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25816);XMPBasicAdapter basicAdapter = XMPBasicSchema.getAdapter(meta);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25817);AdobePDFAdapter pdfAdapter = AdobePDFSchema.getAdapter(meta);

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25818);XMPProperty prop;
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25819);prop = meta.getProperty(XMPConstants.DUBLIN_CORE_NAMESPACE, "creator");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25820);XMPArray array;
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25821);array = prop.getArrayValue();
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25822);assertEquals(1, array.getSize());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25823);assertEquals("John Doe", array.getValue(0).toString());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25824);assertEquals("John Doe", dcAdapter.getCreators()[0]);

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25825);prop = meta.getProperty(XMPConstants.DUBLIN_CORE_NAMESPACE, "title");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25826);assertEquals("Example document", prop.getValue().toString());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25827);assertEquals("Example document", dcAdapter.getTitle());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25828);prop = meta.getProperty(XMPConstants.XMP_BASIC_NAMESPACE, "CreateDate");
        //System.out.println("Creation Date: " + prop.getValue() + " " + prop.getClass().getName());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25829);prop = meta.getProperty(XMPConstants.XMP_BASIC_NAMESPACE, "CreatorTool");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25830);assertEquals("An XML editor", prop.getValue().toString());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25831);assertEquals("An XML editor", basicAdapter.getCreatorTool());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25832);prop = meta.getProperty(XMPConstants.ADOBE_PDF_NAMESPACE, "Producer");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25833);assertEquals("Apache FOP Version SVN trunk", prop.getValue().toString());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25834);assertEquals("Apache FOP Version SVN trunk", pdfAdapter.getProducer());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25835);prop = meta.getProperty(XMPConstants.ADOBE_PDF_NAMESPACE, "PDFVersion");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25836);assertEquals("1.4", prop.getValue().toString());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25837);assertEquals("1.4", pdfAdapter.getPDFVersion());
    }finally{__CLR4_5_2jx0jx0m68iyje0.R.flushNeeded();}}

    @Test
    public void testParse1() throws Exception {__CLR4_5_2jx0jx0m68iyje0.R.globalSliceStart(getClass().getName(),25838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bqnbdjjxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jx0jx0m68iyje0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jx0jx0m68iyje0.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPParserTestCase.testParse1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25838,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bqnbdjjxq() throws Exception{try{__CLR4_5_2jx0jx0m68iyje0.R.inc(25838);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25839);URL url = getClass().getResource("unknown-schema.xmp");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25840);Metadata meta = XMPParser.parseXMP(url);

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25841);DublinCoreAdapter dcAdapter = DublinCoreSchema.getAdapter(meta);

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25842);XMPProperty prop;
        //Access through the known schema as reference
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25843);prop = meta.getProperty(XMPConstants.DUBLIN_CORE_NAMESPACE, "title");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25844);assertEquals("Unknown Schema", prop.getValue().toString());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25845);assertEquals("Unknown Schema", dcAdapter.getTitle());

        //Access through a schema unknown to the XMP framework
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25846);prop = meta.getProperty("http://unknown.org/something", "dummy");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25847);assertEquals("Dummy!", prop.getValue().toString());
    }finally{__CLR4_5_2jx0jx0m68iyje0.R.flushNeeded();}}

    @Test
    public void testParseStructures() throws Exception {__CLR4_5_2jx0jx0m68iyje0.R.globalSliceStart(getClass().getName(),25848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29wjvl4jy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jx0jx0m68iyje0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jx0jx0m68iyje0.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPParserTestCase.testParseStructures",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25848,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29wjvl4jy0() throws Exception{try{__CLR4_5_2jx0jx0m68iyje0.R.inc(25848);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25849);URL url = getClass().getResource("test-structures.xmp");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25850);Metadata meta = XMPParser.parseXMP(url);

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25851);XMPProperty prop;

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25852);String testns = "http://foo.bar/test/";
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25853);prop = meta.getProperty(testns, "something");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25854);assertEquals("blablah", prop.getValue().toString());

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25855);prop = meta.getProperty(testns, "ingredients");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25856);XMPArray array = prop.getArrayValue();
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25857);assertEquals(3, array.getSize());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25858);XMPStructure struct = array.getStructure(0);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25859);assertEquals(2, struct.getPropertyCount());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25860);prop = struct.getValueProperty();
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25861);assertEquals("Apples", prop.getValue());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25862);prop = struct.getProperty(testns, "amount");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25863);assertEquals("4", prop.getValue());

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25864);prop = meta.getProperty(testns, "villain");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25865);XMPProperty prop1;
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25866);prop1 = prop.getStructureValue().getProperty(testns, "name");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25867);assertEquals("Darth Sidious", prop1.getValue());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25868);prop1 = prop.getStructureValue().getProperty(testns, "other-name");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25869);assertEquals("Palpatine", prop1.getValue());

        //Test shorthand form
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25870);prop = meta.getProperty(testns, "project");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25871);prop1 = prop.getStructureValue().getProperty(testns, "name");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25872);assertEquals("Apache XML Graphics", prop1.getValue());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25873);prop1 = prop.getStructureValue().getProperty(testns, "url");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25874);assertEquals("http://xmlgraphics.apache.org/", prop1.getValue());

    }finally{__CLR4_5_2jx0jx0m68iyje0.R.flushNeeded();}}

    @Test
    public void testAttributeValues() throws Exception {__CLR4_5_2jx0jx0m68iyje0.R.globalSliceStart(getClass().getName(),25875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23gsmgjjyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jx0jx0m68iyje0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jx0jx0m68iyje0.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPParserTestCase.testAttributeValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25875,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23gsmgjjyr() throws Exception{try{__CLR4_5_2jx0jx0m68iyje0.R.inc(25875);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25876);URL url = getClass().getResource("test-attribute-values.xmp");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25877);Metadata meta = XMPParser.parseXMP(url);

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25878);DublinCoreAdapter dcAdapter = DublinCoreSchema.getAdapter(meta);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25879);assertEquals("Ender's Game", dcAdapter.getTitle());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25880);assertEquals("Orson Scott Card", dcAdapter.getCreators()[0]);
    }finally{__CLR4_5_2jx0jx0m68iyje0.R.flushNeeded();}}

    @Test
    public void testParseDates() throws Exception {__CLR4_5_2jx0jx0m68iyje0.R.globalSliceStart(getClass().getName(),25881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26as9zfjyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jx0jx0m68iyje0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jx0jx0m68iyje0.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPParserTestCase.testParseDates",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26as9zfjyx() throws Exception{try{__CLR4_5_2jx0jx0m68iyje0.R.inc(25881);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25882);URL url = getClass().getResource("test-dates.xmp");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25883);Metadata meta = XMPParser.parseXMP(url);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25884);XMPProperty prop;

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25885);DublinCoreAdapter dcAdapter = DublinCoreSchema.getAdapter(meta);

        //Simple adapter access
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25886);Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+2:00"));
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25887);cal.set(2006, Calendar.JUNE, 2, 10, 36, 40);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25888);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25889);assertEquals(cal.getTime(), dcAdapter.getDate());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25890);Date[] dates = dcAdapter.getDates();
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25891);assertEquals(2, dates.length);

        //The second is the most recent and should match the simple value
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25892);assertEquals(dates[1], dcAdapter.getDate());

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25893);prop = meta.getProperty(XMPConstants.DUBLIN_CORE_NAMESPACE, "date");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25894);assertNotNull(prop.getArrayValue());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25895);assertEquals(2, prop.getArrayValue().getSize());

        //Now add a new date and check if the adapter's getDate() method returns the new date.
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25896);cal.set(2008, Calendar.NOVEMBER, 1, 10, 10, 0);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25897);dcAdapter.addDate(cal.getTime());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25898);assertEquals(3, dcAdapter.getDates().length);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25899);prop = meta.getProperty(XMPConstants.DUBLIN_CORE_NAMESPACE, "date");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25900);assertNotNull(prop.getArrayValue());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25901);assertEquals(3, prop.getArrayValue().getSize());
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25902);assertEquals(cal.getTime(), dcAdapter.getDate());
    }finally{__CLR4_5_2jx0jx0m68iyje0.R.flushNeeded();}}

    @Test
    public void testParseEmptyValues() throws Exception {__CLR4_5_2jx0jx0m68iyje0.R.globalSliceStart(getClass().getName(),25903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25xzqs5jzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jx0jx0m68iyje0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jx0jx0m68iyje0.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPParserTestCase.testParseEmptyValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25903,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25xzqs5jzj() throws Exception{try{__CLR4_5_2jx0jx0m68iyje0.R.inc(25903);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25904);URL url = getClass().getResource("empty-values.xmp");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25905);Metadata meta = XMPParser.parseXMP(url);

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25906);DublinCoreAdapter dc = DublinCoreSchema.getAdapter(meta);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25907);String title = dc.getTitle();
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25908);assertEquals("empty", title);

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25909);title = dc.getTitle("fr"); //Does not exist
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25910);assertNull(title);

        __CLR4_5_2jx0jx0m68iyje0.R.inc(25911);title = dc.getTitle("de");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25912);assertNull(title); //Empty value treated same as not existant
    }finally{__CLR4_5_2jx0jx0m68iyje0.R.flushNeeded();}}

    @Test
    public void testSubproperty() throws Exception {__CLR4_5_2jx0jx0m68iyje0.R.globalSliceStart(getClass().getName(),25913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j62n0qjzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jx0jx0m68iyje0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jx0jx0m68iyje0.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPParserTestCase.testSubproperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25913,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j62n0qjzt() throws Exception{try{__CLR4_5_2jx0jx0m68iyje0.R.inc(25913);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25914);URL url = getClass().getResource("test-subproperty.xmp");
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25915);Metadata meta = XMPParser.parseXMP(url);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25916);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25917);meta.toSAX(new DefaultHandler() {
            public void startElement(String uri, String localName, String qName, Attributes attributes) {try{__CLR4_5_2jx0jx0m68iyje0.R.inc(25918);
                __CLR4_5_2jx0jx0m68iyje0.R.inc(25919);sb.append(qName).append("\n");
            }finally{__CLR4_5_2jx0jx0m68iyje0.R.flushNeeded();}}
        });
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25920);assertEquals("x:xmpmeta\n"
                + "rdf:RDF\n"
                + "rdf:Description\n"
                + "pdfaExtension:schemas\n"
                + "rdf:Bag\n"
                + "rdf:li\n"
                + "rdf:Description\n"
                + "pdfaSchema:property\n"
                + "rdf:Seq\n"
                + "rdf:li\n"
                + "rdf:Description\n"
                + "pdfaProperty:name\n", sb.toString());
    }finally{__CLR4_5_2jx0jx0m68iyje0.R.flushNeeded();}}

    @Test
    public void testExternalDTD() {__CLR4_5_2jx0jx0m68iyje0.R.globalSliceStart(getClass().getName(),25921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dvsxvmk01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jx0jx0m68iyje0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jx0jx0m68iyje0.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPParserTestCase.testExternalDTD",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dvsxvmk01(){try{__CLR4_5_2jx0jx0m68iyje0.R.inc(25921);
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25922);String payload = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<!DOCTYPE root [\n<!ENTITY % remote SYSTEM \"http://127.0.0.1:9999/eval.xml\">\n%remote;]>\n"
                + "<root></root>";
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25923);StreamSource streamSource = new StreamSource(new StringReader(payload));
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25924);String msg = "";
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25925);try {
            __CLR4_5_2jx0jx0m68iyje0.R.inc(25926);XMPParser.parseXMP(streamSource);
        } catch (TransformerException e) {
            __CLR4_5_2jx0jx0m68iyje0.R.inc(25927);msg = e.getMessage();
        }
        __CLR4_5_2jx0jx0m68iyje0.R.inc(25928);assertTrue(msg, msg.contains("accessExternalDTD"));
    }finally{__CLR4_5_2jx0jx0m68iyje0.R.flushNeeded();}}
}
