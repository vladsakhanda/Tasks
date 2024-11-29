package task.T3;

import java.util.ArrayList;
import java.util.Collections;

public class A4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(8);
        numbers.add(5);
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        System.out.println(unicCount(numbers));
    }

    static private int unicCount(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) return 0;
        if (numbers.size() == 1) return 1;

        Collections.sort(numbers);

        int uniqueCount = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if ((i == 0 || numbers.get(i) != numbers.get(i-1)) && (i == numbers.size() - 1 || numbers.get(i) != numbers.get(i+1))) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

}
