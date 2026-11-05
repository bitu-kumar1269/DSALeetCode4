import java.util.Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int c = 0;
        for (int x : arr1) {
            if (valid(arr2, x - d, x + d)) {
                c++;
            }
        }
        return c;
    }

    private boolean valid(int[] a, int min, int max) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] >= min && a[m] <= max) return false;
            if (a[m] < min) l = m + 1;
            else r = m - 1;
        }
        return true;
    }
}