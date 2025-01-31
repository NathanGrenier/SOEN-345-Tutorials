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

/* $Id: ImageWriterRegistry.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.image.writer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;

import org.apache.xmlgraphics.util.Service;

/**
 * Registry for {@link ImageWriter} implementations.
 */
public final class ImageWriterRegistry {public static class __CLR4_5_2an7an7m6lb50no{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,13880,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static volatile ImageWriterRegistry instance;

    private Map<String, List<ImageWriter>> imageWriterMap
            = new java.util.HashMap<String, List<ImageWriter>>();
    private Map<String, Integer> preferredOrder;

    /**
     * Default constructor. The default preferred order for the image writers is loaded from the
     * resources.
     */
    public ImageWriterRegistry() {try{__CLR4_5_2an7an7m6lb50no.R.inc(13795);
        __CLR4_5_2an7an7m6lb50no.R.inc(13796);Properties props = new Properties();
        __CLR4_5_2an7an7m6lb50no.R.inc(13797);InputStream in = getClass().getResourceAsStream("default-preferred-order.properties");
        __CLR4_5_2an7an7m6lb50no.R.inc(13798);if ((((in != null)&&(__CLR4_5_2an7an7m6lb50no.R.iget(13799)!=0|true))||(__CLR4_5_2an7an7m6lb50no.R.iget(13800)==0&false))) {{
            __CLR4_5_2an7an7m6lb50no.R.inc(13801);try {
                __CLR4_5_2an7an7m6lb50no.R.inc(13802);try {
                    __CLR4_5_2an7an7m6lb50no.R.inc(13803);props.load(in);
                } finally {
                    __CLR4_5_2an7an7m6lb50no.R.inc(13804);in.close();
                }
            } catch (IOException ioe) {
                __CLR4_5_2an7an7m6lb50no.R.inc(13805);throw new RuntimeException(
                        "Could not load default preferred order due to I/O error: "
                            + ioe.getMessage());
            }
        }
        }__CLR4_5_2an7an7m6lb50no.R.inc(13806);setPreferredOrder(props);
        __CLR4_5_2an7an7m6lb50no.R.inc(13807);setup();
    }finally{__CLR4_5_2an7an7m6lb50no.R.flushNeeded();}}

    /**
     * Special constructor. The preferred order for the image writers can be specified as a
     * Map (for example a Properties file). The entries of the Map consists of fully qualified
     * class or package names as keys and integer numbers as values. Zero (0) is the default
     * priority.
     * @param preferredOrder the map of order properties used to order the plug-ins
     */
    public ImageWriterRegistry(Properties preferredOrder) {try{__CLR4_5_2an7an7m6lb50no.R.inc(13808);
        __CLR4_5_2an7an7m6lb50no.R.inc(13809);setPreferredOrder(preferredOrder);
        __CLR4_5_2an7an7m6lb50no.R.inc(13810);setup();
    }finally{__CLR4_5_2an7an7m6lb50no.R.flushNeeded();}}

    private void setPreferredOrder(Properties preferredOrder) {try{__CLR4_5_2an7an7m6lb50no.R.inc(13811);
        __CLR4_5_2an7an7m6lb50no.R.inc(13812);Map<String, Integer> order = new java.util.HashMap<String, Integer>();
        __CLR4_5_2an7an7m6lb50no.R.inc(13813);for (Map.Entry<Object, Object> entry : preferredOrder.entrySet()) {{
            __CLR4_5_2an7an7m6lb50no.R.inc(13814);order.put(entry.getKey().toString(),
                    Integer.parseInt(entry.getValue().toString()));
        }
        }__CLR4_5_2an7an7m6lb50no.R.inc(13815);this.preferredOrder = order;
    }finally{__CLR4_5_2an7an7m6lb50no.R.flushNeeded();}}

