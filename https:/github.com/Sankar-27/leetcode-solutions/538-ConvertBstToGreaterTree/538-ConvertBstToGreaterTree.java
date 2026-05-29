// Last updated: 29/05/2026, 11:56:40
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
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return root;
        }
        reverseInorder(root);
        return root;
    }
    private void reverseInorder(TreeNode root){
        if(root==null){
            return;
        }
        reverseInorder(root.right);
        root.val = root.val + sum;
        sum = root.val;
        reverseInorder(root.left);
        return;    
    }
}