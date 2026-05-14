public class GenericMethodExample {

    // Generic Method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("🧩 Example 2: Generic Method\n");

        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] strArr = {"Java", "Generics", "Rocks"};

        System.out.print("Integer Array: ");
        printArray(intArr);

        System.out.print("String Array: ");
        printArray(strArr);
    }
}

