public class RemoveDuplicateElementsSortedArray {

    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 2, 2, 1, 1 };
        int k = removeDuplicates(array);

        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int removeDuplicates(int[] nums) {
        int n = nums.length;

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i;
    }
}
