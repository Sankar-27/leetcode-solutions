// Last updated: 29/05/2026, 11:57:25
class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int temp = (a&b)<<1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}