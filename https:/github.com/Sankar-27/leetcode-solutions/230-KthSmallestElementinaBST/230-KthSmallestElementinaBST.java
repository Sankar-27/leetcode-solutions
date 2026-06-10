// Last updated: 10/06/2026, 22:22:01
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
16
17
18class Solution {
19    int count = 0;
20    TreeNode result = null;
21
22    public int kthSmallest(TreeNode root, int k) {
23        helper(root, k);
24        return result.val;
25    }
26
27    private void helper(TreeNode node, int k) {
28        if (node == null) return;
29
30        helper(node.left, k);      
31        count++;                   
32        if (count == k) {
33            result = node;
34            return;
35        }
36        helper(node.right, k);     
37    }
38}