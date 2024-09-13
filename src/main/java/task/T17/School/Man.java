package task.T17.School;

public class Man extends Human{
    private int age;
    Man(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
