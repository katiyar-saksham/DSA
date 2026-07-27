public class digit {
    public static void printDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number /= 10;
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Digits of " + number + ":");
        printDigits(number);
    }
}
