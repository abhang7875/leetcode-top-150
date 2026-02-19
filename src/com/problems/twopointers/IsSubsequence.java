package com.problems.twopointers;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int s1 = 0, t1 = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s1 == s.length()) return true;
            if (s.charAt(s1) == t.charAt(i)) s1++;
        }
        return s1 == s.length();
    }
}
