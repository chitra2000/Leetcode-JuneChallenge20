class Solution 
{
    public int searchInsert(int[] arr, int target) 
    {
        int index=1;
        if(arr[0]>=target)
            index=0;
        else
        {
            for(int i=1;i<arr.length;i++)
          {
           if (arr[i]==target)
               index=i;
           else if(arr[i]<target)
               index=index+1;
          }
        }
        return index;
    }
}
