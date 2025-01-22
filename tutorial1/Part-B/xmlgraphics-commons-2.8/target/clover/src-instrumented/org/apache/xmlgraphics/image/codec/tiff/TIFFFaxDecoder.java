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

/* $Id: TIFFFaxDecoder.java 1902007 2022-06-17 09:51:56Z ssteiner $ */

package org.apache.xmlgraphics.image.codec.tiff;

import org.apache.xmlgraphics.image.codec.util.PropertyUtil;

// CSOFF: InnerAssignment
// CSOFF: MultipleVariableDeclarations
// CSOFF: OperatorWrap
// CSOFF: WhitespaceAround

class TIFFFaxDecoder {public static class __CLR4_5_2498498m68iygj0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,6218,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int bitPointer;
    private int bytePointer;
    private byte[] data;
    private int w;
    private int fillOrder;

    // Data structures needed to store changing elements for the previous
    // and the current scanline
    private int changingElemSize;
    private int[] prevChangingElems;
    private int[] currChangingElems;

    // Element at which to start search in getNextChangingElement
    private int lastChangingElement;

    private int compression = 2;

    // Variables set by T4Options
//    private int uncompressedMode = 0;
    private int fillBits;
    private int oneD;

    static int[] table1 = {
        0x00, // 0 bits are left in first byte - SHOULD NOT HAPPEN
        0x01, // 1 bits are left in first byte
        0x03, // 2 bits are left in first byte
        0x07, // 3 bits are left in first byte
        0x0f, // 4 bits are left in first byte
        0x1f, // 5 bits are left in first byte
        0x3f, // 6 bits are left in first byte
        0x7f, // 7 bits are left in first byte
        0xff  // 8 bits are left in first byte
    };

    static int[] table2 = {
        0x00, // 0
        0x80, // 1
        0xc0, // 2
        0xe0, // 3
        0xf0, // 4
        0xf8, // 5
        0xfc, // 6
        0xfe, // 7
        0xff  // 8
    };

    // Table to be used when fillOrder = 2, for flipping bytes.
    static byte[] flipTable = {
         0,  -128,    64,   -64,    32,   -96,    96,   -32,
        16,  -112,    80,   -48,    48,   -80,   112,   -16,
         8,  -120,    72,   -56,    40,   -88,   104,   -24,
        24,  -104,    88,   -40,    56,   -72,   120,    -8,
         4,  -124,    68,   -60,    36,   -92,   100,   -28,
        20,  -108,    84,   -44,    52,   -76,   116,   -12,
        12,  -116,    76,   -52,    44,   -84,   108,   -20,
        28,  -100,    92,   -36,    60,   -68,   124,    -4,
         2,  -126,    66,   -62,    34,   -94,    98,   -30,
        18,  -110,    82,   -46,    50,   -78,   114,   -14,
        10,  -118,    74,   -54,    42,   -86,   106,   -22,
        26,  -102,    90,   -38,    58,   -70,   122,    -6,
         6,  -122,    70,   -58,    38,   -90,   102,   -26,
        22,  -106,    86,   -42,    54,   -74,   118,   -10,
        14,  -114,    78,   -50,    46,   -82,   110,   -18,
        30,   -98,    94,   -34,    62,   -66,   126,    -2,
         1,  -127,    65,   -63,    33,   -95,    97,   -31,
        17,  -111,    81,   -47,    49,   -79,   113,   -15,
         9,  -119,    73,   -55,    41,   -87,   105,   -23,
        25,  -103,    89,   -39,    57,   -71,   121,    -7,
         5,  -123,    69,   -59,    37,   -91,   101,   -27,
        21,  -107,    85,   -43,    53,   -75,   117,   -11,
        13,  -115,    77,   -51,    45,   -83,   109,   -19,
        29,   -99,    93,   -35,    61,   -67,   125,    -3,
         3,  -125,    67,   -61,    35,   -93,    99,   -29,
        19,  -109,    83,   -45,    51,   -77,   115,   -13,
        11,  -117,    75,   -53,    43,   -85,   107,   -21,
        27,  -101,    91,   -37,    59,   -69,   123,    -5,
         7,  -121,    71,   -57,    39,   -89,   103,   -25,
        23,  -105,    87,   -41,    55,   -73,   119,    -9,
        15,  -113,    79,   -49,    47,   -81,   111,   -17,
        31,   -97,    95,   -33,    63,   -65,   127,    -1,
    };

    // The main 10 bit white runs lookup table
    static short[] white = {
        // 0 - 7
        6430,   6400,   6400,   6400,   3225,   3225,   3225,   3225,
        // 8 - 15
        944,    944,    944,    944,    976,    976,    976,    976,
        // 16 - 23
        1456,   1456,   1456,   1456,   1488,   1488,   1488,   1488,
        // 24 - 31
        718,    718,    718,    718,    718,    718,    718,    718,
        // 32 - 39
        750,    750,    750,    750,    750,    750,    750,    750,
        // 40 - 47
        1520,   1520,   1520,   1520,   1552,   1552,   1552,   1552,
        // 48 - 55
        428,    428,    428,    428,    428,    428,    428,    428,
        // 56 - 63
        428,    428,    428,    428,    428,    428,    428,    428,
        // 64 - 71
        654,    654,    654,    654,    654,    654,    654,    654,
        // 72 - 79
        1072,   1072,   1072,   1072,   1104,   1104,   1104,   1104,
        // 80 - 87
        1136,   1136,   1136,   1136,   1168,   1168,   1168,   1168,
        // 88 - 95
        1200,   1200,   1200,   1200,   1232,   1232,   1232,   1232,
        // 96 - 103
        622,    622,    622,    622,    622,    622,    622,    622,
        // 104 - 111
        1008,   1008,   1008,   1008,   1040,   1040,   1040,   1040,
        // 112 - 119
        44,     44,     44,     44,     44,     44,     44,     44,
        // 120 - 127
        44,     44,     44,     44,     44,     44,     44,     44,
        // 128 - 135
        396,    396,    396,    396,    396,    396,    396,    396,
        // 136 - 143
        396,    396,    396,    396,    396,    396,    396,    396,
        // 144 - 151
        1712,   1712,   1712,   1712,   1744,   1744,   1744,   1744,
        // 152 - 159
        846,    846,    846,    846,    846,    846,    846,    846,
        // 160 - 167
        1264,   1264,   1264,   1264,   1296,   1296,   1296,   1296,
        // 168 - 175
        1328,   1328,   1328,   1328,   1360,   1360,   1360,   1360,
        // 176 - 183
        1392,   1392,   1392,   1392,   1424,   1424,   1424,   1424,
        // 184 - 191
        686,    686,    686,    686,    686,    686,    686,    686,
        // 192 - 199
        910,    910,    910,    910,    910,    910,    910,    910,
        // 200 - 207
        1968,   1968,   1968,   1968,   2000,   2000,   2000,   2000,
        // 208 - 215
        2032,   2032,   2032,   2032,     16,     16,     16,     16,
        // 216 - 223
        10257,  10257,  10257,  10257,  12305,  12305,  12305,  12305,
        // 224 - 231
        330,    330,    330,    330,    330,    330,    330,    330,
        // 232 - 239
        330,    330,    330,    330,    330,    330,    330,    330,
        // 240 - 247
        330,    330,    330,    330,    330,    330,    330,    330,
        // 248 - 255
        330,    330,    330,    330,    330,    330,    330,    330,
        // 256 - 263
        362,    362,    362,    362,    362,    362,    362,    362,
        // 264 - 271
        362,    362,    362,    362,    362,    362,    362,    362,
        // 272 - 279
        362,    362,    362,    362,    362,    362,    362,    362,
        // 280 - 287
        362,    362,    362,    362,    362,    362,    362,    362,
        // 288 - 295
        878,    878,    878,    878,    878,    878,    878,    878,
        // 296 - 303
        1904,   1904,   1904,   1904,   1936,   1936,   1936,   1936,
        // 304 - 311
        -18413, -18413, -16365, -16365, -14317, -14317, -10221, -10221,
        // 312 - 319
        590,    590,    590,    590,    590,    590,    590,    590,
        // 320 - 327
        782,    782,    782,    782,    782,    782,    782,    782,
        // 328 - 335
        1584,   1584,   1584,   1584,   1616,   1616,   1616,   1616,
        // 336 - 343
        1648,   1648,   1648,   1648,   1680,   1680,   1680,   1680,
        // 344 - 351
        814,    814,    814,    814,    814,    814,    814,    814,
        // 352 - 359
        1776,   1776,   1776,   1776,   1808,   1808,   1808,   1808,
        // 360 - 367
        1840,   1840,   1840,   1840,   1872,   1872,   1872,   1872,
        // 368 - 375
        6157,   6157,   6157,   6157,   6157,   6157,   6157,   6157,
        // 376 - 383
        6157,   6157,   6157,   6157,   6157,   6157,   6157,   6157,
        // 384 - 391
        -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275,
        // 392 - 399
        -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275,
        // 400 - 407
        14353,  14353,  14353,  14353,  16401,  16401,  16401,  16401,
        // 408 - 415
        22547,  22547,  24595,  24595,  20497,  20497,  20497,  20497,
        // 416 - 423
        18449,  18449,  18449,  18449,  26643,  26643,  28691,  28691,
        // 424 - 431
        30739,  30739, -32749, -32749, -30701, -30701, -28653, -28653,
        // 432 - 439
        -26605, -26605, -24557, -24557, -22509, -22509, -20461, -20461,
        // 440 - 447
        8207,   8207,   8207,   8207,   8207,   8207,   8207,   8207,
        // 448 - 455
        72,     72,     72,     72,     72,     72,     72,     72,
        // 456 - 463
        72,     72,     72,     72,     72,     72,     72,     72,
        // 464 - 471
        72,     72,     72,     72,     72,     72,     72,     72,
        // 472 - 479
        72,     72,     72,     72,     72,     72,     72,     72,
        // 480 - 487
        72,     72,     72,     72,     72,     72,     72,     72,
        // 488 - 495
        72,     72,     72,     72,     72,     72,     72,     72,
        // 496 - 503
        72,     72,     72,     72,     72,     72,     72,     72,
        // 504 - 511
        72,     72,     72,     72,     72,     72,     72,     72,
        // 512 - 519
        104,    104,    104,    104,    104,    104,    104,    104,
        // 520 - 527
        104,    104,    104,    104,    104,    104,    104,    104,
        // 528 - 535
        104,    104,    104,    104,    104,    104,    104,    104,
        // 536 - 543
        104,    104,    104,    104,    104,    104,    104,    104,
        // 544 - 551
        104,    104,    104,    104,    104,    104,    104,    104,
        // 552 - 559
        104,    104,    104,    104,    104,    104,    104,    104,
        // 560 - 567
        104,    104,    104,    104,    104,    104,    104,    104,
        // 568 - 575
        104,    104,    104,    104,    104,    104,    104,    104,
        // 576 - 583
        4107,   4107,   4107,   4107,   4107,   4107,   4107,   4107,
        // 584 - 591
        4107,   4107,   4107,   4107,   4107,   4107,   4107,   4107,
        // 592 - 599
        4107,   4107,   4107,   4107,   4107,   4107,   4107,   4107,
        // 600 - 607
        4107,   4107,   4107,   4107,   4107,   4107,   4107,   4107,
        // 608 - 615
        266,    266,    266,    266,    266,    266,    266,    266,
        // 616 - 623
        266,    266,    266,    266,    266,    266,    266,    266,
        // 624 - 631
        266,    266,    266,    266,    266,    266,    266,    266,
        // 632 - 639
        266,    266,    266,    266,    266,    266,    266,    266,
        // 640 - 647
        298,    298,    298,    298,    298,    298,    298,    298,
        // 648 - 655
        298,    298,    298,    298,    298,    298,    298,    298,
        // 656 - 663
        298,    298,    298,    298,    298,    298,    298,    298,
        // 664 - 671
        298,    298,    298,    298,    298,    298,    298,    298,
        // 672 - 679
        524,    524,    524,    524,    524,    524,    524,    524,
        // 680 - 687
        524,    524,    524,    524,    524,    524,    524,    524,
        // 688 - 695
        556,    556,    556,    556,    556,    556,    556,    556,
        // 696 - 703
        556,    556,    556,    556,    556,    556,    556,    556,
        // 704 - 711
        136,    136,    136,    136,    136,    136,    136,    136,
        // 712 - 719
        136,    136,    136,    136,    136,    136,    136,    136,
        // 720 - 727
        136,    136,    136,    136,    136,    136,    136,    136,
        // 728 - 735
        136,    136,    136,    136,    136,    136,    136,    136,
        // 736 - 743
        136,    136,    136,    136,    136,    136,    136,    136,
        // 744 - 751
        136,    136,    136,    136,    136,    136,    136,    136,
        // 752 - 759
        136,    136,    136,    136,    136,    136,    136,    136,
        // 760 - 767
        136,    136,    136,    136,    136,    136,    136,    136,
        // 768 - 775
        168,    168,    168,    168,    168,    168,    168,    168,
        // 776 - 783
        168,    168,    168,    168,    168,    168,    168,    168,
        // 784 - 791
        168,    168,    168,    168,    168,    168,    168,    168,
        // 792 - 799
        168,    168,    168,    168,    168,    168,    168,    168,
        // 800 - 807
        168,    168,    168,    168,    168,    168,    168,    168,
        // 808 - 815
        168,    168,    168,    168,    168,    168,    168,    168,
        // 816 - 823
        168,    168,    168,    168,    168,    168,    168,    168,
        // 824 - 831
        168,    168,    168,    168,    168,    168,    168,    168,
        // 832 - 839
        460,    460,    460,    460,    460,    460,    460,    460,
        // 840 - 847
        460,    460,    460,    460,    460,    460,    460,    460,
        // 848 - 855
        492,    492,    492,    492,    492,    492,    492,    492,
        // 856 - 863
        492,    492,    492,    492,    492,    492,    492,    492,
        // 864 - 871
        2059,   2059,   2059,   2059,   2059,   2059,   2059,   2059,
        // 872 - 879
        2059,   2059,   2059,   2059,   2059,   2059,   2059,   2059,
        // 880 - 887
        2059,   2059,   2059,   2059,   2059,   2059,   2059,   2059,
        // 888 - 895
        2059,   2059,   2059,   2059,   2059,   2059,   2059,   2059,
        // 896 - 903
        200,    200,    200,    200,    200,    200,    200,    200,
        // 904 - 911
        200,    200,    200,    200,    200,    200,    200,    200,
        // 912 - 919
        200,    200,    200,    200,    200,    200,    200,    200,
        // 920 - 927
        200,    200,    200,    200,    200,    200,    200,    200,
        // 928 - 935
        200,    200,    200,    200,    200,    200,    200,    200,
        // 936 - 943
        200,    200,    200,    200,    200,    200,    200,    200,
        // 944 - 951
        200,    200,    200,    200,    200,    200,    200,    200,
        // 952 - 959
        200,    200,    200,    200,    200,    200,    200,    200,
        // 960 - 967
        232,    232,    232,    232,    232,    232,    232,    232,
        // 968 - 975
        232,    232,    232,    232,    232,    232,    232,    232,
        // 976 - 983
        232,    232,    232,    232,    232,    232,    232,    232,
        // 984 - 991
        232,    232,    232,    232,    232,    232,    232,    232,
        // 992 - 999
        232,    232,    232,    232,    232,    232,    232,    232,
        // 1000 - 1007
        232,    232,    232,    232,    232,    232,    232,    232,
        // 1008 - 1015
        232,    232,    232,    232,    232,    232,    232,    232,
        // 1016 - 1023
        232,    232,    232,    232,    232,    232,    232,    232,
    };

