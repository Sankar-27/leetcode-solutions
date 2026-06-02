// Last updated: 02/06/2026, 20:21:26
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int[][] cache = new int[word1.length() + 1][word2.length() + 1];
4
5        for (int i = 0; i <= word1.length(); i++) {
6            for (int j = 0; j <= word2.length(); j++) {
7                cache[i][j] = -1;
8            }
9        }
10
11        return dp(word1, word2, word1.length(), word2.length(), cache);      
12    }
13
14    private int dp(String word1, String word2, int i, int j, int[][] cache) {
15        if (i == 0) return j;
16        if (j == 0) return i;
17        if (cache[i][j] != -1) return cache[i][j];
18
19        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
20            cache[i][j] = dp(word1, word2, i - 1, j - 1, cache);
21        } else {
22            cache[i][j] = 1 + Math.min(
23                dp(word1, word2, i - 1, j, cache),        // Delete
24                Math.min(
25                    dp(word1, word2, i, j - 1, cache),    // Insert
26                    dp(word1, word2, i - 1, j - 1, cache) // Replace
27                )
28            );
29        }
30
31        return cache[i][j];
32    }   
33}