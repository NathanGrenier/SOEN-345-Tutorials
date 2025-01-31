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

/* $Id: DSCTools.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.ps.dsc.tools;

import java.io.IOException;

import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.dsc.DSCException;
import org.apache.xmlgraphics.ps.dsc.DSCParser;
import org.apache.xmlgraphics.ps.dsc.DSCParserConstants;
import org.apache.xmlgraphics.ps.dsc.events.DSCComment;
import org.apache.xmlgraphics.ps.dsc.events.DSCEvent;
import org.apache.xmlgraphics.ps.dsc.events.DSCHeaderComment;
import org.apache.xmlgraphics.ps.dsc.events.PostScriptComment;

/**
 * Helper methods commonly used when dealing with DSC-compliant PostScript files.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class DSCTools implements DSCParserConstants {public static class __CLR4_5_2f2rf2rm6lb50ue{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,19599,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DSCTools() {try{__CLR4_5_2f2rf2rm6lb50ue.R.inc(19539);
    }finally{__CLR4_5_2f2rf2rm6lb50ue.R.flushNeeded();}}

    /**
     * Indicates whether the given event ends a header comment section according to the rules in
     * DSC 3.0, chapter 4.4.
     * @param event the event to check
     * @return true if a header comment section would be ended either explicitely or implicitely
     *              by the given event
     */
    public static boolean headerCommentsEndHere(DSCEvent event) {try{__CLR4_5_2f2rf2rm6lb50ue.R.inc(19540);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2f2rf2rm6lb50ue.R.inc(19541);switch (event.getEventType()) {
        case DSC_COMMENT:if (!__CLB4_5_2_bool0) {__CLR4_5_2f2rf2rm6lb50ue.R.inc(19542);__CLB4_5_2_bool0=true;}
            __CLR4_5_2f2rf2rm6lb50ue.R.inc(19543);DSCComment comment = event.asDSCComment();
            __CLR4_5_2f2rf2rm6lb50ue.R.inc(19544);return (comment.getName().equals(DSCConstants.END_COMMENTS));
        case COMMENT:if (!__CLB4_5_2_bool0) {__CLR4_5_2f2rf2rm6lb50ue.R.inc(19545);__CLB4_5_2_bool0=true;}
            assert (((event instanceof PostScriptComment)&&(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19546)!=0|true))||(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19547)==0&false));
            __CLR4_5_2f2rf2rm6lb50ue.R.inc(19548);String s = ((PostScriptComment)event).getComment();
            __CLR4_5_2f2rf2rm6lb50ue.R.inc(19549);if ((((s == null || s.length() == 0)&&(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19550)!=0|true))||(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19551)==0&false))) {{
                __CLR4_5_2f2rf2rm6lb50ue.R.inc(19552);return true;
            } }else {{
                __CLR4_5_2f2rf2rm6lb50ue.R.inc(19553);char c = s.charAt(0);
                __CLR4_5_2f2rf2rm6lb50ue.R.inc(19554);return ("\n\t ".indexOf(c) >= 0);
            }
        }default:if (!__CLB4_5_2_bool0) {__CLR4_5_2f2rf2rm6lb50ue.R.inc(19555);__CLB4_5_2_bool0=true;}
            __CLR4_5_2f2rf2rm6lb50ue.R.inc(19556);return true;
        }
    }finally{__CLR4_5_2f2rf2rm6lb50ue.R.flushNeeded();}}

    /**
     * Verifies that the file being parsed is a DSC 3.0 file.
     * @param parser the DSC parser
     * @return the header comment event
     * @throws DSCException In case of a violation of the DSC spec
     * @throws IOException In case of an I/O problem
     */
    public static DSCHeaderComment checkAndSkipDSC30Header(DSCParser parser)
                throws DSCException, IOException {try{__CLR4_5_2f2rf2rm6lb50ue.R.inc(19557);
        __CLR4_5_2f2rf2rm6lb50ue.R.inc(19558);if ((((!parser.hasNext())&&(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19559)!=0|true))||(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19560)==0&false))) {{
            __CLR4_5_2f2rf2rm6lb50ue.R.inc(19561);throw new DSCException("File has no content");
        }
        }__CLR4_5_2f2rf2rm6lb50ue.R.inc(19562);DSCEvent event = parser.nextEvent();
        __CLR4_5_2f2rf2rm6lb50ue.R.inc(19563);if ((((event.getEventType() == HEADER_COMMENT)&&(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19564)!=0|true))||(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19565)==0&false))) {{
            __CLR4_5_2f2rf2rm6lb50ue.R.inc(19566);DSCHeaderComment header = (DSCHeaderComment)event;
            __CLR4_5_2f2rf2rm6lb50ue.R.inc(19567);if ((((!header.isPSAdobe30())&&(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19568)!=0|true))||(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19569)==0&false))) {{
                __CLR4_5_2f2rf2rm6lb50ue.R.inc(19570);throw new DSCException("PostScript file does not start with '"
                        + DSCConstants.PS_ADOBE_30 + "'");
            }
            }__CLR4_5_2f2rf2rm6lb50ue.R.inc(19571);return header;
        } }else {{
            __CLR4_5_2f2rf2rm6lb50ue.R.inc(19572);throw new DSCException("PostScript file does not start with '"
                    + DSCConstants.PS_ADOBE_30 + "'");
        }
    }}finally{__CLR4_5_2f2rf2rm6lb50ue.R.flushNeeded();}}

    /**
     * Advances the parser to the next page or to the trailer or the end of file comment.
     * @param parser the DSC parser
     * @param gen the PSGenerator instance to pass the skipped events through to
     * @return the DSC comment found (Page, Trailer or EOF)
     * @throws IOException In case of an I/O error
     * @throws DSCException In case of a violation of the DSC spec
     */
    public static DSCComment nextPageOrTrailer(DSCParser parser, PSGenerator gen)
                throws IOException, DSCException {try{__CLR4_5_2f2rf2rm6lb50ue.R.inc(19573);
        __CLR4_5_2f2rf2rm6lb50ue.R.inc(19574);while ((((parser.hasNext())&&(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19575)!=0|true))||(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19576)==0&false))) {{
            __CLR4_5_2f2rf2rm6lb50ue.R.inc(19577);DSCEvent event = parser.nextEvent();
            __CLR4_5_2f2rf2rm6lb50ue.R.inc(19578);if ((((event.getEventType() == DSC_COMMENT)&&(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19579)!=0|true))||(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19580)==0&false))) {{
                __CLR4_5_2f2rf2rm6lb50ue.R.inc(19581);DSCComment comment = event.asDSCComment();
                __CLR4_5_2f2rf2rm6lb50ue.R.inc(19582);if ((((DSCConstants.PAGE.equals(comment.getName()))&&(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19583)!=0|true))||(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19584)==0&false))) {{
                    __CLR4_5_2f2rf2rm6lb50ue.R.inc(19585);return comment;
                } }else {__CLR4_5_2f2rf2rm6lb50ue.R.inc(19586);if ((((DSCConstants.TRAILER.equals(comment.getName()))&&(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19587)!=0|true))||(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19588)==0&false))) {{
                    __CLR4_5_2f2rf2rm6lb50ue.R.inc(19589);return comment;
                }
            }}} }else {__CLR4_5_2f2rf2rm6lb50ue.R.inc(19590);if ((((event.getEventType() == EOF)&&(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19591)!=0|true))||(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19592)==0&false))) {{
                //The Trailer may be missing
                __CLR4_5_2f2rf2rm6lb50ue.R.inc(19593);return event.asDSCComment();
            }
            }}__CLR4_5_2f2rf2rm6lb50ue.R.inc(19594);if ((((gen != null)&&(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19595)!=0|true))||(__CLR4_5_2f2rf2rm6lb50ue.R.iget(19596)==0&false))) {{
                __CLR4_5_2f2rf2rm6lb50ue.R.inc(19597);event.generate(gen); //Pipe through to PSGenerator
            }
        }}
        }__CLR4_5_2f2rf2rm6lb50ue.R.inc(19598);return null;
    }finally{__CLR4_5_2f2rf2rm6lb50ue.R.flushNeeded();}}

}
