package BasicMath;

public class AllDivisor {
    public static void main(String[] args) {
        int N = 12;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                System.out.println(i);
                if (i != N / i) {
                    System.out.println(N / i);
                }
            }
        }
    }
}
