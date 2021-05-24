public class BubbleSort {
    static int[] arr = new int[]{23,4,6,4,1,9,7,6};

    public static void main(String[] args) {
        bubleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void bubleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] >= arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
