// count set Bits in numbers

public class BitOperators11 {

    public static int countSteBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSteBits(15));
    }
}
