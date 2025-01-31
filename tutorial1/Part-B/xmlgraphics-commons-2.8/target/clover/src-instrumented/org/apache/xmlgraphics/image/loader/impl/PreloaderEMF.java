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

/* $Id: PreloaderEMF.java 1576437 2014-03-11 17:49:35Z vhennebert $ */

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
 * Image preloader for EMF images.
 */
public class PreloaderEMF extends AbstractImagePreloader {public static class __CLR4_5_28nf8nfm6lb507a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,11250,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Length of the EMF header */
    protected static final int EMF_SIG_LENGTH = 88;

    /** offset to signature */
    private static final int SIGNATURE_OFFSET = 40;
    /** offset to width */
    private static final int WIDTH_OFFSET = 32;
    /** offset to height */
    private static final int HEIGHT_OFFSET = 36;
    /** offset to horizontal resolution in pixel */
    private static final int HRES_PIXEL_OFFSET = 72;
    /** offset to vertical resolution in pixel */
    private static final int VRES_PIXEL_OFFSET = 76;
    /** offset to horizontal resolution in mm */
    private static final int HRES_MM_OFFSET = 80;
    /** offset to vertical resolution in mm */
    private static final int VRES_MM_OFFSET = 84;

    /** {@inheritDoc} */
    public ImageInfo preloadImage(String uri, Source src, ImageContext context)
                throws IOException, ImageException {try{__CLR4_5_28nf8nfm6lb507a.R.inc(11211);
        __CLR4_5_28nf8nfm6lb507a.R.inc(11212);if ((((!ImageUtil.hasImageInputStream(src))&&(__CLR4_5_28nf8nfm6lb507a.R.iget(11213)!=0|true))||(__CLR4_5_28nf8nfm6lb507a.R.iget(11214)==0&false))) {{
            __CLR4_5_28nf8nfm6lb507a.R.inc(11215);return null;
        }
        }__CLR4_5_28nf8nfm6lb507a.R.inc(11216);ImageInputStream in = ImageUtil.needImageInputStream(src);
        __CLR4_5_28nf8nfm6lb507a.R.inc(11217);byte[] header = getHeader(in, EMF_SIG_LENGTH);
        __CLR4_5_28nf8nfm6lb507a.R.inc(11218);boolean supported
            = ((header[SIGNATURE_OFFSET + 0] == (byte) 0x20)
            && (header[SIGNATURE_OFFSET + 1] == (byte) 0x45)
            && (header[SIGNATURE_OFFSET + 2] == (byte) 0x4D)
            && (header[SIGNATURE_OFFSET + 3] == (byte) 0x46));

        __CLR4_5_28nf8nfm6lb507a.R.inc(11219);if ((((supported)&&(__CLR4_5_28nf8nfm6lb507a.R.iget(11220)!=0|true))||(__CLR4_5_28nf8nfm6lb507a.R.iget(11221)==0&false))) {{
            __CLR4_5_28nf8nfm6lb507a.R.inc(11222);ImageInfo info = new ImageInfo(uri, "image/emf");
            __CLR4_5_28nf8nfm6lb507a.R.inc(11223);info.setSize(determineSize(in, context));
            __CLR4_5_28nf8nfm6lb507a.R.inc(11224);return info;
        } }else {{
            __CLR4_5_28nf8nfm6lb507a.R.inc(11225);return null;
        }
    }}finally{__CLR4_5_28nf8nfm6lb507a.R.flushNeeded();}}

    private ImageSize determineSize(ImageInputStream in, ImageContext context)
            throws IOException, ImageException {try{__CLR4_5_28nf8nfm6lb507a.R.inc(11226);
        __CLR4_5_28nf8nfm6lb507a.R.inc(11227);in.mark();
        __CLR4_5_28nf8nfm6lb507a.R.inc(11228);ByteOrder oldByteOrder = in.getByteOrder();
        __CLR4_5_28nf8nfm6lb507a.R.inc(11229);try {
            __CLR4_5_28nf8nfm6lb507a.R.inc(11230);ImageSize size = new ImageSize();

            // BMP uses little endian notation!
            __CLR4_5_28nf8nfm6lb507a.R.inc(11231);in.setByteOrder(ByteOrder.LITTLE_ENDIAN);

            //resolution
            __CLR4_5_28nf8nfm6lb507a.R.inc(11232);in.skipBytes(WIDTH_OFFSET);
            __CLR4_5_28nf8nfm6lb507a.R.inc(11233);int width = (int)in.readUnsignedInt();
            __CLR4_5_28nf8nfm6lb507a.R.inc(11234);int height = (int)in.readUnsignedInt();

            __CLR4_5_28nf8nfm6lb507a.R.inc(11235);in.skipBytes(HRES_PIXEL_OFFSET - WIDTH_OFFSET - 8);
            __CLR4_5_28nf8nfm6lb507a.R.inc(11236);long hresPixel = in.readUnsignedInt();
            __CLR4_5_28nf8nfm6lb507a.R.inc(11237);long vresPixel = in.readUnsignedInt();
            __CLR4_5_28nf8nfm6lb507a.R.inc(11238);long hresMM = in.readUnsignedInt();
            __CLR4_5_28nf8nfm6lb507a.R.inc(11239);long vresMM = in.readUnsignedInt();
            __CLR4_5_28nf8nfm6lb507a.R.inc(11240);double resHorz = hresPixel / UnitConv.mm2in(hresMM);
            __CLR4_5_28nf8nfm6lb507a.R.inc(11241);double resVert = vresPixel / UnitConv.mm2in(vresMM);
            __CLR4_5_28nf8nfm6lb507a.R.inc(11242);size.setResolution(resHorz, resVert);

            __CLR4_5_28nf8nfm6lb507a.R.inc(11243);width = (int)Math.round(UnitConv.mm2mpt(width / 100f));
            __CLR4_5_28nf8nfm6lb507a.R.inc(11244);height = (int)Math.round(UnitConv.mm2mpt(height / 100f));
            __CLR4_5_28nf8nfm6lb507a.R.inc(11245);size.setSizeInMillipoints(width, height);
            __CLR4_5_28nf8nfm6lb507a.R.inc(11246);size.calcPixelsFromSize();

            __CLR4_5_28nf8nfm6lb507a.R.inc(11247);return size;
        } finally {
            __CLR4_5_28nf8nfm6lb507a.R.inc(11248);in.setByteOrder(oldByteOrder);
            __CLR4_5_28nf8nfm6lb507a.R.inc(11249);in.reset();
        }
    }finally{__CLR4_5_28nf8nfm6lb507a.R.flushNeeded();}}

}
