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

/* $Id: ImageWriterParams.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.writer;


/**
 * Parameters for the encoder which is accessed through the
 * ImageWriter interface.
 *
 * @version $Id: ImageWriterParams.java 1732018 2016-02-24 04:51:06Z gadams $
 */
public class ImageWriterParams {public static class __CLR4_5_2alwalwm68iyhmv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,13795,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Forces a single strip for the whole image. */
    public static final int SINGLE_STRIP = -1;
    /** Used for generating exactly one strip for each row */
    public static final int ONE_ROW_PER_STRIP = 1;

    private Integer xResolution;
    private Integer yResolution;
    private Float jpegQuality;
    private Boolean jpegForceBaseline;
    private String compressionMethod;
    private ResolutionUnit resolutionUnit = ResolutionUnit.INCH;
    private int rowsPerStrip = ONE_ROW_PER_STRIP;
    private Endianness endianness = Endianness.DEFAULT;

    /**
     * Default constructor.
     */
    public ImageWriterParams() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13748);
        //nop
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * @return true if resolution has been set
     */
    public boolean hasResolution() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13749);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13750);return getXResolution() != null && getYResolution() != null;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * @return the image resolution in dpi, or null if undefined
     */
    public Integer getResolution() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13751);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13752);return getXResolution();
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * @return the quality value for encoding a JPEG image
     *          (0.0-1.0), or null if undefined
     */
    public Float getJPEGQuality() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13753);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13754);return this.jpegQuality;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * @return true if the baseline quantization table is forced,
     *          or null if undefined.
     */
    public Boolean getJPEGForceBaseline() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13755);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13756);return this.jpegForceBaseline;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /** @return the compression method for encoding the image */
    public String getCompressionMethod() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13757);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13758);return this.compressionMethod;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Sets the target resolution of the bitmap image to be written
     * (sets both the horizontal and vertical resolution to the same value).
     * @param resolution the resolution
     */
    public void setResolution(int resolution) {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13759);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13760);setXResolution(resolution);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13761);setYResolution(resolution);
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Sets the quality setting for encoding JPEG images.
     * @param quality the quality setting (0.0-1.0)
     * @param forceBaseline force baseline quantization table
     */
    public void setJPEGQuality(float quality, boolean forceBaseline) {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13762);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13763);this.jpegQuality = quality;
        __CLR4_5_2alwalwm68iyhmv.R.inc(13764);this.jpegForceBaseline = (((forceBaseline )&&(__CLR4_5_2alwalwm68iyhmv.R.iget(13765)!=0|true))||(__CLR4_5_2alwalwm68iyhmv.R.iget(13766)==0&false))? Boolean.TRUE : Boolean.FALSE;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Set the compression method that shall be used to encode the image.
     * @param method the compression method
     */
    public void setCompressionMethod(String method) {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13767);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13768);this.compressionMethod = method;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Checks if image is single strip (required by some fax processors).
     * @return true if one row per strip.
     */
    public boolean isSingleStrip() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13769);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13770);return rowsPerStrip == SINGLE_STRIP;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Convenience method to set rows per strip to single strip,
     * otherwise sets to one row per strip.
     * @param isSingle true if a single strip shall be produced, false if multiple strips are ok
     */
    public void setSingleStrip(boolean isSingle) {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13771);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13772);rowsPerStrip = (((isSingle )&&(__CLR4_5_2alwalwm68iyhmv.R.iget(13773)!=0|true))||(__CLR4_5_2alwalwm68iyhmv.R.iget(13774)==0&false))? SINGLE_STRIP : ONE_ROW_PER_STRIP;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Sets the rows per strip (default is one row per strip);
     * if set to -1 (single strip), will use height of the current page,
     * required by some fax processors.
     * @param rowsPerStrip the value to set.
     */
    public void setRowsPerStrip(int rowsPerStrip) {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13775);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13776);this.rowsPerStrip = rowsPerStrip;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * The number of rows per strip of the TIFF image, default 1.  A value of -1
     * indicates a single strip per page will be used and RowsPerStrip will be set
     * to image height for the associated page.
     * @return the number of rows per strip, default 1.
     */
    public int getRowsPerStrip() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13777);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13778);return rowsPerStrip;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Returns the unit in which resolution values are given (ex. units per inch).
     * @return the resolution unit.
     */
    public ResolutionUnit getResolutionUnit() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13779);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13780);return resolutionUnit;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Sets the resolution unit of the image for calculating resolution.
     * @param resolutionUnit the resolution unit (inches, centimeters etc.)
     */
    public void setResolutionUnit(ResolutionUnit resolutionUnit) {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13781);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13782);this.resolutionUnit = resolutionUnit;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * @return the horizontal image resolution in the current resolution unit, or null if undefined
     */
    public Integer getXResolution() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13783);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13784);return xResolution;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Sets the target horizontal resolution of the bitmap image to be written.
     * @param resolution the resolution value
     */
    public void setXResolution(int resolution) {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13785);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13786);xResolution = resolution;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * @return the vertical image resolution in the current resolution unit, or null if undefined
     */
    public Integer getYResolution() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13787);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13788);return yResolution;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Sets the target vertical resolution of the bitmap image to be written.
     * @param resolution the resolution value
     */
    public void setYResolution(int resolution) {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13789);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13790);yResolution = resolution;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Returns the endianness selected for the image.
     * @return the endianness
     */
    public Endianness getEndianness() {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13791);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13792);return this.endianness;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

    /**
     * Sets the endianness selected for the image.
     * @param endianness the endianness
     */
    public void setEndianness(Endianness endianness) {try{__CLR4_5_2alwalwm68iyhmv.R.inc(13793);
        __CLR4_5_2alwalwm68iyhmv.R.inc(13794);this.endianness = endianness;
    }finally{__CLR4_5_2alwalwm68iyhmv.R.flushNeeded();}}

}
