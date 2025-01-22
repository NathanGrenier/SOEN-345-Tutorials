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

/* $Id: AbstractRed.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.image.rendered;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.apache.xmlgraphics.image.GraphicsUtil;

// CSOFF: LocalVariableName
// CSOFF: MultipleVariableDeclarations
// CSOFF: NeedBraces
// CSOFF: NoWhitespaceAfter
// CSOFF: WhitespaceAround

/**
 * This is an abstract base class that takes care of most of the
 * normal issues surrounding the implementation of the CachableRed
 * (RenderedImage) interface.  It tries to make no assumptions about
 * the subclass implementation.
 *
 * @version $Id: AbstractRed.java 1804124 2017-08-04 14:13:54Z ssteiner $
 *
 * Originally authored by Thomas DeWeese.
 */
public abstract class AbstractRed implements CachableRed {public static class __CLR4_5_29wq9wqm68iyhkp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,13138,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Rectangle   bounds;
    protected Vector      srcs;
    protected Map         props;
    protected SampleModel sm;
    protected ColorModel  cm;
    protected int tileGridXOff;
    protected int tileGridYOff;
    protected int tileWidth;
    protected int tileHeight;
    protected int minTileX;
    protected int minTileY;
    protected int numXTiles;
    protected int numYTiles;

