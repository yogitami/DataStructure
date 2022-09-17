package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class WaveTraversal3 {

    public static List<Integer> waveTraversal(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int dx[] = {-1,1};
        int dy[] = {1,-1};
        int di = 0;
        int x = 0,y=0;
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0 ;i<m*n;i++){
            result.add(arr[x][y]);
            int ci = x+dx[di];
            int cj = y+dy[di];
            if(0<=ci && ci<m && 0<=cj && cj<n){
                x = ci;
                y = cj;
            }else if(ci>=m){
                x = ci-1;
                y = cj +2;
                di -- ;
            }else if(cj >=n){
                x = ci + 2;
                y = cj-1;
                di++;
            }else if(ci<0){
                x = 0;
                y = cj;
                di++;
            }else if(cj<0){
                x = ci;
                y=0;
                di--;
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
