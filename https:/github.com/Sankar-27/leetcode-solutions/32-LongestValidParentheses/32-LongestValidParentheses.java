// Last updated: 29/05/2026, 12:00:33
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int len=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
                st.push(i);
            else{
                st.pop();
                if(st.isEmpty())    st.push(i);
                else{
                    len=i-st.peek();
                    max=Math.max(max,len);
                }
            }
        }
        return max; 
    }
}