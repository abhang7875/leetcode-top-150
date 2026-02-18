package com.problems.arrays;

// Problem - 26
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int z = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[z]) {
                nums[++z] = nums[i];
            }
        }
        return z+1;
    }
}
