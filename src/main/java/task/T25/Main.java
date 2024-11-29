package task.T25;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student o) {
        int result = (int) (grade- o.grade);

        if (result == 0) {
            return name.compareTo(o.name);
        }

        return result;

    }

    @Override
    public String toString() {
        return name;
    }
}

class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}

class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());
        return result - 2 * result;
    }
}


public class Main {
    public static void main(String[] args) {
        TreeSet<Student> ss = new TreeSet<>(new StudentNameComparator());
        ss.add(new Student("Vitalja", 17 ,34));
        ss.add(new Student("Daniel", 19 ,111111111));
        ss.add(new Student("Roman", 19 ,1));
        ss.add(new Student("Kolja", 10 ,2));
        ss.add(new Student("Adolf", 11 ,37));
        ss.add(new Student("Hitter", 9 ,74));
        ss.add(new Student("PrinceGarry", 0 ,344));
        ss.add(new Student("Betta", 9 ,666));
        ss.add(new Student("Lily", 2 ,999));
        System.out.println(ss);
    }
}
