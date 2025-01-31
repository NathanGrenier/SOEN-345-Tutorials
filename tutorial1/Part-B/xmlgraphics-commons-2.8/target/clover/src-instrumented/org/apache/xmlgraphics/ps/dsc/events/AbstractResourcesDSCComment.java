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

/* $Id: AbstractResourcesDSCComment.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.ps.dsc.events;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.PSProcSet;
import org.apache.xmlgraphics.ps.PSResource;

/**
 * Abstract base class for Resource DSC comments (DocumentNeededResources,
 * DocumentSuppliedResources and PageResources).
 */
public abstract class AbstractResourcesDSCComment extends AbstractDSCComment {public static class __CLR4_5_2errerrm6lb50rm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,19230,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Set resources;

    /**
     * Creates a new instance.
     */
    public AbstractResourcesDSCComment() {
        super();__CLR4_5_2errerrm6lb50rm.R.inc(19144);try{__CLR4_5_2errerrm6lb50rm.R.inc(19143);
    }finally{__CLR4_5_2errerrm6lb50rm.R.flushNeeded();}}

    /**
     * Creates a new instance.
     * @param resources a Collection of PSResource instances
     */
    public AbstractResourcesDSCComment(Collection resources) {try{__CLR4_5_2errerrm6lb50rm.R.inc(19145);
        __CLR4_5_2errerrm6lb50rm.R.inc(19146);addResources(resources);
    }finally{__CLR4_5_2errerrm6lb50rm.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean hasValues() {try{__CLR4_5_2errerrm6lb50rm.R.inc(19147);
        __CLR4_5_2errerrm6lb50rm.R.inc(19148);return true;
    }finally{__CLR4_5_2errerrm6lb50rm.R.flushNeeded();}}

    private void prepareResourceSet() {try{__CLR4_5_2errerrm6lb50rm.R.inc(19149);
        __CLR4_5_2errerrm6lb50rm.R.inc(19150);if ((((this.resources == null)&&(__CLR4_5_2errerrm6lb50rm.R.iget(19151)!=0|true))||(__CLR4_5_2errerrm6lb50rm.R.iget(19152)==0&false))) {{
            __CLR4_5_2errerrm6lb50rm.R.inc(19153);this.resources = new java.util.TreeSet();
        }
    }}finally{__CLR4_5_2errerrm6lb50rm.R.flushNeeded();}}

    /**
     * Adds a new resource.
     * @param res the resource
     */
    public void addResource(PSResource res) {try{__CLR4_5_2errerrm6lb50rm.R.inc(19154);
        __CLR4_5_2errerrm6lb50rm.R.inc(19155);prepareResourceSet();
        __CLR4_5_2errerrm6lb50rm.R.inc(19156);this.resources.add(res);
    }finally{__CLR4_5_2errerrm6lb50rm.R.flushNeeded();}}

    /**
     * Adds a collection of resources.
     * @param resources a Collection of PSResource instances.
     */
    public void addResources(Collection resources) {try{__CLR4_5_2errerrm6lb50rm.R.inc(19157);
        __CLR4_5_2errerrm6lb50rm.R.inc(19158);if ((((resources != null)&&(__CLR4_5_2errerrm6lb50rm.R.iget(19159)!=0|true))||(__CLR4_5_2errerrm6lb50rm.R.iget(19160)==0&false))) {{
            __CLR4_5_2errerrm6lb50rm.R.inc(19161);prepareResourceSet();
            __CLR4_5_2errerrm6lb50rm.R.inc(19162);this.resources.addAll(resources);
        }
    }}finally{__CLR4_5_2errerrm6lb50rm.R.flushNeeded();}}

    /**
     * Returns the set of resources associated with this DSC comment.
     * @return the set of resources
     */
    public Set getResources() {try{__CLR4_5_2errerrm6lb50rm.R.inc(19163);
        __CLR4_5_2errerrm6lb50rm.R.inc(19164);return Collections.unmodifiableSet(this.resources);
    }finally{__CLR4_5_2errerrm6lb50rm.R.flushNeeded();}}

    /**
     * Defines the known resource types (font, procset, file, pattern etc.).
     */
    static final Set RESOURCE_TYPES = new java.util.HashSet();

    static {try{__CLR4_5_2errerrm6lb50rm.R.inc(19165);
        __CLR4_5_2errerrm6lb50rm.R.inc(19166);RESOURCE_TYPES.add(PSResource.TYPE_FONT);
        __CLR4_5_2errerrm6lb50rm.R.inc(19167);RESOURCE_TYPES.add(PSResource.TYPE_PROCSET);
        __CLR4_5_2errerrm6lb50rm.R.inc(19168);RESOURCE_TYPES.add(PSResource.TYPE_FILE);
        __CLR4_5_2errerrm6lb50rm.R.inc(19169);RESOURCE_TYPES.add(PSResource.TYPE_PATTERN);
        __CLR4_5_2errerrm6lb50rm.R.inc(19170);RESOURCE_TYPES.add(PSResource.TYPE_FORM);
        __CLR4_5_2errerrm6lb50rm.R.inc(19171);RESOURCE_TYPES.add(PSResource.TYPE_ENCODING);
    }finally{__CLR4_5_2errerrm6lb50rm.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void parseValue(String value) {try{__CLR4_5_2errerrm6lb50rm.R.inc(19172);
        __CLR4_5_2errerrm6lb50rm.R.inc(19173);List params = splitParams(value);
        __CLR4_5_2errerrm6lb50rm.R.inc(19174);String currentResourceType = null;
        __CLR4_5_2errerrm6lb50rm.R.inc(19175);Iterator iter = params.iterator();
        __CLR4_5_2errerrm6lb50rm.R.inc(19176);while ((((iter.hasNext())&&(__CLR4_5_2errerrm6lb50rm.R.iget(19177)!=0|true))||(__CLR4_5_2errerrm6lb50rm.R.iget(19178)==0&false))) {{
            __CLR4_5_2errerrm6lb50rm.R.inc(19179);String name = (String)iter.next();
            __CLR4_5_2errerrm6lb50rm.R.inc(19180);if ((((RESOURCE_TYPES.contains(name))&&(__CLR4_5_2errerrm6lb50rm.R.iget(19181)!=0|true))||(__CLR4_5_2errerrm6lb50rm.R.iget(19182)==0&false))) {{
                __CLR4_5_2errerrm6lb50rm.R.inc(19183);currentResourceType = name;
            }
            }__CLR4_5_2errerrm6lb50rm.R.inc(19184);if ((((currentResourceType == null)&&(__CLR4_5_2errerrm6lb50rm.R.iget(19185)!=0|true))||(__CLR4_5_2errerrm6lb50rm.R.iget(19186)==0&false))) {{
                __CLR4_5_2errerrm6lb50rm.R.inc(19187);throw new IllegalArgumentException(
                        "<resources> must begin with a resource type. Found: " + name);
            }
            }__CLR4_5_2errerrm6lb50rm.R.inc(19188);if ((((PSResource.TYPE_FONT.equals(currentResourceType))&&(__CLR4_5_2errerrm6lb50rm.R.iget(19189)!=0|true))||(__CLR4_5_2errerrm6lb50rm.R.iget(19190)==0&false))) {{
                __CLR4_5_2errerrm6lb50rm.R.inc(19191);String fontname = (String)iter.next();
                __CLR4_5_2errerrm6lb50rm.R.inc(19192);addResource(new PSResource(name, fontname));
            } }else {__CLR4_5_2errerrm6lb50rm.R.inc(19193);if ((((PSResource.TYPE_FORM.equals(currentResourceType))&&(__CLR4_5_2errerrm6lb50rm.R.iget(19194)!=0|true))||(__CLR4_5_2errerrm6lb50rm.R.iget(19195)==0&false))) {{
                __CLR4_5_2errerrm6lb50rm.R.inc(19196);String formname = (String)iter.next();
                __CLR4_5_2errerrm6lb50rm.R.inc(19197);addResource(new PSResource(name, formname));
            } }else {__CLR4_5_2errerrm6lb50rm.R.inc(19198);if ((((PSResource.TYPE_PROCSET.equals(currentResourceType))&&(__CLR4_5_2errerrm6lb50rm.R.iget(19199)!=0|true))||(__CLR4_5_2errerrm6lb50rm.R.iget(19200)==0&false))) {{
                __CLR4_5_2errerrm6lb50rm.R.inc(19201);String procname = (String)iter.next();
                __CLR4_5_2errerrm6lb50rm.R.inc(19202);String version = (String)iter.next();
                __CLR4_5_2errerrm6lb50rm.R.inc(19203);String revision = (String)iter.next();
                __CLR4_5_2errerrm6lb50rm.R.inc(19204);addResource(new PSProcSet(procname,
                        Float.parseFloat(version), Integer.parseInt(revision)));
            } }else {__CLR4_5_2errerrm6lb50rm.R.inc(19205);if ((((PSResource.TYPE_FILE.equals(currentResourceType))&&(__CLR4_5_2errerrm6lb50rm.R.iget(19206)!=0|true))||(__CLR4_5_2errerrm6lb50rm.R.iget(19207)==0&false))) {{
                __CLR4_5_2errerrm6lb50rm.R.inc(19208);String filename = (String)iter.next();
                __CLR4_5_2errerrm6lb50rm.R.inc(19209);addResource(new PSResource(name, filename));
            } }else {{
                __CLR4_5_2errerrm6lb50rm.R.inc(19210);throw new IllegalArgumentException("Invalid resource type: " + currentResourceType);
            }
        }}}}}
    }}finally{__CLR4_5_2errerrm6lb50rm.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void generate(PSGenerator gen) throws IOException {try{__CLR4_5_2errerrm6lb50rm.R.inc(19211);
        __CLR4_5_2errerrm6lb50rm.R.inc(19212);if ((((resources == null || resources.size() == 0)&&(__CLR4_5_2errerrm6lb50rm.R.iget(19213)!=0|true))||(__CLR4_5_2errerrm6lb50rm.R.iget(19214)==0&false))) {{
            __CLR4_5_2errerrm6lb50rm.R.inc(19215);return;
        }
        }__CLR4_5_2errerrm6lb50rm.R.inc(19216);StringBuffer sb = new StringBuffer();
        __CLR4_5_2errerrm6lb50rm.R.inc(19217);sb.append("%%").append(getName()).append(": ");
        __CLR4_5_2errerrm6lb50rm.R.inc(19218);boolean first = true;
        __CLR4_5_2errerrm6lb50rm.R.inc(19219);for (Object resource : resources) {{
            __CLR4_5_2errerrm6lb50rm.R.inc(19220);if ((((!first)&&(__CLR4_5_2errerrm6lb50rm.R.iget(19221)!=0|true))||(__CLR4_5_2errerrm6lb50rm.R.iget(19222)==0&false))) {{
                __CLR4_5_2errerrm6lb50rm.R.inc(19223);gen.writeln(sb.toString());
                __CLR4_5_2errerrm6lb50rm.R.inc(19224);sb.setLength(0);
                __CLR4_5_2errerrm6lb50rm.R.inc(19225);sb.append("%%+ ");
            }
            }__CLR4_5_2errerrm6lb50rm.R.inc(19226);PSResource res = (PSResource) resource;
            __CLR4_5_2errerrm6lb50rm.R.inc(19227);sb.append(res.getResourceSpecification());
            __CLR4_5_2errerrm6lb50rm.R.inc(19228);first = false;
        }
        }__CLR4_5_2errerrm6lb50rm.R.inc(19229);gen.writeln(sb.toString());
    }finally{__CLR4_5_2errerrm6lb50rm.R.flushNeeded();}}

}
