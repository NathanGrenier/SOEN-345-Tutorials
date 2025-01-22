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

/* $Id: AbstractGraphics2D.java 1739071 2016-04-14 12:30:21Z ssteiner $ */

package org.apache.xmlgraphics.java2d;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Map;

// CSOFF: NeedBraces
// CSOFF: ParameterName
// CSOFF: WhitespaceAround

/**
 * This extension of the <tt>java.awt.Graphics2D</tt> abstract class
 * is still abstract, but it implements a lot of the <tt>Graphics2D</tt>
 * method in a way that concrete implementations can reuse.
 *
 * This class uses a <tt>GraphicContext</tt> to store the state of
 * its various attributes that control the rendering, such as the
 * current <tt>Font</tt>, <tt>Paint</tt> or clip.
 *
 * Concrete implementations can focus on implementing the rendering
 * methods, such as <tt>drawShape</tt>. As a convenience, rendering
 * methods that can be expressed with other rendering methods (e.g.,
 * <tt>drawRect</tt> can be expressed as <tt>draw(new Rectangle(..))</tt>),
 * are implemented by <tt>AbstractGraphics2D</tt>
 *
 * @version $Id: AbstractGraphics2D.java 1739071 2016-04-14 12:30:21Z ssteiner $
 * @see org.apache.xmlgraphics.java2d.GraphicContext
 *
 * Originally authored by Vincent Hardy.
 */
public abstract class AbstractGraphics2D extends Graphics2D implements Cloneable {public static class __CLR4_5_2b4tb4tm68iyhqq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,14623,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Current state of the Graphic Context. The GraphicsContext
     * class manages the state of this <tt>Graphics2D</tt> graphic context
     * attributes.
     */
    protected GraphicContext gc;

    /**
     * Text handling strategy.
     */
    protected boolean textAsShapes;

    /**
     * Protection agains infinite recursion
     */
    protected boolean inPossibleRecursion;

