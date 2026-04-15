// User function Template for Java

class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int bestEnding = a[0];
        int res = a[0];
        
        for(int i=1; i<size;i++){
            bestEnding=Math.min(bestEnding+a[i],a[i]);
            res=Math.min(res,bestEnding);
        }
        return res;
    }
}