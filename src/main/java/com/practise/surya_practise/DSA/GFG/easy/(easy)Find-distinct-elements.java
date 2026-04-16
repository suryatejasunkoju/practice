//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int M[][] = new int[N][N];
            String arr[] = in.readLine().trim().split("\\s+");
            for(int i = 0;i < N*N; i++)
                M[i/N][i%N] = Integer.parseInt(arr[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.distinct(M, N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int distinct(int M[][], int N)
    {
        int[][] matrix=M;
        int n=M.length, m=M[0].length;
        HashMap<Integer,List<Integer>> h=new HashMap<>();
	    for(int i=0; i<n; i++)
	    {
            for(int j=0; j<m; j++)//while inserting, freq of all elements of each row will be only 1.
            {
                int currentElement=matrix[i][j];
                int currentRow=i;
                if(h.containsKey(currentElement))
                {
                    List<Integer> temp=h.get(currentElement);
                    if(currentRow!=temp.get(1))//when inserting element,that is in previous row,then we increase freq
                    {
                        List<Integer> t=new ArrayList<>();
                        t.add(temp.get(0)+1);
                        t.add(currentRow);
                        h.put(currentElement, t);
                    }
                    else
                    {
                        //when inserting element of same row, then we dont increase freq. 
                        //but we need to update just rowNo.
                        List<Integer> t=new ArrayList<>();
                        t.add(temp.get(0));
                        t.add(currentRow);
                        h.put(currentElement, t);
                    }
                }
                else
                {
                    List<Integer> t=new ArrayList<>();//at index=0, we store freq, at index=1, we store rowNo.
                    t.add(1);
                    t.add(currentRow);
                    h.put(currentElement,t); 
                }
            }
            //System.out.println("h="+h);
	    }
	    int count=0;
	    for(int key:h.keySet())
	    {
	        List<Integer> t=h.get(key);
            if(t.get(0)==n)
            {
                count++;
            }
	    }
		//System.out.println("h="+h);
		//System.out.println(count);
		return count;
    }
}
