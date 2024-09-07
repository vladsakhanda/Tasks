package task.T14.Hw;

import java.util.Arrays;

public class Task1 {
    int[] numbers  = {};


    void delElArray (int index) {
        try {
            for (int i = index + 1; i < numbers.length; i++) {
                numbers[i - 1] = numbers[i];
            }
            numbers = Arrays.copyOf(numbers, numbers.length - 1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


     void addElArray(int ... nums) {
        for (int i = 0; i < nums.length; i++) {
            numbers = Arrays.copyOf(numbers, numbers.length +1);
            numbers[numbers.length - 1] = nums[i];
        }

    }


    public String getNumbers () {
        String result = "";
       for (int i = 0; i < numbers.length; i++) {
           result = result + numbers[i];
       }
       return result;
    }

}
