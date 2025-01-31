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

/* $Id: PSDictionary.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// CSOFF: InnerAssignment

/**
 * This class is used to encapsulate postscript dictionary objects.
 */
public class PSDictionary extends java.util.HashMap {public static class __CLR4_5_2d3id3im6lb515o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,17139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 815367222496219197L;

    /**
     * This class is used to parse dictionary strings.
     */
    private static class Maker {

        /**
         * Simple token holding class
         */
        private static class Token {
            /**
             * start index in string
             */
            private int startIndex = -1;

            /**
             * end index in string
             */
            private int endIndex = -1;

            /**
             * token string value
             */
            private String value;
        }

        private static final String[][] BRACES = {
            {"<<", ">>"},
            {"[", "]"},
            {"{", "}"},
            {"(", ")"}
        };

        private static final int OPENING = 0;
        private static final int CLOSING = 1;
        private static final int DICTIONARY = 0;
        private static final int ARRAY = 1;
        private static final int PROCEDURE = 2;
        private static final int STRING = 3;

        /**
         * Returns a Token containing the start, end index and value of the next token
         * found in a given string
         *
         * @param str
         *            string to search
         * @param fromIndex
         *            search from index
         * @return Token containing the start, end index and value of the next token
         */
        protected Token nextToken(String str, int fromIndex) {try{__CLR4_5_2d3id3im6lb515o.R.inc(16974);
            __CLR4_5_2d3id3im6lb515o.R.inc(16975);Token t = null;
            __CLR4_5_2d3id3im6lb515o.R.inc(16976);for (int i = fromIndex; (((i < str.length())&&(__CLR4_5_2d3id3im6lb515o.R.iget(16977)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(16978)==0&false)); i++) {{
                __CLR4_5_2d3id3im6lb515o.R.inc(16979);boolean isWhitespace = Character.isWhitespace(str.charAt(i));
                // start index found
                __CLR4_5_2d3id3im6lb515o.R.inc(16980);if ((((t == null && !isWhitespace)&&(__CLR4_5_2d3id3im6lb515o.R.iget(16981)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(16982)==0&false))) {{
                    __CLR4_5_2d3id3im6lb515o.R.inc(16983);t = new Token();
                    __CLR4_5_2d3id3im6lb515o.R.inc(16984);t.startIndex = i;
                // end index found
                } }else {__CLR4_5_2d3id3im6lb515o.R.inc(16985);if ((((t != null && isWhitespace)&&(__CLR4_5_2d3id3im6lb515o.R.iget(16986)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(16987)==0&false))) {{
                    __CLR4_5_2d3id3im6lb515o.R.inc(16988);t.endIndex = i;
                    __CLR4_5_2d3id3im6lb515o.R.inc(16989);break;
                }
            }}}
            // start index found
            }__CLR4_5_2d3id3im6lb515o.R.inc(16990);if ((((t != null)&&(__CLR4_5_2d3id3im6lb515o.R.iget(16991)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(16992)==0&false))) {{
                // end index not found so take end of string
                __CLR4_5_2d3id3im6lb515o.R.inc(16993);if ((((t.endIndex == -1)&&(__CLR4_5_2d3id3im6lb515o.R.iget(16994)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(16995)==0&false))) {{
                    __CLR4_5_2d3id3im6lb515o.R.inc(16996);t.endIndex = str.length();
                }
                }__CLR4_5_2d3id3im6lb515o.R.inc(16997);t.value = str.substring(t.startIndex, t.endIndex);
            }
            }__CLR4_5_2d3id3im6lb515o.R.inc(16998);return t;
        }finally{__CLR4_5_2d3id3im6lb515o.R.flushNeeded();}}

        /**
         * Returns the closing brace index from a given string searches from a
         * given index
         *
         * @param str
         *            string to search
         * @param braces
         *            string array of opening and closing brace
         * @param fromIndex
         *            searches from index
         * @return matching brace index
         * @throws org.apache.xmlgraphics.ps.PSDictionaryFormatException
         *            thrown in the event that a parsing error occurred
         */
        private int indexOfMatchingBrace(String str, String[] braces,
                int fromIndex) throws PSDictionaryFormatException {try{__CLR4_5_2d3id3im6lb515o.R.inc(16999);
            __CLR4_5_2d3id3im6lb515o.R.inc(17000);final int len = str.length();
            __CLR4_5_2d3id3im6lb515o.R.inc(17001);if ((((braces.length != 2)&&(__CLR4_5_2d3id3im6lb515o.R.iget(17002)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17003)==0&false))) {{
                __CLR4_5_2d3id3im6lb515o.R.inc(17004);throw new PSDictionaryFormatException("Wrong number of braces");
            }
            }__CLR4_5_2d3id3im6lb515o.R.inc(17005);for (int openCnt = 0, closeCnt = 0; (((fromIndex < len)&&(__CLR4_5_2d3id3im6lb515o.R.iget(17006)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17007)==0&false)); fromIndex++) {{
                __CLR4_5_2d3id3im6lb515o.R.inc(17008);if ((((str.startsWith(braces[OPENING], fromIndex))&&(__CLR4_5_2d3id3im6lb515o.R.iget(17009)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17010)==0&false))) {{
                    __CLR4_5_2d3id3im6lb515o.R.inc(17011);openCnt++;
                } }else {__CLR4_5_2d3id3im6lb515o.R.inc(17012);if ((((str.startsWith(braces[CLOSING], fromIndex))&&(__CLR4_5_2d3id3im6lb515o.R.iget(17013)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17014)==0&false))) {{
                    __CLR4_5_2d3id3im6lb515o.R.inc(17015);closeCnt++;
                    __CLR4_5_2d3id3im6lb515o.R.inc(17016);if ((((openCnt > 0 && openCnt == closeCnt)&&(__CLR4_5_2d3id3im6lb515o.R.iget(17017)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17018)==0&false))) {{
                        __CLR4_5_2d3id3im6lb515o.R.inc(17019);return fromIndex; // found
                    }
                }}
            }}}
            }__CLR4_5_2d3id3im6lb515o.R.inc(17020);return -1; // not found
        }finally{__CLR4_5_2d3id3im6lb515o.R.flushNeeded();}}

        /**
         * Strips braces from complex object string
         *
         * @param str
         *            String to parse
         * @param braces
         *            String array containing opening and closing braces
         * @return String with braces stripped
         * @throws org.apache.xmlgraphics.ps.PSDictionaryFormatException
         *            thrown in the event that a parsing error occurred
         */
        private String stripBraces(String str, String[] braces) throws PSDictionaryFormatException {try{__CLR4_5_2d3id3im6lb515o.R.inc(17021);
            // find first opening brace
            __CLR4_5_2d3id3im6lb515o.R.inc(17022);int firstIndex = str.indexOf(braces[OPENING]);
            __CLR4_5_2d3id3im6lb515o.R.inc(17023);if ((((firstIndex == -1)&&(__CLR4_5_2d3id3im6lb515o.R.iget(17024)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17025)==0&false))) {{
                __CLR4_5_2d3id3im6lb515o.R.inc(17026);throw new PSDictionaryFormatException(
                        "Failed to find opening parameter '" + braces[OPENING]
                                + "");
            }

            // find last matching brace
            }__CLR4_5_2d3id3im6lb515o.R.inc(17027);int lastIndex = indexOfMatchingBrace(str, braces, firstIndex);
            __CLR4_5_2d3id3im6lb515o.R.inc(17028);if ((((lastIndex == -1)&&(__CLR4_5_2d3id3im6lb515o.R.iget(17029)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17030)==0&false))) {{
                __CLR4_5_2d3id3im6lb515o.R.inc(17031);throw new PSDictionaryFormatException(
                        "Failed to find matching closing parameter '"
                                + braces[CLOSING] + "'");
            }

            // strip brace and trim
            }__CLR4_5_2d3id3im6lb515o.R.inc(17032);int braceLen = braces[OPENING].length();
            __CLR4_5_2d3id3im6lb515o.R.inc(17033);str = str.substring(firstIndex + braceLen, lastIndex).trim();
            __CLR4_5_2d3id3im6lb515o.R.inc(17034);return str;
        }finally{__CLR4_5_2d3id3im6lb515o.R.flushNeeded();}}

        /**
         * Parses a dictionary string and provides a dictionary object
         *
         * @param str a dictionary string
         * @return A postscript dictionary object
         * @throws org.apache.xmlgraphics.ps.PSDictionaryFormatException
         *            thrown in the event that a parsing error occurred
         */
        public PSDictionary parseDictionary(String str) throws PSDictionaryFormatException {try{__CLR4_5_2d3id3im6lb515o.R.inc(17035);
            __CLR4_5_2d3id3im6lb515o.R.inc(17036);PSDictionary dictionary = new PSDictionary();
            __CLR4_5_2d3id3im6lb515o.R.inc(17037);str = stripBraces(str.trim(), BRACES[DICTIONARY]);
            // length of dictionary string
            __CLR4_5_2d3id3im6lb515o.R.inc(17038);final int len = str.length();

            __CLR4_5_2d3id3im6lb515o.R.inc(17039);Token keyToken;
            __CLR4_5_2d3id3im6lb515o.R.inc(17040);for (int currIndex = 0; (keyToken = nextToken(str, currIndex)) != null
                    && currIndex <= len;) {{
                __CLR4_5_2d3id3im6lb515o.R.inc(17043);if ((((keyToken.value == null)&&(__CLR4_5_2d3id3im6lb515o.R.iget(17044)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17045)==0&false))) {{
                    __CLR4_5_2d3id3im6lb515o.R.inc(17046);throw new PSDictionaryFormatException("Failed to parse object key");
                }
                }__CLR4_5_2d3id3im6lb515o.R.inc(17047);Token valueToken = nextToken(str, keyToken.endIndex + 1);
                __CLR4_5_2d3id3im6lb515o.R.inc(17048);String[] braces = null;
                __CLR4_5_2d3id3im6lb515o.R.inc(17049);for (String[] brace : BRACES) {{
                    __CLR4_5_2d3id3im6lb515o.R.inc(17050);if ((((valueToken.value.startsWith(brace[OPENING]))&&(__CLR4_5_2d3id3im6lb515o.R.iget(17051)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17052)==0&false))) {{
                        __CLR4_5_2d3id3im6lb515o.R.inc(17053);braces = brace;
                        __CLR4_5_2d3id3im6lb515o.R.inc(17054);break;
                    }
                }}
                }__CLR4_5_2d3id3im6lb515o.R.inc(17055);Object obj = null;
                __CLR4_5_2d3id3im6lb515o.R.inc(17056);if ((((braces != null)&&(__CLR4_5_2d3id3im6lb515o.R.iget(17057)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17058)==0&false))) {{
                    // find closing brace
                    __CLR4_5_2d3id3im6lb515o.R.inc(17059);valueToken.endIndex = indexOfMatchingBrace(str, braces,
                        valueToken.startIndex)
                        + braces[OPENING].length();
                    __CLR4_5_2d3id3im6lb515o.R.inc(17060);if ((((valueToken.endIndex < 0)&&(__CLR4_5_2d3id3im6lb515o.R.iget(17061)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17062)==0&false))) {{
                        __CLR4_5_2d3id3im6lb515o.R.inc(17063);throw new PSDictionaryFormatException("Closing value brace '"
                            + braces[CLOSING] + "' not found for key '"
                            + keyToken.value + "'");
                    }
                    }__CLR4_5_2d3id3im6lb515o.R.inc(17064);valueToken.value = str.substring(valueToken.startIndex, valueToken.endIndex);
                }
                }__CLR4_5_2d3id3im6lb515o.R.inc(17065);if ((((braces == null || braces == BRACES[PROCEDURE] || braces == BRACES[STRING])&&(__CLR4_5_2d3id3im6lb515o.R.iget(17066)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17067)==0&false))) {{
                    __CLR4_5_2d3id3im6lb515o.R.inc(17068);obj = valueToken.value;
                } }else {__CLR4_5_2d3id3im6lb515o.R.inc(17069);if ((((BRACES[ARRAY] == braces)&&(__CLR4_5_2d3id3im6lb515o.R.iget(17070)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17071)==0&false))) {{
                    __CLR4_5_2d3id3im6lb515o.R.inc(17072);List objList = new java.util.ArrayList();
                    __CLR4_5_2d3id3im6lb515o.R.inc(17073);String objString = stripBraces(valueToken.value, braces);
                    __CLR4_5_2d3id3im6lb515o.R.inc(17074);StringTokenizer tokenizer = new StringTokenizer(objString, ",");
                    __CLR4_5_2d3id3im6lb515o.R.inc(17075);while ((((tokenizer.hasMoreTokens())&&(__CLR4_5_2d3id3im6lb515o.R.iget(17076)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17077)==0&false))) {{
                        __CLR4_5_2d3id3im6lb515o.R.inc(17078);objList.add(tokenizer.nextToken());
                    }
                    }__CLR4_5_2d3id3im6lb515o.R.inc(17079);obj = objList;
                } }else {__CLR4_5_2d3id3im6lb515o.R.inc(17080);if ((((BRACES[DICTIONARY] == braces)&&(__CLR4_5_2d3id3im6lb515o.R.iget(17081)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17082)==0&false))) {{
                    __CLR4_5_2d3id3im6lb515o.R.inc(17083);obj = parseDictionary(valueToken.value);
                }
                }}}__CLR4_5_2d3id3im6lb515o.R.inc(17084);dictionary.put(keyToken.value, obj);
                __CLR4_5_2d3id3im6lb515o.R.inc(17085);currIndex = valueToken.endIndex + 1;
            }
            }__CLR4_5_2d3id3im6lb515o.R.inc(17086);return dictionary;
        }finally{__CLR4_5_2d3id3im6lb515o.R.flushNeeded();}}
    }

    /**
     * Parses a given a dictionary string and returns an object
     *
     * @param str dictionary string
     * @return dictionary object
     * @throws org.apache.xmlgraphics.ps.PSDictionaryFormatException
     *            thrown in the event that a parsing error occurred
     */
    public static PSDictionary valueOf(String str) throws PSDictionaryFormatException {try{__CLR4_5_2d3id3im6lb515o.R.inc(17087);
        __CLR4_5_2d3id3im6lb515o.R.inc(17088);return (new Maker()).parseDictionary(str);
    }finally{__CLR4_5_2d3id3im6lb515o.R.flushNeeded();}}

    /**
     * @param obj object to test equality against
     * @return whether a given object is equal to this dictionary object
     * @see java.lang.Object#equals(Object)
     */
    public boolean equals(Object obj) {try{__CLR4_5_2d3id3im6lb515o.R.inc(17089);
        __CLR4_5_2d3id3im6lb515o.R.inc(17090);if ((((!(obj instanceof PSDictionary))&&(__CLR4_5_2d3id3im6lb515o.R.iget(17091)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17092)==0&false))) {{
            __CLR4_5_2d3id3im6lb515o.R.inc(17093);return false;
        }
        }__CLR4_5_2d3id3im6lb515o.R.inc(17094);PSDictionary dictionaryObj = (PSDictionary) obj;
        __CLR4_5_2d3id3im6lb515o.R.inc(17095);if ((((dictionaryObj.size() != size())&&(__CLR4_5_2d3id3im6lb515o.R.iget(17096)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17097)==0&false))) {{
            __CLR4_5_2d3id3im6lb515o.R.inc(17098);return false;
        }
        }__CLR4_5_2d3id3im6lb515o.R.inc(17099);for (Object e : entrySet()) {{
            __CLR4_5_2d3id3im6lb515o.R.inc(17100);Map.Entry entry = (Map.Entry) e;
            __CLR4_5_2d3id3im6lb515o.R.inc(17101);String key = (String) entry.getKey();
            __CLR4_5_2d3id3im6lb515o.R.inc(17102);if ((((!dictionaryObj.containsKey(key))&&(__CLR4_5_2d3id3im6lb515o.R.iget(17103)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17104)==0&false))) {{
                __CLR4_5_2d3id3im6lb515o.R.inc(17105);return false;
            }
            }__CLR4_5_2d3id3im6lb515o.R.inc(17106);if ((((!dictionaryObj.get(key).equals(entry.getValue()))&&(__CLR4_5_2d3id3im6lb515o.R.iget(17107)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17108)==0&false))) {{
                __CLR4_5_2d3id3im6lb515o.R.inc(17109);return false;
            }
        }}
        }__CLR4_5_2d3id3im6lb515o.R.inc(17110);return true;
    }finally{__CLR4_5_2d3id3im6lb515o.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int hashCode() {try{__CLR4_5_2d3id3im6lb515o.R.inc(17111);
        __CLR4_5_2d3id3im6lb515o.R.inc(17112);int hashCode = 7;
        __CLR4_5_2d3id3im6lb515o.R.inc(17113);for (Object value : values()) {{
            __CLR4_5_2d3id3im6lb515o.R.inc(17114);hashCode += value.hashCode();
        }
        }__CLR4_5_2d3id3im6lb515o.R.inc(17115);return hashCode;
    }finally{__CLR4_5_2d3id3im6lb515o.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_2d3id3im6lb515o.R.inc(17116);
        __CLR4_5_2d3id3im6lb515o.R.inc(17117);if ((((isEmpty())&&(__CLR4_5_2d3id3im6lb515o.R.iget(17118)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17119)==0&false))) {{
            __CLR4_5_2d3id3im6lb515o.R.inc(17120);return "";
        }
        }__CLR4_5_2d3id3im6lb515o.R.inc(17121);StringBuffer sb = new StringBuffer("<<\n");
        __CLR4_5_2d3id3im6lb515o.R.inc(17122);for (Object o : super.keySet()) {{
            __CLR4_5_2d3id3im6lb515o.R.inc(17123);String key = (String) o;
            __CLR4_5_2d3id3im6lb515o.R.inc(17124);sb.append("  " + key + " ");
            __CLR4_5_2d3id3im6lb515o.R.inc(17125);Object obj = super.get(key);
            __CLR4_5_2d3id3im6lb515o.R.inc(17126);if ((((obj instanceof ArrayList)&&(__CLR4_5_2d3id3im6lb515o.R.iget(17127)!=0|true))||(__CLR4_5_2d3id3im6lb515o.R.iget(17128)==0&false))) {{
                __CLR4_5_2d3id3im6lb515o.R.inc(17129);List array = (List) obj;
                __CLR4_5_2d3id3im6lb515o.R.inc(17130);StringBuilder str = new StringBuilder("[");
                __CLR4_5_2d3id3im6lb515o.R.inc(17131);for (Object element : array) {{
                    __CLR4_5_2d3id3im6lb515o.R.inc(17132);str.append(element + " ");
                }
                }__CLR4_5_2d3id3im6lb515o.R.inc(17133);String str2 = str.toString().trim();
                __CLR4_5_2d3id3im6lb515o.R.inc(17134);str2 += "]";
                __CLR4_5_2d3id3im6lb515o.R.inc(17135);sb.append(str2 + "\n");
            } }else {{
                __CLR4_5_2d3id3im6lb515o.R.inc(17136);sb.append(obj.toString() + "\n");
            }
        }}
        }__CLR4_5_2d3id3im6lb515o.R.inc(17137);sb.append(">>");
        __CLR4_5_2d3id3im6lb515o.R.inc(17138);return sb.toString();
    }finally{__CLR4_5_2d3id3im6lb515o.R.flushNeeded();}}
}
