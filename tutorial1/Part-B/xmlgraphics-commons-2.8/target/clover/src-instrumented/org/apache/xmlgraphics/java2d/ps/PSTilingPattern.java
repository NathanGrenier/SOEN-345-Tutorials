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

/* $Id: PSTilingPattern.java 1809627 2017-09-25 13:42:08Z ssteiner $ */

package org.apache.xmlgraphics.java2d.ps;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.List;

/**
 * This class is implementation of PostScript tiling pattern. It allows to make a pattern
 * with defined PaintProc or texture.
 *
 * Originally authored by Jiri Kunhart.
 */
public class PSTilingPattern {public static class __CLR4_5_2ck7ck7m68iyhyi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,16552,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A code identifying the pattern type that this dictionary describes;
     * must be 1 for a tiling pattern
     */
    public static final int PATTERN_TYPE_TILING = 1;

    /** PostScript constant for a shading pattern (unsupported) */
    public static final int PATTERN_TYPE_SHADING = 2;

    /** the pattern type of this pattern */
    protected int patternType = PATTERN_TYPE_TILING;
    //TODO To be moved to a super class once shading patterns are implemented.

    /**
     * The name of the pattern (for example: "Pattern1" )
     */
    protected String patternName;

    /**
     * The XUID is an extended unique ID -- an array of integers that provides for
     * distributed, hierarchical management of the space of unique ID numbers
     * (optional)
     */
    protected List xUID;

    /**
     * A PostScript procedure for painting the pattern cell
     */
    protected StringBuffer paintProc;

    /**
     * An array of four numbers in the pattern coordinate system, giving
     * the coordinates of the left, bottom, right, and top edges, respectively, of the
     * pattern cell's bounding box
     */
    protected Rectangle2D bBox;

    /**
     * The desired horizontal spacing between pattern cells, measured in
     * the pattern coordinate system
     */
    protected double xStep;

    /**
     * The desired vertical spacing between pattern cells, measured in
     * the pattern coordinate system
     */
    protected double yStep;

    /**
     * A code that determines how the color of the pattern cell is to be
     * specified: 1 for colored pattern, 2 for uncolored pattern
     */
    protected int paintType = 2;

    /**
     * A code that controls adjustments to the spacing of tiles relative to
     * the device pixel grid:
     * 1 for constant spacing,
     * 2 for no distortion
     * 3 for constant spacing and faster tiling.
     */
    protected int tilingType = 1;

    /**
     *  A texture is used for filling shapes
     */
    protected TexturePaint texture;

