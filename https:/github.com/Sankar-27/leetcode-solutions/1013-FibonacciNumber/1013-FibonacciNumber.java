// Last updated: 29/05/2026, 11:55:10
class Solution {
    public int fib(int n) {
        if (n<2)    return n;
        return fib(n-1)+fib(n-2);
    }
}