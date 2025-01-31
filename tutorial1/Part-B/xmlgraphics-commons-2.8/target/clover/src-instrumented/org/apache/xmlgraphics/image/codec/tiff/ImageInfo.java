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

package org.apache.xmlgraphics.image.codec.tiff;

import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.RenderedImage;

final class ImageInfo {public static class __CLR4_5_23u43u4m6lb4yi5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,5096,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Default values
    private static final int DEFAULT_ROWS_PER_STRIP = 8;

    private final int numExtraSamples;
    private final ExtraSamplesType extraSampleType;
    private final ImageType imageType;
    private final int colormapSize;
    private final char[] colormap;
    private final int tileWidth;
    private final int tileHeight;
    private final int numTiles;
    private final long bytesPerRow;
    private final long bytesPerTile;

    private ImageInfo(ImageInfoBuilder builder) {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(4972);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4973);this.numExtraSamples = builder.numExtraSamples;
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4974);this.extraSampleType = builder.extraSampleType;
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4975);this.imageType = builder.imageType;
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4976);this.colormapSize = builder.colormapSize;
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4977);this.colormap = copyColormap(builder.colormap);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4978);this.tileWidth = builder.tileWidth;
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4979);this.tileHeight = builder.tileHeight;
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4980);this.numTiles = builder.numTiles;
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4981);this.bytesPerRow = builder.bytesPerRow;
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4982);this.bytesPerTile = builder.bytesPerTile;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    private static char[] copyColormap(char[] colorMap) {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(4983);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4984);if ((((colorMap == null)&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(4985)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(4986)==0&false))) {{
            __CLR4_5_23u43u4m6lb4yi5.R.inc(4987);return null;
        }
        }__CLR4_5_23u43u4m6lb4yi5.R.inc(4988);char[] copy = new char[colorMap.length];
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4989);System.arraycopy(colorMap, 0, copy, 0, colorMap.length);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4990);return copy;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    private static int getNumberOfExtraSamplesForColorSpace(ColorSpace colorSpace,
            ImageType imageType, int numBands) {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(4991);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(4992);if ((((imageType == ImageType.GENERIC)&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(4993)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(4994)==0&false))) {{
            __CLR4_5_23u43u4m6lb4yi5.R.inc(4995);return numBands - 1;
        } }else {__CLR4_5_23u43u4m6lb4yi5.R.inc(4996);if ((((numBands > 1)&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(4997)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(4998)==0&false))) {{
            __CLR4_5_23u43u4m6lb4yi5.R.inc(4999);return numBands - colorSpace.getNumComponents();
        } }else {{
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5000);return 0;
        }
    }}}finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    private static char[] createColormap(final int sizeOfColormap, byte[] r, byte[] g, byte[] b) {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5001);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5002);int redIndex = 0;
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5003);int greenIndex = sizeOfColormap;
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5004);int blueIndex = 2 * sizeOfColormap;
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5005);char[] colormap = new char[sizeOfColormap * 3];
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5006);for (int i = 0; (((i < sizeOfColormap)&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(5007)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(5008)==0&false)); i++) {{
            // beware of sign extended bytes
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5009);colormap[redIndex++] = convertColorToColormapChar(0xff & r[i]);
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5010);colormap[greenIndex++] = convertColorToColormapChar(0xff & g[i]);
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5011);colormap[blueIndex++] = convertColorToColormapChar(0xff & b[i]);
        }
        }__CLR4_5_23u43u4m6lb4yi5.R.inc(5012);return colormap;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    private static char convertColorToColormapChar(int color) {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5013);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5014);return (char) (color << 8 | color);
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    int getNumberOfExtraSamples() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5015);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5016);return numExtraSamples;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    ExtraSamplesType getExtraSamplesType() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5017);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5018);return extraSampleType;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    ImageType getType() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5019);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5020);return imageType;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    int getColormapSize() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5021);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5022);return colormapSize;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    char[] getColormap() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5023);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5024);return copyColormap(colormap);
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    int getTileWidth() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5025);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5026);return tileWidth;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    int getTileHeight() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5027);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5028);return tileHeight;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    int getNumTiles() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5029);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5030);return numTiles;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    long getBytesPerRow() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5031);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5032);return bytesPerRow;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    long getBytesPerTile() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5033);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5034);return bytesPerTile;
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    static ImageInfo newInstance(RenderedImage im, int dataTypeSize, int numBands,
            ColorModel colorModel, TIFFEncodeParam params) {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5035);
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5036);ImageInfoBuilder builder = new ImageInfoBuilder();
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5037);if ((((colorModel instanceof IndexColorModel)&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(5038)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(5039)==0&false))) {{ // Bilevel or palette
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5040);IndexColorModel indexColorModel = (IndexColorModel) colorModel;
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5041);int colormapSize = indexColorModel.getMapSize();
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5042);byte[] r = new byte[colormapSize];
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5043);indexColorModel.getReds(r);
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5044);byte[] g = new byte[colormapSize];
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5045);indexColorModel.getGreens(g);
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5046);byte[] b = new byte[colormapSize];
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5047);indexColorModel.getBlues(b);

            __CLR4_5_23u43u4m6lb4yi5.R.inc(5048);builder.imageType = ImageType.getTypeFromRGB(colormapSize, r, g, b, dataTypeSize,
                    numBands);
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5049);if ((((builder.imageType == ImageType.PALETTE)&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(5050)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(5051)==0&false))) {{
                __CLR4_5_23u43u4m6lb4yi5.R.inc(5052);builder.colormap = createColormap(colormapSize, r, g, b);
                __CLR4_5_23u43u4m6lb4yi5.R.inc(5053);builder.colormapSize = colormapSize * 3;
            }
        }} }else {__CLR4_5_23u43u4m6lb4yi5.R.inc(5054);if ((((colorModel == null)&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(5055)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(5056)==0&false))) {{
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5057);if ((((dataTypeSize == 1 && numBands == 1)&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(5058)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(5059)==0&false))) {{ // bilevel
                __CLR4_5_23u43u4m6lb4yi5.R.inc(5060);builder.imageType = ImageType.BILEVEL_BLACK_IS_ZERO;
            } }else {{
                __CLR4_5_23u43u4m6lb4yi5.R.inc(5061);builder.imageType = ImageType.GENERIC;
                __CLR4_5_23u43u4m6lb4yi5.R.inc(5062);builder.numExtraSamples = (((numBands > 1 )&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(5063)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(5064)==0&false))? numBands - 1 : 0;
            }
        }} }else {{
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5065);ColorSpace colorSpace = colorModel.getColorSpace();
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5066);builder.imageType = ImageType.getTypeFromColorSpace(colorSpace, params);
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5067);builder.numExtraSamples = getNumberOfExtraSamplesForColorSpace(colorSpace,
                    builder.imageType, numBands);
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5068);builder.extraSampleType = ExtraSamplesType.getValue(colorModel,
                    builder.numExtraSamples);
        }

        // Initialize tile dimensions.
        }}__CLR4_5_23u43u4m6lb4yi5.R.inc(5069);final int width = im.getWidth();
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5070);final int height = im.getHeight();
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5071);if ((((params.getWriteTiled())&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(5072)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(5073)==0&false))) {{
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5074);builder.tileWidth = (((params.getTileWidth() > 0 )&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(5075)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(5076)==0&false))? params.getTileWidth() : width;
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5077);builder.tileHeight = (((params.getTileHeight() > 0 )&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(5078)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(5079)==0&false))? params.getTileHeight() : height;
            // NB: Parentheses are used in this statement for correct rounding.
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5080);builder.numTiles = ((width + builder.tileWidth - 1) / builder.tileWidth)
                    * ((height + builder.tileHeight - 1) / builder.tileHeight);
        } }else {{
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5081);builder.tileWidth = width;
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5082);builder.tileHeight = (((params.getTileHeight() > 0 )&&(__CLR4_5_23u43u4m6lb4yi5.R.iget(5083)!=0|true))||(__CLR4_5_23u43u4m6lb4yi5.R.iget(5084)==0&false))? params.getTileHeight()
                    : DEFAULT_ROWS_PER_STRIP;
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5085);builder.numTiles = (int) Math.ceil(height / (double) builder.tileHeight);
        }
        }__CLR4_5_23u43u4m6lb4yi5.R.inc(5086);builder.setBytesPerRow(dataTypeSize, numBands)
        .setBytesPerTile();
        __CLR4_5_23u43u4m6lb4yi5.R.inc(5087);return builder.build();
    }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

    private static final class ImageInfoBuilder {
        private ImageType imageType = ImageType.UNSUPPORTED;
        private int numExtraSamples;
        private char[] colormap;
        private int colormapSize;
        private ExtraSamplesType extraSampleType = ExtraSamplesType.UNSPECIFIED;
        private int tileWidth;
        private int tileHeight;
        private int numTiles;
        private long bytesPerRow;
        private long bytesPerTile;

        private ImageInfoBuilder setBytesPerRow(int dataTypeSize, int numBands) {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5088);
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5089);bytesPerRow = (long) Math.ceil((dataTypeSize / 8.0) * tileWidth * numBands);
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5090);return this;
        }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

        private ImageInfoBuilder setBytesPerTile() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5091);
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5092);bytesPerTile = bytesPerRow * tileHeight;
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5093);return this;
        }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}

        private ImageInfo build() {try{__CLR4_5_23u43u4m6lb4yi5.R.inc(5094);
            __CLR4_5_23u43u4m6lb4yi5.R.inc(5095);return new ImageInfo(this);
        }finally{__CLR4_5_23u43u4m6lb4yi5.R.flushNeeded();}}
    }
}
