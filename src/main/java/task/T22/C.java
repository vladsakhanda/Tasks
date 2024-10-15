package task.T22;

public class C extends PersonAbstract {
    @Override
    void m1() {

    }
}

class B implements Person {

    @Override
    public void m1() {

    }
}

class Child implements NewInterface, Person {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {
        Person.super.m2();
    }
}

interface in extends NewInterface, Person {

}