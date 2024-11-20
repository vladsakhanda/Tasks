package task.T24.Hw.Task;

import java.util.ArrayList;
import java.util.Arrays;

public final class Roj {
    private ArrayList<Integer> elements;
    private int age;


    public Roj(int age, ArrayList<Integer> elements) {
        this.elements = new ArrayList<>(elements);
        this.age = age;
    }

    public ArrayList<Integer> getElements() {
        return new ArrayList<>(elements);
    }

    public int getAge() {
        return age;
    }


}
