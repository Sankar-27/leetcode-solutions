// Last updated: 29/05/2026, 12:00:41
class Solution {
    void solve(int open, int close, String temp, List<String> res) {
        if (open == 0 && close == 0) {
            res.add(temp);
            return;
        }
        if (open != 0)
            solve(open - 1, close, temp + "(", res);
        if (close > open)
            solve(open, close - 1, temp + ")", res);
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve(n, n, "", res);
        return res;
    }
}