    /**
     * @param textAsShapes if true, all text is turned into shapes in the
     *        convertion. No text is output.
     *
     */
    public AbstractGraphics2D(boolean textAsShapes) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14429);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14430);this.textAsShapes = textAsShapes;
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Creates a new AbstractGraphics2D from an existing instance.
     * @param g the AbstractGraphics2D whose properties should be copied
     */
    public AbstractGraphics2D(AbstractGraphics2D g) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14431);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14432);this.gc = (GraphicContext)g.gc.clone();
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14433);this.gc.validateTransformStack();
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14434);this.textAsShapes = g.textAsShapes;
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Translates the origin of the graphics context to the point
     * (<i>x</i>,&nbsp;<i>y</i>) in the current coordinate system.
     * Modifies this graphics context so that its new origin corresponds
     * to the point (<i>x</i>,&nbsp;<i>y</i>) in this graphics context's
     * original coordinate system.  All coordinates used in subsequent
     * rendering operations on this graphics context will be relative
     * to this new origin.
     * @param  x   the <i>x</i> coordinate.
     * @param  y   the <i>y</i> coordinate.
     */
    public void translate(int x, int y) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14435);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14436);gc.translate(x, y);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Gets this graphics context's current color.
     * @return    this graphics context's current color.
     * @see       java.awt.Color
     * @see       java.awt.Graphics#setColor
     */
    public Color getColor() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14437);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14438);return gc.getColor();
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Sets this graphics context's current color to the specified
     * color. All subsequent graphics operations using this graphics
     * context use this specified color.
     * @param     c   the new rendering color.
     * @see       java.awt.Color
     * @see       java.awt.Graphics#getColor
     */
    public void setColor(Color c) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14439);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14440);gc.setColor(c);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Sets the paint mode of this graphics context to overwrite the
     * destination with this graphics context's current color.
     * This sets the logical pixel operation function to the paint or
     * overwrite mode.  All subsequent rendering operations will
     * overwrite the destination with the current color.
     */
    public void setPaintMode() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14441);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14442);gc.setComposite(AlphaComposite.SrcOver);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Gets the current font.
     * @return    this graphics context's current font.
     * @see       java.awt.Font
     * @see       java.awt.Graphics#setFont
     */
    public Font getFont() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14443);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14444);return gc.getFont();
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Sets this graphics context's font to the specified font.
     * All subsequent text operations using this graphics context
     * use this font.
     * @param  font   the font.
     * @see     java.awt.Graphics#getFont
     */
    public void setFont(Font font) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14445);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14446);gc.setFont(font);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Returns the bounding rectangle of the current clipping area.
     * This method refers to the user clip, which is independent of the
     * clipping associated with device bounds and window visibility.
     * If no clip has previously been set, or if the clip has been
     * cleared using <code>setClip(null)</code>, this method returns
     * <code>null</code>.
     * The coordinates in the rectangle are relative to the coordinate
     * system origin of this graphics context.
     * @return      the bounding rectangle of the current clipping area,
     *              or <code>null</code> if no clip is set.
     * @see         java.awt.Graphics#getClip
     * @see         java.awt.Graphics#clipRect
     * @see         java.awt.Graphics#setClip(int, int, int, int)
     * @see         java.awt.Graphics#setClip(Shape)
     * @since       JDK1.1
     */
    public Rectangle getClipBounds() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14447);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14448);return gc.getClipBounds();
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Intersects the current clip with the specified rectangle.
     * The resulting clipping area is the intersection of the current
     * clipping area and the specified rectangle.  If there is no
     * current clipping area, either because the clip has never been
     * set, or the clip has been cleared using <code>setClip(null)</code>,
     * the specified rectangle becomes the new clip.
     * This method sets the user clip, which is independent of the
     * clipping associated with device bounds and window visibility.
     * This method can only be used to make the current clip smaller.
     * To set the current clip larger, use any of the setClip methods.
     * Rendering operations have no effect outside of the clipping area.
     * @param x the x coordinate of the rectangle to intersect the clip with
     * @param y the y coordinate of the rectangle to intersect the clip with
     * @param width the width of the rectangle to intersect the clip with
     * @param height the height of the rectangle to intersect the clip with
     * @see #setClip(int, int, int, int)
     * @see #setClip(Shape)
     */
    public void clipRect(int x, int y, int width, int height) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14449);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14450);gc.clipRect(x, y, width, height);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Sets the current clip to the rectangle specified by the given
     * coordinates.  This method sets the user clip, which is
     * independent of the clipping associated with device bounds
     * and window visibility.
     * Rendering operations have no effect outside of the clipping area.
     * @param       x the <i>x</i> coordinate of the new clip rectangle.
     * @param       y the <i>y</i> coordinate of the new clip rectangle.
     * @param       width the width of the new clip rectangle.
     * @param       height the height of the new clip rectangle.
     * @see         java.awt.Graphics#clipRect
     * @see         java.awt.Graphics#setClip(Shape)
     * @since       JDK1.1
     */
    public void setClip(int x, int y, int width, int height) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14451);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14452);gc.setClip(x, y, width, height);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Gets the current clipping area.
     * This method returns the user clip, which is independent of the
     * clipping associated with device bounds and window visibility.
     * If no clip has previously been set, or if the clip has been
     * cleared using <code>setClip(null)</code>, this method returns
     * <code>null</code>.
     * @return      a <code>Shape</code> object representing the
     *              current clipping area, or <code>null</code> if
     *              no clip is set.
     * @see         java.awt.Graphics#getClipBounds()
     * @see         java.awt.Graphics#clipRect(int, int, int, int)
     * @see         java.awt.Graphics#setClip(int, int, int, int)
     * @see         java.awt.Graphics#setClip(Shape)
     * @since       JDK1.1
     */
    public Shape getClip() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14453);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14454);return gc.getClip();
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Sets the current clipping area to an arbitrary clip shape.
     * Not all objects that implement the <code>Shape</code>
     * interface can be used to set the clip.  The only
     * <code>Shape</code> objects that are guaranteed to be
     * supported are <code>Shape</code> objects that are
     * obtained via the <code>getClip</code> method and via
     * <code>Rectangle</code> objects.  This method sets the
     * user clip, which is independent of the clipping associated
     * with device bounds and window visibility.
     * @param clip the <code>Shape</code> to use to set the clip
     * @see         java.awt.Graphics#getClip()
     * @see         java.awt.Graphics#clipRect
     * @see         java.awt.Graphics#setClip(int, int, int, int)
     * @since       JDK1.1
     */
    public void setClip(Shape clip) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14455);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14456);gc.setClip(clip);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Draws a line, using the current color, between the points
     * <code>(x1,&nbsp;y1)</code> and <code>(x2,&nbsp;y2)</code>
     * in this graphics context's coordinate system.
     * @param   x1  the first point's <i>x</i> coordinate.
     * @param   y1  the first point's <i>y</i> coordinate.
     * @param   x2  the second point's <i>x</i> coordinate.
     * @param   y2  the second point's <i>y</i> coordinate.
     */
    public void drawLine(int x1, int y1, int x2, int y2) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14457);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14458);Line2D line = new Line2D.Float(x1, y1, x2, y2);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14459);draw(line);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Fills the specified rectangle.
     * The left and right edges of the rectangle are at
     * <code>x</code> and <code>x&nbsp;+&nbsp;width&nbsp;-&nbsp;1</code>.
     * The top and bottom edges are at
     * <code>y</code> and <code>y&nbsp;+&nbsp;height&nbsp;-&nbsp;1</code>.
     * The resulting rectangle covers an area
     * <code>width</code> pixels wide by
     * <code>height</code> pixels tall.
     * The rectangle is filled using the graphics context's current color.
     * @param         x   the <i>x</i> coordinate
     *                         of the rectangle to be filled.
     * @param         y   the <i>y</i> coordinate
     *                         of the rectangle to be filled.
     * @param         width   the width of the rectangle to be filled.
     * @param         height   the height of the rectangle to be filled.
     * @see           java.awt.Graphics#clearRect
     * @see           java.awt.Graphics#drawRect
     */
    public void fillRect(int x, int y, int width, int height) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14460);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14461);Rectangle rect = new Rectangle(x, y, width, height);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14462);fill(rect);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    public void drawRect(int x, int y, int width, int height) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14463);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14464);Rectangle rect = new Rectangle(x, y, width, height);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14465);draw(rect);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}



    /**
     * Clears the specified rectangle by filling it with the background
     * color of the current drawing surface. This operation does not
     * use the current paint mode.
     * <p>
     * Beginning with Java&nbsp;1.1, the background color
     * of offscreen images may be system dependent. Applications should
     * use <code>setColor</code> followed by <code>fillRect</code> to
     * ensure that an offscreen image is cleared to a specific color.
     * @param       x the <i>x</i> coordinate of the rectangle to clear.
     * @param       y the <i>y</i> coordinate of the rectangle to clear.
     * @param       width the width of the rectangle to clear.
     * @param       height the height of the rectangle to clear.
     * @see         java.awt.Graphics#fillRect(int, int, int, int)
     * @see         java.awt.Graphics#drawRect
     * @see         java.awt.Graphics#setColor(java.awt.Color)
     * @see         java.awt.Graphics#setPaintMode
     * @see         java.awt.Graphics#setXORMode(java.awt.Color)
     */
    public void clearRect(int x, int y, int width, int height) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14466);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14467);Paint paint = gc.getPaint();
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14468);gc.setColor(gc.getBackground());
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14469);fillRect(x, y, width, height);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14470);gc.setPaint(paint);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Draws an outlined round-cornered rectangle using this graphics
     * context's current color. The left and right edges of the rectangle
     * are at <code>x</code> and <code>x&nbsp;+&nbsp;width</code>,
     * respectively. The top and bottom edges of the rectangle are at
     * <code>y</code> and <code>y&nbsp;+&nbsp;height</code>.
     * @param      x the <i>x</i> coordinate of the rectangle to be drawn.
     * @param      y the <i>y</i> coordinate of the rectangle to be drawn.
     * @param      width the width of the rectangle to be drawn.
     * @param      height the height of the rectangle to be drawn.
     * @param      arcWidth the horizontal diameter of the arc
     *                    at the four corners.
     * @param      arcHeight the vertical diameter of the arc
     *                    at the four corners.
     * @see        java.awt.Graphics#fillRoundRect
     */
    public void drawRoundRect(int x, int y, int width, int height,
                              int arcWidth, int arcHeight) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14471);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14472);RoundRectangle2D rect = new RoundRectangle2D.Float(x, y, width, height, arcWidth, arcHeight);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14473);draw(rect);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Fills the specified rounded corner rectangle with the current color.
     * The left and right edges of the rectangle
     * are at <code>x</code> and <code>x&nbsp;+&nbsp;width&nbsp;-&nbsp;1</code>,
     * respectively. The top and bottom edges of the rectangle are at
     * <code>y</code> and <code>y&nbsp;+&nbsp;height&nbsp;-&nbsp;1</code>.
     * @param       x the <i>x</i> coordinate of the rectangle to be filled.
     * @param       y the <i>y</i> coordinate of the rectangle to be filled.
     * @param       width the width of the rectangle to be filled.
     * @param       height the height of the rectangle to be filled.
     * @param       arcWidth the horizontal diameter
     *                     of the arc at the four corners.
     * @param       arcHeight the vertical diameter
     *                     of the arc at the four corners.
     * @see         java.awt.Graphics#drawRoundRect
     */
    public void fillRoundRect(int x, int y, int width, int height,
                              int arcWidth, int arcHeight) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14474);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14475);RoundRectangle2D rect = new RoundRectangle2D.Float(x, y, width, height, arcWidth, arcHeight);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14476);fill(rect);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Draws the outline of an oval.
     * The result is a circle or ellipse that fits within the
     * rectangle specified by the <code>x</code>, <code>y</code>,
     * <code>width</code>, and <code>height</code> arguments.
     * <p>
     * The oval covers an area that is
     * <code>width&nbsp;+&nbsp;1</code> pixels wide
     * and <code>height&nbsp;+&nbsp;1</code> pixels tall.
     * @param       x the <i>x</i> coordinate of the upper left
     *                     corner of the oval to be drawn.
     * @param       y the <i>y</i> coordinate of the upper left
     *                     corner of the oval to be drawn.
     * @param       width the width of the oval to be drawn.
     * @param       height the height of the oval to be drawn.
     * @see         java.awt.Graphics#fillOval
     */
    public void drawOval(int x, int y, int width, int height) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14477);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14478);Ellipse2D oval = new Ellipse2D.Float(x, y, width, height);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14479);draw(oval);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Fills an oval bounded by the specified rectangle with the
     * current color.
     * @param       x the <i>x</i> coordinate of the upper left corner
     *                     of the oval to be filled.
     * @param       y the <i>y</i> coordinate of the upper left corner
     *                     of the oval to be filled.
     * @param       width the width of the oval to be filled.
     * @param       height the height of the oval to be filled.
     * @see         java.awt.Graphics#drawOval
     */
    public void fillOval(int x, int y, int width, int height) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14480);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14481);Ellipse2D oval = new Ellipse2D.Float(x, y, width, height);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14482);fill(oval);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Draws the outline of a circular or elliptical arc
     * covering the specified rectangle.
     * <p>
     * The resulting arc begins at <code>startAngle</code> and extends
     * for <code>arcAngle</code> degrees, using the current color.
     * Angles are interpreted such that 0&nbsp;degrees
     * is at the 3&nbsp;o'clock position.
     * A positive value indicates a counter-clockwise rotation
     * while a negative value indicates a clockwise rotation.
     * <p>
     * The center of the arc is the center of the rectangle whose origin
     * is (<i>x</i>,&nbsp;<i>y</i>) and whose size is specified by the
     * <code>width</code> and <code>height</code> arguments.
     * <p>
     * The resulting arc covers an area
     * <code>width&nbsp;+&nbsp;1</code> pixels wide
     * by <code>height&nbsp;+&nbsp;1</code> pixels tall.
     * <p>
     * The angles are specified relative to the non-square extents of
     * the bounding rectangle such that 45 degrees always falls on the
     * line from the center of the ellipse to the upper right corner of
     * the bounding rectangle. As a result, if the bounding rectangle is
     * noticeably longer in one axis than the other, the angles to the
     * start and end of the arc segment will be skewed farther along the
     * longer axis of the bounds.
     * @param        x the <i>x</i> coordinate of the
     *                    upper-left corner of the arc to be drawn.
     * @param        y the <i>y</i>  coordinate of the
     *                    upper-left corner of the arc to be drawn.
     * @param        width the width of the arc to be drawn.
     * @param        height the height of the arc to be drawn.
     * @param        startAngle the beginning angle.
     * @param        arcAngle the angular extent of the arc,
     *                    relative to the start angle.
     * @see         java.awt.Graphics#fillArc
     */
    public void drawArc(int x, int y, int width, int height,
                        int startAngle, int arcAngle) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14483);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14484);Arc2D arc = new Arc2D.Float(x, y, width, height, startAngle, arcAngle, Arc2D.OPEN);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14485);draw(arc);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Fills a circular or elliptical arc covering the specified rectangle.
     * <p>
     * The resulting arc begins at <code>startAngle</code> and extends
     * for <code>arcAngle</code> degrees.
     * Angles are interpreted such that 0&nbsp;degrees
     * is at the 3&nbsp;o'clock position.
     * A positive value indicates a counter-clockwise rotation
     * while a negative value indicates a clockwise rotation.
     * <p>
     * The center of the arc is the center of the rectangle whose origin
     * is (<i>x</i>,&nbsp;<i>y</i>) and whose size is specified by the
     * <code>width</code> and <code>height</code> arguments.
     * <p>
     * The resulting arc covers an area
     * <code>width&nbsp;+&nbsp;1</code> pixels wide
     * by <code>height&nbsp;+&nbsp;1</code> pixels tall.
     * <p>
     * The angles are specified relative to the non-square extents of
     * the bounding rectangle such that 45 degrees always falls on the
     * line from the center of the ellipse to the upper right corner of
     * the bounding rectangle. As a result, if the bounding rectangle is
     * noticeably longer in one axis than the other, the angles to the
     * start and end of the arc segment will be skewed farther along the
     * longer axis of the bounds.
     * @param        x the <i>x</i> coordinate of the
     *                    upper-left corner of the arc to be filled.
     * @param        y the <i>y</i>  coordinate of the
     *                    upper-left corner of the arc to be filled.
     * @param        width the width of the arc to be filled.
     * @param        height the height of the arc to be filled.
     * @param        startAngle the beginning angle.
     * @param        arcAngle the angular extent of the arc,
     *                    relative to the start angle.
     * @see         java.awt.Graphics#drawArc
     */
    public void fillArc(int x, int y, int width, int height,
                        int startAngle, int arcAngle) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14486);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14487);Arc2D arc = new Arc2D.Float(x, y, width, height, startAngle, arcAngle, Arc2D.PIE);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14488);fill(arc);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Draws a sequence of connected lines defined by
     * arrays of <i>x</i> and <i>y</i> coordinates.
     * Each pair of (<i>x</i>,&nbsp;<i>y</i>) coordinates defines a point.
     * The figure is not closed if the first point
     * differs from the last point.
     * @param       xPoints an array of <i>x</i> points
     * @param       yPoints an array of <i>y</i> points
     * @param       nPoints the total number of points
     * @see         java.awt.Graphics#drawPolygon(int[], int[], int)
     * @since       JDK1.1
     */
    public void drawPolyline(int[] xPoints, int[] yPoints,
                             int nPoints) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14489);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14490);if ((((nPoints > 0)&&(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14491)!=0|true))||(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14492)==0&false))) {{
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14493);GeneralPath path = new GeneralPath();
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14494);path.moveTo(xPoints[0], yPoints[0]);
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14495);for (int i = 1; (((i < nPoints)&&(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14496)!=0|true))||(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14497)==0&false)); i++) {{
                __CLR4_5_2b4tb4tm68iyhqq.R.inc(14498);path.lineTo(xPoints[i], yPoints[i]);
            }

            }__CLR4_5_2b4tb4tm68iyhqq.R.inc(14499);draw(path);
        }
    }}finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Draws a closed polygon defined by
     * arrays of <i>x</i> and <i>y</i> coordinates.
     * Each pair of (<i>x</i>,&nbsp;<i>y</i>) coordinates defines a point.
     * <p>
     * This method draws the polygon defined by <code>nPoint</code> line
     * segments, where the first <code>nPoint&nbsp;-&nbsp;1</code>
     * line segments are line segments from
     * <code>(xPoints[i&nbsp;-&nbsp;1],&nbsp;yPoints[i&nbsp;-&nbsp;1])</code>
     * to <code>(xPoints[i],&nbsp;yPoints[i])</code>, for
     * 1&nbsp;&le;&nbsp;<i>i</i>&nbsp;&le;&nbsp;<code>nPoints</code>.
     * The figure is automatically closed by drawing a line connecting
     * the final point to the first point, if those points are different.
     * @param        xPoints   a an array of <code>x</code> coordinates.
     * @param        yPoints   a an array of <code>y</code> coordinates.
     * @param        nPoints   a the total number of points.
     * @see          java.awt.Graphics#fillPolygon(int[],int[],int)
     * @see          java.awt.Graphics#drawPolyline
     */
    public void drawPolygon(int[] xPoints, int[] yPoints,
                            int nPoints) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14500);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14501);Polygon polygon = new Polygon(xPoints, yPoints, nPoints);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14502);draw(polygon);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Fills a closed polygon defined by
     * arrays of <i>x</i> and <i>y</i> coordinates.
     * <p>
     * This method draws the polygon defined by <code>nPoint</code> line
     * segments, where the first <code>nPoint&nbsp;-&nbsp;1</code>
     * line segments are line segments from
     * <code>(xPoints[i&nbsp;-&nbsp;1],&nbsp;yPoints[i&nbsp;-&nbsp;1])</code>
     * to <code>(xPoints[i],&nbsp;yPoints[i])</code>, for
     * 1&nbsp;&le;&nbsp;<i>i</i>&nbsp;&le;&nbsp;<code>nPoints</code>.
     * The figure is automatically closed by drawing a line connecting
     * the final point to the first point, if those points are different.
     * <p>
     * The area inside the polygon is defined using an
     * even-odd fill rule, also known as the alternating rule.
     * @param        xPoints   a an array of <code>x</code> coordinates.
     * @param        yPoints   a an array of <code>y</code> coordinates.
     * @param        nPoints   a the total number of points.
     * @see          java.awt.Graphics#drawPolygon(int[], int[], int)
     */
    public void fillPolygon(int[] xPoints, int[] yPoints,
                            int nPoints) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14503);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14504);Polygon polygon = new Polygon(xPoints, yPoints, nPoints);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14505);fill(polygon);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Draws the text given by the specified string, using this
     * graphics context's current font and color. The baseline of the
     * first character is at position (<i>x</i>,&nbsp;<i>y</i>) in this
     * graphics context's coordinate system.
     * @param       str      the string to be drawn.
     * @param       x        the <i>x</i> coordinate.
     * @param       y        the <i>y</i> coordinate.
     * @see         java.awt.Graphics#drawBytes
     * @see         java.awt.Graphics#drawChars
     */
    public void drawString(String str, int x, int y) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14506);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14507);drawString(str, (float)x, (float)y);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Generic implementation for drawing attributed strings using TextLayout.
     *
     * @param iterator the iterator whose text is to be rendered
     * @param x        the x coordinate where the iterator's text is to be rendered
     * @param y        the y coordinate where the iterator's text is to be rendered
     * @see java.awt.Graphics2D#drawString (java.text.AttributedCharacterIterator,
     *      float, float)
     */
    public void drawString(AttributedCharacterIterator iterator, float x, float y) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14508);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14509);if ((((inPossibleRecursion)&&(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14510)!=0|true))||(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14511)==0&false))) {{
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14512);System.err.println("Called itself: drawString(AttributedCharacterIterator)");
        } }else {{
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14513);inPossibleRecursion = true;
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14514);TextLayout layout = new TextLayout(iterator, getFontRenderContext());
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14515);layout.draw(this, x, y);
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14516);inPossibleRecursion = false;
        }
    }}finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Draws the text given by the specified iterator, using this
     * graphics context's current color. The iterator has to specify a font
     * for each character. The baseline of the
     * first character is at position (<i>x</i>,&nbsp;<i>y</i>) in this
     * graphics context's coordinate system.
     * @param       iterator the iterator whose text is to be drawn
     * @param       x        the <i>x</i> coordinate.
     * @param       y        the <i>y</i> coordinate.
     * @see         java.awt.Graphics#drawBytes
     * @see         java.awt.Graphics#drawChars
     */
    public void drawString(AttributedCharacterIterator iterator,
                           int x, int y) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14517);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14518);drawString(iterator, (float)x, (float)y);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Draws as much of the specified image as is currently available.
     * The image is drawn with its top-left corner at
     * (<i>x</i>,&nbsp;<i>y</i>) in this graphics context's coordinate
     * space.  Transparent pixels are drawn in the specified
     * background color.
     * <p>
     * This operation is equivalent to filling a rectangle of the
     * width and height of the specified image with the given color and then
     * drawing the image on top of it, but possibly more efficient.
     * <p>
     * This method returns immediately in all cases, even if the
     * complete image has not yet been loaded, and it has not been dithered
     * and converted for the current output device.
     * <p>
     * If the image has not yet been completely loaded, then
     * <code>drawImage</code> returns <code>false</code>. As more of
     * the image becomes available, the process that draws the image notifies
     * the specified image observer.
     * @param    img    the specified image to be drawn.
     * @param    x      the <i>x</i> coordinate.
     * @param    y      the <i>y</i> coordinate.
     * @param    bgcolor the background color to paint under the
     *                         non-opaque portions of the image.
     * @param    observer    object to be notified as more of
     *                          the image is converted.
     * @see      java.awt.Image
     * @see      java.awt.image.ImageObserver
     * @see      java.awt.image.ImageObserver#imageUpdate(java.awt.Image, int, int, int, int, int)
     */
    public boolean drawImage(Image img, int x, int y,
                             Color bgcolor,
                             ImageObserver observer) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14519);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14520);return drawImage(img, x, y, img.getWidth(null), img.getHeight(null),
                         bgcolor, observer);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Draws as much of the specified image as has already been scaled
     * to fit inside the specified rectangle.
     * <p>
     * The image is drawn inside the specified rectangle of this
     * graphics context's coordinate space, and is scaled if
     * necessary. Transparent pixels are drawn in the specified
     * background color.
     * This operation is equivalent to filling a rectangle of the
     * width and height of the specified image with the given color and then
     * drawing the image on top of it, but possibly more efficient.
     * <p>
     * This method returns immediately in all cases, even if the
     * entire image has not yet been scaled, dithered, and converted
     * for the current output device.
     * If the current output representation is not yet complete then
     * <code>drawImage</code> returns <code>false</code>. As more of
     * the image becomes available, the process that draws the image notifies
     * the specified image observer.
     * <p>
     * A scaled version of an image will not necessarily be
     * available immediately just because an unscaled version of the
     * image has been constructed for this output device.  Each size of
     * the image may be cached separately and generated from the original
     * data in a separate image production sequence.
     * @param    img       the specified image to be drawn.
     * @param    x         the <i>x</i> coordinate.
     * @param    y         the <i>y</i> coordinate.
     * @param    width     the width of the rectangle.
     * @param    height    the height of the rectangle.
     * @param    bgcolor   the background color to paint under the
     *                         non-opaque portions of the image.
     * @param    observer    object to be notified as more of
     *                          the image is converted.
     * @see      java.awt.Image
     * @see      java.awt.image.ImageObserver
     * @see      java.awt.image.ImageObserver#imageUpdate(java.awt.Image, int, int, int, int, int)
     */
    public boolean drawImage(Image img, int x, int y,
                             int width, int height,
                             Color bgcolor,
                             ImageObserver observer) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14521);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14522);Paint paint = gc.getPaint();
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14523);gc.setPaint(bgcolor);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14524);fillRect(x, y, width, height);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14525);gc.setPaint(paint);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14526);drawImage(img, x, y, width, height, observer);

        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14527);return true;
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Draws as much of the specified area of the specified image as is
     * currently available, scaling it on the fly to fit inside the
     * specified area of the destination drawable surface. Transparent pixels
     * do not affect whatever pixels are already there.
     * <p>
     * This method returns immediately in all cases, even if the
     * image area to be drawn has not yet been scaled, dithered, and converted
     * for the current output device.
     * If the current output representation is not yet complete then
     * <code>drawImage</code> returns <code>false</code>. As more of
     * the image becomes available, the process that draws the image notifies
     * the specified image observer.
     * <p>
     * This method always uses the unscaled version of the image
     * to render the scaled rectangle and performs the required
     * scaling on the fly. It does not use a cached, scaled version
     * of the image for this operation. Scaling of the image from source
     * to destination is performed such that the first coordinate
     * of the source rectangle is mapped to the first coordinate of
     * the destination rectangle, and the second source coordinate is
     * mapped to the second destination coordinate. The subimage is
     * scaled and flipped as needed to preserve those mappings.
     * @param       img the specified image to be drawn
     * @param       dx1 the <i>x</i> coordinate of the first corner of the
     *                    destination rectangle.
     * @param       dy1 the <i>y</i> coordinate of the first corner of the
     *                    destination rectangle.
     * @param       dx2 the <i>x</i> coordinate of the second corner of the
     *                    destination rectangle.
     * @param       dy2 the <i>y</i> coordinate of the second corner of the
     *                    destination rectangle.
     * @param       sx1 the <i>x</i> coordinate of the first corner of the
     *                    source rectangle.
     * @param       sy1 the <i>y</i> coordinate of the first corner of the
     *                    source rectangle.
     * @param       sx2 the <i>x</i> coordinate of the second corner of the
     *                    source rectangle.
     * @param       sy2 the <i>y</i> coordinate of the second corner of the
     *                    source rectangle.
     * @param       observer object to be notified as more of the image is
     *                    scaled and converted.
     * @see         java.awt.Image
     * @see         java.awt.image.ImageObserver
     * @see         java.awt.image.ImageObserver#imageUpdate(java.awt.Image, int, int, int, int, int)
     * @since       JDK1.1
     */
    public boolean drawImage(Image img,
                             int dx1, int dy1, int dx2, int dy2,
                             int sx1, int sy1, int sx2, int sy2,
                             ImageObserver observer) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14528);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14529);BufferedImage src = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14530);Graphics2D g = src.createGraphics();
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14531);g.drawImage(img, 0, 0, null);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14532);g.dispose();

        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14533);src = src.getSubimage(sx1, sy1, sx2 - sx1, sy2 - sy1);

        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14534);return drawImage(src, dx1, dy1, dx2 - dx1, dy2 - dy1, observer);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Draws as much of the specified area of the specified image as is
     * currently available, scaling it on the fly to fit inside the
     * specified area of the destination drawable surface.
     * <p>
     * Transparent pixels are drawn in the specified background color.
     * This operation is equivalent to filling a rectangle of the
     * width and height of the specified image with the given color and then
     * drawing the image on top of it, but possibly more efficient.
     * <p>
     * This method returns immediately in all cases, even if the
     * image area to be drawn has not yet been scaled, dithered, and converted
     * for the current output device.
     * If the current output representation is not yet complete then
     * <code>drawImage</code> returns <code>false</code>. As more of
     * the image becomes available, the process that draws the image notifies
     * the specified image observer.
     * <p>
     * This method always uses the unscaled version of the image
     * to render the scaled rectangle and performs the required
     * scaling on the fly. It does not use a cached, scaled version
     * of the image for this operation. Scaling of the image from source
     * to destination is performed such that the first coordinate
     * of the source rectangle is mapped to the first coordinate of
     * the destination rectangle, and the second source coordinate is
     * mapped to the second destination coordinate. The subimage is
     * scaled and flipped as needed to preserve those mappings.
     * @param       img the specified image to be drawn
     * @param       dx1 the <i>x</i> coordinate of the first corner of the
     *                    destination rectangle.
     * @param       dy1 the <i>y</i> coordinate of the first corner of the
     *                    destination rectangle.
     * @param       dx2 the <i>x</i> coordinate of the second corner of the
     *                    destination rectangle.
     * @param       dy2 the <i>y</i> coordinate of the second corner of the
     *                    destination rectangle.
     * @param       sx1 the <i>x</i> coordinate of the first corner of the
     *                    source rectangle.
     * @param       sy1 the <i>y</i> coordinate of the first corner of the
     *                    source rectangle.
     * @param       sx2 the <i>x</i> coordinate of the second corner of the
     *                    source rectangle.
     * @param       sy2 the <i>y</i> coordinate of the second corner of the
     *                    source rectangle.
     * @param       bgcolor the background color to paint under the
     *                    non-opaque portions of the image.
     * @param       observer object to be notified as more of the image is
     *                    scaled and converted.
     * @see         java.awt.Image
     * @see         java.awt.image.ImageObserver
     * @see         java.awt.image.ImageObserver#imageUpdate(java.awt.Image, int, int, int, int, int)
     * @since       JDK1.1
     */
    public boolean drawImage(Image img,
                             int dx1, int dy1, int dx2, int dy2,
                             int sx1, int sy1, int sx2, int sy2,
                             Color bgcolor,
                             ImageObserver observer) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14535);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14536);Paint paint = gc.getPaint();
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14537);gc.setPaint(bgcolor);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14538);fillRect(dx1, dy1, dx2 - dx1, dy2 - dy1);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14539);gc.setPaint(paint);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14540);return drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Renders an image, applying a transform from image space into user space
     * before drawing.
     * The transformation from user space into device space is done with
     * the current <code>Transform</code> in the <code>Graphics2D</code>.
     * The specified transformation is applied to the image before the
     * transform attribute in the <code>Graphics2D</code> context is applied.
     * The rendering attributes applied include the <code>Clip</code>,
     * <code>Transform</code>, and <code>Composite</code> attributes.
     * Note that no rendering is done if the specified transform is
     * noninvertible.
     * @param img the <code>Image</code> to be rendered
     * @param xform the transformation from image space into user space
     * @param obs the {@link ImageObserver}
     * to be notified as more of the <code>Image</code>
     * is converted
     * @return <code>true</code> if the <code>Image</code> is
     * fully loaded and completely rendered;
     * <code>false</code> if the <code>Image</code> is still being loaded.
     * @see #transform
     * @see #setTransform
     * @see #setComposite
     * @see #clip
     * @see #setClip(Shape)
     */
    public boolean drawImage(Image img,
                             AffineTransform xform,
                             ImageObserver obs) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14541);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14542);boolean retVal = true;
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14543);if ((((xform == null)&&(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14544)!=0|true))||(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14545)==0&false))) {{
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14546);xform = new AffineTransform();
        }
        }__CLR4_5_2b4tb4tm68iyhqq.R.inc(14547);if ((((xform.getDeterminant() != 0)&&(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14548)!=0|true))||(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14549)==0&false))) {{
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14550);AffineTransform inverseTransform = null;
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14551);try {
                __CLR4_5_2b4tb4tm68iyhqq.R.inc(14552);inverseTransform = xform.createInverse();
            }   catch (NoninvertibleTransformException e) {
                                // Should never happen since we checked the
                                // matrix determinant
                __CLR4_5_2b4tb4tm68iyhqq.R.inc(14553);throw new RuntimeException(e);
            }

            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14554);gc.transform(xform);
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14555);retVal = drawImage(img, 0, 0, null);
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14556);gc.transform(inverseTransform);
        } }else {{
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14557);AffineTransform savTransform = new AffineTransform(gc.getTransform());
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14558);gc.transform(xform);
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14559);retVal = drawImage(img, 0, 0, null);
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14560);gc.setTransform(savTransform);
        }

        }__CLR4_5_2b4tb4tm68iyhqq.R.inc(14561);return retVal;

    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Renders a <code>BufferedImage</code> that is
     * filtered with a
     * {@link BufferedImageOp}.
     * The rendering attributes applied include the <code>Clip</code>,
     * <code>Transform</code>
     * and <code>Composite</code> attributes.  This is equivalent to:
     * <pre>
     * img1 = op.filter(img, null);
     * drawImage(img1, new AffineTransform(1f,0f,0f,1f,x,y), null);
     * </pre>
     * @param img the <code>BufferedImage</code> to be rendered
     * @param op the filter to be applied to the image before rendering
     * @param x the x coordinate in user space where the image is rendered
     * @param y the y coordinate in user space where the image is rendered
     * @see #transform
     * @see #setTransform
     * @see #setComposite
     * @see #clip
     * @see #setClip(Shape)
     */
    public void drawImage(BufferedImage img,
                          BufferedImageOp op,
                          int x,
                          int y) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14562);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14563);img = op.filter(img, null);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14564);drawImage(img, x, y, null);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}



    /**
     * Renders the text of the specified
     * {@link GlyphVector} using
     * the <code>Graphics2D</code> context's rendering attributes.
     * The rendering attributes applied include the <code>Clip</code>,
     * <code>Transform</code>, <code>Paint</code>, and
     * <code>Composite</code> attributes.  The <code>GlyphVector</code>
     * specifies individual glyphs from a {@link Font}.
     * The <code>GlyphVector</code> can also contain the glyph positions.
     * This is the fastest way to render a set of characters to the
     * screen.
     *
     * @param g the <code>GlyphVector</code> to be rendered
     * @param x the x position in user space where the glyphs should be
     *        rendered
     * @param y the y position in user space where the glyphs should be
     *        rendered
     *
     * @see java.awt.Font#createGlyphVector(FontRenderContext, char[])
     * @see java.awt.font.GlyphVector
     * @see #setPaint
     * @see java.awt.Graphics#setColor
     * @see #setTransform
     * @see #setComposite
     * @see #setClip(Shape)
     */
    public void drawGlyphVector(GlyphVector g, float x, float y) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14565);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14566);Shape glyphOutline = g.getOutline(x, y);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14567);fill(glyphOutline);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Checks whether or not the specified <code>Shape</code> intersects
     * the specified {@link Rectangle}, which is in device
     * space. If <code>onStroke</code> is false, this method checks
     * whether or not the interior of the specified <code>Shape</code>
     * intersects the specified <code>Rectangle</code>.  If
     * <code>onStroke</code> is <code>true</code>, this method checks
     * whether or not the <code>Stroke</code> of the specified
     * <code>Shape</code> outline intersects the specified
     * <code>Rectangle</code>.
     * The rendering attributes taken into account include the
     * <code>Clip</code>, <code>Transform</code>, and <code>Stroke</code>
     * attributes.
     * @param rect the area in device space to check for a hit
     * @param s the <code>Shape</code> to check for a hit
     * @param onStroke flag used to choose between testing the
     * stroked or the filled shape.  If the flag is <code>true</code>, the
     * <code>Stroke</code> oultine is tested.  If the flag is
     * <code>false</code>, the filled <code>Shape</code> is tested.
     * @return <code>true</code> if there is a hit; <code>false</code>
     * otherwise.
     * @see #setStroke
     * @see #fill(Shape)
     * @see #draw(Shape)
     * @see #transform
     * @see #setTransform
     * @see #clip
     * @see #setClip(Shape)
     */
    public boolean hit(Rectangle rect,
                       Shape s,
                       boolean onStroke) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14568);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14569);if ((((onStroke)&&(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14570)!=0|true))||(__CLR4_5_2b4tb4tm68iyhqq.R.iget(14571)==0&false))) {{
            __CLR4_5_2b4tb4tm68iyhqq.R.inc(14572);s = gc.getStroke().createStrokedShape(s);
        }

        }__CLR4_5_2b4tb4tm68iyhqq.R.inc(14573);s = gc.getTransform().createTransformedShape(s);

        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14574);return s.intersects(rect);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Sets the <code>Composite</code> for the <code>Graphics2D</code> context.
     * The <code>Composite</code> is used in all drawing methods such as
     * <code>drawImage</code>, <code>drawString</code>, <code>draw</code>,
     * and <code>fill</code>.  It specifies how new pixels are to be combined
     * with the existing pixels on the graphics device during the rendering
     * process.
     * <p>If this <code>Graphics2D</code> context is drawing to a
     * <code>Component</code> on the display screen and the
     * <code>Composite</code> is a custom object rather than an
     * instance of the <code>AlphaComposite</code> class, and if
     * there is a security manager, its <code>checkPermission</code>
     * method is called with an <code>AWTPermission("readDisplayPixels")</code>
     * permission.
     * @param comp the <code>Composite</code> object to be used for rendering
     * @throws SecurityException
     *         if a custom <code>Composite</code> object is being
     *         used to render to the screen and a security manager
     *         is set and its <code>checkPermission</code> method
     *         does not allow the operation.
     * @see java.awt.Graphics#setXORMode
     * @see java.awt.Graphics#setPaintMode
     * @see java.awt.AlphaComposite
     */
    public void setComposite(Composite comp) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14575);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14576);gc.setComposite(comp);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Sets the <code>Paint</code> attribute for the
     * <code>Graphics2D</code> context.  Calling this method
     * with a <code>null</code> <code>Paint</code> object does
     * not have any effect on the current <code>Paint</code> attribute
     * of this <code>Graphics2D</code>.
     * @param paint the <code>Paint</code> object to be used to generate
     * color during the rendering process, or <code>null</code>
     * @see java.awt.Graphics#setColor
     */
    public void setPaint(Paint paint) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14577);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14578);gc.setPaint(paint);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Sets the <code>Stroke</code> for the <code>Graphics2D</code> context.
     * @param s the <code>Stroke</code> object to be used to stroke a
     * <code>Shape</code> during the rendering process
     */
    public void setStroke(Stroke s) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14579);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14580);gc.setStroke(s);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Sets the value of a single preference for the rendering algorithms.
     * Hint categories include controls for rendering quality and overall
     * time/quality trade-off in the rendering process.  Refer to the
     * <code>RenderingHints</code> class for definitions of some common
     * keys and values.
     * @param hintKey the key of the hint to be set.
     * @param hintValue the value indicating preferences for the specified
     * hint category.
     * @see RenderingHints
     */
    public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14581);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14582);gc.setRenderingHint(hintKey, hintValue);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Returns the value of a single preference for the rendering algorithms.
     * Hint categories include controls for rendering quality and overall
     * time/quality trade-off in the rendering process.  Refer to the
     * <code>RenderingHints</code> class for definitions of some common
     * keys and values.
     * @param hintKey the key corresponding to the hint to get.
     * @return an object representing the value for the specified hint key.
     * Some of the keys and their associated values are defined in the
     * <code>RenderingHints</code> class.
     * @see RenderingHints
     */
    public Object getRenderingHint(RenderingHints.Key hintKey) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14583);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14584);return gc.getRenderingHint(hintKey);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Replaces the values of all preferences for the rendering
     * algorithms with the specified <code>hints</code>.
     * The existing values for all rendering hints are discarded and
     * the new set of known hints and values are initialized from the
     * specified {@link Map} object.
     * Hint categories include controls for rendering quality and
     * overall time/quality trade-off in the rendering process.
     * Refer to the <code>RenderingHints</code> class for definitions of
     * some common keys and values.
     * @param hints the rendering hints to be set
     * @see RenderingHints
     */
    public void setRenderingHints(Map hints) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14585);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14586);gc.setRenderingHints(hints);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Sets the values of an arbitrary number of preferences for the
     * rendering algorithms.
     * Only values for the rendering hints that are present in the
     * specified <code>Map</code> object are modified.
     * All other preferences not present in the specified
     * object are left unmodified.
     * Hint categories include controls for rendering quality and
     * overall time/quality trade-off in the rendering process.
     * Refer to the <code>RenderingHints</code> class for definitions of
     * some common keys and values.
     * @param hints the rendering hints to be set
     * @see RenderingHints
     */
    public void addRenderingHints(Map hints) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14587);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14588);gc.addRenderingHints(hints);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Gets the preferences for the rendering algorithms.  Hint categories
     * include controls for rendering quality and overall time/quality
     * trade-off in the rendering process.
     * Returns all of the hint key/value pairs that were ever specified in
     * one operation.  Refer to the
     * <code>RenderingHints</code> class for definitions of some common
     * keys and values.
     * @return a reference to an instance of <code>RenderingHints</code>
     * that contains the current preferences.
     * @see RenderingHints
     */
    public RenderingHints getRenderingHints() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14589);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14590);return gc.getRenderingHints();
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Concatenates the current
     * <code>Graphics2D</code> <code>Transform</code>
     * with a translation transform.
     * Subsequent rendering is translated by the specified
     * distance relative to the previous position.
     * This is equivalent to calling transform(T), where T is an
     * <code>AffineTransform</code> represented by the following matrix:
     * <pre>
     *          [   1    0    tx  ]
     *          [   0    1    ty  ]
     *          [   0    0    1   ]
     * </pre>
     * @param tx the distance to translate along the x-axis
     * @param ty the distance to translate along the y-axis
     */
    public void translate(double tx, double ty) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14591);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14592);gc.translate(tx, ty);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Concatenates the current <code>Graphics2D</code>
     * <code>Transform</code> with a rotation transform.
     * Subsequent rendering is rotated by the specified radians relative
     * to the previous origin.
     * This is equivalent to calling <code>transform(R)</code>, where R is an
     * <code>AffineTransform</code> represented by the following matrix:
     * <pre>
     *          [   cos(theta)    -sin(theta)    0   ]
     *          [   sin(theta)     cos(theta)    0   ]
     *          [       0              0         1   ]
     * </pre>
     * Rotating with a positive angle theta rotates points on the positive
     * x axis toward the positive y axis.
     * @param theta the angle of rotation in radians
     */
    public void rotate(double theta) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14593);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14594);gc.rotate(theta);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Concatenates the current <code>Graphics2D</code>
     * <code>Transform</code> with a translated rotation
     * transform.  Subsequent rendering is transformed by a transform
     * which is constructed by translating to the specified location,
     * rotating by the specified radians, and translating back by the same
     * amount as the original translation.  This is equivalent to the
     * following sequence of calls:
     * <pre>
     *          translate(x, y);
     *          rotate(theta);
     *          translate(-x, -y);
     * </pre>
     * Rotating with a positive angle theta rotates points on the positive
     * x axis toward the positive y axis.
     * @param theta the angle of rotation in radians
     * @param x the x coordinate of the origin of the rotation
     * @param y the y coordinate of the origin of the rotation
     */
    public void rotate(double theta, double x, double y) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14595);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14596);gc.rotate(theta, x, y);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Concatenates the current <code>Graphics2D</code>
     * <code>Transform</code> with a scaling transformation
     * Subsequent rendering is resized according to the specified scaling
     * factors relative to the previous scaling.
     * This is equivalent to calling <code>transform(S)</code>, where S is an
     * <code>AffineTransform</code> represented by the following matrix:
     * <pre>
     *          [   sx   0    0   ]
     *          [   0    sy   0   ]
     *          [   0    0    1   ]
     * </pre>
     * @param sx the amount by which X coordinates in subsequent
     * rendering operations are multiplied relative to previous
     * rendering operations.
     * @param sy the amount by which Y coordinates in subsequent
     * rendering operations are multiplied relative to previous
     * rendering operations.
     */
    public void scale(double sx, double sy) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14597);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14598);gc.scale(sx, sy);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Concatenates the current <code>Graphics2D</code>
     * <code>Transform</code> with a shearing transform.
     * Subsequent renderings are sheared by the specified
     * multiplier relative to the previous position.
     * This is equivalent to calling <code>transform(SH)</code>, where SH
     * is an <code>AffineTransform</code> represented by the following
     * matrix:
     * <pre>
     *          [   1   shx   0   ]
     *          [  shy   1    0   ]
     *          [   0    0    1   ]
     * </pre>
     * @param shx the multiplier by which coordinates are shifted in
     * the positive X axis direction as a function of their Y coordinate
     * @param shy the multiplier by which coordinates are shifted in
     * the positive Y axis direction as a function of their X coordinate
     */
    public void shear(double shx, double shy) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14599);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14600);gc.shear(shx, shy);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Composes an <code>AffineTransform</code> object with the
     * <code>Transform</code> in this <code>Graphics2D</code> according
     * to the rule last-specified-first-applied.  If the current
     * <code>Transform</code> is Cx, the result of composition
     * with Tx is a new <code>Transform</code> Cx'.  Cx' becomes the
     * current <code>Transform</code> for this <code>Graphics2D</code>.
     * Transforming a point p by the updated <code>Transform</code> Cx' is
     * equivalent to first transforming p by Tx and then transforming
     * the result by the original <code>Transform</code> Cx.  In other
     * words, Cx'(p) = Cx(Tx(p)).  A copy of the Tx is made, if necessary,
     * so further modifications to Tx do not affect rendering.
     * @param tx the <code>AffineTransform</code> object to be composed with
     * the current <code>Transform</code>
     * @see #setTransform
     * @see AffineTransform
     */
    public void transform(AffineTransform tx) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14601);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14602);gc.transform(tx);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * Sets the <code>Transform</code> in the <code>Graphics2D</code>
     * context.
     * @param tx the <code>AffineTransform</code> object to be used in the
     * rendering process
     * @see #transform
     * @see AffineTransform
     */
    public void setTransform(AffineTransform tx) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14603);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14604);gc.setTransform(tx);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Returns a copy of the current <code>Transform</code> in the
     * <code>Graphics2D</code> context.
     * @return the current <code>AffineTransform</code> in the
     *             <code>Graphics2D</code> context.
     * @see #transform
     * @see #setTransform
     */
    public AffineTransform getTransform() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14605);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14606);return gc.getTransform();
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Returns the current <code>Paint</code> of the
     * <code>Graphics2D</code> context.
     * @return the current <code>Graphics2D</code> <code>Paint</code>,
     * which defines a color or pattern.
     * @see #setPaint
     * @see java.awt.Graphics#setColor
     */
    public Paint getPaint() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14607);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14608);return gc.getPaint();
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Returns the current <code>Composite</code> in the
     * <code>Graphics2D</code> context.
     * @return the current <code>Graphics2D</code> <code>Composite</code>,
     *              which defines a compositing style.
     * @see #setComposite
     */
    public Composite getComposite() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14609);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14610);return gc.getComposite();
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Sets the background color for the <code>Graphics2D</code> context.
     * The background color is used for clearing a region.
     * When a <code>Graphics2D</code> is constructed for a
     * <code>Component</code>, the background color is
     * inherited from the <code>Component</code>. Setting the background color
     * in the <code>Graphics2D</code> context only affects the subsequent
     * <code>clearRect</code> calls and not the background color of the
     * <code>Component</code>.  To change the background
     * of the <code>Component</code>, use appropriate methods of
     * the <code>Component</code>.
     * @param color the background color that isused in
     * subsequent calls to <code>clearRect</code>
     * @see #getBackground
     * @see java.awt.Graphics#clearRect
     */
    public void setBackground(Color color) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14611);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14612);gc.setBackground(color);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Returns the background color used for clearing a region.
     * @return the current <code>Graphics2D</code> <code>Color</code>,
     * which defines the background color.
     * @see #setBackground
     */
    public Color getBackground() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14613);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14614);return gc.getBackground();
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Returns the current <code>Stroke</code> in the
     * <code>Graphics2D</code> context.
     * @return the current <code>Graphics2D</code> <code>Stroke</code>,
     *                 which defines the line style.
     * @see #setStroke
     */
    public Stroke getStroke() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14615);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14616);return gc.getStroke();
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Intersects the current <code>Clip</code> with the interior of the
     * specified <code>Shape</code> and sets the <code>Clip</code> to the
     * resulting intersection.  The specified <code>Shape</code> is
     * transformed with the current <code>Graphics2D</code>
     * <code>Transform</code> before being intersected with the current
     * <code>Clip</code>.  This method is used to make the current
     * <code>Clip</code> smaller.
     * To make the <code>Clip</code> larger, use <code>setClip</code>.
     * The <i>user clip</i> modified by this method is independent of the
     * clipping associated with device bounds and visibility.  If no clip has
     * previously been set, or if the clip has been cleared using
     * {@link java.awt.Graphics#setClip(Shape) setClip} with a
     * <code>null</code> argument, the specified <code>Shape</code> becomes
     * the new user clip.
     * @param s the <code>Shape</code> to be intersected with the current
     *          <code>Clip</code>.  If <code>s</code> is <code>null</code>,
     *          this method clears the current <code>Clip</code>.
     */
    public void clip(Shape s) {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14617);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14618);gc.clip(s);
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}


    /**
     * Get the rendering context of the <code>Font</code> within this
     * <code>Graphics2D</code> context.
     * The {@link FontRenderContext}
     * encapsulates application hints such as anti-aliasing and
     * fractional metrics, as well as target device specific information
     * such as dots-per-inch.  This information should be provided by the
     * application when using objects that perform typographical
     * formatting, such as <code>Font</code> and
     * <code>TextLayout</code>.  This information should also be provided
     * by applications that perform their own layout and need accurate
     * measurements of various characteristics of glyphs such as advance
     * and line height when various rendering hints have been applied to
     * the text rendering.
     *
     * @return a reference to an instance of FontRenderContext.
     * @see java.awt.font.FontRenderContext
     * @see java.awt.Font#createGlyphVector(FontRenderContext,char[])
     * @see java.awt.font.TextLayout
     * @since     JDK1.2
     */
    public FontRenderContext getFontRenderContext() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14619);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14620);return gc.getFontRenderContext();
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}

    /**
     * @return the {@link GraphicContext} of this <code>Graphics2D</code>.
     */
    public GraphicContext getGraphicContext() {try{__CLR4_5_2b4tb4tm68iyhqq.R.inc(14621);
        __CLR4_5_2b4tb4tm68iyhqq.R.inc(14622);return gc;
    }finally{__CLR4_5_2b4tb4tm68iyhqq.R.flushNeeded();}}
}
