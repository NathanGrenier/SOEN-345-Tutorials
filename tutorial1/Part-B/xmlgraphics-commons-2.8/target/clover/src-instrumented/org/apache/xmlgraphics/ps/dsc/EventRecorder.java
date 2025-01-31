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

/* $Id: EventRecorder.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.ps.dsc;

import java.io.IOException;
import java.util.List;

import org.apache.xmlgraphics.ps.dsc.events.DSCComment;

/**
 * DSCHandler implementation that records DSC events.
 */
public class EventRecorder implements DSCHandler {public static class __CLR4_5_2ej1ej1m6lb50pn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,18862,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private List events = new java.util.ArrayList();

    /**
     * Replays the recorded events to a specified DSCHandler instance.
     * @param handler the DSCHandler to send the recorded events to
     * @throws IOException In case of an I/O error
     */
    public void replay(DSCHandler handler) throws IOException {try{__CLR4_5_2ej1ej1m6lb50pn.R.inc(18829);
        __CLR4_5_2ej1ej1m6lb50pn.R.inc(18830);for (Object obj : events) {{
            __CLR4_5_2ej1ej1m6lb50pn.R.inc(18831);if ((((obj instanceof PSLine)&&(__CLR4_5_2ej1ej1m6lb50pn.R.iget(18832)!=0|true))||(__CLR4_5_2ej1ej1m6lb50pn.R.iget(18833)==0&false))) {{
                __CLR4_5_2ej1ej1m6lb50pn.R.inc(18834);handler.line(((PSLine) obj).getLine());
            } }else {__CLR4_5_2ej1ej1m6lb50pn.R.inc(18835);if ((((obj instanceof PSComment)&&(__CLR4_5_2ej1ej1m6lb50pn.R.iget(18836)!=0|true))||(__CLR4_5_2ej1ej1m6lb50pn.R.iget(18837)==0&false))) {{
                __CLR4_5_2ej1ej1m6lb50pn.R.inc(18838);handler.comment(((PSComment) obj).getComment());
            } }else {__CLR4_5_2ej1ej1m6lb50pn.R.inc(18839);if ((((obj instanceof DSCComment)&&(__CLR4_5_2ej1ej1m6lb50pn.R.iget(18840)!=0|true))||(__CLR4_5_2ej1ej1m6lb50pn.R.iget(18841)==0&false))) {{
                __CLR4_5_2ej1ej1m6lb50pn.R.inc(18842);handler.handleDSCComment((DSCComment) obj);
            } }else {{
                __CLR4_5_2ej1ej1m6lb50pn.R.inc(18843);throw new IllegalStateException("Unsupported class type");
            }
        }}}}
    }}finally{__CLR4_5_2ej1ej1m6lb50pn.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.DSCHandler#comment(java.lang.String)
     */
    public void comment(String comment) throws IOException {try{__CLR4_5_2ej1ej1m6lb50pn.R.inc(18844);
        __CLR4_5_2ej1ej1m6lb50pn.R.inc(18845);events.add(new PSComment(comment));
    }finally{__CLR4_5_2ej1ej1m6lb50pn.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.DSCHandler#handleDSCComment(
     *          org.apache.xmlgraphics.ps.dsc.events.DSCComment)
     */
    public void handleDSCComment(DSCComment comment) throws IOException {try{__CLR4_5_2ej1ej1m6lb50pn.R.inc(18846);
        __CLR4_5_2ej1ej1m6lb50pn.R.inc(18847);events.add(comment);
    }finally{__CLR4_5_2ej1ej1m6lb50pn.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.DSCHandler#line(java.lang.String)
     */
    public void line(String line) throws IOException {try{__CLR4_5_2ej1ej1m6lb50pn.R.inc(18848);
        __CLR4_5_2ej1ej1m6lb50pn.R.inc(18849);events.add(new PSLine(line));
    }finally{__CLR4_5_2ej1ej1m6lb50pn.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.DSCHandler#startDocument(java.lang.String)
     */
    public void startDocument(String header) throws IOException {try{__CLR4_5_2ej1ej1m6lb50pn.R.inc(18850);
        __CLR4_5_2ej1ej1m6lb50pn.R.inc(18851);throw new UnsupportedOperationException(
                getClass().getName() + " is only used to handle parts of a document");
    }finally{__CLR4_5_2ej1ej1m6lb50pn.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.DSCHandler#endDocument()
     */
    public void endDocument() throws IOException {try{__CLR4_5_2ej1ej1m6lb50pn.R.inc(18852);
        __CLR4_5_2ej1ej1m6lb50pn.R.inc(18853);throw new UnsupportedOperationException(
                getClass().getName() + " is only used to handle parts of a document");
    }finally{__CLR4_5_2ej1ej1m6lb50pn.R.flushNeeded();}}

    private static class PSComment {

        private String comment;

        public PSComment(String comment) {try{__CLR4_5_2ej1ej1m6lb50pn.R.inc(18854);
            __CLR4_5_2ej1ej1m6lb50pn.R.inc(18855);this.comment = comment;
        }finally{__CLR4_5_2ej1ej1m6lb50pn.R.flushNeeded();}}

        public String getComment() {try{__CLR4_5_2ej1ej1m6lb50pn.R.inc(18856);
            __CLR4_5_2ej1ej1m6lb50pn.R.inc(18857);return this.comment;
        }finally{__CLR4_5_2ej1ej1m6lb50pn.R.flushNeeded();}}
    }

    private static class PSLine {

        private String line;

        public PSLine(String line) {try{__CLR4_5_2ej1ej1m6lb50pn.R.inc(18858);
            __CLR4_5_2ej1ej1m6lb50pn.R.inc(18859);this.line = line;
        }finally{__CLR4_5_2ej1ej1m6lb50pn.R.flushNeeded();}}

        public String getLine() {try{__CLR4_5_2ej1ej1m6lb50pn.R.inc(18860);
            __CLR4_5_2ej1ej1m6lb50pn.R.inc(18861);return this.line;
        }finally{__CLR4_5_2ej1ej1m6lb50pn.R.flushNeeded();}}
    }

}
