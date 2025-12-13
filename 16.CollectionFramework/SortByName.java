import java.util.*;

public class SortByName {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Zahed", 85));
        students.add(new Student(2, "Aman", 92));
        students.add(new Student(3, "Rahul", 78));

        students.sort((s1, s2) -> s1.name.compareTo(s2.name));

        System.out.println("Sorted by Name:");
        students.forEach(System.out::println);
    }
}
