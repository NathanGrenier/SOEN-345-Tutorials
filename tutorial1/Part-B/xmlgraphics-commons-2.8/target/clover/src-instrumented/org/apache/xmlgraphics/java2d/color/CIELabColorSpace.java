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

/* $Id: CIELabColorSpace.java 1051421 2010-12-21 08:54:25Z jeremias $ */

package org.apache.xmlgraphics.java2d.color;

import java.awt.Color;
import java.awt.color.ColorSpace;

/**
 * This class defines the CIE L*a*b* (CIE 1976) color space. Valid values for L* are between 0
 * and 100, for a* and b* between -127 and +127.
 * @see <a href="http://en.wikipedia.org/wiki/Lab_color_space"
 *      >http://en.wikipedia.org/wiki/Lab_color_space</a>
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class CIELabColorSpace extends ColorSpace {public static class __CLR4_5_2bmpbmpm6lb50vq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,15217,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -1821569090707520704L;

    //CIE XYZ tristimulus values of the reference white point: Observer= 2 degrees, Illuminant= D65
    private static final float REF_X_D65 = 95.047f;
    private static final float REF_Y_D65 = 100.000f;
    private static final float REF_Z_D65 = 108.883f;

    //CIE XYZ tristimulus values of the reference white point: Illuminant= D50
    private static final float REF_X_D50 = 96.42f;
    private static final float REF_Y_D50 = 100.00f;
    private static final float REF_Z_D50 = 82.49f;

    private static final double D = 6.0 / 29.0;
    private static final double REF_A = 1.0 / (3 * Math.pow(D, 2)); //7.787037...
    private static final double REF_B = 16.0 / 116.0;
    private static final double T0 = Math.pow(D, 3); //0.008856...

    private float wpX;
    private float wpY;
    private float wpZ;

    /**
     * Default constructor using the D65 white point.
     */
    public CIELabColorSpace() {
        this(getD65WhitePoint());__CLR4_5_2bmpbmpm6lb50vq.R.inc(15074);try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15073);
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /**
     * CIE Lab space constructor which allows to give an arbitrary white point.
     * @param whitePoint the white point in XYZ coordinates (valid values: 0.0f to 1.0f, although
     * values slightly larger than 1.0f are common)
     */
    public CIELabColorSpace(float[] whitePoint) {
        super(ColorSpace.TYPE_Lab, 3);__CLR4_5_2bmpbmpm6lb50vq.R.inc(15076);try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15075);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15077);checkNumComponents(whitePoint, 3);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15078);this.wpX = whitePoint[0];
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15079);this.wpY = whitePoint[1];
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15080);this.wpZ = whitePoint[2];
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /**
     * Returns the D65 white point.
     * @return the D65 white point.
     */
    public static float[] getD65WhitePoint() {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15081);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15082);return new float[] {REF_X_D65, REF_Y_D65, REF_Z_D65};
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /**
     * Returns the D50 white point.
     * @return the D50 white point.
     */
    public static float[] getD50WhitePoint() {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15083);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15084);return new float[] {REF_X_D50, REF_Y_D50, REF_Z_D50};
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    private void checkNumComponents(float[] colorvalue) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15085);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15086);checkNumComponents(colorvalue, getNumComponents());
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    private void checkNumComponents(float[] colorvalue, int expected) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15087);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15088);if ((((colorvalue == null)&&(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15089)!=0|true))||(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15090)==0&false))) {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15091);throw new NullPointerException("color value may not be null");
        }
        }__CLR4_5_2bmpbmpm6lb50vq.R.inc(15092);if ((((colorvalue.length != expected)&&(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15093)!=0|true))||(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15094)==0&false))) {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15095);throw new IllegalArgumentException("Expected " + expected
                    + " components, but got " + colorvalue.length);
        }
    }}finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /**
     * Returns the configured white point.
     * @return the white point in CIE XYZ coordinates
     */
    public float[] getWhitePoint() {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15096);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15097);return new float[] {wpX, wpY, wpZ};
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    private static final String CIE_LAB_ONLY_HAS_3_COMPONENTS = "CIE Lab only has 3 components!";

    /** {@inheritDoc} */
    @Override
    public float getMinValue(int component) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15098);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2bmpbmpm6lb50vq.R.inc(15099);switch (component) {
        case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15100);__CLB4_5_2_bool0=true;} //L*
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15101);return 0f;
        case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15102);__CLB4_5_2_bool0=true;} //a*
        case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15103);__CLB4_5_2_bool0=true;} //b*
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15104);return -128f;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15105);__CLB4_5_2_bool0=true;}
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15106);throw new IllegalArgumentException(CIE_LAB_ONLY_HAS_3_COMPONENTS);
        }
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public float getMaxValue(int component) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15107);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2bmpbmpm6lb50vq.R.inc(15108);switch (component) {
        case 0:if (!__CLB4_5_2_bool1) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15109);__CLB4_5_2_bool1=true;} //L*
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15110);return 100f;
        case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15111);__CLB4_5_2_bool1=true;} //a*
        case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15112);__CLB4_5_2_bool1=true;} //b*
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15113);return 128f;
        default:if (!__CLB4_5_2_bool1) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15114);__CLB4_5_2_bool1=true;}
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15115);throw new IllegalArgumentException(CIE_LAB_ONLY_HAS_3_COMPONENTS);
        }
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public String getName(int component) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15116);
        boolean __CLB4_5_2_bool2=false;__CLR4_5_2bmpbmpm6lb50vq.R.inc(15117);switch (component) {
        case 0:if (!__CLB4_5_2_bool2) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15118);__CLB4_5_2_bool2=true;}
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15119);return "L*";
        case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15120);__CLB4_5_2_bool2=true;}
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15121);return "a*";
        case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15122);__CLB4_5_2_bool2=true;}
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15123);return "b*";
        default:if (!__CLB4_5_2_bool2) {__CLR4_5_2bmpbmpm6lb50vq.R.inc(15124);__CLB4_5_2_bool2=true;}
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15125);throw new IllegalArgumentException(CIE_LAB_ONLY_HAS_3_COMPONENTS);
        }
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    //Note: the conversion functions used here were mostly borrowed from Apache Commons Sanselan
    //and adjusted to the local requirements.

    /** {@inheritDoc} */
    @Override
    public float[] fromCIEXYZ(float[] colorvalue) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15126);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15127);checkNumComponents(colorvalue, 3);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15128);float x = colorvalue[0];
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15129);float y = colorvalue[1];
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15130);float z = colorvalue[2];

        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15131);double varX = x / wpX;
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15132);double varY = y / wpY;
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15133);double varZ = z / wpZ;

        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15134);if ((((varX > T0)&&(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15135)!=0|true))||(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15136)==0&false))) {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15137);varX = Math.pow(varX, (1 / 3.0));
        } }else {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15138);varX = (REF_A * varX) + REF_B;
        }
        }__CLR4_5_2bmpbmpm6lb50vq.R.inc(15139);if ((((varY > T0)&&(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15140)!=0|true))||(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15141)==0&false))) {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15142);varY = Math.pow(varY, 1 / 3.0);
        } }else {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15143);varY = (REF_A * varY) + REF_B;
        }
        }__CLR4_5_2bmpbmpm6lb50vq.R.inc(15144);if ((((varZ > T0)&&(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15145)!=0|true))||(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15146)==0&false))) {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15147);varZ = Math.pow(varZ, 1 / 3.0);
        } }else {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15148);varZ = (REF_A * varZ) + REF_B;
        }

        }__CLR4_5_2bmpbmpm6lb50vq.R.inc(15149);float l = (float)((116 * varY) - 16);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15150);float a = (float)(500 * (varX - varY));
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15151);float b = (float)(200 * (varY - varZ));

        //Normalize to range 0.0..1.0
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15152);l = normalize(l, 0);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15153);a = normalize(a, 1);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15154);b = normalize(b, 2);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15155);return new float[] {l, a, b};
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public float[] fromRGB(float[] rgbvalue) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15156);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15157);ColorSpace sRGB = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15158);float[] xyz = sRGB.toCIEXYZ(rgbvalue);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15159);return fromCIEXYZ(xyz);
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public float[] toCIEXYZ(float[] colorvalue) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15160);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15161);checkNumComponents(colorvalue);
        //Scale to native value range
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15162);float l = denormalize(colorvalue[0], 0);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15163);float a = denormalize(colorvalue[1], 1);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15164);float b = denormalize(colorvalue[2], 2);

        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15165);return toCIEXYZNative(l, a, b);
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /**
     * Transforms a color value assumed to be in this {@link ColorSpace}
     * into the CS_CIEXYZ conversion color space. This method uses component values
     * in CIE Lab's native color ranges rather than the normalized values between 0 and 1.
     * @param l the L* component (values between 0 and 100)
     * @param a the a* component (usually between -128 and +128)
     * @param b the b* component (usually between -128 and +128)
     * @return the XYZ color values
     * @see #toCIEXYZ(float[])
     */
    public float[] toCIEXYZNative(float l, float a, float b) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15166);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15167);double varY = (l + 16) / 116.0;
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15168);double varX = a / 500 + varY;
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15169);double varZ = varY - b / 200.0;

        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15170);if ((((Math.pow(varY, 3) > T0)&&(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15171)!=0|true))||(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15172)==0&false))) {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15173);varY = Math.pow(varY, 3);
        } }else {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15174);varY = (varY - 16 / 116.0) / REF_A;
        }
        }__CLR4_5_2bmpbmpm6lb50vq.R.inc(15175);if ((((Math.pow(varX, 3) > T0)&&(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15176)!=0|true))||(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15177)==0&false))) {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15178);varX = Math.pow(varX, 3);
        } }else {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15179);varX = (varX - 16 / 116.0) / REF_A;
        }
        }__CLR4_5_2bmpbmpm6lb50vq.R.inc(15180);if ((((Math.pow(varZ, 3) > T0)&&(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15181)!=0|true))||(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15182)==0&false))) {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15183);varZ = Math.pow(varZ, 3);
        } }else {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15184);varZ = (varZ - 16 / 116.0) / REF_A;
        }

        }__CLR4_5_2bmpbmpm6lb50vq.R.inc(15185);float x = (float)(wpX * varX / 100);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15186);float y = (float)(wpY * varY / 100);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15187);float z = (float)(wpZ * varZ / 100);

        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15188);return new float[] {x, y, z};
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public float[] toRGB(float[] colorvalue) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15189);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15190);ColorSpace sRGB = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15191);float[] xyz = toCIEXYZ(colorvalue);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15192);return sRGB.fromCIEXYZ(xyz);
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    private float getNativeValueRange(int component) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15193);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15194);return getMaxValue(component) - getMinValue(component);
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    private float normalize(float value, int component) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15195);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15196);return (value - getMinValue(component)) / getNativeValueRange(component);
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    private float denormalize(float value, int component) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15197);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15198);return value * getNativeValueRange(component) + getMinValue(component);
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /**
     * Converts normalized (0..1) color components to CIE L*a*b*'s native value range.
     * @param comps the normalized components.
     * @return the denormalized components
     */
    public float[] toNativeComponents(float[] comps) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15199);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15200);checkNumComponents(comps);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15201);float[] nativeComps = new float[comps.length];
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15202);for (int i = 0, c = comps.length; (((i < c)&&(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15203)!=0|true))||(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15204)==0&false)); i++) {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15205);nativeComps[i] = denormalize(comps[i], i);
        }
        }__CLR4_5_2bmpbmpm6lb50vq.R.inc(15206);return nativeComps;
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /**
     * Creates a {@link Color} instance from color values usually used by the L*a*b* color space
     * by scaling them to the 0.0..1.0 range expected by Color's constructor.
     * @param colorvalue the original color values
     *                  (native value range, i.e. not normalized to 0.0..1.0)
     * @param alpha the alpha component
     * @return the requested color instance
     */
    public Color toColor(float[] colorvalue, float alpha) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15207);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15208);int c = colorvalue.length;
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15209);float[] normalized = new float[c];
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15210);for (int i = 0; (((i < c)&&(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15211)!=0|true))||(__CLR4_5_2bmpbmpm6lb50vq.R.iget(15212)==0&false)); i++) {{
            __CLR4_5_2bmpbmpm6lb50vq.R.inc(15213);normalized[i] = normalize(colorvalue[i], i);
        }
        //Using ColorWithAlternatives for better equals() functionality
        }__CLR4_5_2bmpbmpm6lb50vq.R.inc(15214);return new ColorWithAlternatives(this, normalized, alpha, null);
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

    /**
     * Creates a {@link Color} instance from color values usually used by the L*a*b* color space
     * by scaling them to the 0.0..1.0 range expected by Color's constructor.
     * @param l the L* component (values between 0 and 100)
     * @param a the a* component (usually between -128 and +127)
     * @param b the b* component (usually between -128 and +127)
     * @param alpha the alpha component (values between 0 and 1)
     * @return the requested color instance
     */
    public Color toColor(float l, float a, float b, float alpha) {try{__CLR4_5_2bmpbmpm6lb50vq.R.inc(15215);
        __CLR4_5_2bmpbmpm6lb50vq.R.inc(15216);return toColor(new float[] {l, a, b}, alpha);
    }finally{__CLR4_5_2bmpbmpm6lb50vq.R.flushNeeded();}}

}
