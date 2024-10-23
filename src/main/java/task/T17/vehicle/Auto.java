package task.T17.vehicle;

public class Auto extends Vehicle {
    private String type;

    Auto(String brand, int speed, String type) {
        super(brand, speed);
        this.type = type;
    }


    public String getType() {
        return type;
    }


    @Override
    public void display() {
        super.display();
        System.out.println(type);
    }
}
