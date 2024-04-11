import java.util.ArrayList;

public class arrayList1 {

    public static void main(String[] args) {
        // ArrayList is part of Java collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // Add Operation
        // 1 Method
        // Time = O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // 2 Method
        // Time = O(n)
        list.add(1, 9);

        System.out.println(list);

        // Get Operation
        // Time = O(1)
        int element = list.get(2);
        System.out.println(element);

        // Delete Operation
        // Time = O(n)
        list.remove(2);
        System.out.println(list);

        // Set Operation
        // Time = O(n)
        list.set(2, 10);
        System.out.println(list);

        // Contains Operation
        // Time = O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        // Size of an ArrayList
        // Here size() is = Method or Function not Properties
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 1.Question
        // Prints the reverse of an ArrayList
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}

// Operations on ArrayList
// Operations Time Complexity
// Add elements ===> O(1)
// Ger elements ===> O(1)
// Remove Elements ===> O(n)
// Set Elements at index ===> O(n)
// Contains Elements ===> O(n)