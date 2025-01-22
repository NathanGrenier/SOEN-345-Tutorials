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

/* $Id: XMPPacketParser.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.xmp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;

/**
 * This class is a parser for XMP packets. By default, it tries to locate the first XMP packet
 * it finds and parses it.
 * <p>
 * Important: Before you use this class to look for an XMP packet in some random file, please read
 * the chapter on "Scanning Files for XMP Packets" in the XMP specification!
 */
public final class XMPPacketParser {public static class __CLR4_5_2gprgprm68iyijz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,21722,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private XMPPacketParser() {try{__CLR4_5_2gprgprm68iyijz.R.inc(21663);
    }finally{__CLR4_5_2gprgprm68iyijz.R.flushNeeded();}}

    private static final byte[] PACKET_HEADER;
    private static final byte[] PACKET_HEADER_END;
    private static final byte[] PACKET_TRAILER;

    static {try{__CLR4_5_2gprgprm68iyijz.R.inc(21664);
        __CLR4_5_2gprgprm68iyijz.R.inc(21665);try {
            __CLR4_5_2gprgprm68iyijz.R.inc(21666);PACKET_HEADER = "<?xpacket begin=".getBytes("US-ASCII");
            __CLR4_5_2gprgprm68iyijz.R.inc(21667);PACKET_HEADER_END = "?>".getBytes("US-ASCII");
            __CLR4_5_2gprgprm68iyijz.R.inc(21668);PACKET_TRAILER = "<?xpacket".getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            __CLR4_5_2gprgprm68iyijz.R.inc(21669);throw new RuntimeException("Incompatible JVM! US-ASCII encoding not supported.");
        }
    }finally{__CLR4_5_2gprgprm68iyijz.R.flushNeeded();}}

    /**
     * Locates an XMP packet in a stream, parses it and returns the XMP metadata. If no
     * XMP packet is found until the stream ends, null is returned. Note: This method
     * only finds the first XMP packet in a stream. And it cannot determine whether it
     * has found the right XMP packet if there are multiple packets.
     * @param in the InputStream to search
     * @return the parsed XMP metadata or null if no XMP packet is found
     * @throws IOException if an I/O error occurs
     * @throws TransformerException if an error occurs while parsing the XMP packet
     */
    public static Metadata parse(InputStream in) throws IOException, TransformerException {try{__CLR4_5_2gprgprm68iyijz.R.inc(21670);
        __CLR4_5_2gprgprm68iyijz.R.inc(21671);if ((((!in.markSupported())&&(__CLR4_5_2gprgprm68iyijz.R.iget(21672)!=0|true))||(__CLR4_5_2gprgprm68iyijz.R.iget(21673)==0&false))) {{
            __CLR4_5_2gprgprm68iyijz.R.inc(21674);in = new java.io.BufferedInputStream(in);
        }
        }__CLR4_5_2gprgprm68iyijz.R.inc(21675);boolean foundXMP = skipAfter(in, PACKET_HEADER);
        __CLR4_5_2gprgprm68iyijz.R.inc(21676);if ((((!foundXMP)&&(__CLR4_5_2gprgprm68iyijz.R.iget(21677)!=0|true))||(__CLR4_5_2gprgprm68iyijz.R.iget(21678)==0&false))) {{
            __CLR4_5_2gprgprm68iyijz.R.inc(21679);return null;
        }
        //TODO Inspect "begin" attribute!
        }__CLR4_5_2gprgprm68iyijz.R.inc(21680);if ((((!skipAfter(in, PACKET_HEADER_END))&&(__CLR4_5_2gprgprm68iyijz.R.iget(21681)!=0|true))||(__CLR4_5_2gprgprm68iyijz.R.iget(21682)==0&false))) {{
            __CLR4_5_2gprgprm68iyijz.R.inc(21683);throw new IOException("Invalid XMP packet header!");
        }
        }__CLR4_5_2gprgprm68iyijz.R.inc(21684);ByteArrayOutputStream baout = null;
        __CLR4_5_2gprgprm68iyijz.R.inc(21685);Metadata metadata;
        __CLR4_5_2gprgprm68iyijz.R.inc(21686);try {
            //TODO think about not buffering this but for example, parse in another thread
            //ex. using PipedInput/OutputStream
            __CLR4_5_2gprgprm68iyijz.R.inc(21687);baout = new ByteArrayOutputStream();
            //TODO Do with TeeInputStream when Commons IO 1.4 is available
            __CLR4_5_2gprgprm68iyijz.R.inc(21688);if ((((!skipAfter(in, PACKET_TRAILER, baout))&&(__CLR4_5_2gprgprm68iyijz.R.iget(21689)!=0|true))||(__CLR4_5_2gprgprm68iyijz.R.iget(21690)==0&false))) {{
                __CLR4_5_2gprgprm68iyijz.R.inc(21691);throw new IOException("XMP packet not properly terminated!");
            }
            }__CLR4_5_2gprgprm68iyijz.R.inc(21692);metadata = XMPParser.parseXMP(
                new StreamSource(new ByteArrayInputStream(baout.toByteArray())));
        } finally {
            __CLR4_5_2gprgprm68iyijz.R.inc(21693);IOUtils.closeQuietly(baout);
        }
        __CLR4_5_2gprgprm68iyijz.R.inc(21694);return metadata;
    }finally{__CLR4_5_2gprgprm68iyijz.R.flushNeeded();}}

