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

/* $Id: PreloaderJPEG.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.io.IOException;
import java.nio.ByteOrder;

import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;

import org.apache.xmlgraphics.image.loader.ImageContext;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSize;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;
import org.apache.xmlgraphics.util.MimeConstants;
import org.apache.xmlgraphics.util.UnitConv;

/**
 * Image preloader for JPEG images.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PreloaderJPEG extends AbstractImagePreloader implements JPEGConstants {public static class __CLR4_5_28sp8spm6lb50b2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,11584,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int JPG_SIG_LENGTH = 3;
    private static final int[] BYTES_PER_COMPONENT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8}; // ignore 0
    private static final int EXIF = 0x45786966;
    private static final int II = 0x4949; // Intel
    private static final int MM = 0x4d4d; // Motorola
    private static final int X_RESOLUTION = 0x011a;
    private static final int Y_RESOLUTION = 0x011b;
    private static final int RESOLUTION_UNIT = 0x0128;

    /** {@inheritDoc}
     * @throws ImageException */
    public ImageInfo preloadImage(String uri, Source src, ImageContext context)
                throws IOException, ImageException {try{__CLR4_5_28sp8spm6lb50b2.R.inc(11401);
        __CLR4_5_28sp8spm6lb50b2.R.inc(11402);if ((((!ImageUtil.hasImageInputStream(src))&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11403)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11404)==0&false))) {{
            __CLR4_5_28sp8spm6lb50b2.R.inc(11405);return null;
        }
        }__CLR4_5_28sp8spm6lb50b2.R.inc(11406);ImageInputStream in = ImageUtil.needImageInputStream(src);
        __CLR4_5_28sp8spm6lb50b2.R.inc(11407);byte[] header = getHeader(in, JPG_SIG_LENGTH);
        __CLR4_5_28sp8spm6lb50b2.R.inc(11408);boolean supported = ((header[0] == (byte)MARK)
                && (header[1] == (byte)SOI)
                && (header[2] == (byte)MARK));

        __CLR4_5_28sp8spm6lb50b2.R.inc(11409);if ((((supported)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11410)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11411)==0&false))) {{
            __CLR4_5_28sp8spm6lb50b2.R.inc(11412);ImageInfo info = new ImageInfo(uri, MimeConstants.MIME_JPEG);
            __CLR4_5_28sp8spm6lb50b2.R.inc(11413);info.setSize(determineSize(in, context));
            __CLR4_5_28sp8spm6lb50b2.R.inc(11414);return info;
        } }else {{
            __CLR4_5_28sp8spm6lb50b2.R.inc(11415);return null;
        }
    }}finally{__CLR4_5_28sp8spm6lb50b2.R.flushNeeded();}}

    private ImageSize determineSize(ImageInputStream in, ImageContext context)
            throws IOException, ImageException {try{__CLR4_5_28sp8spm6lb50b2.R.inc(11416);
        __CLR4_5_28sp8spm6lb50b2.R.inc(11417);in.mark();
        __CLR4_5_28sp8spm6lb50b2.R.inc(11418);try {
            __CLR4_5_28sp8spm6lb50b2.R.inc(11419);ImageSize size = new ImageSize();
            __CLR4_5_28sp8spm6lb50b2.R.inc(11420);JPEGFile jpeg = new JPEGFile(in);

            __CLR4_5_28sp8spm6lb50b2.R.inc(11421);while (true) {{
                __CLR4_5_28sp8spm6lb50b2.R.inc(11422);int segID = jpeg.readMarkerSegment();
                //System.out.println("Segment: " + Integer.toHexString(segID));
                boolean __CLB4_5_2_bool0=false;__CLR4_5_28sp8spm6lb50b2.R.inc(11423);switch (segID) {
                case SOI:if (!__CLB4_5_2_bool0) {__CLR4_5_28sp8spm6lb50b2.R.inc(11424);__CLB4_5_2_bool0=true;}
                case NULL:if (!__CLB4_5_2_bool0) {__CLR4_5_28sp8spm6lb50b2.R.inc(11425);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11426);break;
                case APP0:if (!__CLB4_5_2_bool0) {__CLR4_5_28sp8spm6lb50b2.R.inc(11427);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11428);int reclen = jpeg.readSegmentLength();
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11429);in.skipBytes(7);
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11430);int densityUnits = in.read();
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11431);int xdensity = in.readUnsignedShort();
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11432);int ydensity = in.readUnsignedShort();
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11433);if ((((size.getDpiHorizontal() == 0)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11434)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11435)==0&false))) {{
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11436);if ((((densityUnits == 2)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11437)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11438)==0&false))) {{
                            //dots per centimeter
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11439);size.setResolution(
                                    xdensity * UnitConv.IN2CM,
                                    ydensity * UnitConv.IN2CM);
                        } }else {__CLR4_5_28sp8spm6lb50b2.R.inc(11440);if ((((densityUnits == 1)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11441)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11442)==0&false))) {{
                            //dots per inch
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11443);size.setResolution(xdensity, ydensity);
                        } }else {{
                            //resolution not specified
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11444);size.setResolution(context.getSourceResolution());
                        }
                    }}}
                    }__CLR4_5_28sp8spm6lb50b2.R.inc(11445);if ((((size.getWidthPx() != 0)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11446)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11447)==0&false))) {{
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11448);size.calcSizeFromPixels();
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11449);return size;
                    }
                    }__CLR4_5_28sp8spm6lb50b2.R.inc(11450);in.skipBytes(reclen - 14);
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11451);break;
                case APP1:if (!__CLB4_5_2_bool0) {__CLR4_5_28sp8spm6lb50b2.R.inc(11452);__CLB4_5_2_bool0=true;}
                    // see http://www.media.mit.edu/pia/Research/deepview/exif.html
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11453);reclen = jpeg.readSegmentLength();
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11454);int bytesToEnd = reclen - 2;
                    // read Exif Header: 0x.45.78.69.66.00.00
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11455);int exif = in.readInt(); // 0x.45.78.69.66
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11456);in.readUnsignedShort(); // 0x.00.00
                    // in.skipBytes(6);
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11457);bytesToEnd -= 6;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11458);if ((((exif != EXIF)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11459)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11460)==0&false))) {{
                        // there may be multiple APP1 segments but we want the Exif one
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11461);in.skipBytes(bytesToEnd);
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11462);break;
                    }
                    // start TIFF data
                    }__CLR4_5_28sp8spm6lb50b2.R.inc(11463);int currentTIFFOffset = 0;
                    // byte align: 0x.49.49 (19789) means Intel, 0x.4D.4D means Motorola
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11464);int align = in.readUnsignedShort();
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11465);bytesToEnd -= 2;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11466);currentTIFFOffset += 2;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11467);ByteOrder originalByteOrder = in.getByteOrder();
                    // Intel = little, Motorola = big
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11468);in.setByteOrder((((align == MM )&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11469)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11470)==0&false))? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11471);in.skipBytes(2); // 0x.2A.00 (Intel) or 0x.00.2A (Motorola)
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11472);bytesToEnd -= 2;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11473);currentTIFFOffset += 2;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11474);int firstIFDOffset = in.readInt();
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11475);bytesToEnd -= 4;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11476);currentTIFFOffset += 4;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11477);in.skipBytes(firstIFDOffset - 8);
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11478);bytesToEnd -= firstIFDOffset - 8;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11479);currentTIFFOffset += firstIFDOffset - 8;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11480);int directoryEntries = in.readUnsignedShort();
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11481);bytesToEnd -= 2;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11482);currentTIFFOffset += 2;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11483);int resolutionOffset = 0;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11484);int resolutionFormat = 0;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11485);int resolutionUnits = 0;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11486);int resolution = 0;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11487);boolean foundResolution = false;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11488);for (int j = 0; (((j < directoryEntries)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11489)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11490)==0&false)); j++) {{
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11491);int tag = in.readUnsignedShort();
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11492);if (((((tag == X_RESOLUTION || tag == Y_RESOLUTION) && !foundResolution)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11493)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11494)==0&false))) {{
                            // 0x011A (XResolution), 0x011B (YResolution)
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11495);int format = in.readUnsignedShort();
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11496);int components = in.readInt();
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11497);int dataByteLength = components * BYTES_PER_COMPONENT[format];
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11498);int value = in.readInt();
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11499);if ((((dataByteLength > 4)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11500)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11501)==0&false))) {{
                                // value is offset to data value
                                __CLR4_5_28sp8spm6lb50b2.R.inc(11502);resolutionOffset = value;
                            } }else {{
                                // value is data value
                                __CLR4_5_28sp8spm6lb50b2.R.inc(11503);resolution = value;
                            }
                            }__CLR4_5_28sp8spm6lb50b2.R.inc(11504);resolutionFormat = format;
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11505);foundResolution = true;
                        } }else {__CLR4_5_28sp8spm6lb50b2.R.inc(11506);if ((((tag == RESOLUTION_UNIT)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11507)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11508)==0&false))) {{
                            // 0x0128 (ResolutionUnit)
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11509);int format = in.readUnsignedShort();
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11510);int components = in.readInt();
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11511);int dataByteLength = components * BYTES_PER_COMPONENT[format];
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11512);if ((((dataByteLength < 5 && format == 3)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11513)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11514)==0&false))) {{
                                __CLR4_5_28sp8spm6lb50b2.R.inc(11515);int value = in.readUnsignedShort();
                                __CLR4_5_28sp8spm6lb50b2.R.inc(11516);in.skipBytes(2);
                                __CLR4_5_28sp8spm6lb50b2.R.inc(11517);resolutionUnits = value;
                            } }else {{
                                __CLR4_5_28sp8spm6lb50b2.R.inc(11518);in.skipBytes(4);
                            }
                        }} }else {{
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11519);in.skipBytes(10);
                        }
                        }}__CLR4_5_28sp8spm6lb50b2.R.inc(11520);bytesToEnd -= 12;
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11521);currentTIFFOffset += 12;
                    }
                    }__CLR4_5_28sp8spm6lb50b2.R.inc(11522);in.readInt(); // not needed, but has thumbnail info
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11523);bytesToEnd -= 4;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11524);currentTIFFOffset += 4;
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11525);if ((((resolutionOffset != 0)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11526)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11527)==0&false))) {{
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11528);in.skipBytes(resolutionOffset - currentTIFFOffset);
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11529);bytesToEnd -= resolutionOffset - currentTIFFOffset;
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11530);if ((((resolutionFormat == 5 || resolutionFormat == 10)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11531)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11532)==0&false))) {{
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11533);int numerator = in.readInt();
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11534);int denominator = in.readInt();
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11535);resolution = numerator / denominator;
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11536);bytesToEnd -= 8;
                        }
                    }}
                    }__CLR4_5_28sp8spm6lb50b2.R.inc(11537);in.skipBytes(bytesToEnd);
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11538);in.setByteOrder(originalByteOrder);
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11539);if ((((resolutionUnits == 3)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11540)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11541)==0&false))) {{
                        // dots per centimeter
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11542);size.setResolution(resolution * UnitConv.IN2CM, resolution * UnitConv.IN2CM);
                    } }else {__CLR4_5_28sp8spm6lb50b2.R.inc(11543);if ((((resolutionUnits == 2)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11544)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11545)==0&false))) {{
                        // dots per inch
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11546);size.setResolution(resolution, resolution);
                    } }else {{
                        // resolution not specified; set default if not set yet
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11547);if ((((size.getDpiHorizontal() == 0)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11548)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11549)==0&false))) {{
                            __CLR4_5_28sp8spm6lb50b2.R.inc(11550);size.setResolution(context.getSourceResolution());
                        }
                    }}
                    }}__CLR4_5_28sp8spm6lb50b2.R.inc(11551);if ((((size.getWidthPx() != 0)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11552)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11553)==0&false))) {{
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11554);size.calcSizeFromPixels();
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11555);return size;
                    }
                    }__CLR4_5_28sp8spm6lb50b2.R.inc(11556);break;
                case SOF0:if (!__CLB4_5_2_bool0) {__CLR4_5_28sp8spm6lb50b2.R.inc(11557);__CLB4_5_2_bool0=true;}
                case SOF1:if (!__CLB4_5_2_bool0) {__CLR4_5_28sp8spm6lb50b2.R.inc(11558);__CLB4_5_2_bool0=true;}
                case SOF2:if (!__CLB4_5_2_bool0) {__CLR4_5_28sp8spm6lb50b2.R.inc(11559);__CLB4_5_2_bool0=true;} // SOF2 and SOFA are only supported by PDF 1.3
                case SOFA:if (!__CLB4_5_2_bool0) {__CLR4_5_28sp8spm6lb50b2.R.inc(11560);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11561);reclen = jpeg.readSegmentLength();
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11562);in.skipBytes(1);
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11563);int height = in.readUnsignedShort();
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11564);int width = in.readUnsignedShort();
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11565);size.setSizeInPixels(width, height);
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11566);if ((((size.getDpiHorizontal() != 0)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11567)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11568)==0&false))) {{
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11569);size.calcSizeFromPixels();
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11570);return size;
                    }
                    }__CLR4_5_28sp8spm6lb50b2.R.inc(11571);in.skipBytes(reclen - 7);
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11572);break;
                case SOS:if (!__CLB4_5_2_bool0) {__CLR4_5_28sp8spm6lb50b2.R.inc(11573);__CLB4_5_2_bool0=true;}
                case EOI:if (!__CLB4_5_2_bool0) {__CLR4_5_28sp8spm6lb50b2.R.inc(11574);__CLB4_5_2_bool0=true;}
                    // Break as early as possible (we don't want to read the whole file here)
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11575);if ((((size.getDpiHorizontal() == 0)&&(__CLR4_5_28sp8spm6lb50b2.R.iget(11576)!=0|true))||(__CLR4_5_28sp8spm6lb50b2.R.iget(11577)==0&false))) {{
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11578);size.setResolution(context.getSourceResolution());
                        __CLR4_5_28sp8spm6lb50b2.R.inc(11579);size.calcSizeFromPixels();
                    }
                    }__CLR4_5_28sp8spm6lb50b2.R.inc(11580);return size;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_28sp8spm6lb50b2.R.inc(11581);__CLB4_5_2_bool0=true;}
                    __CLR4_5_28sp8spm6lb50b2.R.inc(11582);jpeg.skipCurrentMarkerSegment();
                }
            }
        }} finally {
            __CLR4_5_28sp8spm6lb50b2.R.inc(11583);in.reset();
        }
    }finally{__CLR4_5_28sp8spm6lb50b2.R.flushNeeded();}}

}
