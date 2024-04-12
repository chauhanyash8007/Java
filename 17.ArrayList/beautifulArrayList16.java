import java.util.ArrayList;

public class beautifulArrayList16 {

    public static ArrayList<Integer> beautifulArrayList(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        dividedConquer(1, 1, res, n);
        return res;

    }

    private static void dividedConquer(int start, int increment, ArrayList<Integer> res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }
        dividedConquer(start, 2 * increment, res, n);
        dividedConquer(start + increment, 2 * increment, res, n);

    }

    public static void main(String[] args) {
        ArrayList<Integer> res = beautifulArrayList(5);
        System.out.println("Beautiful Array of 5 : " + res);

    }

}
