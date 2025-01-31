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

/* $Id: ImageUtil.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.zip.GZIPInputStream;

import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;

import org.apache.xmlgraphics.image.loader.ImageProcessingHints;
import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.image.loader.ImageSource;
import org.apache.xmlgraphics.io.XmlSourceUtil;

/**
 * Helper and convenience methods for working with the image package.
 */
public final class ImageUtil {public static class __CLR4_5_29r19r1m6lb50i8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,12751,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ImageUtil() {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12637);
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Returns the InputStream of a Source object.
     * @param src the Source object
     * @return the InputStream (or null if there's not InputStream available)
     * @deprecated Please use {@link XmlSourceUtil#getInputStream(Source)} instead.
     */
    @Deprecated
    public static InputStream getInputStream(Source src) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12638);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12639);return XmlSourceUtil.getInputStream(src);
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Returns the ImageInputStream of a Source object.
     * @param src the Source object
     * @return the ImageInputStream (or null if there's not ImageInputStream available)
     */
    public static ImageInputStream getImageInputStream(Source src) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12640);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12641);if ((((src instanceof ImageSource)&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12642)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12643)==0&false))) {{
            __CLR4_5_29r19r1m6lb50i8.R.inc(12644);return ((ImageSource) src).getImageInputStream();
        } }else {{
            __CLR4_5_29r19r1m6lb50i8.R.inc(12645);return null;
        }
    }}finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Returns the InputStream of a Source object. This method throws an IllegalArgumentException
     * if there's no InputStream instance available from the Source object.
     * @param src the Source object
     * @return the InputStream
     * @deprecated use {@link XmlSourceUtil#needInputStream(Source)} instead
     */
    @Deprecated
    public static InputStream needInputStream(Source src) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12646);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12647);return XmlSourceUtil.needInputStream(src);
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Returns the ImageInputStream of a Source object. This method throws an
     * IllegalArgumentException if there's no ImageInputStream instance available from the
     * Source object.
     * @param src the Source object
     * @return the ImageInputStream
     */
    public static ImageInputStream needImageInputStream(Source src) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12648);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12649);if ((((src instanceof ImageSource)&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12650)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12651)==0&false))) {{
            __CLR4_5_29r19r1m6lb50i8.R.inc(12652);ImageSource isrc = (ImageSource) src;
            __CLR4_5_29r19r1m6lb50i8.R.inc(12653);if ((((isrc.getImageInputStream() == null)&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12654)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12655)==0&false))) {{
                __CLR4_5_29r19r1m6lb50i8.R.inc(12656);throw new IllegalArgumentException(
                        "ImageInputStream is null/cleared on ImageSource");
            }
            }__CLR4_5_29r19r1m6lb50i8.R.inc(12657);return isrc.getImageInputStream();
        } }else {{
            __CLR4_5_29r19r1m6lb50i8.R.inc(12658);throw new IllegalArgumentException("Source must be an ImageSource");
        }
    }}finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Indicates whether the Source object has an InputStream instance.
     * @param src the Source object
     * @return true if an InputStream is available
     */
    public static boolean hasInputStream(Source src) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12659);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12660);return XmlSourceUtil.hasInputStream(src) || hasImageInputStream(src);
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Indicates whether the Source object has a Reader instance.
     * @param src the Source object
     * @return true if an Reader is available
     * @deprecated use {@link XmlSourceUtil#hasReader(Source)} instead
     */
    @Deprecated
    public static boolean hasReader(Source src) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12661);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12662);return XmlSourceUtil.hasReader(src);
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Indicates whether the Source object has an ImageInputStream instance.
     * @param src the Source object
     * @return true if an ImageInputStream is available
     */
    public static boolean hasImageInputStream(Source src) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12663);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12664);return getImageInputStream(src) != null;
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Removes any references to InputStreams or Readers from the given Source to prohibit
     * accidental/unwanted use by a component further downstream.
     * @param src the Source object
     * @deprecated use {@link XmlSourceUtil#removeStreams(Source)} instead
     */
    @Deprecated
    public static void removeStreams(Source src) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12665);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12666);XmlSourceUtil.removeStreams(src);
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Closes the InputStreams or ImageInputStreams of Source objects. Any exception occurring
     * while closing the stream is ignored.
     * @param src the Source object
     * @deprecated use {@link XmlSourceUtil#closeQuietly(Source)} instead
     */
    @Deprecated
    public static void closeQuietly(Source src) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12667);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12668);XmlSourceUtil.closeQuietly(src);
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Decorates an ImageInputStream so the flush*() methods are ignored and have no effect.
     * The decoration is implemented using a dynamic proxy.
     * @param in the ImageInputStream
     * @return the decorated ImageInputStream
     */
    public static ImageInputStream ignoreFlushing(final ImageInputStream in) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12669);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12670);return (ImageInputStream) Proxy.newProxyInstance(in.getClass().getClassLoader(),
                new Class[] {ImageInputStream.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args)
                            throws Throwable {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12671);
                        __CLR4_5_29r19r1m6lb50i8.R.inc(12672);String methodName = method.getName();
                        //Ignore calls to flush*()
                        __CLR4_5_29r19r1m6lb50i8.R.inc(12673);if ((((!methodName.startsWith("flush"))&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12674)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12675)==0&false))) {{
                            __CLR4_5_29r19r1m6lb50i8.R.inc(12676);try {
                                __CLR4_5_29r19r1m6lb50i8.R.inc(12677);return method.invoke(in, args);
                            } catch (InvocationTargetException ite) {
                                __CLR4_5_29r19r1m6lb50i8.R.inc(12678);throw ite.getCause();
                            }
                        } }else {{
                            __CLR4_5_29r19r1m6lb50i8.R.inc(12679);return null;
                        }
                    }}finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}
                });
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * GZIP header magic number bytes, like found in a gzipped
     * files, which are encoded in Intel format (i.&#x2e;e&#x2e; little indian).
     */
    private static final byte[] GZIP_MAGIC = {(byte) 0x1f, (byte) 0x8b};

    /**
     * Indicates whether an InputStream is GZIP compressed. The InputStream must support
     * mark()/reset().
     * @param in the InputStream (must return true on markSupported())
     * @return true if the InputStream is GZIP compressed
     * @throws IOException in case of an I/O error
     */
    public static boolean isGZIPCompressed(InputStream in) throws IOException {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12680);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12681);if ((((!in.markSupported())&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12682)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12683)==0&false))) {{
            __CLR4_5_29r19r1m6lb50i8.R.inc(12684);throw new IllegalArgumentException("InputStream must support mark()!");
        }
        }__CLR4_5_29r19r1m6lb50i8.R.inc(12685);byte[] data = new byte[2];
        __CLR4_5_29r19r1m6lb50i8.R.inc(12686);in.mark(2);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12687);in.read(data);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12688);in.reset();
        __CLR4_5_29r19r1m6lb50i8.R.inc(12689);return ((data[0] == GZIP_MAGIC[0]) && (data[1] == GZIP_MAGIC[1]));
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Decorates an InputStream with a BufferedInputStream if it doesn't support mark()/reset().
     * @param in the InputStream
     * @return the decorated InputStream
     */
    public static InputStream decorateMarkSupported(InputStream in) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12690);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12691);if ((((in.markSupported())&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12692)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12693)==0&false))) {{
            __CLR4_5_29r19r1m6lb50i8.R.inc(12694);return in;
        } }else {{
            __CLR4_5_29r19r1m6lb50i8.R.inc(12695);return new java.io.BufferedInputStream(in);
        }
    }}finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Automatically decorates an InputStream so it is buffered. Furthermore, it makes sure
     * it is decorated with a GZIPInputStream if the stream is GZIP compressed.
     * @param in the InputStream
     * @return the decorated InputStream
     * @throws IOException in case of an I/O error
     */
    public static InputStream autoDecorateInputStream(InputStream in) throws IOException {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12696);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12697);in = decorateMarkSupported(in);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12698);if ((((isGZIPCompressed(in))&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12699)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12700)==0&false))) {{
            __CLR4_5_29r19r1m6lb50i8.R.inc(12701);return new GZIPInputStream(in);
        }
        }__CLR4_5_29r19r1m6lb50i8.R.inc(12702);return in;
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Creates a new hint Map with values from the FOUserAgent.
     * @param session the session context
     * @return a Map of hints
     */
    public static Map getDefaultHints(ImageSessionContext session) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12703);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12704);java.util.Map hints = new java.util.HashMap();
        __CLR4_5_29r19r1m6lb50i8.R.inc(12705);hints.put(ImageProcessingHints.SOURCE_RESOLUTION,
                session.getParentContext().getSourceResolution());
        __CLR4_5_29r19r1m6lb50i8.R.inc(12706);hints.put(ImageProcessingHints.TARGET_RESOLUTION,
                session.getTargetResolution());
        __CLR4_5_29r19r1m6lb50i8.R.inc(12707);hints.put(ImageProcessingHints.IMAGE_SESSION_CONTEXT, session);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12708);return hints;
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    private static final String PAGE_INDICATOR = "page=";

    /**
     * Extracts page index information from a URI. The expected pattern is "page=x" where x is
     * a non-negative integer number. The page index must be specified as part of the URI fragment
     * and is 1-based, i.e. the first page is 1 but the the method returns a zero-based page
     * index.
     * An example: <code>http://www.foo.bar/images/scan1.tif#page=4</code> (The method will return
     * 3.)
     * <p>
     * If no page index information is found in the URI or if the URI cannot be parsed, the
     * method returns null.
     * @param uri the URI that should be inspected
     * @return the page index (0 is the first page) or null if there's no page index information
     *         in the URI
     */
    public static Integer getPageIndexFromURI(String uri) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12709);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12710);if ((((uri.indexOf('#') < 0)&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12711)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12712)==0&false))) {{
            __CLR4_5_29r19r1m6lb50i8.R.inc(12713);return null;
        }
        }__CLR4_5_29r19r1m6lb50i8.R.inc(12714);try {
            __CLR4_5_29r19r1m6lb50i8.R.inc(12715);URI u = new URI(uri);
            __CLR4_5_29r19r1m6lb50i8.R.inc(12716);String fragment = u.getFragment();
            __CLR4_5_29r19r1m6lb50i8.R.inc(12717);if ((((fragment != null)&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12718)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12719)==0&false))) {{
                __CLR4_5_29r19r1m6lb50i8.R.inc(12720);int pos = fragment.indexOf(PAGE_INDICATOR);
                __CLR4_5_29r19r1m6lb50i8.R.inc(12721);if ((((pos >= 0)&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12722)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12723)==0&false))) {{
                    __CLR4_5_29r19r1m6lb50i8.R.inc(12724);pos += PAGE_INDICATOR.length();
                    __CLR4_5_29r19r1m6lb50i8.R.inc(12725);StringBuffer sb = new StringBuffer();
                    __CLR4_5_29r19r1m6lb50i8.R.inc(12726);while ((((pos < fragment.length())&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12727)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12728)==0&false))) {{
                        __CLR4_5_29r19r1m6lb50i8.R.inc(12729);char c = fragment.charAt(pos);
                        __CLR4_5_29r19r1m6lb50i8.R.inc(12730);if ((((c >= '0' && c <= '9')&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12731)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12732)==0&false))) {{
                            __CLR4_5_29r19r1m6lb50i8.R.inc(12733);sb.append(c);
                        } }else {{
                            __CLR4_5_29r19r1m6lb50i8.R.inc(12734);break;
                        }
                        }__CLR4_5_29r19r1m6lb50i8.R.inc(12735);pos++;
                    }
                    }__CLR4_5_29r19r1m6lb50i8.R.inc(12736);if ((((sb.length() > 0)&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12737)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12738)==0&false))) {{
                        __CLR4_5_29r19r1m6lb50i8.R.inc(12739);int pageIndex = Integer.parseInt(sb.toString()) - 1;
                        __CLR4_5_29r19r1m6lb50i8.R.inc(12740);pageIndex = Math.max(0, pageIndex);
                        __CLR4_5_29r19r1m6lb50i8.R.inc(12741);return pageIndex;
                    }
                }}
            }}
        }} catch (URISyntaxException e) {
            __CLR4_5_29r19r1m6lb50i8.R.inc(12742);throw new IllegalArgumentException("URI is invalid: "
                    + e.getLocalizedMessage());
        }
        __CLR4_5_29r19r1m6lb50i8.R.inc(12743);return null;
    }finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

    /**
     * Extracts page index information from a URI. The expected pattern is "page=x" where x is
     * a non-negative integer number. The page index must be specified as part of the URI fragment
     * and is 1-based, i.e. the first page is 1 but the the method returns a zero-based page
     * index.
     * An example: <code>http://www.foo.bar/images/scan1.tif#page=4</code> (The method will return
     * 3.)
     * <p>
     * If no page index information is found in the URI, the
     * method just returns 0 which indicates the first page.
     * @param uri the URI that should be inspected
     * @return the page index (0 is the first page)
     */
    public static int needPageIndexFromURI(String uri) {try{__CLR4_5_29r19r1m6lb50i8.R.inc(12744);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12745);Integer res = getPageIndexFromURI(uri);
        __CLR4_5_29r19r1m6lb50i8.R.inc(12746);if ((((res != null)&&(__CLR4_5_29r19r1m6lb50i8.R.iget(12747)!=0|true))||(__CLR4_5_29r19r1m6lb50i8.R.iget(12748)==0&false))) {{
            __CLR4_5_29r19r1m6lb50i8.R.inc(12749);return res;
        } }else {{
            __CLR4_5_29r19r1m6lb50i8.R.inc(12750);return 0;
        }
    }}finally{__CLR4_5_29r19r1m6lb50i8.R.flushNeeded();}}

}
