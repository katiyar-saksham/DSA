class Solution {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        HashMap<Character,Integer> mpp = new HashMap<>();
        int len=0;
        int maxLen=-1;
        int left=0;
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            mpp.put(ch ,mpp.getOrDefault(ch,0)+1);
            
            while(mpp.size()>k){
                char chL=s.charAt(left);
                mpp.put(chL ,mpp.get(chL)-1);
                if(mpp.get(chL)==0){
                    mpp.remove(chL);
                }
                left++;
            }
            if(mpp.size()==k){
                maxLen = Math.max(i-left+1,maxLen);
            }
        }
        return maxLen;
    }
}