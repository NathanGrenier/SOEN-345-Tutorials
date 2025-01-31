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

/* $Id: TIFFDirectory.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.tiff;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.xmlgraphics.image.codec.util.PropertyUtil;
import org.apache.xmlgraphics.image.codec.util.SeekableStream;

// CSOFF: ConstantName
// CSOFF: EmptyStatement
// CSOFF: InnerAssignment
// CSOFF: LocalVariableName
// CSOFF: MemberName
// CSOFF: MultipleVariableDeclarations
// CSOFF: NeedBraces
// CSOFF: ParameterName
// CSOFF: WhitespaceAround

/**
 * A class representing an Image File Directory (IFD) from a TIFF 6.0
 * stream.  The TIFF file format is described in more detail in the
 * comments for the TIFFDescriptor class.
 *
 * <p> A TIFF IFD consists of a set of TIFFField tags.  Methods are
 * provided to query the set of tags and to obtain the raw field
 * array.  In addition, convenience methods are provided for acquiring
 * the values of tags that contain a single value that fits into a
 * byte, int, long, float, or double.
 *
 * <p> Every TIFF file is made up of one or more public IFDs that are
 * joined in a linked list, rooted in the file header.  A file may
 * also contain so-called private IFDs that are referenced from
 * tag data and do not appear in the main list.
 *
 * <p><b> This class is not a committed part of the JAI API.  It may
 * be removed or changed in future releases of JAI.</b>
 *
 * @see TIFFField
 * @version $Id: TIFFDirectory.java 1732018 2016-02-24 04:51:06Z gadams $
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TIFFDirectory implements Serializable {public static class __CLR4_5_23zg3zgm6lb4yko{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,5469,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 2007844835460959003L;
    /** A boolean storing the endianness of the stream. */
    boolean isBigEndian;

    /** The number of entries in the IFD. */
    int numEntries;

    /** An array of TIFFFields. */
    TIFFField[] fields;

    /** A Hashtable indexing the fields by tag number. */
    Map fieldIndex = new HashMap();

    /** The offset of this IFD. */
    long ifdOffset = 8;

    /** The offset of the next IFD. */
    long nextIFDOffset;

    /** The default constructor. */
    TIFFDirectory() {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5164); }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    private static boolean isValidEndianTag(int endian) {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5165);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5166);return ((endian == 0x4949) || (endian == 0x4d4d));
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Constructs a TIFFDirectory from a SeekableStream.
     * The directory parameter specifies which directory to read from
     * the linked list present in the stream; directory 0 is normally
     * read but it is possible to store multiple images in a single
     * TIFF file by maintaing multiple directories.
     *
     * @param stream a SeekableStream to read from.
     * @param directory the index of the directory to read.
     */
    public TIFFDirectory(SeekableStream stream, int directory)
        throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5167);

        __CLR4_5_23zg3zgm6lb4yko.R.inc(5168);long globalSaveOffset = stream.getFilePointer();
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5169);long ifdOffset;

        // Read the TIFF header
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5170);stream.seek(0L);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5171);int endian = stream.readUnsignedShort();
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5172);if ((((!isValidEndianTag(endian))&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5173)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5174)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5175);throw new IllegalArgumentException(PropertyUtil.getString("TIFFDirectory1"));
        }
        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5176);isBigEndian = (endian == 0x4d4d);

        __CLR4_5_23zg3zgm6lb4yko.R.inc(5177);int magic = readUnsignedShort(stream);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5178);if ((((magic != 42)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5179)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5180)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5181);throw new IllegalArgumentException(PropertyUtil.getString("TIFFDirectory2"));
        }

        // Get the initial ifd offset as an unsigned int (using a long)
        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5182);ifdOffset = readUnsignedInt(stream);

        __CLR4_5_23zg3zgm6lb4yko.R.inc(5183);for (int i = 0; (((i < directory)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5184)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5185)==0&false)); i++) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5186);if ((((ifdOffset == 0L)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5187)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5188)==0&false))) {{
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5189);throw new IllegalArgumentException(PropertyUtil.getString("TIFFDirectory3"));
            }

            }__CLR4_5_23zg3zgm6lb4yko.R.inc(5190);stream.seek(ifdOffset);
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5191);long entries = readUnsignedShort(stream);
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5192);stream.skip(12 * entries);

            __CLR4_5_23zg3zgm6lb4yko.R.inc(5193);ifdOffset = readUnsignedInt(stream);
        }
        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5194);if ((((ifdOffset == 0L)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5195)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5196)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5197);throw new IllegalArgumentException(PropertyUtil.getString("TIFFDirectory3"));
        }

        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5198);stream.seek(ifdOffset);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5199);initialize(stream);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5200);stream.seek(globalSaveOffset);
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Constructs a TIFFDirectory by reading a SeekableStream.
     * The ifd_offset parameter specifies the stream offset from which
     * to begin reading; this mechanism is sometimes used to store
     * private IFDs within a TIFF file that are not part of the normal
     * sequence of IFDs.
     *
     * @param stream a SeekableStream to read from.
     * @param ifdOffset the long byte offset of the directory.
     * @param directory the index of the directory to read beyond the
     *        one at the current stream offset; zero indicates the IFD
     *        at the current offset.
     */
    public TIFFDirectory(SeekableStream stream, long ifdOffset, int directory)
        throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5201);

        __CLR4_5_23zg3zgm6lb4yko.R.inc(5202);long globalSaveOffset = stream.getFilePointer();
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5203);stream.seek(0L);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5204);int endian = stream.readUnsignedShort();
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5205);if ((((!isValidEndianTag(endian))&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5206)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5207)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5208);throw new IllegalArgumentException(PropertyUtil.getString("TIFFDirectory1"));
        }
        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5209);isBigEndian = (endian == 0x4d4d);

        // Seek to the first IFD.
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5210);stream.seek(ifdOffset);

        // Seek to desired IFD if necessary.
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5211);int dirNum = 0;
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5212);while ((((dirNum < directory)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5213)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5214)==0&false))) {{
            // Get the number of fields in the current IFD.
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5215);long numEntries = readUnsignedShort(stream);

            // Skip to the next IFD offset value field.
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5216);stream.seek(ifdOffset + 12 * numEntries);

            // Read the offset to the next IFD beyond this one.
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5217);ifdOffset = readUnsignedInt(stream);

            // Seek to the next IFD.
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5218);stream.seek(ifdOffset);

            // Increment the directory.
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5219);dirNum++;
        }

        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5220);initialize(stream);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5221);stream.seek(globalSaveOffset);
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    private static final int[] SIZE_OF_TYPE = {
        0, //  0 = n/a
        1, //  1 = byte
        1, //  2 = ascii
        2, //  3 = short
        4, //  4 = long
        8, //  5 = rational
        1, //  6 = sbyte
        1, //  7 = undefined
        2, //  8 = sshort
        4, //  9 = slong
        8, // 10 = srational
        4, // 11 = float
        8  // 12 = double
    };

    private void initialize(SeekableStream stream) throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5222);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5223);long nextTagOffset;
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5224);int i;
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5225);int j;

        __CLR4_5_23zg3zgm6lb4yko.R.inc(5226);ifdOffset = stream.getFilePointer();

        __CLR4_5_23zg3zgm6lb4yko.R.inc(5227);numEntries = readUnsignedShort(stream);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5228);fields = new TIFFField[numEntries];

        __CLR4_5_23zg3zgm6lb4yko.R.inc(5229);for (i = 0; (((i < numEntries)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5230)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5231)==0&false)); i++) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5232);int tag = readUnsignedShort(stream);
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5233);int type = readUnsignedShort(stream);
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5234);int count = (int)(readUnsignedInt(stream));
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5235);int value = 0;

            // The place to return to to read the next tag
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5236);nextTagOffset = stream.getFilePointer() + 4;

            __CLR4_5_23zg3zgm6lb4yko.R.inc(5237);try {
                // If the tag data can't fit in 4 bytes, the next 4 bytes
                // contain the starting offset of the data
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5238);if ((((count * SIZE_OF_TYPE[type] > 4)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5239)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5240)==0&false))) {{
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5241);value = (int)(readUnsignedInt(stream));
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5242);stream.seek(value);
                }
            }} catch (ArrayIndexOutOfBoundsException ae) {
                // System.err.println(tag + " " + "TIFFDirectory4"); TODO - log this message
                // if the data type is unknown we should skip this TIFF Field
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5243);stream.seek(nextTagOffset);
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5244);continue;
            }

            __CLR4_5_23zg3zgm6lb4yko.R.inc(5245);fieldIndex.put(tag, i);
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5246);Object obj = null;

            boolean __CLB4_5_2_bool0=false;__CLR4_5_23zg3zgm6lb4yko.R.inc(5247);switch (type) {
            case TIFFField.TIFF_BYTE:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5248);__CLB4_5_2_bool0=true;}
            case TIFFField.TIFF_SBYTE:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5249);__CLB4_5_2_bool0=true;}
            case TIFFField.TIFF_UNDEFINED:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5250);__CLB4_5_2_bool0=true;}
            case TIFFField.TIFF_ASCII:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5251);__CLB4_5_2_bool0=true;}
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5252);byte[] bvalues = new byte[count];
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5253);stream.readFully(bvalues, 0, count);

                __CLR4_5_23zg3zgm6lb4yko.R.inc(5254);if ((((type == TIFFField.TIFF_ASCII)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5255)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5256)==0&false))) {{

                    // Can be multiple strings
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5257);int index = 0;
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5258);int prevIndex = 0;
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5259);List v = new ArrayList();

                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5260);while ((((index < count)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5261)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5262)==0&false))) {{

                        __CLR4_5_23zg3zgm6lb4yko.R.inc(5263);while (((((index < count) && (bvalues[index++] != 0))&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5264)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5265)==0&false))) {{
                            // NOP
                        }

                        // When we encountered zero, means one string has ended
                        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5266);v.add(new String(bvalues, prevIndex,
                                         (index - prevIndex), "UTF-8"));
                        __CLR4_5_23zg3zgm6lb4yko.R.inc(5267);prevIndex = index;
                    }

                    }__CLR4_5_23zg3zgm6lb4yko.R.inc(5268);count = v.size();
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5269);String[] strings = new String[count];
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5270);v.toArray(strings);
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5271);obj = strings;
                } }else {{
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5272);obj = bvalues;
                }

                }__CLR4_5_23zg3zgm6lb4yko.R.inc(5273);break;

            case TIFFField.TIFF_SHORT:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5274);__CLB4_5_2_bool0=true;}
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5275);char[] cvalues = new char[count];
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5276);for (j = 0; (((j < count)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5277)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5278)==0&false)); j++) {{
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5279);cvalues[j] = (char)(readUnsignedShort(stream));
                }
                }__CLR4_5_23zg3zgm6lb4yko.R.inc(5280);obj = cvalues;
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5281);break;

            case TIFFField.TIFF_LONG:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5282);__CLB4_5_2_bool0=true;}
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5283);long[] lvalues = new long[count];
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5284);for (j = 0; (((j < count)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5285)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5286)==0&false)); j++) {{
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5287);lvalues[j] = readUnsignedInt(stream);
                }
                }__CLR4_5_23zg3zgm6lb4yko.R.inc(5288);obj = lvalues;
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5289);break;

            case TIFFField.TIFF_RATIONAL:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5290);__CLB4_5_2_bool0=true;}
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5291);long[][] llvalues = new long[count][2];
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5292);for (j = 0; (((j < count)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5293)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5294)==0&false)); j++) {{
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5295);llvalues[j][0] = readUnsignedInt(stream);
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5296);llvalues[j][1] = readUnsignedInt(stream);
                }
                }__CLR4_5_23zg3zgm6lb4yko.R.inc(5297);obj = llvalues;
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5298);break;

            case TIFFField.TIFF_SSHORT:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5299);__CLB4_5_2_bool0=true;}
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5300);short[] svalues = new short[count];
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5301);for (j = 0; (((j < count)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5302)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5303)==0&false)); j++) {{
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5304);svalues[j] = readShort(stream);
                }
                }__CLR4_5_23zg3zgm6lb4yko.R.inc(5305);obj = svalues;
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5306);break;

            case TIFFField.TIFF_SLONG:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5307);__CLB4_5_2_bool0=true;}
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5308);int[] ivalues = new int[count];
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5309);for (j = 0; (((j < count)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5310)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5311)==0&false)); j++) {{
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5312);ivalues[j] = readInt(stream);
                }
                }__CLR4_5_23zg3zgm6lb4yko.R.inc(5313);obj = ivalues;
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5314);break;

            case TIFFField.TIFF_SRATIONAL:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5315);__CLB4_5_2_bool0=true;}
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5316);int[][] iivalues = new int[count][2];
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5317);for (j = 0; (((j < count)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5318)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5319)==0&false)); j++) {{
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5320);iivalues[j][0] = readInt(stream);
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5321);iivalues[j][1] = readInt(stream);
                }
                }__CLR4_5_23zg3zgm6lb4yko.R.inc(5322);obj = iivalues;
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5323);break;

            case TIFFField.TIFF_FLOAT:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5324);__CLB4_5_2_bool0=true;}
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5325);float[] fvalues = new float[count];
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5326);for (j = 0; (((j < count)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5327)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5328)==0&false)); j++) {{
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5329);fvalues[j] = readFloat(stream);
                }
                }__CLR4_5_23zg3zgm6lb4yko.R.inc(5330);obj = fvalues;
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5331);break;

            case TIFFField.TIFF_DOUBLE:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5332);__CLB4_5_2_bool0=true;}
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5333);double[] dvalues = new double[count];
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5334);for (j = 0; (((j < count)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5335)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5336)==0&false)); j++) {{
                    __CLR4_5_23zg3zgm6lb4yko.R.inc(5337);dvalues[j] = readDouble(stream);
                }
                }__CLR4_5_23zg3zgm6lb4yko.R.inc(5338);obj = dvalues;
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5339);break;

            default:if (!__CLB4_5_2_bool0) {__CLR4_5_23zg3zgm6lb4yko.R.inc(5340);__CLB4_5_2_bool0=true;}
                __CLR4_5_23zg3zgm6lb4yko.R.inc(5341);throw new RuntimeException(PropertyUtil.getString("TIFFDirectory0"));
            }

            __CLR4_5_23zg3zgm6lb4yko.R.inc(5342);fields[i] = new TIFFField(tag, type, count, obj);
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5343);stream.seek(nextTagOffset);
        }

        // Read the offset of the next IFD.
        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5344);nextIFDOffset = readUnsignedInt(stream);
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /** Returns the number of directory entries. */
    public int getNumEntries() {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5345);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5346);return numEntries;
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns the value of a given tag as a TIFFField,
     * or null if the tag is not present.
     */
    public TIFFField getField(int tag) {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5347);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5348);Integer i = (Integer)fieldIndex.get(tag);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5349);if ((((i == null)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5350)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5351)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5352);return null;
        } }else {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5353);return fields[i];
        }
    }}finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns true if a tag appears in the directory.
     */
    public boolean isTagPresent(int tag) {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5354);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5355);return fieldIndex.containsKey(tag);
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns an ordered array of ints indicating the tag
     * values.
     */
    public int[] getTags() {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5356);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5357);int[] tags = new int[fieldIndex.size()];
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5358);Iterator iter = fieldIndex.keySet().iterator();
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5359);int i = 0;

        __CLR4_5_23zg3zgm6lb4yko.R.inc(5360);while ((((iter.hasNext())&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5361)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5362)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5363);tags[i++] = (Integer) iter.next();
        }

        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5364);return tags;
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns an array of TIFFFields containing all the fields
     * in this directory.
     */
    public TIFFField[] getFields() {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5365);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5366);return fields;
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns the value of a particular index of a given tag as a
     * byte.  The caller is responsible for ensuring that the tag is
     * present and has type TIFFField.TIFF_SBYTE, TIFF_BYTE, or
     * TIFF_UNDEFINED.
     */
    public byte getFieldAsByte(int tag, int index) {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5367);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5368);Integer i = (Integer)fieldIndex.get(tag);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5369);byte [] b = (fields[i]).getAsBytes();
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5370);return b[index];
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns the value of index 0 of a given tag as a
     * byte.  The caller is responsible for ensuring that the tag is
     * present and has  type TIFFField.TIFF_SBYTE, TIFF_BYTE, or
     * TIFF_UNDEFINED.
     */
    public byte getFieldAsByte(int tag) {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5371);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5372);return getFieldAsByte(tag, 0);
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns the value of a particular index of a given tag as a
     * long.  The caller is responsible for ensuring that the tag is
     * present and has type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED,
     * TIFF_SHORT, TIFF_SSHORT, TIFF_SLONG or TIFF_LONG.
     */
    public long getFieldAsLong(int tag, int index) {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5373);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5374);Integer i = (Integer)fieldIndex.get(tag);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5375);return (fields[i]).getAsLong(index);
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns the value of index 0 of a given tag as a
     * long.  The caller is responsible for ensuring that the tag is
     * present and has type TIFF_BYTE, TIFF_SBYTE, TIFF_UNDEFINED,
     * TIFF_SHORT, TIFF_SSHORT, TIFF_SLONG or TIFF_LONG.
     */
    public long getFieldAsLong(int tag) {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5376);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5377);return getFieldAsLong(tag, 0);
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns the value of a particular index of a given tag as a
     * float.  The caller is responsible for ensuring that the tag is
     * present and has numeric type (all but TIFF_UNDEFINED and
     * TIFF_ASCII).
     */
    public float getFieldAsFloat(int tag, int index) {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5378);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5379);Integer i = (Integer)fieldIndex.get(tag);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5380);return fields[i].getAsFloat(index);
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns the value of index 0 of a given tag as a float.  The
     * caller is responsible for ensuring that the tag is present and
     * has numeric type (all but TIFF_UNDEFINED and TIFF_ASCII).
     */
    public float getFieldAsFloat(int tag) {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5381);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5382);return getFieldAsFloat(tag, 0);
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns the value of a particular index of a given tag as a
     * double.  The caller is responsible for ensuring that the tag is
     * present and has numeric type (all but TIFF_UNDEFINED and
     * TIFF_ASCII).
     */
    public double getFieldAsDouble(int tag, int index) {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5383);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5384);Integer i = (Integer)fieldIndex.get(tag);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5385);return fields[i].getAsDouble(index);
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns the value of index 0 of a given tag as a double.  The
     * caller is responsible for ensuring that the tag is present and
     * has numeric type (all but TIFF_UNDEFINED and TIFF_ASCII).
     */
    public double getFieldAsDouble(int tag) {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5386);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5387);return getFieldAsDouble(tag, 0);
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    // Methods to read primitive data types from the stream

    private short readShort(SeekableStream stream)
        throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5388);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5389);if ((((isBigEndian)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5390)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5391)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5392);return stream.readShort();
        } }else {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5393);return stream.readShortLE();
        }
    }}finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    private int readUnsignedShort(SeekableStream stream)
        throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5394);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5395);if ((((isBigEndian)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5396)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5397)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5398);return stream.readUnsignedShort();
        } }else {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5399);return stream.readUnsignedShortLE();
        }
    }}finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    private int readInt(SeekableStream stream)
        throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5400);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5401);if ((((isBigEndian)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5402)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5403)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5404);return stream.readInt();
        } }else {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5405);return stream.readIntLE();
        }
    }}finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    private long readUnsignedInt(SeekableStream stream)
        throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5406);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5407);if ((((isBigEndian)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5408)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5409)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5410);return stream.readUnsignedInt();
        } }else {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5411);return stream.readUnsignedIntLE();
        }
    }}finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

