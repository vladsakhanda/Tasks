package task.T22;

public class Main {
    public static void main(String[] args) {
        Person person;

//        Person.field1;
//        Person.field2;
        Person.m3();

    }
}

// 1
interface Person {
    static final int field1 = 5; // Під капотом константа (final) і public
    public static final int[] field2 = {}; // Під капотом константа (final) і public

//    void m () {
//
//    }

    void m1(); // під капотом abstract

    default void m2() {
        System.out.println("Метод інтерфейсу за замовчуванням");

    }

    static void m3() {
        System.out.println("Статичний метод");
    }

    private void m4() {

    }

}

interface NewInterface {

}

class NewClass {

}

abstract class PersonAbstract {
    private int field;
    int field1;
    public int field2;
    protected int field3;

    void m() {

    }

    abstract void m1();

    static void m3() {

    }

    private void m4() {

    }
}

