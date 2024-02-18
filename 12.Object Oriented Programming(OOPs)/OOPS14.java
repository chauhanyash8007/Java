
class Complex {
    int real;
    int imaginary;

    public Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imaginary + b.imaginary));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imaginary - b.imaginary));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.imaginary * b.imaginary)),
                ((a.real * b.imaginary) + (a.imaginary * b.real)));
    }

    public void printComplex() {
        if (real == 0 && imaginary != 0) {
            System.out.println(imaginary + "i");
        } else if (imaginary == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imaginary + "i");
        }
    }

}

public class OOPS14 {
    public static void main(String[] args) {
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }

}