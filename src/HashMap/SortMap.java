package HashMap;

import java.util.*;

public class SortMap {
    public static void main(String args[]){
        Map<Integer, String> hm=new HashMap<Integer, String>();
        hm.put(23, "Yash");
        hm.put(17, "Arun");
        hm.put(15, "Swarit");
        hm.put(9, "Neelesh");
        System.out.println("After sorting by keys");
        Map<Integer,String> treemap = new TreeMap<>(hm);
        for(Map.Entry<Integer,String> entry : treemap.entrySet()){
            System.out.println(entry.getKey() +","+entry.getValue());
        }
        System.out.println("Sort by values");
        List<Map.Entry<Integer,String>> arrlist = new ArrayList<>(hm.entrySet());
        Collections.sort(arrlist,(o1,o2) -> o1.getValue().compareTo(o2.getValue()));
        HashMap<Integer,String> linkedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,String> aa:arrlist){
            linkedMap.put(aa.getKey(),aa.getValue());
        }
    }
}
