package task.T17.School;

import java.util.Arrays;

public class Teacher extends Women {
     private String[] students = {};
    Teacher(String name, int age) {
        super(name, age);
    }

    public void addStudents(String student) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }

    void display () {
        System.out.println(Arrays.toString(students));
    }
}
