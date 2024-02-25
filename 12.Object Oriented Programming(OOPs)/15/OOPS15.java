// Abstract Classes

public class OOPS15 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a= new Animal(); can not created abstract classes object
        System.out.println(h.color);

        Mustang myHorse = new Mustang();
        myHorse.color = "white";
        System.out.println(myHorse.color);

    }
}

abstract class Animal {

    String color;

    // can not create Object but we can create constructors
    Animal() {
        color = "brown";
        System.out.println("animal constructor called");
    }

    // non-abstract method
    void eat() {
        System.out.println("animal eats");
    }

    // abstract method
    abstract void walk(); // giving only idea not implementation

}

// when we create a horse object by default his color will be brown (parent
// class)if we want
// to change we need to call the function

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
    String color;

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
