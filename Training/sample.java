import java.util.Scanner;

public class sample {

    static int rev(int num) {

        if (num == 0) {
            return 0;
            
        }
        int dig = num % 10;
        
        return dig+rev(num / 10);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c=rev(num);
        System.out.println(c);
        sc.close();
    }
}
