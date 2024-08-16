package task.T6;

// Конструктор - це спеціальний метод, який використовується для ініціалізації класу (об'єкту)
// Ініціалізації - процес підготовки чогось щоб з ним можна було працювати
class Human1 {
    String name;
    int age;

    // Конструктор без параметрів
    Human1() {

    }

    // String n - належить тільки конструктору Human1(String n)
    Human1(String n) {
        name = n;
    }

    // int a - належить тільки конструктору Human1(int a)
    Human1(int a) {
        age = a;
    }

    // String n, int a - належить тільки конструктору Human1(String n, int a)
    Human1(String n, int a) {
        name = n;
        age = a;
    }

    void info() {
        System.out.printf("Ім'я: %s, Вік: %d\n", name, age);
    }
}