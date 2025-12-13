import java.util.*;

public class SortByMarks {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Zahed", 85));
        students.add(new Student(2, "Aman", 92));
        students.add(new Student(3, "Rahul", 78));

        students.sort((s1, s2) -> s2.marks - s1.marks);

        System.out.println("Sorted by Marks:");
        students.forEach(System.out::println);
    }
}
