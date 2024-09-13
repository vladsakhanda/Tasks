package task.T17.vehicle;

public class Bike extends Vehicle{
    private int passengers;

    Bike(String brand, int speed, int passengers) {
        super(brand, speed);
        this.passengers = passengers;
    }


    public int getPassengers() {
        return passengers;
    }


    @Override
    public void display() {
        super.display();
        System.out.println(passengers);
    }
}
