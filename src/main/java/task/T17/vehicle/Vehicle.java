package task.T17.vehicle;

public class Vehicle {
     private String brand;
     private int speed;

     Vehicle (String brand, int speed) {
                 this.brand = brand;
                 this.speed = speed;
     }

     public int getSpeed() {
          return speed;
     }

     public String getBrand() {
          return brand;
     }

     public void display () {
          System.out.println("Brand: "+ brand + " Speed: " + speed);
     }
}
