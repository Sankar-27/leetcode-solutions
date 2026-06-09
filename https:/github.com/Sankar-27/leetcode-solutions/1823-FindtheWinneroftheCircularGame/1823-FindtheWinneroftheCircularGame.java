// Last updated: 09/06/2026, 09:36:20
1class Solution {
2    public int findTheWinner(int n, int k) {
3        ArrayList<Integer> a=new ArrayList<>();
4        for(int i=1;i<=n;i++){
5            a.add(i);
6        }
7        int curr=0;
8        while(a.size()>1){
9            curr=(curr+(k-1))%a.size();
10            a.remove(curr);
11        }
12
13        return a.get(0);
14    }
15}