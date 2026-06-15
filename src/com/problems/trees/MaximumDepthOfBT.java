package com.problems.trees;

public class MaximumDepthOfBT {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int right = 1 + maxDepth(root.left);
        int left = 1 + maxDepth(root.right);
        return Math.max(left, right);
    }
}
