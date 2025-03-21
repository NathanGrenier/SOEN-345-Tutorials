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

/* $Id: UnparsedDSCComment.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.ps.dsc.events;

import java.io.IOException;

import org.apache.xmlgraphics.ps.PSGenerator;

/**
 * Represents a DSC comment that is not parsed into one of the concrete DSCComment subclasses.
 * It is used whenever a DSC comment is encountered that is unknown to the parser.
 * @see org.apache.xmlgraphics.ps.dsc.DSCCommentFactory
 */
public class UnparsedDSCComment extends AbstractEvent implements DSCComment {public static class __CLR4_5_2f27f27m6lb50u2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,19539,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String name;
    private String value;

    /**
     * Creates a new instance.
     * @param name the name of the DSC comment
     */
    public UnparsedDSCComment(String name) {try{__CLR4_5_2f27f27m6lb50u2.R.inc(19519);
        __CLR4_5_2f27f27m6lb50u2.R.inc(19520);this.name = name;
    }finally{__CLR4_5_2f27f27m6lb50u2.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCComment#getName()
     */
    public String getName() {try{__CLR4_5_2f27f27m6lb50u2.R.inc(19521);
        __CLR4_5_2f27f27m6lb50u2.R.inc(19522);return this.name;
    }finally{__CLR4_5_2f27f27m6lb50u2.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCComment#hasValues()
     */
    public boolean hasValues() {try{__CLR4_5_2f27f27m6lb50u2.R.inc(19523);
        __CLR4_5_2f27f27m6lb50u2.R.inc(19524);return value != null;
    }finally{__CLR4_5_2f27f27m6lb50u2.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCComment#isAtend()
     */
    public boolean isAtend() {try{__CLR4_5_2f27f27m6lb50u2.R.inc(19525);
        __CLR4_5_2f27f27m6lb50u2.R.inc(19526);return false;
    }finally{__CLR4_5_2f27f27m6lb50u2.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCComment#parseValue(java.lang.String)
     */
    public void parseValue(String value) {try{__CLR4_5_2f27f27m6lb50u2.R.inc(19527);
        __CLR4_5_2f27f27m6lb50u2.R.inc(19528);this.value = value;
    }finally{__CLR4_5_2f27f27m6lb50u2.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCEvent#generate(org.apache.xmlgraphics.ps.PSGenerator)
     */
    public void generate(PSGenerator gen) throws IOException {try{__CLR4_5_2f27f27m6lb50u2.R.inc(19529);
        __CLR4_5_2f27f27m6lb50u2.R.inc(19530);gen.writeln("%%" + name + ((((hasValues() )&&(__CLR4_5_2f27f27m6lb50u2.R.iget(19531)!=0|true))||(__CLR4_5_2f27f27m6lb50u2.R.iget(19532)==0&false))? ": " + value : ""));
    }finally{__CLR4_5_2f27f27m6lb50u2.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.AbstractEvent#isDSCComment()
     */
    public boolean isDSCComment() {try{__CLR4_5_2f27f27m6lb50u2.R.inc(19533);
        __CLR4_5_2f27f27m6lb50u2.R.inc(19534);return true;
    }finally{__CLR4_5_2f27f27m6lb50u2.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCEvent#getEventType()
     */
    public int getEventType() {try{__CLR4_5_2f27f27m6lb50u2.R.inc(19535);
        __CLR4_5_2f27f27m6lb50u2.R.inc(19536);return DSC_COMMENT;
    }finally{__CLR4_5_2f27f27m6lb50u2.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.AbstractEvent#asDSCComment()
     */
    public DSCComment asDSCComment() {try{__CLR4_5_2f27f27m6lb50u2.R.inc(19537);
        __CLR4_5_2f27f27m6lb50u2.R.inc(19538);return this;
    }finally{__CLR4_5_2f27f27m6lb50u2.R.flushNeeded();}}

}
