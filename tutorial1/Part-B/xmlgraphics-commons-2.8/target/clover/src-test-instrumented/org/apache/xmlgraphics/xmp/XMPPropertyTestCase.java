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

/* $Id: XMPPropertyTestCase.java 1829045 2018-04-13 09:22:33Z ssteiner $ */

package org.apache.xmlgraphics.xmp;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.apache.xmlgraphics.util.QName;
import org.apache.xmlgraphics.xmp.schemas.DublinCoreAdapter;
import org.apache.xmlgraphics.xmp.schemas.DublinCoreSchema;
import org.apache.xmlgraphics.xmp.schemas.XMPBasicAdapter;
import org.apache.xmlgraphics.xmp.schemas.XMPBasicSchema;

/**
 * Tests property access methods.
 */
public class XMPPropertyTestCase {static class __CLR4_5_2k09k09m68iyjek{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,26048,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testPropertyAccess() throws Exception {__CLR4_5_2k09k09m68iyjek.R.globalSliceStart(getClass().getName(),25929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28plltek09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k09k09m68iyjek.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k09k09m68iyjek.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPPropertyTestCase.testPropertyAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25929,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28plltek09() throws Exception{try{__CLR4_5_2k09k09m68iyjek.R.inc(25929);
        __CLR4_5_2k09k09m68iyjek.R.inc(25930);Metadata xmp = new Metadata();
        __CLR4_5_2k09k09m68iyjek.R.inc(25931);DublinCoreAdapter dc = DublinCoreSchema.getAdapter(xmp);
        __CLR4_5_2k09k09m68iyjek.R.inc(25932);assertNull(dc.getContributors());

        __CLR4_5_2k09k09m68iyjek.R.inc(25933);dc.addContributor("Contributor1");
        __CLR4_5_2k09k09m68iyjek.R.inc(25934);assertEquals(1, dc.getContributors().length);
        __CLR4_5_2k09k09m68iyjek.R.inc(25935);assertEquals("Contributor1", dc.getContributors()[0]);
        __CLR4_5_2k09k09m68iyjek.R.inc(25936);dc.removeContributor("Contributor1");
        __CLR4_5_2k09k09m68iyjek.R.inc(25937);assertNull(dc.getContributors());

        __CLR4_5_2k09k09m68iyjek.R.inc(25938);dc.addContributor("Contributor1");
        __CLR4_5_2k09k09m68iyjek.R.inc(25939);assertEquals(1, dc.getContributors().length);
        __CLR4_5_2k09k09m68iyjek.R.inc(25940);dc.addContributor("Contributor2");
        __CLR4_5_2k09k09m68iyjek.R.inc(25941);assertEquals(2, dc.getContributors().length);
        __CLR4_5_2k09k09m68iyjek.R.inc(25942);assertFalse(dc.removeContributor("DoesNotExist"));
        __CLR4_5_2k09k09m68iyjek.R.inc(25943);assertTrue(dc.removeContributor("Contributor1"));
        __CLR4_5_2k09k09m68iyjek.R.inc(25944);assertEquals(1, dc.getContributors().length);
        __CLR4_5_2k09k09m68iyjek.R.inc(25945);assertTrue(dc.removeContributor("Contributor2"));
        __CLR4_5_2k09k09m68iyjek.R.inc(25946);assertFalse(dc.removeContributor("Contributor2"));
        __CLR4_5_2k09k09m68iyjek.R.inc(25947);assertNull(dc.getContributors());
    }finally{__CLR4_5_2k09k09m68iyjek.R.flushNeeded();}}

    @Test
    public void testPropertyRemovalLangAlt() throws Exception {__CLR4_5_2k09k09m68iyjek.R.globalSliceStart(getClass().getName(),25948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h8o3stk0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k09k09m68iyjek.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k09k09m68iyjek.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPPropertyTestCase.testPropertyRemovalLangAlt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h8o3stk0s() throws Exception{try{__CLR4_5_2k09k09m68iyjek.R.inc(25948);
        __CLR4_5_2k09k09m68iyjek.R.inc(25949);Metadata xmp = new Metadata();
        __CLR4_5_2k09k09m68iyjek.R.inc(25950);DublinCoreAdapter dc = DublinCoreSchema.getAdapter(xmp);

        //dc:title is a "Lang Alt"
        __CLR4_5_2k09k09m68iyjek.R.inc(25951);dc.setTitle("en", "The title");
        __CLR4_5_2k09k09m68iyjek.R.inc(25952);String title = dc.removeTitle("en");
        __CLR4_5_2k09k09m68iyjek.R.inc(25953);assertEquals("The title", title);
        __CLR4_5_2k09k09m68iyjek.R.inc(25954);dc.setTitle("en", "The title");
        __CLR4_5_2k09k09m68iyjek.R.inc(25955);dc.setTitle("de", "Der Titel");
        __CLR4_5_2k09k09m68iyjek.R.inc(25956);title = dc.removeTitle("en");
        __CLR4_5_2k09k09m68iyjek.R.inc(25957);assertEquals("The title", title);
        __CLR4_5_2k09k09m68iyjek.R.inc(25958);title = dc.removeTitle("en");
        __CLR4_5_2k09k09m68iyjek.R.inc(25959);assertNull(title);

        __CLR4_5_2k09k09m68iyjek.R.inc(25960);title = dc.removeTitle("de");
        __CLR4_5_2k09k09m68iyjek.R.inc(25961);assertEquals("Der Titel", title);
        __CLR4_5_2k09k09m68iyjek.R.inc(25962);title = dc.removeTitle("de");
        __CLR4_5_2k09k09m68iyjek.R.inc(25963);assertNull(title);
    }finally{__CLR4_5_2k09k09m68iyjek.R.flushNeeded();}}

    @Test
    public void testReplaceLangAlt() throws Exception {__CLR4_5_2k09k09m68iyjek.R.globalSliceStart(getClass().getName(),25964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ta144gk18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k09k09m68iyjek.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k09k09m68iyjek.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPPropertyTestCase.testReplaceLangAlt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25964,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ta144gk18() throws Exception{try{__CLR4_5_2k09k09m68iyjek.R.inc(25964);
        __CLR4_5_2k09k09m68iyjek.R.inc(25965);Metadata xmp = new Metadata();
        __CLR4_5_2k09k09m68iyjek.R.inc(25966);DublinCoreAdapter dc = DublinCoreSchema.getAdapter(xmp);
        __CLR4_5_2k09k09m68iyjek.R.inc(25967);dc.setTitle("Default title");
        __CLR4_5_2k09k09m68iyjek.R.inc(25968);StringWriter writer = new StringWriter();
        __CLR4_5_2k09k09m68iyjek.R.inc(25969);XMPSerializer.writeXML(xmp, new StreamResult(writer));
        __CLR4_5_2k09k09m68iyjek.R.inc(25970);String xmpString = writer.toString();
        __CLR4_5_2k09k09m68iyjek.R.inc(25971);xmp = XMPParser.parseXMP(new StreamSource(new java.io.StringReader(xmpString)));
        __CLR4_5_2k09k09m68iyjek.R.inc(25972);dc = DublinCoreSchema.getAdapter(xmp);
        __CLR4_5_2k09k09m68iyjek.R.inc(25973);assertEquals("Default title", dc.getTitle());
        __CLR4_5_2k09k09m68iyjek.R.inc(25974);dc.setTitle("Updated title");
        __CLR4_5_2k09k09m68iyjek.R.inc(25975);XMPProperty prop = xmp.getProperty(new QName(DublinCoreSchema.NAMESPACE, "title"));
        __CLR4_5_2k09k09m68iyjek.R.inc(25976);XMPArray array = prop.getArrayValue();
        __CLR4_5_2k09k09m68iyjek.R.inc(25977);assertNotNull(array);
        //Check that only one title is present. There used to be a bug that didn't set the
        //non-qualified value equal to the value qualified with "x-default".
        __CLR4_5_2k09k09m68iyjek.R.inc(25978);assertEquals(1, array.getSize());
        __CLR4_5_2k09k09m68iyjek.R.inc(25979);assertEquals("Updated title", array.getValue(0));
    }finally{__CLR4_5_2k09k09m68iyjek.R.flushNeeded();}}

    @Test
    public void testPropertyValues() throws Exception {__CLR4_5_2k09k09m68iyjek.R.globalSliceStart(getClass().getName(),25980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eq4qxck1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k09k09m68iyjek.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k09k09m68iyjek.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPPropertyTestCase.testPropertyValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25980,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eq4qxck1o() throws Exception{try{__CLR4_5_2k09k09m68iyjek.R.inc(25980);
        __CLR4_5_2k09k09m68iyjek.R.inc(25981);Metadata xmp = new Metadata();
        __CLR4_5_2k09k09m68iyjek.R.inc(25982);DublinCoreAdapter dc = DublinCoreSchema.getAdapter(xmp);

        __CLR4_5_2k09k09m68iyjek.R.inc(25983);String format = dc.getFormat();
        __CLR4_5_2k09k09m68iyjek.R.inc(25984);assertNull(format);

        __CLR4_5_2k09k09m68iyjek.R.inc(25985);dc.setFormat("application/pdf");
        __CLR4_5_2k09k09m68iyjek.R.inc(25986);format = dc.getFormat();
        __CLR4_5_2k09k09m68iyjek.R.inc(25987);assertEquals("application/pdf", format);

        __CLR4_5_2k09k09m68iyjek.R.inc(25988);dc.setFormat("image/jpeg");
        __CLR4_5_2k09k09m68iyjek.R.inc(25989);format = dc.getFormat();
        __CLR4_5_2k09k09m68iyjek.R.inc(25990);assertEquals("image/jpeg", format);

        __CLR4_5_2k09k09m68iyjek.R.inc(25991);dc.setFormat(null);
        __CLR4_5_2k09k09m68iyjek.R.inc(25992);format = dc.getFormat();
        __CLR4_5_2k09k09m68iyjek.R.inc(25993);assertNull(format);

        __CLR4_5_2k09k09m68iyjek.R.inc(25994);dc.setFormat(""); //Empty string same as null value
        __CLR4_5_2k09k09m68iyjek.R.inc(25995);format = dc.getFormat();
        __CLR4_5_2k09k09m68iyjek.R.inc(25996);assertNull(format);

        __CLR4_5_2k09k09m68iyjek.R.inc(25997);dc.setTitle("title");
        __CLR4_5_2k09k09m68iyjek.R.inc(25998);String title = dc.getTitle();
        __CLR4_5_2k09k09m68iyjek.R.inc(25999);assertEquals("title", title);

        __CLR4_5_2k09k09m68iyjek.R.inc(26000);dc.setTitle("Titel");
        __CLR4_5_2k09k09m68iyjek.R.inc(26001);title = dc.getTitle();
        __CLR4_5_2k09k09m68iyjek.R.inc(26002);assertEquals("Titel", title);

        __CLR4_5_2k09k09m68iyjek.R.inc(26003);dc.setTitle(null);
        __CLR4_5_2k09k09m68iyjek.R.inc(26004);title = dc.getTitle();
        __CLR4_5_2k09k09m68iyjek.R.inc(26005);assertNull(title);

        __CLR4_5_2k09k09m68iyjek.R.inc(26006);dc.setTitle("");
        __CLR4_5_2k09k09m68iyjek.R.inc(26007);title = dc.getTitle();
        __CLR4_5_2k09k09m68iyjek.R.inc(26008);assertNull(title);
    }finally{__CLR4_5_2k09k09m68iyjek.R.flushNeeded();}}

    @Test
    public void testDates() throws Exception {__CLR4_5_2k09k09m68iyjek.R.globalSliceStart(getClass().getName(),26009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26c1gjqk2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k09k09m68iyjek.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k09k09m68iyjek.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPPropertyTestCase.testDates",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26c1gjqk2h() throws Exception{try{__CLR4_5_2k09k09m68iyjek.R.inc(26009);
        __CLR4_5_2k09k09m68iyjek.R.inc(26010);Metadata xmp = new Metadata();
        __CLR4_5_2k09k09m68iyjek.R.inc(26011);XMPBasicAdapter basic = XMPBasicSchema.getAdapter(xmp);

        __CLR4_5_2k09k09m68iyjek.R.inc(26012);Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ENGLISH);
        __CLR4_5_2k09k09m68iyjek.R.inc(26013);cal.set(2008, Calendar.FEBRUARY, 07, 15, 11, 07);
        __CLR4_5_2k09k09m68iyjek.R.inc(26014);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_5_2k09k09m68iyjek.R.inc(26015);Date dt = cal.getTime();

        __CLR4_5_2k09k09m68iyjek.R.inc(26016);assertNull(basic.getCreateDate());
        __CLR4_5_2k09k09m68iyjek.R.inc(26017);basic.setCreateDate(dt);
        __CLR4_5_2k09k09m68iyjek.R.inc(26018);Date dt2 = basic.getCreateDate();
        __CLR4_5_2k09k09m68iyjek.R.inc(26019);assertEquals(dt2, dt);
    }finally{__CLR4_5_2k09k09m68iyjek.R.flushNeeded();}}

    @Test
    public void testQualifiers() throws Exception {__CLR4_5_2k09k09m68iyjek.R.globalSliceStart(getClass().getName(),26020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yluwwyk2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k09k09m68iyjek.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k09k09m68iyjek.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPPropertyTestCase.testQualifiers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yluwwyk2s() throws Exception{try{__CLR4_5_2k09k09m68iyjek.R.inc(26020);
        __CLR4_5_2k09k09m68iyjek.R.inc(26021);Metadata xmp = new Metadata();
        __CLR4_5_2k09k09m68iyjek.R.inc(26022);XMPBasicAdapter basic = XMPBasicSchema.getAdapter(xmp);

        __CLR4_5_2k09k09m68iyjek.R.inc(26023);basic.addIdentifier("x123");
        __CLR4_5_2k09k09m68iyjek.R.inc(26024);basic.setIdentifier("id1", "system1");
        __CLR4_5_2k09k09m68iyjek.R.inc(26025);basic.setIdentifier("12345", "system2");

        __CLR4_5_2k09k09m68iyjek.R.inc(26026);String[] ids = basic.getIdentifiers();
        __CLR4_5_2k09k09m68iyjek.R.inc(26027);assertEquals(3, ids.length);
        __CLR4_5_2k09k09m68iyjek.R.inc(26028);Set<String> set = new java.util.HashSet<String>(Arrays.asList(ids));
        __CLR4_5_2k09k09m68iyjek.R.inc(26029);assertTrue(set.contains("x123"));
        __CLR4_5_2k09k09m68iyjek.R.inc(26030);assertTrue(set.contains("id1"));
        __CLR4_5_2k09k09m68iyjek.R.inc(26031);assertTrue(set.contains("12345"));

        __CLR4_5_2k09k09m68iyjek.R.inc(26032);assertEquals("id1", basic.getIdentifier("system1"));
        __CLR4_5_2k09k09m68iyjek.R.inc(26033);basic.setIdentifier("id2", "system1");
        __CLR4_5_2k09k09m68iyjek.R.inc(26034);assertEquals("id2", basic.getIdentifier("system1"));
        __CLR4_5_2k09k09m68iyjek.R.inc(26035);assertEquals(3, basic.getIdentifiers().length);
    }finally{__CLR4_5_2k09k09m68iyjek.R.flushNeeded();}}

    @Test
    public void testEmptyPropertyValue() {__CLR4_5_2k09k09m68iyjek.R.globalSliceStart(getClass().getName(),26036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lhdwa0k38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k09k09m68iyjek.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k09k09m68iyjek.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.xmp.XMPPropertyTestCase.testEmptyPropertyValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26036,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lhdwa0k38(){try{__CLR4_5_2k09k09m68iyjek.R.inc(26036);
        __CLR4_5_2k09k09m68iyjek.R.inc(26037);Metadata xmp = new Metadata();
        __CLR4_5_2k09k09m68iyjek.R.inc(26038);DublinCoreAdapter dc = DublinCoreSchema.getAdapter(xmp);
        __CLR4_5_2k09k09m68iyjek.R.inc(26039);String ex = "";
        __CLR4_5_2k09k09m68iyjek.R.inc(26040);try {
            __CLR4_5_2k09k09m68iyjek.R.inc(26041);dc.addLanguage("");
        } catch (IllegalArgumentException e) {
            __CLR4_5_2k09k09m68iyjek.R.inc(26042);ex = e.getMessage();
        }
        __CLR4_5_2k09k09m68iyjek.R.inc(26043);assertEquals(ex, "'language' value must not be empty");

        __CLR4_5_2k09k09m68iyjek.R.inc(26044);try {
            __CLR4_5_2k09k09m68iyjek.R.inc(26045);dc.addSubject("");
        } catch (IllegalArgumentException e) {
            __CLR4_5_2k09k09m68iyjek.R.inc(26046);ex = e.getMessage();
        }
        __CLR4_5_2k09k09m68iyjek.R.inc(26047);assertEquals(ex, "'subject' value must not be empty");
    }finally{__CLR4_5_2k09k09m68iyjek.R.flushNeeded();}}
}
