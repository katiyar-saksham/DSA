class Solution {
    private int getDigitSum(int num){
        int sum = 0 ;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }

        return sum;
    }

    private int compareDigitSum(int num1 , int num2){
        int num1DigitSum = getDigitSum(num1);
        int num2DigitSum = getDigitSum(num2);

        if(num1DigitSum != num2DigitSum){
            return Integer.compare(num1DigitSum , num2DigitSum);
        }

        return Integer.compare(num1 , num2);
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;

        Integer[] afterSorted = new Integer[n];

        for(int i = 0 ; i<n ; i++){
            afterSorted[i] = nums[i];
        }

        Arrays.sort(afterSorted, this::compareDigitSum);

        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            map.put(nums[i] , i);
        }

        int swap = 0;
        for(int i = 0 ; i<n ; i++){
            int expectedVal = afterSorted[i];
            int currVal = nums[i];

            if(expectedVal==currVal) continue;

            int idx = map.get(expectedVal);

            nums[i] = expectedVal;
            nums[idx] = currVal;

            map.put(expectedVal , i);
            map.put(currVal , idx);

            swap++;
        }

        return swap;
    }
}