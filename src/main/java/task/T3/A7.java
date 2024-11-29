package task.T3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class A7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(8);
        numbers.add(5);
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        unicNumber(numbers);
    }

    static private void unicNumber (ArrayList<Integer> numbers) {
         HashSet<Integer> newNums = new HashSet<>(numbers);
        System.out.println(newNums);
    }
}
