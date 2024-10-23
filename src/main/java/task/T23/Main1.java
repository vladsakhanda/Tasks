package task.T23;

public class Main1 {
    public static void main(String[] args) {
        Integer[] numbers = {-1, 2, 5, 9, 0};
        print(numbers, "");

        String[] words = {"Apple", "Juice", "Wanna", "Cry", "lemon"};
        print(words, 9);

    }

    public static <T, I> void print(T[] items, I a) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
