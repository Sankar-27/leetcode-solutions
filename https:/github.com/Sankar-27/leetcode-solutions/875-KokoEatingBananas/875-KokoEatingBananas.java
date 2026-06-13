// Last updated: 13/06/2026, 12:09:05
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        
4        int min = 1, max = Arrays.stream(piles).max().getAsInt();
5        int ans = max;
6
7        while (min <= max) {
8            int mid = min + (max - min) / 2;
9            long hours = 0;
10
11            for (int pile : piles) {
12                hours += (pile + mid - 1) / mid; // Ceiling division
13            }
14
15            if (hours <= h) {
16                ans = mid;
17                max = mid - 1; // Try smaller speed
18            } else {
19                min = mid + 1; // Need faster speed
20            }
21        }
22
23        return ans;
24    }
25}