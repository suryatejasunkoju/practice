class Solution 
{
    public int[] countBits(int n) 
    {
        int ans[]=new int[n+1];
        for(int i=0; i<=n; i++)
        {
            int element=i, count=0;
            while(element>0)
            {
                count++;
                element=element&(element-1);
            }
            ans[i]=count;
        }
        return ans;
    }
}
