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

/* $Id: DefaultGraphics2D.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.java2d;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;

// CSOFF: WhitespaceAround

/**
 * This concrete implementation of <tt>AbstractGraphics2D</tt> is a
 * simple help to programmers to get started with their own
 * implementation of <tt>Graphics2D</tt>.
 * <tt>DefaultGraphics2D</tt> implements all the abstract methods
 * is <tt>AbstractGraphics2D</tt> and makes it easy to start
 * implementing a <tt>Graphic2D</tt> piece-meal.
 *
 * @version $Id: DefaultGraphics2D.java 1732018 2016-02-24 04:51:06Z gadams $
 * @see org.apache.xmlgraphics.java2d.AbstractGraphics2D
 *
 * Originally authored by Vincent Hardy.
 */
public class DefaultGraphics2D extends AbstractGraphics2D {public static class __CLR4_5_2barbarm6lb50su{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,14681,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default constructor
     */
    public DefaultGraphics2D(boolean textAsShapes) {
        super(textAsShapes);__CLR4_5_2barbarm6lb50su.R.inc(14644);try{__CLR4_5_2barbarm6lb50su.R.inc(14643);
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

    /**
     * This constructor supports the create method
     */
    public DefaultGraphics2D(DefaultGraphics2D g) {
        super(g);__CLR4_5_2barbarm6lb50su.R.inc(14646);try{__CLR4_5_2barbarm6lb50su.R.inc(14645);
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

    /**
     * Creates a new <code>Graphics</code> object that is
     * a copy of this <code>Graphics</code> object.
     * @return     a new graphics context that is a copy of
     *             this graphics context.
     */
    public Graphics create() {try{__CLR4_5_2barbarm6lb50su.R.inc(14647);
        __CLR4_5_2barbarm6lb50su.R.inc(14648);return new DefaultGraphics2D(this);
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

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
     *                          the image is converted.
     * @see      java.awt.Image
     * @see      java.awt.image.ImageObserver
     * @see      java.awt.image.ImageObserver#imageUpdate(java.awt.Image, int, int, int, int, int)
     */
    public boolean drawImage(Image img, int x, int y, ImageObserver observer) {try{__CLR4_5_2barbarm6lb50su.R.inc(14649);
        __CLR4_5_2barbarm6lb50su.R.inc(14650);System.err.println("drawImage");
        __CLR4_5_2barbarm6lb50su.R.inc(14651);return true;
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

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
     *                          the image is converted.
     * @see      java.awt.Image
     * @see      java.awt.image.ImageObserver
     * @see      java.awt.image.ImageObserver#imageUpdate(java.awt.Image, int, int, int, int, int)
     */
    public boolean drawImage(Image img, int x, int y,
                             int width, int height,
                             ImageObserver observer) {try{__CLR4_5_2barbarm6lb50su.R.inc(14652);
        __CLR4_5_2barbarm6lb50su.R.inc(14653);System.out.println("drawImage");
        __CLR4_5_2barbarm6lb50su.R.inc(14654);return true;
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

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
     * @see         java.awt.Graphics#create()
     */
    public void dispose() {try{__CLR4_5_2barbarm6lb50su.R.inc(14655);
        __CLR4_5_2barbarm6lb50su.R.inc(14656);System.out.println("dispose");
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

    /**
     * Strokes the outline of a <code>Shape</code> using the settings of the
     * current <code>Graphics2D</code> context.  The rendering attributes
     * applied include the <code>Clip</code>, <code>Transform</code>,
     * <code>Paint</code>, <code>Composite</code> and
     * <code>Stroke</code> attributes.
     * @param s the <code>Shape</code> to be rendered
     * @see #setStroke(java.awt.Stroke)
     * @see #setPaint(java.awt.Paint)
     * @see java.awt.Graphics#setColor
     * @see #setTransform(AffineTransform)
     * @see #setClip(Shape)
     * @see #setComposite(java.awt.Composite)
     */
    public void draw(Shape s) {try{__CLR4_5_2barbarm6lb50su.R.inc(14657);
        __CLR4_5_2barbarm6lb50su.R.inc(14658);System.out.println("draw(Shape)");
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

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
     * @see #setTransform(AffineTransform)
     * @see #setComposite(java.awt.Composite)
     * @see #setClip(Shape)
     */
    public void drawRenderedImage(RenderedImage img,
                                  AffineTransform xform) {try{__CLR4_5_2barbarm6lb50su.R.inc(14659);
        __CLR4_5_2barbarm6lb50su.R.inc(14660);System.out.println("drawRenderedImage");
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}


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
     *<p>
     * Rendering hints set on the <code>Graphics2D</code> object might
     * be used in rendering the <code>RenderableImage</code>.
     * If explicit control is required over specific hints recognized by a
     * specific <code>RenderableImage</code>, or if knowledge of which hints
     * are used is required, then a <code>RenderedImage</code> should be
     * obtained directly from the <code>RenderableImage</code>
     * and rendered using
     *{@link #drawRenderedImage(RenderedImage, AffineTransform) drawRenderedImage}.
     * @param img the image to be rendered
     * @param xform the transformation from image space into user space
     * @see #setTransform(AffineTransform)
     * @see #setComposite(java.awt.Composite)
     * @see #setClip(Shape)
     * @see #drawRenderedImage
     */
     public void drawRenderableImage(RenderableImage img,
                                     AffineTransform xform) {try{__CLR4_5_2barbarm6lb50su.R.inc(14661);
         __CLR4_5_2barbarm6lb50su.R.inc(14662);System.out.println("drawRenderableImage");
     }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

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
     * @param x the x coordinate where the <code>String</code> should be
     *          rendered
     * @param y the y coordinate where the <code>String</code> should be
     *          rendered
     * @see #setPaint(java.awt.Paint)
     * @see java.awt.Graphics#setColor
     * @see java.awt.Graphics#setFont
     * @see #setTransform(AffineTransform)
     * @see #setComposite(java.awt.Composite)
     * @see #setClip(Shape)
     */
    public void drawString(String s, float x, float y) {try{__CLR4_5_2barbarm6lb50su.R.inc(14663);
        __CLR4_5_2barbarm6lb50su.R.inc(14664);System.out.println("drawString(String)");
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

    /**
     * Renders the text of the specified iterator, using the
     * <code>Graphics2D</code> context's current <code>Paint</code>. The
     * iterator must specify a font
     * for each character. The baseline of the
     * first character is at position (<i>x</i>,&nbsp;<i>y</i>) in the
     * User Space.
     * The rendering attributes applied include the <code>Clip</code>,
     * <code>Transform</code>, <code>Paint</code>, and
     * <code>Composite</code> attributes.
     * For characters in script systems such as Hebrew and Arabic,
     * the glyphs can be rendered from right to left, in which case the
     * coordinate supplied is the location of the leftmost character
     * on the baseline.
     * @param iterator the iterator whose text is to be rendered
     * @param x the x coordinate where the iterator's text is to be rendered
     * @param y the y coordinate where the iterator's text is to be rendered
     * @see #setPaint(java.awt.Paint)
     * @see java.awt.Graphics#setColor
     * @see #setTransform(AffineTransform)
     * @see #setComposite(java.awt.Composite)
     * @see #setClip(Shape)
     */
     public void drawString(AttributedCharacterIterator iterator,
                            float x, float y) {try{__CLR4_5_2barbarm6lb50su.R.inc(14665);
         __CLR4_5_2barbarm6lb50su.R.inc(14666);System.err.println("drawString(AttributedCharacterIterator)");
     }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}



    /**
     * Fills the interior of a <code>Shape</code> using the settings of the
     * <code>Graphics2D</code> context. The rendering attributes applied
     * include the <code>Clip</code>, <code>Transform</code>,
     * <code>Paint</code>, and <code>Composite</code>.
     * @param s the <code>Shape</code> to be filled
     * @see #setPaint(java.awt.Paint)
     * @see java.awt.Graphics#setColor
     * @see #setTransform(AffineTransform)
     * @see #setComposite(java.awt.Composite)
     * @see #setClip(Shape)
     */
    public void fill(Shape s) {try{__CLR4_5_2barbarm6lb50su.R.inc(14667);
        __CLR4_5_2barbarm6lb50su.R.inc(14668);System.err.println("fill");
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

    /**
     * Returns the device configuration associated with this
     * <code>Graphics2D</code>.
     */
    public GraphicsConfiguration getDeviceConfiguration() {try{__CLR4_5_2barbarm6lb50su.R.inc(14669);
        __CLR4_5_2barbarm6lb50su.R.inc(14670);System.out.println("getDeviceConviguration");
        __CLR4_5_2barbarm6lb50su.R.inc(14671);return null;
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

    /**
     * Used to create proper font metrics
     */
    private Graphics2D fmg;

    {try{__CLR4_5_2barbarm6lb50su.R.inc(14672);
        __CLR4_5_2barbarm6lb50su.R.inc(14673);BufferedImage bi
            = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);

        __CLR4_5_2barbarm6lb50su.R.inc(14674);fmg = bi.createGraphics();
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

    /**
     * Gets the font metrics for the specified font.
     * @return    the font metrics for the specified font.
     * @param     f the specified font
     * @see       java.awt.Graphics#getFont
     * @see       java.awt.FontMetrics
     * @see       java.awt.Graphics#getFontMetrics()
     */
    public FontMetrics getFontMetrics(Font f) {try{__CLR4_5_2barbarm6lb50su.R.inc(14675);
        __CLR4_5_2barbarm6lb50su.R.inc(14676);return fmg.getFontMetrics(f);
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

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
    public void setXORMode(Color c1) {try{__CLR4_5_2barbarm6lb50su.R.inc(14677);
        __CLR4_5_2barbarm6lb50su.R.inc(14678);System.out.println("setXORMode");
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}


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
    public void copyArea(int x, int y, int width, int height,
                         int dx, int dy) {try{__CLR4_5_2barbarm6lb50su.R.inc(14679);
        __CLR4_5_2barbarm6lb50su.R.inc(14680);System.out.println("copyArea");
    }finally{__CLR4_5_2barbarm6lb50su.R.flushNeeded();}}

}
