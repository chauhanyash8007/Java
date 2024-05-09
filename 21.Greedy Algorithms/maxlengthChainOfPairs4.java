
// Time = O(n log n)

import java.util.*;

public class maxlengthChainOfPairs4 {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;

        int lastChainEnd = pairs[0][1]; // last selected pair end // chain end

        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i][0] > lastChainEnd) {
                chainLength++;

                lastChainEnd = pairs[i][1];
            }
        }
        System.out.println("max length of chain =  " + chainLength);

    }
}
