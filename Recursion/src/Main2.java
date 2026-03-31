import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int ele = 3;
        String s = "abc";
        ArrayList<String> list = new ArrayList<>();


//        PrintArray(arr, 0);
//        System.out.println(exists(arr, ele, 0));
//        System.out.println(BinarySearch(arr, ele));
//        printSubsets("", s, 0, list);
//        System.out.println(list);
//        pip(3);
        hanoi(3, 'A', 'B', 'C');
    }

    private static void hanoi(int n, char A, char B, char C) {
        if (n == 0) return;

        //n-1 from A to B via C
        hanoi(n - 1, A, C, B);

        //largest from A to C
        System.out.println(A + "->" + C);

        //n-1 disks from B to C via A
        hanoi(n - 1, B, A, C);

    }

    private static void pip(int n) {
        if (n == 0) return;

        System.out.print(n + " ");
        pip(n - 1);

        System.out.print(n + " ");
        pip(n - 1);

        System.out.print(n + " ");
    }

    private static void printSubsets(String ans, String s, int idx, List<String> list) {
        if (idx == s.length()) {
            if (ans.length() != 0) list.add(ans);
            return;
        }

        char ch = s.charAt(idx);
        printSubsets(ans + ch, s, idx + 1, list); // pick
        printSubsets(ans, s, idx + 1, list);      // skip
    }

    private static int BinarySearch(int[] nums, int target) {
        return searchRecursive(nums, target, 0, nums.length - 1);
    }

    private static int searchRecursive(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return searchRecursive(nums, target, mid + 1, high);
        } else {
            return searchRecursive(nums, target, low, mid - 1);
        }
    }

    private static boolean exists(int[] arr, int ele, int idx) {
        if (idx == arr.length) return false; // Base Case

        if (ele == arr[idx]) return true;
        return exists(arr, ele, idx + 1);
    }

    private static void PrintArray(int[] arr, int idx) {
        int n = arr.length;
        if (idx == n) return;

        System.out.print(arr[idx] + " ");
        PrintArray(arr, idx + 1);
    }
}
