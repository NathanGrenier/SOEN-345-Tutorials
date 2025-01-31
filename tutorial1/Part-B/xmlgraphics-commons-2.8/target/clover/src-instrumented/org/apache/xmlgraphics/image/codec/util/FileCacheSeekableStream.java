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

/* $Id: FileCacheSeekableStream.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/**
 * A subclass of <code>SeekableStream</code> that may be used to wrap
 * a regular <code>InputStream</code>.  Seeking backwards is supported
 * by means of a file cache.  In circumstances that do not allow the
 * creation of a temporary file (for example, due to security
 * consideration or the absence of local disk), the
 * <code>MemoryCacheSeekableStream</code> class may be used instead.
 *
 * <p> The <code>mark()</code> and <code>reset()</code> methods are
 * supported.
 *
 * <p><b> This class is not a committed part of the JAI API.  It may
 * be removed or changed in future releases of JAI.</b>
 */
public final class FileCacheSeekableStream extends SeekableStream {public static class __CLR4_5_26ku6kum6lb4zho{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,8602,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The source stream. */
    private InputStream stream;

    /** The cache File. */
    private File cacheFile;

    /** The cache as a RandomAcessFile. */
    private RandomAccessFile cache;

    /** The length of the read buffer. */
    private int bufLen = 1024;

    /** The read buffer. */
    private byte[] buf = new byte[bufLen];

    /** Number of bytes in the cache. */
    private long length;

    /** Next byte to be read. */
    private long pointer;

    /** True if we've encountered the end of the source stream. */
    private boolean foundEOF;

    /**
     * Constructs a <code>MemoryCacheSeekableStream</code> that takes
     * its source data from a regular <code>InputStream</code>.
     * Seeking backwards is supported by means of an file cache.
     *
     * <p> An <code>IOException</code> will be thrown if the
     * attempt to create the cache file fails for any reason.
     */
    public FileCacheSeekableStream(InputStream stream)
        throws IOException {try{__CLR4_5_26ku6kum6lb4zho.R.inc(8526);
        __CLR4_5_26ku6kum6lb4zho.R.inc(8527);this.stream = stream;
        __CLR4_5_26ku6kum6lb4zho.R.inc(8528);this.cacheFile = File.createTempFile("jai-FCSS-", ".tmp");
        __CLR4_5_26ku6kum6lb4zho.R.inc(8529);cacheFile.deleteOnExit();
        __CLR4_5_26ku6kum6lb4zho.R.inc(8530);this.cache = new RandomAccessFile(cacheFile, "rw");
    }finally{__CLR4_5_26ku6kum6lb4zho.R.flushNeeded();}}

    /**
     * Ensures that at least <code>pos</code> bytes are cached,
     * or the end of the source is reached.  The return value
     * is equal to the smaller of <code>pos</code> and the
     * length of the source file.
     */
    private long readUntil(long pos) throws IOException {try{__CLR4_5_26ku6kum6lb4zho.R.inc(8531);
        // We've already got enough data cached
        __CLR4_5_26ku6kum6lb4zho.R.inc(8532);if ((((pos < length)&&(__CLR4_5_26ku6kum6lb4zho.R.iget(8533)!=0|true))||(__CLR4_5_26ku6kum6lb4zho.R.iget(8534)==0&false))) {{
            __CLR4_5_26ku6kum6lb4zho.R.inc(8535);return pos;
        }
        // pos >= length but length isn't getting any bigger, so return it
        }__CLR4_5_26ku6kum6lb4zho.R.inc(8536);if ((((foundEOF)&&(__CLR4_5_26ku6kum6lb4zho.R.iget(8537)!=0|true))||(__CLR4_5_26ku6kum6lb4zho.R.iget(8538)==0&false))) {{
            __CLR4_5_26ku6kum6lb4zho.R.inc(8539);return length;
        }

        }__CLR4_5_26ku6kum6lb4zho.R.inc(8540);long len = pos - length;
        __CLR4_5_26ku6kum6lb4zho.R.inc(8541);cache.seek(length);
        __CLR4_5_26ku6kum6lb4zho.R.inc(8542);while ((((len > 0)&&(__CLR4_5_26ku6kum6lb4zho.R.iget(8543)!=0|true))||(__CLR4_5_26ku6kum6lb4zho.R.iget(8544)==0&false))) {{
            // Copy a buffer's worth of data from the source to the cache
            // bufLen will always fit into an int so this is safe
            __CLR4_5_26ku6kum6lb4zho.R.inc(8545);int nbytes = stream.read(buf, 0, (int)Math.min(len, bufLen));
            __CLR4_5_26ku6kum6lb4zho.R.inc(8546);if ((((nbytes == -1)&&(__CLR4_5_26ku6kum6lb4zho.R.iget(8547)!=0|true))||(__CLR4_5_26ku6kum6lb4zho.R.iget(8548)==0&false))) {{
                __CLR4_5_26ku6kum6lb4zho.R.inc(8549);foundEOF = true;
                __CLR4_5_26ku6kum6lb4zho.R.inc(8550);return length;
            }

            }__CLR4_5_26ku6kum6lb4zho.R.inc(8551);cache.setLength(cache.length() + nbytes);
            __CLR4_5_26ku6kum6lb4zho.R.inc(8552);cache.write(buf, 0, nbytes);
            __CLR4_5_26ku6kum6lb4zho.R.inc(8553);len -= nbytes;
            __CLR4_5_26ku6kum6lb4zho.R.inc(8554);length += nbytes;
        }

        }__CLR4_5_26ku6kum6lb4zho.R.inc(8555);return pos;
    }finally{__CLR4_5_26ku6kum6lb4zho.R.flushNeeded();}}

