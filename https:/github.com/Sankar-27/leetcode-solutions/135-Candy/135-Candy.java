// Last updated: 02/06/2026, 12:36:35
1class Solution {
2    public int candy(int[] a) {
3        int n=a.length;
4        if(n==0) return 0;
5       int[] c=new int[n];
6       Arrays.fill(c,1);
7       for(int i=1;i<n;i++){
8           if(a[i]>a[i-1]){
9               c[i]=c[i-1]+1;
10           }
11       }
12       for(int i=n-2;i>=0;i--){
13           if(a[i]>a[i+1]){
14               c[i]=Math.max(c[i],c[i+1]+1);
15           }
16       }
17       int res=0;
18       for(int i=0;i<n;i++){
19           res+=c[i];
20       }
21       return res;
22    }
23}