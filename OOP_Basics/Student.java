public class Student {
    String name;
    int roll;
    float marks;

    Student(String name, int roll, float marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }
}
    
