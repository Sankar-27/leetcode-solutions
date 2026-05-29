// Last updated: 29/05/2026, 11:54:54
class Solution {
    public String removeDuplicates(String str) {
        Stack<Character> s=new Stack<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!s.empty() &&s.peek()==ch)
                s.pop();
            else
                s.push(ch);    
        }
        while(!s.empty()){
            sb.append(s.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}