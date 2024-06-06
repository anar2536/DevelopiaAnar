import Animal.*;
public class Something {
    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers", 3);
        Dog dog = new Dog("Buddy", 5);
        Lion lion = new Lion("Simba", 7);

        cat.makeNoise();
        dog.makeNoise();
        lion.makeNoise();
    }
}
