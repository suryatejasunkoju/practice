class Solution {
    public char findTheDifference(String s, String t) 
    {
       int tLength=t.length();
	    int[] freq=new int[26];
	    for(int i=0; i<tLength; i++)
	    {
	        char currentCharater=t.charAt(i);//currentCharater of "t" String
	        int index=currentCharater-'a';//index for currentCharater of "t" String
	        freq[index]++;//increasing freq of currentCharater in freq[]
	        if(i<tLength-1)
	        {
	            currentCharater=s.charAt(i);//currentCharater of "s" String
	            index=currentCharater-'a';//index for currentCharater of "s" String
	            freq[index]--;//decreasing freq of currentCharater in freq[]
	        }
	    }
	    char answer='k';
	    for(int i=0; i<26; i++)
	    {
	        if(freq[i]==1)
	        {
	            answer=(char)(i+'a');
	        }
	    }
        return answer;
        
    }
}
