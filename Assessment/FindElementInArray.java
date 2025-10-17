public class FindElementInArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 3;
        int position = findElement(arr, key);
        System.out.println(position == -1 ? "Element " + key + " not found" : "Element " + key + " found at position " + position);
    }

    private static int findElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