    // Additional make up codes for both White and Black runs
    static short[] additionalMakeup = {
        28679,  28679,  31752,  (short)32777,
        (short)33801,  (short)34825,  (short)35849,  (short)36873,
        (short)29703,  (short)29703,  (short)30727,  (short)30727,
        (short)37897,  (short)38921,  (short)39945,  (short)40969
    };

    // Initial black run look up table, uses the first 4 bits of a code
    static short[] initBlack = {
        // 0 - 7
        3226,  6412,    200,    168,    38,     38,    134,    134,
        // 8 - 15
        100,    100,    100,    100,    68,     68,     68,     68
    };

    //
    static short[] twoBitBlack = {292, 260, 226, 226};   // 0 - 3

    // Main black run table, using the last 9 bits of possible 13 bit code
    static short[] black = {
        // 0 - 7
        62,     62,     30,     30,     0,      0,      0,      0,
        // 8 - 15
        0,      0,      0,      0,      0,      0,      0,      0,
        // 16 - 23
        0,      0,      0,      0,      0,      0,      0,      0,
        // 24 - 31
        0,      0,      0,      0,      0,      0,      0,      0,
        // 32 - 39
        3225,   3225,   3225,   3225,   3225,   3225,   3225,   3225,
        // 40 - 47
        3225,   3225,   3225,   3225,   3225,   3225,   3225,   3225,
        // 48 - 55
        3225,   3225,   3225,   3225,   3225,   3225,   3225,   3225,
        // 56 - 63
        3225,   3225,   3225,   3225,   3225,   3225,   3225,   3225,
        // 64 - 71
        588,    588,    588,    588,    588,    588,    588,    588,
        // 72 - 79
        1680,   1680,  20499,  22547,  24595,  26643,   1776,   1776,
        // 80 - 87
        1808,   1808, -24557, -22509, -20461, -18413,   1904,   1904,
        // 88 - 95
        1936,   1936, -16365, -14317,    782,    782,    782,    782,
        // 96 - 103
        814,    814,    814,    814, -12269, -10221,  10257,  10257,
        // 104 - 111
        12305,  12305,  14353,  14353,  16403,  18451,   1712,   1712,
        // 112 - 119
        1744,   1744,  28691,  30739, -32749, -30701, -28653, -26605,
        // 120 - 127
        2061,   2061,   2061,   2061,   2061,   2061,   2061,   2061,
        // 128 - 135
        424,    424,    424,    424,    424,    424,    424,    424,
        // 136 - 143
        424,    424,    424,    424,    424,    424,    424,    424,
        // 144 - 151
        424,    424,    424,    424,    424,    424,    424,    424,
        // 152 - 159
        424,    424,    424,    424,    424,    424,    424,    424,
        // 160 - 167
        750,    750,    750,    750,   1616,   1616,   1648,   1648,
        // 168 - 175
        1424,   1424,   1456,   1456,   1488,   1488,   1520,   1520,
        // 176 - 183
        1840,   1840,   1872,   1872,   1968,   1968,   8209,   8209,
        // 184 - 191
        524,    524,    524,    524,    524,    524,    524,    524,
        // 192 - 199
        556,    556,    556,    556,    556,    556,    556,    556,
        // 200 - 207
        1552,   1552,   1584,   1584,   2000,   2000,   2032,   2032,
        // 208 - 215
        976,    976,   1008,   1008,   1040,   1040,   1072,   1072,
        // 216 - 223
        1296,   1296,   1328,   1328,    718,    718,    718,    718,
        // 224 - 231
        456,    456,    456,    456,    456,    456,    456,    456,
        // 232 - 239
        456,    456,    456,    456,    456,    456,    456,    456,
        // 240 - 247
        456,    456,    456,    456,    456,    456,    456,    456,
        // 248 - 255
        456,    456,    456,    456,    456,    456,    456,    456,
        // 256 - 263
        326,    326,    326,    326,    326,    326,    326,    326,
        // 264 - 271
        326,    326,    326,    326,    326,    326,    326,    326,
        // 272 - 279
        326,    326,    326,    326,    326,    326,    326,    326,
        // 280 - 287
        326,    326,    326,    326,    326,    326,    326,    326,
        // 288 - 295
        326,    326,    326,    326,    326,    326,    326,    326,
        // 296 - 303
        326,    326,    326,    326,    326,    326,    326,    326,
        // 304 - 311
        326,    326,    326,    326,    326,    326,    326,    326,
        // 312 - 319
        326,    326,    326,    326,    326,    326,    326,    326,
        // 320 - 327
        358,    358,    358,    358,    358,    358,    358,    358,
        // 328 - 335
        358,    358,    358,    358,    358,    358,    358,    358,
        // 336 - 343
        358,    358,    358,    358,    358,    358,    358,    358,
        // 344 - 351
        358,    358,    358,    358,    358,    358,    358,    358,
        // 352 - 359
        358,    358,    358,    358,    358,    358,    358,    358,
        // 360 - 367
        358,    358,    358,    358,    358,    358,    358,    358,
        // 368 - 375
        358,    358,    358,    358,    358,    358,    358,    358,
        // 376 - 383
        358,    358,    358,    358,    358,    358,    358,    358,
        // 384 - 391
        490,    490,    490,    490,    490,    490,    490,    490,
        // 392 - 399
        490,    490,    490,    490,    490,    490,    490,    490,
        // 400 - 407
        4113,   4113,   6161,   6161,    848,    848,    880,    880,
        // 408 - 415
        912,    912,    944,    944,    622,    622,    622,    622,
        // 416 - 423
        654,    654,    654,    654,   1104,   1104,   1136,   1136,
        // 424 - 431
        1168,   1168,   1200,   1200,   1232,   1232,   1264,   1264,
        // 432 - 439
        686,    686,    686,    686,   1360,   1360,   1392,   1392,
        // 440 - 447
        12,     12,     12,     12,     12,     12,     12,     12,
        // 448 - 455
        390,    390,    390,    390,    390,    390,    390,    390,
        // 456 - 463
        390,    390,    390,    390,    390,    390,    390,    390,
        // 464 - 471
        390,    390,    390,    390,    390,    390,    390,    390,
        // 472 - 479
        390,    390,    390,    390,    390,    390,    390,    390,
        // 480 - 487
        390,    390,    390,    390,    390,    390,    390,    390,
        // 488 - 495
        390,    390,    390,    390,    390,    390,    390,    390,
        // 496 - 503
        390,    390,    390,    390,    390,    390,    390,    390,
        // 504 - 511
        390,    390,    390,    390,    390,    390,    390,    390,
    };

