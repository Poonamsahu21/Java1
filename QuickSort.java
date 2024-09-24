import java.util.*;
public class QuickSort {
    public static void qsort(int[] a, int x, int y) {
        if (x < y) {
            int j = partition(a, x, y);
            qsort(a, x, j - 1);
            qsort(a, j + 1, y);
        }
    }

    public static int partition(int[] a, int p, int q) {
        int pivot = a[q];
        int i = p - 1;
        for (int j = p; j < q; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[q];
        a[q] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] data = {8, 7, 2, 1, 0, 9,3, 6};
        int[] a = {2, 9, 9, 7, 9, 2,3,6, 4, 5, 8};
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(a));

        int size = a.length;
        qsort(a, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(a));
    }
}
