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

/* $Id: ImageLoaderRawCCITTFax.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.image.codec.tiff.TIFFDirectory;
import org.apache.xmlgraphics.image.codec.tiff.TIFFField;
import org.apache.xmlgraphics.image.codec.tiff.TIFFImage;
import org.apache.xmlgraphics.image.codec.tiff.TIFFImageDecoder;
import org.apache.xmlgraphics.image.codec.util.SeekableStream;
import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;
import org.apache.xmlgraphics.image.loader.util.SeekableStreamAdapter;
import org.apache.xmlgraphics.io.XmlSourceUtil;
import org.apache.xmlgraphics.util.MimeConstants;
import org.apache.xmlgraphics.util.io.SubInputStream;

/**
 * ImageLoader for CCITT group 3 and 4 images consumed "raw" (undecoded). Provides a
 * raw/undecoded stream.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ImageLoaderRawCCITTFax extends AbstractImageLoader implements JPEGConstants {public static class __CLR4_5_283m83mm68iyh8l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,10591,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int COMPRESSION_CCITT_1D = 2;
    private static final int COMPRESSION_FAX_GROUP3 = 3;
    private static final int COMPRESSION_FAX_GROUP4 = 4;

    /** logger */
    protected static final Log log = LogFactory.getLog(ImageLoaderRawCCITTFax.class);

    /**
     * Main constructor.
     */
    public ImageLoaderRawCCITTFax() {try{__CLR4_5_283m83mm68iyh8l.R.inc(10498);
    }finally{__CLR4_5_283m83mm68iyh8l.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor getTargetFlavor() {try{__CLR4_5_283m83mm68iyh8l.R.inc(10499);
        __CLR4_5_283m83mm68iyh8l.R.inc(10500);return ImageFlavor.RAW_CCITTFAX;
    }finally{__CLR4_5_283m83mm68iyh8l.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Image loadImage(ImageInfo info, Map hints, ImageSessionContext session)
                throws ImageException, IOException {try{__CLR4_5_283m83mm68iyh8l.R.inc(10501);
        __CLR4_5_283m83mm68iyh8l.R.inc(10502);if ((((!MimeConstants.MIME_TIFF.equals(info.getMimeType()))&&(__CLR4_5_283m83mm68iyh8l.R.iget(10503)!=0|true))||(__CLR4_5_283m83mm68iyh8l.R.iget(10504)==0&false))) {{
            __CLR4_5_283m83mm68iyh8l.R.inc(10505);throw new IllegalArgumentException("ImageInfo must be from a image with MIME type: "
                    + MimeConstants.MIME_TIFF);
        }
        }__CLR4_5_283m83mm68iyh8l.R.inc(10506);int fillOrder = 1;
        __CLR4_5_283m83mm68iyh8l.R.inc(10507);int compression = TIFFImage.COMP_NONE;
        __CLR4_5_283m83mm68iyh8l.R.inc(10508);long stripOffset;
        __CLR4_5_283m83mm68iyh8l.R.inc(10509);long stripLength;
        __CLR4_5_283m83mm68iyh8l.R.inc(10510);TIFFDirectory dir;

        __CLR4_5_283m83mm68iyh8l.R.inc(10511);Source src = session.needSource(info.getOriginalURI());
        __CLR4_5_283m83mm68iyh8l.R.inc(10512);ImageInputStream in = ImageUtil.needImageInputStream(src);
        __CLR4_5_283m83mm68iyh8l.R.inc(10513);in.mark();
        __CLR4_5_283m83mm68iyh8l.R.inc(10514);try {
            __CLR4_5_283m83mm68iyh8l.R.inc(10515);SeekableStream seekable = new SeekableStreamAdapter(in);
            __CLR4_5_283m83mm68iyh8l.R.inc(10516);dir = new TIFFDirectory(seekable, 0);
            __CLR4_5_283m83mm68iyh8l.R.inc(10517);TIFFField fld;

            __CLR4_5_283m83mm68iyh8l.R.inc(10518);fld = dir.getField(TIFFImageDecoder.TIFF_COMPRESSION);
            __CLR4_5_283m83mm68iyh8l.R.inc(10519);if ((((fld != null)&&(__CLR4_5_283m83mm68iyh8l.R.iget(10520)!=0|true))||(__CLR4_5_283m83mm68iyh8l.R.iget(10521)==0&false))) {{
                __CLR4_5_283m83mm68iyh8l.R.inc(10522);compression = fld.getAsInt(0);
                boolean __CLB4_5_2_bool0=false;__CLR4_5_283m83mm68iyh8l.R.inc(10523);switch (compression) {
                case COMPRESSION_CCITT_1D:if (!__CLB4_5_2_bool0) {__CLR4_5_283m83mm68iyh8l.R.inc(10524);__CLB4_5_2_bool0=true;}
                case COMPRESSION_FAX_GROUP4:if (!__CLB4_5_2_bool0) {__CLR4_5_283m83mm68iyh8l.R.inc(10525);__CLB4_5_2_bool0=true;}
                    __CLR4_5_283m83mm68iyh8l.R.inc(10526);break;
                case COMPRESSION_FAX_GROUP3:if (!__CLB4_5_2_bool0) {__CLR4_5_283m83mm68iyh8l.R.inc(10527);__CLB4_5_2_bool0=true;}
                    //Note: the TIFFImage compression constants seem to be a bit misleading!
                    __CLR4_5_283m83mm68iyh8l.R.inc(10528);compression = TIFFImage.COMP_FAX_G3_1D; //1D is the default for Group3
                    __CLR4_5_283m83mm68iyh8l.R.inc(10529);fld = dir.getField(TIFFImageDecoder.TIFF_T4_OPTIONS);
                    __CLR4_5_283m83mm68iyh8l.R.inc(10530);if ((((fld != null)&&(__CLR4_5_283m83mm68iyh8l.R.iget(10531)!=0|true))||(__CLR4_5_283m83mm68iyh8l.R.iget(10532)==0&false))) {{
                        __CLR4_5_283m83mm68iyh8l.R.inc(10533);long t4Options = fld.getAsLong(0);
                        __CLR4_5_283m83mm68iyh8l.R.inc(10534);if (((((t4Options & 0x01) != 0)&&(__CLR4_5_283m83mm68iyh8l.R.iget(10535)!=0|true))||(__CLR4_5_283m83mm68iyh8l.R.iget(10536)==0&false))) {{
                            __CLR4_5_283m83mm68iyh8l.R.inc(10537);compression = TIFFImage.COMP_FAX_G3_2D; //"Abusing" for 2D signalling
                        }
                    }}
                    }__CLR4_5_283m83mm68iyh8l.R.inc(10538);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_283m83mm68iyh8l.R.inc(10539);__CLB4_5_2_bool0=true;}
                    __CLR4_5_283m83mm68iyh8l.R.inc(10540);log.debug("Unsupported compression " + compression);
                    __CLR4_5_283m83mm68iyh8l.R.inc(10541);throw new ImageException(
                            "ImageLoader doesn't support TIFF compression: " + compression);
                }
            }
            //Read information used for raw embedding
            }__CLR4_5_283m83mm68iyh8l.R.inc(10542);fld = dir.getField(TIFFImageDecoder.TIFF_FILL_ORDER);
            __CLR4_5_283m83mm68iyh8l.R.inc(10543);if ((((fld != null)&&(__CLR4_5_283m83mm68iyh8l.R.iget(10544)!=0|true))||(__CLR4_5_283m83mm68iyh8l.R.iget(10545)==0&false))) {{
                __CLR4_5_283m83mm68iyh8l.R.inc(10546);fillOrder = fld.getAsInt(0);
            }

            }__CLR4_5_283m83mm68iyh8l.R.inc(10547);int stripCount;
            __CLR4_5_283m83mm68iyh8l.R.inc(10548);fld = dir.getField(TIFFImageDecoder.TIFF_ROWS_PER_STRIP);
            __CLR4_5_283m83mm68iyh8l.R.inc(10549);if ((((fld == null)&&(__CLR4_5_283m83mm68iyh8l.R.iget(10550)!=0|true))||(__CLR4_5_283m83mm68iyh8l.R.iget(10551)==0&false))) {{
                __CLR4_5_283m83mm68iyh8l.R.inc(10552);stripCount = 1;
            } }else {{
                __CLR4_5_283m83mm68iyh8l.R.inc(10553);stripCount = (int)(info.getSize().getHeightPx() / fld.getAsLong(0));
            }
            }__CLR4_5_283m83mm68iyh8l.R.inc(10554);if ((((stripCount > 1)&&(__CLR4_5_283m83mm68iyh8l.R.iget(10555)!=0|true))||(__CLR4_5_283m83mm68iyh8l.R.iget(10556)==0&false))) {{
                __CLR4_5_283m83mm68iyh8l.R.inc(10557);log.debug("More than one strip found in TIFF image.");
                __CLR4_5_283m83mm68iyh8l.R.inc(10558);throw new ImageException(
                        "ImageLoader doesn't support multiple strips");
            }
            }__CLR4_5_283m83mm68iyh8l.R.inc(10559);stripOffset = dir.getField(TIFFImageDecoder.TIFF_STRIP_OFFSETS).getAsLong(0);
            __CLR4_5_283m83mm68iyh8l.R.inc(10560);stripLength = dir.getField(TIFFImageDecoder.TIFF_STRIP_BYTE_COUNTS).getAsLong(0);
        } finally {
            __CLR4_5_283m83mm68iyh8l.R.inc(10561);in.reset();
        }

        __CLR4_5_283m83mm68iyh8l.R.inc(10562);in.seek(stripOffset);
        __CLR4_5_283m83mm68iyh8l.R.inc(10563);InputStream subin = new SubInputStream(XmlSourceUtil.needInputStream(src), stripLength, true);
        __CLR4_5_283m83mm68iyh8l.R.inc(10564);if ((((fillOrder == 2)&&(__CLR4_5_283m83mm68iyh8l.R.iget(10565)!=0|true))||(__CLR4_5_283m83mm68iyh8l.R.iget(10566)==0&false))) {{
            //Decorate to flip bit order
            __CLR4_5_283m83mm68iyh8l.R.inc(10567);subin = new FillOrderChangeInputStream(subin);
        }
        }__CLR4_5_283m83mm68iyh8l.R.inc(10568);ImageRawCCITTFax rawImage = new ImageRawCCITTFax(info, subin, compression);
        //Strip stream from source as we pass it on internally
        __CLR4_5_283m83mm68iyh8l.R.inc(10569);XmlSourceUtil.removeStreams(src);
        __CLR4_5_283m83mm68iyh8l.R.inc(10570);return rawImage;
    }finally{__CLR4_5_283m83mm68iyh8l.R.flushNeeded();}}

    private static class FillOrderChangeInputStream extends FilterInputStream {

        protected FillOrderChangeInputStream(InputStream in) {
            super(in);__CLR4_5_283m83mm68iyh8l.R.inc(10572);try{__CLR4_5_283m83mm68iyh8l.R.inc(10571);
        }finally{__CLR4_5_283m83mm68iyh8l.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int read(byte[] b, int off, int len) throws IOException {try{__CLR4_5_283m83mm68iyh8l.R.inc(10573);
            __CLR4_5_283m83mm68iyh8l.R.inc(10574);int result = super.read(b, off, len);
            __CLR4_5_283m83mm68iyh8l.R.inc(10575);if ((((result > 0)&&(__CLR4_5_283m83mm68iyh8l.R.iget(10576)!=0|true))||(__CLR4_5_283m83mm68iyh8l.R.iget(10577)==0&false))) {{
                __CLR4_5_283m83mm68iyh8l.R.inc(10578);int endpos = off + result;
                __CLR4_5_283m83mm68iyh8l.R.inc(10579);for (int i = off; (((i < endpos)&&(__CLR4_5_283m83mm68iyh8l.R.iget(10580)!=0|true))||(__CLR4_5_283m83mm68iyh8l.R.iget(10581)==0&false)); i++) {{
                    __CLR4_5_283m83mm68iyh8l.R.inc(10582);b[i] = FLIP_TABLE[b[i] & 0xff];
                }
            }}
            }__CLR4_5_283m83mm68iyh8l.R.inc(10583);return result;
        }finally{__CLR4_5_283m83mm68iyh8l.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int read() throws IOException {try{__CLR4_5_283m83mm68iyh8l.R.inc(10584);
            __CLR4_5_283m83mm68iyh8l.R.inc(10585);int b = super.read();
            __CLR4_5_283m83mm68iyh8l.R.inc(10586);if ((((b < 0)&&(__CLR4_5_283m83mm68iyh8l.R.iget(10587)!=0|true))||(__CLR4_5_283m83mm68iyh8l.R.iget(10588)==0&false))) {{
                __CLR4_5_283m83mm68iyh8l.R.inc(10589);return b;
            } }else {{
                __CLR4_5_283m83mm68iyh8l.R.inc(10590);return FLIP_TABLE[b] & 0xff;
            }
        }}finally{__CLR4_5_283m83mm68iyh8l.R.flushNeeded();}}

        // Table to be used when fillOrder = 2, for flipping bytes.
        // Copied from XML Graphics Commons' TIFFFaxDecoder class
        private static final byte[] FLIP_TABLE = {
         0,  -128,    64,   -64,    32,   -96,    96,   -32,
        16,  -112,    80,   -48,    48,   -80,   112,   -16,
         8,  -120,    72,   -56,    40,   -88,   104,   -24,
        24,  -104,    88,   -40,    56,   -72,   120,    -8,
         4,  -124,    68,   -60,    36,   -92,   100,   -28,
        20,  -108,    84,   -44,    52,   -76,   116,   -12,
        12,  -116,    76,   -52,    44,   -84,   108,   -20,
        28,  -100,    92,   -36,    60,   -68,   124,    -4,
         2,  -126,    66,   -62,    34,   -94,    98,   -30,
        18,  -110,    82,   -46,    50,   -78,   114,   -14,
        10,  -118,    74,   -54,    42,   -86,   106,   -22,
        26,  -102,    90,   -38,    58,   -70,   122,    -6,
         6,  -122,    70,   -58,    38,   -90,   102,   -26,
        22,  -106,    86,   -42,    54,   -74,   118,   -10,
        14,  -114,    78,   -50,    46,   -82,   110,   -18,
        30,   -98,    94,   -34,    62,   -66,   126,    -2,
         1,  -127,    65,   -63,    33,   -95,    97,   -31,
        17,  -111,    81,   -47,    49,   -79,   113,   -15,
         9,  -119,    73,   -55,    41,   -87,   105,   -23,
        25,  -103,    89,   -39,    57,   -71,   121,    -7,
         5,  -123,    69,   -59,    37,   -91,   101,   -27,
        21,  -107,    85,   -43,    53,   -75,   117,   -11,
        13,  -115,    77,   -51,    45,   -83,   109,   -19,
        29,   -99,    93,   -35,    61,   -67,   125,    -3,
         3,  -125,    67,   -61,    35,   -93,    99,   -29,
        19,  -109,    83,   -45,    51,   -77,   115,   -13,
        11,  -117,    75,   -53,    43,   -85,   107,   -21,
        27,  -101,    91,   -37,    59,   -69,   123,    -5,
         7,  -121,    71,   -57,    39,   -89,   103,   -25,
        23,  -105,    87,   -41,    55,   -73,   119,    -9,
        15,  -113,    79,   -49,    47,   -81,   111,   -17,
        31,   -97,    95,   -33,    63,   -65,   127,    -1,
        };
        // end
    }

}
