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

/* $Id: SeekableStream.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.util;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * An abstract subclass of <code>java.io.InputStream</code> that allows seeking
 * within the input, similar to the <code>RandomAccessFile</code> class.
 * Additionally, the <code>DataInput</code> interface is supported and extended
 * to include support for little-endian representations of fundamental data
 * types.
 *
 * <p> In addition to the familiar methods from <code>InputStream</code>, the
 * methods <code>getFilePointer()</code>, <code>seek()</code>, are defined as in
 * the <code>RandomAccessFile</code> class.  The <code>canSeekBackwards()</code>
 * method will return <code>true</code> if it is permissible to seek to a
 * position earlier in the stream than the current value of
 * <code>getFilePointer()</code>.  Some subclasses of
 * <code>SeekableStream</code> guarantee the ability to seek backwards while
 * others may not offer this feature in the interest of providing greater
 * efficiency for those users who do not require it.
 *
 * <p> The <code>DataInput</code> interface is supported as well.  This included
 * the <code>skipBytes()</code> and <code>readFully()</code> methods and a
 * variety of <code>read</code> methods for various data types.
 *
 * <p> Three classes are provided for the purpose of adapting a standard
 * <code>InputStream</code> to the <code>SeekableStream</code> interface.
 * <code>ForwardSeekableStream</code> does not allows seeking backwards, but is
 * inexpensive to use.  <code>FileCacheSeekableStream</code> maintains a copy of
 * all of the data read from the input in a temporary file; this file will be
 * discarded automatically when the <code>FileSeekableStream</code> is
 * finalized, or when the JVM exits normally.
 * <code>FileCacheSeekableStream</code> is intended to be reasonably efficient
 * apart from the unavoidable use of disk space.  In circumstances where the
 * creation of a temporary file is not possible,
 * <code>MemoryCacheSeekableStream</code> may be used.
 * <code>MemoryCacheSeekableStream</code> creates a potentially large in-memory
 * buffer to store the stream data and so should be avoided when possible.
 *
 * <p> The <code>FileSeekableStream</code> class wraps a <code>File</code> or
 * <code>RandomAccessFile</code>. It forwards requests to the real underlying
 * file.  It performs a limited amount of caching in order to avoid excessive
 * I/O costs.
 *
 * <p> The <code>SegmentedSeekableStream</code> class performs a different sort
 * of function.  It creates a <code>SeekableStream</code> from another
 * <code>SeekableStream</code> by selecting a series of portions or "segments".
 * Each segment starts at a specified location within the source
 * <code>SeekableStream</code> and extends for a specified number of bytes.  The
 * <code>StreamSegmentMapper</code> interface and <code>StreamSegment</code>
 * class may be used to compute the segment positions dynamically.
 *
 * <p> A convenience methods, <code>wrapInputStream</code> is provided to
 * construct a suitable <code>SeekableStream</code> instance whose data is
 * supplied by a given <code>InputStream</code>.  The caller, by means of the
 * <code>canSeekBackwards</code> parameter, determines whether support for
 * seeking backwards is required.
 *
 */
