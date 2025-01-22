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

/* $Id: AbstractResourceDSCComment.java 727407 2008-12-17 15:05:45Z jeremias $ */

package org.apache.xmlgraphics.ps.dsc.events;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.PSProcSet;
import org.apache.xmlgraphics.ps.PSResource;

/**
 * Abstract base class for resource comments.
 */
public abstract class AbstractResourceDSCComment extends AbstractDSCComment {public static class __CLR4_5_2eqheqhm68iyi82{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,19143,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private PSResource resource;

    /**
     * Creates a new instance
     */
    public AbstractResourceDSCComment() {try{__CLR4_5_2eqheqhm68iyi82.R.inc(19097);
    }finally{__CLR4_5_2eqheqhm68iyi82.R.flushNeeded();}}

    /**
     * Creates a new instance for a given PSResource instance
     * @param resource the resource
     */
    public AbstractResourceDSCComment(PSResource resource) {try{__CLR4_5_2eqheqhm68iyi82.R.inc(19098);
        __CLR4_5_2eqheqhm68iyi82.R.inc(19099);this.resource = resource;
    }finally{__CLR4_5_2eqheqhm68iyi82.R.flushNeeded();}}

    /**
     * Returns the associated PSResource.
     * @return the resource
     */
    public PSResource getResource() {try{__CLR4_5_2eqheqhm68iyi82.R.inc(19100);
        __CLR4_5_2eqheqhm68iyi82.R.inc(19101);return this.resource;
    }finally{__CLR4_5_2eqheqhm68iyi82.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean hasValues() {try{__CLR4_5_2eqheqhm68iyi82.R.inc(19102);
        __CLR4_5_2eqheqhm68iyi82.R.inc(19103);return true;
    }finally{__CLR4_5_2eqheqhm68iyi82.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void parseValue(String value) {try{__CLR4_5_2eqheqhm68iyi82.R.inc(19104);
        __CLR4_5_2eqheqhm68iyi82.R.inc(19105);List params = splitParams(value);
        __CLR4_5_2eqheqhm68iyi82.R.inc(19106);Iterator iter = params.iterator();
        __CLR4_5_2eqheqhm68iyi82.R.inc(19107);String name = (String)iter.next();
        __CLR4_5_2eqheqhm68iyi82.R.inc(19108);if ((((PSResource.TYPE_FONT.equals(name))&&(__CLR4_5_2eqheqhm68iyi82.R.iget(19109)!=0|true))||(__CLR4_5_2eqheqhm68iyi82.R.iget(19110)==0&false))) {{
            __CLR4_5_2eqheqhm68iyi82.R.inc(19111);String fontname = (String)iter.next();
            __CLR4_5_2eqheqhm68iyi82.R.inc(19112);this.resource = new PSResource(name, fontname);
        } }else {__CLR4_5_2eqheqhm68iyi82.R.inc(19113);if ((((PSResource.TYPE_PROCSET.equals(name))&&(__CLR4_5_2eqheqhm68iyi82.R.iget(19114)!=0|true))||(__CLR4_5_2eqheqhm68iyi82.R.iget(19115)==0&false))) {{
            __CLR4_5_2eqheqhm68iyi82.R.inc(19116);String procname = (String)iter.next();
            __CLR4_5_2eqheqhm68iyi82.R.inc(19117);String version = (String)iter.next();
            __CLR4_5_2eqheqhm68iyi82.R.inc(19118);String revision = (String)iter.next();
            __CLR4_5_2eqheqhm68iyi82.R.inc(19119);this.resource = new PSProcSet(procname,
                    Float.parseFloat(version), Integer.parseInt(revision));
        } }else {__CLR4_5_2eqheqhm68iyi82.R.inc(19120);if ((((PSResource.TYPE_FILE.equals(name))&&(__CLR4_5_2eqheqhm68iyi82.R.iget(19121)!=0|true))||(__CLR4_5_2eqheqhm68iyi82.R.iget(19122)==0&false))) {{
            __CLR4_5_2eqheqhm68iyi82.R.inc(19123);String filename = (String)iter.next();
            __CLR4_5_2eqheqhm68iyi82.R.inc(19124);this.resource = new PSResource(name, filename);
        } }else {__CLR4_5_2eqheqhm68iyi82.R.inc(19125);if ((((PSResource.TYPE_FORM.equals(name))&&(__CLR4_5_2eqheqhm68iyi82.R.iget(19126)!=0|true))||(__CLR4_5_2eqheqhm68iyi82.R.iget(19127)==0&false))) {{
            __CLR4_5_2eqheqhm68iyi82.R.inc(19128);String formname = (String)iter.next();
            __CLR4_5_2eqheqhm68iyi82.R.inc(19129);this.resource = new PSResource(name, formname);
        } }else {__CLR4_5_2eqheqhm68iyi82.R.inc(19130);if ((((PSResource.TYPE_PATTERN.equals(name))&&(__CLR4_5_2eqheqhm68iyi82.R.iget(19131)!=0|true))||(__CLR4_5_2eqheqhm68iyi82.R.iget(19132)==0&false))) {{
            __CLR4_5_2eqheqhm68iyi82.R.inc(19133);String patternname = (String)iter.next();
            __CLR4_5_2eqheqhm68iyi82.R.inc(19134);this.resource = new PSResource(name, patternname);
        } }else {__CLR4_5_2eqheqhm68iyi82.R.inc(19135);if ((((PSResource.TYPE_ENCODING.equals(name))&&(__CLR4_5_2eqheqhm68iyi82.R.iget(19136)!=0|true))||(__CLR4_5_2eqheqhm68iyi82.R.iget(19137)==0&false))) {{
            __CLR4_5_2eqheqhm68iyi82.R.inc(19138);String encodingname = (String)iter.next();
            __CLR4_5_2eqheqhm68iyi82.R.inc(19139);this.resource = new PSResource(name, encodingname);
        } }else {{
            __CLR4_5_2eqheqhm68iyi82.R.inc(19140);throw new IllegalArgumentException("Invalid resource type: " + name);
        }
    }}}}}}}finally{__CLR4_5_2eqheqhm68iyi82.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void generate(PSGenerator gen) throws IOException {try{__CLR4_5_2eqheqhm68iyi82.R.inc(19141);
        __CLR4_5_2eqheqhm68iyi82.R.inc(19142);gen.writeDSCComment(getName(), getResource());
    }finally{__CLR4_5_2eqheqhm68iyi82.R.flushNeeded();}}

}
