public class OOPS7 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.eat();
    }
}

// Hybrid inheritance

// / base class (parent class)
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

// derived from Mammals class

class Dod extends Mammals {
    void fast() {
        System.out.println("run fast");
    }
}

class Cat extends Mammals {
    void sleep() {
        System.out.println("sleep");
    }
}

class Human extends Mammals {
    void study() {
        System.out.println("study");
    }
}

// derived from Animal class

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

class Shark extends Fish {
    void Bite() {
        System.out.println("bites");
    }
}

class Tuna extends Fish {
    void Kill() {
        System.out.println("kills");
    }
}

// derived from Animal class

class Bird extends Animal {
    void fly() {
        System.out.println("fiy");
    }
}

class Peacock extends Bird {
    void Beauty() {
        System.out.println("BeautyFull");
    }
}
