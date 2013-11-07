/**
 * Copyright 2013 MIR@MU Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package cz.muni.fi.mir.mathmlcanonicalization.modules;

import org.junit.Test;

/**
 * Test for MrowNormalizer canonicalization DOM Module.
 *
 * @author David Formanek
 */
public class MrowNormalizerTest extends AbstractModuleTest {

    private static final Module DEFAULT_INSTANCE = new MrowNormalizer();
    private static final Module CONFIGURED_INSTANCE = new MrowNormalizer();

    public MrowNormalizerTest() {
        CONFIGURED_INSTANCE.setProperty("open", "left");
        CONFIGURED_INSTANCE.setProperty("close", "right");
    }

    @Test
    public void testSquareRoot() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/sqrt");
    }

    @Test
    public void testTuple() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/tuple");
    }

    @Test
    public void testParentheses1() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/parentheses1");
    }

    @Test
    public void testParentheses2() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/parentheses2");
    }

    @Test
    public void testParentheses3() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/parentheses3");
    }

    @Test
    public void testParentheses4() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/parentheses4");
    }

    @Test
    public void testParentheses5() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/parentheses5");
    }

    @Test
    public void testInterval() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/interval");
    }

    @Test
    public void testFrac() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/frac");
    }

    @Test
    public void testMixed1() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/mixed1");
    }

    @Test
    public void testMixed2() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/mixed2");
    }

    @Test
    public void testMixed3() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/mixed3");
    }

    @Test
    public void testMixed4() {
        testXML(DEFAULT_INSTANCE, "mrowNormalizer/mixed4");
    }

    @Test
    public void testConfigured() {
        testXML(CONFIGURED_INSTANCE, "mrowNormalizer/configured");
    }
}