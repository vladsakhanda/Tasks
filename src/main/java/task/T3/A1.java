package task.T3;

import java.util.ArrayList;
import java.util.Collections;

public class A1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(7);
        numbers.add(1);
        numbers.add(5);
        numbers.add(8);
        numbers.add(6);
        numbers.add(-3);
        System.out.println(findMin(numbers));
        System.out.println(findMax(numbers));

    }


    static private int findMin(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        return numbers.get(0);
    }


    static private int findMax(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        return numbers.get(numbers.size()-1);
    }

}
