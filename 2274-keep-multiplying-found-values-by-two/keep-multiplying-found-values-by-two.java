class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> stt = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            stt.add(nums[i]);
        }
        while(stt.contains(original)){
            original *=2;
        }
        return original;
    }
}