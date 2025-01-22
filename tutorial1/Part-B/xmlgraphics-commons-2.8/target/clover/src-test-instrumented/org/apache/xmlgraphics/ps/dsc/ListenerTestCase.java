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

/* $Id: ListenerTestCase.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.ps.dsc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.apache.commons.io.IOUtils;

import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.dsc.events.DSCComment;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentLanguageLevel;
import org.apache.xmlgraphics.ps.dsc.events.DSCEvent;

/**
 * Tests the listener functionality on the DSC parser.
 */
public class ListenerTestCase {static class __CLR4_5_2j35j35m68iyj8c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,24796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Tests {@link DSCParser#setFilter(DSCFilter)}.
     * @throws Exception if an error occurs
     */
    @Test
    public void testFilter() throws Exception {__CLR4_5_2j35j35m68iyj8c.R.globalSliceStart(getClass().getName(),24737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aqdvapj35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j35j35m68iyj8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j35j35m68iyj8c.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.dsc.ListenerTestCase.testFilter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aqdvapj35() throws Exception{try{__CLR4_5_2j35j35m68iyj8c.R.inc(24737);
        __CLR4_5_2j35j35m68iyj8c.R.inc(24738);InputStream in = getClass().getResourceAsStream("test1.txt");
        __CLR4_5_2j35j35m68iyj8c.R.inc(24739);try {
            __CLR4_5_2j35j35m68iyj8c.R.inc(24740);DSCParser parser = new DSCParser(in);
            __CLR4_5_2j35j35m68iyj8c.R.inc(24741);parser.setFilter(new DSCFilter() {

                public boolean accept(DSCEvent event) {try{__CLR4_5_2j35j35m68iyj8c.R.inc(24742);
                    //Filter out all non-DSC comments
                    __CLR4_5_2j35j35m68iyj8c.R.inc(24743);return !event.isComment();
                }finally{__CLR4_5_2j35j35m68iyj8c.R.flushNeeded();}}

            });
            __CLR4_5_2j35j35m68iyj8c.R.inc(24744);while ((((parser.hasNext())&&(__CLR4_5_2j35j35m68iyj8c.R.iget(24745)!=0|true))||(__CLR4_5_2j35j35m68iyj8c.R.iget(24746)==0&false))) {{
                __CLR4_5_2j35j35m68iyj8c.R.inc(24747);DSCEvent event = parser.nextEvent();

                __CLR4_5_2j35j35m68iyj8c.R.inc(24748);if ((((parser.getCurrentEvent().isComment())&&(__CLR4_5_2j35j35m68iyj8c.R.iget(24749)!=0|true))||(__CLR4_5_2j35j35m68iyj8c.R.iget(24750)==0&false))) {{
                    __CLR4_5_2j35j35m68iyj8c.R.inc(24751);fail("Filter failed. Comment found.");
                }
            }}
        }} finally {
            __CLR4_5_2j35j35m68iyj8c.R.inc(24752);IOUtils.closeQuietly(in);
        }
    }finally{__CLR4_5_2j35j35m68iyj8c.R.flushNeeded();}}

    /**
     * Tests listeners on DSCParser.
     * @throws Exception if an error occurs
     */
    @Test
    public void testListeners() throws Exception {__CLR4_5_2j35j35m68iyj8c.R.globalSliceStart(getClass().getName(),24753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9frm4j3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j35j35m68iyj8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j35j35m68iyj8c.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.ps.dsc.ListenerTestCase.testListeners",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24753,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9frm4j3l() throws Exception{try{__CLR4_5_2j35j35m68iyj8c.R.inc(24753);
        __CLR4_5_2j35j35m68iyj8c.R.inc(24754);InputStream in = getClass().getResourceAsStream("test1.txt");
        __CLR4_5_2j35j35m68iyj8c.R.inc(24755);try {
            __CLR4_5_2j35j35m68iyj8c.R.inc(24756);final Map results = new java.util.HashMap();
            __CLR4_5_2j35j35m68iyj8c.R.inc(24757);DSCParser parser = new DSCParser(in);

            //Filter the prolog
            __CLR4_5_2j35j35m68iyj8c.R.inc(24758);parser.addListener(new DSCListener() {
                public void processEvent(DSCEvent event, DSCParser parser)
                        throws IOException, DSCException {try{__CLR4_5_2j35j35m68iyj8c.R.inc(24759);
                    __CLR4_5_2j35j35m68iyj8c.R.inc(24760);if ((((event.isDSCComment())&&(__CLR4_5_2j35j35m68iyj8c.R.iget(24761)!=0|true))||(__CLR4_5_2j35j35m68iyj8c.R.iget(24762)==0&false))) {{
                        __CLR4_5_2j35j35m68iyj8c.R.inc(24763);DSCComment comment = event.asDSCComment();
                        __CLR4_5_2j35j35m68iyj8c.R.inc(24764);if ((((DSCConstants.BEGIN_PROLOG.equals(comment.getName()))&&(__CLR4_5_2j35j35m68iyj8c.R.iget(24765)!=0|true))||(__CLR4_5_2j35j35m68iyj8c.R.iget(24766)==0&false))) {{
                            //Skip until end of prolog
                            __CLR4_5_2j35j35m68iyj8c.R.inc(24767);while ((((parser.hasNext())&&(__CLR4_5_2j35j35m68iyj8c.R.iget(24768)!=0|true))||(__CLR4_5_2j35j35m68iyj8c.R.iget(24769)==0&false))) {{
                                __CLR4_5_2j35j35m68iyj8c.R.inc(24770);DSCEvent e = parser.nextEvent();
                                __CLR4_5_2j35j35m68iyj8c.R.inc(24771);if ((((e.isDSCComment())&&(__CLR4_5_2j35j35m68iyj8c.R.iget(24772)!=0|true))||(__CLR4_5_2j35j35m68iyj8c.R.iget(24773)==0&false))) {{
                                    __CLR4_5_2j35j35m68iyj8c.R.inc(24774);if ((((DSCConstants.END_PROLOG.equals(
                                            e.asDSCComment().getName()))&&(__CLR4_5_2j35j35m68iyj8c.R.iget(24775)!=0|true))||(__CLR4_5_2j35j35m68iyj8c.R.iget(24776)==0&false))) {{
                                        __CLR4_5_2j35j35m68iyj8c.R.inc(24777);parser.next();
                                        __CLR4_5_2j35j35m68iyj8c.R.inc(24778);break;
                                    }
                                }}

                            }}
                        }}
                    }}
                }}finally{__CLR4_5_2j35j35m68iyj8c.R.flushNeeded();}}
            });

            //Listener for the language level
            __CLR4_5_2j35j35m68iyj8c.R.inc(24779);parser.addListener(new DSCListener() {
                public void processEvent(DSCEvent event, DSCParser parser)
                        throws IOException, DSCException {try{__CLR4_5_2j35j35m68iyj8c.R.inc(24780);
                    __CLR4_5_2j35j35m68iyj8c.R.inc(24781);if ((((event instanceof DSCCommentLanguageLevel)&&(__CLR4_5_2j35j35m68iyj8c.R.iget(24782)!=0|true))||(__CLR4_5_2j35j35m68iyj8c.R.iget(24783)==0&false))) {{
                        __CLR4_5_2j35j35m68iyj8c.R.inc(24784);DSCCommentLanguageLevel level = (DSCCommentLanguageLevel) event;
                        __CLR4_5_2j35j35m68iyj8c.R.inc(24785);results.put("level", level.getLanguageLevel());
                    }
                }}finally{__CLR4_5_2j35j35m68iyj8c.R.flushNeeded();}}
            });
            __CLR4_5_2j35j35m68iyj8c.R.inc(24786);int count = 0;
            __CLR4_5_2j35j35m68iyj8c.R.inc(24787);while ((((parser.hasNext())&&(__CLR4_5_2j35j35m68iyj8c.R.iget(24788)!=0|true))||(__CLR4_5_2j35j35m68iyj8c.R.iget(24789)==0&false))) {{
                __CLR4_5_2j35j35m68iyj8c.R.inc(24790);DSCEvent event = parser.nextEvent();
                __CLR4_5_2j35j35m68iyj8c.R.inc(24791);System.out.println(event);
                __CLR4_5_2j35j35m68iyj8c.R.inc(24792);count++;
            }
            }__CLR4_5_2j35j35m68iyj8c.R.inc(24793);assertEquals(12, count);
            __CLR4_5_2j35j35m68iyj8c.R.inc(24794);assertEquals(1, results.get("level"));
        } finally {
            __CLR4_5_2j35j35m68iyj8c.R.inc(24795);IOUtils.closeQuietly(in);
        }
    }finally{__CLR4_5_2j35j35m68iyj8c.R.flushNeeded();}}

}
