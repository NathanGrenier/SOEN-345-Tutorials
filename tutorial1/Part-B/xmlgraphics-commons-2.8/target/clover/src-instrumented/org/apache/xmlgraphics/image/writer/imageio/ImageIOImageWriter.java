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

/* $Id: ImageIOImageWriter.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.writer.imageio;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.event.IIOWriteWarningListener;
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.stream.ImageOutputStream;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.apache.xmlgraphics.image.writer.ImageWriter;
import org.apache.xmlgraphics.image.writer.ImageWriterParams;
import org.apache.xmlgraphics.image.writer.MultiImageWriter;
import org.apache.xmlgraphics.image.writer.ResolutionUnit;
import org.apache.xmlgraphics.util.UnitConv;

/**
 * ImageWriter implementation that uses Image I/O to write images.
 *
 * @version $Id: ImageIOImageWriter.java 1732018 2016-02-24 04:51:06Z gadams $
 */
public class ImageIOImageWriter implements ImageWriter, IIOWriteWarningListener {public static class __CLR4_5_2aq9aq9m68iyho1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,14072,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String DIMENSION = "Dimension";
    private static final String VERTICAL_PIXEL_SIZE = "VerticalPixelSize";
    private static final String HORIZONTAL_PIXEL_SIZE = "HorizontalPixelSize";

    private static final String STANDARD_METADATA_FORMAT = "javax_imageio_1.0";

    private String targetMIME;

