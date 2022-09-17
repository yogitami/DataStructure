package Array;

public class Barchart {
    public static void main(String args[]){
        int arr[] = {3,1,0,7,5};
        int max = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int floor = max ; floor>=1;floor--){
            for(int i=0;i< arr.length;i++){
                if(arr[i] >= floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
