public class RemoveMinMax {

    public static int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIdx = -1;
        int maxIdx = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }
        // int index = 0;
        // for (int i : arr) {
        // if (i != Min && i != Max) {
        // res[index++] = i;
        // }
        // }

        // Goal: Remove both the minimum and maximum values with the fewest deletions.
        // Three strategies:

        // 1. Delete from the left:
        int opt1 = Math.max(minIdx, maxIdx) + 1;
        // This calculates the deletions needed by removing elements from the left up to
        // the larger of the two indices (minIdx or maxIdx).
        // The +1 accounts for the deletion of the element at the index itself.

        // 2. Delete from the right:
        int opt2 = n - Math.min(minIdx, maxIdx);
        // This calculates the deletions needed by removing elements from the right, up
        // to the smaller of the two indices (minIdx or maxIdx).
        // This minimizes the number of deletions needed from the right side.

        // 3. Delete one from each side:
        int opt3 = (Math.min(minIdx, maxIdx) + 1) + (n - Math.max(minIdx, maxIdx));
        // This strategy involves deleting one element from the left side and one from
        // the right side.
        // It adds the number of deletions from both ends to calculate the total
        // deletions.

        return Math.min(opt1, Math.min(opt2, opt3));
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 1, 6, 3 };
        System.out.println("Minimum deletions needed to remove both the MIN and MAX values: " + minimumDeletions(nums));
    }
}