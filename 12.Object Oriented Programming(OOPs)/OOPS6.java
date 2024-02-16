public class OOPS6 {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.eat();
    }
}

// Hierarchial inheritance

// base class (parent class)
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breathes");
    }
}

// derived from Animal class

class Mammals extends Animal {
    void walk() {
        System.out.println("walk");
    }
}

// derived from Animal class

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

// derived from Animal class

class Bird extends Animal {
    void fly() {
        System.out.println("fiy");
    }
}
