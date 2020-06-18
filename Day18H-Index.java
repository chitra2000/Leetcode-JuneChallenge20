class Solution 
{
    public int hIndex(int[] arr)
    {
        int c=0;
        if(arr.length==0)
            return 0;
        else if(arr.length==1)
        {
            if(arr[0]==0)
                return 0;
            else
             return 1;
        }
        else
        {
            for(int i=arr.length-1;i>=0;i--)
            {
                if(arr[i]>c)
                    c++;
                else
                    break;
            }
            return c;
        }
        
    }
}
