package task.T30;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        String number = "500";
//        int newNumber = (int) number;
//        System.out.println(newNumber);

        // Wrapper (клас-обгортка) - клас, що обгортує примітивний тип
        /*
        Integer
        Short
        Long
        Byte
        Float
        Double
        Character
        Boolean
         */

        String text = "500";
        Integer newNumber = Integer.parseInt(text);
        System.out.println(newNumber);
        System.out.println(newNumber.floatValue());

        newNumber = Integer.valueOf(50);


        text = "true";
        Boolean bool = Boolean.parseBoolean(text);
        System.out.println(bool);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // Класи-обгортки є незмінними (immutable)

        int num = 5;
        boolean b = false;
        print(num);
        print(false);

        System.out.println(bool.toString());

        System.out.println(newNumber.describeConstable());
    }

    static void print(Object value) {
        System.out.println(value.getClass());
    }

}
