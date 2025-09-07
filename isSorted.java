public class isSorted {
    static boolean sorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        // if (arr[idx] > arr[idx + 1]) {
        // return false;
        // }

        // return sorted(arr, idx + 1);

        return arr[idx] < arr[idx + 1] && sorted(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] sortedArr = { 1, 2, 3, 4, 5 };
        int[] unsortedArr = { 1, 3, 2, 4, 5 };

        System.out.println("sortedArr is sorted? " + sorted(sortedArr, 0));
        System.out.println("unsortedArr is sorted? " + sorted(unsortedArr, 0));
    }
}
