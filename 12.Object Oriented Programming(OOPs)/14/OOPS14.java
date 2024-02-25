
public class OOPS14 {

    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.sum(1, 2));
        System.out.println(cal.sum((float) 1.5, (float) 1.5));
        System.out.println(cal.sum(1, 2, 3));

        Deer d = new Deer();
        d.eats();

        Human h = new Human();
        h.eats();
    }
}

// Method overloading
// it also called compile time polymorphism(static)

class calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a = b + c;
    }
}

// Method overriding
// it means same function name we use and while using the function which is use
// it also called run time polymorphism(dynamic)
// will be chile function
class Animal {
    void eats() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eats() {
        System.out.println("eats grass");
    }
}

class Human extends Deer {
    void eats() {
        System.out.println("eats pizza");
    }
}