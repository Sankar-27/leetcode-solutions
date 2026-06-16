// Last updated: 16/06/2026, 09:35:52
1class Solution {
2    public String processStr(String s) {
3        StringBuilder res = new StringBuilder("");
4        for(char ch:s.toCharArray()){
5            if(ch=='#')
6                res.append(res);
7            else if(ch=='%')    
8                res.reverse();
9            else if (res.length() > 0 && ch=='*')
10                 res.deleteCharAt(res.length() - 1);
11            else if(ch>='a' && ch<='z')
12                res.append(Character.toString(ch));
13        }
14        return res.toString();
15    }
16}