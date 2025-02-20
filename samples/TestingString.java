package samples;

import java.util.function.Function;
import java.util.stream.Collectors;

public class TestingString {
    //String Str = "Rajeeb"
    //
    //I need frequency of each char using java8
    //

    public static void main(String[] args) {
        String str = "Rajeeb";

        char[] charArray = str.toCharArray();
        //Stream.of(charArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(entry-> System.out.println(entry.getKey() + " : " + entry.getValue()));
         str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k,v)-> System.out.println(k + " : " + v));
       // Arrays.stream(charArray).Collect(groupingBy(FunctioanlIdentity(), Counting)).entrySet().stream().foreach((entry) -> System.out.print(entry.getKey() + " " + entry.getValue));
    }
}
