// else_if Statement

public class else_if4 {
    public static void main(String[] args) {
        int age = 13;

        if (age >= 18) {
            System.out.println("you are adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("you are not adult");
        }
    }
}
