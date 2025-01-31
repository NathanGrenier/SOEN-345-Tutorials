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

/* $Id: PageExtractor.java 1345683 2012-06-03 14:50:33Z gadams $ */

package org.apache.xmlgraphics.ps.dsc.tools;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.dsc.DSCException;
import org.apache.xmlgraphics.ps.dsc.DSCFilter;
import org.apache.xmlgraphics.ps.dsc.DSCParser;
import org.apache.xmlgraphics.ps.dsc.DSCParserConstants;
import org.apache.xmlgraphics.ps.dsc.DefaultNestedDocumentHandler;
import org.apache.xmlgraphics.ps.dsc.events.DSCComment;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentPage;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentPages;
import org.apache.xmlgraphics.ps.dsc.events.DSCEvent;
import org.apache.xmlgraphics.ps.dsc.events.DSCHeaderComment;

/**
 * This class can extract a certain range of pages from a DSC-compliant PostScript file.
 */
public final class PageExtractor implements DSCParserConstants {public static class __CLR4_5_2f4ff4fm6lb50uq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,19656,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private PageExtractor() {try{__CLR4_5_2f4ff4fm6lb50uq.R.inc(19599);
    }finally{__CLR4_5_2f4ff4fm6lb50uq.R.flushNeeded();}}

    /**
     * Parses a DSC-compliant file and pipes the content through to the OutputStream omitting
     * all pages not within the range.
     * @param in the InputStream to parse from
     * @param out the OutputStream to write the modified file to
     * @param from the starting page (1-based)
     * @param to the last page (inclusive, 1-based)
     * @throws IOException In case of an I/O error
     * @throws DSCException In case of a violation of the DSC spec
     */
    public static void extractPages(InputStream in, OutputStream out, int from, int to)
                throws IOException, DSCException {try{__CLR4_5_2f4ff4fm6lb50uq.R.inc(19600);
        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19601);if ((((from <= 0)&&(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19602)!=0|true))||(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19603)==0&false))) {{
            __CLR4_5_2f4ff4fm6lb50uq.R.inc(19604);throw new IllegalArgumentException("'from' page number must be 1 or higher");
        }
        }__CLR4_5_2f4ff4fm6lb50uq.R.inc(19605);if ((((to < from)&&(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19606)!=0|true))||(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19607)==0&false))) {{
            __CLR4_5_2f4ff4fm6lb50uq.R.inc(19608);throw new IllegalArgumentException(
                    "'to' page number must be equal or larger than the 'from' page number");
        }

        }__CLR4_5_2f4ff4fm6lb50uq.R.inc(19609);DSCParser parser = new DSCParser(in);
        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19610);PSGenerator gen = new PSGenerator(out);
        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19611);parser.addListener(new DefaultNestedDocumentHandler(gen));
        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19612);int pageCount = 0;

        //Skip DSC header
        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19613);DSCHeaderComment header = DSCTools.checkAndSkipDSC30Header(parser);
        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19614);header.generate(gen);
        //Set number of pages
        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19615);DSCCommentPages pages = new DSCCommentPages(to - from + 1);
        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19616);pages.generate(gen);

        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19617);parser.setFilter(new DSCFilter() {
            public boolean accept(DSCEvent event) {try{__CLR4_5_2f4ff4fm6lb50uq.R.inc(19618);
                __CLR4_5_2f4ff4fm6lb50uq.R.inc(19619);if ((((event.isDSCComment())&&(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19620)!=0|true))||(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19621)==0&false))) {{
                    //Filter %%Pages which we add manually above
                    __CLR4_5_2f4ff4fm6lb50uq.R.inc(19622);return !event.asDSCComment().getName().equals(DSCConstants.PAGES);
                } }else {{
                    __CLR4_5_2f4ff4fm6lb50uq.R.inc(19623);return true;
                }
            }}finally{__CLR4_5_2f4ff4fm6lb50uq.R.flushNeeded();}}
        });

        //Skip the prolog and to the first page
        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19624);DSCComment pageOrTrailer = parser.nextDSCComment(DSCConstants.PAGE, gen);
        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19625);if ((((pageOrTrailer == null)&&(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19626)!=0|true))||(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19627)==0&false))) {{
            __CLR4_5_2f4ff4fm6lb50uq.R.inc(19628);throw new DSCException("Page expected, but none found");
        }
        }__CLR4_5_2f4ff4fm6lb50uq.R.inc(19629);parser.setFilter(null); //Remove filter

        //Process individual pages (and skip as necessary)
        __CLR4_5_2f4ff4fm6lb50uq.R.inc(19630);while (true) {{
            __CLR4_5_2f4ff4fm6lb50uq.R.inc(19631);DSCCommentPage page = (DSCCommentPage)pageOrTrailer;
            __CLR4_5_2f4ff4fm6lb50uq.R.inc(19632);boolean validPage = (page.getPagePosition() >= from && page.getPagePosition() <= to);
            __CLR4_5_2f4ff4fm6lb50uq.R.inc(19633);if ((((validPage)&&(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19634)!=0|true))||(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19635)==0&false))) {{
                __CLR4_5_2f4ff4fm6lb50uq.R.inc(19636);page.setPagePosition(page.getPagePosition() - from + 1);
                __CLR4_5_2f4ff4fm6lb50uq.R.inc(19637);page.generate(gen);
                __CLR4_5_2f4ff4fm6lb50uq.R.inc(19638);pageCount++;
            }
            }__CLR4_5_2f4ff4fm6lb50uq.R.inc(19639);pageOrTrailer = DSCTools.nextPageOrTrailer(parser, ((((validPage )&&(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19640)!=0|true))||(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19641)==0&false))? gen : null));
            __CLR4_5_2f4ff4fm6lb50uq.R.inc(19642);if ((((pageOrTrailer == null)&&(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19643)!=0|true))||(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19644)==0&false))) {{
                __CLR4_5_2f4ff4fm6lb50uq.R.inc(19645);throw new DSCException("File is not DSC-compliant: Unexpected end of file");
            } }else {__CLR4_5_2f4ff4fm6lb50uq.R.inc(19646);if ((((!DSCConstants.PAGE.equals(pageOrTrailer.getName()))&&(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19647)!=0|true))||(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19648)==0&false))) {{
                __CLR4_5_2f4ff4fm6lb50uq.R.inc(19649);pageOrTrailer.generate(gen);
                __CLR4_5_2f4ff4fm6lb50uq.R.inc(19650);break;
            }
        }}}

        //Write the rest
        }__CLR4_5_2f4ff4fm6lb50uq.R.inc(19651);while ((((parser.hasNext())&&(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19652)!=0|true))||(__CLR4_5_2f4ff4fm6lb50uq.R.iget(19653)==0&false))) {{
            __CLR4_5_2f4ff4fm6lb50uq.R.inc(19654);DSCEvent event = parser.nextEvent();
            __CLR4_5_2f4ff4fm6lb50uq.R.inc(19655);event.generate(gen);
        }
    }}finally{__CLR4_5_2f4ff4fm6lb50uq.R.flushNeeded();}}

}
