// Last updated: 11/06/2026, 22:33:37
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int ans = 0;
4        int n = s.length();
5        for (char c = 'A'; c <= 'Z'; c++) {
6            int i = 0, j = 0, replaced = 0;
7            while (j < n) {
8                if (s.charAt(j) == c) {
9                    j++;
10                } else if (replaced < k) {
11                    j++;
12                    replaced++;
13                } else if (s.charAt(i) == c) {
14                    i++;
15                } else {
16                    i++;
17                    replaced--;
18                }
19                ans = Math.max(ans, j - i);
20            }
21        }
22        return ans;
23    }
24}