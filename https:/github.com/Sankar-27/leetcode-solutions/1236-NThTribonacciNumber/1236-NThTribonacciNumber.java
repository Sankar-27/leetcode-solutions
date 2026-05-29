// Last updated: 29/05/2026, 11:54:48
class Solution {
    public int tribonacci(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return memoTribonacci(n, memo);
    }

    private int memoTribonacci(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) { return memo.get(n); }

        int result;
        if (n == 0) { 
            result = 0; 
        } else if (n == 1 || n == 2) { 
            result = 1; 
        } else {
            result = memoTribonacci(n-1, memo) + memoTribonacci(n-2, memo) + memoTribonacci(n-3, memo);
        }

        memo.put(n, result);
        return result;
    }
}