// Last updated: 29/05/2026, 12:00:50
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder();
        int n = strs.length;
        String first = strs[0];
        String last = strs[n-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));

        }
        return ans.toString();
    }
}