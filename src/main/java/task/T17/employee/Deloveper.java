package task.T17.employee;

public class Deloveper extends Employee {
    private int project;
    Deloveper(String name, int age, int salary, int project) {
        super(name, age, salary);
        this.project = project;
    }

    public int getSubordinates() {
        return project;
    }
}
