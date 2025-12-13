// package java-by-zahed.16.CollectionFramework;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Wake up");
        tasks.add("Code");
        tasks.addFirst("Meditate");
        tasks.addLast("Sleep");

        System.out.println(tasks);

        tasks.removeFirst();
        System.out.println("After removal: " + tasks);
    }
}
