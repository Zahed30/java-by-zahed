// 📘 Example 1: Simple Generic Class and Method

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void displayType() {
        System.out.println("Type of T is: " + value.getClass().getName());
    }
}

public class GenericExample {
    public static void main(String[] args) {
        System.out.println("🧩 Example 1: Basic Generic Class\n");

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        intBox.displayType();
        System.out.println("Value: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Generics in Java");
        strBox.displayType();
        System.out.println("Value: " + strBox.get());
    }
}

 