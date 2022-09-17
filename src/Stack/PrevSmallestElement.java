package Stack;

import java.util.Stack;

public class PrevSmallestElement {
    public static void main(String args[]){
        int arr[] = {4,10,5,8,20,15,3,12};
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(s.isEmpty()) {
                System.out.print("-1 ");
                s.push(arr[i]);
            }
            while(!s.isEmpty()) {
                if (arr[i] > s.peek()) {
                    System.out.print(s.peek());
                    s.push(arr[i]);
                } else {
                    s.pop();
                }
            }
        }




    }
}
