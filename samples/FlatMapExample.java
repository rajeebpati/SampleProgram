package samples;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfList = Arrays.asList(
            Arrays.asList("Raj", "Gopal"), Arrays.asList("Rajesh", "Gopalu"), Arrays.asList("Rajendra", "Gopalendra"));


        System.out.println("Before streaming : " + listOfList);

        listOfList.stream().flatMap(list->list.stream().sorted((o1, o2) -> o2.compareTo(o1))).forEach(System.out::println);

        System.out.println(" Complete Sort");
        listOfList.stream().flatMap(list->list.stream()).sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
    }
}
