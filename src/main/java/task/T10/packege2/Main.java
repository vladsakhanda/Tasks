package task.T10.packege2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        System.out.println(Arrays.toString(person2.getArray()));

        int[] array = person2.getArray();
        array[1] = 5;
        System.out.println(Arrays.toString(person2.getArray()));



    }
}
