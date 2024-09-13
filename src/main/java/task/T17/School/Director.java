package task.T17.School;

public class Director extends Man{
    private School school;
    Director(String name, int age) {
        super(name, age);
    }

    public School getSchool() {
        return school;
    }

    public void addToSchool(School school) throws Exception {
        if (school.getDirector() != null) {
            throw new Exception("В школі вже є директор");
        }
        this.school = school;
        school.setDirector(this);
    }


}
