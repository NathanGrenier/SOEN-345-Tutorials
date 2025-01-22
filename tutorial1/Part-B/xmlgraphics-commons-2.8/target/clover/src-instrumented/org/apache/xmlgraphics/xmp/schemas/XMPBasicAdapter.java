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

/* $Id: XMPBasicAdapter.java 893190 2009-12-22 14:41:02Z jeremias $ */

package org.apache.xmlgraphics.xmp.schemas;

import java.util.Date;

import org.apache.xmlgraphics.xmp.Metadata;
import org.apache.xmlgraphics.xmp.PropertyAccess;
import org.apache.xmlgraphics.xmp.XMPArrayType;
import org.apache.xmlgraphics.xmp.XMPConstants;
import org.apache.xmlgraphics.xmp.XMPProperty;
import org.apache.xmlgraphics.xmp.XMPSchemaAdapter;
import org.apache.xmlgraphics.xmp.XMPSchemaRegistry;
import org.apache.xmlgraphics.xmp.XMPStructure;

/**
 * Schema adapter implementation for the XMP Basic schema.
 */
public class XMPBasicAdapter extends XMPSchemaAdapter {public static class __CLR4_5_2h8vh8vm68iyim9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,22392,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String ADVISORY = "Advisory";
    private static final String BASE_URL = "BaseURL";
    private static final String CREATE_DATE = "CreateDate";
    private static final String CREATOR_TOOL = "CreatorTool";
    private static final String IDENTIFIER = "Identifier";
    private static final String LABEL = "Label";
    private static final String METADATA_DATE = "MetadataDate";
    private static final String MODIFY_DATE = "ModifyDate";
    private static final String NICKNAME = "Nickname";
    private static final String RATING = "Rating";
    private static final String THUMBNAILS = "Thumbnails";

    /**
     * Constructs a new adapter for XMP Basic around the given metadata object.
     * @param meta the underlying metadata
     */
    public XMPBasicAdapter(Metadata meta, String namespace) {
        super(meta, XMPSchemaRegistry.getInstance().getSchema(namespace));__CLR4_5_2h8vh8vm68iyim9.R.inc(22352);try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22351);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /**
     * Sets the base URL for relative URLs in the document content.
     * @param value the base URL
     */
    public void setBaseUrl(String value) {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22353);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22354);setValue(BASE_URL, value);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /**
     * Returns the base URL for relative URLs in the document content.
     * @return the base URL
     */
    public String getBaseUrl() {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22355);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22356);return getValue(BASE_URL);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /**
     * Sets the date and time the resource was originally created.
     * @param creationDate the creation date
     */
    public void setCreateDate(Date creationDate) {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22357);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22358);setDateValue(CREATE_DATE, creationDate);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /** @return the date and time the resource was originally created */
    public Date getCreateDate() {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22359);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22360);return getDateValue(CREATE_DATE);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /**
     * Sets the first known tool used to create the resource.
     * @param value the creator tool
     */
    public void setCreatorTool(String value) {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22361);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22362);setValue(CREATOR_TOOL, value);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /** @return the first known tool used to create the resource */
    public String getCreatorTool() {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22363);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22364);return getValue(CREATOR_TOOL);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /**
     * Adds an identifier that unambiguously identify the resource within a given context.
     * @param value the identifier value
     */
    public void addIdentifier(String value) {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22365);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22366);addStringToBag(IDENTIFIER, value);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /**
     * Sets a qualified identifier that unambiguously identify the resource within a given context.
     * As qualifier, <code>xmpidq:Scheme</code> is used.
     * @param value the identifier value
     * @param qualifier the qualifier value (for xmpidq:Scheme)
     */
    public void setIdentifier(String value, String qualifier) {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22367);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22368);PropertyAccess pa = findQualifiedStructure(IDENTIFIER,
                XMPBasicSchema.SCHEME_QUALIFIER, qualifier);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22369);if ((((pa != null)&&(__CLR4_5_2h8vh8vm68iyim9.R.iget(22370)!=0|true))||(__CLR4_5_2h8vh8vm68iyim9.R.iget(22371)==0&false))) {{
            __CLR4_5_2h8vh8vm68iyim9.R.inc(22372);pa.setProperty(new XMPProperty(XMPConstants.RDF_VALUE, value));
        } }else {{
            __CLR4_5_2h8vh8vm68iyim9.R.inc(22373);XMPStructure struct = new XMPStructure();
            __CLR4_5_2h8vh8vm68iyim9.R.inc(22374);struct.setProperty(new XMPProperty(XMPConstants.RDF_VALUE, value));
            __CLR4_5_2h8vh8vm68iyim9.R.inc(22375);struct.setProperty(new XMPProperty(XMPBasicSchema.SCHEME_QUALIFIER, qualifier));
            __CLR4_5_2h8vh8vm68iyim9.R.inc(22376);addObjectToArray(IDENTIFIER, struct, XMPArrayType.BAG);
        }
    }}finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /**
     * Returns an array of all identifiers that unambiguously identify the resource within a
     * given context.
     * @return a String array of all identifiers (or null if not set)
     */
    public String[] getIdentifiers() {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22377);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22378);return getStringArray(IDENTIFIER);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /**
     * Returns an identifier that matches a given qualifier.
     * As qualifier, <code>xmpidq:Scheme</code> is used.
     * @param qualifier the qualifier
     * @return the identifier (or null if no matching value was found)
     */
    public String getIdentifier(String qualifier) {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22379);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22380);Object value = findQualifiedValue(IDENTIFIER, XMPBasicSchema.SCHEME_QUALIFIER, qualifier);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22381);return ((((value != null )&&(__CLR4_5_2h8vh8vm68iyim9.R.iget(22382)!=0|true))||(__CLR4_5_2h8vh8vm68iyim9.R.iget(22383)==0&false))? value.toString() : null);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /**
     * Sets the date and time the resource was last modified.
     * @param modifyDate the modification date
     */
    public void setModifyDate(Date modifyDate) {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22384);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22385);setDateValue(MODIFY_DATE, modifyDate);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /** @return the date and time the resource was last modified */
    public Date getModifyDate() {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22386);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22387);return getDateValue(MODIFY_DATE);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /**
     * Sets the date and time any metadata for this resource was last changed.
     * @param metadataDate the modification date for the metadata
     */
    public void setMetadataDate(Date metadataDate) {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22388);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22389);setDateValue(METADATA_DATE, metadataDate);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

    /** @return the date and time the resource was originally created */
    public Date getMetadataDate() {try{__CLR4_5_2h8vh8vm68iyim9.R.inc(22390);
        __CLR4_5_2h8vh8vm68iyim9.R.inc(22391);return getDateValue(METADATA_DATE);
    }finally{__CLR4_5_2h8vh8vm68iyim9.R.flushNeeded();}}

}
