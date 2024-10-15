package task.T18;



import java.util.Arrays;

public class Aviary {
    public Animal[] animals = {};
    private String name;

    Aviary(String name) {
        this.name = name;
    }
    public void addAnimal(Animal animal) {
        animals = Arrays.copyOf(animals, animals.length + 1);
        animals[animals.length - 1] = animal;
    }

    public void delAnimal(Animal animal) throws Exception {
        for (int i = 0; i < animals.length; i++) {
            if (animal.equals(animals[i])) {
                for (int j = i + 1; j < animals.length; j++) {
                    animals[j - 1] = animals[j];

                }
                animals = Arrays.copyOf(animals, animals.length - 1);
                break;

            } else if (i == animals.length - 1) {
                throw new Exception("Такої тварини не існує");
            }
        }
    }


    public void displayAviary() {
        System.out.println(name);
        for (Animal animal : animals) {
            System.out.println("Name: "+ animal.getName());
            System.out.println("Type: "+ animal.getType());
            System.out.println("Age: "+ animal.getAge());
        }
    }

    public String getName() {
        return name;
    }
}
