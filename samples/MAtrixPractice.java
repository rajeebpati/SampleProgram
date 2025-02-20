package samples;

import java.util.Arrays;

public class MAtrixPractice {
    public static void main(String[] args) {
        int[][] matrix = {
//                {1,2,3},
//                {3,0,4},
//                {5,6,7}
                { 0, 1, 2, 0 },
                { 3, 4, 0, 2 },
                { 1, 3, 1, 5 }
        };

        new MAtrixPractice().setZero(matrix);
    }

    private void setZero(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        boolean[] row = new boolean[rowSize];
        boolean[] column = new boolean[colSize];

        //find the [position of 0

        for(int r = 0; r< rowSize; r++) {
            for(int c = 0; c < colSize; c++) {
                if(matrix[r][c] == 0){
                    row[r] = true;
                    column[c] = true;
                }
            }
        }

        for(int r = 0; r< rowSize; r++) {
            for(int c = 0; c < colSize; c++) {
                if(row[r]
                        || column[c]
                ){
                    matrix[r][c] =0;
                }
            }
        }

        for(int[] array:matrix) {
            System.out.println(Arrays.toString(array));
        }

    }
}
