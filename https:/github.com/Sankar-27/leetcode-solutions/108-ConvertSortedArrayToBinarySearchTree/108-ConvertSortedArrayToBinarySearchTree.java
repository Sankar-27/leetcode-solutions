// Last updated: 29/05/2026, 11:59:31
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
    public TreeNode sortedArrayToBST(int[] nums) {
        int s=0;
        int e = nums.length-1;
     
        
        return tree(nums,s,e);

    }
    public TreeNode tree( int[] nums , int s,int e){
        if(s>e) return null;
        int m = (s+e)/2;
        TreeNode n = new TreeNode(nums[m]);
        n.left = tree(nums,s,m-1);
        n.right = tree(nums,m+1,e);
        return n;
        

    }
}