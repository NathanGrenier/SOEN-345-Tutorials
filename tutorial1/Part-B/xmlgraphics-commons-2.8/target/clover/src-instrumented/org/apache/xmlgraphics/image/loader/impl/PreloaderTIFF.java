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

/* $Id: PreloaderTIFF.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.io.IOException;
import java.text.MessageFormat;

import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.image.codec.tiff.TIFFDirectory;
import org.apache.xmlgraphics.image.codec.tiff.TIFFField;
import org.apache.xmlgraphics.image.codec.tiff.TIFFImageDecoder;
import org.apache.xmlgraphics.image.codec.util.SeekableStream;
import org.apache.xmlgraphics.image.loader.ImageContext;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSize;
import org.apache.xmlgraphics.image.loader.SubImageNotFoundException;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;
import org.apache.xmlgraphics.image.loader.util.SeekableStreamAdapter;
import org.apache.xmlgraphics.util.MimeConstants;
import org.apache.xmlgraphics.util.UnitConv;

/**
 * Image preloader for TIFF images.
 * <p>
 * Note: The implementation relies on the TIFF codec code in Apache XML Graphics Commons for
 * access to the TIFF directory.
 */
public class PreloaderTIFF extends AbstractImagePreloader {public static class __CLR4_5_28ye8yem6lb50c7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,11728,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Log log = LogFactory.getLog(PreloaderTIFF.class);

    private static final int TIFF_SIG_LENGTH = 8;

    /** {@inheritDoc}
     * @throws ImageException */
    public ImageInfo preloadImage(String uri, Source src, ImageContext context)
            throws IOException, ImageException {try{__CLR4_5_28ye8yem6lb50c7.R.inc(11606);
        __CLR4_5_28ye8yem6lb50c7.R.inc(11607);if ((((!ImageUtil.hasImageInputStream(src))&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11608)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11609)==0&false))) {{
            __CLR4_5_28ye8yem6lb50c7.R.inc(11610);return null;
        }
        }__CLR4_5_28ye8yem6lb50c7.R.inc(11611);ImageInputStream in = ImageUtil.needImageInputStream(src);
        __CLR4_5_28ye8yem6lb50c7.R.inc(11612);byte[] header = getHeader(in, TIFF_SIG_LENGTH);
        __CLR4_5_28ye8yem6lb50c7.R.inc(11613);boolean supported = false;

