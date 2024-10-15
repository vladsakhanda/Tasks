package task.T18;

import java.util.Arrays;

public class Zoo {
    private Aviary[] aviaries = {};
    private String name;

    Zoo(String name) {
        this.name = name;
    }

    public void addAviary(Aviary aviary) {
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


    public void displayAviary() {
        for (int i = 0; i < aviaries.length; i++) {
            System.out.println("Name: " + aviaries[i].getName());
            aviaries[i].displayAviary();
        }
    }

    public void foundTypes(String type) {
        String[] animalTypes = {};
        for (Aviary aviary : aviaries) {
            for (Animal animal : aviary.animals) {
                if (animal.getType().equals(type)) {
                    animalTypes = Arrays.copyOf(animalTypes, animalTypes.length + 1);
                    animalTypes[animalTypes.length - 1] = animal.getType();
                }
            }
        }
        System.out.println(Arrays.toString(animalTypes));
    }


}
