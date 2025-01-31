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

/* $Id: DijkstraAlgorithm.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.util.dijkstra;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * This is an implementation of Dijkstra's algorithm to find the shortest path for a directed
 * graph with non-negative edge weights.
 * @see <a href="http://en.wikipedia.org/wiki/Dijkstra%27s_algorithm">WikiPedia on Dijkstra's
 *      Algorithm</a>
 */
public class DijkstraAlgorithm {public static class __CLR4_5_2fphfphm6lb510n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,20431,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Infinity value for distances. */
    public static final int INFINITE = Integer.MAX_VALUE;

    /** Compares penalties between two possible destinations. */
    private final Comparator penaltyComparator = new Comparator() {
        public int compare(Object left, Object right) {try{__CLR4_5_2fphfphm6lb510n.R.inc(20357);
            __CLR4_5_2fphfphm6lb510n.R.inc(20358);int leftPenalty = getLowestPenalty((Vertex)left);
            __CLR4_5_2fphfphm6lb510n.R.inc(20359);int rightPenalty = getLowestPenalty((Vertex)right);
            __CLR4_5_2fphfphm6lb510n.R.inc(20360);if ((((leftPenalty < rightPenalty)&&(__CLR4_5_2fphfphm6lb510n.R.iget(20361)!=0|true))||(__CLR4_5_2fphfphm6lb510n.R.iget(20362)==0&false))) {{
                __CLR4_5_2fphfphm6lb510n.R.inc(20363);return -1;
            } }else {__CLR4_5_2fphfphm6lb510n.R.inc(20364);if ((((leftPenalty == rightPenalty)&&(__CLR4_5_2fphfphm6lb510n.R.iget(20365)!=0|true))||(__CLR4_5_2fphfphm6lb510n.R.iget(20366)==0&false))) {{
                __CLR4_5_2fphfphm6lb510n.R.inc(20367);return ((Comparable)left).compareTo(right);
            } }else {{
                __CLR4_5_2fphfphm6lb510n.R.inc(20368);return 1;
            }
        }}}finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}
    };

    /** The directory of edges */
    private EdgeDirectory edgeDirectory;

    /** The priority queue for all vertices under inspection, ordered by penalties/distances. */
    private TreeSet priorityQueue = new TreeSet(penaltyComparator);
    //Set<Vertex>

    /** The set of vertices for which the lowest penalty has been found. */
    private Set finishedVertices = new java.util.HashSet();
    //Set<Vertex>

    /** The currently known lowest penalties for all vertices. */
    private Map lowestPenalties = new java.util.HashMap();
    //Map<Vertex,Integer>

    /** Map of all predecessors in the spanning tree of best routes. */
    private Map predecessors = new java.util.HashMap();
    //Map<Vertex,Vertex>

    /**
     * Main Constructor.
     * @param edgeDirectory the edge directory this instance should work on
     */
    public DijkstraAlgorithm(EdgeDirectory edgeDirectory) {try{__CLR4_5_2fphfphm6lb510n.R.inc(20369);
        __CLR4_5_2fphfphm6lb510n.R.inc(20370);this.edgeDirectory = edgeDirectory;
    }finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}

    /**
     * Returns the penalty between two vertices.
     * @param start the start vertex
     * @param end the end vertex
     * @return the penalty between two vertices, or 0 if no single edge between the two vertices
     *                  exists.
     */
    protected int getPenalty(Vertex start, Vertex end) {try{__CLR4_5_2fphfphm6lb510n.R.inc(20371);
        __CLR4_5_2fphfphm6lb510n.R.inc(20372);return this.edgeDirectory.getPenalty(start, end);
    }finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}

    /**
     * Returns an iterator over all valid destinations for a given vertex.
     * @param origin the origin from which to search for destinations
     * @return the iterator over all valid destinations for a given vertex
     */
    protected Iterator getDestinations(Vertex origin) {try{__CLR4_5_2fphfphm6lb510n.R.inc(20373);
        __CLR4_5_2fphfphm6lb510n.R.inc(20374);return this.edgeDirectory.getDestinations(origin);
    }finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}

