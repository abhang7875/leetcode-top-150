package com.problems.hashmap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ransom[] = new int[26];
        int mag[] = new int[26];
        for (char ch : ransomNote.toCharArray()) ransom[ch - 'a']++;
        for (char ch : magazine.toCharArray()) mag[ch - 'a']++;

        for (int i = 0; i < 26; i++) if (ransom[i] > mag[i]) return false;
        return true;
    }
}
