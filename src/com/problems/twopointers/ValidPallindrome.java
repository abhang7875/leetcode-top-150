package com.problems.twopointers;

//Problem - 125
public class ValidPallindrome {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right) {
            while (left < right && !isAlphaNumeric(s.charAt(left))) left++;
            while (left < right && !isAlphaNumeric(s.charAt(right))) right--;
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }
}
