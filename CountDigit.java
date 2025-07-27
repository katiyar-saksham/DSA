import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        int number = 12345;
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}