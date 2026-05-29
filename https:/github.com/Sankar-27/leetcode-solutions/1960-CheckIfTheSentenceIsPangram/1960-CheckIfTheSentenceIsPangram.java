// Last updated: 29/05/2026, 11:54:02
class Solution {
    public boolean checkIfPangram(String s) {
        Set<Character> st=new HashSet<>();
        for(int i=0;i<s.length();i++){
            st.add(s.charAt(i));
        }
        
        return st.size()==26;
    }
}