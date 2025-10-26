
public class InsertionSort {
  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void insertionSort(int[] arr) {
  }

  public static void main(String[] args) {
    int[] arr = { 64, 25, 12, 22, 11 };
    insertionSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
