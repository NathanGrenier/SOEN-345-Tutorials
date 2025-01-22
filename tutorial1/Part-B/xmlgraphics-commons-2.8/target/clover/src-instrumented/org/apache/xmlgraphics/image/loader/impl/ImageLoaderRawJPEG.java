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

/* $Id: ImageLoaderRawJPEG.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.awt.color.ColorSpace;
import java.awt.color.ICC_Profile;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;
import org.apache.xmlgraphics.io.XmlSourceUtil;
import org.apache.xmlgraphics.java2d.color.ColorSpaces;
import org.apache.xmlgraphics.java2d.color.profile.ColorProfileUtil;
import org.apache.xmlgraphics.util.MimeConstants;

/**
 * ImageLoader for JPEG images consumed "raw" (undecoded). Provides a
 * raw/undecoded stream.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ImageLoaderRawJPEG extends AbstractImageLoader implements JPEGConstants {public static class __CLR4_5_2867867m68iyh9x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,10754,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** logger */
    protected static final Log log = LogFactory.getLog(ImageLoaderRawJPEG.class);

    /**
     * Main constructor.
     */
    public ImageLoaderRawJPEG() {try{__CLR4_5_2867867m68iyh9x.R.inc(10591);
    }finally{__CLR4_5_2867867m68iyh9x.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor getTargetFlavor() {try{__CLR4_5_2867867m68iyh9x.R.inc(10592);
        __CLR4_5_2867867m68iyh9x.R.inc(10593);return ImageFlavor.RAW_JPEG;
    }finally{__CLR4_5_2867867m68iyh9x.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Image loadImage(ImageInfo info, Map hints, ImageSessionContext session)
                throws ImageException, IOException {try{__CLR4_5_2867867m68iyh9x.R.inc(10594);
        __CLR4_5_2867867m68iyh9x.R.inc(10595);if ((((!MimeConstants.MIME_JPEG.equals(info.getMimeType()))&&(__CLR4_5_2867867m68iyh9x.R.iget(10596)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10597)==0&false))) {{
            __CLR4_5_2867867m68iyh9x.R.inc(10598);throw new IllegalArgumentException("ImageInfo must be from a image with MIME type: "
                    + MimeConstants.MIME_JPEG);
        }

        }__CLR4_5_2867867m68iyh9x.R.inc(10599);ColorSpace colorSpace = null;
        __CLR4_5_2867867m68iyh9x.R.inc(10600);boolean appeFound = false;
        __CLR4_5_2867867m68iyh9x.R.inc(10601);int sofType = 0;
        __CLR4_5_2867867m68iyh9x.R.inc(10602);ByteArrayOutputStream iccStream = null;

        __CLR4_5_2867867m68iyh9x.R.inc(10603);Source src = session.needSource(info.getOriginalURI());
        __CLR4_5_2867867m68iyh9x.R.inc(10604);ImageInputStream in = ImageUtil.needImageInputStream(src);
        __CLR4_5_2867867m68iyh9x.R.inc(10605);JPEGFile jpeg = new JPEGFile(in);
        __CLR4_5_2867867m68iyh9x.R.inc(10606);in.mark();
        __CLR4_5_2867867m68iyh9x.R.inc(10607);try {
            __CLR4_5_2867867m68iyh9x.R.inc(10608);outer:
            while (true) {{
                __CLR4_5_2867867m68iyh9x.R.inc(10609);int reclen;
                __CLR4_5_2867867m68iyh9x.R.inc(10610);int segID = jpeg.readMarkerSegment();
                __CLR4_5_2867867m68iyh9x.R.inc(10611);if ((((log.isTraceEnabled())&&(__CLR4_5_2867867m68iyh9x.R.iget(10612)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10613)==0&false))) {{
                    __CLR4_5_2867867m68iyh9x.R.inc(10614);log.trace("Seg Marker: " + Integer.toHexString(segID));
                }
                }boolean __CLB4_5_2_bool0=false;__CLR4_5_2867867m68iyh9x.R.inc(10615);switch (segID) {
                case EOI:if (!__CLB4_5_2_bool0) {__CLR4_5_2867867m68iyh9x.R.inc(10616);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2867867m68iyh9x.R.inc(10617);log.trace("EOI found. Stopping.");
                    __CLR4_5_2867867m68iyh9x.R.inc(10618);break outer;
                case SOS:if (!__CLB4_5_2_bool0) {__CLR4_5_2867867m68iyh9x.R.inc(10619);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2867867m68iyh9x.R.inc(10620);log.trace("SOS found. Stopping early."); //TODO Not sure if this is safe
                    __CLR4_5_2867867m68iyh9x.R.inc(10621);break outer;
                case SOI:if (!__CLB4_5_2_bool0) {__CLR4_5_2867867m68iyh9x.R.inc(10622);__CLB4_5_2_bool0=true;}
                case NULL:if (!__CLB4_5_2_bool0) {__CLR4_5_2867867m68iyh9x.R.inc(10623);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2867867m68iyh9x.R.inc(10624);break;
                case SOF0:if (!__CLB4_5_2_bool0) {__CLR4_5_2867867m68iyh9x.R.inc(10625);__CLB4_5_2_bool0=true;} //baseline
                case SOF1:if (!__CLB4_5_2_bool0) {__CLR4_5_2867867m68iyh9x.R.inc(10626);__CLB4_5_2_bool0=true;} //extended sequential DCT
                case SOF2:if (!__CLB4_5_2_bool0) {__CLR4_5_2867867m68iyh9x.R.inc(10627);__CLB4_5_2_bool0=true;} //progressive (since PDF 1.3)
                case SOFA:if (!__CLB4_5_2_bool0) {__CLR4_5_2867867m68iyh9x.R.inc(10628);__CLB4_5_2_bool0=true;} //progressive (since PDF 1.3)
                    __CLR4_5_2867867m68iyh9x.R.inc(10629);sofType = segID;
                    __CLR4_5_2867867m68iyh9x.R.inc(10630);if ((((log.isTraceEnabled())&&(__CLR4_5_2867867m68iyh9x.R.iget(10631)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10632)==0&false))) {{
                        __CLR4_5_2867867m68iyh9x.R.inc(10633);log.trace("SOF: " + Integer.toHexString(sofType));
                    }
                    }__CLR4_5_2867867m68iyh9x.R.inc(10634);in.mark();
                    __CLR4_5_2867867m68iyh9x.R.inc(10635);try {
                        __CLR4_5_2867867m68iyh9x.R.inc(10636);reclen = jpeg.readSegmentLength();
                        __CLR4_5_2867867m68iyh9x.R.inc(10637);in.skipBytes(1); //data precision
                        __CLR4_5_2867867m68iyh9x.R.inc(10638);in.skipBytes(2); //height
                        __CLR4_5_2867867m68iyh9x.R.inc(10639);in.skipBytes(2); //width
                        __CLR4_5_2867867m68iyh9x.R.inc(10640);int numComponents = in.readUnsignedByte();
                        __CLR4_5_2867867m68iyh9x.R.inc(10641);if ((((numComponents == 1)&&(__CLR4_5_2867867m68iyh9x.R.iget(10642)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10643)==0&false))) {{
                            __CLR4_5_2867867m68iyh9x.R.inc(10644);colorSpace = ColorSpace.getInstance(
                              ColorSpace.CS_GRAY);
                        } }else {__CLR4_5_2867867m68iyh9x.R.inc(10645);if ((((numComponents == 3)&&(__CLR4_5_2867867m68iyh9x.R.iget(10646)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10647)==0&false))) {{
                            __CLR4_5_2867867m68iyh9x.R.inc(10648);colorSpace = ColorSpace.getInstance(
                              ColorSpace.CS_LINEAR_RGB);
                        } }else {__CLR4_5_2867867m68iyh9x.R.inc(10649);if ((((numComponents == 4)&&(__CLR4_5_2867867m68iyh9x.R.iget(10650)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10651)==0&false))) {{
                            __CLR4_5_2867867m68iyh9x.R.inc(10652);colorSpace = ColorSpaces.getDeviceCMYKColorSpace();
                        } }else {{
                            __CLR4_5_2867867m68iyh9x.R.inc(10653);throw new ImageException("Unsupported ColorSpace for image "
                                        + info
                                        + ". The number of components supported are 1, 3 and 4.");
                        }
                    }}}} finally {
                        __CLR4_5_2867867m68iyh9x.R.inc(10654);in.reset();
                    }
                    __CLR4_5_2867867m68iyh9x.R.inc(10655);in.skipBytes(reclen);
                    __CLR4_5_2867867m68iyh9x.R.inc(10656);break;
                case APP2:if (!__CLB4_5_2_bool0) {__CLR4_5_2867867m68iyh9x.R.inc(10657);__CLB4_5_2_bool0=true;} //ICC (see ICC1V42.pdf)
                    __CLR4_5_2867867m68iyh9x.R.inc(10658);in.mark();
                    __CLR4_5_2867867m68iyh9x.R.inc(10659);try {
                        __CLR4_5_2867867m68iyh9x.R.inc(10660);reclen = jpeg.readSegmentLength();
                        // Check for ICC profile
                        __CLR4_5_2867867m68iyh9x.R.inc(10661);byte[] iccString = new byte[11];
                        __CLR4_5_2867867m68iyh9x.R.inc(10662);in.readFully(iccString);
                        __CLR4_5_2867867m68iyh9x.R.inc(10663);in.skipBytes(1); //string terminator (null byte)

                        __CLR4_5_2867867m68iyh9x.R.inc(10664);if (((("ICC_PROFILE".equals(new String(iccString, "US-ASCII")))&&(__CLR4_5_2867867m68iyh9x.R.iget(10665)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10666)==0&false))) {{
                            __CLR4_5_2867867m68iyh9x.R.inc(10667);in.skipBytes(2); //chunk sequence number and total number of chunks
                            __CLR4_5_2867867m68iyh9x.R.inc(10668);int payloadSize = reclen - 2 - 12 - 2;
                            __CLR4_5_2867867m68iyh9x.R.inc(10669);if ((((ignoreColorProfile(hints))&&(__CLR4_5_2867867m68iyh9x.R.iget(10670)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10671)==0&false))) {{
                                __CLR4_5_2867867m68iyh9x.R.inc(10672);log.debug("Ignoring ICC profile data in JPEG");
                                __CLR4_5_2867867m68iyh9x.R.inc(10673);in.skipBytes(payloadSize);
                            } }else {{
                                __CLR4_5_2867867m68iyh9x.R.inc(10674);byte[] buf = new byte[payloadSize];
                                __CLR4_5_2867867m68iyh9x.R.inc(10675);in.readFully(buf);
                                __CLR4_5_2867867m68iyh9x.R.inc(10676);if ((((iccStream == null)&&(__CLR4_5_2867867m68iyh9x.R.iget(10677)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10678)==0&false))) {{
                                    __CLR4_5_2867867m68iyh9x.R.inc(10679);if ((((log.isDebugEnabled())&&(__CLR4_5_2867867m68iyh9x.R.iget(10680)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10681)==0&false))) {{
                                        __CLR4_5_2867867m68iyh9x.R.inc(10682);log.debug("JPEG has an ICC profile");
                                        __CLR4_5_2867867m68iyh9x.R.inc(10683);DataInputStream din = new DataInputStream(new ByteArrayInputStream(buf));
                                        __CLR4_5_2867867m68iyh9x.R.inc(10684);log.debug("Declared ICC profile size: " + din.readInt());
                                    }
                                    //ICC profiles can be split into several chunks
                                    //so collect in a byte array output stream
                                    }__CLR4_5_2867867m68iyh9x.R.inc(10685);iccStream = new ByteArrayOutputStream();
                                }
                                }__CLR4_5_2867867m68iyh9x.R.inc(10686);iccStream.write(buf);
                            }
                        }}
                    }} finally {
                        __CLR4_5_2867867m68iyh9x.R.inc(10687);in.reset();
                    }
                    __CLR4_5_2867867m68iyh9x.R.inc(10688);in.skipBytes(reclen);
                    __CLR4_5_2867867m68iyh9x.R.inc(10689);break;
                case APPE:if (!__CLB4_5_2_bool0) {__CLR4_5_2867867m68iyh9x.R.inc(10690);__CLB4_5_2_bool0=true;} //Adobe-specific (see 5116.DCT_Filter.pdf)
                    __CLR4_5_2867867m68iyh9x.R.inc(10691);in.mark();
                    __CLR4_5_2867867m68iyh9x.R.inc(10692);try {
                        __CLR4_5_2867867m68iyh9x.R.inc(10693);reclen = jpeg.readSegmentLength();
                        // Check for Adobe header
                        __CLR4_5_2867867m68iyh9x.R.inc(10694);byte[] adobeHeader = new byte[5];
                        __CLR4_5_2867867m68iyh9x.R.inc(10695);in.readFully(adobeHeader);

                        __CLR4_5_2867867m68iyh9x.R.inc(10696);if (((("Adobe".equals(new String(adobeHeader, "US-ASCII")))&&(__CLR4_5_2867867m68iyh9x.R.iget(10697)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10698)==0&false))) {{
                            // The reason for reading the APPE marker is that Adobe Photoshop
                            // generates CMYK JPEGs with inverted values. The correct thing
                            // to do would be to interpret the values in the marker, but for now
                            // only assume that if APPE marker is present and colorspace is CMYK,
                            // the image is inverted.
                            __CLR4_5_2867867m68iyh9x.R.inc(10699);appeFound = true;
                        }
                    }} finally {
                        __CLR4_5_2867867m68iyh9x.R.inc(10700);in.reset();
                    }
                    __CLR4_5_2867867m68iyh9x.R.inc(10701);in.skipBytes(reclen);
                    __CLR4_5_2867867m68iyh9x.R.inc(10702);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2867867m68iyh9x.R.inc(10703);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2867867m68iyh9x.R.inc(10704);jpeg.skipCurrentMarkerSegment();
                }
            }
        }} finally {
            __CLR4_5_2867867m68iyh9x.R.inc(10705);in.reset();
        }

        __CLR4_5_2867867m68iyh9x.R.inc(10706);ICC_Profile iccProfile = buildICCProfile(info, colorSpace, iccStream);
        __CLR4_5_2867867m68iyh9x.R.inc(10707);if ((((iccProfile == null && colorSpace == null)&&(__CLR4_5_2867867m68iyh9x.R.iget(10708)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10709)==0&false))) {{
            __CLR4_5_2867867m68iyh9x.R.inc(10710);throw new ImageException("ColorSpace could not be identified for JPEG image " + info);
        }

        }__CLR4_5_2867867m68iyh9x.R.inc(10711);boolean invertImage = false;
        __CLR4_5_2867867m68iyh9x.R.inc(10712);if ((((appeFound && colorSpace.getType() == ColorSpace.TYPE_CMYK)&&(__CLR4_5_2867867m68iyh9x.R.iget(10713)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10714)==0&false))) {{
            __CLR4_5_2867867m68iyh9x.R.inc(10715);if ((((log.isDebugEnabled())&&(__CLR4_5_2867867m68iyh9x.R.iget(10716)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10717)==0&false))) {{
                __CLR4_5_2867867m68iyh9x.R.inc(10718);log.debug("JPEG has an Adobe APPE marker. Note: CMYK Image will be inverted. ("
                        + info.getOriginalURI() + ")");
            }
            }__CLR4_5_2867867m68iyh9x.R.inc(10719);invertImage = true;
        }

        }__CLR4_5_2867867m68iyh9x.R.inc(10720);ImageRawJPEG rawImage = new ImageRawJPEG(info,
                XmlSourceUtil.needInputStream(src),
                sofType, colorSpace, iccProfile, invertImage);
        __CLR4_5_2867867m68iyh9x.R.inc(10721);return rawImage;
    }finally{__CLR4_5_2867867m68iyh9x.R.flushNeeded();}}

    private ICC_Profile buildICCProfile(ImageInfo info, ColorSpace colorSpace,
            ByteArrayOutputStream iccStream) throws IOException, ImageException {try{__CLR4_5_2867867m68iyh9x.R.inc(10722);
        __CLR4_5_2867867m68iyh9x.R.inc(10723);if ((((iccStream != null && iccStream.size() > 0)&&(__CLR4_5_2867867m68iyh9x.R.iget(10724)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10725)==0&false))) {{
            __CLR4_5_2867867m68iyh9x.R.inc(10726);if ((((log.isDebugEnabled())&&(__CLR4_5_2867867m68iyh9x.R.iget(10727)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10728)==0&false))) {{
                __CLR4_5_2867867m68iyh9x.R.inc(10729);log.debug("Effective ICC profile size: " + iccStream.size());
            }
            }__CLR4_5_2867867m68iyh9x.R.inc(10730);final int alignment = 4;
            __CLR4_5_2867867m68iyh9x.R.inc(10731);int padding = (alignment - (iccStream.size() % alignment)) % alignment;
            __CLR4_5_2867867m68iyh9x.R.inc(10732);if ((((padding != 0)&&(__CLR4_5_2867867m68iyh9x.R.iget(10733)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10734)==0&false))) {{
                __CLR4_5_2867867m68iyh9x.R.inc(10735);try {
                    __CLR4_5_2867867m68iyh9x.R.inc(10736);iccStream.write(new byte[padding]);
                } catch (IOException ioe) {
                    __CLR4_5_2867867m68iyh9x.R.inc(10737);throw new IOException("Error while aligning ICC stream: " + ioe.getMessage());
                }
            }

            }__CLR4_5_2867867m68iyh9x.R.inc(10738);ICC_Profile iccProfile = null;
            __CLR4_5_2867867m68iyh9x.R.inc(10739);try {
                __CLR4_5_2867867m68iyh9x.R.inc(10740);iccProfile = ColorProfileUtil.getICC_Profile(iccStream.toByteArray());
                __CLR4_5_2867867m68iyh9x.R.inc(10741);if ((((log.isDebugEnabled())&&(__CLR4_5_2867867m68iyh9x.R.iget(10742)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10743)==0&false))) {{
                    __CLR4_5_2867867m68iyh9x.R.inc(10744);log.debug("JPEG has an ICC profile: " + iccProfile.toString());
                }
            }} catch (IllegalArgumentException iae) {
                __CLR4_5_2867867m68iyh9x.R.inc(10745);log.warn("An ICC profile is present in the JPEG file but it is invalid ("
                        + iae.getMessage() + "). The color profile will be ignored. ("
                        + info.getOriginalURI() + ")");
                __CLR4_5_2867867m68iyh9x.R.inc(10746);return null;
            }
            __CLR4_5_2867867m68iyh9x.R.inc(10747);if ((((iccProfile.getNumComponents() != colorSpace.getNumComponents())&&(__CLR4_5_2867867m68iyh9x.R.iget(10748)!=0|true))||(__CLR4_5_2867867m68iyh9x.R.iget(10749)==0&false))) {{
                __CLR4_5_2867867m68iyh9x.R.inc(10750);log.warn("The number of components of the ICC profile ("
                        + iccProfile.getNumComponents()
                        + ") doesn't match the image ("
                        + colorSpace.getNumComponents()
                        + "). Ignoring the ICC color profile.");
                __CLR4_5_2867867m68iyh9x.R.inc(10751);return null;
            } }else {{
                __CLR4_5_2867867m68iyh9x.R.inc(10752);return iccProfile;
            }
        }} }else {{
            __CLR4_5_2867867m68iyh9x.R.inc(10753);return null; //no ICC profile available
        }
    }}finally{__CLR4_5_2867867m68iyh9x.R.flushNeeded();}}

}