    static byte[] twoDCodes = {
        // 0 - 7
        80,     88,     23,     71,     30,     30,     62,     62,
        // 8 - 15
        4,      4,      4,      4,      4,      4,      4,      4,
        // 16 - 23
        11,     11,     11,     11,     11,     11,     11,     11,
        // 24 - 31
        11,     11,     11,     11,     11,     11,     11,     11,
        // 32 - 39
        35,     35,     35,     35,     35,     35,     35,     35,
        // 40 - 47
        35,     35,     35,     35,     35,     35,     35,     35,
        // 48 - 55
        51,     51,     51,     51,     51,     51,     51,     51,
        // 56 - 63
        51,     51,     51,     51,     51,     51,     51,     51,
        // 64 - 71
        41,     41,     41,     41,     41,     41,     41,     41,
        // 72 - 79
        41,     41,     41,     41,     41,     41,     41,     41,
        // 80 - 87
        41,     41,     41,     41,     41,     41,     41,     41,
        // 88 - 95
        41,     41,     41,     41,     41,     41,     41,     41,
        // 96 - 103
        41,     41,     41,     41,     41,     41,     41,     41,
        // 104 - 111
        41,     41,     41,     41,     41,     41,     41,     41,
        // 112 - 119
        41,     41,     41,     41,     41,     41,     41,     41,
        // 120 - 127
        41,     41,     41,     41,     41,     41,     41,     41,
    };

    /**
     * @param fillOrder   The fill order of the compressed data bytes.
     * @param w The width of the image in pixels
     * @param h The height of the image in pixels
     */
    public TIFFFaxDecoder(int fillOrder, int w, int h) {try{__CLR4_5_2498498m68iygj0.R.inc(5516);
        __CLR4_5_2498498m68iygj0.R.inc(5517);this.fillOrder = fillOrder;
        __CLR4_5_2498498m68iygj0.R.inc(5518);this.w = w;
//        this.h = h;

        __CLR4_5_2498498m68iygj0.R.inc(5519);this.bitPointer = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5520);this.bytePointer = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5521);this.prevChangingElems = new int[w];
        __CLR4_5_2498498m68iygj0.R.inc(5522);this.currChangingElems = new int[w];
    }finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    // One-dimensional decoding methods

    public void decode1D(byte[] buffer, byte[] compData,
                         int startX, int height) {try{__CLR4_5_2498498m68iygj0.R.inc(5523);
        __CLR4_5_2498498m68iygj0.R.inc(5524);this.data = compData;

        __CLR4_5_2498498m68iygj0.R.inc(5525);int lineOffset = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5526);int scanlineStride = (w + 7) / 8;

        __CLR4_5_2498498m68iygj0.R.inc(5527);bitPointer = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5528);bytePointer = 0;

        __CLR4_5_2498498m68iygj0.R.inc(5529);for (int i = 0; (((i < height)&&(__CLR4_5_2498498m68iygj0.R.iget(5530)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5531)==0&false)); i++) {{
            __CLR4_5_2498498m68iygj0.R.inc(5532);decodeNextScanline(buffer, lineOffset, startX);
            __CLR4_5_2498498m68iygj0.R.inc(5533);lineOffset += scanlineStride;
        }
    }}finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    public void decodeNextScanline(byte[] buffer,
                                   int lineOffset, int bitOffset) {try{__CLR4_5_2498498m68iygj0.R.inc(5534);
        __CLR4_5_2498498m68iygj0.R.inc(5535);int bits = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5536);int code = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5537);int isT = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5538);int current;
        __CLR4_5_2498498m68iygj0.R.inc(5539);int entry;
        __CLR4_5_2498498m68iygj0.R.inc(5540);int twoBits;
        __CLR4_5_2498498m68iygj0.R.inc(5541);boolean isWhite = true;

        // Initialize starting of the changing elements array
        __CLR4_5_2498498m68iygj0.R.inc(5542);changingElemSize = 0;

        // While scanline not complete
        __CLR4_5_2498498m68iygj0.R.inc(5543);while ((((bitOffset < w)&&(__CLR4_5_2498498m68iygj0.R.iget(5544)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5545)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(5546);while ((((isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5547)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5548)==0&false))) {{
                // White run
                __CLR4_5_2498498m68iygj0.R.inc(5549);current = nextNBits(10);
                __CLR4_5_2498498m68iygj0.R.inc(5550);entry = white[current];

                // Get the 3 fields from the entry
                __CLR4_5_2498498m68iygj0.R.inc(5551);isT = entry & 0x0001;
                __CLR4_5_2498498m68iygj0.R.inc(5552);bits = (entry >>> 1) & 0x0f;

                __CLR4_5_2498498m68iygj0.R.inc(5553);if ((((bits == 12)&&(__CLR4_5_2498498m68iygj0.R.iget(5554)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5555)==0&false))) {{          // Additional Make up code
                    // Get the next 2 bits
                    __CLR4_5_2498498m68iygj0.R.inc(5556);twoBits = nextLesserThan8Bits(2);
                    // Consolidate the 2 new bits and last 2 bits into 4 bits
                    __CLR4_5_2498498m68iygj0.R.inc(5557);current = ((current << 2) & 0x000c) | twoBits;
                    __CLR4_5_2498498m68iygj0.R.inc(5558);entry = additionalMakeup[current];
                    __CLR4_5_2498498m68iygj0.R.inc(5559);bits = (entry >>> 1) & 0x07;     // 3 bits 0000 0111
                    __CLR4_5_2498498m68iygj0.R.inc(5560);code  = (entry >>> 4) & 0x0fff;  // 12 bits
                    __CLR4_5_2498498m68iygj0.R.inc(5561);bitOffset += code; // Skip white run

                    __CLR4_5_2498498m68iygj0.R.inc(5562);updatePointer(4 - bits);
                } }else {__CLR4_5_2498498m68iygj0.R.inc(5563);if ((((bits == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(5564)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5565)==0&false))) {{     // ERROR
                    __CLR4_5_2498498m68iygj0.R.inc(5566);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder0"));
                } }else {__CLR4_5_2498498m68iygj0.R.inc(5567);if ((((bits == 15)&&(__CLR4_5_2498498m68iygj0.R.iget(5568)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5569)==0&false))) {{    // EOL
                    __CLR4_5_2498498m68iygj0.R.inc(5570);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder1"));
                } }else {{
                    // 11 bits - 0000 0111 1111 1111 = 0x07ff
                    __CLR4_5_2498498m68iygj0.R.inc(5571);code = (entry >>> 5) & 0x07ff;
                    __CLR4_5_2498498m68iygj0.R.inc(5572);bitOffset += code;

                    __CLR4_5_2498498m68iygj0.R.inc(5573);updatePointer(10 - bits);
                    __CLR4_5_2498498m68iygj0.R.inc(5574);if ((((isT == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(5575)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5576)==0&false))) {{
                        __CLR4_5_2498498m68iygj0.R.inc(5577);isWhite = false;
                        __CLR4_5_2498498m68iygj0.R.inc(5578);currChangingElems[changingElemSize++] = bitOffset;
                    }
                }}
            }}}}

            // Check whether this run completed one width, if so
            // advance to next byte boundary for compression = 2.
            }__CLR4_5_2498498m68iygj0.R.inc(5579);if ((((bitOffset == w)&&(__CLR4_5_2498498m68iygj0.R.iget(5580)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5581)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(5582);if ((((compression == 2)&&(__CLR4_5_2498498m68iygj0.R.iget(5583)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5584)==0&false))) {{
                    __CLR4_5_2498498m68iygj0.R.inc(5585);advancePointer();
                }
                }__CLR4_5_2498498m68iygj0.R.inc(5586);break;
            }

            }__CLR4_5_2498498m68iygj0.R.inc(5587);while ((((!isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5588)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5589)==0&false))) {{
                // Black run
                __CLR4_5_2498498m68iygj0.R.inc(5590);current = nextLesserThan8Bits(4);
                __CLR4_5_2498498m68iygj0.R.inc(5591);entry = initBlack[current];

                // Get the 3 fields from the entry
                __CLR4_5_2498498m68iygj0.R.inc(5592);isT = entry & 0x0001;
                __CLR4_5_2498498m68iygj0.R.inc(5593);bits = (entry >>> 1) & 0x000f;
                __CLR4_5_2498498m68iygj0.R.inc(5594);code = (entry >>> 5) & 0x07ff;

                __CLR4_5_2498498m68iygj0.R.inc(5595);if ((((code == 100)&&(__CLR4_5_2498498m68iygj0.R.iget(5596)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5597)==0&false))) {{
                    __CLR4_5_2498498m68iygj0.R.inc(5598);current = nextNBits(9);
                    __CLR4_5_2498498m68iygj0.R.inc(5599);entry = black[current];

                    // Get the 3 fields from the entry
                    __CLR4_5_2498498m68iygj0.R.inc(5600);isT = entry & 0x0001;
                    __CLR4_5_2498498m68iygj0.R.inc(5601);bits = (entry >>> 1) & 0x000f;
                    __CLR4_5_2498498m68iygj0.R.inc(5602);code = (entry >>> 5) & 0x07ff;

                    __CLR4_5_2498498m68iygj0.R.inc(5603);if ((((bits == 12)&&(__CLR4_5_2498498m68iygj0.R.iget(5604)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5605)==0&false))) {{
                        // Additional makeup codes
                        __CLR4_5_2498498m68iygj0.R.inc(5606);updatePointer(5);
                        __CLR4_5_2498498m68iygj0.R.inc(5607);current = nextLesserThan8Bits(4);
                        __CLR4_5_2498498m68iygj0.R.inc(5608);entry = additionalMakeup[current];
                        __CLR4_5_2498498m68iygj0.R.inc(5609);bits = (entry >>> 1) & 0x07;     // 3 bits 0000 0111
                        __CLR4_5_2498498m68iygj0.R.inc(5610);code  = (entry >>> 4) & 0x0fff;  // 12 bits

                        __CLR4_5_2498498m68iygj0.R.inc(5611);setToBlack(buffer, lineOffset, bitOffset, code);
                        __CLR4_5_2498498m68iygj0.R.inc(5612);bitOffset += code;

                        __CLR4_5_2498498m68iygj0.R.inc(5613);updatePointer(4 - bits);
                    } }else {__CLR4_5_2498498m68iygj0.R.inc(5614);if ((((bits == 15)&&(__CLR4_5_2498498m68iygj0.R.iget(5615)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5616)==0&false))) {{
                        // EOL code
                        __CLR4_5_2498498m68iygj0.R.inc(5617);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder2"));
                    } }else {{
                        __CLR4_5_2498498m68iygj0.R.inc(5618);setToBlack(buffer, lineOffset, bitOffset, code);
                        __CLR4_5_2498498m68iygj0.R.inc(5619);bitOffset += code;

                        __CLR4_5_2498498m68iygj0.R.inc(5620);updatePointer(9 - bits);
                        __CLR4_5_2498498m68iygj0.R.inc(5621);if ((((isT == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(5622)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5623)==0&false))) {{
                            __CLR4_5_2498498m68iygj0.R.inc(5624);isWhite = true;
                            __CLR4_5_2498498m68iygj0.R.inc(5625);currChangingElems[changingElemSize++] = bitOffset;
                        }
                    }}
                }}} }else {__CLR4_5_2498498m68iygj0.R.inc(5626);if ((((code == 200)&&(__CLR4_5_2498498m68iygj0.R.iget(5627)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5628)==0&false))) {{
                    // Is a Terminating code
                    __CLR4_5_2498498m68iygj0.R.inc(5629);current = nextLesserThan8Bits(2);
                    __CLR4_5_2498498m68iygj0.R.inc(5630);entry = twoBitBlack[current];
                    __CLR4_5_2498498m68iygj0.R.inc(5631);code = (entry >>> 5) & 0x07ff;
                    __CLR4_5_2498498m68iygj0.R.inc(5632);bits = (entry >>> 1) & 0x0f;

                    __CLR4_5_2498498m68iygj0.R.inc(5633);setToBlack(buffer, lineOffset, bitOffset, code);
                    __CLR4_5_2498498m68iygj0.R.inc(5634);bitOffset += code;

                    __CLR4_5_2498498m68iygj0.R.inc(5635);updatePointer(2 - bits);
                    __CLR4_5_2498498m68iygj0.R.inc(5636);isWhite = true;
                    __CLR4_5_2498498m68iygj0.R.inc(5637);currChangingElems[changingElemSize++] = bitOffset;
                } }else {{
                    // Is a Terminating code
                    __CLR4_5_2498498m68iygj0.R.inc(5638);setToBlack(buffer, lineOffset, bitOffset, code);
                    __CLR4_5_2498498m68iygj0.R.inc(5639);bitOffset += code;

                    __CLR4_5_2498498m68iygj0.R.inc(5640);updatePointer(4 - bits);
                    __CLR4_5_2498498m68iygj0.R.inc(5641);isWhite = true;
                    __CLR4_5_2498498m68iygj0.R.inc(5642);currChangingElems[changingElemSize++] = bitOffset;
                }
            }}}

            // Check whether this run completed one width
            }__CLR4_5_2498498m68iygj0.R.inc(5643);if ((((bitOffset == w)&&(__CLR4_5_2498498m68iygj0.R.iget(5644)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5645)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(5646);if ((((compression == 2)&&(__CLR4_5_2498498m68iygj0.R.iget(5647)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5648)==0&false))) {{
                    __CLR4_5_2498498m68iygj0.R.inc(5649);advancePointer();
                }
                }__CLR4_5_2498498m68iygj0.R.inc(5650);break;
            }
        }}

        }__CLR4_5_2498498m68iygj0.R.inc(5651);currChangingElems[changingElemSize++] = bitOffset;
    }finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    // Two-dimensional decoding methods

    public void decode2D(byte[] buffer,
                         byte[] compData,
                         int startX,
                         int height,
                         long tiffT4Options) {try{__CLR4_5_2498498m68iygj0.R.inc(5652);
        __CLR4_5_2498498m68iygj0.R.inc(5653);this.data = compData;
        __CLR4_5_2498498m68iygj0.R.inc(5654);compression = 3;

        __CLR4_5_2498498m68iygj0.R.inc(5655);bitPointer = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5656);bytePointer = 0;

        __CLR4_5_2498498m68iygj0.R.inc(5657);int scanlineStride = (w + 7) / 8;

        __CLR4_5_2498498m68iygj0.R.inc(5658);int a0;
        __CLR4_5_2498498m68iygj0.R.inc(5659);int a1;
        __CLR4_5_2498498m68iygj0.R.inc(5660);int b1;
        __CLR4_5_2498498m68iygj0.R.inc(5661);int b2;
        __CLR4_5_2498498m68iygj0.R.inc(5662);int[] b = new int[2];
        __CLR4_5_2498498m68iygj0.R.inc(5663);int entry;
        __CLR4_5_2498498m68iygj0.R.inc(5664);int code;
        __CLR4_5_2498498m68iygj0.R.inc(5665);int bits;
        __CLR4_5_2498498m68iygj0.R.inc(5666);boolean isWhite;
        __CLR4_5_2498498m68iygj0.R.inc(5667);int currIndex = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5668);int[] temp;

        // fillBits - dealt with this in readEOL
        // 1D/2D encoding - dealt with this in readEOL

        // uncompressedMode - haven't dealt with this yet.


        __CLR4_5_2498498m68iygj0.R.inc(5669);oneD = (int)(tiffT4Options & 0x01);