@java.lang.SuppressWarnings({"fallthrough"}) public abstract class SeekableStream extends InputStream implements DataInput {public static class __CLR4_5_26sa6sam6lb4zlb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}public static <T> T caseInc(int i,java.util.function.Supplier<T> s){R.inc(i);return s.get();}public static void caseInc(int i,Runnable r){R.inc(i);r.run();}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0063\u006f\u0064\u0065\u002f\u0063\u006f\u006e\u0063\u006f\u0072\u0064\u0069\u0061\u002f\u0053\u004f\u0045\u004e\u002d\u0033\u0034\u0035\u002d\u0054\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0031\u002f\u0050\u0061\u0072\u0074\u002d\u0042\u002f\u0078\u006d\u006c\u0067\u0072\u0061\u0070\u0068\u0069\u0063\u0073\u002d\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0032\u002e\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1738360798893L,8589935092L,8990,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Returns a <code>SeekableStream</code> that will read from a
     * given <code>InputStream</code>, optionally including support
     * for seeking backwards.  This is a convenience method that
     * avoids the need to instantiate specific subclasses of
     * <code>SeekableStream</code> depending on the current security
     * model.
     *
     * @param is An <code>InputStream</code>.
     * @param canSeekBackwards <code>true</code> if the ability to seek
     *        backwards in the output is required.
     * @return An instance of <code>SeekableStream</code>.
     */
    public static SeekableStream wrapInputStream(InputStream is,
                                                 boolean canSeekBackwards) {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8794);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8795);SeekableStream stream = null;

        __CLR4_5_26sa6sam6lb4zlb.R.inc(8796);if ((((canSeekBackwards)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8797)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8798)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8799);try {
                __CLR4_5_26sa6sam6lb4zlb.R.inc(8800);stream = new FileCacheSeekableStream(is);
            } catch (Exception e) {
                __CLR4_5_26sa6sam6lb4zlb.R.inc(8801);stream = new MemoryCacheSeekableStream(is);
            }
        } }else {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8802);stream = new ForwardSeekableStream(is);
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8803);return stream;
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    // Methods from InputStream

    /**
     * Reads the next byte of data from the input stream. The value byte is
     * returned as an <code>int</code> in the range <code>0</code> to
     * <code>255</code>. If no byte is available because the end of the stream
     * has been reached, the value <code>-1</code> is returned. This method
     * blocks until input data is available, the end of the stream is detected,
     * or an exception is thrown.
     *
     * <p> A subclass must provide an implementation of this method.
     *
     * @return     the next byte of data, or <code>-1</code> if the end of the
     *             stream is reached.
     * @exception  IOException  if an I/O error occurs.
     */
    public abstract int read() throws IOException;

    /**
     * Reads up to <code>len</code> bytes of data from the input stream into
     * an array of bytes.  An attempt is made to read as many as
     * <code>len</code> bytes, but a smaller number may be read, possibly
     * zero. The number of bytes actually read is returned as an integer.
     *
     * <p> This method blocks until input data is available, end of stream is
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
     * stream, the value <code>-1</code> is returned; otherwise, at least one
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
     * stream, then an <code>IOException</code> is thrown. In particular, an
     * <code>IOException</code> is thrown if the input stream has been closed.
     *
     * <p> A subclass must provide an implementation of this method.
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
    public abstract int read(byte[] b, int off, int len) throws IOException;

    // Implemented in InputStream:
    //
    // public int read(byte[] b) throws IOException {
    // public long skip(long n) throws IOException
    // public int available) throws IOException
    // public void close() throws IOException;

    /** Marked position, shared by {@link ForwardSeekableStream} */
    protected long markPos = -1L;

    /**
     * Marks the current file position for later return using
     * the <code>reset()</code> method.
     */
    public synchronized void mark(int readLimit) {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8804);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8805);try {
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8806);markPos = getFilePointer();
        } catch (IOException e) {
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8807);markPos = -1L;
        }
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Returns the file position to its position at the time of
     * the immediately previous call to the <code>mark()</code>
     * method.
     */
    public synchronized void reset() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8808);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8809);if ((((markPos != -1)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8810)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8811)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8812);seek(markPos);
        }
    }}finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Returns <code>true</code> if marking is supported.
     * Marking is automatically supported for <code>SeekableStream</code>
     * subclasses that support seeking backeards.  Subclasses that do
     * not support seeking backwards but do support marking must override
     * this method.
     */
    public boolean markSupported() {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8813);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8814);return canSeekBackwards();
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Returns <code>true</code> if this object supports calls to
     * <code>seek(pos)</code> with an offset <code>pos</code> smaller
     * than the current offset, as returned by <code>getFilePointer</code>.
     */
    public boolean canSeekBackwards() {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8815);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8816);return false;
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Returns the current offset in this stream.
     *
     * @return     the offset from the beginning of the stream, in bytes,
     *             at which the next read occurs.
     * @exception  IOException  if an I/O error occurs.
     */
    public abstract long getFilePointer() throws IOException;

    /**
     * Sets the offset, measured from the beginning of this
     * stream, at which the next read occurs.
     *
     * <p> If <code>canSeekBackwards()</code> returns <code>false</code>,
     * then setting <code>pos</code> to an offset smaller than
     * the current value of <code>getFilePointer()</code> will have
     * no effect.
     *
     * @param      pos   the offset position, measured in bytes from the
     *                   beginning of the stream, at which to set the stream
     *                   pointer.
     * @exception  IOException  if <code>pos</code> is less than
     *                          <code>0</code> or if an I/O error occurs.
     */
    public abstract void seek(long pos) throws IOException;

    // Methods from RandomAccessFile

    /**
     * Reads <code>b.length</code> bytes from this stream into the byte
     * array, starting at the current stream pointer. This method reads
     * repeatedly from the stream until the requested number of bytes are
     * read. This method blocks until the requested number of bytes are
     * read, the end of the stream is detected, or an exception is thrown.
     *
     * @param      b   the buffer into which the data is read.
     * @exception  EOFException  if this stream reaches the end before reading
     *               all the bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final void readFully(byte[] b) throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8817);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8818);readFully(b, 0, b.length);
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads exactly <code>len</code> bytes from this stream into the byte
     * array, starting at the current stream pointer. This method reads
     * repeatedly from the stream until the requested number of bytes are
     * read. This method blocks until the requested number of bytes are
     * read, the end of the stream is detected, or an exception is thrown.
     *
     * @param      b     the buffer into which the data is read.
     * @param      off   the start offset of the data.
     * @param      len   the number of bytes to read.
     * @exception  EOFException  if this stream reaches the end before reading
     *               all the bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final void readFully(byte[] b, int off, int len)
        throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8819);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8820);int n = 0;
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8821);do {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8822);int count = this.read(b, off + n, len - n);
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8823);if ((((count < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8824)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8825)==0&false))) {{
                __CLR4_5_26sa6sam6lb4zlb.R.inc(8826);throw new EOFException();
            }
            }__CLR4_5_26sa6sam6lb4zlb.R.inc(8827);n += count;
        } }while ((((n < len)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8828)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8829)==0&false)));
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    // Methods from DataInput, plus little-endian versions

    /**
     * Attempts to skip over <code>n</code> bytes of input discarding the
     * skipped bytes.
     * <p>
     *
     * This method may skip over some smaller number of bytes, possibly zero.
     * This may result from any of a number of conditions; reaching end of
     * stream before <code>n</code> bytes have been skipped is only one
     * possibility. This method never throws an <code>EOFException</code>.
     * The actual number of bytes skipped is returned.  If <code>n</code>
     * is negative, no bytes are skipped.
     *
     * @param      n   the number of bytes to be skipped.
     * @return     the actual number of bytes skipped.
     * @exception  IOException  if an I/O error occurs.
     */
    public int skipBytes(int n) throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8830);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8831);if ((((n <= 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8832)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8833)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8834);return 0;
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8835);return (int)skip(n);
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a <code>boolean</code> from this stream. This method reads a
     * single byte from the stream, starting at the current stream pointer.
     * A value of <code>0</code> represents
     * <code>false</code>. Any other value represents <code>true</code>.
     * This method blocks until the byte is read, the end of the stream
     * is detected, or an exception is thrown.
     *
     * @return     the <code>boolean</code> value read.
     * @exception  EOFException  if this stream has reached the end.
     * @exception  IOException   if an I/O error occurs.
     */
    public final boolean readBoolean() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8836);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8837);int ch = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8838);if ((((ch < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8839)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8840)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8841);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8842);return (ch != 0);
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a signed eight-bit value from this stream. This method reads a
     * byte from the stream, starting from the current stream pointer.
     * If the byte read is <code>b</code>, where
     * <code>0&nbsp;&lt;=&nbsp;b&nbsp;&lt;=&nbsp;255</code>,
     * then the result is:
     * <blockquote><pre>
     *     (byte)(b)
     * </pre></blockquote>
     * <p>
     * This method blocks until the byte is read, the end of the stream
     * is detected, or an exception is thrown.
     *
     * @return     the next byte of this stream as a signed eight-bit
     *             <code>byte</code>.
     * @exception  EOFException  if this stream has reached the end.
     * @exception  IOException   if an I/O error occurs.
     */
    public final byte readByte() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8843);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8844);int ch = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8845);if ((((ch < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8846)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8847)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8848);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8849);return (byte)(ch);
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads an unsigned eight-bit number from this stream. This method reads
     * a byte from this stream, starting at the current stream pointer,
     * and returns that byte.
     * <p>
     * This method blocks until the byte is read, the end of the stream
     * is detected, or an exception is thrown.
     *
     * @return     the next byte of this stream, interpreted as an unsigned
     *             eight-bit number.
     * @exception  EOFException  if this stream has reached the end.
     * @exception  IOException   if an I/O error occurs.
     */
    public final int readUnsignedByte() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8850);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8851);int ch = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8852);if ((((ch < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8853)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8854)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8855);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8856);return ch;
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a signed 16-bit number from this stream.
     * The method reads two
     * bytes from this stream, starting at the current stream pointer.
     * If the two bytes read, in order, are
     * <code>b1</code> and <code>b2</code>, where each of the two values is
     * between <code>0</code> and <code>255</code>, inclusive, then the
     * result is equal to:
     * <blockquote><pre>
     *     (short)((b1 &lt;&lt; 8) | b2)
     * </pre></blockquote>
     * <p>
     * This method blocks until the two bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next two bytes of this stream, interpreted as a signed
     *             16-bit number.
     * @exception  EOFException  if this stream reaches the end before reading
     *               two bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final short readShort() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8857);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8858);int ch1 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8859);int ch2 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8860);if (((((ch1 | ch2) < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8861)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8862)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8863);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8864);return (short)((ch1 << 8) + (ch2 << 0));
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a signed 16-bit number from this stream in little-endian order.
     * The method reads two
     * bytes from this stream, starting at the current stream pointer.
     * If the two bytes read, in order, are
     * <code>b1</code> and <code>b2</code>, where each of the two values is
     * between <code>0</code> and <code>255</code>, inclusive, then the
     * result is equal to:
     * <blockquote><pre>
     *     (short)((b2 &lt;&lt; 8) | b1)
     * </pre></blockquote>
     * <p>
     * This method blocks until the two bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next two bytes of this stream, interpreted as a signed
     *             16-bit number.
     * @exception  EOFException  if this stream reaches the end before reading
     *               two bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final short readShortLE() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8865);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8866);int ch1 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8867);int ch2 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8868);if (((((ch1 | ch2) < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8869)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8870)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8871);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8872);return (short)((ch2 << 8) + (ch1 << 0));
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads an unsigned 16-bit number from this stream. This method reads
     * two bytes from the stream, starting at the current stream pointer.
     * If the bytes read, in order, are
     * <code>b1</code> and <code>b2</code>, where
     * <code>0&nbsp;&lt;=&nbsp;b1, b2&nbsp;&lt;=&nbsp;255</code>,
     * then the result is equal to:
     * <blockquote><pre>
     *     (b1 &lt;&lt; 8) | b2
     * </pre></blockquote>
     * <p>
     * This method blocks until the two bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next two bytes of this stream, interpreted as an
     *             unsigned 16-bit integer.
     * @exception  EOFException  if this stream reaches the end before reading
     *             two bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final int readUnsignedShort() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8873);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8874);int ch1 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8875);int ch2 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8876);if (((((ch1 | ch2) < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8877)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8878)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8879);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8880);return (ch1 << 8) + (ch2 << 0);
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads an unsigned 16-bit number from this stream in little-endian order.
     * This method reads
     * two bytes from the stream, starting at the current stream pointer.
     * If the bytes read, in order, are
     * <code>b1</code> and <code>b2</code>, where
     * <code>0&nbsp;&lt;=&nbsp;b1, b2&nbsp;&lt;=&nbsp;255</code>,
     * then the result is equal to:
     * <blockquote><pre>
     *     (b2 &lt;&lt; 8) | b1
     * </pre></blockquote>
     * <p>
     * This method blocks until the two bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next two bytes of this stream, interpreted as an
     *             unsigned 16-bit integer.
     * @exception  EOFException  if this stream reaches the end before reading
     *               two bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final int readUnsignedShortLE() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8881);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8882);int ch1 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8883);int ch2 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8884);if (((((ch1 | ch2) < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8885)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8886)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8887);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8888);return (ch2 << 8) + (ch1 << 0);
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a Unicode character from this stream. This method reads two
     * bytes from the stream, starting at the current stream pointer.
     * If the bytes read, in order, are
     * <code>b1</code> and <code>b2</code>, where
     * <code>0&nbsp;&lt;=&nbsp;b1,&nbsp;b2&nbsp;&lt;=&nbsp;255</code>,
     * then the result is equal to:
     * <blockquote><pre>
     *     (char)((b1 &lt;&lt; 8) | b2)
     * </pre></blockquote>
     * <p>
     * This method blocks until the two bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next two bytes of this stream as a Unicode character.
     * @exception  EOFException  if this stream reaches the end before reading
     *               two bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final char readChar() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8889);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8890);int ch1 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8891);int ch2 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8892);if (((((ch1 | ch2) < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8893)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8894)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8895);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8896);return (char)((ch1 << 8) + (ch2 << 0));
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a Unicode character from this stream in little-endian order.
     * This method reads two
     * bytes from the stream, starting at the current stream pointer.
     * If the bytes read, in order, are
     * <code>b1</code> and <code>b2</code>, where
     * <code>0&nbsp;&lt;=&nbsp;b1,&nbsp;b2&nbsp;&lt;=&nbsp;255</code>,
     * then the result is equal to:
     * <blockquote><pre>
     *     (char)((b2 &lt;&lt; 8) | b1)
     * </pre></blockquote>
     * <p>
     * This method blocks until the two bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next two bytes of this stream as a Unicode character.
     * @exception  EOFException  if this stream reaches the end before reading
     *               two bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final char readCharLE() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8897);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8898);int ch1 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8899);int ch2 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8900);if (((((ch1 | ch2) < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8901)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8902)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8903);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8904);return (char)((ch2 << 8) + (ch1 << 0));
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a signed 32-bit integer from this stream. This method reads 4
     * bytes from the stream, starting at the current stream pointer.
     * If the bytes read, in order, are <code>b1</code>,
     * <code>b2</code>, <code>b3</code>, and <code>b4</code>, where
     * <code>0&nbsp;&lt;=&nbsp;b1, b2, b3, b4&nbsp;&lt;=&nbsp;255</code>,
     * then the result is equal to:
     * <blockquote><pre>
     *     (b1 &lt;&lt; 24) | (b2 &lt;&lt; 16) + (b3 &lt;&lt; 8) + b4
     * </pre></blockquote>
     * <p>
     * This method blocks until the four bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next four bytes of this stream, interpreted as an
     *             <code>int</code>.
     * @exception  EOFException  if this stream reaches the end before reading
     *               four bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final int readInt() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8905);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8906);int ch1 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8907);int ch2 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8908);int ch3 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8909);int ch4 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8910);if (((((ch1 | ch2 | ch3 | ch4) < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8911)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8912)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8913);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8914);return ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a signed 32-bit integer from this stream in little-endian order.
     * This method reads 4
     * bytes from the stream, starting at the current stream pointer.
     * If the bytes read, in order, are <code>b1</code>,
     * <code>b2</code>, <code>b3</code>, and <code>b4</code>, where
     * <code>0&nbsp;&lt;=&nbsp;b1, b2, b3, b4&nbsp;&lt;=&nbsp;255</code>,
     * then the result is equal to:
     * <blockquote><pre>
     *     (b4 &lt;&lt; 24) | (b3 &lt;&lt; 16) + (b2 &lt;&lt; 8) + b1
     * </pre></blockquote>
     * <p>
     * This method blocks until the four bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next four bytes of this stream, interpreted as an
     *             <code>int</code>.
     * @exception  EOFException  if this stream reaches the end before reading
     *               four bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final int readIntLE() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8915);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8916);int ch1 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8917);int ch2 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8918);int ch3 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8919);int ch4 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8920);if (((((ch1 | ch2 | ch3 | ch4) < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8921)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8922)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8923);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8924);return ((ch4 << 24) + (ch3 << 16) + (ch2 << 8) + (ch1 << 0));
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads an unsigned 32-bit integer from this stream. This method reads 4
     * bytes from the stream, starting at the current stream pointer.
     * If the bytes read, in order, are <code>b1</code>,
     * <code>b2</code>, <code>b3</code>, and <code>b4</code>, where
     * <code>0&nbsp;&lt;=&nbsp;b1, b2, b3, b4&nbsp;&lt;=&nbsp;255</code>,
     * then the result is equal to:
     * <blockquote><pre>
     *     (b1 &lt;&lt; 24) | (b2 &lt;&lt; 16) + (b3 &lt;&lt; 8) + b4
     * </pre></blockquote>
     * <p>
     * This method blocks until the four bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next four bytes of this stream, interpreted as a
     *             <code>long</code>.
     * @exception  EOFException  if this stream reaches the end before reading
     *               four bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final long readUnsignedInt() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8925);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8926);long ch1 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8927);long ch2 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8928);long ch3 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8929);long ch4 = this.read();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8930);if (((((ch1 | ch2 | ch3 | ch4) < 0)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8931)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8932)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8933);throw new EOFException();
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8934);return ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    private byte[] ruileBuf = new byte[4];

    /**
     * Reads an unsigned 32-bit integer from this stream in little-endian
     * order.  This method reads 4
     * bytes from the stream, starting at the current stream pointer.
     * If the bytes read, in order, are <code>b1</code>,
     * <code>b2</code>, <code>b3</code>, and <code>b4</code>, where
     * <code>0&nbsp;&lt;=&nbsp;b1, b2, b3, b4&nbsp;&lt;=&nbsp;255</code>,
     * then the result is equal to:
     * <blockquote><pre>
     *     (b4 &lt;&lt; 24) | (b3 &lt;&lt; 16) + (b2 &lt;&lt; 8) + b1
     * </pre></blockquote>
     * <p>
     * This method blocks until the four bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next four bytes of this stream, interpreted as a
     *             <code>long</code>.
     * @exception  EOFException  if this stream reaches the end before reading
     *               four bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final long readUnsignedIntLE() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8935);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8936);this.readFully(ruileBuf);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8937);long ch1 = (ruileBuf[0] & 0xff);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8938);long ch2 = (ruileBuf[1] & 0xff);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8939);long ch3 = (ruileBuf[2] & 0xff);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8940);long ch4 = (ruileBuf[3] & 0xff);

        __CLR4_5_26sa6sam6lb4zlb.R.inc(8941);return ((ch4 << 24) + (ch3 << 16) + (ch2 << 8) + (ch1 << 0));
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a signed 64-bit integer from this stream. This method reads eight
     * bytes from the stream, starting at the current stream pointer.
     * If the bytes read, in order, are
     * <code>b1</code>, <code>b2</code>, <code>b3</code>,
     * <code>b4</code>, <code>b5</code>, <code>b6</code>,
     * <code>b7</code>, and <code>b8,</code> where:
     * <blockquote><pre>
     *     0 &lt;= b1, b2, b3, b4, b5, b6, b7, b8 &lt;=255,
     * </pre></blockquote>
     * <p>
     * then the result is equal to:
     * <p><blockquote><pre>
     *     ((long)b1 &lt;&lt; 56) + ((long)b2 &lt;&lt; 48)
     *     + ((long)b3 &lt;&lt; 40) + ((long)b4 &lt;&lt; 32)
     *     + ((long)b5 &lt;&lt; 24) + ((long)b6 &lt;&lt; 16)
     *     + ((long)b7 &lt;&lt; 8) + b8
     * </pre></blockquote>
     * <p>
     * This method blocks until the eight bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next eight bytes of this stream, interpreted as a
     *             <code>long</code>.
     * @exception  EOFException  if this stream reaches the end before reading
     *               eight bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final long readLong() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8942);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8943);return ((long)(readInt()) << 32) + (readInt() & 0xFFFFFFFFL);
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a signed 64-bit integer from this stream in little-endian
     * order. This method reads eight
     * bytes from the stream, starting at the current stream pointer.
     * If the bytes read, in order, are
     * <code>b1</code>, <code>b2</code>, <code>b3</code>,
     * <code>b4</code>, <code>b5</code>, <code>b6</code>,
     * <code>b7</code>, and <code>b8,</code> where:
     * <blockquote><pre>
     *     0 &lt;= b1, b2, b3, b4, b5, b6, b7, b8 &lt;=255,
     * </pre></blockquote>
     * <p>
     * then the result is equal to:
     * <p><blockquote><pre>
     *     ((long)b1 &lt;&lt; 56) + ((long)b2 &lt;&lt; 48)
     *     + ((long)b3 &lt;&lt; 40) + ((long)b4 &lt;&lt; 32)
     *     + ((long)b5 &lt;&lt; 24) + ((long)b6 &lt;&lt; 16)
     *     + ((long)b7 &lt;&lt; 8) + b8
     * </pre></blockquote>
     * <p>
     * This method blocks until the eight bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next eight bytes of this stream, interpreted as a
     *             <code>long</code>.
     * @exception  EOFException  if this stream reaches the end before reading
     *               eight bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final long readLongLE() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8944);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8945);int i1 = readIntLE();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8946);int i2 = readIntLE();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8947);return ((long)i2 << 32) + (i1 & 0xFFFFFFFFL);
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a <code>float</code> from this stream. This method reads an
     * <code>int</code> value, starting at the current stream pointer,
     * as if by the <code>readInt</code> method
     * and then converts that <code>int</code> to a <code>float</code>
     * using the <code>intBitsToFloat</code> method in class
     * <code>Float</code>.
     * <p>
     * This method blocks until the four bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next four bytes of this stream, interpreted as a
     *             <code>float</code>.
     * @exception  EOFException  if this stream reaches the end before reading
     *             four bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final float readFloat() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8948);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8949);return Float.intBitsToFloat(readInt());
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a <code>float</code> from this stream in little-endian order.
     * This method reads an
     * <code>int</code> value, starting at the current stream pointer,
     * as if by the <code>readInt</code> method
     * and then converts that <code>int</code> to a <code>float</code>
     * using the <code>intBitsToFloat</code> method in class
     * <code>Float</code>.
     * <p>
     * This method blocks until the four bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next four bytes of this stream, interpreted as a
     *             <code>float</code>.
     * @exception  EOFException  if this stream reaches the end before reading
     *             four bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final float readFloatLE() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8950);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8951);return Float.intBitsToFloat(readIntLE());
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a <code>double</code> from this stream. This method reads a
     * <code>long</code> value, starting at the current stream pointer,
     * as if by the <code>readLong</code> method
     * and then converts that <code>long</code> to a <code>double</code>
     * using the <code>longBitsToDouble</code> method in
     * class <code>Double</code>.
     * <p>
     * This method blocks until the eight bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next eight bytes of this stream, interpreted as a
     *             <code>double</code>.
     * @exception  EOFException  if this stream reaches the end before reading
     *             eight bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final double readDouble() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8952);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8953);return Double.longBitsToDouble(readLong());
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads a <code>double</code> from this stream in little-endian order.
     * This method reads a
     * <code>long</code> value, starting at the current stream pointer,
     * as if by the <code>readLong</code> method
     * and then converts that <code>long</code> to a <code>double</code>
     * using the <code>longBitsToDouble</code> method in
     * class <code>Double</code>.
     * <p>
     * This method blocks until the eight bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     the next eight bytes of this stream, interpreted as a
     *             <code>double</code>.
     * @exception  EOFException  if this stream reaches the end before reading
     *             eight bytes.
     * @exception  IOException   if an I/O error occurs.
     */
    public final double readDoubleLE() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8954);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8955);return Double.longBitsToDouble(readLongLE());
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads the next line of text from this stream.  This method successively
     * reads bytes from the stream, starting at the current stream pointer,
     * until it reaches a line terminator or the end
     * of the stream.  Each byte is converted into a character by taking the
     * byte's value for the lower eight bits of the character and setting the
     * high eight bits of the character to zero.  This method does not,
     * therefore, support the full Unicode character set.
     *
     * <p> A line of text is terminated by a carriage-return character
     * (<code>'&#92;r'</code>), a newline character (<code>'&#92;n'</code>), a
     * carriage-return character immediately followed by a newline character,
     * or the end of the stream.  Line-terminating characters are discarded and
     * are not included as part of the string returned.
     *
     * <p> This method blocks until a newline character is read, a carriage
     * return and the byte following it are read (to see if it is a newline),
     * the end of the stream is reached, or an exception is thrown.
     *
     * @return     the next line of text from this stream, or null if end
     *             of stream is encountered before even one byte is read.
     * @exception  IOException  if an I/O error occurs.
     */
    public final String readLine() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8956);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8957);StringBuffer input = new StringBuffer();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8958);int c = -1;
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8959);boolean eol = false;

        __CLR4_5_26sa6sam6lb4zlb.R.inc(8960);while ((((!eol)&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8961)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8962)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8963);c = read();
            boolean __CLB4_5_2_bool0=false;__CLR4_5_26sa6sam6lb4zlb.R.inc(8964);switch (c) {
            case -1:if (!__CLB4_5_2_bool0) {__CLR4_5_26sa6sam6lb4zlb.R.inc(8965);__CLB4_5_2_bool0=true;}
            case '\n':if (!__CLB4_5_2_bool0) {__CLR4_5_26sa6sam6lb4zlb.R.inc(8966);__CLB4_5_2_bool0=true;}
                __CLR4_5_26sa6sam6lb4zlb.R.inc(8967);eol = true;
                __CLR4_5_26sa6sam6lb4zlb.R.inc(8968);break;
            case '\r':if (!__CLB4_5_2_bool0) {__CLR4_5_26sa6sam6lb4zlb.R.inc(8969);__CLB4_5_2_bool0=true;}
                __CLR4_5_26sa6sam6lb4zlb.R.inc(8970);eol = true;
                __CLR4_5_26sa6sam6lb4zlb.R.inc(8971);long cur = getFilePointer();
                __CLR4_5_26sa6sam6lb4zlb.R.inc(8972);if (((((read()) != '\n')&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8973)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8974)==0&false))) {{
                    __CLR4_5_26sa6sam6lb4zlb.R.inc(8975);seek(cur);
                }
                }__CLR4_5_26sa6sam6lb4zlb.R.inc(8976);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_26sa6sam6lb4zlb.R.inc(8977);__CLB4_5_2_bool0=true;}
                __CLR4_5_26sa6sam6lb4zlb.R.inc(8978);input.append((char)c);
                __CLR4_5_26sa6sam6lb4zlb.R.inc(8979);break;
            }
        }

        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8980);if (((((c == -1) && (input.length() == 0))&&(__CLR4_5_26sa6sam6lb4zlb.R.iget(8981)!=0|true))||(__CLR4_5_26sa6sam6lb4zlb.R.iget(8982)==0&false))) {{
            __CLR4_5_26sa6sam6lb4zlb.R.inc(8983);return null;
        }
        }__CLR4_5_26sa6sam6lb4zlb.R.inc(8984);return input.toString();
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Reads in a string from this stream. The string has been encoded
     * using a modified UTF-8 format.
     * <p>
     * The first two bytes are read, starting from the current stream
     * pointer, as if by
     * <code>readUnsignedShort</code>. This value gives the number of
     * following bytes that are in the encoded string, not
     * the length of the resulting string. The following bytes are then
     * interpreted as bytes encoding characters in the UTF-8 format
     * and are converted into characters.
     * <p>
     * This method blocks until all the bytes are read, the end of the
     * stream is detected, or an exception is thrown.
     *
     * @return     a Unicode string.
     * @exception  EOFException            if this stream reaches the end before
     *               reading all the bytes.
     * @exception  IOException             if an I/O error occurs.
     * @exception  java.io.UTFDataFormatException  if the bytes do not represent
     *               valid UTF-8 encoding of a Unicode string.
     */
    public final String readUTF() throws IOException {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8985);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8986);return DataInputStream.readUTF(this);
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}

    /**
     * Releases any system resources associated with this stream
     * by calling the <code>close()</code> method.
     */
    protected void finalize() throws Throwable {try{__CLR4_5_26sa6sam6lb4zlb.R.inc(8987);
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8988);super.finalize();
        __CLR4_5_26sa6sam6lb4zlb.R.inc(8989);close();
    }finally{__CLR4_5_26sa6sam6lb4zlb.R.flushNeeded();}}
}
