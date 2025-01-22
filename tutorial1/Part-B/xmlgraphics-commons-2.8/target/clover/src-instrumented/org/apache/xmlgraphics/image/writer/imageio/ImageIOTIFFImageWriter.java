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

/* $Id: ImageIOTIFFImageWriter.java 1833700 2018-06-18 10:08:45Z ssteiner $ */

package org.apache.xmlgraphics.image.writer.imageio;

import java.awt.image.RenderedImage;
import java.util.Arrays;
import java.util.Set;

import javax.imageio.ImageWriteParam;
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;

import org.w3c.dom.Node;

import org.apache.xmlgraphics.image.codec.tiff.TIFFImageDecoder;
import org.apache.xmlgraphics.image.writer.Endianness;
import org.apache.xmlgraphics.image.writer.ImageWriterParams;
import org.apache.xmlgraphics.image.writer.ResolutionUnit;

// CSOFF: MultipleVariableDeclarations

/**
 * ImageWriter that encodes TIFF images using Image I/O.
 *
 * @version $Id: ImageIOTIFFImageWriter.java 1833700 2018-06-18 10:08:45Z ssteiner $
 */
public class ImageIOTIFFImageWriter extends ImageIOImageWriter {public static class __CLR4_5_2awuawum68iyhp1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,14238,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String SUN_TIFF_NATIVE_FORMAT
            = "com_sun_media_imageio_plugins_tiff_image_1.0";
    private static final String JAVA_TIFF_NATIVE_FORMAT
            = "javax_imageio_tiff_image_1.0";
    private static final String SUN_TIFF_NATIVE_STREAM_FORMAT
            = "com_sun_media_imageio_plugins_tiff_stream_1.0";
    private static final String JAVA_TIFF_NATIVE_STREAM_FORMAT
            = "javax_imageio_tiff_stream_1.0";

