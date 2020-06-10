class Solution 
{
    public int change(int amount, int[] coins) 
    {
        int n=coins.length;
        int dp[]=new int[amount+1];
        dp[0]=1;
        int ans=0;
        for(int x=0;x<n;x++)
        {
            for(int y=coins[x];y<=amount;y++)
            {
                dp[y]+=dp[y-coins[x]];
            }
        }
        return dp[amount];
    }
}
