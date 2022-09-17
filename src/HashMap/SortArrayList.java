package HashMap;

import java.util.ArrayList;
import java.util.List;

//a1,a2 a1=a2 ->0 , a1>a2-> 1 else -1
public class SortArrayList {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("yash");
        list.add("yogita");
        list.add("avi");
        list.add("bunny");
        list.add("naina");
        boolean swapped = false;
        for(int i=0 ;i< list.size()-1;i++){
            for(int j=0 ;j< list.size()-i-1 ;j++) {
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    String temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
        for(String s : list){
            System.out.println(s);
        }
    }
}
