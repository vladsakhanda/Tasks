package task.T20;

public abstract class AbstractClass {
    private String name;

    {
        name = null;
    }

    abstract void getInfo(); // protected

    void display() {
        System.out.println("Something");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class InnerClass {

    }
}
