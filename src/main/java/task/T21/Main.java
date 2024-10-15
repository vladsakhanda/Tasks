package task.T21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        Object A1 = new Object();
//        Object A2 = new Object();
//        System.out.println();

//        System.out.printf("Рефлесивність: %b\n", A1.equals(null));
//        System.out.printf("Симетричність: %b %b\n", A1.equals(A2), A2.equals(A1));
////        System.out.printf("Транзитивність: %b %b %b\n", A1.equals(A2), A2.equals(A3), A1.equals(A3));
////        System.out.printf("Узгодженість: %b %b\n", A1.equals(A1), A1.equals(A1));
////        System.out.printf("Порівняння з null: %b\n", A1.equals(null));

        // <=> - еквівалентність
        /*
        Специфікація equals:
        1. Рефлексивність - при порівнянні з самим собою буде true
            x.equals(x) = true, x - об'єкт
        2. Симетричність - якщо об'єкт x дорівнює об'єкту y, то об'єкт y буде дорівнювати об'єкту x і навпаки
            x.equals(y) <=> y.equals(x), x та y - об'єкти
        3. Транзитивність
            x.equals(y) <=> y.equals(z) <=> x.equals(z)
        4. Узгодженість - повторний виклик x.equals(y) повинен повертати значення попереднього виклику,
                          якщо поля, що порівнюються не змінювалися
        5. Порівняння з null - при порівнянні об'єкта з null, завжди отримуватимемо false
            x.equals(null) = false

        Специфікація hashcode:
            1. Повторний виклик hashCode для того самого об'єкта повинен повертати однакові хеш-значення,
                якщо поля об'єкта, що беруть участь у обчисленні, не змінювалися
            2. Якщо equals() для двох об'єктів повертає true,
                hashCode() також повинен повертати для них те саме число (однакові значення)
            3. Нерівні між собою об'єкти можуть мати однаковий hashCode
            4. (Опціонально) бажано, щоб hashCode повертав як можна менше колізій

         equals() та hashCode() методи повинні використовуватися в парі.
         */

        //        Person person1 = new Person("Яна", 89, "Angry, Funny");
//        Person person2 = new Person("Яна", 89, "Angry, Funny");
//        Person person3 = new Person("Яна", 89, "Angryq, Funny");
//
//        System.out.printf("Рефлесивність: %b\n", person1.equals(person1));
//        System.out.printf("Симетричність: %b %b\n", person1.equals(person2), person2.equals(person1));
//        System.out.printf("Транзитивність: %b %b %b\n", person1.equals(person2), person2.equals(person3), person1.equals(person3));
//        System.out.printf("Узгодженість: %b %b\n", person1.equals(person1), person1.equals(person1));
//        System.out.printf("Порівняння з null: %b\n", person1.equals(null));

//        ArrayList<String> arrayList = new ArrayList<>();
//        HashMap<Person, String> map = null;

        Person person1 = new Person("Яна", 89, "Angry, Funny");
        Person person2 = new Person("Яна", 89, "Angry, Funny");
        Person person3 = new Person("Яна", 35, "Angry, Funny");
        Person person4 = new Person("Тома", 35, "Angry, Funny");
//        System.out.println(person1.hashCode());

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        for (Person person : people) {
            System.out.println(person.hashCode());
        }

    }
}
