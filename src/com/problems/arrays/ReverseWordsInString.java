package com.problems.arrays;

//Problem - 151
public class ReverseWordsInString {
    public String reverseWords(String str) {
        String[] s = str.replaceAll("\\s+", " ").trim().split(" ");
        int left = 0, right = s.length - 1;
        while (left < right) {
            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();
        for (String st : s) {
            sb.append(st);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();

    }
}
