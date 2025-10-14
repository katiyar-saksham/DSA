public class SearchElement {
    // Linear Search in Unsorted Array
    public static int linearSearchUnsorted(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Linear Search in Sorted Array
    public static int linearSearchSorted(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search in Sorted Array
    public static int binarySearchSorted(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Fibonacci Search in Sorted Array
    public static int fibonacciSearchSorted(int[] arr, int target) {
        int fibMMm2 = 0;
        int fibMMm1 = 1;
        int fibMm = fibMMm2 + fibMMm1;

        if (arr[0] == target) {
            return 0;
        }

        while (fibMm < arr.length) {
            int i = Math.min(fibMm, arr.length - 1);
            if (arr[i] < target) {
                fibMMm2 = fibMMm1;
                fibMMm1 = fibMm;
                fibMm = fibMMm2 + fibMMm1;
            } else if (arr[i] > target) {
                fibMm = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibMm - fibMMm1;
            } else {
                return i;
            }
        }
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = { 12, 34, 10, 6, 40 };
        int key = 40;

        int position = linearSearchUnsorted(arr, key);

        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element Found at Position: " + (position + 1));
        }
    }
}
