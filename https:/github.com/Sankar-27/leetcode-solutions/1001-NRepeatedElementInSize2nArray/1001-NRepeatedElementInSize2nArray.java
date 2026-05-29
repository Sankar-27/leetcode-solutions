// Last updated: 29/05/2026, 11:55:11
class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int key=e.getKey();
            int i=e.getValue();
            if(i==n && map.size()==n+1)
                return key;
        }
        return -1;
    }
}