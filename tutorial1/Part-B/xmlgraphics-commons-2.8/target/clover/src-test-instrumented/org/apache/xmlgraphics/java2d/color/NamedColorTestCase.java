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

/* $Id: NamedColorTestCase.java 1829049 2018-04-13 09:37:06Z ssteiner $ */

package org.apache.xmlgraphics.java2d.color;

import java.awt.Color;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Tests named color spaces (and the CIE Lab color space implementation).
 */
public class NamedColorTestCase {static class __CLR4_5_2iu3iu3m68iyj62{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,24447,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final float POSTGELB_X = 0.6763079f;
    private static final float POSTGELB_Y = 0.6263507f;
    private static final float POSTGELB_Z = 0.04217565f;

    @Test
    public void testNamedColorWithCIELab() {__CLR4_5_2iu3iu3m68iyj62.R.globalSliceStart(getClass().getName(),24411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ynz0g9iu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iu3iu3m68iyj62.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iu3iu3m68iyj62.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.color.NamedColorTestCase.testNamedColorWithCIELab",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24411,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ynz0g9iu3(){try{__CLR4_5_2iu3iu3m68iyj62.R.inc(24411);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24412);CIELabColorSpace lab = ColorSpaces.getCIELabColorSpaceD50();

        //CIE Lab definition of "Postgelb" (postal yellow) at D50 as defined by Swiss Post
        //Convert to XYZ
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24413);float[] c1xyz = lab.toCIEXYZNative(83.25f, 16.45f, 96.89f);
        //Verify XYZ values are OK
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24414);assertEquals(POSTGELB_X, c1xyz[0], 0.001f);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24415);assertEquals(POSTGELB_Y, c1xyz[1], 0.001f);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24416);assertEquals(POSTGELB_Z, c1xyz[2], 0.001f);

        //Build named color based on XYZ coordinates
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24417);NamedColorSpace ncs = new NamedColorSpace("Postgelb", c1xyz);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24418);Color c1 = new Color(ncs, new float[] {1.0f}, 1.0f);

        __CLR4_5_2iu3iu3m68iyj62.R.inc(24419);assertEquals(ncs, c1.getColorSpace());
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24420);float[] comp = c1.getColorComponents(null);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24421);assertEquals(1, comp.length);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24422);assertEquals(1.0f, comp[0], 0.001f);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24423);float[] xyz = ncs.toCIEXYZ(new float[] {1.0f});
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24424);for (int i = 0; (((i < 3)&&(__CLR4_5_2iu3iu3m68iyj62.R.iget(24425)!=0|true))||(__CLR4_5_2iu3iu3m68iyj62.R.iget(24426)==0&false)); i++) {{
            __CLR4_5_2iu3iu3m68iyj62.R.inc(24427);assertEquals(c1xyz[i], xyz[i], 0.001f);
        }

        //NOTE: Allowing for some fuzziness due to differences in XYZ->sRGB calculation between
        //Java 1.5 and 6.
        }__CLR4_5_2iu3iu3m68iyj62.R.inc(24428);assertEquals(254, c1.getRed(), 1f);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24429);assertEquals(195, c1.getGreen(), 2f);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24430);assertEquals(0, c1.getBlue());
    }finally{__CLR4_5_2iu3iu3m68iyj62.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_2iu3iu3m68iyj62.R.globalSliceStart(getClass().getName(),24431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e608iun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iu3iu3m68iyj62.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iu3iu3m68iyj62.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.java2d.color.NamedColorTestCase.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24431,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e608iun(){try{__CLR4_5_2iu3iu3m68iyj62.R.inc(24431);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24432);NamedColorSpace ncs1 = new NamedColorSpace("Postgelb",
                new float[] {POSTGELB_X, POSTGELB_Y, POSTGELB_Z});

        __CLR4_5_2iu3iu3m68iyj62.R.inc(24433);NamedColorSpace ncs2 = new NamedColorSpace("Postgelb",
                new float[] {POSTGELB_X, POSTGELB_Y, POSTGELB_Z});

        __CLR4_5_2iu3iu3m68iyj62.R.inc(24434);assertEquals(ncs1, ncs2);

        //Construct the same NamedColorSpace via two different methods
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24435);CIELabColorSpace lab = ColorSpaces.getCIELabColorSpaceD50();
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24436);Color postgelbLab = lab.toColor(83.25f, 16.45f, 96.89f, 1.0f);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24437);float[] xyz = lab.toCIEXYZ(postgelbLab.getColorComponents(null));
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24438);xyz[0] = POSTGELB_X;
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24439);xyz[1] = POSTGELB_Y;
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24440);xyz[2] = POSTGELB_Z;
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24441);ncs1 = new NamedColorSpace("Postgelb", postgelbLab);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24442);ncs2 = new NamedColorSpace("Postgelb", xyz);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24443);assertEquals(ncs1, ncs2);

        //Compare with a similar color coming from sRGB
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24444);Color rgb = new Color(255, 184, 0);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24445);ncs2 = new NamedColorSpace("PostgelbFromRGB", rgb);
        __CLR4_5_2iu3iu3m68iyj62.R.inc(24446);assertFalse(ncs1.equals(ncs2));
    }finally{__CLR4_5_2iu3iu3m68iyj62.R.flushNeeded();}}
}
