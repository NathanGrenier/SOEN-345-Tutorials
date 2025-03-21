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

/* $Id: DefaultNestedDocumentHandler.java 1614048 2014-07-28 15:16:47Z vhennebert $ */

package org.apache.xmlgraphics.ps.dsc;

import java.io.IOException;

import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.dsc.events.DSCComment;
import org.apache.xmlgraphics.ps.dsc.events.DSCEvent;

/**
 * {@link DSCListener} implementation which automatically skips data
 * between Begin/EndDocument and Begin/EndData.
 */
public class DefaultNestedDocumentHandler implements DSCParserConstants,
        NestedDocumentHandler, DSCListener {public static class __CLR4_5_2ehkehkm6lb50pd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,18829,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private PSGenerator gen;

    /**
     * Creates a new instance.
     * @param gen PSGenerator to pass through the skipped content
     */
    public DefaultNestedDocumentHandler(PSGenerator gen) {try{__CLR4_5_2ehkehkm6lb50pd.R.inc(18776);
        __CLR4_5_2ehkehkm6lb50pd.R.inc(18777);this.gen = gen;
    }finally{__CLR4_5_2ehkehkm6lb50pd.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void handle(DSCEvent event, DSCParser parser) throws IOException, DSCException {try{__CLR4_5_2ehkehkm6lb50pd.R.inc(18778);
        __CLR4_5_2ehkehkm6lb50pd.R.inc(18779);processEvent(event, parser);
    }finally{__CLR4_5_2ehkehkm6lb50pd.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void processEvent(DSCEvent event, DSCParser parser) throws IOException, DSCException {try{__CLR4_5_2ehkehkm6lb50pd.R.inc(18780);
        __CLR4_5_2ehkehkm6lb50pd.R.inc(18781);if ((((event.isDSCComment())&&(__CLR4_5_2ehkehkm6lb50pd.R.iget(18782)!=0|true))||(__CLR4_5_2ehkehkm6lb50pd.R.iget(18783)==0&false))) {{
            __CLR4_5_2ehkehkm6lb50pd.R.inc(18784);DSCComment comment = event.asDSCComment();
            __CLR4_5_2ehkehkm6lb50pd.R.inc(18785);if ((((DSCConstants.BEGIN_DOCUMENT.equals(comment.getName()))&&(__CLR4_5_2ehkehkm6lb50pd.R.iget(18786)!=0|true))||(__CLR4_5_2ehkehkm6lb50pd.R.iget(18787)==0&false))) {{
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18788);if ((((gen != null)&&(__CLR4_5_2ehkehkm6lb50pd.R.iget(18789)!=0|true))||(__CLR4_5_2ehkehkm6lb50pd.R.iget(18790)==0&false))) {{
                    __CLR4_5_2ehkehkm6lb50pd.R.inc(18791);comment.generate(gen);
                }
                }__CLR4_5_2ehkehkm6lb50pd.R.inc(18792);boolean checkEOF = parser.isCheckEOF();
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18793);parser.setCheckEOF(false);
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18794);parser.setListenersDisabled(true);
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18795);comment = parser.nextDSCComment(DSCConstants.END_DOCUMENT, gen);
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18796);if ((((comment == null)&&(__CLR4_5_2ehkehkm6lb50pd.R.iget(18797)!=0|true))||(__CLR4_5_2ehkehkm6lb50pd.R.iget(18798)==0&false))) {{
                    __CLR4_5_2ehkehkm6lb50pd.R.inc(18799);throw new DSCException("File is not DSC-compliant: Didn't find an "
                            + DSCConstants.END_DOCUMENT);
                }
                }__CLR4_5_2ehkehkm6lb50pd.R.inc(18800);if ((((gen != null)&&(__CLR4_5_2ehkehkm6lb50pd.R.iget(18801)!=0|true))||(__CLR4_5_2ehkehkm6lb50pd.R.iget(18802)==0&false))) {{
                    __CLR4_5_2ehkehkm6lb50pd.R.inc(18803);comment.generate(gen);
                }
                }__CLR4_5_2ehkehkm6lb50pd.R.inc(18804);parser.setCheckEOF(checkEOF);
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18805);parser.setListenersDisabled(false);
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18806);parser.next();
            } }else {__CLR4_5_2ehkehkm6lb50pd.R.inc(18807);if ((((DSCConstants.BEGIN_DATA.equals(comment.getName()))&&(__CLR4_5_2ehkehkm6lb50pd.R.iget(18808)!=0|true))||(__CLR4_5_2ehkehkm6lb50pd.R.iget(18809)==0&false))) {{
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18810);if ((((gen != null)&&(__CLR4_5_2ehkehkm6lb50pd.R.iget(18811)!=0|true))||(__CLR4_5_2ehkehkm6lb50pd.R.iget(18812)==0&false))) {{
                    __CLR4_5_2ehkehkm6lb50pd.R.inc(18813);comment.generate(gen);
                }
                }__CLR4_5_2ehkehkm6lb50pd.R.inc(18814);boolean checkEOF = parser.isCheckEOF();
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18815);parser.setCheckEOF(false);
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18816);parser.setListenersDisabled(true);
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18817);comment = parser.nextDSCComment(DSCConstants.END_DATA, gen);
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18818);if ((((comment == null)&&(__CLR4_5_2ehkehkm6lb50pd.R.iget(18819)!=0|true))||(__CLR4_5_2ehkehkm6lb50pd.R.iget(18820)==0&false))) {{
                    __CLR4_5_2ehkehkm6lb50pd.R.inc(18821);throw new DSCException("File is not DSC-compliant: Didn't find an "
                            + DSCConstants.END_DATA);
                }
                }__CLR4_5_2ehkehkm6lb50pd.R.inc(18822);if ((((gen != null)&&(__CLR4_5_2ehkehkm6lb50pd.R.iget(18823)!=0|true))||(__CLR4_5_2ehkehkm6lb50pd.R.iget(18824)==0&false))) {{
                    __CLR4_5_2ehkehkm6lb50pd.R.inc(18825);comment.generate(gen);
                }
                }__CLR4_5_2ehkehkm6lb50pd.R.inc(18826);parser.setCheckEOF(checkEOF);
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18827);parser.setListenersDisabled(false);
                __CLR4_5_2ehkehkm6lb50pd.R.inc(18828);parser.next();
            }
        }}}
    }}finally{__CLR4_5_2ehkehkm6lb50pd.R.flushNeeded();}}

}
