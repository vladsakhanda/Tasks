package task.T6.C2;

public class Person1 {
    String name;
    int age;

    /* Створення ініціалізатора.
        Заведено ставити після полів і перед конструкторами.
        Спрацьовує лише один спрацьовує.
        Спрацьовує перед конструктором. Спочатку ініціалізатор, потім конструктор.
     */
    {
        name = "Dima";
        age = 16;
    }

    Person1() {

    }

    Person1(String n, int a) {
        name = n;
        age = a;
    }

    void info () {
        System.out.printf("%s, %d", name, age);
    }

}
