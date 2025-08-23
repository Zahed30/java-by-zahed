public class InterfaceMain {
    public static void main(String[] args) {
        AnimalInterface dog = new Dog();
        dog.sound();

        AnimalInterface cat = new Cat();
        cat.sound();
    }
}
