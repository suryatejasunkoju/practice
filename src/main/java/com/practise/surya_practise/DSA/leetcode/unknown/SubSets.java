class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        int subsetNoLimit=(1<<nums.length)-1;
        List< List<Integer> > answer=new ArrayList<>();
        for(int subsetNo=0; subsetNo<=subsetNoLimit; subsetNo++)
        {
            List<Integer> currentList=new ArrayList<>();
            int currentSetNo=subsetNo, index=0, flag=0;
            //System.out.print("currentSetNo="+Integer.toBinaryString(currentSetNo));
            while(currentSetNo>0)
            {
                flag=currentSetNo%2;
                currentSetNo/=2;
                if(flag==1)
                {
                    //System.out.print(" index="+index+" ");
                    currentList.add((nums[index]));
                }
                index++;
            }
            //System.out.println();
            answer.add(currentList);
        }
        return answer;
    }
}
