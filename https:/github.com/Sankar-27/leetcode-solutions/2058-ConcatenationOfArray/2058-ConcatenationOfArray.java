// Last updated: 29/05/2026, 11:53:57
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] res=new int[2*n];
        int mid=(2*n)/2;
        for(int i=0;i<n;i++){
            res[i]=nums[i];
            res[mid+i]=nums[i];
        }
        return res;
    }
}