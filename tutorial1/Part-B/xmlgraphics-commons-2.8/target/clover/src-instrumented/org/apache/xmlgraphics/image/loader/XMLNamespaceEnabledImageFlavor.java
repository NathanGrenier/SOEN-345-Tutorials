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

/* $Id: XMLNamespaceEnabledImageFlavor.java 1731775 2016-02-23 01:13:36Z gadams $ */

package org.apache.xmlgraphics.image.loader;

/**
 * Special image flavor subclass which enables the restriction to a particular XML namespace.
 */
public class XMLNamespaceEnabledImageFlavor extends RefinedImageFlavor {public static class __CLR4_5_27bu7bum68iyh2a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,9530,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** An XML-based SVG image in form of a W3C DOM instance */
    public static final ImageFlavor SVG_DOM = new XMLNamespaceEnabledImageFlavor(
            ImageFlavor.XML_DOM, "http://www.w3.org/2000/svg");

    private String namespace;

    /**
     * Constructs a new image flavor.
     * @param parentFlavor the parent image flavor
     * @param namespace an XML namespace URI refining the parent image flavor
     */
    public XMLNamespaceEnabledImageFlavor(ImageFlavor parentFlavor, String namespace) {
        super(parentFlavor.getName() + ";namespace=" + namespace, parentFlavor);__CLR4_5_27bu7bum68iyh2a.R.inc(9499);try{__CLR4_5_27bu7bum68iyh2a.R.inc(9498);
        __CLR4_5_27bu7bum68iyh2a.R.inc(9500);this.namespace = namespace;
    }finally{__CLR4_5_27bu7bum68iyh2a.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getNamespace() {try{__CLR4_5_27bu7bum68iyh2a.R.inc(9501);
        __CLR4_5_27bu7bum68iyh2a.R.inc(9502);return this.namespace;
    }finally{__CLR4_5_27bu7bum68iyh2a.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_27bu7bum68iyh2a.R.inc(9503);
        __CLR4_5_27bu7bum68iyh2a.R.inc(9504);if ((((this == o)&&(__CLR4_5_27bu7bum68iyh2a.R.iget(9505)!=0|true))||(__CLR4_5_27bu7bum68iyh2a.R.iget(9506)==0&false))) {{
            __CLR4_5_27bu7bum68iyh2a.R.inc(9507);return true;
        }
        }__CLR4_5_27bu7bum68iyh2a.R.inc(9508);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_27bu7bum68iyh2a.R.iget(9509)!=0|true))||(__CLR4_5_27bu7bum68iyh2a.R.iget(9510)==0&false))) {{
            __CLR4_5_27bu7bum68iyh2a.R.inc(9511);return false;
        }
        }__CLR4_5_27bu7bum68iyh2a.R.inc(9512);if ((((!super.equals(o))&&(__CLR4_5_27bu7bum68iyh2a.R.iget(9513)!=0|true))||(__CLR4_5_27bu7bum68iyh2a.R.iget(9514)==0&false))) {{
            __CLR4_5_27bu7bum68iyh2a.R.inc(9515);return false;
        }

        }__CLR4_5_27bu7bum68iyh2a.R.inc(9516);XMLNamespaceEnabledImageFlavor that = (XMLNamespaceEnabledImageFlavor) o;

        __CLR4_5_27bu7bum68iyh2a.R.inc(9517);if (((((((namespace != null )&&(__CLR4_5_27bu7bum68iyh2a.R.iget(9518)!=0|true))||(__CLR4_5_27bu7bum68iyh2a.R.iget(9519)==0&false))? !namespace.equals(that.namespace) : that.namespace != null)&&(__CLR4_5_27bu7bum68iyh2a.R.iget(9520)!=0|true))||(__CLR4_5_27bu7bum68iyh2a.R.iget(9521)==0&false))) {{
            __CLR4_5_27bu7bum68iyh2a.R.inc(9522);return false;
        }

        }__CLR4_5_27bu7bum68iyh2a.R.inc(9523);return true;
    }finally{__CLR4_5_27bu7bum68iyh2a.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_27bu7bum68iyh2a.R.inc(9524);
        __CLR4_5_27bu7bum68iyh2a.R.inc(9525);int result = super.hashCode();
        __CLR4_5_27bu7bum68iyh2a.R.inc(9526);result = 31 * result + ((((namespace != null )&&(__CLR4_5_27bu7bum68iyh2a.R.iget(9527)!=0|true))||(__CLR4_5_27bu7bum68iyh2a.R.iget(9528)==0&false))? namespace.hashCode() : 0);
        __CLR4_5_27bu7bum68iyh2a.R.inc(9529);return result;
    }finally{__CLR4_5_27bu7bum68iyh2a.R.flushNeeded();}}
}
