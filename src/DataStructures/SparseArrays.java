package DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArrays {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> map = new HashMap<String,Integer> ();
        in.nextLine();
        for(int i = 0;i<n; i++) {
            String inp = in.nextLine();
            if (map.get(inp) == null) {
                map.put(inp,1);
            } else {
                map.put(inp,map.get(inp)+1);
            }
        }
        
        int q = in.nextInt();
        in.nextLine();
        for (int i =0;i<q;i++) {
            String chk = in.nextLine();
            if (map.get(chk) == null) {
                System.out.println(0);
            } else 
                System.out.println(map.get(chk));
        }
    }
	
}
