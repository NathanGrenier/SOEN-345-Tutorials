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

/* $Id: TIFFImageWriter.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.writer.internal;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.xmlgraphics.image.codec.tiff.CompressionValue;
import org.apache.xmlgraphics.image.codec.tiff.TIFFEncodeParam;
import org.apache.xmlgraphics.image.codec.tiff.TIFFField;
import org.apache.xmlgraphics.image.codec.tiff.TIFFImageDecoder;
import org.apache.xmlgraphics.image.codec.tiff.TIFFImageEncoder;
import org.apache.xmlgraphics.image.writer.AbstractImageWriter;
import org.apache.xmlgraphics.image.writer.ImageWriterParams;
import org.apache.xmlgraphics.image.writer.MultiImageWriter;
import org.apache.xmlgraphics.image.writer.ResolutionUnit;

/**
 * ImageWriter implementation that uses the internal TIFF codec to
 * write TIFF files.
 *
 * @version $Id: TIFFImageWriter.java 1681108 2015-05-22 13:26:12Z ssteiner $
 */
public class TIFFImageWriter extends AbstractImageWriter {public static class __CLR4_5_2azpazpm6lb50qd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,14303,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** {@inheritDoc} */
    public void writeImage(RenderedImage image, OutputStream out)
            throws IOException {try{__CLR4_5_2azpazpm6lb50qd.R.inc(14245);
        __CLR4_5_2azpazpm6lb50qd.R.inc(14246);writeImage(image, out, null);
    }finally{__CLR4_5_2azpazpm6lb50qd.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void writeImage(RenderedImage image, OutputStream out,
            ImageWriterParams params) throws IOException {try{__CLR4_5_2azpazpm6lb50qd.R.inc(14247);
        __CLR4_5_2azpazpm6lb50qd.R.inc(14248);TIFFEncodeParam encodeParams = createTIFFEncodeParams(params);
        __CLR4_5_2azpazpm6lb50qd.R.inc(14249);TIFFImageEncoder encoder = new TIFFImageEncoder(out, encodeParams);
        __CLR4_5_2azpazpm6lb50qd.R.inc(14250);encoder.encode(image);
    }finally{__CLR4_5_2azpazpm6lb50qd.R.flushNeeded();}}

    private TIFFEncodeParam createTIFFEncodeParams(ImageWriterParams params) {try{__CLR4_5_2azpazpm6lb50qd.R.inc(14251);
        __CLR4_5_2azpazpm6lb50qd.R.inc(14252);TIFFEncodeParam encodeParams = new TIFFEncodeParam();
        __CLR4_5_2azpazpm6lb50qd.R.inc(14253);if ((((params == null)&&(__CLR4_5_2azpazpm6lb50qd.R.iget(14254)!=0|true))||(__CLR4_5_2azpazpm6lb50qd.R.iget(14255)==0&false))) {{
            __CLR4_5_2azpazpm6lb50qd.R.inc(14256);encodeParams.setCompression(CompressionValue.NONE);
        } }else {{
            __CLR4_5_2azpazpm6lb50qd.R.inc(14257);encodeParams.setCompression(CompressionValue.getValue(params.getCompressionMethod()));

            __CLR4_5_2azpazpm6lb50qd.R.inc(14258);if ((((params.getResolution() != null)&&(__CLR4_5_2azpazpm6lb50qd.R.iget(14259)!=0|true))||(__CLR4_5_2azpazpm6lb50qd.R.iget(14260)==0&false))) {{
                __CLR4_5_2azpazpm6lb50qd.R.inc(14261);int numPixX;
                __CLR4_5_2azpazpm6lb50qd.R.inc(14262);int numPixY;
                __CLR4_5_2azpazpm6lb50qd.R.inc(14263);int denom;

                __CLR4_5_2azpazpm6lb50qd.R.inc(14264);if ((((ResolutionUnit.INCH == params.getResolutionUnit())&&(__CLR4_5_2azpazpm6lb50qd.R.iget(14265)!=0|true))||(__CLR4_5_2azpazpm6lb50qd.R.iget(14266)==0&false))) {{
                    __CLR4_5_2azpazpm6lb50qd.R.inc(14267);numPixX = params.getXResolution();
                    __CLR4_5_2azpazpm6lb50qd.R.inc(14268);numPixY = params.getYResolution();
                    __CLR4_5_2azpazpm6lb50qd.R.inc(14269);denom = 1;
                } }else {{
                    // Set target resolution
                    __CLR4_5_2azpazpm6lb50qd.R.inc(14270);float pixXSzMM = 25.4f / params.getXResolution().floatValue();
                    __CLR4_5_2azpazpm6lb50qd.R.inc(14271);float pixYSzMM = 25.4f / params.getYResolution().floatValue();
                    // num Pixs in 100 Meters
                    __CLR4_5_2azpazpm6lb50qd.R.inc(14272);numPixX = (int)(((1000 * 100) / pixXSzMM) + 0.5);
                    __CLR4_5_2azpazpm6lb50qd.R.inc(14273);numPixY = (int)(((1000 * 100) / pixYSzMM) + 0.5);
                    __CLR4_5_2azpazpm6lb50qd.R.inc(14274);denom = 100 * 100;  // Centimeters per 100 Meters;
                }

                }__CLR4_5_2azpazpm6lb50qd.R.inc(14275);long [] xRational = {numPixX, denom};
                __CLR4_5_2azpazpm6lb50qd.R.inc(14276);long [] yRational = {numPixY, denom};
                __CLR4_5_2azpazpm6lb50qd.R.inc(14277);TIFFField [] fields = {
                    new TIFFField(TIFFImageDecoder.TIFF_RESOLUTION_UNIT,
                                  TIFFField.TIFF_SHORT, 1,
                                  new char[] {(char)params.getResolutionUnit().getValue()}),
                    new TIFFField(TIFFImageDecoder.TIFF_X_RESOLUTION,
                                  TIFFField.TIFF_RATIONAL, 1,
                                  new long[][] {xRational}),
                    new TIFFField(TIFFImageDecoder.TIFF_Y_RESOLUTION,
                                  TIFFField.TIFF_RATIONAL, 1,
                                  new long[][] {yRational})
                        };
                __CLR4_5_2azpazpm6lb50qd.R.inc(14278);encodeParams.setExtraFields(fields);
            }
        }}
        }__CLR4_5_2azpazpm6lb50qd.R.inc(14279);return encodeParams;
    }finally{__CLR4_5_2azpazpm6lb50qd.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getMIMEType() {try{__CLR4_5_2azpazpm6lb50qd.R.inc(14280);
        __CLR4_5_2azpazpm6lb50qd.R.inc(14281);return "image/tiff";
    }finally{__CLR4_5_2azpazpm6lb50qd.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public MultiImageWriter createMultiImageWriter(OutputStream out) throws IOException {try{__CLR4_5_2azpazpm6lb50qd.R.inc(14282);
        __CLR4_5_2azpazpm6lb50qd.R.inc(14283);return new TIFFMultiImageWriter(out);
    }finally{__CLR4_5_2azpazpm6lb50qd.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean supportsMultiImageWriter() {try{__CLR4_5_2azpazpm6lb50qd.R.inc(14284);
        __CLR4_5_2azpazpm6lb50qd.R.inc(14285);return true;
    }finally{__CLR4_5_2azpazpm6lb50qd.R.flushNeeded();}}

    private class TIFFMultiImageWriter implements MultiImageWriter {

        private OutputStream out;
        private TIFFEncodeParam encodeParams;
        private TIFFImageEncoder encoder;
        private Object context;

        public TIFFMultiImageWriter(OutputStream out) throws IOException {try{__CLR4_5_2azpazpm6lb50qd.R.inc(14286);
            __CLR4_5_2azpazpm6lb50qd.R.inc(14287);this.out = out;
        }finally{__CLR4_5_2azpazpm6lb50qd.R.flushNeeded();}}

        public void writeImage(RenderedImage image, ImageWriterParams params) throws IOException {try{__CLR4_5_2azpazpm6lb50qd.R.inc(14288);
            __CLR4_5_2azpazpm6lb50qd.R.inc(14289);if ((((encoder == null)&&(__CLR4_5_2azpazpm6lb50qd.R.iget(14290)!=0|true))||(__CLR4_5_2azpazpm6lb50qd.R.iget(14291)==0&false))) {{
                __CLR4_5_2azpazpm6lb50qd.R.inc(14292);encodeParams = createTIFFEncodeParams(params);
                __CLR4_5_2azpazpm6lb50qd.R.inc(14293);encoder = new TIFFImageEncoder(out, encodeParams);
            }
            }__CLR4_5_2azpazpm6lb50qd.R.inc(14294);context = encoder.encodeMultiple(context, image);
        }finally{__CLR4_5_2azpazpm6lb50qd.R.flushNeeded();}}

        public void close() throws IOException {try{__CLR4_5_2azpazpm6lb50qd.R.inc(14295);
            __CLR4_5_2azpazpm6lb50qd.R.inc(14296);if ((((encoder != null)&&(__CLR4_5_2azpazpm6lb50qd.R.iget(14297)!=0|true))||(__CLR4_5_2azpazpm6lb50qd.R.iget(14298)==0&false))) {{
                __CLR4_5_2azpazpm6lb50qd.R.inc(14299);encoder.finishMultiple(context);
            }
            }__CLR4_5_2azpazpm6lb50qd.R.inc(14300);encoder = null;
            __CLR4_5_2azpazpm6lb50qd.R.inc(14301);encodeParams = null;
            __CLR4_5_2azpazpm6lb50qd.R.inc(14302);out.flush();
        }finally{__CLR4_5_2azpazpm6lb50qd.R.flushNeeded();}}

    }


}
