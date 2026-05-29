// Last updated: 29/05/2026, 11:53:36
class Solution {
    public int minLength(String st) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(!s.empty() && s.peek()=='A' && ch=='B')
                s.pop();
            else if(!s.empty() && s.peek()=='C' && ch=='D')
                s.pop();
            else
                s.push(ch);    
        }
        return s.size();
    }
}