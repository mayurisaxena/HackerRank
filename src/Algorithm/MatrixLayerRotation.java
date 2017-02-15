package Algorithm;

import java.util.Scanner;

public class MatrixLayerRotation {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int r1 = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0;i <m ; i++) {
            for (int j =0 ; j<n ; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int chk = Math.min(m,n)/2;
        //System.out.println(chk);
        for (int k = 0 ; k<r1; k++) {
            for (int q = 0 ; q <chk; q++) {
            int row = m-q-1;
            int col = n-q-1;
                //System.out.println("r:c:"+row+" "+col);
            int i = q;
            int j = q;
                int tmp=0, tmp1=0;
                tmp = arr[q][q];
                for ( j = q ; j < col ; j++) {
                     arr[i][j] = arr[i][j+1];
                }
                
                i = q;
                j = q;
                tmp1 = arr[row][j];
                for ( i=row;i>q; i--) {
                    arr[i][j] = arr[i-1][j];
                    
                }
                arr[q+1][q] = tmp;
                i = row;
                j = col;
                tmp = arr[i][j];
                for ( j = col ; j>q ; j--) {
                    arr[i][j] = arr[i][j-1];
                }
                arr[row][q+1]=tmp1;
                i = q;
                j = col;
                for (i = q ; i <row ; i++) {
                    arr[i][j] = arr[i+1][j];
                }
                arr[row-1][col]=tmp;
            
        }
            
        }
        
        
        
        for (int i = 0;i <m ; i++) {
            for (int j =0 ; j<n ; j++) {
                System.out.print(arr[i][j] + " "  );
            }
            System.out.println();
        }
    }
	
}