    private void reset() {try{__CLR4_5_2fphfphm6lb510n.R.inc(20375);
        __CLR4_5_2fphfphm6lb510n.R.inc(20376);finishedVertices.clear();
        __CLR4_5_2fphfphm6lb510n.R.inc(20377);priorityQueue.clear();

        __CLR4_5_2fphfphm6lb510n.R.inc(20378);lowestPenalties.clear();
        __CLR4_5_2fphfphm6lb510n.R.inc(20379);predecessors.clear();
    }finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}

    /**
     * Run Dijkstra's shortest path algorithm. After this method is finished you can use
     * {@link #getPredecessor(Vertex)} to reconstruct the best/shortest path starting from the
     * destination backwards.
     * @param start the starting vertex
     * @param destination the destination vertex.
     */
    public void execute(Vertex start, Vertex destination) {try{__CLR4_5_2fphfphm6lb510n.R.inc(20380);
        __CLR4_5_2fphfphm6lb510n.R.inc(20381);if ((((start == null || destination == null)&&(__CLR4_5_2fphfphm6lb510n.R.iget(20382)!=0|true))||(__CLR4_5_2fphfphm6lb510n.R.iget(20383)==0&false))) {{
            __CLR4_5_2fphfphm6lb510n.R.inc(20384);throw new NullPointerException("start and destination may not be null");
        }

        }__CLR4_5_2fphfphm6lb510n.R.inc(20385);reset();
        __CLR4_5_2fphfphm6lb510n.R.inc(20386);setShortestDistance(start, 0);
        __CLR4_5_2fphfphm6lb510n.R.inc(20387);priorityQueue.add(start);

        // the current node
        __CLR4_5_2fphfphm6lb510n.R.inc(20388);Vertex u;

        // extract the vertex with the shortest distance
        __CLR4_5_2fphfphm6lb510n.R.inc(20389);while ((((priorityQueue.size() > 0)&&(__CLR4_5_2fphfphm6lb510n.R.iget(20390)!=0|true))||(__CLR4_5_2fphfphm6lb510n.R.iget(20391)==0&false))) {{
            __CLR4_5_2fphfphm6lb510n.R.inc(20392);u = (Vertex)priorityQueue.first();
            __CLR4_5_2fphfphm6lb510n.R.inc(20393);priorityQueue.remove(u);

            __CLR4_5_2fphfphm6lb510n.R.inc(20394);if ((((destination.equals(u))&&(__CLR4_5_2fphfphm6lb510n.R.iget(20395)!=0|true))||(__CLR4_5_2fphfphm6lb510n.R.iget(20396)==0&false))) {{
                //Destination reached
                __CLR4_5_2fphfphm6lb510n.R.inc(20397);break;
            }

            }__CLR4_5_2fphfphm6lb510n.R.inc(20398);finishedVertices.add(u);
            __CLR4_5_2fphfphm6lb510n.R.inc(20399);relax(u);
        }
    }}finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}

