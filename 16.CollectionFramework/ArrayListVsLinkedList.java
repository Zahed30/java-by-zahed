import java.util.*;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        arrayList.add(5000, 99);
        linkedList.add(5000, 99);

        System.out.println("Insertion done in both lists");
    }
}
