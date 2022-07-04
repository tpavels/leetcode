package com.tpavels.arrays;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramTest {

    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void test_true() {
        boolean anagram = validAnagram.isAnagram("anagram", "nagaram");
        assertTrue(anagram);
    }

    @Test
    void test_false() {
        boolean anagram = validAnagram.isAnagram("rat", "car");
        assertFalse(anagram);
    }

    @Test
    void test_empty() {
        boolean anagram = validAnagram.isAnagram("", "");
        assertTrue(anagram);
    }

    @Test
    void test_not_equal_length() {
        boolean anagram = validAnagram.isAnagram("abc", "dg");
        assertFalse(anagram);
    }

    @Test
    void test_not_equal_length_reverse() {
        boolean anagram = validAnagram.isAnagram("dg", "abc");
        assertFalse(anagram);
    }

    @Test
    void test_same() {
        boolean anagram = validAnagram.isAnagram("abc", "abc");
        assertTrue(anagram);
    }

    @Test
    void test_different_chars() {
        boolean anagram = validAnagram.isAnagram("aabb", "bbab");
        assertFalse(anagram);
    }

    @Test
    void test_long_true() {
        String s = RandomStringUtils.random(5_0000, true, false).toLowerCase();
        char c0 = s.charAt(0);
        char c100 = s.charAt(100);
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.setCharAt(0, c100);
        stringBuilder.setCharAt(100, c0);
        String t = stringBuilder.toString();
        boolean anagram = validAnagram.isAnagram(s, t);
        assertTrue(anagram);
    }
}