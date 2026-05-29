// Last updated: 29/05/2026, 11:58:00
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int res[] = new int[l];

        // Step 1: Calculate the product of all numbers to the left of the current index.
        // We'll store this in our 'res' array.
        int prefixProduct = 1;
        for (int i = 0; i < l; i++) {
            res[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        // Step 2: Now, multiply by the product of all numbers to the right.
        // We do this by iterating backwards.
        int suffixProduct = 1;
        for (int i = l - 1; i >= 0; i--) {
            res[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        
        return res;
    }
}