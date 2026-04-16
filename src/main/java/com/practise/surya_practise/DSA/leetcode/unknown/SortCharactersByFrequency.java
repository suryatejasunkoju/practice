import java.util.*;
class Main
{
  public static void main(String args[])
  {
   HashMap<Character, Integer> h=new  HashMap<>();
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   int sLen=s.length(), hSize=0;//adding characters and their frequencies into HashMap
   for(int i=0; i<sLen; i++)
   {
       char currentChar=s.charAt(i);
       if(h.containsKey(currentChar))
       {
           int currentFreq=h.get(currentChar);
           h.put(currentChar, currentFreq+1);
       }
       else
       {
           h.put(currentChar, 1);
       }
   }
   hSize=h.size();//storing the size of HashMap into hSize variable
   System.out.println("h="+h+" hSize="+hSize);
   PriorityQueue<List<Integer>> p=new PriorityQueue<>((a,b)->((a.get(1)<b.get(1)?1:-1)));
   //Storing Character(in Integer), currentFreq into Integer List.
   //Storing this Integer List into PriorityQueue in sorted order based on frequency.
   for(Character key:h.keySet())
   {
       List<Integer> l=new ArrayList<>();
       l.add((int)key);//key i.e., Character
       l.add(h.get(key));// value i.e., currentFreq
       p.add(l);
   }
   System.out.println("p="+p);
   String res="";
   for(int i=0; i<hSize; i++)
   {
       List currentList=p.remove();
       int currentFreq=(int)currentList.get(1);
       char currentChar=(char)((int)currentList.get(0));
       while(currentFreq-->0)
        res=res+currentChar;
   }
   System.out.println(res);
  }
}
