public class prodOfDigits {
    static int prodDigits(int n) {
        if (n == 0) return 0;
        if (n % 10 == n) {
            return n;
        }
        return n % 10 * prodDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(prodDigits(1424));
    }
}
