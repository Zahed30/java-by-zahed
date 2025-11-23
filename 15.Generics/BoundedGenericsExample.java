import java.util.List;
import java.util.ArrayList;

class MathUtils {
    // Upper bounded wildcard: accepts Number or subclasses (Integer, Double, etc.)
    public static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        return total;
    }

    // Lower bounded wildcard: accepts Integer or superclasses (Number, Object)
    public static void addIntegers(List<? super Integer> list) {
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }
    }
}

public class BoundedGenericsExample {
    public static void main(String[] args) {
        System.out.println("🧩 Example 3: Bounded Generics and Wildcards\n");

        List<Integer> intList = new ArrayList<>();
        MathUtils.addIntegers(intList);
        System.out.println("Integer List: " + intList);

        List<Double> doubleList = List.of(1.5, 2.5, 3.5);
        double total = MathUtils.sum(doubleList);
        System.out.println("Sum of Doubles: " + total);
    }
}

