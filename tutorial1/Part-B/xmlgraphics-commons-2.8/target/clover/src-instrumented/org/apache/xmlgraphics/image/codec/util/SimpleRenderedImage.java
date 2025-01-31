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

/* $Id: SimpleRenderedImage.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.image.codec.util;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

// CSOFF: WhitespaceAround

/**
 * A simple class implemented the <code>RenderedImage</code>
 * interface.  Only the <code>getTile()</code> method needs to be
 * implemented by subclasses.  The instance variables must also be
 * filled in properly.
 *
 * <p> Normally in JAI <code>PlanarImage</code> is used for this
 * purpose, but in the interest of modularity the
 * use of <code>PlanarImage</code> has been avoided.
 *
 * @version $Id: SimpleRenderedImage.java 1804124 2017-08-04 14:13:54Z ssteiner $
 */
public abstract class SimpleRenderedImage implements RenderedImage {public static class __CLR4_5_26xq6xqm6lb4zmm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,9133,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The X coordinate of the image's upper-left pixel. */
    protected int minX;

    /** The Y coordinate of the image's upper-left pixel. */
    protected int minY;

    /** The image's width in pixels. */
    protected int width;

    /** The image's height in pixels. */
    protected int height;

    /** The width of a tile. */
    protected int tileWidth;

    /** The height of a tile. */
    protected int tileHeight;

    /** The X coordinate of the upper-left pixel of tile (0, 0). */
    protected int tileGridXOffset;

    /** The Y coordinate of the upper-left pixel of tile (0, 0). */
    protected int tileGridYOffset;

    /** The image's SampleModel. */
    protected SampleModel sampleModel;

    /** The image's ColorModel. */
    protected ColorModel colorModel;

    /** The image's sources, stored in a Vector. */
//    protected List sources = new ArrayList();

    /** A Hashtable containing the image properties. */
    protected Map properties = new HashMap();

    public SimpleRenderedImage() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(8990); }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /** Returns the X coordinate of the leftmost column of the image. */
    public int getMinX() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(8991);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(8992);return minX;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns the X coordinate of the column immediatetely to the
     * right of the rightmost column of the image.  getMaxX() is
     * implemented in terms of getMinX() and getWidth() and so does
     * not need to be implemented by subclasses.
     */
    public final int getMaxX() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(8993);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(8994);return getMinX() + getWidth();
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /** Returns the X coordinate of the uppermost row of the image. */
    public int getMinY() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(8995);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(8996);return minY;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns the Y coordinate of the row immediately below the
     * bottom row of the image.  getMaxY() is implemented in terms of
     * getMinY() and getHeight() and so does not need to be
     * implemented by subclasses.
     */
    public final int getMaxY() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(8997);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(8998);return getMinY() + getHeight();
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /** Returns the width of the image. */
    public int getWidth() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(8999);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9000);return width;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /** Returns the height of the image. */
    public int getHeight() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9001);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9002);return height;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /** Returns a Rectangle indicating the image bounds. */
    public Rectangle getBounds() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9003);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9004);return new Rectangle(getMinX(), getMinY(),
                             getWidth(), getHeight());
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /** Returns the width of a tile. */
    public int getTileWidth() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9005);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9006);return tileWidth;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /** Returns the height of a tile. */
    public int getTileHeight() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9007);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9008);return tileHeight;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns the X coordinate of the upper-left pixel of tile (0, 0).
     */
    public int getTileGridXOffset() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9009);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9010);return tileGridXOffset;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns the Y coordinate of the upper-left pixel of tile (0, 0).
     */
    public int getTileGridYOffset() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9011);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9012);return tileGridYOffset;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns the horizontal index of the leftmost column of tiles.
     * getMinTileX() is implemented in terms of getMinX()
     * and so does not need to be implemented by subclasses.
     */
    public int getMinTileX() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9013);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9014);return convertXToTileX(getMinX());
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns the horizontal index of the rightmost column of tiles.
     * getMaxTileX() is implemented in terms of getMaxX()
     * and so does not need to be implemented by subclasses.
     */
    public int getMaxTileX() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9015);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9016);return convertXToTileX(getMaxX() - 1);
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns the number of tiles along the tile grid in the
     * horizontal direction.  getNumXTiles() is implemented in terms
     * of getMinTileX() and getMaxTileX() and so does not need to be
     * implemented by subclasses.
     */
    public int getNumXTiles() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9017);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9018);return getMaxTileX() - getMinTileX() + 1;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns the vertical index of the uppermost row of tiles.  getMinTileY()
     * is implemented in terms of getMinY() and so does not need to be
     * implemented by subclasses.
     */
    public int getMinTileY() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9019);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9020);return convertYToTileY(getMinY());
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns the vertical index of the bottom row of tiles.  getMaxTileY()
     * is implemented in terms of getMaxY() and so does not need to
     * be implemented by subclasses.
     */
    public int getMaxTileY() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9021);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9022);return convertYToTileY(getMaxY() - 1);
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns the number of tiles along the tile grid in the vertical
     * direction.  getNumYTiles() is implemented in terms
     * of getMinTileY() and getMaxTileY() and so does not need to be
     * implemented by subclasses.
     */
    public int getNumYTiles() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9023);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9024);return getMaxTileY() - getMinTileY() + 1;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /** Returns the SampleModel of the image. */
    public SampleModel getSampleModel() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9025);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9026);return sampleModel;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /** Returns the ColorModel of the image. */
    public ColorModel getColorModel() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9027);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9028);return colorModel;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Gets a property from the property set of this image.  If the
     * property name is not recognized, <code>null</code> will be returned.
     *
     * @param name the name of the property to get, as a
     * <code>String</code>.
     * @return a reference to the property
     * <code>Object</code>, or the value <code>null</code>
     */
    public Object getProperty(String name) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9029);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9030);name = name.toLowerCase(Locale.getDefault());
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9031);return properties.get(name);
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns a list of the properties recognized by this image.  If
     * no properties are available, an empty String[] will be returned.
     *
     * @return an array of <code>String</code>s representing valid
     *         property names.
     */
    public String[] getPropertyNames() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9032);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9033);String[] names = new String[properties.size()];
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9034);properties.keySet().toArray(names);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9035);return names;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns an array of <code>String</code>s recognized as names by
     * this property source that begin with the supplied prefix.  If
     * no property names match, <code>null</code> will be returned.
     * The comparison is done in a case-independent manner.
     *
     * <p> The default implementation calls
     * <code>getPropertyNames()</code> and searches the list of names
     * for matches.
     *
     * @return an array of <code>String</code>s giving the valid
     * property names (can be null).
     */
    public String[] getPropertyNames(String prefix) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9036);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9037);String[] propertyNames = getPropertyNames();
