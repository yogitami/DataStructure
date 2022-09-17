package Array;

import java.util.Arrays;

public class SumOf2Arrays {
    public static void main(String args[]){
        int arr1[] = {3,1,0,7,5};
        int arr2[] = {1,1,1,5,7};
        int sum[] = new int[arr1.length>arr2.length? arr1.length: arr2.length];
        int i = arr1.length-1 , j= arr2.length-1, k = sum.length-1;
        int div = 0;
        while(k>=0){
            int s = arr1[i] + arr2[j] + div;
            if( s > 9){
                sum[k] = s%10;
                 div = s/10;
            }else{
                sum[k] = s;
                div = 0;
            }
            i--;
            j--;
            k--;
        }
        Arrays.stream(sum).forEach(x->System.out.println(x));
    }
}
