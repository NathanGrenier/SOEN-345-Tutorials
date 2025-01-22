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

/* $Id: TIFFLZWDecoder.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.image.codec.tiff;

import org.apache.xmlgraphics.image.codec.util.PropertyUtil;

// CSOFF: InnerAssignment
// CSOFF: MultipleVariableDeclarations
// CSOFF: OneStatementPerLine
// CSOFF: OperatorWrap
// CSOFF: WhitespaceAround

/**
 * A class for performing LZW decoding.
 */
public class TIFFLZWDecoder {public static class __CLR4_5_26hg6hgm68iygvo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,8526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    byte[][] stringTable;
    byte[] data;
    byte[] uncompData;
    int tableIndex;
    int bitsToGet = 9;
    int bytePointer;
//    int bitPointer;
    int dstIndex;
    int w;
    int predictor;
    int samplesPerPixel;
    int nextData;
    int nextBits;

    int[] andTable = {
        511,
        1023,
        2047,
        4095
    };

    public TIFFLZWDecoder(int w, int predictor, int samplesPerPixel) {try{__CLR4_5_26hg6hgm68iygvo.R.inc(8404);
        __CLR4_5_26hg6hgm68iygvo.R.inc(8405);this.w = w;
        __CLR4_5_26hg6hgm68iygvo.R.inc(8406);this.predictor = predictor;
        __CLR4_5_26hg6hgm68iygvo.R.inc(8407);this.samplesPerPixel = samplesPerPixel;
    }finally{__CLR4_5_26hg6hgm68iygvo.R.flushNeeded();}}

    /**
     * Method to decode LZW compressed data.
     *
     * @param data            The compressed data.
     * @param uncompData      Array to return the uncompressed data in.
     * @param h               The number of rows the compressed data contains.
     */
    public byte[] decode(byte[] data, byte[] uncompData, int h) {try{__CLR4_5_26hg6hgm68iygvo.R.inc(8408);

        __CLR4_5_26hg6hgm68iygvo.R.inc(8409);if ((((data[0] == (byte)0x00 && data[1] == (byte)0x01)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8410)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8411)==0&false))) {{
            __CLR4_5_26hg6hgm68iygvo.R.inc(8412);throw new UnsupportedOperationException(PropertyUtil.getString("TIFFLZWDecoder0"));
        }

        }__CLR4_5_26hg6hgm68iygvo.R.inc(8413);initializeStringTable();

        __CLR4_5_26hg6hgm68iygvo.R.inc(8414);this.data = data;
//        this.h = h;
        __CLR4_5_26hg6hgm68iygvo.R.inc(8415);this.uncompData = uncompData;

        // Initialize pointers
        __CLR4_5_26hg6hgm68iygvo.R.inc(8416);bytePointer = 0;
//        bitPointer = 0;
        __CLR4_5_26hg6hgm68iygvo.R.inc(8417);dstIndex = 0;


        __CLR4_5_26hg6hgm68iygvo.R.inc(8418);nextData = 0;
        __CLR4_5_26hg6hgm68iygvo.R.inc(8419);nextBits = 0;

        __CLR4_5_26hg6hgm68iygvo.R.inc(8420);int code;
        __CLR4_5_26hg6hgm68iygvo.R.inc(8421);int oldCode = 0;
        __CLR4_5_26hg6hgm68iygvo.R.inc(8422);byte[] string;

