// Last updated: 15/07/2026, 08:47:32
class Solution {
    public int largestAltitude(int[] gain) {
        int res=0;
        for(int i=1;i<gain.length;i++){
            gain[i]=gain[i]+gain[i-1];
        }
        int max=0;
        for(int i:gain){
            if(i>max)
                max=i;
        }
        return max;
    }
}