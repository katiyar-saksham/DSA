package BasicMath;

public class digit {
    public static void main(String[] args) {
        int number = 12345;
        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number /= 10;
        }
    }
}
