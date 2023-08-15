/*
 * OpenFGA
 * A high performance and flexible authorization/permission engine built for developers and inspired by Google Zanzibar.
 *
 * The version of the OpenAPI document: 0.1
 * Contact: community@openfga.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package dev.openfga.util;

import static dev.openfga.util.StringUtil.isNullOrWhitespace;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilTest {
    @Test
    public void isNullOrWhitespace_someContent_false() {
        assertFalse(isNullOrWhitespace("abc"));
    }

    @Test
    public void isNullOrWhitespace_null_true() {
        assertTrue(isNullOrWhitespace(null));
    }

    @Test
    public void isNullOrWhitespace_empty_true() {
        assertTrue(isNullOrWhitespace(""));
    }

    @Test
    public void isNullOrWhitespace_singleSpace_true() {
        assertTrue(isNullOrWhitespace(" "));
    }

    @Test
    public void isNullOrWhitespace_multipleSpace_true() {
        assertTrue(isNullOrWhitespace(" "));
    }

    @Test
    public void isNullOrWhitespace_multipleOtherWhitespace_true() {
        assertTrue(isNullOrWhitespace(" \t\r\n"));
    }
}