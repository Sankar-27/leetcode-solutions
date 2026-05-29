// Last updated: 29/05/2026, 11:57:12
// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         // List<Integer> res=new ArrayList<>();
//         // int n=s.length();
//         // int len=p.length();
//         // for(int i=0;i<=n-len;i++){
//         //     String str=s.substring(i,i+len);
//         //     HashSet<Character> map= new HashSet<>();
//         //     for(int j=0;j<str.length();j++){
//         //         char c=str.charAt(j);
//         //         map.add(c);
//         //     }
//         //     int count=0;
//         //     for(int k=0;k<len;k++){
//         //         char x=p.charAt(k);
//         //         if(map.contains(x)) count++;
//         //     }
//         //     if(count==len)  res.add(i);
//         // }
//         // return res;
        
//     }
// }
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;

        int[] pCounts = new int[26];
        int[] sCounts = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCounts[p.charAt(i) - 'a']++;
            sCounts[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCounts, sCounts)) res.add(0);

        // Slide the window across s
        for (int i = p.length(); i < s.length(); i++) {
            sCounts[s.charAt(i) - 'a']++;                  // Add new character
            sCounts[s.charAt(i - p.length()) - 'a']--;    // Remove old character

            if (Arrays.equals(pCounts, sCounts)) {
                res.add(i - p.length() + 1);
            }
        }

        return res;
    }
}
