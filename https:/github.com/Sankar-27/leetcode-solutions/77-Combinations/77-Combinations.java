// Last updated: 25/06/2026, 09:48:00
1class Solution {
2    List<List<Integer>> li=new ArrayList<>();
3    public void rec(int n,int k,int in,List<Integer> l){
4        if(l.size()==k){
5            li.add(new ArrayList<>(l));
6            return;
7        }
8        for(int i=in;i<=n;i++){
9            l.add(i);
10            rec(n,k,i+1,l);
11            l.remove(l.size()-1);
12        }
13    }
14    public List<List<Integer>> combine(int n, int k) {
15        rec(n,k,1,new ArrayList<>());
16        return li;
17    }
18}