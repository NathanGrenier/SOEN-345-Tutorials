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

/* $Id: PreloaderImageIO.java 1904425 2022-10-06 12:37:37Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl.imageio;

import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;

import org.apache.xmlgraphics.image.loader.ImageContext;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSize;
import org.apache.xmlgraphics.image.loader.impl.AbstractImagePreloader;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;

/**
 * Image preloader for images supported by ImageIO.
 * <p>
 * Note: The implementation relies on the presence of a working ImageIO implementation which
 * provides accurate image metadata. This is particularly important for PNG image because the
 * PNG loader relies on that.
 */
public class PreloaderImageIO extends AbstractImagePreloader {public static class __CLR4_5_299s99sm6lb50ev{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,12072,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** {@inheritDoc}
     * @throws ImageException */
    public ImageInfo preloadImage(String uri, Source src, ImageContext context)
            throws IOException, ImageException {try{__CLR4_5_299s99sm6lb50ev.R.inc(12016);
        __CLR4_5_299s99sm6lb50ev.R.inc(12017);if ((((!ImageUtil.hasImageInputStream(src))&&(__CLR4_5_299s99sm6lb50ev.R.iget(12018)!=0|true))||(__CLR4_5_299s99sm6lb50ev.R.iget(12019)==0&false))) {{
            __CLR4_5_299s99sm6lb50ev.R.inc(12020);return null;
        }
        }__CLR4_5_299s99sm6lb50ev.R.inc(12021);ImageInputStream in = ImageUtil.needImageInputStream(src);
        __CLR4_5_299s99sm6lb50ev.R.inc(12022);long startPos = in.getStreamPosition();
        __CLR4_5_299s99sm6lb50ev.R.inc(12023);Iterator iter = ImageIO.getImageReaders(in);
        __CLR4_5_299s99sm6lb50ev.R.inc(12024);if ((((!iter.hasNext())&&(__CLR4_5_299s99sm6lb50ev.R.iget(12025)!=0|true))||(__CLR4_5_299s99sm6lb50ev.R.iget(12026)==0&false))) {{
            __CLR4_5_299s99sm6lb50ev.R.inc(12027);return null;
        }

        }__CLR4_5_299s99sm6lb50ev.R.inc(12028);IOException firstIOException = null;
        __CLR4_5_299s99sm6lb50ev.R.inc(12029);IIOMetadata iiometa = null;
        __CLR4_5_299s99sm6lb50ev.R.inc(12030);ImageSize size = null;
        __CLR4_5_299s99sm6lb50ev.R.inc(12031);String mime = null;
        __CLR4_5_299s99sm6lb50ev.R.inc(12032);while ((((iter.hasNext())&&(__CLR4_5_299s99sm6lb50ev.R.iget(12033)!=0|true))||(__CLR4_5_299s99sm6lb50ev.R.iget(12034)==0&false))) {{
            __CLR4_5_299s99sm6lb50ev.R.inc(12035);in.mark();

            __CLR4_5_299s99sm6lb50ev.R.inc(12036);ImageReader reader = (ImageReader)iter.next();
            __CLR4_5_299s99sm6lb50ev.R.inc(12037);try {
                __CLR4_5_299s99sm6lb50ev.R.inc(12038);reader.setInput(ImageUtil.ignoreFlushing(in), true, false);
                __CLR4_5_299s99sm6lb50ev.R.inc(12039);final int imageIndex = 0;
                __CLR4_5_299s99sm6lb50ev.R.inc(12040);iiometa = reader.getImageMetadata(imageIndex);
                __CLR4_5_299s99sm6lb50ev.R.inc(12041);size = new ImageSize();
                __CLR4_5_299s99sm6lb50ev.R.inc(12042);size.setSizeInPixels(reader.getWidth(imageIndex), reader.getHeight(imageIndex));
                __CLR4_5_299s99sm6lb50ev.R.inc(12043);mime = reader.getOriginatingProvider().getMIMETypes()[0];
                __CLR4_5_299s99sm6lb50ev.R.inc(12044);break;
            } catch (IOException ioe) {
                //remember the first exception, ignore all others and continue
                __CLR4_5_299s99sm6lb50ev.R.inc(12045);if ((((firstIOException == null)&&(__CLR4_5_299s99sm6lb50ev.R.iget(12046)!=0|true))||(__CLR4_5_299s99sm6lb50ev.R.iget(12047)==0&false))) {{
                    __CLR4_5_299s99sm6lb50ev.R.inc(12048);firstIOException = ioe;
                }
            }} finally {
                __CLR4_5_299s99sm6lb50ev.R.inc(12049);reader.dispose();
                __CLR4_5_299s99sm6lb50ev.R.inc(12050);in.reset();
            }
        }

        }__CLR4_5_299s99sm6lb50ev.R.inc(12051);if ((((iiometa == null)&&(__CLR4_5_299s99sm6lb50ev.R.iget(12052)!=0|true))||(__CLR4_5_299s99sm6lb50ev.R.iget(12053)==0&false))) {{
            __CLR4_5_299s99sm6lb50ev.R.inc(12054);in.seek(startPos);
            __CLR4_5_299s99sm6lb50ev.R.inc(12055);return null;
        }

        //Resolution (first a default, then try to read the metadata)
        }__CLR4_5_299s99sm6lb50ev.R.inc(12056);size.setResolution(context.getSourceResolution());
        __CLR4_5_299s99sm6lb50ev.R.inc(12057);ImageIOUtil.extractResolution(iiometa, size);
        __CLR4_5_299s99sm6lb50ev.R.inc(12058);if ((((size.getWidthPx() <= 0 || size.getHeightPx() <= 0)&&(__CLR4_5_299s99sm6lb50ev.R.iget(12059)!=0|true))||(__CLR4_5_299s99sm6lb50ev.R.iget(12060)==0&false))) {{
            //Watch out for a special case: a TGA image was erroneously identified
            //as a WBMP image by a Sun ImageIO codec.
            __CLR4_5_299s99sm6lb50ev.R.inc(12061);return null;
        }
        }__CLR4_5_299s99sm6lb50ev.R.inc(12062);if ((((size.getWidthMpt() == 0)&&(__CLR4_5_299s99sm6lb50ev.R.iget(12063)!=0|true))||(__CLR4_5_299s99sm6lb50ev.R.iget(12064)==0&false))) {{
            __CLR4_5_299s99sm6lb50ev.R.inc(12065);size.calcSizeFromPixels();
        }

        }__CLR4_5_299s99sm6lb50ev.R.inc(12066);ImageInfo info = new ImageInfo(uri, mime);
        __CLR4_5_299s99sm6lb50ev.R.inc(12067);info.getCustomObjects().put(ImageIOUtil.IMAGEIO_METADATA, iiometa);
        __CLR4_5_299s99sm6lb50ev.R.inc(12068);info.setSize(size);

        __CLR4_5_299s99sm6lb50ev.R.inc(12069);return info;
    }finally{__CLR4_5_299s99sm6lb50ev.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getPriority() {try{__CLR4_5_299s99sm6lb50ev.R.inc(12070);
        //Lower priority than default to give the specialized preloaders a chance.
        __CLR4_5_299s99sm6lb50ev.R.inc(12071);return 2 * DEFAULT_PRIORITY;
    }finally{__CLR4_5_299s99sm6lb50ev.R.flushNeeded();}}

}
