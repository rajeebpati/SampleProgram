package samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftAlowance {
    public static void main(String[] args) {

        //In a store, a colleague can work for multiple departments. Here are shifts of a colleague in various departments:
        //
        //In Bakery department: From 8 to 10
        //In Checkout department: From 10 to 12
        //In Diary department: From 14 to 19

//        Given the above split of shifts, provide an API/method to return the different shifts of a colleague for the day after merging contiguous shifts.
//        This will be exposed to the colleague in different UI and help them plan their day accordingly.
//
//                His shift timings in this case are 8 to 12 and 14 to 19
        
    }

    public static List<Integer> getEmnployeeShifts() {
        //{8,10} {10,12}, {14,19}
        //

        ArrayList<int[]> shiftList = new ArrayList<>();
        shiftList.add(new int[]{8,10});
        shiftList.add(new int[]{10,12});
        shiftList.add(new int[]{14,19});

        int counter = 0;
        ArrayList<Integer> shifts = new ArrayList();
        for(int i=0; i<shiftList.size()-1; i++) {


            if(Arrays.stream(shiftList.get(i)).max()== Arrays.stream(shiftList.get(i+1)).min()) {
                //counter++;
               // Collections.addAll(shiftList.get(i),shiftList.get(i+1) );
                //int min =
                shifts.add(Arrays.stream(shiftList.get(i)).min().getAsInt());
                shifts.add(Arrays.stream(shiftList.get(i+1)).max().getAsInt()); //{8,12}

            }
        }

        return shifts;

    }
}
