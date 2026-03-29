class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
           lst.add(st.isEmpty() ? (i+1) : (i - st.peek()));
            
            st.push(i);
        }
        return lst;
    }
}