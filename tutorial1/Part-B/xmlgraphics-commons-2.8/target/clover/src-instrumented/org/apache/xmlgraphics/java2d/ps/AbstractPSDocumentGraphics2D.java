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

/* $Id: AbstractPSDocumentGraphics2D.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.java2d.ps;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.PSProcSets;

/**
 * This class is a wrapper for the <tt>PSGraphics2D</tt> that
 * is used to create a full document around the PostScript rendering from
 * <tt>PSGraphics2D</tt>.
 *
 * @version $Id: AbstractPSDocumentGraphics2D.java 1732018 2016-02-24 04:51:06Z gadams $
 * @see org.apache.xmlgraphics.java2d.ps.PSGraphics2D
 *
 * Originally authored by Keiron Liddle.
 */
public abstract class AbstractPSDocumentGraphics2D extends PSGraphics2D {public static class __CLR4_5_2c5xc5xm6lb50yl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,15837,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected static final Integer ZERO = 0;

    protected int width;
    protected int height;

    protected float viewportWidth;
    protected float viewportHeight;

    protected int pagecount;
    protected boolean pagePending;

    protected Shape initialClip;
    protected AffineTransform initialTransform;


    /**
     * Create a new AbstractPSDocumentGraphics2D.
     * This is used to create a new PostScript document, the height,
     * width and output stream can be setup later.
     * For use by the transcoder which needs font information
     * for the bridge before the document size is known.
     * The resulting document is written to the stream after rendering.
     *
     * @param textAsShapes set this to true so that text will be rendered
     * using curves and not the font.
     */
    AbstractPSDocumentGraphics2D(boolean textAsShapes) {
        super(textAsShapes);__CLR4_5_2c5xc5xm6lb50yl.R.inc(15766);try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15765);
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /**
     * Setup the document.
     * @param stream the output stream to write the document
     * @param width the width of the page
     * @param height the height of the page
     * @throws IOException an io exception if there is a problem
     *         writing to the output stream
     */
    public void setupDocument(OutputStream stream, int width, int height) throws IOException {try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15767);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15768);this.width = width;
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15769);this.height = height;
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15770);this.pagecount = 0;
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15771);this.pagePending = false;

        //Setup for PostScript generation
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15772);setPSGenerator(new PSGenerator(stream));

        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15773);writeFileHeader();
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /**
     * Writes the file header.
     * @throws IOException if an I/O error occurs
     */
    protected abstract void writeFileHeader() throws IOException;

    /**
     * Create a new AbstractPSDocumentGraphics2D.
     * This is used to create a new PostScript document of the given height
     * and width.
     * The resulting document is written to the stream after rendering.
     *
     * @param textAsShapes set this to true so that text will be rendered
     * using curves and not the font.
     * @param stream the stream that the final document should be written to.
     * @param width the width of the document
     * @param height the height of the document
     * @throws IOException an io exception if there is a problem
     *         writing to the output stream
     */
    public AbstractPSDocumentGraphics2D(boolean textAsShapes, OutputStream stream,
                                 int width, int height) throws IOException {
        this(textAsShapes);__CLR4_5_2c5xc5xm6lb50yl.R.inc(15775);try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15774);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15776);setupDocument(stream, width, height);
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /**
     * Set the dimensions of the document that will be drawn.
     * This is useful if the dimensions of the document are different
     * from the PostScript document that is to be created.
     * The result is scaled so that the document fits correctly inside the
     * PostScript document.
     * @param w the width of the page
     * @param h the height of the page
     * @throws IOException in case of an I/O problem
     */
    public void setViewportDimension(float w, float h) throws IOException {try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15777);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15778);this.viewportWidth = w;
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15779);this.viewportHeight = h;
        /*
        if (w != this.width || h != this.height) {
            gen.concatMatrix(width / w, 0, 0, height / h, 0, 0);
        }*/
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /**
     * Set the background of the PostScript document.
     * This is used to set the background for the PostScript document
     * Rather than leaving it as the default white.
     * @param col the background colour to fill
     */
    public void setBackgroundColor(Color col) {try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15780);
        /**(todo) Implement this */
        /*
        Color c = col;
        PDFColor currentColour = new PDFColor(c.getRed(), c.getGreen(), c.getBlue());
        currentStream.write("q\n");
        currentStream.write(currentColour.getColorSpaceOut(true));

        currentStream.write("0 0 " + width + " " + height + " re\n");

        currentStream.write("f\n");
        currentStream.write("Q\n");
        */
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /**
     * Returns the number of pages generated so far.
     * @return the number of pages
     */
    public int getPageCount() {try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15781);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15782);return this.pagecount;
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /**
     * Closes the current page and prepares to start a new one.
     * @throws IOException if an I/O error occurs
     */
    public void nextPage() throws IOException {try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15783);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15784);closePage();
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /**
     * Closes the current page.
     * @throws IOException if an I/O error occurs
     */
    protected void closePage() throws IOException {try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15785);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15786);if ((((!this.pagePending)&&(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15787)!=0|true))||(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15788)==0&false))) {{
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15789);return; //ignore
        }
        //Finish page
        }__CLR4_5_2c5xc5xm6lb50yl.R.inc(15790);writePageTrailer();
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15791);this.pagePending = false;
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /**
     * Writes the page header for a page.
     * @throws IOException In case an I/O error occurs
     */
    protected abstract void writePageHeader() throws IOException;

    /**
     * Writes the page trailer for a page.
     * @throws IOException In case an I/O error occurs
     */
    protected abstract void writePageTrailer() throws IOException;

    /**
     * Writes the ProcSets ending up in the prolog to the PostScript file. Override to add your
     * own ProcSets if so desired.
     * @throws IOException In case an I/O error occurs
     */
    protected void writeProcSets() throws IOException {try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15792);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15793);PSProcSets.writeStdProcSet(gen);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15794);PSProcSets.writeEPSProcSet(gen);
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void preparePainting() {try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15795);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15796);if ((((this.pagePending)&&(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15797)!=0|true))||(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15798)==0&false))) {{
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15799);return;
        }
        }__CLR4_5_2c5xc5xm6lb50yl.R.inc(15800);try {
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15801);startPage();
        } catch (IOException ioe) {
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15802);handleIOException(ioe);
        }
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /**
     * Starts a new page.
     * @throws IOException if an I/O error occurs
     */
    protected void startPage() throws IOException {try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15803);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15804);if ((((this.pagePending)&&(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15805)!=0|true))||(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15806)==0&false))) {{
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15807);throw new IllegalStateException("Close page first before starting another");
        }
        //Start page
        }__CLR4_5_2c5xc5xm6lb50yl.R.inc(15808);this.pagecount++;

        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15809);if ((((this.initialTransform == null)&&(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15810)!=0|true))||(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15811)==0&false))) {{
            //Save initial transformation matrix
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15812);this.initialTransform = getTransform();
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15813);this.initialClip = getClip();
        } }else {{
            //Reset transformation matrix
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15814);setTransform(this.initialTransform);
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15815);setClip(this.initialClip);
        }

        }__CLR4_5_2c5xc5xm6lb50yl.R.inc(15816);writePageHeader();
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15817);AffineTransform at;
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15818);if (((((this.viewportWidth != this.width
                || this.viewportHeight != this.height)
                && (this.viewportWidth > 0) && (this.viewportHeight > 0))&&(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15819)!=0|true))||(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15820)==0&false))) {{
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15821);at = new AffineTransform(this.width / this.viewportWidth, 0,
                       0, -1 * (this.height / this.viewportHeight),
                       0, this.height);
        } }else {{
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15822);at = new AffineTransform(1, 0, 0, -1, 0, this.height);
        }
        // Do not use concatMatrix, since it alters PSGenerator current state
        //gen.concatMatrix(at);
        }__CLR4_5_2c5xc5xm6lb50yl.R.inc(15823);gen.writeln(gen.formatMatrix(at) + " " + gen.mapCommand("concat"));
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15824);gen.writeDSCComment(DSCConstants.END_PAGE_SETUP);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15825);this.pagePending = true;
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /**
     * The rendering process has finished.
     * This should be called after the rendering has completed as there is
     * no other indication it is complete.
     * This will then write the results to the output stream.
     * @throws IOException an io exception if there is a problem
     *         writing to the output stream
     */
    public void finish() throws IOException {try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15826);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15827);if ((((this.pagePending)&&(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15828)!=0|true))||(__CLR4_5_2c5xc5xm6lb50yl.R.iget(15829)==0&false))) {{
            __CLR4_5_2c5xc5xm6lb50yl.R.inc(15830);closePage();
        }

        //Finish document
        }__CLR4_5_2c5xc5xm6lb50yl.R.inc(15831);gen.writeDSCComment(DSCConstants.TRAILER);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15832);gen.writeDSCComment(DSCConstants.PAGES, this.pagecount);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15833);gen.writeDSCComment(DSCConstants.EOF);
        __CLR4_5_2c5xc5xm6lb50yl.R.inc(15834);gen.flush();
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

    /**
     * This constructor supports the create method
     * @param g the PostScript document graphics to make a copy of
     */
    public AbstractPSDocumentGraphics2D(AbstractPSDocumentGraphics2D g) {
        super(g);__CLR4_5_2c5xc5xm6lb50yl.R.inc(15836);try{__CLR4_5_2c5xc5xm6lb50yl.R.inc(15835);
    }finally{__CLR4_5_2c5xc5xm6lb50yl.R.flushNeeded();}}

}

