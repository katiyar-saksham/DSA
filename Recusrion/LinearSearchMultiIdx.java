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

        List<Integer> temp = LS(arr, target, idx++);
        res.addAll(temp);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        List<Integer> indices = linearSearch(nums, 1);
        System.out.println("Indices of 1 in the array: " + indices);
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
}
