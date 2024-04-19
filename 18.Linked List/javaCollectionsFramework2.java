import java.util.LinkedList;

// Time = best optimized time
public class javaCollectionsFramework2 {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> list = new LinkedList<Integer>();

        // add
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);
        // 0->1->2
        System.out.println(list);
        // remove
        list.removeLast();
        list.removeFirst();
        System.out.println(list);

    }
}
