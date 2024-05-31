import java.util.*;

// Time Complexity = o(n log k)

public class priorityQueuesInJCF1 {

    // To Compare Classes Objects <-- very Important Below Class Syntax To Remember

    static class Student implements Comparable<Student> { // Function Overriding
        // where Comparable <Student> class Function are implemented by Student class
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // ascending order will make
        }
    }

    public static void main(String[] args) {

        // 1) add() Time = O(log n)
        // 2) remove() Time = O(log n)
        // 3) peek() Time = O(1)

        // 1) Type
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // -> To remove elements in ascending order means remove low To High

        // 2) Type
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // Comparator are Interfaces Which define the order of logic
        // -> To remove elements in descending order remove means High to Low
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();

        }
        System.out.println();

        // 3) Type Students Objects
        // PriorityQueue<Student> s = new PriorityQueue<>();
        PriorityQueue<Student> s = new PriorityQueue<>(Comparator.reverseOrder());
        // Same For revers Order

        s.add(new Student("A", 4));
        s.add(new Student("B", 5));
        s.add(new Student("C", 2));
        s.add(new Student("D", 12));

        while (!s.isEmpty()) {
            System.out.println(s.peek().name + " -> " + s.peek().rank);
            s.remove();

        }

    }
}