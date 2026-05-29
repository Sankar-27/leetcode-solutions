// Last updated: 29/05/2026, 11:54:31
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */class Solution {

    class Data {
        int sum;
        int min;
        int max;
        boolean isBST;

        Data(int sum, int min, int max, boolean isBST) {
            this.sum = sum;
            this.min = min;
            this.max = max;
            this.isBST = isBST;
        }
    }

    int maxSum = 0;

    public Data helper(TreeNode root) {
        if (root == null) {
            // Empty subtree is a BST with sum 0
            return new Data(0, Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }

        Data left = helper(root.left);
        Data right = helper(root.right);

        // Check BST validity
        if (left.isBST && right.isBST && root.val > left.max && root.val < right.min) {
            int sum = root.val + left.sum + right.sum;
            maxSum = Math.max(maxSum, sum);
            int min = Math.min(root.val, left.min);
            int max = Math.max(root.val, right.max);
            return new Data(sum, min, max, true);
        }

        // Invalid BST
        return new Data(0, 0, 0, false);
    }

    public int maxSumBST(TreeNode root) {
        helper(root);
        return maxSum;
    }
}