import java.util.*;
public class Main
{
    public static int[] topKFrequent(int[] nums, int k) 
    {
        //storing values and their frequencies into HashMap
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++)
        {
            if(h.containsKey(nums[i]))
            {
                int freq=h.get(nums[i]);
                h.put(nums[i], freq+1);
            }
            else
            {
                h.put(nums[i], 1);
            }
        }
        //System.out.println("h="+h);
        //storing values and frequencies from HashMap into ArrayList
        List< List<Integer> > list=new ArrayList<>();
        for(int key:h.keySet())
        {
            List<Integer> pair=new ArrayList<>();
            pair.add(key);
            pair.add(h.get(key));
            list.add(pair);
        }
        //System.out.println("list="+list);
        PriorityQueue< List<Integer> > p=new PriorityQueue<>(
                (a,b)->(
                            a.get(1)>b.get(1)
                        )?1:-1
            );
        //adding k value-frequency pairs into PriorityQueue
        for(int i=0; i<k; i++)
        {
            List<Integer> t=new ArrayList<>();
            t.add(list.get(i).get(0));
            t.add(list.get(i).get(1));
            p.add(t);
        }
        //System.out.println("p="+p);
        int[] ans=new int[k];
        //adding highest frequency pairs by removing lowest frequency pairs
        for(int i=k; i<list.size(); i++)
        {
            int freq_Peek=p.peek().get(1);
            int currentPair_freq=list.get(i).get(1);
            //System.out.println("freq_Peek="+freq_Peek+" currentPair_freq="+currentPair_freq);
            if(freq_Peek<currentPair_freq)
            {
                p.remove();
                p.add(list.get(i));
            }
            //System.out.println(",        p="+p);
        }
        int i=k;
        while(--i>=0)
        {
            ans[i]=p.peek().get(0);
            p.remove();
        }
        return ans;
    }
	public static void main(String[] args) 
	{
	    int arr[]={1,1,1,2,2,3,4,4,5,6,6,6,7,7,7,7};
	    int ans[]=topKFrequent(arr,5);
	    for(int x: ans)
	    {
	        System.out.print(x+" ");
	    }
	}
}

/*
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int nums[]={1,2,1,1,2,3};
	    int n=nums.length;
	    //HashMap<Integer,String> map=new HashMap<Integer,String>();
	    TreeMap<Integer,Integer> h=new TreeMap<>(  );
	    System.out.println("h="+h);
        for(int i=0; i<n; i++)
        {
            if(h.containsKey(nums[i]))
            {
                int freq=h.get(nums[i]);
                h.put(nums[i], freq+1);
            }
            else
            {
                h.put(nums[i],1);
            }
        }
		//System.out.println("h="+h);
	}
}

*/



