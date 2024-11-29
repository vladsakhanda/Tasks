package task.T3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class A9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(8);
        numbers.add(5);
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);
    }
}

