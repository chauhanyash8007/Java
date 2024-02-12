// convert uppercase characters to lowercase using bits

public class Operators15 {
    public static void main(String[] args) {

        // convert uppercase to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
            // print a to z
        }
    }
}
