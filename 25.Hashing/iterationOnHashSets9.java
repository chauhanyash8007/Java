import java.util.*;

public class iterationOnHashSets9 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("NoIda");
        cities.add("BengALuru");

        // 1) Method
        @SuppressWarnings("rawtypes")
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

        System.out.println();

        // 2) Method
        for (String city : cities) {
            System.out.println(city);
        }

    }
}
