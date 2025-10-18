public class RemoveMinMax {

    public static int[] removeMinMax(int[] arr) {
        int n = arr.length;
        int[] res = new int[n - 2];

        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i < Min) {
                Min = i;
            }
            if (i > Max) {
                Max = i;
            }
        }

        int index = 0;
        for (int i : arr) {
            if (i != Min && i != Max) {
                res[index++] = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 8, 2, 0, 100 };
        int[] modifiedArray = removeMinMax(arr);
        System.out.println("Array after removing min and max:");
        for (int num : modifiedArray) {
            System.out.print(num + " ");
        }
    }
}