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

/* $Id: GlyphsTestCase.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.fonts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Tests for the Glyphs class.
 */
public class GlyphsTestCase {

        @Test
        public void testGetUnicodeSequenceForGlyphName() throws Exception {
                String glyph;
                String unicodes;

                glyph = "Omega";
                unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
                assertEquals(1, unicodes.length());
                assertEquals("Must contain 2126 - OHM SIGN",
                                unicodes.charAt(0), '\u2126');

                glyph = "Omegagreek";
                unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
                assertEquals(1, unicodes.length());
                assertEquals("Must contain 03A9 - GREEK CAPITAL LETTER OMEGA",
                                unicodes.charAt(0), '\u03A9');

                glyph = "A";
                unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
                assertEquals(1, unicodes.length());
                assertEquals("Must contain 0041 - LATIN CAPITAL LETTER A",
                                unicodes.charAt(0), '\u0041');

                glyph = "rehyehaleflamarabic";
                unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
                assertEquals(4, unicodes.length());
                assertEquals("Expected 0631 - ARABIC LETTER REH at position 0",
                                unicodes.charAt(0), '\u0631');
                assertEquals("Expected FEF3 - ARABIC LETTER YEH INITAL FORM at position 1",
                                unicodes.charAt(1), '\uFEF3');
                assertEquals("Expected FE8E - ARABIC LETTER ALEF FINAL FORM at position 2",
                                unicodes.charAt(2), '\uFE8E');
                assertEquals("Expected 0644 - ARABIC LETTER LAM at position 3",
                                unicodes.charAt(3), '\u0644');

                glyph = "Lcommaaccent_uni20AC0308_u20AC";
                unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
                assertEquals(4, unicodes.length());
                assertEquals("Must contain 013B",
                                unicodes.charAt(0), '\u013B');
                assertEquals("Must contain 20AC",
                                unicodes.charAt(1), '\u20AC');
                assertEquals("Must contain 0308",
                                unicodes.charAt(2), '\u0308');
                assertEquals("Must contain 20AC",
                                unicodes.charAt(3), '\u20AC');

                glyph = "blah";
                unicodes = Glyphs.getUnicodeSequenceForGlyphName(glyph);
                assertNull(unicodes);
        }

        @Test
        public void testGetCharNameAlternativesFor() throws Exception {
                String[] alts = Glyphs.getCharNameAlternativesFor("Omega");
                assertEquals(1, alts.length);
                assertEquals("Omegagreek", alts[0]);

                alts = Glyphs.getCharNameAlternativesFor("nbspace");
                assertEquals(2, alts.length);
                assertEquals("space", alts[0]);
                assertEquals("nonbreakingspace", alts[1]);

                alts = Glyphs.getCharNameAlternativesFor("A");
                assertNull(alts);
        }

        @Test
        public void testCharToGlyphName() {
                // This test case adds coverage for the method charToGlyphName.

                // Test basic ASCII characters
                assertEquals("A", Glyphs.charToGlyphName('A'));
                assertEquals("backslash", Glyphs.charToGlyphName('\\'));
                // Test special characters
                assertEquals("Omegagreek", Glyphs.charToGlyphName('\u03A9')); // Ω (GREEK CAPITAL LETTER OMEGA)
        }
}
