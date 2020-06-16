class Solution 
{
    class Edge
    {
        int v,d;
        public Edge(int v,int d)
        {
            this.v=v;
            this.d=d;
        }
    }
    public int findCheapestPrice(int n, int[][] ar, int src, int dest, int k)
    {
        LinkedList<Edge> graph[]=new LinkedList[n];
        for(int x=0;x<n;x++)
        {
            graph[x]=new LinkedList<>();
        }
        for(int x=0;x<ar.length;x++)
        {
            graph[ar[x][0]].add(new Edge(ar[x][1],ar[x][2]));
        }
        int weight=0;
        boolean visited[]=new boolean[n];
        visited[src]=true;
        dfs(graph,n,src,dest,k,weight,visited);
        return min==Integer.MAX_VALUE?-1:min;
    }
    int min=Integer.MAX_VALUE;
    public void dfs(LinkedList<Edge> graph[],int n,int s,int t,int k,int res,boolean visited[])
    {
        if(s==t)
        {
            if(res<min)
            {
               min=res;
            }
        }
        else if(k<0)
        {
            return;
        }
        else
        {
            for(Edge edge:graph[s])
            {
                int v=edge.v;
                int d=edge.d;
                if(!visited[v]&&res+d<min)
                {
                    visited[v]=true;
                    dfs(graph,n,v,t,k-1,res+d,visited);
                    visited[v]=false;
                }
            }
        }
    }
}
