public class AllDivisor {

    public static void printDivisors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i) {
                    System.out.println(n / i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int N = 12; // Example input
        System.out.println("Divisors of " + N + " are:");
        printDivisors(N);
    }
}
