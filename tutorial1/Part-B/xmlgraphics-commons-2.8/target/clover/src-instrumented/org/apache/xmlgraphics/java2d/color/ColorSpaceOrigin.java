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

/* $Id: ColorSpaceOrigin.java 1598621 2014-05-30 14:55:00Z ssteiner $ */

package org.apache.xmlgraphics.java2d.color;

/**
 * Interface used to decorate java.awt.color.ColorSpaces subclasses
 * to report the origin of the associated color profile.
 */
public interface ColorSpaceOrigin {

    /**
     * Returns the name of the profile used to identify the color space in a particular context.
     * @return the profile name
     */
    String getProfileName();

    /**
     * Returns the URI identifying the associate color profile.
     * @return the profile URI
     */
    String getProfileURI();

}
