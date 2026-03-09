class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> mpp = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<k;i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
        }
        
        ans.add(mpp.size());
        
        //slide window
        for(int i = k; i < arr.length; i++){
            
            // remove left element
            int left = arr[i-k];
            mpp.put(left, mpp.get(left) - 1);
            
            if(mpp.get(left) == 0){
                mpp.remove(left);
            }
            
            // add new right element
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
            
            ans.add(mpp.size());
        }
        
        
        return ans;
    }
}