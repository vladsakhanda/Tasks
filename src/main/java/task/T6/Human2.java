package task.T6;

public class Human2 {
    String name;
    int age;

    /*
        Якщо хоча б один конструктор не був створений, автоматично створюється конструктор за замовчуванням без параметрів

        Human2() {

        }
     */

    void info() {
        System.out.printf("Ім'я: %s, Вік: %d\n", name, age);
    }
}
