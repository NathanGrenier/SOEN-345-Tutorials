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

/* $Id: ImageLoaderImageIO.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.impl.imageio;

import java.awt.Color;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.spi.IIOServiceProvider;
import javax.imageio.stream.ImageInputStream;
import javax.xml.transform.Source;

import org.w3c.dom.Element;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.image.loader.Image;
import org.apache.xmlgraphics.image.loader.ImageException;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.image.loader.ImageInfo;
import org.apache.xmlgraphics.image.loader.ImageSessionContext;
import org.apache.xmlgraphics.image.loader.impl.AbstractImageLoader;
import org.apache.xmlgraphics.image.loader.impl.ImageBuffered;
import org.apache.xmlgraphics.image.loader.impl.ImageRendered;
import org.apache.xmlgraphics.image.loader.util.ImageUtil;
import org.apache.xmlgraphics.io.XmlSourceUtil;
import org.apache.xmlgraphics.java2d.color.profile.ColorProfileUtil;

/**
 * An ImageLoader implementation based on ImageIO for loading bitmap images.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ImageLoaderImageIO extends AbstractImageLoader {public static class __CLR4_5_293k93km6lb50ed{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,12016,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** logger */
    protected static final Log log = LogFactory.getLog(ImageLoaderImageIO.class);

    private ImageFlavor targetFlavor;

    private static final String PNG_METADATA_NODE = "javax_imageio_png_1.0";

    private static final String JPEG_METADATA_NODE = "javax_imageio_jpeg_image_1.0";

    private static final Set PROVIDERS_IGNORING_ICC = new HashSet();

    /**
     * Main constructor.
     * @param targetFlavor the target flavor
     */
    public ImageLoaderImageIO(ImageFlavor targetFlavor) {try{__CLR4_5_293k93km6lb50ed.R.inc(11792);
        __CLR4_5_293k93km6lb50ed.R.inc(11793);if ((((!(ImageFlavor.BUFFERED_IMAGE.equals(targetFlavor)
                || ImageFlavor.RENDERED_IMAGE.equals(targetFlavor)))&&(__CLR4_5_293k93km6lb50ed.R.iget(11794)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11795)==0&false))) {{
            __CLR4_5_293k93km6lb50ed.R.inc(11796);throw new IllegalArgumentException("Unsupported target ImageFlavor: " + targetFlavor);
        }
        }__CLR4_5_293k93km6lb50ed.R.inc(11797);this.targetFlavor = targetFlavor;
    }finally{__CLR4_5_293k93km6lb50ed.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ImageFlavor getTargetFlavor() {try{__CLR4_5_293k93km6lb50ed.R.inc(11798);
        __CLR4_5_293k93km6lb50ed.R.inc(11799);return this.targetFlavor;
    }finally{__CLR4_5_293k93km6lb50ed.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Image loadImage(ImageInfo info, Map hints, ImageSessionContext session)
            throws ImageException, IOException {try{__CLR4_5_293k93km6lb50ed.R.inc(11800);
        __CLR4_5_293k93km6lb50ed.R.inc(11801);RenderedImage imageData = null;
        __CLR4_5_293k93km6lb50ed.R.inc(11802);IIOException firstException = null;

        __CLR4_5_293k93km6lb50ed.R.inc(11803);IIOMetadata iiometa = (IIOMetadata)info.getCustomObjects().get(
                ImageIOUtil.IMAGEIO_METADATA);
        __CLR4_5_293k93km6lb50ed.R.inc(11804);boolean ignoreMetadata = (iiometa != null);
        __CLR4_5_293k93km6lb50ed.R.inc(11805);boolean providerIgnoresICC = false;

        __CLR4_5_293k93km6lb50ed.R.inc(11806);Source src = session.needSource(info.getOriginalURI());
        __CLR4_5_293k93km6lb50ed.R.inc(11807);ImageInputStream imgStream = ImageUtil.needImageInputStream(src);
        __CLR4_5_293k93km6lb50ed.R.inc(11808);try {
            __CLR4_5_293k93km6lb50ed.R.inc(11809);Iterator iter = ImageIO.getImageReaders(imgStream);
            __CLR4_5_293k93km6lb50ed.R.inc(11810);while ((((iter.hasNext())&&(__CLR4_5_293k93km6lb50ed.R.iget(11811)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11812)==0&false))) {{
                __CLR4_5_293k93km6lb50ed.R.inc(11813);ImageReader reader = (ImageReader)iter.next();
                __CLR4_5_293k93km6lb50ed.R.inc(11814);try {
                    __CLR4_5_293k93km6lb50ed.R.inc(11815);imgStream.mark();
                    __CLR4_5_293k93km6lb50ed.R.inc(11816);reader.setInput(imgStream, false, ignoreMetadata);
                    __CLR4_5_293k93km6lb50ed.R.inc(11817);ImageReadParam param = getParam(reader, hints);
                    __CLR4_5_293k93km6lb50ed.R.inc(11818);final int pageIndex = ImageUtil.needPageIndexFromURI(info.getOriginalURI());
                    __CLR4_5_293k93km6lb50ed.R.inc(11819);try {
//                        if (ImageFlavor.BUFFERED_IMAGE.equals(this.targetFlavor)) {
                            __CLR4_5_293k93km6lb50ed.R.inc(11820);imageData = reader.read(pageIndex, param);
//                        } else {
//                            imageData = reader.read(pageIndex, param);
                            //imageData = reader.readAsRenderedImage(pageIndex, param);
                            //TODO Reenable the above when proper listeners are implemented
                            //to react to late pixel population (so the stream can be closed
                            //properly).
//                        }
                        __CLR4_5_293k93km6lb50ed.R.inc(11821);if ((((iiometa == null)&&(__CLR4_5_293k93km6lb50ed.R.iget(11822)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11823)==0&false))) {{
                            __CLR4_5_293k93km6lb50ed.R.inc(11824);iiometa = reader.getImageMetadata(pageIndex);
                        }
                        }__CLR4_5_293k93km6lb50ed.R.inc(11825);providerIgnoresICC = checkProviderIgnoresICC(reader
                                .getOriginatingProvider());
                        __CLR4_5_293k93km6lb50ed.R.inc(11826);break; //Quit early, we have the image
                    } catch (IndexOutOfBoundsException indexe) {
                        __CLR4_5_293k93km6lb50ed.R.inc(11827);throw new ImageException("Page does not exist. Invalid image index: "
                                + pageIndex);
                    } catch (IllegalArgumentException iae) {
                        //Some codecs like com.sun.imageio.plugins.wbmp.WBMPImageReader throw
                        //IllegalArgumentExceptions when they have trouble parsing the image.
                        __CLR4_5_293k93km6lb50ed.R.inc(11828);throw new ImageException("Error loading image using ImageIO codec", iae);
                    } catch (IIOException iioe) {
                        __CLR4_5_293k93km6lb50ed.R.inc(11829);if ((((firstException == null)&&(__CLR4_5_293k93km6lb50ed.R.iget(11830)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11831)==0&false))) {{
                            __CLR4_5_293k93km6lb50ed.R.inc(11832);firstException = iioe;
                        } }else {{
                            __CLR4_5_293k93km6lb50ed.R.inc(11833);log.debug("non-first error loading image: " + iioe.getMessage());
                        }
                    }}
                    __CLR4_5_293k93km6lb50ed.R.inc(11834);try {
                        //Try fallback for CMYK images
                        __CLR4_5_293k93km6lb50ed.R.inc(11835);BufferedImage bi = getFallbackBufferedImage(reader, pageIndex, param);
                        __CLR4_5_293k93km6lb50ed.R.inc(11836);imageData = bi;
                        __CLR4_5_293k93km6lb50ed.R.inc(11837);firstException = null; //Clear exception after successful fallback attempt
                        __CLR4_5_293k93km6lb50ed.R.inc(11838);break;
                    } catch (IIOException iioe) {
                        //ignore
                    }
                    __CLR4_5_293k93km6lb50ed.R.inc(11839);imgStream.reset();
                } finally {
                    __CLR4_5_293k93km6lb50ed.R.inc(11840);reader.dispose();
                }
            }
        }} finally {
            __CLR4_5_293k93km6lb50ed.R.inc(11841);XmlSourceUtil.closeQuietly(src);
            //TODO Some codecs may do late reading.
        }
        __CLR4_5_293k93km6lb50ed.R.inc(11842);if ((((firstException != null)&&(__CLR4_5_293k93km6lb50ed.R.iget(11843)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11844)==0&false))) {{
            __CLR4_5_293k93km6lb50ed.R.inc(11845);throw new ImageException("Error while loading image: "
                    + firstException.getMessage(), firstException);
        }
        }__CLR4_5_293k93km6lb50ed.R.inc(11846);if ((((imageData == null)&&(__CLR4_5_293k93km6lb50ed.R.iget(11847)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11848)==0&false))) {{
            __CLR4_5_293k93km6lb50ed.R.inc(11849);throw new ImageException("No ImageIO ImageReader found .");
        }

        }__CLR4_5_293k93km6lb50ed.R.inc(11850);ColorModel cm = imageData.getColorModel();

        __CLR4_5_293k93km6lb50ed.R.inc(11851);Color transparentColor = null;
        __CLR4_5_293k93km6lb50ed.R.inc(11852);if ((((cm instanceof IndexColorModel)&&(__CLR4_5_293k93km6lb50ed.R.iget(11853)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11854)==0&false))) {{
            //transparent color will be extracted later from the image
        } }else {{
            __CLR4_5_293k93km6lb50ed.R.inc(11855);if ((((providerIgnoresICC && cm instanceof ComponentColorModel)&&(__CLR4_5_293k93km6lb50ed.R.iget(11856)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11857)==0&false))) {{
                // Apply ICC Profile to Image by creating a new image with a new
                // color model.
                __CLR4_5_293k93km6lb50ed.R.inc(11858);ICC_Profile iccProf = tryToExctractICCProfile(iiometa);
                __CLR4_5_293k93km6lb50ed.R.inc(11859);if ((((iccProf != null)&&(__CLR4_5_293k93km6lb50ed.R.iget(11860)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11861)==0&false))) {{
                    __CLR4_5_293k93km6lb50ed.R.inc(11862);ColorModel cm2 = new ComponentColorModel(
                            new ICC_ColorSpace(iccProf), cm.hasAlpha(), cm
                                    .isAlphaPremultiplied(), cm
                                    .getTransparency(), cm.getTransferType());
                    __CLR4_5_293k93km6lb50ed.R.inc(11863);WritableRaster wr = Raster.createWritableRaster(imageData
                            .getSampleModel(), null);
                    __CLR4_5_293k93km6lb50ed.R.inc(11864);imageData.copyData(wr);
                    __CLR4_5_293k93km6lb50ed.R.inc(11865);try {
                        __CLR4_5_293k93km6lb50ed.R.inc(11866);BufferedImage bi = new BufferedImage(cm2, wr, cm2
                                .isAlphaPremultiplied(), null);
                        __CLR4_5_293k93km6lb50ed.R.inc(11867);imageData = bi;
                        __CLR4_5_293k93km6lb50ed.R.inc(11868);cm = cm2;
                    } catch (IllegalArgumentException iae) {
                        __CLR4_5_293k93km6lb50ed.R.inc(11869);String msg = "Image " + info.getOriginalURI()
                                + " has an incompatible color profile."
                                + " The color profile will be ignored."
                                + "\nColor model of loaded bitmap: " + cm
                                + "\nColor model of color profile: " + cm2;
                        __CLR4_5_293k93km6lb50ed.R.inc(11870);if ((((info.getCustomObjects().get("warningincustomobject") != null)&&(__CLR4_5_293k93km6lb50ed.R.iget(11871)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11872)==0&false))) {{
                            __CLR4_5_293k93km6lb50ed.R.inc(11873);info.getCustomObjects().put("warning", msg);
                        } }else {{
                            __CLR4_5_293k93km6lb50ed.R.inc(11874);log.warn(msg);
                        }
                    }}
                }
            }}

            // ImageIOUtil.dumpMetadataToSystemOut(iiometa);
            // Retrieve the transparent color from the metadata
            }__CLR4_5_293k93km6lb50ed.R.inc(11875);if ((((iiometa != null && iiometa.isStandardMetadataFormatSupported())&&(__CLR4_5_293k93km6lb50ed.R.iget(11876)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11877)==0&false))) {{
                __CLR4_5_293k93km6lb50ed.R.inc(11878);Element metanode = (Element)iiometa.getAsTree(
                        IIOMetadataFormatImpl.standardMetadataFormatName);
                __CLR4_5_293k93km6lb50ed.R.inc(11879);Element dim = ImageIOUtil.getChild(metanode, "Transparency");
                __CLR4_5_293k93km6lb50ed.R.inc(11880);if ((((dim != null)&&(__CLR4_5_293k93km6lb50ed.R.iget(11881)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11882)==0&false))) {{
                    __CLR4_5_293k93km6lb50ed.R.inc(11883);Element child;
                    __CLR4_5_293k93km6lb50ed.R.inc(11884);child = ImageIOUtil.getChild(dim, "TransparentColor");
                    __CLR4_5_293k93km6lb50ed.R.inc(11885);if ((((child != null)&&(__CLR4_5_293k93km6lb50ed.R.iget(11886)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11887)==0&false))) {{
                        __CLR4_5_293k93km6lb50ed.R.inc(11888);String value = child.getAttribute("value");
                        __CLR4_5_293k93km6lb50ed.R.inc(11889);if ((((value.length() == 0)&&(__CLR4_5_293k93km6lb50ed.R.iget(11890)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11891)==0&false))) {{
                            //ignore
                        } }else {__CLR4_5_293k93km6lb50ed.R.inc(11892);if ((((cm.getNumColorComponents() == 1)&&(__CLR4_5_293k93km6lb50ed.R.iget(11893)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11894)==0&false))) {{
                            __CLR4_5_293k93km6lb50ed.R.inc(11895);int gray = Integer.parseInt(value);
                            __CLR4_5_293k93km6lb50ed.R.inc(11896);transparentColor = new Color(gray, gray, gray);
                        } }else {{
                            __CLR4_5_293k93km6lb50ed.R.inc(11897);StringTokenizer st = new StringTokenizer(value);
                            __CLR4_5_293k93km6lb50ed.R.inc(11898);transparentColor = new Color(
                                    Integer.parseInt(st.nextToken()),
                                    Integer.parseInt(st.nextToken()),
                                    Integer.parseInt(st.nextToken()));
                        }
                    }}}
                }}
            }}
        }}

        }__CLR4_5_293k93km6lb50ed.R.inc(11899);if ((((ImageFlavor.BUFFERED_IMAGE.equals(this.targetFlavor))&&(__CLR4_5_293k93km6lb50ed.R.iget(11900)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11901)==0&false))) {{
            __CLR4_5_293k93km6lb50ed.R.inc(11902);return new ImageBuffered(info, (BufferedImage)imageData, transparentColor);
        } }else {{
            __CLR4_5_293k93km6lb50ed.R.inc(11903);return new ImageRendered(info, imageData, transparentColor);
        }
    }}finally{__CLR4_5_293k93km6lb50ed.R.flushNeeded();}}

    private ImageReadParam getParam(ImageReader reader, Map hints) throws IOException {try{__CLR4_5_293k93km6lb50ed.R.inc(11904);
        __CLR4_5_293k93km6lb50ed.R.inc(11905);if ((((hints != null && Boolean.TRUE.equals(hints.get("CMYK")))&&(__CLR4_5_293k93km6lb50ed.R.iget(11906)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11907)==0&false))) {{
            __CLR4_5_293k93km6lb50ed.R.inc(11908);Iterator<ImageTypeSpecifier> types = reader.getImageTypes(0);
            __CLR4_5_293k93km6lb50ed.R.inc(11909);while ((((types.hasNext())&&(__CLR4_5_293k93km6lb50ed.R.iget(11910)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11911)==0&false))) {{
                __CLR4_5_293k93km6lb50ed.R.inc(11912);ImageTypeSpecifier type = types.next();
                __CLR4_5_293k93km6lb50ed.R.inc(11913);if ((((type.getNumComponents() == 4)&&(__CLR4_5_293k93km6lb50ed.R.iget(11914)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11915)==0&false))) {{
                    __CLR4_5_293k93km6lb50ed.R.inc(11916);ImageReadParam param = new ImageReadParam();
                    __CLR4_5_293k93km6lb50ed.R.inc(11917);param.setDestinationType(type);
                    __CLR4_5_293k93km6lb50ed.R.inc(11918);return param;
                }
            }}
        }}
        }__CLR4_5_293k93km6lb50ed.R.inc(11919);return reader.getDefaultReadParam();
    }finally{__CLR4_5_293k93km6lb50ed.R.flushNeeded();}}

    /**
     * Checks if the provider ignores the ICC color profile. This method will
     * assume providers work correctly, and return false if the provider is
     * unknown. This ensures backward-compatibility.
     *
     * @param provider
     *            the ImageIO Provider
     * @return true if we know the provider to be broken and ignore ICC
     *         profiles.
     */
    private boolean checkProviderIgnoresICC(IIOServiceProvider provider) {try{__CLR4_5_293k93km6lb50ed.R.inc(11920);
        // TODO: This information could be cached.
        __CLR4_5_293k93km6lb50ed.R.inc(11921);StringBuffer b = new StringBuffer(provider.getDescription(Locale.ENGLISH));
        __CLR4_5_293k93km6lb50ed.R.inc(11922);b.append('/').append(provider.getVendorName());
        __CLR4_5_293k93km6lb50ed.R.inc(11923);b.append('/').append(provider.getVersion());
        __CLR4_5_293k93km6lb50ed.R.inc(11924);if ((((log.isDebugEnabled())&&(__CLR4_5_293k93km6lb50ed.R.iget(11925)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11926)==0&false))) {{
            __CLR4_5_293k93km6lb50ed.R.inc(11927);log.debug("Image Provider: " + b.toString());
        }
        }__CLR4_5_293k93km6lb50ed.R.inc(11928);return ImageLoaderImageIO.PROVIDERS_IGNORING_ICC.contains(b.toString());
    }finally{__CLR4_5_293k93km6lb50ed.R.flushNeeded();}}

    /**
     * Extract ICC Profile from ImageIO Metadata. This method currently only
     * supports PNG and JPEG metadata.
     *
     * @param iiometa
     *            The ImageIO Metadata
     * @return an ICC Profile or null.
     */
    private ICC_Profile tryToExctractICCProfile(IIOMetadata iiometa) {try{__CLR4_5_293k93km6lb50ed.R.inc(11929);
        __CLR4_5_293k93km6lb50ed.R.inc(11930);ICC_Profile iccProf = null;
        __CLR4_5_293k93km6lb50ed.R.inc(11931);String[] supportedFormats = iiometa.getMetadataFormatNames();
        __CLR4_5_293k93km6lb50ed.R.inc(11932);for (String format : supportedFormats) {{
            __CLR4_5_293k93km6lb50ed.R.inc(11933);Element root = (Element) iiometa.getAsTree(format);
            __CLR4_5_293k93km6lb50ed.R.inc(11934);if ((((PNG_METADATA_NODE.equals(format))&&(__CLR4_5_293k93km6lb50ed.R.iget(11935)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11936)==0&false))) {{
                __CLR4_5_293k93km6lb50ed.R.inc(11937);iccProf = this
                        .tryToExctractICCProfileFromPNGMetadataNode(root);
            } }else {__CLR4_5_293k93km6lb50ed.R.inc(11938);if ((((JPEG_METADATA_NODE.equals(format))&&(__CLR4_5_293k93km6lb50ed.R.iget(11939)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11940)==0&false))) {{
                __CLR4_5_293k93km6lb50ed.R.inc(11941);iccProf = this.tryToExctractICCProfileFromJPEGMetadataNode(root);
            }
        }}}
        }__CLR4_5_293k93km6lb50ed.R.inc(11942);return iccProf;
    }finally{__CLR4_5_293k93km6lb50ed.R.flushNeeded();}}

    private ICC_Profile tryToExctractICCProfileFromPNGMetadataNode(
            Element pngNode) {try{__CLR4_5_293k93km6lb50ed.R.inc(11943);
        __CLR4_5_293k93km6lb50ed.R.inc(11944);ICC_Profile iccProf = null;
        __CLR4_5_293k93km6lb50ed.R.inc(11945);Element iccpNode = ImageIOUtil.getChild(pngNode, "iCCP");
        __CLR4_5_293k93km6lb50ed.R.inc(11946);if ((((iccpNode instanceof IIOMetadataNode)&&(__CLR4_5_293k93km6lb50ed.R.iget(11947)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11948)==0&false))) {{
            __CLR4_5_293k93km6lb50ed.R.inc(11949);IIOMetadataNode imn = (IIOMetadataNode) iccpNode;
            __CLR4_5_293k93km6lb50ed.R.inc(11950);byte[] prof = (byte[]) imn.getUserObject();
            __CLR4_5_293k93km6lb50ed.R.inc(11951);String comp = imn.getAttribute("compressionMethod");
            __CLR4_5_293k93km6lb50ed.R.inc(11952);if (((("deflate".equalsIgnoreCase(comp))&&(__CLR4_5_293k93km6lb50ed.R.iget(11953)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11954)==0&false))) {{
                __CLR4_5_293k93km6lb50ed.R.inc(11955);Inflater decompresser = new Inflater();
                __CLR4_5_293k93km6lb50ed.R.inc(11956);decompresser.setInput(prof);
                __CLR4_5_293k93km6lb50ed.R.inc(11957);byte[] result = new byte[100];
                __CLR4_5_293k93km6lb50ed.R.inc(11958);ByteArrayOutputStream bos = new ByteArrayOutputStream();
                __CLR4_5_293k93km6lb50ed.R.inc(11959);boolean failed = false;
                __CLR4_5_293k93km6lb50ed.R.inc(11960);while ((((!decompresser.finished() && !failed)&&(__CLR4_5_293k93km6lb50ed.R.iget(11961)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11962)==0&false))) {{
                    __CLR4_5_293k93km6lb50ed.R.inc(11963);try {
                        __CLR4_5_293k93km6lb50ed.R.inc(11964);int resultLength = decompresser.inflate(result);
                        __CLR4_5_293k93km6lb50ed.R.inc(11965);bos.write(result, 0, resultLength);
                        __CLR4_5_293k93km6lb50ed.R.inc(11966);if ((((resultLength == 0)&&(__CLR4_5_293k93km6lb50ed.R.iget(11967)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11968)==0&false))) {{
                            // this means more data or an external dictionary is
                            // needed. Both of which are not available, so we
                            // fail.
                            __CLR4_5_293k93km6lb50ed.R.inc(11969);log.debug("Failed to deflate ICC Profile");
                            __CLR4_5_293k93km6lb50ed.R.inc(11970);failed = true;
                        }
                    }} catch (DataFormatException e) {
                        __CLR4_5_293k93km6lb50ed.R.inc(11971);log.debug("Failed to deflate ICC Profile", e);
                        __CLR4_5_293k93km6lb50ed.R.inc(11972);failed = true;
                    }
                }
                }__CLR4_5_293k93km6lb50ed.R.inc(11973);decompresser.end();
                __CLR4_5_293k93km6lb50ed.R.inc(11974);try {
                    __CLR4_5_293k93km6lb50ed.R.inc(11975);iccProf = ColorProfileUtil.getICC_Profile(bos.toByteArray());
                } catch (IllegalArgumentException e) {
                    __CLR4_5_293k93km6lb50ed.R.inc(11976);log.debug("Failed to interpret embedded ICC Profile", e);
                    __CLR4_5_293k93km6lb50ed.R.inc(11977);iccProf = null;
                }
            }
        }}
        }__CLR4_5_293k93km6lb50ed.R.inc(11978);return iccProf;
    }finally{__CLR4_5_293k93km6lb50ed.R.flushNeeded();}}

    private ICC_Profile tryToExctractICCProfileFromJPEGMetadataNode(
            Element jpgNode) {try{__CLR4_5_293k93km6lb50ed.R.inc(11979);
        __CLR4_5_293k93km6lb50ed.R.inc(11980);ICC_Profile iccProf = null;
        __CLR4_5_293k93km6lb50ed.R.inc(11981);Element jfifNode = ImageIOUtil.getChild(jpgNode, "app0JFIF");
        __CLR4_5_293k93km6lb50ed.R.inc(11982);if ((((jfifNode != null)&&(__CLR4_5_293k93km6lb50ed.R.iget(11983)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11984)==0&false))) {{
            __CLR4_5_293k93km6lb50ed.R.inc(11985);Element app2iccNode = ImageIOUtil.getChild(jfifNode, "app2ICC");
            __CLR4_5_293k93km6lb50ed.R.inc(11986);if ((((app2iccNode instanceof IIOMetadataNode)&&(__CLR4_5_293k93km6lb50ed.R.iget(11987)!=0|true))||(__CLR4_5_293k93km6lb50ed.R.iget(11988)==0&false))) {{
                __CLR4_5_293k93km6lb50ed.R.inc(11989);IIOMetadataNode imn = (IIOMetadataNode) app2iccNode;
                __CLR4_5_293k93km6lb50ed.R.inc(11990);iccProf = (ICC_Profile) imn.getUserObject();
            }
        }}
        }__CLR4_5_293k93km6lb50ed.R.inc(11991);return iccProf;
    }finally{__CLR4_5_293k93km6lb50ed.R.flushNeeded();}}

    private BufferedImage getFallbackBufferedImage(ImageReader reader,
            int pageIndex, ImageReadParam param) throws IOException {try{__CLR4_5_293k93km6lb50ed.R.inc(11992);
        //Work-around found at: http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4799903
        //There are some additional ideas there if someone wants to go further.

        // Try reading a Raster (no color conversion).
        __CLR4_5_293k93km6lb50ed.R.inc(11993);Raster raster = reader.readRaster(pageIndex, param);

        // Arbitrarily select a BufferedImage type.
        __CLR4_5_293k93km6lb50ed.R.inc(11994);int imageType;
        __CLR4_5_293k93km6lb50ed.R.inc(11995);int numBands = raster.getNumBands();
        boolean __CLB4_5_2_bool0=false;__CLR4_5_293k93km6lb50ed.R.inc(11996);switch(numBands) {
        case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_293k93km6lb50ed.R.inc(11997);__CLB4_5_2_bool0=true;}
            __CLR4_5_293k93km6lb50ed.R.inc(11998);imageType = BufferedImage.TYPE_BYTE_GRAY;
            __CLR4_5_293k93km6lb50ed.R.inc(11999);break;
        case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_293k93km6lb50ed.R.inc(12000);__CLB4_5_2_bool0=true;}
            __CLR4_5_293k93km6lb50ed.R.inc(12001);imageType = BufferedImage.TYPE_3BYTE_BGR;
            __CLR4_5_293k93km6lb50ed.R.inc(12002);break;
        case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_293k93km6lb50ed.R.inc(12003);__CLB4_5_2_bool0=true;}
            __CLR4_5_293k93km6lb50ed.R.inc(12004);imageType = BufferedImage.TYPE_4BYTE_ABGR;
            __CLR4_5_293k93km6lb50ed.R.inc(12005);break;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_293k93km6lb50ed.R.inc(12006);__CLB4_5_2_bool0=true;}
            __CLR4_5_293k93km6lb50ed.R.inc(12007);throw new UnsupportedOperationException("Unsupported band count: " + numBands);
        }

        // Create a BufferedImage.
        __CLR4_5_293k93km6lb50ed.R.inc(12008);BufferedImage bi = new BufferedImage(raster.getWidth(),
                                  raster.getHeight(),
                                  imageType);

        // Set the image data.
        __CLR4_5_293k93km6lb50ed.R.inc(12009);bi.getRaster().setRect(raster);
        __CLR4_5_293k93km6lb50ed.R.inc(12010);return bi;
    }finally{__CLR4_5_293k93km6lb50ed.R.flushNeeded();}}

    static {try{__CLR4_5_293k93km6lb50ed.R.inc(12011);
        // TODO: This list could be kept in a resource file.
        __CLR4_5_293k93km6lb50ed.R.inc(12012);PROVIDERS_IGNORING_ICC
                .add("Standard PNG image reader/Sun Microsystems, Inc./1.0");
        __CLR4_5_293k93km6lb50ed.R.inc(12013);PROVIDERS_IGNORING_ICC
                .add("Standard PNG image reader/Oracle Corporation/1.0");
        __CLR4_5_293k93km6lb50ed.R.inc(12014);PROVIDERS_IGNORING_ICC
                .add("Standard JPEG Image Reader/Sun Microsystems, Inc./0.5");
        __CLR4_5_293k93km6lb50ed.R.inc(12015);PROVIDERS_IGNORING_ICC
                .add("Standard JPEG Image Reader/Oracle Corporation/0.5");
    }finally{__CLR4_5_293k93km6lb50ed.R.flushNeeded();}}
}
