// Last updated: 29/05/2026, 11:59:12
class Solution {
    public int candy(int[] a) {
        int n=a.length;
        if(n==0) return 0;
       int[] c=new int[n];
       Arrays.fill(c,1);
       for(int i=1;i<n;i++){
           if(a[i]>a[i-1]){
               c[i]=c[i-1]+1;
           }
       }
       for(int i=n-2;i>=0;i--){
           if(a[i]>a[i+1]){
               c[i]=Math.max(c[i],c[i+1]+1);
           }
       }
       int res=0;
       for(int i=0;i<n;i++){
           res+=c[i];
       }
       return res;
    }
}