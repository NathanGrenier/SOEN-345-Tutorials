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

/* $Id: ImageIODebugUtil.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.util;

import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Node;

/**
 * Helper class for debugging stuff in Image I/O.
 *
 * @version $Id: ImageIODebugUtil.java 1732018 2016-02-24 04:51:06Z gadams $
 */
public final class ImageIODebugUtil {public static class __CLR4_5_2fghfghm68iyicb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,20053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ImageIODebugUtil() {try{__CLR4_5_2fghfghm68iyicb.R.inc(20033);
    }finally{__CLR4_5_2fghfghm68iyicb.R.flushNeeded();}}

    public static void dumpMetadata(IIOMetadata meta, boolean nativeFormat) {try{__CLR4_5_2fghfghm68iyicb.R.inc(20034);
        __CLR4_5_2fghfghm68iyicb.R.inc(20035);String format;
        __CLR4_5_2fghfghm68iyicb.R.inc(20036);if ((((nativeFormat)&&(__CLR4_5_2fghfghm68iyicb.R.iget(20037)!=0|true))||(__CLR4_5_2fghfghm68iyicb.R.iget(20038)==0&false))) {{
            __CLR4_5_2fghfghm68iyicb.R.inc(20039);format = meta.getNativeMetadataFormatName();
        } }else {{
            __CLR4_5_2fghfghm68iyicb.R.inc(20040);format = IIOMetadataFormatImpl.standardMetadataFormatName;
        }
        }__CLR4_5_2fghfghm68iyicb.R.inc(20041);Node node = meta.getAsTree(format);
        __CLR4_5_2fghfghm68iyicb.R.inc(20042);dumpNode(node);
    }finally{__CLR4_5_2fghfghm68iyicb.R.flushNeeded();}}

    public static void dumpNode(Node node) {try{__CLR4_5_2fghfghm68iyicb.R.inc(20043);
        __CLR4_5_2fghfghm68iyicb.R.inc(20044);try {
            __CLR4_5_2fghfghm68iyicb.R.inc(20045);TransformerFactory tf = TransformerFactory.newInstance();
            __CLR4_5_2fghfghm68iyicb.R.inc(20046);Transformer t = tf.newTransformer();
            __CLR4_5_2fghfghm68iyicb.R.inc(20047);t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            __CLR4_5_2fghfghm68iyicb.R.inc(20048);Source src = new DOMSource(node);
            __CLR4_5_2fghfghm68iyicb.R.inc(20049);Result res = new StreamResult(System.out);
            __CLR4_5_2fghfghm68iyicb.R.inc(20050);t.transform(src, res);
        } catch (TransformerConfigurationException e) {
            __CLR4_5_2fghfghm68iyicb.R.inc(20051);e.printStackTrace();
        } catch (TransformerException e) {
            __CLR4_5_2fghfghm68iyicb.R.inc(20052);e.printStackTrace();
        }
    }finally{__CLR4_5_2fghfghm68iyicb.R.flushNeeded();}}

}
