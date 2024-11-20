package task.T24.Hw.Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Roj roj = new Roj(31, numbers);

        System.out.println(roj.getElements());
//
//        ArrayList<Integer> newNumbers = roj.getElements();
//        newNumbers.add(4);
//        System.out.println(roj.getElements());

        numbers.remove(0);
        System.out.println(roj.getElements());

    }
}
