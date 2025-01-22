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

/* $Id: EPSDocumentGraphics2D.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.java2d.ps;

import java.io.IOException;

import org.apache.xmlgraphics.ps.DSCConstants;

/**
 * This class is a wrapper for the <tt>AbstractPSDocumentGraphics2D</tt> that
 * is used to create EPS (Encapsulated PostScript) files instead of PS file.
 *
 * @version $Id: EPSDocumentGraphics2D.java 1732018 2016-02-24 04:51:06Z gadams $
 * @see org.apache.xmlgraphics.java2d.ps.PSGraphics2D
 * @see org.apache.xmlgraphics.java2d.ps.AbstractPSDocumentGraphics2D
 */
public class EPSDocumentGraphics2D extends AbstractPSDocumentGraphics2D {public static class __CLR4_5_2c7xc7xm68iyhw5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,15866,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Create a new EPSDocumentGraphics2D.
     * This is used to create a new EPS document, the height,
     * width and output stream can be setup later.
     * For use by the transcoder which needs font information
     * for the bridge before the document size is known.
     * The resulting document is written to the stream after rendering.
     *
     * @param textAsShapes set this to true so that text will be rendered
     * using curves and not the font.
     */
    public EPSDocumentGraphics2D(boolean textAsShapes) {
        super(textAsShapes);__CLR4_5_2c7xc7xm68iyhw5.R.inc(15838);try{__CLR4_5_2c7xc7xm68iyhw5.R.inc(15837);
    }finally{__CLR4_5_2c7xc7xm68iyhw5.R.flushNeeded();}}

    /** {@inheritDoc} */
    protected void writeFileHeader() throws IOException {try{__CLR4_5_2c7xc7xm68iyhw5.R.inc(15839);
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15840);final Long pagewidth = (long) this.width;
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15841);final Long pageheight = (long) this.height;

        //PostScript Header
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15842);gen.writeln(DSCConstants.PS_ADOBE_30 + " " + DSCConstants.EPSF_30);
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15843);gen.writeDSCComment(DSCConstants.CREATOR,
                    new String[] {"Apache XML Graphics Commons"
                        + ": EPS Generator for Java2D"});
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15844);gen.writeDSCComment(DSCConstants.CREATION_DATE,
                    new Object[] {new java.util.Date()});
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15845);gen.writeDSCComment(DSCConstants.PAGES, DSCConstants.ATEND);
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15846);gen.writeDSCComment(DSCConstants.BBOX, new Object[]
                {ZERO, ZERO, pagewidth, pageheight});
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15847);gen.writeDSCComment(DSCConstants.LANGUAGE_LEVEL, gen.getPSLevel());
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15848);gen.writeDSCComment(DSCConstants.END_COMMENTS);

        //Prolog
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15849);gen.writeDSCComment(DSCConstants.BEGIN_PROLOG);
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15850);writeProcSets();
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15851);if ((((customTextHandler instanceof PSTextHandler)&&(__CLR4_5_2c7xc7xm68iyhw5.R.iget(15852)!=0|true))||(__CLR4_5_2c7xc7xm68iyhw5.R.iget(15853)==0&false))) {{
            __CLR4_5_2c7xc7xm68iyhw5.R.inc(15854);((PSTextHandler)customTextHandler).writeSetup();
        }
        }__CLR4_5_2c7xc7xm68iyhw5.R.inc(15855);gen.writeDSCComment(DSCConstants.END_PROLOG);
    }finally{__CLR4_5_2c7xc7xm68iyhw5.R.flushNeeded();}}

    /** {@inheritDoc} */
    protected void writePageHeader() throws IOException {try{__CLR4_5_2c7xc7xm68iyhw5.R.inc(15856);
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15857);Integer pageNumber = this.pagecount;
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15858);gen.writeDSCComment(DSCConstants.PAGE, new Object[]
                {pageNumber.toString(), pageNumber});
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15859);gen.writeDSCComment(DSCConstants.PAGE_BBOX, new Object[]
                {ZERO, ZERO, width, height});
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15860);gen.writeDSCComment(DSCConstants.BEGIN_PAGE_SETUP);
        __CLR4_5_2c7xc7xm68iyhw5.R.inc(15861);if ((((customTextHandler instanceof PSTextHandler)&&(__CLR4_5_2c7xc7xm68iyhw5.R.iget(15862)!=0|true))||(__CLR4_5_2c7xc7xm68iyhw5.R.iget(15863)==0&false))) {{
            __CLR4_5_2c7xc7xm68iyhw5.R.inc(15864);((PSTextHandler)customTextHandler).writePageSetup();
        }
    }}finally{__CLR4_5_2c7xc7xm68iyhw5.R.flushNeeded();}}

    /** {@inheritDoc} */
    protected void writePageTrailer() throws IOException {try{__CLR4_5_2c7xc7xm68iyhw5.R.inc(15865);
        //nop, no DSC PageTrailer needed
    }finally{__CLR4_5_2c7xc7xm68iyhw5.R.flushNeeded();}}

}
