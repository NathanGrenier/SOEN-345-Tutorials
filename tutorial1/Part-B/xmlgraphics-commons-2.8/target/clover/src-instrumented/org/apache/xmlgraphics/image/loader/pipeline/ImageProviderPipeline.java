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

/* $Id: ImageProviderPipeline.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.pipeline;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.image.loader.cache.ImageCache;
import org.apache.xmlgraphics.image.loader.impl.ImageRawStream;
import org.apache.xmlgraphics.image.loader.spi.ImageConverter;
import org.apache.xmlgraphics.image.loader.spi.ImageImplRegistry;
import org.apache.xmlgraphics.image.loader.spi.ImageLoader;
import org.apache.xmlgraphics.image.loader.util.Penalty;

/**
 * Represents a pipeline of ImageConverters with an ImageLoader at the beginning of the
 * pipeline.
 */
public class ImageProviderPipeline {public static class __CLR4_5_29bp9bpm6lb50fm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,12245,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** logger */
    protected static final Log log = LogFactory.getLog(ImageProviderPipeline.class);

    private ImageCache cache;
    private ImageLoader loader;
    private List converters = new java.util.ArrayList();

    /**
     * Main constructor.
     * @param cache the image cache (may be null if no caching is desired)
     * @param loader the image loader to drive the pipeline with
     */
    public ImageProviderPipeline(ImageCache cache, ImageLoader loader) {try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12085);
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12086);this.cache = cache;
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12087);setImageLoader(loader);
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    /**
     * Constructor for operation without caching.
     * @param loader the image loader to drive the pipeline with
     */
    public ImageProviderPipeline(ImageLoader loader) {
        this(null, loader);__CLR4_5_29bp9bpm6lb50fm.R.inc(12089);try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12088);
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    /**
     * Default constructor without caching and without an ImageLoader (or the ImageLoader may
     * be set later).
     */
    public ImageProviderPipeline() {
        this(null, null);__CLR4_5_29bp9bpm6lb50fm.R.inc(12091);try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12090);
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    /**
     * Executes the image converter pipeline. First, the image indicated by the ImageInfo instance
     * is loaded through an ImageLoader and then optionally converted by a series of
     * ImageConverters. At the end of the pipeline, the fully loaded and converted image is
     * returned.
     * @param info the image info object indicating the image to load
     * @param hints a Map of image conversion hints
     * @param context the session context
     * @return the requested image
     * @throws ImageException if an error occurs while loader or converting the image
     * @throws IOException if an I/O error occurs
     */
    public Image execute(ImageInfo info, Map hints, ImageSessionContext context)
                throws ImageException, IOException {try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12092);
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12093);return execute(info, null, hints, context);
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    /**
     * Executes the image converter pipeline. First, the image indicated by the ImageInfo instance
     * is loaded through an ImageLoader and then optionally converted by a series of
     * ImageConverters. At the end of the pipeline, the fully loaded and converted image is
     * returned.
     * @param info the image info object indicating the image to load
     * @param originalImage the original image to start the pipeline off or null if an ImageLoader
     *          is used
     * @param hints a Map of image conversion hints
     * @param context the session context
     * @return the requested image
     * @throws ImageException if an error occurs while loader or converting the image
     * @throws IOException if an I/O error occurs
     */
    public Image execute(ImageInfo info, Image originalImage,
            Map hints, ImageSessionContext context) throws ImageException, IOException {try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12094);
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12095);if ((((hints == null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12096)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12097)==0&false))) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12098);hints = Collections.EMPTY_MAP;
        }
        }__CLR4_5_29bp9bpm6lb50fm.R.inc(12099);long start = System.currentTimeMillis();
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12100);Image img = null;

        //Remember the last image in the pipeline that is cacheable and cache that.
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12101);Image lastCacheableImage = null;

        __CLR4_5_29bp9bpm6lb50fm.R.inc(12102);int converterCount = converters.size();
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12103);int startingPoint = 0;
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12104);if ((((cache != null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12105)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12106)==0&false))) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12107);for (int i = converterCount - 1; (((i >= 0)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12108)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12109)==0&false)); i--) {{
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12110);ImageConverter converter = getConverter(i);
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12111);ImageFlavor flavor = converter.getTargetFlavor();
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12112);img = cache.getImage(info, flavor);
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12113);if ((((img != null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12114)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12115)==0&false))) {{
                    __CLR4_5_29bp9bpm6lb50fm.R.inc(12116);startingPoint = i + 1;
                    __CLR4_5_29bp9bpm6lb50fm.R.inc(12117);break;
                }
            }}

            }__CLR4_5_29bp9bpm6lb50fm.R.inc(12118);if ((((img == null && loader != null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12119)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12120)==0&false))) {{
                //try target flavor of loader from cache
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12121);ImageFlavor flavor = loader.getTargetFlavor();
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12122);img = cache.getImage(info, flavor);
            }
        }}
        }__CLR4_5_29bp9bpm6lb50fm.R.inc(12123);if ((((img == null && originalImage != null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12124)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12125)==0&false))) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12126);img = originalImage;
        }

        }__CLR4_5_29bp9bpm6lb50fm.R.inc(12127);boolean entirelyInCache = true;
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12128);long duration;
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12129);if ((((img == null && loader != null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12130)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12131)==0&false))) {{
            //Load image
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12132);img = loader.loadImage(info, hints, context);
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12133);if ((((log.isTraceEnabled())&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12134)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12135)==0&false))) {{
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12136);duration = System.currentTimeMillis() - start;
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12137);log.trace("Image loading using " + loader + " took " + duration + " ms.");
            }

            //Caching
            }__CLR4_5_29bp9bpm6lb50fm.R.inc(12138);entirelyInCache = false;
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12139);if ((((img.isCacheable())&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12140)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12141)==0&false))) {{
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12142);lastCacheableImage = img;
            }
        }}
        }__CLR4_5_29bp9bpm6lb50fm.R.inc(12143);if ((((img == null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12144)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12145)==0&false))) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12146);throw new ImageException(
                    "Pipeline fails. No ImageLoader and no original Image available.");
        }

        }__CLR4_5_29bp9bpm6lb50fm.R.inc(12147);if ((((converterCount > 0)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12148)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12149)==0&false))) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12150);for (int i = startingPoint; (((i < converterCount)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12151)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12152)==0&false)); i++) {{
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12153);ImageConverter converter = getConverter(i);
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12154);start = System.currentTimeMillis();
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12155);img = converter.convert(img, hints);
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12156);if ((((log.isTraceEnabled())&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12157)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12158)==0&false))) {{
                    __CLR4_5_29bp9bpm6lb50fm.R.inc(12159);duration = System.currentTimeMillis() - start;
                    __CLR4_5_29bp9bpm6lb50fm.R.inc(12160);log.trace("Image conversion using " + converter + " took " + duration + " ms.");
                }

                //Caching
                }__CLR4_5_29bp9bpm6lb50fm.R.inc(12161);entirelyInCache = false;
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12162);if ((((img.isCacheable())&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12163)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12164)==0&false))) {{
                    __CLR4_5_29bp9bpm6lb50fm.R.inc(12165);lastCacheableImage = img;
                }
            }}
        }}

        //Note: Currently we just cache the end result of the pipeline, not all intermediate
        //results as it is expected that the cache hit ration would be rather small.
        }__CLR4_5_29bp9bpm6lb50fm.R.inc(12166);if ((((cache != null && !entirelyInCache)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12167)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12168)==0&false))) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12169);if ((((lastCacheableImage == null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12170)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12171)==0&false))) {{
                //Try to make the Image cacheable
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12172);lastCacheableImage = forceCaching(img);
            }
            }__CLR4_5_29bp9bpm6lb50fm.R.inc(12173);if ((((lastCacheableImage != null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12174)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12175)==0&false))) {{
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12176);if ((((log.isTraceEnabled())&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12177)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12178)==0&false))) {{
                    __CLR4_5_29bp9bpm6lb50fm.R.inc(12179);log.trace("Caching image: " + lastCacheableImage);
                }
                }__CLR4_5_29bp9bpm6lb50fm.R.inc(12180);cache.putImage(lastCacheableImage);
            }
        }}
        }__CLR4_5_29bp9bpm6lb50fm.R.inc(12181);return img;
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    private ImageConverter getConverter(int index) {try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12182);
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12183);return (ImageConverter)converters.get(index);
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    /**
     * In some cases the provided Image is not cacheable, nor is any of the intermediate Image
     * instances (for example, when loading a raw JPEG file). If the image is loaded over a
     * potentially slow network, it is preferrable to download the whole file and cache it
     * in memory or in a temporary file. It's not always possible to convert an Image into a
     * cacheable variant.
     * @param img the Image to investigate
     * @return the converted, cacheable Image or null if the Image cannot be converted
     * @throws IOException if an I/O error occurs
     */
    protected Image forceCaching(Image img) throws IOException {try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12184);
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12185);if ((((img instanceof ImageRawStream)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12186)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12187)==0&false))) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12188);ImageRawStream raw = (ImageRawStream)img;
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12189);if ((((log.isDebugEnabled())&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12190)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12191)==0&false))) {{
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12192);log.debug("Image is made cacheable: " + img.getInfo());
            }

            //Read the whole stream and hold it in memory so the image can be cached
            }__CLR4_5_29bp9bpm6lb50fm.R.inc(12193);ByteArrayOutputStream baout = new ByteArrayOutputStream();
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12194);InputStream in = raw.createInputStream();
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12195);try {
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12196);IOUtils.copy(in, baout);
            } finally {
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12197);IOUtils.closeQuietly(in);
            }
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12198);final byte[] data = baout.toByteArray();
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12199);raw.setInputStreamFactory(new ImageRawStream.ByteArrayStreamFactory(data));
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12200);return raw;
        }
        }__CLR4_5_29bp9bpm6lb50fm.R.inc(12201);return null;
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    /**
     * Sets the ImageLoader that is used at the beginning of the pipeline if the image is not
     * loaded, yet.
     * @param imageLoader the image loader implementation
     */
    public void setImageLoader(ImageLoader imageLoader) {try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12202);
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12203);this.loader = imageLoader;
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    /**
     * Adds an additional ImageConverter to the end of the pipeline.
     * @param converter the ImageConverter instance
     */
    public void addConverter(ImageConverter converter) {try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12204);
        //TODO check for compatibility
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12205);this.converters.add(converter);
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12206);
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12207);StringBuffer sb = new StringBuffer();
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12208);sb.append("Loader: ").append(loader);
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12209);if ((((converters.size() > 0)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12210)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12211)==0&false))) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12212);sb.append(" Converters: ");
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12213);sb.append(converters);
        }
        }__CLR4_5_29bp9bpm6lb50fm.R.inc(12214);return sb.toString();
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    /**
     * Returns the overall conversion penalty for the pipeline. This can be used to choose among
     * different possible pipelines.
     * @return the overall penalty (a non-negative integer)
     */
    public int getConversionPenalty() {try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12215);
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12216);return getConversionPenalty(null).getValue();
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    /**
     * Returns the overall conversion penalty for the pipeline. This can be used to choose among
     * different possible pipelines.
     * @param registry the image implementation registry
     * @return the overall penalty (a non-negative integer)
     */
    public Penalty getConversionPenalty(ImageImplRegistry registry) {try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12217);
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12218);Penalty penalty = Penalty.ZERO_PENALTY;
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12219);if ((((loader != null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12220)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12221)==0&false))) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12222);penalty = penalty.add(loader.getUsagePenalty());
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12223);if ((((registry != null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12224)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12225)==0&false))) {{
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12226);penalty = penalty.add(
                        registry.getAdditionalPenalty(loader.getClass().getName()));
            }
        }}
        }__CLR4_5_29bp9bpm6lb50fm.R.inc(12227);for (Object converter1 : converters) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12228);ImageConverter converter = (ImageConverter) converter1;
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12229);penalty = penalty.add(converter.getConversionPenalty());
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12230);if ((((registry != null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12231)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12232)==0&false))) {{
                __CLR4_5_29bp9bpm6lb50fm.R.inc(12233);penalty = penalty.add(
                        registry.getAdditionalPenalty(converter.getClass().getName()));
            }
        }}
        }__CLR4_5_29bp9bpm6lb50fm.R.inc(12234);return penalty;
    }finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

    /**
     * Returns the target flavor generated by this pipeline.
     * @return the target flavor
     */
    public ImageFlavor getTargetFlavor() {try{__CLR4_5_29bp9bpm6lb50fm.R.inc(12235);
        __CLR4_5_29bp9bpm6lb50fm.R.inc(12236);if ((((converters.size() > 0)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12237)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12238)==0&false))) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12239);return getConverter(converters.size() - 1).getTargetFlavor();
        } }else {__CLR4_5_29bp9bpm6lb50fm.R.inc(12240);if ((((this.loader != null)&&(__CLR4_5_29bp9bpm6lb50fm.R.iget(12241)!=0|true))||(__CLR4_5_29bp9bpm6lb50fm.R.iget(12242)==0&false))) {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12243);return this.loader.getTargetFlavor();
        } }else {{
            __CLR4_5_29bp9bpm6lb50fm.R.inc(12244);return null;
        }
    }}}finally{__CLR4_5_29bp9bpm6lb50fm.R.flushNeeded();}}

}
