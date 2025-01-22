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

/* $Id: GraphicContext.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.java2d;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.NoninvertibleTransformException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// CSOFF: OperatorWrap
// CSOFF: ParameterName
// CSOFF: WhitespaceAround

/**
 * Handles the attributes in a graphic context:<br>
 * + Composite <br>
 * + Font <br>
 * + Paint <br>
 * + Stroke <br>
 * + Clip <br>
 * + RenderingHints <br>
 * + AffineTransform <br>
 *
 * @version $Id: GraphicContext.java 1732018 2016-02-24 04:51:06Z gadams $
 *
 * Originally authored by Vincent Hardy and Christophe Jolif.
 */
public class GraphicContext implements Cloneable {public static class __CLR4_5_2bd6bd6m68iyhs3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,14925,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default Transform to be used for creating FontRenderContext.
     */
    protected AffineTransform defaultTransform = new AffineTransform();

    /**
     * Current AffineTransform. This is the concatenation
     * of the original AffineTransform (i.e., last setTransform
     * invocation) and the following transform invocations,
     * as captured by originalTransform and the transformStack.
     */
    protected AffineTransform transform = new AffineTransform();

    /**
     * Transform stack
     */
    protected List transformStack = new ArrayList();

    /**
     * Defines whether the transform stack is valid or not.
     * This is for use by the class clients. The client should
     * validate the stack every time it starts using it. The
     * stack becomes invalid when a new transform is set.
     * @see #invalidateTransformStack()
     * @see #isTransformStackValid
     * @see #setTransform
     */
    protected boolean transformStackValid = true;

    /**
     * Current Paint
     */
    protected Paint paint = Color.black;

    /**
     * Current Stroke
     */
    protected Stroke stroke = new BasicStroke();

    /**
     * Current Composite
     */
    protected Composite composite = AlphaComposite.SrcOver;

    /**
     * Current clip
     */
    protected Shape clip;

    /**
     * Current set of RenderingHints
     */
    protected RenderingHints hints = new RenderingHints(null);

    /**
     * Current Font
     */
    protected Font font = new Font("sanserif", Font.PLAIN, 12);

    /**
     * Current background color.
     */
    protected Color background = new Color(0, 0, 0, 0);

    /**
     * Current foreground color
     */
    protected Color foreground = Color.black;

