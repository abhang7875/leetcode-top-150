package com.problems.arrays;

//Problem - 58
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String temp[] =  s.trim().split(" ");
        return temp[temp.length - 1].length();
    }
}
