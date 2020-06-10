class Solution 
{
    class Sort implements Comparator<int[]>
    {
        public int compare(int a[],int b[])
        {
            int d=Math.abs(a[0]-a[1]);
            int c=Math.abs(b[0]-b[1]);
            if(d>c)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
    }
    public int twoCitySchedCost(int[][] ar) 
    {
        int n=ar.length;
        Arrays.sort(ar,new Sort());
        int sum=0;
        int a=n/2;
        int b=n/2;
        int i=0;
         for(int x=0;x<n;x++)
        {
            if(b==0||(ar[x][0]<=ar[x][1]&&a>0))
            {
                a--;
                sum+=ar[x][0];
            }
            else
            {
                b--;
                sum+=ar[x][1];
            }
        }
        return sum;
    }
}
