// Last updated: 29/05/2026, 11:55:17

class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums;
        }
        int mid=n/2;
        int[] a=Arrays.copyOfRange(nums,0,mid);
        int[] b=Arrays.copyOfRange(nums,mid,n);
        int[] a_nums=sortArray(a);
        int[] b_nums=sortArray(b);
        int[] sorted_array=new int[n];
        int i=0,j=0,k=0;
        while(i<a_nums.length && j<b_nums.length){
            if(a_nums[i]<b_nums[j]){
                sorted_array[k]=a_nums[i];
                i++;
                k++;
            }
            else{
                sorted_array[k]=b_nums[j];
                j++;
                k++;
            }
        }
        while(i<a_nums.length){
            sorted_array[k]=a_nums[i];
                i++;
                k++;
        }
        while(j<b_nums.length){
            sorted_array[k]=b_nums[j];
                j++;
                k++;
        }
        return sorted_array;
    }
}