//    private long readLong(SeekableStream stream)
//        throws IOException {
//        if (isBigEndian) {
//            return stream.readLong();
//        } else {
//            return stream.readLongLE();
//        }
//    }

    private float readFloat(SeekableStream stream)
        throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5412);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5413);if ((((isBigEndian)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5414)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5415)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5416);return stream.readFloat();
        } }else {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5417);return stream.readFloatLE();
        }
    }}finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    private double readDouble(SeekableStream stream)
        throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5418);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5419);if ((((isBigEndian)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5420)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5421)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5422);return stream.readDouble();
        } }else {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5423);return stream.readDoubleLE();
        }
    }}finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    private static int readUnsignedShort(SeekableStream stream,
                                         boolean isBigEndian)
        throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5424);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5425);if ((((isBigEndian)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5426)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5427)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5428);return stream.readUnsignedShort();
        } }else {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5429);return stream.readUnsignedShortLE();
        }
    }}finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    private static long readUnsignedInt(SeekableStream stream,
                                        boolean isBigEndian)
        throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5430);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5431);if ((((isBigEndian)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5432)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5433)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5434);return stream.readUnsignedInt();
        } }else {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5435);return stream.readUnsignedIntLE();
        }
    }}finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    // Utilities

    /**
     * Returns the number of image directories (subimages) stored in a
     * given TIFF file, represented by a <code>SeekableStream</code>.
     */
    public static int getNumDirectories(SeekableStream stream)
        throws IOException {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5436);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5437);long pointer = stream.getFilePointer(); // Save stream pointer

        __CLR4_5_23zg3zgm6lb4yko.R.inc(5438);stream.seek(0L);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5439);int endian = stream.readUnsignedShort();
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5440);if ((((!isValidEndianTag(endian))&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5441)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5442)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5443);throw new IllegalArgumentException(PropertyUtil.getString("TIFFDirectory1"));
        }
        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5444);boolean isBigEndian = (endian == 0x4d4d);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5445);int magic = readUnsignedShort(stream, isBigEndian);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5446);if ((((magic != 42)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5447)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5448)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5449);throw new IllegalArgumentException(PropertyUtil.getString("TIFFDirectory2"));
        }

        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5450);stream.seek(4L);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5451);long offset = readUnsignedInt(stream, isBigEndian);

        __CLR4_5_23zg3zgm6lb4yko.R.inc(5452);int numDirectories = 0;
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5453);while ((((offset != 0L)&&(__CLR4_5_23zg3zgm6lb4yko.R.iget(5454)!=0|true))||(__CLR4_5_23zg3zgm6lb4yko.R.iget(5455)==0&false))) {{
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5456);++numDirectories;

            __CLR4_5_23zg3zgm6lb4yko.R.inc(5457);stream.seek(offset);
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5458);long entries = readUnsignedShort(stream, isBigEndian);
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5459);stream.skip(12 * entries);
            __CLR4_5_23zg3zgm6lb4yko.R.inc(5460);offset = readUnsignedInt(stream, isBigEndian);
        }

        }__CLR4_5_23zg3zgm6lb4yko.R.inc(5461);stream.seek(pointer); // Reset stream pointer
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5462);return numDirectories;
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns a boolean indicating whether the byte order used in the
     * the TIFF file is big-endian.  That is, whether the byte order is from
     * the most significant to the least significant.
     */
    public boolean isBigEndian() {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5463);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5464);return isBigEndian;
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns the offset of the IFD corresponding to this
     * <code>TIFFDirectory</code>.
     */
    public long getIFDOffset() {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5465);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5466);return ifdOffset;
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}

    /**
     * Returns the offset of the next IFD after the IFD corresponding to this
     * <code>TIFFDirectory</code>.
     */
    public long getNextIFDOffset() {try{__CLR4_5_23zg3zgm6lb4yko.R.inc(5467);
        __CLR4_5_23zg3zgm6lb4yko.R.inc(5468);return nextIFDOffset;
    }finally{__CLR4_5_23zg3zgm6lb4yko.R.flushNeeded();}}
}
