// Swap function for 2 values

public class Function3 {

    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a =  " + a);
        System.out.println("b =  " + b);
    }

    public static void main(String[] args) {
        // swap - value exchange
        int a = 3;
        int b = 5;
        swap(a, b);
    }

}
