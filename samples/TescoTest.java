package samples;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TescoTest {
    //max repeated  integer
    // 1231124522222
    public static void main(String[] args) {
       // int[] number = new int[]{1,2,3,1,1,2,4,5,2,2,2,2,2};


    }

    public Integer findMaxRepetiveNumber(int[] number) {
        Integer key = Arrays.stream(number).mapToObj(o -> (Integer) o)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .sorted(((o1, o2) -> o2.getValue().compareTo(o1.getValue()))).findFirst().get().getKey();

        //System.out.println("Most repetive integer: " + key);\
        return key;
    }


}
