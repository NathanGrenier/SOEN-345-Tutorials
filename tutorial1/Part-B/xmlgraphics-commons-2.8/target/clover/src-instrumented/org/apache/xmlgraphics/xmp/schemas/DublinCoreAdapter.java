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

/* $Id: DublinCoreAdapter.java 1804124 2017-08-04 14:13:54Z ssteiner $ */

package org.apache.xmlgraphics.xmp.schemas;

import java.util.Date;

import org.apache.xmlgraphics.xmp.Metadata;
import org.apache.xmlgraphics.xmp.XMPSchemaAdapter;
import org.apache.xmlgraphics.xmp.XMPSchemaRegistry;

/**
 * Schema adapter implementation for the Dublin Core schema.
 * <p>
 * Note: In Adobe's XMP specification dc:subject is defined as "bag Text", but in PDF/A-1 it is
 * defined as "Text". Here it is implemented as "bag Text".
 */
public class DublinCoreAdapter extends XMPSchemaAdapter {public static class __CLR4_5_2h65h65m6lb51ew{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,22342,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String CONTRIBUTOR = "contributor";
    private static final String COVERAGE = "coverage";
    private static final String CREATOR = "creator";
    private static final String DATE = "date";
    private static final String DESCRIPTION = "description";
    private static final String FORMAT = "format";
    private static final String IDENTIFIER = "identifier";
    private static final String LANGUAGE = "language";
    private static final String PUBLISHER = "publisher";
    private static final String RELATION = "relation";
    private static final String RIGHTS = "rights";
    private static final String SOURCE = "source";
    private static final String SUBJECT = "subject";
    private static final String TITLE = "title";
    private static final String TYPE = "type";

