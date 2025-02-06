/*
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

/* $Id: MimeEnabledImageFlavorTestCase.java 1732018 2016-02-24 04:51:06Z gadams $ */

package test.java.org.apache.xmlgraphics.image.loader;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.apache.xmlgraphics.image.loader.ImageFlavor;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.xmlgraphics.image.loader.MimeEnabledImageFlavor;

/**
 * Tests for the MimeEnabledImageFlavor class.
 */
public class MimeEnabledImageFlavorTestCase {
    @Test
    public void testEqualsWithNull() {
        MimeEnabledImageFlavor flavor = new MimeEnabledImageFlavor(new ImageFlavor("test"), "image/png");
        assertFalse(flavor.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() {
        MimeEnabledImageFlavor flavor = new MimeEnabledImageFlavor(new ImageFlavor("test"), "image/png");
        assertFalse(flavor.equals(new Object()));
    }

    @Test
    public void testEqualsWithDifferentContent() {
        MimeEnabledImageFlavor flavor1 = new MimeEnabledImageFlavor(new ImageFlavor("test1"), "image/png");
        MimeEnabledImageFlavor flavor2 = new MimeEnabledImageFlavor(new ImageFlavor("test2"), "image/jpeg");
        assertFalse(flavor1.equals(flavor2));
    }

    @Test
    public void testEqualsWithSameContent() {
        ImageFlavor parentFlavor = new ImageFlavor("test");
        MimeEnabledImageFlavor flavor1 = new MimeEnabledImageFlavor(parentFlavor,
                "image/png");
        MimeEnabledImageFlavor flavor2 = new MimeEnabledImageFlavor(parentFlavor,
                "image/png");
        assertTrue(flavor1.equals(flavor2));
    }
}
