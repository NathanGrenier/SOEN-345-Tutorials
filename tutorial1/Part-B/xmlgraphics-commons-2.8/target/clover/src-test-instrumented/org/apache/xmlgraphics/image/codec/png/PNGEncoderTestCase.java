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

/* $Id: PNGEncoderTestCase.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.png;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * This test validates the PNGEncoder operation. It creates a
 * BufferedImage, then encodes it with the PNGEncoder, then
 * decodes it and compares the decoded image with the original one.
 *
 * @version $Id: PNGEncoderTestCase.java 1732018 2016-02-24 04:51:06Z gadams $
 */
public class PNGEncoderTestCase {static class __CLR4_5_2heaheam6lb51wa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360805289L,8589935092L,22615,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testPNGEncoding() throws Exception {__CLR4_5_2heaheam6lb51wa.R.globalSliceStart(getClass().getName(),22546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25zfyy9hea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2heaheam6lb51wa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2heaheam6lb51wa.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.image.codec.png.PNGEncoderTestCase.testPNGEncoding",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25zfyy9hea() throws Exception{try{__CLR4_5_2heaheam6lb51wa.R.inc(22546);
        // Create a BufferedImage to be encoded
        __CLR4_5_2heaheam6lb51wa.R.inc(22547);BufferedImage image = new BufferedImage(100, 75, BufferedImage.TYPE_INT_ARGB);
        __CLR4_5_2heaheam6lb51wa.R.inc(22548);Graphics2D ig = image.createGraphics();
        __CLR4_5_2heaheam6lb51wa.R.inc(22549);ig.scale(.5, .5);
        __CLR4_5_2heaheam6lb51wa.R.inc(22550);ig.setPaint(new Color(128, 0, 0));
        __CLR4_5_2heaheam6lb51wa.R.inc(22551);ig.fillRect(0, 0, 100, 50);
        __CLR4_5_2heaheam6lb51wa.R.inc(22552);ig.setPaint(Color.orange);
        __CLR4_5_2heaheam6lb51wa.R.inc(22553);ig.fillRect(100, 0, 100, 50);
        __CLR4_5_2heaheam6lb51wa.R.inc(22554);ig.setPaint(Color.yellow);
        __CLR4_5_2heaheam6lb51wa.R.inc(22555);ig.fillRect(0, 50, 100, 50);
        __CLR4_5_2heaheam6lb51wa.R.inc(22556);ig.setPaint(Color.red);
        __CLR4_5_2heaheam6lb51wa.R.inc(22557);ig.fillRect(100, 50, 100, 50);
        __CLR4_5_2heaheam6lb51wa.R.inc(22558);ig.setPaint(new Color(255, 127, 127));
        __CLR4_5_2heaheam6lb51wa.R.inc(22559);ig.fillRect(0, 100, 100, 50);
        __CLR4_5_2heaheam6lb51wa.R.inc(22560);ig.setPaint(Color.black);
        __CLR4_5_2heaheam6lb51wa.R.inc(22561);ig.draw(new Rectangle2D.Double(0.5, 0.5, 199, 149));
        __CLR4_5_2heaheam6lb51wa.R.inc(22562);ig.dispose();

        __CLR4_5_2heaheam6lb51wa.R.inc(22563);image = image.getSubimage(50, 0, 50, 25);

        // Create an output stream where the PNG data
        // will be stored.
        __CLR4_5_2heaheam6lb51wa.R.inc(22564);ByteArrayOutputStream bos = new ByteArrayOutputStream();
        __CLR4_5_2heaheam6lb51wa.R.inc(22565);OutputStream os = buildOutputStream(bos);
        __CLR4_5_2heaheam6lb51wa.R.inc(22566);try {
            // Now, try to encode image
            __CLR4_5_2heaheam6lb51wa.R.inc(22567);PNGEncodeParam params =
                PNGEncodeParam.getDefaultEncodeParam(image);
            __CLR4_5_2heaheam6lb51wa.R.inc(22568);PNGImageEncoder pngImageEncoder = new PNGImageEncoder(os, params);

            __CLR4_5_2heaheam6lb51wa.R.inc(22569);pngImageEncoder.encode(image);
        } finally {
            __CLR4_5_2heaheam6lb51wa.R.inc(22570);os.close();
        }

        // Now, try to decode image
        __CLR4_5_2heaheam6lb51wa.R.inc(22571);InputStream is = buildInputStream(bos);

        __CLR4_5_2heaheam6lb51wa.R.inc(22572);PNGImageDecoder pngImageDecoder
            = new PNGImageDecoder(is, new PNGDecodeParam());

        __CLR4_5_2heaheam6lb51wa.R.inc(22573);RenderedImage decodedRenderedImage = null;
        __CLR4_5_2heaheam6lb51wa.R.inc(22574);decodedRenderedImage = pngImageDecoder.decodeAsRenderedImage(0);

        __CLR4_5_2heaheam6lb51wa.R.inc(22575);BufferedImage decodedImage = null;
        __CLR4_5_2heaheam6lb51wa.R.inc(22576);if ((((decodedRenderedImage instanceof BufferedImage)&&(__CLR4_5_2heaheam6lb51wa.R.iget(22577)!=0|true))||(__CLR4_5_2heaheam6lb51wa.R.iget(22578)==0&false))) {{
            __CLR4_5_2heaheam6lb51wa.R.inc(22579);decodedImage = (BufferedImage) decodedRenderedImage;
        } }else {{
            __CLR4_5_2heaheam6lb51wa.R.inc(22580);decodedImage = new BufferedImage(decodedRenderedImage.getWidth(),
                                             decodedRenderedImage.getHeight(),
                                             BufferedImage.TYPE_INT_ARGB);
            __CLR4_5_2heaheam6lb51wa.R.inc(22581);ig = decodedImage.createGraphics();
            __CLR4_5_2heaheam6lb51wa.R.inc(22582);ig.drawRenderedImage(decodedRenderedImage,
                                 new AffineTransform());
            __CLR4_5_2heaheam6lb51wa.R.inc(22583);ig.dispose();
        }

        // Compare images
        }__CLR4_5_2heaheam6lb51wa.R.inc(22584);if ((((!checkIdentical(image, decodedImage))&&(__CLR4_5_2heaheam6lb51wa.R.iget(22585)!=0|true))||(__CLR4_5_2heaheam6lb51wa.R.iget(22586)==0&false))) {{
            __CLR4_5_2heaheam6lb51wa.R.inc(22587);fail("Decoded image does not match the original");
        }
    }}finally{__CLR4_5_2heaheam6lb51wa.R.flushNeeded();}}

