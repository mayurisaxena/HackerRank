package DataStructures;


import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CubeSummation {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        BigInteger a = BigInteger.valueOf(10 ^ 9);
	        Scanner in = new Scanner(System.in);
	        Integer t = Integer.parseInt(in.nextLine());
	        for (int i=0;i<t;i++) {
	            String[] t1 = in.nextLine().split(" ");
	            int n = Integer.parseInt(t1[0]);
	            int x = Integer.parseInt(t1[1]);
	            Map<CobeSummationObj,BigInteger> mapArr = new HashMap<CobeSummationObj,BigInteger>();
	            for (int j = 0 ; j < x ; j++) {
	                String tc[] = in.nextLine().split(" ");
	                if (tc.length == 5) {
	                    CobeSummationObj obj = new CobeSummationObj(Integer.parseInt(tc[1]),Integer.parseInt(tc[2]),Integer.parseInt(tc[3]));
	                    mapArr.put(obj, new BigInteger((tc[4])));
	                }
	                if (tc.length == 7) {
	                    int x1 = Integer.parseInt(tc[1]);
	                    int y1 = Integer.parseInt(tc[2]);
	                    int z1 = Integer.parseInt(tc[3]);
	                    int x2 = Integer.parseInt(tc[4]);
	                    int y2 = Integer.parseInt(tc[5]);
	                    int z2 = Integer.parseInt(tc[6]);
	                    BigInteger sum = BigInteger.valueOf(0);
	                    for (Map.Entry me:mapArr.entrySet()) {
	                        CobeSummationObj cobj = (CobeSummationObj)me.getKey();
	                        if (cobj.getX()<=x2 && cobj.getX()>=x1)
	                            if (cobj.getY()<=y2 && cobj.getY()>=y1)
	                                if (cobj.getZ()<=z2 && cobj.getZ()>=z1)
	                                    sum = sum.add((BigInteger)me.getValue());
	                    }
	                    System.out.println(sum);

	                }
	            }
	        }
	    }


	}

	class CobeSummationObj {
	    int x;
	    int y;
	    int z;

	    public CobeSummationObj(int x, int y, int z) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public void setZ(int z) {
	        this.z = z;
	    }

	    public int getX() {

	        return x;
	    }

	    public int getY() {
	        return y;
	    }

	    public int getZ() {
	        return z;
	    }
	    @Override
	    public int hashCode() {
	        return (x + y + z) % 3;
	    }

	    @Override
	    public boolean equals(Object obj1) {
	        CobeSummationObj obj = (CobeSummationObj) obj1;
	        if (obj.x == x && obj.y == y && obj.z == z) {
	            return true;
	        }
	        return false;
	    }
}
