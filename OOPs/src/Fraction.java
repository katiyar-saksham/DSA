public class Fraction {

    int num, den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Fraction add(Fraction f) {
        return new Fraction(
                num * f.den + den * f.num,
                den * f.den
        );
    }

    public String toString() {
        return num + "/" + den;
    }

    public static void main(String[] args) {

        Fraction f1 = new Fraction(7,3);
        Fraction f2 = new Fraction(3, 7);

        Fraction result = f1.add(f2);

        System.out.println(result);  // 10/8
    }
}