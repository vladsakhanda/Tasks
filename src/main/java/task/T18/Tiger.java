package task.T18;

public class Tiger extends Animal {

    Tiger(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void makeNoise() {
        System.out.println("Ричяння");
    }
}