//        uncompressedMode = (int)((tiffT4Options & 0x02) >> 1);
        __CLR4_5_2498498m68iygj0.R.inc(5670);fillBits = (int)((tiffT4Options & 0x04) >> 2);

        // The data must start with an EOL code
        __CLR4_5_2498498m68iygj0.R.inc(5671);if ((((readEOL() != 1)&&(__CLR4_5_2498498m68iygj0.R.iget(5672)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5673)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(5674);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder3"));
        }

        }__CLR4_5_2498498m68iygj0.R.inc(5675);int lineOffset = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5676);int bitOffset;

        // Then the 1D encoded scanline data will occur, changing elements
        // array gets set.
        __CLR4_5_2498498m68iygj0.R.inc(5677);decodeNextScanline(buffer, lineOffset, startX);
        __CLR4_5_2498498m68iygj0.R.inc(5678);lineOffset += scanlineStride;

        __CLR4_5_2498498m68iygj0.R.inc(5679);for (int lines = 1; (((lines < height)&&(__CLR4_5_2498498m68iygj0.R.iget(5680)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5681)==0&false)); lines++) {{

            // Every line must begin with an EOL followed by a bit which
            // indicates whether the following scanline is 1D or 2D encoded.
            __CLR4_5_2498498m68iygj0.R.inc(5682);if ((((readEOL() == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(5683)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5684)==0&false))) {{
                // 2D encoded scanline follows

                // Initialize previous scanlines changing elements, and
                // initialize current scanline's changing elements array
                __CLR4_5_2498498m68iygj0.R.inc(5685);temp = prevChangingElems;
                __CLR4_5_2498498m68iygj0.R.inc(5686);prevChangingElems = currChangingElems;
                __CLR4_5_2498498m68iygj0.R.inc(5687);currChangingElems = temp;
                __CLR4_5_2498498m68iygj0.R.inc(5688);currIndex = 0;

                // a0 has to be set just before the start of this scanline.
                __CLR4_5_2498498m68iygj0.R.inc(5689);a0 = -1;
                __CLR4_5_2498498m68iygj0.R.inc(5690);isWhite = true;
                __CLR4_5_2498498m68iygj0.R.inc(5691);bitOffset = startX;

                __CLR4_5_2498498m68iygj0.R.inc(5692);lastChangingElement = 0;

                __CLR4_5_2498498m68iygj0.R.inc(5693);while ((((bitOffset < w)&&(__CLR4_5_2498498m68iygj0.R.iget(5694)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5695)==0&false))) {{
                    // Get the next changing element
                    __CLR4_5_2498498m68iygj0.R.inc(5696);getNextChangingElement(a0, isWhite, b);

                    __CLR4_5_2498498m68iygj0.R.inc(5697);b1 = b[0];
                    __CLR4_5_2498498m68iygj0.R.inc(5698);b2 = b[1];

                    // Get the next seven bits
                    __CLR4_5_2498498m68iygj0.R.inc(5699);entry = nextLesserThan8Bits(7);

                    // Run these through the 2DCodes table
                    __CLR4_5_2498498m68iygj0.R.inc(5700);entry = twoDCodes[entry] & 0xff;

                    // Get the code and the number of bits used up
                    __CLR4_5_2498498m68iygj0.R.inc(5701);code = (entry & 0x78) >>> 3;
                    __CLR4_5_2498498m68iygj0.R.inc(5702);bits = entry & 0x07;

                    __CLR4_5_2498498m68iygj0.R.inc(5703);if ((((code == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(5704)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5705)==0&false))) {{
                        __CLR4_5_2498498m68iygj0.R.inc(5706);if ((((!isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5707)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5708)==0&false))) {{
                            __CLR4_5_2498498m68iygj0.R.inc(5709);setToBlack(buffer, lineOffset, bitOffset,
                                       b2 - bitOffset);
                        }
                        }__CLR4_5_2498498m68iygj0.R.inc(5710);bitOffset = a0 = b2;

                        // Set pointer to consume the correct number of bits.
                        __CLR4_5_2498498m68iygj0.R.inc(5711);updatePointer(7 - bits);
                    } }else {__CLR4_5_2498498m68iygj0.R.inc(5712);if ((((code == 1)&&(__CLR4_5_2498498m68iygj0.R.iget(5713)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5714)==0&false))) {{
                        // Horizontal
                        __CLR4_5_2498498m68iygj0.R.inc(5715);updatePointer(7 - bits);

                        // identify the next 2 codes.
                        __CLR4_5_2498498m68iygj0.R.inc(5716);int number;
                        __CLR4_5_2498498m68iygj0.R.inc(5717);if ((((isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5718)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5719)==0&false))) {{
                            __CLR4_5_2498498m68iygj0.R.inc(5720);number = decodeWhiteCodeWord();
                            __CLR4_5_2498498m68iygj0.R.inc(5721);bitOffset += number;
                            __CLR4_5_2498498m68iygj0.R.inc(5722);currChangingElems[currIndex++] = bitOffset;

                            __CLR4_5_2498498m68iygj0.R.inc(5723);number = decodeBlackCodeWord();
                            __CLR4_5_2498498m68iygj0.R.inc(5724);setToBlack(buffer, lineOffset, bitOffset, number);
                            __CLR4_5_2498498m68iygj0.R.inc(5725);bitOffset += number;
                            __CLR4_5_2498498m68iygj0.R.inc(5726);currChangingElems[currIndex++] = bitOffset;
                        } }else {{
                            __CLR4_5_2498498m68iygj0.R.inc(5727);number = decodeBlackCodeWord();
                            __CLR4_5_2498498m68iygj0.R.inc(5728);setToBlack(buffer, lineOffset, bitOffset, number);
                            __CLR4_5_2498498m68iygj0.R.inc(5729);bitOffset += number;
                            __CLR4_5_2498498m68iygj0.R.inc(5730);currChangingElems[currIndex++] = bitOffset;

                            __CLR4_5_2498498m68iygj0.R.inc(5731);number = decodeWhiteCodeWord();
                            __CLR4_5_2498498m68iygj0.R.inc(5732);bitOffset += number;
                            __CLR4_5_2498498m68iygj0.R.inc(5733);currChangingElems[currIndex++] = bitOffset;
                        }

                        }__CLR4_5_2498498m68iygj0.R.inc(5734);a0 = bitOffset;
                    } }else {__CLR4_5_2498498m68iygj0.R.inc(5735);if ((((code <= 8)&&(__CLR4_5_2498498m68iygj0.R.iget(5736)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5737)==0&false))) {{
                        // Vertical
                        __CLR4_5_2498498m68iygj0.R.inc(5738);a1 = b1 + (code - 5);

                        __CLR4_5_2498498m68iygj0.R.inc(5739);currChangingElems[currIndex++] = a1;

                        // We write the current color till a1 - 1 pos,
                        // since a1 is where the next color starts
                        __CLR4_5_2498498m68iygj0.R.inc(5740);if ((((!isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5741)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5742)==0&false))) {{
                            __CLR4_5_2498498m68iygj0.R.inc(5743);setToBlack(buffer, lineOffset, bitOffset,
                                       a1 - bitOffset);
                        }
                        }__CLR4_5_2498498m68iygj0.R.inc(5744);bitOffset = a0 = a1;
                        __CLR4_5_2498498m68iygj0.R.inc(5745);isWhite = !isWhite;

                        __CLR4_5_2498498m68iygj0.R.inc(5746);updatePointer(7 - bits);
                    } }else {{
                        __CLR4_5_2498498m68iygj0.R.inc(5747);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder4"));
                    }
                }}}}

                // Add the changing element beyond the current scanline for the
                // other color too
                }__CLR4_5_2498498m68iygj0.R.inc(5748);currChangingElems[currIndex++] = bitOffset;
                __CLR4_5_2498498m68iygj0.R.inc(5749);changingElemSize = currIndex;
            } }else {{
                // 1D encoded scanline follows
                __CLR4_5_2498498m68iygj0.R.inc(5750);decodeNextScanline(buffer, lineOffset, startX);
            }

            }__CLR4_5_2498498m68iygj0.R.inc(5751);lineOffset += scanlineStride;
        }
    }}finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    public synchronized void decodeT6(byte[] buffer,
                                      byte[] compData,
                                      int startX,
                                      int height,
                                      long tiffT6Options) {try{__CLR4_5_2498498m68iygj0.R.inc(5752);
        __CLR4_5_2498498m68iygj0.R.inc(5753);this.data = compData;
        __CLR4_5_2498498m68iygj0.R.inc(5754);compression = 4;

        __CLR4_5_2498498m68iygj0.R.inc(5755);bitPointer = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5756);bytePointer = 0;

        __CLR4_5_2498498m68iygj0.R.inc(5757);int scanlineStride = (w + 7) / 8;

        __CLR4_5_2498498m68iygj0.R.inc(5758);int a0;
        __CLR4_5_2498498m68iygj0.R.inc(5759);int a1;
        __CLR4_5_2498498m68iygj0.R.inc(5760);int b1;
        __CLR4_5_2498498m68iygj0.R.inc(5761);int b2;
        __CLR4_5_2498498m68iygj0.R.inc(5762);int entry;
        __CLR4_5_2498498m68iygj0.R.inc(5763);int code;
        __CLR4_5_2498498m68iygj0.R.inc(5764);int bits;
        __CLR4_5_2498498m68iygj0.R.inc(5765);boolean isWhite;
        __CLR4_5_2498498m68iygj0.R.inc(5766);int currIndex;
        __CLR4_5_2498498m68iygj0.R.inc(5767);int[] temp;

        // Return values from getNextChangingElement
        __CLR4_5_2498498m68iygj0.R.inc(5768);int[] b = new int[2];

        // uncompressedMode - have written some code for this, but this
        // has not been tested due to lack of test images using this optional

//        uncompressedMode = (int)((tiffT6Options & 0x02) >> 1);

        // Local cached reference
        __CLR4_5_2498498m68iygj0.R.inc(5769);int[] cce = currChangingElems;

        // Assume invisible preceding row of all white pixels and insert
        // both black and white changing elements beyond the end of this
        // imaginary scanline.
        __CLR4_5_2498498m68iygj0.R.inc(5770);changingElemSize = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5771);cce[changingElemSize++] = w;
        __CLR4_5_2498498m68iygj0.R.inc(5772);cce[changingElemSize++] = w;

        __CLR4_5_2498498m68iygj0.R.inc(5773);int lineOffset = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5774);int bitOffset;

        __CLR4_5_2498498m68iygj0.R.inc(5775);for (int lines = 0; (((lines < height)&&(__CLR4_5_2498498m68iygj0.R.iget(5776)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5777)==0&false)); lines++) {{
            // a0 has to be set just before the start of the scanline.
            __CLR4_5_2498498m68iygj0.R.inc(5778);a0 = -1;
            __CLR4_5_2498498m68iygj0.R.inc(5779);isWhite = true;

            // Assign the changing elements of the previous scanline to
            // prevChangingElems and start putting this new scanline's
            // changing elements into the currChangingElems.
            __CLR4_5_2498498m68iygj0.R.inc(5780);temp = prevChangingElems;
            __CLR4_5_2498498m68iygj0.R.inc(5781);prevChangingElems = currChangingElems;
            __CLR4_5_2498498m68iygj0.R.inc(5782);cce = currChangingElems = temp;
            __CLR4_5_2498498m68iygj0.R.inc(5783);currIndex = 0;

            // Start decoding the scanline at startX in the raster
            __CLR4_5_2498498m68iygj0.R.inc(5784);bitOffset = startX;

            // Reset search start position for getNextChangingElement
            __CLR4_5_2498498m68iygj0.R.inc(5785);lastChangingElement = 0;

            // Till one whole scanline is decoded
            __CLR4_5_2498498m68iygj0.R.inc(5786);while ((((bitOffset < w)&&(__CLR4_5_2498498m68iygj0.R.iget(5787)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5788)==0&false))) {{
                // Get the next changing element
                __CLR4_5_2498498m68iygj0.R.inc(5789);getNextChangingElement(a0, isWhite, b);
                __CLR4_5_2498498m68iygj0.R.inc(5790);b1 = b[0];
                __CLR4_5_2498498m68iygj0.R.inc(5791);b2 = b[1];

                // Get the next seven bits
                __CLR4_5_2498498m68iygj0.R.inc(5792);entry = nextLesserThan8Bits(7);
                // Run these through the 2DCodes table
                __CLR4_5_2498498m68iygj0.R.inc(5793);entry = twoDCodes[entry] & 0xff;

                // Get the code and the number of bits used up
                __CLR4_5_2498498m68iygj0.R.inc(5794);code = (entry & 0x78) >>> 3;
                __CLR4_5_2498498m68iygj0.R.inc(5795);bits = entry & 0x07;

                __CLR4_5_2498498m68iygj0.R.inc(5796);if ((((code == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(5797)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5798)==0&false))) {{ // Pass
                    // We always assume WhiteIsZero format for fax.
                    __CLR4_5_2498498m68iygj0.R.inc(5799);if ((((!isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5800)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5801)==0&false))) {{
                        __CLR4_5_2498498m68iygj0.R.inc(5802);setToBlack(buffer, lineOffset, bitOffset,
                                   b2 - bitOffset);
                    }
                    }__CLR4_5_2498498m68iygj0.R.inc(5803);bitOffset = a0 = b2;

                    // Set pointer to only consume the correct number of bits.
                    __CLR4_5_2498498m68iygj0.R.inc(5804);updatePointer(7 - bits);
                } }else {__CLR4_5_2498498m68iygj0.R.inc(5805);if ((((code == 1)&&(__CLR4_5_2498498m68iygj0.R.iget(5806)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5807)==0&false))) {{ // Horizontal
                    // Set pointer to only consume the correct number of bits.
                    __CLR4_5_2498498m68iygj0.R.inc(5808);updatePointer(7 - bits);

                    // identify the next 2 alternating color codes.
                    __CLR4_5_2498498m68iygj0.R.inc(5809);int number;
                    __CLR4_5_2498498m68iygj0.R.inc(5810);if ((((isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5811)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5812)==0&false))) {{
                        // Following are white and black runs
                        __CLR4_5_2498498m68iygj0.R.inc(5813);number = decodeWhiteCodeWord();
                        __CLR4_5_2498498m68iygj0.R.inc(5814);bitOffset += number;
                        __CLR4_5_2498498m68iygj0.R.inc(5815);cce[currIndex++] = bitOffset;

                        __CLR4_5_2498498m68iygj0.R.inc(5816);number = decodeBlackCodeWord();
                        __CLR4_5_2498498m68iygj0.R.inc(5817);setToBlack(buffer, lineOffset, bitOffset, number);
                        __CLR4_5_2498498m68iygj0.R.inc(5818);bitOffset += number;
                        __CLR4_5_2498498m68iygj0.R.inc(5819);cce[currIndex++] = bitOffset;
                    } }else {{
                        // First a black run and then a white run follows
                        __CLR4_5_2498498m68iygj0.R.inc(5820);number = decodeBlackCodeWord();
                        __CLR4_5_2498498m68iygj0.R.inc(5821);setToBlack(buffer, lineOffset, bitOffset, number);
                        __CLR4_5_2498498m68iygj0.R.inc(5822);bitOffset += number;
                        __CLR4_5_2498498m68iygj0.R.inc(5823);cce[currIndex++] = bitOffset;

                        __CLR4_5_2498498m68iygj0.R.inc(5824);number = decodeWhiteCodeWord();
                        __CLR4_5_2498498m68iygj0.R.inc(5825);bitOffset += number;
                        __CLR4_5_2498498m68iygj0.R.inc(5826);cce[currIndex++] = bitOffset;
                    }

                    }__CLR4_5_2498498m68iygj0.R.inc(5827);a0 = bitOffset;
                } }else {__CLR4_5_2498498m68iygj0.R.inc(5828);if ((((code <= 8)&&(__CLR4_5_2498498m68iygj0.R.iget(5829)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5830)==0&false))) {{ // Vertical
                    __CLR4_5_2498498m68iygj0.R.inc(5831);a1 = b1 + (code - 5);
                    __CLR4_5_2498498m68iygj0.R.inc(5832);cce[currIndex++] = a1;

                    // We write the current color till a1 - 1 pos,
                    // since a1 is where the next color starts
                    __CLR4_5_2498498m68iygj0.R.inc(5833);if ((((!isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5834)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5835)==0&false))) {{
                        __CLR4_5_2498498m68iygj0.R.inc(5836);setToBlack(buffer, lineOffset, bitOffset,
                                   a1 - bitOffset);
                    }
                    }__CLR4_5_2498498m68iygj0.R.inc(5837);bitOffset = a0 = a1;
                    __CLR4_5_2498498m68iygj0.R.inc(5838);isWhite = !isWhite;

                    __CLR4_5_2498498m68iygj0.R.inc(5839);updatePointer(7 - bits);
                } }else {__CLR4_5_2498498m68iygj0.R.inc(5840);if ((((code == 11)&&(__CLR4_5_2498498m68iygj0.R.iget(5841)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5842)==0&false))) {{
                    __CLR4_5_2498498m68iygj0.R.inc(5843);if ((((nextLesserThan8Bits(3) != 7)&&(__CLR4_5_2498498m68iygj0.R.iget(5844)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5845)==0&false))) {{
                        __CLR4_5_2498498m68iygj0.R.inc(5846);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder5"));
                    }

                    }__CLR4_5_2498498m68iygj0.R.inc(5847);int zeros = 0;
                    __CLR4_5_2498498m68iygj0.R.inc(5848);boolean exit = false;

                    __CLR4_5_2498498m68iygj0.R.inc(5849);while ((((!exit)&&(__CLR4_5_2498498m68iygj0.R.iget(5850)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5851)==0&false))) {{
                        __CLR4_5_2498498m68iygj0.R.inc(5852);while ((((nextLesserThan8Bits(1) != 1)&&(__CLR4_5_2498498m68iygj0.R.iget(5853)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5854)==0&false))) {{
                            __CLR4_5_2498498m68iygj0.R.inc(5855);zeros++;
                        }

                        }__CLR4_5_2498498m68iygj0.R.inc(5856);if ((((zeros > 5)&&(__CLR4_5_2498498m68iygj0.R.iget(5857)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5858)==0&false))) {{
                            // Exit code

                            // Zeros before exit code
                            __CLR4_5_2498498m68iygj0.R.inc(5859);zeros = zeros - 6;

                            __CLR4_5_2498498m68iygj0.R.inc(5860);if ((((!isWhite && (zeros > 0))&&(__CLR4_5_2498498m68iygj0.R.iget(5861)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5862)==0&false))) {{
                                __CLR4_5_2498498m68iygj0.R.inc(5863);cce[currIndex++] = bitOffset;
                            }

                            // Zeros before the exit code
                            }__CLR4_5_2498498m68iygj0.R.inc(5864);bitOffset += zeros;
                            __CLR4_5_2498498m68iygj0.R.inc(5865);if ((((zeros > 0)&&(__CLR4_5_2498498m68iygj0.R.iget(5866)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5867)==0&false))) {{
                                // Some zeros have been written
                                __CLR4_5_2498498m68iygj0.R.inc(5868);isWhite = true;
                            }

                            // Read in the bit which specifies the color of
                            // the following run
                            }__CLR4_5_2498498m68iygj0.R.inc(5869);if ((((nextLesserThan8Bits(1) == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(5870)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5871)==0&false))) {{
                                __CLR4_5_2498498m68iygj0.R.inc(5872);if ((((!isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5873)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5874)==0&false))) {{
                                    __CLR4_5_2498498m68iygj0.R.inc(5875);cce[currIndex++] = bitOffset;
                                }
                                }__CLR4_5_2498498m68iygj0.R.inc(5876);isWhite = true;
                            } }else {{
                                __CLR4_5_2498498m68iygj0.R.inc(5877);if ((((isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5878)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5879)==0&false))) {{
                                    __CLR4_5_2498498m68iygj0.R.inc(5880);cce[currIndex++] = bitOffset;
                                }
                                }__CLR4_5_2498498m68iygj0.R.inc(5881);isWhite = false;
                            }

                            }__CLR4_5_2498498m68iygj0.R.inc(5882);exit = true;
                        }

                        }__CLR4_5_2498498m68iygj0.R.inc(5883);if ((((zeros == 5)&&(__CLR4_5_2498498m68iygj0.R.iget(5884)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5885)==0&false))) {{
                            __CLR4_5_2498498m68iygj0.R.inc(5886);if ((((!isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5887)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5888)==0&false))) {{
                                __CLR4_5_2498498m68iygj0.R.inc(5889);cce[currIndex++] = bitOffset;
                            }
                            }__CLR4_5_2498498m68iygj0.R.inc(5890);bitOffset += zeros;

                            // Last thing written was white
                            __CLR4_5_2498498m68iygj0.R.inc(5891);isWhite = true;
                        } }else {{
                            __CLR4_5_2498498m68iygj0.R.inc(5892);bitOffset += zeros;

                            __CLR4_5_2498498m68iygj0.R.inc(5893);cce[currIndex++] = bitOffset;
                            __CLR4_5_2498498m68iygj0.R.inc(5894);setToBlack(buffer, lineOffset, bitOffset, 1);
                            __CLR4_5_2498498m68iygj0.R.inc(5895);++bitOffset;

                            // Last thing written was black
                            __CLR4_5_2498498m68iygj0.R.inc(5896);isWhite = false;
                        }

                    }}
                }} }else {{
                    __CLR4_5_2498498m68iygj0.R.inc(5897);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder5"));
                }
            }}}}}

            // Add the changing element beyond the current scanline for the
            // other color too
            }__CLR4_5_2498498m68iygj0.R.inc(5898);cce[currIndex++] = bitOffset;

            // Number of changing elements in this scanline.
            __CLR4_5_2498498m68iygj0.R.inc(5899);changingElemSize = currIndex;

            __CLR4_5_2498498m68iygj0.R.inc(5900);lineOffset += scanlineStride;
        }
    }}finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    private void setToBlack(byte[] buffer,
                            int lineOffset, int bitOffset,
                            int numBits) {try{__CLR4_5_2498498m68iygj0.R.inc(5901);
        __CLR4_5_2498498m68iygj0.R.inc(5902);int bitNum = 8 * lineOffset + bitOffset;
        __CLR4_5_2498498m68iygj0.R.inc(5903);int lastBit = bitNum + numBits;

        __CLR4_5_2498498m68iygj0.R.inc(5904);int byteNum = bitNum >> 3;

        // Handle bits in first byte
        __CLR4_5_2498498m68iygj0.R.inc(5905);int shift = bitNum & 0x7;
        __CLR4_5_2498498m68iygj0.R.inc(5906);if ((((shift > 0)&&(__CLR4_5_2498498m68iygj0.R.iget(5907)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5908)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(5909);int maskVal = 1 << (7 - shift);
            __CLR4_5_2498498m68iygj0.R.inc(5910);byte val = buffer[byteNum];
            __CLR4_5_2498498m68iygj0.R.inc(5911);while ((((maskVal > 0 && bitNum < lastBit)&&(__CLR4_5_2498498m68iygj0.R.iget(5912)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5913)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(5914);val |= maskVal;
                __CLR4_5_2498498m68iygj0.R.inc(5915);maskVal >>= 1;
                __CLR4_5_2498498m68iygj0.R.inc(5916);++bitNum;
            }
            }__CLR4_5_2498498m68iygj0.R.inc(5917);buffer[byteNum] = val;
        }

        // Fill in 8 bits at a time
        }__CLR4_5_2498498m68iygj0.R.inc(5918);byteNum = bitNum >> 3;
        __CLR4_5_2498498m68iygj0.R.inc(5919);while ((((bitNum < lastBit - 7)&&(__CLR4_5_2498498m68iygj0.R.iget(5920)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5921)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(5922);buffer[byteNum++] = (byte)255;
            __CLR4_5_2498498m68iygj0.R.inc(5923);bitNum += 8;
        }

        // Fill in remaining bits
        }__CLR4_5_2498498m68iygj0.R.inc(5924);while ((((bitNum < lastBit)&&(__CLR4_5_2498498m68iygj0.R.iget(5925)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5926)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(5927);byteNum = bitNum >> 3;
            __CLR4_5_2498498m68iygj0.R.inc(5928);buffer[byteNum] |= 1 << (7 - (bitNum & 0x7));
            __CLR4_5_2498498m68iygj0.R.inc(5929);++bitNum;
        }
    }}finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    // Returns run length
    private int decodeWhiteCodeWord() {try{__CLR4_5_2498498m68iygj0.R.inc(5930);
        __CLR4_5_2498498m68iygj0.R.inc(5931);int current;
        __CLR4_5_2498498m68iygj0.R.inc(5932);int entry;
        __CLR4_5_2498498m68iygj0.R.inc(5933);int bits;
        __CLR4_5_2498498m68iygj0.R.inc(5934);int isT;
        __CLR4_5_2498498m68iygj0.R.inc(5935);int twoBits;
        __CLR4_5_2498498m68iygj0.R.inc(5936);int code = -1;
        __CLR4_5_2498498m68iygj0.R.inc(5937);int runLength = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5938);boolean isWhite = true;

        __CLR4_5_2498498m68iygj0.R.inc(5939);while ((((isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5940)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5941)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(5942);current = nextNBits(10);
            __CLR4_5_2498498m68iygj0.R.inc(5943);entry = white[current];

            // Get the 3 fields from the entry
            __CLR4_5_2498498m68iygj0.R.inc(5944);isT = entry & 0x0001;
            __CLR4_5_2498498m68iygj0.R.inc(5945);bits = (entry >>> 1) & 0x0f;

            __CLR4_5_2498498m68iygj0.R.inc(5946);if ((((bits == 12)&&(__CLR4_5_2498498m68iygj0.R.iget(5947)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5948)==0&false))) {{           // Additional Make up code
                // Get the next 2 bits
                __CLR4_5_2498498m68iygj0.R.inc(5949);twoBits = nextLesserThan8Bits(2);
                // Consolidate the 2 new bits and last 2 bits into 4 bits
                __CLR4_5_2498498m68iygj0.R.inc(5950);current = ((current << 2) & 0x000c) | twoBits;
                __CLR4_5_2498498m68iygj0.R.inc(5951);entry = additionalMakeup[current];
                __CLR4_5_2498498m68iygj0.R.inc(5952);bits = (entry >>> 1) & 0x07;     // 3 bits 0000 0111
                __CLR4_5_2498498m68iygj0.R.inc(5953);code = (entry >>> 4) & 0x0fff;   // 12 bits
                __CLR4_5_2498498m68iygj0.R.inc(5954);runLength += code;
                __CLR4_5_2498498m68iygj0.R.inc(5955);updatePointer(4 - bits);
            } }else {__CLR4_5_2498498m68iygj0.R.inc(5956);if ((((bits == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(5957)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5958)==0&false))) {{     // ERROR
                __CLR4_5_2498498m68iygj0.R.inc(5959);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder0"));
            } }else {__CLR4_5_2498498m68iygj0.R.inc(5960);if ((((bits == 15)&&(__CLR4_5_2498498m68iygj0.R.iget(5961)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5962)==0&false))) {{    // EOL
                __CLR4_5_2498498m68iygj0.R.inc(5963);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder1"));
            } }else {{
                // 11 bits - 0000 0111 1111 1111 = 0x07ff
                __CLR4_5_2498498m68iygj0.R.inc(5964);code = (entry >>> 5) & 0x07ff;
                __CLR4_5_2498498m68iygj0.R.inc(5965);runLength += code;
                __CLR4_5_2498498m68iygj0.R.inc(5966);updatePointer(10 - bits);
                __CLR4_5_2498498m68iygj0.R.inc(5967);if ((((isT == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(5968)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5969)==0&false))) {{
                    __CLR4_5_2498498m68iygj0.R.inc(5970);isWhite = false;
                }
            }}
        }}}}

        }__CLR4_5_2498498m68iygj0.R.inc(5971);return runLength;
    }finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    // Returns run length
    private int decodeBlackCodeWord() {try{__CLR4_5_2498498m68iygj0.R.inc(5972);
        __CLR4_5_2498498m68iygj0.R.inc(5973);int current;
        __CLR4_5_2498498m68iygj0.R.inc(5974);int entry;
        __CLR4_5_2498498m68iygj0.R.inc(5975);int bits;
        __CLR4_5_2498498m68iygj0.R.inc(5976);int isT;
        __CLR4_5_2498498m68iygj0.R.inc(5977);int code = -1;
        __CLR4_5_2498498m68iygj0.R.inc(5978);int runLength = 0;
        __CLR4_5_2498498m68iygj0.R.inc(5979);boolean isWhite = false;

        __CLR4_5_2498498m68iygj0.R.inc(5980);while ((((!isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(5981)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5982)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(5983);current = nextLesserThan8Bits(4);
            __CLR4_5_2498498m68iygj0.R.inc(5984);entry = initBlack[current];

            // Get the 3 fields from the entry
//            isT = entry & 0x0001;
            __CLR4_5_2498498m68iygj0.R.inc(5985);bits = (entry >>> 1) & 0x000f;
            __CLR4_5_2498498m68iygj0.R.inc(5986);code = (entry >>> 5) & 0x07ff;

            __CLR4_5_2498498m68iygj0.R.inc(5987);if ((((code == 100)&&(__CLR4_5_2498498m68iygj0.R.iget(5988)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5989)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(5990);current = nextNBits(9);
                __CLR4_5_2498498m68iygj0.R.inc(5991);entry = black[current];

                // Get the 3 fields from the entry
                __CLR4_5_2498498m68iygj0.R.inc(5992);isT = entry & 0x0001;
                __CLR4_5_2498498m68iygj0.R.inc(5993);bits = (entry >>> 1) & 0x000f;
                __CLR4_5_2498498m68iygj0.R.inc(5994);code = (entry >>> 5) & 0x07ff;

                __CLR4_5_2498498m68iygj0.R.inc(5995);if ((((bits == 12)&&(__CLR4_5_2498498m68iygj0.R.iget(5996)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(5997)==0&false))) {{
                    // Additional makeup codes
                    __CLR4_5_2498498m68iygj0.R.inc(5998);updatePointer(5);
                    __CLR4_5_2498498m68iygj0.R.inc(5999);current = nextLesserThan8Bits(4);
                    __CLR4_5_2498498m68iygj0.R.inc(6000);entry = additionalMakeup[current];
                    __CLR4_5_2498498m68iygj0.R.inc(6001);bits = (entry >>> 1) & 0x07;     // 3 bits 0000 0111
                    __CLR4_5_2498498m68iygj0.R.inc(6002);code  = (entry >>> 4) & 0x0fff;  // 12 bits
                    __CLR4_5_2498498m68iygj0.R.inc(6003);runLength += code;

                    __CLR4_5_2498498m68iygj0.R.inc(6004);updatePointer(4 - bits);
                } }else {__CLR4_5_2498498m68iygj0.R.inc(6005);if ((((bits == 15)&&(__CLR4_5_2498498m68iygj0.R.iget(6006)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6007)==0&false))) {{
                    // EOL code
                    __CLR4_5_2498498m68iygj0.R.inc(6008);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder2"));
                } }else {{
                    __CLR4_5_2498498m68iygj0.R.inc(6009);runLength += code;
                    __CLR4_5_2498498m68iygj0.R.inc(6010);updatePointer(9 - bits);
                    __CLR4_5_2498498m68iygj0.R.inc(6011);if ((((isT == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(6012)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6013)==0&false))) {{
                        __CLR4_5_2498498m68iygj0.R.inc(6014);isWhite = true;
                    }
                }}
            }}} }else {__CLR4_5_2498498m68iygj0.R.inc(6015);if ((((code == 200)&&(__CLR4_5_2498498m68iygj0.R.iget(6016)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6017)==0&false))) {{
                // Is a Terminating code
                __CLR4_5_2498498m68iygj0.R.inc(6018);current = nextLesserThan8Bits(2);
                __CLR4_5_2498498m68iygj0.R.inc(6019);entry = twoBitBlack[current];
                __CLR4_5_2498498m68iygj0.R.inc(6020);code = (entry >>> 5) & 0x07ff;
                __CLR4_5_2498498m68iygj0.R.inc(6021);runLength += code;
                __CLR4_5_2498498m68iygj0.R.inc(6022);bits = (entry >>> 1) & 0x0f;
                __CLR4_5_2498498m68iygj0.R.inc(6023);updatePointer(2 - bits);
                __CLR4_5_2498498m68iygj0.R.inc(6024);isWhite = true;
            } }else {{
                // Is a Terminating code
                __CLR4_5_2498498m68iygj0.R.inc(6025);runLength += code;
                __CLR4_5_2498498m68iygj0.R.inc(6026);updatePointer(4 - bits);
                __CLR4_5_2498498m68iygj0.R.inc(6027);isWhite = true;
            }
        }}}

        }__CLR4_5_2498498m68iygj0.R.inc(6028);return runLength;
    }finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    private int readEOL() {try{__CLR4_5_2498498m68iygj0.R.inc(6029);
        __CLR4_5_2498498m68iygj0.R.inc(6030);if ((((fillBits == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(6031)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6032)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6033);if ((((nextNBits(12) != 1)&&(__CLR4_5_2498498m68iygj0.R.iget(6034)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6035)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6036);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder6"));
            }
        }} }else {__CLR4_5_2498498m68iygj0.R.inc(6037);if ((((fillBits == 1)&&(__CLR4_5_2498498m68iygj0.R.iget(6038)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6039)==0&false))) {{

            // First EOL code word xxxx 0000 0000 0001 will occur
            // As many fill bits will be present as required to make
            // the EOL code of 12 bits end on a byte boundary.

            __CLR4_5_2498498m68iygj0.R.inc(6040);int bitsLeft = 8 - bitPointer;

            __CLR4_5_2498498m68iygj0.R.inc(6041);if ((((nextNBits(bitsLeft) != 0)&&(__CLR4_5_2498498m68iygj0.R.iget(6042)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6043)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6044);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder8"));
            }

            // If the number of bitsLeft is less than 8, then to have a 12
            // bit EOL sequence, two more bytes are certainly going to be
            // required. The first of them has to be all zeros, so ensure
            // that.
            }__CLR4_5_2498498m68iygj0.R.inc(6045);if ((((bitsLeft < 4)&&(__CLR4_5_2498498m68iygj0.R.iget(6046)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6047)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6048);if ((((nextNBits(8) != 0)&&(__CLR4_5_2498498m68iygj0.R.iget(6049)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6050)==0&false))) {{
                    __CLR4_5_2498498m68iygj0.R.inc(6051);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder8"));
                }
            }}

            // There might be a random number of fill bytes with 0s, so
            // loop till the EOL of 0000 0001 is found, as long as all
            // the bytes preceding it are 0's.
            }__CLR4_5_2498498m68iygj0.R.inc(6052);int n;
            __CLR4_5_2498498m68iygj0.R.inc(6053);while ((n = nextNBits(8)) != 1) {{

                // If not all zeros
                __CLR4_5_2498498m68iygj0.R.inc(6056);if ((((n != 0)&&(__CLR4_5_2498498m68iygj0.R.iget(6057)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6058)==0&false))) {{
                    __CLR4_5_2498498m68iygj0.R.inc(6059);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder8"));
                }
            }}
        }}

        // If one dimensional encoding mode, then always return 1
        }}__CLR4_5_2498498m68iygj0.R.inc(6060);if ((((oneD == 0)&&(__CLR4_5_2498498m68iygj0.R.iget(6061)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6062)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6063);return 1;
        } }else {{
            // Otherwise for 2D encoding mode,
            // The next one bit signifies 1D/2D encoding of next line.
            __CLR4_5_2498498m68iygj0.R.inc(6064);return nextLesserThan8Bits(1);
        }
    }}finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    private void getNextChangingElement(int a0, boolean isWhite, int[] ret) {try{__CLR4_5_2498498m68iygj0.R.inc(6065);
        // Local copies of instance variables
        __CLR4_5_2498498m68iygj0.R.inc(6066);int[] pce = this.prevChangingElems;
        __CLR4_5_2498498m68iygj0.R.inc(6067);int ces = this.changingElemSize;

        // If the previous match was at an odd element, we still
        // have to search the preceeding element.
        // int start = lastChangingElement & ~0x1;
        __CLR4_5_2498498m68iygj0.R.inc(6068);int start = (((lastChangingElement > 0 )&&(__CLR4_5_2498498m68iygj0.R.iget(6069)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6070)==0&false))? lastChangingElement - 1 : 0;
        __CLR4_5_2498498m68iygj0.R.inc(6071);if ((((isWhite)&&(__CLR4_5_2498498m68iygj0.R.iget(6072)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6073)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6074);start &= ~0x1; // Search even numbered elements
        } }else {{
            __CLR4_5_2498498m68iygj0.R.inc(6075);start |= 0x1; // Search odd numbered elements
        }

        }__CLR4_5_2498498m68iygj0.R.inc(6076);int i = start;
        __CLR4_5_2498498m68iygj0.R.inc(6077);for (; (((i < ces)&&(__CLR4_5_2498498m68iygj0.R.iget(6078)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6079)==0&false)); i += 2) {{
            __CLR4_5_2498498m68iygj0.R.inc(6080);int temp = pce[i];
            __CLR4_5_2498498m68iygj0.R.inc(6081);if ((((temp > a0)&&(__CLR4_5_2498498m68iygj0.R.iget(6082)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6083)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6084);lastChangingElement = i;
                __CLR4_5_2498498m68iygj0.R.inc(6085);ret[0] = temp;
                __CLR4_5_2498498m68iygj0.R.inc(6086);break;
            }
        }}

        }__CLR4_5_2498498m68iygj0.R.inc(6087);if ((((i + 1 < ces)&&(__CLR4_5_2498498m68iygj0.R.iget(6088)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6089)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6090);ret[1] = pce[i + 1];
        }
    }}finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    private int nextNBits(int bitsToGet) {try{__CLR4_5_2498498m68iygj0.R.inc(6091);
        __CLR4_5_2498498m68iygj0.R.inc(6092);byte b;
        __CLR4_5_2498498m68iygj0.R.inc(6093);byte next;
        __CLR4_5_2498498m68iygj0.R.inc(6094);byte next2next;
        __CLR4_5_2498498m68iygj0.R.inc(6095);int l = data.length - 1;
        __CLR4_5_2498498m68iygj0.R.inc(6096);int bp = this.bytePointer;

        __CLR4_5_2498498m68iygj0.R.inc(6097);if ((((fillOrder == 1)&&(__CLR4_5_2498498m68iygj0.R.iget(6098)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6099)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6100);b = data[bp];

            __CLR4_5_2498498m68iygj0.R.inc(6101);if ((((bp == l)&&(__CLR4_5_2498498m68iygj0.R.iget(6102)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6103)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6104);next = 0x00;
                __CLR4_5_2498498m68iygj0.R.inc(6105);next2next = 0x00;
            } }else {__CLR4_5_2498498m68iygj0.R.inc(6106);if (((((bp + 1) == l)&&(__CLR4_5_2498498m68iygj0.R.iget(6107)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6108)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6109);next = data[bp + 1];
                __CLR4_5_2498498m68iygj0.R.inc(6110);next2next = 0x00;
            } }else {{
                __CLR4_5_2498498m68iygj0.R.inc(6111);next = data[bp + 1];
                __CLR4_5_2498498m68iygj0.R.inc(6112);next2next = data[bp + 2];
            }
        }}} }else {__CLR4_5_2498498m68iygj0.R.inc(6113);if ((((fillOrder == 2)&&(__CLR4_5_2498498m68iygj0.R.iget(6114)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6115)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6116);b = flipTable[data[bp] & 0xff];

            __CLR4_5_2498498m68iygj0.R.inc(6117);if ((((bp == l)&&(__CLR4_5_2498498m68iygj0.R.iget(6118)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6119)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6120);next = 0x00;
                __CLR4_5_2498498m68iygj0.R.inc(6121);next2next = 0x00;
            } }else {__CLR4_5_2498498m68iygj0.R.inc(6122);if (((((bp + 1) == l)&&(__CLR4_5_2498498m68iygj0.R.iget(6123)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6124)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6125);next = flipTable[data[bp + 1] & 0xff];
                __CLR4_5_2498498m68iygj0.R.inc(6126);next2next = 0x00;
            } }else {{
                __CLR4_5_2498498m68iygj0.R.inc(6127);next = flipTable[data[bp + 1] & 0xff];
                __CLR4_5_2498498m68iygj0.R.inc(6128);next2next = flipTable[data[bp + 2] & 0xff];
            }
        }}} }else {{
            __CLR4_5_2498498m68iygj0.R.inc(6129);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder7"));
        }

        }}__CLR4_5_2498498m68iygj0.R.inc(6130);int bitsLeft = 8 - bitPointer;
        __CLR4_5_2498498m68iygj0.R.inc(6131);int bitsFromNextByte = bitsToGet - bitsLeft;
        __CLR4_5_2498498m68iygj0.R.inc(6132);int bitsFromNext2NextByte = 0;
        __CLR4_5_2498498m68iygj0.R.inc(6133);if ((((bitsFromNextByte > 8)&&(__CLR4_5_2498498m68iygj0.R.iget(6134)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6135)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6136);bitsFromNext2NextByte = bitsFromNextByte - 8;
            __CLR4_5_2498498m68iygj0.R.inc(6137);bitsFromNextByte = 8;
        }

        }__CLR4_5_2498498m68iygj0.R.inc(6138);bytePointer++;

        __CLR4_5_2498498m68iygj0.R.inc(6139);int i1 = (b & table1[bitsLeft]) << (bitsToGet - bitsLeft);
        __CLR4_5_2498498m68iygj0.R.inc(6140);int i2 = (next & table2[bitsFromNextByte]) >>> (8 - bitsFromNextByte);

        __CLR4_5_2498498m68iygj0.R.inc(6141);int i3 = 0;
        __CLR4_5_2498498m68iygj0.R.inc(6142);if ((((bitsFromNext2NextByte != 0)&&(__CLR4_5_2498498m68iygj0.R.iget(6143)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6144)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6145);i2 <<= bitsFromNext2NextByte;
            __CLR4_5_2498498m68iygj0.R.inc(6146);i3 = (next2next & table2[bitsFromNext2NextByte])
                >>> (8 - bitsFromNext2NextByte);
            __CLR4_5_2498498m68iygj0.R.inc(6147);i2 |= i3;
            __CLR4_5_2498498m68iygj0.R.inc(6148);bytePointer++;
            __CLR4_5_2498498m68iygj0.R.inc(6149);bitPointer = bitsFromNext2NextByte;
        } }else {{
            __CLR4_5_2498498m68iygj0.R.inc(6150);if ((((bitsFromNextByte == 8)&&(__CLR4_5_2498498m68iygj0.R.iget(6151)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6152)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6153);bitPointer = 0;
                __CLR4_5_2498498m68iygj0.R.inc(6154);bytePointer++;
            } }else {{
                __CLR4_5_2498498m68iygj0.R.inc(6155);bitPointer = bitsFromNextByte;
            }
        }}

        }__CLR4_5_2498498m68iygj0.R.inc(6156);int i = i1 | i2;
        __CLR4_5_2498498m68iygj0.R.inc(6157);return i;
    }finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    private int nextLesserThan8Bits(int bitsToGet) {try{__CLR4_5_2498498m68iygj0.R.inc(6158);
        __CLR4_5_2498498m68iygj0.R.inc(6159);byte b;
        __CLR4_5_2498498m68iygj0.R.inc(6160);byte next;
        __CLR4_5_2498498m68iygj0.R.inc(6161);int l = data.length - 1;
        __CLR4_5_2498498m68iygj0.R.inc(6162);int bp = this.bytePointer;

        __CLR4_5_2498498m68iygj0.R.inc(6163);if ((((fillOrder == 1)&&(__CLR4_5_2498498m68iygj0.R.iget(6164)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6165)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6166);b = data[bp];
            __CLR4_5_2498498m68iygj0.R.inc(6167);if ((((bp == l)&&(__CLR4_5_2498498m68iygj0.R.iget(6168)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6169)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6170);next = 0x00;
            } }else {{
                __CLR4_5_2498498m68iygj0.R.inc(6171);next = data[bp + 1];
            }
        }} }else {__CLR4_5_2498498m68iygj0.R.inc(6172);if ((((fillOrder == 2)&&(__CLR4_5_2498498m68iygj0.R.iget(6173)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6174)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6175);b = flipTable[data[bp] & 0xff];
            __CLR4_5_2498498m68iygj0.R.inc(6176);if ((((bp == l)&&(__CLR4_5_2498498m68iygj0.R.iget(6177)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6178)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6179);next = 0x00;
            } }else {{
                __CLR4_5_2498498m68iygj0.R.inc(6180);next = flipTable[data[bp + 1] & 0xff];
            }
        }} }else {{
            __CLR4_5_2498498m68iygj0.R.inc(6181);throw new RuntimeException(PropertyUtil.getString("TIFFFaxDecoder7"));
        }

        }}__CLR4_5_2498498m68iygj0.R.inc(6182);int bitsLeft = 8 - bitPointer;
        __CLR4_5_2498498m68iygj0.R.inc(6183);int bitsFromNextByte = bitsToGet - bitsLeft;

        __CLR4_5_2498498m68iygj0.R.inc(6184);int shift = bitsLeft - bitsToGet;
        __CLR4_5_2498498m68iygj0.R.inc(6185);int i1;
        __CLR4_5_2498498m68iygj0.R.inc(6186);int i2;
        __CLR4_5_2498498m68iygj0.R.inc(6187);if ((((shift >= 0)&&(__CLR4_5_2498498m68iygj0.R.iget(6188)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6189)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6190);i1 = (b & table1[bitsLeft]) >>> shift;
            __CLR4_5_2498498m68iygj0.R.inc(6191);bitPointer += bitsToGet;
            __CLR4_5_2498498m68iygj0.R.inc(6192);if ((((bitPointer == 8)&&(__CLR4_5_2498498m68iygj0.R.iget(6193)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6194)==0&false))) {{
                __CLR4_5_2498498m68iygj0.R.inc(6195);bitPointer = 0;
                __CLR4_5_2498498m68iygj0.R.inc(6196);bytePointer++;
            }
        }} }else {{
            __CLR4_5_2498498m68iygj0.R.inc(6197);i1 = (b & table1[bitsLeft]) << (-shift);
            __CLR4_5_2498498m68iygj0.R.inc(6198);i2 = (next & table2[bitsFromNextByte]) >>> (8 - bitsFromNextByte);

            __CLR4_5_2498498m68iygj0.R.inc(6199);i1 |= i2;
            __CLR4_5_2498498m68iygj0.R.inc(6200);bytePointer++;
            __CLR4_5_2498498m68iygj0.R.inc(6201);bitPointer = bitsFromNextByte;
        }

        }__CLR4_5_2498498m68iygj0.R.inc(6202);return i1;
    }finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    // Move pointer backwards by given amount of bits
    private void updatePointer(int bitsToMoveBack) {try{__CLR4_5_2498498m68iygj0.R.inc(6203);
        __CLR4_5_2498498m68iygj0.R.inc(6204);int i = bitPointer - bitsToMoveBack;

        __CLR4_5_2498498m68iygj0.R.inc(6205);if ((((i < 0)&&(__CLR4_5_2498498m68iygj0.R.iget(6206)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6207)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6208);bytePointer--;
            __CLR4_5_2498498m68iygj0.R.inc(6209);bitPointer = 8 + i;
        } }else {{
            __CLR4_5_2498498m68iygj0.R.inc(6210);bitPointer = i;
        }
    }}finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}

    // Move to the next byte boundary
    private boolean advancePointer() {try{__CLR4_5_2498498m68iygj0.R.inc(6211);
        __CLR4_5_2498498m68iygj0.R.inc(6212);if ((((bitPointer != 0)&&(__CLR4_5_2498498m68iygj0.R.iget(6213)!=0|true))||(__CLR4_5_2498498m68iygj0.R.iget(6214)==0&false))) {{
            __CLR4_5_2498498m68iygj0.R.inc(6215);bytePointer++;
            __CLR4_5_2498498m68iygj0.R.inc(6216);bitPointer = 0;
        }

        }__CLR4_5_2498498m68iygj0.R.inc(6217);return true;
    }finally{__CLR4_5_2498498m68iygj0.R.flushNeeded();}}
}

