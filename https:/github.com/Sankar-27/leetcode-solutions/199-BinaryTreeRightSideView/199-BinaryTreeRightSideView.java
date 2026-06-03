// Last updated: 03/06/2026, 23:24:07
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> result = new ArrayList<>();
19        if (root == null) return result;
20
21        Queue<TreeNode> q = new LinkedList<>();
22        q.add(root);
23        while (!q.isEmpty()) {
24            int n=q.size();
25            for(int i=0;i<n;i++){
26                TreeNode node = q.poll();
27                if(i==n-1)  result.add(node.val);
28                //result.add(node.val);
29            if (node.left != null)
30                q.add(node.left);
31            if (node.right != null)
32                q.add(node.right);
33            }
34        }
35        return result;
36    }
37}