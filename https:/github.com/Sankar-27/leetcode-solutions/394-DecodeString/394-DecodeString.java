// Last updated: 16/06/2026, 20:48:49
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> st = new Stack<>();
4        Stack<StringBuilder> st1 = new Stack<>();
5        StringBuilder sb = new StringBuilder();
6        int n = 0;
7
8        for (char c : s.toCharArray()) {
9            if (Character.isDigit(c)) {
10                n = n * 10 + (c - '0');
11            } else if (c == '[') {
12                st.push(n);
13                n = 0;
14                st1.push(sb);
15                sb = new StringBuilder();
16            } else if (c == ']') {
17                int k = st.pop();
18                StringBuilder temp = sb;
19                sb = st1.pop();
20                while (k-- > 0) {
21                    sb.append(temp);
22                }
23            } else {
24                sb.append(c);
25            }
26        }
27
28        return sb.toString();
29    }
30} 