//        if (propertyNames == null) {
//            return null;
//        }

        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9038);prefix = prefix.toLowerCase(Locale.getDefault());

        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9039);List names = new ArrayList();
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9040);for (String propertyName : propertyNames) {{
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9041);if ((((propertyName.startsWith(prefix))&&(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9042)!=0|true))||(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9043)==0&false))) {{
                __CLR4_5_26xq6xqm6lb4zmm.R.inc(9044);names.add(propertyName);
            }
        }}

        }__CLR4_5_26xq6xqm6lb4zmm.R.inc(9045);if ((((names.size() == 0)&&(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9046)!=0|true))||(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9047)==0&false))) {{
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9048);return null;
        }

        // Copy the strings from the Vector over to a String array.
        }__CLR4_5_26xq6xqm6lb4zmm.R.inc(9049);String[] prefixNames = new String[names.size()];
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9050);names.toArray(prefixNames);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9051);return prefixNames;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    // Utility methods.

    /**
     * Converts a pixel's X coordinate into a horizontal tile index
     * relative to a given tile grid layout specified by its X offset
     * and tile width.
     */
    public static int convertXToTileX(int x, int tileGridXOffset, int tileWidth) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9052);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9053);x -= tileGridXOffset;
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9054);if ((((x < 0)&&(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9055)!=0|true))||(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9056)==0&false))) {{
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9057);x += 1 - tileWidth; // Force round to -infinity
        }
        }__CLR4_5_26xq6xqm6lb4zmm.R.inc(9058);return x / tileWidth;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Converts a pixel's Y coordinate into a vertical tile index
     * relative to a given tile grid layout specified by its Y offset
     * and tile height.
     */
    public static int convertYToTileY(int y, int tileGridYOffset, int tileHeight) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9059);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9060);y -= tileGridYOffset;
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9061);if ((((y < 0)&&(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9062)!=0|true))||(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9063)==0&false))) {{
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9064);y += 1 - tileHeight; // Force round to -infinity
        }
        }__CLR4_5_26xq6xqm6lb4zmm.R.inc(9065);return y / tileHeight;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Converts a pixel's X coordinate into a horizontal tile index.
     * This is a convenience method.  No attempt is made to detect
     * out-of-range coordinates.
     *
     * @param x the X coordinate of a pixel.
     * @return the X index of the tile containing the pixel.
     */
    public int convertXToTileX(int x) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9066);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9067);return convertXToTileX(x, getTileGridXOffset(), getTileWidth());
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Converts a pixel's Y coordinate into a vertical tile index.
     * This is a convenience method.  No attempt is made to detect
     * out-of-range coordinates.
     *
     * @param y the Y coordinate of a pixel.
     * @return the Y index of the tile containing the pixel.
     */
    public int convertYToTileY(int y) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9068);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9069);return convertYToTileY(y, getTileGridYOffset(), getTileHeight());
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Converts a horizontal tile index into the X coordinate of its
     * upper left pixel relative to a given tile grid layout specified
     * by its X offset and tile width.
     */
    public static int tileXToX(int tx, int tileGridXOffset, int tileWidth) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9070);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9071);return tx * tileWidth + tileGridXOffset;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Converts a vertical tile index into the Y coordinate of
     * its upper left pixel relative to a given tile grid layout
     * specified by its Y offset and tile height.
     */
    public static int tileYToY(int ty, int tileGridYOffset, int tileHeight) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9072);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9073);return ty * tileHeight + tileGridYOffset;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Converts a horizontal tile index into the X coordinate of its
     * upper left pixel.  This is a convenience method.  No attempt is made
     * to detect out-of-range indices.
     *
     * @param tx the horizontal index of a tile.
     * @return the X coordinate of the tile's upper left pixel.
     */
    public int tileXToX(int tx) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9074);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9075);return tx * tileWidth + tileGridXOffset;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Converts a vertical tile index into the Y coordinate of its
     * upper left pixel.  This is a convenience method.  No attempt is made
     * to detect out-of-range indices.
     *
     * @param ty the vertical index of a tile.
     * @return the Y coordinate of the tile's upper left pixel.
     */
    public int tileYToY(int ty) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9076);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9077);return ty * tileHeight + tileGridYOffset;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    public Vector getSources() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9078);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9079);return null;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns the entire image in a single Raster.  For images with
     * multiple tiles this will require making a copy.
     *
     * <p> The returned Raster is semantically a copy.  This means
     * that updates to the source image will not be reflected in the
     * returned Raster.  For non-writable (immutable) source images,
     * the returned value may be a reference to the image's internal
     * data.  The returned Raster should be considered non-writable;
     * any attempt to alter its pixel data (such as by casting it to
     * WritableRaster or obtaining and modifying its DataBuffer) may
     * result in undefined behavior.  The copyData method should be
     * used if the returned Raster is to be modified.
     *
     * @return a Raster containing a copy of this image's data.
     */
    public Raster getData() {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9080);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9081);Rectangle rect = new Rectangle(getMinX(), getMinY(),
                                       getWidth(), getHeight());
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9082);return getData(rect);
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Returns an arbitrary rectangular region of the RenderedImage
     * in a Raster.  The rectangle of interest will be clipped against
     * the image bounds.
     *
     * <p> The returned Raster is semantically a copy.  This means
     * that updates to the source image will not be reflected in the
     * returned Raster.  For non-writable (immutable) source images,
     * the returned value may be a reference to the image's internal
     * data.  The returned Raster should be considered non-writable;
     * any attempt to alter its pixel data (such as by casting it to
     * WritableRaster or obtaining and modifying its DataBuffer) may
     * result in undefined behavior.  The copyData method should be
     * used if the returned Raster is to be modified.
     *
     * @param bounds the region of the RenderedImage to be returned.
     */
    public Raster getData(Rectangle bounds) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9083);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9084);int startX = convertXToTileX(bounds.x);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9085);int startY = convertYToTileY(bounds.y);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9086);int endX = convertXToTileX(bounds.x + bounds.width - 1);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9087);int endY = convertYToTileY(bounds.y + bounds.height - 1);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9088);Raster tile;

        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9089);if (((((startX == endX) && (startY == endY))&&(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9090)!=0|true))||(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9091)==0&false))) {{
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9092);tile = getTile(startX, startY);
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9093);return tile.createChild(bounds.x, bounds.y,
                                    bounds.width, bounds.height,
                                    bounds.x, bounds.y, null);
        } }else {{
            // Create a WritableRaster of the desired size
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9094);SampleModel sm =
                sampleModel.createCompatibleSampleModel(bounds.width,
                                                       bounds.height);

            // Translate it
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9095);WritableRaster dest =
                Raster.createWritableRaster(sm, bounds.getLocation());

            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9096);for (int j = startY; (((j <= endY)&&(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9097)!=0|true))||(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9098)==0&false)); j++) {{
                __CLR4_5_26xq6xqm6lb4zmm.R.inc(9099);for (int i = startX; (((i <= endX)&&(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9100)!=0|true))||(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9101)==0&false)); i++) {{
                    __CLR4_5_26xq6xqm6lb4zmm.R.inc(9102);tile = getTile(i, j);
                    __CLR4_5_26xq6xqm6lb4zmm.R.inc(9103);Rectangle intersectRect =
                        bounds.intersection(tile.getBounds());
                    __CLR4_5_26xq6xqm6lb4zmm.R.inc(9104);Raster liveRaster = tile.createChild(intersectRect.x,
                                                         intersectRect.y,
                                                         intersectRect.width,
                                                         intersectRect.height,
                                                         intersectRect.x,
                                                         intersectRect.y,
                                                         null);
                    __CLR4_5_26xq6xqm6lb4zmm.R.inc(9105);dest.setDataElements(0, 0, liveRaster);
                }
            }}
            }__CLR4_5_26xq6xqm6lb4zmm.R.inc(9106);return dest;
        }
    }}finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}

    /**
     * Copies an arbitrary rectangular region of the RenderedImage
     * into a caller-supplied WritableRaster.  The region to be
     * computed is determined by clipping the bounds of the supplied
     * WritableRaster against the bounds of the image.  The supplied
     * WritableRaster must have a SampleModel that is compatible with
     * that of the image.
     *
     * <p> If the raster argument is null, the entire image will
     * be copied into a newly-created WritableRaster with a SampleModel
     * that is compatible with that of the image.
     *
     * @param dest a WritableRaster to hold the returned portion of
     *        the image.
     * @return a reference to the supplied WritableRaster, or to a
     *         new WritableRaster if the supplied one was null.
     */
    public WritableRaster copyData(WritableRaster dest) {try{__CLR4_5_26xq6xqm6lb4zmm.R.inc(9107);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9108);Rectangle bounds;
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9109);Raster tile;

        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9110);if ((((dest == null)&&(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9111)!=0|true))||(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9112)==0&false))) {{
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9113);bounds = getBounds();
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9114);Point p = new Point(minX, minY);
            /* A SampleModel to hold the entire image. */
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9115);SampleModel sm = sampleModel.createCompatibleSampleModel(
                                         width, height);
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9116);dest = Raster.createWritableRaster(sm, p);
        } }else {{
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9117);bounds = dest.getBounds();
        }

        }__CLR4_5_26xq6xqm6lb4zmm.R.inc(9118);int startX = convertXToTileX(bounds.x);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9119);int startY = convertYToTileY(bounds.y);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9120);int endX = convertXToTileX(bounds.x + bounds.width - 1);
        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9121);int endY = convertYToTileY(bounds.y + bounds.height - 1);

        __CLR4_5_26xq6xqm6lb4zmm.R.inc(9122);for (int j = startY; (((j <= endY)&&(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9123)!=0|true))||(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9124)==0&false)); j++) {{
            __CLR4_5_26xq6xqm6lb4zmm.R.inc(9125);for (int i = startX; (((i <= endX)&&(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9126)!=0|true))||(__CLR4_5_26xq6xqm6lb4zmm.R.iget(9127)==0&false)); i++) {{
                __CLR4_5_26xq6xqm6lb4zmm.R.inc(9128);tile = getTile(i, j);
                __CLR4_5_26xq6xqm6lb4zmm.R.inc(9129);Rectangle intersectRect =
                    bounds.intersection(tile.getBounds());
                __CLR4_5_26xq6xqm6lb4zmm.R.inc(9130);Raster liveRaster = tile.createChild(intersectRect.x,
                                                     intersectRect.y,
                                                     intersectRect.width,
                                                     intersectRect.height,
                                                     intersectRect.x,
                                                     intersectRect.y,
                                                     null);

                /*
                 * WritableRaster.setDataElements takes into account of
                 * inRaster's minX and minY and add these to x and y. Since
                 * liveRaster has the origin at the correct location, the
                 * following call should not again give these coordinates in
                 * places of x and y.
                 */
                __CLR4_5_26xq6xqm6lb4zmm.R.inc(9131);dest.setDataElements(0, 0, liveRaster);
            }
        }}
        }__CLR4_5_26xq6xqm6lb4zmm.R.inc(9132);return dest;
    }finally{__CLR4_5_26xq6xqm6lb4zmm.R.flushNeeded();}}
}
