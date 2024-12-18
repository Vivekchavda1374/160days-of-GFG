import java.util.Arrays;

public class MinimizeHeightDifference {
    public static int getMinDiff(int[] arr, int n, int k) {
        if (n == 1) {
            return 0;
        }
        Arrays.sort(arr);
        int diff = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            int minElement = Math.min(arr[0] + k, arr[i] - k);
            int maxElement = Math.max(arr[n - 1] - k, arr[i - 1] + k);

            if (minElement >= 0) { // Ensure no negative height
                diff = Math.min(diff, maxElement - minElement);
            }
        }

        return diff;
    }


