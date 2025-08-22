public class isPrime {

    public static boolean checkPrime(int number) {
        if (number <= 1) return false;
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) {
                    count++;
                }
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        int number = 13;
        if (checkPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
