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

/* $Id: QName.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.util;

import java.io.Serializable;

/**
 * Represents a qualified name of an XML element or an XML attribute.
 * <p>
 * Note: This class allows to carry a namespace prefix but it is not used in the equals() and
 * hashCode() methods.
 */
public class QName implements Serializable {public static class __CLR4_5_2fh1fh1m68iyick{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,20123,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -5225376740044770690L;

    private String namespaceURI;
    private String localName;
    private String prefix;
    private int hashCode;

    /**
     * Main constructor.
     * @param namespaceURI the namespace URI
     * @param prefix the namespace prefix, may be null
     * @param localName the local name
     */
    public QName(String namespaceURI, String prefix, String localName) {try{__CLR4_5_2fh1fh1m68iyick.R.inc(20053);
        __CLR4_5_2fh1fh1m68iyick.R.inc(20054);if ((((localName == null)&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20055)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20056)==0&false))) {{
            __CLR4_5_2fh1fh1m68iyick.R.inc(20057);throw new NullPointerException("Parameter localName must not be null");
        }
        }__CLR4_5_2fh1fh1m68iyick.R.inc(20058);if ((((localName.length() == 0)&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20059)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20060)==0&false))) {{
            __CLR4_5_2fh1fh1m68iyick.R.inc(20061);throw new IllegalArgumentException("Parameter localName must not be empty");
        }
        }__CLR4_5_2fh1fh1m68iyick.R.inc(20062);this.namespaceURI = namespaceURI;
        __CLR4_5_2fh1fh1m68iyick.R.inc(20063);this.prefix = prefix;
        __CLR4_5_2fh1fh1m68iyick.R.inc(20064);this.localName = localName;
        __CLR4_5_2fh1fh1m68iyick.R.inc(20065);this.hashCode = toHashString().hashCode();
    }finally{__CLR4_5_2fh1fh1m68iyick.R.flushNeeded();}}

    /**
     * Main constructor.
     * @param namespaceURI the namespace URI
     * @param qName the qualified name
     */
    public QName(String namespaceURI, String qName) {try{__CLR4_5_2fh1fh1m68iyick.R.inc(20066);
        __CLR4_5_2fh1fh1m68iyick.R.inc(20067);if ((((qName == null)&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20068)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20069)==0&false))) {{
            __CLR4_5_2fh1fh1m68iyick.R.inc(20070);throw new NullPointerException("Parameter localName must not be null");
        }
        }__CLR4_5_2fh1fh1m68iyick.R.inc(20071);if ((((qName.length() == 0)&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20072)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20073)==0&false))) {{
            __CLR4_5_2fh1fh1m68iyick.R.inc(20074);throw new IllegalArgumentException("Parameter localName must not be empty");
        }
        }__CLR4_5_2fh1fh1m68iyick.R.inc(20075);this.namespaceURI = namespaceURI;
        __CLR4_5_2fh1fh1m68iyick.R.inc(20076);int p = qName.indexOf(':');
        __CLR4_5_2fh1fh1m68iyick.R.inc(20077);if ((((p > 0)&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20078)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20079)==0&false))) {{
            __CLR4_5_2fh1fh1m68iyick.R.inc(20080);this.prefix = qName.substring(0, p);
            __CLR4_5_2fh1fh1m68iyick.R.inc(20081);this.localName = qName.substring(p + 1);
        } }else {{
            __CLR4_5_2fh1fh1m68iyick.R.inc(20082);this.prefix = null;
            __CLR4_5_2fh1fh1m68iyick.R.inc(20083);this.localName = qName;
        }
        }__CLR4_5_2fh1fh1m68iyick.R.inc(20084);this.hashCode = toHashString().hashCode();
    }finally{__CLR4_5_2fh1fh1m68iyick.R.flushNeeded();}}

    /** @return the namespace URI */
    public String getNamespaceURI() {try{__CLR4_5_2fh1fh1m68iyick.R.inc(20085);
        __CLR4_5_2fh1fh1m68iyick.R.inc(20086);return this.namespaceURI;
    }finally{__CLR4_5_2fh1fh1m68iyick.R.flushNeeded();}}

    /** @return the namespace prefix */
    public String getPrefix() {try{__CLR4_5_2fh1fh1m68iyick.R.inc(20087);
        __CLR4_5_2fh1fh1m68iyick.R.inc(20088);return this.prefix;
    }finally{__CLR4_5_2fh1fh1m68iyick.R.flushNeeded();}}

    /** @return the local name */
    public String getLocalName() {try{__CLR4_5_2fh1fh1m68iyick.R.inc(20089);
        __CLR4_5_2fh1fh1m68iyick.R.inc(20090);return this.localName;
    }finally{__CLR4_5_2fh1fh1m68iyick.R.flushNeeded();}}

    /** @return the fully qualified name */
    public String getQName() {try{__CLR4_5_2fh1fh1m68iyick.R.inc(20091);
        __CLR4_5_2fh1fh1m68iyick.R.inc(20092);return (((getPrefix() != null )&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20093)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20094)==0&false))? getPrefix() + ':' + getLocalName() : getLocalName();
    }finally{__CLR4_5_2fh1fh1m68iyick.R.flushNeeded();}}

    /** @see java.lang.Object#hashCode() */
    public int hashCode() {try{__CLR4_5_2fh1fh1m68iyick.R.inc(20095);
        __CLR4_5_2fh1fh1m68iyick.R.inc(20096);return this.hashCode;
    }finally{__CLR4_5_2fh1fh1m68iyick.R.flushNeeded();}}

    /** @see java.lang.Object#equals(java.lang.Object) */
    public boolean equals(Object obj) {try{__CLR4_5_2fh1fh1m68iyick.R.inc(20097);
        __CLR4_5_2fh1fh1m68iyick.R.inc(20098);if ((((obj == null)&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20099)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20100)==0&false))) {{
            __CLR4_5_2fh1fh1m68iyick.R.inc(20101);return false;
        } }else {__CLR4_5_2fh1fh1m68iyick.R.inc(20102);if ((((obj == this)&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20103)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20104)==0&false))) {{
            __CLR4_5_2fh1fh1m68iyick.R.inc(20105);return true;
        } }else {{
            __CLR4_5_2fh1fh1m68iyick.R.inc(20106);if ((((obj instanceof QName)&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20107)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20108)==0&false))) {{
                __CLR4_5_2fh1fh1m68iyick.R.inc(20109);QName other = (QName)obj;
                __CLR4_5_2fh1fh1m68iyick.R.inc(20110);if (((((getNamespaceURI() == null && other.getNamespaceURI() == null)
                        || getNamespaceURI().equals(other.getNamespaceURI()))&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20111)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20112)==0&false))) {{
                    __CLR4_5_2fh1fh1m68iyick.R.inc(20113);return getLocalName().equals(other.getLocalName());
                }
            }}
        }}
        }}__CLR4_5_2fh1fh1m68iyick.R.inc(20114);return false;
    }finally{__CLR4_5_2fh1fh1m68iyick.R.flushNeeded();}}

    /** @see java.lang.Object#toString() */
    public String toString() {try{__CLR4_5_2fh1fh1m68iyick.R.inc(20115);
        __CLR4_5_2fh1fh1m68iyick.R.inc(20116);return (((prefix != null
                )&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20117)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20118)==0&false))? (prefix + ":" + localName)
                : toHashString();
    }finally{__CLR4_5_2fh1fh1m68iyick.R.flushNeeded();}}

    private String toHashString() {try{__CLR4_5_2fh1fh1m68iyick.R.inc(20119);
        __CLR4_5_2fh1fh1m68iyick.R.inc(20120);return ((((namespaceURI != null
                )&&(__CLR4_5_2fh1fh1m68iyick.R.iget(20121)!=0|true))||(__CLR4_5_2fh1fh1m68iyick.R.iget(20122)==0&false))? ("{" + namespaceURI + "}" + localName)
                : localName);
    }finally{__CLR4_5_2fh1fh1m68iyick.R.flushNeeded();}}

}
