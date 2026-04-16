//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        int group1=0,group2=0, xorResult=0;
	    for(int i=0; i<nums.length; i++)
	    {
	        xorResult=xorResult^nums[i];
	    }
	    //we got xorResult which contains xor(two unique no.s of nums[])
	    int index=0;
	    int firstSetBit_In_XorResult=xorResult^(xorResult&(xorResult-1));//since, n&(n-1) removes 1st set bit
		for(int i=0; i<nums.length; i++)
		{
		    if((nums[i]&firstSetBit_In_XorResult)==firstSetBit_In_XorResult)//firstSetBit in currentNo, then it belongs to group1
		    {
		        group1=group1^nums[i];
		    }
		    else
		    {
		        group2=group2^nums[i];
		    }
		}
		int ans[]=new int[2];
		ans[0]=group1<group2?group1:group2;
		ans[1]=group1>group2?group1:group2;
		//System.out.println("ans[0]="+ans[0]+" ans[1]="+ans[1]);
		return ans;
    }
}
