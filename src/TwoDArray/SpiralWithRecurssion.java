package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralWithRecurssion {
    public static void spiral(int[][] arr, int m,int n,int i,int j) {
        if(i>=m || j>=n)
            return;
        //first row
        for(int a=i,b=j;b<n;b++){
            System.out.print(arr[a][b] + " ");
        }
        //last column
        for(int a=i+1,b=n-1;a<m;a++){
            System.out.print(arr[a][b] + " ");
        }

        if(i != m-1) {
            //last row
            for (int a = m - 1, b = n - 2; b >= j; b--) {
                System.out.print(arr[a][b] + " ");
            }
        }
            if(j != n-1){
            //first column
            for (int a =m-2,b =j; a>i ;a--){
                System.out.print(arr[a][b] + " ");
            }
        }

         spiral(arr,m-1,n-1,i+1,j+1);
    }
    public static void main(String args[]) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        spiral(arr, arr.length,arr[0].length,0,0);
    }
}
