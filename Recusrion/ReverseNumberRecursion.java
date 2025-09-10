public class ReverseNumberRecursion {
    // 123 --> 321

    static int sum = 0;

    static void reverse(int n) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum = sum * 10 + n % 10;
        reverse(n / 10);
    }

    public static void main(String[] args) {
        reverse(1253);
    }
}