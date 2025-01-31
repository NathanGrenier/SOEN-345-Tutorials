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

/* $Id: DSCCommentFactory.java 1780540 2017-01-27 11:10:50Z ssteiner $ */

package org.apache.xmlgraphics.ps.dsc;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.dsc.events.DSCComment;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentBeginDocument;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentBeginResource;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentBoundingBox;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentDocumentNeededResources;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentDocumentSuppliedResources;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentEndComments;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentEndOfFile;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentHiResBoundingBox;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentIncludeResource;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentLanguageLevel;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentPage;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentPageBoundingBox;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentPageHiResBoundingBox;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentPageResources;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentPages;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentTitle;

/**
 * Factory for DSCComment subclasses.
 */
public final class DSCCommentFactory {public static class __CLR4_5_2e9be9bm6lb51ds{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,18509,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DSCCommentFactory() {try{__CLR4_5_2e9be9bm6lb51ds.R.inc(18479);
    }finally{__CLR4_5_2e9be9bm6lb51ds.R.flushNeeded();}}

    private static final Map DSC_FACTORIES = new java.util.HashMap();

    static {try{__CLR4_5_2e9be9bm6lb51ds.R.inc(18480);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18481);DSC_FACTORIES.put(DSCConstants.END_COMMENTS,
                DSCCommentEndComments.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18482);DSC_FACTORIES.put(DSCConstants.BEGIN_RESOURCE,
                DSCCommentBeginResource.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18483);DSC_FACTORIES.put(DSCConstants.INCLUDE_RESOURCE,
                DSCCommentIncludeResource.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18484);DSC_FACTORIES.put(DSCConstants.PAGE_RESOURCES,
                DSCCommentPageResources.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18485);DSC_FACTORIES.put(DSCConstants.BEGIN_DOCUMENT,
                DSCCommentBeginDocument.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18486);DSC_FACTORIES.put(DSCConstants.PAGE,
                DSCCommentPage.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18487);DSC_FACTORIES.put(DSCConstants.PAGES,
                DSCCommentPages.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18488);DSC_FACTORIES.put(DSCConstants.BBOX,
                DSCCommentBoundingBox.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18489);DSC_FACTORIES.put(DSCConstants.HIRES_BBOX,
                DSCCommentHiResBoundingBox.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18490);DSC_FACTORIES.put(DSCConstants.PAGE_BBOX,
                DSCCommentPageBoundingBox.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18491);DSC_FACTORIES.put(DSCConstants.PAGE_HIRES_BBOX,
                DSCCommentPageHiResBoundingBox.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18492);DSC_FACTORIES.put(DSCConstants.LANGUAGE_LEVEL,
                DSCCommentLanguageLevel.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18493);DSC_FACTORIES.put(DSCConstants.DOCUMENT_NEEDED_RESOURCES,
                DSCCommentDocumentNeededResources.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18494);DSC_FACTORIES.put(DSCConstants.DOCUMENT_SUPPLIED_RESOURCES,
                DSCCommentDocumentSuppliedResources.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18495);DSC_FACTORIES.put(DSCConstants.TITLE,
                DSCCommentTitle.class);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18496);DSC_FACTORIES.put(DSCConstants.EOF,
                DSCCommentEndOfFile.class);
        //TODO Add additional implementations as needed
    }finally{__CLR4_5_2e9be9bm6lb51ds.R.flushNeeded();}}

    /**
     * Creates and returns new instances for DSC comments with a given name.
     * @param name the name of the DSCComment (without the "%%" prefix)
     * @return the new instance or null if no particular subclass registered for the given
     *          DSC comment.
     */
    public static DSCComment createDSCCommentFor(String name) {try{__CLR4_5_2e9be9bm6lb51ds.R.inc(18497);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18498);Class clazz = (Class)DSC_FACTORIES.get(name);
        __CLR4_5_2e9be9bm6lb51ds.R.inc(18499);if ((((clazz == null)&&(__CLR4_5_2e9be9bm6lb51ds.R.iget(18500)!=0|true))||(__CLR4_5_2e9be9bm6lb51ds.R.iget(18501)==0&false))) {{
            __CLR4_5_2e9be9bm6lb51ds.R.inc(18502);return null;
        }
        }__CLR4_5_2e9be9bm6lb51ds.R.inc(18503);try {
            __CLR4_5_2e9be9bm6lb51ds.R.inc(18504);return (DSCComment)clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            __CLR4_5_2e9be9bm6lb51ds.R.inc(18505);throw new RuntimeException("Error instantiating instance for '" + name + "': "
                    + e.getMessage());
        } catch (IllegalAccessException e) {
            __CLR4_5_2e9be9bm6lb51ds.R.inc(18506);throw new RuntimeException("Illegal Access error while instantiating instance for '"
                    + name + "': " + e.getMessage());
        } catch (NoSuchMethodException e) {
            __CLR4_5_2e9be9bm6lb51ds.R.inc(18507);throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            __CLR4_5_2e9be9bm6lb51ds.R.inc(18508);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_2e9be9bm6lb51ds.R.flushNeeded();}}

}
