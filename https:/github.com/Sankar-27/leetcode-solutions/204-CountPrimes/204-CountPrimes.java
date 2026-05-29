// Last updated: 29/05/2026, 11:58:27
class Solution {
    public int countPrimes(int n){
        if(n<=2)
            return 0;
        boolean[] p=new boolean[n];
        Arrays.fill(p,true);
        p[0]=false;
        p[1]=false;
        for(int i=2;i*i<n;i++){
            if(p[i]){
                for(int j=i*i;j<n;j=j+i){
                    p[j]=false;
                }
            }
        }
        int count=0;
        for(boolean prime:p){
            if(prime)
                count++;
        }
        return count;
    }
}