public class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for: " + name);
    }

    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}
