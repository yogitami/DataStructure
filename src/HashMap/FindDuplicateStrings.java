package HashMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//duplicate string & duplicate characters in a string
public class FindDuplicateStrings {
    public static void main(String args[]){
        List<String> values = Arrays.asList("hello","how","are","you","hello","you");
       Map<String,Long> map = values.stream().
               collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       map.forEach((K,V) -> {
           System.out.println(K +","+V);
       });
    }
}
