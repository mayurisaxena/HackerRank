package Algorithm;

import java.io.*;
import java.util.*;
import java.math.*;

public class ExtraLongFactorials {

	   public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        System.out.println(fibo(n));
	    }
	    static BigInteger fibo(int n) {
	        /* if (n.equals(0))
	            return BigInteger.valueOf(1);
	        if (n.equals(1) || n.equals(2) || n.equals(3)) 
	            return n;
	        return n.multiply(fibo(n.subtract(BigInteger.valueOf(1)))); */
	        BigInteger prod = BigInteger.valueOf(1);
	        for (int i = 1 ; i <= n; i++) {
	            prod = prod.multiply(BigInteger.valueOf(i));
	        }
	        return prod;
	    }
	    
	
}
