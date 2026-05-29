// Last updated: 29/05/2026, 11:55:13
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
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return range(root, low, high);
    }
    public int range(TreeNode root, int low, int high){
        if(root==null)  return 0;
        if(root.val<low)
            return range(root.right,low,high);
        if(root.val>high)
            return range(root.left,low,high);
        return root.val+range(root.left,low,high)+range(root.right,low,high);
    }
}