// Last updated: 30/06/2026, 11:05:35
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4
5        List<int[]> merged = new ArrayList<>();
6        int[] prev = intervals[0];
7
8        for(int i=1;i<intervals.length;i++){
9            int[] inter=intervals[i];
10            if(prev[1]>=inter[0]){
11                prev[1]=Math.max(prev[1],inter[1]);
12            }
13            else{
14            merged.add(prev);
15            prev=inter;
16            }
17        }
18        merged.add(prev);
19        return merged.toArray(new int[merged.size()][]); 
20    }
21}