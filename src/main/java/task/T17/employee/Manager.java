package task.T17.employee;

public class Manager extends Employee{
         private int subordinates;
    Manager(String name, int age, int salary, int subordinates) {
        super(name, age, salary);
        this.subordinates = subordinates;
    }

    public int getSubordinates() {
        return subordinates;
    }
}