    private static boolean skipAfter(InputStream in, byte[] match) throws IOException {try{__CLR4_5_2gprgprm68iyijz.R.inc(21695);
        __CLR4_5_2gprgprm68iyijz.R.inc(21696);return skipAfter(in, match, null);
    }finally{__CLR4_5_2gprgprm68iyijz.R.flushNeeded();}}

    private static boolean skipAfter(InputStream in, byte[] match, OutputStream out)
            throws IOException {try{__CLR4_5_2gprgprm68iyijz.R.inc(21697);
        __CLR4_5_2gprgprm68iyijz.R.inc(21698);int found = 0;
        __CLR4_5_2gprgprm68iyijz.R.inc(21699);int len = match.length;
        __CLR4_5_2gprgprm68iyijz.R.inc(21700);int b;
        __CLR4_5_2gprgprm68iyijz.R.inc(21701);while ((b = in.read()) >= 0) {{
            __CLR4_5_2gprgprm68iyijz.R.inc(21704);if ((((b == match[found])&&(__CLR4_5_2gprgprm68iyijz.R.iget(21705)!=0|true))||(__CLR4_5_2gprgprm68iyijz.R.iget(21706)==0&false))) {{
                __CLR4_5_2gprgprm68iyijz.R.inc(21707);found++;
                __CLR4_5_2gprgprm68iyijz.R.inc(21708);if ((((found == len)&&(__CLR4_5_2gprgprm68iyijz.R.iget(21709)!=0|true))||(__CLR4_5_2gprgprm68iyijz.R.iget(21710)==0&false))) {{
                    __CLR4_5_2gprgprm68iyijz.R.inc(21711);return true;
                }
            }} }else {{
                __CLR4_5_2gprgprm68iyijz.R.inc(21712);if ((((out != null)&&(__CLR4_5_2gprgprm68iyijz.R.iget(21713)!=0|true))||(__CLR4_5_2gprgprm68iyijz.R.iget(21714)==0&false))) {{
                    __CLR4_5_2gprgprm68iyijz.R.inc(21715);if ((((found > 0)&&(__CLR4_5_2gprgprm68iyijz.R.iget(21716)!=0|true))||(__CLR4_5_2gprgprm68iyijz.R.iget(21717)==0&false))) {{
                        __CLR4_5_2gprgprm68iyijz.R.inc(21718);out.write(match, 0, found);
                    }
                    }__CLR4_5_2gprgprm68iyijz.R.inc(21719);out.write(b);
                }
                }__CLR4_5_2gprgprm68iyijz.R.inc(21720);found = 0;
            }
        }}
        }__CLR4_5_2gprgprm68iyijz.R.inc(21721);return false;
    }finally{__CLR4_5_2gprgprm68iyijz.R.flushNeeded();}}

}
