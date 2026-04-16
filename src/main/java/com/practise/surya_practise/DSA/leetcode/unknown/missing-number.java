class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int xor1=0, xor2=0;
        for(int i=0; i<nums.length; i++)
        {
            xor1=xor1^nums[i];
        }
        //xor1 contains xor of all elements of nums[]
        //xor2 contains xor of all no.s from 0 to n(i.e,0 to nums.length)
        for(int i=0; i<=nums.length; i++)
        {
            xor2=xor2^i;
        }
        return xor1^xor2;
    }
}
