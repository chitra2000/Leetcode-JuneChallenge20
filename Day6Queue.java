class Solution 
{
    public int[][] reconstructQueue(int[][] people) 
    {
        Arrays.sort(people,new Comparator<int[]>()
       { 
          public int compare(final int[]a1,final int[]a2)
          { 
            if (a1[0]<a2[0]) 
                return 1; 
            else if(a1[0]==a2[0])
                return a1[1]-a2[1];   
            else
                return -1; 
          } 
        });  
        ArrayList<int[]> narr= new ArrayList<int[]>();
        for(int i=0; i<people.length; i++)
        {
          int[] arr = people[i];
          narr.add(arr[1],arr);
        }
        return narr.toArray(new int[people.length][2]);
    }
}