    /**
     * Returns <code>true</code> since all
     * <code>FileCacheSeekableStream</code> instances support seeking
     * backwards.
     */
    public boolean canSeekBackwards() {try{__CLR4_5_26ku6kum6lb4zho.R.inc(8556);
        __CLR4_5_26ku6kum6lb4zho.R.inc(8557);return true;
    }finally{__CLR4_5_26ku6kum6lb4zho.R.flushNeeded();}}

    /**
     * Returns the current offset in this file.
     *
     * @return     the offset from the beginning of the file, in bytes,
     *             at which the next read occurs.
     */
    public long getFilePointer() {try{__CLR4_5_26ku6kum6lb4zho.R.inc(8558);
        __CLR4_5_26ku6kum6lb4zho.R.inc(8559);return pointer;
    }finally{__CLR4_5_26ku6kum6lb4zho.R.flushNeeded();}}

    /**
     * Sets the file-pointer offset, measured from the beginning of this
     * file, at which the next read occurs.
     *
     * @param      pos   the offset position, measured in bytes from the
     *                   beginning of the file, at which to set the file
     *                   pointer.
     * @exception  IOException  if <code>pos</code> is less than
     *                          <code>0</code> or if an I/O error occurs.
     */
    public void seek(long pos) throws IOException {try{__CLR4_5_26ku6kum6lb4zho.R.inc(8560);
        __CLR4_5_26ku6kum6lb4zho.R.inc(8561);if ((((pos < 0)&&(__CLR4_5_26ku6kum6lb4zho.R.iget(8562)!=0|true))||(__CLR4_5_26ku6kum6lb4zho.R.iget(8563)==0&false))) {{
            __CLR4_5_26ku6kum6lb4zho.R.inc(8564);throw new IOException(PropertyUtil.getString("FileCacheSeekableStream0"));
        }
        }__CLR4_5_26ku6kum6lb4zho.R.inc(8565);pointer = pos;
    }finally{__CLR4_5_26ku6kum6lb4zho.R.flushNeeded();}}

    /**
     * Reads the next byte of data from the input stream. The value byte is
     * returned as an <code>int</code> in the range <code>0</code> to
     * <code>255</code>. If no byte is available because the end of the stream
     * has been reached, the value <code>-1</code> is returned. This method
     * blocks until input data is available, the end of the stream is detected,
     * or an exception is thrown.
     *
     * @return     the next byte of data, or <code>-1</code> if the end of the
     *             stream is reached.
     * @exception  IOException  if an I/O error occurs.
     */
    public int read() throws IOException {try{__CLR4_5_26ku6kum6lb4zho.R.inc(8566);
        __CLR4_5_26ku6kum6lb4zho.R.inc(8567);long next = pointer + 1;
        __CLR4_5_26ku6kum6lb4zho.R.inc(8568);long pos = readUntil(next);
        __CLR4_5_26ku6kum6lb4zho.R.inc(8569);if ((((pos >= next)&&(__CLR4_5_26ku6kum6lb4zho.R.iget(8570)!=0|true))||(__CLR4_5_26ku6kum6lb4zho.R.iget(8571)==0&false))) {{
            __CLR4_5_26ku6kum6lb4zho.R.inc(8572);cache.seek(pointer++);
            __CLR4_5_26ku6kum6lb4zho.R.inc(8573);return cache.read();
        } }else {{
            __CLR4_5_26ku6kum6lb4zho.R.inc(8574);return -1;
        }
    }}finally{__CLR4_5_26ku6kum6lb4zho.R.flushNeeded();}}

