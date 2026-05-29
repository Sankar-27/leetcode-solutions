// Last updated: 29/05/2026, 11:56:31
class Solution {
    public int distributeCandies(int[] a) {
        int n=a.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int z=n/2;
        if(z==map.size() || map.size()>z)   return z;
        return map.size();
    }
}