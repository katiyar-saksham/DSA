class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        if (arr.length == 0) return 0;
        int sum = 0;
        int n=arr.length;

        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        
        int max=sum;
        for(int i=k;i<n;i++){
            sum += arr[i] - arr[i - k];
            
            max=Math.max(sum,max);
        }
        return max;
    }
}