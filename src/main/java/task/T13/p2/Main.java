package task.T13.p2;

public class Main {



    public static void main(String[] args) {
        Person person = new Person();
        ChangeName("Vasya", person);
        System.out.println(person.getName());

    }

   static void  ChangeName (String name, Person person) {
        person.name = name;
    }
}
