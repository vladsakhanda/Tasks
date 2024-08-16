package task.T6.C2;

public class Person2 {
    String name;
    int age;

    Person2() {

    }

    Person2(String name, int age) {
        /*
            Якщо в нас конфлікт імен між полем та параметром - то буде помилка
         */
//        System.out.println(name, age); // name та age - поля, які ще не визначені. Тому помилка.

        /*
            this - ключове слово, яке є посиланням на поточний екземпляр (об'єкт) класу.
            Тобто this є посиланням на об'єкт класу, в якому він застосований
         */
        this.name = name;
        this.age = age;
    }

    void info () {
        System.out.printf("%s, %d", name, age);
    }
}
