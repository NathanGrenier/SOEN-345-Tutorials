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

/* $Id: DoubleFormatUtil.java 1732019 2016-02-24 05:01:10Z gadams $ */

package org.apache.xmlgraphics.util;

/**
 * This class implements fast, thread-safe format of a double value
 * with a given number of decimal digits.
 * <p>
 * The contract for the format methods is this one:
 * if the source is greater than or equal to 1 (in absolute value),
 * use the decimals parameter to define the number of decimal digits; else,
 * use the precision parameter to define the number of decimal digits.
 * <p>
 * A few examples (consider decimals being 4 and precision being 8):
 * <ul>
 * <li>0.0 should be rendered as "0"
 * <li>0.1 should be rendered as "0.1"
 * <li>1234.1 should be rendered as "1234.1"
 * <li>1234.1234567 should be rendered as "1234.1235" (note the trailing 5! Rounding!)
 * <li>1234.00001 should be rendered as "1234"
 * <li>0.00001 should be rendered as "0.00001" (here you see the effect of the "precision" parameter)
 * <li>0.00000001 should be rendered as "0.00000001"
 * <li>0.000000001 should be rendered as "0"
 * </ul>
 *
 * Originally authored by Julien Aym&eacute;.
 */
public final class DoubleFormatUtil {public static class __CLR4_5_2f9zf9zm68iyic6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,20033,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DoubleFormatUtil() {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(19799);
    }finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}

    /**
     * Rounds the given source value at the given precision
     * and writes the rounded value into the given target
     *
     * @param source the source value to round
     * @param decimals the decimals to round at (use if abs(source) &ge; 1.0)
     * @param precision the precision to round at (use if abs(source) &lt; 1.0)
     * @param target the buffer to write to
     */
    public static void formatDouble(double source, int decimals, int precision, StringBuffer target) {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(19800);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19801);int scale = ((((Math.abs(source) >= 1.0) )&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19802)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19803)==0&false))? decimals : precision;
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19804);if ((((tooManyDigitsUsed(source, scale) || tooCloseToRound(source, scale))&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19805)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19806)==0&false))) {{
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19807);formatDoublePrecise(source, decimals, precision, target);
        } }else {{
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19808);formatDoubleFast(source, decimals, precision, target);
        }
    }}finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}

    /**
     * Rounds the given source value at the given precision
     * and writes the rounded value into the given target
     * <p>
     * This method internally uses the String representation of the source value,
     * in order to avoid any double precision computation error.
     *
     * @param source the source value to round
     * @param decimals the decimals to round at (use if abs(source) &ge; 1.0)
     * @param precision the precision to round at (use if abs(source) &lt; 1.0)
     * @param target the buffer to write to
     */
    public static void formatDoublePrecise(double source, int decimals, int precision, StringBuffer target) {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(19809);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19810);if ((((isRoundedToZero(source, decimals, precision))&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19811)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19812)==0&false))) {{
            // Will always be rounded to 0
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19813);target.append('0');
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19814);return;
        } }else {__CLR4_5_2f9zf9zm68iyic6.R.inc(19815);if ((((Double.isNaN(source) || Double.isInfinite(source))&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19816)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19817)==0&false))) {{
            // Cannot be formated
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19818);target.append(Double.toString(source));
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19819);return;
        }

        }}__CLR4_5_2f9zf9zm68iyic6.R.inc(19820);boolean negative = source < 0.0;
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19821);if ((((negative)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19822)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19823)==0&false))) {{
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19824);source = -source;
            // Done once and for all
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19825);target.append('-');
        }
        }__CLR4_5_2f9zf9zm68iyic6.R.inc(19826);int scale = ((((source >= 1.0) )&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19827)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19828)==0&false))? decimals : precision;

        // The only way to format precisely the double is to use the String
        // representation of the double, and then to do mathematical integer operation on it.
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19829);String s = Double.toString(source);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19830);if ((((source >= 1e-3 && source < 1e7)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19831)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19832)==0&false))) {{
            // Plain representation of double: "intPart.decimalPart"
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19833);int dot = s.indexOf('.');
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19834);String decS = s.substring(dot + 1);
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19835);int decLength = decS.length();
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19836);if ((((scale >= decLength)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19837)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19838)==0&false))) {{
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19839);if (((("0".equals(decS))&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19840)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19841)==0&false))) {{
                    // source is a mathematical integer
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19842);target.append(s.substring(0, dot));
                } }else {{
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19843);target.append(s);
                    // Remove trailing zeroes
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19844);for (int l = target.length() - 1; (((l >= 0 && target.charAt(l) == '0')&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19845)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19846)==0&false)); l--) {{
                        __CLR4_5_2f9zf9zm68iyic6.R.inc(19847);target.setLength(l);
                    }
                }}
                }__CLR4_5_2f9zf9zm68iyic6.R.inc(19848);return;
            } }else {__CLR4_5_2f9zf9zm68iyic6.R.inc(19849);if ((((scale + 1 < decLength)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19850)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19851)==0&false))) {{
                // ignore unnecessary digits
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19852);decLength = scale + 1;
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19853);decS = decS.substring(0, decLength);
            }
            }}__CLR4_5_2f9zf9zm68iyic6.R.inc(19854);long intP = Long.parseLong(s.substring(0, dot));
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19855);long decP = Long.parseLong(decS);
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19856);format(target, scale, intP, decP);
        } }else {{
            // Scientific representation of double: "x.xxxxxEyyy"
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19857);int dot = s.indexOf('.');
            assert (((dot >= 0)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19858)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19859)==0&false));
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19860);int exp = s.indexOf('E');
            assert (((exp >= 0)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19861)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19862)==0&false));
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19863);int exposant = Integer.parseInt(s.substring(exp + 1));
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19864);String intS = s.substring(0, dot);
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19865);String decS = s.substring(dot + 1, exp);
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19866);int decLength = decS.length();
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19867);if ((((exposant >= 0)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19868)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19869)==0&false))) {{
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19870);int digits = decLength - exposant;
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19871);if ((((digits <= 0)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19872)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19873)==0&false))) {{
                    // no decimal part,
                    // no rounding involved
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19874);target.append(intS);
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19875);target.append(decS);
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19876);for (int i = -digits; (((i > 0)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19877)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19878)==0&false)); i--) {{
                        __CLR4_5_2f9zf9zm68iyic6.R.inc(19879);target.append('0');
                    }
                }} }else {__CLR4_5_2f9zf9zm68iyic6.R.inc(19880);if ((((digits <= scale)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19881)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19882)==0&false))) {{
                    // decimal part precision is lower than scale,
                    // no rounding involved
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19883);target.append(intS);
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19884);target.append(decS.substring(0, exposant));
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19885);target.append('.');
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19886);target.append(decS.substring(exposant));
                } }else {{
                    // decimalDigits > scale,
                    // Rounding involved
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19887);long intP = Long.parseLong(intS) * tenPow(exposant) + Long.parseLong(decS.substring(0, exposant));
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19888);long decP = Long.parseLong(decS.substring(exposant, exposant + scale + 1));
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19889);format(target, scale, intP, decP);
                }
            }}} }else {{
                // Only a decimal part is supplied
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19890);exposant = -exposant;
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19891);int digits = scale - exposant + 1;
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19892);if ((((digits < 0)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19893)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19894)==0&false))) {{
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19895);target.append('0');
                } }else {__CLR4_5_2f9zf9zm68iyic6.R.inc(19896);if ((((digits == 0)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19897)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19898)==0&false))) {{
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19899);long decP = Long.parseLong(intS);
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19900);format(target, scale, 0L, decP);
                } }else {__CLR4_5_2f9zf9zm68iyic6.R.inc(19901);if ((((decLength < digits)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19902)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19903)==0&false))) {{
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19904);long decP = Long.parseLong(intS) * tenPow(decLength + 1) + Long.parseLong(decS) * 10;
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19905);format(target, exposant + decLength, 0L, decP);
                } }else {{
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19906);long subDecP = Long.parseLong(decS.substring(0, digits));
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19907);long decP = Long.parseLong(intS) * tenPow(digits) + subDecP;
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19908);format(target, scale, 0L, decP);
                }
            }}}}
        }}
    }}finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}

    /**
     * Returns true if the given source value will be rounded to zero
     *
     * @param source the source value to round
     * @param decimals the decimals to round at (use if abs(source) &ge; 1.0)
     * @param precision the precision to round at (use if abs(source) &lt; 1.0)
     * @return true if the source value will be rounded to zero
     */
    private static boolean isRoundedToZero(double source, int decimals, int precision) {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(19909);
        // Use 4.999999999999999 instead of 5 since in some cases, 5.0 / 1eN > 5e-N (e.g. for N = 37, 42, 45, 66, ...)
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19910);return source == 0.0 || Math.abs(source) < 4.999999999999999 / tenPowDouble(Math.max(decimals, precision) + 1);
    }finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}

    /**
     * Most used power of ten (to avoid the cost of Math.pow(10, n)
     */
    private static final long[] POWERS_OF_TEN_LONG = new long[19];
    private static final double[] POWERS_OF_TEN_DOUBLE = new double[30];
    static {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(19911);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19912);POWERS_OF_TEN_LONG[0] = 1L;
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19913);for (int i = 1; (((i < POWERS_OF_TEN_LONG.length)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19914)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19915)==0&false)); i++) {{
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19916);POWERS_OF_TEN_LONG[i] = POWERS_OF_TEN_LONG[i - 1] * 10L;
        }
        }__CLR4_5_2f9zf9zm68iyic6.R.inc(19917);for (int i = 0; (((i < POWERS_OF_TEN_DOUBLE.length)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19918)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19919)==0&false)); i++) {{
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19920);POWERS_OF_TEN_DOUBLE[i] = Double.parseDouble("1e" + i);
        }
    }}finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}

    /**
     * Returns ten to the power of n
     *
     * @param n the nth power of ten to get
     * @return ten to the power of n
     */
    public static long tenPow(int n) {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(19921);
        assert (((n >= 0)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19922)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19923)==0&false));
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19924);return (((n < POWERS_OF_TEN_LONG.length )&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19925)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19926)==0&false))? POWERS_OF_TEN_LONG[n] : (long) Math.pow(10, n);
    }finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}

    private static double tenPowDouble(int n) {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(19927);
        assert (((n >= 0)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19928)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19929)==0&false));
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19930);return (((n < POWERS_OF_TEN_DOUBLE.length )&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19931)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19932)==0&false))? POWERS_OF_TEN_DOUBLE[n] : Math.pow(10, n);
    }finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}

    /**
     * Helper method to do the custom rounding used within formatDoublePrecise
     *
     * @param target the buffer to write to
     * @param scale the expected rounding scale
     * @param intP the source integer part
     * @param decP the source decimal part, truncated to scale + 1 digit
     */
    private static void format(StringBuffer target, int scale, long intP, long decP) {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(19933);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19934);if ((((decP != 0L)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19935)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19936)==0&false))) {{
            // decP is the decimal part of source, truncated to scale + 1 digit.
            // Custom rounding: add 5
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19937);decP += 5L;
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19938);decP /= 10L;
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19939);if ((((decP >= tenPowDouble(scale))&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19940)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19941)==0&false))) {{
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19942);intP++;
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19943);decP -= tenPow(scale);
            }
            }__CLR4_5_2f9zf9zm68iyic6.R.inc(19944);if ((((decP != 0L)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19945)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19946)==0&false))) {{
                // Remove trailing zeroes
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19947);while ((((decP % 10L == 0L)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19948)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19949)==0&false))) {{
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19950);decP = decP / 10L;
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(19951);scale--;
                }
            }}
        }}
        }__CLR4_5_2f9zf9zm68iyic6.R.inc(19952);target.append(intP);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19953);if ((((decP != 0L)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19954)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19955)==0&false))) {{
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19956);target.append('.');
            // Use tenPow instead of tenPowDouble for scale below 18,
            // since the casting of decP to double may cause some imprecisions:
            // E.g. for decP = 9999999999999999L and scale = 17,
            // decP < tenPow(16) while (double) decP == tenPowDouble(16)
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19957);while ((((scale > 0 && ((((scale > 18 )&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19958)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19959)==0&false))? decP < tenPowDouble(--scale) : decP < tenPow(--scale)))&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19960)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19961)==0&false))) {{
                // Insert leading zeroes
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19962);target.append('0');
            }
            }__CLR4_5_2f9zf9zm68iyic6.R.inc(19963);target.append(decP);
        }
    }}finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}

    /**
     * Rounds the given source value at the given precision
     * and writes the rounded value into the given target
     * <p>
     * This method internally uses double precision computation and rounding,
     * so the result may not be accurate (see formatDouble method for conditions).
     *
     * @param source the source value to round
     * @param decimals the decimals to round at (use if abs(source) &ge; 1.0)
     * @param precision the precision to round at (use if abs(source) &lt; 1.0)
     * @param target the buffer to write to
     */
    public static void formatDoubleFast(double source, int decimals, int precision, StringBuffer target) {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(19964);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19965);if ((((isRoundedToZero(source, decimals, precision))&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19966)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19967)==0&false))) {{
            // Will always be rounded to 0
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19968);target.append('0');
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19969);return;
        } }else {__CLR4_5_2f9zf9zm68iyic6.R.inc(19970);if ((((Double.isNaN(source) || Double.isInfinite(source))&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19971)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19972)==0&false))) {{
            // Cannot be formated
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19973);target.append(Double.toString(source));
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19974);return;
        }

        }}__CLR4_5_2f9zf9zm68iyic6.R.inc(19975);boolean isPositive = source >= 0.0;
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19976);source = Math.abs(source);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19977);int scale = ((((source >= 1.0) )&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19978)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19979)==0&false))? decimals : precision;

        __CLR4_5_2f9zf9zm68iyic6.R.inc(19980);long intPart = (long) Math.floor(source);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19981);double tenScale = tenPowDouble(scale);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19982);double fracUnroundedPart = (source - intPart) * tenScale;
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19983);long fracPart = Math.round(fracUnroundedPart);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(19984);if ((((fracPart >= tenScale)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19985)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19986)==0&false))) {{
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19987);intPart++;
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19988);fracPart = Math.round(fracPart - tenScale);
        }
        }__CLR4_5_2f9zf9zm68iyic6.R.inc(19989);if ((((fracPart != 0L)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19990)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19991)==0&false))) {{
            // Remove trailing zeroes
            __CLR4_5_2f9zf9zm68iyic6.R.inc(19992);while ((((fracPart % 10L == 0L)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19993)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19994)==0&false))) {{
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19995);fracPart = fracPart / 10L;
                __CLR4_5_2f9zf9zm68iyic6.R.inc(19996);scale--;
            }
        }}

        }__CLR4_5_2f9zf9zm68iyic6.R.inc(19997);if ((((intPart != 0L || fracPart != 0L)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(19998)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(19999)==0&false))) {{
            // non-zero value
            __CLR4_5_2f9zf9zm68iyic6.R.inc(20000);if ((((!isPositive)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(20001)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(20002)==0&false))) {{
                // negative value, insert sign
                __CLR4_5_2f9zf9zm68iyic6.R.inc(20003);target.append('-');
            }
            // append integer part
            }__CLR4_5_2f9zf9zm68iyic6.R.inc(20004);target.append(intPart);
            __CLR4_5_2f9zf9zm68iyic6.R.inc(20005);if ((((fracPart != 0L)&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(20006)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(20007)==0&false))) {{
                // append fractional part
                __CLR4_5_2f9zf9zm68iyic6.R.inc(20008);target.append('.');
                // insert leading zeroes
                __CLR4_5_2f9zf9zm68iyic6.R.inc(20009);while ((((scale > 0 && fracPart < tenPowDouble(--scale))&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(20010)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(20011)==0&false))) {{
                    __CLR4_5_2f9zf9zm68iyic6.R.inc(20012);target.append('0');
                }
                }__CLR4_5_2f9zf9zm68iyic6.R.inc(20013);target.append(fracPart);
            }
        }} }else {{
            __CLR4_5_2f9zf9zm68iyic6.R.inc(20014);target.append('0');
        }
    }}finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}

    /**
     * Returns the exponent of the given value
     *
     * @param value the value to get the exponent from
     * @return the value's exponent
     */
    public static int getExponant(double value) {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(20015);
        // See Double.doubleToRawLongBits javadoc or IEEE-754 spec
        // to have this algorithm
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20016);long exp = Double.doubleToRawLongBits(value) & 0x7ff0000000000000L;
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20017);exp = exp >> 52;
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20018);return (int) (exp - 1023L);
    }finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}

    /**
     * Returns true if the rounding is considered to use too many digits
     * of the double for a fast rounding
     *
     * @param source the source to round
     * @param scale the scale to round at
     * @return true if the rounding will potentially use too many digits
     */
    private static boolean tooManyDigitsUsed(double source, int scale) {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(20019);
        // if scale >= 308, 10^308 ~= Infinity
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20020);double decExp = Math.log10(source);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20021);return scale >= 308 || decExp + scale >= 14.5;
    }finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}

    /**
     * Returns true if the given source is considered to be too close
     * of a rounding value for the given scale.
     *
     * @param source the source to round
     * @param scale the scale to round at
     * @return true if the source will be potentially rounded at the scale
     */
    private static boolean tooCloseToRound(double source, int scale) {try{__CLR4_5_2f9zf9zm68iyic6.R.inc(20022);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20023);source = Math.abs(source);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20024);long intPart = (long) Math.floor(source);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20025);double fracPart = (source - intPart) * tenPowDouble(scale);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20026);double decExp = Math.log10(source);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20027);double range = (((decExp + scale >= 12 )&&(__CLR4_5_2f9zf9zm68iyic6.R.iget(20028)!=0|true))||(__CLR4_5_2f9zf9zm68iyic6.R.iget(20029)==0&false))? .1 : .001;
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20030);double distanceToRound1 = Math.abs(fracPart - Math.floor(fracPart));
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20031);double distanceToRound2 = Math.abs(fracPart - Math.floor(fracPart) - 0.5);
        __CLR4_5_2f9zf9zm68iyic6.R.inc(20032);return distanceToRound1 <= range || distanceToRound2 <= range;
        // .001 range: Totally arbitrary range,
        // I never had a failure in 10e7 random tests with this value
        // May be JVM dependent or architecture dependent
    }finally{__CLR4_5_2f9zf9zm68iyic6.R.flushNeeded();}}
}
