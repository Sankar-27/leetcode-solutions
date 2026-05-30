// Last updated: 30/05/2026, 09:33:03
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
17    public List<Double> averageOfLevels(TreeNode root) {
18        List<Double> res = new ArrayList<>();
19        if (root == null) return res;
20
21        Queue<TreeNode> queue = new LinkedList<>();
22        queue.add(root);
23
24        while (!queue.isEmpty()) {
25            int level = queue.size();
26            double sum = 0.0;
27
28            for (int i = 0; i < level; i++) {
29                TreeNode curr = queue.poll();
30                sum += curr.val;
31                if (curr.left != null) queue.offer(curr.left);
32                if (curr.right != null) queue.offer(curr.right);
33            }
34
35            res.add(sum / level);
36        }
37
38        return res;
39    }
40}