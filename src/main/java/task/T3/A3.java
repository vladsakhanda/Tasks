package task.T3;

import java.util.ArrayList;

public class A3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(7);
        numbers.add(1);
        numbers.add(5);
        numbers.add(8);
        numbers.add(6);
        numbers.add(3);
        System.out.println(filterOutOneAndThree(numbers));
    }



    public static ArrayList<Integer> filterOutOneAndThree(ArrayList<Integer> numbers) {
       ArrayList<Integer> newNumbers = new ArrayList<>(numbers.size()+1);
       for (int i = 0; i < numbers.size(); i++) {
           if (numbers.get(i) == 1 || numbers.get(i) == 3) {
               continue;
           }
           newNumbers.add(numbers.get(i));
       }
       return newNumbers;
    }


}

