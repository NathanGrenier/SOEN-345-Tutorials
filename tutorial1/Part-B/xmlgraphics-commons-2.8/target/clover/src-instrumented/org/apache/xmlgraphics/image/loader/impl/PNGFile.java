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

/* $Id: PNGFile.java 1843559 2018-10-11 14:59:17Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.IndexColorModel;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

import org.apache.xmlgraphics.image.codec.png.PNGChunk;
import org.apache.xmlgraphics.image.codec.util.PropertyUtil;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageInfo;

// CSOFF: MethodName

/**
 * Provides methods useful for processing PNG files.
 */
@java.lang.SuppressWarnings({"fallthrough"}) class PNGFile implements PNGConstants {public static class __CLR4_5_28gc8gcm68iyhbx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,11168,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ColorModel colorModel;
    private ICC_Profile iccProfile;
    private int sRGBRenderingIntent = -1;
    private int bitDepth;
    private int colorType;
    private boolean isTransparent;
    private int grayTransparentAlpha;
    private int redTransparentAlpha;
    private int greenTransparentAlpha;
    private int blueTransparentAlpha;
    private List<InputStream> streamVec = new ArrayList<InputStream>();
    private int paletteEntries;
    private byte[] redPalette;
    private byte[] greenPalette;
    private byte[] bluePalette;
    private byte[] alphaPalette;
    private boolean hasPalette;
    private boolean hasAlphaPalette;

    public PNGFile(InputStream stream, String uri) throws IOException, ImageException {try{__CLR4_5_28gc8gcm68iyhbx.R.inc(10956);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(10957);if ((((!stream.markSupported())&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(10958)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(10959)==0&false))) {{
            __CLR4_5_28gc8gcm68iyhbx.R.inc(10960);stream = new BufferedInputStream(stream);
        }
        }__CLR4_5_28gc8gcm68iyhbx.R.inc(10961);DataInputStream distream = new DataInputStream(stream);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(10962);long magic = distream.readLong();
        __CLR4_5_28gc8gcm68iyhbx.R.inc(10963);if ((((magic != PNG_SIGNATURE)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(10964)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(10965)==0&false))) {{
            __CLR4_5_28gc8gcm68iyhbx.R.inc(10966);String msg = PropertyUtil.getString("PNGImageDecoder0");
            __CLR4_5_28gc8gcm68iyhbx.R.inc(10967);throw new ImageException(msg);
        }
        // only some chunks are worth parsing in the current implementation
        }__CLR4_5_28gc8gcm68iyhbx.R.inc(10968);do {{
            __CLR4_5_28gc8gcm68iyhbx.R.inc(10969);try {
                __CLR4_5_28gc8gcm68iyhbx.R.inc(10970);PNGChunk chunk;
                __CLR4_5_28gc8gcm68iyhbx.R.inc(10971);String chunkType = PNGChunk.getChunkType(distream);
                __CLR4_5_28gc8gcm68iyhbx.R.inc(10972);if ((((chunkType.equals(PNGChunk.ChunkType.IHDR.name()))&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(10973)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(10974)==0&false))) {{
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(10975);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(10976);parse_IHDR_chunk(chunk);
                } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(10977);if ((((chunkType.equals(PNGChunk.ChunkType.PLTE.name()))&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(10978)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(10979)==0&false))) {{
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(10980);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(10981);parse_PLTE_chunk(chunk);
                } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(10982);if ((((chunkType.equals(PNGChunk.ChunkType.IDAT.name()))&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(10983)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(10984)==0&false))) {{
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(10985);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(10986);streamVec.add(new ByteArrayInputStream(chunk.getData()));
                } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(10987);if ((((chunkType.equals(PNGChunk.ChunkType.IEND.name()))&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(10988)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(10989)==0&false))) {{
                    // chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(10990);PNGChunk.skipChunk(distream);
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(10991);break; // fall through to the bottom
                } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(10992);if ((((chunkType.equals(PNGChunk.ChunkType.tRNS.name()))&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(10993)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(10994)==0&false))) {{
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(10995);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(10996);parse_tRNS_chunk(chunk);
                } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(10997);if ((((chunkType.equals(PNGChunk.ChunkType.iCCP.name()))&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(10998)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(10999)==0&false))) {{
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(11000);chunk = PNGChunk.readChunk(distream);
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(11001);parse_iCCP_chunk(chunk);
                } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(11002);if ((((chunkType.equals(PNGChunk.ChunkType.sRGB.name()))&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11003)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11004)==0&false))) {{
                  __CLR4_5_28gc8gcm68iyhbx.R.inc(11005);chunk = PNGChunk.readChunk(distream);
                  __CLR4_5_28gc8gcm68iyhbx.R.inc(11006);parse_sRGB_chunk(chunk);
                } }else {{
                    __CLR4_5_28gc8gcm68iyhbx.R.inc(11007);if ((((Character.isUpperCase(chunkType.charAt(0)))&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11008)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11009)==0&false))) {{
                        __CLR4_5_28gc8gcm68iyhbx.R.inc(11010);throw new ImageException("PNG unknown critical chunk: " + chunkType);
                    }
                    }__CLR4_5_28gc8gcm68iyhbx.R.inc(11011);PNGChunk.skipChunk(distream);
                }
            }}}}}}}} catch (Exception e) {
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11012);String msg = PropertyUtil.getString("PNGImageDecoder2");
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11013);throw new RuntimeException(msg + " " + uri, e);
            }
        } }while (true);
    }finally{__CLR4_5_28gc8gcm68iyhbx.R.flushNeeded();}}

    public ImageRawPNG getImageRawPNG(ImageInfo info) throws ImageException {try{__CLR4_5_28gc8gcm68iyhbx.R.inc(11014);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11015);InputStream seqStream = new SequenceInputStream(Collections.enumeration(streamVec));
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11016);ColorSpace rgbCS = null;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_28gc8gcm68iyhbx.R.inc(11017);switch (colorType) {
        case PNG_COLOR_GRAY:if (!__CLB4_5_2_bool0) {__CLR4_5_28gc8gcm68iyhbx.R.inc(11018);__CLB4_5_2_bool0=true;}
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11019);if ((((hasPalette)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11020)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11021)==0&false))) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11022);throw new ImageException("Corrupt PNG: color palette is not allowed!");
            }
            }__CLR4_5_28gc8gcm68iyhbx.R.inc(11023);colorModel = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY), false, false,
                    ColorModel.OPAQUE, DataBuffer.TYPE_BYTE);
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11024);break;
        case PNG_COLOR_RGB:if (!__CLB4_5_2_bool0) {__CLR4_5_28gc8gcm68iyhbx.R.inc(11025);__CLB4_5_2_bool0=true;}
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11026);if ((((iccProfile != null)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11027)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11028)==0&false))) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11029);rgbCS = new ICC_ColorSpace(iccProfile);
            } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(11030);if ((((sRGBRenderingIntent != -1)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11031)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11032)==0&false))) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11033);rgbCS = ColorSpace.getInstance(ColorSpace.CS_sRGB);
            } }else {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11034);rgbCS = ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB);
            }
            }}__CLR4_5_28gc8gcm68iyhbx.R.inc(11035);colorModel = new ComponentColorModel(rgbCS, false, false, ColorModel.OPAQUE, DataBuffer.TYPE_BYTE);
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11036);break;
        case PNG_COLOR_PALETTE:if (!__CLB4_5_2_bool0) {__CLR4_5_28gc8gcm68iyhbx.R.inc(11037);__CLB4_5_2_bool0=true;}
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11038);if ((((hasAlphaPalette)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11039)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11040)==0&false))) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11041);colorModel = new IndexColorModel(bitDepth, paletteEntries, redPalette, greenPalette,
                        bluePalette, alphaPalette);
            } }else {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11042);colorModel = new IndexColorModel(bitDepth, paletteEntries, redPalette, greenPalette,
                        bluePalette);
            }
            }__CLR4_5_28gc8gcm68iyhbx.R.inc(11043);break;
        case PNG_COLOR_GRAY_ALPHA:if (!__CLB4_5_2_bool0) {__CLR4_5_28gc8gcm68iyhbx.R.inc(11044);__CLB4_5_2_bool0=true;}
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11045);if ((((hasPalette)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11046)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11047)==0&false))) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11048);throw new ImageException("Corrupt PNG: color palette is not allowed!");
            }
            }__CLR4_5_28gc8gcm68iyhbx.R.inc(11049);colorModel = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY), true, false,
                    ColorModel.TRANSLUCENT, DataBuffer.TYPE_BYTE);
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11050);break;
        case PNG_COLOR_RGB_ALPHA:if (!__CLB4_5_2_bool0) {__CLR4_5_28gc8gcm68iyhbx.R.inc(11051);__CLB4_5_2_bool0=true;}
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11052);if ((((iccProfile != null)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11053)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11054)==0&false))) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11055);rgbCS = new ICC_ColorSpace(iccProfile);
            } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(11056);if ((((sRGBRenderingIntent != -1)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11057)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11058)==0&false))) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11059);rgbCS = ColorSpace.getInstance(ColorSpace.CS_sRGB);
            } }else {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11060);rgbCS = ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB);
            }
            }}__CLR4_5_28gc8gcm68iyhbx.R.inc(11061);colorModel = new ComponentColorModel(rgbCS, true, false, ColorModel.TRANSLUCENT,
                    DataBuffer.TYPE_BYTE);
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11062);break;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_28gc8gcm68iyhbx.R.inc(11063);__CLB4_5_2_bool0=true;}
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11064);throw new ImageException("Unsupported color type: " + colorType);
        }
        // the iccProfile is still null for now
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11065);ImageRawPNG rawImage = new ImageRawPNG(info, seqStream, colorModel, bitDepth, iccProfile);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11066);if ((((isTransparent)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11067)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11068)==0&false))) {{
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11069);if ((((colorType == PNG_COLOR_GRAY)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11070)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11071)==0&false))) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11072);rawImage.setGrayTransparentAlpha(grayTransparentAlpha);
            } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(11073);if ((((colorType == PNG_COLOR_RGB)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11074)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11075)==0&false))) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11076);rawImage.setRGBTransparentAlpha(redTransparentAlpha, greenTransparentAlpha,
                        blueTransparentAlpha);
            } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(11077);if ((((colorType == PNG_COLOR_PALETTE)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11078)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11079)==0&false))) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11080);rawImage.setTransparent();
            } }else {{
                //
            }
        }}}}
        }__CLR4_5_28gc8gcm68iyhbx.R.inc(11081);if ((((sRGBRenderingIntent != -1)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11082)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11083)==0&false))) {{
          __CLR4_5_28gc8gcm68iyhbx.R.inc(11084);rawImage.setRenderingIntent(sRGBRenderingIntent);
        }
        }__CLR4_5_28gc8gcm68iyhbx.R.inc(11085);return rawImage;
    }finally{__CLR4_5_28gc8gcm68iyhbx.R.flushNeeded();}}

    private void parse_IHDR_chunk(PNGChunk chunk) {try{__CLR4_5_28gc8gcm68iyhbx.R.inc(11086);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11087);bitDepth = chunk.getInt1(8);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11088);colorType = chunk.getInt1(9);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11089);int compressionMethod = chunk.getInt1(10);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11090);if ((((compressionMethod != 0)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11091)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11092)==0&false))) {{
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11093);throw new RuntimeException("Unsupported PNG compression method: " + compressionMethod);
        }
        }__CLR4_5_28gc8gcm68iyhbx.R.inc(11094);int filterMethod = chunk.getInt1(11);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11095);if ((((filterMethod != 0)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11096)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11097)==0&false))) {{
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11098);throw new RuntimeException("Unsupported PNG filter method: " + filterMethod);
        }
        }__CLR4_5_28gc8gcm68iyhbx.R.inc(11099);int interlaceMethod = chunk.getInt1(12);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11100);if ((((interlaceMethod != 0)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11101)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11102)==0&false))) {{
            // this is a limitation of the current implementation
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11103);throw new RuntimeException("Unsupported PNG interlace method: " + interlaceMethod);
        }
    }}finally{__CLR4_5_28gc8gcm68iyhbx.R.flushNeeded();}}

    private void parse_PLTE_chunk(PNGChunk chunk) {try{__CLR4_5_28gc8gcm68iyhbx.R.inc(11104);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11105);paletteEntries = chunk.getLength() / 3;
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11106);redPalette = new byte[paletteEntries];
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11107);greenPalette = new byte[paletteEntries];
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11108);bluePalette = new byte[paletteEntries];
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11109);hasPalette = true;

        __CLR4_5_28gc8gcm68iyhbx.R.inc(11110);int pltIndex = 0;
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11111);for (int i = 0; (((i < paletteEntries)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11112)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11113)==0&false)); i++) {{
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11114);redPalette[i] = chunk.getByte(pltIndex++);
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11115);greenPalette[i] = chunk.getByte(pltIndex++);
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11116);bluePalette[i] = chunk.getByte(pltIndex++);
        }
    }}finally{__CLR4_5_28gc8gcm68iyhbx.R.flushNeeded();}}

    private void parse_tRNS_chunk(PNGChunk chunk) {try{__CLR4_5_28gc8gcm68iyhbx.R.inc(11117);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11118);if ((((colorType == PNG_COLOR_PALETTE)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11119)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11120)==0&false))) {{
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11121);int entries = chunk.getLength();
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11122);if ((((entries > paletteEntries)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11123)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11124)==0&false))) {{
                // Error -- mustn't have more alpha than RGB palette entries
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11125);String msg = PropertyUtil.getString("PNGImageDecoder14");
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11126);throw new RuntimeException(msg);
            }
            // Load beginning of palette from the chunk
            }__CLR4_5_28gc8gcm68iyhbx.R.inc(11127);alphaPalette = new byte[paletteEntries];
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11128);for (int i = 0; (((i < entries)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11129)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11130)==0&false)); i++) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11131);alphaPalette[i] = chunk.getByte(i);
            }
            // Fill rest of palette with 255
            }__CLR4_5_28gc8gcm68iyhbx.R.inc(11132);for (int i = entries; (((i < paletteEntries)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11133)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11134)==0&false)); i++) {{
                __CLR4_5_28gc8gcm68iyhbx.R.inc(11135);alphaPalette[i] = (byte) 255;
            }
            }__CLR4_5_28gc8gcm68iyhbx.R.inc(11136);hasAlphaPalette = true;
        } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(11137);if ((((colorType == PNG_COLOR_GRAY)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11138)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11139)==0&false))) {{
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11140);grayTransparentAlpha = chunk.getInt2(0);
        } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(11141);if ((((colorType == PNG_COLOR_RGB)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11142)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11143)==0&false))) {{
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11144);redTransparentAlpha = chunk.getInt2(0);
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11145);greenTransparentAlpha = chunk.getInt2(2);
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11146);blueTransparentAlpha = chunk.getInt2(4);
        } }else {__CLR4_5_28gc8gcm68iyhbx.R.inc(11147);if ((((colorType == PNG_COLOR_GRAY_ALPHA || colorType == PNG_COLOR_RGB_ALPHA)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11148)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11149)==0&false))) {{
            // Error -- GA or RGBA image can't have a tRNS chunk.
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11150);String msg = PropertyUtil.getString("PNGImageDecoder15");
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11151);throw new RuntimeException(msg);
        }
        }}}}__CLR4_5_28gc8gcm68iyhbx.R.inc(11152);isTransparent = true;
    }finally{__CLR4_5_28gc8gcm68iyhbx.R.flushNeeded();}}

    private void parse_iCCP_chunk(PNGChunk chunk) {try{__CLR4_5_28gc8gcm68iyhbx.R.inc(11153);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11154);int length = chunk.getLength();
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11155);int textIndex = 0;
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11156);while ((((chunk.getByte(textIndex++) != 0)&&(__CLR4_5_28gc8gcm68iyhbx.R.iget(11157)!=0|true))||(__CLR4_5_28gc8gcm68iyhbx.R.iget(11158)==0&false))) {{
            //NOP
        }
        }__CLR4_5_28gc8gcm68iyhbx.R.inc(11159);textIndex++;
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11160);byte[] profile = new byte[length - textIndex];
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11161);System.arraycopy(chunk.getData(), textIndex, profile, 0, length - textIndex);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11162);ByteArrayInputStream bais = new ByteArrayInputStream(profile);
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11163);InflaterInputStream iis = new InflaterInputStream(bais, new Inflater());
        __CLR4_5_28gc8gcm68iyhbx.R.inc(11164);try {
            __CLR4_5_28gc8gcm68iyhbx.R.inc(11165);iccProfile = ICC_Profile.getInstance(iis);
        } catch (IOException ioe) {
            // this is OK; the profile will be null
        }
    }finally{__CLR4_5_28gc8gcm68iyhbx.R.flushNeeded();}}

    private void parse_sRGB_chunk(PNGChunk chunk) {try{__CLR4_5_28gc8gcm68iyhbx.R.inc(11166);
      __CLR4_5_28gc8gcm68iyhbx.R.inc(11167);sRGBRenderingIntent = chunk.getByte(0);
    }finally{__CLR4_5_28gc8gcm68iyhbx.R.flushNeeded();}}

}
