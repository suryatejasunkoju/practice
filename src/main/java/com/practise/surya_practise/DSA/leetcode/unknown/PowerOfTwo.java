class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
        if(n<0)
            return false;
        else
        {
            int bits[]=new int[32];
            int index=0;
            if(n<0)
                n=(-1)*n;
            while(n!=0&&index<32)
            {
                int remainder=n%2;
                System.out.print("remainder="+remainder+" index="+index+", ");
                bits[index++]=remainder;
                n=n/2;
            }
            //printing bits Array
            for(int i=0; i<32; i++)
            {
                System.out.print(bits[i]+" ");
            }
            System.out.println();
            int result=0;
            for(int i=0; i<32; i++)
            {
                result=result+bits[i];
            }
            return result==1;
        }
    }
}
