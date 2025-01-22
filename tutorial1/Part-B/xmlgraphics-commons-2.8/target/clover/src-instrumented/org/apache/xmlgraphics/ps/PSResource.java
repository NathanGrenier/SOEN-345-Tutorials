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

/* $Id: PSResource.java 1598621 2014-05-30 14:55:00Z ssteiner $ */

package org.apache.xmlgraphics.ps;

/**
 * Represents a PostScript resource (file, font, procset etc.).
 */
public class PSResource implements Comparable {public static class __CLR4_5_2e5ue5um68iyi4v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,18392,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** a file resource */
    public static final String TYPE_FILE = "file";
    /** a font resource */
    public static final String TYPE_FONT = "font";
    /** a procset resource */
    public static final String TYPE_PROCSET = "procset";
    /** a procset resource */
    public static final String TYPE_PATTERN = "pattern";
    /** a procset resource */
    public static final String TYPE_FORM = "form";
    /** a procset resource */
    public static final String TYPE_ENCODING = "encoding";
    /** A CMap resource. */
    public static final String TYPE_CMAP = "cmap";
    /** A CIDFont resource. */
    public static final String TYPE_CIDFONT = "cidfont";

    private String type;
    private String name;

    /**
     * Main constructor
     * @param type type of the resource
     * @param name name of the resource
     */
    public PSResource(String type, String name) {try{__CLR4_5_2e5ue5um68iyi4v.R.inc(18354);
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18355);this.type = type;
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18356);this.name = name;
    }finally{__CLR4_5_2e5ue5um68iyi4v.R.flushNeeded();}}

    /** @return the type of the resource */
    public String getType() {try{__CLR4_5_2e5ue5um68iyi4v.R.inc(18357);
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18358);return this.type;
    }finally{__CLR4_5_2e5ue5um68iyi4v.R.flushNeeded();}}

    /** @return the name of the resource */
    public String getName() {try{__CLR4_5_2e5ue5um68iyi4v.R.inc(18359);
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18360);return this.name;
    }finally{__CLR4_5_2e5ue5um68iyi4v.R.flushNeeded();}}

    /** @return the &lt;resource&gt; specification as defined in DSC v3.0 spec. */
    public String getResourceSpecification() {try{__CLR4_5_2e5ue5um68iyi4v.R.inc(18361);
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18362);StringBuffer sb = new StringBuffer();
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18363);sb.append(getType()).append(" ").append(PSGenerator.convertStringToDSC(getName()));
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18364);return sb.toString();
    }finally{__CLR4_5_2e5ue5um68iyi4v.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean equals(Object obj) {try{__CLR4_5_2e5ue5um68iyi4v.R.inc(18365);
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18366);if ((((obj == this)&&(__CLR4_5_2e5ue5um68iyi4v.R.iget(18367)!=0|true))||(__CLR4_5_2e5ue5um68iyi4v.R.iget(18368)==0&false))) {{
            __CLR4_5_2e5ue5um68iyi4v.R.inc(18369);return true;
        } }else {__CLR4_5_2e5ue5um68iyi4v.R.inc(18370);if ((((obj instanceof PSResource)&&(__CLR4_5_2e5ue5um68iyi4v.R.iget(18371)!=0|true))||(__CLR4_5_2e5ue5um68iyi4v.R.iget(18372)==0&false))) {{
            __CLR4_5_2e5ue5um68iyi4v.R.inc(18373);PSResource other = (PSResource)obj;
            __CLR4_5_2e5ue5um68iyi4v.R.inc(18374);return other.toString().equals(toString());
        } }else {{
            __CLR4_5_2e5ue5um68iyi4v.R.inc(18375);return false;
        }
    }}}finally{__CLR4_5_2e5ue5um68iyi4v.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int hashCode() {try{__CLR4_5_2e5ue5um68iyi4v.R.inc(18376);
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18377);return toString().hashCode();
    }finally{__CLR4_5_2e5ue5um68iyi4v.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int compareTo(Object o) {try{__CLR4_5_2e5ue5um68iyi4v.R.inc(18378);
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18379);PSResource other = (PSResource)o;
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18380);if ((((this == other)&&(__CLR4_5_2e5ue5um68iyi4v.R.iget(18381)!=0|true))||(__CLR4_5_2e5ue5um68iyi4v.R.iget(18382)==0&false))) {{
            __CLR4_5_2e5ue5um68iyi4v.R.inc(18383);return 0;
        }
        }__CLR4_5_2e5ue5um68iyi4v.R.inc(18384);int result = this.getType().compareTo(other.getType());
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18385);if ((((result == 0)&&(__CLR4_5_2e5ue5um68iyi4v.R.iget(18386)!=0|true))||(__CLR4_5_2e5ue5um68iyi4v.R.iget(18387)==0&false))) {{
            __CLR4_5_2e5ue5um68iyi4v.R.inc(18388);result = this.getName().compareTo(other.getName());
        }
        }__CLR4_5_2e5ue5um68iyi4v.R.inc(18389);return result;
    }finally{__CLR4_5_2e5ue5um68iyi4v.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_2e5ue5um68iyi4v.R.inc(18390);
        __CLR4_5_2e5ue5um68iyi4v.R.inc(18391);return getResourceSpecification();
    }finally{__CLR4_5_2e5ue5um68iyi4v.R.flushNeeded();}}

}
