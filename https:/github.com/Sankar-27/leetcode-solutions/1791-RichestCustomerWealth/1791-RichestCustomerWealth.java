// Last updated: 29/05/2026, 11:54:09
class Solution {
    public int maximumWealth(int[][] accounts) {
        int current=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
                if(current<sum){
                    current=sum;
                }
            }
        }
        return current;
    }
}