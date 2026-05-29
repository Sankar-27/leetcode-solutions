// Last updated: 29/05/2026, 11:54:57
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
    public int maxLevelSum(TreeNode root) {
        if(root==null)  return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int maxsum=Integer.MIN_VALUE,maxlevel=1,currlevel=1;
        while(!q.isEmpty()){
            int n=q.size();
            int currsum=0;
            for(int i=0;i<n;i++){
                TreeNode x=q.poll();
                currsum+=x.val;
                if(x.left!=null) q.add(x.left);
                if(x.right!=null)    q.add(x.right);
            }
            if(currsum>maxsum){
                maxsum=currsum;
                maxlevel=currlevel;
            }
            currlevel++;
        }
        return maxlevel;
    }
}