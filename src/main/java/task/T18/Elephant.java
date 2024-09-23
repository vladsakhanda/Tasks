package task.T18;

public class Elephant extends Animal {

    Elephant(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void makeNoise() {
        System.out.println("Трубіння");
    }
}
