import java.util.*;
class Solution 
{
    //rotates array from start index to end index
    public static void reverse(int[] nums, int start, int end)
    {
        while(start<end)
        {
            int endingNo=nums[end];//swapping nums[start] and nums[end]
            nums[end]=nums[start];
            nums[start]=endingNo;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) 
    {
        /*
        -1,-100,3,99 k=2
        3, 99, -1, -100
        -100, -1, 99, 3
        //Time complexity=o(n), Space complexity=o(1);
        */
        if(k>nums.length) k = k%nums.length;//setting no. of rotations that has to be done when k is greater than nums.length.
        //reversing first n-k no.s
        reverse(nums, 0, nums.length-k-1);
        //reversing last k no.s
        reverse(nums, nums.length-k, nums.length-1);
        //reversing all n no.s
        reverse(nums, 0, nums.length-1);    
    }
}
