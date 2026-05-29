// Last updated: 29/05/2026, 11:58:58
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        int res=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int x=s.pop();
                res=s.pop()+x;
                s.push(res);
            }
            else if(tokens[i].equals("-")){
                int x=s.pop();
                res=s.pop()-x;
                s.push(res);
            }
             else if(tokens[i].equals("*")){
                int x=s.pop();
                res=s.pop()*x;
                s.push(res);
            }
             else if(tokens[i].equals("/")){
                int x=s.pop();
                res=s.pop()/x;
                s.push(res);
            }
             else{
            int a=Integer.parseInt(tokens[i]);
            s.push(a);
             }          
        }
        return s.pop();
    }
}