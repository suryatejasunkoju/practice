class Solution {
    public static int rangeBitwiseAnd(int left, int right) 
    {
        /*leftInRange=5 ,rightInRange=7
        ans=5&6&7;
        5=101
        6=110
        7=111
        moving from MSB to LSB(i.e,left to right) in leftInRange and in rightInRange,
        when bits of leftInRange and in rightInRange both are 1,
        then all no.s in between that range will definitely have 1 in their binary representation
        At index=2, bit(index(5))=1, bit(index(7))=1, so definitely, bit(index(x)) will be 1  for all 5<x<7
        */
        //finding MSB of no
        /*
        int index=0;
        while(n>0)
        {
            n/=2;
            index++;
        }
        (or)
        index=(Math.log(n)/Math.log(2))=log(n) to the base 2 //As above while loop runs for log(n) to the base 2 times.
        LeftMostSetBit is at index-1 position.
        */
        int sum=0;
        if(left<right)
        {
            int [] leftNo_arr=new int[32];
            int [] rightNo_arr=new int[32];
            int index=0, max_index=0;//max_index=contains the max index of Left_Most_Set_Bit in both of the numbers
            while(left>0)   //leftNo_arr={1, 0, 1}
            {
                leftNo_arr[index]=left%2;
                left=left/2;
                index++;
            }
            max_index=index>max_index?index:max_index;
            index=0;
            while(right>0)  //rightNo_arr={1, 1, 1}
            {
                rightNo_arr[index]=right%2;
                right=right/2;
                index++;
            }
            max_index=index>max_index?index:max_index;
            max_index--;//Since, we use 0-based indexing in arrays.
            index=0;
            ///*
            for (int i=0;i<=max_index;i++)
            {
                System.out.print(leftNo_arr[i]+" ");
            }
            System.out.println();
            for (int i=0;i<=max_index;i++)
            {
                System.out.print(rightNo_arr[i]+" ");
            }
            System.out.println();
            System.out.println("max_index="+max_index);
            //*/
            for (int i=max_index; i>=0; i-- )
            {
                if((leftNo_arr[i]==1)&&(rightNo_arr[i]==1))//both should be 1
                {
                    int currentIndex=i;
                    int contribution=(1<<currentIndex);
                    sum+=contribution;
                }
                else if((leftNo_arr[i]==0)&&(rightNo_arr[i]==0))//both should be 0
                {
                    continue; //0 sum is contributed.
                }
                else// when both bits are different, we dont check further right side bits of both no.s.
                {
                    break;
                }
            }
        }
        else if(left==right)//when left and right are same then left(&)right=left 
        {
            sum=left;
        }
        return sum; 
    }
}
