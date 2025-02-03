package samples;

import java.util.PriorityQueue;

public class MinimizeSumOfAnArray {
    //Given an array of integers, perform some
    //number k of operations. Each operation
    //consists of removing an element from the
    //array, dividing it by 2 and inserting the
    //ceiling of that result back into the array.
    //Minimize the sum of the elements in the
    //final array.
    public static void main(String[] args) {
        int[] arr = new int[]{
                20,7,5,4
        };

        int k =3;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int n : arr) {
            pq.add(n);
        }

        while(pq.size() > 0 && k >0) {
            int heapMax= pq.poll();
            System.out.println("Heap Max: " + heapMax);
            pq.add((int) Math.ceil(heapMax/2));
            k-=1;
        }

        int sum = 0;
        while(pq.size() > 0) {
            sum = sum + pq.poll();
        }

        System.out.println("Minimum sum = " + sum);
    }
}
