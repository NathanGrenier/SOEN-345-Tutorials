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
package org.apache.xmlgraphics.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class DateFormatUtil {public static class __CLR4_5_2f7zf7zm68iyibi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1737587872955L,8589935092L,19799,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String ISO_8601_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss";

    private DateFormatUtil() {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19727);
    }finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    /**
     * Formats the date according to PDF format. See section 3.8.2 of the PDF 1.4 specification.
     * @param date The date time to format
     * @param timeZone The time zone used to format the date
     * @return a formatted date according to PDF format (based on ISO 8824)
     */
    public static String formatPDFDate(Date date, TimeZone timeZone) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19728);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19729);DateFormat dateFormat = createDateFormat("'D:'yyyyMMddHHmmss", timeZone);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19730);return formatDate(date, dateFormat, '\'', true);
    }finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    /**
     * Formats the date according to ISO 8601 standard.
     * @param date The date time to format
     * @param timeZone The time zone used to format the date
     * @return a formatted date according to ISO 8601
     */
    public static String formatISO8601(Date date, TimeZone timeZone) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19731);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19732);DateFormat dateFormat = createDateFormat(ISO_8601_DATE_PATTERN, timeZone);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19733);return formatDate(date, dateFormat, ':', false);
    }finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    private static DateFormat createDateFormat(String format, TimeZone timeZone) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19734);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19735);DateFormat dateFormat = new SimpleDateFormat(format, Locale.ENGLISH);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19736);dateFormat.setTimeZone(timeZone);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19737);return dateFormat;
    }finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    /**
     * Formats the date according to the specified format and returns as a string.
     * @param date The date / time object to format
     * @param dateFormat The date format to use when outputting the date
     * @param delimiter The character used to separate the time zone difference hours and minutes
     * @param endWithDelimiter Determines whether the date string will end with the delimiter character
     * @return the formatted date string
     */
    private static String formatDate(Date date, DateFormat dateFormat, char delimiter,
            boolean endWithDelimiter) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19738);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19739);Calendar cal = Calendar.getInstance(dateFormat.getTimeZone(), Locale.ENGLISH);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19740);cal.setTime(date);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19741);int offset = getOffsetInMinutes(cal);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19742);StringBuilder sb = new StringBuilder(dateFormat.format(date));
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19743);appendOffset(sb, delimiter, offset, endWithDelimiter);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19744);return sb.toString();
    }finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    private static int getOffsetInMinutes(Calendar cal) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19745);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19746);int offset = cal.get(Calendar.ZONE_OFFSET);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19747);offset += cal.get(Calendar.DST_OFFSET);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19748);offset /= (1000 * 60);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19749);return offset;
    }finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    private static void appendOffset(StringBuilder sb, char delimiter, int offset, boolean endWithDelimiter) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19750);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19751);if ((((offset == 0)&&(__CLR4_5_2f7zf7zm68iyibi.R.iget(19752)!=0|true))||(__CLR4_5_2f7zf7zm68iyibi.R.iget(19753)==0&false))) {{
            __CLR4_5_2f7zf7zm68iyibi.R.inc(19754);appendOffsetUTC(sb);
        } }else {{
            __CLR4_5_2f7zf7zm68iyibi.R.inc(19755);appendOffsetNoUTC(sb, delimiter, offset, endWithDelimiter);
        }
    }}finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    private static void appendOffsetUTC(StringBuilder sb) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19756);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19757);sb.append('Z');
    }finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    private static void appendOffsetNoUTC(StringBuilder sb, char delimiter, int offset,
            boolean endWithDelimiter) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19758);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19759);int zoneOffsetHours = offset / 60;
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19760);appendOffsetSign(sb, zoneOffsetHours);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19761);appendPaddedNumber(sb, Math.abs(zoneOffsetHours));
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19762);sb.append(delimiter);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19763);appendPaddedNumber(sb, Math.abs(offset % 60));
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19764);if ((((endWithDelimiter)&&(__CLR4_5_2f7zf7zm68iyibi.R.iget(19765)!=0|true))||(__CLR4_5_2f7zf7zm68iyibi.R.iget(19766)==0&false))) {{
            __CLR4_5_2f7zf7zm68iyibi.R.inc(19767);sb.append(delimiter);
        }
    }}finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    private static void appendOffsetSign(StringBuilder sb, int zoneOffsetHours) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19768);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19769);if ((((zoneOffsetHours >= 0)&&(__CLR4_5_2f7zf7zm68iyibi.R.iget(19770)!=0|true))||(__CLR4_5_2f7zf7zm68iyibi.R.iget(19771)==0&false))) {{
            __CLR4_5_2f7zf7zm68iyibi.R.inc(19772);sb.append('+');
        } }else {{
            __CLR4_5_2f7zf7zm68iyibi.R.inc(19773);sb.append('-');
        }
    }}finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    private static void appendPaddedNumber(StringBuilder sb, int number) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19774);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19775);if ((((number < 10)&&(__CLR4_5_2f7zf7zm68iyibi.R.iget(19776)!=0|true))||(__CLR4_5_2f7zf7zm68iyibi.R.iget(19777)==0&false))) {{
            __CLR4_5_2f7zf7zm68iyibi.R.inc(19778);sb.append('0');
        }
        }__CLR4_5_2f7zf7zm68iyibi.R.inc(19779);sb.append(number);
    }finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    /**
     * Parses an ISO 8601 date and time value.
     * @param date the date and time value as an ISO 8601 string
     * @return the parsed date/time
     */
    public static Date parseISO8601Date(String date) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19780);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19781);final String errorMessage = "Invalid ISO 8601 date format: ";
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19782);date = formatDateToParse(date, errorMessage);
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19783);DateFormat dateFormat = new SimpleDateFormat(ISO_8601_DATE_PATTERN + "Z");
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19784);try {
            __CLR4_5_2f7zf7zm68iyibi.R.inc(19785);return dateFormat.parse(date);
        } catch (ParseException ex) {
            __CLR4_5_2f7zf7zm68iyibi.R.inc(19786);throw new IllegalArgumentException(errorMessage + date);
        }
    }finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

    private static String formatDateToParse(String date, String errorMessage) {try{__CLR4_5_2f7zf7zm68iyibi.R.inc(19787);
        /* Remove the colon from the time zone difference (+08:00) so that it can be parsed
         * by the SimpleDateFormat string.
         */
        __CLR4_5_2f7zf7zm68iyibi.R.inc(19788);if ((((!date.contains("Z"))&&(__CLR4_5_2f7zf7zm68iyibi.R.iget(19789)!=0|true))||(__CLR4_5_2f7zf7zm68iyibi.R.iget(19790)==0&false))) {{
            __CLR4_5_2f7zf7zm68iyibi.R.inc(19791);int lastColonIndex = date.lastIndexOf(":");
            __CLR4_5_2f7zf7zm68iyibi.R.inc(19792);if ((((lastColonIndex < 0)&&(__CLR4_5_2f7zf7zm68iyibi.R.iget(19793)!=0|true))||(__CLR4_5_2f7zf7zm68iyibi.R.iget(19794)==0&false))) {{
                __CLR4_5_2f7zf7zm68iyibi.R.inc(19795);throw new IllegalArgumentException(errorMessage + date);
            }
            }__CLR4_5_2f7zf7zm68iyibi.R.inc(19796);date = date.substring(0, lastColonIndex) + date.substring(lastColonIndex + 1, date.length());
        } }else {{
            __CLR4_5_2f7zf7zm68iyibi.R.inc(19797);date = date.replace("Z", "+0000");
        }
        }__CLR4_5_2f7zf7zm68iyibi.R.inc(19798);return date;
    }finally{__CLR4_5_2f7zf7zm68iyibi.R.flushNeeded();}}

}
