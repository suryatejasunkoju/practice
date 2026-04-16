import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int answer=0;
        int bits[]=new int[33];
        //5->0000...00101
        for(int i=0; i<arr.length; i++)
        {
            //String num="";
            int element=arr[i], j=0;
            if(element<0&&element!=Integer.MIN_VALUE)
            {
                bits[32]=bits[32]+1;   
                element=-element;
            }
            else if(element<0&&element==Integer.MIN_VALUE)
            {
                //element=-2,147,483,648;
                bits[32]=bits[32]+1;//since its a negative Number
                //if we do element=-element, then element=2,147,483,648 but it is out of int range
                long elementCopy=(Integer.MAX_VALUE)+1l;//element=2,147,483,647+1=2,147,483,648, here we need to write 1L because to convert whole expression into long
                //System.out.print(" elementCopy="+elementCopy);
                while(elementCopy>0)
                {
                    int flag=(int)(elementCopy&1l);
                    //System.out.print(" elementCopy="+elementCopy+" flag="+flag);
                    bits[j]=bits[j]+flag;
                    //System.out.print("bits["+j+"]="+bits[j]+" ");
                    j++;
                    //num=flag+num;
                    elementCopy>>=1;
                }
                element=0;
            }
            while(element>0)
            {
                int flag=(element&1);
                bits[j]=bits[j]+flag;
                //System.out.print("bits["+j+"]="+bits[j]+" ");
                j++;
                //num=flag+num;
                element>>=1;
            }
            //System.out.print("num="+num);
            /*for(int k=0; k<33; k++)
	        {
	            System.out.print(" "+bits[k]);
	        }
	        System.out.println();*/
        }
        for(int k=0; k<33; k++)
        {
            bits[k]=bits[k]%3;
            if(bits[k]==1&&k!=32)
                answer=answer+(bits[k]<<k);
	        //System.out.print(" "+bits[k]);
	    }
	    if(bits[32]==1)
	        answer=(-1)*answer;
		System.out.println("answer="+answer);
		//return answer;
		/*failing test case:(change the code and passing all test cases)
		31
-401451  -177656  -2147483646  -473874  -814645  -2147483646  -852036  -457533  -401451  -473874  -401451  -216555  -917279 
-457533  -852036  -457533  -177656  -2147483646   -177656  -917279   -473874  -852036   -917279   -216555  -814645  2147483645 
-2147483648  2147483645   -814645   2147483645  -216555
		*/
	}
}



