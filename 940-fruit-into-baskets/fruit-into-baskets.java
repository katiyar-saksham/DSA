class Solution {
    public int totalFruit(int[] arr) {
        //self
        //longest contiguous subarray that contains at most 2 distinct numbers
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int rem = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);

            while (mpp.size() > 2) {
                mpp.put(arr[rem], mpp.get(arr[rem]) - 1);
                if (mpp.get(arr[rem]) == 0) {
                    mpp.remove(arr[rem]);
                }
                rem++;
            }
            
            ans = Math.max(ans, i - rem + 1);
        }
        return ans;
    }
}