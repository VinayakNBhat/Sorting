/**
 * In this case we use 'top-down' approach.
 * we divide the list into sub-lists.
 * then sort and store in the temp array.
 * Later modify the original array.
 *
 * Worst Case: O(n log(n) )
 * Best case: O(n)
 */
public class MergeSort {

    static int[] arr = new int[]{12, 1, 4, 6, 7, 4, 3};

    public static void main(String[] args) {
        mergeSort(arr, 0, arr.length-1);

        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int mid =  (end - start) / 2 + start;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        if (start >= end ) return;

        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] >= arr[j]) {
                temp[k++] = arr[j++];
            } else {
                temp[k++] = arr[i++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int m = start; m <= end; m++) {
            arr[m] = temp[m - start];
        }
    }
}
