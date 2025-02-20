package samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeShift {

    public static List<int[]> mergeShifts(List<int[]> shifts) {
        // Sort shifts based on start time
        shifts.sort(Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        for (int[] shift : shifts) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < shift[0]) {
                // No overlap, add new shift
                merged.add(shift);
            } else {
                // Merge overlapping shifts
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], shift[1]);
            }


        }
        return merged;
    }

    public static void main(String[] args) {
        List<int[]> shifts = Arrays.asList(new int[]{8, 10}, new int[]{14, 19}, new int[]{10, 12});
        List<int[]> mergedShifts = mergeShifts(shifts);

        for (int[] shift : mergedShifts) {
            System.out.println(Arrays.toString(shift));
        }
    }
}
