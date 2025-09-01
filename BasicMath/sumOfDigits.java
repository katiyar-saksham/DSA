public class sumOfDigits {
    static int sumDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }
}
