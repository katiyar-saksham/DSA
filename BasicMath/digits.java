package BasicMath;
public class digits {
    public static void main(String[] args) {
        int number = 7675765;
        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number /= 10;
        }
    }
}
