package samples;

public class FindSum {
//    Input: arr[] = {2, 3, -8, 7, -1, 2, 3}  = result =5  sum = -3
//    Output: 11
//
//    Input: arr[] = {-2, -4}
//    Output: –2
//
//    Input: arr[] = {5, 4, 1, 7, 8}
//    Output: 25

    public static void main(String[] args) {

        int[] numbers = new int[]{2, 3, -8, 7, -1, 2, 3};
        int result = 0;
        int sum = numbers[0];
        for(int i=1; i<numbers.length;i++) {
            sum = sum + numbers[i];
            if(sum > result) {
                result = sum;
            }
        }

        System.out.println("SUM : " + sum);
    }
}
