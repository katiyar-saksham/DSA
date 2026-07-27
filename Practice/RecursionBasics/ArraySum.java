public class ArraySum {
    static int sum(int[] arr, int i) {
        if(i>arr.length){
            return 0;
        }
        System.out.print(arr[i]+",");

        return sum(arr,i+1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        sum(nums, 0);
    }
}
