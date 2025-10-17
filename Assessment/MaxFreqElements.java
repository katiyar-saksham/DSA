import java.util.HashMap;

public class MaxFreqElements {

    public static int maxFreq(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int maxF = 0;
        int ans = 0; // initialize to 0, since we are summing frequencies

        // Count frequency of each element
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        for (int freq : mpp.values()) {
            if (freq > maxF) {
                maxF = freq;
            }
        }

        // Sum frequencies of elements that have the max frequency
        for (int freq : mpp.values()) {
            if (freq == maxF) {
                ans += freq;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 5, 5 };
        int res = maxFreq(nums);
        System.out.println(res); // Output: 3
    }
}
