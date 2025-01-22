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

/* $Id: GlyphsTestCase.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.fonts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Tests for the Glyphs class.
 */
public class GlyphsTestCase {static class __CLR4_5_2hcmhcmm68iyitr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587877317L,8589935092L,22528,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testGetUnicodeSequenceForGlyphName() throws Exception {__CLR4_5_2hcmhcmm68iyitr.R.globalSliceStart(getClass().getName(),22486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_293p9e9hcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hcmhcmm68iyitr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hcmhcmm68iyitr.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.fonts.GlyphsTestCase.testGetUnicodeSequenceForGlyphName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_293p9e9hcm() throws Exception{try{__CLR4_5_2hcmhcmm68iyitr.R.inc(22486);
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22487);String glyph;
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22488);String unicodes;

        __CLR4_5_2hcmhcmm68iyitr.R.inc(22489);glyph = "Omega";
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22490);unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22491);assertEquals(1, unicodes.length());
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22492);assertEquals("Must contain 2126 - OHM SIGN",
                unicodes.charAt(0), '\u2126');

        __CLR4_5_2hcmhcmm68iyitr.R.inc(22493);glyph = "Omegagreek";
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22494);unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22495);assertEquals(1, unicodes.length());
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22496);assertEquals("Must contain 03A9 - GREEK CAPITAL LETTER OMEGA",
                unicodes.charAt(0), '\u03a9');

        __CLR4_5_2hcmhcmm68iyitr.R.inc(22497);glyph = "A";
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22498);unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22499);assertEquals(1, unicodes.length());
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22500);assertEquals("Must contain 0041 - LATIN CAPITAL LETTER A",
                unicodes.charAt(0), 'A');

        __CLR4_5_2hcmhcmm68iyitr.R.inc(22501);glyph = "rehyehaleflamarabic";
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22502);unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22503);assertEquals(4, unicodes.length());
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22504);assertEquals("Expected 0631 - ARABIC LETTER REH at position 0",
                unicodes.charAt(0), '\u0631');
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22505);assertEquals("Expected FEF3 - ARABIC LETTER YEH INITAL FORM at position 1",
                unicodes.charAt(1), '\ufef3');
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22506);assertEquals("Expected FE8E - ARABIC LETTER ALEF FINAL FORM at position 2",
                unicodes.charAt(2), '\ufe8e');
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22507);assertEquals("Expected 0644 - ARABIC LETTER LAM at position 3",
                unicodes.charAt(3), '\u0644');

        __CLR4_5_2hcmhcmm68iyitr.R.inc(22508);glyph = "Lcommaaccent_uni20AC0308_u20AC";
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22509);unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22510);assertEquals(4, unicodes.length());
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22511);assertEquals("Must contain 013B",
                unicodes.charAt(0), '\u013b');
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22512);assertEquals("Must contain 20AC",
                unicodes.charAt(1), '\u20ac');
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22513);assertEquals("Must contain 0308",
                unicodes.charAt(2), '\u0308');
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22514);assertEquals("Must contain 20AC",
                unicodes.charAt(3), '\u20ac');

        __CLR4_5_2hcmhcmm68iyitr.R.inc(22515);glyph = "blah";
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22516);unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22517);assertNull(unicodes);
    }finally{__CLR4_5_2hcmhcmm68iyitr.R.flushNeeded();}}

    @Test
    public void testGetCharNameAlternativesFor() throws Exception {__CLR4_5_2hcmhcmm68iyitr.R.globalSliceStart(getClass().getName(),22518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mu13glhdi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hcmhcmm68iyitr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hcmhcmm68iyitr.R.globalSliceEnd(getClass().getName(),"org.apache.xmlgraphics.fonts.GlyphsTestCase.testGetCharNameAlternativesFor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22518,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mu13glhdi() throws Exception{try{__CLR4_5_2hcmhcmm68iyitr.R.inc(22518);
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22519);String[] alts = Glyphs.getCharNameAlternativesFor("Omega");
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22520);assertEquals(1, alts.length);
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22521);assertEquals("Omegagreek", alts[0]);

        __CLR4_5_2hcmhcmm68iyitr.R.inc(22522);alts = Glyphs.getCharNameAlternativesFor("nbspace");
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22523);assertEquals(2, alts.length);
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22524);assertEquals("space", alts[0]);
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22525);assertEquals("nonbreakingspace", alts[1]);

        __CLR4_5_2hcmhcmm68iyitr.R.inc(22526);alts = Glyphs.getCharNameAlternativesFor("A");
        __CLR4_5_2hcmhcmm68iyitr.R.inc(22527);assertNull(alts);
    }finally{__CLR4_5_2hcmhcmm68iyitr.R.flushNeeded();}}
}
