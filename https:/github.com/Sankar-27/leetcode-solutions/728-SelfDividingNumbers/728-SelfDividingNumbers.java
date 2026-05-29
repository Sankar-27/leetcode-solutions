// Last updated: 29/05/2026, 11:56:07
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int d;
        List <Integer> res=new ArrayList<>();
        for(int n=left;n<=right;n++){
            int num=n;
            boolean self=true;
            while(num>0){
                d=num%10;
                num/=10;
                if(d==0 || n%d!=0){
                self=false;
                break;
                }
            }
            if(self)
            res.add(n);
        }
        return res;
    }
}