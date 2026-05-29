// Last updated: 29/05/2026, 12:00:44
class Solution {
    public boolean isValid(String str) {
        Stack<Character> s=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch =='['||ch=='('||ch=='{'){
                s.push(ch);
            }
            else if(ch==']'||ch=='}'||ch==')'){
                if(s.isEmpty()||(ch==')'&&s.pop()!='(')||(ch==']'&&s.pop()!='[')||(ch=='}'&&s.pop()!='{')){ 
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}