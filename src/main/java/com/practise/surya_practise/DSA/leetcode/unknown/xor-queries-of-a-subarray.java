class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
    //prefix xorArray
	    int prefix_xorArray[]=new int[arr.length];
	    int xorResult=0;
	    //filling prefix_xorArray with xor of values of arr from 0th index to currentIndex each time. 
	    for(int i=0; i<arr.length; i++)
	    {
	        xorResult=xorResult^arr[i];
	        prefix_xorArray[i]=xorResult;
	    }
	    //xorResult=contains xor of all elements of arr.
	    int answer[]=new int[queries.length];
		for(int i=0; i<queries.length; i++)
		{
		    int leftIndex=queries[i][0];
		    int rightIndex=queries[i][1];
		    if(leftIndex>0)
		    {
		        answer[i]=prefix_xorArray[rightIndex]^prefix_xorArray[leftIndex-1];
		    }
		    else
		    {
		        //when leftIndex=0, we cant have prefix_xorArray[leftIndex-1]=prefix_xorArray[-1]
		        answer[i]=prefix_xorArray[rightIndex];   
		    }
		}
		return answer;
    }
}
