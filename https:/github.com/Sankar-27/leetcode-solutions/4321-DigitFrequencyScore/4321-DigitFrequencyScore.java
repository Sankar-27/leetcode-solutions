// Last updated: 15/07/2026, 08:46:59
class Solution {
    public int digitFrequencyScore(int n) {
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n>0){
            int rem=n%10;
            map.put(rem,map.getOrDefault(rem,0)+1);
            n/=10;
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            int sum=entry.getKey()*entry.getValue();
            res+=sum;
        }
        return res;
    }
}