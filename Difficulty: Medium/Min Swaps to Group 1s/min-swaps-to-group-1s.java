class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int one = 0;
        int zero = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]== 1){
                one++;
            }
        }
        
        if(one == 0){
            return -1;
        }
        
        if(one == 1){
            return 0;
        }
        
        for(int i=0;i<one;i++){
            if(arr[i]== 0){
                zero++;
            }
        }
        int ans = zero;
        
        for(int i=one;i<arr.length;i++){
            if(arr[i-one]== 0){
                zero--;
            }
            if(arr[i]== 0){
                zero++;
            }
            ans = Math.min(ans, zero);
        }
        return ans;
    }
}
