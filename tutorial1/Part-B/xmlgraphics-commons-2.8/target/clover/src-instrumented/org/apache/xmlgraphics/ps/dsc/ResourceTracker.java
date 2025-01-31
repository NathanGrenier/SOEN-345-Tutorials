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

/* $Id: ResourceTracker.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.ps.dsc;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.PSResource;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentDocumentNeededResources;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentDocumentSuppliedResources;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentPageResources;

/**
 * This class is used to track resources in a DSC-compliant PostScript file. The distinction is
 * made between supplied and needed resources. For the details of this distinction, please see
 * the DSC specification.
 */
public class ResourceTracker {public static class __CLR4_5_2ek5ek5m6lb50qa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,18985,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Set documentSuppliedResources;
    private Set documentNeededResources;
    private Set usedResources;
    private Set pageResources;

    //Map<PSResource, Integer>
    private Map resourceUsageCounts;

    /**
     * Returns the set of supplied resources.
     * @return the set of supplied resources
     */
    public Set getDocumentSuppliedResources() {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18869);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18870);if ((((documentSuppliedResources != null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18871)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18872)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18873);return Collections.unmodifiableSet(documentSuppliedResources);
        } }else {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18874);return Collections.EMPTY_SET;
        }
    }}finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * Returns the set of needed resources.
     * @return the set of needed resources
     */
    public Set getDocumentNeededResources() {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18875);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18876);if ((((documentNeededResources != null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18877)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18878)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18879);return Collections.unmodifiableSet(documentNeededResources);
        } }else {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18880);return Collections.EMPTY_SET;
        }
    }}finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * Notifies the resource tracker that a new page has been started and that the page resource
     * set can be cleared.
     */
    public void notifyStartNewPage() {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18881);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18882);if ((((pageResources != null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18883)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18884)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18885);pageResources.clear();
        }
    }}finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * Registers a supplied resource. If the same resources is already in the set of needed
     * resources, it is removed there.
     * @param res the resource
     */
    public void registerSuppliedResource(PSResource res) {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18886);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18887);if ((((documentSuppliedResources == null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18888)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18889)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18890);documentSuppliedResources = new java.util.HashSet();
        }
        }__CLR4_5_2ek5ek5m6lb50qa.R.inc(18891);documentSuppliedResources.add(res);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18892);if ((((documentNeededResources != null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18893)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18894)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18895);documentNeededResources.remove(res);
        }
    }}finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * Registers a needed resource. If the same resources is already in the set of supplied
     * resources, it is ignored, i.e. it is assumed to be supplied.
     * @param res the resource
     */
    public void registerNeededResource(PSResource res) {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18896);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18897);if ((((documentSuppliedResources == null || !documentSuppliedResources.contains(res))&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18898)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18899)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18900);if ((((documentNeededResources == null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18901)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18902)==0&false))) {{
                __CLR4_5_2ek5ek5m6lb50qa.R.inc(18903);documentNeededResources = new java.util.HashSet();
            }
            }__CLR4_5_2ek5ek5m6lb50qa.R.inc(18904);documentNeededResources.add(res);
        }
    }}finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    private void preparePageResources() {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18905);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18906);if ((((pageResources == null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18907)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18908)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18909);pageResources = new java.util.HashSet();
        }
    }}finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    private void prepareUsageCounts() {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18910);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18911);if ((((resourceUsageCounts == null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18912)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18913)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18914);resourceUsageCounts = new java.util.HashMap();
        }
    }}finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * Notifies the resource tracker about the usage of a resource on the current page.
     * @param res the resource being used
     */
    public void notifyResourceUsageOnPage(PSResource res) {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18915);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18916);preparePageResources();
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18917);pageResources.add(res);

        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18918);prepareUsageCounts();
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18919);Counter counter = (Counter)resourceUsageCounts.get(res);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18920);if ((((counter == null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18921)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18922)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18923);resourceUsageCounts.put(res, new Counter());
        } }else {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18924);counter.inc();
        }
    }}finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * Notifies the resource tracker about the usage of resources on the current page.
     * @param resources the resources being used
     */
    public void notifyResourceUsageOnPage(Collection resources) {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18925);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18926);preparePageResources();
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18927);for (Object resource : resources) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18928);PSResource res = (PSResource) resource;
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18929);notifyResourceUsageOnPage(res);
        }
    }}finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * Indicates whether a particular resource is supplied, rather than needed.
     * @param res the resource
     * @return true if the resource is registered as being supplied.
     */
    public boolean isResourceSupplied(PSResource res) {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18930);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18931);return (documentSuppliedResources != null) && documentSuppliedResources.contains(res);
    }finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * Writes a DSC comment for the accumulated used resources, either at page level or
     * at document level.
     * @param pageLevel true if the DSC comment for the page level should be generated,
     *                  false for the document level (in the trailer)
     * @param gen the PSGenerator to write the DSC comments with
     * @exception IOException In case of an I/O problem
     */
    public void writeResources(boolean pageLevel, PSGenerator gen) throws IOException {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18932);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18933);if ((((pageLevel)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18934)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18935)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18936);writePageResources(gen);
        } }else {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18937);writeDocumentResources(gen);
        }
    }}finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * Writes a DSC comment for the accumulated used resources on the current page. Then it commits
     * all those resources to the used resources on document level.
     * @param gen the PSGenerator to write the DSC comments with
     * @exception IOException In case of an I/O problem
     */
    public void writePageResources(PSGenerator gen) throws IOException {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18938);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18939);new DSCCommentPageResources(pageResources).generate(gen);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18940);if ((((usedResources == null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18941)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18942)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18943);usedResources = new java.util.HashSet();
        }
        }__CLR4_5_2ek5ek5m6lb50qa.R.inc(18944);usedResources.addAll(pageResources);
    }finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * Writes a DSC comment for the needed and supplied resourced for the current DSC document.
     * @param gen the PSGenerator to write the DSC comments with
     * @exception IOException In case of an I/O problem
     */
    public void writeDocumentResources(PSGenerator gen) throws IOException {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18945);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18946);if ((((usedResources != null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18947)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18948)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18949);for (Object usedResource : usedResources) {{
                __CLR4_5_2ek5ek5m6lb50qa.R.inc(18950);PSResource res = (PSResource) usedResource;
                __CLR4_5_2ek5ek5m6lb50qa.R.inc(18951);if ((((documentSuppliedResources == null
                        || !documentSuppliedResources.contains(res))&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18952)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18953)==0&false))) {{
                    __CLR4_5_2ek5ek5m6lb50qa.R.inc(18954);registerNeededResource(res);
                }
            }}
        }}
        }__CLR4_5_2ek5ek5m6lb50qa.R.inc(18955);new DSCCommentDocumentNeededResources(documentNeededResources).generate(gen);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18956);new DSCCommentDocumentSuppliedResources(documentSuppliedResources).generate(gen);
    }finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * This method declares that the given resource will be inlined and can therefore
     * be removed from resource tracking. This is useful when you don't know beforehand
     * if a resource will be used multiple times. If it's only used once it's better
     * to inline the resource to lower the maximum memory needed inside the PostScript
     * interpreter.
     * @param res the resource
     */
    public void declareInlined(PSResource res) {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18957);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18958);if ((((this.documentNeededResources != null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18959)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18960)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18961);this.documentNeededResources.remove(res);
        }
        }__CLR4_5_2ek5ek5m6lb50qa.R.inc(18962);if ((((this.documentSuppliedResources != null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18963)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18964)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18965);this.documentSuppliedResources.remove(res);
        }
        }__CLR4_5_2ek5ek5m6lb50qa.R.inc(18966);if ((((this.pageResources != null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18967)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18968)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18969);this.pageResources.remove(res);
        }
        }__CLR4_5_2ek5ek5m6lb50qa.R.inc(18970);if ((((this.usedResources != null)&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18971)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18972)==0&false))) {{
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18973);this.usedResources.remove(res);
        }
    }}finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    /**
     * Returns the number of times a resource has been used inside the current DSC document.
     * @param res the resource
     * @return the number of times the resource has been used
     */
    public long getUsageCount(PSResource res) {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18974);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18975);Counter counter = (Counter)resourceUsageCounts.get(res);
        __CLR4_5_2ek5ek5m6lb50qa.R.inc(18976);return ((((counter != null )&&(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18977)!=0|true))||(__CLR4_5_2ek5ek5m6lb50qa.R.iget(18978)==0&false))? counter.getCount() : 0);
    }finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

    private static class Counter {

        private long count = 1;

        public void inc() {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18979);
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18980);this.count++;
        }finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

        public long getCount() {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18981);
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18982);return this.count;
        }finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2ek5ek5m6lb50qa.R.inc(18983);
            __CLR4_5_2ek5ek5m6lb50qa.R.inc(18984);return Long.toString(this.count);
        }finally{__CLR4_5_2ek5ek5m6lb50qa.R.flushNeeded();}}
    }

}
