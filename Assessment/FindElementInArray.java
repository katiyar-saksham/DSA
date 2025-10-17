public class FindElementInArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 3;
        int position = findElement(arr, key);
        printResult(position, key);
    }

    private static int findElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i + 1; // return 1-based index
            }
        }
        return -1;
    }

    private static void printResult(int position, int key) {
        if (position == -1) {
            System.out.println("Element " + key + " not found");
        } else {
            System.out.println("Element " + key + " found at position " + position);
        }
    }
}
