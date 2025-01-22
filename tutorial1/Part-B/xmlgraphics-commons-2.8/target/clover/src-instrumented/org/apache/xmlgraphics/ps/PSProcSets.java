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

/* $Id: PSProcSets.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.ps;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/**
 * This class defines the basic resources (procsets) used by the Apache XML Graphics project.
 *
 * @version $Id: PSProcSets.java 1804124 2017-08-04 14:13:54Z ssteiner $
 */
public final class PSProcSets {public static class __CLR4_5_2dzmdzmm68iyi4p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,18354,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private PSProcSets() {try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18130);
    }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}

    /** the standard procset for the XML Graphics project */
    public static final PSResource STD_PROCSET;
    /** the EPS procset for the XML Graphics project */
    public static final PSResource EPS_PROCSET = new EPSProcSet();

    /** the standard command map matching the {@link #STD_PROCSET}. */
    public static final PSCommandMap STD_COMMAND_MAP;

    static {try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18131);
        __CLR4_5_2dzmdzmm68iyi4p.R.inc(18132);StdProcSet stdProcSet = new StdProcSet();
        __CLR4_5_2dzmdzmm68iyi4p.R.inc(18133);STD_PROCSET = stdProcSet;
        __CLR4_5_2dzmdzmm68iyi4p.R.inc(18134);STD_COMMAND_MAP = stdProcSet;
    }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}

    /**
     * The standard procset used by XML Graphics Commons.
     */
    private static class StdProcSet extends PSProcSet implements PSCommandMap {

        /** A Map<String, String> of standard shorthand macros defined in the {@link StdProcSet}. */
        private static final Map STANDARD_MACROS;

        static {try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18135);
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18136);Map macros = new java.util.HashMap();
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18137);macros.put("moveto", "M");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18138);macros.put("rmoveto", "RM");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18139);macros.put("curveto", "C");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18140);macros.put("lineto", "L");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18141);macros.put("show", "t");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18142);macros.put("ashow", "A");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18143);macros.put("closepath", "cp");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18144);macros.put("setrgbcolor", "RC");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18145);macros.put("setgray", "GC");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18146);macros.put("setcmykcolor", "CC");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18147);macros.put("newpath", "N");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18148);macros.put("setmiterlimit", "ML");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18149);macros.put("setlinewidth", "LC");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18150);macros.put("setlinewidth", "LW");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18151);macros.put("setlinejoin", "LJ");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18152);macros.put("grestore", "GR");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18153);macros.put("gsave", "GS");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18154);macros.put("fill", "f");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18155);macros.put("stroke", "S");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18156);macros.put("concat", "CT");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18157);STANDARD_MACROS = Collections.unmodifiableMap(macros);
        }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}

        public StdProcSet() {
            super("Apache XML Graphics Std ProcSet", 1.2f, 0);__CLR4_5_2dzmdzmm68iyi4p.R.inc(18159);try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18158);
        }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}

        public void writeTo(PSGenerator gen) throws IOException {try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18160);
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18161);gen.writeDSCComment(DSCConstants.BEGIN_RESOURCE,
                    new Object[] {TYPE_PROCSET, getName(),
                        Float.toString(getVersion()), Integer.toString(getRevision())});
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18162);gen.writeDSCComment(DSCConstants.VERSION,
                    new Object[] {Float.toString(getVersion()), Integer.toString(getRevision())});
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18163);gen.writeDSCComment(DSCConstants.COPYRIGHT, "Copyright 2001-2003,2010 "
                        + "The Apache Software Foundation. "
                        + "License terms: http://www.apache.org/licenses/LICENSE-2.0");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18164);gen.writeDSCComment(DSCConstants.TITLE,
                    "Basic set of procedures used by the XML Graphics project (Batik and FOP)");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18165);gen.writeln("/bd{bind def}bind def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18166);gen.writeln("/ld{load def}bd");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18167);for (Object o : STANDARD_MACROS.entrySet()) {{
                __CLR4_5_2dzmdzmm68iyi4p.R.inc(18168);Map.Entry entry = (Map.Entry) o;
                __CLR4_5_2dzmdzmm68iyi4p.R.inc(18169);gen.writeln("/" + entry.getValue() + "/" + entry.getKey() + " ld");
            }

            }__CLR4_5_2dzmdzmm68iyi4p.R.inc(18170);gen.writeln("/re {4 2 roll M"); //define rectangle
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18171);gen.writeln("1 index 0 rlineto");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18172);gen.writeln("0 exch rlineto");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18173);gen.writeln("neg 0 rlineto");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18174);gen.writeln("cp } bd");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18175);gen.writeln("/_ctm matrix def"); //Holds the current matrix
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18176);gen.writeln("/_tm matrix def");
            //BT: save currentmatrix, set _tm to identitymatrix and move to 0/0
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18177);gen.writeln("/BT { _ctm currentmatrix pop matrix _tm copy pop 0 0 moveto } bd");
            //ET: restore last currentmatrix
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18178);gen.writeln("/ET { _ctm setmatrix } bd");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18179);gen.writeln("/iTm { _ctm setmatrix _tm concat } bd");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18180);gen.writeln("/Tm { _tm astore pop iTm 0 0 moveto } bd");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18181);gen.writeln("/ux 0.0 def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18182);gen.writeln("/uy 0.0 def");

            // <font> <size> F
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18183);gen.writeln("/F {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18184);gen.writeln("  /Tp exch def");
            // gen.writeln("  currentdict exch get");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18185);gen.writeln("  /Tf exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18186);gen.writeln("  Tf findfont Tp scalefont setfont");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18187);gen.writeln("  /cf Tf def  /cs Tp def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18188);gen.writeln("} bd");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18189);gen.writeln("/ULS {currentpoint /uy exch def /ux exch def} bd");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18190);gen.writeln("/ULE {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18191);gen.writeln("  /Tcx currentpoint pop def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18192);gen.writeln("  gsave");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18193);gen.writeln("  newpath");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18194);gen.writeln("  cf findfont cs scalefont dup");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18195);gen.writeln("  /FontMatrix get 0 get /Ts exch def /FontInfo get dup");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18196);gen.writeln("  /UnderlinePosition get Ts mul /To exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18197);gen.writeln("  /UnderlineThickness get Ts mul /Tt exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18198);gen.writeln("  ux uy To add moveto  Tcx uy To add lineto");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18199);gen.writeln("  Tt setlinewidth stroke");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18200);gen.writeln("  grestore");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18201);gen.writeln("} bd");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18202);gen.writeln("/OLE {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18203);gen.writeln("  /Tcx currentpoint pop def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18204);gen.writeln("  gsave");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18205);gen.writeln("  newpath");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18206);gen.writeln("  cf findfont cs scalefont dup");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18207);gen.writeln("  /FontMatrix get 0 get /Ts exch def /FontInfo get dup");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18208);gen.writeln("  /UnderlinePosition get Ts mul /To exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18209);gen.writeln("  /UnderlineThickness get Ts mul /Tt exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18210);gen.writeln("  ux uy To add cs add moveto Tcx uy To add cs add lineto");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18211);gen.writeln("  Tt setlinewidth stroke");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18212);gen.writeln("  grestore");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18213);gen.writeln("} bd");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18214);gen.writeln("/SOE {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18215);gen.writeln("  /Tcx currentpoint pop def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18216);gen.writeln("  gsave");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18217);gen.writeln("  newpath");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18218);gen.writeln("  cf findfont cs scalefont dup");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18219);gen.writeln("  /FontMatrix get 0 get /Ts exch def /FontInfo get dup");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18220);gen.writeln("  /UnderlinePosition get Ts mul /To exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18221);gen.writeln("  /UnderlineThickness get Ts mul /Tt exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18222);gen.writeln("  ux uy To add cs 10 mul 26 idiv add moveto "
                        + "Tcx uy To add cs 10 mul 26 idiv add lineto");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18223);gen.writeln("  Tt setlinewidth stroke");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18224);gen.writeln("  grestore");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18225);gen.writeln("} bd");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18226);gen.writeln("/QT {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18227);gen.writeln("/Y22 exch store");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18228);gen.writeln("/X22 exch store");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18229);gen.writeln("/Y21 exch store");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18230);gen.writeln("/X21 exch store");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18231);gen.writeln("currentpoint");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18232);gen.writeln("/Y21 load 2 mul add 3 div exch");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18233);gen.writeln("/X21 load 2 mul add 3 div exch");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18234);gen.writeln("/X21 load 2 mul /X22 load add 3 div");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18235);gen.writeln("/Y21 load 2 mul /Y22 load add 3 div");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18236);gen.writeln("/X22 load /Y22 load curveto");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18237);gen.writeln("} bd");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18238);gen.writeln("/SSPD {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18239);gen.writeln("dup length /d exch dict def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18240);gen.writeln("{");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18241);gen.writeln("/v exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18242);gen.writeln("/k exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18243);gen.writeln("currentpagedevice k known {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18244);gen.writeln("/cpdv currentpagedevice k get def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18245);gen.writeln("v cpdv ne {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18246);gen.writeln("/upd false def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18247);gen.writeln("/nullv v type /nulltype eq def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18248);gen.writeln("/nullcpdv cpdv type /nulltype eq def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18249);gen.writeln("nullv nullcpdv or");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18250);gen.writeln("{");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18251);gen.writeln("/upd true def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18252);gen.writeln("} {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18253);gen.writeln("/sametype v type cpdv type eq def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18254);gen.writeln("sametype {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18255);gen.writeln("v type /arraytype eq {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18256);gen.writeln("/vlen v length def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18257);gen.writeln("/cpdvlen cpdv length def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18258);gen.writeln("vlen cpdvlen eq {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18259);gen.writeln("0 1 vlen 1 sub {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18260);gen.writeln("/i exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18261);gen.writeln("/obj v i get def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18262);gen.writeln("/cpdobj cpdv i get def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18263);gen.writeln("obj cpdobj ne {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18264);gen.writeln("/upd true def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18265);gen.writeln("exit");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18266);gen.writeln("} if");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18267);gen.writeln("} for");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18268);gen.writeln("} {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18269);gen.writeln("/upd true def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18270);gen.writeln("} ifelse");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18271);gen.writeln("} {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18272);gen.writeln("v type /dicttype eq {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18273);gen.writeln("v {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18274);gen.writeln("/dv exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18275);gen.writeln("/dk exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18276);gen.writeln("/cpddv cpdv dk get def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18277);gen.writeln("dv cpddv ne {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18278);gen.writeln("/upd true def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18279);gen.writeln("exit");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18280);gen.writeln("} if");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18281);gen.writeln("} forall");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18282);gen.writeln("} {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18283);gen.writeln("/upd true def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18284);gen.writeln("} ifelse");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18285);gen.writeln("} ifelse");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18286);gen.writeln("} if");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18287);gen.writeln("} ifelse");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18288);gen.writeln("upd true eq {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18289);gen.writeln("d k v put");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18290);gen.writeln("} if");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18291);gen.writeln("} if");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18292);gen.writeln("} if");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18293);gen.writeln("} forall");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18294);gen.writeln("d length 0 gt {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18295);gen.writeln("d setpagedevice");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18296);gen.writeln("} if");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18297);gen.writeln("} bd");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18298);gen.writeln("/RE { % /NewFontName [NewEncodingArray] /FontName RE -");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18299);gen.writeln("  findfont dup length dict begin");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18300);gen.writeln("  {");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18301);gen.writeln("    1 index /FID ne");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18302);gen.writeln("    {def} {pop pop} ifelse");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18303);gen.writeln("  } forall");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18304);gen.writeln("  /Encoding exch def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18305);gen.writeln("  /FontName 1 index def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18306);gen.writeln("  currentdict definefont pop");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18307);gen.writeln("  end");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18308);gen.writeln("} bind def");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18309);gen.writeDSCComment(DSCConstants.END_RESOURCE);
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18310);gen.getResourceTracker().registerSuppliedResource(this);
        }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}

        /** {@inheritDoc} */
        public String mapCommand(String command) {try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18311);
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18312);String mapped = (String)STANDARD_MACROS.get(command);
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18313);return ((((mapped != null )&&(__CLR4_5_2dzmdzmm68iyi4p.R.iget(18314)!=0|true))||(__CLR4_5_2dzmdzmm68iyi4p.R.iget(18315)==0&false))? mapped : command);
        }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}

    }

    private static class EPSProcSet extends PSProcSet {

        public EPSProcSet() {
            super("Apache XML Graphics EPS ProcSet", 1.0f, 0);__CLR4_5_2dzmdzmm68iyi4p.R.inc(18317);try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18316);
        }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}

        public void writeTo(PSGenerator gen) throws IOException {try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18318);
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18319);gen.writeDSCComment(DSCConstants.BEGIN_RESOURCE,
                    new Object[] {TYPE_PROCSET, getName(),
                        Float.toString(getVersion()), Integer.toString(getRevision())});
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18320);gen.writeDSCComment(DSCConstants.VERSION,
                    new Object[] {Float.toString(getVersion()), Integer.toString(getRevision())});
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18321);gen.writeDSCComment(DSCConstants.COPYRIGHT, "Copyright 2002-2003 "
                    + "The Apache Software Foundation. "
                    + "License terms: http://www.apache.org/licenses/LICENSE-2.0");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18322);gen.writeDSCComment(DSCConstants.TITLE,
                    "EPS procedures used by the Apache XML Graphics project (Batik and FOP)");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18323);gen.writeln("/BeginEPSF { %def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18324);gen.writeln("/b4_Inc_state save def         % Save state for cleanup");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18325);gen.writeln("/dict_count countdictstack def % Count objects on dict stack");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18326);gen.writeln("/op_count count 1 sub def      % Count objects on operand stack");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18327);gen.writeln("userdict begin                 % Push userdict on dict stack");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18328);gen.writeln("/showpage { } def              % Redefine showpage, { } = null proc");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18329);gen.writeln("0 setgray 0 setlinecap         % Prepare graphics state");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18330);gen.writeln("1 setlinewidth 0 setlinejoin");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18331);gen.writeln("10 setmiterlimit [ ] 0 setdash newpath");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18332);gen.writeln("/languagelevel where           % If level not equal to 1 then");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18333);gen.writeln("{pop languagelevel             % set strokeadjust and");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18334);gen.writeln("1 ne                           % overprint to their defaults.");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18335);gen.writeln("{false setstrokeadjust false setoverprint");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18336);gen.writeln("} if");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18337);gen.writeln("} if");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18338);gen.writeln("} bd");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18339);gen.writeln("/EndEPSF { %def");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18340);gen.writeln("count op_count sub {pop} repeat            % Clean up stacks");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18341);gen.writeln("countdictstack dict_count sub {end} repeat");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18342);gen.writeln("b4_Inc_state restore");
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18343);gen.writeln("} bd");

            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18344);gen.writeDSCComment(DSCConstants.END_RESOURCE);
            __CLR4_5_2dzmdzmm68iyi4p.R.inc(18345);gen.getResourceTracker().registerSuppliedResource(this);
        }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}

    }

    /**
     * Generates a resource defining standard procset with operations used by the XML Graphics
     * project.
     * @param gen PSGenerator to use for output
     * @throws IOException In case of an I/O problem
     */
    public static void writeStdProcSet(PSGenerator gen) throws IOException {try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18346);
        __CLR4_5_2dzmdzmm68iyi4p.R.inc(18347);((StdProcSet)STD_PROCSET).writeTo(gen);
    }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}

    /**
     * Generates a resource defining standard procset with operations used by the XML Graphics
     * project.
     * @param gen PSGenerator to use for output
     * @throws IOException In case of an I/O problem
     * @deprecated Use writeStdProcSet() instead.
     */
    public static void writeFOPStdProcSet(PSGenerator gen) throws IOException {try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18348);
        __CLR4_5_2dzmdzmm68iyi4p.R.inc(18349);writeStdProcSet(gen);
    }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}


    /**
     * Generates a resource defining a procset for including EPS graphics.
     * @param gen PSGenerator to use for output
     * @throws IOException In case of an I/O problem
     */
    public static void writeEPSProcSet(PSGenerator gen) throws IOException {try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18350);
        __CLR4_5_2dzmdzmm68iyi4p.R.inc(18351);((EPSProcSet)EPS_PROCSET).writeTo(gen);
    }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}

    /**
     * Generates a resource defining a procset for including EPS graphics.
     * @param gen PSGenerator to use for output
     * @throws IOException In case of an I/O problem
     * @deprecated Use writeEPSProcSet() instead.
     */
    public static void writeFOPEPSProcSet(PSGenerator gen) throws IOException {try{__CLR4_5_2dzmdzmm68iyi4p.R.inc(18352);
        __CLR4_5_2dzmdzmm68iyi4p.R.inc(18353);writeEPSProcSet(gen);
    }finally{__CLR4_5_2dzmdzmm68iyi4p.R.flushNeeded();}}


}
