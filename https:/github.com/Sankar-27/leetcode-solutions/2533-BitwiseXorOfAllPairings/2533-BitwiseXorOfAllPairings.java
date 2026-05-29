// Last updated: 29/05/2026, 11:53:41
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int x1=0,x2=0;
        if(n1%2==1){
            for(int i=0;i<n2;i++){
                x2=x2^nums2[i];
            }
        }
        if(n2%2==1){
            for(int i=0;i<n1;i++){
                x1=x1^nums1[i];
            }
        }
        return x2^x1;
    }
}