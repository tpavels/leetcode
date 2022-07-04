package com.tpavels.arrays;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

// 242
public class ValidAnagram {
    /*
        Runtime: 6 ms, faster than 62.25% of Java online submissions for Valid Anagram.
        Memory Usage: 43.3 MB, less than 73.80% of Java online submissions for Valid Anagram.
     */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        byte[] bytesOfS = s.getBytes();
        byte[] bytesOfT = t.getBytes();
        Arrays.sort(bytesOfS);
        Arrays.sort(bytesOfT);
        return Arrays.equals(bytesOfS, bytesOfT);
    }
}
