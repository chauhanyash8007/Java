// type Promotion in Expression

public class Java11 {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        System.out.println((int) (b));
        System.out.println((int) (a));
        System.out.println(b - a);

        short c = 12;
        byte d = 13;
        char e = 'c';
        byte g = (byte) (c + d + e);
        System.out.println(g);

        int x = 10;
        float y = 20.25f;
        long z = 25;
        double s = 26;
        double v = (x + y + z + s);
        System.out.println(v);
    }
}