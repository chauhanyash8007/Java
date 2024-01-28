// inputs in java

import java.util.*;

public class Java6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next(); // for one word input
        System.out.println(word);

        String name = sc.nextLine(); // for complete line or paragraph or sentence
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        byte num = sc.nextByte();
        System.out.println(num);

        float price = sc.nextFloat();
        System.out.println(price);

        double numb = sc.nextDouble();
        System.out.println(numb);

        boolean value = sc.nextBoolean();
        System.out.println(value);

        short b = sc.nextShort();
        System.out.println(b);

        long c = sc.nextLong();
        System.out.println(c);
        sc.close();
    }
}
