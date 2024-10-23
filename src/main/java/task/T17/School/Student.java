package task.T17.School;

public class Student extends Child{
    Student(String name, int age) {
        super(name, age);
    }



    public void addToGrade(String t, Teacher teacher)  {
        teacher.addStudents(t);

    }
}
