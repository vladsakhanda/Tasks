package task.T3;

import java.util.ArrayList;
import java.util.Collections;

public class A2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(7);
        numbers.add(1);
        numbers.add(5);
        numbers.add(8);
        numbers.add(6);
        numbers.add(-3);
        System.out.println(findSecondMax(numbers));
    }

    static private int findSecondMax(ArrayList<Integer> numbers) {
        if (numbers.size() == 1) {
            return numbers.get(0);
        }
        Collections.sort(numbers);
        return numbers.get(numbers.size()-2);
    }


}
