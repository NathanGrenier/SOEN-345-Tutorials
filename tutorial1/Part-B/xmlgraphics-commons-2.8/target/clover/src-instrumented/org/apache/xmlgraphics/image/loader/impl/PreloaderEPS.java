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

/* $Id: PreloaderEPS.java 1610846 2014-07-15 20:44:18Z vhennebert $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.nio.ByteOrder;

import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;

import org.apache.xmlgraphics.image.loader.ImageContext;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSize;
import org.apache.xmlgraphics.image.loader.util.ImageInputStreamAdapter;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;
import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.dsc.DSCException;
import org.apache.xmlgraphics.ps.dsc.DSCParser;
import org.apache.xmlgraphics.ps.dsc.DSCParserConstants;
import org.apache.xmlgraphics.ps.dsc.events.DSCComment;
import org.apache.xmlgraphics.ps.dsc.events.DSCCommentBoundingBox;
import org.apache.xmlgraphics.ps.dsc.events.DSCEvent;
import org.apache.xmlgraphics.util.MimeConstants;

/**
 * Image preloader for EPS images (Encapsulated PostScript).
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PreloaderEPS extends AbstractImagePreloader {public static class __CLR4_5_28oi8oim6lb508a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,11371,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Key for binary header object used in custom objects of the ImageInfo class. */
    public static final Object EPS_BINARY_HEADER = EPSBinaryFileHeader.class;
    /** Key for bounding box used in custom objects of the ImageInfo class. */
    public static final Object EPS_BOUNDING_BOX = Rectangle2D.class;

    /** {@inheritDoc} */
    public ImageInfo preloadImage(String uri, Source src, ImageContext context)
            throws IOException {try{__CLR4_5_28oi8oim6lb508a.R.inc(11250);
        __CLR4_5_28oi8oim6lb508a.R.inc(11251);if ((((!ImageUtil.hasImageInputStream(src))&&(__CLR4_5_28oi8oim6lb508a.R.iget(11252)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11253)==0&false))) {{
            __CLR4_5_28oi8oim6lb508a.R.inc(11254);return null;
        }
        }__CLR4_5_28oi8oim6lb508a.R.inc(11255);ImageInputStream in = ImageUtil.needImageInputStream(src);
        __CLR4_5_28oi8oim6lb508a.R.inc(11256);in.mark();
        __CLR4_5_28oi8oim6lb508a.R.inc(11257);ByteOrder originalByteOrder = in.getByteOrder();
        __CLR4_5_28oi8oim6lb508a.R.inc(11258);in.setByteOrder(ByteOrder.LITTLE_ENDIAN);
        __CLR4_5_28oi8oim6lb508a.R.inc(11259);EPSBinaryFileHeader binaryHeader = null;
        __CLR4_5_28oi8oim6lb508a.R.inc(11260);try {
            __CLR4_5_28oi8oim6lb508a.R.inc(11261);long magic = in.readUnsignedInt();
            __CLR4_5_28oi8oim6lb508a.R.inc(11262);magic &= 0xFFFFFFFFL; //Work-around for bug in Java 1.4.2
            // Check if binary header
            __CLR4_5_28oi8oim6lb508a.R.inc(11263);boolean supported = false;
            __CLR4_5_28oi8oim6lb508a.R.inc(11264);if ((((magic == 0xC6D3D0C5L)&&(__CLR4_5_28oi8oim6lb508a.R.iget(11265)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11266)==0&false))) {{
                __CLR4_5_28oi8oim6lb508a.R.inc(11267);supported = true; //binary EPS

                __CLR4_5_28oi8oim6lb508a.R.inc(11268);binaryHeader = readBinaryFileHeader(in);
                __CLR4_5_28oi8oim6lb508a.R.inc(11269);in.reset();
                __CLR4_5_28oi8oim6lb508a.R.inc(11270);in.mark(); //Mark start of file again
                __CLR4_5_28oi8oim6lb508a.R.inc(11271);in.seek(binaryHeader.psStart);

            } }else {__CLR4_5_28oi8oim6lb508a.R.inc(11272);if ((((magic == 0x53502125L)&&(__CLR4_5_28oi8oim6lb508a.R.iget(11273)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11274)==0&false))) {{ //"%!PS" in little endian
                __CLR4_5_28oi8oim6lb508a.R.inc(11275);supported = true; //ascii EPS
                __CLR4_5_28oi8oim6lb508a.R.inc(11276);in.reset();
                __CLR4_5_28oi8oim6lb508a.R.inc(11277);in.mark(); //Mark start of file again
            } }else {{
                __CLR4_5_28oi8oim6lb508a.R.inc(11278);in.reset();
            }

            }}__CLR4_5_28oi8oim6lb508a.R.inc(11279);if ((((supported)&&(__CLR4_5_28oi8oim6lb508a.R.iget(11280)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11281)==0&false))) {{
                __CLR4_5_28oi8oim6lb508a.R.inc(11282);ImageInfo info = new ImageInfo(uri, MimeConstants.MIME_EPS);
                __CLR4_5_28oi8oim6lb508a.R.inc(11283);boolean success = determineSize(in, context, info);
                __CLR4_5_28oi8oim6lb508a.R.inc(11284);in.reset(); //Need to go back to start of file
                __CLR4_5_28oi8oim6lb508a.R.inc(11285);if ((((!success)&&(__CLR4_5_28oi8oim6lb508a.R.iget(11286)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11287)==0&false))) {{
                    //No BoundingBox found, so probably no EPS
                    __CLR4_5_28oi8oim6lb508a.R.inc(11288);return null;
                }
                }__CLR4_5_28oi8oim6lb508a.R.inc(11289);if ((((in.getStreamPosition() != 0)&&(__CLR4_5_28oi8oim6lb508a.R.iget(11290)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11291)==0&false))) {{
                    __CLR4_5_28oi8oim6lb508a.R.inc(11292);throw new IllegalStateException("Need to be at the start of the file here");
                }
                }__CLR4_5_28oi8oim6lb508a.R.inc(11293);if ((((binaryHeader != null)&&(__CLR4_5_28oi8oim6lb508a.R.iget(11294)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11295)==0&false))) {{
                    __CLR4_5_28oi8oim6lb508a.R.inc(11296);info.getCustomObjects().put(EPS_BINARY_HEADER, binaryHeader);
                }
                }__CLR4_5_28oi8oim6lb508a.R.inc(11297);return info;
            } }else {{
                __CLR4_5_28oi8oim6lb508a.R.inc(11298);return null;
            }
        }} finally {
            __CLR4_5_28oi8oim6lb508a.R.inc(11299);in.setByteOrder(originalByteOrder);
        }
    }finally{__CLR4_5_28oi8oim6lb508a.R.flushNeeded();}}

    private EPSBinaryFileHeader readBinaryFileHeader(ImageInputStream in) throws IOException {try{__CLR4_5_28oi8oim6lb508a.R.inc(11300);
        __CLR4_5_28oi8oim6lb508a.R.inc(11301);EPSBinaryFileHeader offsets = new EPSBinaryFileHeader();
        __CLR4_5_28oi8oim6lb508a.R.inc(11302);offsets.psStart = in.readUnsignedInt();
        __CLR4_5_28oi8oim6lb508a.R.inc(11303);offsets.psLength = in.readUnsignedInt();
        __CLR4_5_28oi8oim6lb508a.R.inc(11304);offsets.wmfStart = in.readUnsignedInt();
        __CLR4_5_28oi8oim6lb508a.R.inc(11305);offsets.wmfLength = in.readUnsignedInt();
        __CLR4_5_28oi8oim6lb508a.R.inc(11306);offsets.tiffStart = in.readUnsignedInt();
        __CLR4_5_28oi8oim6lb508a.R.inc(11307);offsets.tiffLength = in.readUnsignedInt();
        __CLR4_5_28oi8oim6lb508a.R.inc(11308);return offsets;
    }finally{__CLR4_5_28oi8oim6lb508a.R.flushNeeded();}}

    private boolean determineSize(ImageInputStream in, ImageContext context, ImageInfo info)
            throws IOException {try{__CLR4_5_28oi8oim6lb508a.R.inc(11309);

        __CLR4_5_28oi8oim6lb508a.R.inc(11310);in.mark();
        __CLR4_5_28oi8oim6lb508a.R.inc(11311);try {
            __CLR4_5_28oi8oim6lb508a.R.inc(11312);Rectangle2D bbox = null;
            __CLR4_5_28oi8oim6lb508a.R.inc(11313);DSCParser parser;
            __CLR4_5_28oi8oim6lb508a.R.inc(11314);try {
                __CLR4_5_28oi8oim6lb508a.R.inc(11315);parser = new DSCParser(new ImageInputStreamAdapter(in));
                __CLR4_5_28oi8oim6lb508a.R.inc(11316);outerLoop:
                while ((((parser.hasNext())&&(__CLR4_5_28oi8oim6lb508a.R.iget(11317)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11318)==0&false))) {{
                    __CLR4_5_28oi8oim6lb508a.R.inc(11319);DSCEvent event = parser.nextEvent();
                    boolean __CLB4_5_2_bool0=false;__CLR4_5_28oi8oim6lb508a.R.inc(11320);switch (event.getEventType()) {
                    case DSCParserConstants.HEADER_COMMENT:if (!__CLB4_5_2_bool0) {__CLR4_5_28oi8oim6lb508a.R.inc(11321);__CLB4_5_2_bool0=true;}
                    case DSCParserConstants.COMMENT:if (!__CLB4_5_2_bool0) {__CLR4_5_28oi8oim6lb508a.R.inc(11322);__CLB4_5_2_bool0=true;}
                        //ignore
                        __CLR4_5_28oi8oim6lb508a.R.inc(11323);break;
                    case DSCParserConstants.DSC_COMMENT:if (!__CLB4_5_2_bool0) {__CLR4_5_28oi8oim6lb508a.R.inc(11324);__CLB4_5_2_bool0=true;}
                        __CLR4_5_28oi8oim6lb508a.R.inc(11325);DSCComment comment = event.asDSCComment();
                        __CLR4_5_28oi8oim6lb508a.R.inc(11326);if ((((comment instanceof DSCCommentBoundingBox)&&(__CLR4_5_28oi8oim6lb508a.R.iget(11327)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11328)==0&false))) {{
                            __CLR4_5_28oi8oim6lb508a.R.inc(11329);DSCCommentBoundingBox bboxComment = (DSCCommentBoundingBox)comment;
                            __CLR4_5_28oi8oim6lb508a.R.inc(11330);if ((((DSCConstants.BBOX.equals(bboxComment.getName()) && bbox == null)&&(__CLR4_5_28oi8oim6lb508a.R.iget(11331)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11332)==0&false))) {{
                                __CLR4_5_28oi8oim6lb508a.R.inc(11333);bbox = (Rectangle2D)bboxComment.getBoundingBox().clone();
                                //BoundingBox is good but HiRes is better so continue
                            } }else {__CLR4_5_28oi8oim6lb508a.R.inc(11334);if ((((DSCConstants.HIRES_BBOX.equals(bboxComment.getName()))&&(__CLR4_5_28oi8oim6lb508a.R.iget(11335)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11336)==0&false))) {{
                                __CLR4_5_28oi8oim6lb508a.R.inc(11337);bbox = (Rectangle2D)bboxComment.getBoundingBox().clone();
                                //HiRefBBox is great so stop
                                __CLR4_5_28oi8oim6lb508a.R.inc(11338);break outerLoop;
                            }
                        }}}
                        }__CLR4_5_28oi8oim6lb508a.R.inc(11339);break;
                    default:if (!__CLB4_5_2_bool0) {__CLR4_5_28oi8oim6lb508a.R.inc(11340);__CLB4_5_2_bool0=true;}
                        //No more header so stop
                        __CLR4_5_28oi8oim6lb508a.R.inc(11341);break outerLoop;
                    }
                }
                }__CLR4_5_28oi8oim6lb508a.R.inc(11342);if ((((bbox == null)&&(__CLR4_5_28oi8oim6lb508a.R.iget(11343)!=0|true))||(__CLR4_5_28oi8oim6lb508a.R.iget(11344)==0&false))) {{
                    __CLR4_5_28oi8oim6lb508a.R.inc(11345);return false;
                }
            }} catch (DSCException e) {
                __CLR4_5_28oi8oim6lb508a.R.inc(11346);throw new IOException("Error while parsing EPS file: " + e.getMessage());
            }

            __CLR4_5_28oi8oim6lb508a.R.inc(11347);ImageSize size = new ImageSize();
            __CLR4_5_28oi8oim6lb508a.R.inc(11348);size.setSizeInMillipoints(
                    (int)Math.round(bbox.getWidth() * 1000),
                    (int)Math.round(bbox.getHeight() * 1000));
            __CLR4_5_28oi8oim6lb508a.R.inc(11349);size.setResolution(context.getSourceResolution());
            __CLR4_5_28oi8oim6lb508a.R.inc(11350);size.calcPixelsFromSize();
            __CLR4_5_28oi8oim6lb508a.R.inc(11351);info.setSize(size);
            __CLR4_5_28oi8oim6lb508a.R.inc(11352);info.getCustomObjects().put(EPS_BOUNDING_BOX, bbox);
            __CLR4_5_28oi8oim6lb508a.R.inc(11353);return true;
        } finally {
            __CLR4_5_28oi8oim6lb508a.R.inc(11354);in.reset();
        }
    }finally{__CLR4_5_28oi8oim6lb508a.R.flushNeeded();}}

    /**
     * Holder class for various pointers to the contents of the EPS file.
     */
    public static class EPSBinaryFileHeader {

        private long psStart;
        private long psLength;
        private long wmfStart;
        private long wmfLength;
        private long tiffStart;
        private long tiffLength;

        /**
         * Returns the start offset of the PostScript section.
         * @return the start offset
         */
        public long getPSStart() {try{__CLR4_5_28oi8oim6lb508a.R.inc(11355);
            __CLR4_5_28oi8oim6lb508a.R.inc(11356);return psStart;
        }finally{__CLR4_5_28oi8oim6lb508a.R.flushNeeded();}}

        /**
         * Returns the length of the PostScript section.
         * @return the length of the PostScript section (in bytes)
         */
        public long getPSLength() {try{__CLR4_5_28oi8oim6lb508a.R.inc(11357);
            __CLR4_5_28oi8oim6lb508a.R.inc(11358);return psLength;
        }finally{__CLR4_5_28oi8oim6lb508a.R.flushNeeded();}}

        /**
         * Indicates whether the EPS has a WMF preview.
         * @return true if there is a WMF preview
         */
        public boolean hasWMFPreview() {try{__CLR4_5_28oi8oim6lb508a.R.inc(11359);
            __CLR4_5_28oi8oim6lb508a.R.inc(11360);return (wmfStart != 0);
        }finally{__CLR4_5_28oi8oim6lb508a.R.flushNeeded();}}

        /**
         * Returns the start offset of the WMF preview.
         * @return the start offset (or 0 if there's no WMF preview)
         */
        public long getWMFStart() {try{__CLR4_5_28oi8oim6lb508a.R.inc(11361);
            __CLR4_5_28oi8oim6lb508a.R.inc(11362);return wmfStart;
        }finally{__CLR4_5_28oi8oim6lb508a.R.flushNeeded();}}

        /**
         * Returns the length of the WMF preview.
         * @return the length of the WMF preview (in bytes)
         */
        public long getWMFLength() {try{__CLR4_5_28oi8oim6lb508a.R.inc(11363);
            __CLR4_5_28oi8oim6lb508a.R.inc(11364);return wmfLength;
        }finally{__CLR4_5_28oi8oim6lb508a.R.flushNeeded();}}

        /**
         * Indicates whether the EPS has a TIFF preview.
         * @return true if there is a TIFF preview
         */
        public boolean hasTIFFPreview() {try{__CLR4_5_28oi8oim6lb508a.R.inc(11365);
            __CLR4_5_28oi8oim6lb508a.R.inc(11366);return (tiffStart != 0);
        }finally{__CLR4_5_28oi8oim6lb508a.R.flushNeeded();}}

        /**
         * Returns the start offset of the TIFF preview.
         * @return the start offset (or 0 if there's no TIFF preview)
         */
        public long getTIFFStart() {try{__CLR4_5_28oi8oim6lb508a.R.inc(11367);
            __CLR4_5_28oi8oim6lb508a.R.inc(11368);return tiffStart;
        }finally{__CLR4_5_28oi8oim6lb508a.R.flushNeeded();}}

        /**
         * Returns the length of the TIFF preview.
         * @return the length of the TIFF preview (in bytes)
         */
        public long getTIFFLength() {try{__CLR4_5_28oi8oim6lb508a.R.inc(11369);
            __CLR4_5_28oi8oim6lb508a.R.inc(11370);return tiffLength;
        }finally{__CLR4_5_28oi8oim6lb508a.R.flushNeeded();}}

    }

}
