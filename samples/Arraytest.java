package samples;

import java.util.*;

public class Arraytest {
    public static void main(String[] args) {
        //Given an array arr[] of integers and an integer k, your task is to find the maximum value for each contiguous subarray of size k
        //
        //Input: arr[] = [1, 2, 3, 1, 4, 5, 2, 3, 6], k = 3
        //
        //Output: [3, 3, 4, 5, 5, 5, 6]
        //
        // 1 for loop[
        //i,i+1,i+2
        //get the max of 3 variables
        //add the object to the new list

        ArrayList<Integer> listOfNumbers = new ArrayList();
        int k =3;
        int[] numberArray = new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6};
//        for(int i=0; i<= numberArray.length-3; i++) {
//            List<Integer> ksArray = new ArrayList<>();
//            int count = 0;
//            while(count<k) {
//                int index = count+i;
//                count++;
//                ksArray.add(numberArray[index]);
//            }
//
//            findMax(ksArray, listOfNumbers);
//        }

        listOfNumbers = max_of_subarraysPQ(numberArray, 3);


        System.out.println(listOfNumbers);
    }

    static void findMax(List<Integer> ksArray, ArrayList<Integer> listOfNumbers) {
        listOfNumbers.add(ksArray.stream().max((o1, o2) -> o1-o2).stream().findFirst().get());
    }

    //Another solution of O(n)
    public static ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>(); // Stores indices

        for (int i = 0; i < arr.length; i++) {
            // Remove indices that are out of the current window
            while (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.poll();
            }

            // Remove indices of all elements smaller than
            // the current element as they are not useful
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add current element index
            deque.offer(i);

            // The front of the deque is the largest element of the current window
            if (i >= k - 1) {
                result.add(arr[deque.peek()]);
            }
        }
        return result;
    }


    public static ArrayList<Integer> max_of_subarraysPQ(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();

        Queue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2-o1);
        for (int i = 0; i < arr.length-k; i++) {
            int counter = 0;

            while(counter<k) {
                maxHeap.add(arr[i+counter]);
                counter++;
            }

            result.add(maxHeap.peek());
            maxHeap.clear();
        }
        return result;
    }

}
