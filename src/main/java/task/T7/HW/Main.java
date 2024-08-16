package task.T7.HW;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Gala", "green", 300);
        apple1.info();
        Apple apple2 = new Apple("Gala");
        apple2.info();

        Teacher teacher1 = new Teacher("Анна Петрівна", "Историчка", 3);
        teacher1.info();
        Teacher teacher2 = new Teacher("Іван Петрович");
        teacher2.info();

        Friend friend1 = new Friend("Анна Петрівна", 33, 3);
        friend1.info();
        Friend friend2 = new Friend("Іван Петрович");
        friend2.info();

    }
}


