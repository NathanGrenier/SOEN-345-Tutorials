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

/* $Id: DefaultEdgeDirectory.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.util.dijkstra;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/**
 * Default implementation of an edge directory for the {@link DijkstraAlgorithm}.
 */
public class DefaultEdgeDirectory implements EdgeDirectory {public static class __CLR4_5_2fnyfnym6lb50zx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,20357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The directory of edges */
    private Map edges = new java.util.HashMap();
    //Map<Vertex,Map<Vertex,Edge>>

    /**
     * Adds a new edge between two vertices.
     * @param edge the new edge
     */
    public void addEdge(Edge edge) {try{__CLR4_5_2fnyfnym6lb50zx.R.inc(20302);
        __CLR4_5_2fnyfnym6lb50zx.R.inc(20303);Map directEdges = (Map)edges.get(edge.getStart());
        __CLR4_5_2fnyfnym6lb50zx.R.inc(20304);if ((((directEdges == null)&&(__CLR4_5_2fnyfnym6lb50zx.R.iget(20305)!=0|true))||(__CLR4_5_2fnyfnym6lb50zx.R.iget(20306)==0&false))) {{
            __CLR4_5_2fnyfnym6lb50zx.R.inc(20307);directEdges = new java.util.HashMap();
            __CLR4_5_2fnyfnym6lb50zx.R.inc(20308);edges.put(edge.getStart(), directEdges);
        }
        }__CLR4_5_2fnyfnym6lb50zx.R.inc(20309);directEdges.put(edge.getEnd(), edge);
    }finally{__CLR4_5_2fnyfnym6lb50zx.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getPenalty(Vertex start, Vertex end) {try{__CLR4_5_2fnyfnym6lb50zx.R.inc(20310);
        __CLR4_5_2fnyfnym6lb50zx.R.inc(20311);Map edgeMap = (Map)edges.get(start);
        __CLR4_5_2fnyfnym6lb50zx.R.inc(20312);if ((((edgeMap != null)&&(__CLR4_5_2fnyfnym6lb50zx.R.iget(20313)!=0|true))||(__CLR4_5_2fnyfnym6lb50zx.R.iget(20314)==0&false))) {{
            __CLR4_5_2fnyfnym6lb50zx.R.inc(20315);Edge route = (Edge)edgeMap.get(end);
            __CLR4_5_2fnyfnym6lb50zx.R.inc(20316);if ((((route != null)&&(__CLR4_5_2fnyfnym6lb50zx.R.iget(20317)!=0|true))||(__CLR4_5_2fnyfnym6lb50zx.R.iget(20318)==0&false))) {{
                __CLR4_5_2fnyfnym6lb50zx.R.inc(20319);int penalty = route.getPenalty();
                __CLR4_5_2fnyfnym6lb50zx.R.inc(20320);if ((((penalty < 0)&&(__CLR4_5_2fnyfnym6lb50zx.R.iget(20321)!=0|true))||(__CLR4_5_2fnyfnym6lb50zx.R.iget(20322)==0&false))) {{
                    __CLR4_5_2fnyfnym6lb50zx.R.inc(20323);throw new IllegalStateException("Penalty must not be negative");
                }
                }__CLR4_5_2fnyfnym6lb50zx.R.inc(20324);return penalty;
            }
        }}
        }__CLR4_5_2fnyfnym6lb50zx.R.inc(20325);return 0;
    }finally{__CLR4_5_2fnyfnym6lb50zx.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Iterator getDestinations(Vertex origin) {try{__CLR4_5_2fnyfnym6lb50zx.R.inc(20326);
        __CLR4_5_2fnyfnym6lb50zx.R.inc(20327);Map directRoutes = (Map)edges.get(origin);
        __CLR4_5_2fnyfnym6lb50zx.R.inc(20328);if ((((directRoutes != null)&&(__CLR4_5_2fnyfnym6lb50zx.R.iget(20329)!=0|true))||(__CLR4_5_2fnyfnym6lb50zx.R.iget(20330)==0&false))) {{
            __CLR4_5_2fnyfnym6lb50zx.R.inc(20331);Iterator iter = directRoutes.keySet().iterator();
            __CLR4_5_2fnyfnym6lb50zx.R.inc(20332);return iter;
        }
        }__CLR4_5_2fnyfnym6lb50zx.R.inc(20333);return Collections.EMPTY_LIST.iterator();
    }finally{__CLR4_5_2fnyfnym6lb50zx.R.flushNeeded();}}

    /**
     * Returns an iterator over all edges with the given origin.
     * @param origin the origin
     * @return an iterator over Edge instances
     */
    public Iterator getEdges(Vertex origin) {try{__CLR4_5_2fnyfnym6lb50zx.R.inc(20334);
        __CLR4_5_2fnyfnym6lb50zx.R.inc(20335);Map directRoutes = (Map)edges.get(origin);
        __CLR4_5_2fnyfnym6lb50zx.R.inc(20336);if ((((directRoutes != null)&&(__CLR4_5_2fnyfnym6lb50zx.R.iget(20337)!=0|true))||(__CLR4_5_2fnyfnym6lb50zx.R.iget(20338)==0&false))) {{
            __CLR4_5_2fnyfnym6lb50zx.R.inc(20339);Iterator iter = directRoutes.values().iterator();
            __CLR4_5_2fnyfnym6lb50zx.R.inc(20340);return iter;
        }
        }__CLR4_5_2fnyfnym6lb50zx.R.inc(20341);return Collections.EMPTY_LIST.iterator();
    }finally{__CLR4_5_2fnyfnym6lb50zx.R.flushNeeded();}}

    /**
     * Returns the best edge (the edge with the lowest penalty) between two given vertices.
     * @param start the start vertex
     * @param end the end vertex
     * @return the best vertex or null if none is found
     */
    public Edge getBestEdge(Vertex start, Vertex end) {try{__CLR4_5_2fnyfnym6lb50zx.R.inc(20342);
        __CLR4_5_2fnyfnym6lb50zx.R.inc(20343);Edge best = null;
        __CLR4_5_2fnyfnym6lb50zx.R.inc(20344);Iterator iter = getEdges(start);
        __CLR4_5_2fnyfnym6lb50zx.R.inc(20345);while ((((iter.hasNext())&&(__CLR4_5_2fnyfnym6lb50zx.R.iget(20346)!=0|true))||(__CLR4_5_2fnyfnym6lb50zx.R.iget(20347)==0&false))) {{
            __CLR4_5_2fnyfnym6lb50zx.R.inc(20348);Edge edge = (Edge)iter.next();
            __CLR4_5_2fnyfnym6lb50zx.R.inc(20349);if ((((edge.getEnd().equals(end))&&(__CLR4_5_2fnyfnym6lb50zx.R.iget(20350)!=0|true))||(__CLR4_5_2fnyfnym6lb50zx.R.iget(20351)==0&false))) {{
                __CLR4_5_2fnyfnym6lb50zx.R.inc(20352);if ((((best == null || edge.getPenalty() < best.getPenalty())&&(__CLR4_5_2fnyfnym6lb50zx.R.iget(20353)!=0|true))||(__CLR4_5_2fnyfnym6lb50zx.R.iget(20354)==0&false))) {{
                    __CLR4_5_2fnyfnym6lb50zx.R.inc(20355);best = edge;
                }
            }}
        }}
        }__CLR4_5_2fnyfnym6lb50zx.R.inc(20356);return best;
    }finally{__CLR4_5_2fnyfnym6lb50zx.R.flushNeeded();}}


}
