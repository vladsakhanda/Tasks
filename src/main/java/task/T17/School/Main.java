package task.T17.School;

public class Main {
    public static void main(String[] args) throws Exception {
        School school = new School("High School #1");

        Director director1 = new Director("Jan", 35);
        Director director2 = new Director("Van long", 4);

        Teacher teacher = new Teacher("rar", 35);

        Student student1 = new Student("s1", 10);
        Student student2 = new Student("s2", 11);

        student1.addToGrade("s1", teacher);
        student2.addToGrade("s2", teacher);

        teacher.display();
        director1.addToSchool(school);

    }
}
