// Last updated: 29/05/2026, 11:53:44
class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*')
                st.pop();
            else
                st.push(ch);    
        }
        StringBuilder sb= new StringBuilder();
        if(st.size()>0){
        while(!st.empty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
        }
        else
            return "";
    }
}