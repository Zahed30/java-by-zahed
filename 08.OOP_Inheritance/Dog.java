public class Dog extends Animal {

    // Constructor using super to call parent constructor
    public Dog(String name) {
        super(name); // calls Animal's constructor
    }

    // Overriding method & using super to call parent method
    @Override
    public void makeSound() {
        super.makeSound(); // call parent method first
        System.out.println(name + " barks: Woof! Woof!");
    }
}
