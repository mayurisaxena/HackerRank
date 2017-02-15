package DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlgorithmicCrush {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long max = 0;
        long sum = 0;
        long[] start = new long[n+1];
        long[] end = new long[n+1];
        HashMap<Integer,Long> map = new HashMap<Integer,Long>();
        for (int i = 0; i<m ;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            long k = in.nextInt();
            start[a]+=k;
            end[b]+=k;
        }
        for (int i=1;i<n+1;i++) {
            sum = sum + start[i];
            if (sum>max) {
                max = sum;
            }
            sum = sum - end[i];
        }
        System.out.println(max);
    }
	
}
