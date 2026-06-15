// Last updated: 15/06/2026, 22:51:44
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
17    TreeNode curr=null;
18    public void flatten(TreeNode root) {
19        if(root==null)
20            return;
21        flatten(root.right);
22        flatten(root.left);
23        root.right=curr;
24        root.left=null;
25        curr=root;
26    }
27}