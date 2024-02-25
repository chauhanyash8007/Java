// super keyword

public class OOPS18 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);

    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called"); // 1 print
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "Brown"; // super key called parent class first then child class
        // if we don't write super here java by default called super (parent) class
        // first
        System.out.println("Horse constructor is called"); // 2 print because of super keyword
    }
}
