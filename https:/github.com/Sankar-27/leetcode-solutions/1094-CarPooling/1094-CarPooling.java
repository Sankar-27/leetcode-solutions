// Last updated: 17/06/2026, 22:47:20
1class Solution {
2    public boolean carPooling(int[][] bookings, int capacity) {
3        int[] res=new int[1001];
4        for(int i=0;i<bookings.length;i++){
5            int start=bookings[i][1];
6            int end=bookings[i][2];
7            int increament=bookings[i][0];
8            res[start]+=increament;
9            res[end]-=increament;
10        }
11         int currentPassengers = 0;
12        for (int i = 0; i < res.length; i++) {
13            currentPassengers += res[i];
14            // Capacity must be checked at every point, including start
15            if (currentPassengers > capacity) {
16                return false;
17            }
18        }
19        return true;
20    }
21}