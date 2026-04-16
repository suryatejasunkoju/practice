class Solution 
{
    public static int dist(int x, int y)
    {
        return (x*x)+(y*y);
    }
    public int[][] kClosest(int[][] points, int k) 
    {
            PriorityQueue<List<Integer>> pq=new PriorityQueue<>(
                (a,b)->
                (
                   dist(a.get(0), a.get(1))<dist(b.get(0), b.get(1))?1:-1 
                )
            );
           int ans[][]=new int[k][2];
           for(int i=0; i<k; i++)
           {
                //we have to add first k pairs into Priority Queue
                List<Integer> l=new ArrayList<>();
                l.add(points[i][0]);
                l.add(points[i][1]);
                pq.add(l);
           }
           System.out.println(" pq="+pq);
           //we have to remove highest distant points by inserting in lowest distant points.
           for(int i=k; i<points.length; i++)
           {
               int distance=dist(pq.peek().get(0), pq.peek().get(1));
               int currDistance=dist(points[i][0], points[i][1]);
               if(distance>currDistance)
               {
                   pq.remove();
                   List<Integer> l=new ArrayList<>();
                   l.add(points[i][0]);
                   l.add(points[i][1]);
                   pq.add(l);
               }
           }
           System.out.println(" pq="+pq);
           int i=0;
           while(i<k)
           {
               ans[i][0]=pq.peek().get(0);
               ans[i][1]=pq.peek().get(1);
               i++;
               pq.remove();
           }
           return ans;
    }
}
