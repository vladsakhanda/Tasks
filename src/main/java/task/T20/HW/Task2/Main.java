package task.T20.HW.Task2;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        displayNums(numbers);
    }


  static void displayNums(int ... nums) throws Exception {
        if (nums.length < 10) {
            throw new Exception("Кількість чисел в масиві повино бути 10 або більше");
        }
        for (int num : nums) {
            if (num%2 != 0) {
                continue;
            }
            System.out.println(num);
        }
  }
}
