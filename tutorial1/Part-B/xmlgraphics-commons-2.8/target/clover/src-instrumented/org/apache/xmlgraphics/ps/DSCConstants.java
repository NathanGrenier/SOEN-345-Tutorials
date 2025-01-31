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

/* $Id: DSCConstants.java 1345683 2012-06-03 14:50:33Z gadams $ */

package org.apache.xmlgraphics.ps;

/**
 * This class defines constants with Strings for the DSC specification.
 *
 * @version $Id: DSCConstants.java 1345683 2012-06-03 14:50:33Z gadams $
 */
public final class DSCConstants {public static class __CLR4_5_2crscrsm6lb511i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,16557,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DSCConstants() {try{__CLR4_5_2crscrsm6lb511i.R.inc(16552);
    }finally{__CLR4_5_2crscrsm6lb511i.R.flushNeeded();}}

    // ----==== General Header Comments ====----

    /** Lead-in for a DSC-conformant PostScript file */
    public static final String PS_ADOBE_30       = "%!PS-Adobe-3.0";

    /** Lead-in for an EPS file */
    public static final String EPSF_30           = "EPSF-3.0";

    /** Bounding box for the document */
    public static final String BBOX              = "BoundingBox";
    /** High-resolution bounding box for the document */
    public static final String HIRES_BBOX        = "HiResBoundingBox";
    /** Copyright information associated with the document or resource */
    public static final String COPYRIGHT         = "Copyright";
    /** Creator of the document */
    public static final String CREATOR           = "Creator";
    /** Date and time when the document was created */
    public static final String CREATION_DATE     = "CreationDate";
    /** Type of data */
    public static final String DOCUMENT_DATA     = "BoundingBox";
    /** Use for indicating an emulator being invoked in the document */
    public static final String EMULATION         = "Emulation";
    /** Explicit end of comments */
    public static final String END_COMMENTS      = "EndComments";
    /** Required PostScript Level 1 extension for this document */
    public static final String EXTENSIONS        = "Extensions";
    /** Indicates who is this document printed for */
    public static final String FOR               = "For";
    /** Indicates the PostScript language level used in the document */
    public static final String LANGUAGE_LEVEL    = "LanguageLevel";
    /** Indicates the orientation of the document */
    public static final String ORIENTATION       = "Orientation";
    /** Number of pages in the document */
    public static final String PAGES             = "Pages";
    /** Indicates the order of the pages */
    public static final String PAGE_ORDER        = "PageOrder";
    /** Indicates how the document should be routed back to its owner */
    public static final String ROUTING           = "Routing";
    /** Title of the document */
    public static final String TITLE             = "Title";
    /** Version of the document */
    public static final String VERSION           = "Version";

    // ----==== General Body Comments ====----

    /** Indicates a continued line */
    public static final String NEXT_LINE         = "+ ";

    //Skipping BeginBinary/EndBinary. They are deprecated.

    /** Indicates the start of a data section*/
    public static final String BEGIN_DATA        = "BeginData";
    /** Indicates the end of a data section*/
    public static final String END_DATA          = "EndData";

    /** Indicates the start of the defaults section */
    public static final String BEGIN_DEFAULTS    = "BeginDefaults";
    /** Indicates the end of the defaults section */
    public static final String END_DEFAULTS      = "EndDefaults";

    /** Indicates the start of a non-PostScript section */
    public static final String BEGIN_EMULATION   = "BeginEmulation";
    /** Indicates the end of a non-PostScript section */
    public static final String END_EMULATION     = "EndEmulation";

    /** Indicates the start of a preview section (EPS only)*/
    public static final String BEGIN_PREVIEW     = "BeginPreview";
    /** Indicates the end of a preview section (EPS only)*/
    public static final String END_PREVIEW       = "EndPreview";

    /** Indicates the start of the prolog */
    public static final String BEGIN_PROLOG      = "BeginProlog";
    /** Indicates the end of the prolog */
    public static final String END_PROLOG        = "EndProlog";

    /** Indicates the start of the document setup */
    public static final String BEGIN_SETUP       = "BeginSetup";
    /** Indicates the end of the document setup */
    public static final String END_SETUP         = "EndSetup";


    // ----==== General Page Comments ====----

    /** Indicates the start of a graphic object */
    public static final String BEGIN_OBJECT      = "BeginObject";
    /** Indicates the end of a graphic object */
    public static final String END_OBJECT        = "EndObject";

    /** Indicates the start of the page setup section */
    public static final String BEGIN_PAGE_SETUP  = "BeginPageSetup";
    /** Indicates the end of the page setup section */
    public static final String END_PAGE_SETUP    = "EndPageSetup";

    /** Indicates a page number */
    public static final String PAGE              = "Page";
    /** Bounding box for a page */
    public static final String PAGE_BBOX         = "PageBoundingBox";
    /** High-resolution bounding box for a page */
    public static final String PAGE_HIRES_BBOX   = "PageHiResBoundingBox";
    /** Bounding box for a page */
    public static final String PAGE_ORIENTATION  = "PageOrientation";


