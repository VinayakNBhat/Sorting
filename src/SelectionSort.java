/**
 * Worst case complexity: O(n^2)
 * Best case: O(n)
 * Selection Sorting is 'stable' technique. i.e maintains input array order when there is are same keys.
 */
public class SelectionSort {

        static int[] arr = new int[]{1,12, 1, 4, 6, 7, 4, 3};

        public static void main(String[] args) {
            selectionSort(arr);
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
        static void selectionSort(int[] arr){
            for(int i=0; i < arr.length-1; i++){
                int  min = i;
                boolean isSorted = true;
                for(int j = i+1; j < arr.length; j++){
                    if(isSorted && arr[j] < arr[j-1]){
                        isSorted = false;
                    }
                    if(arr[j] < arr[min]){
                        min = j;
                    }
                }
                if(isSorted){
                    return;
                }
                if(i == min){
                    continue;
                }
                int temp =arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
