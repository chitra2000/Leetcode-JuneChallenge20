class Solution 
{
    public boolean isPowerOfTwo(int n)
    {
        boolean ans=false;
        if(n==1||n==2)
            ans=true;
        else if(n%2!=0||n<=0)
            ans=false;
        
        else 
        {
            int c=n&(n-1);
            if(c==0)
                ans=true;
        }
        return ans;
    }
}
