class Solution {
    public boolean isPalindrome(int x) 
    {
        int t=x, rev=0;
        while(x>0)
        {
            rev=rev*10+(x%10);//appending last digit to the reverse number.
            x=x/10;
        }
        if(rev==t)//checking whether reversed number and original no. is same or not.
            return true;
        return false;
    }
}
