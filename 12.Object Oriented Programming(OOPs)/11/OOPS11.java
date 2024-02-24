public class OOPS11 {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();

        dobby.lags = 4;
        System.out.println(dobby.lags);
    }
}

// multi Level-inheritance

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

// derived class (child class)
class Mammals extends Animal {
    int lags;
}

// derived derived class (child class)
class Dog extends Mammals {
    String breed;

}
