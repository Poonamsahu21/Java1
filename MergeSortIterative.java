import java.util.Arrays;

    public class MergeSortIterative {

        // Function to merge two sorted arrays
        public static void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int[] L = new int[n1];
            int[] R = new int[n2];

            for (int i = 0; i < n1; ++i)
                L[i] = arr[left + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[mid + 1 + j];

            int i = 0, j = 0;
            int k = left;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        // Function to perform merge sort iteratively
        public static void mergeSort(int[] arr) {
            int n = arr.length;
            int currSize;

            for (currSize = 1; currSize <= n - 1; currSize = 2 * currSize) {
                for (int left = 0; left < n - 1; left += 2 * currSize) {
                    int mid = Math.min(left + currSize - 1, n - 1);
                    int right = Math.min(left + 2 * currSize - 1, n - 1);
                    merge(arr, left, mid, right);
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6, 7};
            System.out.println("Given array:");
            System.out.println(Arrays.toString(arr));

            mergeSort(arr);

            System.out.println("\nSorted array:");
            System.out.println(Arrays.toString(arr));
        }
    }


