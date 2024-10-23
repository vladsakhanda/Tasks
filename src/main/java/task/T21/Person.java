package task.T21;

public class Person {
    private String name;
    private int age;
    private String character;

    public Person(String name, int age, String character) {
        this.name = name;
        this.age = age;
        this.character = character;

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person person)) {
            return false;
        }
        return this.name == person.name && this.age == person.age && this.character == person.character;
    }

    @Override
    public int hashCode() {
        int nameHash = name != null ? name.hashCode() : 0;
        int characterHash = character != null ? character.hashCode() : 0;
        return 31 * (age + nameHash + characterHash) / age;
    }
}
