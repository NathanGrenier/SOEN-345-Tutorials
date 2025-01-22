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

/* $Id: DSCParser.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.ps.dsc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.PSGenerator;
import org.apache.xmlgraphics.ps.dsc.events.DSCAtend;
import org.apache.xmlgraphics.ps.dsc.events.DSCComment;
import org.apache.xmlgraphics.ps.dsc.events.DSCEvent;
import org.apache.xmlgraphics.ps.dsc.events.DSCHeaderComment;
import org.apache.xmlgraphics.ps.dsc.events.PostScriptComment;
import org.apache.xmlgraphics.ps.dsc.events.PostScriptLine;
import org.apache.xmlgraphics.ps.dsc.events.UnparsedDSCComment;
import org.apache.xmlgraphics.ps.dsc.tools.DSCTools;

/**
 * Parser for DSC-compliant PostScript files (DSC = Document Structuring Conventions). The parser
 * is implemented as a pull parser but has the ability to act as a push parser through the
 * DSCHandler interface.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DSCParser implements DSCParserConstants {public static class __CLR4_5_2ea7ea7m68iyi69{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,18763,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Log LOG = LogFactory.getLog(DSCParser.class);

    private InputStream in;
    private BufferedReader reader;
    private boolean eofFound;
    private boolean checkEOF = true;
    private DSCEvent currentEvent;
    private DSCEvent nextEvent;
    private DSCListener nestedDocumentHandler;
    private DSCListener filterListener;
    private List listeners;
    private boolean listenersDisabled;

    /**
     * Creates a new DSC parser.
     * @param in InputStream to read the PostScript file from
     *              (the stream is not closed by this class, the caller is responsible for that)
     * @throws IOException In case of an I/O error
     * @throws DSCException In case of a violation of the DSC spec
     */
    public DSCParser(InputStream in) throws IOException, DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18511);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18512);if ((((in.markSupported())&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18513)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18514)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18515);this.in = in;
        } }else {{
            //Decorate for better performance
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18516);this.in = new java.io.BufferedInputStream(this.in);
        }
        }__CLR4_5_2ea7ea7m68iyi69.R.inc(18517);String encoding = "US-ASCII";
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18518);try {
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18519);this.reader = new java.io.BufferedReader(
                    new java.io.InputStreamReader(this.in, encoding));
        } catch (UnsupportedEncodingException e) {
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18520);throw new RuntimeException("Incompatible VM! " + e.getMessage());
        }
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18521);parseNext();
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Returns the InputStream the PostScript code is read from.
     * @return the InputStream the PostScript code is read from
     */
    public InputStream getInputStream() {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18522);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18523);return this.in;
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * This method is used to write out warning messages for the parsing process. Subclass to
     * override this method. The default implementation writes to logger.
     * @param msg the warning message
     */
    protected void warn(String msg) {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18524);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18525);LOG.warn(msg);
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Reads one line from the input file
     * @return the line or null if there are no more lines
     * @throws IOException In case of an I/O error
     * @throws DSCException In case of a violation of the DSC spec
     */
    protected String readLine() throws IOException, DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18526);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18527);String line;
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18528);line = this.reader.readLine();
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18529);checkLine(line);

        __CLR4_5_2ea7ea7m68iyi69.R.inc(18530);return line;
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    private void checkLine(String line) throws DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18531);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18532);if ((((line == null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18533)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18534)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18535);if ((((!eofFound)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18536)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18537)==0&false))) {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18538);throw new DSCException("%%EOF not found. File is not well-formed.");
            }
        }} }else {__CLR4_5_2ea7ea7m68iyi69.R.inc(18539);if ((((line.length() > 255)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18540)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18541)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18542);warn("Line longer than 255 characters. This file is not fully PostScript conforming.");
        }
    }}}finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    private boolean isWhitespace(char c) {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18543);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18544);return c == ' ' || c == '\t';
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    private DSCComment parseDSCLine(String line) throws IOException, DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18545);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18546);int colon = line.indexOf(':');
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18547);String name;
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18548);StringBuilder value = new StringBuilder();
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18549);if ((((colon > 0)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18550)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18551)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18552);name = line.substring(2, colon);
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18553);int startOfValue = colon + 1;
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18554);if ((((startOfValue < line.length())&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18555)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18556)==0&false))) {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18557);if ((((isWhitespace(line.charAt(startOfValue)))&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18558)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18559)==0&false))) {{
                    __CLR4_5_2ea7ea7m68iyi69.R.inc(18560);startOfValue++;
                }
                }__CLR4_5_2ea7ea7m68iyi69.R.inc(18561);value = new StringBuilder(line.substring(startOfValue).trim());
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18562);if ((((value.toString().equals(DSCConstants.ATEND.toString()))&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18563)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18564)==0&false))) {{
                    __CLR4_5_2ea7ea7m68iyi69.R.inc(18565);return new DSCAtend(name);
                }
            }}
            }__CLR4_5_2ea7ea7m68iyi69.R.inc(18566);String nextLine;
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18567);while (true) {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18568);this.reader.mark(512);
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18569);nextLine = readLine();
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18570);if ((((nextLine == null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18571)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18572)==0&false))) {{
                    __CLR4_5_2ea7ea7m68iyi69.R.inc(18573);break;
                } }else {__CLR4_5_2ea7ea7m68iyi69.R.inc(18574);if ((((!nextLine.startsWith("%%+"))&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18575)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18576)==0&false))) {{
                    __CLR4_5_2ea7ea7m68iyi69.R.inc(18577);break;
                }
                }}__CLR4_5_2ea7ea7m68iyi69.R.inc(18578);value.append(nextLine.substring(3));
            }
            }__CLR4_5_2ea7ea7m68iyi69.R.inc(18579);this.reader.reset();
        } }else {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18580);name = line.substring(2);
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18581);return parseDSCComment(name, null);
        }
        }__CLR4_5_2ea7ea7m68iyi69.R.inc(18582);return parseDSCComment(name, value.toString());
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    private DSCComment parseDSCComment(String name, String value) {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18583);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18584);DSCComment parsed = DSCCommentFactory.createDSCCommentFor(name);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18585);if ((((parsed != null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18586)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18587)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18588);try {
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18589);parsed.parseValue(value);
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18590);return parsed;
            } catch (Exception e) {
                //ignore and fall back to unparsed DSC comment
            }
        }
        }__CLR4_5_2ea7ea7m68iyi69.R.inc(18591);UnparsedDSCComment unparsed = new UnparsedDSCComment(name);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18592);unparsed.parseValue(value);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18593);return unparsed;
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Starts the parser in push parsing mode sending events to the DSCHandler instance.
     * @param handler the DSCHandler instance to send the events to
     * @throws IOException In case of an I/O error
     * @throws DSCException In case of a violation of the DSC spec
     */
    public void parse(DSCHandler handler) throws IOException, DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18594);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18595);DSCHeaderComment header = DSCTools.checkAndSkipDSC30Header(this);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18596);handler.startDocument("%!" + header.getComment());
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18597);DSCEvent event;
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18598);while ((((hasNext())&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18599)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18600)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18601);event = nextEvent();
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2ea7ea7m68iyi69.R.inc(18602);switch (event.getEventType()) {
            case HEADER_COMMENT:if (!__CLB4_5_2_bool0) {__CLR4_5_2ea7ea7m68iyi69.R.inc(18603);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18604);handler.startDocument("%!" + ((DSCHeaderComment)event).getComment());
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18605);break;
            case DSC_COMMENT:if (!__CLB4_5_2_bool0) {__CLR4_5_2ea7ea7m68iyi69.R.inc(18606);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18607);handler.handleDSCComment(event.asDSCComment());
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18608);break;
            case COMMENT:if (!__CLB4_5_2_bool0) {__CLR4_5_2ea7ea7m68iyi69.R.inc(18609);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18610);handler.comment(((PostScriptComment)event).getComment());
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18611);break;
            case LINE:if (!__CLB4_5_2_bool0) {__CLR4_5_2ea7ea7m68iyi69.R.inc(18612);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18613);handler.line(getLine());
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18614);break;
            case EOF:if (!__CLB4_5_2_bool0) {__CLR4_5_2ea7ea7m68iyi69.R.inc(18615);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18616);handler.endDocument();
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18617);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ea7ea7m68iyi69.R.inc(18618);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18619);throw new IllegalStateException("Illegal event type: " + event.getEventType());
            }
        }
    }}finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Indicates whether there are additional items.
     * @return true if there are additonal items, false if the end of the file has been reached
     */
    public boolean hasNext() {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18620);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18621);return (this.nextEvent != null);
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Steps to the next item indicating the type of event.
     * @return the type of event (See {@link DSCParserConstants})
     * @throws IOException In case of an I/O error
     * @throws DSCException In case of a violation of the DSC spec
     * @throws NoSuchElementException If an attempt was made to advance beyond the end of the file
     */
    public int next() throws IOException, DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18622);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18623);if ((((hasNext())&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18624)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18625)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18626);this.currentEvent = nextEvent;
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18627);parseNext();

            __CLR4_5_2ea7ea7m68iyi69.R.inc(18628);processListeners();

            __CLR4_5_2ea7ea7m68iyi69.R.inc(18629);return this.currentEvent.getEventType();
        } }else {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18630);throw new NoSuchElementException("There are no more events");
        }
    }}finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    private void processListeners() throws IOException, DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18631);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18632);if ((((isListenersDisabled())&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18633)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18634)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18635);return;
        }
        }__CLR4_5_2ea7ea7m68iyi69.R.inc(18636);if ((((this.filterListener != null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18637)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18638)==0&false))) {{
            //Filter always comes first
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18639);this.filterListener.processEvent(this.currentEvent, this);
        }
        }__CLR4_5_2ea7ea7m68iyi69.R.inc(18640);if ((((this.listeners != null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18641)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18642)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18643);for (Object listener : this.listeners) {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18644);((DSCListener) listener).processEvent(this.currentEvent, this);
            }
        }}
    }}finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Steps to the next item returning the new event.
     * @return the new event
     * @throws IOException In case of an I/O error
     * @throws DSCException In case of a violation of the DSC spec
     */
    public DSCEvent nextEvent() throws IOException, DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18645);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18646);next();
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18647);return getCurrentEvent();
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Returns the current event.
     * @return the current event
     */
    public DSCEvent getCurrentEvent() {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18648);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18649);return this.currentEvent;
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Returns the next event without moving the cursor to the next event.
     * @return the next event
     */
    public DSCEvent peek() {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18650);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18651);return this.nextEvent;
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Parses the next event.
     * @throws IOException In case of an I/O error
     * @throws DSCException In case of a violation of the DSC spec
     */
    protected void parseNext() throws IOException, DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18652);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18653);String line = readLine();
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18654);if ((((line != null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18655)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18656)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18657);if ((((isCheckEOF() && eofFound && (line.length() > 0))&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18658)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18659)==0&false))) {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18660);throw new DSCException("Content found after EOF");
            }
            }__CLR4_5_2ea7ea7m68iyi69.R.inc(18661);if ((((line.startsWith("%%"))&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18662)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18663)==0&false))) {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18664);DSCComment comment = parseDSCLine(line);
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18665);if ((((comment.getEventType() == EOF)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18666)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18667)==0&false))) {{
                    __CLR4_5_2ea7ea7m68iyi69.R.inc(18668);this.eofFound = true;
                }
                }__CLR4_5_2ea7ea7m68iyi69.R.inc(18669);this.nextEvent = comment;
            } }else {__CLR4_5_2ea7ea7m68iyi69.R.inc(18670);if ((((line.startsWith("%!"))&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18671)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18672)==0&false))) {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18673);this.nextEvent = new DSCHeaderComment(line.substring(2));
            } }else {__CLR4_5_2ea7ea7m68iyi69.R.inc(18674);if ((((line.startsWith("%"))&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18675)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18676)==0&false))) {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18677);this.nextEvent = new PostScriptComment(line.substring(1));
            } }else {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18678);this.nextEvent = new PostScriptLine(line);
            }
        }}}} }else {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18679);this.nextEvent = null;
        }
    }}finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Returns the current PostScript line.
     * @return the current PostScript line
     * @throws IllegalStateException if the current event is not a normal PostScript line
     */
    public String getLine() {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18680);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18681);if ((((this.currentEvent.getEventType() == LINE)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18682)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18683)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18684);return ((PostScriptLine)this.currentEvent).getLine();
        } }else {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18685);throw new IllegalStateException("Current event is not a PostScript line");
        }
    }}finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Advances to the next DSC comment with the given name.
     * @param name the name of the DSC comment
     * @return the requested DSC comment or null if the end of the file is reached
     * @throws IOException In case of an I/O error
     * @throws DSCException In case of a violation of the DSC spec
     */
    public DSCComment nextDSCComment(String name)
                throws IOException, DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18686);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18687);return nextDSCComment(name, null);
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Advances to the next DSC comment with the given name.
     * @param name the name of the DSC comment
     * @param gen PSGenerator to pass the skipped events though to
     * @return the requested DSC comment or null if the end of the file is reached
     * @throws IOException In case of an I/O error
     * @throws DSCException In case of a violation of the DSC spec
     */
    public DSCComment nextDSCComment(String name, PSGenerator gen)
                throws IOException, DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18688);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18689);while ((((hasNext())&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18690)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18691)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18692);DSCEvent event = nextEvent();
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18693);if ((((event.isDSCComment())&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18694)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18695)==0&false))) {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18696);DSCComment comment = event.asDSCComment();
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18697);if ((((name.equals(comment.getName()))&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18698)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18699)==0&false))) {{
                    __CLR4_5_2ea7ea7m68iyi69.R.inc(18700);return comment;
                }
            }}
            }__CLR4_5_2ea7ea7m68iyi69.R.inc(18701);if ((((gen != null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18702)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18703)==0&false))) {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18704);event.generate(gen); //Pipe through to PSGenerator
            }
        }}
        }__CLR4_5_2ea7ea7m68iyi69.R.inc(18705);return null;
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Advances to the next PostScript comment with the given prefix. This is used to find
     * comments following the DSC extension mechanism.
     * <p>
     * Example: To find FOP's custom comments, pass in "FOP" as a prefix. This will find comments
     * like "%FOPFontSetup".
     * @param prefix the prefix of the extension comment
     * @param gen PSGenerator to pass the skipped events though to
     * @return the requested PostScript comment or null if the end of the file is reached
     * @throws IOException In case of an I/O error
     * @throws DSCException In case of a violation of the DSC spec
     */
    public PostScriptComment nextPSComment(String prefix, PSGenerator gen)
                    throws IOException, DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18706);
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18707);while ((((hasNext())&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18708)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18709)==0&false))) {{
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18710);DSCEvent event = nextEvent();
                __CLR4_5_2ea7ea7m68iyi69.R.inc(18711);if ((((event.isComment())&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18712)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18713)==0&false))) {{
                    __CLR4_5_2ea7ea7m68iyi69.R.inc(18714);PostScriptComment comment = (PostScriptComment)event;
                    __CLR4_5_2ea7ea7m68iyi69.R.inc(18715);if ((((comment.getComment().startsWith(prefix))&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18716)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18717)==0&false))) {{
                        __CLR4_5_2ea7ea7m68iyi69.R.inc(18718);return comment;
                    }
                }}
                }__CLR4_5_2ea7ea7m68iyi69.R.inc(18719);if ((((gen != null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18720)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18721)==0&false))) {{
                    __CLR4_5_2ea7ea7m68iyi69.R.inc(18722);event.generate(gen); //Pipe through to PSGenerator
                }
            }}
            }__CLR4_5_2ea7ea7m68iyi69.R.inc(18723);return null;
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Sets a filter for DSC events.
     * @param filter the filter to use or null to disable filtering
     */
    public void setFilter(DSCFilter filter) {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18724);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18725);if ((((filter != null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18726)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18727)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18728);this.filterListener = new FilteringEventListener(filter);
        } }else {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18729);this.filterListener = null;
        }
    }}finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Adds a DSC event listener.
     * @param listener the listener
     */
    public void addListener(DSCListener listener) {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18730);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18731);if ((((listener == null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18732)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18733)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18734);throw new NullPointerException("listener must not be null");
        }
        }__CLR4_5_2ea7ea7m68iyi69.R.inc(18735);if ((((this.listeners == null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18736)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18737)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18738);this.listeners = new java.util.ArrayList();
        }
        }__CLR4_5_2ea7ea7m68iyi69.R.inc(18739);this.listeners.add(listener);
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Removes a DSC event listener.
     * @param listener the listener to remove
     */
    public void removeListener(DSCListener listener) {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18740);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18741);if ((((this.listeners != null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18742)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18743)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18744);this.listeners.remove(listener);
        }
    }}finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Allows to disable all listeners. This can be used to disable any filtering, for example in
     * nested documents.
     * @param value true to disable all listeners, false to re-enable them
     */
    public void setListenersDisabled(boolean value) {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18745);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18746);this.listenersDisabled = value;
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Indicates whether the listeners are currently disabled.
     * @return true if they are disabled
     */
    public boolean isListenersDisabled() {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18747);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18748);return this.listenersDisabled;
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Sets a NestedDocumentHandler which is used to skip nested documents like embedded EPS files.
     * You can also process those parts in a special way.
     * <p>
     * It is suggested to use the more generally usable {@link #addListener(DSCListener)} and
     * {@link #removeListener(DSCListener)} instead. NestedDocumentHandler is internally
     * mapped onto a {@link DSCListener}.
     * @param handler the NestedDocumentHandler instance or null to disable the feature
     */
    public void setNestedDocumentHandler(final NestedDocumentHandler handler) {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18749);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18750);if ((((handler == null)&&(__CLR4_5_2ea7ea7m68iyi69.R.iget(18751)!=0|true))||(__CLR4_5_2ea7ea7m68iyi69.R.iget(18752)==0&false))) {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18753);removeListener(this.nestedDocumentHandler);
        } }else {{
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18754);MyDSCListener l = new MyDSCListener();
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18755);l.handler = handler;
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18756);addListener(l);
        }
    }}finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    static class MyDSCListener implements DSCListener {
        private NestedDocumentHandler handler;
        public void processEvent(DSCEvent event, DSCParser parser) throws IOException,
                DSCException {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18757);
            __CLR4_5_2ea7ea7m68iyi69.R.inc(18758);handler.handle(event, parser);
        }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}
    }

    /**
     * Tells the parser whether to check for content after the EOF comment.
     * This can be disabled to skip nested documents.
     * @param value true if the check is enabled
     */
    public void setCheckEOF(boolean value) {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18759);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18760);this.checkEOF = value;
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

    /**
     * Indicates whether the parser is configured to check for content after the EOF comment.
     * @return true if the check is enabled.
     */
    public boolean isCheckEOF() {try{__CLR4_5_2ea7ea7m68iyi69.R.inc(18761);
        __CLR4_5_2ea7ea7m68iyi69.R.inc(18762);return this.checkEOF;
    }finally{__CLR4_5_2ea7ea7m68iyi69.R.flushNeeded();}}

}
