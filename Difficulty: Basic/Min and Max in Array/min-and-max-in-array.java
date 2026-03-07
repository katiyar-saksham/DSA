import java.util.*;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        return helper(arr, 0, arr[0], arr[0]);
      
    }
    
    private ArrayList<Integer> helper(int[] arr, int i, int min, int max) {
        
        if(i==arr.length){
            ArrayList<Integer> res = new ArrayList<>();
            res.add(min);
            res.add(max);
            return res;
        }
        
        if (arr[i] < min) min = arr[i];
        if (arr[i] > max) max = arr[i];
        
        return helper(arr, i + 1, min, max);
    }
}