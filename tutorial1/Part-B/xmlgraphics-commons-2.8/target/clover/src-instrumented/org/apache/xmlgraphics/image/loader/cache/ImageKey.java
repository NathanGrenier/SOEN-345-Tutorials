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

/* $Id: ImageKey.java 1345683 2012-06-03 14:50:33Z gadams $ */

package org.apache.xmlgraphics.image.loader.cache;

import org.apache.xmlgraphics.image.loader.ImageFlavor;

/**
 * Key class for Image instances in the cache.
 */
public class ImageKey {public static class __CLR4_5_27hz7hzm68iyh3c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,9765,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String uri;
    private org.apache.xmlgraphics.image.loader.ImageFlavor flavor;

    /**
     * Main constructor.
     * @param uri the original URI
     * @param flavor the image flavor
     */
    public ImageKey(String uri, ImageFlavor flavor) {try{__CLR4_5_27hz7hzm68iyh3c.R.inc(9719);
        __CLR4_5_27hz7hzm68iyh3c.R.inc(9720);if ((((uri == null)&&(__CLR4_5_27hz7hzm68iyh3c.R.iget(9721)!=0|true))||(__CLR4_5_27hz7hzm68iyh3c.R.iget(9722)==0&false))) {{
            __CLR4_5_27hz7hzm68iyh3c.R.inc(9723);throw new NullPointerException("URI must not be null");
        }
        }__CLR4_5_27hz7hzm68iyh3c.R.inc(9724);if ((((flavor == null)&&(__CLR4_5_27hz7hzm68iyh3c.R.iget(9725)!=0|true))||(__CLR4_5_27hz7hzm68iyh3c.R.iget(9726)==0&false))) {{
            __CLR4_5_27hz7hzm68iyh3c.R.inc(9727);throw new NullPointerException("flavor must not be null");
        }
        }__CLR4_5_27hz7hzm68iyh3c.R.inc(9728);this.uri = uri;
        __CLR4_5_27hz7hzm68iyh3c.R.inc(9729);this.flavor = flavor;
    }finally{__CLR4_5_27hz7hzm68iyh3c.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int hashCode() {try{__CLR4_5_27hz7hzm68iyh3c.R.inc(9730);
        __CLR4_5_27hz7hzm68iyh3c.R.inc(9731);final int prime = 31;
        __CLR4_5_27hz7hzm68iyh3c.R.inc(9732);int result = 1;
        __CLR4_5_27hz7hzm68iyh3c.R.inc(9733);result = prime * result + (((((flavor == null) )&&(__CLR4_5_27hz7hzm68iyh3c.R.iget(9734)!=0|true))||(__CLR4_5_27hz7hzm68iyh3c.R.iget(9735)==0&false))? 0 : flavor.hashCode());
        __CLR4_5_27hz7hzm68iyh3c.R.inc(9736);result = prime * result + (((((uri == null) )&&(__CLR4_5_27hz7hzm68iyh3c.R.iget(9737)!=0|true))||(__CLR4_5_27hz7hzm68iyh3c.R.iget(9738)==0&false))? 0 : uri.hashCode());
        __CLR4_5_27hz7hzm68iyh3c.R.inc(9739);return result;
    }finally{__CLR4_5_27hz7hzm68iyh3c.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean equals(Object obj) {try{__CLR4_5_27hz7hzm68iyh3c.R.inc(9740);
        __CLR4_5_27hz7hzm68iyh3c.R.inc(9741);if ((((this == obj)&&(__CLR4_5_27hz7hzm68iyh3c.R.iget(9742)!=0|true))||(__CLR4_5_27hz7hzm68iyh3c.R.iget(9743)==0&false))) {{
            __CLR4_5_27hz7hzm68iyh3c.R.inc(9744);return true;
        }
        }__CLR4_5_27hz7hzm68iyh3c.R.inc(9745);if ((((obj == null)&&(__CLR4_5_27hz7hzm68iyh3c.R.iget(9746)!=0|true))||(__CLR4_5_27hz7hzm68iyh3c.R.iget(9747)==0&false))) {{
            __CLR4_5_27hz7hzm68iyh3c.R.inc(9748);return false;
        }
        }__CLR4_5_27hz7hzm68iyh3c.R.inc(9749);if ((((getClass() != obj.getClass())&&(__CLR4_5_27hz7hzm68iyh3c.R.iget(9750)!=0|true))||(__CLR4_5_27hz7hzm68iyh3c.R.iget(9751)==0&false))) {{
            __CLR4_5_27hz7hzm68iyh3c.R.inc(9752);return false;
        }
        }__CLR4_5_27hz7hzm68iyh3c.R.inc(9753);final ImageKey other = (ImageKey)obj;
        __CLR4_5_27hz7hzm68iyh3c.R.inc(9754);if ((((!uri.equals(other.uri))&&(__CLR4_5_27hz7hzm68iyh3c.R.iget(9755)!=0|true))||(__CLR4_5_27hz7hzm68iyh3c.R.iget(9756)==0&false))) {{
            __CLR4_5_27hz7hzm68iyh3c.R.inc(9757);return false;
        }
        }__CLR4_5_27hz7hzm68iyh3c.R.inc(9758);if ((((!flavor.equals(other.flavor))&&(__CLR4_5_27hz7hzm68iyh3c.R.iget(9759)!=0|true))||(__CLR4_5_27hz7hzm68iyh3c.R.iget(9760)==0&false))) {{
            __CLR4_5_27hz7hzm68iyh3c.R.inc(9761);return false;
        }
        }__CLR4_5_27hz7hzm68iyh3c.R.inc(9762);return true;
    }finally{__CLR4_5_27hz7hzm68iyh3c.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_27hz7hzm68iyh3c.R.inc(9763);
        __CLR4_5_27hz7hzm68iyh3c.R.inc(9764);return uri + " (" + flavor + ")";
    }finally{__CLR4_5_27hz7hzm68iyh3c.R.flushNeeded();}}

}
