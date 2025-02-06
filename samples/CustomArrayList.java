package samples;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList {

    static String[] strArray = new String[3];
    static boolean isFull = false;

    public static void add(String str) {
        int index= 0;
        boolean isFull = false;
        int length = strArray.length;
        if (strArray[0]==null) {
            strArray[0] = str;
        } else {
            addElement(length, str);
            if (isFull) {
                int newLength = Math.multiplyExact(strArray.length, 2);
                String[] newStrArray = new String[newLength];
                newStrArray = strArray;
                strArray = new String[newLength];
                strArray = newStrArray;
            }
        }

    }

    private static void addElement(int length, String str) {
        strArray[length-1] = str;
        for(int i=1; i<length; i++) {
            if(strArray[i] != null) {
                strArray[i] = str;
            } else {
                isFull = true;
            }
        }
    }

    public static void print() {

    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Array 1");
    }

    //add
    //print
}
