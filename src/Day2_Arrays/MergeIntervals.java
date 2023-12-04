package Day2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(mergeOverlappingIntervals(intervals)));
    }

    public static int[][] mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length; // size of the array
        // Sort the given intervals:
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedIntervals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If the current interval does not
            // lie in the last interval:
            if (mergedIntervals.isEmpty() || arr[i][0] > mergedIntervals.get(mergedIntervals.size() - 1)[1]) {
                mergedIntervals.add(new int[]{arr[i][0], arr[i][1]});
            }
            // If the current interval
            // lies in the last interval:
            else {
                mergedIntervals.get(mergedIntervals.size() - 1)[1] = Math.max(mergedIntervals.get(mergedIntervals.size() - 1)[1], arr[i][1]);
            }
        }

        // Convert the List<int[]> to int[][] for the return type
        return mergedIntervals.toArray(new int[0][]);
    }

}
