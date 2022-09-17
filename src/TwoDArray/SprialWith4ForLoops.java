package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class SprialWith4ForLoops {

    public static List<Integer> spiral(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length - 1;
        int maxcol = arr[0].length - 1;
        int total = arr.length * arr[0].length;
        int counter = 0;
        while (counter < total) {
          for(int i=minrow, j =mincol;i<=maxrow;i++){
              result.add(arr[i][j]);
              counter ++;
          }
          mincol++;
            for(int i=maxrow,j=mincol;j<=maxcol;j++){
                result.add(arr[i][j]);
                counter ++;
            }
            maxrow--;
            for(int i=maxrow, j =maxcol;i>=minrow;i--){
                result.add(arr[i][j]);
                counter ++;
            }
            maxcol--;
            for(int i=minrow, j =maxcol;j>=mincol;j--){
                result.add(arr[i][j]);
                counter ++;
            }
            minrow++;
        }
        return result;
    }

    public static void main(String args[]) {
        int[][] arr = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};
        System.out.println(spiral(arr));
    }
}
