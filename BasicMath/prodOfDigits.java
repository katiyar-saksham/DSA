public class prodOfDigits {
    static int prodDigits(int n) {
        if (n == 1) {
            return 1;
        }
        return n % 10 * prodDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(prodDigits(1424));
    }
}
