class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        int[] arr = new int[st.size()];
        int k=0;
        while(st.size()>0){
            arr[k++]=st.pop();
        }
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
    }
}
