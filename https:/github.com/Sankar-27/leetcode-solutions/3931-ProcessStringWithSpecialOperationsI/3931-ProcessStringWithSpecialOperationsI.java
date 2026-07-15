// Last updated: 15/07/2026, 08:47:08
class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder("");
        for(char ch:s.toCharArray()){
            if(ch=='#')
                res.append(res);
            else if(ch=='%')    
                res.reverse();
            else if (res.length() > 0 && ch=='*')
                 res.deleteCharAt(res.length() - 1);
            else if(ch>='a' && ch<='z')
                res.append(Character.toString(ch));
        }
        return res.toString();
    }
}