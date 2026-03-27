class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        
    for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()<=arr[i])
            st.pop();
            
            if(st.isEmpty()){
                res.add(-1);
            }else{
                res.add(st.peek());
            }
            st.push(arr[i]);
        }
        
        return res;
    }
    
}