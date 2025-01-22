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

/* $Id: TransformType.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.java2d;

// CSOFF: WhitespaceAround

/**
 * Enumeration for transformation types.
 *
 * @version $Id: TransformType.java 1732018 2016-02-24 04:51:06Z gadams $
 * Originally authored by Vincent Hardy.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class TransformType {public static class __CLR4_5_2bm2bm2m68iyhsw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,15071,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /*
     * Transform type constants
     */
    public static final int TRANSFORM_TRANSLATE = 0;
    public static final int TRANSFORM_ROTATE = 1;
    public static final int TRANSFORM_SCALE = 2;
    public static final int TRANSFORM_SHEAR = 3;
    public static final int TRANSFORM_GENERAL = 4;

    /**
     * Strings describing the elementary transforms
     */
    public static final String TRANSLATE_STRING = "translate";
    public static final String ROTATE_STRING = "rotate";
    public static final String SCALE_STRING = "scale";
    public static final String SHEAR_STRING = "shear";
    public static final String GENERAL_STRING = "general";

    /**
     * TransformType values
     */
    public static final TransformType TRANSLATE = new TransformType(TRANSFORM_TRANSLATE, TRANSLATE_STRING);
    public static final TransformType ROTATE = new TransformType(TRANSFORM_ROTATE, ROTATE_STRING);
    public static final TransformType SCALE = new TransformType(TRANSFORM_SCALE, SCALE_STRING);
    public static final TransformType SHEAR = new TransformType(TRANSFORM_SHEAR, SHEAR_STRING);
    public static final TransformType GENERAL = new TransformType(TRANSFORM_GENERAL, GENERAL_STRING);

    private String desc;
    private int val;

    /**
     * Constructor is private so that no instances other than
     * the ones in the enumeration can be created.
     * @see #readResolve
     */
    private TransformType(int val, String desc) {try{__CLR4_5_2bm2bm2m68iyhsw.R.inc(15050);
        __CLR4_5_2bm2bm2m68iyhsw.R.inc(15051);this.desc = desc;
        __CLR4_5_2bm2bm2m68iyhsw.R.inc(15052);this.val = val;
    }finally{__CLR4_5_2bm2bm2m68iyhsw.R.flushNeeded();}}

    /**
     * @return description
     */
    public String toString() {try{__CLR4_5_2bm2bm2m68iyhsw.R.inc(15053);
        __CLR4_5_2bm2bm2m68iyhsw.R.inc(15054);return desc;
    }finally{__CLR4_5_2bm2bm2m68iyhsw.R.flushNeeded();}}

    /**
     * Convenience for enumeration switching.
     * That is,
     * <pre>
     *   switch(transformType.toInt()){
     *       case TransformType.TRANSFORM_TRANSLATE:
     *        ....
     *       case TransformType.TRANSFORM_ROTATE:
     * </pre>
     */
    public int toInt() {try{__CLR4_5_2bm2bm2m68iyhsw.R.inc(15055);
        __CLR4_5_2bm2bm2m68iyhsw.R.inc(15056);return val;
    }finally{__CLR4_5_2bm2bm2m68iyhsw.R.flushNeeded();}}

    /**
     *  This is called by the serialization code before it returns an unserialized
     * object. To provide for unicity of instances, the instance that was read
     * is replaced by its static equivalent
     */
    public Object readResolve() {try{__CLR4_5_2bm2bm2m68iyhsw.R.inc(15057);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2bm2bm2m68iyhsw.R.inc(15058);switch(val) {
        case TRANSFORM_TRANSLATE:if (!__CLB4_5_2_bool0) {__CLR4_5_2bm2bm2m68iyhsw.R.inc(15059);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bm2bm2m68iyhsw.R.inc(15060);return TransformType.TRANSLATE;
        case TRANSFORM_ROTATE:if (!__CLB4_5_2_bool0) {__CLR4_5_2bm2bm2m68iyhsw.R.inc(15061);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bm2bm2m68iyhsw.R.inc(15062);return TransformType.ROTATE;
        case TRANSFORM_SCALE:if (!__CLB4_5_2_bool0) {__CLR4_5_2bm2bm2m68iyhsw.R.inc(15063);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bm2bm2m68iyhsw.R.inc(15064);return TransformType.SCALE;
        case TRANSFORM_SHEAR:if (!__CLB4_5_2_bool0) {__CLR4_5_2bm2bm2m68iyhsw.R.inc(15065);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bm2bm2m68iyhsw.R.inc(15066);return TransformType.SHEAR;
        case TRANSFORM_GENERAL:if (!__CLB4_5_2_bool0) {__CLR4_5_2bm2bm2m68iyhsw.R.inc(15067);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bm2bm2m68iyhsw.R.inc(15068);return TransformType.GENERAL;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2bm2bm2m68iyhsw.R.inc(15069);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bm2bm2m68iyhsw.R.inc(15070);throw new RuntimeException("Unknown TransformType value");
        }
    }finally{__CLR4_5_2bm2bm2m68iyhsw.R.flushNeeded();}}
}
