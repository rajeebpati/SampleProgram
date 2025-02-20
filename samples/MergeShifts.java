package samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeShifts {
    public static void main(String[] args) {

        // {8-10},{10-12},{14-19}  input
        //{8-12}, {14-19}  expecting


        // add st array in new list
        //a[1]<b[0] add the array in list
        // else merge find max of a1 and b1 assign the max in new array of a[1]

        ArrayList<int[]> shifts = new ArrayList<>();
        shifts.add(new int[]{8,10}); //
        shifts.add(new int[]{10,12});
        shifts.add(new int[]{14,19});
        shifts.add(new int[]{12,14});

        //PriorityQueue sorted shifts
        //shifts.add(new int[]{14,19});

     //  findMergeShift(shifts).stream().mapToInt(m->);
        //shifts.stream().sorted((s1,s2)-> s1[0]);

        shifts.sort(Comparator.comparingInt(c->c[0]));
        for(int[] shift : shifts) {
            System.out.println(Arrays.toString(shift));
        }
    }

    private static  List<int[]> findMergeShift(ArrayList<int[]> shifts) {
        List<int[]> result = new ArrayList<>();
        for(int[] shift:shifts) {
            if (result.size() == 0 || (shift[0] > result.get(result.size()-1)[1])) {
                result.add(shift); //result = {8,10}  shift={10,12}
            } else{
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1], shift[1]);
            }
        }

        return result;
    }


}
