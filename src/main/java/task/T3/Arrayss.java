package task.T3;

public class Arrayss {
    /*
    Привіт) Завдання можеш знайти в Readme.md

    Завдання виконуються в методі main. Тестів для завдань немає.
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5};
        int[] unicNumbers = new int[numbers.length];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int unicNumber = numbers[i];
            int indexOfUniqueNumber = i;
            boolean isUnic = true;
            for (int j = 0; j < numbers.length; j++) {
                if (indexOfUniqueNumber != j && unicNumber == numbers[j]) {
                    isUnic = false;
                    break;
                }
            }

            if (isUnic == true) {
                unicNumbers[index++] = unicNumber;
            }
        }

        System.out.println(java.util.Arrays.toString(unicNumbers));
    }

}

