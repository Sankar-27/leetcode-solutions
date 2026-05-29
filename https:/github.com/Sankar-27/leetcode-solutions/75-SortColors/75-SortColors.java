// Last updated: 29/05/2026, 11:59:53
class Solution {
    public void sortColors(int[] a) {
        int low=0,high=a.length-1;
        int mid=0;
        while(mid<=high){
            if(a[mid]==0){
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1)
                mid++;
            else{
                int t=a[mid];
                a[mid]=a[high];
                a[high]=t;
                high--;
            }
        }
    }
}