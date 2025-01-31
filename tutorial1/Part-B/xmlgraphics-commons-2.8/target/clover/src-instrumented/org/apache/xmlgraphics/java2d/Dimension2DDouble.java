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

/* $Id: Dimension2DDouble.java 1345683 2012-06-03 14:50:33Z gadams $ */

package org.apache.xmlgraphics.java2d;

import java.awt.geom.Dimension2D;
import java.io.Serializable;

/**
 * Subclass of Dimension2D which takes double values.
 */
public class Dimension2DDouble extends Dimension2D implements Serializable {public static class __CLR4_5_2bbtbbtm6lb50sz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,14718,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 7909028357685520189L;

    private double width;
    private double height;

    /**
     * Default constructor.
     */
    public Dimension2DDouble() {try{__CLR4_5_2bbtbbtm6lb50sz.R.inc(14681);
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14682);this.width = 0;
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14683);this.height = 0;
    }finally{__CLR4_5_2bbtbbtm6lb50sz.R.flushNeeded();}}

    /**
     * Main constructor.
     * @param width initial width
     * @param height initial height
     */
    public Dimension2DDouble(double width, double height) {try{__CLR4_5_2bbtbbtm6lb50sz.R.inc(14684);
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14685);this.width = width;
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14686);this.height = height;
    }finally{__CLR4_5_2bbtbbtm6lb50sz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getWidth() {try{__CLR4_5_2bbtbbtm6lb50sz.R.inc(14687);
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14688);return width;
    }finally{__CLR4_5_2bbtbbtm6lb50sz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getHeight() {try{__CLR4_5_2bbtbbtm6lb50sz.R.inc(14689);
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14690);return height;
    }finally{__CLR4_5_2bbtbbtm6lb50sz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setSize(double w, double h) {try{__CLR4_5_2bbtbbtm6lb50sz.R.inc(14691);
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14692);this.width = w;
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14693);this.height = h;
    }finally{__CLR4_5_2bbtbbtm6lb50sz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean equals(Object obj) {try{__CLR4_5_2bbtbbtm6lb50sz.R.inc(14694);
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14695);if ((((this == obj)&&(__CLR4_5_2bbtbbtm6lb50sz.R.iget(14696)!=0|true))||(__CLR4_5_2bbtbbtm6lb50sz.R.iget(14697)==0&false))) {{
            __CLR4_5_2bbtbbtm6lb50sz.R.inc(14698);return true;
        }
        }__CLR4_5_2bbtbbtm6lb50sz.R.inc(14699);if ((((obj instanceof Dimension2DDouble)&&(__CLR4_5_2bbtbbtm6lb50sz.R.iget(14700)!=0|true))||(__CLR4_5_2bbtbbtm6lb50sz.R.iget(14701)==0&false))) {{
            __CLR4_5_2bbtbbtm6lb50sz.R.inc(14702);final Dimension2DDouble other = (Dimension2DDouble)obj;
            __CLR4_5_2bbtbbtm6lb50sz.R.inc(14703);if ((((Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))&&(__CLR4_5_2bbtbbtm6lb50sz.R.iget(14704)!=0|true))||(__CLR4_5_2bbtbbtm6lb50sz.R.iget(14705)==0&false))) {{
                __CLR4_5_2bbtbbtm6lb50sz.R.inc(14706);return false;
            }
            }__CLR4_5_2bbtbbtm6lb50sz.R.inc(14707);if ((((Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))&&(__CLR4_5_2bbtbbtm6lb50sz.R.iget(14708)!=0|true))||(__CLR4_5_2bbtbbtm6lb50sz.R.iget(14709)==0&false))) {{
                __CLR4_5_2bbtbbtm6lb50sz.R.inc(14710);return false;
            }
            }__CLR4_5_2bbtbbtm6lb50sz.R.inc(14711);return true;
        } }else {{
            __CLR4_5_2bbtbbtm6lb50sz.R.inc(14712);return false;
        }
    }}finally{__CLR4_5_2bbtbbtm6lb50sz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int hashCode() {try{__CLR4_5_2bbtbbtm6lb50sz.R.inc(14713);
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14714);double sum = width + height;
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14715);return (int)(sum * (sum + 1) / 2 + width);
    }finally{__CLR4_5_2bbtbbtm6lb50sz.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String toString() {try{__CLR4_5_2bbtbbtm6lb50sz.R.inc(14716);
        __CLR4_5_2bbtbbtm6lb50sz.R.inc(14717);return getClass().getName() + "[width=" + width + ",height=" + height + "]";
    }finally{__CLR4_5_2bbtbbtm6lb50sz.R.flushNeeded();}}
}
