package samples;

public class FindMAxOfCircularSortedArray {
    //static int[]  numbers = new int[]{5,6,7,8,9,1,2,3,4};
    static int[]  numbers = new int[]{5,6,7,8,9,10,10,11,11,1,2,3,4,4};
    //low = 0, high = length-1
    //check low <high if yes then return high
    //else: mid =low +high/2
    // check if low<mid then new low =mid
    //else high =mid -1

    public static int findMax(int[] numberArray) {
        int low = 0;
        int high = numberArray.length - 1;

        while (low < high) {
            if (numberArray[low] < numberArray[high]) {
                return numberArray[high];
            }

            int mid = (low + high) / 2;
            if (numberArray[low] < numberArray[mid]) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        return numberArray[low];

    }

    public static void main(String[] args) {

        System.out.println(findMax(numbers));
    }
}
