/**
 * Worst case: O(n^2)
 * best case: O(n)
 *
 * Element chosen(key) is compared with the elements at lower indices and inserted at the lowest right position.
 */
public class InsertionSort {
    static int[] arr = new int[]{12, 1, 4, 6, 7, 4, 3};

    public static void main(String[] args) {
        insertionSort(arr);

        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
