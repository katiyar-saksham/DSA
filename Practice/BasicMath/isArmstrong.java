public class isArmstrong {

    public static boolean checkArmstrong(int number) {
        int original = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int number = 153;
        if (checkArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
