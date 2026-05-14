import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Languages: " + languages);

        languages.remove("C++");
        System.out.println("After removal: " + languages);

        System.out.println("First element: " + languages.get(0));
    }
}
