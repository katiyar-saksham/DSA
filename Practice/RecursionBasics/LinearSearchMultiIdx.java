import java.util.ArrayList;

public class LinearSearchMultiIdx {

    static ArrayList<Integer> LS(int[] arr, int target, int idx) {
        ArrayList<Integer> res = new ArrayList<>();
        if (idx == arr.length) {
            return res;
        }
        if (arr[idx] == target) {
            res.add(idx);
        }
        ArrayList<Integer> temp = LS(arr, target, idx + 1);
        res.addAll(temp);
        return res;
    }

    public static ArrayList<Integer> linearSearch(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
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

        ArrayList<Integer> recursiveIndices = LS(nums, target, 0);
        ArrayList<Integer> iterativeIndices = linearSearch(nums, target);

        System.out.println("\"LS\" Indices of " + target + " in the array: " + recursiveIndices);
        System.out.println("\"linearSearch\" Indices of " + target + " in the array: " + iterativeIndices);
    }
}