    /**
     * void constructor. The subclass must call one of the
     * flavors of init before the object becomes usable.
     * This is useful when the proper parameters to the init
     * method need to be computed in the subclasses constructor.
     */
    protected AbstractRed() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12842);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}


    /**
     * Construct an Abstract RenderedImage from a bounds rect and props
     * (may be null).  The srcs Vector will be empty.
     * @param bounds this defines the extent of the rable in the
     * user coordinate system.
     * @param props this initializes the props Map (may be null)
     */
    protected AbstractRed(Rectangle bounds, Map props) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12843);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12844);init((CachableRed)null, bounds, null, null,
             bounds.x, bounds.y, props);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * Construct an Abstract RenderedImage from a source image and
     * props (may be null).
     * @param src will be the first (and only) member of the srcs
     * Vector. Src is also used to set the bounds, ColorModel,
     * SampleModel, and tile grid offsets.
     * @param props this initializes the props Map.  */
    protected AbstractRed(CachableRed src, Map props) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12845);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12846);init(src, src.getBounds(), src.getColorModel(), src.getSampleModel(),
             src.getTileGridXOffset(),
             src.getTileGridYOffset(),
             props);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * Construct an Abstract RenderedImage from a source image, bounds
     * rect and props (may be null).
     * @param src will be the first (and only) member of the srcs
     * Vector. Src is also used to set the ColorModel, SampleModel,
     * and tile grid offsets.
     * @param bounds The bounds of this image.
     * @param props this initializes the props Map.  */
    protected AbstractRed(CachableRed src, Rectangle bounds, Map props) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12847);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12848);init(src, bounds, src.getColorModel(), src.getSampleModel(),
             src.getTileGridXOffset(),
             src.getTileGridYOffset(),
             props);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * Construct an Abstract RenderedImage from a source image, bounds
     * rect and props (may be null).
     * @param src if not null, will be the first (and only) member
     * of the srcs Vector. Also if it is not null it provides the
     * tile grid offsets, otherwise they are zero.
     * @param bounds The bounds of this image.
     * @param cm The ColorModel to use. If null it will default to
     * ComponentColorModel.
     * @param sm The sample model to use. If null it will construct
     * a sample model the matches the given/generated ColorModel and is
     * the size of bounds.
     * @param props this initializes the props Map.  */
    protected AbstractRed(CachableRed src, Rectangle bounds,
                          ColorModel cm, SampleModel sm,
                          Map props) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12849);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12850);init(src, bounds, cm, sm,
             ((((src == null) )&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12851)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12852)==0&false))? 0 : src.getTileGridXOffset(),
             ((((src == null) )&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12853)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12854)==0&false))? 0 : src.getTileGridYOffset(),
             props);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * Construct an Abstract Rable from a bounds rect and props
     * (may be null).  The srcs Vector will be empty.
     * @param src will be the first (and only) member of the srcs
     * Vector. Src is also used to set the ColorModel, SampleModel,
     * and tile grid offsets.
     * @param bounds this defines the extent of the rable in the
     * user coordinate system.
     * @param cm The ColorModel to use. If null it will default to
     * ComponentColorModel.
     * @param sm The sample model to use. If null it will construct
     * a sample model the matches the given/generated ColorModel and is
     * the size of bounds.
     * @param tileGridXOff The x location of tile 0,0.
     * @param tileGridYOff The y location of tile 0,0.
     * @param props this initializes the props Map.
     */
    protected AbstractRed(CachableRed src, Rectangle bounds,
                          ColorModel cm, SampleModel sm,
                          int tileGridXOff, int tileGridYOff,
                          Map props) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12855);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12856);init(src, bounds, cm, sm, tileGridXOff, tileGridYOff, props);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * This is one of two basic init function (this is for single
     * source rendereds).
     * It is provided so subclasses can compute various values
     * before initializing all the state in the base class.
     * You really should call this method before returning from
     * your subclass constructor.
     *
     * @param src    The source for the filter
     * @param bounds The bounds of the image
     * @param cm     The ColorModel to use. If null it defaults to
     *               ComponentColorModel/ src's ColorModel.
     * @param sm     The Sample modle to use. If this is null it will
     *               use the src's sample model if that is null it will
     *               construct a sample model that matches the ColorModel
     *               and is the size of the whole image.
     * @param tileGridXOff The x location of tile 0,0.
     * @param tileGridYOff The y location of tile 0,0.
     * @param props  Any properties you want to associate with the image.
     */
    protected void init(CachableRed src, Rectangle   bounds,
                        ColorModel  cm,   SampleModel sm,
                        int tileGridXOff, int tileGridYOff,
                        Map props) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12857);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12858);this.srcs         = new Vector(1);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12859);if ((((src != null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12860)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12861)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12862);this.srcs.add(src);
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12863);if ((((bounds == null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12864)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12865)==0&false))) {{
                __CLR4_5_29wq9wqm68iyhkp.R.inc(12866);bounds = src.getBounds();
            }
            }__CLR4_5_29wq9wqm68iyhkp.R.inc(12867);if ((((cm     == null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12868)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12869)==0&false))) {{
                __CLR4_5_29wq9wqm68iyhkp.R.inc(12870);cm     = src.getColorModel();
            }
            }__CLR4_5_29wq9wqm68iyhkp.R.inc(12871);if ((((sm     == null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12872)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12873)==0&false))) {{
                __CLR4_5_29wq9wqm68iyhkp.R.inc(12874);sm     = src.getSampleModel();
            }
        }}

        }__CLR4_5_29wq9wqm68iyhkp.R.inc(12875);this.bounds       = bounds;
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12876);this.tileGridXOff = tileGridXOff;
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12877);this.tileGridYOff = tileGridYOff;

        __CLR4_5_29wq9wqm68iyhkp.R.inc(12878);this.props        = new HashMap();
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12879);if ((((props != null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12880)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12881)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12882);this.props.putAll(props);
        }

        }__CLR4_5_29wq9wqm68iyhkp.R.inc(12883);if ((((cm == null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12884)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12885)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12886);cm = new ComponentColorModel(
                ColorSpace.getInstance(ColorSpace.CS_GRAY),
                 new int [] { 8 }, false, false, Transparency.OPAQUE,
                 DataBuffer.TYPE_BYTE);
        }

        }__CLR4_5_29wq9wqm68iyhkp.R.inc(12887);this.cm = cm;

        __CLR4_5_29wq9wqm68iyhkp.R.inc(12888);if ((((sm == null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12889)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12890)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12891);sm = cm.createCompatibleSampleModel(bounds.width, bounds.height);
        }
        }__CLR4_5_29wq9wqm68iyhkp.R.inc(12892);this.sm = sm;

        // Recompute tileWidth/Height, minTileX/Y, numX/YTiles.
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12893);updateTileGridInfo();
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * Construct an Abstract Rable from a List of sources a bounds rect
     * and props (may be null).
     * @param srcs This is used to initialize the srcs Vector.  All
     * the members of srcs must be CachableRed otherwise an error
     * will be thrown.
     * @param bounds this defines the extent of the rendered in pixels
     * @param props this initializes the props Map.
     */
    protected AbstractRed(List srcs, Rectangle bounds, Map props) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12894);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12895);init(srcs, bounds, null, null, bounds.x, bounds.y, props);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * Construct an Abstract RenderedImage from a bounds rect,
     * ColorModel (may be null), SampleModel (may be null) and props
     * (may be null).  The srcs Vector will be empty.
     * @param srcs This is used to initialize the srcs Vector.  All
     * the members of srcs must be CachableRed otherwise an error
     * will be thrown.
     * @param bounds this defines the extent of the rendered in pixels
     * @param cm The ColorModel to use. If null it will default to
     * ComponentColorModel.
     * @param sm The sample model to use. If null it will construct
     * a sample model the matches the given/generated ColorModel and is
     * the size of bounds.
     * @param props this initializes the props Map.
     */
    protected AbstractRed(List srcs, Rectangle bounds,
                          ColorModel cm, SampleModel sm,
                          Map props) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12896);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12897);init(srcs, bounds, cm, sm, bounds.x, bounds.y, props);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * Construct an Abstract RenderedImage from a bounds rect,
     * ColorModel (may be null), SampleModel (may be null), tile grid
     * offsets and props (may be null).  The srcs Vector will be
     * empty.
     * @param srcs This is used to initialize the srcs Vector.  All
     * the members of srcs must be CachableRed otherwise an error
     * will be thrown.
     * @param bounds this defines the extent of the rable in the
     * user coordinate system.
     * @param cm The ColorModel to use. If null it will default to
     * ComponentColorModel.
     * @param sm The sample model to use. If null it will construct
     * a sample model the matches the given/generated ColorModel and is
     * the size of bounds.
     * @param tileGridXOff The x location of tile 0,0.
     * @param tileGridYOff The y location of tile 0,0.
     * @param props this initializes the props Map.
     */
    protected AbstractRed(List srcs, Rectangle bounds,
                          ColorModel cm, SampleModel sm,
                          int tileGridXOff, int tileGridYOff,
                          Map props) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12898);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12899);init(srcs, bounds, cm, sm, tileGridXOff, tileGridYOff, props);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * This is the basic init function.
     * It is provided so subclasses can compute various values
     * before initializing all the state in the base class.
     * You really should call this method before returning from
     * your subclass constructor.
     *
     * @param srcs   The list of sources
     * @param bounds The bounds of the image
     * @param cm     The ColorModel to use. If null it defaults to
     *               ComponentColorModel.
     * @param sm     The Sample modle to use. If this is null it will
     *               construct a sample model that matches the ColorModel
     *               and is the size of the whole image.
     * @param tileGridXOff The x location of tile 0,0.
     * @param tileGridYOff The y location of tile 0,0.
     * @param props  Any properties you want to associate with the image.
     */
    protected void init(List srcs, Rectangle bounds,
                        ColorModel cm, SampleModel sm,
                        int tileGridXOff, int tileGridYOff,
                        Map props) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12900);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12901);this.srcs = new Vector();
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12902);if ((((srcs != null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12903)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12904)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12905);this.srcs.addAll(srcs);
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12906);if ((((srcs.size() != 0)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12907)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12908)==0&false))) {{
                __CLR4_5_29wq9wqm68iyhkp.R.inc(12909);CachableRed src = (CachableRed)srcs.get(0);
                __CLR4_5_29wq9wqm68iyhkp.R.inc(12910);if ((((bounds == null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12911)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12912)==0&false))) {{
                    __CLR4_5_29wq9wqm68iyhkp.R.inc(12913);bounds = src.getBounds();
                }
                }__CLR4_5_29wq9wqm68iyhkp.R.inc(12914);if ((((cm     == null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12915)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12916)==0&false))) {{
                    __CLR4_5_29wq9wqm68iyhkp.R.inc(12917);cm     = src.getColorModel();
                }
                }__CLR4_5_29wq9wqm68iyhkp.R.inc(12918);if ((((sm     == null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12919)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12920)==0&false))) {{
                    __CLR4_5_29wq9wqm68iyhkp.R.inc(12921);sm     = src.getSampleModel();
                }
            }}
        }}

        }__CLR4_5_29wq9wqm68iyhkp.R.inc(12922);this.bounds       = bounds;
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12923);this.tileGridXOff = tileGridXOff;
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12924);this.tileGridYOff = tileGridYOff;
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12925);this.props        = new HashMap();
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12926);if ((((props != null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12927)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12928)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12929);this.props.putAll(props);
        }

        }__CLR4_5_29wq9wqm68iyhkp.R.inc(12930);if ((((cm == null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12931)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12932)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12933);cm = new ComponentColorModel(
                ColorSpace.getInstance(ColorSpace.CS_GRAY),
                 new int [] { 8 }, false, false, Transparency.OPAQUE,
                 DataBuffer.TYPE_BYTE);
        }

        }__CLR4_5_29wq9wqm68iyhkp.R.inc(12934);this.cm = cm;

        __CLR4_5_29wq9wqm68iyhkp.R.inc(12935);if ((((sm == null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12936)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12937)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12938);sm = cm.createCompatibleSampleModel(bounds.width, bounds.height);
        }
        }__CLR4_5_29wq9wqm68iyhkp.R.inc(12939);this.sm = sm;

        // Recompute tileWidth/Height, minTileX/Y, numX/YTiles.
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12940);updateTileGridInfo();
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * This function computes all the basic information about the tile
     * grid based on the data stored in sm, and tileGridX/YOff.
     * It is responsible for updating tileWidth, tileHeight,
     * minTileX/Y, and numX/YTiles.
     */
    protected void updateTileGridInfo() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12941);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12942);this.tileWidth  = sm.getWidth();
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12943);this.tileHeight = sm.getHeight();

        __CLR4_5_29wq9wqm68iyhkp.R.inc(12944);int x1;
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12945);int y1;
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12946);int maxTileX;
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12947);int maxTileY;

        // This computes and caches important information about the
        // structure of the tile grid in general.
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12948);minTileX = getXTile(bounds.x);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12949);minTileY = getYTile(bounds.y);

        __CLR4_5_29wq9wqm68iyhkp.R.inc(12950);x1       = bounds.x + bounds.width - 1;     // Xloc of right edge
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12951);maxTileX = getXTile(x1);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12952);numXTiles = maxTileX - minTileX + 1;

        __CLR4_5_29wq9wqm68iyhkp.R.inc(12953);y1       = bounds.y + bounds.height - 1;     // Yloc of right edge
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12954);maxTileY = getYTile(y1);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12955);numYTiles = maxTileY - minTileY + 1;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}


    public Rectangle getBounds() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12956);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12957);return new Rectangle(getMinX(),
                             getMinY(),
                             getWidth(),
                             getHeight());
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public Vector getSources() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12958);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12959);return srcs;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public ColorModel getColorModel() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12960);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12961);return cm;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public SampleModel getSampleModel() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12962);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12963);return sm;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public int getMinX() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12964);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12965);return bounds.x;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}
    public int getMinY() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12966);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12967);return bounds.y;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public int getWidth() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12968);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12969);return bounds.width;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public int getHeight() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12970);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12971);return bounds.height;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public int getTileWidth() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12972);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12973);return tileWidth;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public int getTileHeight() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12974);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12975);return tileHeight;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public int getTileGridXOffset() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12976);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12977);return tileGridXOff;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public int getTileGridYOffset() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12978);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12979);return tileGridYOff;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public int getMinTileX() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12980);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12981);return minTileX;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public int getMinTileY() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12982);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12983);return minTileY;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public int getNumXTiles() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12984);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12985);return numXTiles;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public int getNumYTiles() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12986);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12987);return numYTiles;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public Object getProperty(String name) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(12988);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12989);Object ret = props.get(name);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(12990);if ((((ret != null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12991)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12992)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12993);return ret;
        }
        }__CLR4_5_29wq9wqm68iyhkp.R.inc(12994);for (Object src : srcs) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12995);RenderedImage ri = (RenderedImage) src;
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12996);ret = ri.getProperty(name);
            __CLR4_5_29wq9wqm68iyhkp.R.inc(12997);if ((((ret != null)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(12998)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(12999)==0&false))) {{
                __CLR4_5_29wq9wqm68iyhkp.R.inc(13000);return ret;
            }
        }}
        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13001);return null;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public String [] getPropertyNames() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(13002);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13003);Set keys = props.keySet();
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13004);String[] ret  = new String[keys.size()];
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13005);keys.toArray(ret);

        __CLR4_5_29wq9wqm68iyhkp.R.inc(13006);for (Object src : srcs) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13007);RenderedImage ri = (RenderedImage) src;
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13008);String[] srcProps = ri.getPropertyNames();
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13009);if ((((srcProps.length != 0)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13010)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13011)==0&false))) {{
                __CLR4_5_29wq9wqm68iyhkp.R.inc(13012);String[] tmp = new String[ret.length + srcProps.length];
                __CLR4_5_29wq9wqm68iyhkp.R.inc(13013);System.arraycopy(ret, 0, tmp, 0, ret.length);
                __CLR4_5_29wq9wqm68iyhkp.R.inc(13014);System.arraycopy(srcProps, 0, tmp, ret.length, srcProps.length);
                __CLR4_5_29wq9wqm68iyhkp.R.inc(13015);ret = tmp;
            }
        }}

        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13016);return ret;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public Shape getDependencyRegion(int srcIndex, Rectangle outputRgn) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(13017);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13018);if (((((srcIndex < 0) || (srcIndex > srcs.size()))&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13019)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13020)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13021);throw new IndexOutOfBoundsException(
                "Nonexistent source requested.");
        }

        // Return empty rect if they don't intersect.
        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13022);if ((((!outputRgn.intersects(bounds))&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13023)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13024)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13025);return new Rectangle();
        }

        // We only depend on our source for stuff that is inside
        // our bounds...
        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13026);return outputRgn.intersection(bounds);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public Shape getDirtyRegion(int srcIndex, Rectangle inputRgn) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(13027);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13028);if ((((srcIndex != 0)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13029)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13030)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13031);throw new IndexOutOfBoundsException(
                "Nonexistent source requested.");
        }

        // Return empty rect if they don't intersect.
        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13032);if ((((!inputRgn.intersects(bounds))&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13033)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13034)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13035);return new Rectangle();
        }

        // Changes in the input region don't propogate outside our
        // bounds.
        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13036);return inputRgn.intersection(bounds);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}


    // This is not included but can be implemented by the following.
    // In which case you _must_ reimplement getTile.
    // public WritableRaster copyData(WritableRaster wr) {
    //     copyToRaster(wr);
    //     return wr;
    // }

    public Raster getTile(int tileX, int tileY) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(13037);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13038);WritableRaster wr = makeTile(tileX, tileY);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13039);return copyData(wr);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public Raster getData() {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(13040);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13041);return getData(bounds);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public Raster getData(Rectangle rect) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(13042);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13043);SampleModel smRet = sm.createCompatibleSampleModel(
            rect.width, rect.height);

        __CLR4_5_29wq9wqm68iyhkp.R.inc(13044);Point pt = new Point(rect.x, rect.y);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13045);WritableRaster wr = Raster.createWritableRaster(smRet, pt);

        // System.out.println("GD DB: " + wr.getDataBuffer().getSize());
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13046);return copyData(wr);
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * Returns the x index of tile under xloc.
     * @param  xloc the x location (in pixels) to get tile for.
     * @return The tile index under xloc (may be outside tile grid).
     */
    public final int getXTile(int xloc) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(13047);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13048);int tgx = xloc - tileGridXOff;
        // We need to round to -infinity...
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13049);if ((((tgx >= 0)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13050)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13051)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13052);return tgx / tileWidth;
        } }else {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13053);return (tgx - tileWidth + 1) / tileWidth;
        }
    }}finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * Returns the y index of tile under yloc.
     * @param  yloc the y location (in pixels) to get tile for.
     * @return The tile index under yloc (may be outside tile grid).
     */
    public final int getYTile(int yloc) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(13054);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13055);int tgy = yloc - tileGridYOff;
        // We need to round to -infinity...
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13056);if ((((tgy >= 0)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13057)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13058)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13059);return tgy / tileHeight;
        } }else {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13060);return (tgy - tileHeight + 1) / tileHeight;
        }
    }}finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    /**
     * Copies data from this images tile grid into wr.  wr may
     * extend outside the bounds of this image in which case the
     * data in wr outside the bounds will not be touched.
     * @param wr Raster to fill with image data.
     */
    public void copyToRaster(WritableRaster wr) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(13061);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13062);int tx0 = getXTile(wr.getMinX());
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13063);int ty0 = getYTile(wr.getMinY());
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13064);int tx1 = getXTile(wr.getMinX() + wr.getWidth() - 1);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13065);int ty1 = getYTile(wr.getMinY() + wr.getHeight() - 1);

        __CLR4_5_29wq9wqm68iyhkp.R.inc(13066);if ((((tx0 < minTileX)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13067)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13068)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13069);tx0 = minTileX;
        }
        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13070);if ((((ty0 < minTileY)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13071)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13072)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13073);ty0 = minTileY;
        }

        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13074);if ((((tx1 >= minTileX + numXTiles)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13075)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13076)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13077);tx1 = minTileX + numXTiles - 1;
        }
        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13078);if ((((ty1 >= minTileY + numYTiles)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13079)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13080)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13081);ty1 = minTileY + numYTiles - 1;
        }

        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13082);final boolean isIntPack =
            GraphicsUtil.is_INT_PACK_Data(getSampleModel(), false);

        __CLR4_5_29wq9wqm68iyhkp.R.inc(13083);for (int y = ty0; (((y <= ty1)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13084)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13085)==0&false)); y++) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13086);for (int x = tx0; (((x <= tx1)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13087)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13088)==0&false)); x++) {{
                __CLR4_5_29wq9wqm68iyhkp.R.inc(13089);Raster r = getTile(x, y);
                __CLR4_5_29wq9wqm68iyhkp.R.inc(13090);if ((((isIntPack)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13091)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13092)==0&false))) {{
                    __CLR4_5_29wq9wqm68iyhkp.R.inc(13093);GraphicsUtil.copyData_INT_PACK(r, wr);
                } }else {{
                    __CLR4_5_29wq9wqm68iyhkp.R.inc(13094);GraphicsUtil.copyData_FALLBACK(r, wr);
                }
            }}
        }}
    }}finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}


    // static DataBufferReclaimer reclaim = new DataBufferReclaimer();

    /**
     * This is a helper function that will create the tile requested
     * Including properly subsetting the bounds of the tile to the
     * bounds of the current image.
     * @param tileX The x index of the tile to be built
     * @param tileY The y index of the tile to be built
     * @return The tile requested
     * @exception IndexOutOfBoundsException if the requested tile index
     *   falles outside of the bounds of the tile grid for the image.
     */
    public WritableRaster makeTile(int tileX, int tileY) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(13095);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13096);if (((((tileX < minTileX) || (tileX >= minTileX + numXTiles)
            || (tileY < minTileY) || (tileY >= minTileY + numYTiles))&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13097)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13098)==0&false))) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13099);throw new IndexOutOfBoundsException(
                "Requested Tile (" + tileX + ',' + tileY
                 + ") lies outside the bounds of image");
        }

        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13100);Point pt = new Point(tileGridXOff + tileX * tileWidth,
                             tileGridYOff + tileY * tileHeight);

        __CLR4_5_29wq9wqm68iyhkp.R.inc(13101);WritableRaster wr;
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13102);wr = Raster.createWritableRaster(sm, pt);
        // if (!(sm instanceof SinglePixelPackedSampleModel))
        //     wr = Raster.createWritableRaster(sm, pt);
        // else {
        //     SinglePixelPackedSampleModel sppsm;
        //     sppsm = (SinglePixelPackedSampleModel)sm;
        //     int stride = sppsm.getScanlineStride();
        //     int sz = stride*sppsm.getHeight();
        //
        //     int [] data = reclaim.request(sz);
        //     DataBuffer db = new DataBufferInt(data, sz);
        //
        //     reclaim.register(db);
        //
        //     wr = Raster.createWritableRaster(sm, db, pt);
        // }

        // System.out.println("MT DB: " + wr.getDataBuffer().getSize());

        __CLR4_5_29wq9wqm68iyhkp.R.inc(13103);int x0 = wr.getMinX();
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13104);int y0 = wr.getMinY();
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13105);int x1 = x0 + wr.getWidth() - 1;
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13106);int y1 = y0 + wr.getHeight() - 1;

        __CLR4_5_29wq9wqm68iyhkp.R.inc(13107);if (((((x0 < bounds.x) || (x1 >= (bounds.x + bounds.width))
            || (y0 < bounds.y) || (y1 >= (bounds.y + bounds.height)))&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13108)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13109)==0&false))) {{
            // Part of this raster lies outside our bounds so subset
            // it so it only advertises the stuff inside our bounds.
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13110);if ((((x0 < bounds.x)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13111)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13112)==0&false))) {{
                __CLR4_5_29wq9wqm68iyhkp.R.inc(13113);x0 = bounds.x;
            }
            }__CLR4_5_29wq9wqm68iyhkp.R.inc(13114);if ((((y0 < bounds.y)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13115)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13116)==0&false))) {{
                __CLR4_5_29wq9wqm68iyhkp.R.inc(13117);y0 = bounds.y;
            }
            }__CLR4_5_29wq9wqm68iyhkp.R.inc(13118);if ((((x1 >= (bounds.x + bounds.width))&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13119)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13120)==0&false))) {{
                __CLR4_5_29wq9wqm68iyhkp.R.inc(13121);x1 = bounds.x + bounds.width - 1;
            }
            }__CLR4_5_29wq9wqm68iyhkp.R.inc(13122);if ((((y1 >= (bounds.y + bounds.height))&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13123)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13124)==0&false))) {{
                __CLR4_5_29wq9wqm68iyhkp.R.inc(13125);y1 = bounds.y + bounds.height - 1;
            }

            }__CLR4_5_29wq9wqm68iyhkp.R.inc(13126);wr = wr.createWritableChild(x0, y0, x1 - x0 + 1, y1 - y0 + 1,
                                        x0, y0, null);
        }
        }__CLR4_5_29wq9wqm68iyhkp.R.inc(13127);return wr;
    }finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}

    public static void copyBand(Raster         src, int srcBand,
                                WritableRaster dst, int dstBand) {try{__CLR4_5_29wq9wqm68iyhkp.R.inc(13128);
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13129);Rectangle srcR = new Rectangle(src.getMinX(),  src.getMinY(),
                                       src.getWidth(), src.getHeight());
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13130);Rectangle dstR = new Rectangle(dst.getMinX(),  dst.getMinY(),
                                       dst.getWidth(), dst.getHeight());

        __CLR4_5_29wq9wqm68iyhkp.R.inc(13131);Rectangle cpR  = srcR.intersection(dstR);

        __CLR4_5_29wq9wqm68iyhkp.R.inc(13132);int [] samples = null;
        __CLR4_5_29wq9wqm68iyhkp.R.inc(13133);for (int y = cpR.y; (((y < cpR.y + cpR.height)&&(__CLR4_5_29wq9wqm68iyhkp.R.iget(13134)!=0|true))||(__CLR4_5_29wq9wqm68iyhkp.R.iget(13135)==0&false)); y++) {{
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13136);samples = src.getSamples(cpR.x, y, cpR.width, 1, srcBand, samples);
            __CLR4_5_29wq9wqm68iyhkp.R.inc(13137);dst.setSamples(cpR.x, y, cpR.width, 1, dstBand, samples);
        }
    }}finally{__CLR4_5_29wq9wqm68iyhkp.R.flushNeeded();}}
}

