import java.util.HashMap;

public class FindRepeatingElement {
    public static int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        for (int num : mpp.keySet()) {
            if (mpp.get(num) > 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }
}

