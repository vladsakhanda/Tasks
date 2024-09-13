package task.T17.School;

public class Child extends Human{
    private int age;
    Child(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
