// function Overloading using parameters with data types

public class Function8 {
    // function to calculate sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println((sum(3, 5)));
        System.out.println((sum(3.2f, 4.8f)));
    }
}
