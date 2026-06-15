package com.problems.hashmap;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int output = 0;
        for (int i : nums) set.add(i);
        for (int i : nums) {
            if (!set.contains(i - 1)) {
                int len = 0;
                while (set.remove(i++)) len++;
                output = Math.max(output, len);
            }
        }
        return output;
    }
}
