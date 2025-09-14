import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int result = binarySearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found ");
        }

        scanner.close();
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else
                return mid;
        }

        return -1;
    }

}
