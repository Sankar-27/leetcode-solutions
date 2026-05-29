// Last updated: 29/05/2026, 11:55:23
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
    public void helper(TreeNode root,List<Integer> li){
        if(root==null)
        return;
        helper(root.left,li);
        li.add(root.val);
        helper(root.right,li);
    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        helper(root,li);
        TreeNode ans=new TreeNode(li.remove(0));
        TreeNode temp=ans;
        int len=li.size();
        for(int i=0;i<len;i++){
            temp.right=new TreeNode(li.remove(0));
            temp=temp.right;
        }
        return ans;
    }
}