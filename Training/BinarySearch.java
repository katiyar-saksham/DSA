import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int result = binarySearch(nums, target);

        if (result != -1) {
            System.out.println("Element found ");
        } else {
            System.out.println("Element not found ");
        }

        scanner.close();
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}


