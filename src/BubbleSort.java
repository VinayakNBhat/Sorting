/**
 * Worst case complexity: O(n^2)
 * Best case: O(n)
 * Bubble Sorting is 'stable' technique. i.e maintains input array order when there is are same keys.
 */
public class BubbleSort {
    static int[] arr = new int[]{12, 1, 4, 6, 7, 4, 3};

    public static void main(String[] args) {
        bubleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void bubleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] >= arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }
}
