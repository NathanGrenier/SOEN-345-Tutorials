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

/* $Id: PipelineFactory.java 1902007 2022-06-17 09:51:56Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.pipeline;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageManager;
import org.apache.xmlgraphics.image.loader.impl.CompositeImageLoader;
import org.apache.xmlgraphics.image.loader.spi.ImageConverter;
import org.apache.xmlgraphics.image.loader.spi.ImageImplRegistry;
import org.apache.xmlgraphics.image.loader.spi.ImageLoader;
import org.apache.xmlgraphics.image.loader.spi.ImageLoaderFactory;
import org.apache.xmlgraphics.image.loader.util.Penalty;
import org.apache.xmlgraphics.util.dijkstra.DefaultEdgeDirectory;
import org.apache.xmlgraphics.util.dijkstra.DijkstraAlgorithm;
import org.apache.xmlgraphics.util.dijkstra.Vertex;

/**
 * Factory class for image processing pipelines.
 */
public class PipelineFactory {public static class __CLR4_5_29gn9gnm68iyhig{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,12398,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** logger */
    protected static final Log log = LogFactory.getLog(PipelineFactory.class);

    private ImageManager manager;

    private int converterEdgeDirectoryVersion = -1;

    /** Holds the EdgeDirectory for all image conversions */
    private DefaultEdgeDirectory converterEdgeDirectory;

    /**
     * Main constructor.
     * @param manager the ImageManager instance
     */
    public PipelineFactory(ImageManager manager) {try{__CLR4_5_29gn9gnm68iyhig.R.inc(12263);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12264);this.manager = manager;
    }finally{__CLR4_5_29gn9gnm68iyhig.R.flushNeeded();}}

