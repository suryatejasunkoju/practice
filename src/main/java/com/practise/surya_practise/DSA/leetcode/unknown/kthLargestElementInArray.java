class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        //adding first k elements of nums[] into PriorityQueue
        for(int i=0; i<k; i++)
        {
            p.add(nums[i]);
        }
        for(int i=k; i<nums.length; i++)
        {
            if(p.peek()<nums[i])
            {
                //remove peek element and add current element
                p.remove();
                p.add(nums[i]);
            }
        }
        return p.peek();
    }
}
