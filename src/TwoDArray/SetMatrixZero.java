package TwoDArray;

public class SetMatrixZero {
    public static void main(String args[]){
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j =0 ;j<m;j++){
                if(arr[i][j] == 0){
                    for(int k=0;k<n;k++){
                        if(arr[k][j] != 0)
                            arr[k][j] = -1;
                    }
                    for(int k=0;k<m;k++){
                        if(arr[i][k] != 0)
                            arr[i][k] = -1;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == -1)
                    arr[i][j] = 0;
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }
}
