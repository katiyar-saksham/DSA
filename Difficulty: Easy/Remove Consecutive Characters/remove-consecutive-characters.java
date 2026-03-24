// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                continue;
            }
            st.push(s.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }
}