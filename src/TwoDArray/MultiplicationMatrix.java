package TwoDArray;

public class MultiplicationMatrix {

    public static void multiply(int[][] a , int[][] b){
        int row1 = a.length;
        int col1 = a[0].length;
        int row2 = b.length;
        int col2 = b[0].length;
        int [][] c = new int [row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    c[i][j] = (a[i][k] * b[k][j])+c[i][j];
                }
            }
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(c[i][j] + " ");
            }
                System.out.println();
        }
    }

    public static void main(String args[]){
        int[][] a = {{1,0,1},{0,1,1},{1,0,0}};
        int[][] b = {{0,0,1},{1,1,0},{1,1,1}};
        multiply(a,b);
    }
}
