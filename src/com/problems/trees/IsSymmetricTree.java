package com.problems.trees;

public class IsSymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode right, TreeNode left) {
        if (left == null || right == null) return left == right;
        if (left.val != right.val) return false;
        return helper(right.right, left.left) && helper(right.left, left.right);
    }
}
