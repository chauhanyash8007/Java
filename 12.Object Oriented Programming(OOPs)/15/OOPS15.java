// Abstract Classes

public class OOPS15 {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // Animal a= new Animal(); can not created abstract classes object

        // Mustang myHorse = new Mustang();

    }
}

abstract class Animal {

    String color;

    Animal() {
        System.out.println("animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk(); // giving only idea not implementation

}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {

    Chicken() {
        System.out.println("Chicken constructor called");
    }

    void changColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
