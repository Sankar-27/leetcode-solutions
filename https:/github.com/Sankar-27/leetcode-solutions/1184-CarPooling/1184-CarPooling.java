// Last updated: 29/05/2026, 11:54:51
class Solution {
    public boolean carPooling(int[][] bookings, int capacity) {
        int[] res=new int[1001];
        for(int i=0;i<bookings.length;i++){
            int start=bookings[i][1];
            int end=bookings[i][2];
            int increament=bookings[i][0];
            res[start]+=increament;
            res[end]-=increament;
        }
         int currentPassengers = 0;
        for (int i = 0; i < res.length; i++) {
            currentPassengers += res[i];
            // Capacity must be checked at every point, including start
            if (currentPassengers > capacity) {
                return false;
            }
        }
        return true;
    }
}