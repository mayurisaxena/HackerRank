package Algorithm;

import java.io.*;
import java.util.*;

public class IceCreamParlor {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for (int i = 0; i < t ; i++) {
	            int m = in.nextInt();
	            int n = in.nextInt();
	            int[] srr = new int[n];
	            for (int j=0; j< n ; j++) {
	                srr[j] = in.nextInt();
	            }
	            for (int j = 0; j < n-1 ; j++) {
	                for (int k = j+1 ;k < n ; k++ ) {
	                    if (srr[j] + srr[k] == m) {
	                        System.out.println(j+1 + " " + (k+1));
	                        break;
	                    }
	                }
	            }
	        }
	    }
	
}
