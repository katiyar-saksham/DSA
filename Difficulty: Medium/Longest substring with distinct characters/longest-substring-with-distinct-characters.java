class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashMap<Character,Integer> mpp = new HashMap<>();
        int n=s.length();
        int maxLen=0;
        int left=0;
        
        for(int right=0;right<n;right++){
            char ch = s.charAt(right);
            
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            
            while(mpp.get(ch)>1){
                mpp.put(s.charAt(left),mpp.getOrDefault(s.charAt(left),0)-1);
                if(mpp.get(s.charAt(left))==0){
                    mpp.remove(s.charAt(left));
                }
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}