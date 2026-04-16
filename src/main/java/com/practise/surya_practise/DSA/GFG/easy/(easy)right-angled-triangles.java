//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            long a = Long.parseLong(S[0]);
            long b = Long.parseLong(S[1]);
            long c = Long.parseLong(S[2]);

            Solution ob = new Solution();
            System.out.println(ob.rightAngTri(a,b,c));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String rightAngTri(long a, long b, long c) {
        long max=a>b?a:b;//max=largest from a and b
        max=max>c?max:c;//max=largest from c and max
        long maxSquare=max*max, sumOfSquaresOf3Sides=(a*a)+(b*b)+(c*c);
        if(2L*maxSquare==sumOfSquaresOf3Sides)
            return "Yes";
        //when max=a, a^2+b^2+c^2=2*(a^2) <-> b^2+c^2=a^2 . Similarly for all max.
        return "No";
    }
};
