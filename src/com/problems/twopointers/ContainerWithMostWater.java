package com.problems.twopointers;

//Problem - 11
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int output = 0;
        while (left < right) {
            if (height[left] > height[right]) {
                output = Math.max(output, Math.min(height[left], height[right]) * (right - left));
                right--;
            } else {
                output = Math.max(output, Math.min(height[right], height[left]) * (right - left));
                left++;
            }
        }
        return output;
    }
}
