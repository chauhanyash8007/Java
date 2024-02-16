// inheritance 

public class OOPS4 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// single Level-inheritance

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

// Derived class (child class/sub class)
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}
