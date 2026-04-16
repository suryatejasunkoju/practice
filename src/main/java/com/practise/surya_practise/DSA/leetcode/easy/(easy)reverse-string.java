class Solution {
    public void reverseString(char[] s) {
        int i=-1, j=s.length;
      //i is moving right, j is moving left.
        while(++i<--j)//looping till i and j meets.
        {
            char c=s[i];//swapping characters at i and j each time.
            s[i]=s[j];
            s[j]=c;
        }
    }
}
