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

/* $Id: ImageFormGenerator.java 1881060 2020-08-21 15:38:04Z ssteiner $ */

package org.apache.xmlgraphics.ps;

import java.awt.Dimension;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.geom.Dimension2D;
import java.awt.image.RenderedImage;
import java.io.IOException;

/**
 * Abstract helper class for generating PostScript forms.
 */
public class ImageFormGenerator extends FormGenerator {public static class __CLR4_5_2d1ld1lm6lb514q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,16974,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //Mode 1 (RenderedImage)
    private RenderedImage image;

    //Mode 2 (ImageEncoder)
    private ImageEncoder encoder;
    private ColorSpace colorSpace;
    private int bitsPerComponent = 8;

    private boolean invertImage;
    private Dimension pixelDimensions;

    /**
     * Main constructor.
     * @param formName the form's name
     * @param title the form's title or null
     * @param dimensions the form's dimensions in units (usually points)
     * @param image the image
     * @param invertImage true if the image shall be inverted
     */
    public ImageFormGenerator(String formName, String title,
            Dimension2D dimensions,
            RenderedImage image, boolean invertImage) {
        super(formName, title, dimensions);__CLR4_5_2d1ld1lm6lb514q.R.inc(16906);try{__CLR4_5_2d1ld1lm6lb514q.R.inc(16905);
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16907);this.image = image;
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16908);this.encoder = ImageEncodingHelper.createRenderedImageEncoder(image);
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16909);this.invertImage = invertImage;
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16910);this.pixelDimensions = new Dimension(image.getWidth(), image.getHeight());
    }finally{__CLR4_5_2d1ld1lm6lb514q.R.flushNeeded();}}

    /**
     * Main constructor.
     * @param formName the form's name
     * @param title the form's title or null
     * @param dimensions the form's dimensions in units (usually points)
     * @param dimensionsPx the form's dimensions in pixels
     * @param encoder the image encoder
     * @param colorSpace the target color space
     * @param bitsPerComponent the bits per component
     * @param invertImage true if the image shall be inverted
     */
    public ImageFormGenerator(String formName, String title,
            Dimension2D dimensions, Dimension dimensionsPx,
            ImageEncoder encoder,
            ColorSpace colorSpace, int bitsPerComponent, boolean invertImage) {
        super(formName, title, dimensions);__CLR4_5_2d1ld1lm6lb514q.R.inc(16912);try{__CLR4_5_2d1ld1lm6lb514q.R.inc(16911);
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16913);this.pixelDimensions = dimensionsPx;
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16914);this.encoder = encoder;
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16915);this.colorSpace = colorSpace;
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16916);this.bitsPerComponent = bitsPerComponent;
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16917);this.invertImage = invertImage;
    }finally{__CLR4_5_2d1ld1lm6lb514q.R.flushNeeded();}}

    /**
     * Main constructor.
     * @param formName the form's name
     * @param title the form's title or null
     * @param dimensions the form's dimensions in units (usually points)
     * @param dimensionsPx the form's dimensions in pixels
     * @param encoder the image encoder
     * @param colorSpace the target color space
     * @param invertImage true if the image shall be inverted
     */
    public ImageFormGenerator(String formName, String title,
            Dimension2D dimensions, Dimension dimensionsPx,
            ImageEncoder encoder,
            ColorSpace colorSpace, boolean invertImage) {
        this(formName, title, dimensions, dimensionsPx, encoder, colorSpace, 8, invertImage);__CLR4_5_2d1ld1lm6lb514q.R.inc(16919);try{__CLR4_5_2d1ld1lm6lb514q.R.inc(16918);
    }finally{__CLR4_5_2d1ld1lm6lb514q.R.flushNeeded();}}

    /**
     * Returns the name of the data segment associated with this image form.
     * @return the data segment name
     */
    protected String getDataName() {try{__CLR4_5_2d1ld1lm6lb514q.R.inc(16920);
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16921);return getFormName() + ":Data";
    }finally{__CLR4_5_2d1ld1lm6lb514q.R.flushNeeded();}}

    private String getAdditionalFilters(PSGenerator gen) {try{__CLR4_5_2d1ld1lm6lb514q.R.inc(16922);
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16923);String implicitFilter = encoder.getImplicitFilter();
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16924);if ((((implicitFilter != null)&&(__CLR4_5_2d1ld1lm6lb514q.R.iget(16925)!=0|true))||(__CLR4_5_2d1ld1lm6lb514q.R.iget(16926)==0&false))) {{
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16927);return "/ASCII85Decode filter " + implicitFilter + " filter";
        } }else {{
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16928);if ((((gen.getPSLevel() >= 3)&&(__CLR4_5_2d1ld1lm6lb514q.R.iget(16929)!=0|true))||(__CLR4_5_2d1ld1lm6lb514q.R.iget(16930)==0&false))) {{
                __CLR4_5_2d1ld1lm6lb514q.R.inc(16931);return "/ASCII85Decode filter";
            } }else {{
                __CLR4_5_2d1ld1lm6lb514q.R.inc(16932);return "/ASCII85Decode filter /RunLengthDecode filter";
            }
        }}
    }}finally{__CLR4_5_2d1ld1lm6lb514q.R.flushNeeded();}}

    /** {@inheritDoc} */
    protected void generatePaintProc(PSGenerator gen) throws IOException {try{__CLR4_5_2d1ld1lm6lb514q.R.inc(16933);
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16934);if ((((gen.getPSLevel() == 2)&&(__CLR4_5_2d1ld1lm6lb514q.R.iget(16935)!=0|true))||(__CLR4_5_2d1ld1lm6lb514q.R.iget(16936)==0&false))) {{
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16937);gen.writeln("    userdict /i 0 put"); //rewind image data
        } }else {{
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16938);gen.writeln("    " + getDataName() + " 0 setfileposition"); //rewind image data
        }
        }__CLR4_5_2d1ld1lm6lb514q.R.inc(16939);String dataSource;
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16940);if ((((gen.getPSLevel() == 2)&&(__CLR4_5_2d1ld1lm6lb514q.R.iget(16941)!=0|true))||(__CLR4_5_2d1ld1lm6lb514q.R.iget(16942)==0&false))) {{
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16943);dataSource = "{ " + getDataName() + " i get /i i 1 add store } bind";
        } }else {{
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16944);dataSource = getDataName();
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16945);if ((((gen.getPSLevel() >= 3)&&(__CLR4_5_2d1ld1lm6lb514q.R.iget(16946)!=0|true))||(__CLR4_5_2d1ld1lm6lb514q.R.iget(16947)==0&false))) {{
                __CLR4_5_2d1ld1lm6lb514q.R.inc(16948);String implicitFilter = encoder.getImplicitFilter();
                __CLR4_5_2d1ld1lm6lb514q.R.inc(16949);if ((((implicitFilter == null)&&(__CLR4_5_2d1ld1lm6lb514q.R.iget(16950)!=0|true))||(__CLR4_5_2d1ld1lm6lb514q.R.iget(16951)==0&false))) {{
                    __CLR4_5_2d1ld1lm6lb514q.R.inc(16952);dataSource += " /FlateDecode filter";
                }
            }}
        }}
        }__CLR4_5_2d1ld1lm6lb514q.R.inc(16953);AffineTransform at = new AffineTransform();
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16954);at.scale(getDimensions().getWidth(), getDimensions().getHeight());
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16955);gen.concatMatrix(at);
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16956);PSDictionary imageDict = new PSDictionary();
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16957);imageDict.put("/DataSource", dataSource);
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16958);if ((((this.image != null)&&(__CLR4_5_2d1ld1lm6lb514q.R.iget(16959)!=0|true))||(__CLR4_5_2d1ld1lm6lb514q.R.iget(16960)==0&false))) {{
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16961);PSImageUtils.writeImageCommand(this.image, imageDict, gen);
        } }else {{
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16962);imageDict.put("/BitsPerComponent", Integer.toString(this.bitsPerComponent));
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16963);PSImageUtils.writeImageCommand(imageDict,
                    this.pixelDimensions, this.colorSpace, this.invertImage,
                    gen);
        }
    }}finally{__CLR4_5_2d1ld1lm6lb514q.R.flushNeeded();}}

    /** {@inheritDoc} */
    protected void generateAdditionalDataStream(PSGenerator gen) throws IOException {try{__CLR4_5_2d1ld1lm6lb514q.R.inc(16964);
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16965);gen.writeln("/" + getDataName() + " currentfile");
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16966);gen.writeln(getAdditionalFilters(gen));
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16967);if ((((gen.getPSLevel() == 2)&&(__CLR4_5_2d1ld1lm6lb514q.R.iget(16968)!=0|true))||(__CLR4_5_2d1ld1lm6lb514q.R.iget(16969)==0&false))) {{
            //Creates a data array from the inline file
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16970);gen.writeln("{ /temp exch def ["
                    + " { temp 16384 string readstring not {exit } if } loop ] } exec");
        } }else {{
            __CLR4_5_2d1ld1lm6lb514q.R.inc(16971);gen.writeln("/ReusableStreamDecode filter");
        }
        }__CLR4_5_2d1ld1lm6lb514q.R.inc(16972);PSImageUtils.compressAndWriteBitmap(encoder, gen);
        __CLR4_5_2d1ld1lm6lb514q.R.inc(16973);gen.writeln("def");
    }finally{__CLR4_5_2d1ld1lm6lb514q.R.flushNeeded();}}

}
