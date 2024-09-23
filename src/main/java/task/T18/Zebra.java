package task.T18;

public class Zebra extends Animal{
    Zebra(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void makeNoise() {
        System.out.println("Ревіння");
    }
}
