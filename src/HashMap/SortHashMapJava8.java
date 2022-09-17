package HashMap;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapJava8 {
    public static Map<String,Integer> sortByValue(Map<String,Integer> hm){
        List<Map.Entry<String,Integer>> list = new ArrayList<>(hm.entrySet());
        Map<String,Integer> map = list.stream().sorted(Comparator.comparing(Map.Entry::getValue)).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry :: getValue,
                        (e1,e2) -> e1,LinkedHashMap::new));
        return map;
    }
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortByValue(hm);

        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
    }
}