    /** @return a singleton instance of the ImageWriterRegistry. */
    public static ImageWriterRegistry getInstance() {try{__CLR4_5_2an7an7m6lb50no.R.inc(13816);
        __CLR4_5_2an7an7m6lb50no.R.inc(13817);if ((((instance == null)&&(__CLR4_5_2an7an7m6lb50no.R.iget(13818)!=0|true))||(__CLR4_5_2an7an7m6lb50no.R.iget(13819)==0&false))) {{
            __CLR4_5_2an7an7m6lb50no.R.inc(13820);instance = new ImageWriterRegistry();
        }
        }__CLR4_5_2an7an7m6lb50no.R.inc(13821);return instance;
    }finally{__CLR4_5_2an7an7m6lb50no.R.flushNeeded();}}

    private void setup() {try{__CLR4_5_2an7an7m6lb50no.R.inc(13822);
        __CLR4_5_2an7an7m6lb50no.R.inc(13823);Iterator iter = Service.providers(ImageWriter.class);
        __CLR4_5_2an7an7m6lb50no.R.inc(13824);while ((((iter.hasNext())&&(__CLR4_5_2an7an7m6lb50no.R.iget(13825)!=0|true))||(__CLR4_5_2an7an7m6lb50no.R.iget(13826)==0&false))) {{
            __CLR4_5_2an7an7m6lb50no.R.inc(13827);ImageWriter writer = (ImageWriter)iter.next();
            __CLR4_5_2an7an7m6lb50no.R.inc(13828);register(writer);
        }
    }}finally{__CLR4_5_2an7an7m6lb50no.R.flushNeeded();}}

    private int getPriority(ImageWriter writer) {try{__CLR4_5_2an7an7m6lb50no.R.inc(13829);
        __CLR4_5_2an7an7m6lb50no.R.inc(13830);String key = writer.getClass().getName();
        __CLR4_5_2an7an7m6lb50no.R.inc(13831);Integer value = preferredOrder.get(key);
        __CLR4_5_2an7an7m6lb50no.R.inc(13832);while ((((value == null)&&(__CLR4_5_2an7an7m6lb50no.R.iget(13833)!=0|true))||(__CLR4_5_2an7an7m6lb50no.R.iget(13834)==0&false))) {{
            __CLR4_5_2an7an7m6lb50no.R.inc(13835);int pos = key.lastIndexOf(".");
            __CLR4_5_2an7an7m6lb50no.R.inc(13836);if ((((pos < 0)&&(__CLR4_5_2an7an7m6lb50no.R.iget(13837)!=0|true))||(__CLR4_5_2an7an7m6lb50no.R.iget(13838)==0&false))) {{
                __CLR4_5_2an7an7m6lb50no.R.inc(13839);break;
            }
            }__CLR4_5_2an7an7m6lb50no.R.inc(13840);key = key.substring(0, pos);
            __CLR4_5_2an7an7m6lb50no.R.inc(13841);value = preferredOrder.get(key);
        }
        }__CLR4_5_2an7an7m6lb50no.R.inc(13842);return ((((value != null) )&&(__CLR4_5_2an7an7m6lb50no.R.iget(13843)!=0|true))||(__CLR4_5_2an7an7m6lb50no.R.iget(13844)==0&false))? value : 0;
    }finally{__CLR4_5_2an7an7m6lb50no.R.flushNeeded();}}

    /**
     * Registers a new ImageWriter implementation with the associated priority in the registry.
     * Higher priorities get preference over lower priorities.
     * @param writer the ImageWriter instance to register.
     * @param priority the priority of the writer in the registry.
     * @see #register(ImageWriter)
     */
    public void register(ImageWriter writer, int priority) {try{__CLR4_5_2an7an7m6lb50no.R.inc(13845);

        __CLR4_5_2an7an7m6lb50no.R.inc(13846);String key = writer.getClass().getName();
        // Register the priority to preferredOrder; overwrite original priority if exists
        __CLR4_5_2an7an7m6lb50no.R.inc(13847);preferredOrder.put(key, priority);

        __CLR4_5_2an7an7m6lb50no.R.inc(13848);register(writer);
    }finally{__CLR4_5_2an7an7m6lb50no.R.flushNeeded();}}