    /**
     * Main constructor.
     */
    public ImageIOTIFFImageWriter() {
        super("image/tiff");__CLR4_5_2awuawum68iyhp1.R.inc(14143);try{__CLR4_5_2awuawum68iyhp1.R.inc(14142);
    }finally{__CLR4_5_2awuawum68iyhp1.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected IIOMetadata updateMetadata(RenderedImage image, IIOMetadata meta,
            ImageWriterParams params) {try{__CLR4_5_2awuawum68iyhp1.R.inc(14144);
        __CLR4_5_2awuawum68iyhp1.R.inc(14145);meta = super.updateMetadata(image, meta, params);
        //We set the resolution manually using the native format since it appears that
        //it doesn't work properly through the standard metadata. Haven't figured out why
        //that happens.
        __CLR4_5_2awuawum68iyhp1.R.inc(14146);if ((((params.getResolution() != null)&&(__CLR4_5_2awuawum68iyhp1.R.iget(14147)!=0|true))||(__CLR4_5_2awuawum68iyhp1.R.iget(14148)==0&false))) {{
            __CLR4_5_2awuawum68iyhp1.R.inc(14149);if ((((SUN_TIFF_NATIVE_FORMAT.equals(meta.getNativeMetadataFormatName())
                    || JAVA_TIFF_NATIVE_FORMAT.equals(meta.getNativeMetadataFormatName()))&&(__CLR4_5_2awuawum68iyhp1.R.iget(14150)!=0|true))||(__CLR4_5_2awuawum68iyhp1.R.iget(14151)==0&false))) {{
                __CLR4_5_2awuawum68iyhp1.R.inc(14152);IIOMetadataNode root = new IIOMetadataNode(meta.getNativeMetadataFormatName());
                __CLR4_5_2awuawum68iyhp1.R.inc(14153);IIOMetadataNode ifd = getChildNode(root, "TIFFIFD");
                __CLR4_5_2awuawum68iyhp1.R.inc(14154);if ((((ifd == null)&&(__CLR4_5_2awuawum68iyhp1.R.iget(14155)!=0|true))||(__CLR4_5_2awuawum68iyhp1.R.iget(14156)==0&false))) {{
                    __CLR4_5_2awuawum68iyhp1.R.inc(14157);ifd = new IIOMetadataNode("TIFFIFD");
                    __CLR4_5_2awuawum68iyhp1.R.inc(14158);root.appendChild(ifd);
                }
                }__CLR4_5_2awuawum68iyhp1.R.inc(14159);ifd.appendChild(createResolutionUnitField(params));
                __CLR4_5_2awuawum68iyhp1.R.inc(14160);ifd.appendChild(createResolutionField(TIFFImageDecoder.TIFF_X_RESOLUTION,
                        "XResolution", params.getXResolution(), params.getResolutionUnit()));
                __CLR4_5_2awuawum68iyhp1.R.inc(14161);ifd.appendChild(createResolutionField(TIFFImageDecoder.TIFF_Y_RESOLUTION,
                        "YResolution", params.getYResolution(), params.getResolutionUnit()));
                __CLR4_5_2awuawum68iyhp1.R.inc(14162);int rows = (((params.isSingleStrip() )&&(__CLR4_5_2awuawum68iyhp1.R.iget(14163)!=0|true))||(__CLR4_5_2awuawum68iyhp1.R.iget(14164)==0&false))? image.getHeight() : params.getRowsPerStrip();
                __CLR4_5_2awuawum68iyhp1.R.inc(14165);ifd.appendChild(createShortMetadataNode(TIFFImageDecoder.TIFF_ROWS_PER_STRIP,
                        "RowsPerStrip", Integer.toString(rows)));

                __CLR4_5_2awuawum68iyhp1.R.inc(14166);try {
                    __CLR4_5_2awuawum68iyhp1.R.inc(14167);meta.mergeTree(meta.getNativeMetadataFormatName(), root);
                } catch (IIOInvalidTreeException e) {
                    __CLR4_5_2awuawum68iyhp1.R.inc(14168);throw new RuntimeException("Cannot update image metadata: "
                                + e.getMessage(), e);
                }
            }
        }}
        }__CLR4_5_2awuawum68iyhp1.R.inc(14169);return meta;
    }finally{__CLR4_5_2awuawum68iyhp1.R.flushNeeded();}}

    //number of pixels in 100 Meters
    private static final String DENOMINATOR_CENTIMETER = "/" + (100 * 100);
    private static final String DENOMINATOR_INCH = "/" + 1;

    private IIOMetadataNode createResolutionField(int number, String name,
            Integer resolution, ResolutionUnit unit) {try{__CLR4_5_2awuawum68iyhp1.R.inc(14170);

        __CLR4_5_2awuawum68iyhp1.R.inc(14171);String value;

        __CLR4_5_2awuawum68iyhp1.R.inc(14172);if ((((unit == ResolutionUnit.INCH)&&(__CLR4_5_2awuawum68iyhp1.R.iget(14173)!=0|true))||(__CLR4_5_2awuawum68iyhp1.R.iget(14174)==0&false))) {{

            __CLR4_5_2awuawum68iyhp1.R.inc(14175);value = resolution + DENOMINATOR_INCH;

        } }else {{

            __CLR4_5_2awuawum68iyhp1.R.inc(14176);float pixSzMM = 25.4f / resolution.floatValue();
            __CLR4_5_2awuawum68iyhp1.R.inc(14177);int numPix = (int)(((1000 * 100) / pixSzMM) + 0.5);
            __CLR4_5_2awuawum68iyhp1.R.inc(14178);value = numPix + DENOMINATOR_CENTIMETER;

        }

        }__CLR4_5_2awuawum68iyhp1.R.inc(14179);return createRationalMetadataNode(number, name, value);
    }finally{__CLR4_5_2awuawum68iyhp1.R.flushNeeded();}}

    /**
     * Generate a TIFFField for resolution unit based on the parameters.
     * @param params
     * @return the new metadata node
     */
    private IIOMetadataNode createResolutionUnitField(ImageWriterParams params) {try{__CLR4_5_2awuawum68iyhp1.R.inc(14180);
        __CLR4_5_2awuawum68iyhp1.R.inc(14181);return createShortMetadataNode(TIFFImageDecoder.TIFF_RESOLUTION_UNIT, "ResolutionUnit",
                Integer.toString(params.getResolutionUnit().getValue()),
                params.getResolutionUnit().getDescription());
    }finally{__CLR4_5_2awuawum68iyhp1.R.flushNeeded();}}

    /**
     * Utility to create a TIFFShort metadata child node of a TIFFShorts node for TIFF metadata.
     *
     * @param number value of the number attribute of the TIFField
     * @param name value of the name attribute of the TIFFField
     * @param value value of the value attribute of the TIFFShort
     * @return the new metadata node
     */
    public static final IIOMetadataNode createShortMetadataNode(int number,
            String name, String value) {try{__CLR4_5_2awuawum68iyhp1.R.inc(14182);

        __CLR4_5_2awuawum68iyhp1.R.inc(14183);return createShortMetadataNode(number, name, value, null);
    }finally{__CLR4_5_2awuawum68iyhp1.R.flushNeeded();}}

    /**
     * Utility to create a TIFFShort metadata child node of a TIFFShorts node for TIFF metadata.
     *
     * @param number value of the number attribute of the TIFField
     * @param name value of the name attribute of the TIFFField
     * @param value value of the value attribute of the TIFFShort
     * @param description value of the description attribute of the TIFFShort, ignored if null
     * @return the new metadata node
     */
    public static final IIOMetadataNode createShortMetadataNode(int number, String name,
            String value, String description) {try{__CLR4_5_2awuawum68iyhp1.R.inc(14184);

        __CLR4_5_2awuawum68iyhp1.R.inc(14185);IIOMetadataNode field = createMetadataField(number, name);
        __CLR4_5_2awuawum68iyhp1.R.inc(14186);IIOMetadataNode arrayNode;
        __CLR4_5_2awuawum68iyhp1.R.inc(14187);IIOMetadataNode valueNode;
        __CLR4_5_2awuawum68iyhp1.R.inc(14188);arrayNode = new IIOMetadataNode("TIFFShorts");
        __CLR4_5_2awuawum68iyhp1.R.inc(14189);field.appendChild(arrayNode);
        __CLR4_5_2awuawum68iyhp1.R.inc(14190);valueNode = new IIOMetadataNode("TIFFShort");
        __CLR4_5_2awuawum68iyhp1.R.inc(14191);valueNode.setAttribute("value", value);
        __CLR4_5_2awuawum68iyhp1.R.inc(14192);if ((((description != null)&&(__CLR4_5_2awuawum68iyhp1.R.iget(14193)!=0|true))||(__CLR4_5_2awuawum68iyhp1.R.iget(14194)==0&false))) {{
            __CLR4_5_2awuawum68iyhp1.R.inc(14195);valueNode.setAttribute("description", description);
        }
        }__CLR4_5_2awuawum68iyhp1.R.inc(14196);arrayNode.appendChild(valueNode);

        __CLR4_5_2awuawum68iyhp1.R.inc(14197);return field;
    }finally{__CLR4_5_2awuawum68iyhp1.R.flushNeeded();}}

    /**
     * Utility to create a TIFFRational metadata child node of a TIFFRationals node for
     * TIFF metadata.
     *
     * @param number value of the number attribute of the TIFField
     * @param name value of the name attribute of the TIFFField
     * @param value value of the value attribute of the TIFFRational
     * @return the new metadata node
     */
    public static final IIOMetadataNode createRationalMetadataNode(int number,
            String name, String value) {try{__CLR4_5_2awuawum68iyhp1.R.inc(14198);

        __CLR4_5_2awuawum68iyhp1.R.inc(14199);IIOMetadataNode field = createMetadataField(number, name);
        __CLR4_5_2awuawum68iyhp1.R.inc(14200);IIOMetadataNode arrayNode;
        __CLR4_5_2awuawum68iyhp1.R.inc(14201);IIOMetadataNode valueNode;
        __CLR4_5_2awuawum68iyhp1.R.inc(14202);arrayNode = new IIOMetadataNode("TIFFRationals");
        __CLR4_5_2awuawum68iyhp1.R.inc(14203);field.appendChild(arrayNode);
        __CLR4_5_2awuawum68iyhp1.R.inc(14204);valueNode = new IIOMetadataNode("TIFFRational");
        __CLR4_5_2awuawum68iyhp1.R.inc(14205);valueNode.setAttribute("value", value);
        __CLR4_5_2awuawum68iyhp1.R.inc(14206);arrayNode.appendChild(valueNode);

        __CLR4_5_2awuawum68iyhp1.R.inc(14207);return field;
    }finally{__CLR4_5_2awuawum68iyhp1.R.flushNeeded();}}

    /**
     * Utility function to create a base TIFFField node for TIFF metadata.
     *
     * @param number value of the number attribute of the TIFField
     * @param name value of the name attribute of the TIFFField
     * @return the new metadata node
     */
    public static final IIOMetadataNode createMetadataField(int number, String name) {try{__CLR4_5_2awuawum68iyhp1.R.inc(14208);

        __CLR4_5_2awuawum68iyhp1.R.inc(14209);IIOMetadataNode field = new IIOMetadataNode("TIFFField");
        __CLR4_5_2awuawum68iyhp1.R.inc(14210);field.setAttribute("number", Integer.toString(number));
        __CLR4_5_2awuawum68iyhp1.R.inc(14211);field.setAttribute("name", name);
        __CLR4_5_2awuawum68iyhp1.R.inc(14212);return field;
    }finally{__CLR4_5_2awuawum68iyhp1.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected IIOMetadata createStreamMetadata(javax.imageio.ImageWriter writer,
            ImageWriteParam writeParam, ImageWriterParams params) {try{__CLR4_5_2awuawum68iyhp1.R.inc(14213);
        __CLR4_5_2awuawum68iyhp1.R.inc(14214);Endianness endian = ((((params != null )&&(__CLR4_5_2awuawum68iyhp1.R.iget(14215)!=0|true))||(__CLR4_5_2awuawum68iyhp1.R.iget(14216)==0&false))? params.getEndianness() : Endianness.DEFAULT);
        __CLR4_5_2awuawum68iyhp1.R.inc(14217);if ((((endian == Endianness.DEFAULT || endian == null)&&(__CLR4_5_2awuawum68iyhp1.R.iget(14218)!=0|true))||(__CLR4_5_2awuawum68iyhp1.R.iget(14219)==0&false))) {{
            __CLR4_5_2awuawum68iyhp1.R.inc(14220);return super.createStreamMetadata(writer, writeParam, params);
        }

        //Try changing the Byte Order
        }__CLR4_5_2awuawum68iyhp1.R.inc(14221);IIOMetadata streamMetadata = writer.getDefaultStreamMetadata(writeParam);
        __CLR4_5_2awuawum68iyhp1.R.inc(14222);if ((((streamMetadata != null)&&(__CLR4_5_2awuawum68iyhp1.R.iget(14223)!=0|true))||(__CLR4_5_2awuawum68iyhp1.R.iget(14224)==0&false))) {{
            __CLR4_5_2awuawum68iyhp1.R.inc(14225);Set<String> names = new java.util.HashSet<String>(
                    Arrays.asList(streamMetadata.getMetadataFormatNames()));
            __CLR4_5_2awuawum68iyhp1.R.inc(14226);setFromTree(names, streamMetadata, endian, SUN_TIFF_NATIVE_STREAM_FORMAT);
            __CLR4_5_2awuawum68iyhp1.R.inc(14227);setFromTree(names, streamMetadata, endian, JAVA_TIFF_NATIVE_STREAM_FORMAT);
        }
        }__CLR4_5_2awuawum68iyhp1.R.inc(14228);return streamMetadata;
    }finally{__CLR4_5_2awuawum68iyhp1.R.flushNeeded();}}

    private void setFromTree(Set<String> names, IIOMetadata streamMetadata, Endianness endian, String format) {try{__CLR4_5_2awuawum68iyhp1.R.inc(14229);
        __CLR4_5_2awuawum68iyhp1.R.inc(14230);if ((((names.contains(format))&&(__CLR4_5_2awuawum68iyhp1.R.iget(14231)!=0|true))||(__CLR4_5_2awuawum68iyhp1.R.iget(14232)==0&false))) {{
            __CLR4_5_2awuawum68iyhp1.R.inc(14233);Node root = streamMetadata.getAsTree(format);
            __CLR4_5_2awuawum68iyhp1.R.inc(14234);root.getFirstChild().getAttributes().item(0).setNodeValue(endian.toString());
            __CLR4_5_2awuawum68iyhp1.R.inc(14235);try {
                __CLR4_5_2awuawum68iyhp1.R.inc(14236);streamMetadata.setFromTree(format, root);
            } catch (IIOInvalidTreeException e) {
                //This should not happen since we check if the format is supported.
                __CLR4_5_2awuawum68iyhp1.R.inc(14237);throw new IllegalStateException(
                        "Could not replace TIFF stream metadata: " + e.getMessage(), e);
            }
        }
    }}finally{__CLR4_5_2awuawum68iyhp1.R.flushNeeded();}}

}
