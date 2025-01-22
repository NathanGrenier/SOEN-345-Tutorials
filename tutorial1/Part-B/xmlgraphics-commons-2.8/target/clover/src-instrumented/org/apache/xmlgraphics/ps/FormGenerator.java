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

/* $Id: FormGenerator.java 1898073 2022-02-14 14:54:16Z ssteiner $ */

package org.apache.xmlgraphics.ps;

import java.awt.geom.AffineTransform;
import java.awt.geom.Dimension2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;

/**
 * Abstract helper class for generating PostScript forms.
 */
public abstract class FormGenerator {public static class __CLR4_5_2crxcrxm68iyhz0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,16599,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String formName;
    private String title;
    private Dimension2D dimensions;

    /**
     * Main constructor.
     * @param formName the form's name
     * @param title the form's title or null
     * @param dimensions the form's dimensions
     */
    public FormGenerator(String formName, String title, Dimension2D dimensions) {try{__CLR4_5_2crxcrxm68iyhz0.R.inc(16557);
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16558);this.formName = formName;
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16559);this.title = title;
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16560);this.dimensions = dimensions;
    }finally{__CLR4_5_2crxcrxm68iyhz0.R.flushNeeded();}}

    /**
     * Returns the form's name.
     * @return the form's name
     */
    public String getFormName() {try{__CLR4_5_2crxcrxm68iyhz0.R.inc(16561);
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16562);return this.formName;
    }finally{__CLR4_5_2crxcrxm68iyhz0.R.flushNeeded();}}

    /**
     * Returns the form's title.
     * @return the form's title or null if there's no title
     */
    public String getTitle() {try{__CLR4_5_2crxcrxm68iyhz0.R.inc(16563);
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16564);return this.title;
    }finally{__CLR4_5_2crxcrxm68iyhz0.R.flushNeeded();}}

    /**
     * returns the form's dimensions.
     * @return the form's dimensions
     */
    public Dimension2D getDimensions() {try{__CLR4_5_2crxcrxm68iyhz0.R.inc(16565);
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16566);return this.dimensions;
    }finally{__CLR4_5_2crxcrxm68iyhz0.R.flushNeeded();}}

    /**
     * Generates the PostScript code for the PaintProc of the form.
     * @param gen the PostScript generator
     * @throws IOException if an I/O error occurs
     */
    protected abstract void generatePaintProc(PSGenerator gen) throws IOException;

    /**
     * Generates some PostScript code right after the form definition (used primarily for
     * bitmap data).
     * @param gen the PostScript generator
     * @throws IOException if an I/O error occurs
     */
    protected void generateAdditionalDataStream(PSGenerator gen) throws IOException {try{__CLR4_5_2crxcrxm68iyhz0.R.inc(16567);
        //nop
    }finally{__CLR4_5_2crxcrxm68iyhz0.R.flushNeeded();}}

    /**
     * Returns the matrix for use in the form.
     * @return the matrix
     */
    protected AffineTransform getMatrix() {try{__CLR4_5_2crxcrxm68iyhz0.R.inc(16568);
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16569);return new AffineTransform();
    }finally{__CLR4_5_2crxcrxm68iyhz0.R.flushNeeded();}}

    /**
     * Returns the form's bounding box.
     * @return the form's bounding box
     */
    protected Rectangle2D getBBox() {try{__CLR4_5_2crxcrxm68iyhz0.R.inc(16570);
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16571);return new Rectangle2D.Double(0, 0, dimensions.getWidth(), dimensions.getHeight());
    }finally{__CLR4_5_2crxcrxm68iyhz0.R.flushNeeded();}}

    /**
     * Generates the PostScript form.
     * @param gen the PostScript generator
     * @return a PSResource instance representing the form
     * @throws IOException if an I/O error occurs
     */
    public PSResource generate(PSGenerator gen) throws IOException {try{__CLR4_5_2crxcrxm68iyhz0.R.inc(16572);
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16573);if ((((gen.getPSLevel() < 2)&&(__CLR4_5_2crxcrxm68iyhz0.R.iget(16574)!=0|true))||(__CLR4_5_2crxcrxm68iyhz0.R.iget(16575)==0&false))) {{
            __CLR4_5_2crxcrxm68iyhz0.R.inc(16576);throw new UnsupportedOperationException(
                    "Forms require at least Level 2 PostScript");
        }
        }__CLR4_5_2crxcrxm68iyhz0.R.inc(16577);gen.writeDSCComment(DSCConstants.BEGIN_RESOURCE,
                new Object[] {PSResource.TYPE_FORM, getFormName()});
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16578);if ((((title != null)&&(__CLR4_5_2crxcrxm68iyhz0.R.iget(16579)!=0|true))||(__CLR4_5_2crxcrxm68iyhz0.R.iget(16580)==0&false))) {{
            __CLR4_5_2crxcrxm68iyhz0.R.inc(16581);gen.writeDSCComment(DSCConstants.TITLE, title);
        }
        }__CLR4_5_2crxcrxm68iyhz0.R.inc(16582);gen.writeln("/" + formName);
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16583);gen.writeln("<< /FormType 1");
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16584);gen.writeln("  /BBox " + gen.formatRectangleToArray(getBBox()));
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16585);gen.writeln("  /Matrix " + gen.formatMatrix(getMatrix()));
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16586);gen.writeln("  /PaintProc {");
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16587);gen.writeln("    pop");
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16588);gen.writeln("    gsave");
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16589);generatePaintProc(gen);
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16590);gen.writeln("    grestore");
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16591);gen.writeln("  } bind");
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16592);gen.writeln(">> def");
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16593);PSResource res = new PSResource(PSResource.TYPE_FORM, formName);
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16594);try {
            __CLR4_5_2crxcrxm68iyhz0.R.inc(16595);generateAdditionalDataStream(gen);
        } finally {
            __CLR4_5_2crxcrxm68iyhz0.R.inc(16596);gen.writeDSCComment(DSCConstants.END_RESOURCE);
            __CLR4_5_2crxcrxm68iyhz0.R.inc(16597);gen.getResourceTracker().registerSuppliedResource(res);
        }
        __CLR4_5_2crxcrxm68iyhz0.R.inc(16598);return res;
    }finally{__CLR4_5_2crxcrxm68iyhz0.R.flushNeeded();}}
}
