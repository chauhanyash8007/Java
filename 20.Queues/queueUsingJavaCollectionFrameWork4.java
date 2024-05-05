import java.util.*;

public class queueUsingJavaCollectionFrameWork4 {

    public static void main(String[] args) {
        // Queue is not class it is Interface
        // so can not create objects of Interface
        // so we create those classes for implementing Queue
        // those classes are LinkedList and ArrayDeque
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();

        }

    }
}