    /**
     * Constructs a new adapter for Dublin Core around the given metadata object.
     * @param meta the underlying metadata
     */
    public DublinCoreAdapter(Metadata meta) {
        super(meta, XMPSchemaRegistry.getInstance().getSchema(DublinCoreSchema.NAMESPACE));__CLR4_5_2h65h65m6lb51ew.R.inc(22254);try{__CLR4_5_2h65h65m6lb51ew.R.inc(22253);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Adds a new entry to the list of contributors (other than the authors).
     * @param value the new value
     */
    public void addContributor(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22255);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22256);addStringToBag(CONTRIBUTOR, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Removes an entry from the list of contributors.
     * @param value the value to be removed
     * @return the removed entry
     */
    public boolean removeContributor(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22257);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22258);return removeStringFromArray(CONTRIBUTOR, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns an array of all contributors.
     * @return a String array of all contributors (or null if not set)
     */
    public String[] getContributors() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22259);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22260);return getStringArray(CONTRIBUTOR);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Sets the extent or scope of the resource.
     * @param value the new value.
     */
    public void setCoverage(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22261);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22262);setValue(COVERAGE, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns the extent or scope of the resource.
     * @return the property value (or null if not set)
     */
    public String getCoverage() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22263);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22264);return getValue(COVERAGE);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Adds a new entry to the list of creators (authors of the resource).
     * @param value the new value
     */
    public void addCreator(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22265);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22266);addStringToSeq(CREATOR, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Removes an entry from the list of creators (authors of the resource).
     * @param value the value to be removed
     * @return the removed entry
     */
    public boolean removeCreator(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22267);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22268);return removeStringFromArray(CREATOR, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns an array of all creators.
     * @return a String array of all creators (or null if not set)
     */
    public String[] getCreators() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22269);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22270);return getStringArray(CREATOR);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Adds a new entry to the list of dates indicating points in time something interesting
     * happened to the resource.
     * @param value the date value
     */
    public void addDate(Date value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22271);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22272);addDateToSeq(DATE, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns a list of dates indicating point in time something interesting happened to the
     * resource.
     * @return the list of dates or null if no dates are set
     */
    public Date[] getDates() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22273);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22274);return getDateArray(DATE);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns a latest date indicating point in time something interesting happened to the
     * resource.
     * @return the last date or null
     */
    public Date getDate() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22275);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22276);Date[] dates = getDates();
        __CLR4_5_2h65h65m6lb51ew.R.inc(22277);if ((((dates != null)&&(__CLR4_5_2h65h65m6lb51ew.R.iget(22278)!=0|true))||(__CLR4_5_2h65h65m6lb51ew.R.iget(22279)==0&false))) {{
            __CLR4_5_2h65h65m6lb51ew.R.inc(22280);Date latest = null;
            __CLR4_5_2h65h65m6lb51ew.R.inc(22281);for (Date date : dates) {{
                __CLR4_5_2h65h65m6lb51ew.R.inc(22282);if ((((latest == null || date.getTime() > latest.getTime())&&(__CLR4_5_2h65h65m6lb51ew.R.iget(22283)!=0|true))||(__CLR4_5_2h65h65m6lb51ew.R.iget(22284)==0&false))) {{
                    __CLR4_5_2h65h65m6lb51ew.R.inc(22285);latest = date;
                }
            }}
            }__CLR4_5_2h65h65m6lb51ew.R.inc(22286);return latest;
        } }else {{
            __CLR4_5_2h65h65m6lb51ew.R.inc(22287);return null;
        }

    }}finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Sets the description of the content of the resource.
     * @param lang the language of the value ("x-default" or null for the default language)
     * @param value the new value
     */
    public void setDescription(String lang, String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22288);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22289);setLangAlt(DESCRIPTION, lang, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns the description of the content of the resource (in the default language).
     * @return the description of the content of the resource (or null if not set)
     */
    public String getDescription() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22290);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22291);return getDescription(null);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns the description of the content of the resource in a language-dependant way.
     * @param lang the language ("x-default" or null for the default language)
     * @return the language-dependent value (or null if not set)
     */
    public String getDescription(String lang) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22292);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22293);return getLangAlt(lang, DESCRIPTION);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Sets the file format used when saving the resource. Tools and
     * applications should set this property to the save format of the
     * data. It may include appropriate qualifiers.
     * @param value a MIME type
     */
    public void setFormat(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22294);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22295);setValue(FORMAT, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns the file format used when saving this resource.
     * @return the MIME type of the file format (or null if not set)
     */
    public String getFormat() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22296);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22297);return getValue(FORMAT);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Sets the unique identifier of the resource.
     * @param value the new value
     */
    public void setIdentifier(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22298);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22299);setValue(IDENTIFIER, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns the unique identifier of the resource.
     * @return the unique identifier (or null if not set)
     */
    public String getIdentifier() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22300);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22301);return getValue(IDENTIFIER);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Adds a new entry to the list of languages (RFC 3066).
     * @param value the new value
     */
    public void addLanguage(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22302);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22303);addStringToBag(LANGUAGE, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns an array of languages.
     * @return a String array of all languages (or null if not set)
     */
    public String[] getLanguages() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22304);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22305);return getStringArray(LANGUAGE);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Adds a new entry to the list of publishers.
     * @param value the new value
     */
    public void addPublisher(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22306);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22307);addStringToBag(PUBLISHER, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns an array of publishers.
     * @return a String array of all publishers (or null if not set)
     */
    public String[] getPublisher() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22308);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22309);return getStringArray(PUBLISHER);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Adds a new entry to the list of relationships to other documents.
     * @param value the new value
     */
    public void addRelation(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22310);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22311);addStringToBag(RELATION, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns an array of all relationship to other documents.
     * @return a String array of all relationships (or null if none are set)
     */
    public String[] getRelations() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22312);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22313);return getStringArray(RELATION);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Sets the informal rights statement.
     * @param lang the language of the value ("x-default" or null for the default language)
     * @param value the new value
     */
    public void setRights(String lang, String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22314);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22315);setLangAlt(RIGHTS, lang, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns the informal rights statement.
     * @return the informal right statement (or null if not set)
     */
    public String getRights() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22316);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22317);return getRights(null);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns the informal rights statement in a language-dependant way.
     * @param lang the language ("x-default" or null for the default language)
     * @return the language-dependent value (or null if not set)
     */
    public String getRights(String lang) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22318);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22319);return getLangAlt(lang, RIGHTS);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Sets the unique identifier of the work from which this resource was derived.
     * @param value the new value
     */
    public void setSource(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22320);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22321);setValue(SOURCE, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns unique identifier of the work from which this resource was derived.
     * @return the source (or null if not set)
     */
    public String getSource() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22322);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22323);return getValue(SOURCE);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Adds a new entry to the list of subjects (descriptive phrases or keywords that
     * specify the topic of the content of the resource).
     * @param value the new value
     */
    public void addSubject(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22324);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22325);addStringToBag(SUBJECT, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns an array of all subjects.
     * @return a String array of all subjects
     */
    public String[] getSubjects() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22326);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22327);return getStringArray(SUBJECT);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Sets the title of the resource (in the default language).
     * @param value the new value
     */
    public void setTitle(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22328);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22329);setTitle(null, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Sets the title of the resource.
     * @param lang the language of the value ("x-default" or null for the default language)
     * @param value the new value
     */
    public void setTitle(String lang, String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22330);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22331);setLangAlt(TITLE, lang, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns the title of the resource (in the default language).
     * @return the title of the resource (in the default language)
     */
    public String getTitle() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22332);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22333);return getTitle(null);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns the title of the resource in a language-dependant way.
     * @param lang the language ("x-default" or null for the default language)
     * @return the language-dependent value (or null if not set)
     */
    public String getTitle(String lang) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22334);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22335);return getLangAlt(lang, TITLE);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Removes a title of the resource.
     * @param lang the language variant to be removed
     * @return the previously set value or null if this language variant wasn't set
     */
    public String removeTitle(String lang) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22336);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22337);return removeLangAlt(lang, TITLE);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Adds a new entry to the list of document types (for example: novel, poem or working paper).
     * @param value the new value
     */
    public void addType(String value) {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22338);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22339);addStringToBag(TYPE, value);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}

    /**
     * Returns an array of all document types.
     * @return a String array of all document types (or null if not set)
     */
    public String[] getTypes() {try{__CLR4_5_2h65h65m6lb51ew.R.inc(22340);
        __CLR4_5_2h65h65m6lb51ew.R.inc(22341);return getStringArray(TYPE);
    }finally{__CLR4_5_2h65h65m6lb51ew.R.flushNeeded();}}


}
