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

/* $Id: PreloaderBMP.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.io.IOException;
import java.nio.ByteOrder;

import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;

import org.apache.xmlgraphics.image.loader.ImageContext;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSize;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;
import org.apache.xmlgraphics.util.UnitConv;

/**
 * Image preloader for BMP images.
 */
public class PreloaderBMP extends AbstractImagePreloader {public static class __CLR4_5_28m88m8m68iyhc6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,11211,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Length of the BMP header */
    protected static final int BMP_SIG_LENGTH = 2;

    /** offset to width */
    private static final int WIDTH_OFFSET = 18;

    /** {@inheritDoc} */
    public ImageInfo preloadImage(String uri, Source src, ImageContext context)
                throws IOException, ImageException {try{__CLR4_5_28m88m8m68iyhc6.R.inc(11168);
        __CLR4_5_28m88m8m68iyhc6.R.inc(11169);if ((((!ImageUtil.hasImageInputStream(src))&&(__CLR4_5_28m88m8m68iyhc6.R.iget(11170)!=0|true))||(__CLR4_5_28m88m8m68iyhc6.R.iget(11171)==0&false))) {{
            __CLR4_5_28m88m8m68iyhc6.R.inc(11172);return null;
        }
        }__CLR4_5_28m88m8m68iyhc6.R.inc(11173);ImageInputStream in = ImageUtil.needImageInputStream(src);
        __CLR4_5_28m88m8m68iyhc6.R.inc(11174);byte[] header = getHeader(in, BMP_SIG_LENGTH);
        __CLR4_5_28m88m8m68iyhc6.R.inc(11175);boolean supported = ((header[0] == (byte) 0x42)
                && (header[1] == (byte) 0x4d));

        __CLR4_5_28m88m8m68iyhc6.R.inc(11176);if ((((supported)&&(__CLR4_5_28m88m8m68iyhc6.R.iget(11177)!=0|true))||(__CLR4_5_28m88m8m68iyhc6.R.iget(11178)==0&false))) {{
            __CLR4_5_28m88m8m68iyhc6.R.inc(11179);ImageInfo info = new ImageInfo(uri, "image/bmp");
            __CLR4_5_28m88m8m68iyhc6.R.inc(11180);info.setSize(determineSize(in, context));
            __CLR4_5_28m88m8m68iyhc6.R.inc(11181);return info;
        } }else {{
            __CLR4_5_28m88m8m68iyhc6.R.inc(11182);return null;
        }
    }}finally{__CLR4_5_28m88m8m68iyhc6.R.flushNeeded();}}

    private ImageSize determineSize(ImageInputStream in, ImageContext context)
            throws IOException, ImageException {try{__CLR4_5_28m88m8m68iyhc6.R.inc(11183);
        __CLR4_5_28m88m8m68iyhc6.R.inc(11184);in.mark();
        __CLR4_5_28m88m8m68iyhc6.R.inc(11185);ByteOrder oldByteOrder = in.getByteOrder();
        __CLR4_5_28m88m8m68iyhc6.R.inc(11186);try {
            __CLR4_5_28m88m8m68iyhc6.R.inc(11187);ImageSize size = new ImageSize();

            // BMP uses little endian notation!
            __CLR4_5_28m88m8m68iyhc6.R.inc(11188);in.setByteOrder(ByteOrder.LITTLE_ENDIAN);

            __CLR4_5_28m88m8m68iyhc6.R.inc(11189);in.skipBytes(WIDTH_OFFSET);
            __CLR4_5_28m88m8m68iyhc6.R.inc(11190);int width = in.readInt();
            __CLR4_5_28m88m8m68iyhc6.R.inc(11191);int height = in.readInt();
            __CLR4_5_28m88m8m68iyhc6.R.inc(11192);size.setSizeInPixels(width, height);

            __CLR4_5_28m88m8m68iyhc6.R.inc(11193);in.skipBytes(12);
            __CLR4_5_28m88m8m68iyhc6.R.inc(11194);int xRes = in.readInt();
            __CLR4_5_28m88m8m68iyhc6.R.inc(11195);double xResDPI = UnitConv.in2mm(xRes / 1000d);
            __CLR4_5_28m88m8m68iyhc6.R.inc(11196);if ((((xResDPI == 0)&&(__CLR4_5_28m88m8m68iyhc6.R.iget(11197)!=0|true))||(__CLR4_5_28m88m8m68iyhc6.R.iget(11198)==0&false))) {{
                __CLR4_5_28m88m8m68iyhc6.R.inc(11199);xResDPI = context.getSourceResolution();
            }

            }__CLR4_5_28m88m8m68iyhc6.R.inc(11200);int yRes = in.readInt();
            __CLR4_5_28m88m8m68iyhc6.R.inc(11201);double yResDPI = UnitConv.in2mm(yRes / 1000d);
            __CLR4_5_28m88m8m68iyhc6.R.inc(11202);if ((((yResDPI == 0)&&(__CLR4_5_28m88m8m68iyhc6.R.iget(11203)!=0|true))||(__CLR4_5_28m88m8m68iyhc6.R.iget(11204)==0&false))) {{
                __CLR4_5_28m88m8m68iyhc6.R.inc(11205);yResDPI = context.getSourceResolution();
            }

            }__CLR4_5_28m88m8m68iyhc6.R.inc(11206);size.setResolution(xResDPI, yResDPI);
            __CLR4_5_28m88m8m68iyhc6.R.inc(11207);size.calcSizeFromPixels();
            __CLR4_5_28m88m8m68iyhc6.R.inc(11208);return size;
        } finally {
            __CLR4_5_28m88m8m68iyhc6.R.inc(11209);in.setByteOrder(oldByteOrder);
            __CLR4_5_28m88m8m68iyhc6.R.inc(11210);in.reset();
        }
    }finally{__CLR4_5_28m88m8m68iyhc6.R.flushNeeded();}}

}
