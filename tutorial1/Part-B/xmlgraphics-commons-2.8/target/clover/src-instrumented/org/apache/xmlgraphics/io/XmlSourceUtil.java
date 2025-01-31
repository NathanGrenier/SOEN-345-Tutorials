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

package org.apache.xmlgraphics.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.InputSource;

import org.apache.commons.io.IOUtils;

import org.apache.xmlgraphics.image.loader.ImageSource;
import org.apache.xmlgraphics.image.loader.util.ImageInputStreamAdapter;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;

/**
 * A utility class for handling {@link Source} objects, more specficially the streams that back
 * the {@link Source}.
 */
public final class XmlSourceUtil {public static class __CLR4_5_2b29b29m6lb50r5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,14429,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private XmlSourceUtil() {try{__CLR4_5_2b29b29m6lb50r5.R.inc(14337);
    }finally{__CLR4_5_2b29b29m6lb50r5.R.flushNeeded();}}

    /**
     * Returns the {@link InputStream} that is backing the given {@link Source} object.
     *
     * @param src is backed by an {@link InputStream}
     * @return the input stream
     */
    public static InputStream getInputStream(Source src) {try{__CLR4_5_2b29b29m6lb50r5.R.inc(14338);
        __CLR4_5_2b29b29m6lb50r5.R.inc(14339);try {
            __CLR4_5_2b29b29m6lb50r5.R.inc(14340);if ((((src instanceof StreamSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14341)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14342)==0&false))) {{
                __CLR4_5_2b29b29m6lb50r5.R.inc(14343);return ((StreamSource) src).getInputStream();
            } }else {__CLR4_5_2b29b29m6lb50r5.R.inc(14344);if ((((src instanceof DOMSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14345)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14346)==0&false))) {{
                __CLR4_5_2b29b29m6lb50r5.R.inc(14347);ByteArrayOutputStream outStream = new ByteArrayOutputStream();
                __CLR4_5_2b29b29m6lb50r5.R.inc(14348);StreamResult xmlSource = new StreamResult(outStream);
                __CLR4_5_2b29b29m6lb50r5.R.inc(14349);TransformerFactory.newInstance().newTransformer().transform(src, xmlSource);
                __CLR4_5_2b29b29m6lb50r5.R.inc(14350);return new ByteArrayInputStream(outStream.toByteArray());
            } }else {__CLR4_5_2b29b29m6lb50r5.R.inc(14351);if ((((src instanceof SAXSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14352)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14353)==0&false))) {{
                __CLR4_5_2b29b29m6lb50r5.R.inc(14354);return ((SAXSource) src).getInputSource().getByteStream();
            } }else {__CLR4_5_2b29b29m6lb50r5.R.inc(14355);if ((((src instanceof ImageSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14356)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14357)==0&false))) {{
                __CLR4_5_2b29b29m6lb50r5.R.inc(14358);return new ImageInputStreamAdapter(((ImageSource) src).getImageInputStream());
            }
        }}}}} catch (Exception e) {
            // TODO: How do we want to handle these? They all come from the TransformerFactory
        }
        __CLR4_5_2b29b29m6lb50r5.R.inc(14359);return null;
    }finally{__CLR4_5_2b29b29m6lb50r5.R.flushNeeded();}}

    /**
     * Returns the InputStream of a Source object. This method throws an IllegalArgumentException
     * if there's no InputStream instance available from the Source object.
     * @param src the Source object
     * @return the InputStream
     */
    public static InputStream needInputStream(Source src) {try{__CLR4_5_2b29b29m6lb50r5.R.inc(14360);
        __CLR4_5_2b29b29m6lb50r5.R.inc(14361);InputStream in = getInputStream(src);
        __CLR4_5_2b29b29m6lb50r5.R.inc(14362);if ((((in != null)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14363)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14364)==0&false))) {{
            __CLR4_5_2b29b29m6lb50r5.R.inc(14365);return in;
        } }else {{
            __CLR4_5_2b29b29m6lb50r5.R.inc(14366);throw new IllegalArgumentException("Source must be a StreamSource with an InputStream"
                    + " or an ImageSource");
        }
    }}finally{__CLR4_5_2b29b29m6lb50r5.R.flushNeeded();}}

    /**
     * Indicates whether the Source object has a Reader instance.
     * @param src the Source object
     * @return true if an Reader is available
     */
    public static boolean hasReader(Source src) {try{__CLR4_5_2b29b29m6lb50r5.R.inc(14367);
        __CLR4_5_2b29b29m6lb50r5.R.inc(14368);if ((((src instanceof StreamSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14369)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14370)==0&false))) {{
            __CLR4_5_2b29b29m6lb50r5.R.inc(14371);Reader reader = ((StreamSource) src).getReader();
            __CLR4_5_2b29b29m6lb50r5.R.inc(14372);return (reader != null);
        } }else {__CLR4_5_2b29b29m6lb50r5.R.inc(14373);if ((((src instanceof SAXSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14374)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14375)==0&false))) {{
            __CLR4_5_2b29b29m6lb50r5.R.inc(14376);InputSource is = ((SAXSource) src).getInputSource();
            __CLR4_5_2b29b29m6lb50r5.R.inc(14377);if ((((is != null)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14378)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14379)==0&false))) {{
                __CLR4_5_2b29b29m6lb50r5.R.inc(14380);return (is.getCharacterStream() != null);
            }
        }}
        }}__CLR4_5_2b29b29m6lb50r5.R.inc(14381);return false;
    }finally{__CLR4_5_2b29b29m6lb50r5.R.flushNeeded();}}

    /**
     * Removes any references to InputStreams or Readers from the given Source to prohibit
     * accidental/unwanted use by a component further downstream.
     * @param src the Source object
     */
    public static void removeStreams(Source src) {try{__CLR4_5_2b29b29m6lb50r5.R.inc(14382);
        __CLR4_5_2b29b29m6lb50r5.R.inc(14383);if ((((src instanceof ImageSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14384)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14385)==0&false))) {{
            __CLR4_5_2b29b29m6lb50r5.R.inc(14386);ImageSource isrc = (ImageSource) src;
            __CLR4_5_2b29b29m6lb50r5.R.inc(14387);isrc.setImageInputStream(null);
        } }else {__CLR4_5_2b29b29m6lb50r5.R.inc(14388);if ((((src instanceof StreamSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14389)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14390)==0&false))) {{
            __CLR4_5_2b29b29m6lb50r5.R.inc(14391);StreamSource ssrc = (StreamSource) src;
            __CLR4_5_2b29b29m6lb50r5.R.inc(14392);ssrc.setInputStream(null);
            __CLR4_5_2b29b29m6lb50r5.R.inc(14393);ssrc.setReader(null);
        } }else {__CLR4_5_2b29b29m6lb50r5.R.inc(14394);if ((((src instanceof SAXSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14395)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14396)==0&false))) {{
            __CLR4_5_2b29b29m6lb50r5.R.inc(14397);InputSource is = ((SAXSource) src).getInputSource();
            __CLR4_5_2b29b29m6lb50r5.R.inc(14398);if ((((is != null)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14399)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14400)==0&false))) {{
                __CLR4_5_2b29b29m6lb50r5.R.inc(14401);is.setByteStream(null);
                __CLR4_5_2b29b29m6lb50r5.R.inc(14402);is.setCharacterStream(null);
            }
        }}
    }}}}finally{__CLR4_5_2b29b29m6lb50r5.R.flushNeeded();}}

    /**
     * Closes the InputStreams or ImageInputStreams of Source objects. Any exception occurring
     * while closing the stream is ignored.
     * @param src the Source object
     */
    public static void closeQuietly(Source src) {try{__CLR4_5_2b29b29m6lb50r5.R.inc(14403);
        __CLR4_5_2b29b29m6lb50r5.R.inc(14404);if ((((src instanceof StreamSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14405)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14406)==0&false))) {{
            __CLR4_5_2b29b29m6lb50r5.R.inc(14407);StreamSource streamSource = (StreamSource) src;
            __CLR4_5_2b29b29m6lb50r5.R.inc(14408);IOUtils.closeQuietly(streamSource.getReader());
        } }else {__CLR4_5_2b29b29m6lb50r5.R.inc(14409);if ((((src instanceof ImageSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14410)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14411)==0&false))) {{
            __CLR4_5_2b29b29m6lb50r5.R.inc(14412);if ((((ImageUtil.getImageInputStream(src) != null)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14413)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14414)==0&false))) {{
                __CLR4_5_2b29b29m6lb50r5.R.inc(14415);try {
                    __CLR4_5_2b29b29m6lb50r5.R.inc(14416);ImageUtil.getImageInputStream(src).close();
                } catch (IOException ioe) {
                    // ignore
                }
            }
        }} }else {__CLR4_5_2b29b29m6lb50r5.R.inc(14417);if ((((src instanceof SAXSource)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14418)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14419)==0&false))) {{
            __CLR4_5_2b29b29m6lb50r5.R.inc(14420);InputSource is = ((SAXSource) src).getInputSource();
            __CLR4_5_2b29b29m6lb50r5.R.inc(14421);if ((((is != null)&&(__CLR4_5_2b29b29m6lb50r5.R.iget(14422)!=0|true))||(__CLR4_5_2b29b29m6lb50r5.R.iget(14423)==0&false))) {{
                __CLR4_5_2b29b29m6lb50r5.R.inc(14424);IOUtils.closeQuietly(is.getByteStream());
                __CLR4_5_2b29b29m6lb50r5.R.inc(14425);IOUtils.closeQuietly(is.getCharacterStream());
            }
        }}
        }}}__CLR4_5_2b29b29m6lb50r5.R.inc(14426);removeStreams(src);
    }finally{__CLR4_5_2b29b29m6lb50r5.R.flushNeeded();}}

    /**
     * Indicates whether the Source object has an InputStream instance.
     * @param src the Source object
     * @return true if an InputStream is available
     */
    public static boolean hasInputStream(Source src) {try{__CLR4_5_2b29b29m6lb50r5.R.inc(14427);
        __CLR4_5_2b29b29m6lb50r5.R.inc(14428);return getInputStream(src) != null;
    }finally{__CLR4_5_2b29b29m6lb50r5.R.flushNeeded();}}
}
