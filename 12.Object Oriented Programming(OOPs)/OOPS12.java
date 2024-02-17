// super keyword

public class OOPS12 {
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
        super.color = "Brown";
        System.out.println("Horse constructor is called"); // 2 print because of super keyword
    }
}