        __CLR4_5_26hg6hgm68iygvo.R.inc(8423);while ((code = getNextCode()) != 257
                && dstIndex != uncompData.length) {{

            __CLR4_5_26hg6hgm68iygvo.R.inc(8426);if ((((code == 256)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8427)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8428)==0&false))) {{

                __CLR4_5_26hg6hgm68iygvo.R.inc(8429);initializeStringTable();
                __CLR4_5_26hg6hgm68iygvo.R.inc(8430);code = getNextCode();

                __CLR4_5_26hg6hgm68iygvo.R.inc(8431);if ((((code == 257)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8432)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8433)==0&false))) {{
                    __CLR4_5_26hg6hgm68iygvo.R.inc(8434);break;
                }

                }__CLR4_5_26hg6hgm68iygvo.R.inc(8435);writeString(stringTable[code]);
                __CLR4_5_26hg6hgm68iygvo.R.inc(8436);oldCode = code;

            } }else {{

                __CLR4_5_26hg6hgm68iygvo.R.inc(8437);if ((((code < tableIndex)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8438)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8439)==0&false))) {{

                    __CLR4_5_26hg6hgm68iygvo.R.inc(8440);string = stringTable[code];

                    __CLR4_5_26hg6hgm68iygvo.R.inc(8441);writeString(string);
                    __CLR4_5_26hg6hgm68iygvo.R.inc(8442);addStringToTable(stringTable[oldCode], string[0]);
                    __CLR4_5_26hg6hgm68iygvo.R.inc(8443);oldCode = code;

                } }else {{

                    __CLR4_5_26hg6hgm68iygvo.R.inc(8444);string = stringTable[oldCode];
                    __CLR4_5_26hg6hgm68iygvo.R.inc(8445);string = composeString(string, string[0]);
                    __CLR4_5_26hg6hgm68iygvo.R.inc(8446);writeString(string);
                    __CLR4_5_26hg6hgm68iygvo.R.inc(8447);addStringToTable(string);
                    __CLR4_5_26hg6hgm68iygvo.R.inc(8448);oldCode = code;
                }

            }}

        }}

        // Horizontal Differencing Predictor
        }__CLR4_5_26hg6hgm68iygvo.R.inc(8449);if ((((predictor == 2)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8450)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8451)==0&false))) {{

            __CLR4_5_26hg6hgm68iygvo.R.inc(8452);int count;
            __CLR4_5_26hg6hgm68iygvo.R.inc(8453);for (int j = 0; (((j < h)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8454)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8455)==0&false)); j++) {{

                __CLR4_5_26hg6hgm68iygvo.R.inc(8456);count = samplesPerPixel * (j * w + 1);

                __CLR4_5_26hg6hgm68iygvo.R.inc(8457);for (int i = samplesPerPixel; (((i < w * samplesPerPixel)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8458)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8459)==0&false)); i++) {{

                    __CLR4_5_26hg6hgm68iygvo.R.inc(8460);uncompData[count] += uncompData[count - samplesPerPixel];
                    __CLR4_5_26hg6hgm68iygvo.R.inc(8461);count++;
                }
            }}
        }}

        }__CLR4_5_26hg6hgm68iygvo.R.inc(8462);return uncompData;
    }finally{__CLR4_5_26hg6hgm68iygvo.R.flushNeeded();}}


    /**
     * Initialize the string table.
     */
    public void initializeStringTable() {try{__CLR4_5_26hg6hgm68iygvo.R.inc(8463);

        __CLR4_5_26hg6hgm68iygvo.R.inc(8464);stringTable = new byte[4096][];

        __CLR4_5_26hg6hgm68iygvo.R.inc(8465);for (int i = 0; (((i < 256)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8466)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8467)==0&false)); i++) {{
            __CLR4_5_26hg6hgm68iygvo.R.inc(8468);stringTable[i] = new byte[1];
            __CLR4_5_26hg6hgm68iygvo.R.inc(8469);stringTable[i][0] = (byte)i;
        }

        }__CLR4_5_26hg6hgm68iygvo.R.inc(8470);tableIndex = 258;
        __CLR4_5_26hg6hgm68iygvo.R.inc(8471);bitsToGet = 9;
    }finally{__CLR4_5_26hg6hgm68iygvo.R.flushNeeded();}}

    /**
     * Write out the string just uncompressed.
     */
    public void writeString(byte[] string) {try{__CLR4_5_26hg6hgm68iygvo.R.inc(8472);

        __CLR4_5_26hg6hgm68iygvo.R.inc(8473);for (byte aString : string) {{
            __CLR4_5_26hg6hgm68iygvo.R.inc(8474);uncompData[dstIndex++] = aString;
        }
    }}finally{__CLR4_5_26hg6hgm68iygvo.R.flushNeeded();}}

    /**
     * Add a new string to the string table.
     */
    public void addStringToTable(byte[] oldString, byte newString) {try{__CLR4_5_26hg6hgm68iygvo.R.inc(8475);
        __CLR4_5_26hg6hgm68iygvo.R.inc(8476);int length = oldString.length;
        __CLR4_5_26hg6hgm68iygvo.R.inc(8477);byte[] string = new byte[length + 1];
        __CLR4_5_26hg6hgm68iygvo.R.inc(8478);System.arraycopy(oldString, 0, string, 0, length);
        __CLR4_5_26hg6hgm68iygvo.R.inc(8479);string[length] = newString;

        // Add this new String to the table
        __CLR4_5_26hg6hgm68iygvo.R.inc(8480);stringTable[tableIndex++] = string;

        __CLR4_5_26hg6hgm68iygvo.R.inc(8481);if ((((tableIndex == 511)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8482)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8483)==0&false))) {{
            __CLR4_5_26hg6hgm68iygvo.R.inc(8484);bitsToGet = 10;
        } }else {__CLR4_5_26hg6hgm68iygvo.R.inc(8485);if ((((tableIndex == 1023)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8486)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8487)==0&false))) {{
            __CLR4_5_26hg6hgm68iygvo.R.inc(8488);bitsToGet = 11;
        } }else {__CLR4_5_26hg6hgm68iygvo.R.inc(8489);if ((((tableIndex == 2047)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8490)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8491)==0&false))) {{
            __CLR4_5_26hg6hgm68iygvo.R.inc(8492);bitsToGet = 12;
        }
    }}}}finally{__CLR4_5_26hg6hgm68iygvo.R.flushNeeded();}}

    /**
     * Add a new string to the string table.
     */
    public void addStringToTable(byte[] string) {try{__CLR4_5_26hg6hgm68iygvo.R.inc(8493);

        // Add this new String to the table
        __CLR4_5_26hg6hgm68iygvo.R.inc(8494);stringTable[tableIndex++] = string;

        __CLR4_5_26hg6hgm68iygvo.R.inc(8495);if ((((tableIndex == 511)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8496)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8497)==0&false))) {{
            __CLR4_5_26hg6hgm68iygvo.R.inc(8498);bitsToGet = 10;
        } }else {__CLR4_5_26hg6hgm68iygvo.R.inc(8499);if ((((tableIndex == 1023)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8500)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8501)==0&false))) {{
            __CLR4_5_26hg6hgm68iygvo.R.inc(8502);bitsToGet = 11;
        } }else {__CLR4_5_26hg6hgm68iygvo.R.inc(8503);if ((((tableIndex == 2047)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8504)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8505)==0&false))) {{
            __CLR4_5_26hg6hgm68iygvo.R.inc(8506);bitsToGet = 12;
        }
    }}}}finally{__CLR4_5_26hg6hgm68iygvo.R.flushNeeded();}}

    /**
     * Append <code>newString</code> to the end of <code>oldString</code>.
     */
    public byte[] composeString(byte[] oldString, byte newString) {try{__CLR4_5_26hg6hgm68iygvo.R.inc(8507);
        __CLR4_5_26hg6hgm68iygvo.R.inc(8508);int length = oldString.length;
        __CLR4_5_26hg6hgm68iygvo.R.inc(8509);byte[] string = new byte[length + 1];
        __CLR4_5_26hg6hgm68iygvo.R.inc(8510);System.arraycopy(oldString, 0, string, 0, length);
        __CLR4_5_26hg6hgm68iygvo.R.inc(8511);string[length] = newString;

        __CLR4_5_26hg6hgm68iygvo.R.inc(8512);return string;
    }finally{__CLR4_5_26hg6hgm68iygvo.R.flushNeeded();}}

    // Returns the next 9, 10, 11 or 12 bits
    public int getNextCode() {try{__CLR4_5_26hg6hgm68iygvo.R.inc(8513);
        // Attempt to get the next code. The exception is caught to make
        // this robust to cases wherein the EndOfInformation code has been
        // omitted from a strip. Examples of such cases have been observed
        // in practice.
        __CLR4_5_26hg6hgm68iygvo.R.inc(8514);try {
            __CLR4_5_26hg6hgm68iygvo.R.inc(8515);nextData = (nextData << 8) | (data[bytePointer++] & 0xff);
            __CLR4_5_26hg6hgm68iygvo.R.inc(8516);nextBits += 8;

            __CLR4_5_26hg6hgm68iygvo.R.inc(8517);if ((((nextBits < bitsToGet)&&(__CLR4_5_26hg6hgm68iygvo.R.iget(8518)!=0|true))||(__CLR4_5_26hg6hgm68iygvo.R.iget(8519)==0&false))) {{
                __CLR4_5_26hg6hgm68iygvo.R.inc(8520);nextData = (nextData << 8) | (data[bytePointer++] & 0xff);
                __CLR4_5_26hg6hgm68iygvo.R.inc(8521);nextBits += 8;
            }

            }__CLR4_5_26hg6hgm68iygvo.R.inc(8522);int code =
                (nextData >> (nextBits - bitsToGet)) & andTable[bitsToGet - 9];
            __CLR4_5_26hg6hgm68iygvo.R.inc(8523);nextBits -= bitsToGet;

            __CLR4_5_26hg6hgm68iygvo.R.inc(8524);return code;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Strip not terminated as expected: return EndOfInformation code.
            __CLR4_5_26hg6hgm68iygvo.R.inc(8525);return 257;
        }
    }finally{__CLR4_5_26hg6hgm68iygvo.R.flushNeeded();}}
}
