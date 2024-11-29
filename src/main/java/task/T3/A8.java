package task.T3;

import java.util.ArrayList;
import java.util.Collections;

public class A8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(8);
        numbers.add(5);
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
