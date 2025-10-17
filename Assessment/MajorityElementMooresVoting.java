public class MajorityElementMooresVoting {
    public static int majorityElement(int[] nums) { // n/2 Majority element
        // isme moore voting algo use hoga

        // sabse pehl candidate ko select karna hoga, if candidate aaye to count++ else
        // dusra aaye to count--
        // agar count 0 ho jata hai to naye candidate ko select karna hoga as ab vo
        // majority m nhi hai
        // last me candidate ko verify karna hoga ki wo majority hai ya nahi

        // time complexity O(n)
        // space complexity O(1)

        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1; // count ++ yaa -- hoga based on condition (num == candidate)
        }

        // Second pass: Verify the candidate
        int countVerify = 0;
        for (int num : nums) {
            if (num == candidate) {
                countVerify++;
            }
        }

        if (countVerify > nums.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 0, 0, 1};
        int result = majorityElement(nums);
        System.out.println(result);  // Should print 1 since it's the majority element
    }
}
