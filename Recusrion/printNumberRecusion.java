public class printNumberRecusion {
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
