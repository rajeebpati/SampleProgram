package samples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        String str = "functional programing is powerful and JAva 8 introduces functional programing";
        String[] strArray = str.split(" ");
        Set<String> duplicates = Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println("Duplicates: " + duplicates);


        //Set<Map.Entry<String, Integer>> entries = /strMap.entrySet();
    }
}

