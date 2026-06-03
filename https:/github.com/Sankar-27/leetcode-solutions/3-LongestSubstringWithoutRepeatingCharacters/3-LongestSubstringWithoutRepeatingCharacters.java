// Last updated: 03/06/2026, 23:19:58
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n=s.length();
4        int left=0;
5        HashSet<Character> set=new HashSet<>();
6        int res=0;
7        for(int right=0;right<n;right++){
8            while(set.contains(s.charAt(right))){
9                set.remove(s.charAt(left));
10                left++;
11            }
12            set.add(s.charAt(right));
13            res=Math.max(res,right-left+1);
14        }
15        return res;
16    }
17}