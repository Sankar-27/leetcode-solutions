// Last updated: 15/07/2026, 08:47:26
class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            a.add(i);
        }
        int curr=0;
        while(a.size()>1){
            curr=(curr+(k-1))%a.size();
            a.remove(curr);
        }

        return a.get(0);
    }
}