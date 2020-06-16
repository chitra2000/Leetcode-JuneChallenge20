class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) 
    {
        Arrays.parallelSort(nums);
        int n=nums.length;
        if(n==0)
        {
            return new ArrayList<>();
        }
        int cnt[]=new int[n];
        int prev[]=new int[n];
        for(int x=0;x<n;x++)
        {
            prev[x]=-1;
        }
        int k=0;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]%nums[j]==0||nums[j]%nums[i]==0)
                {
                    if(cnt[i]<cnt[j]+1)
                    {
                        cnt[i]=cnt[j]+1;
                        prev[i]=j;
                    }
                }
            }
            if(cnt[i]>cnt[k])
            {
                k=i;
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(k>=0)
        {
            ans.add(nums[k]);
            k=prev[k];
        }
        return ans;
    }
}
