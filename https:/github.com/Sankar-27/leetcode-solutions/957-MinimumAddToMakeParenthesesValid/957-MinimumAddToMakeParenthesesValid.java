// Last updated: 29/05/2026, 11:55:14
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char a=' ';
            if(!st.isEmpty())   a=st.peek();
            st.push(ch);
            if(ch==')' && a=='('){
                st.pop();
                st.pop();
            } 
        }
        return st.size();
    }
}