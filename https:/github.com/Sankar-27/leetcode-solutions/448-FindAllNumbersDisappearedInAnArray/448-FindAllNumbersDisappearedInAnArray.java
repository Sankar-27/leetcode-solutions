// Last updated: 29/05/2026, 11:57:09
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        Set<Integer> set= new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        for(int j=1;j<=nums.length;j++){
            if(!set.contains(j)){
                arr.add(j);
            }
        }
        return arr;
    }
}