    private DefaultEdgeDirectory getEdgeDirectory() {try{__CLR4_5_29gn9gnm68iyhig.R.inc(12265);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12266);ImageImplRegistry registry = manager.getRegistry();
        __CLR4_5_29gn9gnm68iyhig.R.inc(12267);if ((((registry.getImageConverterModifications() != converterEdgeDirectoryVersion)&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12268)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12269)==0&false))) {{
            __CLR4_5_29gn9gnm68iyhig.R.inc(12270);Collection converters = registry.getImageConverters();

            //Rebuild edge directory
            __CLR4_5_29gn9gnm68iyhig.R.inc(12271);DefaultEdgeDirectory dir = new DefaultEdgeDirectory();
            __CLR4_5_29gn9gnm68iyhig.R.inc(12272);for (Object converter1 : converters) {{
                __CLR4_5_29gn9gnm68iyhig.R.inc(12273);ImageConverter converter = (ImageConverter) converter1;
                __CLR4_5_29gn9gnm68iyhig.R.inc(12274);Penalty penalty = Penalty.toPenalty(converter.getConversionPenalty());
                __CLR4_5_29gn9gnm68iyhig.R.inc(12275);penalty = penalty.add(
                        registry.getAdditionalPenalty(converter.getClass().getName()));
                __CLR4_5_29gn9gnm68iyhig.R.inc(12276);dir.addEdge(new ImageConversionEdge(converter, penalty));
            }

            }__CLR4_5_29gn9gnm68iyhig.R.inc(12277);converterEdgeDirectoryVersion = registry.getImageConverterModifications();
            __CLR4_5_29gn9gnm68iyhig.R.inc(12278);this.converterEdgeDirectory = dir; //Replace (thread-safe)
        }
        }__CLR4_5_29gn9gnm68iyhig.R.inc(12279);return this.converterEdgeDirectory;
    }finally{__CLR4_5_29gn9gnm68iyhig.R.flushNeeded();}}

    /**
     * Creates and returns an {@link ImageProviderPipeline} that allows to load an image of the
     * given MIME type and present it in the requested image flavor.
     * @param originalImage the original image that serves as the origin point of the conversion
     * @param targetFlavor the requested image flavor
     * @return an {@link ImageProviderPipeline} or null if no suitable pipeline could be assembled
     */
    public ImageProviderPipeline newImageConverterPipeline(
                Image originalImage, ImageFlavor targetFlavor) {try{__CLR4_5_29gn9gnm68iyhig.R.inc(12280);
        //Get snapshot to avoid concurrent modification problems (thread-safety)
        __CLR4_5_29gn9gnm68iyhig.R.inc(12281);DefaultEdgeDirectory dir = getEdgeDirectory();
        __CLR4_5_29gn9gnm68iyhig.R.inc(12282);ImageRepresentation destination = new ImageRepresentation(targetFlavor);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12283);ImageProviderPipeline pipeline = findPipeline(dir, originalImage.getFlavor(), destination);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12284);return pipeline;
    }finally{__CLR4_5_29gn9gnm68iyhig.R.flushNeeded();}}

    /**
     * Creates and returns an {@link ImageProviderPipeline} that allows to load an image of the
     * given MIME type and present it in the requested image flavor.
     * @param imageInfo the image info object of the original image
     * @param targetFlavor the requested image flavor
     * @return an {@link ImageProviderPipeline} or null if no suitable pipeline could be assembled
     */
    public ImageProviderPipeline newImageConverterPipeline(
                ImageInfo imageInfo, ImageFlavor targetFlavor) {try{__CLR4_5_29gn9gnm68iyhig.R.inc(12285);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12286);ImageProviderPipeline[] candidates = determineCandidatePipelines(imageInfo, targetFlavor);

        //Choose best pipeline
        __CLR4_5_29gn9gnm68iyhig.R.inc(12287);if ((((candidates.length > 0)&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12288)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12289)==0&false))) {{
            __CLR4_5_29gn9gnm68iyhig.R.inc(12290);Arrays.sort(candidates, new PipelineComparator());
            __CLR4_5_29gn9gnm68iyhig.R.inc(12291);ImageProviderPipeline pipeline = candidates[0];
            __CLR4_5_29gn9gnm68iyhig.R.inc(12292);if ((((pipeline != null && log.isDebugEnabled())&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12293)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12294)==0&false))) {{
                __CLR4_5_29gn9gnm68iyhig.R.inc(12295);log.debug("Pipeline: " + pipeline
                        + " with penalty " + pipeline.getConversionPenalty());
            }
            }__CLR4_5_29gn9gnm68iyhig.R.inc(12296);return pipeline;
        } }else {{
            __CLR4_5_29gn9gnm68iyhig.R.inc(12297);return null;
        }
    }}finally{__CLR4_5_29gn9gnm68iyhig.R.flushNeeded();}}

    /**
     * Determines all possible pipelines for the given image that can produce the requested
     * target flavor.
     * @param imageInfo the image information
     * @param targetFlavor the target flavor
     * @return the candidate pipelines
     */
    public ImageProviderPipeline[] determineCandidatePipelines(
                ImageInfo imageInfo, ImageFlavor targetFlavor) {try{__CLR4_5_29gn9gnm68iyhig.R.inc(12298);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12299);String originalMime = imageInfo.getMimeType();
        __CLR4_5_29gn9gnm68iyhig.R.inc(12300);ImageImplRegistry registry = manager.getRegistry();
        __CLR4_5_29gn9gnm68iyhig.R.inc(12301);List candidates = new java.util.ArrayList();

        //Get snapshot to avoid concurrent modification problems (thread-safety)
        __CLR4_5_29gn9gnm68iyhig.R.inc(12302);DefaultEdgeDirectory dir = getEdgeDirectory();

        __CLR4_5_29gn9gnm68iyhig.R.inc(12303);ImageLoaderFactory[] loaderFactories = registry.getImageLoaderFactories(
                imageInfo, targetFlavor);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12304);if ((((loaderFactories != null)&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12305)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12306)==0&false))) {{
            //Directly load image and return it
            __CLR4_5_29gn9gnm68iyhig.R.inc(12307);ImageLoader loader;
            __CLR4_5_29gn9gnm68iyhig.R.inc(12308);if ((((loaderFactories.length == 1)&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12309)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12310)==0&false))) {{
                 __CLR4_5_29gn9gnm68iyhig.R.inc(12311);loader = loaderFactories[0].newImageLoader(targetFlavor);
            } }else {{
                __CLR4_5_29gn9gnm68iyhig.R.inc(12312);int count = loaderFactories.length;
                __CLR4_5_29gn9gnm68iyhig.R.inc(12313);ImageLoader[] loaders = new ImageLoader[count];
                __CLR4_5_29gn9gnm68iyhig.R.inc(12314);for (int i = 0; (((i < count)&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12315)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12316)==0&false)); i++) {{
                    __CLR4_5_29gn9gnm68iyhig.R.inc(12317);loaders[i] = loaderFactories[i].newImageLoader(targetFlavor);
                }
                }__CLR4_5_29gn9gnm68iyhig.R.inc(12318);loader = new CompositeImageLoader(loaders);
            }
            }__CLR4_5_29gn9gnm68iyhig.R.inc(12319);ImageProviderPipeline pipeline = new ImageProviderPipeline(manager.getCache(), loader);
            __CLR4_5_29gn9gnm68iyhig.R.inc(12320);candidates.add(pipeline);
        } }else {{
            //Need to use ImageConverters
            __CLR4_5_29gn9gnm68iyhig.R.inc(12321);if ((((log.isTraceEnabled())&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12322)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12323)==0&false))) {{
                __CLR4_5_29gn9gnm68iyhig.R.inc(12324);log.trace("No ImageLoaderFactory found that can load this format ("
                        + targetFlavor + ") directly. Trying ImageConverters instead...");
            }

            }__CLR4_5_29gn9gnm68iyhig.R.inc(12325);ImageRepresentation destination = new ImageRepresentation(targetFlavor);
            //Get Loader for originalMIME
            // --> List of resulting flavors, possibly multiple loaders
            __CLR4_5_29gn9gnm68iyhig.R.inc(12326);loaderFactories = registry.getImageLoaderFactories(originalMime);
            __CLR4_5_29gn9gnm68iyhig.R.inc(12327);if ((((loaderFactories != null)&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12328)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12329)==0&false))) {{

                //Find best pipeline -> best loader
                __CLR4_5_29gn9gnm68iyhig.R.inc(12330);for (ImageLoaderFactory loaderFactory : loaderFactories) {{
                    __CLR4_5_29gn9gnm68iyhig.R.inc(12331);ImageFlavor[] flavors = loaderFactory.getSupportedFlavors(originalMime);
                    __CLR4_5_29gn9gnm68iyhig.R.inc(12332);for (ImageFlavor flavor : flavors) {{
                        __CLR4_5_29gn9gnm68iyhig.R.inc(12333);ImageProviderPipeline pipeline = findPipeline(dir, flavor, destination);
                        __CLR4_5_29gn9gnm68iyhig.R.inc(12334);if ((((pipeline != null)&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12335)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12336)==0&false))) {{
                            __CLR4_5_29gn9gnm68iyhig.R.inc(12337);ImageLoader loader = loaderFactory.newImageLoader(flavor);
                            __CLR4_5_29gn9gnm68iyhig.R.inc(12338);pipeline.setImageLoader(loader);
                            __CLR4_5_29gn9gnm68iyhig.R.inc(12339);candidates.add(pipeline);
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_29gn9gnm68iyhig.R.inc(12340);return (ImageProviderPipeline[])candidates.toArray(
                new ImageProviderPipeline[candidates.size()]);
    }finally{__CLR4_5_29gn9gnm68iyhig.R.flushNeeded();}}

    /** Compares two pipelines based on their conversion penalty. */
    private static class PipelineComparator implements Comparator, Serializable {

        private static final long serialVersionUID = 1161513617996198090L;

        public int compare(Object o1, Object o2) {try{__CLR4_5_29gn9gnm68iyhig.R.inc(12341);
            __CLR4_5_29gn9gnm68iyhig.R.inc(12342);ImageProviderPipeline p1 = (ImageProviderPipeline)o1;
            __CLR4_5_29gn9gnm68iyhig.R.inc(12343);ImageProviderPipeline p2 = (ImageProviderPipeline)o2;
            //Lowest penalty first
            __CLR4_5_29gn9gnm68iyhig.R.inc(12344);return p1.getConversionPenalty() - p2.getConversionPenalty();
        }finally{__CLR4_5_29gn9gnm68iyhig.R.flushNeeded();}}

    }

    private ImageProviderPipeline findPipeline(DefaultEdgeDirectory dir,
            ImageFlavor originFlavor, ImageRepresentation destination) {try{__CLR4_5_29gn9gnm68iyhig.R.inc(12345);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12346);DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(
                dir);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12347);ImageRepresentation origin = new ImageRepresentation(originFlavor);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12348);dijkstra.execute(origin, destination);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12349);if ((((log.isTraceEnabled())&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12350)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12351)==0&false))) {{
            __CLR4_5_29gn9gnm68iyhig.R.inc(12352);log.trace("Lowest penalty: " + dijkstra.getLowestPenalty(destination));
        }

        }__CLR4_5_29gn9gnm68iyhig.R.inc(12353);Vertex prev = destination;
        __CLR4_5_29gn9gnm68iyhig.R.inc(12354);Vertex pred = dijkstra.getPredecessor(destination);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12355);if ((((pred == null)&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12356)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12357)==0&false))) {{
            __CLR4_5_29gn9gnm68iyhig.R.inc(12358);if ((((log.isTraceEnabled())&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12359)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12360)==0&false))) {{
                __CLR4_5_29gn9gnm68iyhig.R.inc(12361);log.trace("No route found!");
            }
            }__CLR4_5_29gn9gnm68iyhig.R.inc(12362);return null;
        } }else {{
            __CLR4_5_29gn9gnm68iyhig.R.inc(12363);LinkedList stops = new LinkedList();
            __CLR4_5_29gn9gnm68iyhig.R.inc(12364);while ((pred = dijkstra.getPredecessor(prev)) != null) {{
                __CLR4_5_29gn9gnm68iyhig.R.inc(12367);ImageConversionEdge edge = (ImageConversionEdge)
                        dir.getBestEdge(pred, prev);
                __CLR4_5_29gn9gnm68iyhig.R.inc(12368);stops.addFirst(edge);
                __CLR4_5_29gn9gnm68iyhig.R.inc(12369);prev = pred;
            }
            }__CLR4_5_29gn9gnm68iyhig.R.inc(12370);ImageProviderPipeline pipeline = new ImageProviderPipeline(manager.getCache(), null);
            __CLR4_5_29gn9gnm68iyhig.R.inc(12371);for (Object stop : stops) {{
                __CLR4_5_29gn9gnm68iyhig.R.inc(12372);ImageConversionEdge edge = (ImageConversionEdge) stop;
                __CLR4_5_29gn9gnm68iyhig.R.inc(12373);pipeline.addConverter(edge.getImageConverter());
            }
            }__CLR4_5_29gn9gnm68iyhig.R.inc(12374);return pipeline;
        }
    }}finally{__CLR4_5_29gn9gnm68iyhig.R.flushNeeded();}}

    /**
     * Finds and returns an array of {@link ImageProviderPipeline} instances which can handle
     * the given MIME type and return one of the given {@link ImageFlavor}s.
     * @param imageInfo the image info object
     * @param flavors the possible target flavors
     * @return an array of pipelines
     */
    public ImageProviderPipeline[] determineCandidatePipelines(ImageInfo imageInfo,
            ImageFlavor[] flavors) {try{__CLR4_5_29gn9gnm68iyhig.R.inc(12375);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12376);List candidates = new java.util.ArrayList();
        __CLR4_5_29gn9gnm68iyhig.R.inc(12377);for (ImageFlavor flavor : flavors) {{
            //Find the best pipeline for each flavor
            __CLR4_5_29gn9gnm68iyhig.R.inc(12378);ImageProviderPipeline pipeline = newImageConverterPipeline(imageInfo, flavor);
            __CLR4_5_29gn9gnm68iyhig.R.inc(12379);if ((((pipeline == null)&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12380)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12381)==0&false))) {{
                __CLR4_5_29gn9gnm68iyhig.R.inc(12382);continue; //No suitable pipeline found for flavor
            }
            }__CLR4_5_29gn9gnm68iyhig.R.inc(12383);Penalty p = pipeline.getConversionPenalty(this.manager.getRegistry());
            __CLR4_5_29gn9gnm68iyhig.R.inc(12384);if ((((!p.isInfinitePenalty())&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12385)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12386)==0&false))) {{
                __CLR4_5_29gn9gnm68iyhig.R.inc(12387);candidates.add(pipeline);
            }
        }}
        }__CLR4_5_29gn9gnm68iyhig.R.inc(12388);return (ImageProviderPipeline[])candidates.toArray(
                new ImageProviderPipeline[candidates.size()]);
    }finally{__CLR4_5_29gn9gnm68iyhig.R.flushNeeded();}}

    /**
     * Finds and returns an array of {@link ImageProviderPipeline} instances which can handle
     * the convert the given {@link Image} and return one of the given {@link ImageFlavor}s.
     * @param sourceImage the image to be converted
     * @param flavors the possible target flavors
     * @return an array of pipelines
     */
    public ImageProviderPipeline[] determineCandidatePipelines(Image sourceImage,
            ImageFlavor[] flavors) {try{__CLR4_5_29gn9gnm68iyhig.R.inc(12389);
        __CLR4_5_29gn9gnm68iyhig.R.inc(12390);List candidates = new java.util.ArrayList();
        __CLR4_5_29gn9gnm68iyhig.R.inc(12391);for (ImageFlavor flavor : flavors) {{
            //Find the best pipeline for each flavor
            __CLR4_5_29gn9gnm68iyhig.R.inc(12392);ImageProviderPipeline pipeline = newImageConverterPipeline(sourceImage, flavor);
            __CLR4_5_29gn9gnm68iyhig.R.inc(12393);if ((((pipeline != null)&&(__CLR4_5_29gn9gnm68iyhig.R.iget(12394)!=0|true))||(__CLR4_5_29gn9gnm68iyhig.R.iget(12395)==0&false))) {{
                __CLR4_5_29gn9gnm68iyhig.R.inc(12396);candidates.add(pipeline);
            }
        }}
        }__CLR4_5_29gn9gnm68iyhig.R.inc(12397);return (ImageProviderPipeline[])candidates.toArray(
                new ImageProviderPipeline[candidates.size()]);
    }finally{__CLR4_5_29gn9gnm68iyhig.R.flushNeeded();}}


}
