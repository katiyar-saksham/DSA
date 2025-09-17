public class LinearSearch {
    static boolean LS(int[] arr, int target, int idx) {
        if (idx == arr.length - 1) {
            return false;
        }
        if (arr[idx] == target) {
            return true;
        }
        return LS(arr, target, idx + 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(LS(nums, 1, 0));
    }
}
