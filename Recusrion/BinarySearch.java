import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int result = binarySearch(nums, target, 0, nums.length - 1);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found ");
        }

        scanner.close();
    }

    static int binarySearch(int[] n, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (target < n[mid]) {
            return binarySearch(n, target, start, mid - 1);
        } else if (target > n[mid]) {
            return binarySearch(n, target, mid + 1, end);
        } else
            return mid;
    }
}
