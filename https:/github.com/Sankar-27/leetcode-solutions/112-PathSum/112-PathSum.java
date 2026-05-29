// Last updated: 29/05/2026, 11:59:27
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
    static boolean dfs(TreeNode root,int sum,int target){
        if(root==null)
            return false;
        if(root.left==null && root.right==null)
            return sum+root.val==target;
        sum+=root.val;
        return dfs(root.left,sum,target) || dfs(root.right,sum,target);        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,0,targetSum);
    }
}