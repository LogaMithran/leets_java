package dsa;

public class QuickSort {
    static int largestElement(int[] arr, int n) {
        int len = arr.length;
        quick_sort(arr, 0, len - 1);
        return arr[arr.length - 1];
    }

    static int partitionAndGetNewPivot(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    static int[] quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int newPivotIndex = partitionAndGetNewPivot(arr, low, high);
            quick_sort(arr, low, newPivotIndex - 1);
            quick_sort(arr, newPivotIndex + 1, high);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 94, 5, 26, 7, 18, 9};
        int result = largestElement(arr, arr.length);
        System.out.println(result);
    }
}
