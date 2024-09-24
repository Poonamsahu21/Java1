import java.util.*;
public class Min_Max {
    public static int[] mm(int[] a, int i, int j) {
        if (i == j) {
            return new int[]{a[i], a[i]};
        } else if (i == j - 1) {
            if (a[i] < a[j]) {
                return new int[]{a[i], a[j]};
            } else {
                return new int[]{a[j], a[i]};
            }
        } else {
            int mid = (i + j) / 2;
            int[] left = mm(a, i, mid);
            int[] right = mm(a, mid + 1, j);
            return new int[]{Math.min(left[0], right[0]), Math.max(left[1], right[1])};
        }
    }

    public static void main(String s[]) {
        int[] a = {2, 4, 9, 7, 4, 2, 1, 4, 9, 8, 0};
        int[] result = mm(a, 0, a.length - 1);
        System.out.println("Minimum: " + result[0] + "\nMaximum: " + result[1]);
    }
}

