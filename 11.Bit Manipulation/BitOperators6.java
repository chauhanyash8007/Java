// update ith Bit

public class BitOperators6 {

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            System.out.println(clearIthBit(n, i));
        } else {
            System.out.println(setIthBit(n, i));
        }

    }

    public static void main(String[] args) {
        updateIthBit(10, 1, 0);
    }
}
