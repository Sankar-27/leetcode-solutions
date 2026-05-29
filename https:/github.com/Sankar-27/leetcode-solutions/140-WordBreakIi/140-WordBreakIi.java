// Last updated: 29/05/2026, 11:59:09
class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<Integer>[] dp = (List<Integer>[]) new List[s.length()];

        for(int i = 0; i < dp.length; i++){
            dp[i] = new ArrayList<>();
        }
        
        int max_len = Integer.MIN_VALUE;
        for(String word: wordDict){
            max_len = Math.max(max_len, word.length());
        }

        Set<String> wordSet = new HashSet<>(wordDict);

        // Build DP: dp[i] stores starting positions of valid words ending at i
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j >= Math.max(i - max_len + 1, 0); j--){
                if(wordSet.contains(s.substring(j, i+1)) && (j == 0 || !dp[j-1].isEmpty())){
                    dp[i].add(j);
                }
            }
        }

        List<String> result = new ArrayList<>();
        if (dp[s.length() - 1].isEmpty()) return result;
        
        // Backtrack to build all valid sentences
        backtrack(s, new StringBuilder(), dp, s.length() - 1, result);
        return result;
    }
    
    private void backtrack(String s, StringBuilder sb, List<Integer>[] dp, int i, List<String> result){
        if(i < 0){
            result.add(sb.toString().trim());
            return;
        }
        
        for(int j : dp[i]){
            String oldContent = sb.toString();  
            sb.insert(0, s.substring(j, i+1) + " ");
            backtrack(s, sb, dp, j - 1, result);
            sb.setLength(0);              
            sb.append(oldContent);        
        }
    }
}