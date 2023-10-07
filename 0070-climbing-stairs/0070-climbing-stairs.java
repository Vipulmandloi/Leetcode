class Solution {
    public int climbStairs(int n) {
        int f1 = 1,f2 = 1, ans=0;
        int i = 2;
        if (n==1||n==2)
        {
            return n;
        }
        else
        {
            while(i<=n)
            {
                ans=f1+f2;
                f1=f2;
                f2=ans;
                i++;
            }
        }
        return ans;
        
    }
}