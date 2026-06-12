// Last updated: 12/06/2026, 22:04:22
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    static HashMap<Integer,Integer> map;
18    static int pi;
19    public TreeNode buildTree(int[] preorder, int[] inorder) {
20        map=new HashMap<>();
21        for(int i=0;i<inorder.length;i++){
22            map.put(inorder[i],i);
23        }
24        pi=0;
25        return dfs(preorder,0,inorder.length-1);
26    }
27    static TreeNode dfs(int[] preorder,int left,int right){
28        if(left>right)  return null;
29        int rootval=preorder[pi++];
30        TreeNode root=new TreeNode(rootval);
31        int mid=map.get(rootval);
32        root.left=dfs(preorder,left,mid-1);
33        root.right=dfs(preorder,mid+1,right);
34        return root;
35    }
36}