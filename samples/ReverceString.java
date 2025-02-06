package samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverceString {
    public static void main(String[] args) {
        String str = "Welcome to Wissen Technology";

        String[] splitStr = str.split(" ");
        List<String> revereceStr = Arrays.stream(splitStr).map(s -> new StringBuilder().append(s).reverse().toString()).collect(Collectors.toList());
        revereceStr.stream().forEach(rs-> System.out.print(rs + " "));
    }
}
