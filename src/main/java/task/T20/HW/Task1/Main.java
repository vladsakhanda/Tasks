package task.T20.HW.Task1;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Ivan", 35, "pediatrician");
        Doctor doctor2 = new Doctor("Ivan", 39, "pediatrician");
        Doctor doctor3 = new Doctor("Ivan", 35, "pediatrician");



for (int i = 0; i < 51; i++) {
    System.out.println(doctor.hashCode() == doctor2.hashCode());
}



    }
}
