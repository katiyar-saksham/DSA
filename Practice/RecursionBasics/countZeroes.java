public class countZeroes {
    static int count(int n) {
        if (n == 0) {
            return 0;
        }

        int dig = n % 10;
        if (dig == 0) {
            return 1 + count(n / 10);
        } else {
            return count(n / 10);
        }
    }

    public static void main(String[] args) {
        long result = count(102050000);
        System.out.println(result);
    }
}
