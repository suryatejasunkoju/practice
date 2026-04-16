//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long reversedBits(Long X) {
        // code here
        long res=0;
		int[] bits=new int[32];
		for(int i=0; i<32; i++)
		{
			if(X>0)
			{
				bits[i]=(int)(X%2);
				X/=2;
			}
			else
				break;
		}
		//printBits(bits);
		//System.out.println();
		for(int i=0; i<32; i++)
		{
			if(bits[i]==1)
			{
				res=res+(1L<<(31L-i));
			}
		}
		return res;
    }
};
