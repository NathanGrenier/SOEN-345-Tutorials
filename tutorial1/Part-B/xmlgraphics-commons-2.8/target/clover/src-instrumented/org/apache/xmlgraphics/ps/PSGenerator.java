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

/* $Id: PSGenerator.java 1809627 2017-09-25 13:42:08Z ssteiner $ */

package org.apache.xmlgraphics.ps;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Stack;

import javax.xml.transform.Source;

import org.apache.commons.io.IOUtils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.java2d.color.ColorUtil;
import org.apache.xmlgraphics.java2d.color.ColorWithAlternatives;
import org.apache.xmlgraphics.ps.dsc.ResourceTracker;
import org.apache.xmlgraphics.util.DoubleFormatUtil;

/**
 * This class is used to output PostScript code to an OutputStream. This class assumes that
 * the {@link PSProcSets#STD_PROCSET} has been added to the PostScript file.
 *
 * @version $Id: PSGenerator.java 1809627 2017-09-25 13:42:08Z ssteiner $
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PSGenerator implements PSCommandMap {public static class __CLR4_5_2db0db0m68iyi2m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,17603,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Default postscript language level
     */
    public static final int DEFAULT_LANGUAGE_LEVEL = 3;

    /**
     * Indicator for the PostScript interpreter that the value is provided
     * later in the document (mostly in the %%Trailer section).
     * @deprecated Please use DSCConstants.ATEND. This constant was in the wrong place.
     */
    @Deprecated
    public static final Object ATEND = DSCConstants.ATEND;

    /** Line feed used by PostScript */
    public static final char LF = '\n';

    private static final String IDENTITY_H = "Identity-H";

    private Log log = LogFactory.getLog(getClass());
    private OutputStream out;
    private int psLevel = DEFAULT_LANGUAGE_LEVEL;
    private boolean acrobatDownsample;
    private boolean commentsEnabled = true;
    private boolean compactMode = true;
    private PSCommandMap commandMap = PSProcSets.STD_COMMAND_MAP;

    private Stack<PSState> graphicsStateStack = new Stack<PSState>();
    private PSState currentState;

    private StringBuffer doubleBuffer = new StringBuffer(16);

    private StringBuffer tempBuffer = new StringBuffer(256);

    private boolean identityHEmbedded;

    private PSResource procsetCIDInitResource;

    private PSResource identityHCMapResource;

    /**
     * Creates a new instance.
     * @param out the OutputStream to write the generated PostScript code to
     */
    public PSGenerator(OutputStream out) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17244);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17245);this.out = out;
        __CLR4_5_2db0db0m68iyi2m.R.inc(17246);resetGraphicsState();
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Indicates whether this instance is in compact mode. See {@link #setCompactMode(boolean)}
     * for details.
     * @return true if compact mode is enabled (the default)
     */
    public boolean isCompactMode() {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17247);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17248);return this.compactMode;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Controls whether this instance shall produce compact PostScript (omitting comments and
     * using short macros). Enabling this mode requires that the standard procset
     * ({@link PSProcSets#STD_PROCSET}) is included in the PostScript file. Setting this to
     * false produces more verbose PostScript suitable for debugging.
     * @param value true to enable compact mode, false for verbose mode
     */
    public void setCompactMode(boolean value) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17249);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17250);this.compactMode = value;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Indicates whether this instance allows to write comments. See
     * {@link #setCommentsEnabled(boolean)} for details.
     * @return true if comments are enabled (the default)
     */
    public boolean isCommentsEnabled() {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17251);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17252);return this.commentsEnabled;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Controls whether this instance allows to write comments using the {@link #commentln(String)}
     * method.
     * @param value true to enable comments, false to disable them
     */
    public void setCommentsEnabled(boolean value) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17253);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17254);this.commentsEnabled = value;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    private void resetGraphicsState() {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17255);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17256);if ((((!this.graphicsStateStack.isEmpty())&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17257)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17258)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17259);throw new IllegalStateException("Graphics state stack should be empty at this point");
        }
        }__CLR4_5_2db0db0m68iyi2m.R.inc(17260);this.currentState = new PSState();
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Returns the OutputStream the PSGenerator writes to.
     * @return the OutputStream
     */
    public OutputStream getOutputStream() {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17261);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17262);return this.out;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Returns the selected PostScript level.
     * @return the PostScript level
     */
    public int getPSLevel() {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17263);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17264);return this.psLevel;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Sets the PostScript level that is used to generate the current document.
     * @param level the PostScript level (currently 1, 2 and 3 are known)
     */
    public void setPSLevel(int level) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17265);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17266);this.psLevel = level;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    public boolean isAcrobatDownsample() {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17267);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17268);return acrobatDownsample;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    public void setAcrobatDownsample(boolean b) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17269);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17270);acrobatDownsample = b;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Attempts to resolve the given URI. PSGenerator should be subclasses to provide more
     * sophisticated URI resolution.
     * @param uri URI to access
     * @return A {@link javax.xml.transform.Source} object, or null if the URI
     * cannot be resolved.
     */
    public Source resolveURI(String uri) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17271);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17272);return new javax.xml.transform.stream.StreamSource(uri);
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Writes a newline character to the OutputStream.
     *
     * @throws IOException In case of an I/O problem
     */
    public final void newLine() throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17273);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17274);out.write(LF);
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Formats a double value for PostScript output.
     *
     * @param value value to format
     * @return the formatted value
     */
    public String formatDouble(double value) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17275);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17276);doubleBuffer.setLength(0);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17277);DoubleFormatUtil.formatDouble(value, 3, 3, doubleBuffer);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17278);return doubleBuffer.toString();
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Formats a double value for PostScript output (higher resolution).
     *
     * @param value value to format
     * @return the formatted value
     */
    public String formatDouble5(double value) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17279);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17280);doubleBuffer.setLength(0);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17281);DoubleFormatUtil.formatDouble(value, 5, 5, doubleBuffer);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17282);return doubleBuffer.toString();
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Writes a PostScript command to the stream.
     *
     * @param cmd              The PostScript code to be written.
     * @exception IOException  In case of an I/O problem
     */
    public void write(String cmd) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17283);
        /* TODO Check disabled until clarification.
        if (cmd.length() > 255) {
            throw new RuntimeException("PostScript command exceeded limit of 255 characters");
        } */
        __CLR4_5_2db0db0m68iyi2m.R.inc(17284);out.write(cmd.getBytes("US-ASCII"));
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Writes the given number to the stream in decimal format.
     *
     * @param n a number
     * @throws IOException in case of an I/O problem
     */
    public void write(int n) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17285);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17286);write(Integer.toString(n));
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Writes a PostScript command to the stream and ends the line.
     *
     * @param cmd              The PostScript code to be written.
     * @exception IOException  In case of an I/O problem
     */
    public void writeln(String cmd) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17287);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17288);write(cmd);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17289);newLine();
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Writes a comment to the stream and ends the line. Output of comments can
     * be disabled to reduce the size of the generated file.
     *
     * @param comment          comment to write
     * @exception IOException  In case of an I/O problem
     */
    public void commentln(String comment) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17290);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17291);if ((((isCommentsEnabled())&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17292)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17293)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17294);writeln(comment);
        }
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String mapCommand(String command) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17295);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17296);if ((((isCompactMode())&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17297)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17298)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17299);return this.commandMap.mapCommand(command);
        } }else {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17300);return command;
        }
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Writes encoded data to the PostScript stream.
     *
     * @param cmd              The encoded PostScript code to be written.
     * @exception IOException  In case of an I/O problem
     */
    public void writeByteArr(byte[] cmd) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17301);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17302);out.write(cmd);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17303);newLine();
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}


    /**
     * Flushes the OutputStream.
     *
     * @exception IOException In case of an I/O problem
     */
    public void flush() throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17304);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17305);out.flush();
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Escapes a character conforming to the rules established in the PostScript
     * Language Reference (Search for "Literal Text Strings").
     * @param c character to escape
     * @param target target StringBuffer to write the escaped character to
     */
    public static final void escapeChar(char c, StringBuffer target) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17306);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2db0db0m68iyi2m.R.inc(17307);switch (c) {
            case '\n':if (!__CLB4_5_2_bool0) {__CLR4_5_2db0db0m68iyi2m.R.inc(17308);__CLB4_5_2_bool0=true;}
                __CLR4_5_2db0db0m68iyi2m.R.inc(17309);target.append("\\n");
                __CLR4_5_2db0db0m68iyi2m.R.inc(17310);break;
            case '\r':if (!__CLB4_5_2_bool0) {__CLR4_5_2db0db0m68iyi2m.R.inc(17311);__CLB4_5_2_bool0=true;}
                __CLR4_5_2db0db0m68iyi2m.R.inc(17312);target.append("\\r");
                __CLR4_5_2db0db0m68iyi2m.R.inc(17313);break;
            case '\t':if (!__CLB4_5_2_bool0) {__CLR4_5_2db0db0m68iyi2m.R.inc(17314);__CLB4_5_2_bool0=true;}
                __CLR4_5_2db0db0m68iyi2m.R.inc(17315);target.append("\\t");
                __CLR4_5_2db0db0m68iyi2m.R.inc(17316);break;
            case '\b':if (!__CLB4_5_2_bool0) {__CLR4_5_2db0db0m68iyi2m.R.inc(17317);__CLB4_5_2_bool0=true;}
                __CLR4_5_2db0db0m68iyi2m.R.inc(17318);target.append("\\b");
                __CLR4_5_2db0db0m68iyi2m.R.inc(17319);break;
            case '\f':if (!__CLB4_5_2_bool0) {__CLR4_5_2db0db0m68iyi2m.R.inc(17320);__CLB4_5_2_bool0=true;}
                __CLR4_5_2db0db0m68iyi2m.R.inc(17321);target.append("\\f");
                __CLR4_5_2db0db0m68iyi2m.R.inc(17322);break;
            case '\\':if (!__CLB4_5_2_bool0) {__CLR4_5_2db0db0m68iyi2m.R.inc(17323);__CLB4_5_2_bool0=true;}
                __CLR4_5_2db0db0m68iyi2m.R.inc(17324);target.append("\\\\");
                __CLR4_5_2db0db0m68iyi2m.R.inc(17325);break;
            case '(':if (!__CLB4_5_2_bool0) {__CLR4_5_2db0db0m68iyi2m.R.inc(17326);__CLB4_5_2_bool0=true;}
                __CLR4_5_2db0db0m68iyi2m.R.inc(17327);target.append("\\(");
                __CLR4_5_2db0db0m68iyi2m.R.inc(17328);break;
            case ')':if (!__CLB4_5_2_bool0) {__CLR4_5_2db0db0m68iyi2m.R.inc(17329);__CLB4_5_2_bool0=true;}
                __CLR4_5_2db0db0m68iyi2m.R.inc(17330);target.append("\\)");
                __CLR4_5_2db0db0m68iyi2m.R.inc(17331);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2db0db0m68iyi2m.R.inc(17332);__CLB4_5_2_bool0=true;}
                __CLR4_5_2db0db0m68iyi2m.R.inc(17333);if ((((c > 255)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17334)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17335)==0&false))) {{
                    //Ignoring non Latin-1 characters
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17336);target.append('?');
                } }else {__CLR4_5_2db0db0m68iyi2m.R.inc(17337);if ((((c < 32 || c > 127)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17338)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17339)==0&false))) {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17340);target.append('\\');

                    __CLR4_5_2db0db0m68iyi2m.R.inc(17341);target.append((char)('0' + (c >> 6)));
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17342);target.append((char)('0' + ((c >> 3) % 8)));
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17343);target.append((char)('0' + (c % 8)));
                    //Integer.toOctalString(i)
                } }else {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17344);target.append(c);
                }
        }}}
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}


    /**
     * Converts text by applying escaping rules established in the DSC specs.
     * @param text Text to convert
     * @return String The resulting String
     */
    public static final String convertStringToDSC(String text) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17345);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17346);return convertStringToDSC(text, false);
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Converts a &lt;real&gt; value for use in DSC comments.
     * @param value the value to convert
     * @return String The resulting String
     */
    public static final String convertRealToDSC(float value) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17347);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17348);return Float.toString(value);
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Converts text by applying escaping rules established in the DSC specs.
     * @param text Text to convert
     * @param forceParentheses Force the use of parentheses
     * @return String The resulting String
     */
    public static final String convertStringToDSC(String text,
                                                  boolean forceParentheses) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17349);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17350);if (((((text == null) || (text.length() == 0))&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17351)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17352)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17353);return "()";
        } }else {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17354);int initialSize = text.length();
            __CLR4_5_2db0db0m68iyi2m.R.inc(17355);initialSize += initialSize / 2;
            __CLR4_5_2db0db0m68iyi2m.R.inc(17356);StringBuffer sb = new StringBuffer(initialSize);
            __CLR4_5_2db0db0m68iyi2m.R.inc(17357);if (((((text.indexOf(' ') >= 0) || forceParentheses)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17358)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17359)==0&false))) {{
                __CLR4_5_2db0db0m68iyi2m.R.inc(17360);sb.append('(');
                __CLR4_5_2db0db0m68iyi2m.R.inc(17361);for (int i = 0; (((i < text.length())&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17362)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17363)==0&false)); i++) {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17364);final char c = text.charAt(i);
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17365);escapeChar(c, sb);
                }
                }__CLR4_5_2db0db0m68iyi2m.R.inc(17366);sb.append(')');
                __CLR4_5_2db0db0m68iyi2m.R.inc(17367);return sb.toString();
            } }else {{
                __CLR4_5_2db0db0m68iyi2m.R.inc(17368);for (int i = 0; (((i < text.length())&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17369)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17370)==0&false)); i++) {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17371);final char c = text.charAt(i);
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17372);escapeChar(c, sb);
                }
                }__CLR4_5_2db0db0m68iyi2m.R.inc(17373);return sb.toString();
            }
        }}
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}


    /**
     * Writes a DSC comment to the output stream.
     * @param name Name of the DSC comment
     * @exception IOException In case of an I/O problem
     * @see org.apache.xmlgraphics.ps.DSCConstants
     */
    public void writeDSCComment(String name) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17374);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17375);writeln("%%" + name);
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}


    /**
     * Writes a DSC comment to the output stream. The parameter to the DSC
     * comment can be any object. The object is converted to a String as
     * necessary.
     * @param name Name of the DSC comment
     * @param param Single parameter to the DSC comment
     * @exception IOException In case of an I/O problem
     * @see org.apache.xmlgraphics.ps.DSCConstants
     */
    public void writeDSCComment(String name, Object param) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17376);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17377);writeDSCComment(name, new Object[] {param});
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}


    /**
     * Writes a DSC comment to the output stream. The parameters to the DSC
     * comment can be any object. The objects are converted to Strings as
     * necessary. Please see the source code to find out what parameters are
     * currently supported.
     * @param name Name of the DSC comment
     * @param params Array of parameters to the DSC comment
     * @exception IOException In case of an I/O problem
     * @see org.apache.xmlgraphics.ps.DSCConstants
     */
    public void writeDSCComment(String name, Object[] params) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17378);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17379);tempBuffer.setLength(0);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17380);tempBuffer.append("%%");
        __CLR4_5_2db0db0m68iyi2m.R.inc(17381);tempBuffer.append(name);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17382);if (((((params != null) && (params.length > 0))&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17383)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17384)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17385);tempBuffer.append(": ");
            __CLR4_5_2db0db0m68iyi2m.R.inc(17386);for (int i = 0; (((i < params.length)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17387)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17388)==0&false)); i++) {{
                __CLR4_5_2db0db0m68iyi2m.R.inc(17389);if ((((i > 0)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17390)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17391)==0&false))) {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17392);tempBuffer.append(" ");
                }

                }__CLR4_5_2db0db0m68iyi2m.R.inc(17393);if ((((params[i] instanceof String)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17394)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17395)==0&false))) {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17396);tempBuffer.append(convertStringToDSC((String)params[i]));
                } }else {__CLR4_5_2db0db0m68iyi2m.R.inc(17397);if ((((params[i] == DSCConstants.ATEND)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17398)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17399)==0&false))) {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17400);tempBuffer.append(DSCConstants.ATEND);
                } }else {__CLR4_5_2db0db0m68iyi2m.R.inc(17401);if ((((params[i] instanceof Double)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17402)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17403)==0&false))) {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17404);tempBuffer.append(formatDouble((Double) params[i]));
                } }else {__CLR4_5_2db0db0m68iyi2m.R.inc(17405);if ((((params[i] instanceof Number)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17406)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17407)==0&false))) {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17408);tempBuffer.append(params[i].toString());
                } }else {__CLR4_5_2db0db0m68iyi2m.R.inc(17409);if ((((params[i] instanceof Date)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17410)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17411)==0&false))) {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17412);DateFormat datef = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17413);tempBuffer.append(convertStringToDSC(datef.format((Date)params[i])));
                } }else {__CLR4_5_2db0db0m68iyi2m.R.inc(17414);if ((((params[i] instanceof PSResource)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17415)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17416)==0&false))) {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17417);tempBuffer.append(((PSResource)params[i]).getResourceSpecification());
                } }else {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17418);throw new IllegalArgumentException("Unsupported parameter type: "
                            + params[i].getClass().getName());
                }
            }}}}}}}
        }}
        }__CLR4_5_2db0db0m68iyi2m.R.inc(17419);writeln(tempBuffer.toString());
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}


    /**
     * Saves the graphics state of the rendering engine.
     * @exception IOException In case of an I/O problem
     */
    public void saveGraphicsState() throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17420);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17421);writeln(mapCommand("gsave"));

        __CLR4_5_2db0db0m68iyi2m.R.inc(17422);PSState state = new PSState(this.currentState, false);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17423);this.graphicsStateStack.push(this.currentState);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17424);this.currentState = state;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Restores the last graphics state of the rendering engine.
     * @return true if the state was restored, false if there's a stack underflow.
     * @exception IOException In case of an I/O problem
     */
    public boolean restoreGraphicsState() throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17425);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17426);if ((((this.graphicsStateStack.size() > 0)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17427)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17428)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17429);writeln(mapCommand("grestore"));
            __CLR4_5_2db0db0m68iyi2m.R.inc(17430);this.currentState = this.graphicsStateStack.pop();
            __CLR4_5_2db0db0m68iyi2m.R.inc(17431);return true;
        } }else {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17432);return false;
        }
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}


    /**
     * Returns the current graphics state.
     * @return the current graphics state
     */
    public PSState getCurrentState() {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17433);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17434);return this.currentState;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Issues the "showpage" command and resets the painting state accordingly.
     * @exception IOException In case of an I/O problem
     */
    public void showPage() throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17435);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17436);writeln("showpage");
        __CLR4_5_2db0db0m68iyi2m.R.inc(17437);resetGraphicsState();
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Concats the transformation matrix.
     * @param a A part
     * @param b B part
     * @param c C part
     * @param d D part
     * @param e E part
     * @param f F part
     * @exception IOException In case of an I/O problem
     */
    public void concatMatrix(double a, double b,
            double c, double d,
            double e, double f) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17438);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17439);AffineTransform at = new AffineTransform(a, b, c, d, e, f);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17440);concatMatrix(at);

    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Concats the transformations matrix.
     * @param matrix Matrix to use
     * @exception IOException In case of an I/O problem
     */
    public void concatMatrix(double[] matrix) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17441);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17442);concatMatrix(matrix[0], matrix[1],
                     matrix[2], matrix[3],
                     matrix[4], matrix[5]);
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Formats a transformation matrix.
     * @param at the AffineTransform with the matrix
     * @return the formatted transformation matrix (example: "[1 0 0 1 0 0]")
     */
    public String formatMatrix(AffineTransform at) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17443);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17444);double[] matrix = new double[6];
        __CLR4_5_2db0db0m68iyi2m.R.inc(17445);at.getMatrix(matrix);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17446);return "[" + formatDouble5(matrix[0]) + " "
            + formatDouble5(matrix[1]) + " "
            + formatDouble5(matrix[2]) + " "
            + formatDouble5(matrix[3]) + " "
            + formatDouble5(matrix[4]) + " "
            + formatDouble5(matrix[5]) + "]";
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Concats the transformations matric.
     * @param at the AffineTransform whose matrix to use
     * @exception IOException In case of an I/O problem
     */
    public void concatMatrix(AffineTransform at) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17447);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17448);getCurrentState().concatMatrix(at);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17449);writeln(formatMatrix(at) + " " + mapCommand("concat"));
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Formats a Rectangle2D to an array.
     * @param rect the rectangle
     * @return the formatted array
     */
    public String formatRectangleToArray(Rectangle2D rect) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17450);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17451);return "[" + formatDouble(rect.getX()) + " "
        + formatDouble(rect.getY()) + " "
        + formatDouble(rect.getWidth()) + " "
        + formatDouble(rect.getHeight()) + "]";
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Adds a rectangle to the current path.
     * @param x upper left corner
     * @param y upper left corner
     * @param w width
     * @param h height
     * @exception IOException In case of an I/O problem
     */
    public void defineRect(double x, double y, double w, double h)
                throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17452);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17453);writeln(formatDouble(x)
            + " " + formatDouble(y)
            + " " + formatDouble(w)
            + " " + formatDouble(h)
            + " re");
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Establishes the specified line cap style.
     * @param linecap the line cap style (0, 1 or 2) as defined by the setlinecap command.
     * @exception IOException In case of an I/O problem
     */
    public void useLineCap(int linecap) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17454);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17455);if ((((getCurrentState().useLineCap(linecap))&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17456)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17457)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17458);writeln(linecap + " " + mapCommand("setlinecap"));
        }
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Establishes the specified line join style.
     * @param linejoin the line join style (0, 1 or 2) as defined by the setlinejoin command.
     * @exception IOException In case of an I/O problem
     */
    public void useLineJoin(int linejoin) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17459);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17460);if ((((getCurrentState().useLineJoin(linejoin))&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17461)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17462)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17463);writeln(linejoin + " " + mapCommand("setlinejoin"));
        }
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Establishes the specified miter limit.
     * @param miterlimit the miter limit as defined by the setmiterlimit command.
     * @exception IOException In case of an I/O problem
     */
    public void useMiterLimit(float miterlimit) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17464);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17465);if ((((getCurrentState().useMiterLimit(miterlimit))&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17466)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17467)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17468);writeln(miterlimit + " " + mapCommand("setmiterlimit"));
        }
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Establishes the specified line width.
     * @param width the line width as defined by the setlinewidth command.
     * @exception IOException In case of an I/O problem
     */
    public void useLineWidth(double width) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17469);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17470);if ((((getCurrentState().useLineWidth(width))&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17471)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17472)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17473);writeln(formatDouble(width) + " " + mapCommand("setlinewidth"));
        }
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Establishes the specified dash pattern.
     * @param pattern the dash pattern as defined by the setdash command.
     * @exception IOException In case of an I/O problem
     */
    public void useDash(String pattern) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17474);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17475);if ((((pattern == null)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17476)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17477)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17478);pattern = PSState.DEFAULT_DASH;
        }
        }__CLR4_5_2db0db0m68iyi2m.R.inc(17479);if ((((getCurrentState().useDash(pattern))&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17480)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17481)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17482);writeln(pattern + " " + mapCommand("setdash"));
        }
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Establishes the specified color (RGB).
     * @param col the color as defined by the setrgbcolor command.
     * @exception IOException In case of an I/O problem
     * @deprecated use useColor method instead
     */
    @Deprecated
    public void useRGBColor(Color col) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17483);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17484);useColor(col);
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Establishes the specified color.
     * @param col the color.
     * @exception IOException In case of an I/O problem
     */
    public void useColor(Color col) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17485);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17486);if ((((getCurrentState().useColor(col))&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17487)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17488)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17489);writeln(convertColorToPS(col));
        }
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    private String convertColorToPS(Color color) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17490);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17491);StringBuffer codeBuffer = new StringBuffer();

        //Important: Right now, CMYK colors are treated as device colors (DeviceCMYK) irrespective
        //of any associated color profile. All other colors are converted to sRGB (if necessary)
        //and the resulting RGB components are treated as DeviceRGB colors.
        //If all three RGB components are the same, DeviceGray is used.

        __CLR4_5_2db0db0m68iyi2m.R.inc(17492);boolean established = false;
        __CLR4_5_2db0db0m68iyi2m.R.inc(17493);if ((((color instanceof ColorWithAlternatives)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17494)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17495)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17496);ColorWithAlternatives colExt = (ColorWithAlternatives)color;
            //Alternative colors have priority
            __CLR4_5_2db0db0m68iyi2m.R.inc(17497);Color[] alt = colExt.getAlternativeColors();
            __CLR4_5_2db0db0m68iyi2m.R.inc(17498);for (Color col : alt) {{
                __CLR4_5_2db0db0m68iyi2m.R.inc(17499);established = establishColorFromColor(codeBuffer, col);
                __CLR4_5_2db0db0m68iyi2m.R.inc(17500);if ((((established)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17501)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17502)==0&false))) {{
                    __CLR4_5_2db0db0m68iyi2m.R.inc(17503);break;
                }
            }}
            }__CLR4_5_2db0db0m68iyi2m.R.inc(17504);if ((((log.isDebugEnabled() && alt.length > 0)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17505)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17506)==0&false))) {{
                __CLR4_5_2db0db0m68iyi2m.R.inc(17507);log.debug("None of the alternative colors are supported. Using fallback: "
                        + color);
            }
        }}

        //Fallback
        }__CLR4_5_2db0db0m68iyi2m.R.inc(17508);if ((((!established)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17509)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17510)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17511);established = establishColorFromColor(codeBuffer, color);
        }
        }__CLR4_5_2db0db0m68iyi2m.R.inc(17512);if ((((!established)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17513)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17514)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17515);establishFallbackRGB(codeBuffer, color);
        }

        }__CLR4_5_2db0db0m68iyi2m.R.inc(17516);return codeBuffer.toString();
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    private boolean establishColorFromColor(StringBuffer codeBuffer, Color color) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17517);
        //Important: see above note about color handling!
        __CLR4_5_2db0db0m68iyi2m.R.inc(17518);float[] comps = color.getColorComponents(null);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17519);if ((((color.getColorSpace().getType() == ColorSpace.TYPE_CMYK)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17520)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17521)==0&false))) {{
            // colorspace is CMYK
            __CLR4_5_2db0db0m68iyi2m.R.inc(17522);writeSetColor(codeBuffer, comps, "setcmykcolor");
            __CLR4_5_2db0db0m68iyi2m.R.inc(17523);return true;
        }
        }__CLR4_5_2db0db0m68iyi2m.R.inc(17524);return false;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    private void writeSetColor(StringBuffer codeBuffer, float[] comps, String command) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17525);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17526);for (int i = 0, c = comps.length; (((i < c)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17527)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17528)==0&false)); i++) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17529);if ((((i > 0)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17530)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17531)==0&false))) {{
                __CLR4_5_2db0db0m68iyi2m.R.inc(17532);codeBuffer.append(" ");
            }
            }__CLR4_5_2db0db0m68iyi2m.R.inc(17533);codeBuffer.append(formatDouble(comps[i]));
        }
        }__CLR4_5_2db0db0m68iyi2m.R.inc(17534);codeBuffer.append(" ").append(mapCommand(command));
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    private void establishFallbackRGB(StringBuffer codeBuffer, Color color) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17535);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17536);float[] comps;
        __CLR4_5_2db0db0m68iyi2m.R.inc(17537);if ((((color.getColorSpace().isCS_sRGB())&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17538)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17539)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17540);comps = color.getColorComponents(null);
        } }else {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17541);if ((((log.isDebugEnabled())&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17542)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17543)==0&false))) {{
                __CLR4_5_2db0db0m68iyi2m.R.inc(17544);log.debug("Converting color to sRGB as a fallback: " + color);
            }
            }__CLR4_5_2db0db0m68iyi2m.R.inc(17545);ColorSpace sRGB = ColorSpace.getInstance(ColorSpace.CS_sRGB);
            __CLR4_5_2db0db0m68iyi2m.R.inc(17546);comps = color.getColorComponents(sRGB, null);
        }
        }assert (((comps.length == 3)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17547)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17548)==0&false));
        __CLR4_5_2db0db0m68iyi2m.R.inc(17549);boolean gray = ColorUtil.isGray(color);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17550);if ((((gray)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17551)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17552)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17553);comps = new float[] {comps[0]};
        }
        }__CLR4_5_2db0db0m68iyi2m.R.inc(17554);writeSetColor(codeBuffer, comps, (((gray )&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17555)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17556)==0&false))? "setgray" : "setrgbcolor");
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Establishes the specified font and size.
     * @param name name of the font for the "F" command (see FOP Std Proc Set)
     * @param size size of the font
     * @exception IOException In case of an I/O problem
     */
    public void useFont(String name, float size) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17557);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17558);if ((((getCurrentState().useFont(name, size))&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17559)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17560)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17561);writeln(name + " " + formatDouble(size) + " F");
        }
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    private ResourceTracker resTracker = new ResourceTracker();

    /**
     * Resturns the ResourceTracker instance associated with this PSGenerator.
     * @return the ResourceTracker instance or null if none is assigned
     */
    public ResourceTracker getResourceTracker() {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17562);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17563);return this.resTracker;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Sets the ResourceTracker instance to be associated with this PSGenerator.
     * @param resTracker the ResourceTracker instance
     */
    public void setResourceTracker(ResourceTracker resTracker) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17564);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17565);this.resTracker = resTracker;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Notifies the generator that a new page has been started and that the page resource
     * set can be cleared.
     * @deprecated Use the notifyStartNewPage() on ResourceTracker instead.
     */
    @Deprecated
    public void notifyStartNewPage() {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17566);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17567);getResourceTracker().notifyStartNewPage();
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Notifies the generator about the usage of a resource on the current page.
     * @param res the resource being used
     * @param needed true if this is a needed resource, false for a supplied resource
     * @deprecated Use the notifyResourceUsageOnPage() on ResourceTracker instead
     */
    @Deprecated
    public void notifyResourceUsage(PSResource res, boolean needed) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17568);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17569);getResourceTracker().notifyResourceUsageOnPage(res);
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Writes a DSC comment for the accumulated used resources, either at page level or
     * at document level.
     * @param pageLevel true if the DSC comment for the page level should be generated,
     *                  false for the document level (in the trailer)
     * @exception IOException In case of an I/O problem
     * @deprecated Use the writeResources() on ResourceTracker instead.
     */
    @Deprecated
    public void writeResources(boolean pageLevel) throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17570);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17571);getResourceTracker().writeResources(pageLevel, this);
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Indicates whether a particular resource is supplied, rather than needed.
     * @param res the resource
     * @return true if the resource is registered as being supplied.
     * @deprecated Use the isResourceSupplied() on ResourceTracker instead.
     */
    @Deprecated
    public boolean isResourceSupplied(PSResource res) {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17572);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17573);return getResourceTracker().isResourceSupplied(res);
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Embeds the Identity-H CMap file into the output stream, if that has not
     * already been done.
     *
     * @return true if embedding has actually been performed, false otherwise
     * (which means that a call to this method had already been made earlier)
     * @throws IOException in case of an I/O problem
     */
    public boolean embedIdentityH() throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17574);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17575);if ((((identityHEmbedded)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17576)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17577)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17578);return false;
        } }else {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17579);resTracker.registerNeededResource(getProcsetCIDInitResource());
            __CLR4_5_2db0db0m68iyi2m.R.inc(17580);writeDSCComment(DSCConstants.BEGIN_DOCUMENT, IDENTITY_H);
            __CLR4_5_2db0db0m68iyi2m.R.inc(17581);InputStream cmap = PSGenerator.class.getResourceAsStream(IDENTITY_H);
            __CLR4_5_2db0db0m68iyi2m.R.inc(17582);try {
                __CLR4_5_2db0db0m68iyi2m.R.inc(17583);IOUtils.copyLarge(cmap, out);
            } finally {
                __CLR4_5_2db0db0m68iyi2m.R.inc(17584);IOUtils.closeQuietly(cmap);
            }
            __CLR4_5_2db0db0m68iyi2m.R.inc(17585);writeDSCComment(DSCConstants.END_DOCUMENT);
            __CLR4_5_2db0db0m68iyi2m.R.inc(17586);resTracker.registerSuppliedResource(getIdentityHCMapResource());
            __CLR4_5_2db0db0m68iyi2m.R.inc(17587);identityHEmbedded = true;
            __CLR4_5_2db0db0m68iyi2m.R.inc(17588);return true;
        }
    }}finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Returns the PSResource instance corresponding to the Identity-H CMap
     * resource.
     *
     * @return the Identity-H CMap resource.
     */
    public PSResource getIdentityHCMapResource() {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17589);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17590);if ((((identityHCMapResource == null)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17591)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17592)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17593);identityHCMapResource = new PSResource(PSResource.TYPE_CMAP, IDENTITY_H);
        }
        }__CLR4_5_2db0db0m68iyi2m.R.inc(17594);return identityHCMapResource;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Returns the PSResource instance corresponding to the CIDInit ProcSet
     * resource.
     *
     * @return the ProcSet CIDInit resource
     */
    public PSResource getProcsetCIDInitResource() {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17595);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17596);if ((((procsetCIDInitResource == null)&&(__CLR4_5_2db0db0m68iyi2m.R.iget(17597)!=0|true))||(__CLR4_5_2db0db0m68iyi2m.R.iget(17598)==0&false))) {{
            __CLR4_5_2db0db0m68iyi2m.R.inc(17599);procsetCIDInitResource = new PSResource(PSResource.TYPE_PROCSET, "CIDInit");
        }
        }__CLR4_5_2db0db0m68iyi2m.R.inc(17600);return procsetCIDInitResource;
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

    /**
     * Adds a PostScript DSC comment to the output stream requiring the
     * inclusion of the CIDInit ProcSet resource.
     *
     * @throws IOException in case of an I/O problem
     */
    public void includeProcsetCIDInitResource() throws IOException {try{__CLR4_5_2db0db0m68iyi2m.R.inc(17601);
        __CLR4_5_2db0db0m68iyi2m.R.inc(17602);writeDSCComment(DSCConstants.INCLUDE_RESOURCE, getProcsetCIDInitResource());
    }finally{__CLR4_5_2db0db0m68iyi2m.R.flushNeeded();}}

}
