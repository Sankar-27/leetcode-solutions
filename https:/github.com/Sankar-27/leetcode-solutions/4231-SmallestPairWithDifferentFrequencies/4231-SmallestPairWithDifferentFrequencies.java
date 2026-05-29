// Last updated: 29/05/2026, 11:53:18
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> values=new ArrayList<>(map.keySet());
        Collections.sort(values);
        for(int i=0;i<values.size();i++){
            int x=values.get(i);
            int fx=map.get(x);
            for(int j=i+1;j<values.size();j++){
                int y=values.get(j);
                int fy=map.get(y);

                if(fx != fy)
                    return new int[]{x,y};
            }
        }
        return new int[]{-1,-1};
    }
}