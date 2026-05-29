// Last updated: 29/05/2026, 11:58:20
class Solution {
    public int findKthLargest(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);        
        return arr[arr.length-k];
    }
}