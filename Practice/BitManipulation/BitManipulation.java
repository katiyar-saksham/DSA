// package BitManipulation;

// import java.util.*;

public class BitManipulation {
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("NOT a: " + (~a));
        System.out.println("Left Shift: " + (a << 1)); // 0110 -> 1100 // n*2^x
        System.out.println("Right Shift: " + (a >> 1));// 0110 -> 0011 // n/2^x

        //bit masking
        int num = 5; // 0101
        int mask = 1; // 0001
        int result = num & mask; // 0101 & 0001 = 0001
        System.out.println("Bitwise AND with mask: " + result);
    }
}