// constructor chaining method
public class OOPS13 {
    public static void main(String[] args) {
        // Temp t = new Temp();

    }
}

class Temp {
    Temp() {
        this(5);
        System.out.println("The default constructor");
    }

    Temp(int x) {
        this(5, 15);
        System.out.println(x);
    }

    Temp(int x, int y) {
        System.out.println(x * y);
    }

}