    /**
     * Template method for building the PNG output stream. This gives a
     * chance to sub-classes (e.g., Base64PNGEncoderTest) to add an
     * additional encoding.
     */
    public OutputStream buildOutputStream(ByteArrayOutputStream bos) {try{__CLR4_5_2heaheam6lb51wa.R.inc(22588);
        __CLR4_5_2heaheam6lb51wa.R.inc(22589);return bos;
    }finally{__CLR4_5_2heaheam6lb51wa.R.flushNeeded();}}

    /**
     * Template method for building the PNG input stream. This gives a
     * chance to sub-classes (e.g., Base64PNGEncoderTest) to add an
     * additional decoding.
     */
    public InputStream buildInputStream(ByteArrayOutputStream bos) {try{__CLR4_5_2heaheam6lb51wa.R.inc(22590);
        __CLR4_5_2heaheam6lb51wa.R.inc(22591);return new ByteArrayInputStream(bos.toByteArray());
    }finally{__CLR4_5_2heaheam6lb51wa.R.flushNeeded();}}

    /**
     * Compares the data for the two images
     */
    public static boolean checkIdentical(BufferedImage imgA,
                                         BufferedImage imgB) {try{__CLR4_5_2heaheam6lb51wa.R.inc(22592);
        __CLR4_5_2heaheam6lb51wa.R.inc(22593);boolean identical = true;
        __CLR4_5_2heaheam6lb51wa.R.inc(22594);if ((((imgA.getWidth() == imgB.getWidth()
                && imgA.getHeight() == imgB.getHeight())&&(__CLR4_5_2heaheam6lb51wa.R.iget(22595)!=0|true))||(__CLR4_5_2heaheam6lb51wa.R.iget(22596)==0&false))) {{
            __CLR4_5_2heaheam6lb51wa.R.inc(22597);int w = imgA.getWidth();
            __CLR4_5_2heaheam6lb51wa.R.inc(22598);int h = imgA.getHeight();
            __CLR4_5_2heaheam6lb51wa.R.inc(22599);for (int i = 0; (((i < h)&&(__CLR4_5_2heaheam6lb51wa.R.iget(22600)!=0|true))||(__CLR4_5_2heaheam6lb51wa.R.iget(22601)==0&false)); i++) {{
                __CLR4_5_2heaheam6lb51wa.R.inc(22602);for (int j = 0; (((j < w)&&(__CLR4_5_2heaheam6lb51wa.R.iget(22603)!=0|true))||(__CLR4_5_2heaheam6lb51wa.R.iget(22604)==0&false)); j++) {{
                    __CLR4_5_2heaheam6lb51wa.R.inc(22605);if ((((imgA.getRGB(j, i) != imgB.getRGB(j, i))&&(__CLR4_5_2heaheam6lb51wa.R.iget(22606)!=0|true))||(__CLR4_5_2heaheam6lb51wa.R.iget(22607)==0&false))) {{
                        __CLR4_5_2heaheam6lb51wa.R.inc(22608);identical = false;
                        __CLR4_5_2heaheam6lb51wa.R.inc(22609);break;
                    }
                }}
                }__CLR4_5_2heaheam6lb51wa.R.inc(22610);if ((((!identical)&&(__CLR4_5_2heaheam6lb51wa.R.iget(22611)!=0|true))||(__CLR4_5_2heaheam6lb51wa.R.iget(22612)==0&false))) {{
                    __CLR4_5_2heaheam6lb51wa.R.inc(22613);break;
                }
            }}
        }}

        }__CLR4_5_2heaheam6lb51wa.R.inc(22614);return identical;
    }finally{__CLR4_5_2heaheam6lb51wa.R.flushNeeded();}}

}
