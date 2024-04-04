package task.T2;

import java.util.Scanner;

public class LoopsTwo {
    public static void main(String[] args) {
        evenOddPrinter(5);
    }

    public static void positiveNumberFinder() {

    }

    public static void drawTriangle(int rows, int repeats) {

    }

    public static long calculateFactorial(int n) {
        return 1;
    }

    public static void evenOddPrinter(int n) {
        System.out.println("Парні числа до " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nНепарні числа до " + n + ":");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
