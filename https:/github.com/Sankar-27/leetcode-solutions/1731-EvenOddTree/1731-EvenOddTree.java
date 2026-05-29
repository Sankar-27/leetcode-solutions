// Last updated: 29/05/2026, 11:54:10
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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean even = true;
        while(!q.isEmpty()){
            int s = q.size();
            int prev = even ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for(int i=0; i<s; i++){
                TreeNode node = q.poll();
                int data = node.val;
                if(even){
                    if(prev >= data || data % 2 ==0){
                        return false;
                    }
                }
                else{
                    if(prev <= data || data % 2 !=0){
                        return false;
                    }
                }
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                prev = data; 
            }
            even = !even;
        }
        return true;
    }
}