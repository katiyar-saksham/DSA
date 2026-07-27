public class ReverseNumber {

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int number = -12345;
        System.out.println("Reversed number: " + reverse(number));
    }
}
