// Last updated: 29/05/2026, 11:53:45
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res=0;
        for(int i=0;i<k;i++){
            char ch=blocks.charAt(i);
            if(ch=='W')
                res++;

        }
        int max=res;
        for(int i=1;i<blocks.length()-k+1;i++){
            if(blocks.charAt(i-1)=='W')
                res--;
            if(blocks.charAt(i+k-1)=='W')
                res++;
            if(res<max)
                    max=res;        

        }
        return max;
    }
}