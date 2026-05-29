// Last updated: 29/05/2026, 11:54:49
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res=new int[n];
        for(int i=0;i<bookings.length;i++){
            int start=bookings[i][0]-1;
            int end=bookings[i][1]-1;
            int increament=bookings[i][2];
            res[start]+=increament;
            if(end+1<res.length){
                res[end+1]-=increament;
            }
        }
        for(int i=1;i<res.length;i++){
            res[i]+=res[i-1];
        }
        return res;
    }
}