    /**
     * Compute new lowest penalties for neighboring vertices. Update the lowest penalties and the
     * predecessor map if a better solution is found.
     * @param u the vertex to process
     */
    private void relax(Vertex u) {try{__CLR4_5_2fphfphm6lb510n.R.inc(20400);
        __CLR4_5_2fphfphm6lb510n.R.inc(20401);Iterator iter = getDestinations(u);
        __CLR4_5_2fphfphm6lb510n.R.inc(20402);while ((((iter.hasNext())&&(__CLR4_5_2fphfphm6lb510n.R.iget(20403)!=0|true))||(__CLR4_5_2fphfphm6lb510n.R.iget(20404)==0&false))) {{
            __CLR4_5_2fphfphm6lb510n.R.inc(20405);Vertex v = (Vertex)iter.next();
            // skip node already settled
            __CLR4_5_2fphfphm6lb510n.R.inc(20406);if ((((isFinished(v))&&(__CLR4_5_2fphfphm6lb510n.R.iget(20407)!=0|true))||(__CLR4_5_2fphfphm6lb510n.R.iget(20408)==0&false))) {{
                __CLR4_5_2fphfphm6lb510n.R.inc(20409);continue;
            }

            }__CLR4_5_2fphfphm6lb510n.R.inc(20410);int shortDist = getLowestPenalty(u) + getPenalty(u, v);

            __CLR4_5_2fphfphm6lb510n.R.inc(20411);if ((((shortDist < getLowestPenalty(v))&&(__CLR4_5_2fphfphm6lb510n.R.iget(20412)!=0|true))||(__CLR4_5_2fphfphm6lb510n.R.iget(20413)==0&false))) {{
                // assign new shortest distance and mark unsettled
                __CLR4_5_2fphfphm6lb510n.R.inc(20414);setShortestDistance(v, shortDist);

                // assign predecessor in shortest path
                __CLR4_5_2fphfphm6lb510n.R.inc(20415);setPredecessor(v, u);
            }
        }}
    }}finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}

    private void setPredecessor(Vertex a, Vertex b) {try{__CLR4_5_2fphfphm6lb510n.R.inc(20416);
        __CLR4_5_2fphfphm6lb510n.R.inc(20417);predecessors.put(a, b);
    }finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}

    /**
     * Indicates whether a shortest route to a vertex has been found.
     * @param v the vertex
     * @return true if the shortest route to this vertex has been found.
     */
    private boolean isFinished(Vertex v) {try{__CLR4_5_2fphfphm6lb510n.R.inc(20418);
        __CLR4_5_2fphfphm6lb510n.R.inc(20419);return finishedVertices.contains(v);
    }finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}

    private void setShortestDistance(Vertex vertex, int distance) {try{__CLR4_5_2fphfphm6lb510n.R.inc(20420);
        //Remove so it is inserted at the right position after the lowest penalty changes for this
        //vertex.
        __CLR4_5_2fphfphm6lb510n.R.inc(20421);priorityQueue.remove(vertex);

        //Update the lowest penalty.
        __CLR4_5_2fphfphm6lb510n.R.inc(20422);lowestPenalties.put(vertex, distance);

        //Insert the vertex again at the new position based on the lowest penalty
        __CLR4_5_2fphfphm6lb510n.R.inc(20423);priorityQueue.add(vertex);
    }finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}

    /**
     * Returns the lowest penalty from the start point to a given vertex.
     * @param vertex the vertex
     * @return the lowest penalty or {@link DijkstraAlgorithm#INFINITE} if there is no route to
     *         the destination.
     */
    public int getLowestPenalty(Vertex vertex) {try{__CLR4_5_2fphfphm6lb510n.R.inc(20424);
        __CLR4_5_2fphfphm6lb510n.R.inc(20425);Integer d = ((Integer)lowestPenalties.get(vertex));
        __CLR4_5_2fphfphm6lb510n.R.inc(20426);return ((((d == null) )&&(__CLR4_5_2fphfphm6lb510n.R.iget(20427)!=0|true))||(__CLR4_5_2fphfphm6lb510n.R.iget(20428)==0&false))? INFINITE : d;
    }finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}

    /**
     * Returns the vertex's predecessor on the shortest path.
     * @param vertex the vertex for which to find the predecessor
     * @return the vertex's predecessor on the shortest path, or
     *         <code>null</code> if there is no route to the destination.
     */
    public Vertex getPredecessor(Vertex vertex) {try{__CLR4_5_2fphfphm6lb510n.R.inc(20429);
        __CLR4_5_2fphfphm6lb510n.R.inc(20430);return (Vertex)predecessors.get(vertex);
    }finally{__CLR4_5_2fphfphm6lb510n.R.flushNeeded();}}

}
