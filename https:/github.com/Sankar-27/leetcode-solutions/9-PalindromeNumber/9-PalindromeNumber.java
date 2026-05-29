// Last updated: 29/05/2026, 12:00:53
class Solution 
{
    public boolean isPalindrome(int a)
    {
        if(a < 0)
        {
            return false;
        }

        int x=a;
        int n=0;
        while (a>0)
        {
            int rem =0;
            rem=a%10;
            n=(n*10)+rem;
            a=a/10;
        }
        return (x==n);
    }
}