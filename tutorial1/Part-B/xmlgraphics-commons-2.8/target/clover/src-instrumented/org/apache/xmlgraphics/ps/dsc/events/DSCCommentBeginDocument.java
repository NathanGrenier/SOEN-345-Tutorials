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

/* $Id: DSCCommentBeginDocument.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.ps.dsc.events;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.PSResource;

/**
 * Represents a %BeginDocument DSC comment.
 */
public class DSCCommentBeginDocument extends AbstractDSCComment {public static class __CLR4_5_2eujeujm68iyi8p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,19291,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private PSResource resource;
    private Float version;
    private String type;

    /**
     * Creates a new instance
     */
    public DSCCommentBeginDocument() {
        super();__CLR4_5_2eujeujm68iyi8p.R.inc(19244);try{__CLR4_5_2eujeujm68iyi8p.R.inc(19243);
    }finally{__CLR4_5_2eujeujm68iyi8p.R.flushNeeded();}}

    /**
     * Creates a new instance for a given PSResource instance
     * @param resource the resource
     */
    public DSCCommentBeginDocument(PSResource resource) {try{__CLR4_5_2eujeujm68iyi8p.R.inc(19245);
        __CLR4_5_2eujeujm68iyi8p.R.inc(19246);this.resource = resource;
        __CLR4_5_2eujeujm68iyi8p.R.inc(19247);if ((((resource != null && !PSResource.TYPE_FILE.equals(resource.getType()))&&(__CLR4_5_2eujeujm68iyi8p.R.iget(19248)!=0|true))||(__CLR4_5_2eujeujm68iyi8p.R.iget(19249)==0&false))) {{
            __CLR4_5_2eujeujm68iyi8p.R.inc(19250);throw new IllegalArgumentException("Resource must be of type 'file'");
        }
    }}finally{__CLR4_5_2eujeujm68iyi8p.R.flushNeeded();}}

    /**
     * Creates a new instance for a given PSResource instance
     * @param resource the resource
     * @param version the version of the resource (or null)
     * @param type the type of resource (or null)
     */
    public DSCCommentBeginDocument(PSResource resource, Float version, String type) {
        this(resource);__CLR4_5_2eujeujm68iyi8p.R.inc(19252);try{__CLR4_5_2eujeujm68iyi8p.R.inc(19251);
        __CLR4_5_2eujeujm68iyi8p.R.inc(19253);this.version = version;
        __CLR4_5_2eujeujm68iyi8p.R.inc(19254);this.type = type;
    }finally{__CLR4_5_2eujeujm68iyi8p.R.flushNeeded();}}

    /**
     * Returns the resource version.
     * @return the resource version (or null if not applicable)
     */
    public Float getVersion() {try{__CLR4_5_2eujeujm68iyi8p.R.inc(19255);
        __CLR4_5_2eujeujm68iyi8p.R.inc(19256);return this.version;
    }finally{__CLR4_5_2eujeujm68iyi8p.R.flushNeeded();}}

    /**
     * Returns the resource type
     * @return the resource type (or null if not applicable)
     */
    public String getType() {try{__CLR4_5_2eujeujm68iyi8p.R.inc(19257);
        __CLR4_5_2eujeujm68iyi8p.R.inc(19258);return this.type;
    }finally{__CLR4_5_2eujeujm68iyi8p.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getName() {try{__CLR4_5_2eujeujm68iyi8p.R.inc(19259);
        __CLR4_5_2eujeujm68iyi8p.R.inc(19260);return DSCConstants.BEGIN_DOCUMENT;
    }finally{__CLR4_5_2eujeujm68iyi8p.R.flushNeeded();}}

    /**
     * Returns the associated PSResource.
     * @return the resource
     */
    public PSResource getResource() {try{__CLR4_5_2eujeujm68iyi8p.R.inc(19261);
        __CLR4_5_2eujeujm68iyi8p.R.inc(19262);return this.resource;
    }finally{__CLR4_5_2eujeujm68iyi8p.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean hasValues() {try{__CLR4_5_2eujeujm68iyi8p.R.inc(19263);
        __CLR4_5_2eujeujm68iyi8p.R.inc(19264);return true;
    }finally{__CLR4_5_2eujeujm68iyi8p.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void parseValue(String value) {try{__CLR4_5_2eujeujm68iyi8p.R.inc(19265);
        __CLR4_5_2eujeujm68iyi8p.R.inc(19266);List params = splitParams(value);
        __CLR4_5_2eujeujm68iyi8p.R.inc(19267);Iterator iter = params.iterator();
        __CLR4_5_2eujeujm68iyi8p.R.inc(19268);String name = (String)iter.next();
        __CLR4_5_2eujeujm68iyi8p.R.inc(19269);this.resource = new PSResource(PSResource.TYPE_FILE, name);
        __CLR4_5_2eujeujm68iyi8p.R.inc(19270);if ((((iter.hasNext())&&(__CLR4_5_2eujeujm68iyi8p.R.iget(19271)!=0|true))||(__CLR4_5_2eujeujm68iyi8p.R.iget(19272)==0&false))) {{
            __CLR4_5_2eujeujm68iyi8p.R.inc(19273);this.version = Float.valueOf(iter.next().toString());
            __CLR4_5_2eujeujm68iyi8p.R.inc(19274);this.type = null;
            __CLR4_5_2eujeujm68iyi8p.R.inc(19275);if ((((iter.hasNext())&&(__CLR4_5_2eujeujm68iyi8p.R.iget(19276)!=0|true))||(__CLR4_5_2eujeujm68iyi8p.R.iget(19277)==0&false))) {{
                __CLR4_5_2eujeujm68iyi8p.R.inc(19278);this.type = (String)iter.next();
            }
        }}
    }}finally{__CLR4_5_2eujeujm68iyi8p.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void generate(PSGenerator gen) throws IOException {try{__CLR4_5_2eujeujm68iyi8p.R.inc(19279);
        __CLR4_5_2eujeujm68iyi8p.R.inc(19280);List params = new java.util.ArrayList();
        __CLR4_5_2eujeujm68iyi8p.R.inc(19281);params.add(getResource().getName());
        __CLR4_5_2eujeujm68iyi8p.R.inc(19282);if ((((getVersion() != null)&&(__CLR4_5_2eujeujm68iyi8p.R.iget(19283)!=0|true))||(__CLR4_5_2eujeujm68iyi8p.R.iget(19284)==0&false))) {{
            __CLR4_5_2eujeujm68iyi8p.R.inc(19285);params.add(getVersion());
            __CLR4_5_2eujeujm68iyi8p.R.inc(19286);if ((((getType() != null)&&(__CLR4_5_2eujeujm68iyi8p.R.iget(19287)!=0|true))||(__CLR4_5_2eujeujm68iyi8p.R.iget(19288)==0&false))) {{
                __CLR4_5_2eujeujm68iyi8p.R.inc(19289);params.add(getType());
            }
        }}
        }__CLR4_5_2eujeujm68iyi8p.R.inc(19290);gen.writeDSCComment(getName(), params.toArray());
    }finally{__CLR4_5_2eujeujm68iyi8p.R.flushNeeded();}}

}
