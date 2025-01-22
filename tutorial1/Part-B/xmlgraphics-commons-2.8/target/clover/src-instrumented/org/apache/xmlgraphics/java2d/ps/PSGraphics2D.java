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

/* $Id: PSGraphics2D.java 1903802 2022-09-01 09:35:58Z ssteiner $ */

package org.apache.xmlgraphics.java2d.ps;

//Java
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.TexturePaint;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlgraphics.java2d.AbstractGraphics2D;
import org.apache.xmlgraphics.java2d.GraphicContext;
import org.apache.xmlgraphics.java2d.GraphicsConfigurationWithoutTransparency;
import org.apache.xmlgraphics.java2d.StrokingTextHandler;
import org.apache.xmlgraphics.java2d.TextHandler;
import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.PSImageUtils;

/**
 * This is a concrete implementation of <tt>AbstractGraphics2D</tt> (and
 * therefore of <tt>Graphics2D</tt>) which is able to generate PostScript
 * code.
 *
 * @version $Id: PSGraphics2D.java 1903802 2022-09-01 09:35:58Z ssteiner $
 * @see org.apache.xmlgraphics.java2d.AbstractGraphics2D
 *
 * Originally authored by Keiron Liddle.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PSGraphics2D extends AbstractGraphics2D {public static class __CLR4_5_2c9zc9zm68iyhxt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,16279,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final AffineTransform IDENTITY_TRANSFORM = new AffineTransform();

    private static final boolean DEBUG = false;

    protected List<Integer> pathHashCache = new ArrayList<Integer>();
    protected boolean startCache;
    /**
     * The G2D instance that represents the root instance
     * (used in context with create()/dispose()). Null if this instance is the root instance.
     */
    protected PSGraphics2D rootG2D;

    /** the PostScript generator being created */
    protected PSGenerator gen;

    /** Disable or enable clipping */
    protected boolean clippingDisabled;

    /** Fallback text handler */

    protected TextHandler fallbackTextHandler = new StrokingTextHandler();

    /** Custom text handler */
    protected TextHandler customTextHandler;

    /**
     * the current colour for use in svg
     */
    protected Color currentColour = new Color(0, 0, 0);

    /**
     * Create a new Graphics2D that generates PostScript code.
     * @param textAsShapes True if text should be rendered as graphics
     * @see org.apache.xmlgraphics.java2d.AbstractGraphics2D#AbstractGraphics2D(boolean)
     */
    public PSGraphics2D(boolean textAsShapes) {
        super(textAsShapes);__CLR4_5_2c9zc9zm68iyhxt.R.inc(15912);try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15911);
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Create a new Graphics2D that generates PostScript code.
     * @param textAsShapes True if text should be rendered as graphics
     * @param gen PostScript generator to use for output
     * @see org.apache.xmlgraphics.java2d.AbstractGraphics2D#AbstractGraphics2D(boolean)
     */
    public PSGraphics2D(boolean textAsShapes, PSGenerator gen) {
        this(textAsShapes);__CLR4_5_2c9zc9zm68iyhxt.R.inc(15914);try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15913);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15915);setPSGenerator(gen);
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Constructor for creating copies
     * @param g parent PostScript Graphics2D
     */
    public PSGraphics2D(PSGraphics2D g) {
        super(g);__CLR4_5_2c9zc9zm68iyhxt.R.inc(15917);try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15916);

        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15918);this.rootG2D = ((((g.rootG2D != null )&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15919)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15920)==0&false))? g.rootG2D : g);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15921);setPSGenerator(g.gen);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15922);this.clippingDisabled = g.clippingDisabled;
        //this.fallbackTextHandler is not copied
        //TODO The customTextHandler should probably not be passed over just like that
        //fallbackTextHandler, for example, has to be recreated to point to the sub-Graphics2D
        //to get the text positioning right. This might require changes in the TextHandler interface
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15923);this.customTextHandler = g.customTextHandler;
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15924);this.currentColour    = g.currentColour;
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Sets the PostScript generator
     * @param gen the PostScript generator
     */
    public void setPSGenerator(PSGenerator gen) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15925);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15926);this.gen = gen;
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /** @return the PostScript generator used by this instance. */
    public PSGenerator getPSGenerator() {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15927);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15928);return this.gen;
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Sets the GraphicContext
     * @param c GraphicContext to use
     */
    public void setGraphicContext(GraphicContext c) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15929);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15930);gc = c;
        //setPrivateHints();
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /** @return the fallback TextHandler implementation */
    public TextHandler getFallbackTextHandler() {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15931);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15932);return this.fallbackTextHandler;
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /** @return the custom TextHandler implementation */
    public TextHandler getCustomTextHandler() {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15933);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15934);return this.customTextHandler;
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Sets a custom TextHandler implementation that is responsible for painting text. The default
     * TextHandler paints all text as shapes. A custom implementation can implement text painting
     * using text painting operators.
     * @param handler the custom TextHandler implementation
     */
    public void setCustomTextHandler(TextHandler handler) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15935);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15936);this.customTextHandler = handler;
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /* TODO Add me back at the right place!!!
    private void setPrivateHints() {
        setRenderingHint(RenderingHintsKeyExt.KEY_AVOID_TILE_PAINTING,
                RenderingHintsKeyExt.VALUE_AVOID_TILE_PAINTING_ON);
    }*/

    /**
     * Disable clipping on each draw command.
     *
     * @param b set to true to disable all clipping.
     */
    public void disableClipping(boolean b) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15937);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15938);this.clippingDisabled = b;
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Creates a new <code>Graphics</code> object that is
     * a copy of this <code>Graphics</code> object.
     * @return     a new graphics context that is a copy of
     * this graphics context.
     */
    public Graphics create() {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15939);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15940);preparePainting();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15941);return new PSGraphics2D(this);
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Central handler for IOExceptions for this class.
     * @param ioe IOException to handle
     */
    public void handleIOException(IOException ioe) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15942);
        //TODO Surely, there's a better way to do this.
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15943);ioe.printStackTrace();
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * This method is used by AbstractPSDocumentGraphics2D to prepare a new page if
     * necessary.
     */
    public void preparePainting() {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15944);
        //nop, used by AbstractPSDocumentGraphics2D
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15945);if ((((rootG2D != null)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15946)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15947)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(15948);rootG2D.preparePainting();
        }
    }}finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Draws as much of the specified image as is currently available.
     * The image is drawn with its top-left corner at
     * (<i>x</i>,&nbsp;<i>y</i>) in this graphics context's coordinate
     * space. Transparent pixels in the image do not affect whatever
     * pixels are already there.
     * <p>
     * This method returns immediately in all cases, even if the
     * complete image has not yet been loaded, and it has not been dithered
     * and converted for the current output device.
     * <p>
     * If the image has not yet been completely loaded, then
     * <code>drawImage</code> returns <code>false</code>. As more of
     * the image becomes available, the process that draws the image notifies
     * the specified image observer.
     * @param    img the specified image to be drawn.
     * @param    x   the <i>x</i> coordinate.
     * @param    y   the <i>y</i> coordinate.
     * @param    observer    object to be notified as more of
     * the image is converted.
     * @return True if the image has been fully drawn/loaded
     * @see      java.awt.Image
     * @see      java.awt.image.ImageObserver
     * @see      java.awt.image.ImageObserver#imageUpdate(java.awt.Image, int, int, int, int, int)
     */
    public boolean drawImage(Image img, int x, int y, ImageObserver observer) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15949);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15950);return drawImage(img, x, y, observer, null);
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    public boolean drawImage(Image img, int x, int y, ImageObserver observer, Color mask) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15951);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15952);return drawImage(img, x, y, observer, mask, null);
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    public boolean drawImage(Image img, int x, int y, ImageObserver observer, Color mask, RenderedImage imageMask) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15953);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15954);preparePainting();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15955);if ((((DEBUG)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15956)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15957)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(15958);System.out.println("drawImage: " + x + ", " + y + " " + img.getClass().getName());
        }

        }__CLR4_5_2c9zc9zm68iyhxt.R.inc(15959);final int width = img.getWidth(observer);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15960);final int height = img.getHeight(observer);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15961);if ((((width == -1 || height == -1)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15962)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15963)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(15964);return false;
        }

        }__CLR4_5_2c9zc9zm68iyhxt.R.inc(15965);Dimension size = new Dimension(width, height);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15966);BufferedImage buf = buildBufferedImage(size);

        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15967);java.awt.Graphics2D g = buf.createGraphics();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15968);g.setComposite(AlphaComposite.SrcOver);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15969);g.setBackground(new Color(1, 1, 1, 0));
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15970);g.fillRect(0, 0, width, height);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15971);g.clip(new Rectangle(0, 0, buf.getWidth(), buf.getHeight()));

        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15972);if ((((!g.drawImage(img, 0, 0, observer))&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15973)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15974)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(15975);return false;
        }
        }__CLR4_5_2c9zc9zm68iyhxt.R.inc(15976);g.dispose();

        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15977);try {
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(15978);AffineTransform at = getTransform();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(15979);gen.saveGraphicsState();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(15980);gen.concatMatrix(at);
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(15981);Shape imclip = getClip();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(15982);writeClip(imclip);
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(15983);if ((((imageMask == null)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15984)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(15985)==0&false))) {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(15986);PSImageUtils.renderBitmapImage(buf, x, y, width, height, gen, mask, false);
            } }else {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(15987);PSImageUtils.renderBitmapImage(imageMask, x, y, width, height, gen, mask, true);
            }
            }__CLR4_5_2c9zc9zm68iyhxt.R.inc(15988);gen.restoreGraphicsState();
        } catch (IOException ioe) {
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(15989);handleIOException(ioe);
        }

        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15990);return true;
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Creates a buffered image.
     * @param size dimensions of the image to be created
     * @return the buffered image
     */
    public BufferedImage buildBufferedImage(Dimension size) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15991);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15992);return new BufferedImage(size.width, size.height,
                                 BufferedImage.TYPE_INT_ARGB);
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Draws as much of the specified image as has already been scaled
     * to fit inside the specified rectangle.
     * <p>
     * The image is drawn inside the specified rectangle of this
     * graphics context's coordinate space, and is scaled if
     * necessary. Transparent pixels do not affect whatever pixels
     * are already there.
     * <p>
     * This method returns immediately in all cases, even if the
     * entire image has not yet been scaled, dithered, and converted
     * for the current output device.
     * If the current output representation is not yet complete, then
     * <code>drawImage</code> returns <code>false</code>. As more of
     * the image becomes available, the process that draws the image notifies
     * the image observer by calling its <code>imageUpdate</code> method.
     * <p>
     * A scaled version of an image will not necessarily be
     * available immediately just because an unscaled version of the
     * image has been constructed for this output device.  Each size of
     * the image may be cached separately and generated from the original
     * data in a separate image production sequence.
     * @param    img    the specified image to be drawn.
     * @param    x      the <i>x</i> coordinate.
     * @param    y      the <i>y</i> coordinate.
     * @param    width  the width of the rectangle.
     * @param    height the height of the rectangle.
     * @param    observer    object to be notified as more of
     * the image is converted.
     * @return   True if the image has been fully loaded/drawn
     * @see      java.awt.Image
     * @see      java.awt.image.ImageObserver
     * @see      java.awt.image.ImageObserver#imageUpdate(java.awt.Image, int, int, int, int, int)
     */
    public boolean drawImage(Image img, int x, int y, int width, int height,
                             ImageObserver observer) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15993);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15994);preparePainting();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15995);System.err.println("NYI: drawImage");
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15996);return true;
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Disposes of this graphics context and releases
     * any system resources that it is using.
     * A <code>Graphics</code> object cannot be used after
     * <code>dispose</code>has been called.
     * <p>
     * When a Java program runs, a large number of <code>Graphics</code>
     * objects can be created within a short time frame.
     * Although the finalization process of the garbage collector
     * also disposes of the same system resources, it is preferable
     * to manually free the associated resources by calling this
     * method rather than to rely on a finalization process which
     * may not run to completion for a long period of time.
     * <p>
     * Graphics objects which are provided as arguments to the
     * <code>paint</code> and <code>update</code> methods
     * of components are automatically released by the system when
     * those methods return. For efficiency, programmers should
     * call <code>dispose</code> when finished using
     * a <code>Graphics</code> object only if it was created
     * directly from a component or another <code>Graphics</code> object.
     * @see         java.awt.Graphics#finalize
     * @see         java.awt.Component#paint
     * @see         java.awt.Component#update
     * @see         java.awt.Component#getGraphics
     * @see         java.awt.Graphics#create
     */
    public void dispose() {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(15997);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15998);this.gen = null;
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(15999);this.fallbackTextHandler = null;
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16000);this.customTextHandler = null;
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16001);this.currentColour = null;
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Processes a Shape generating the necessary painting operations.
     * @param s Shape to process
     * @return the winding rule of the path defining the shape
     * @throws IOException In case of an I/O problem.
     */
    public int processShape(Shape s, boolean cached) throws IOException {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16002);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16003);if ((((s instanceof Rectangle2D)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16004)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16005)==0&false))) {{
            // Special optimization in case of Rectangle Shape
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16006);Rectangle2D r = (Rectangle2D) s;
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16007);gen.defineRect(r.getX(), r.getY(), r.getWidth(), r.getHeight());
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16008);return PathIterator.WIND_NON_ZERO;
        } }else {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16009);PathIterator iter = s.getPathIterator(IDENTITY_TRANSFORM);
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16010);if ((((cached)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16011)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16012)==0&false))) {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16013);processPathIteratorCached(s);
            } }else {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16014);processPathIterator(iter);
            }
            }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16015);return iter.getWindingRule();
        }
    }}finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    protected String processPathIteratorToString(PathIterator iter) throws IOException {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16016);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16017);StringBuilder cmd = new StringBuilder();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16018);double[] vals = new double[6];
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16019);while ((((!iter.isDone())&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16020)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16021)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16022);int type = iter.currentSegment(vals);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2c9zc9zm68iyhxt.R.inc(16023);switch (type) {
            case PathIterator.SEG_CUBICTO:if (!__CLB4_5_2_bool0) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16024);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16025);cmd.append(gen.formatDouble(vals[0])).append(" ").append(gen.formatDouble(vals[1])).append(" ")
                        .append(gen.formatDouble(vals[2])).append(" ").append(gen.formatDouble(vals[3])).append(" ")
                        .append(gen.formatDouble(vals[4])).append(" ").append(gen.formatDouble(vals[5])).append(" ")
                        .append(gen.mapCommand("curveto")).append("\n");
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16026);break;
            case PathIterator.SEG_LINETO:if (!__CLB4_5_2_bool0) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16027);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16028);cmd.append(gen.formatDouble(vals[0])).append(" ").append(gen.formatDouble(vals[1])).append(" ")
                        .append(gen.mapCommand("lineto")).append("\n");
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16029);break;
            case PathIterator.SEG_MOVETO:if (!__CLB4_5_2_bool0) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16030);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16031);cmd.append(gen.formatDouble(vals[0])).append(" ").append(gen.formatDouble(vals[1])).append(" ")
                        .append(gen.mapCommand("moveto")).append("\n");
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16032);break;
            case PathIterator.SEG_QUADTO:if (!__CLB4_5_2_bool0) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16033);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16034);cmd.append(gen.formatDouble(vals[0])).append(" ").append(gen.formatDouble(vals[1])).append(" ")
                        .append(gen.formatDouble(vals[2])).append(" ").append(gen.formatDouble(vals[3])).append(" QT")
                        .append("\n");
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16035);break;
            case PathIterator.SEG_CLOSE:if (!__CLB4_5_2_bool0) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16036);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16037);cmd.append(gen.mapCommand("closepath")).append("\n");
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16038);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16039);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16040);break;
            }
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16041);iter.next();
        }
        }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16042);return cmd.toString().trim();
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    protected void processPathIteratorCached(Shape s) throws IOException {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16043);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16044);String cmd = processPathIteratorToString(s.getPathIterator(IDENTITY_TRANSFORM));
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16045);int hash = cmd.hashCode();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16046);if ((((!startCache)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16047)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16048)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16049);if ((((pathHashCache.contains(hash))&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16050)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16051)==0&false))) {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16052);startCache = true;
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16053);pathHashCache.clear();
            } }else {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16054);gen.writeln(cmd);
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16055);pathHashCache.add(hash);
            }
        }}
        }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16056);if ((((startCache)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16057)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16058)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16059);if ((((!pathHashCache.contains(hash))&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16060)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16061)==0&false))) {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16062);gen.writeln("/f" + hash + "{" + cmd + "}def");
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16063);pathHashCache.add(hash);
            }
            }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16064);gen.writeln("f" + hash);
        }
    }}finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Processes a path iterator generating the nexessary painting operations.
     * @param iter PathIterator to process
     * @throws IOException In case of an I/O problem.
     */
    public void processPathIterator(PathIterator iter) throws IOException {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16065);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16066);gen.writeln(processPathIteratorToString(iter));
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Strokes the outline of a <code>Shape</code> using the settings of the
     * current <code>Graphics2D</code> context.  The rendering attributes
     * applied include the <code>Clip</code>, <code>Transform</code>,
     * <code>Paint</code>, <code>Composite</code> and
     * <code>Stroke</code> attributes.
     * @param s the <code>Shape</code> to be rendered
     * @see #setStroke
     * @see #setPaint
     * @see java.awt.Graphics#setColor
     * @see #transform
     * @see #setTransform
     * @see #clip
     * @see #setClip
     * @see #setComposite
     */
    public void draw(Shape s) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16067);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16068);preparePainting();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16069);try {
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16070);gen.saveGraphicsState();

            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16071);AffineTransform trans = getTransform();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16072);boolean newTransform = !trans.isIdentity();

            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16073);if ((((newTransform)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16074)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16075)==0&false))) {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16076);gen.concatMatrix(trans);
            }
            }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16077);Shape imclip = getClip();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16078);if ((((shouldBeClipped(imclip, s))&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16079)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16080)==0&false))) {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16081);writeClip(imclip);
            }
            }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16082);establishColor(getColor());

            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16083);applyPaint(getPaint(), false);
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16084);applyStroke(getStroke());

            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16085);gen.writeln(gen.mapCommand("newpath"));
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16086);processShape(s, false);
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16087);doDrawing(false, true, false);
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16088);gen.restoreGraphicsState();
        } catch (IOException ioe) {
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16089);handleIOException(ioe);
        }
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Determines if a shape interacts with a clipping region.
     * @param clip Shape defining the clipping region
     * @param s Shape to be drawn
     * @return true if code for a clipping region needs to be generated.
     */
    public boolean shouldBeClipped(Shape clip, Shape s) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16090);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16091);if ((((clip == null || s == null)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16092)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16093)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16094);return false;
        }
        }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16095);if ((((s instanceof Line2D)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16096)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16097)==0&false))) {{
            //Line shapes don't work with intersections so always clip
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16098);return true;
        }
        }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16099);Area as = new Area(s);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16100);Area imclip = new Area(clip);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16101);imclip.intersect(as);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16102);return !imclip.equals(as);
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Establishes a clipping region
     * @param s Shape defining the clipping region
     */
    public void writeClip(Shape s) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16103);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16104);if ((((s == null)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16105)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16106)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16107);return;
        }
        }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16108);if ((((!this.clippingDisabled)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16109)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16110)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16111);preparePainting();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16112);try {
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16113);gen.writeln(gen.mapCommand("newpath"));
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16114);processShape(s, false);
                // clip area
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16115);gen.writeln(gen.mapCommand("clip"));
            } catch (IOException ioe) {
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16116);handleIOException(ioe);
            }
        }
    }}finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Applies a new Paint object.
     * @param paint Paint object to use
     * @param fill True if to be applied for filling
     */
    protected void applyPaint(Paint paint, boolean fill) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16117);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16118);preparePainting();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16119);if ((((paint instanceof GradientPaint)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16120)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16121)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16122);System.err.println("NYI: Gradient paint");
        } }else {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16123);if ((((paint instanceof TexturePaint)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16124)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16125)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16126);if ((((fill)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16127)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16128)==0&false))) {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16129);try {
                    // create pattern with texture and use it for filling of a graphics object
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16130);PSTilingPattern psTilingPattern = new PSTilingPattern("Pattern1",
                            (TexturePaint)paint, 0, 0, 3, null);
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16131);gen.write(psTilingPattern.toString(gen.isAcrobatDownsample()));
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16132);gen.writeln("/Pattern " + gen.mapCommand("setcolorspace"));
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16133);gen.writeln(psTilingPattern.getName() + " " + gen.mapCommand("setcolor"));
                } catch (IOException ioe) {
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16134);handleIOException(ioe);
                }
            }
        }}
    }}}finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Applies a new Stroke object.
     * @param stroke Stroke object to use
     */
    protected void applyStroke(Stroke stroke) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16135);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16136);preparePainting();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16137);try {
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16138);applyStroke(stroke, gen);
        } catch (IOException ioe) {
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16139);handleIOException(ioe);
        }
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Applies a new Stroke object.
     * @param stroke the Stroke instance
     * @param gen the PS generator
     * @throws IOException if an I/O error occurs
     */
    public static void applyStroke(Stroke stroke, final PSGenerator gen)
            throws IOException {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16140);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16141);if ((((stroke instanceof BasicStroke)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16142)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16143)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16144);BasicStroke basicStroke = (BasicStroke)stroke;

            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16145);float[] da = basicStroke.getDashArray();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16146);if ((((da != null)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16147)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16148)==0&false))) {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16149);StringBuffer sb = new StringBuffer("[");
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16150);for (int count = 0; (((count < da.length)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16151)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16152)==0&false)); count++) {{
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16153);sb.append(gen.formatDouble(da[count]));
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16154);if ((((count < da.length - 1)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16155)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16156)==0&false))) {{
                        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16157);sb.append(" ");
                    }
                }}
                }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16158);sb.append("] ");
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16159);float offset = basicStroke.getDashPhase();
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16160);sb.append(gen.formatDouble(offset));
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16161);gen.useDash(sb.toString());
            } }else {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16162);gen.useDash(null);
            }
            }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16163);int ec = basicStroke.getEndCap();
            boolean __CLB4_5_2_bool1=false;__CLR4_5_2c9zc9zm68iyhxt.R.inc(16164);switch (ec) {
            case BasicStroke.CAP_BUTT:if (!__CLB4_5_2_bool1) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16165);__CLB4_5_2_bool1=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16166);gen.useLineCap(0);
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16167);break;
            case BasicStroke.CAP_ROUND:if (!__CLB4_5_2_bool1) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16168);__CLB4_5_2_bool1=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16169);gen.useLineCap(1);
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16170);break;
            case BasicStroke.CAP_SQUARE:if (!__CLB4_5_2_bool1) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16171);__CLB4_5_2_bool1=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16172);gen.useLineCap(2);
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16173);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16174);__CLB4_5_2_bool1=true;} __CLR4_5_2c9zc9zm68iyhxt.R.inc(16175);System.err.println("Unsupported line cap: " + ec);
            }

            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16176);int lj = basicStroke.getLineJoin();
            boolean __CLB4_5_2_bool2=false;__CLR4_5_2c9zc9zm68iyhxt.R.inc(16177);switch (lj) {
            case BasicStroke.JOIN_MITER:if (!__CLB4_5_2_bool2) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16178);__CLB4_5_2_bool2=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16179);gen.useLineJoin(0);
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16180);float ml = basicStroke.getMiterLimit();
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16181);gen.useMiterLimit((((ml >= -1 )&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16182)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16183)==0&false))? ml : 1);
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16184);break;
            case BasicStroke.JOIN_ROUND:if (!__CLB4_5_2_bool2) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16185);__CLB4_5_2_bool2=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16186);gen.useLineJoin(1);
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16187);break;
            case BasicStroke.JOIN_BEVEL:if (!__CLB4_5_2_bool2) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16188);__CLB4_5_2_bool2=true;}
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16189);gen.useLineJoin(2);
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16190);break;
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_2c9zc9zm68iyhxt.R.inc(16191);__CLB4_5_2_bool2=true;} __CLR4_5_2c9zc9zm68iyhxt.R.inc(16192);System.err.println("Unsupported line join: " + lj);
            }
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16193);float lw = basicStroke.getLineWidth();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16194);gen.useLineWidth(lw);
        } }else {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16195);System.err.println("Stroke not supported: " + stroke.toString());
        }
    }}finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Renders a {@link RenderedImage},
     * applying a transform from image
     * space into user space before drawing.
     * The transformation from user space into device space is done with
     * the current <code>Transform</code> in the <code>Graphics2D</code>.
     * The specified transformation is applied to the image before the
     * transform attribute in the <code>Graphics2D</code> context is applied.
     * The rendering attributes applied include the <code>Clip</code>,
     * <code>Transform</code>, and <code>Composite</code> attributes. Note
     * that no rendering is done if the specified transform is
     * noninvertible.
     * @param img the image to be rendered
     * @param xform the transformation from image space into user space
     * @see #transform
     * @see #setTransform
     * @see #setComposite
     * @see #clip
     * @see #setClip
     */
    public void drawRenderedImage(RenderedImage img, AffineTransform xform) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16196);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16197);preparePainting();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16198);try {
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16199);AffineTransform at = getTransform();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16200);gen.saveGraphicsState();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16201);gen.concatMatrix(at);
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16202);gen.concatMatrix(xform);
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16203);Shape imclip = getClip();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16204);writeClip(imclip);
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16205);PSImageUtils.renderBitmapImage(img,
                0, 0, img.getWidth(), img.getHeight(), gen, null, false);
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16206);gen.restoreGraphicsState();
        } catch (IOException ioe) {
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16207);handleIOException(ioe);
        }
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Renders a
     * {@link RenderableImage},
     * applying a transform from image space into user space before drawing.
     * The transformation from user space into device space is done with
     * the current <code>Transform</code> in the <code>Graphics2D</code>.
     * The specified transformation is applied to the image before the
     * transform attribute in the <code>Graphics2D</code> context is applied.
     * The rendering attributes applied include the <code>Clip</code>,
     * <code>Transform</code>, and <code>Composite</code> attributes. Note
     * that no rendering is done if the specified transform is
     * noninvertible.
     * <p>
     * Rendering hints set on the <code>Graphics2D</code> object might
     * be used in rendering the <code>RenderableImage</code>.
     * If explicit control is required over specific hints recognized by a
     * specific <code>RenderableImage</code>, or if knowledge of which hints
     * are used is required, then a <code>RenderedImage</code> should be
     * obtained directly from the <code>RenderableImage</code>
     * and rendered using
     * {@link #drawRenderedImage(RenderedImage, AffineTransform) drawRenderedImage}.
     * @param img the image to be rendered
     * @param xform the transformation from image space into user space
     * @see #transform
     * @see #setTransform
     * @see #setComposite
     * @see #clip
     * @see #setClip
     * @see #drawRenderedImage
     */
    public void drawRenderableImage(RenderableImage img,
                                    AffineTransform xform) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16208);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16209);preparePainting();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16210);System.err.println("NYI: drawRenderableImage");
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Establishes the given color in the PostScript interpreter.
     * @param c the color to set
     * @throws IOException In case of an I/O problem
     */
    public void establishColor(Color c) throws IOException {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16211);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16212);gen.useColor(c);
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Renders the text specified by the specified <code>String</code>,
     * using the current <code>Font</code> and <code>Paint</code> attributes
     * in the <code>Graphics2D</code> context.
     * The baseline of the first character is at position
     * (<i>x</i>,&nbsp;<i>y</i>) in the User Space.
     * The rendering attributes applied include the <code>Clip</code>,
     * <code>Transform</code>, <code>Paint</code>, <code>Font</code> and
     * <code>Composite</code> attributes. For characters in script systems
     * such as Hebrew and Arabic, the glyphs can be rendered from right to
     * left, in which case the coordinate supplied is the location of the
     * leftmost character on the baseline.
     * @param s the <code>String</code> to be rendered
     * @param x the x-coordinate where the <code>String</code>
     * should be rendered
     * @param y the y-coordinate where the <code>String</code>
     * should be rendered
     * @see #setPaint
     * @see java.awt.Graphics#setColor
     * @see java.awt.Graphics#setFont
     * @see #setTransform
     * @see #setComposite
     * @see #setClip
     */
    public void drawString(String s, float x, float y) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16213);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16214);try {
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16215);if ((((customTextHandler != null && !textAsShapes)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16216)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16217)==0&false))) {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16218);customTextHandler.drawString(this, s, x, y);
            } }else {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16219);fallbackTextHandler.drawString(this, s, x, y);
            }
        }} catch (IOException ioe) {
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16220);handleIOException(ioe);
        }
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Fills the interior of a <code>Shape</code> using the settings of the
     * <code>Graphics2D</code> context. The rendering attributes applied
     * include the <code>Clip</code>, <code>Transform</code>,
     * <code>Paint</code>, and <code>Composite</code>.
     * @param s the <code>Shape</code> to be filled
     * @see #setPaint
     * @see java.awt.Graphics#setColor
     * @see #transform
     * @see #setTransform
     * @see #setComposite
     * @see #clip
     * @see #setClip
     */
    public void fill(Shape s) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16221);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16222);if ((((!hasAlpha())&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16223)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16224)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16225);preparePainting();
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16226);try {
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16227);gen.saveGraphicsState();

                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16228);AffineTransform trans = getTransform();
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16229);boolean newTransform = !trans.isIdentity();

                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16230);if ((((newTransform)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16231)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16232)==0&false))) {{
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16233);gen.concatMatrix(trans);
                }
                }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16234);Shape imclip = getClip();
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16235);if ((((shouldBeClipped(imclip, s))&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16236)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16237)==0&false))) {{
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16238);writeClip(imclip);
                }

                }__CLR4_5_2c9zc9zm68iyhxt.R.inc(16239);establishColor(getColor());

                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16240);applyPaint(getPaint(), true);

                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16241);gen.writeln(gen.mapCommand("newpath"));
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16242);int windingRule = processShape(s, true);
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16243);doDrawing(true, false,
                    windingRule == PathIterator.WIND_EVEN_ODD);
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16244);gen.restoreGraphicsState();
            } catch (IOException ioe) {
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16245);handleIOException(ioe);
            }
        }
    }}finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    private boolean hasAlpha() {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16246);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16247);Composite composite = getComposite();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16248);return composite instanceof AlphaComposite && ((AlphaComposite) composite).getAlpha() == 0f;
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Commits a painting operation.
     * @param fill filling
     * @param stroke stroking
     * @param nonzero true if the non-zero winding rule should be used when filling
     * @exception IOException In case of an I/O problem
     */
    protected void doDrawing(boolean fill, boolean stroke, boolean nonzero)
                throws IOException {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16249);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16250);preparePainting();
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16251);if ((((fill)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16252)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16253)==0&false))) {{
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16254);if ((((stroke)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16255)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16256)==0&false))) {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16257);if ((((!nonzero)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16258)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16259)==0&false))) {{
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16260);gen.writeln(gen.mapCommand("gsave") + " "
                            + gen.mapCommand("fill") + " "
                            + gen.mapCommand("grestore") + " "
                            + gen.mapCommand("stroke"));
                } }else {{
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16261);gen.writeln(gen.mapCommand("gsave") + " "
                            + gen.mapCommand("eofill") + " "
                            + gen.mapCommand("grestore") + " "
                            + gen.mapCommand("stroke"));
                }
            }} }else {{
                __CLR4_5_2c9zc9zm68iyhxt.R.inc(16262);if ((((!nonzero)&&(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16263)!=0|true))||(__CLR4_5_2c9zc9zm68iyhxt.R.iget(16264)==0&false))) {{
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16265);gen.writeln(gen.mapCommand("fill"));
                } }else {{
                    __CLR4_5_2c9zc9zm68iyhxt.R.inc(16266);gen.writeln(gen.mapCommand("eofill"));
                }
            }}
        }} }else {{
            // if(stroke)
            __CLR4_5_2c9zc9zm68iyhxt.R.inc(16267);gen.writeln(gen.mapCommand("stroke"));
        }
    }}finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Returns the device configuration associated with this
     * <code>Graphics2D</code>.
     * @return the device configuration
     */
    public GraphicsConfiguration getDeviceConfiguration() {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16268);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16269);return new GraphicsConfigurationWithoutTransparency();
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Used to create proper font metrics
     */
    private Graphics2D fmg;

    {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16270);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16271);BufferedImage bi = new BufferedImage(1, 1,
                                             BufferedImage.TYPE_INT_ARGB);

        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16272);fmg = bi.createGraphics();
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Gets the font metrics for the specified font.
     * @return    the font metrics for the specified font.
     * @param     f the specified font
     * @see       java.awt.Graphics#getFont
     * @see       java.awt.FontMetrics
     * @see       java.awt.Graphics#getFontMetrics()
     */
    public java.awt.FontMetrics getFontMetrics(java.awt.Font f) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16273);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16274);return fmg.getFontMetrics(f);
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /**
     * Sets the paint mode of this graphics context to alternate between
     * this graphics context's current color and the new specified color.
     * This specifies that logical pixel operations are performed in the
     * XOR mode, which alternates pixels between the current color and
     * a specified XOR color.
     * <p>
     * When drawing operations are performed, pixels which are the
     * current color are changed to the specified color, and vice versa.
     * <p>
     * Pixels that are of colors other than those two colors are changed
     * in an unpredictable but reversible manner; if the same figure is
     * drawn twice, then all pixels are restored to their original values.
     * @param     c1 the XOR alternation color
     */
    public void setXORMode(Color c1) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16275);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16276);System.err.println("NYI: setXORMode");
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}


    /**
     * Copies an area of the component by a distance specified by
     * <code>dx</code> and <code>dy</code>. From the point specified
     * by <code>x</code> and <code>y</code>, this method
     * copies downwards and to the right.  To copy an area of the
     * component to the left or upwards, specify a negative value for
     * <code>dx</code> or <code>dy</code>.
     * If a portion of the source rectangle lies outside the bounds
     * of the component, or is obscured by another window or component,
     * <code>copyArea</code> will be unable to copy the associated
     * pixels. The area that is omitted can be refreshed by calling
     * the component's <code>paint</code> method.
     * @param       x the <i>x</i> coordinate of the source rectangle.
     * @param       y the <i>y</i> coordinate of the source rectangle.
     * @param       width the width of the source rectangle.
     * @param       height the height of the source rectangle.
     * @param       dx the horizontal distance to copy the pixels.
     * @param       dy the vertical distance to copy the pixels.
     */
    public void copyArea(int x, int y, int width, int height, int dx,
                         int dy) {try{__CLR4_5_2c9zc9zm68iyhxt.R.inc(16277);
        __CLR4_5_2c9zc9zm68iyhxt.R.inc(16278);System.err.println("NYI: copyArea");
    }finally{__CLR4_5_2c9zc9zm68iyhxt.R.flushNeeded();}}

    /* --- for debugging
    public void transform(AffineTransform tx) {
        System.out.println("transform(" + toArray(tx) + ")");
        super.transform(zx);
    }

    public void scale(double sx, double sy) {
        System.out.println("scale(" + sx + ", " + sy + ")");
        super.scale(sx, sy);
    }

    public void translate(double tx, double ty) {
        System.out.println("translate(double " + tx + ", " + ty + ")");
        super.translate(tx, ty);
    }

    public void translate(int tx, int ty) {
        System.out.println("translate(int " + tx + ", " + ty + ")");
        super.translate(tx, ty);
    }
    */

}
