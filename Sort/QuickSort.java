public class QuickSort {
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;

        while (i < j) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) return j;

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pointer = partition(arr, low, high);

            quickSort(arr, low, pointer);
            quickSort(arr, pointer + 1, high);
        }
    }
}
