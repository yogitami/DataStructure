package TwoDArray;

// 11 12 13
// 21 22 23
// 31 32 33

public class ZiczacPrint {
    public static void main(String args[]){
        int arr[][] = {{11,12,13},{21,22,23},{31,32,33}};

        //PART - 1
        for(int j=0;j<arr[0].length;j++){
            if(j % 2 == 0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j] +" ");
                }
            }else{
                for(int i= arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j] +" ");
                }
            }
        }
        System.out.println();
        // PART - 2
        for(int i=0;i<arr.length;i++){
            if(i % 2 == 0){
                for(int j=0;j< arr[0].length;j++){
                    System.out.print(arr[i][j] +" ");
                }
            }else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j] +" ");
                }
            }
        }

    }
}
