//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void print(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        print(n - 1);
        if (n != 1) System.out.print(n + " ");
    }

    static int Fact(int n) {
        if (n == 1) return 1;
        return (n * Fact(n - 1));
    }

    static int pwr(int a, int b) {
        if (b == 0) return 1;
        return a * pwr(a, b - 1);
    }

    //reduces the recursion calls
    static int pwrLOG(int a, int b) {
        if (b == 0) return 1;

        int half = pwrLOG(a, b / 2);
        if (b % 2 == 0) {
            return half * half;
        } else {
            return a * half * half;
        }
    }

    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev *= 10;
            rev += (n % 10);
            n /= 10;
        }
        return rev;
    }

    static int reverseRec(int n, int r) {
        if (n == 0) return r;
        return reverseRec(n / 10, r * 10 + (n % 10));
    }

    static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    static int gcdIterative(int a, int b) {

        int hcf = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    static int gcdEuclid(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static int gcdRec(int a, int b) {
        if (a == 0) return b;
        return gcdRec(b % a, a);
    }

    static int countWays(int n) {

        if (n == 0) return 1;
        if (n == 1) return 1;

        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
//        print(5);
//        System.out.println(Fact(5));
//        System.out.println(pwrLOG(2, 3));
//        System.out.println(reverseRec(1234, 0));
//        System.out.println(sum(4));
//        System.out.println(gcdIterative(3,6));
//        System.out.println(gcdEuclid(3,6));
//        System.out.println(gcdRec(60, 24));
        System.out.println(countWays(4));
    }


}