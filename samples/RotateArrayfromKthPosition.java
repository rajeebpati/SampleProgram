package samples;

import java.util.ArrayList;
import java.util.List;

public class RotateArrayfromKthPosition {

//    int[] arr = {1, 2, 3, 4, 5}
//
//    Input = 1  and output =  5, 1, 2, 3, 4
//    Input = 2 and output =  4, 5, 1, 2, 3
//    Input = 3 and output =  3, 4, 5, 1, 2
//    Input = 4 and output =  2, 3, 4, 5, 1
//    Input = 5 and output =  1, 2, 3, 4, 5

    // if length = input return same
    // queue{ 4,5}..
    // {1,2,3,4,5} ::i-k {}  k-length-1{}
    // for

    public static void main(String[] args) {
        //new Queue
        rotateArray(new int[]{1, 2, 3, 4, 5}, 5);


    }

    public static void rotateArray(int[] numbers, int k) {
       // Queue<Integer> rotateArray = new ArrayDeque<>();
        List<Integer> rotateArray = new ArrayList<>();
        int length = numbers.length;
        for(int i=length-k; i<numbers.length; i++) {
            rotateArray.add(numbers[i]);
        }

        for(int j=0; j<length-k; j++) {
            rotateArray.add(numbers[j]);
        }

        System.out.println("Rotation of array: " + rotateArray);
    }
}
