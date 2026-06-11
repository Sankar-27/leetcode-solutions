// Last updated: 11/06/2026, 22:30:46
1class Solution {
2    public int findLongestChain(int[][] pairs) {
3        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
4
5        int[] prev = pairs[0];
6        int res = 1;
7
8        for (int i = 1; i < pairs.length; i++) {
9            int[] cur = pairs[i];
10            if (cur[0] > prev[1]) {
11                res++;
12                prev = cur;
13            }
14        }
15
16        return res;        
17    }
18}