    /**
     * Reads up to <code>len</code> bytes of data from the input stream into
     * an array of bytes.  An attempt is made to read as many as
     * <code>len</code> bytes, but a smaller number may be read, possibly
     * zero. The number of bytes actually read is returned as an integer.
     *
     * <p> This method blocks until input data is available, end of file is
     * detected, or an exception is thrown.
     *
     * <p> If <code>b</code> is <code>null</code>, a
     * <code>NullPointerException</code> is thrown.
     *
     * <p> If <code>off</code> is negative, or <code>len</code> is negative, or
     * <code>off+len</code> is greater than the length of the array
     * <code>b</code>, then an <code>IndexOutOfBoundsException</code> is
     * thrown.
     *
     * <p> If <code>len</code> is zero, then no bytes are read and
     * <code>0</code> is returned; otherwise, there is an attempt to read at
     * least one byte. If no byte is available because the stream is at end of
     * file, the value <code>-1</code> is returned; otherwise, at least one
     * byte is read and stored into <code>b</code>.
     *
     * <p> The first byte read is stored into element <code>b[off]</code>, the
     * next one into <code>b[off+1]</code>, and so on. The number of bytes read
     * is, at most, equal to <code>len</code>. Let <i>k</i> be the number of
     * bytes actually read; these bytes will be stored in elements
     * <code>b[off]</code> through <code>b[off+</code><i>k</i><code>-1]</code>,
     * leaving elements <code>b[off+</code><i>k</i><code>]</code> through
     * <code>b[off+len-1]</code> unaffected.
     *
     * <p> In every case, elements <code>b[0]</code> through
     * <code>b[off]</code> and elements <code>b[off+len]</code> through
     * <code>b[b.length-1]</code> are unaffected.
     *
     * <p> If the first byte cannot be read for any reason other than end of
     * file, then an <code>IOException</code> is thrown. In particular, an
     * <code>IOException</code> is thrown if the input stream has been closed.
     *
     * @param      b     the buffer into which the data is read.
     * @param      off   the start offset in array <code>b</code>
     *                   at which the data is written.
     * @param      len   the maximum number of bytes to read.
     * @return     the total number of bytes read into the buffer, or
     *             <code>-1</code> if there is no more data because the end of
     *             the stream has been reached.
     * @exception  IOException  if an I/O error occurs.
     */
    public int read(byte[] b, int off, int len) throws IOException {try{__CLR4_5_26ku6kum6lb4zho.R.inc(8575);
        __CLR4_5_26ku6kum6lb4zho.R.inc(8576);if ((((b == null)&&(__CLR4_5_26ku6kum6lb4zho.R.iget(8577)!=0|true))||(__CLR4_5_26ku6kum6lb4zho.R.iget(8578)==0&false))) {{
            __CLR4_5_26ku6kum6lb4zho.R.inc(8579);throw new NullPointerException();
        }
        }__CLR4_5_26ku6kum6lb4zho.R.inc(8580);if (((((off < 0) || (len < 0) || (off + len > b.length))&&(__CLR4_5_26ku6kum6lb4zho.R.iget(8581)!=0|true))||(__CLR4_5_26ku6kum6lb4zho.R.iget(8582)==0&false))) {{
            __CLR4_5_26ku6kum6lb4zho.R.inc(8583);throw new IndexOutOfBoundsException();
        }
        }__CLR4_5_26ku6kum6lb4zho.R.inc(8584);if ((((len == 0)&&(__CLR4_5_26ku6kum6lb4zho.R.iget(8585)!=0|true))||(__CLR4_5_26ku6kum6lb4zho.R.iget(8586)==0&false))) {{
            __CLR4_5_26ku6kum6lb4zho.R.inc(8587);return 0;
        }

        }__CLR4_5_26ku6kum6lb4zho.R.inc(8588);long pos = readUntil(pointer + len);

        // len will always fit into an int so this is safe
        __CLR4_5_26ku6kum6lb4zho.R.inc(8589);len = (int)Math.min(len, pos - pointer);
        __CLR4_5_26ku6kum6lb4zho.R.inc(8590);if ((((len > 0)&&(__CLR4_5_26ku6kum6lb4zho.R.iget(8591)!=0|true))||(__CLR4_5_26ku6kum6lb4zho.R.iget(8592)==0&false))) {{
            __CLR4_5_26ku6kum6lb4zho.R.inc(8593);cache.seek(pointer);
            __CLR4_5_26ku6kum6lb4zho.R.inc(8594);cache.readFully(b, off, len);
            __CLR4_5_26ku6kum6lb4zho.R.inc(8595);pointer += len;
            __CLR4_5_26ku6kum6lb4zho.R.inc(8596);return len;
        } }else {{
            __CLR4_5_26ku6kum6lb4zho.R.inc(8597);return -1;
        }
    }}finally{__CLR4_5_26ku6kum6lb4zho.R.flushNeeded();}}

    /**
     * Closes this stream and releases any system resources
     * associated with the stream.
     *
     * @throws IOException if an I/O error occurs.
     */
    public void close() throws IOException {try{__CLR4_5_26ku6kum6lb4zho.R.inc(8598);
        __CLR4_5_26ku6kum6lb4zho.R.inc(8599);super.close();
        __CLR4_5_26ku6kum6lb4zho.R.inc(8600);cache.close();
        __CLR4_5_26ku6kum6lb4zho.R.inc(8601);cacheFile.delete();
    }finally{__CLR4_5_26ku6kum6lb4zho.R.flushNeeded();}}
}