    /**
     * Default constructor
     */
    public GraphicContext() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14730);
        // to workaround a JDK bug
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14731);hints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_DEFAULT);
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * @param defaultDeviceTransform Default affine transform applied to map the user space to the
     *                               user space.
     */
    public GraphicContext(AffineTransform defaultDeviceTransform) {
        this();__CLR4_5_2bd6bd6m68iyhs3.R.inc(14733);try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14732);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14734);defaultTransform = new AffineTransform(defaultDeviceTransform);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14735);transform = new AffineTransform(defaultTransform);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14736);if ((((!defaultTransform.isIdentity())&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14737)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14738)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14739);transformStack.add(TransformStackElement.createGeneralTransformElement(defaultTransform));
        }
    }}finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Copy constructor.
     * @param template the instance to make a copy of
     */
    protected GraphicContext(GraphicContext template) {
        this(template.defaultTransform);__CLR4_5_2bd6bd6m68iyhs3.R.inc(14741);try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14740);
        //
        // Now, copy each GC element in turn
        //

        // Default transform
        /* Set in constructor */

        // Transform
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14742);this.transform = new AffineTransform(template.transform);

        // Transform stack
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14743);this.transformStack = new ArrayList(template.transformStack.size());
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14744);for (int i = 0; (((i < template.transformStack.size())&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14745)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14746)==0&false)); i++) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14747);TransformStackElement stackElement
                = (TransformStackElement)template.transformStack.get(i);
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14748);this.transformStack.add(stackElement.clone());
        }

        // Transform stack validity
        }__CLR4_5_2bd6bd6m68iyhs3.R.inc(14749);this.transformStackValid = template.transformStackValid;

        // Paint (immutable by requirement)
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14750);this.paint = template.paint;

        // Stroke (immutable by requirement)
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14751);this.stroke = template.stroke;

        // Composite (immutable by requirement)
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14752);this.composite = template.composite;

        // Clip
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14753);if ((((template.clip != null)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14754)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14755)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14756);this.clip = new GeneralPath(template.clip);
        } }else {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14757);this.clip = null;
        }

        // RenderingHints
        }__CLR4_5_2bd6bd6m68iyhs3.R.inc(14758);this.hints = (RenderingHints)template.hints.clone();

        // Font (immutable)
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14759);this.font = template.font;

        // Background, Foreground (immutable)
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14760);this.background = template.background;
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14761);this.foreground = template.foreground;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * @return a deep copy of this context
     */
    public Object clone() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14762);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14763);return new GraphicContext(this);
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Gets this graphics context's current color.
     * @return    this graphics context's current color.
     * @see       java.awt.Color
     * @see       java.awt.Graphics#setColor
     */
    public Color getColor() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14764);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14765);return foreground;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Sets this graphics context's current color to the specified
     * color. All subsequent graphics operations using this graphics
     * context use this specified color.
     * @param     c   the new rendering color.
     * @see       java.awt.Color
     * @see       java.awt.Graphics#getColor
     */
    public void setColor(Color c) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14766);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14767);if ((((c == null)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14768)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14769)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14770);return;
        }

        }__CLR4_5_2bd6bd6m68iyhs3.R.inc(14771);if ((((paint != c)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14772)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14773)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14774);setPaint(c);
        }
    }}finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Gets the current font.
     * @return    this graphics context's current font.
     * @see       java.awt.Font
     * @see       java.awt.Graphics#setFont
     */
    public Font getFont() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14775);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14776);return font;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Sets this graphics context's font to the specified font.
     * All subsequent text operations using this graphics context
     * use this font.
     * @param  font   the font.
     * @see     java.awt.Graphics#getFont
     */
    public void setFont(Font font) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14777);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14778);if ((((font != null)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14779)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14780)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14781);this.font = font;
        }
    }}finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

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
    public Rectangle getClipBounds() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14782);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14783);Shape c = getClip();
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14784);if ((((c == null)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14785)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14786)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14787);return null;
        } }else {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14788);return c.getBounds();
        }
    }}finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


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
    public void clipRect(int x, int y, int width, int height) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14789);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14790);clip(new Rectangle(x, y, width, height));
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


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
    public void setClip(int x, int y, int width, int height) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14791);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14792);setClip(new Rectangle(x, y, width, height));
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


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
     * @see         java.awt.Graphics#clipRect
     * @see         java.awt.Graphics#setClip(int, int, int, int)
     * @see         java.awt.Graphics#setClip(Shape)
     * @since       JDK1.1
     */
    public Shape getClip() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14793);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14794);try {
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14795);return transform.createInverse().createTransformedShape(clip);
        } catch (NoninvertibleTransformException e) {
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14796);return null;
        }
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


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
    public void setClip(Shape clip) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14797);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14798);if ((((clip != null)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14799)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14800)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14801);this.clip = transform.createTransformedShape(clip);
        } }else {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14802);this.clip = null;
        }
    }}finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

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
     *
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
    public void setComposite(Composite comp) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14803);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14804);this.composite = comp;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


    /**
     * Sets the <code>Paint</code> attribute for the
     * <code>Graphics2D</code> context.  Calling this method
     * with a <code>null</code> <code>Paint</code> object does
     * not have any effect on the current <code>Paint</code> attribute
     * of this <code>Graphics2D</code>.
     * @param paint the <code>Paint</code> object to be used to generate
     * color during the rendering process, or <code>null</code>
     * @see java.awt.Graphics#setColor
     * @see java.awt.GradientPaint
     * @see java.awt.TexturePaint
     */
    public void setPaint(Paint paint) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14805);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14806);if ((((paint == null)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14807)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14808)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14809);return;
        }

        }__CLR4_5_2bd6bd6m68iyhs3.R.inc(14810);this.paint = paint;
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14811);if ((((paint instanceof Color)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14812)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14813)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14814);foreground = (Color)paint;
        } }else {{
            // use default; otherwise the previous Color will be used
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14815);foreground = Color.black;
        }
    }}finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


    /**
     * Sets the <code>Stroke</code> for the <code>Graphics2D</code> context.
     * @param s the <code>Stroke</code> object to be used to stroke a
     * <code>Shape</code> during the rendering process
     * @see BasicStroke
     */
    public void setStroke(Stroke s) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14816);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14817);stroke = s;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

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
    public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14818);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14819);hints.put(hintKey, hintValue);
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


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
    public Object getRenderingHint(RenderingHints.Key hintKey) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14820);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14821);return hints.get(hintKey);
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


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
    public void setRenderingHints(Map hints) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14822);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14823);this.hints = new RenderingHints(hints);
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


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
    public void addRenderingHints(Map hints) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14824);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14825);this.hints.putAll(hints);
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


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
    public RenderingHints getRenderingHints() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14826);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14827);return hints;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

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
    public void translate(int x, int y) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14828);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14829);if ((((x != 0 || y != 0)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14830)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14831)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14832);transform.translate(x, y);
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14833);transformStack.add(TransformStackElement.createTranslateElement(x, y));
        }
    }}finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


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
    public void translate(double tx, double ty) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14834);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14835);transform.translate(tx, ty);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14836);transformStack.add(TransformStackElement.createTranslateElement(tx, ty));
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

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
    public void rotate(double theta) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14837);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14838);transform.rotate(theta);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14839);transformStack.add(TransformStackElement.createRotateElement(theta));
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

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
     * @param x x coordinate of the origin of the rotation
     * @param y y coordinate of the origin of the rotation
     */
    public void rotate(double theta, double x, double y) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14840);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14841);transform.rotate(theta, x, y);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14842);transformStack.add(TransformStackElement.createTranslateElement(x, y));
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14843);transformStack.add(TransformStackElement.createRotateElement(theta));
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14844);transformStack.add(TransformStackElement.createTranslateElement(-x, -y));
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

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
    public void scale(double sx, double sy) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14845);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14846);transform.scale(sx, sy);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14847);transformStack.add(TransformStackElement.createScaleElement(sx, sy));
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

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
    public void shear(double shx, double shy) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14848);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14849);transform.shear(shx, shy);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14850);transformStack.add(TransformStackElement.createShearElement(shx, shy));
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

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
    public void transform(AffineTransform tx) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14851);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14852);transform.concatenate(tx);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14853);transformStack.add(TransformStackElement.createGeneralTransformElement(tx));
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Sets the <code>Transform</code> in the <code>Graphics2D</code>
     * context.
     * @param tx the <code>AffineTransform</code> object to be used in the
     * rendering process
     * @see #transform
     * @see AffineTransform
     */
    public void setTransform(AffineTransform tx) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14854);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14855);transform = new AffineTransform(tx);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14856);invalidateTransformStack();
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14857);if ((((!tx.isIdentity())&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14858)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14859)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14860);transformStack.add(TransformStackElement.createGeneralTransformElement(tx));
        }
    }}finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Marks the GraphicContext's isNewTransformStack to false
     * as a memento that the current transform stack was read and
     * has not been reset. Only the setTransform method can
     * override this memento.
     */
    public void validateTransformStack() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14861);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14862);transformStackValid = true;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Checks the status of the transform stack.
     * @return true if the transform stack is valid
     */
    public boolean isTransformStackValid() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14863);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14864);return transformStackValid;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * @return array containing the successive transforms that
     *         were concatenated with the original one.
     */
    public TransformStackElement[] getTransformStack() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14865);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14866);TransformStackElement[] stack = new TransformStackElement[transformStack.size()];
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14867);transformStack.toArray(stack);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14868);return stack;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Marks the GraphicContext's isNewTransformStack to true
     * as a memento that the current transform stack was reset
     * since it was last read. Only validateTransformStack
     * can override this memento
     */
    protected void invalidateTransformStack() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14869);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14870);transformStack.clear();
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14871);transformStackValid = false;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Returns a copy of the current <code>Transform</code> in the
     * <code>Graphics2D</code> context.
     * @return the current <code>AffineTransform</code> in the
     *             <code>Graphics2D</code> context.
     * @see #transform
     * @see #setTransform
     */
    public AffineTransform getTransform() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14872);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14873);return new AffineTransform(transform);
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Returns the current <code>Paint</code> of the
     * <code>Graphics2D</code> context.
     * @return the current <code>Graphics2D</code> <code>Paint</code>,
     * which defines a color or pattern.
     * @see #setPaint
     * @see java.awt.Graphics#setColor
     */
    public Paint getPaint() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14874);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14875);return paint;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


    /**
     * Returns the current <code>Composite</code> in the
     * <code>Graphics2D</code> context.
     * @return the current <code>Graphics2D</code> <code>Composite</code>,
     *              which defines a compositing style.
     * @see #setComposite
     */
    public Composite getComposite() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14876);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14877);return composite;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

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
    public void setBackground(Color color) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14878);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14879);if ((((color == null)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14880)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14881)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14882);return;
        }

        }__CLR4_5_2bd6bd6m68iyhs3.R.inc(14883);background = color;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


    /**
     * Returns the background color used for clearing a region.
     * @return the current <code>Graphics2D</code> <code>Color</code>,
     * which defines the background color.
     * @see #setBackground
     */
    public Color getBackground() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14884);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14885);return background;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

    /**
     * Returns the current <code>Stroke</code> in the
     * <code>Graphics2D</code> context.
     * @return the current <code>Graphics2D</code> <code>Stroke</code>,
     *                 which defines the line style.
     * @see #setStroke
     */
    public Stroke getStroke() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14886);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14887);return stroke;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}


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
    public void clip(Shape s) {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14888);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14889);if ((((s != null)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14890)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14891)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14892);s = transform.createTransformedShape(s);
        }

        }__CLR4_5_2bd6bd6m68iyhs3.R.inc(14893);if ((((clip != null)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14894)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14895)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14896);Area newClip = new Area(clip);
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14897);newClip.intersect(new Area(s));
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14898);clip = new GeneralPath(newClip);
        } }else {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14899);clip = s;
        }
    }}finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}

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
    public FontRenderContext getFontRenderContext() {try{__CLR4_5_2bd6bd6m68iyhs3.R.inc(14900);
        //
        // Find if antialiasing should be used.
        //
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14901);Object antialiasingHint = hints.get(RenderingHints.KEY_TEXT_ANTIALIASING);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14902);boolean isAntialiased = true;
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14903);if ((((antialiasingHint != RenderingHints.VALUE_TEXT_ANTIALIAS_ON
           && antialiasingHint != RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14904)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14905)==0&false))) {{

            // If antialias was not turned off, then use the general rendering
            // hint.
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14906);if ((((antialiasingHint != RenderingHints.VALUE_TEXT_ANTIALIAS_OFF)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14907)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14908)==0&false))) {{
                __CLR4_5_2bd6bd6m68iyhs3.R.inc(14909);antialiasingHint = hints.get(RenderingHints.KEY_ANTIALIASING);

                // Test general hint
                __CLR4_5_2bd6bd6m68iyhs3.R.inc(14910);if ((((antialiasingHint != RenderingHints.VALUE_ANTIALIAS_ON
                   && antialiasingHint != RenderingHints.VALUE_ANTIALIAS_DEFAULT)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14911)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14912)==0&false))) {{
                    // Antialiasing was not requested. However, if it was not turned
                    // off explicitly, use it.
                    __CLR4_5_2bd6bd6m68iyhs3.R.inc(14913);if ((((antialiasingHint == RenderingHints.VALUE_ANTIALIAS_OFF)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14914)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14915)==0&false))) {{
                        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14916);isAntialiased = false;
                    }
                }}
            }} }else {{
                __CLR4_5_2bd6bd6m68iyhs3.R.inc(14917);isAntialiased = false;
            }

        }}

        //
        // Find out whether fractional metrics should be used.
        //
        }__CLR4_5_2bd6bd6m68iyhs3.R.inc(14918);boolean useFractionalMetrics = true;
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14919);if ((((hints.get(RenderingHints.KEY_FRACTIONALMETRICS)
           == RenderingHints.VALUE_FRACTIONALMETRICS_OFF)&&(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14920)!=0|true))||(__CLR4_5_2bd6bd6m68iyhs3.R.iget(14921)==0&false))) {{
            __CLR4_5_2bd6bd6m68iyhs3.R.inc(14922);useFractionalMetrics = false;
        }

        }__CLR4_5_2bd6bd6m68iyhs3.R.inc(14923);FontRenderContext frc = new FontRenderContext(defaultTransform,
                                                      isAntialiased,
                                                      useFractionalMetrics);
        __CLR4_5_2bd6bd6m68iyhs3.R.inc(14924);return frc;
    }finally{__CLR4_5_2bd6bd6m68iyhs3.R.flushNeeded();}}
}
