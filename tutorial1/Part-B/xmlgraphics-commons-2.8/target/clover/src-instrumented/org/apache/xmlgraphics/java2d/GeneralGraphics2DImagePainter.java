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

/* $Id: GeneralGraphics2DImagePainter.java 1812121 2017-10-13 12:12:29Z ssteiner $ */

package org.apache.xmlgraphics.java2d;

import java.awt.Graphics2D;

import org.apache.xmlgraphics.ps.PSGenerator;

public interface GeneralGraphics2DImagePainter extends Graphics2DImagePainter {
    Graphics2D getGraphics(boolean textAsShapes, PSGenerator gen);
    void addFallbackFont(String name, Object font);
}
