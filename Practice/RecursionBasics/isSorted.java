public class isSorted {
    static boolean sorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        return arr[idx] < arr[idx + 1] && sorted(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] Arr1 = { 1, 2, 3, 4, 5 };
        int[] Arr2 = { 1, 3, 2, 4, 5, 6, 7, 8, 3, 5, 4 };
        int[] Arr3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("is Array 1 sorted? " + sorted(Arr1, 0));
        System.out.println("Arr2 sorted? " + sorted(Arr2, 0));
        System.out.println("Arr3 sorted? " + sorted(Arr3, 0));
    }
}
