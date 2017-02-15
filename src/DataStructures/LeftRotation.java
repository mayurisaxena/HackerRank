package DataStructures;

import java.io.*;
import java.util.*;

public class LeftRotation {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int d = in.nextInt();
	        int a[] = new int[n];
	        for (int i = 0; i<n ;i++) {
	            int k = in.nextInt();
	            int diff = i - d;
	            if (diff < 0) 
	                a[n+diff] = k;
	            else
	                a[diff] = k;
	        }
	        for (int i =0;i<n;i++) {
	            System.out.print(a[i] + " ");
	        }
	    }
	
}
