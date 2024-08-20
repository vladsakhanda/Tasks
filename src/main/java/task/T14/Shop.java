package task.T14;

import java.util.Scanner;

public class Shop {
    static String[] books = {"b1", "b2", "b3", "b4"};

    public static void main(String[] args) throws Exception {

        /*
        while () {
        }

        do {

        } while ();
         */
        do {
            try {
                books(new Scanner(System.in).nextInt());
            } catch (Exception e) {
                int lastIndex = books.length - 1;

                System.out.printf("Такої книжки не існує, є книжки тільки з номером від 0 до %d спробуйте ще раз", lastIndex);
            }
            System.out.println("1 - закінчити програму, 2 - спробувати ще раз");
        }
        while (new Scanner(System.in).next().equals("2"));
    }

    static void books(int a) throws Exception {
        System.out.println(books[a]);
    }
}

