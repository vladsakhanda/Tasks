package task.T17.School;

public class Women extends Human{
    private int age;

    Women(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
