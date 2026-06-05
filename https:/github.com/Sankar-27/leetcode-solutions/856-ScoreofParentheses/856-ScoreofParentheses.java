// Last updated: 05/06/2026, 09:31:46
1class Solution {
2    public int scoreOfParentheses(String s) {
3        Stack<Integer> st=new Stack<>();
4        st.push(0);
5        char[] ch=s.toCharArray();
6        for(char c:ch){
7            if(c=='(')  st.push(0);
8            else{
9                int s1=st.pop();
10                int s2=st.pop();
11                s2+=(s1==0)?1:s1*2;
12                st.push(s2);
13            }
14        }
15        return st.pop();
16    }
17}