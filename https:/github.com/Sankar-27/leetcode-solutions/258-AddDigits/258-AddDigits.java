// Last updated: 29/05/2026, 11:57:53
class Solution {
    public int addDigits(int num) {
        if(num<10)
            return num;
        else{
            while(num>=10){
                int rem=num%10;
                num/=10;
                num+=rem;
            }
            return num;
        }    
    }
}