
public class InsertionSort {

  public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j - 1, j);
        }
      }
    }
  }

  // while(j>0)
  // {
  // if (arr[j] < arr[j - 1]) {
  // swap(arr, j, j - 1);
  // }
  // j--;
  // }

  public static void main(String[] args) {
    int[] arr = { 64, 25, 12, 22, 11 };
    insertionSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
