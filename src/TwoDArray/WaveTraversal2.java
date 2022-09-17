package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class WaveTraversal2 {
    public static List<Integer> waveTraversal(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        for(int i=0;i<m;i++){
            if(i%2 == 0){
                for(int j=0;j<m;j++){
                    result.add(arr[i][j]);
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    result.add(arr[i][j]);
                }
            }
        }

        return result;
    }
    //123
    //456
    //789
    public static void main(String args[]){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(waveTraversal(arr));
    }
}
