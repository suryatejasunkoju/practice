//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        int len=s.length();
	    int mask1=0, mask2=0, mask=0;
	    char firstRepeatedCharacter='!';//any value
	    boolean z=false;
	    for(int i=0; i<len; i++)
	    {
	        char currentChar=s.charAt(i);
	        int index=currentChar-'a';//for a->index=0, for g->index=6
	        int flag=1<<index;
	        if((mask1&flag)!=flag)//when index bit is not already set,we need to set that indexed bit in mask1. 
	        {
	            mask1=mask1^flag;
	        }
	        //when index bit is already set,we will set bit in mask2.
	        else
	        {
	            if((mask2&flag)!=flag)
	            {
	                mask2=mask2^flag;//here, we can't use | instead of ^ because carry propagates to left when | is used,
	                if(!z)
	                {
	                    firstRepeatedCharacter=currentChar;
	                    z=true;
	                }
	            }
	        }
	    }
	    //when (i)th bit is set,in both mask1 and mask2, that means that Character occured two or more times. 
	    mask=mask1&mask2;
		//System.out.println(" firstRepeatedCharacter="+firstRepeatedCharacter);*/
		if(z)
		 return ""+firstRepeatedCharacter;
		else
		 return "-1";
    }
} 
