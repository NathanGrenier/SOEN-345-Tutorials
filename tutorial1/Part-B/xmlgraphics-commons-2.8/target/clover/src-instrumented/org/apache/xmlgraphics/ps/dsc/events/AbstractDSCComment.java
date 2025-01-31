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

/* $Id: AbstractDSCComment.java 1345683 2012-06-03 14:50:33Z gadams $ */

package org.apache.xmlgraphics.ps.dsc.events;

import java.util.List;

/**
 * Abstract base class for DSC comments.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public abstract class AbstractDSCComment extends AbstractEvent implements DSCComment {public static class __CLR4_5_2endendm6lb50qt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,19085,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean isWhitespace(char c) {try{__CLR4_5_2endendm6lb50qt.R.inc(18985);
        __CLR4_5_2endendm6lb50qt.R.inc(18986);return c == ' ' || c == '\t';
    }finally{__CLR4_5_2endendm6lb50qt.R.flushNeeded();}}

    private int parseNextParam(String value, int pos, List lst) {try{__CLR4_5_2endendm6lb50qt.R.inc(18987);
        __CLR4_5_2endendm6lb50qt.R.inc(18988);int startPos = pos;
        __CLR4_5_2endendm6lb50qt.R.inc(18989);pos++;
        __CLR4_5_2endendm6lb50qt.R.inc(18990);while ((((pos < value.length() && !isWhitespace(value.charAt(pos)))&&(__CLR4_5_2endendm6lb50qt.R.iget(18991)!=0|true))||(__CLR4_5_2endendm6lb50qt.R.iget(18992)==0&false))) {{
            __CLR4_5_2endendm6lb50qt.R.inc(18993);pos++;
        }
        }__CLR4_5_2endendm6lb50qt.R.inc(18994);String param = value.substring(startPos, pos);
        __CLR4_5_2endendm6lb50qt.R.inc(18995);lst.add(param);
        __CLR4_5_2endendm6lb50qt.R.inc(18996);return pos;
    }finally{__CLR4_5_2endendm6lb50qt.R.flushNeeded();}}

    private int parseNextParentheseString(String value, int pos, List lst) {try{__CLR4_5_2endendm6lb50qt.R.inc(18997);
        __CLR4_5_2endendm6lb50qt.R.inc(18998);int nestLevel = 1;
        __CLR4_5_2endendm6lb50qt.R.inc(18999);pos++;
        __CLR4_5_2endendm6lb50qt.R.inc(19000);StringBuffer sb = new StringBuffer();
        __CLR4_5_2endendm6lb50qt.R.inc(19001);while ((((pos < value.length() && nestLevel > 0)&&(__CLR4_5_2endendm6lb50qt.R.iget(19002)!=0|true))||(__CLR4_5_2endendm6lb50qt.R.iget(19003)==0&false))) {{
            __CLR4_5_2endendm6lb50qt.R.inc(19004);final char c = value.charAt(pos);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2endendm6lb50qt.R.inc(19005);switch (c) {
            case '(':if (!__CLB4_5_2_bool0) {__CLR4_5_2endendm6lb50qt.R.inc(19006);__CLB4_5_2_bool0=true;}
                __CLR4_5_2endendm6lb50qt.R.inc(19007);nestLevel++;
                __CLR4_5_2endendm6lb50qt.R.inc(19008);if ((((nestLevel > 1)&&(__CLR4_5_2endendm6lb50qt.R.iget(19009)!=0|true))||(__CLR4_5_2endendm6lb50qt.R.iget(19010)==0&false))) {{
                    __CLR4_5_2endendm6lb50qt.R.inc(19011);sb.append(c);
                }
                }__CLR4_5_2endendm6lb50qt.R.inc(19012);break;
            case ')':if (!__CLB4_5_2_bool0) {__CLR4_5_2endendm6lb50qt.R.inc(19013);__CLB4_5_2_bool0=true;}
                __CLR4_5_2endendm6lb50qt.R.inc(19014);if ((((nestLevel > 1)&&(__CLR4_5_2endendm6lb50qt.R.iget(19015)!=0|true))||(__CLR4_5_2endendm6lb50qt.R.iget(19016)==0&false))) {{
                    __CLR4_5_2endendm6lb50qt.R.inc(19017);sb.append(c);
                }
                }__CLR4_5_2endendm6lb50qt.R.inc(19018);nestLevel--;
                __CLR4_5_2endendm6lb50qt.R.inc(19019);break;
            case '\\':if (!__CLB4_5_2_bool0) {__CLR4_5_2endendm6lb50qt.R.inc(19020);__CLB4_5_2_bool0=true;}
                __CLR4_5_2endendm6lb50qt.R.inc(19021);pos++;
                __CLR4_5_2endendm6lb50qt.R.inc(19022);char cnext = value.charAt(pos);
                boolean __CLB4_5_2_bool1=false;__CLR4_5_2endendm6lb50qt.R.inc(19023);switch (cnext) {
                case '\\':if (!__CLB4_5_2_bool1) {__CLR4_5_2endendm6lb50qt.R.inc(19024);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2endendm6lb50qt.R.inc(19025);sb.append(cnext);
                    __CLR4_5_2endendm6lb50qt.R.inc(19026);break;
                case 'n':if (!__CLB4_5_2_bool1) {__CLR4_5_2endendm6lb50qt.R.inc(19027);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2endendm6lb50qt.R.inc(19028);sb.append('\n');
                    __CLR4_5_2endendm6lb50qt.R.inc(19029);break;
                case 'r':if (!__CLB4_5_2_bool1) {__CLR4_5_2endendm6lb50qt.R.inc(19030);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2endendm6lb50qt.R.inc(19031);sb.append('\r');
                    __CLR4_5_2endendm6lb50qt.R.inc(19032);break;
                case 't':if (!__CLB4_5_2_bool1) {__CLR4_5_2endendm6lb50qt.R.inc(19033);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2endendm6lb50qt.R.inc(19034);sb.append('\t');
                    __CLR4_5_2endendm6lb50qt.R.inc(19035);break;
                case 'b':if (!__CLB4_5_2_bool1) {__CLR4_5_2endendm6lb50qt.R.inc(19036);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2endendm6lb50qt.R.inc(19037);sb.append('\b');
                    __CLR4_5_2endendm6lb50qt.R.inc(19038);break;
                case 'f':if (!__CLB4_5_2_bool1) {__CLR4_5_2endendm6lb50qt.R.inc(19039);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2endendm6lb50qt.R.inc(19040);sb.append('\f');
                    __CLR4_5_2endendm6lb50qt.R.inc(19041);break;
                case '(':if (!__CLB4_5_2_bool1) {__CLR4_5_2endendm6lb50qt.R.inc(19042);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2endendm6lb50qt.R.inc(19043);sb.append('(');
                    __CLR4_5_2endendm6lb50qt.R.inc(19044);break;
                case ')':if (!__CLB4_5_2_bool1) {__CLR4_5_2endendm6lb50qt.R.inc(19045);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2endendm6lb50qt.R.inc(19046);sb.append(')');
                    __CLR4_5_2endendm6lb50qt.R.inc(19047);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_2endendm6lb50qt.R.inc(19048);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2endendm6lb50qt.R.inc(19049);int code = Integer.parseInt(value.substring(pos, pos + 3), 8);
                    __CLR4_5_2endendm6lb50qt.R.inc(19050);sb.append((char)code);
                    __CLR4_5_2endendm6lb50qt.R.inc(19051);pos += 2;
                }
                __CLR4_5_2endendm6lb50qt.R.inc(19052);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2endendm6lb50qt.R.inc(19053);__CLB4_5_2_bool0=true;}
                __CLR4_5_2endendm6lb50qt.R.inc(19054);sb.append(c);
            }
            __CLR4_5_2endendm6lb50qt.R.inc(19055);pos++;
        }
        }__CLR4_5_2endendm6lb50qt.R.inc(19056);lst.add(sb.toString());
        __CLR4_5_2endendm6lb50qt.R.inc(19057);pos++;
        __CLR4_5_2endendm6lb50qt.R.inc(19058);return pos;
    }finally{__CLR4_5_2endendm6lb50qt.R.flushNeeded();}}

    /**
     * Splits the params of the DSC comment value in to a List.
     * @param value the DSC comment value
     * @return the List of values
     */
    protected List splitParams(String value) {try{__CLR4_5_2endendm6lb50qt.R.inc(19059);
        __CLR4_5_2endendm6lb50qt.R.inc(19060);List lst = new java.util.ArrayList();
        __CLR4_5_2endendm6lb50qt.R.inc(19061);int pos = 0;
        __CLR4_5_2endendm6lb50qt.R.inc(19062);value = value.trim();
        __CLR4_5_2endendm6lb50qt.R.inc(19063);while ((((pos < value.length())&&(__CLR4_5_2endendm6lb50qt.R.iget(19064)!=0|true))||(__CLR4_5_2endendm6lb50qt.R.iget(19065)==0&false))) {{
            __CLR4_5_2endendm6lb50qt.R.inc(19066);if ((((isWhitespace(value.charAt(pos)))&&(__CLR4_5_2endendm6lb50qt.R.iget(19067)!=0|true))||(__CLR4_5_2endendm6lb50qt.R.iget(19068)==0&false))) {{
                __CLR4_5_2endendm6lb50qt.R.inc(19069);pos++;
                __CLR4_5_2endendm6lb50qt.R.inc(19070);continue;
            }
            }__CLR4_5_2endendm6lb50qt.R.inc(19071);if ((((value.charAt(pos) == '(')&&(__CLR4_5_2endendm6lb50qt.R.iget(19072)!=0|true))||(__CLR4_5_2endendm6lb50qt.R.iget(19073)==0&false))) {{
                __CLR4_5_2endendm6lb50qt.R.inc(19074);pos = parseNextParentheseString(value, pos, lst);
            } }else {{
                __CLR4_5_2endendm6lb50qt.R.inc(19075);pos = parseNextParam(value, pos, lst);
            }
        }}
        }__CLR4_5_2endendm6lb50qt.R.inc(19076);return lst;
    }finally{__CLR4_5_2endendm6lb50qt.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCComment#isAtend()
     */
    public boolean isAtend() {try{__CLR4_5_2endendm6lb50qt.R.inc(19077);
        __CLR4_5_2endendm6lb50qt.R.inc(19078);return false;
    }finally{__CLR4_5_2endendm6lb50qt.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.AbstractEvent#asDSCComment()
     */
    public DSCComment asDSCComment() {try{__CLR4_5_2endendm6lb50qt.R.inc(19079);
        __CLR4_5_2endendm6lb50qt.R.inc(19080);return this;
    }finally{__CLR4_5_2endendm6lb50qt.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.AbstractEvent#isDSCComment()
     */
    public boolean isDSCComment() {try{__CLR4_5_2endendm6lb50qt.R.inc(19081);
        __CLR4_5_2endendm6lb50qt.R.inc(19082);return true;
    }finally{__CLR4_5_2endendm6lb50qt.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCEvent#getEventType()
     */
    public int getEventType() {try{__CLR4_5_2endendm6lb50qt.R.inc(19083);
        __CLR4_5_2endendm6lb50qt.R.inc(19084);return DSC_COMMENT;
    }finally{__CLR4_5_2endendm6lb50qt.R.flushNeeded();}}
}
