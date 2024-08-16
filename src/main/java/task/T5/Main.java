package task.T5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    }


    static void f1() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть ваше ім'я: ");
            String name = scanner.nextLine();

            if (name.length() < 4) {
                throw new Exception("Ім'я повинно містити принаймні 4 літери");
            }

            System.out.print("Введіть ваше улюблене число: ");
            String numberInput = scanner.nextLine();

            int number = Integer.parseInt(numberInput);

            System.out.println(name + ", твоє улюблене число " + number);
        } catch (NumberFormatException e) {
            System.out.println("Число повинно бути цілим");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    static void f2() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введіть слово: ");
                String word = scanner.nextLine();

                System.out.print("Введіть число: ");
                int number = Integer.parseInt(scanner.nextLine());

                int length = word.length();
                int result = length / number;

                System.out.println("Результат: " + result);
                break; // Вихід з циклу після успішного виконання
            } catch (NumberFormatException e) {
                System.out.println("Ви повинні ввести ціле число");
            } catch (ArithmeticException e) {
                System.out.println("Ділити на нуль не можна, повторіть спробу");
            }
        }

        scanner.close();
    }


    static void f3() {
        try {
            brokenFunction(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            brokenFunction(2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            brokenFunction(3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            brokenFunction(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void brokenFunction(int value) throws Exception {
        switch (value) {
            case 1:
                throw new IllegalArgumentException("Виняток: IllegalArgumentException");
            case 2:
                throw new NullPointerException("Виняток: NullPointerException");
            case 3:
                throw new UnsupportedOperationException("Виняток: UnsupportedOperationException");
            default:
                throw new Exception("Виняток: Загальний виняток");
        }
    }

}