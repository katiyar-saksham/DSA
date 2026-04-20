class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int res=0,sum=0;
        mpp.put(0, -1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)sum-=1;
            if(nums[i]==1)sum+=1;

            if(mpp.containsKey(sum)) res = Math.max(res, i - mpp.get(sum));
            else mpp.put(sum,i);
        }
        return res;
    }
}