        // first 2 bytes = II (little endian encoding)
        __CLR4_5_28ye8yem6lb50c7.R.inc(11614);if ((((header[0] == (byte) 0x49 && header[1] == (byte) 0x49)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11615)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11616)==0&false))) {{

            // look for '42' in byte 3 and '0' in byte 4
            __CLR4_5_28ye8yem6lb50c7.R.inc(11617);if ((((header[2] == 42 && header[3] == 0)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11618)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11619)==0&false))) {{
                __CLR4_5_28ye8yem6lb50c7.R.inc(11620);supported = true;
            }
        }}

        // first 2 bytes == MM (big endian encoding)
        }__CLR4_5_28ye8yem6lb50c7.R.inc(11621);if ((((header[0] == (byte) 0x4D && header[1] == (byte) 0x4D)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11622)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11623)==0&false))) {{

            // look for '42' in byte 4 and '0' in byte 3
            __CLR4_5_28ye8yem6lb50c7.R.inc(11624);if ((((header[2] == 0 && header[3] == 42)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11625)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11626)==0&false))) {{
                __CLR4_5_28ye8yem6lb50c7.R.inc(11627);supported = true;
            }
        }}

        }__CLR4_5_28ye8yem6lb50c7.R.inc(11628);if ((((supported)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11629)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11630)==0&false))) {{
            __CLR4_5_28ye8yem6lb50c7.R.inc(11631);ImageInfo info = createImageInfo(uri, in, context);
            __CLR4_5_28ye8yem6lb50c7.R.inc(11632);return info;
        } }else {{
            __CLR4_5_28ye8yem6lb50c7.R.inc(11633);return null;
        }
    }}finally{__CLR4_5_28ye8yem6lb50c7.R.flushNeeded();}}

    private ImageInfo createImageInfo(String uri, ImageInputStream in, ImageContext context)
                throws IOException, ImageException {try{__CLR4_5_28ye8yem6lb50c7.R.inc(11634);
        __CLR4_5_28ye8yem6lb50c7.R.inc(11635);ImageInfo info = null;
        __CLR4_5_28ye8yem6lb50c7.R.inc(11636);in.mark();
        __CLR4_5_28ye8yem6lb50c7.R.inc(11637);try {
            __CLR4_5_28ye8yem6lb50c7.R.inc(11638);int pageIndex = ImageUtil.needPageIndexFromURI(uri);

            __CLR4_5_28ye8yem6lb50c7.R.inc(11639);SeekableStream seekable = new SeekableStreamAdapter(in);
            __CLR4_5_28ye8yem6lb50c7.R.inc(11640);TIFFDirectory dir;
            __CLR4_5_28ye8yem6lb50c7.R.inc(11641);try {
                __CLR4_5_28ye8yem6lb50c7.R.inc(11642);dir = new TIFFDirectory(seekable, pageIndex);
            } catch (IllegalArgumentException iae) {
                __CLR4_5_28ye8yem6lb50c7.R.inc(11643);String errorMessage = MessageFormat.format(
                        "Subimage {0} does not exist.", new Object[] {pageIndex});
                __CLR4_5_28ye8yem6lb50c7.R.inc(11644);throw new SubImageNotFoundException(errorMessage);
            }
            __CLR4_5_28ye8yem6lb50c7.R.inc(11645);int width = (int)dir.getFieldAsLong(TIFFImageDecoder.TIFF_IMAGE_WIDTH);
            __CLR4_5_28ye8yem6lb50c7.R.inc(11646);int height = (int)dir.getFieldAsLong(TIFFImageDecoder.TIFF_IMAGE_LENGTH);
            __CLR4_5_28ye8yem6lb50c7.R.inc(11647);ImageSize size = new ImageSize();
            __CLR4_5_28ye8yem6lb50c7.R.inc(11648);size.setSizeInPixels(width, height);
            __CLR4_5_28ye8yem6lb50c7.R.inc(11649);int unit = 2; //inch is default
            __CLR4_5_28ye8yem6lb50c7.R.inc(11650);if ((((dir.isTagPresent(TIFFImageDecoder.TIFF_RESOLUTION_UNIT))&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11651)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11652)==0&false))) {{
                __CLR4_5_28ye8yem6lb50c7.R.inc(11653);unit = (int)dir.getFieldAsLong(TIFFImageDecoder.TIFF_RESOLUTION_UNIT);
            }
            }__CLR4_5_28ye8yem6lb50c7.R.inc(11654);if ((((unit == 2 || unit == 3)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11655)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11656)==0&false))) {{
                __CLR4_5_28ye8yem6lb50c7.R.inc(11657);float xRes;
                __CLR4_5_28ye8yem6lb50c7.R.inc(11658);float yRes;
                __CLR4_5_28ye8yem6lb50c7.R.inc(11659);TIFFField fldx = dir.getField(TIFFImageDecoder.TIFF_X_RESOLUTION);
                __CLR4_5_28ye8yem6lb50c7.R.inc(11660);TIFFField fldy = dir.getField(TIFFImageDecoder.TIFF_Y_RESOLUTION);
                __CLR4_5_28ye8yem6lb50c7.R.inc(11661);if ((((fldx == null || fldy == null)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11662)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11663)==0&false))) {{
                    __CLR4_5_28ye8yem6lb50c7.R.inc(11664);unit = 2;
                    __CLR4_5_28ye8yem6lb50c7.R.inc(11665);xRes = context.getSourceResolution();
                    __CLR4_5_28ye8yem6lb50c7.R.inc(11666);yRes = xRes;
                } }else {{
                    __CLR4_5_28ye8yem6lb50c7.R.inc(11667);xRes = fldx.getAsFloat(0);
                    __CLR4_5_28ye8yem6lb50c7.R.inc(11668);yRes = fldy.getAsFloat(0);
                }
                }__CLR4_5_28ye8yem6lb50c7.R.inc(11669);if ((((xRes == 0 || yRes == 0)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11670)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11671)==0&false))) {{
                    //Some TIFFs may report 0 here which would lead to problems
                    __CLR4_5_28ye8yem6lb50c7.R.inc(11672);size.setResolution(context.getSourceResolution());
                } }else {__CLR4_5_28ye8yem6lb50c7.R.inc(11673);if ((((unit == 2)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11674)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11675)==0&false))) {{
                    __CLR4_5_28ye8yem6lb50c7.R.inc(11676);size.setResolution(xRes, yRes); //Inch
                } }else {{
                    __CLR4_5_28ye8yem6lb50c7.R.inc(11677);size.setResolution(
                            UnitConv.in2mm(xRes) / 10,
                            UnitConv.in2mm(yRes) / 10); //Centimeters
                }
            }}} }else {{
                __CLR4_5_28ye8yem6lb50c7.R.inc(11678);size.setResolution(context.getSourceResolution());
            }
            }__CLR4_5_28ye8yem6lb50c7.R.inc(11679);size.calcSizeFromPixels();
            __CLR4_5_28ye8yem6lb50c7.R.inc(11680);if ((((log.isTraceEnabled())&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11681)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11682)==0&false))) {{
                __CLR4_5_28ye8yem6lb50c7.R.inc(11683);log.trace("TIFF image detected: " + size);
            }

            }__CLR4_5_28ye8yem6lb50c7.R.inc(11684);info = new ImageInfo(uri, MimeConstants.MIME_TIFF);
            __CLR4_5_28ye8yem6lb50c7.R.inc(11685);info.setSize(size);

            __CLR4_5_28ye8yem6lb50c7.R.inc(11686);TIFFField fld;

            __CLR4_5_28ye8yem6lb50c7.R.inc(11687);fld = dir.getField(TIFFImageDecoder.TIFF_COMPRESSION);
            __CLR4_5_28ye8yem6lb50c7.R.inc(11688);if ((((fld != null)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11689)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11690)==0&false))) {{
                __CLR4_5_28ye8yem6lb50c7.R.inc(11691);int compression = fld.getAsInt(0);
                __CLR4_5_28ye8yem6lb50c7.R.inc(11692);if ((((log.isTraceEnabled())&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11693)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11694)==0&false))) {{
                    __CLR4_5_28ye8yem6lb50c7.R.inc(11695);log.trace("TIFF compression: " + compression);
                }
                }__CLR4_5_28ye8yem6lb50c7.R.inc(11696);info.getCustomObjects().put("TIFF_COMPRESSION", compression);
            }

            }__CLR4_5_28ye8yem6lb50c7.R.inc(11697);fld = dir.getField(TIFFImageDecoder.TIFF_TILE_WIDTH);
            __CLR4_5_28ye8yem6lb50c7.R.inc(11698);if ((((fld != null)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11699)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11700)==0&false))) {{
                __CLR4_5_28ye8yem6lb50c7.R.inc(11701);if ((((log.isTraceEnabled())&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11702)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11703)==0&false))) {{
                    __CLR4_5_28ye8yem6lb50c7.R.inc(11704);log.trace("TIFF is tiled");
                }
                }__CLR4_5_28ye8yem6lb50c7.R.inc(11705);info.getCustomObjects().put("TIFF_TILED", Boolean.TRUE);
            }

            }__CLR4_5_28ye8yem6lb50c7.R.inc(11706);int stripCount;
            __CLR4_5_28ye8yem6lb50c7.R.inc(11707);fld = dir.getField(TIFFImageDecoder.TIFF_ROWS_PER_STRIP);
            __CLR4_5_28ye8yem6lb50c7.R.inc(11708);if ((((fld == null)&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11709)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11710)==0&false))) {{
                __CLR4_5_28ye8yem6lb50c7.R.inc(11711);stripCount = 1;
            } }else {{
                __CLR4_5_28ye8yem6lb50c7.R.inc(11712);stripCount = (int)Math.ceil(size.getHeightPx() / (double)fld.getAsLong(0));
            }
            }__CLR4_5_28ye8yem6lb50c7.R.inc(11713);if ((((log.isTraceEnabled())&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11714)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11715)==0&false))) {{
                __CLR4_5_28ye8yem6lb50c7.R.inc(11716);log.trace("TIFF has " + stripCount + " strips.");
            }
            }__CLR4_5_28ye8yem6lb50c7.R.inc(11717);info.getCustomObjects().put("TIFF_STRIP_COUNT", stripCount);

            __CLR4_5_28ye8yem6lb50c7.R.inc(11718);try {
                //Check if there is a next page
                __CLR4_5_28ye8yem6lb50c7.R.inc(11719);new TIFFDirectory(seekable, pageIndex + 1);
                __CLR4_5_28ye8yem6lb50c7.R.inc(11720);info.getCustomObjects().put(ImageInfo.HAS_MORE_IMAGES, Boolean.TRUE);
                __CLR4_5_28ye8yem6lb50c7.R.inc(11721);if ((((log.isTraceEnabled())&&(__CLR4_5_28ye8yem6lb50c7.R.iget(11722)!=0|true))||(__CLR4_5_28ye8yem6lb50c7.R.iget(11723)==0&false))) {{
                    __CLR4_5_28ye8yem6lb50c7.R.inc(11724);log.trace("TIFF is multi-page.");
                }
            }} catch (IllegalArgumentException iae) {
                __CLR4_5_28ye8yem6lb50c7.R.inc(11725);info.getCustomObjects().put(ImageInfo.HAS_MORE_IMAGES, Boolean.FALSE);
            }
        } finally {
            __CLR4_5_28ye8yem6lb50c7.R.inc(11726);in.reset();
        }

        __CLR4_5_28ye8yem6lb50c7.R.inc(11727);return info;
    }finally{__CLR4_5_28ye8yem6lb50c7.R.flushNeeded();}}

}
