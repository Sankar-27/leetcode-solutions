// Last updated: 29/05/2026, 11:59:33
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
    static HashMap<Integer,Integer> map;
    static int pi;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        pi=0;
        return dfs(preorder,0,inorder.length-1);
    }
    static TreeNode dfs(int[] preorder,int left,int right){
        if(left>right)  return null;
        int rootval=preorder[pi++];
        TreeNode root=new TreeNode(rootval);
        int mid=map.get(rootval);
        root.left=dfs(preorder,left,mid-1);
        root.right=dfs(preorder,mid+1,right);
        return root;
    }
}