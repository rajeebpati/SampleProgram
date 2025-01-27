package samples;

import java.util.ArrayList;
import java.util.List;

public class FindPositionIOfBookInDictionary {
    private static int getSequenceNo(String input) {
        input = input.toLowerCase();
        List<String> names = new ArrayList<>();
        names.add("lap");
        names.add("pal");
        names.add("xyz");
        int index = names.indexOf(input);

        if (index == -1) {
            for (String name : names) {
                for (int i = 0; i < input.length(); i++) {
                    int counter = 0;
                    if (input.charAt(i) == name.charAt(i)) {
                        counter++;
                    }

                    if (counter == input.length()) {
                        return 0;
                    }
                }
            }
        } else {
            index++;
        }
        return index;
    }

    public static void main(String[] args) {

        int position = getSequenceNo("pa");
        System.out.println(position);
    }

}
