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

/* $Id: AbstractImageSessionContext.java 1895651 2021-12-07 08:03:10Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.image.loader.ImageSource;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;
import org.apache.xmlgraphics.image.loader.util.SoftMapCache;
import org.apache.xmlgraphics.io.XmlSourceUtil;

/**
 * Abstract base class for classes implementing ImageSessionContext. This class provides all the
 * special treatment for Source creation, i.e. it provides optimized Source objects where possible.
 */
public abstract class AbstractImageSessionContext implements ImageSessionContext {public static class __CLR4_5_27kq7kqm68iyh4t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,10015,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** logger */
    private static final Log log = LogFactory.getLog(AbstractImageSessionContext.class);

    private static boolean noSourceReuse;

    static {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9818);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9819);noSourceReuse = AccessController.doPrivileged(
            new PrivilegedAction<Boolean>() {
                public Boolean run() {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9820);
                    //See: http://markmail.org/message/k6mno3jsxmovaz2e
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9821);String noSourceReuseString = System.getProperty(
                            AbstractImageSessionContext.class.getName() + ".no-source-reuse");
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9822);return Boolean.valueOf(noSourceReuseString);
                }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}
            }
        );
    }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    private final FallbackResolver fallbackResolver;

    public AbstractImageSessionContext() {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9823);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9824);fallbackResolver = new UnrestrictedFallbackResolver();
    }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    /**
     * @param fallbackResolver the fallback resolution mechanism to be used when simply getting an
     * {@link InputStream} that backs a {@link Source} isn't possible.
     */
    public AbstractImageSessionContext(FallbackResolver fallbackResolver) {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9825);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9826);this.fallbackResolver = fallbackResolver;
    }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    /**
     * Attempts to resolve the given URI.
     * @param uri URI to access
     * @return A {@link javax.xml.transform.Source} object, or null if the URI
     * cannot be resolved.
     */
    protected abstract Source resolveURI(String uri);

    /** {@inheritDoc} */
    public Source newSource(String uri) {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9827);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9828);Source source = resolveURI(uri);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9829);if ((((source instanceof StreamSource || source instanceof SAXSource)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9830)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9831)==0&false))) {{
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9832);return fallbackResolver.createSource(source, uri);
        }
        //Return any non-stream Sources and let the ImageLoaders deal with them
        }__CLR4_5_27kq7kqm68iyh4t.R.inc(9833);return source;
    }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    protected static ImageInputStream createImageInputStream(InputStream in) throws IOException {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9834);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9835);ImageInputStream iin = ImageIO.createImageInputStream(in);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9836);return (ImageInputStream) Proxy.newProxyInstance(
                ImageInputStream.class.getClassLoader(),
                new Class[] {ImageInputStream.class},
                new ObservingImageInputStreamInvocationHandler(iin, in));
    }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    private static class ObservingImageInputStreamInvocationHandler
        implements InvocationHandler {

        private ImageInputStream iin;
        private InputStream in;

        public ObservingImageInputStreamInvocationHandler(ImageInputStream iin,
                InputStream underlyingStream) {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9837);
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9838);this.iin = iin;
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9839);this.in = underlyingStream;
        }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9840);
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9841);try {
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9842);if (((("close".equals(method.getName()))&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9843)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9844)==0&false))) {{
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9845);try {
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9846);return method.invoke(iin, args);
                    } finally {
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9847);IOUtils.closeQuietly(this.in);
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9848);this.in = null;
                    }
                } }else {{
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9849);return method.invoke(iin, args);
                }
            }} catch (InvocationTargetException e) {
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9850);throw e.getCause();
            }
        }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    }

    /**
     * Convert from a <code>URL</code> to a <code>File</code>.
     * <p>
     * This method will decode the URL.
     * Syntax such as <code>file:///my%20docs/file.txt</code> will be
     * correctly decoded to <code>/my docs/file.txt</code>.
     * <p>
     * Note: this method has been copied over from Apache Commons IO and enhanced to support
     * UNC paths.
     *
     * @param url  the file URL to convert, <code>null</code> returns <code>null</code>
     * @return the equivalent <code>File</code> object, or <code>null</code>
     *  if the URL's protocol is not <code>file</code>
     * @throws IllegalArgumentException if the file is incorrectly encoded
     */
    public static File toFile(URL url) {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9851);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9852);if ((((url == null || !url.getProtocol().equals("file"))&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9853)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9854)==0&false))) {{
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9855);return null;
        } }else {{
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9856);try {
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9857);String filename = "";
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9858);if ((((url.getHost() != null && url.getHost().length() > 0)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9859)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9860)==0&false))) {{
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9861);filename += Character.toString(File.separatorChar)
                            + Character.toString(File.separatorChar)
                            + url.getHost();
                }
                }__CLR4_5_27kq7kqm68iyh4t.R.inc(9862);filename += url.getFile().replace('/', File.separatorChar);
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9863);filename = java.net.URLDecoder.decode(filename, "UTF-8");
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9864);final File f = new File(filename);
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9865);if ((((!f.isFile())&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9866)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9867)==0&false))) {{
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9868);return null;
                }
                }__CLR4_5_27kq7kqm68iyh4t.R.inc(9869);return f;
            } catch (java.io.UnsupportedEncodingException uee) {
                assert false;
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9870);return null;
            }
        }
    }}finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    private SoftMapCache sessionSources = new SoftMapCache(false); //no need for synchronization

    /** {@inheritDoc} */
    public Source getSource(String uri) {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9871);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9872);return (Source) sessionSources.remove(uri);
    }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Source needSource(String uri) throws FileNotFoundException {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9873);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9874);Source src = getSource(uri);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9875);if ((((src == null)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9876)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9877)==0&false))) {{
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9878);if ((((log.isDebugEnabled())&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9879)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9880)==0&false))) {{
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9881);log.debug("Creating new Source for " + uri);

            }
            }__CLR4_5_27kq7kqm68iyh4t.R.inc(9882);src = newSource(uri);
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9883);if ((((src == null)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9884)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9885)==0&false))) {{
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9886);throw new FileNotFoundException("Image not found: " + uri);
            }
        }} }else {{
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9887);if ((((log.isDebugEnabled())&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9888)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9889)==0&false))) {{
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9890);log.debug("Reusing Source for " + uri);
            }
        }}
        }__CLR4_5_27kq7kqm68iyh4t.R.inc(9891);return src;
    }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void returnSource(String uri, Source src) {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9892);
        //Safety check to make sure the Preloaders behave
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9893);ImageInputStream in = ImageUtil.getImageInputStream(src);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9894);try {
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9895);if ((((in != null && in.getStreamPosition() != 0)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9896)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9897)==0&false))) {{
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9898);throw new IllegalStateException("ImageInputStream is not reset for: " + uri);
            }
        }} catch (IOException ioe) {
            //Ignore exception
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9899);XmlSourceUtil.closeQuietly(src);
        }

        __CLR4_5_27kq7kqm68iyh4t.R.inc(9900);if ((((isReusable(src))&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9901)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9902)==0&false))) {{
            //Only return the Source if it's reusable
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9903);log.debug("Returning Source for " + uri);
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9904);sessionSources.put(uri, src);
        } }else {{
            //Otherwise, try to close if possible and forget about it
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9905);XmlSourceUtil.closeQuietly(src);
        }
    }}finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    /**
     * Indicates whether a Source is reusable. A Source object is reusable if it's an
     * {@link ImageSource} (containing an {@link ImageInputStream}) or a {@link DOMSource}.
     * @param src the Source object
     * @return true if the Source is reusable
     */
    protected boolean isReusable(Source src) {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9906);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9907);if ((((noSourceReuse)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9908)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9909)==0&false))) {{
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9910);return false;
        }
        }__CLR4_5_27kq7kqm68iyh4t.R.inc(9911);if ((((src instanceof ImageSource)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9912)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9913)==0&false))) {{
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9914);ImageSource is = (ImageSource) src;
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9915);if ((((is.getImageInputStream() != null)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9916)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9917)==0&false))) {{
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9918);return true;
            }
        }}
        }__CLR4_5_27kq7kqm68iyh4t.R.inc(9919);if ((((src instanceof DOMSource)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9920)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9921)==0&false))) {{
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9922);return true;
        }
        }__CLR4_5_27kq7kqm68iyh4t.R.inc(9923);return false;
    }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    /**
     * Implementations of this interface will be used as the mechanism for creating the
     * {@link Source} that wraps resources. This interface allows clients to define their own
     * implementations so that they have fine-grained control over how resources are acquired.
     */
    public interface FallbackResolver {

        /**
         * The fallback mechanism used to create the source which takes in both the {@link Source}
         * that the the regular mechanisms attempted to create and the URI that the user provided.
         *
         * @param source the source
         * @param uri the URI provided by the user
         * @return the source that the contingency mechanism has been acquired
         */
        Source createSource(Source source, String uri);
    }

    /**
     * An unrestricted resolver that has various contingency mechanisms that access the file-system.
     * This is most suitable for use via the CLI or in environments where controlling I/O isn't a
     * priority.
     */
    public static final class UnrestrictedFallbackResolver implements FallbackResolver {

        /** {@inheritDoc} */
        public Source createSource(Source source, String uri) {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9924);
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9925);if ((((source == null)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9926)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9927)==0&false))) {{
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9928);if ((((log.isDebugEnabled())&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9929)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9930)==0&false))) {{
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9931);log.debug("URI could not be resolved: " + uri);
                }
                }__CLR4_5_27kq7kqm68iyh4t.R.inc(9932);return null;
            }
            }__CLR4_5_27kq7kqm68iyh4t.R.inc(9933);ImageSource imageSource = null;

            __CLR4_5_27kq7kqm68iyh4t.R.inc(9934);String resolvedURI = source.getSystemId();
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9935);URL url;
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9936);try {
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9937);url = new URL(resolvedURI);
            } catch (MalformedURLException e) {
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9938);url = null;
            }
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9939);File f = /*FileUtils.*/toFile(url);
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9940);if ((((f != null)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9941)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9942)==0&false))) {{
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9943);boolean directFileAccess = true;
                assert ((((source instanceof StreamSource) || (source instanceof SAXSource))&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9944)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9945)==0&false));
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9946);InputStream in = XmlSourceUtil.getInputStream(source);
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9947);if ((((in == null)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9948)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9949)==0&false))) {{
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9950);try {
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9951);in = new java.io.FileInputStream(f);
                    } catch (FileNotFoundException fnfe) {
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9952);log.error("Error while opening file."
                                + " Could not load image from system identifier '"
                                + source.getSystemId() + "' (" + fnfe.getMessage() + ")");
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9953);return null;
                    }
                }
                }__CLR4_5_27kq7kqm68iyh4t.R.inc(9954);in = ImageUtil.decorateMarkSupported(in);
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9955);try {
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9956);if ((((ImageUtil.isGZIPCompressed(in))&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9957)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9958)==0&false))) {{
                        //GZIPped stream are not seekable, so buffer/cache like other URLs
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9959);directFileAccess = false;
                    }
                }} catch (IOException ioe) {
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9960);log.error("Error while checking the InputStream for GZIP compression."
                            + " Could not load image from system identifier '"
                            + source.getSystemId() + "' (" + ioe.getMessage() + ")");
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9961);return null;
                }

                __CLR4_5_27kq7kqm68iyh4t.R.inc(9962);if ((((directFileAccess)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9963)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9964)==0&false))) {{
                    //Close as the file is reopened in a more optimal way
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9965);IOUtils.closeQuietly(in);
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9966);try {
                        // We let the OS' file system cache do the caching for us
                        // --> lower Java memory consumption, probably no speed loss
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9967);final ImageInputStream newInputStream = ImageIO
                                                                       .createImageInputStream(f);
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9968);if ((((newInputStream == null)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9969)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9970)==0&false))) {{
                            __CLR4_5_27kq7kqm68iyh4t.R.inc(9971);log.error("Unable to create ImageInputStream for local file "
                                    + f
                                    + " from system identifier '"
                                    + source.getSystemId() + "'");
                            __CLR4_5_27kq7kqm68iyh4t.R.inc(9972);return null;
                        } }else {{
                            __CLR4_5_27kq7kqm68iyh4t.R.inc(9973);imageSource = new ImageSource(newInputStream,
                                    resolvedURI, true);
                        }
                    }} catch (IOException ioe) {
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9974);log.error("Unable to create ImageInputStream for local file"
                                + " from system identifier '"
                                + source.getSystemId() + "' (" + ioe.getMessage() + ")");
                    }
                }
            }}

            }__CLR4_5_27kq7kqm68iyh4t.R.inc(9975);if ((((imageSource == null)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9976)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9977)==0&false))) {{
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9978);if ((((XmlSourceUtil.hasReader(source) && !ImageUtil.hasInputStream(source))&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9979)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9980)==0&false))) {{
                    //We don't handle Reader instances here so return the Source unchanged
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9981);return source;
                }
                // Got a valid source, obtain an InputStream from it
                }__CLR4_5_27kq7kqm68iyh4t.R.inc(9982);InputStream in = XmlSourceUtil.getInputStream(source);
                __CLR4_5_27kq7kqm68iyh4t.R.inc(9983);if ((((in == null && url != null)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9984)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9985)==0&false))) {{
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9986);try {
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9987);in = url.openStream();
                    } catch (Exception ex) {
                        __CLR4_5_27kq7kqm68iyh4t.R.inc(9988);log.error("Unable to obtain stream from system identifier '"
                                + source.getSystemId() + "'");
                    }
                }
                }__CLR4_5_27kq7kqm68iyh4t.R.inc(9989);if ((((in == null)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(9990)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(9991)==0&false))) {{
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9992);log.error("The Source that was returned from URI resolution didn't contain"
                            + " an InputStream for URI: " + uri);
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(9993);return null;
                }
                }__CLR4_5_27kq7kqm68iyh4t.R.inc(9994);return createImageSource(in, source);
            }
            }__CLR4_5_27kq7kqm68iyh4t.R.inc(9995);return imageSource;
        }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}
    }

    private static ImageSource createImageSource(InputStream in, Source source) {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(9996);
        __CLR4_5_27kq7kqm68iyh4t.R.inc(9997);try {
            //Buffer and uncompress if necessary
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9998);return new ImageSource(createImageInputStream(ImageUtil.autoDecorateInputStream(in)),
                    source.getSystemId(), false);
        } catch (IOException ioe) {
            __CLR4_5_27kq7kqm68iyh4t.R.inc(9999);log.error("Unable to create ImageInputStream for InputStream"
                    + " from system identifier '"
                    + source.getSystemId() + "' (" + ioe.getMessage() + ")");
        }
        __CLR4_5_27kq7kqm68iyh4t.R.inc(10000);return null;
    }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}

    /**
     * This fallback resolver is to be used in environments where controlling file access is of
     * critical importance. It disallows any contingency mechanisms by which a {@link Source} object
     * would be created.
     */
    public static final class RestrictedFallbackResolver implements FallbackResolver {

        /** {@inheritDoc} */
        public Source createSource(Source source, String uri) {try{__CLR4_5_27kq7kqm68iyh4t.R.inc(10001);
            __CLR4_5_27kq7kqm68iyh4t.R.inc(10002);if ((((source == null)&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(10003)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(10004)==0&false))) {{
                __CLR4_5_27kq7kqm68iyh4t.R.inc(10005);if ((((log.isDebugEnabled())&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(10006)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(10007)==0&false))) {{
                    __CLR4_5_27kq7kqm68iyh4t.R.inc(10008);log.debug("URI could not be resolved: " + uri);
                }
                }__CLR4_5_27kq7kqm68iyh4t.R.inc(10009);return null;
            }
            }__CLR4_5_27kq7kqm68iyh4t.R.inc(10010);if ((((ImageUtil.hasInputStream(source))&&(__CLR4_5_27kq7kqm68iyh4t.R.iget(10011)!=0|true))||(__CLR4_5_27kq7kqm68iyh4t.R.iget(10012)==0&false))) {{
                __CLR4_5_27kq7kqm68iyh4t.R.inc(10013);return createImageSource(XmlSourceUtil.getInputStream(source), source);
            }
            }__CLR4_5_27kq7kqm68iyh4t.R.inc(10014);throw new UnsupportedOperationException("There are no contingency mechanisms for I/O.");
        }finally{__CLR4_5_27kq7kqm68iyh4t.R.flushNeeded();}}
    }
}
