package BasicMath;

public class GCD {
    public static void main(String[] args) {
        int N1 = 11;
        int N2 = 13;
        int gcd = 1;
        for (int i = Math.min(N1, N2); i > 0; i--) {
            if (N1 % i == 0 && N2 % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("GCD of " + N1 + " and " + N2 + " is: " + gcd);
    }
}

// Time Complexity: O(min(N1, N2))
// Space Complexity: O(1)