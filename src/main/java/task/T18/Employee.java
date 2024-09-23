package task.T18;

import java.util.Arrays;

public class Employee {
    private String name;
    private String position;
    private Aviary[] aviaries = {};

    Employee (String name, String position) {
        this.position = position;
        this.name = name;
    }

    public void addAviary (Aviary aviary) {
        aviaries = Arrays.copyOf(aviaries, aviaries.length + 1);
        aviaries[aviaries.length - 1] = aviary;

    }


    public void delAviary(Aviary aviary) throws Exception {
        for (int i = 0; i < aviaries.length; i++) {
            if (aviary.equals(aviaries[i])) {
                for (int j = i + 1; j < aviaries.length; j++) {
                    aviaries[j - 1] = aviaries[j];

                }
                aviaries = Arrays.copyOf(aviaries, aviaries.length - 1);
                break;

            } else if (i == aviaries.length - 1) {
                throw new Exception("Такого вольєру не існує");
            }
        }

    }

    public void newPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Aviary[] getAviaries() {
        return aviaries.clone();
    }


    public void display () {
        System.out.println(aviaries.length);
        for (int i = 0; i < aviaries.length; i++) {
            System.out.println(aviaries[i].getName());
        }
    }
}
