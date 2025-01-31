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

/* $Id: TransformStackElement.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.java2d;

import java.awt.geom.AffineTransform;

// CSOFF: EmptyBlock
// CSOFF: NoWhitespaceAfter
// CSOFF: OperatorWrap
// CSOFF: WhitespaceAround

/**
 * Contains a description of an elementary transform stack element,
 * such as a rotate or translate. A transform stack element has a
 * type and a value, which is an array of double values.<br>
 *
 * @version $Id: TransformStackElement.java 1732018 2016-02-24 04:51:06Z gadams $
 *
 * Originally authored by Vincent Hardy and Paul Evenblij.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public abstract class TransformStackElement implements Cloneable {public static class __CLR4_5_2bk4bk4m6lb50v0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,15050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Transform type
     */
    private TransformType type;

    /**
     * Value
     */
    private double[] transformParameters;

    /**
     * @param type transform type
     * @param transformParameters parameters for transform
     */
    protected TransformStackElement(TransformType type,
                                    double[] transformParameters) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(14980);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(14981);this.type = type;
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(14982);this.transformParameters = transformParameters;
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

    /**
     * @return an object which is a deep copy of this one
     */
    public Object clone() {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(14983);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(14984);TransformStackElement newElement = null;

        // start with a shallow copy to get our implementations right
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(14985);try {
            __CLR4_5_2bk4bk4m6lb50v0.R.inc(14986);newElement = (TransformStackElement) super.clone();
        } catch (java.lang.CloneNotSupportedException ex) {
            __CLR4_5_2bk4bk4m6lb50v0.R.inc(14987);throw new AssertionError();
        }

        // now deep copy the parameter array
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(14988);double[] transformParameters = new double[this.transformParameters.length];
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(14989);System.arraycopy(this.transformParameters, 0, transformParameters, 0, transformParameters.length);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(14990);newElement.transformParameters = transformParameters;
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(14991);return newElement;
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

    /*
     * Factory methods
     */

    public static TransformStackElement createTranslateElement(double tx,
                                                               double ty) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(14992);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(14993);return new TransformStackElement(TransformType.TRANSLATE,
                                         new double[]{ tx, ty }) {
                boolean isIdentity(double[] parameters) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(14994);
                    __CLR4_5_2bk4bk4m6lb50v0.R.inc(14995);return parameters[0] == 0 && parameters[1] == 0;
                }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}
            };
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

    public static TransformStackElement createRotateElement(double theta) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(14996);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(14997);return new TransformStackElement(TransformType.ROTATE,
                                         new double[]{ theta }) {
                boolean isIdentity(double[] parameters) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(14998);
                    __CLR4_5_2bk4bk4m6lb50v0.R.inc(14999);return Math.cos(parameters[0]) == 1;
                }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}
            };
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

    public static TransformStackElement createScaleElement(double scaleX,
                                                           double scaleY) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(15000);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15001);return new TransformStackElement(TransformType.SCALE,
                                         new double[]{ scaleX, scaleY }) {
                boolean isIdentity(double[] parameters) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(15002);
                    __CLR4_5_2bk4bk4m6lb50v0.R.inc(15003);return parameters[0] == 1 && parameters[1] == 1;
                }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}
            };
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

    public static TransformStackElement createShearElement(double shearX,
                                                           double shearY) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(15004);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15005);return new TransformStackElement(TransformType.SHEAR,
                                         new double[]{ shearX, shearY }) {
                boolean isIdentity(double[] parameters) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(15006);
                    __CLR4_5_2bk4bk4m6lb50v0.R.inc(15007);return parameters[0] == 0 && parameters[1] == 0;
                }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}
            };
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

    public static TransformStackElement createGeneralTransformElement(
        AffineTransform txf) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(15008);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15009);double[] matrix = new double[6];
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15010);txf.getMatrix(matrix);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15011);return new TransformStackElement(TransformType.GENERAL, matrix) {
                boolean isIdentity(double[] m) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(15012);
                    __CLR4_5_2bk4bk4m6lb50v0.R.inc(15013);return (m[0] == 1 && m[2] == 0 && m[4] == 0
                            && m[1] == 0 && m[3] == 1 && m[5] == 0);
                }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}
            };
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

    /**
     * Implementation should determine if the parameter list represents
     * an identity transform, for the instance transform type.
     */
    abstract boolean isIdentity(double[] parameters);

    /**
     * @return true iff this transform is the identity transform
     */
    public boolean isIdentity() {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(15014);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15015);return isIdentity(transformParameters);
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

    /**
     * @return array of values containing this transform element's parameters
     */
    public double[] getTransformParameters() {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(15016);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15017);return transformParameters;
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

    /**
     * @return this transform type
     */
    public TransformType getType() {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(15018);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15019);return type;
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

    /*
     * Concatenation utility. Requests this transform stack element
     * to concatenate with the input stack element. Only elements
     * of the same types are concatenated. For example, if this
     * element represents a translation, it will concatenate with
     * another translation, but not with any other kind of
     * stack element.
     * @param stackElement element to be concatenated with this one.
     * @return true if the input stackElement was concatenated with
     *         this one. False otherwise.
     */
    public boolean concatenate(TransformStackElement stackElement) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(15020);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15021);boolean canConcatenate = false;

        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15022);if ((((type.toInt() == stackElement.type.toInt())&&(__CLR4_5_2bk4bk4m6lb50v0.R.iget(15023)!=0|true))||(__CLR4_5_2bk4bk4m6lb50v0.R.iget(15024)==0&false))) {{
            __CLR4_5_2bk4bk4m6lb50v0.R.inc(15025);canConcatenate = true;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2bk4bk4m6lb50v0.R.inc(15026);switch(type.toInt()) {
            case TransformType.TRANSFORM_TRANSLATE:if (!__CLB4_5_2_bool0) {__CLR4_5_2bk4bk4m6lb50v0.R.inc(15027);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bk4bk4m6lb50v0.R.inc(15028);transformParameters[0] += stackElement.transformParameters[0];
                __CLR4_5_2bk4bk4m6lb50v0.R.inc(15029);transformParameters[1] += stackElement.transformParameters[1];
                __CLR4_5_2bk4bk4m6lb50v0.R.inc(15030);break;
            case TransformType.TRANSFORM_ROTATE:if (!__CLB4_5_2_bool0) {__CLR4_5_2bk4bk4m6lb50v0.R.inc(15031);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bk4bk4m6lb50v0.R.inc(15032);transformParameters[0] += stackElement.transformParameters[0];
                __CLR4_5_2bk4bk4m6lb50v0.R.inc(15033);break;
            case TransformType.TRANSFORM_SCALE:if (!__CLB4_5_2_bool0) {__CLR4_5_2bk4bk4m6lb50v0.R.inc(15034);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bk4bk4m6lb50v0.R.inc(15035);transformParameters[0] *= stackElement.transformParameters[0];
                __CLR4_5_2bk4bk4m6lb50v0.R.inc(15036);transformParameters[1] *= stackElement.transformParameters[1];
                __CLR4_5_2bk4bk4m6lb50v0.R.inc(15037);break;
            case TransformType.TRANSFORM_GENERAL:if (!__CLB4_5_2_bool0) {__CLR4_5_2bk4bk4m6lb50v0.R.inc(15038);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bk4bk4m6lb50v0.R.inc(15039);transformParameters
                    = matrixMultiply(transformParameters,
                                     stackElement.transformParameters);
                __CLR4_5_2bk4bk4m6lb50v0.R.inc(15040);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2bk4bk4m6lb50v0.R.inc(15041);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bk4bk4m6lb50v0.R.inc(15042);canConcatenate = false;
            }
        }

        }__CLR4_5_2bk4bk4m6lb50v0.R.inc(15043);return canConcatenate;
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

    /**
     *  Multiplies two 2x3 matrices of double precision values
     */
    private double[] matrixMultiply(double[] matrix1, double[] matrix2) {try{__CLR4_5_2bk4bk4m6lb50v0.R.inc(15044);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15045);double[] product = new double[6];
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15046);AffineTransform transform1 = new AffineTransform(matrix1);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15047);transform1.concatenate(new AffineTransform(matrix2));
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15048);transform1.getMatrix(product);
        __CLR4_5_2bk4bk4m6lb50v0.R.inc(15049);return product;
    }finally{__CLR4_5_2bk4bk4m6lb50v0.R.flushNeeded();}}

}
