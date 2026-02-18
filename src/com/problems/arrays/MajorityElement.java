package com.problems.arrays;

//Problem - 169
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int curr = nums[0], freq = 0;
        for (int i : nums) {
            if (i == curr) freq++;
            else freq--;

            if (freq < 0) {
                curr = i;
                freq = 0;
            }

        }
        return curr;
    }
}
