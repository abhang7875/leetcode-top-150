package com.problems.arrays;

// Problem - 28
public class IndexOfFirstOccurance {
    public int strStr(String haystack, String needle) {
        int h = haystack.length(), n = needle.length();
        for (int i = 0; i <= h - n; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 1;
                for (; j < n; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) break;
                }
                if (j == n) return i;
            }
        }
        return -1;
    }
}