    // ----==== General Trailer Comments ====----

    /** Indicates the start of the page trailer */
    public static final String PAGE_TRAILER     = "PageTrailer";
    /** Indicates the start of the document trailer */
    public static final String TRAILER          = "Trailer";
    /**
     * Indicates the end of a page (NON-STANDARD!)
     * @deprecated Shouldn't really use that. Bad idea. "Page" and "Trailer" end a page.
     */
    public static final String END_PAGE         = "EndPage";
    /** Indicates the end of the document */
    public static final String EOF              = "EOF";


    // ----==== Requirements Conventions ====----

    /**
     * This comment indicates all types of paper media (paper sizes, weight, color)
     * this document requires.
     */
    public static final String DOCUMENT_MEDIA              = "DocumentMedia";
    /** This comment provides a list of resources the document needs */
    public static final String DOCUMENT_NEEDED_RESOURCES   = "DocumentNeededResources";
    /** This comment provides a list of resources the document includes */
    public static final String DOCUMENT_SUPPLIED_RESOURCES = "DocumentSuppliedResources";
    //Skipping %%DocumentPrinterRequired
    //Skipping %%DocumentNeededFiles -> deprecated
    //Skipping %%DocumentSuppliedFiles -> deprecated
    //Skipping %%DocumentFonts -> deprecated
    //Skipping %%DocumentNeededFonts -> deprecated
    //Skipping %%DocumentSuppliedFonts -> deprecated
    //Skipping %%DocumentNeededProcSets -> deprecated
    //Skipping %%DocumentSuppliedProcSets -> deprecated
    //Skipping %%OperatorIntervention
    //Skipping %%OperatorMessage
    //Skipping %%ProofMode
    /**
     * This comment describes document requirements, such as duplex printing,
     * hole punching, collating, or other physical document processing needs.
     */
    public static final String REQUIREMENTS = "Requirements";
    //Skipping %%VMlocation
    //Skipping %%VMusage

    // ----==== Requirement Body Comments ====----

    /** Indicates the start of an embedded document */
    public static final String BEGIN_DOCUMENT   = "BeginDocument";
    /** Indicates the end of an embedded document */
    public static final String END_DOCUMENT     = "EndDocument";
    /** Indicates a referenced embedded document */
    public static final String INCLUDE_DOCUMENT = "IncludeDocument";

    /** Indicates the start of a PPD feature */
    public static final String BEGIN_FEATURE    = "BeginFeature";
    /** Indicates the end of a PPD feature */
    public static final String END_FEATURE      = "EndFeature";
    /** Indicates a referenced a PPD feature */
    public static final String INCLUDE_FEATURE  = "IncludeFeature";

    //Skipping BeginFile/EndFile/IncludeFile. They are deprecated.
    //Skipping BeginFont/EndFont/IncludeFont. They are deprecated.
    //Skipping BeginProcSet/EndProcSet/IncludeProcSet. They are deprecated.

    /** Indicates the start of a resource (font, file, procset) */
    public static final String BEGIN_RESOURCE       = "BeginResource";
    /** Indicates the end of a resource (font, file, procset) */
    public static final String END_RESOURCE         = "EndResource";
    /** Indicates a referenced a resource (font, file, procset) */
    public static final String INCLUDE_RESOURCE     = "IncludeResource";

    // ----==== Requirement Page Comments ====----

    //Skipping %%PageFonts -> deprecated
    //Skipping %%PageFiles -> deprecated
    /** Indicates that the paper attributes denoted by medianame are invoked on this page. */
    public static final String PAGE_MEDIA        = "PageMedia";
    /**
     * This is the page-level invocation of a combination of the options listed in
     * the %%Requirements: comment.
     */
    public static final String PAGE_REQUIREMENTS = "PageRequirements";
    /**
     * This comment indicates the names and values of all resources that are needed
     * or supplied on the present page.
     */
    public static final String PAGE_RESOURCES    = "PageResources";

    // ----==== (atend) indicator ====----

    /**
     * Indicator for the PostScript interpreter that the value is provided
     * later in the document (mostly in the %%Trailer section).
     */
    public static final Object ATEND = new AtendIndicator();

    /** Used for the ATEND constant. See there. */
    private static final class AtendIndicator extends Object {

        private AtendIndicator() {
            super();__CLR4_5_2crscrsm6lb511i.R.inc(16554);try{__CLR4_5_2crscrsm6lb511i.R.inc(16553);
        }finally{__CLR4_5_2crscrsm6lb511i.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2crscrsm6lb511i.R.inc(16555);
            __CLR4_5_2crscrsm6lb511i.R.inc(16556);return "(atend)";
        }finally{__CLR4_5_2crscrsm6lb511i.R.flushNeeded();}}
    }


}