    /**
     * Constructor for the creation of pattern with defined PaintProc
     *
     * @param patternName the name of the pattern (for example: "Pattern1" ), if
     * the name is null, the pattern should be stored in PSPatternStorage, where the pattern
     * gets a name (the pattern without name cannot be use in PS file)
     * @param paintProc a postscript procedure for painting the pattern cell
     * @param bBox a pattern cell's bounding box
     * @param xStep the desired horizontal spacing between pattern cells
     * @param yStep the desired vertical spacing between pattern cells
     * @param paintType 1 for colored pattern, 2 for uncolored pattern
     * @param tilingType adjustments to the spacing of tiles relative to
     * the device pixel grid (1,2 or 3)
     * @param xUID an extended unique ID (optional)
     */
    public PSTilingPattern(String patternName, StringBuffer paintProc, Rectangle bBox,
                           double xStep, double yStep,
                           int paintType, int tilingType, List xUID) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16279);

        // check the parameters
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16280);this.patternName = patternName;
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16281);this.paintProc = paintProc;
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16282);setBoundingBox(bBox);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16283);setXStep(xStep);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16284);setYStep(yStep);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16285);setPaintType(paintType);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16286);setTilingType(tilingType);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16287);this.xUID = xUID;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Constructor for the creation of pattern with defined texture
     *
     * @param patternName the name of the pattern (for example: "Pattern1" ), if
     * the name is null, the pattern should be stored in PSPatternStorage, where the pattern
     * gets a name (a pattern without name cannot be use in PS file)
     * @param texture a texture is used for filling a shape
     * @param xStep the desired horizontal spacing between pattern cells
     * @param yStep yStep the desired vertical spacing between pattern cells
     * @param tilingType adjustments to the spacing of tiles relative to
     * the device pixel grid (1,2 or 3)
     * @param xUID xUID an extended unique ID (optional)
     */
    public PSTilingPattern(String patternName, TexturePaint texture, double xStep, double yStep,
                           int tilingType, List xUID) {

        this(patternName, null, new Rectangle(), 1, 1, 1, tilingType, xUID);__CLR4_5_2ck7ck7m68iyhyi.R.inc(16289);try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16288);

        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16290);this.texture = texture;

        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16291);Rectangle2D anchor = texture.getAnchorRect();
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16292);bBox = new Rectangle2D.Double(
                anchor.getX(), anchor.getY(),
                anchor.getX() + anchor.getWidth(), anchor.getY() + anchor.getHeight());

        // xStep and yStep may be either positive or negative, but not zero => if it is zero,
        // we set xStep and yStep in this way that the pattern will be without spaces
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16293);this.xStep = ((((xStep == 0) )&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16294)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16295)==0&false))? anchor.getWidth() : xStep;
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16296);this.yStep = ((((yStep == 0) )&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16297)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16298)==0&false))? anchor.getHeight() : yStep;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Gets the name of the pattern
     *
     * @return String representing the name of the pattern.
     */
    public String getName() {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16299);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16300);return (this.patternName);
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Sets the name of the pattern.
     * @param name the name of the pattern. Can be anything without spaces (for example "Pattern1").
     */
    public void setName(String name) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16301);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16302);if ((((name == null)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16303)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16304)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16305);throw new NullPointerException("Parameter patternName must not be null");
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16306);if ((((name.length() == 0)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16307)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16308)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16309);throw new IllegalArgumentException("Parameter patternName must not be empty");
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16310);if ((((name.indexOf(" ") >= 0)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16311)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16312)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16313);throw new IllegalArgumentException(
                    "Pattern name must not contain any spaces");
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16314);this.patternName = name;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Returns the bounding box.
     *
     * @return a pattern cell's bounding box
     */
    public Rectangle2D getBoundingBox() {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16315);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16316);return (this.bBox);
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Sets the bounding box.
     *
     * @param bBox a pattern cell's bounding box
     */
    public void setBoundingBox(Rectangle2D bBox) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16317);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16318);if ((((bBox == null)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16319)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16320)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16321);throw new NullPointerException("Parameter bBox must not be null");
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16322);this.bBox = bBox;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Gets the postscript procedure PaintProc
     *
     * @return the postscript procedure PaintProc
     */
    public StringBuffer getPaintProc() {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16323);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16324);return (this.paintProc);
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Sets the postscript procedure PaintProc
     *
     * @param paintProc the postscript procedure PaintProc
     */
    public void setPaintProc(StringBuffer paintProc) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16325);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16326);this.paintProc = paintProc;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Gets the horizontal spacing between pattern cells
     *
     * @return the horizontal spacing between pattern cells
     */
    public double getXStep() {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16327);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16328);return (this.xStep);
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Sets the horizontal spacing between pattern cells
     *
     * @param xStep the horizontal spacing between pattern cells
     */
    public void setXStep(double xStep) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16329);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16330);if ((((xStep == 0)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16331)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16332)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16333);throw new IllegalArgumentException("Parameter xStep must not be 0");
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16334);this.xStep = xStep;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Gets the vertical spacing between pattern cells
     *
     * @return the vertical spacing between pattern cells
     */
    public double getYStep() {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16335);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16336);return (this.yStep);
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Sets the vertical spacing between pattern cells
     *
     * @param yStep the vertical spacing between pattern cells
     */
    public void setYStep(double yStep) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16337);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16338);if ((((yStep == 0)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16339)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16340)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16341);throw new IllegalArgumentException("Parameter yStep must not be 0");
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16342);this.yStep = yStep;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Gets the code that determines how the color of the pattern cell is to be
     * specified: 1 for colored pattern, 2 for uncolored pattern
     *
     * @return the paint type
     */
    public int getPaintType() {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16343);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16344);return (this.paintType);
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Sets the code that determines how the color of the pattern cell is to be
     * specified: 1 for colored pattern, 2 for uncolored pattern
     *
     * @param paintType the paint type
     */
    public void setPaintType(int paintType) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16345);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16346);if (((((paintType != 1) && (paintType != 2))&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16347)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16348)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16349);throw new IllegalArgumentException("Parameter paintType must not be "
                    + paintType + " (only 1 or 2)");
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16350);this.paintType = paintType;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Gets a code that controls adjustments to the spacing of tiles relative to
     * the device pixel grid: 1 for constant spacing, 2 for no distortion
     * 3 for constant spacing and faster tiling
     *
     * @return the tiling type
     */
    public int getTilingType() {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16351);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16352);return (this.tilingType);
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Sets a code that controls adjustments to the spacing of tiles relative to
     * the device pixel grid: 1 for constant spacing, 2 for no distortion
     * 3 for constant spacing and faster tiling
     *
     * @param tilingType the tiling type
     */
    public void setTilingType(int tilingType) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16353);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16354);if ((((!((tilingType <= 3) && (tilingType >= 1)))&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16355)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16356)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16357);throw new IllegalArgumentException("Parameter tilingType must not be "
                    + tilingType + " (only 1, 2 or 3)");
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16358);this.tilingType = tilingType;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Gets a texture which is used for filling shapes
     *
     * @return the texture
     */
    public TexturePaint getTexturePaint() {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16359);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16360);return (this.texture);
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Sets a texture which is used for filling shapes
     *
     * @param texturePaint the texture
     */
    public void setTexturePaint(TexturePaint texturePaint) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16361);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16362);this.texture = texturePaint;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Gets an extended unique ID that uniquely identifies the pattern
     *
     * @return xUID the unique ID
     */
    public List getXUID() {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16363);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16364);return (this.xUID);
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Sets an extended unique ID that uniquely identifies the pattern
     *
     * @param xUID the unique ID
     */
    public void setXUID(List xUID) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16365);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16366);this.xUID = xUID;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Generates postscript code for a pattern
     *
     * @return The string which contains postscript code of pattern definition
     */
    public String toString(boolean acrobatDownsample) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16367);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16368);StringBuffer sb = new StringBuffer("<<\n");
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16369);sb.append("/PatternType " + this.patternType + "\n");
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16370);sb.append("/PaintType " + paintType + "\n");
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16371);sb.append("/TilingType " + tilingType + "\n");
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16372);sb.append("/XStep " + xStep + "\n");
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16373);sb.append("/YStep " + yStep + "\n");
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16374);sb.append("/BBox " + "[" + bBox.getX() + " " + bBox.getY() + " "
                        + bBox.getWidth() + " " + bBox.getHeight() + "]" + "\n");
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16375);sb.append("/PaintProc\n" + "{\n");

        // the PaintProc procedure is expected to consume its dictionary operand !
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16376);if (((((paintProc == null) || (paintProc.indexOf("pop") != 0))&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16377)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16378)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16379);sb.append("pop\n");
        }

        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16380);if ((((texture != null)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16381)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16382)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16383);int width = texture.getImage().getWidth();
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16384);int height = texture.getImage().getHeight();

            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16385);Rectangle2D anchor = texture.getAnchorRect();
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16386);if ((((anchor.getX() != 0 || anchor.getY() != 0)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16387)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16388)==0&false))) {{
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16389);sb.append(anchor.getX() + " " + anchor.getY() + " translate\n");
            }
            }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16390);double scaleX = anchor.getWidth() / width;
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16391);double scaleY = anchor.getHeight() / height;
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16392);if ((((scaleX != 1 || scaleY != 1)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16393)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16394)==0&false))) {{
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16395);sb.append(scaleX + " " + scaleY + " scale\n");
            }

            // define color image: width height bits/comp matrix
            //                        datasrc0 datasrcncomp-1 multi ncomp colorimage
            // width height bits/comp matrix
            }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16396);int bits = 8;
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16397);if ((((acrobatDownsample)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16398)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16399)==0&false))) {{
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16400);bits = 4;
            }
            }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16401);sb.append(width).append(" ").append(height).append(" ").append(bits).append(" ").append("matrix\n");
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16402);int [] argb = new int[width * height];                  // datasrc0 datasrcncomp-1
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16403);getAsRGB().getRGB(0, 0, width, height, argb, 0, width);

            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16404);writeImage(sb, argb, width, bits);

            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16405);sb.append(" false 3 colorimage");                   //  multi ncomp colorimage
        } }else {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16406);sb.append(paintProc);
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16407);sb.append("\n} bind \n");  // the end of PaintProc
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16408);sb.append(">>\n");

        // create pattern instance from prototype
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16409);sb.append("matrix\n");
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16410);sb.append("makepattern\n");

        // save pattern to current dictionary
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16411);sb.append("/" + patternName + " exch def\n");

        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16412);return sb.toString();
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    private void writeImage(StringBuffer sb, int[] argb, int width, int bits) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16413);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16414);int count = 0;
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16415);sb.append("{<");
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16416);for (int i = 0; (((i < argb.length)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16417)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16418)==0&false)); i++) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16419);if (((((i % width == 0) || (count > 249))&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16420)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16421)==0&false))) {{
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16422);sb.append('\n');
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16423);count = 0;  // line should not be longer than 255 characters
            }
            }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16424);if ((((bits == 4)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16425)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16426)==0&false))) {{
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16427);Color c = new Color(argb[i]);
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16428);int v = c.getRed() / 16;
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16429);String s = Integer.toHexString(v);
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16430);sb.append(s);

                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16431);v = c.getGreen() / 16;
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16432);s = Integer.toHexString(v);
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16433);sb.append(s);

                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16434);v = c.getBlue() / 16;
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16435);s = Integer.toHexString(v);
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16436);sb.append(s);

                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16437);count += 3;
            } }else {{
                // delete alpha canal and write to output
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16438);StringBuffer sRGB = new StringBuffer(Integer.toHexString(argb[i] & 0x00ffffff));
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16439);if ((((sRGB.length() != 6)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16440)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16441)==0&false))) {{
                    __CLR4_5_2ck7ck7m68iyhyi.R.inc(16442);sRGB.insert(0, "000000");   // zero padding
                    __CLR4_5_2ck7ck7m68iyhyi.R.inc(16443);sRGB = new StringBuffer(sRGB.substring(sRGB.length() - 6));
                }
                }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16444);sb.append(sRGB);
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16445);count += 6;
            }
        }}
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16446);sb.append("\n>}");
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    private BufferedImage getAsRGB() {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16447);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16448);BufferedImage img = texture.getImage();
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16449);if ((((img.getType() != BufferedImage.TYPE_INT_RGB)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16450)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16451)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16452);BufferedImage buf = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16453);Graphics2D g = buf.createGraphics();
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16454);g.setComposite(AlphaComposite.SrcOver);
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16455);g.setBackground(Color.white);
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16456);g.fillRect(0, 0, img.getWidth(), img.getHeight());
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16457);g.drawImage(img, 0, 0, null);
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16458);g.dispose();
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16459);return buf;
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16460);return img;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int hashCode() {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16461);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16462);return
            0
            ^ patternType
            ^ (((((xUID != null) )&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16463)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16464)==0&false))? xUID.hashCode() : 0)
            ^ (((((paintProc != null) )&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16465)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16466)==0&false))? paintProc.hashCode() : 0)
            ^ (((((bBox != null) )&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16467)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16468)==0&false))? bBox.hashCode() : 0)
            ^ Double.valueOf(xStep).hashCode()
            ^ Double.valueOf(yStep).hashCode()
            ^ paintType
            ^ tilingType
            ^ (((((texture != null) )&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16469)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16470)==0&false))? texture.hashCode() : 0);
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}

    /**
     * Compares two patterns data (except their names).
     * {@inheritDoc}
     */
    public boolean equals(Object pattern) {try{__CLR4_5_2ck7ck7m68iyhyi.R.inc(16471);
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16472);if ((((pattern == null)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16473)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16474)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16475);return false;
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16476);if ((((!(pattern instanceof PSTilingPattern))&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16477)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16478)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16479);return false;
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16480);if ((((this == pattern)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16481)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16482)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16483);return true;
        }

        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16484);PSTilingPattern patternObj = (PSTilingPattern) pattern;
        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16485);if ((((this.patternType != patternObj.patternType)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16486)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16487)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16488);return false;
        }

        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16489);TexturePaint patternTexture = patternObj.getTexturePaint();

        __CLR4_5_2ck7ck7m68iyhyi.R.inc(16490);if ((((((patternTexture == null) && (texture != null))
             || ((patternTexture != null) && (texture == null)))&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16491)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16492)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16493);return false;
        }

        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16494);if (((((patternTexture != null) && (texture != null))&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16495)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16496)==0&false))) {{
            // compare textures data
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16497);int width = texture.getImage().getWidth();
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16498);int height = texture.getImage().getHeight();

            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16499);int widthPattern = patternTexture.getImage().getWidth();
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16500);int heightPattern = patternTexture.getImage().getHeight();

            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16501);if ((((width != widthPattern)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16502)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16503)==0&false))) {{
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16504);return false;
            }
            }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16505);if ((((height != heightPattern)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16506)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16507)==0&false))) {{
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16508);return false;
            }
            }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16509);int [] rgbData = new int[width * height];
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16510);int [] rgbDataPattern = new int[widthPattern * heightPattern];

            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16511);texture.getImage().getRGB(0, 0, width, height, rgbData, 0, width);
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16512);patternTexture.getImage().getRGB(0, 0, widthPattern, heightPattern,
                    rgbDataPattern, 0, widthPattern);

            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16513);for (int i = 0; (((i < rgbData.length)&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16514)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16515)==0&false)); i++) {{
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16516);if ((((rgbData[i] != rgbDataPattern[i])&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16517)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16518)==0&false))) {{
                    __CLR4_5_2ck7ck7m68iyhyi.R.inc(16519);return false;
                }
            }}
        }} }else {{
            // compare PaintProc
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16520);if ((((!paintProc.toString().equals(patternObj.getPaintProc().toString()))&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16521)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16522)==0&false))) {{
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16523);return false;
            }
        }}

        // compare other parameters
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16524);if ((((xStep != patternObj.getXStep())&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16525)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16526)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16527);return false;
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16528);if ((((yStep != patternObj.getYStep())&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16529)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16530)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16531);return false;
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16532);if ((((paintType != patternObj.getPaintType())&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16533)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16534)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16535);return false;
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16536);if ((((tilingType != patternObj.getTilingType())&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16537)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16538)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16539);return false;
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16540);if ((((!bBox.equals(patternObj.getBoundingBox()))&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16541)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16542)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16543);return false;
        }
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16544);if (((((xUID != null) && (patternObj.getXUID() != null))&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16545)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16546)==0&false))) {{
            __CLR4_5_2ck7ck7m68iyhyi.R.inc(16547);if ((((!xUID.equals(patternObj.getXUID()))&&(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16548)!=0|true))||(__CLR4_5_2ck7ck7m68iyhyi.R.iget(16549)==0&false))) {{
                __CLR4_5_2ck7ck7m68iyhyi.R.inc(16550);return false;
            }
        }}
        }__CLR4_5_2ck7ck7m68iyhyi.R.inc(16551);return true;
    }finally{__CLR4_5_2ck7ck7m68iyhyi.R.flushNeeded();}}
}
