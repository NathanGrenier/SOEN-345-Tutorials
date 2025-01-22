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

/* $Id: PSState.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.ps;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import org.apache.xmlgraphics.java2d.color.ColorUtil;

/**
 * This class holds the current state of the PostScript interpreter.
 *
 * @version $Id: PSState.java 1804124 2017-08-04 14:13:54Z ssteiner $
 */
public class PSState implements Serializable {public static class __CLR4_5_2e6we6wm68iyi55{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,18479,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default for setdash */
    public static final String DEFAULT_DASH = "[] 0";
    /** Default color in PostScript */
    public static final Color DEFAULT_RGB_COLOR = Color.black;
    private static final long serialVersionUID = -3862731539801753248L;

    private AffineTransform transform = new AffineTransform();
    private List transformConcatList = new java.util.ArrayList();

    private int linecap;
    private int linejoin;
    private float miterLimit;
    private double linewidth = 1.0f;
    private String dashpattern = DEFAULT_DASH;
    private Color color = DEFAULT_RGB_COLOR;

    //Font state
    private String fontname;
    private float fontsize;

    /**
     * Default constructor
     */
    public PSState() {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18392);
        //nop
    }finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Copy constructor
     * @param org the original to copy from
     * @param copyTransforms true if the list of matrix concats should be cloned, too
     */
    public PSState(PSState org, boolean copyTransforms) {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18393);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18394);this.transform = (AffineTransform)org.transform.clone();
        __CLR4_5_2e6we6wm68iyi55.R.inc(18395);if ((((copyTransforms)&&(__CLR4_5_2e6we6wm68iyi55.R.iget(18396)!=0|true))||(__CLR4_5_2e6we6wm68iyi55.R.iget(18397)==0&false))) {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18398);this.transformConcatList.addAll(org.transformConcatList);
        }
        }__CLR4_5_2e6we6wm68iyi55.R.inc(18399);this.linecap = org.linecap;
        __CLR4_5_2e6we6wm68iyi55.R.inc(18400);this.linejoin = org.linejoin;
        __CLR4_5_2e6we6wm68iyi55.R.inc(18401);this.miterLimit = org.miterLimit;
        __CLR4_5_2e6we6wm68iyi55.R.inc(18402);this.linewidth = org.linewidth;
        __CLR4_5_2e6we6wm68iyi55.R.inc(18403);this.dashpattern = org.dashpattern;
        __CLR4_5_2e6we6wm68iyi55.R.inc(18404);this.color = org.color;
        __CLR4_5_2e6we6wm68iyi55.R.inc(18405);this.fontname = org.fontname;
        __CLR4_5_2e6we6wm68iyi55.R.inc(18406);this.fontsize = org.fontsize;
    }finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Returns the transform.
     * @return the current transformation matrix
     */
    public AffineTransform getTransform() {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18407);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18408);return this.transform;
    }finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Check the current transform.
     * The transform for the current state is the combination of all
     * transforms in the current state. The parameter is compared
     * against this current transform.
     *
     * @param tf the transform the check against
     * @return true if the new transform is different then the current transform
     */
    public boolean checkTransform(AffineTransform tf) {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18409);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18410);return !tf.equals(this.transform);
    }finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Concats the given transformation matrix with the current one.
     * @param transform The new transformation matrix
     */
    public void concatMatrix(AffineTransform transform) {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18411);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18412);this.transformConcatList.add(transform);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18413);this.transform.concatenate(transform);
    }finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Establishes the specified line cap.
     * @param value line cap (0, 1 or 2) as defined by the setlinecap command
     * @return true if the line cap changed compared to the previous setting
     */
    public boolean useLineCap(int value) {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18414);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18415);if ((((linecap != value)&&(__CLR4_5_2e6we6wm68iyi55.R.iget(18416)!=0|true))||(__CLR4_5_2e6we6wm68iyi55.R.iget(18417)==0&false))) {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18418);linecap = value;
            __CLR4_5_2e6we6wm68iyi55.R.inc(18419);return true;
        } }else {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18420);return false;
        }
    }}finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Establishes the specified line join.
     * @param value line join (0, 1 or 2) as defined by the setlinejoin command
     * @return true if the line join changed compared to the previous setting
     */
    public boolean useLineJoin(int value) {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18421);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18422);if ((((linejoin != value)&&(__CLR4_5_2e6we6wm68iyi55.R.iget(18423)!=0|true))||(__CLR4_5_2e6we6wm68iyi55.R.iget(18424)==0&false))) {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18425);linejoin = value;
            __CLR4_5_2e6we6wm68iyi55.R.inc(18426);return true;
        } }else {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18427);return false;
        }
    }}finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Establishes the specified miter limit.
     * @param value the miter limit as defined by the setmiterlimit command
     * @return true if the miter limit changed compared to the previous setting
     */
    public boolean useMiterLimit(float value) {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18428);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18429);if ((((miterLimit != value)&&(__CLR4_5_2e6we6wm68iyi55.R.iget(18430)!=0|true))||(__CLR4_5_2e6we6wm68iyi55.R.iget(18431)==0&false))) {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18432);miterLimit = value;
            __CLR4_5_2e6we6wm68iyi55.R.inc(18433);return true;
        } }else {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18434);return false;
        }
    }}finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Establishes the specified line width.
     * @param value line width as defined by the setlinewidth command
     * @return true if the line width changed compared to the previous setting
     */
    public boolean useLineWidth(double value) {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18435);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18436);if ((((linewidth != value)&&(__CLR4_5_2e6we6wm68iyi55.R.iget(18437)!=0|true))||(__CLR4_5_2e6we6wm68iyi55.R.iget(18438)==0&false))) {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18439);linewidth = value;
            __CLR4_5_2e6we6wm68iyi55.R.inc(18440);return true;
        } }else {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18441);return false;
        }
    }}finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Establishes the specified dash.
     * @param pattern dash pattern as defined by the setdash command
     * @return true if the dash pattern changed compared to the previous setting
     */
    public boolean useDash(String pattern) {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18442);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18443);if ((((!dashpattern.equals(pattern))&&(__CLR4_5_2e6we6wm68iyi55.R.iget(18444)!=0|true))||(__CLR4_5_2e6we6wm68iyi55.R.iget(18445)==0&false))) {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18446);dashpattern = pattern;
            __CLR4_5_2e6we6wm68iyi55.R.inc(18447);return true;
        } }else {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18448);return false;
        }
    }}finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Establishes the specified color (RGB).
     * @param value color as defined by the setrgbcolor command
     * @return true if the color changed compared to the previous setting
     */
    public boolean useColor(Color value) {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18449);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18450);if ((((!ColorUtil.isSameColor(color, value))&&(__CLR4_5_2e6we6wm68iyi55.R.iget(18451)!=0|true))||(__CLR4_5_2e6we6wm68iyi55.R.iget(18452)==0&false))) {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18453);color = value;
            __CLR4_5_2e6we6wm68iyi55.R.inc(18454);return true;
        } }else {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18455);return false;
        }
    }}finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Establishes the specified font and size.
     * @param name name of the font for the "F" command (see FOP Std Proc Set)
     * @param size size of the font
     * @return true if the font changed compared to the previous setting
     */
    public boolean useFont(String name, float size) {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18456);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18457);if ((((name == null)&&(__CLR4_5_2e6we6wm68iyi55.R.iget(18458)!=0|true))||(__CLR4_5_2e6we6wm68iyi55.R.iget(18459)==0&false))) {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18460);throw new NullPointerException("font name must not be null");
        }
        }__CLR4_5_2e6we6wm68iyi55.R.inc(18461);if ((((fontname == null || !fontname.equals(name) || fontsize != size)&&(__CLR4_5_2e6we6wm68iyi55.R.iget(18462)!=0|true))||(__CLR4_5_2e6we6wm68iyi55.R.iget(18463)==0&false))) {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18464);fontname = name;
            __CLR4_5_2e6we6wm68iyi55.R.inc(18465);fontsize = size;
            __CLR4_5_2e6we6wm68iyi55.R.inc(18466);return true;
        } }else {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18467);return false;
        }
    }}finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

    /**
     * Reestablishes the graphics state represented by this instance by issueing the
     * necessary commands.
     * @param gen The generator to use for output
     * @exception IOException In case of an I/O problem
     */
    public void reestablish(PSGenerator gen) throws IOException {try{__CLR4_5_2e6we6wm68iyi55.R.inc(18468);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18469);for (Object aTransformConcatList : transformConcatList) {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18470);gen.concatMatrix((AffineTransform) aTransformConcatList);
        }
        }__CLR4_5_2e6we6wm68iyi55.R.inc(18471);gen.useLineCap(linecap);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18472);gen.useLineWidth(linewidth);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18473);gen.useDash(dashpattern);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18474);gen.useColor(color);
        __CLR4_5_2e6we6wm68iyi55.R.inc(18475);if ((((fontname != null)&&(__CLR4_5_2e6we6wm68iyi55.R.iget(18476)!=0|true))||(__CLR4_5_2e6we6wm68iyi55.R.iget(18477)==0&false))) {{
            __CLR4_5_2e6we6wm68iyi55.R.inc(18478);gen.useFont(fontname, fontsize);
        }
    }}finally{__CLR4_5_2e6we6wm68iyi55.R.flushNeeded();}}

}
