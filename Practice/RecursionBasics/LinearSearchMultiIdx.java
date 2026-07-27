import java.util.*;

public class LinearSearchMultiIdx {

    static List<Integer> LS(int[] arr, int target, int idx) {
        List<Integer> res = new ArrayList<>();
        if (idx == arr.length) {
            return res;
        }
        if (arr[idx] == target) {
            res.add(idx);
        }
        List<Integer> temp = LS(arr, target, idx + 1);
        res.addAll(temp);
        return res;
    }

    public static List<Integer> linearSearch(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 4;

        List<Integer> recursiveIndices = LS(nums, target, 0);
        List<Integer> iterativeIndices = linearSearch(nums, target);

        System.out.println("\"LS\" Indices of " + target + " in the array: " + recursiveIndices);
        System.out.println("\"linearSearch\" Indices of " + target + " in the array: " + iterativeIndices);
    }
}