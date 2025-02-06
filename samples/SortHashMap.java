package samples;

import java.util.HashMap;
import java.util.Map;

public class SortHashMap {
    public static void main(String[] args) {
        Map<Integer,String> intStrMap = new HashMap<>();
        intStrMap.put(1, "one");
        intStrMap.put(2, "two");
        intStrMap.put(3, "three");
        intStrMap.put(4, "four");
        intStrMap.put(5, "five");

        intStrMap.entrySet().stream().forEach(System.out::println);

        System.out.println("After Sorting : ");
        intStrMap.entrySet().stream().sorted((o1,o2)-> o1.getValue().compareTo(o2.getValue())).forEach(System.out::println);
    }

}
