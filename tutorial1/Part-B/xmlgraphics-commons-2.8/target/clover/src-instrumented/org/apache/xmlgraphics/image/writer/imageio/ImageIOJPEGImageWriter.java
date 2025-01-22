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

/* $Id: ImageIOJPEGImageWriter.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.writer.imageio;

import java.awt.image.RenderedImage;

import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;

import org.apache.xmlgraphics.image.writer.ImageWriterParams;


/**
 * ImageWriter that encodes JPEG images using Image I/O.
 *
 * @version $Id: ImageIOJPEGImageWriter.java 1732018 2016-02-24 04:51:06Z gadams $
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ImageIOJPEGImageWriter extends ImageIOImageWriter {public static class __CLR4_5_2auwauwm68iyhod{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,14140,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String JPEG_NATIVE_FORMAT = "javax_imageio_jpeg_image_1.0";

    /**
     * Main constructor.
     */
    public ImageIOJPEGImageWriter() {
        super("image/jpeg");__CLR4_5_2auwauwm68iyhod.R.inc(14073);try{__CLR4_5_2auwauwm68iyhod.R.inc(14072);
    }finally{__CLR4_5_2auwauwm68iyhod.R.flushNeeded();}}

    @Override
    protected IIOMetadata updateMetadata(RenderedImage image, IIOMetadata meta,
            ImageWriterParams params) {try{__CLR4_5_2auwauwm68iyhod.R.inc(14074);
        __CLR4_5_2auwauwm68iyhod.R.inc(14075);if ((((JPEG_NATIVE_FORMAT.equals(meta.getNativeMetadataFormatName()))&&(__CLR4_5_2auwauwm68iyhod.R.iget(14076)!=0|true))||(__CLR4_5_2auwauwm68iyhod.R.iget(14077)==0&false))) {{
            __CLR4_5_2auwauwm68iyhod.R.inc(14078);meta = addAdobeTransform(meta);
            __CLR4_5_2auwauwm68iyhod.R.inc(14079);IIOMetadataNode root = (IIOMetadataNode)meta.getAsTree(JPEG_NATIVE_FORMAT);
            __CLR4_5_2auwauwm68iyhod.R.inc(14080);IIOMetadataNode jv = getChildNode(root, "JPEGvariety");
            __CLR4_5_2auwauwm68iyhod.R.inc(14081);if ((((jv == null)&&(__CLR4_5_2auwauwm68iyhod.R.iget(14082)!=0|true))||(__CLR4_5_2auwauwm68iyhod.R.iget(14083)==0&false))) {{
                __CLR4_5_2auwauwm68iyhod.R.inc(14084);jv = new IIOMetadataNode("JPEGvariety");
                __CLR4_5_2auwauwm68iyhod.R.inc(14085);root.appendChild(jv);
            }
            }__CLR4_5_2auwauwm68iyhod.R.inc(14086);IIOMetadataNode child;
            __CLR4_5_2auwauwm68iyhod.R.inc(14087);if ((((params.getResolution() != null)&&(__CLR4_5_2auwauwm68iyhod.R.iget(14088)!=0|true))||(__CLR4_5_2auwauwm68iyhod.R.iget(14089)==0&false))) {{
                __CLR4_5_2auwauwm68iyhod.R.inc(14090);child = getChildNode(jv, "app0JFIF");
                __CLR4_5_2auwauwm68iyhod.R.inc(14091);if ((((child == null)&&(__CLR4_5_2auwauwm68iyhod.R.iget(14092)!=0|true))||(__CLR4_5_2auwauwm68iyhod.R.iget(14093)==0&false))) {{
                    __CLR4_5_2auwauwm68iyhod.R.inc(14094);child = new IIOMetadataNode("app0JFIF");
                    __CLR4_5_2auwauwm68iyhod.R.inc(14095);jv.appendChild(child);
                }
                //JPEG gets special treatment because there seems to be a bug in
                //the JPEG codec in ImageIO converting the pixel size incorrectly
                //(or not at all) when using standard metadata format.
                }__CLR4_5_2auwauwm68iyhod.R.inc(14096);child.setAttribute("majorVersion", null);
                __CLR4_5_2auwauwm68iyhod.R.inc(14097);child.setAttribute("minorVersion", null);
                boolean __CLB4_5_2_bool0=false;__CLR4_5_2auwauwm68iyhod.R.inc(14098);switch (params.getResolutionUnit()) {
                case INCH:if (!__CLB4_5_2_bool0) {__CLR4_5_2auwauwm68iyhod.R.inc(14099);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2auwauwm68iyhod.R.inc(14100);child.setAttribute("resUnits", "1"); //dots per inch
                    __CLR4_5_2auwauwm68iyhod.R.inc(14101);break;
                case CENTIMETER:if (!__CLB4_5_2_bool0) {__CLR4_5_2auwauwm68iyhod.R.inc(14102);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2auwauwm68iyhod.R.inc(14103);child.setAttribute("resUnits", "2"); //dots per cm
                    __CLR4_5_2auwauwm68iyhod.R.inc(14104);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2auwauwm68iyhod.R.inc(14105);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2auwauwm68iyhod.R.inc(14106);child.setAttribute("resUnits", "0"); //no unit
                }
                __CLR4_5_2auwauwm68iyhod.R.inc(14107);child.setAttribute("Xdensity", params.getXResolution().toString());
                __CLR4_5_2auwauwm68iyhod.R.inc(14108);child.setAttribute("Ydensity", params.getYResolution().toString());
                __CLR4_5_2auwauwm68iyhod.R.inc(14109);child.setAttribute("thumbWidth", null);
                __CLR4_5_2auwauwm68iyhod.R.inc(14110);child.setAttribute("thumbHeight", null);
            }
            }__CLR4_5_2auwauwm68iyhod.R.inc(14111);try {
                __CLR4_5_2auwauwm68iyhod.R.inc(14112);meta.setFromTree(JPEG_NATIVE_FORMAT, root);
                //meta.mergeTree(JPEG_NATIVE_FORMAT, root);
            } catch (IIOInvalidTreeException e) {
                __CLR4_5_2auwauwm68iyhod.R.inc(14113);throw new RuntimeException("Cannot update image metadata: "
                            + e.getMessage(), e);
            }
        }
        }__CLR4_5_2auwauwm68iyhod.R.inc(14114);return meta;
    }finally{__CLR4_5_2auwauwm68iyhod.R.flushNeeded();}}

    private static IIOMetadata addAdobeTransform(IIOMetadata meta) {try{__CLR4_5_2auwauwm68iyhod.R.inc(14115);
        // add the adobe transformation (transform 1 -> to YCbCr)
        __CLR4_5_2auwauwm68iyhod.R.inc(14116);IIOMetadataNode root = (IIOMetadataNode)meta.getAsTree(JPEG_NATIVE_FORMAT);

        __CLR4_5_2auwauwm68iyhod.R.inc(14117);IIOMetadataNode markerSequence = getChildNode(root, "markerSequence");
        __CLR4_5_2auwauwm68iyhod.R.inc(14118);if ((((markerSequence == null)&&(__CLR4_5_2auwauwm68iyhod.R.iget(14119)!=0|true))||(__CLR4_5_2auwauwm68iyhod.R.iget(14120)==0&false))) {{
            __CLR4_5_2auwauwm68iyhod.R.inc(14121);throw new RuntimeException("Invalid metadata!");
        }

        }__CLR4_5_2auwauwm68iyhod.R.inc(14122);IIOMetadataNode adobeTransform = getChildNode(markerSequence, "app14Adobe");
        __CLR4_5_2auwauwm68iyhod.R.inc(14123);if ((((adobeTransform == null)&&(__CLR4_5_2auwauwm68iyhod.R.iget(14124)!=0|true))||(__CLR4_5_2auwauwm68iyhod.R.iget(14125)==0&false))) {{
            __CLR4_5_2auwauwm68iyhod.R.inc(14126);adobeTransform = new IIOMetadataNode("app14Adobe");
            __CLR4_5_2auwauwm68iyhod.R.inc(14127);adobeTransform.setAttribute("transform" , "1"); // convert RGB to YCbCr
            __CLR4_5_2auwauwm68iyhod.R.inc(14128);adobeTransform.setAttribute("version", "101");
            __CLR4_5_2auwauwm68iyhod.R.inc(14129);adobeTransform.setAttribute("flags0", "0");
            __CLR4_5_2auwauwm68iyhod.R.inc(14130);adobeTransform.setAttribute("flags1", "0");

            __CLR4_5_2auwauwm68iyhod.R.inc(14131);markerSequence.appendChild(adobeTransform);
        } }else {{
            __CLR4_5_2auwauwm68iyhod.R.inc(14132);adobeTransform.setAttribute("transform" , "1");
        }

        }__CLR4_5_2auwauwm68iyhod.R.inc(14133);try {
            __CLR4_5_2auwauwm68iyhod.R.inc(14134);meta.setFromTree(JPEG_NATIVE_FORMAT, root);
        } catch (IIOInvalidTreeException e) {
            __CLR4_5_2auwauwm68iyhod.R.inc(14135);throw new RuntimeException("Cannot update image metadata: "
                        + e.getMessage(), e);
        }
        __CLR4_5_2auwauwm68iyhod.R.inc(14136);return meta;
    }finally{__CLR4_5_2auwauwm68iyhod.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected ImageWriteParam getDefaultWriteParam(
            ImageWriter iiowriter, RenderedImage image,
            ImageWriterParams params) {try{__CLR4_5_2auwauwm68iyhod.R.inc(14137);
        __CLR4_5_2auwauwm68iyhod.R.inc(14138);JPEGImageWriteParam param = new JPEGImageWriteParam(iiowriter.getLocale());
        //ImageTypeSpecifier type = ImageTypeSpecifier.createFromRenderedImage(image);
        /*
        ImageTypeSpecifier type = new ImageTypeSpecifier(
                image.getColorModel(), image.getSampleModel());
                */
        /* didn't work as expected...
        ImageTypeSpecifier type = ImageTypeSpecifier.createFromBufferedImageType(
                BufferedImage.TYPE_INT_RGB);
        param.setDestinationType(type);
        param.setSourceBands(new int[] {0, 1, 2});
        */
        __CLR4_5_2auwauwm68iyhod.R.inc(14139);return param;
    }finally{__CLR4_5_2auwauwm68iyhod.R.flushNeeded();}}


}
