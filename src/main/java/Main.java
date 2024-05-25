import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        sort(3, 2, 1, 4, 9, 10); // 3**2

        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

    static void sort(int... numbers) {
        int length = numbers.length;

        for (int i = 0; i < length; i++) {
            int currentNumber = numbers[i];

            for (int j = i; j < length; j++) {
                if (currentNumber > numbers[j]) {
                    int temporaryNumber = currentNumber;
                    currentNumber = numbers[j];
                    numbers[j] = temporaryNumber;
                    numbers[i] = currentNumber;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

    }


//    static void sort(int... numbers) {
//        int length = numbers.length;
//        int[] numbers2 = new int[length];
//        int a = numbers[0];
//        int index = 0;
//        int b = numbers[0];
//
//        for (int j = 0; j < length; j++) {
//            for (int i = 0; i < length; i++) {
//                if (a > numbers[i]) {
//                    a = numbers[i];
//                    index = i;
//                }
//            }
//            for (int i = 0; i < length; i++) {
//                if (b < numbers[i]) {
//                    b = numbers[i];
//                }
//            }
//            numbers2[j] = numbers[index];
//            numbers[index] = b + j;
//            a = b + j;
//            System.out.println(numbers[1]);
//
//        }
//        System.out.println(Arrays.toString(numbers2));
//    }
}
