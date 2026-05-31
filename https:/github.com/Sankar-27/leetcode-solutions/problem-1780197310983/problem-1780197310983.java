// Last updated: 31/05/2026, 08:45:10
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int res=0;
4        HashMap<Integer,Integer> map=new HashMap<>();
5        while(n>0){
6            int rem=n%10;
7            map.put(rem,map.getOrDefault(rem,0)+1);
8            n/=10;
9        }
10
11        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
12            int sum=entry.getKey()*entry.getValue();
13            res+=sum;
14        }
15        return res;
16    }
17}