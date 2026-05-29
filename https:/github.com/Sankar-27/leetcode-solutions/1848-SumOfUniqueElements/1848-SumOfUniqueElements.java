// Last updated: 29/05/2026, 11:54:03
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int key=e.getKey();
            int val=e.getValue();
            if(val==1)
                sum+=key;
        }
        return sum;
    }
}