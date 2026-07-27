import java.util.*;

class ComplexNumber {

    int x;
    int y;

    ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        if (y > 0) System.out.println(x + " + " + y + "i");
        else System.out.println(x + " - " + (-y) + "i");
    }

    public void add(ComplexNumber z2) {
        x += z2.x;
        y += z2.y;
    }

    public void div(ComplexNumber z2) {
        int a = this.x;
        int b = this.y;
        int c = z2.x;
        int d = z2.y;

        int denominator = c * c + d * d;

        int real = (a * c + b * d) / denominator;
        int imag = (b * c - a * d) / denominator;

        this.x = real;
        this.y = imag;
    }

    public void mul(ComplexNumber z2) {
        int real = x * z2.x - y * z2.y;
        int imag = x * z2.y + y * z2.x;

        x = real;
        y = imag;
    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, -5);
        z1.print();

        ComplexNumber z2 = new ComplexNumber(3, 4);
        z2.print();

        z1.add(z2);
        z1.print();

        z1.mul(z2);
        z1.print();

        z1.div(z2);
        z1.print();
    }
}
