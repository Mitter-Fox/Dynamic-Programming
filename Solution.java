import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the getWays function below.
    static long getWays(long n, long[] c) {
        
        long[] ways = new long[(int)n + 1];  
  
        // Set the first way to 1 because its 0 and 
        // there is 1 way to make 0 with 0 coins 
        ways[0] = 1;  
  
         // Go through all of the coins 
        for (int i = 0; i < c.length; i++) { 
  
            // Make a comparison to each index value  
            // of ways with the coin value. 
            for (int j = 0; j < ways.length; j++) {  
                if (c[i] <= j) { 
       
                    // Update the ways array 
                    ways[j] += ways[(int)(j - c[i])];  
                } 
            } 
        }
        // return the value at the Nth position 
        // of the ways array.     
        return ways[(int)n];  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        long[] c = new long[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            long cItem = Long.parseLong(cItems[i]);
            c[i] = cItem;
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = getWays(n, c);
        bufferedWriter.write(String.valueOf(ways));
        bufferedWriter.close();

        scanner.close();
    }
}
