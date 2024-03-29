/**
 * Worst case: O(n^2)
 * Best case: O(nlog(n))
 * Not a 'stable' algorithm.
 */
public class QuickSort {

    static int[] arr = new int[]{12, 1, 4, 6, 7, 4, 3};

    public static void main(String[] args) {
        quickSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;
        if (outOfRange(arr, low) || outOfRange(arr, high)) return;
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex-1);
        quickSort(arr, pivotIndex+1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        if(low >= high) return low;
        int pivotIndex = low;
        int pivotElement = arr[high];
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivotElement) {
                swap(arr, pivotIndex, i);
                pivotIndex++;
            }
        }
        swap(arr, pivotIndex, high);
        return pivotIndex;
    }

    static void swap(int[] arr, int from, int to) {
        if (from == to) return;
        if (outOfRange(arr, from) || outOfRange(arr, to)) return;
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    static boolean outOfRange(int[] arr, int index) {
        return index < 0 || index >= arr.length;
    }
}
