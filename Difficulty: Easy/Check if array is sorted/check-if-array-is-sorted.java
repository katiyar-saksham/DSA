class Solution {
    
    public boolean isSorted(int[] arr) {
        return helper(arr, 0);
    }
    
    boolean helper(int[] arr, int i) {
        if (i == arr.length - 1) return true;
        
        if (arr[i] > arr[i + 1]) return false;
        
        return helper(arr, i + 1);
    }
}