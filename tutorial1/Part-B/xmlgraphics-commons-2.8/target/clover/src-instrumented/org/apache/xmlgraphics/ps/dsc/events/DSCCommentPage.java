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

/* $Id: DSCCommentPage.java 1681108 2015-05-22 13:26:12Z ssteiner $ */

package org.apache.xmlgraphics.ps.dsc.events;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.xmlgraphics.ps.DSCConstants;
import org.apache.xmlgraphics.ps.PSGenerator;

/**
 * Represents a %%Page DSC comment.
 */
public class DSCCommentPage extends AbstractDSCComment {public static class __CLR4_5_2eyweywm68iyi9o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,19429,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String pageName;
    private int pagePosition = -1;

    /**
     * Creates a new instance.
     */
    public DSCCommentPage() {try{__CLR4_5_2eyweywm68iyi9o.R.inc(19400);
    }finally{__CLR4_5_2eyweywm68iyi9o.R.flushNeeded();}}

    /**
     * Creates a new instance.
     * @param pageName the name of the page
     * @param pagePosition the position of the page within the file (1-based)
     */
    public DSCCommentPage(String pageName, int pagePosition) {try{__CLR4_5_2eyweywm68iyi9o.R.inc(19401);
        __CLR4_5_2eyweywm68iyi9o.R.inc(19402);setPageName(pageName);
        __CLR4_5_2eyweywm68iyi9o.R.inc(19403);setPagePosition(pagePosition);
    }finally{__CLR4_5_2eyweywm68iyi9o.R.flushNeeded();}}

    /**
     * Creates a new instance. The page name will be set to the same value as the page position.
     * @param pagePosition the position of the page within the file (1-based)
     */
    public DSCCommentPage(int pagePosition) {
        this(Integer.toString(pagePosition), pagePosition);__CLR4_5_2eyweywm68iyi9o.R.inc(19405);try{__CLR4_5_2eyweywm68iyi9o.R.inc(19404);
    }finally{__CLR4_5_2eyweywm68iyi9o.R.flushNeeded();}}

    /**
     * Returns the name of the page.
     * @return the page name
     */
    public String getPageName() {try{__CLR4_5_2eyweywm68iyi9o.R.inc(19406);
        __CLR4_5_2eyweywm68iyi9o.R.inc(19407);return this.pageName;
    }finally{__CLR4_5_2eyweywm68iyi9o.R.flushNeeded();}}

    /**
     * Sets the page name.
     * @param name the page name
     */
    public void setPageName(String name) {try{__CLR4_5_2eyweywm68iyi9o.R.inc(19408);
        __CLR4_5_2eyweywm68iyi9o.R.inc(19409);this.pageName = name;
    }finally{__CLR4_5_2eyweywm68iyi9o.R.flushNeeded();}}

    /**
     * Returns the page position.
     * @return the page position (1-based)
     */
    public int getPagePosition() {try{__CLR4_5_2eyweywm68iyi9o.R.inc(19410);
        __CLR4_5_2eyweywm68iyi9o.R.inc(19411);return this.pagePosition;
    }finally{__CLR4_5_2eyweywm68iyi9o.R.flushNeeded();}}

    /**
     * Sets the page position.
     * @param position the page position (1-based)
     */
    public void setPagePosition(int position) {try{__CLR4_5_2eyweywm68iyi9o.R.inc(19412);
        __CLR4_5_2eyweywm68iyi9o.R.inc(19413);if ((((position <= 0)&&(__CLR4_5_2eyweywm68iyi9o.R.iget(19414)!=0|true))||(__CLR4_5_2eyweywm68iyi9o.R.iget(19415)==0&false))) {{
            __CLR4_5_2eyweywm68iyi9o.R.inc(19416);throw new IllegalArgumentException("position must be 1 or above");
        }
        }__CLR4_5_2eyweywm68iyi9o.R.inc(19417);this.pagePosition = position;
    }finally{__CLR4_5_2eyweywm68iyi9o.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCComment#getName()
     */
    public String getName() {try{__CLR4_5_2eyweywm68iyi9o.R.inc(19418);
        __CLR4_5_2eyweywm68iyi9o.R.inc(19419);return DSCConstants.PAGE;
    }finally{__CLR4_5_2eyweywm68iyi9o.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCComment#hasValues()
     */
    public boolean hasValues() {try{__CLR4_5_2eyweywm68iyi9o.R.inc(19420);
        __CLR4_5_2eyweywm68iyi9o.R.inc(19421);return true;
    }finally{__CLR4_5_2eyweywm68iyi9o.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCComment#parseValue(java.lang.String)
     */
    public void parseValue(String value) {try{__CLR4_5_2eyweywm68iyi9o.R.inc(19422);
        __CLR4_5_2eyweywm68iyi9o.R.inc(19423);List params = splitParams(value);
        __CLR4_5_2eyweywm68iyi9o.R.inc(19424);Iterator iter = params.iterator();
        __CLR4_5_2eyweywm68iyi9o.R.inc(19425);this.pageName = (String)iter.next();
        __CLR4_5_2eyweywm68iyi9o.R.inc(19426);this.pagePosition = Integer.parseInt((String)iter.next());
    }finally{__CLR4_5_2eyweywm68iyi9o.R.flushNeeded();}}

    /**
     * @see org.apache.xmlgraphics.ps.dsc.events.DSCEvent#generate(
     *          org.apache.xmlgraphics.ps.PSGenerator)
     */
    public void generate(PSGenerator gen) throws IOException {try{__CLR4_5_2eyweywm68iyi9o.R.inc(19427);
        __CLR4_5_2eyweywm68iyi9o.R.inc(19428);gen.writeDSCComment(getName(),
                new Object[] {getPageName(), getPagePosition()});
    }finally{__CLR4_5_2eyweywm68iyi9o.R.flushNeeded();}}

}