    /**
     * Main constructor.
     * @param mime the MIME type of the image format
     */
    public ImageIOImageWriter(String mime) {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(13905);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13906);this.targetMIME = mime;
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void writeImage(RenderedImage image, OutputStream out) throws IOException {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(13907);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13908);writeImage(image, out, null);
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void writeImage(RenderedImage image, OutputStream out,
            ImageWriterParams params)
                throws IOException {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(13909);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13910);javax.imageio.ImageWriter iiowriter = getIIOImageWriter();
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13911);iiowriter.addIIOWriteWarningListener(this);

        __CLR4_5_2aq9aq9m68iyho1.R.inc(13912);ImageOutputStream imgout = ImageIO.createImageOutputStream(out);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13913);try {

            __CLR4_5_2aq9aq9m68iyho1.R.inc(13914);ImageWriteParam iwParam = getDefaultWriteParam(iiowriter, image, params);

            __CLR4_5_2aq9aq9m68iyho1.R.inc(13915);IIOMetadata streamMetadata = createStreamMetadata(iiowriter, iwParam, params);

            __CLR4_5_2aq9aq9m68iyho1.R.inc(13916);ImageTypeSpecifier type;
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13917);if ((((iwParam.getDestinationType() != null)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(13918)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(13919)==0&false))) {{
                __CLR4_5_2aq9aq9m68iyho1.R.inc(13920);type = iwParam.getDestinationType();
            } }else {{
                __CLR4_5_2aq9aq9m68iyho1.R.inc(13921);type = ImageTypeSpecifier.createFromRenderedImage(image);
            }

            //Handle metadata
            }__CLR4_5_2aq9aq9m68iyho1.R.inc(13922);IIOMetadata meta = iiowriter.getDefaultImageMetadata(
                    type, iwParam);
            //meta might be null for some JAI codecs as they don't support metadata
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13923);if ((((params != null && meta != null)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(13924)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(13925)==0&false))) {{
                __CLR4_5_2aq9aq9m68iyho1.R.inc(13926);meta = updateMetadata(image, meta, params);
            }

            //Write image
            }__CLR4_5_2aq9aq9m68iyho1.R.inc(13927);iiowriter.setOutput(imgout);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13928);IIOImage iioimg = new IIOImage(image, null, meta);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13929);iiowriter.write(streamMetadata, iioimg, iwParam);

        } finally {
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13930);imgout.close();
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13931);iiowriter.dispose();
        }
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    /**
     * Creates the stream metadata for image. By default, this method returns null which
     * causes the default stream metadata to be used. Subclasses can override this to
     * supply special stream metadata (see TIFF for an example).
     * @param writer the image write
     * @param writeParam the ImageIO write parameters
     * @param params the ImageWriter write parameters
     * @return the stream metadata (or null if no special metadata needs to be produced)
     */
    protected IIOMetadata createStreamMetadata(javax.imageio.ImageWriter writer,
            ImageWriteParam writeParam, ImageWriterParams params) {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(13932);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13933);return null; //leave the default
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    private javax.imageio.ImageWriter getIIOImageWriter() {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(13934);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13935);Iterator<javax.imageio.ImageWriter> iter = ImageIO.getImageWritersByMIMEType(getMIMEType());
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13936);javax.imageio.ImageWriter iiowriter = null;
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13937);if ((((iter.hasNext())&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(13938)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(13939)==0&false))) {{
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13940);iiowriter = iter.next();
        }
        }__CLR4_5_2aq9aq9m68iyho1.R.inc(13941);if ((((iiowriter == null)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(13942)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(13943)==0&false))) {{
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13944);throw new UnsupportedOperationException("No ImageIO codec for writing "
                    + getMIMEType() + " is available!");
        }
        }__CLR4_5_2aq9aq9m68iyho1.R.inc(13945);return iiowriter;
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    /**
     * Returns the default write parameters for encoding the image.
     * @param iiowriter The IIO ImageWriter that will be used
     * @param image the image to be encoded
     * @param params the parameters for this writer instance
     * @return the IIO ImageWriteParam instance
     */
    protected ImageWriteParam getDefaultWriteParam(
            javax.imageio.ImageWriter iiowriter, RenderedImage image,
            ImageWriterParams params) {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(13946);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13947);ImageWriteParam param = iiowriter.getDefaultWriteParam();
        //System.err.println("Param: " + params);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13948);if (((((params != null) && (params.getCompressionMethod() != null))&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(13949)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(13950)==0&false))) {{
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13951);param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13952);param.setCompressionType(params.getCompressionMethod());
        }
        }__CLR4_5_2aq9aq9m68iyho1.R.inc(13953);return param;
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    /**
     * Updates the metadata information based on the parameters to this writer.
     * @param image the current image being rendered
     * @param meta the metadata
     * @param params the parameters
     * @return the updated metadata
     */
    protected IIOMetadata updateMetadata(RenderedImage image, IIOMetadata meta,
                ImageWriterParams params) {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(13954);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13955);if ((((meta.isStandardMetadataFormatSupported() && params.getResolution() != null)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(13956)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(13957)==0&false))) {{

            //NOTE: There are several bugs in ImageIO codecs concerning resolution handling
            //http://www.tracemodeler.com/articles/aging-bugs-and-setting-dpi-with-java-image-io/

            __CLR4_5_2aq9aq9m68iyho1.R.inc(13958);float multiplier = ((((ResolutionUnit.CENTIMETER == params.getResolutionUnit()) )&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(13959)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(13960)==0&false))? 10f : UnitConv.IN2MM;
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13961);double pixelWidthInMillimeters = multiplier / params.getXResolution().doubleValue();
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13962);double pixelHeightInMillimeters = multiplier / params.getYResolution().doubleValue();

            //Try with the right value as per the ImageIO spec
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13963);updatePixelSize(meta, pixelWidthInMillimeters, pixelHeightInMillimeters);

            //Check the merge result
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13964);double checkMerged = getHorizontalPixelSize(meta);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13965);if ((((!equals(checkMerged, pixelWidthInMillimeters, 0.00001))&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(13966)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(13967)==0&false))) {{
                //Merging bug in Sun/Oracle JRE encountered
                //Try compensation strategy for PNG bug:
                //http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=5106305
                __CLR4_5_2aq9aq9m68iyho1.R.inc(13968);double horzValue = 1 / pixelWidthInMillimeters;
                __CLR4_5_2aq9aq9m68iyho1.R.inc(13969);double vertValue = 1 / pixelHeightInMillimeters;
                __CLR4_5_2aq9aq9m68iyho1.R.inc(13970);updatePixelSize(meta, horzValue, vertValue);
            }
        }}
        }__CLR4_5_2aq9aq9m68iyho1.R.inc(13971);return meta;
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    private static boolean equals(double d1, double d2, double maxDelta) {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(13972);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13973);return Math.abs(d1 - d2) <= maxDelta;
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    private double getHorizontalPixelSize(IIOMetadata meta) {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(13974);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13975);double result = 0;
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13976);IIOMetadataNode root = (IIOMetadataNode)meta.getAsTree(STANDARD_METADATA_FORMAT);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13977);IIOMetadataNode dim = getChildNode(root, DIMENSION);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13978);if ((((dim != null)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(13979)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(13980)==0&false))) {{
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13981);IIOMetadataNode horz = getChildNode(dim, HORIZONTAL_PIXEL_SIZE);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13982);if ((((horz != null)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(13983)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(13984)==0&false))) {{
                __CLR4_5_2aq9aq9m68iyho1.R.inc(13985);result = Double.parseDouble(horz.getAttribute("value"));
            }
        }}
        }__CLR4_5_2aq9aq9m68iyho1.R.inc(13986);return result;
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    private void updatePixelSize(IIOMetadata meta, double horzValue, double vertValue) {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(13987);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13988);IIOMetadataNode root = (IIOMetadataNode)meta.getAsTree(STANDARD_METADATA_FORMAT);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13989);IIOMetadataNode dim = getChildNode(root, DIMENSION);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13990);IIOMetadataNode child;

        __CLR4_5_2aq9aq9m68iyho1.R.inc(13991);child = getChildNode(dim, HORIZONTAL_PIXEL_SIZE);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13992);if ((((child == null)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(13993)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(13994)==0&false))) {{
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13995);child = new IIOMetadataNode(HORIZONTAL_PIXEL_SIZE);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(13996);dim.appendChild(child);
        }
        }__CLR4_5_2aq9aq9m68iyho1.R.inc(13997);child.setAttribute("value", Double.toString(horzValue));

        __CLR4_5_2aq9aq9m68iyho1.R.inc(13998);child = getChildNode(dim, VERTICAL_PIXEL_SIZE);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(13999);if ((((child == null)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(14000)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(14001)==0&false))) {{
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14002);child = new IIOMetadataNode(VERTICAL_PIXEL_SIZE);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14003);dim.appendChild(child);
        }
        }__CLR4_5_2aq9aq9m68iyho1.R.inc(14004);child.setAttribute("value", Double.toString(vertValue));
        __CLR4_5_2aq9aq9m68iyho1.R.inc(14005);try {
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14006);meta.mergeTree(STANDARD_METADATA_FORMAT, root);
        } catch (IIOInvalidTreeException e) {
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14007);throw new RuntimeException("Cannot update image metadata: "
                        + e.getMessage());
        }
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    /**
     * Returns a specific metadata child node
     * @param n the base node
     * @param name the name of the child
     * @return the requested child node
     */
    protected static IIOMetadataNode getChildNode(Node n, String name) {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(14008);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(14009);NodeList nodes = n.getChildNodes();
        __CLR4_5_2aq9aq9m68iyho1.R.inc(14010);for (int i = 0; (((i < nodes.getLength())&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(14011)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(14012)==0&false)); i++) {{
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14013);Node child = nodes.item(i);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14014);if ((((name.equals(child.getNodeName()))&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(14015)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(14016)==0&false))) {{
                __CLR4_5_2aq9aq9m68iyho1.R.inc(14017);return (IIOMetadataNode)child;
            }
        }}
        }__CLR4_5_2aq9aq9m68iyho1.R.inc(14018);return null;
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getMIMEType() {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(14019);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(14020);return this.targetMIME;
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isFunctional() {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(14021);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(14022);Iterator<javax.imageio.ImageWriter> iter = ImageIO.getImageWritersByMIMEType(getMIMEType());
        //Only return true if an IIO ImageWriter is available in the current environment
        __CLR4_5_2aq9aq9m68iyho1.R.inc(14023);return (iter.hasNext());
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void warningOccurred(javax.imageio.ImageWriter source,
            int imageIndex, String warning) {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(14024);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(14025);System.err.println("Problem while writing image using ImageI/O: "
                + warning);
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    /** {@inheritDoc} */
    public MultiImageWriter createMultiImageWriter(OutputStream out) throws IOException {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(14026);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(14027);return new IIOMultiImageWriter(out);
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean supportsMultiImageWriter() {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(14028);
        __CLR4_5_2aq9aq9m68iyho1.R.inc(14029);javax.imageio.ImageWriter iiowriter = getIIOImageWriter();
        __CLR4_5_2aq9aq9m68iyho1.R.inc(14030);try {
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14031);return iiowriter.canWriteSequence();
        } finally {
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14032);iiowriter.dispose();
        }
    }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    private class IIOMultiImageWriter implements MultiImageWriter {

        private javax.imageio.ImageWriter iiowriter;
        private ImageOutputStream imageStream;
        private boolean prepared;

        public IIOMultiImageWriter(OutputStream out) throws IOException {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(14033);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14034);this.iiowriter = getIIOImageWriter();
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14035);if ((((!iiowriter.canWriteSequence())&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(14036)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(14037)==0&false))) {{
                __CLR4_5_2aq9aq9m68iyho1.R.inc(14038);throw new UnsupportedOperationException("This ImageWriter does not support writing"
                        + " multiple images to a single image file.");
            }
            }__CLR4_5_2aq9aq9m68iyho1.R.inc(14039);iiowriter.addIIOWriteWarningListener(ImageIOImageWriter.this);

            __CLR4_5_2aq9aq9m68iyho1.R.inc(14040);imageStream = ImageIO.createImageOutputStream(out);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14041);iiowriter.setOutput(imageStream);

        }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

        public void writeImage(RenderedImage image, ImageWriterParams params) throws IOException {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(14042);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14043);if ((((iiowriter == null)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(14044)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(14045)==0&false))) {{
                __CLR4_5_2aq9aq9m68iyho1.R.inc(14046);throw new IllegalStateException("MultiImageWriter already closed!");
            }
            }__CLR4_5_2aq9aq9m68iyho1.R.inc(14047);ImageWriteParam iwParam = getDefaultWriteParam(iiowriter, image, params);

            __CLR4_5_2aq9aq9m68iyho1.R.inc(14048);if ((((!prepared)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(14049)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(14050)==0&false))) {{
                //Only prepare once
                __CLR4_5_2aq9aq9m68iyho1.R.inc(14051);IIOMetadata streamMetadata = createStreamMetadata(iiowriter, iwParam, params);
                __CLR4_5_2aq9aq9m68iyho1.R.inc(14052);iiowriter.prepareWriteSequence(streamMetadata);
                __CLR4_5_2aq9aq9m68iyho1.R.inc(14053);prepared = true;
            }

            }__CLR4_5_2aq9aq9m68iyho1.R.inc(14054);ImageTypeSpecifier type;
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14055);if ((((iwParam.getDestinationType() != null)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(14056)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(14057)==0&false))) {{
                __CLR4_5_2aq9aq9m68iyho1.R.inc(14058);type = iwParam.getDestinationType();
            } }else {{
                __CLR4_5_2aq9aq9m68iyho1.R.inc(14059);type = ImageTypeSpecifier.createFromRenderedImage(image);
            }

            //Handle metadata
            }__CLR4_5_2aq9aq9m68iyho1.R.inc(14060);IIOMetadata meta = iiowriter.getDefaultImageMetadata(
                    type, iwParam);
            //meta might be null for some JAI codecs as they don't support metadata
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14061);if ((((params != null && meta != null)&&(__CLR4_5_2aq9aq9m68iyho1.R.iget(14062)!=0|true))||(__CLR4_5_2aq9aq9m68iyho1.R.iget(14063)==0&false))) {{
                __CLR4_5_2aq9aq9m68iyho1.R.inc(14064);meta = updateMetadata(image, meta, params);
            }

            //Write image
            }__CLR4_5_2aq9aq9m68iyho1.R.inc(14065);IIOImage iioimg = new IIOImage(image, null, meta);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14066);iiowriter.writeToSequence(iioimg, iwParam);
        }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

        public void close() throws IOException {try{__CLR4_5_2aq9aq9m68iyho1.R.inc(14067);
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14068);imageStream.close();
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14069);imageStream = null;
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14070);iiowriter.dispose();
            __CLR4_5_2aq9aq9m68iyho1.R.inc(14071);iiowriter = null;
        }finally{__CLR4_5_2aq9aq9m68iyho1.R.flushNeeded();}}

    }

}
