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

/* $Id: DSCParserConstants.java 750418 2009-03-05 11:03:54Z vhennebert $ */

package org.apache.xmlgraphics.ps.dsc;

/**
 * Constants the DSC parser uses.
 */
public interface DSCParserConstants {

    /** Indicates a header comment (starting with "%!") */
    int HEADER_COMMENT = 0;
    /** Indicates a DSC comment (starting with "%%") */
    int DSC_COMMENT = 1;
    /** Indicates a normal PostScript comment (starting with "%") */
    int COMMENT = 2;
    /** Indicates a normal PostScript line */
    int LINE = 3;
    /** Indicates the end of the file (equivalent to the "%%EOF" DSC comment) */
    int EOF = 4;

}