    /**
     * Registers a new ImageWriter implementation in the registry. If an ImageWriter for the same
     * target MIME type has already been registered, it is placed in an array based on priority.
     * @param writer the ImageWriter instance to register.
     */
    public synchronized void register(ImageWriter writer) {try{__CLR4_5_2an7an7m6lb50no.R.inc(13849);
        __CLR4_5_2an7an7m6lb50no.R.inc(13850);List<ImageWriter> entries = imageWriterMap.get(writer.getMIMEType());
        __CLR4_5_2an7an7m6lb50no.R.inc(13851);if ((((entries == null)&&(__CLR4_5_2an7an7m6lb50no.R.iget(13852)!=0|true))||(__CLR4_5_2an7an7m6lb50no.R.iget(13853)==0&false))) {{
            __CLR4_5_2an7an7m6lb50no.R.inc(13854);entries = new java.util.ArrayList<ImageWriter>();
            __CLR4_5_2an7an7m6lb50no.R.inc(13855);imageWriterMap.put(writer.getMIMEType(), entries);
        }

        }__CLR4_5_2an7an7m6lb50no.R.inc(13856);int priority = getPriority(writer);
        __CLR4_5_2an7an7m6lb50no.R.inc(13857);ListIterator<ImageWriter> li = entries.listIterator();
        __CLR4_5_2an7an7m6lb50no.R.inc(13858);while ((((li.hasNext())&&(__CLR4_5_2an7an7m6lb50no.R.iget(13859)!=0|true))||(__CLR4_5_2an7an7m6lb50no.R.iget(13860)==0&false))) {{
            __CLR4_5_2an7an7m6lb50no.R.inc(13861);ImageWriter w = li.next();
            __CLR4_5_2an7an7m6lb50no.R.inc(13862);if ((((getPriority(w) < priority)&&(__CLR4_5_2an7an7m6lb50no.R.iget(13863)!=0|true))||(__CLR4_5_2an7an7m6lb50no.R.iget(13864)==0&false))) {{
                __CLR4_5_2an7an7m6lb50no.R.inc(13865);li.previous();
                __CLR4_5_2an7an7m6lb50no.R.inc(13866);break;
            }
        }}
        }__CLR4_5_2an7an7m6lb50no.R.inc(13867);li.add(writer);
    }finally{__CLR4_5_2an7an7m6lb50no.R.flushNeeded();}}

    /**
     * Returns an ImageWriter that can be used to encode an image to the requested MIME type.
     * @param mime the MIME type of the desired output format
     * @return a functional ImageWriter instance handling the desired output format or
     *         null if none can be found.
     */
    public synchronized ImageWriter getWriterFor(String mime) {try{__CLR4_5_2an7an7m6lb50no.R.inc(13868);
        __CLR4_5_2an7an7m6lb50no.R.inc(13869);List<ImageWriter> entries = imageWriterMap.get(mime);
        __CLR4_5_2an7an7m6lb50no.R.inc(13870);if ((((entries == null)&&(__CLR4_5_2an7an7m6lb50no.R.iget(13871)!=0|true))||(__CLR4_5_2an7an7m6lb50no.R.iget(13872)==0&false))) {{
            __CLR4_5_2an7an7m6lb50no.R.inc(13873);return null;
        }
        }__CLR4_5_2an7an7m6lb50no.R.inc(13874);for (ImageWriter writer : entries) {{
            __CLR4_5_2an7an7m6lb50no.R.inc(13875);if ((((writer.isFunctional())&&(__CLR4_5_2an7an7m6lb50no.R.iget(13876)!=0|true))||(__CLR4_5_2an7an7m6lb50no.R.iget(13877)==0&false))) {{
                __CLR4_5_2an7an7m6lb50no.R.inc(13878);return writer;
            }
        }}
        }__CLR4_5_2an7an7m6lb50no.R.inc(13879);return null;
    }finally{__CLR4_5_2an7an7m6lb50no.R.flushNeeded();}}

}
