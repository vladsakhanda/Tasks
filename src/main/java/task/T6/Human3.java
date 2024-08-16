package task.T6;

public class Human3 {
    String name;
    int age;

    /*
        Якщо був створений хоча б один конструктор, конструктор за замовчуванням не буде створений
     */

    Human3(String n, int a) {
        name = n;
        age = a;
    }

    void info() {
        System.out.printf("Ім'я: %s, Вік: %d\n", name, age);
    }
}
