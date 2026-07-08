class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        String ans = "";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch!='0'){
                ans+=ch;
                sum+=ch-'0';
            }
        }
        long x = ans.isEmpty()?0:Long.parseLong(ans);
        return x*sum;
    }
}