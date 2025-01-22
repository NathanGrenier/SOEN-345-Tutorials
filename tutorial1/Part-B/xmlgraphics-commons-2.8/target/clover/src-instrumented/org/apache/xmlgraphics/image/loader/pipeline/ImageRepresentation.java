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

/* $Id: ImageRepresentation.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.image.loader.pipeline;

import org.apache.xmlgraphics.image.loader.ImageFlavor;
import org.apache.xmlgraphics.util.dijkstra.Vertex;

/**
 * This class represents a combination of MIME type and an image flavor.
 * It is used in conjunction with Dijkstra's algorithm to find and construct a
 * conversion pipeline for images.
 */
public class ImageRepresentation implements Vertex {public static class __CLR4_5_29g59g5m68iyhhz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,12263,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ImageFlavor flavor;

    /**
     * Main constructor
     * @param flavor the image flavor
     */
    public ImageRepresentation(ImageFlavor flavor) {try{__CLR4_5_29g59g5m68iyhhz.R.inc(12245);
        __CLR4_5_29g59g5m68iyhhz.R.inc(12246);if ((((flavor == null)&&(__CLR4_5_29g59g5m68iyhhz.R.iget(12247)!=0|true))||(__CLR4_5_29g59g5m68iyhhz.R.iget(12248)==0&false))) {{
            __CLR4_5_29g59g5m68iyhhz.R.inc(12249);throw new NullPointerException("flavor must not be null");
        }
        }__CLR4_5_29g59g5m68iyhhz.R.inc(12250);this.flavor = flavor;
    }finally{__CLR4_5_29g59g5m68iyhhz.R.flushNeeded();}}

    /**
     * Returns the image flavor.
     * @return the image flavor
     */
    public ImageFlavor getFlavor() {try{__CLR4_5_29g59g5m68iyhhz.R.inc(12251);
        __CLR4_5_29g59g5m68iyhhz.R.inc(12252);return flavor;
    }finally{__CLR4_5_29g59g5m68iyhhz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean equals(Object obj) {try{__CLR4_5_29g59g5m68iyhhz.R.inc(12253);
        assert (((obj != null)&&(__CLR4_5_29g59g5m68iyhhz.R.iget(12254)!=0|true))||(__CLR4_5_29g59g5m68iyhhz.R.iget(12255)==0&false));
        __CLR4_5_29g59g5m68iyhhz.R.inc(12256);return toString().equals(obj.toString());
    }finally{__CLR4_5_29g59g5m68iyhhz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int hashCode() {try{__CLR4_5_29g59g5m68iyhhz.R.inc(12257);
        __CLR4_5_29g59g5m68iyhhz.R.inc(12258);return getFlavor().hashCode();
    }finally{__CLR4_5_29g59g5m68iyhhz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int compareTo(Object obj) {try{__CLR4_5_29g59g5m68iyhhz.R.inc(12259);
        __CLR4_5_29g59g5m68iyhhz.R.inc(12260);return toString().compareTo(((ImageRepresentation)obj).toString());
    }finally{__CLR4_5_29g59g5m68iyhhz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_29g59g5m68iyhhz.R.inc(12261);
        __CLR4_5_29g59g5m68iyhhz.R.inc(12262);return getFlavor().toString();
    }finally{__CLR4_5_29g59g5m68iyhhz.R.flushNeeded();}}

}
